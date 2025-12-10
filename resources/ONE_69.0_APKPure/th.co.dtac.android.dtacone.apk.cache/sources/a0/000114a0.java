package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityOneRetailerProfileCameraBinding */
/* loaded from: classes7.dex */
public final class ActivityOneRetailerProfileCameraBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83659a;
    @NonNull
    public final FrameLayout oneRetailerProfileCameraContainer;
    @NonNull
    public final ConstraintLayout oneRetailerProfileCameraToolbar;
    @NonNull
    public final MrtrTransparentToolbarBinding transparentToolbarLayout;

    public ActivityOneRetailerProfileCameraBinding(ConstraintLayout constraintLayout, FrameLayout frameLayout, ConstraintLayout constraintLayout2, MrtrTransparentToolbarBinding mrtrTransparentToolbarBinding) {
        this.f83659a = constraintLayout;
        this.oneRetailerProfileCameraContainer = frameLayout;
        this.oneRetailerProfileCameraToolbar = constraintLayout2;
        this.transparentToolbarLayout = mrtrTransparentToolbarBinding;
    }

    @NonNull
    public static ActivityOneRetailerProfileCameraBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.oneRetailerProfileCameraContainer;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.oneRetailerProfileCameraToolbar;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.transparentToolbarLayout))) != null) {
                return new ActivityOneRetailerProfileCameraBinding((ConstraintLayout) view, frameLayout, constraintLayout, MrtrTransparentToolbarBinding.bind(findChildViewById));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityOneRetailerProfileCameraBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityOneRetailerProfileCameraBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_one_retailer_profile_camera, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83659a;
    }
}