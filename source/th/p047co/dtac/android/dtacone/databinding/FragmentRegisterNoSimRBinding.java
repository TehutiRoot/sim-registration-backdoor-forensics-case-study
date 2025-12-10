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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentRegisterNoSimRBinding */
/* loaded from: classes7.dex */
public final class FragmentRegisterNoSimRBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f84161a;
    @NonNull
    public final DtacFontButton registerBtnRegister;
    @NonNull
    public final DtacClearableEditText registerEdtConfirmPassword;
    @NonNull
    public final DtacClearableEditText registerEdtIdCard5Digit;
    @NonNull
    public final DtacEditText registerEdtMsisdn;
    @NonNull
    public final DtacClearableEditText registerEdtPassword;
    @NonNull
    public final DtacEditText registerEdtRtrCode;
    @NonNull
    public final LinearLayout rootLayout;

    public FragmentRegisterNoSimRBinding(NestedScrollView nestedScrollView, DtacFontButton dtacFontButton, DtacClearableEditText dtacClearableEditText, DtacClearableEditText dtacClearableEditText2, DtacEditText dtacEditText, DtacClearableEditText dtacClearableEditText3, DtacEditText dtacEditText2, LinearLayout linearLayout) {
        this.f84161a = nestedScrollView;
        this.registerBtnRegister = dtacFontButton;
        this.registerEdtConfirmPassword = dtacClearableEditText;
        this.registerEdtIdCard5Digit = dtacClearableEditText2;
        this.registerEdtMsisdn = dtacEditText;
        this.registerEdtPassword = dtacClearableEditText3;
        this.registerEdtRtrCode = dtacEditText2;
        this.rootLayout = linearLayout;
    }

    @NonNull
    public static FragmentRegisterNoSimRBinding bind(@NonNull View view) {
        int i = R.id.register_btn_register;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.register_edt_confirm_password;
            DtacClearableEditText dtacClearableEditText = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
            if (dtacClearableEditText != null) {
                i = R.id.register_edt_id_card_5_digit;
                DtacClearableEditText dtacClearableEditText2 = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
                if (dtacClearableEditText2 != null) {
                    i = R.id.register_edt_msisdn;
                    DtacEditText dtacEditText = (DtacEditText) ViewBindings.findChildViewById(view, i);
                    if (dtacEditText != null) {
                        i = R.id.register_edt_password;
                        DtacClearableEditText dtacClearableEditText3 = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
                        if (dtacClearableEditText3 != null) {
                            i = R.id.register_edt_rtr_code;
                            DtacEditText dtacEditText2 = (DtacEditText) ViewBindings.findChildViewById(view, i);
                            if (dtacEditText2 != null) {
                                i = R.id.rootLayout;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout != null) {
                                    return new FragmentRegisterNoSimRBinding((NestedScrollView) view, dtacFontButton, dtacClearableEditText, dtacClearableEditText2, dtacEditText, dtacClearableEditText3, dtacEditText2, linearLayout);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentRegisterNoSimRBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentRegisterNoSimRBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_register_no_sim_r, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f84161a;
    }
}
