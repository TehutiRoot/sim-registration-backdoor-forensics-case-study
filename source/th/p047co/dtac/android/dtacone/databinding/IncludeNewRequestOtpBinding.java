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
import th.p047co.dtac.android.dtacone.widget.view.DtacClearableEditText;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;

/* renamed from: th.co.dtac.android.dtacone.databinding.IncludeNewRequestOtpBinding */
/* loaded from: classes7.dex */
public final class IncludeNewRequestOtpBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84255a;
    @NonNull
    public final DtacFontButton mnpBtnRequestOtp;
    @NonNull
    public final DtacClearableEditText mnpEdtPhoneNumber;
    @NonNull
    public final LinearLayout rootLayout;

    public IncludeNewRequestOtpBinding(LinearLayout linearLayout, DtacFontButton dtacFontButton, DtacClearableEditText dtacClearableEditText, LinearLayout linearLayout2) {
        this.f84255a = linearLayout;
        this.mnpBtnRequestOtp = dtacFontButton;
        this.mnpEdtPhoneNumber = dtacClearableEditText;
        this.rootLayout = linearLayout2;
    }

    @NonNull
    public static IncludeNewRequestOtpBinding bind(@NonNull View view) {
        int i = R.id.mnp_btn_request_otp;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.mnp_edt_phone_number;
            DtacClearableEditText dtacClearableEditText = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
            if (dtacClearableEditText != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                return new IncludeNewRequestOtpBinding(linearLayout, dtacFontButton, dtacClearableEditText, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static IncludeNewRequestOtpBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IncludeNewRequestOtpBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.include_new_request_otp, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84255a;
    }
}
