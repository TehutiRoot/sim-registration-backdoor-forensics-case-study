package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentPre2postScanImeiBinding */
/* loaded from: classes7.dex */
public final class FragmentPre2postScanImeiBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84145a;

    public FragmentPre2postScanImeiBinding(ConstraintLayout constraintLayout) {
        this.f84145a = constraintLayout;
    }

    @NonNull
    public static FragmentPre2postScanImeiBinding bind(@NonNull View view) {
        if (view != null) {
            return new FragmentPre2postScanImeiBinding((ConstraintLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static FragmentPre2postScanImeiBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentPre2postScanImeiBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_pre2post_scan_imei, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84145a;
    }
}
