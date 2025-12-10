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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOnePrepaidIdCardCameraBinding */
/* loaded from: classes7.dex */
public final class FragmentOnePrepaidIdCardCameraBinding implements ViewBinding {

    /* renamed from: a */
    public final CoordinatorLayout f84083a;
    @NonNull
    public final OneIncludeSwitchModeCameraBinding btnOpenSmartCard;

    public FragmentOnePrepaidIdCardCameraBinding(CoordinatorLayout coordinatorLayout, OneIncludeSwitchModeCameraBinding oneIncludeSwitchModeCameraBinding) {
        this.f84083a = coordinatorLayout;
        this.btnOpenSmartCard = oneIncludeSwitchModeCameraBinding;
    }

    @NonNull
    public static FragmentOnePrepaidIdCardCameraBinding bind(@NonNull View view) {
        int i = R.id.btnOpenSmartCard;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new FragmentOnePrepaidIdCardCameraBinding((CoordinatorLayout) view, OneIncludeSwitchModeCameraBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOnePrepaidIdCardCameraBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOnePrepaidIdCardCameraBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_prepaid_id_card_camera, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.f84083a;
    }
}
