package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.LayoutDevicesaleImeiInfoBinding */
/* loaded from: classes7.dex */
public final class LayoutDevicesaleImeiInfoBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84402a;
    @NonNull
    public final DtacFontButton buttonScanBarcode;
    @NonNull
    public final Group infoIMEIViewGroup;
    @NonNull
    public final View line1;
    @NonNull
    public final Group noIMEIViewGroup;
    @NonNull
    public final DtacFontTextView textViewBrand;
    @NonNull
    public final DtacFontTextView textViewBrandLabel;
    @NonNull
    public final DtacFontTextView textViewIMEI;
    @NonNull
    public final DtacFontTextView textViewIMEILabel;
    @NonNull
    public final DtacFontTextView textViewNoImei;
    @NonNull
    public final DtacFontTextView textViewNoImeiText;

    public LayoutDevicesaleImeiInfoBinding(LinearLayout linearLayout, DtacFontButton dtacFontButton, Group group, View view, Group group2, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5, DtacFontTextView dtacFontTextView6) {
        this.f84402a = linearLayout;
        this.buttonScanBarcode = dtacFontButton;
        this.infoIMEIViewGroup = group;
        this.line1 = view;
        this.noIMEIViewGroup = group2;
        this.textViewBrand = dtacFontTextView;
        this.textViewBrandLabel = dtacFontTextView2;
        this.textViewIMEI = dtacFontTextView3;
        this.textViewIMEILabel = dtacFontTextView4;
        this.textViewNoImei = dtacFontTextView5;
        this.textViewNoImeiText = dtacFontTextView6;
    }

    @NonNull
    public static LayoutDevicesaleImeiInfoBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.buttonScanBarcode;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.infoIMEIViewGroup;
            Group group = (Group) ViewBindings.findChildViewById(view, i);
            if (group != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.line1))) != null) {
                i = R.id.noIMEIViewGroup;
                Group group2 = (Group) ViewBindings.findChildViewById(view, i);
                if (group2 != null) {
                    i = R.id.textViewBrand;
                    DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView != null) {
                        i = R.id.textViewBrandLabel;
                        DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView2 != null) {
                            i = R.id.textViewIMEI;
                            DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView3 != null) {
                                i = R.id.textViewIMEILabel;
                                DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView4 != null) {
                                    i = R.id.textViewNoImei;
                                    DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView5 != null) {
                                        i = R.id.textViewNoImeiText;
                                        DtacFontTextView dtacFontTextView6 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (dtacFontTextView6 != null) {
                                            return new LayoutDevicesaleImeiInfoBinding((LinearLayout) view, dtacFontButton, group, findChildViewById, group2, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5, dtacFontTextView6);
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
    public static LayoutDevicesaleImeiInfoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static LayoutDevicesaleImeiInfoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_devicesale_imei_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84402a;
    }
}
