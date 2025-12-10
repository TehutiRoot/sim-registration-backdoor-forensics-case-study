package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacClearableEditText;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZIncludeMrtrInputAddressReceiptBinding */
/* loaded from: classes7.dex */
public final class ZIncludeMrtrInputAddressReceiptBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84635a;
    @NonNull
    public final DtacFontButton btnNext;
    @NonNull
    public final DtacFontTextView mnpTvDistrict;
    @NonNull
    public final DtacFontTextView mnpTvPostCode;
    @NonNull
    public final DtacFontTextView mnpTvProvince;
    @NonNull
    public final DtacFontTextView mnpTvSubDistrict;
    @NonNull
    public final LinearLayout rootRegistrant;
    @NonNull
    public final DtacClearableEditText tvAddress;
    @NonNull
    public final DtacClearableEditText tvIdCard;
    @NonNull
    public final DtacClearableEditText tvName;
    @NonNull
    public final DtacClearableEditText tvSureName;

    public ZIncludeMrtrInputAddressReceiptBinding(LinearLayout linearLayout, DtacFontButton dtacFontButton, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, LinearLayout linearLayout2, DtacClearableEditText dtacClearableEditText, DtacClearableEditText dtacClearableEditText2, DtacClearableEditText dtacClearableEditText3, DtacClearableEditText dtacClearableEditText4) {
        this.f84635a = linearLayout;
        this.btnNext = dtacFontButton;
        this.mnpTvDistrict = dtacFontTextView;
        this.mnpTvPostCode = dtacFontTextView2;
        this.mnpTvProvince = dtacFontTextView3;
        this.mnpTvSubDistrict = dtacFontTextView4;
        this.rootRegistrant = linearLayout2;
        this.tvAddress = dtacClearableEditText;
        this.tvIdCard = dtacClearableEditText2;
        this.tvName = dtacClearableEditText3;
        this.tvSureName = dtacClearableEditText4;
    }

    @NonNull
    public static ZIncludeMrtrInputAddressReceiptBinding bind(@NonNull View view) {
        int i = R.id.btnNext;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.mnp_tv_district;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView != null) {
                i = R.id.mnp_tv_post_code;
                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView2 != null) {
                    i = R.id.mnp_tv_province;
                    DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView3 != null) {
                        i = R.id.mnp_tv_sub_district;
                        DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView4 != null) {
                            LinearLayout linearLayout = (LinearLayout) view;
                            i = R.id.tvAddress;
                            DtacClearableEditText dtacClearableEditText = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
                            if (dtacClearableEditText != null) {
                                i = R.id.tvIdCard;
                                DtacClearableEditText dtacClearableEditText2 = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
                                if (dtacClearableEditText2 != null) {
                                    i = R.id.tvName;
                                    DtacClearableEditText dtacClearableEditText3 = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
                                    if (dtacClearableEditText3 != null) {
                                        i = R.id.tvSureName;
                                        DtacClearableEditText dtacClearableEditText4 = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
                                        if (dtacClearableEditText4 != null) {
                                            return new ZIncludeMrtrInputAddressReceiptBinding(linearLayout, dtacFontButton, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, linearLayout, dtacClearableEditText, dtacClearableEditText2, dtacClearableEditText3, dtacClearableEditText4);
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
    public static ZIncludeMrtrInputAddressReceiptBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZIncludeMrtrInputAddressReceiptBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_include_mrtr_input_address_receipt, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84635a;
    }
}
