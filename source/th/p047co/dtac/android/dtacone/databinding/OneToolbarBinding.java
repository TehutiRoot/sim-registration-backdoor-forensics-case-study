package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacToolbar;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneToolbarBinding */
/* loaded from: classes7.dex */
public final class OneToolbarBinding implements ViewBinding {

    /* renamed from: a */
    public final AppBarLayout f84539a;
    @NonNull
    public final ImageView iconRight;
    @NonNull
    public final AppBarLayout layoutToolbar;
    @NonNull
    public final DtacToolbar toolbar;
    @NonNull
    public final ImageView toolbarRightButton;
    @NonNull
    public final OneFontTextView tvToolbarTitle;

    public OneToolbarBinding(AppBarLayout appBarLayout, ImageView imageView, AppBarLayout appBarLayout2, DtacToolbar dtacToolbar, ImageView imageView2, OneFontTextView oneFontTextView) {
        this.f84539a = appBarLayout;
        this.iconRight = imageView;
        this.layoutToolbar = appBarLayout2;
        this.toolbar = dtacToolbar;
        this.toolbarRightButton = imageView2;
        this.tvToolbarTitle = oneFontTextView;
    }

    @NonNull
    public static OneToolbarBinding bind(@NonNull View view) {
        int i = R.id.icon_right;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            i = R.id.toolbar;
            DtacToolbar dtacToolbar = (DtacToolbar) ViewBindings.findChildViewById(view, i);
            if (dtacToolbar != null) {
                i = R.id.toolbar_right_button;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    i = R.id.tv_toolbar_title;
                    OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView != null) {
                        return new OneToolbarBinding(appBarLayout, imageView, appBarLayout, dtacToolbar, imageView2, oneFontTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneToolbarBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneToolbarBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_toolbar, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public AppBarLayout getRoot() {
        return this.f84539a;
    }
}
