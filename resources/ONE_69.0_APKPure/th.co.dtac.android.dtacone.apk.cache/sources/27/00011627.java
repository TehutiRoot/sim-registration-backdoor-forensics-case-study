package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneInputAddressPassportBinding */
/* loaded from: classes7.dex */
public final class FragmentOneInputAddressPassportBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayoutCompat f84054a;
    @NonNull
    public final IncludeOneInputAddressPassportReceiptBinding layoutAddressPassport;

    public FragmentOneInputAddressPassportBinding(LinearLayoutCompat linearLayoutCompat, IncludeOneInputAddressPassportReceiptBinding includeOneInputAddressPassportReceiptBinding) {
        this.f84054a = linearLayoutCompat;
        this.layoutAddressPassport = includeOneInputAddressPassportReceiptBinding;
    }

    @NonNull
    public static FragmentOneInputAddressPassportBinding bind(@NonNull View view) {
        int i = R.id.layout_address_passport;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new FragmentOneInputAddressPassportBinding((LinearLayoutCompat) view, IncludeOneInputAddressPassportReceiptBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneInputAddressPassportBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneInputAddressPassportBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_input_address_passport, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayoutCompat getRoot() {
        return this.f84054a;
    }
}