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

/* renamed from: th.co.dtac.android.dtacone.databinding.OneIncludeInputAddressReceiptBinding */
/* loaded from: classes7.dex */
public final class OneIncludeInputAddressReceiptBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84469a;
    @NonNull
    public final OneFontButton btnNext;
    @NonNull
    public final OneFontTextView mnpTvDistrict;
    @NonNull
    public final OneFontTextView mnpTvPostCode;
    @NonNull
    public final OneFontTextView mnpTvProvince;
    @NonNull
    public final OneFontTextView mnpTvSubDistrict;
    @NonNull
    public final LinearLayout rootRegistrant;
    @NonNull
    public final OneCustomClearableEditText tvAddress;
    @NonNull
    public final OneCustomClearableEditText tvIdCard;
    @NonNull
    public final OneCustomClearableEditText tvName;
    @NonNull
    public final OneCustomClearableEditText tvSureName;

    public OneIncludeInputAddressReceiptBinding(LinearLayout linearLayout, OneFontButton oneFontButton, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, LinearLayout linearLayout2, OneCustomClearableEditText oneCustomClearableEditText, OneCustomClearableEditText oneCustomClearableEditText2, OneCustomClearableEditText oneCustomClearableEditText3, OneCustomClearableEditText oneCustomClearableEditText4) {
        this.f84469a = linearLayout;
        this.btnNext = oneFontButton;
        this.mnpTvDistrict = oneFontTextView;
        this.mnpTvPostCode = oneFontTextView2;
        this.mnpTvProvince = oneFontTextView3;
        this.mnpTvSubDistrict = oneFontTextView4;
        this.rootRegistrant = linearLayout2;
        this.tvAddress = oneCustomClearableEditText;
        this.tvIdCard = oneCustomClearableEditText2;
        this.tvName = oneCustomClearableEditText3;
        this.tvSureName = oneCustomClearableEditText4;
    }

    @NonNull
    public static OneIncludeInputAddressReceiptBinding bind(@NonNull View view) {
        int i = R.id.btnNext;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
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
                            i = R.id.tvAddress;
                            OneCustomClearableEditText oneCustomClearableEditText = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
                            if (oneCustomClearableEditText != null) {
                                i = R.id.tvIdCard;
                                OneCustomClearableEditText oneCustomClearableEditText2 = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
                                if (oneCustomClearableEditText2 != null) {
                                    i = R.id.tvName;
                                    OneCustomClearableEditText oneCustomClearableEditText3 = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
                                    if (oneCustomClearableEditText3 != null) {
                                        i = R.id.tvSureName;
                                        OneCustomClearableEditText oneCustomClearableEditText4 = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
                                        if (oneCustomClearableEditText4 != null) {
                                            return new OneIncludeInputAddressReceiptBinding(linearLayout, oneFontButton, oneFontTextView, oneFontTextView2, oneFontTextView3, oneFontTextView4, linearLayout, oneCustomClearableEditText, oneCustomClearableEditText2, oneCustomClearableEditText3, oneCustomClearableEditText4);
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
    public static OneIncludeInputAddressReceiptBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneIncludeInputAddressReceiptBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_include_input_address_receipt, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84469a;
    }
}
