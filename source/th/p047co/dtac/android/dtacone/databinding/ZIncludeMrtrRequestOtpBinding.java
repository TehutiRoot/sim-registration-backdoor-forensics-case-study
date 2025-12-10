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

/* renamed from: th.co.dtac.android.dtacone.databinding.ZIncludeMrtrRequestOtpBinding */
/* loaded from: classes7.dex */
public final class ZIncludeMrtrRequestOtpBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84638a;
    @NonNull
    public final DtacFontButton btnRequestOtp;
    @NonNull
    public final DtacClearableEditText edtPhoneNumber;
    @NonNull
    public final LinearLayout rootLayout;
    @NonNull
    public final LinearLayout rootView;

    public ZIncludeMrtrRequestOtpBinding(LinearLayout linearLayout, DtacFontButton dtacFontButton, DtacClearableEditText dtacClearableEditText, LinearLayout linearLayout2, LinearLayout linearLayout3) {
        this.f84638a = linearLayout;
        this.btnRequestOtp = dtacFontButton;
        this.edtPhoneNumber = dtacClearableEditText;
        this.rootLayout = linearLayout2;
        this.rootView = linearLayout3;
    }

    @NonNull
    public static ZIncludeMrtrRequestOtpBinding bind(@NonNull View view) {
        int i = R.id.btn_request_otp;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.edt_phone_number;
            DtacClearableEditText dtacClearableEditText = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
            if (dtacClearableEditText != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                i = R.id.rootView;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout2 != null) {
                    return new ZIncludeMrtrRequestOtpBinding(linearLayout, dtacFontButton, dtacClearableEditText, linearLayout, linearLayout2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZIncludeMrtrRequestOtpBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZIncludeMrtrRequestOtpBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_include_mrtr_request_otp, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84638a;
    }
}
