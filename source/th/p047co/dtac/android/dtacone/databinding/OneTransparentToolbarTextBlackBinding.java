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

/* renamed from: th.co.dtac.android.dtacone.databinding.OneTransparentToolbarTextBlackBinding */
/* loaded from: classes7.dex */
public final class OneTransparentToolbarTextBlackBinding implements ViewBinding {

    /* renamed from: a */
    public final AppBarLayout f84542a;
    @NonNull
    public final AppBarLayout appBarTransparentLayout;
    @NonNull
    public final ImageView toolbarRightButton;
    @NonNull
    public final DtacToolbar toolbarTransparent;
    @NonNull
    public final OneFontTextView tvToolbarTransparentTitle;

    public OneTransparentToolbarTextBlackBinding(AppBarLayout appBarLayout, AppBarLayout appBarLayout2, ImageView imageView, DtacToolbar dtacToolbar, OneFontTextView oneFontTextView) {
        this.f84542a = appBarLayout;
        this.appBarTransparentLayout = appBarLayout2;
        this.toolbarRightButton = imageView;
        this.toolbarTransparent = dtacToolbar;
        this.tvToolbarTransparentTitle = oneFontTextView;
    }

    @NonNull
    public static OneTransparentToolbarTextBlackBinding bind(@NonNull View view) {
        AppBarLayout appBarLayout = (AppBarLayout) view;
        int i = R.id.toolbar_right_button;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.toolbarTransparent;
            DtacToolbar dtacToolbar = (DtacToolbar) ViewBindings.findChildViewById(view, i);
            if (dtacToolbar != null) {
                i = R.id.tvToolbarTransparentTitle;
                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView != null) {
                    return new OneTransparentToolbarTextBlackBinding(appBarLayout, appBarLayout, imageView, dtacToolbar, oneFontTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneTransparentToolbarTextBlackBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneTransparentToolbarTextBlackBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_transparent_toolbar_text_black, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public AppBarLayout getRoot() {
        return this.f84542a;
    }
}
