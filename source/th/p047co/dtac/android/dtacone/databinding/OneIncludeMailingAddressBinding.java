package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneCustomClearableEditText;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.app_one.widget.OneRadioButton;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneIncludeMailingAddressBinding */
/* loaded from: classes7.dex */
public final class OneIncludeMailingAddressBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84471a;
    @NonNull
    public final OneCustomClearableEditText edtAddress;
    @NonNull
    public final OneCustomClearableEditText edtEmail;
    @NonNull
    public final OneCustomClearableEditText edtHouseNo;
    @NonNull
    public final OneCustomClearableEditText edtPhoneNumber;
    @NonNull
    public final LinearLayoutCompat layoutDistrict;
    @NonNull
    public final LinearLayoutCompat layoutPostcode;
    @NonNull
    public final LinearLayoutCompat layoutProvince;
    @NonNull
    public final LinearLayoutCompat layoutSubDistrict;
    @NonNull
    public final OneRadioButton ppRbCustomLocation;
    @NonNull
    public final OneRadioButton ppRbLocationIdCard;
    @NonNull
    public final OneFontTextView ppTvDistrict;
    @NonNull
    public final OneFontTextView ppTvPostCode;
    @NonNull
    public final OneFontTextView ppTvProvince;
    @NonNull
    public final OneFontTextView ppTvSubDistrict;
    @NonNull
    public final RadioGroup rdbGroupAddress;
    @NonNull
    public final ConstraintLayout rootMailing;
    @NonNull
    public final OneFontTextView tvMailingTitle;

    public OneIncludeMailingAddressBinding(ConstraintLayout constraintLayout, OneCustomClearableEditText oneCustomClearableEditText, OneCustomClearableEditText oneCustomClearableEditText2, OneCustomClearableEditText oneCustomClearableEditText3, OneCustomClearableEditText oneCustomClearableEditText4, LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2, LinearLayoutCompat linearLayoutCompat3, LinearLayoutCompat linearLayoutCompat4, OneRadioButton oneRadioButton, OneRadioButton oneRadioButton2, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, RadioGroup radioGroup, ConstraintLayout constraintLayout2, OneFontTextView oneFontTextView5) {
        this.f84471a = constraintLayout;
        this.edtAddress = oneCustomClearableEditText;
        this.edtEmail = oneCustomClearableEditText2;
        this.edtHouseNo = oneCustomClearableEditText3;
        this.edtPhoneNumber = oneCustomClearableEditText4;
        this.layoutDistrict = linearLayoutCompat;
        this.layoutPostcode = linearLayoutCompat2;
        this.layoutProvince = linearLayoutCompat3;
        this.layoutSubDistrict = linearLayoutCompat4;
        this.ppRbCustomLocation = oneRadioButton;
        this.ppRbLocationIdCard = oneRadioButton2;
        this.ppTvDistrict = oneFontTextView;
        this.ppTvPostCode = oneFontTextView2;
        this.ppTvProvince = oneFontTextView3;
        this.ppTvSubDistrict = oneFontTextView4;
        this.rdbGroupAddress = radioGroup;
        this.rootMailing = constraintLayout2;
        this.tvMailingTitle = oneFontTextView5;
    }

    @NonNull
    public static OneIncludeMailingAddressBinding bind(@NonNull View view) {
        int i = R.id.edtAddress;
        OneCustomClearableEditText oneCustomClearableEditText = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
        if (oneCustomClearableEditText != null) {
            i = R.id.edtEmail;
            OneCustomClearableEditText oneCustomClearableEditText2 = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
            if (oneCustomClearableEditText2 != null) {
                i = R.id.edtHouseNo;
                OneCustomClearableEditText oneCustomClearableEditText3 = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
                if (oneCustomClearableEditText3 != null) {
                    i = R.id.edtPhoneNumber;
                    OneCustomClearableEditText oneCustomClearableEditText4 = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
                    if (oneCustomClearableEditText4 != null) {
                        i = R.id.layout_district;
                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                        if (linearLayoutCompat != null) {
                            i = R.id.layout_postcode;
                            LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                            if (linearLayoutCompat2 != null) {
                                i = R.id.layout_province;
                                LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                if (linearLayoutCompat3 != null) {
                                    i = R.id.layout_sub_district;
                                    LinearLayoutCompat linearLayoutCompat4 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                    if (linearLayoutCompat4 != null) {
                                        i = R.id.pp_rb_custom_location;
                                        OneRadioButton oneRadioButton = (OneRadioButton) ViewBindings.findChildViewById(view, i);
                                        if (oneRadioButton != null) {
                                            i = R.id.pp_rb_location_id_card;
                                            OneRadioButton oneRadioButton2 = (OneRadioButton) ViewBindings.findChildViewById(view, i);
                                            if (oneRadioButton2 != null) {
                                                i = R.id.pp_tv_district;
                                                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (oneFontTextView != null) {
                                                    i = R.id.pp_tv_post_code;
                                                    OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (oneFontTextView2 != null) {
                                                        i = R.id.pp_tv_province;
                                                        OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (oneFontTextView3 != null) {
                                                            i = R.id.pp_tv_sub_district;
                                                            OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                            if (oneFontTextView4 != null) {
                                                                i = R.id.rdbGroupAddress;
                                                                RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, i);
                                                                if (radioGroup != null) {
                                                                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                                                    i = R.id.tv_mailing_title;
                                                                    OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (oneFontTextView5 != null) {
                                                                        return new OneIncludeMailingAddressBinding(constraintLayout, oneCustomClearableEditText, oneCustomClearableEditText2, oneCustomClearableEditText3, oneCustomClearableEditText4, linearLayoutCompat, linearLayoutCompat2, linearLayoutCompat3, linearLayoutCompat4, oneRadioButton, oneRadioButton2, oneFontTextView, oneFontTextView2, oneFontTextView3, oneFontTextView4, radioGroup, constraintLayout, oneFontTextView5);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneIncludeMailingAddressBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneIncludeMailingAddressBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_include_mailing_address, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84471a;
    }
}
