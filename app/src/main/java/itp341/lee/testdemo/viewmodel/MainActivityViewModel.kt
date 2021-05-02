package itp341.lee.testdemo.viewmodel

import android.view.View
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import itp341.lee.testdemo.repository.CoffeeShopRepository
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor(private val coffeeShopRepository: CoffeeShopRepository) : ViewModel() {

    var latestCoffeeShopName: String = "what"

    fun add() {
        coffeeShopRepository.add(latestCoffeeShopName)

    }

    fun getLatestCoffeeShop() = coffeeShopRepository.getLatest()

}