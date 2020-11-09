package com.raywenderlich.android.droidwiki.dagger

import com.raywenderlich.android.droidwiki.ui.homepage.HomepageActivity
import com.raywenderlich.android.droidwiki.ui.homepage.HomepagePresenter
import com.raywenderlich.android.droidwiki.ui.search.EntryPresenter
import com.raywenderlich.android.droidwiki.ui.search.SearchActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [
AppModule::class , PresenterModule::class])
interface AppComponent {
    fun inject(targetActivity: HomepageActivity)
    fun inject(homepagePresenter: HomepagePresenter)

    fun inject(targetActivity: SearchActivity)
    fun inject(entryPresenter: EntryPresenter)
}