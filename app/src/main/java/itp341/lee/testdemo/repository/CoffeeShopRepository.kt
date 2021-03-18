package itp341.lee.testdemo.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import itp341.lee.testdemo.api.CoffeeShopApi
import itp341.lee.testdemo.model.CoffeeShop
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CoffeeShopRepository @Inject constructor(val coffeeShopApi: CoffeeShopApi){
    private var coffeeShops = mutableListOf<CoffeeShop>(CoffeeShop("Alfred Coffee"))

    private var newestCoffeeShop = MutableLiveData<CoffeeShop>((CoffeeShop("Alfred Coffee")))

    fun add(name: String) = {
        coffeeShops.add(CoffeeShop(name))
        newestCoffeeShop.value = coffeeShops.last()
    }

    fun getLatest(): LiveData<CoffeeShop> = newestCoffeeShop

    fun getMostPopular() = coffeeShopApi.getMostPopular()

}