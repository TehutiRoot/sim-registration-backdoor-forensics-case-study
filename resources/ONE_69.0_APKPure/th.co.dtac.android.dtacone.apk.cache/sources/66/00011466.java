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

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityChangeMainPackBinding */
/* loaded from: classes7.dex */
public final class ActivityChangeMainPackBinding implements ViewBinding {

    /* renamed from: a */
    public final CoordinatorLayout f83601a;
    @NonNull
    public final FrameLayout contentLayout;

    public ActivityChangeMainPackBinding(CoordinatorLayout coordinatorLayout, FrameLayout frameLayout) {
        this.f83601a = coordinatorLayout;
        this.contentLayout = frameLayout;
    }

    @NonNull
    public static ActivityChangeMainPackBinding bind(@NonNull View view) {
        int i = R.id.contentLayout;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            return new ActivityChangeMainPackBinding((CoordinatorLayout) view, frameLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityChangeMainPackBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityChangeMainPackBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_change_main_pack, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.f83601a;
    }
}