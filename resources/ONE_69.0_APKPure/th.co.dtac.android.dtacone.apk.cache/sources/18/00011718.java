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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentSettingChangePasswordBinding */
/* loaded from: classes7.dex */
public final class FragmentSettingChangePasswordBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f84295a;
    @NonNull
    public final DtacFontButton changePasswordBtnConfirmNewPassword;
    @NonNull
    public final DtacClearableEditText changePasswordEdtConfirmNewPassword;
    @NonNull
    public final DtacClearableEditText changePasswordEdtNewPassword;
    @NonNull
    public final DtacClearableEditText changePasswordEdtPhoneNumber;
    @NonNull
    public final DtacClearableEditText changePasswordOldPassword;
    @NonNull
    public final DtacFontTextView changePasswordTvPasswordLengthDescription;
    @NonNull
    public final LinearLayout rootLayout;

    public FragmentSettingChangePasswordBinding(NestedScrollView nestedScrollView, DtacFontButton dtacFontButton, DtacClearableEditText dtacClearableEditText, DtacClearableEditText dtacClearableEditText2, DtacClearableEditText dtacClearableEditText3, DtacClearableEditText dtacClearableEditText4, DtacFontTextView dtacFontTextView, LinearLayout linearLayout) {
        this.f84295a = nestedScrollView;
        this.changePasswordBtnConfirmNewPassword = dtacFontButton;
        this.changePasswordEdtConfirmNewPassword = dtacClearableEditText;
        this.changePasswordEdtNewPassword = dtacClearableEditText2;
        this.changePasswordEdtPhoneNumber = dtacClearableEditText3;
        this.changePasswordOldPassword = dtacClearableEditText4;
        this.changePasswordTvPasswordLengthDescription = dtacFontTextView;
        this.rootLayout = linearLayout;
    }

    @NonNull
    public static FragmentSettingChangePasswordBinding bind(@NonNull View view) {
        int i = R.id.change_password_btn_confirm_new_password;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.change_password_edt_confirm_new_password;
            DtacClearableEditText dtacClearableEditText = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
            if (dtacClearableEditText != null) {
                i = R.id.change_password_edt_new_password;
                DtacClearableEditText dtacClearableEditText2 = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
                if (dtacClearableEditText2 != null) {
                    i = R.id.change_password_edt_phone_number;
                    DtacClearableEditText dtacClearableEditText3 = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
                    if (dtacClearableEditText3 != null) {
                        i = R.id.change_password_old_password;
                        DtacClearableEditText dtacClearableEditText4 = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
                        if (dtacClearableEditText4 != null) {
                            i = R.id.change_password_tv_password_length_description;
                            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView != null) {
                                i = R.id.rootLayout;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout != null) {
                                    return new FragmentSettingChangePasswordBinding((NestedScrollView) view, dtacFontButton, dtacClearableEditText, dtacClearableEditText2, dtacClearableEditText3, dtacClearableEditText4, dtacFontTextView, linearLayout);
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
    public static FragmentSettingChangePasswordBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentSettingChangePasswordBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_setting_change_password, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f84295a;
    }
}