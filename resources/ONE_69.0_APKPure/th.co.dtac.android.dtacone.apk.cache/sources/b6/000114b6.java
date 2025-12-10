package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityScanBarCodeBinding */
/* loaded from: classes7.dex */
public final class ActivityScanBarCodeBinding implements ViewBinding {

    /* renamed from: a */
    public final CoordinatorLayout f83681a;
    @NonNull
    public final CoordinatorLayout coordinator;

    public ActivityScanBarCodeBinding(CoordinatorLayout coordinatorLayout, CoordinatorLayout coordinatorLayout2) {
        this.f83681a = coordinatorLayout;
        this.coordinator = coordinatorLayout2;
    }

    @NonNull
    public static ActivityScanBarCodeBinding bind(@NonNull View view) {
        if (view != null) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
            return new ActivityScanBarCodeBinding(coordinatorLayout, coordinatorLayout);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static ActivityScanBarCodeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityScanBarCodeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_scan_bar_code, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.f83681a;
    }
}