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
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOnePostpaidInputNumberBinding */
/* loaded from: classes7.dex */
public final class FragmentOnePostpaidInputNumberBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f84132a;
    @NonNull
    public final OneFontButton inputNumberNextButton;
    @NonNull
    public final OneFontTextView inputNumberTextView;
    @NonNull
    public final OneCustomClearableEditText inputPhoneEditText;
    @NonNull
    public final LinearLayoutCompat rootView;

    public FragmentOnePostpaidInputNumberBinding(NestedScrollView nestedScrollView, OneFontButton oneFontButton, OneFontTextView oneFontTextView, OneCustomClearableEditText oneCustomClearableEditText, LinearLayoutCompat linearLayoutCompat) {
        this.f84132a = nestedScrollView;
        this.inputNumberNextButton = oneFontButton;
        this.inputNumberTextView = oneFontTextView;
        this.inputPhoneEditText = oneCustomClearableEditText;
        this.rootView = linearLayoutCompat;
    }

    @NonNull
    public static FragmentOnePostpaidInputNumberBinding bind(@NonNull View view) {
        int i = R.id.inputNumberNextButton;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.inputNumberTextView;
            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView != null) {
                i = R.id.inputPhoneEditText;
                OneCustomClearableEditText oneCustomClearableEditText = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
                if (oneCustomClearableEditText != null) {
                    i = R.id.rootView;
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                    if (linearLayoutCompat != null) {
                        return new FragmentOnePostpaidInputNumberBinding((NestedScrollView) view, oneFontButton, oneFontTextView, oneCustomClearableEditText, linearLayoutCompat);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOnePostpaidInputNumberBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOnePostpaidInputNumberBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_postpaid_input_number, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f84132a;
    }
}