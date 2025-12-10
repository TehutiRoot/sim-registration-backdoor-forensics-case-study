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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneMnpIdCardCameraBinding */
/* loaded from: classes7.dex */
public final class FragmentOneMnpIdCardCameraBinding implements ViewBinding {

    /* renamed from: a */
    public final CoordinatorLayout f84066a;
    @NonNull
    public final OneIncludeSwitchModeCameraBinding btnOpenSmartCard;

    public FragmentOneMnpIdCardCameraBinding(CoordinatorLayout coordinatorLayout, OneIncludeSwitchModeCameraBinding oneIncludeSwitchModeCameraBinding) {
        this.f84066a = coordinatorLayout;
        this.btnOpenSmartCard = oneIncludeSwitchModeCameraBinding;
    }

    @NonNull
    public static FragmentOneMnpIdCardCameraBinding bind(@NonNull View view) {
        int i = R.id.btnOpenSmartCard;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new FragmentOneMnpIdCardCameraBinding((CoordinatorLayout) view, OneIncludeSwitchModeCameraBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneMnpIdCardCameraBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneMnpIdCardCameraBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_mnp_id_card_camera, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.f84066a;
    }
}