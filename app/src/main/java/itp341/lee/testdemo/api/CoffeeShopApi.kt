package itp341.lee.testdemo.api

import dagger.Provides
import itp341.lee.testdemo.model.CoffeeShop
import javax.inject.Inject


open class CoffeeShopApi @Inject constructor() {

    open fun getMostPopular() = CoffeeShop("Starbucks")

}