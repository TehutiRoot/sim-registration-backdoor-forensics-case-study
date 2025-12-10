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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrPrepaidPreviewIdCardBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrPrepaidPreviewIdCardBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83964a;
    @NonNull
    public final ZIncludePreviewCameraIdCardBinding incPreview;

    public FragmentMrtrPrepaidPreviewIdCardBinding(ConstraintLayout constraintLayout, ZIncludePreviewCameraIdCardBinding zIncludePreviewCameraIdCardBinding) {
        this.f83964a = constraintLayout;
        this.incPreview = zIncludePreviewCameraIdCardBinding;
    }

    @NonNull
    public static FragmentMrtrPrepaidPreviewIdCardBinding bind(@NonNull View view) {
        int i = R.id.incPreview;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new FragmentMrtrPrepaidPreviewIdCardBinding((ConstraintLayout) view, ZIncludePreviewCameraIdCardBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMrtrPrepaidPreviewIdCardBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrPrepaidPreviewIdCardBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_prepaid_preview_id_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83964a;
    }
}