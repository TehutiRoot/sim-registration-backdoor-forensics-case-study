package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneDeviceSaleScanImeiBinding */
/* loaded from: classes7.dex */
public final class FragmentOneDeviceSaleScanImeiBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f83931a;
    @NonNull
    public final OneIncludeScanImeiBinding incScanImei;

    public FragmentOneDeviceSaleScanImeiBinding(FrameLayout frameLayout, OneIncludeScanImeiBinding oneIncludeScanImeiBinding) {
        this.f83931a = frameLayout;
        this.incScanImei = oneIncludeScanImeiBinding;
    }

    @NonNull
    public static FragmentOneDeviceSaleScanImeiBinding bind(@NonNull View view) {
        int i = R.id.incScanImei;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new FragmentOneDeviceSaleScanImeiBinding((FrameLayout) view, OneIncludeScanImeiBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneDeviceSaleScanImeiBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneDeviceSaleScanImeiBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_device_sale_scan_imei, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f83931a;
    }
}
