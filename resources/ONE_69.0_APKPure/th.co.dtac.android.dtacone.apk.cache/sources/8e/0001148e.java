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

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityOneIdCardCameraBinding */
/* loaded from: classes7.dex */
public final class ActivityOneIdCardCameraBinding implements ViewBinding {

    /* renamed from: a */
    public final CoordinatorLayout f83641a;
    @NonNull
    public final CoordinatorLayout container;
    @NonNull
    public final OneToolbarBinding includeToolbar;
    @NonNull
    public final OneIncludeCameraViewBinding mainLayout;

    public ActivityOneIdCardCameraBinding(CoordinatorLayout coordinatorLayout, CoordinatorLayout coordinatorLayout2, OneToolbarBinding oneToolbarBinding, OneIncludeCameraViewBinding oneIncludeCameraViewBinding) {
        this.f83641a = coordinatorLayout;
        this.container = coordinatorLayout2;
        this.includeToolbar = oneToolbarBinding;
        this.mainLayout = oneIncludeCameraViewBinding;
    }

    @NonNull
    public static ActivityOneIdCardCameraBinding bind(@NonNull View view) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
        int i = R.id.include_toolbar;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            OneToolbarBinding bind = OneToolbarBinding.bind(findChildViewById);
            int i2 = R.id.mainLayout;
            View findChildViewById2 = ViewBindings.findChildViewById(view, i2);
            if (findChildViewById2 != null) {
                return new ActivityOneIdCardCameraBinding(coordinatorLayout, coordinatorLayout, bind, OneIncludeCameraViewBinding.bind(findChildViewById2));
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityOneIdCardCameraBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityOneIdCardCameraBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_one_id_card_camera, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.f83641a;
    }
}