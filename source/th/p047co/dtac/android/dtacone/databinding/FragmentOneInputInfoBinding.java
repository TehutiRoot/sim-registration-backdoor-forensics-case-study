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
import th.p047co.dtac.android.dtacone.app_one.widget.OneButtonRed;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutPhone;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutText;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneInputInfoBinding */
/* loaded from: classes7.dex */
public final class FragmentOneInputInfoBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f83961a;
    @NonNull
    public final OneButtonRed btnRequestOTP;
    @NonNull
    public final OneTextInputLayoutPhone edtPhoneNumber;
    @NonNull
    public final OneTextInputLayoutText edtRtrCode;
    @NonNull
    public final LinearLayoutCompat layoutInputInfo;
    @NonNull
    public final View vLineSeparate;

    public FragmentOneInputInfoBinding(FrameLayout frameLayout, OneButtonRed oneButtonRed, OneTextInputLayoutPhone oneTextInputLayoutPhone, OneTextInputLayoutText oneTextInputLayoutText, LinearLayoutCompat linearLayoutCompat, View view) {
        this.f83961a = frameLayout;
        this.btnRequestOTP = oneButtonRed;
        this.edtPhoneNumber = oneTextInputLayoutPhone;
        this.edtRtrCode = oneTextInputLayoutText;
        this.layoutInputInfo = linearLayoutCompat;
        this.vLineSeparate = view;
    }

    @NonNull
    public static FragmentOneInputInfoBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.btnRequestOTP;
        OneButtonRed oneButtonRed = (OneButtonRed) ViewBindings.findChildViewById(view, i);
        if (oneButtonRed != null) {
            i = R.id.edtPhoneNumber;
            OneTextInputLayoutPhone oneTextInputLayoutPhone = (OneTextInputLayoutPhone) ViewBindings.findChildViewById(view, i);
            if (oneTextInputLayoutPhone != null) {
                i = R.id.edtRtrCode;
                OneTextInputLayoutText oneTextInputLayoutText = (OneTextInputLayoutText) ViewBindings.findChildViewById(view, i);
                if (oneTextInputLayoutText != null) {
                    i = R.id.layoutInputInfo;
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                    if (linearLayoutCompat != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.vLineSeparate))) != null) {
                        return new FragmentOneInputInfoBinding((FrameLayout) view, oneButtonRed, oneTextInputLayoutPhone, oneTextInputLayoutText, linearLayoutCompat, findChildViewById);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneInputInfoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneInputInfoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_input_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f83961a;
    }
}
