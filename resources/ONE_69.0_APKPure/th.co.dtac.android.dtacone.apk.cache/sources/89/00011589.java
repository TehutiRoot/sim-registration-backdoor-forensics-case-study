package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrMnpScanBarcodeBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrMnpScanBarcodeBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83895a;
    @NonNull
    public final ZIncludeScanBarcodeBinding incScanBarcode;
    @NonNull
    public final ZIncludeSwitchModeCameraBinding switchModeToSmartCard;

    public FragmentMrtrMnpScanBarcodeBinding(ConstraintLayout constraintLayout, ZIncludeScanBarcodeBinding zIncludeScanBarcodeBinding, ZIncludeSwitchModeCameraBinding zIncludeSwitchModeCameraBinding) {
        this.f83895a = constraintLayout;
        this.incScanBarcode = zIncludeScanBarcodeBinding;
        this.switchModeToSmartCard = zIncludeSwitchModeCameraBinding;
    }

    @NonNull
    public static FragmentMrtrMnpScanBarcodeBinding bind(@NonNull View view) {
        int i = R.id.incScanBarcode;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            ZIncludeScanBarcodeBinding bind = ZIncludeScanBarcodeBinding.bind(findChildViewById);
            int i2 = R.id.switchModeToSmartCard;
            View findChildViewById2 = ViewBindings.findChildViewById(view, i2);
            if (findChildViewById2 != null) {
                return new FragmentMrtrMnpScanBarcodeBinding((ConstraintLayout) view, bind, ZIncludeSwitchModeCameraBinding.bind(findChildViewById2));
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMrtrMnpScanBarcodeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrMnpScanBarcodeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_mnp_scan_barcode, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83895a;
    }
}