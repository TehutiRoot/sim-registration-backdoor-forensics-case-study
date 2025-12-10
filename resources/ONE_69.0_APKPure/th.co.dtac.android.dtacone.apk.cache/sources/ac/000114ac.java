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

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityPureCameraBinding */
/* loaded from: classes7.dex */
public final class ActivityPureCameraBinding implements ViewBinding {

    /* renamed from: a */
    public final CoordinatorLayout f83671a;
    @NonNull
    public final CoordinatorLayout coordinator;
    @NonNull
    public final OneIncludeCameraPureBinding mainLayout;

    public ActivityPureCameraBinding(CoordinatorLayout coordinatorLayout, CoordinatorLayout coordinatorLayout2, OneIncludeCameraPureBinding oneIncludeCameraPureBinding) {
        this.f83671a = coordinatorLayout;
        this.coordinator = coordinatorLayout2;
        this.mainLayout = oneIncludeCameraPureBinding;
    }

    @NonNull
    public static ActivityPureCameraBinding bind(@NonNull View view) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
        int i = R.id.mainLayout;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new ActivityPureCameraBinding(coordinatorLayout, coordinatorLayout, OneIncludeCameraPureBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityPureCameraBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityPureCameraBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_pure_camera, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.f83671a;
    }
}