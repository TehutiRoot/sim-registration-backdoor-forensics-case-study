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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneOnlineActivationVerifyBinding */
/* loaded from: classes7.dex */
public final class FragmentOneOnlineActivationVerifyBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f83989a;
    @NonNull
    public final OneFontTextView btnReSendOTP;
    @NonNull
    public final OneTextInputLayoutText edtOtp;
    @NonNull
    public final LinearLayoutCompat layoutInputInfo;
    @NonNull
    public final OneTextLayoutView tvPhoneNumber;
    @NonNull
    public final OneTextLayoutView tvRtrCode;
    @NonNull
    public final View vLineSeparate;
    @NonNull
    public final View vLineSeparate2;

    public FragmentOneOnlineActivationVerifyBinding(FrameLayout frameLayout, OneFontTextView oneFontTextView, OneTextInputLayoutText oneTextInputLayoutText, LinearLayoutCompat linearLayoutCompat, OneTextLayoutView oneTextLayoutView, OneTextLayoutView oneTextLayoutView2, View view, View view2) {
        this.f83989a = frameLayout;
        this.btnReSendOTP = oneFontTextView;
        this.edtOtp = oneTextInputLayoutText;
        this.layoutInputInfo = linearLayoutCompat;
        this.tvPhoneNumber = oneTextLayoutView;
        this.tvRtrCode = oneTextLayoutView2;
        this.vLineSeparate = view;
        this.vLineSeparate2 = view2;
    }

    @NonNull
    public static FragmentOneOnlineActivationVerifyBinding bind(@NonNull View view) {
        View findChildViewById;
        View findChildViewById2;
        int i = R.id.btnReSendOTP;
        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
        if (oneFontTextView != null) {
            i = R.id.edtOtp;
            OneTextInputLayoutText oneTextInputLayoutText = (OneTextInputLayoutText) ViewBindings.findChildViewById(view, i);
            if (oneTextInputLayoutText != null) {
                i = R.id.layoutInputInfo;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                if (linearLayoutCompat != null) {
                    i = R.id.tvPhoneNumber;
                    OneTextLayoutView oneTextLayoutView = (OneTextLayoutView) ViewBindings.findChildViewById(view, i);
                    if (oneTextLayoutView != null) {
                        i = R.id.tvRtrCode;
                        OneTextLayoutView oneTextLayoutView2 = (OneTextLayoutView) ViewBindings.findChildViewById(view, i);
                        if (oneTextLayoutView2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.vLineSeparate))) != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.vLineSeparate2))) != null) {
                            return new FragmentOneOnlineActivationVerifyBinding((FrameLayout) view, oneFontTextView, oneTextInputLayoutText, linearLayoutCompat, oneTextLayoutView, oneTextLayoutView2, findChildViewById, findChildViewById2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneOnlineActivationVerifyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneOnlineActivationVerifyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_online_activation_verify, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f83989a;
    }
}
