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

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityOneFaceCameraBinding */
/* loaded from: classes7.dex */
public final class ActivityOneFaceCameraBinding implements ViewBinding {

    /* renamed from: a */
    public final CoordinatorLayout f83541a;
    @NonNull
    public final CoordinatorLayout container;
    @NonNull
    public final OneIncludeNewCameraViewBinding incCameraView;
    @NonNull
    public final OneToolbarBinding includeToolbar;

    public ActivityOneFaceCameraBinding(CoordinatorLayout coordinatorLayout, CoordinatorLayout coordinatorLayout2, OneIncludeNewCameraViewBinding oneIncludeNewCameraViewBinding, OneToolbarBinding oneToolbarBinding) {
        this.f83541a = coordinatorLayout;
        this.container = coordinatorLayout2;
        this.incCameraView = oneIncludeNewCameraViewBinding;
        this.includeToolbar = oneToolbarBinding;
    }

    @NonNull
    public static ActivityOneFaceCameraBinding bind(@NonNull View view) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
        int i = R.id.incCameraView;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            OneIncludeNewCameraViewBinding bind = OneIncludeNewCameraViewBinding.bind(findChildViewById);
            int i2 = R.id.include_toolbar;
            View findChildViewById2 = ViewBindings.findChildViewById(view, i2);
            if (findChildViewById2 != null) {
                return new ActivityOneFaceCameraBinding(coordinatorLayout, coordinatorLayout, bind, OneToolbarBinding.bind(findChildViewById2));
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityOneFaceCameraBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityOneFaceCameraBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_one_face_camera, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.f83541a;
    }
}
