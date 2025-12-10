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

/* renamed from: th.co.dtac.android.dtacone.databinding.ZToolbarMrtrIconInfoBinding */
/* loaded from: classes7.dex */
public final class ZToolbarMrtrIconInfoBinding implements ViewBinding {

    /* renamed from: a */
    public final AppBarLayout f84817a;
    @NonNull
    public final ImageView icInfo;
    @NonNull
    public final ImageView icQRCode;
    @NonNull
    public final DtacToolbar toolbar;
    @NonNull
    public final DtacFontTextView tvToolbarTitle;

    public ZToolbarMrtrIconInfoBinding(AppBarLayout appBarLayout, ImageView imageView, ImageView imageView2, DtacToolbar dtacToolbar, DtacFontTextView dtacFontTextView) {
        this.f84817a = appBarLayout;
        this.icInfo = imageView;
        this.icQRCode = imageView2;
        this.toolbar = dtacToolbar;
        this.tvToolbarTitle = dtacFontTextView;
    }

    @NonNull
    public static ZToolbarMrtrIconInfoBinding bind(@NonNull View view) {
        int i = R.id.icInfo;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.icQRCode;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = R.id.toolbar;
                DtacToolbar dtacToolbar = (DtacToolbar) ViewBindings.findChildViewById(view, i);
                if (dtacToolbar != null) {
                    i = R.id.tv_toolbar_title;
                    DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView != null) {
                        return new ZToolbarMrtrIconInfoBinding((AppBarLayout) view, imageView, imageView2, dtacToolbar, dtacFontTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZToolbarMrtrIconInfoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZToolbarMrtrIconInfoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_toolbar_mrtr_icon_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public AppBarLayout getRoot() {
        return this.f84817a;
    }
}