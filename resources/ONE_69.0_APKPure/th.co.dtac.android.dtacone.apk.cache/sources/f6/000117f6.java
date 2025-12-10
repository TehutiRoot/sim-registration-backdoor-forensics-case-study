package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.LayoutOneDevicesaleImeiInfoBinding */
/* loaded from: classes7.dex */
public final class LayoutOneDevicesaleImeiInfoBinding implements ViewBinding {

    /* renamed from: a */
    public final View f84517a;
    @NonNull
    public final OneFontButton buttonScanBarcode;
    @NonNull
    public final Group infoIMEIViewGroup;
    @NonNull
    public final View line1;
    @NonNull
    public final Group noIMEIViewGroup;
    @NonNull
    public final OneFontTextView textViewBrand;
    @NonNull
    public final OneFontTextView textViewBrandLabel;
    @NonNull
    public final OneFontTextView textViewIMEI;
    @NonNull
    public final OneFontTextView textViewIMEILabel;
    @NonNull
    public final OneFontTextView textViewNoImei;
    @NonNull
    public final OneFontTextView textViewNoImeiText;

    public LayoutOneDevicesaleImeiInfoBinding(View view, OneFontButton oneFontButton, Group group, View view2, Group group2, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5, OneFontTextView oneFontTextView6) {
        this.f84517a = view;
        this.buttonScanBarcode = oneFontButton;
        this.infoIMEIViewGroup = group;
        this.line1 = view2;
        this.noIMEIViewGroup = group2;
        this.textViewBrand = oneFontTextView;
        this.textViewBrandLabel = oneFontTextView2;
        this.textViewIMEI = oneFontTextView3;
        this.textViewIMEILabel = oneFontTextView4;
        this.textViewNoImei = oneFontTextView5;
        this.textViewNoImeiText = oneFontTextView6;
    }

    @NonNull
    public static LayoutOneDevicesaleImeiInfoBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.buttonScanBarcode;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.infoIMEIViewGroup;
            Group group = (Group) ViewBindings.findChildViewById(view, i);
            if (group != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.line1))) != null) {
                i = R.id.noIMEIViewGroup;
                Group group2 = (Group) ViewBindings.findChildViewById(view, i);
                if (group2 != null) {
                    i = R.id.textViewBrand;
                    OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView != null) {
                        i = R.id.textViewBrandLabel;
                        OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView2 != null) {
                            i = R.id.textViewIMEI;
                            OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView3 != null) {
                                i = R.id.textViewIMEILabel;
                                OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView4 != null) {
                                    i = R.id.textViewNoImei;
                                    OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (oneFontTextView5 != null) {
                                        i = R.id.textViewNoImeiText;
                                        OneFontTextView oneFontTextView6 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (oneFontTextView6 != null) {
                                            return new LayoutOneDevicesaleImeiInfoBinding(view, oneFontButton, group, findChildViewById, group2, oneFontTextView, oneFontTextView2, oneFontTextView3, oneFontTextView4, oneFontTextView5, oneFontTextView6);
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
    public static LayoutOneDevicesaleImeiInfoBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.layout_one_devicesale_imei_info, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f84517a;
    }
}