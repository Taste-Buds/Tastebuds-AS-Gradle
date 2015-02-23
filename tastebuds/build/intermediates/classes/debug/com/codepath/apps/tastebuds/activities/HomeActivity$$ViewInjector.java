// Generated code from Butter Knife. Do not modify!
package com.codepath.apps.tastebuds.activities;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class HomeActivity$$ViewInjector<T extends com.codepath.apps.tastebuds.activities.HomeActivity> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296339, "field 'mDrawerLayout'");
    target.mDrawerLayout = finder.castView(view, 2131296339, "field 'mDrawerLayout'");
    view = finder.findRequiredView(source, 2131296341, "field 'mDrawerList'");
    target.mDrawerList = finder.castView(view, 2131296341, "field 'mDrawerList'");
  }

  @Override public void reset(T target) {
    target.mDrawerLayout = null;
    target.mDrawerList = null;
  }
}
