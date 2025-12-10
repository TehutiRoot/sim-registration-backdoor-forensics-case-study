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
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacToolbar;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZToolbarBinding */
/* loaded from: classes7.dex */
public final class ZToolbarBinding implements ViewBinding {

    /* renamed from: a */
    public final AppBarLayout f84706a;
    @NonNull
    public final AppBarLayout layoutToolbar;
    @NonNull
    public final DtacToolbar toolbar;
    @NonNull
    public final ImageView toolbarRightButton;
    @NonNull
    public final DtacFontTextView tvToolbarTitle;

    public ZToolbarBinding(AppBarLayout appBarLayout, AppBarLayout appBarLayout2, DtacToolbar dtacToolbar, ImageView imageView, DtacFontTextView dtacFontTextView) {
        this.f84706a = appBarLayout;
        this.layoutToolbar = appBarLayout2;
        this.toolbar = dtacToolbar;
        this.toolbarRightButton = imageView;
        this.tvToolbarTitle = dtacFontTextView;
    }

    @NonNull
    public static ZToolbarBinding bind(@NonNull View view) {
        AppBarLayout appBarLayout = (AppBarLayout) view;
        int i = R.id.toolbar;
        DtacToolbar dtacToolbar = (DtacToolbar) ViewBindings.findChildViewById(view, i);
        if (dtacToolbar != null) {
            i = R.id.toolbar_right_button;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.tv_toolbar_title;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    return new ZToolbarBinding(appBarLayout, appBarLayout, dtacToolbar, imageView, dtacFontTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZToolbarBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZToolbarBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_toolbar, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public AppBarLayout getRoot() {
        return this.f84706a;
    }
}
