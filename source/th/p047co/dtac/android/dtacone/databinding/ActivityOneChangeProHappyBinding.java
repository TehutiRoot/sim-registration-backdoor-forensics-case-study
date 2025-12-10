package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacToolbar;

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityOneChangeProHappyBinding */
/* loaded from: classes7.dex */
public final class ActivityOneChangeProHappyBinding implements ViewBinding {

    /* renamed from: a */
    public final CoordinatorLayout f83538a;
    @NonNull
    public final FrameLayout contentLayout;
    @NonNull
    public final AppBarLayout layoutToolbar;
    @NonNull
    public final DtacToolbar toolbar;
    @NonNull
    public final ImageView toolbarRightButton;
    @NonNull
    public final OneFontTextView tvToolbarTitle;

    public ActivityOneChangeProHappyBinding(CoordinatorLayout coordinatorLayout, FrameLayout frameLayout, AppBarLayout appBarLayout, DtacToolbar dtacToolbar, ImageView imageView, OneFontTextView oneFontTextView) {
        this.f83538a = coordinatorLayout;
        this.contentLayout = frameLayout;
        this.layoutToolbar = appBarLayout;
        this.toolbar = dtacToolbar;
        this.toolbarRightButton = imageView;
        this.tvToolbarTitle = oneFontTextView;
    }

    @NonNull
    public static ActivityOneChangeProHappyBinding bind(@NonNull View view) {
        int i = R.id.contentLayout;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.layoutToolbar;
            AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, i);
            if (appBarLayout != null) {
                i = R.id.toolbar;
                DtacToolbar dtacToolbar = (DtacToolbar) ViewBindings.findChildViewById(view, i);
                if (dtacToolbar != null) {
                    i = R.id.toolbar_right_button;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R.id.tv_toolbar_title;
                        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView != null) {
                            return new ActivityOneChangeProHappyBinding((CoordinatorLayout) view, frameLayout, appBarLayout, dtacToolbar, imageView, oneFontTextView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityOneChangeProHappyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityOneChangeProHappyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_one_change_pro_happy, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.f83538a;
    }
}
