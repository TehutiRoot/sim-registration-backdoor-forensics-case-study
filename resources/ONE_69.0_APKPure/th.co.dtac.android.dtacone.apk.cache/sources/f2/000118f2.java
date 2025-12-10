package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZItemPackageInfoSkuBinding */
/* loaded from: classes7.dex */
public final class ZItemPackageInfoSkuBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayoutCompat f84769a;
    @NonNull
    public final LinearLayoutCompat callBox;
    @NonNull
    public final AppCompatImageView icInfo;
    @NonNull
    public final DtacFontTextView tvData;

    public ZItemPackageInfoSkuBinding(LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2, AppCompatImageView appCompatImageView, DtacFontTextView dtacFontTextView) {
        this.f84769a = linearLayoutCompat;
        this.callBox = linearLayoutCompat2;
        this.icInfo = appCompatImageView;
        this.tvData = dtacFontTextView;
    }

    @NonNull
    public static ZItemPackageInfoSkuBinding bind(@NonNull View view) {
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
        int i = R.id.icInfo;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.tvData;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView != null) {
                return new ZItemPackageInfoSkuBinding(linearLayoutCompat, linearLayoutCompat, appCompatImageView, dtacFontTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZItemPackageInfoSkuBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZItemPackageInfoSkuBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_item_package_info_sku, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayoutCompat getRoot() {
        return this.f84769a;
    }
}