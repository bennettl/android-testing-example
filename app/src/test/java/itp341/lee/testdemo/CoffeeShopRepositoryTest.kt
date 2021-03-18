package itp341.lee.testdemo

import itp341.lee.testdemo.api.CoffeeShopApi
import itp341.lee.testdemo.model.CoffeeShop
import itp341.lee.testdemo.repository.CoffeeShopRepository
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner
import org.mockito.Mockito.`when`
import com.google.common.truth.Truth.*
import com.nhaarman.mockito_kotlin.verify

@RunWith(MockitoJUnitRunner::class)
class CoffeeShopRepositoryTest{

    @Mock
    private lateinit var coffeeShopApi: CoffeeShopApi

    @Test
    fun getMostPopular(){
        // 1. Setup
        val COFFEE_SHOP_NAME = "Blue Bottle"
        `when`(coffeeShopApi.getMostPopular()).thenReturn(CoffeeShop(COFFEE_SHOP_NAME))
        val coffeeShopRepository = CoffeeShopRepository(coffeeShopApi)

        // 2. Operation
        val coffeeShop = coffeeShopRepository.getMostPopular()

        // 3. Verification
        assertThat(coffeeShop.name).isEqualTo(COFFEE_SHOP_NAME)
        verify(coffeeShopApi).getMostPopular()
    }
}