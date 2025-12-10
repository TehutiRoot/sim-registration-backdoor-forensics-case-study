package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.HeaderOneDeviceSaleTrueCompanyBinding */
/* loaded from: classes7.dex */
public final class HeaderOneDeviceSaleTrueCompanyBinding implements ViewBinding {

    /* renamed from: a */
    public final View f84335a;
    @NonNull
    public final OneFontTextView deviceSaleContractHeaderTextView;
    @NonNull
    public final ImageView deviceSaleDeviceTypeHeaderImageView;
    @NonNull
    public final OneFontTextView deviceSaleTitleHeaderTextView;
    @NonNull
    public final Guideline guideHeaderBackground;
    @NonNull
    public final Guideline guideVertical;

    public HeaderOneDeviceSaleTrueCompanyBinding(View view, OneFontTextView oneFontTextView, ImageView imageView, OneFontTextView oneFontTextView2, Guideline guideline, Guideline guideline2) {
        this.f84335a = view;
        this.deviceSaleContractHeaderTextView = oneFontTextView;
        this.deviceSaleDeviceTypeHeaderImageView = imageView;
        this.deviceSaleTitleHeaderTextView = oneFontTextView2;
        this.guideHeaderBackground = guideline;
        this.guideVertical = guideline2;
    }

    @NonNull
    public static HeaderOneDeviceSaleTrueCompanyBinding bind(@NonNull View view) {
        int i = R.id.deviceSaleContractHeaderTextView;
        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
        if (oneFontTextView != null) {
            i = R.id.deviceSaleDeviceTypeHeaderImageView;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.deviceSaleTitleHeaderTextView;
                OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView2 != null) {
                    i = R.id.guideHeaderBackground;
                    Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                    if (guideline != null) {
                        i = R.id.guideVertical;
                        Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i);
                        if (guideline2 != null) {
                            return new HeaderOneDeviceSaleTrueCompanyBinding(view, oneFontTextView, imageView, oneFontTextView2, guideline, guideline2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static HeaderOneDeviceSaleTrueCompanyBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.header_one_device_sale_true_company, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f84335a;
    }
}