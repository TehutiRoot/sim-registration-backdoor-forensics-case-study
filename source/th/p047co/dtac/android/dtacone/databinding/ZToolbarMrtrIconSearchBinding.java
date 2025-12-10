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

/* renamed from: th.co.dtac.android.dtacone.databinding.ZToolbarMrtrIconSearchBinding */
/* loaded from: classes7.dex */
public final class ZToolbarMrtrIconSearchBinding implements ViewBinding {

    /* renamed from: a */
    public final AppBarLayout f84708a;
    @NonNull
    public final AppBarLayout appBarLayout;
    @NonNull
    public final ImageView icSearch;
    @NonNull
    public final DtacToolbar toolbar;
    @NonNull
    public final DtacFontTextView tvToolbarTitle;

    public ZToolbarMrtrIconSearchBinding(AppBarLayout appBarLayout, AppBarLayout appBarLayout2, ImageView imageView, DtacToolbar dtacToolbar, DtacFontTextView dtacFontTextView) {
        this.f84708a = appBarLayout;
        this.appBarLayout = appBarLayout2;
        this.icSearch = imageView;
        this.toolbar = dtacToolbar;
        this.tvToolbarTitle = dtacFontTextView;
    }

    @NonNull
    public static ZToolbarMrtrIconSearchBinding bind(@NonNull View view) {
        AppBarLayout appBarLayout = (AppBarLayout) view;
        int i = R.id.icSearch;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.toolbar;
            DtacToolbar dtacToolbar = (DtacToolbar) ViewBindings.findChildViewById(view, i);
            if (dtacToolbar != null) {
                i = R.id.tv_toolbar_title;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    return new ZToolbarMrtrIconSearchBinding(appBarLayout, appBarLayout, imageView, dtacToolbar, dtacFontTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZToolbarMrtrIconSearchBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZToolbarMrtrIconSearchBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_toolbar_mrtr_icon_search, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public AppBarLayout getRoot() {
        return this.f84708a;
    }
}
