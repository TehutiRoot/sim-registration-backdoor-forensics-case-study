package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrPrepaidIdCardCameraBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrPrepaidIdCardCameraBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83958a;
    @NonNull
    public final ZIncludeSwitchModeCameraBinding btnOpenSmartCard;
    @NonNull
    public final ZIncludeNewCameraViewBinding incCameraView;

    public FragmentMrtrPrepaidIdCardCameraBinding(ConstraintLayout constraintLayout, ZIncludeSwitchModeCameraBinding zIncludeSwitchModeCameraBinding, ZIncludeNewCameraViewBinding zIncludeNewCameraViewBinding) {
        this.f83958a = constraintLayout;
        this.btnOpenSmartCard = zIncludeSwitchModeCameraBinding;
        this.incCameraView = zIncludeNewCameraViewBinding;
    }

    @NonNull
    public static FragmentMrtrPrepaidIdCardCameraBinding bind(@NonNull View view) {
        int i = R.id.btnOpenSmartCard;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            ZIncludeSwitchModeCameraBinding bind = ZIncludeSwitchModeCameraBinding.bind(findChildViewById);
            int i2 = R.id.incCameraView;
            View findChildViewById2 = ViewBindings.findChildViewById(view, i2);
            if (findChildViewById2 != null) {
                return new FragmentMrtrPrepaidIdCardCameraBinding((ConstraintLayout) view, bind, ZIncludeNewCameraViewBinding.bind(findChildViewById2));
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMrtrPrepaidIdCardCameraBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrPrepaidIdCardCameraBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_prepaid_id_card_camera, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83958a;
    }
}