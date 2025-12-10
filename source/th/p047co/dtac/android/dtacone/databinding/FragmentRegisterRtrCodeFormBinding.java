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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentRegisterRtrCodeFormBinding */
/* loaded from: classes7.dex */
public final class FragmentRegisterRtrCodeFormBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f84166a;
    @NonNull
    public final DtacFontButton registerBtnRequestOtp;
    @NonNull
    public final DtacClearableEditText registerEdtMsisdn;
    @NonNull
    public final DtacClearableEditText registerEdtRtrCode;
    @NonNull
    public final LinearLayout rootLayout;

    public FragmentRegisterRtrCodeFormBinding(NestedScrollView nestedScrollView, DtacFontButton dtacFontButton, DtacClearableEditText dtacClearableEditText, DtacClearableEditText dtacClearableEditText2, LinearLayout linearLayout) {
        this.f84166a = nestedScrollView;
        this.registerBtnRequestOtp = dtacFontButton;
        this.registerEdtMsisdn = dtacClearableEditText;
        this.registerEdtRtrCode = dtacClearableEditText2;
        this.rootLayout = linearLayout;
    }

    @NonNull
    public static FragmentRegisterRtrCodeFormBinding bind(@NonNull View view) {
        int i = R.id.register_btn_request_otp;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.register_edt_msisdn;
            DtacClearableEditText dtacClearableEditText = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
            if (dtacClearableEditText != null) {
                i = R.id.register_edt_rtr_code;
                DtacClearableEditText dtacClearableEditText2 = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
                if (dtacClearableEditText2 != null) {
                    i = R.id.rootLayout;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        return new FragmentRegisterRtrCodeFormBinding((NestedScrollView) view, dtacFontButton, dtacClearableEditText, dtacClearableEditText2, linearLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentRegisterRtrCodeFormBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentRegisterRtrCodeFormBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_register_rtr_code_form, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f84166a;
    }
}
