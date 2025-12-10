package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneDeviceSaleAdditionalAdvanceDeviceBinding */
/* loaded from: classes7.dex */
public final class FragmentOneDeviceSaleAdditionalAdvanceDeviceBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f84018a;

    public FragmentOneDeviceSaleAdditionalAdvanceDeviceBinding(FrameLayout frameLayout) {
        this.f84018a = frameLayout;
    }

    @NonNull
    public static FragmentOneDeviceSaleAdditionalAdvanceDeviceBinding bind(@NonNull View view) {
        if (view != null) {
            return new FragmentOneDeviceSaleAdditionalAdvanceDeviceBinding((FrameLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static FragmentOneDeviceSaleAdditionalAdvanceDeviceBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneDeviceSaleAdditionalAdvanceDeviceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_device_sale_additional_advance_device, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f84018a;
    }
}