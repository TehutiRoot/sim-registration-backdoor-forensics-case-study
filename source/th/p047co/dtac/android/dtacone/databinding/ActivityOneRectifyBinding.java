package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityOneRectifyBinding */
/* loaded from: classes7.dex */
public final class ActivityOneRectifyBinding implements ViewBinding {

    /* renamed from: a */
    public final CoordinatorLayout f83558a;
    @NonNull
    public final FrameLayout contentRectify;

    public ActivityOneRectifyBinding(CoordinatorLayout coordinatorLayout, FrameLayout frameLayout) {
        this.f83558a = coordinatorLayout;
        this.contentRectify = frameLayout;
    }

    @NonNull
    public static ActivityOneRectifyBinding bind(@NonNull View view) {
        int i = R.id.contentRectify;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            return new ActivityOneRectifyBinding((CoordinatorLayout) view, frameLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityOneRectifyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityOneRectifyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_one_rectify, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.f83558a;
    }
}
