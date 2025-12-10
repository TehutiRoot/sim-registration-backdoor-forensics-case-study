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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrPre2postScanImeiBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrPre2postScanImeiBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f83953a;
    @NonNull
    public final IncludeScanImeiPre2postBinding incScanImei;

    public FragmentMrtrPre2postScanImeiBinding(FrameLayout frameLayout, IncludeScanImeiPre2postBinding includeScanImeiPre2postBinding) {
        this.f83953a = frameLayout;
        this.incScanImei = includeScanImeiPre2postBinding;
    }

    @NonNull
    public static FragmentMrtrPre2postScanImeiBinding bind(@NonNull View view) {
        int i = R.id.incScanImei;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new FragmentMrtrPre2postScanImeiBinding((FrameLayout) view, IncludeScanImeiPre2postBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMrtrPre2postScanImeiBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrPre2postScanImeiBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_pre2post_scan_imei, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f83953a;
    }
}