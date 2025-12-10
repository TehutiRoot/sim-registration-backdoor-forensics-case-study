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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneMnpInputNumberBinding */
/* loaded from: classes7.dex */
public final class FragmentOneMnpInputNumberBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f83971a;
    @NonNull
    public final OneFontButton inputNumberNextButton;
    @NonNull
    public final OneCustomClearableEditText inputPhoneEditText;
    @NonNull
    public final LinearLayoutCompat rootView;

    public FragmentOneMnpInputNumberBinding(NestedScrollView nestedScrollView, OneFontButton oneFontButton, OneCustomClearableEditText oneCustomClearableEditText, LinearLayoutCompat linearLayoutCompat) {
        this.f83971a = nestedScrollView;
        this.inputNumberNextButton = oneFontButton;
        this.inputPhoneEditText = oneCustomClearableEditText;
        this.rootView = linearLayoutCompat;
    }

    @NonNull
    public static FragmentOneMnpInputNumberBinding bind(@NonNull View view) {
        int i = R.id.inputNumberNextButton;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.inputPhoneEditText;
            OneCustomClearableEditText oneCustomClearableEditText = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
            if (oneCustomClearableEditText != null) {
                i = R.id.rootView;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                if (linearLayoutCompat != null) {
                    return new FragmentOneMnpInputNumberBinding((NestedScrollView) view, oneFontButton, oneCustomClearableEditText, linearLayoutCompat);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneMnpInputNumberBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneMnpInputNumberBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_mnp_input_number, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f83971a;
    }
}
