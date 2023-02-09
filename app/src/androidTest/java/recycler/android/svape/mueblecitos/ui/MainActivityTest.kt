package recycler.android.svape.mueblecitos.ui

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import recycler.android.svape.mueblecitos.R
import org.junit.Rule
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    @Rule
    @JvmField
    val activityRule = activityScenarioRule<MainActivity>()

    private val testAboutMe = R.string.aboutme

    @Test
    fun checkDescription_aboutMe() {
        // Scroll down and Nav to about me
        onView(withId(R.id.layoutAboutMe)).perform(ViewActions.scrollTo(), click())

        onView(withText(testAboutMe))

        pressBack()
    }

    @Test
    fun intent_DisplayDoors() {

        onView(withId(R.id.layoutDoor)).perform(click())

        onView(withId(R.id.rv_images)).check(matches(isDisplayed()))

    }
}