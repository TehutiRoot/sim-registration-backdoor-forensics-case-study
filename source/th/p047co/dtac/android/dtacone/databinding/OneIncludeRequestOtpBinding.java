package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneClearableEditText;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneIncludeRequestOtpBinding */
/* loaded from: classes7.dex */
public final class OneIncludeRequestOtpBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayoutCompat f84484a;
    @NonNull
    public final OneFontButton btnRequestOtp;
    @NonNull
    public final OneClearableEditText edtPhoneNumber;
    @NonNull
    public final LinearLayoutCompat rootLayout;

    public OneIncludeRequestOtpBinding(LinearLayoutCompat linearLayoutCompat, OneFontButton oneFontButton, OneClearableEditText oneClearableEditText, LinearLayoutCompat linearLayoutCompat2) {
        this.f84484a = linearLayoutCompat;
        this.btnRequestOtp = oneFontButton;
        this.edtPhoneNumber = oneClearableEditText;
        this.rootLayout = linearLayoutCompat2;
    }

    @NonNull
    public static OneIncludeRequestOtpBinding bind(@NonNull View view) {
        int i = R.id.btn_request_otp;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.edt_phone_number;
            OneClearableEditText oneClearableEditText = (OneClearableEditText) ViewBindings.findChildViewById(view, i);
            if (oneClearableEditText != null) {
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
                return new OneIncludeRequestOtpBinding(linearLayoutCompat, oneFontButton, oneClearableEditText, linearLayoutCompat);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneIncludeRequestOtpBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneIncludeRequestOtpBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_include_request_otp, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayoutCompat getRoot() {
        return this.f84484a;
    }
}
