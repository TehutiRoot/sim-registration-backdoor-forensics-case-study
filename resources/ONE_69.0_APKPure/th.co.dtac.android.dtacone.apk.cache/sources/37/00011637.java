package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneCustomClearableEditText;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneMnpInputPinCodeBinding */
/* loaded from: classes7.dex */
public final class FragmentOneMnpInputPinCodeBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f84070a;
    @NonNull
    public final OneFontButton nextButton;
    @NonNull
    public final OneCustomClearableEditText pinCodeEditText;
    @NonNull
    public final OneFontTextView pinCodeInfoTextView;
    @NonNull
    public final LinearLayout prefixPinCodeLayout;
    @NonNull
    public final LinearLayoutCompat rootView;

    public FragmentOneMnpInputPinCodeBinding(NestedScrollView nestedScrollView, OneFontButton oneFontButton, OneCustomClearableEditText oneCustomClearableEditText, OneFontTextView oneFontTextView, LinearLayout linearLayout, LinearLayoutCompat linearLayoutCompat) {
        this.f84070a = nestedScrollView;
        this.nextButton = oneFontButton;
        this.pinCodeEditText = oneCustomClearableEditText;
        this.pinCodeInfoTextView = oneFontTextView;
        this.prefixPinCodeLayout = linearLayout;
        this.rootView = linearLayoutCompat;
    }

    @NonNull
    public static FragmentOneMnpInputPinCodeBinding bind(@NonNull View view) {
        int i = R.id.nextButton;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.pinCodeEditText;
            OneCustomClearableEditText oneCustomClearableEditText = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
            if (oneCustomClearableEditText != null) {
                i = R.id.pinCodeInfoTextView;
                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView != null) {
                    i = R.id.prefixPinCodeLayout;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = R.id.rootView;
                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                        if (linearLayoutCompat != null) {
                            return new FragmentOneMnpInputPinCodeBinding((NestedScrollView) view, oneFontButton, oneCustomClearableEditText, oneFontTextView, linearLayout, linearLayoutCompat);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneMnpInputPinCodeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneMnpInputPinCodeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_mnp_input_pin_code, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f84070a;
    }
}