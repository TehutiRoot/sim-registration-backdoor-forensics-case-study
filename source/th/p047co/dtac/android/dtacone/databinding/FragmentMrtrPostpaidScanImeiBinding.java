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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrPostpaidScanImeiBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrPostpaidScanImeiBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f83840a;
    @NonNull
    public final IncludeScanImeiBinding incScanImei;

    public FragmentMrtrPostpaidScanImeiBinding(FrameLayout frameLayout, IncludeScanImeiBinding includeScanImeiBinding) {
        this.f83840a = frameLayout;
        this.incScanImei = includeScanImeiBinding;
    }

    @NonNull
    public static FragmentMrtrPostpaidScanImeiBinding bind(@NonNull View view) {
        int i = R.id.incScanImei;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new FragmentMrtrPostpaidScanImeiBinding((FrameLayout) view, IncludeScanImeiBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMrtrPostpaidScanImeiBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrPostpaidScanImeiBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_postpaid_scan_imei, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f83840a;
    }
}
