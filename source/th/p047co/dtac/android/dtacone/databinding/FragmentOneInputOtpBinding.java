package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutText;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextLayoutView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneInputOtpBinding */
/* loaded from: classes7.dex */
public final class FragmentOneInputOtpBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f83962a;
    @NonNull
    public final OneTextInputLayoutText edtVerifyOTP;
    @NonNull
    public final LinearLayoutCompat layoutInputInfo;
    @NonNull
    public final OneFontTextView requestOTP;
    @NonNull
    public final OneTextLayoutView tvPhoneNumber;
    @NonNull
    public final OneTextLayoutView tvRtrCode;

    public FragmentOneInputOtpBinding(FrameLayout frameLayout, OneTextInputLayoutText oneTextInputLayoutText, LinearLayoutCompat linearLayoutCompat, OneFontTextView oneFontTextView, OneTextLayoutView oneTextLayoutView, OneTextLayoutView oneTextLayoutView2) {
        this.f83962a = frameLayout;
        this.edtVerifyOTP = oneTextInputLayoutText;
        this.layoutInputInfo = linearLayoutCompat;
        this.requestOTP = oneFontTextView;
        this.tvPhoneNumber = oneTextLayoutView;
        this.tvRtrCode = oneTextLayoutView2;
    }

    @NonNull
    public static FragmentOneInputOtpBinding bind(@NonNull View view) {
        int i = R.id.edtVerifyOTP;
        OneTextInputLayoutText oneTextInputLayoutText = (OneTextInputLayoutText) ViewBindings.findChildViewById(view, i);
        if (oneTextInputLayoutText != null) {
            i = R.id.layoutInputInfo;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
            if (linearLayoutCompat != null) {
                i = R.id.requestOTP;
                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView != null) {
                    i = R.id.tvPhoneNumber;
                    OneTextLayoutView oneTextLayoutView = (OneTextLayoutView) ViewBindings.findChildViewById(view, i);
                    if (oneTextLayoutView != null) {
                        i = R.id.tvRtrCode;
                        OneTextLayoutView oneTextLayoutView2 = (OneTextLayoutView) ViewBindings.findChildViewById(view, i);
                        if (oneTextLayoutView2 != null) {
                            return new FragmentOneInputOtpBinding((FrameLayout) view, oneTextInputLayoutText, linearLayoutCompat, oneFontTextView, oneTextLayoutView, oneTextLayoutView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneInputOtpBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneInputOtpBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_input_otp, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f83962a;
    }
}
