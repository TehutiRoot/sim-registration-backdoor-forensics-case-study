package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneCustomClearableEditText;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOnePre2PostInputMobileNumberBinding */
/* loaded from: classes7.dex */
public final class FragmentOnePre2PostInputMobileNumberBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84059a;
    @NonNull
    public final OneCustomClearableEditText phoneNumberEditText;
    @NonNull
    public final OneFontButton requestOTPButton;
    @NonNull
    public final LinearLayoutCompat requestOTPMainLayout;

    public FragmentOnePre2PostInputMobileNumberBinding(ConstraintLayout constraintLayout, OneCustomClearableEditText oneCustomClearableEditText, OneFontButton oneFontButton, LinearLayoutCompat linearLayoutCompat) {
        this.f84059a = constraintLayout;
        this.phoneNumberEditText = oneCustomClearableEditText;
        this.requestOTPButton = oneFontButton;
        this.requestOTPMainLayout = linearLayoutCompat;
    }

    @NonNull
    public static FragmentOnePre2PostInputMobileNumberBinding bind(@NonNull View view) {
        int i = R.id.phoneNumberEditText;
        OneCustomClearableEditText oneCustomClearableEditText = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
        if (oneCustomClearableEditText != null) {
            i = R.id.requestOTPButton;
            OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
            if (oneFontButton != null) {
                i = R.id.requestOTPMainLayout;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                if (linearLayoutCompat != null) {
                    return new FragmentOnePre2PostInputMobileNumberBinding((ConstraintLayout) view, oneCustomClearableEditText, oneFontButton, linearLayoutCompat);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOnePre2PostInputMobileNumberBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOnePre2PostInputMobileNumberBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_pre2_post_input_mobile_number, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84059a;
    }
}
