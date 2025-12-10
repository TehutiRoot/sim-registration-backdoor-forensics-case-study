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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneMnpScanBarcodeBinding */
/* loaded from: classes7.dex */
public final class FragmentOneMnpScanBarcodeBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83982a;
    @NonNull
    public final OneIncludeSwitchModeCameraBinding btnOpenSmartCard;

    public FragmentOneMnpScanBarcodeBinding(ConstraintLayout constraintLayout, OneIncludeSwitchModeCameraBinding oneIncludeSwitchModeCameraBinding) {
        this.f83982a = constraintLayout;
        this.btnOpenSmartCard = oneIncludeSwitchModeCameraBinding;
    }

    @NonNull
    public static FragmentOneMnpScanBarcodeBinding bind(@NonNull View view) {
        int i = R.id.btnOpenSmartCard;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new FragmentOneMnpScanBarcodeBinding((ConstraintLayout) view, OneIncludeSwitchModeCameraBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneMnpScanBarcodeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneMnpScanBarcodeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_mnp_scan_barcode, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83982a;
    }
}
