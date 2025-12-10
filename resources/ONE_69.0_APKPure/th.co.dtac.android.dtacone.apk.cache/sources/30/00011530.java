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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentDolVerifyActivatedBinding */
/* loaded from: classes7.dex */
public final class FragmentDolVerifyActivatedBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f83806a;
    @NonNull
    public final DtacFontButton activatedBtnSubmit;
    @NonNull
    public final DtacEditText activatedEdtMsisdn;
    @NonNull
    public final DtacClearableEditText activatedEdtOtp;
    @NonNull
    public final DtacEditText activatedEdtRtrCode;
    @NonNull
    public final DtacFontButton btnReSendOTP;
    @NonNull
    public final LinearLayout rootLayout;

    public FragmentDolVerifyActivatedBinding(NestedScrollView nestedScrollView, DtacFontButton dtacFontButton, DtacEditText dtacEditText, DtacClearableEditText dtacClearableEditText, DtacEditText dtacEditText2, DtacFontButton dtacFontButton2, LinearLayout linearLayout) {
        this.f83806a = nestedScrollView;
        this.activatedBtnSubmit = dtacFontButton;
        this.activatedEdtMsisdn = dtacEditText;
        this.activatedEdtOtp = dtacClearableEditText;
        this.activatedEdtRtrCode = dtacEditText2;
        this.btnReSendOTP = dtacFontButton2;
        this.rootLayout = linearLayout;
    }

    @NonNull
    public static FragmentDolVerifyActivatedBinding bind(@NonNull View view) {
        int i = R.id.activated_btn_submit;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.activated_edt_msisdn;
            DtacEditText dtacEditText = (DtacEditText) ViewBindings.findChildViewById(view, i);
            if (dtacEditText != null) {
                i = R.id.activated_edt_otp;
                DtacClearableEditText dtacClearableEditText = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
                if (dtacClearableEditText != null) {
                    i = R.id.activated_edt_rtr_code;
                    DtacEditText dtacEditText2 = (DtacEditText) ViewBindings.findChildViewById(view, i);
                    if (dtacEditText2 != null) {
                        i = R.id.btnReSendOTP;
                        DtacFontButton dtacFontButton2 = (DtacFontButton) ViewBindings.findChildViewById(view, i);
                        if (dtacFontButton2 != null) {
                            i = R.id.rootLayout;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout != null) {
                                return new FragmentDolVerifyActivatedBinding((NestedScrollView) view, dtacFontButton, dtacEditText, dtacClearableEditText, dtacEditText2, dtacFontButton2, linearLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentDolVerifyActivatedBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentDolVerifyActivatedBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_dol_verify_activated, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f83806a;
    }
}