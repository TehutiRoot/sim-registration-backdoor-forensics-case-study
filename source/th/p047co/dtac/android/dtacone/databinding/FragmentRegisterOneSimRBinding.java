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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentRegisterOneSimRBinding */
/* loaded from: classes7.dex */
public final class FragmentRegisterOneSimRBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f84163a;
    @NonNull
    public final DtacFontButton registerBtnRegister;
    @NonNull
    public final DtacFontButton registerBtnRequestOtpAgain;
    @NonNull
    public final DtacClearableEditText registerEdtConfirmPassword;
    @NonNull
    public final DtacEditText registerEdtMsisdn;
    @NonNull
    public final DtacClearableEditText registerEdtOtp;
    @NonNull
    public final DtacClearableEditText registerEdtPassword;
    @NonNull
    public final DtacEditText registerEdtRtrCode;
    @NonNull
    public final DtacEditText registerEdtSimR;
    @NonNull
    public final LinearLayout rootLayout;

    public FragmentRegisterOneSimRBinding(NestedScrollView nestedScrollView, DtacFontButton dtacFontButton, DtacFontButton dtacFontButton2, DtacClearableEditText dtacClearableEditText, DtacEditText dtacEditText, DtacClearableEditText dtacClearableEditText2, DtacClearableEditText dtacClearableEditText3, DtacEditText dtacEditText2, DtacEditText dtacEditText3, LinearLayout linearLayout) {
        this.f84163a = nestedScrollView;
        this.registerBtnRegister = dtacFontButton;
        this.registerBtnRequestOtpAgain = dtacFontButton2;
        this.registerEdtConfirmPassword = dtacClearableEditText;
        this.registerEdtMsisdn = dtacEditText;
        this.registerEdtOtp = dtacClearableEditText2;
        this.registerEdtPassword = dtacClearableEditText3;
        this.registerEdtRtrCode = dtacEditText2;
        this.registerEdtSimR = dtacEditText3;
        this.rootLayout = linearLayout;
    }

    @NonNull
    public static FragmentRegisterOneSimRBinding bind(@NonNull View view) {
        int i = R.id.register_btn_register;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.register_btn_request_otp_again;
            DtacFontButton dtacFontButton2 = (DtacFontButton) ViewBindings.findChildViewById(view, i);
            if (dtacFontButton2 != null) {
                i = R.id.register_edt_confirm_password;
                DtacClearableEditText dtacClearableEditText = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
                if (dtacClearableEditText != null) {
                    i = R.id.register_edt_msisdn;
                    DtacEditText dtacEditText = (DtacEditText) ViewBindings.findChildViewById(view, i);
                    if (dtacEditText != null) {
                        i = R.id.register_edt_otp;
                        DtacClearableEditText dtacClearableEditText2 = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
                        if (dtacClearableEditText2 != null) {
                            i = R.id.register_edt_password;
                            DtacClearableEditText dtacClearableEditText3 = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
                            if (dtacClearableEditText3 != null) {
                                i = R.id.register_edt_rtr_code;
                                DtacEditText dtacEditText2 = (DtacEditText) ViewBindings.findChildViewById(view, i);
                                if (dtacEditText2 != null) {
                                    i = R.id.register_edt_sim_r;
                                    DtacEditText dtacEditText3 = (DtacEditText) ViewBindings.findChildViewById(view, i);
                                    if (dtacEditText3 != null) {
                                        i = R.id.rootLayout;
                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                        if (linearLayout != null) {
                                            return new FragmentRegisterOneSimRBinding((NestedScrollView) view, dtacFontButton, dtacFontButton2, dtacClearableEditText, dtacEditText, dtacClearableEditText2, dtacClearableEditText3, dtacEditText2, dtacEditText3, linearLayout);
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
    public static FragmentRegisterOneSimRBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentRegisterOneSimRBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_register_one_sim_r, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f84163a;
    }
}
