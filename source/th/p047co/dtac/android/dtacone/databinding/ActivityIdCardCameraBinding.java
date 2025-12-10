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

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityIdCardCameraBinding */
/* loaded from: classes7.dex */
public final class ActivityIdCardCameraBinding implements ViewBinding {

    /* renamed from: a */
    public final CoordinatorLayout f83518a;
    @NonNull
    public final CoordinatorLayout container;
    @NonNull
    public final ZIncludeCameraViewBinding incCameraView;

    public ActivityIdCardCameraBinding(CoordinatorLayout coordinatorLayout, CoordinatorLayout coordinatorLayout2, ZIncludeCameraViewBinding zIncludeCameraViewBinding) {
        this.f83518a = coordinatorLayout;
        this.container = coordinatorLayout2;
        this.incCameraView = zIncludeCameraViewBinding;
    }

    @NonNull
    public static ActivityIdCardCameraBinding bind(@NonNull View view) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
        int i = R.id.incCameraView;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new ActivityIdCardCameraBinding(coordinatorLayout, coordinatorLayout, ZIncludeCameraViewBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityIdCardCameraBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityIdCardCameraBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_id_card_camera, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.f83518a;
    }
}
