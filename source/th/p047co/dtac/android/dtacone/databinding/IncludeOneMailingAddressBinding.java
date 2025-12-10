package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneCustomClearableEditText;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.app_one.widget.OneRadioButton;

/* renamed from: th.co.dtac.android.dtacone.databinding.IncludeOneMailingAddressBinding */
/* loaded from: classes7.dex */
public final class IncludeOneMailingAddressBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84271a;
    @NonNull
    public final OneCustomClearableEditText edtAddress1;
    @NonNull
    public final OneCustomClearableEditText edtAddress2;
    @NonNull
    public final OneCustomClearableEditText edtEmail;
    @NonNull
    public final OneCustomClearableEditText edtPhoneNumber;
    @NonNull
    public final OneRadioButton mnpRbCustomLocation;
    @NonNull
    public final OneRadioButton mnpRbLocationIdCard;
    @NonNull
    public final OneFontTextView mnpTvDistrict;
    @NonNull
    public final OneFontTextView mnpTvPostCode;
    @NonNull
    public final OneFontTextView mnpTvProvince;
    @NonNull
    public final OneFontTextView mnpTvSubDistrict;
    @NonNull
    public final RadioGroup rdbGroupAddress;
    @NonNull
    public final LinearLayout root;
    @NonNull
    public final OneFontTextView tvMailingTitle;

    public IncludeOneMailingAddressBinding(LinearLayout linearLayout, OneCustomClearableEditText oneCustomClearableEditText, OneCustomClearableEditText oneCustomClearableEditText2, OneCustomClearableEditText oneCustomClearableEditText3, OneCustomClearableEditText oneCustomClearableEditText4, OneRadioButton oneRadioButton, OneRadioButton oneRadioButton2, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, RadioGroup radioGroup, LinearLayout linearLayout2, OneFontTextView oneFontTextView5) {
        this.f84271a = linearLayout;
        this.edtAddress1 = oneCustomClearableEditText;
        this.edtAddress2 = oneCustomClearableEditText2;
        this.edtEmail = oneCustomClearableEditText3;
        this.edtPhoneNumber = oneCustomClearableEditText4;
        this.mnpRbCustomLocation = oneRadioButton;
        this.mnpRbLocationIdCard = oneRadioButton2;
        this.mnpTvDistrict = oneFontTextView;
        this.mnpTvPostCode = oneFontTextView2;
        this.mnpTvProvince = oneFontTextView3;
        this.mnpTvSubDistrict = oneFontTextView4;
        this.rdbGroupAddress = radioGroup;
        this.root = linearLayout2;
        this.tvMailingTitle = oneFontTextView5;
    }

    @NonNull
    public static IncludeOneMailingAddressBinding bind(@NonNull View view) {
        int i = R.id.edtAddress1;
        OneCustomClearableEditText oneCustomClearableEditText = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
        if (oneCustomClearableEditText != null) {
            i = R.id.edtAddress2;
            OneCustomClearableEditText oneCustomClearableEditText2 = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
            if (oneCustomClearableEditText2 != null) {
                i = R.id.edtEmail;
                OneCustomClearableEditText oneCustomClearableEditText3 = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
                if (oneCustomClearableEditText3 != null) {
                    i = R.id.edtPhoneNumber;
                    OneCustomClearableEditText oneCustomClearableEditText4 = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
                    if (oneCustomClearableEditText4 != null) {
                        i = R.id.mnp_rb_custom_location;
                        OneRadioButton oneRadioButton = (OneRadioButton) ViewBindings.findChildViewById(view, i);
                        if (oneRadioButton != null) {
                            i = R.id.mnp_rb_location_id_card;
                            OneRadioButton oneRadioButton2 = (OneRadioButton) ViewBindings.findChildViewById(view, i);
                            if (oneRadioButton2 != null) {
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
                                                i = R.id.rdbGroupAddress;
                                                RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, i);
                                                if (radioGroup != null) {
                                                    LinearLayout linearLayout = (LinearLayout) view;
                                                    i = R.id.tv_mailing_title;
                                                    OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (oneFontTextView5 != null) {
                                                        return new IncludeOneMailingAddressBinding(linearLayout, oneCustomClearableEditText, oneCustomClearableEditText2, oneCustomClearableEditText3, oneCustomClearableEditText4, oneRadioButton, oneRadioButton2, oneFontTextView, oneFontTextView2, oneFontTextView3, oneFontTextView4, radioGroup, linearLayout, oneFontTextView5);
                                                    }
                                                }
                                            }
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
    public static IncludeOneMailingAddressBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IncludeOneMailingAddressBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.include_one_mailing_address, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84271a;
    }
}
