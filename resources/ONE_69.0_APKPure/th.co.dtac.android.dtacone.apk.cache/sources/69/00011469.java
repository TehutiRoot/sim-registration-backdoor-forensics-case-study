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

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityChangeSimBinding */
/* loaded from: classes7.dex */
public final class ActivityChangeSimBinding implements ViewBinding {

    /* renamed from: a */
    public final CoordinatorLayout f83604a;
    @NonNull
    public final FrameLayout contentContainer;
    @NonNull
    public final ZToolbarBinding incToolbar;

    public ActivityChangeSimBinding(CoordinatorLayout coordinatorLayout, FrameLayout frameLayout, ZToolbarBinding zToolbarBinding) {
        this.f83604a = coordinatorLayout;
        this.contentContainer = frameLayout;
        this.incToolbar = zToolbarBinding;
    }

    @NonNull
    public static ActivityChangeSimBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.contentContainer;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.incToolbar))) != null) {
            return new ActivityChangeSimBinding((CoordinatorLayout) view, frameLayout, ZToolbarBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityChangeSimBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityChangeSimBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_change_sim, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.f83604a;
    }
}