package com.chuckerteam.chucker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.chuckerteam.chucker.R;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes3.dex */
public final class ChuckerActivityTransactionBinding implements ViewBinding {

    /* renamed from: a */
    public final CoordinatorLayout f42793a;
    @NonNull
    public final TabLayout tabLayout;
    @NonNull
    public final MaterialToolbar toolbar;
    @NonNull
    public final TextView toolbarTitle;
    @NonNull
    public final ViewPager viewPager;

    public ChuckerActivityTransactionBinding(CoordinatorLayout coordinatorLayout, TabLayout tabLayout, MaterialToolbar materialToolbar, TextView textView, ViewPager viewPager) {
        this.f42793a = coordinatorLayout;
        this.tabLayout = tabLayout;
        this.toolbar = materialToolbar;
        this.toolbarTitle = textView;
        this.viewPager = viewPager;
    }

    @NonNull
    public static ChuckerActivityTransactionBinding bind(@NonNull View view) {
        int i = R.id.tabLayout;
        TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, i);
        if (tabLayout != null) {
            i = R.id.toolbar;
            MaterialToolbar materialToolbar = (MaterialToolbar) ViewBindings.findChildViewById(view, i);
            if (materialToolbar != null) {
                i = R.id.toolbarTitle;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.viewPager;
                    ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, i);
                    if (viewPager != null) {
                        return new ChuckerActivityTransactionBinding((CoordinatorLayout) view, tabLayout, materialToolbar, textView, viewPager);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ChuckerActivityTransactionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ChuckerActivityTransactionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.chucker_activity_transaction, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.f42793a;
    }
}