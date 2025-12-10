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
import th.p047co.dtac.android.dtacone.widget.view.DtacClearableEditText;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacPhoneNumberEditText;
import th.p047co.dtac.android.dtacone.widget.view.DtacRadioButton;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZIncludeMailingAddressV2Binding */
/* loaded from: classes7.dex */
public final class ZIncludeMailingAddressV2Binding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84625a;
    @NonNull
    public final DtacClearableEditText edtAddress;
    @NonNull
    public final DtacClearableEditText edtEmail;
    @NonNull
    public final DtacPhoneNumberEditText edtPhoneNumber;
    @NonNull
    public final DtacRadioButton mnpRbCustomLocation;
    @NonNull
    public final DtacRadioButton mnpRbLocationIdCard;
    @NonNull
    public final DtacFontTextView mnpTvDistrict;
    @NonNull
    public final DtacFontTextView mnpTvPostCode;
    @NonNull
    public final DtacFontTextView mnpTvProvince;
    @NonNull
    public final DtacFontTextView mnpTvSubDistrict;
    @NonNull
    public final RadioGroup rdbGroupAddress;
    @NonNull
    public final LinearLayout root;
    @NonNull
    public final DtacFontTextView tvMailingTitle;

    public ZIncludeMailingAddressV2Binding(LinearLayout linearLayout, DtacClearableEditText dtacClearableEditText, DtacClearableEditText dtacClearableEditText2, DtacPhoneNumberEditText dtacPhoneNumberEditText, DtacRadioButton dtacRadioButton, DtacRadioButton dtacRadioButton2, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, RadioGroup radioGroup, LinearLayout linearLayout2, DtacFontTextView dtacFontTextView5) {
        this.f84625a = linearLayout;
        this.edtAddress = dtacClearableEditText;
        this.edtEmail = dtacClearableEditText2;
        this.edtPhoneNumber = dtacPhoneNumberEditText;
        this.mnpRbCustomLocation = dtacRadioButton;
        this.mnpRbLocationIdCard = dtacRadioButton2;
        this.mnpTvDistrict = dtacFontTextView;
        this.mnpTvPostCode = dtacFontTextView2;
        this.mnpTvProvince = dtacFontTextView3;
        this.mnpTvSubDistrict = dtacFontTextView4;
        this.rdbGroupAddress = radioGroup;
        this.root = linearLayout2;
        this.tvMailingTitle = dtacFontTextView5;
    }

    @NonNull
    public static ZIncludeMailingAddressV2Binding bind(@NonNull View view) {
        int i = R.id.edtAddress;
        DtacClearableEditText dtacClearableEditText = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
        if (dtacClearableEditText != null) {
            i = R.id.edtEmail;
            DtacClearableEditText dtacClearableEditText2 = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
            if (dtacClearableEditText2 != null) {
                i = R.id.edtPhoneNumber;
                DtacPhoneNumberEditText dtacPhoneNumberEditText = (DtacPhoneNumberEditText) ViewBindings.findChildViewById(view, i);
                if (dtacPhoneNumberEditText != null) {
                    i = R.id.mnp_rb_custom_location;
                    DtacRadioButton dtacRadioButton = (DtacRadioButton) ViewBindings.findChildViewById(view, i);
                    if (dtacRadioButton != null) {
                        i = R.id.mnp_rb_location_id_card;
                        DtacRadioButton dtacRadioButton2 = (DtacRadioButton) ViewBindings.findChildViewById(view, i);
                        if (dtacRadioButton2 != null) {
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
                                            i = R.id.rdbGroupAddress;
                                            RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, i);
                                            if (radioGroup != null) {
                                                LinearLayout linearLayout = (LinearLayout) view;
                                                i = R.id.tv_mailing_title;
                                                DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (dtacFontTextView5 != null) {
                                                    return new ZIncludeMailingAddressV2Binding(linearLayout, dtacClearableEditText, dtacClearableEditText2, dtacPhoneNumberEditText, dtacRadioButton, dtacRadioButton2, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, radioGroup, linearLayout, dtacFontTextView5);
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
    public static ZIncludeMailingAddressV2Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZIncludeMailingAddressV2Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_include_mailing_address_v2, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84625a;
    }
}
