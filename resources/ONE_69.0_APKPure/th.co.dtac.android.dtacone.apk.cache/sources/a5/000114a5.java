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

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityOneStvProSermOnlineBinding */
/* loaded from: classes7.dex */
public final class ActivityOneStvProSermOnlineBinding implements ViewBinding {

    /* renamed from: a */
    public final CoordinatorLayout f83664a;
    @NonNull
    public final FrameLayout contentStvOnline;

    public ActivityOneStvProSermOnlineBinding(CoordinatorLayout coordinatorLayout, FrameLayout frameLayout) {
        this.f83664a = coordinatorLayout;
        this.contentStvOnline = frameLayout;
    }

    @NonNull
    public static ActivityOneStvProSermOnlineBinding bind(@NonNull View view) {
        int i = R.id.contentStvOnline;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            return new ActivityOneStvProSermOnlineBinding((CoordinatorLayout) view, frameLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityOneStvProSermOnlineBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityOneStvProSermOnlineBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_one_stv_pro_serm_online, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.f83664a;
    }
}