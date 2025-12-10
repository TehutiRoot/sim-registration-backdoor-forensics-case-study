package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneCustomClearableEditText;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneChangeOwnerInputMobileNumberBinding */
/* loaded from: classes7.dex */
public final class FragmentOneChangeOwnerInputMobileNumberBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f84005a;
    @NonNull
    public final OneFontButton btnRequestOtp;
    @NonNull
    public final OneCustomClearableEditText edtPhoneNumber;
    @NonNull
    public final LinearLayoutCompat rootView;

    public FragmentOneChangeOwnerInputMobileNumberBinding(NestedScrollView nestedScrollView, OneFontButton oneFontButton, OneCustomClearableEditText oneCustomClearableEditText, LinearLayoutCompat linearLayoutCompat) {
        this.f84005a = nestedScrollView;
        this.btnRequestOtp = oneFontButton;
        this.edtPhoneNumber = oneCustomClearableEditText;
        this.rootView = linearLayoutCompat;
    }

    @NonNull
    public static FragmentOneChangeOwnerInputMobileNumberBinding bind(@NonNull View view) {
        int i = R.id.btn_request_otp;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.edt_phone_number;
            OneCustomClearableEditText oneCustomClearableEditText = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
            if (oneCustomClearableEditText != null) {
                i = R.id.rootView;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                if (linearLayoutCompat != null) {
                    return new FragmentOneChangeOwnerInputMobileNumberBinding((NestedScrollView) view, oneFontButton, oneCustomClearableEditText, linearLayoutCompat);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneChangeOwnerInputMobileNumberBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneChangeOwnerInputMobileNumberBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_change_owner_input_mobile_number, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f84005a;
    }
}