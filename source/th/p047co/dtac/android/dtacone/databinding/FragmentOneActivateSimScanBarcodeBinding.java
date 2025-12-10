package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneActivateSimScanBarcodeBinding */
/* loaded from: classes7.dex */
public final class FragmentOneActivateSimScanBarcodeBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f83884a;

    public FragmentOneActivateSimScanBarcodeBinding(FrameLayout frameLayout) {
        this.f83884a = frameLayout;
    }

    @NonNull
    public static FragmentOneActivateSimScanBarcodeBinding bind(@NonNull View view) {
        if (view != null) {
            return new FragmentOneActivateSimScanBarcodeBinding((FrameLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static FragmentOneActivateSimScanBarcodeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneActivateSimScanBarcodeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_activate_sim_scan_barcode, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f83884a;
    }
}
