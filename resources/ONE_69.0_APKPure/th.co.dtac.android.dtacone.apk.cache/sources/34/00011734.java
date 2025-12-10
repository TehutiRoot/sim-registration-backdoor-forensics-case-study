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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentUpdatePrepaidCameraBinding */
/* loaded from: classes7.dex */
public final class FragmentUpdatePrepaidCameraBinding implements ViewBinding {

    /* renamed from: a */
    public final CoordinatorLayout f84323a;
    @NonNull
    public final CoordinatorLayout coordinator;
    @NonNull
    public final ZIncludeNewCameraViewBinding incCameraView;

    public FragmentUpdatePrepaidCameraBinding(CoordinatorLayout coordinatorLayout, CoordinatorLayout coordinatorLayout2, ZIncludeNewCameraViewBinding zIncludeNewCameraViewBinding) {
        this.f84323a = coordinatorLayout;
        this.coordinator = coordinatorLayout2;
        this.incCameraView = zIncludeNewCameraViewBinding;
    }

    @NonNull
    public static FragmentUpdatePrepaidCameraBinding bind(@NonNull View view) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
        int i = R.id.incCameraView;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new FragmentUpdatePrepaidCameraBinding(coordinatorLayout, coordinatorLayout, ZIncludeNewCameraViewBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentUpdatePrepaidCameraBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentUpdatePrepaidCameraBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_update_prepaid_camera, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.f84323a;
    }
}