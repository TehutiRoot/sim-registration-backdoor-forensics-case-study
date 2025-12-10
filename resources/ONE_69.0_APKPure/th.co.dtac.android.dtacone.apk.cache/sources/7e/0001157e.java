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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrMnpIdCardCameraFragmentBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrMnpIdCardCameraFragmentBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83884a;
    @NonNull
    public final ZIncludeNewCameraViewBinding incCameraView;

    public FragmentMrtrMnpIdCardCameraFragmentBinding(ConstraintLayout constraintLayout, ZIncludeNewCameraViewBinding zIncludeNewCameraViewBinding) {
        this.f83884a = constraintLayout;
        this.incCameraView = zIncludeNewCameraViewBinding;
    }

    @NonNull
    public static FragmentMrtrMnpIdCardCameraFragmentBinding bind(@NonNull View view) {
        int i = R.id.incCameraView;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new FragmentMrtrMnpIdCardCameraFragmentBinding((ConstraintLayout) view, ZIncludeNewCameraViewBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMrtrMnpIdCardCameraFragmentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrMnpIdCardCameraFragmentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_mnp_id_card_camera_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83884a;
    }
}