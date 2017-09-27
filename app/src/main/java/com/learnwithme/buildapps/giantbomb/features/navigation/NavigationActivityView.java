package com.learnwithme.buildapps.giantbomb.features.navigation;

import com.hannesdorfmann.mosby3.mvp.MvpView;

interface NavigationActivityView extends MvpView {

    void handleChosenNavigationMenuItem(int chosenMenuItem);

    void navigateToCurrentSection();
}