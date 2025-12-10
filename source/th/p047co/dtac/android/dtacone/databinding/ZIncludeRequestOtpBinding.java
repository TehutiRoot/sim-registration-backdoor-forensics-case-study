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

/* renamed from: th.co.dtac.android.dtacone.databinding.ZIncludeRequestOtpBinding */
/* loaded from: classes7.dex */
public final class ZIncludeRequestOtpBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84648a;
    @NonNull
    public final CardView cardview;
    @NonNull
    public final DtacFontButton mnpBtnRequestOtp;
    @NonNull
    public final DtacClearableEditText mnpEdtPhoneNumber;
    @NonNull
    public final LinearLayout rootLayout;

    public ZIncludeRequestOtpBinding(LinearLayout linearLayout, CardView cardView, DtacFontButton dtacFontButton, DtacClearableEditText dtacClearableEditText, LinearLayout linearLayout2) {
        this.f84648a = linearLayout;
        this.cardview = cardView;
        this.mnpBtnRequestOtp = dtacFontButton;
        this.mnpEdtPhoneNumber = dtacClearableEditText;
        this.rootLayout = linearLayout2;
    }

    @NonNull
    public static ZIncludeRequestOtpBinding bind(@NonNull View view) {
        int i = R.id.cardview;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
        if (cardView != null) {
            i = R.id.mnp_btn_request_otp;
            DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
            if (dtacFontButton != null) {
                i = R.id.mnp_edt_phone_number;
                DtacClearableEditText dtacClearableEditText = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
                if (dtacClearableEditText != null) {
                    LinearLayout linearLayout = (LinearLayout) view;
                    return new ZIncludeRequestOtpBinding(linearLayout, cardView, dtacFontButton, dtacClearableEditText, linearLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZIncludeRequestOtpBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZIncludeRequestOtpBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_include_request_otp, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84648a;
    }
}
