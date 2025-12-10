package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityOneHomeBinding */
/* loaded from: classes7.dex */
public final class ActivityOneHomeBinding implements ViewBinding {

    /* renamed from: a */
    public final CoordinatorLayout f83640a;
    @NonNull
    public final FrameLayout bgMenuMain;
    @NonNull
    public final BottomNavigationView bottomNavigationView;
    @NonNull
    public final AppCompatImageView btnToggleCompany;
    @NonNull
    public final CoordinatorLayout contentService;
    @NonNull
    public final OneTransparentToolbarBinding incToolbar;
    @NonNull
    public final CoordinatorLayout serviceContainer;
    @NonNull
    public final View vGuildLine;

    public ActivityOneHomeBinding(CoordinatorLayout coordinatorLayout, FrameLayout frameLayout, BottomNavigationView bottomNavigationView, AppCompatImageView appCompatImageView, CoordinatorLayout coordinatorLayout2, OneTransparentToolbarBinding oneTransparentToolbarBinding, CoordinatorLayout coordinatorLayout3, View view) {
        this.f83640a = coordinatorLayout;
        this.bgMenuMain = frameLayout;
        this.bottomNavigationView = bottomNavigationView;
        this.btnToggleCompany = appCompatImageView;
        this.contentService = coordinatorLayout2;
        this.incToolbar = oneTransparentToolbarBinding;
        this.serviceContainer = coordinatorLayout3;
        this.vGuildLine = view;
    }

    @NonNull
    public static ActivityOneHomeBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.bgMenuMain;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.bottomNavigationView;
            BottomNavigationView bottomNavigationView = (BottomNavigationView) ViewBindings.findChildViewById(view, i);
            if (bottomNavigationView != null) {
                i = R.id.btnToggleCompany;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView != null) {
                    i = R.id.contentService;
                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(view, i);
                    if (coordinatorLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.incToolbar))) != null) {
                        OneTransparentToolbarBinding bind = OneTransparentToolbarBinding.bind(findChildViewById);
                        CoordinatorLayout coordinatorLayout2 = (CoordinatorLayout) view;
                        i = R.id.vGuildLine;
                        View findChildViewById2 = ViewBindings.findChildViewById(view, i);
                        if (findChildViewById2 != null) {
                            return new ActivityOneHomeBinding(coordinatorLayout2, frameLayout, bottomNavigationView, appCompatImageView, coordinatorLayout, bind, coordinatorLayout2, findChildViewById2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityOneHomeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityOneHomeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_one_home, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.f83640a;
    }
}