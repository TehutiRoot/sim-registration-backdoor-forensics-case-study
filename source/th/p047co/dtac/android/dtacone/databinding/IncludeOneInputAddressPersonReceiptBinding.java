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
import th.p047co.dtac.android.dtacone.app_one.widget.OneCustomClearableEditText;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.IncludeOneInputAddressPersonReceiptBinding */
/* loaded from: classes7.dex */
public final class IncludeOneInputAddressPersonReceiptBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84266a;
    @NonNull
    public final OneFontButton btnNext;
    @NonNull
    public final OneCustomClearableEditText edtAddress;
    @NonNull
    public final OneCustomClearableEditText edtBranchCode;
    @NonNull
    public final OneCustomClearableEditText edtName;
    @NonNull
    public final OneCustomClearableEditText edtPersonCardID;
    @NonNull
    public final OneFontTextView mnpTvDistrict;
    @NonNull
    public final OneFontTextView mnpTvPostCode;
    @NonNull
    public final OneFontTextView mnpTvProvince;
    @NonNull
    public final OneFontTextView mnpTvSubDistrict;
    @NonNull
    public final LinearLayout root;

    public IncludeOneInputAddressPersonReceiptBinding(LinearLayout linearLayout, OneFontButton oneFontButton, OneCustomClearableEditText oneCustomClearableEditText, OneCustomClearableEditText oneCustomClearableEditText2, OneCustomClearableEditText oneCustomClearableEditText3, OneCustomClearableEditText oneCustomClearableEditText4, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, LinearLayout linearLayout2) {
        this.f84266a = linearLayout;
        this.btnNext = oneFontButton;
        this.edtAddress = oneCustomClearableEditText;
        this.edtBranchCode = oneCustomClearableEditText2;
        this.edtName = oneCustomClearableEditText3;
        this.edtPersonCardID = oneCustomClearableEditText4;
        this.mnpTvDistrict = oneFontTextView;
        this.mnpTvPostCode = oneFontTextView2;
        this.mnpTvProvince = oneFontTextView3;
        this.mnpTvSubDistrict = oneFontTextView4;
        this.root = linearLayout2;
    }

    @NonNull
    public static IncludeOneInputAddressPersonReceiptBinding bind(@NonNull View view) {
        int i = R.id.btnNext;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.edtAddress;
            OneCustomClearableEditText oneCustomClearableEditText = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
            if (oneCustomClearableEditText != null) {
                i = R.id.edtBranchCode;
                OneCustomClearableEditText oneCustomClearableEditText2 = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
                if (oneCustomClearableEditText2 != null) {
                    i = R.id.edtName;
                    OneCustomClearableEditText oneCustomClearableEditText3 = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
                    if (oneCustomClearableEditText3 != null) {
                        i = R.id.edtPersonCardID;
                        OneCustomClearableEditText oneCustomClearableEditText4 = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
                        if (oneCustomClearableEditText4 != null) {
                            i = R.id.mnp_tv_district;
                            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView != null) {
                                i = R.id.mnp_tv_post_code;
                                OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView2 != null) {
                                    i = R.id.mnp_tv_province;
                                    OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (oneFontTextView3 != null) {
                                        i = R.id.mnp_tv_sub_district;
                                        OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (oneFontTextView4 != null) {
                                            LinearLayout linearLayout = (LinearLayout) view;
                                            return new IncludeOneInputAddressPersonReceiptBinding(linearLayout, oneFontButton, oneCustomClearableEditText, oneCustomClearableEditText2, oneCustomClearableEditText3, oneCustomClearableEditText4, oneFontTextView, oneFontTextView2, oneFontTextView3, oneFontTextView4, linearLayout);
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
    public static IncludeOneInputAddressPersonReceiptBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IncludeOneInputAddressPersonReceiptBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.include_one_input_address_person_receipt, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84266a;
    }
}
