package itp341.lee.testdemo

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import itp341.lee.testdemo.activity.MainActivity
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivtyClass {
    @Test
    fun appLaunchesSuccessfully() {
        ActivityScenario.launch(MainActivity::class.java)
    }

    @Test
    fun latestCoffeeShop_isPresent(){
        ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.latest_coffee_shop_text)).check(matches(withText("Alfred Coffee")))
    }

    @Test
    fun latestCoffeeShop_newEntry_isPresent(){
        ActivityScenario.launch(MainActivity::class.java)

        onView(withId(R.id.coffee_shop_edit_text)).perform(clearText())
            .perform(typeText("Blue Bottle"))

        onView(withId(R.id.button_submit)).perform(click())

        onView(withId(R.id.latest_coffee_shop_text)).check(matches(withText("Blue Bottle")))
    }


}