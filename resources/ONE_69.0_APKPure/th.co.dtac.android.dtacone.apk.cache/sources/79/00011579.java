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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrInputAddressIdCardBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrInputAddressIdCardBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayoutCompat f83879a;
    @NonNull
    public final ZIncludeMrtrInputAddressIdCardReceiptBinding layoutAddressIdCard;

    public FragmentMrtrInputAddressIdCardBinding(LinearLayoutCompat linearLayoutCompat, ZIncludeMrtrInputAddressIdCardReceiptBinding zIncludeMrtrInputAddressIdCardReceiptBinding) {
        this.f83879a = linearLayoutCompat;
        this.layoutAddressIdCard = zIncludeMrtrInputAddressIdCardReceiptBinding;
    }

    @NonNull
    public static FragmentMrtrInputAddressIdCardBinding bind(@NonNull View view) {
        int i = R.id.layout_address_id_card;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new FragmentMrtrInputAddressIdCardBinding((LinearLayoutCompat) view, ZIncludeMrtrInputAddressIdCardReceiptBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMrtrInputAddressIdCardBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrInputAddressIdCardBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_input_address_id_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayoutCompat getRoot() {
        return this.f83879a;
    }
}