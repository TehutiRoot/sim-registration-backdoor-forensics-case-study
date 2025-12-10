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

/* renamed from: th.co.dtac.android.dtacone.databinding.OneTransparentToolbarBinding */
/* loaded from: classes7.dex */
public final class OneTransparentToolbarBinding implements ViewBinding {

    /* renamed from: a */
    public final AppBarLayout f84541a;
    @NonNull
    public final AppBarLayout appBarTransparentLayout;
    @NonNull
    public final ImageView toolbarLeftButton;
    @NonNull
    public final ImageView toolbarRightButton;
    @NonNull
    public final DtacToolbar toolbarTransparent;
    @NonNull
    public final OneFontTextView tvToolbarTransparentTitle;

    public OneTransparentToolbarBinding(AppBarLayout appBarLayout, AppBarLayout appBarLayout2, ImageView imageView, ImageView imageView2, DtacToolbar dtacToolbar, OneFontTextView oneFontTextView) {
        this.f84541a = appBarLayout;
        this.appBarTransparentLayout = appBarLayout2;
        this.toolbarLeftButton = imageView;
        this.toolbarRightButton = imageView2;
        this.toolbarTransparent = dtacToolbar;
        this.tvToolbarTransparentTitle = oneFontTextView;
    }

    @NonNull
    public static OneTransparentToolbarBinding bind(@NonNull View view) {
        AppBarLayout appBarLayout = (AppBarLayout) view;
        int i = R.id.toolbarLeftButton;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.toolbar_right_button;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = R.id.toolbarTransparent;
                DtacToolbar dtacToolbar = (DtacToolbar) ViewBindings.findChildViewById(view, i);
                if (dtacToolbar != null) {
                    i = R.id.tvToolbarTransparentTitle;
                    OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView != null) {
                        return new OneTransparentToolbarBinding(appBarLayout, appBarLayout, imageView, imageView2, dtacToolbar, oneFontTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneTransparentToolbarBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneTransparentToolbarBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_transparent_toolbar, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public AppBarLayout getRoot() {
        return this.f84541a;
    }
}
