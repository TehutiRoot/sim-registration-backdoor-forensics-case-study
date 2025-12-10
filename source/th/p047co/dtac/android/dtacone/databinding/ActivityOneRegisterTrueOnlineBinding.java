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

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityOneRegisterTrueOnlineBinding */
/* loaded from: classes7.dex */
public final class ActivityOneRegisterTrueOnlineBinding implements ViewBinding {

    /* renamed from: a */
    public final CoordinatorLayout f83559a;
    @NonNull
    public final FrameLayout contentRegisterTrueOnline;
    @NonNull
    public final CoordinatorLayout main;

    public ActivityOneRegisterTrueOnlineBinding(CoordinatorLayout coordinatorLayout, FrameLayout frameLayout, CoordinatorLayout coordinatorLayout2) {
        this.f83559a = coordinatorLayout;
        this.contentRegisterTrueOnline = frameLayout;
        this.main = coordinatorLayout2;
    }

    @NonNull
    public static ActivityOneRegisterTrueOnlineBinding bind(@NonNull View view) {
        int i = R.id.contentRegisterTrueOnline;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
            return new ActivityOneRegisterTrueOnlineBinding(coordinatorLayout, frameLayout, coordinatorLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityOneRegisterTrueOnlineBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityOneRegisterTrueOnlineBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_one_register_true_online, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.f83559a;
    }
}
