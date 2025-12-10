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
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacRadioButton;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZIncludeMailingAddressBinding */
/* loaded from: classes7.dex */
public final class ZIncludeMailingAddressBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84624a;
    @NonNull
    public final DtacClearableEditText edtEmail;
    @NonNull
    public final LinearLayout locationBox;
    @NonNull
    public final DtacFontButton mnpBtnConfirm;
    @NonNull
    public final DtacRadioButton mnpRbCustomLocation;
    @NonNull
    public final DtacRadioButton mnpRbLocationIdCard;
    @NonNull
    public final DtacClearableEditText mnpTvAddress;
    @NonNull
    public final DtacFontTextView mnpTvDistrict;
    @NonNull
    public final DtacFontTextView mnpTvPostCode;
    @NonNull
    public final DtacFontTextView mnpTvProvince;
    @NonNull
    public final DtacFontTextView mnpTvSubDistrict;
    @NonNull
    public final DtacRadioButton rdbEmail;
    @NonNull
    public final RadioGroup rdbGroupAddress;
    @NonNull
    public final RadioGroup rdbGroupInvoice;
    @NonNull
    public final DtacRadioButton rdbPaper;
    @NonNull
    public final DtacRadioButton rdbSMS;
    @NonNull
    public final LinearLayout root;
    @NonNull
    public final DtacFontTextView tvMailingTitle;

    public ZIncludeMailingAddressBinding(LinearLayout linearLayout, DtacClearableEditText dtacClearableEditText, LinearLayout linearLayout2, DtacFontButton dtacFontButton, DtacRadioButton dtacRadioButton, DtacRadioButton dtacRadioButton2, DtacClearableEditText dtacClearableEditText2, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacRadioButton dtacRadioButton3, RadioGroup radioGroup, RadioGroup radioGroup2, DtacRadioButton dtacRadioButton4, DtacRadioButton dtacRadioButton5, LinearLayout linearLayout3, DtacFontTextView dtacFontTextView5) {
        this.f84624a = linearLayout;
        this.edtEmail = dtacClearableEditText;
        this.locationBox = linearLayout2;
        this.mnpBtnConfirm = dtacFontButton;
        this.mnpRbCustomLocation = dtacRadioButton;
        this.mnpRbLocationIdCard = dtacRadioButton2;
        this.mnpTvAddress = dtacClearableEditText2;
        this.mnpTvDistrict = dtacFontTextView;
        this.mnpTvPostCode = dtacFontTextView2;
        this.mnpTvProvince = dtacFontTextView3;
        this.mnpTvSubDistrict = dtacFontTextView4;
        this.rdbEmail = dtacRadioButton3;
        this.rdbGroupAddress = radioGroup;
        this.rdbGroupInvoice = radioGroup2;
        this.rdbPaper = dtacRadioButton4;
        this.rdbSMS = dtacRadioButton5;
        this.root = linearLayout3;
        this.tvMailingTitle = dtacFontTextView5;
    }

    @NonNull
    public static ZIncludeMailingAddressBinding bind(@NonNull View view) {
        int i = R.id.edtEmail;
        DtacClearableEditText dtacClearableEditText = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
        if (dtacClearableEditText != null) {
            i = R.id.location_box;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = R.id.mnp_btn_confirm;
                DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
                if (dtacFontButton != null) {
                    i = R.id.mnp_rb_custom_location;
                    DtacRadioButton dtacRadioButton = (DtacRadioButton) ViewBindings.findChildViewById(view, i);
                    if (dtacRadioButton != null) {
                        i = R.id.mnp_rb_location_id_card;
                        DtacRadioButton dtacRadioButton2 = (DtacRadioButton) ViewBindings.findChildViewById(view, i);
                        if (dtacRadioButton2 != null) {
                            i = R.id.mnp_tv_address;
                            DtacClearableEditText dtacClearableEditText2 = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
                            if (dtacClearableEditText2 != null) {
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
                                                i = R.id.rdbEmail;
                                                DtacRadioButton dtacRadioButton3 = (DtacRadioButton) ViewBindings.findChildViewById(view, i);
                                                if (dtacRadioButton3 != null) {
                                                    i = R.id.rdbGroupAddress;
                                                    RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, i);
                                                    if (radioGroup != null) {
                                                        i = R.id.rdbGroupInvoice;
                                                        RadioGroup radioGroup2 = (RadioGroup) ViewBindings.findChildViewById(view, i);
                                                        if (radioGroup2 != null) {
                                                            i = R.id.rdbPaper;
                                                            DtacRadioButton dtacRadioButton4 = (DtacRadioButton) ViewBindings.findChildViewById(view, i);
                                                            if (dtacRadioButton4 != null) {
                                                                i = R.id.rdbSMS;
                                                                DtacRadioButton dtacRadioButton5 = (DtacRadioButton) ViewBindings.findChildViewById(view, i);
                                                                if (dtacRadioButton5 != null) {
                                                                    LinearLayout linearLayout2 = (LinearLayout) view;
                                                                    i = R.id.tv_mailing_title;
                                                                    DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (dtacFontTextView5 != null) {
                                                                        return new ZIncludeMailingAddressBinding(linearLayout2, dtacClearableEditText, linearLayout, dtacFontButton, dtacRadioButton, dtacRadioButton2, dtacClearableEditText2, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, dtacRadioButton3, radioGroup, radioGroup2, dtacRadioButton4, dtacRadioButton5, linearLayout2, dtacFontTextView5);
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
    public static ZIncludeMailingAddressBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZIncludeMailingAddressBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_include_mailing_address, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84624a;
    }
}
