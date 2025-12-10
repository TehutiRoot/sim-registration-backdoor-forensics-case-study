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
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentRegisterOtpRequestBinding */
/* loaded from: classes7.dex */
public final class FragmentRegisterOtpRequestBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f84164a;
    @NonNull
    public final DtacFontButton registerBtnRequestOtp;
    @NonNull
    public final DtacClearableEditText registerEdtPhoneNumber;
    @NonNull
    public final DtacFontTextView registerTvHeader;
    @NonNull
    public final DtacFontTextView registerTvPhoneNumberErrorMessage;
    @NonNull
    public final LinearLayout rootLayout;

    public FragmentRegisterOtpRequestBinding(NestedScrollView nestedScrollView, DtacFontButton dtacFontButton, DtacClearableEditText dtacClearableEditText, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, LinearLayout linearLayout) {
        this.f84164a = nestedScrollView;
        this.registerBtnRequestOtp = dtacFontButton;
        this.registerEdtPhoneNumber = dtacClearableEditText;
        this.registerTvHeader = dtacFontTextView;
        this.registerTvPhoneNumberErrorMessage = dtacFontTextView2;
        this.rootLayout = linearLayout;
    }

    @NonNull
    public static FragmentRegisterOtpRequestBinding bind(@NonNull View view) {
        int i = R.id.register_btn_request_otp;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.register_edt_phone_number;
            DtacClearableEditText dtacClearableEditText = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
            if (dtacClearableEditText != null) {
                i = R.id.register_tv_header;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    i = R.id.register_tv_phone_number_error_message;
                    DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView2 != null) {
                        i = R.id.rootLayout;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout != null) {
                            return new FragmentRegisterOtpRequestBinding((NestedScrollView) view, dtacFontButton, dtacClearableEditText, dtacFontTextView, dtacFontTextView2, linearLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentRegisterOtpRequestBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentRegisterOtpRequestBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_register_otp_request, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f84164a;
    }
}
