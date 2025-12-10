package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentChangeSimPreviewIdCardBinding */
/* loaded from: classes7.dex */
public final class FragmentChangeSimPreviewIdCardBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f83773a;
    @NonNull
    public final ZIncludePreviewCameraIdCardBinding incPreview;

    public FragmentChangeSimPreviewIdCardBinding(FrameLayout frameLayout, ZIncludePreviewCameraIdCardBinding zIncludePreviewCameraIdCardBinding) {
        this.f83773a = frameLayout;
        this.incPreview = zIncludePreviewCameraIdCardBinding;
    }

    @NonNull
    public static FragmentChangeSimPreviewIdCardBinding bind(@NonNull View view) {
        int i = R.id.incPreview;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new FragmentChangeSimPreviewIdCardBinding((FrameLayout) view, ZIncludePreviewCameraIdCardBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentChangeSimPreviewIdCardBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentChangeSimPreviewIdCardBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_change_sim_preview_id_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f83773a;
    }
}