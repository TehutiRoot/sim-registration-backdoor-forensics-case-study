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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneInputAddressPersonBinding */
/* loaded from: classes7.dex */
public final class FragmentOneInputAddressPersonBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayoutCompat f83957a;
    @NonNull
    public final IncludeOneInputAddressPersonReceiptBinding layoutAddressOtherCard;

    public FragmentOneInputAddressPersonBinding(LinearLayoutCompat linearLayoutCompat, IncludeOneInputAddressPersonReceiptBinding includeOneInputAddressPersonReceiptBinding) {
        this.f83957a = linearLayoutCompat;
        this.layoutAddressOtherCard = includeOneInputAddressPersonReceiptBinding;
    }

    @NonNull
    public static FragmentOneInputAddressPersonBinding bind(@NonNull View view) {
        int i = R.id.layout_address_other_card;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new FragmentOneInputAddressPersonBinding((LinearLayoutCompat) view, IncludeOneInputAddressPersonReceiptBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneInputAddressPersonBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneInputAddressPersonBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_input_address_person, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayoutCompat getRoot() {
        return this.f83957a;
    }
}
