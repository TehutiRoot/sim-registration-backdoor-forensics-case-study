package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.p003ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityOnePostpaidRegistrationBinding */
/* loaded from: classes7.dex */
public final class ActivityOnePostpaidRegistrationBinding implements ViewBinding {

    /* renamed from: a */
    public final CoordinatorLayout f83551a;
    @NonNull
    public final ComposeView composeView;
    @NonNull
    public final FrameLayout contentOnePostpaid;

    public ActivityOnePostpaidRegistrationBinding(CoordinatorLayout coordinatorLayout, ComposeView composeView, FrameLayout frameLayout) {
        this.f83551a = coordinatorLayout;
        this.composeView = composeView;
        this.contentOnePostpaid = frameLayout;
    }

    @NonNull
    public static ActivityOnePostpaidRegistrationBinding bind(@NonNull View view) {
        int i = R.id.composeView;
        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
        if (composeView != null) {
            i = R.id.contentOnePostpaid;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                return new ActivityOnePostpaidRegistrationBinding((CoordinatorLayout) view, composeView, frameLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityOnePostpaidRegistrationBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityOnePostpaidRegistrationBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_one_postpaid_registration, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.f83551a;
    }
}
