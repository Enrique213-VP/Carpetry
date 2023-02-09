package recycler.android.svape.mueblecitos.ui.chairs


import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.filters.MediumTest
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import recycler.android.svape.mueblecitos.R
import recycler.android.svape.mueblecitos.adapter.ItemAdapter.*
import recycler.android.svape.mueblecitos.model.data.Datasource

@RunWith(AndroidJUnit4::class)
@MediumTest
class RecyclerViewChairTest {

    @get:Rule
    var activityScenarioRule = activityScenarioRule<Chairs_List>()


    private val listItemTest = 3

    /*
     *  RecyclerView comes into view
     */
    @Test
    fun test_isListActivityVisible_onAppLaunch() {
        onView(withId(R.id.rv_images)).check(matches(isDisplayed()))
    }

    /*
     * Select list item, nav to DetailActivity
     * Correct furniture is in view?
     */
    @Test
    fun test_selectListItem_isDetailActivityVisible() {
        onView(withId(R.id.rv_images))
            .perform(actionOnItemAtPosition<ItemViewHolder>(listItemTest, click()))
    }


    /*
     * Select list item, nav to DetailActivity
     * pressBack
     */
    @Test
    fun test_backNavigation_toListActivity() {
        onView(withId(R.id.rv_images))
            .perform(actionOnItemAtPosition<ItemViewHolder>(listItemTest, click()))

        pressBack()

        onView(withId(R.id.rv_images)).check(matches(isDisplayed()))
    }
}