package app.plantdiary.individualassignment304832.service

import app.plantdiary.individualassignment304832.dto.Country

class CountryService {
    fun fetchCountries(): List<Country> {
        val result : List<Country> = listOf(Country("nz", "new zealand"))
        return result

    }
}