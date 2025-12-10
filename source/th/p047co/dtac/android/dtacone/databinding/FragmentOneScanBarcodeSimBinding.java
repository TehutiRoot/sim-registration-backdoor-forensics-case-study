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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneScanBarcodeSimBinding */
/* loaded from: classes7.dex */
public final class FragmentOneScanBarcodeSimBinding implements ViewBinding {

    /* renamed from: a */
    public final CoordinatorLayout f84118a;
    @NonNull
    public final OneIncludeScanBarcodeBinding incScanBarcode;

    public FragmentOneScanBarcodeSimBinding(CoordinatorLayout coordinatorLayout, OneIncludeScanBarcodeBinding oneIncludeScanBarcodeBinding) {
        this.f84118a = coordinatorLayout;
        this.incScanBarcode = oneIncludeScanBarcodeBinding;
    }

    @NonNull
    public static FragmentOneScanBarcodeSimBinding bind(@NonNull View view) {
        int i = R.id.incScanBarcode;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new FragmentOneScanBarcodeSimBinding((CoordinatorLayout) view, OneIncludeScanBarcodeBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneScanBarcodeSimBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneScanBarcodeSimBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_scan_barcode_sim, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.f84118a;
    }
}
