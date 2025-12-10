package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacClearableEditText;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZIncludeVerifyOtpBinding */
/* loaded from: classes7.dex */
public final class ZIncludeVerifyOtpBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84767a;
    @NonNull
    public final CardView cardview;
    @NonNull
    public final DtacClearableEditText p2postEdtOtp;
    @NonNull
    public final DtacFontButton pre2postBtnResendOtp;
    @NonNull
    public final LinearLayout rootLayout;

    public ZIncludeVerifyOtpBinding(LinearLayout linearLayout, CardView cardView, DtacClearableEditText dtacClearableEditText, DtacFontButton dtacFontButton, LinearLayout linearLayout2) {
        this.f84767a = linearLayout;
        this.cardview = cardView;
        this.p2postEdtOtp = dtacClearableEditText;
        this.pre2postBtnResendOtp = dtacFontButton;
        this.rootLayout = linearLayout2;
    }

    @NonNull
    public static ZIncludeVerifyOtpBinding bind(@NonNull View view) {
        int i = R.id.cardview;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
        if (cardView != null) {
            i = R.id.p2post_edt_otp;
            DtacClearableEditText dtacClearableEditText = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
            if (dtacClearableEditText != null) {
                i = R.id.pre2post_btn_resend_otp;
                DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
                if (dtacFontButton != null) {
                    LinearLayout linearLayout = (LinearLayout) view;
                    return new ZIncludeVerifyOtpBinding(linearLayout, cardView, dtacClearableEditText, dtacFontButton, linearLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZIncludeVerifyOtpBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZIncludeVerifyOtpBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_include_verify_otp, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84767a;
    }
}