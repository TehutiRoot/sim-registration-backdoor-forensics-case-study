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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentRegisterOtpVerifyBinding */
/* loaded from: classes7.dex */
public final class FragmentRegisterOtpVerifyBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f84269a;
    @NonNull
    public final DtacFontButton registerBtnRequestNewOtp;
    @NonNull
    public final DtacClearableEditText registerEdtOtp;
    @NonNull
    public final DtacEditText registerTvPhoneNumber;
    @NonNull
    public final LinearLayout rootLayout;

    public FragmentRegisterOtpVerifyBinding(NestedScrollView nestedScrollView, DtacFontButton dtacFontButton, DtacClearableEditText dtacClearableEditText, DtacEditText dtacEditText, LinearLayout linearLayout) {
        this.f84269a = nestedScrollView;
        this.registerBtnRequestNewOtp = dtacFontButton;
        this.registerEdtOtp = dtacClearableEditText;
        this.registerTvPhoneNumber = dtacEditText;
        this.rootLayout = linearLayout;
    }

    @NonNull
    public static FragmentRegisterOtpVerifyBinding bind(@NonNull View view) {
        int i = R.id.register_btn_request_new_otp;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.register_edt_otp;
            DtacClearableEditText dtacClearableEditText = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
            if (dtacClearableEditText != null) {
                i = R.id.register_tv_phone_number;
                DtacEditText dtacEditText = (DtacEditText) ViewBindings.findChildViewById(view, i);
                if (dtacEditText != null) {
                    i = R.id.rootLayout;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        return new FragmentRegisterOtpVerifyBinding((NestedScrollView) view, dtacFontButton, dtacClearableEditText, dtacEditText, linearLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentRegisterOtpVerifyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentRegisterOtpVerifyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_register_otp_verify, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f84269a;
    }
}