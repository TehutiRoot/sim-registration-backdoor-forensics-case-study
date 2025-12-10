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

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityOnePureCameraBinding */
/* loaded from: classes7.dex */
public final class ActivityOnePureCameraBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f83556a;
    @NonNull
    public final FrameLayout linear;
    @NonNull
    public final IncludeOneCameraPureBinding mainLayout;
    @NonNull
    public final OneToolbarBinding toolBar;
    @NonNull
    public final OneTransparentToolbarBinding transparentToolbar;

    public ActivityOnePureCameraBinding(FrameLayout frameLayout, FrameLayout frameLayout2, IncludeOneCameraPureBinding includeOneCameraPureBinding, OneToolbarBinding oneToolbarBinding, OneTransparentToolbarBinding oneTransparentToolbarBinding) {
        this.f83556a = frameLayout;
        this.linear = frameLayout2;
        this.mainLayout = includeOneCameraPureBinding;
        this.toolBar = oneToolbarBinding;
        this.transparentToolbar = oneTransparentToolbarBinding;
    }

    @NonNull
    public static ActivityOnePureCameraBinding bind(@NonNull View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i = R.id.mainLayout;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            IncludeOneCameraPureBinding bind = IncludeOneCameraPureBinding.bind(findChildViewById);
            i = R.id.toolBar;
            View findChildViewById2 = ViewBindings.findChildViewById(view, i);
            if (findChildViewById2 != null) {
                OneToolbarBinding bind2 = OneToolbarBinding.bind(findChildViewById2);
                i = R.id.transparent_toolbar;
                View findChildViewById3 = ViewBindings.findChildViewById(view, i);
                if (findChildViewById3 != null) {
                    return new ActivityOnePureCameraBinding(frameLayout, frameLayout, bind, bind2, OneTransparentToolbarBinding.bind(findChildViewById3));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityOnePureCameraBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityOnePureCameraBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_one_pure_camera, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f83556a;
    }
}
