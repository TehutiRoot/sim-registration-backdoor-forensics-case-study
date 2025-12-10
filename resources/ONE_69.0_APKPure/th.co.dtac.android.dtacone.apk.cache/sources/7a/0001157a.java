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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrInputAddressPassportBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrInputAddressPassportBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayoutCompat f83880a;
    @NonNull
    public final ZIncludeMrtrInputAddressPassportReceiptBinding layoutAddressPassport;

    public FragmentMrtrInputAddressPassportBinding(LinearLayoutCompat linearLayoutCompat, ZIncludeMrtrInputAddressPassportReceiptBinding zIncludeMrtrInputAddressPassportReceiptBinding) {
        this.f83880a = linearLayoutCompat;
        this.layoutAddressPassport = zIncludeMrtrInputAddressPassportReceiptBinding;
    }

    @NonNull
    public static FragmentMrtrInputAddressPassportBinding bind(@NonNull View view) {
        int i = R.id.layout_address_passport;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new FragmentMrtrInputAddressPassportBinding((LinearLayoutCompat) view, ZIncludeMrtrInputAddressPassportReceiptBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMrtrInputAddressPassportBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrInputAddressPassportBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_input_address_passport, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayoutCompat getRoot() {
        return this.f83880a;
    }
}