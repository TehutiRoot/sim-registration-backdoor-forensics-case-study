package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneRetailerProfilePreviewCustomCameraBinding */
/* loaded from: classes7.dex */
public final class FragmentOneRetailerProfilePreviewCustomCameraBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84114a;

    public FragmentOneRetailerProfilePreviewCustomCameraBinding(ConstraintLayout constraintLayout) {
        this.f84114a = constraintLayout;
    }

    @NonNull
    public static FragmentOneRetailerProfilePreviewCustomCameraBinding bind(@NonNull View view) {
        if (view != null) {
            return new FragmentOneRetailerProfilePreviewCustomCameraBinding((ConstraintLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static FragmentOneRetailerProfilePreviewCustomCameraBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneRetailerProfilePreviewCustomCameraBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_retailer_profile_preview_custom_camera, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84114a;
    }
}
