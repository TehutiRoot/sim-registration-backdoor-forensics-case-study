package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutText;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextLayoutView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneInputChangePasswordBinding */
/* loaded from: classes7.dex */
public final class FragmentOneInputChangePasswordBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f83959a;
    @NonNull
    public final OneFontTextView btnConfirmPassword;
    @NonNull
    public final OneTextInputLayoutText edtConfirmNewPassword;
    @NonNull
    public final OneTextInputLayoutText edtNewPassword;
    @NonNull
    public final OneTextInputLayoutText edtOldPassword;
    @NonNull
    public final LinearLayoutCompat layoutInputForgotPassword;
    @NonNull
    public final RelativeLayout rootLayout;
    @NonNull
    public final OneTextLayoutView tvPhoneNumber;

    public FragmentOneInputChangePasswordBinding(FrameLayout frameLayout, OneFontTextView oneFontTextView, OneTextInputLayoutText oneTextInputLayoutText, OneTextInputLayoutText oneTextInputLayoutText2, OneTextInputLayoutText oneTextInputLayoutText3, LinearLayoutCompat linearLayoutCompat, RelativeLayout relativeLayout, OneTextLayoutView oneTextLayoutView) {
        this.f83959a = frameLayout;
        this.btnConfirmPassword = oneFontTextView;
        this.edtConfirmNewPassword = oneTextInputLayoutText;
        this.edtNewPassword = oneTextInputLayoutText2;
        this.edtOldPassword = oneTextInputLayoutText3;
        this.layoutInputForgotPassword = linearLayoutCompat;
        this.rootLayout = relativeLayout;
        this.tvPhoneNumber = oneTextLayoutView;
    }

    @NonNull
    public static FragmentOneInputChangePasswordBinding bind(@NonNull View view) {
        int i = R.id.btnConfirmPassword;
        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
        if (oneFontTextView != null) {
            i = R.id.edtConfirmNewPassword;
            OneTextInputLayoutText oneTextInputLayoutText = (OneTextInputLayoutText) ViewBindings.findChildViewById(view, i);
            if (oneTextInputLayoutText != null) {
                i = R.id.edtNewPassword;
                OneTextInputLayoutText oneTextInputLayoutText2 = (OneTextInputLayoutText) ViewBindings.findChildViewById(view, i);
                if (oneTextInputLayoutText2 != null) {
                    i = R.id.edtOldPassword;
                    OneTextInputLayoutText oneTextInputLayoutText3 = (OneTextInputLayoutText) ViewBindings.findChildViewById(view, i);
                    if (oneTextInputLayoutText3 != null) {
                        i = R.id.layoutInputForgotPassword;
                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                        if (linearLayoutCompat != null) {
                            i = R.id.rootLayout;
                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                            if (relativeLayout != null) {
                                i = R.id.tvPhoneNumber;
                                OneTextLayoutView oneTextLayoutView = (OneTextLayoutView) ViewBindings.findChildViewById(view, i);
                                if (oneTextLayoutView != null) {
                                    return new FragmentOneInputChangePasswordBinding((FrameLayout) view, oneFontTextView, oneTextInputLayoutText, oneTextInputLayoutText2, oneTextInputLayoutText3, linearLayoutCompat, relativeLayout, oneTextLayoutView);
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
    public static FragmentOneInputChangePasswordBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneInputChangePasswordBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_input_change_password, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f83959a;
    }
}
