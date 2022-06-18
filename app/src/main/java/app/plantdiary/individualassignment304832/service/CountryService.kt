package app.plantdiary.individualassignment304832.service

import app.plantdiary.individualassignment304832.RetrofitClientInstance
import app.plantdiary.individualassignment304832.dao.ICountryDAO
import app.plantdiary.individualassignment304832.dto.Country
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.withContext
import retrofit2.awaitResponse

class CountryService {

    suspend fun fetchCountries() : List<Country>? {
        return withContext(Dispatchers.IO){
            val service = RetrofitClientInstance.retrofitInstance?.create(ICountryDAO::class.java)
            val countries = async {service?.fetchCountries()}
            var results = countries.await()?.awaitResponse()?.body()
            return@withContext results
        }
    }
//    fun fetchCountries(): List<Country> {
//        val result : List<Country> = listOf(Country("nz", "new zealand"))
//        return result
//
//    }
}