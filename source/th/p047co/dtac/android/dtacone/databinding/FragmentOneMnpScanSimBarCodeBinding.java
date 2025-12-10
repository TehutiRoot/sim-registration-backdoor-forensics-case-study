package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneMnpScanSimBarCodeBinding */
/* loaded from: classes7.dex */
public final class FragmentOneMnpScanSimBarCodeBinding implements ViewBinding {

    /* renamed from: a */
    public final CoordinatorLayout f83983a;
    @NonNull
    public final OneIncludeScanBarcodeBinding incScanBarCode;

    public FragmentOneMnpScanSimBarCodeBinding(CoordinatorLayout coordinatorLayout, OneIncludeScanBarcodeBinding oneIncludeScanBarcodeBinding) {
        this.f83983a = coordinatorLayout;
        this.incScanBarCode = oneIncludeScanBarcodeBinding;
    }

    @NonNull
    public static FragmentOneMnpScanSimBarCodeBinding bind(@NonNull View view) {
        int i = R.id.incScanBarCode;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new FragmentOneMnpScanSimBarCodeBinding((CoordinatorLayout) view, OneIncludeScanBarcodeBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneMnpScanSimBarCodeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneMnpScanSimBarCodeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_mnp_scan_sim_bar_code, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.f83983a;
    }
}
