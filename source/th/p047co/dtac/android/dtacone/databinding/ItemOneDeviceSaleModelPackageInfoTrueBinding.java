package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemOneDeviceSaleModelPackageInfoTrueBinding */
/* loaded from: classes7.dex */
public final class ItemOneDeviceSaleModelPackageInfoTrueBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84351a;
    @NonNull
    public final ConstraintLayout deviceModelBrandItemLayout;
    @NonNull
    public final OneFontTextView deviceModelBrandItemTextView;
    @NonNull
    public final OneFontTextView deviceModelBrandValueItemTextView;
    @NonNull
    public final ConstraintLayout deviceModelIMEILabelItemLayout;
    @NonNull
    public final OneFontTextView deviceModelIMEILabelItemTextView;
    @NonNull
    public final OneFontTextView deviceModelIMEIValueItemTextView;
    @NonNull
    public final OneFontTextView deviceModelInfoHeaderItemTextView;
    @NonNull
    public final OneFontTextView deviceModelPackageDescriptionItemTextView;
    @NonNull
    public final OneFontButton deviceModelScanBarcodeItemButton;
    @NonNull
    public final View lineView;

    public ItemOneDeviceSaleModelPackageInfoTrueBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, ConstraintLayout constraintLayout3, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5, OneFontTextView oneFontTextView6, OneFontButton oneFontButton, View view) {
        this.f84351a = constraintLayout;
        this.deviceModelBrandItemLayout = constraintLayout2;
        this.deviceModelBrandItemTextView = oneFontTextView;
        this.deviceModelBrandValueItemTextView = oneFontTextView2;
        this.deviceModelIMEILabelItemLayout = constraintLayout3;
        this.deviceModelIMEILabelItemTextView = oneFontTextView3;
        this.deviceModelIMEIValueItemTextView = oneFontTextView4;
        this.deviceModelInfoHeaderItemTextView = oneFontTextView5;
        this.deviceModelPackageDescriptionItemTextView = oneFontTextView6;
        this.deviceModelScanBarcodeItemButton = oneFontButton;
        this.lineView = view;
    }

    @NonNull
    public static ItemOneDeviceSaleModelPackageInfoTrueBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.deviceModelBrandItemLayout;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = R.id.deviceModelBrandItemTextView;
            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView != null) {
                i = R.id.deviceModelBrandValueItemTextView;
                OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView2 != null) {
                    i = R.id.deviceModelIMEILabelItemLayout;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout2 != null) {
                        i = R.id.deviceModelIMEILabelItemTextView;
                        OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView3 != null) {
                            i = R.id.deviceModelIMEIValueItemTextView;
                            OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView4 != null) {
                                i = R.id.deviceModelInfoHeaderItemTextView;
                                OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView5 != null) {
                                    i = R.id.deviceModelPackageDescriptionItemTextView;
                                    OneFontTextView oneFontTextView6 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (oneFontTextView6 != null) {
                                        i = R.id.deviceModelScanBarcodeItemButton;
                                        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
                                        if (oneFontButton != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.lineView))) != null) {
                                            return new ItemOneDeviceSaleModelPackageInfoTrueBinding((ConstraintLayout) view, constraintLayout, oneFontTextView, oneFontTextView2, constraintLayout2, oneFontTextView3, oneFontTextView4, oneFontTextView5, oneFontTextView6, oneFontButton, findChildViewById);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemOneDeviceSaleModelPackageInfoTrueBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemOneDeviceSaleModelPackageInfoTrueBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_one_device_sale_model_package_info_true, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84351a;
    }
}
