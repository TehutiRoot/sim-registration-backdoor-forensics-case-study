package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneDeviceSaleInputImeiTrueBinding */
/* loaded from: classes7.dex */
public final class FragmentOneDeviceSaleInputImeiTrueBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84025a;

    public FragmentOneDeviceSaleInputImeiTrueBinding(LinearLayout linearLayout) {
        this.f84025a = linearLayout;
    }

    @NonNull
    public static FragmentOneDeviceSaleInputImeiTrueBinding bind(@NonNull View view) {
        if (view != null) {
            return new FragmentOneDeviceSaleInputImeiTrueBinding((LinearLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static FragmentOneDeviceSaleInputImeiTrueBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneDeviceSaleInputImeiTrueBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_device_sale_input_imei_true, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84025a;
    }
}