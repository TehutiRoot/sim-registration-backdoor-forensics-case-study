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

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityStvBinding */
/* loaded from: classes7.dex */
public final class ActivityStvBinding implements ViewBinding {

    /* renamed from: a */
    public final CoordinatorLayout f83588a;
    @NonNull
    public final FrameLayout contentStv;
    @NonNull
    public final ZToolbarBinding incToolBar;

    public ActivityStvBinding(CoordinatorLayout coordinatorLayout, FrameLayout frameLayout, ZToolbarBinding zToolbarBinding) {
        this.f83588a = coordinatorLayout;
        this.contentStv = frameLayout;
        this.incToolBar = zToolbarBinding;
    }

    @NonNull
    public static ActivityStvBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.contentStv;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.incToolBar))) != null) {
            return new ActivityStvBinding((CoordinatorLayout) view, frameLayout, ZToolbarBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityStvBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityStvBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_stv, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.f83588a;
    }
}
