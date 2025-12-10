package com.chuckerteam.chucker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.chuckerteam.chucker.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;

/* loaded from: classes3.dex */
public final class ChuckerActivityMainBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f42792a;
    @NonNull
    public final AppBarLayout appBarLayout;
    @NonNull
    public final MaterialToolbar toolbar;
    @NonNull
    public final RecyclerView transactionsRecyclerView;
    @NonNull
    public final TextView tutorialDescription;
    @NonNull
    public final Group tutorialGroup;
    @NonNull
    public final TextView tutorialLink;
    @NonNull
    public final TextView tutorialTitle;

    public ChuckerActivityMainBinding(ConstraintLayout constraintLayout, AppBarLayout appBarLayout, MaterialToolbar materialToolbar, RecyclerView recyclerView, TextView textView, Group group, TextView textView2, TextView textView3) {
        this.f42792a = constraintLayout;
        this.appBarLayout = appBarLayout;
        this.toolbar = materialToolbar;
        this.transactionsRecyclerView = recyclerView;
        this.tutorialDescription = textView;
        this.tutorialGroup = group;
        this.tutorialLink = textView2;
        this.tutorialTitle = textView3;
    }

    @NonNull
    public static ChuckerActivityMainBinding bind(@NonNull View view) {
        int i = R.id.appBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, i);
        if (appBarLayout != null) {
            i = R.id.toolbar;
            MaterialToolbar materialToolbar = (MaterialToolbar) ViewBindings.findChildViewById(view, i);
            if (materialToolbar != null) {
                i = R.id.transactionsRecyclerView;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = R.id.tutorialDescription;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = R.id.tutorialGroup;
                        Group group = (Group) ViewBindings.findChildViewById(view, i);
                        if (group != null) {
                            i = R.id.tutorialLink;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                i = R.id.tutorialTitle;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView3 != null) {
                                    return new ChuckerActivityMainBinding((ConstraintLayout) view, appBarLayout, materialToolbar, recyclerView, textView, group, textView2, textView3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ChuckerActivityMainBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ChuckerActivityMainBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.chucker_activity_main, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f42792a;
    }
}