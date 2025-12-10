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

/* renamed from: th.co.dtac.android.dtacone.databinding.ZIncludeMrtrInputAddressIdCardReceiptBinding */
/* loaded from: classes7.dex */
public final class ZIncludeMrtrInputAddressIdCardReceiptBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84632a;
    @NonNull
    public final DtacFontButton btnNext;
    @NonNull
    public final DtacClearableEditText edtAddress;
    @NonNull
    public final DtacClearableEditText edtIdCard;
    @NonNull
    public final DtacClearableEditText edtName;
    @NonNull
    public final DtacClearableEditText edtSureName;
    @NonNull
    public final DtacFontTextView mnpTvDistrict;
    @NonNull
    public final DtacFontTextView mnpTvPostCode;
    @NonNull
    public final DtacFontTextView mnpTvProvince;
    @NonNull
    public final DtacFontTextView mnpTvSubDistrict;
    @NonNull
    public final LinearLayout root;

    public ZIncludeMrtrInputAddressIdCardReceiptBinding(LinearLayout linearLayout, DtacFontButton dtacFontButton, DtacClearableEditText dtacClearableEditText, DtacClearableEditText dtacClearableEditText2, DtacClearableEditText dtacClearableEditText3, DtacClearableEditText dtacClearableEditText4, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, LinearLayout linearLayout2) {
        this.f84632a = linearLayout;
        this.btnNext = dtacFontButton;
        this.edtAddress = dtacClearableEditText;
        this.edtIdCard = dtacClearableEditText2;
        this.edtName = dtacClearableEditText3;
        this.edtSureName = dtacClearableEditText4;
        this.mnpTvDistrict = dtacFontTextView;
        this.mnpTvPostCode = dtacFontTextView2;
        this.mnpTvProvince = dtacFontTextView3;
        this.mnpTvSubDistrict = dtacFontTextView4;
        this.root = linearLayout2;
    }

    @NonNull
    public static ZIncludeMrtrInputAddressIdCardReceiptBinding bind(@NonNull View view) {
        int i = R.id.btnNext;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.edtAddress;
            DtacClearableEditText dtacClearableEditText = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
            if (dtacClearableEditText != null) {
                i = R.id.edtIdCard;
                DtacClearableEditText dtacClearableEditText2 = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
                if (dtacClearableEditText2 != null) {
                    i = R.id.edtName;
                    DtacClearableEditText dtacClearableEditText3 = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
                    if (dtacClearableEditText3 != null) {
                        i = R.id.edtSureName;
                        DtacClearableEditText dtacClearableEditText4 = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
                        if (dtacClearableEditText4 != null) {
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
                                            return new ZIncludeMrtrInputAddressIdCardReceiptBinding(linearLayout, dtacFontButton, dtacClearableEditText, dtacClearableEditText2, dtacClearableEditText3, dtacClearableEditText4, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, linearLayout);
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
    public static ZIncludeMrtrInputAddressIdCardReceiptBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZIncludeMrtrInputAddressIdCardReceiptBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_include_mrtr_input_address_id_card_receipt, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84632a;
    }
}
