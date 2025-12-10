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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentTakeReferenceDocCameraBinding */
/* loaded from: classes7.dex */
public final class FragmentTakeReferenceDocCameraBinding implements ViewBinding {

    /* renamed from: a */
    public final CoordinatorLayout f84209a;
    @NonNull
    public final CoordinatorLayout coordinator;
    @NonNull
    public final IncludeTakeReferenceDocCameraViewBinding mainLayout;

    public FragmentTakeReferenceDocCameraBinding(CoordinatorLayout coordinatorLayout, CoordinatorLayout coordinatorLayout2, IncludeTakeReferenceDocCameraViewBinding includeTakeReferenceDocCameraViewBinding) {
        this.f84209a = coordinatorLayout;
        this.coordinator = coordinatorLayout2;
        this.mainLayout = includeTakeReferenceDocCameraViewBinding;
    }

    @NonNull
    public static FragmentTakeReferenceDocCameraBinding bind(@NonNull View view) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
        int i = R.id.mainLayout;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new FragmentTakeReferenceDocCameraBinding(coordinatorLayout, coordinatorLayout, IncludeTakeReferenceDocCameraViewBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentTakeReferenceDocCameraBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentTakeReferenceDocCameraBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_take_reference_doc_camera, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.f84209a;
    }
}
