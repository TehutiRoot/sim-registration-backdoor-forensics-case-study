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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentScanImeiBinding */
/* loaded from: classes7.dex */
public final class FragmentScanImeiBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84188a;
    @NonNull
    public final IncludeScanImeiBinding layoutScanImei;

    public FragmentScanImeiBinding(ConstraintLayout constraintLayout, IncludeScanImeiBinding includeScanImeiBinding) {
        this.f84188a = constraintLayout;
        this.layoutScanImei = includeScanImeiBinding;
    }

    @NonNull
    public static FragmentScanImeiBinding bind(@NonNull View view) {
        int i = R.id.layoutScanImei;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new FragmentScanImeiBinding((ConstraintLayout) view, IncludeScanImeiBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentScanImeiBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentScanImeiBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_scan_imei, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84188a;
    }
}
