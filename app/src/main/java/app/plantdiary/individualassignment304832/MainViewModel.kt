package app.plantdiary.individualassignment304832

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import app.plantdiary.individualassignment304832.dto.Country
import app.plantdiary.individualassignment304832.service.CountryService

class MainViewModel : ViewModel() {
    var countries : MutableLiveData<List<Country>> = MutableLiveData<List<Country>>()
    var countryService : CountryService = CountryService()
    fun fetchCountries(){

    }

}