package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacClearableEditText;
import th.p047co.dtac.android.dtacone.widget.view.DtacEditText;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentRegisterVerifyMsisdnBinding */
/* loaded from: classes7.dex */
public final class FragmentRegisterVerifyMsisdnBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f84167a;
    @NonNull
    public final DtacFontButton registerBtnRequestOtpAgain;
    @NonNull
    public final DtacEditText registerEdtMsisdn;
    @NonNull
    public final DtacClearableEditText registerEdtOtp;
    @NonNull
    public final DtacEditText registerEdtRtrCode;
    @NonNull
    public final LinearLayout rootLayout;

    public FragmentRegisterVerifyMsisdnBinding(NestedScrollView nestedScrollView, DtacFontButton dtacFontButton, DtacEditText dtacEditText, DtacClearableEditText dtacClearableEditText, DtacEditText dtacEditText2, LinearLayout linearLayout) {
        this.f84167a = nestedScrollView;
        this.registerBtnRequestOtpAgain = dtacFontButton;
        this.registerEdtMsisdn = dtacEditText;
        this.registerEdtOtp = dtacClearableEditText;
        this.registerEdtRtrCode = dtacEditText2;
        this.rootLayout = linearLayout;
    }

    @NonNull
    public static FragmentRegisterVerifyMsisdnBinding bind(@NonNull View view) {
        int i = R.id.register_btn_request_otp_again;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.register_edt_msisdn;
            DtacEditText dtacEditText = (DtacEditText) ViewBindings.findChildViewById(view, i);
            if (dtacEditText != null) {
                i = R.id.register_edt_otp;
                DtacClearableEditText dtacClearableEditText = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
                if (dtacClearableEditText != null) {
                    i = R.id.register_edt_rtr_code;
                    DtacEditText dtacEditText2 = (DtacEditText) ViewBindings.findChildViewById(view, i);
                    if (dtacEditText2 != null) {
                        i = R.id.rootLayout;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout != null) {
                            return new FragmentRegisterVerifyMsisdnBinding((NestedScrollView) view, dtacFontButton, dtacEditText, dtacClearableEditText, dtacEditText2, linearLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentRegisterVerifyMsisdnBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentRegisterVerifyMsisdnBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_register_verify_msisdn, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f84167a;
    }
}
