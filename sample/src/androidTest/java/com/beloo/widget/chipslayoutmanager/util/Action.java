package com.beloo.widget.chipslayoutmanager.util;

import androidx.test.espresso.UiController;
import androidx.test.espresso.ViewAction;
import android.view.View;

import org.hamcrest.Matcher;

import static androidx.test.espresso.matcher.ViewMatchers.isAssignableFrom;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static org.hamcrest.Matchers.allOf;

public abstract class Action<T extends View> implements ViewAction {
    @Override
    public Matcher<View> getConstraints() {
        return allOf(isAssignableFrom(View.class), isDisplayed());
    }

    @Override
    public String getDescription() {
        return "action " + this.getClass().getSimpleName();
    }

    @Override
    public final void perform(UiController uiController, View view) {
        performAction(uiController, (T) view);
    }

    public abstract void performAction(UiController uiController, T view);
}
