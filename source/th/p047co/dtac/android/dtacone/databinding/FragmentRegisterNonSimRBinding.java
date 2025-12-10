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
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentRegisterNonSimRBinding */
/* loaded from: classes7.dex */
public final class FragmentRegisterNonSimRBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f84162a;
    @NonNull
    public final DtacFontTextView forgotPasswordTvPasswordLengthDescription;
    @NonNull
    public final DtacFontButton registerBtnRegister;
    @NonNull
    public final DtacFontButton registerBtnRequestNewOtp;
    @NonNull
    public final DtacClearableEditText registerEdtConfirmNewPassword;
    @NonNull
    public final DtacClearableEditText registerEdtNewPassword;
    @NonNull
    public final DtacEditText registerEdtSimr;
    @NonNull
    public final DtacClearableEditText registerEdtSimrOtp;
    @NonNull
    public final LinearLayout rootLayout;

    public FragmentRegisterNonSimRBinding(NestedScrollView nestedScrollView, DtacFontTextView dtacFontTextView, DtacFontButton dtacFontButton, DtacFontButton dtacFontButton2, DtacClearableEditText dtacClearableEditText, DtacClearableEditText dtacClearableEditText2, DtacEditText dtacEditText, DtacClearableEditText dtacClearableEditText3, LinearLayout linearLayout) {
        this.f84162a = nestedScrollView;
        this.forgotPasswordTvPasswordLengthDescription = dtacFontTextView;
        this.registerBtnRegister = dtacFontButton;
        this.registerBtnRequestNewOtp = dtacFontButton2;
        this.registerEdtConfirmNewPassword = dtacClearableEditText;
        this.registerEdtNewPassword = dtacClearableEditText2;
        this.registerEdtSimr = dtacEditText;
        this.registerEdtSimrOtp = dtacClearableEditText3;
        this.rootLayout = linearLayout;
    }

    @NonNull
    public static FragmentRegisterNonSimRBinding bind(@NonNull View view) {
        int i = R.id.forgot_password_tv_password_length_description;
        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
        if (dtacFontTextView != null) {
            i = R.id.register_btn_register;
            DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
            if (dtacFontButton != null) {
                i = R.id.register_btn_request_new_otp;
                DtacFontButton dtacFontButton2 = (DtacFontButton) ViewBindings.findChildViewById(view, i);
                if (dtacFontButton2 != null) {
                    i = R.id.register_edt_confirm_new_password;
                    DtacClearableEditText dtacClearableEditText = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
                    if (dtacClearableEditText != null) {
                        i = R.id.register_edt_new_password;
                        DtacClearableEditText dtacClearableEditText2 = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
                        if (dtacClearableEditText2 != null) {
                            i = R.id.register_edt_simr;
                            DtacEditText dtacEditText = (DtacEditText) ViewBindings.findChildViewById(view, i);
                            if (dtacEditText != null) {
                                i = R.id.register_edt_simr_otp;
                                DtacClearableEditText dtacClearableEditText3 = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
                                if (dtacClearableEditText3 != null) {
                                    i = R.id.rootLayout;
                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout != null) {
                                        return new FragmentRegisterNonSimRBinding((NestedScrollView) view, dtacFontTextView, dtacFontButton, dtacFontButton2, dtacClearableEditText, dtacClearableEditText2, dtacEditText, dtacClearableEditText3, linearLayout);
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
    public static FragmentRegisterNonSimRBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentRegisterNonSimRBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_register_non_sim_r, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f84162a;
    }
}
