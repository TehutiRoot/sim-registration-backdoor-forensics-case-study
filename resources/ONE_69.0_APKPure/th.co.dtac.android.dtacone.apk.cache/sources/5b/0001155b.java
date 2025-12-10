package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacClearableEditText;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentForceChangePasswordVerifyOtpBinding */
/* loaded from: classes7.dex */
public final class FragmentForceChangePasswordVerifyOtpBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f83849a;
    @NonNull
    public final DtacFontButton btnResendOtp;
    @NonNull
    public final DtacClearableEditText edtOtp;
    @NonNull
    public final DtacClearableEditText edtPhoneNumber;
    @NonNull
    public final DtacClearableEditText edtRtrCode;

    public FragmentForceChangePasswordVerifyOtpBinding(NestedScrollView nestedScrollView, DtacFontButton dtacFontButton, DtacClearableEditText dtacClearableEditText, DtacClearableEditText dtacClearableEditText2, DtacClearableEditText dtacClearableEditText3) {
        this.f83849a = nestedScrollView;
        this.btnResendOtp = dtacFontButton;
        this.edtOtp = dtacClearableEditText;
        this.edtPhoneNumber = dtacClearableEditText2;
        this.edtRtrCode = dtacClearableEditText3;
    }

    @NonNull
    public static FragmentForceChangePasswordVerifyOtpBinding bind(@NonNull View view) {
        int i = R.id.btnResendOtp;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.edtOtp;
            DtacClearableEditText dtacClearableEditText = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
            if (dtacClearableEditText != null) {
                i = R.id.edtPhoneNumber;
                DtacClearableEditText dtacClearableEditText2 = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
                if (dtacClearableEditText2 != null) {
                    i = R.id.edtRtrCode;
                    DtacClearableEditText dtacClearableEditText3 = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
                    if (dtacClearableEditText3 != null) {
                        return new FragmentForceChangePasswordVerifyOtpBinding((NestedScrollView) view, dtacFontButton, dtacClearableEditText, dtacClearableEditText2, dtacClearableEditText3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentForceChangePasswordVerifyOtpBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentForceChangePasswordVerifyOtpBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_force_change_password_verify_otp, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f83849a;
    }
}