package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneTakeReferenceDocCameraBinding */
/* loaded from: classes7.dex */
public final class FragmentOneTakeReferenceDocCameraBinding implements ViewBinding {

    /* renamed from: a */
    public final CoordinatorLayout f84126a;
    @NonNull
    public final CoordinatorLayout coordinator;

    public FragmentOneTakeReferenceDocCameraBinding(CoordinatorLayout coordinatorLayout, CoordinatorLayout coordinatorLayout2) {
        this.f84126a = coordinatorLayout;
        this.coordinator = coordinatorLayout2;
    }

    @NonNull
    public static FragmentOneTakeReferenceDocCameraBinding bind(@NonNull View view) {
        if (view != null) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
            return new FragmentOneTakeReferenceDocCameraBinding(coordinatorLayout, coordinatorLayout);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static FragmentOneTakeReferenceDocCameraBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneTakeReferenceDocCameraBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_take_reference_doc_camera, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.f84126a;
    }
}
