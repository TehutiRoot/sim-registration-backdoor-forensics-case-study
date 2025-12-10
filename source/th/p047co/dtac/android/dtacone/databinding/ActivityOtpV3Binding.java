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

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityOtpV3Binding */
/* loaded from: classes7.dex */
public final class ActivityOtpV3Binding implements ViewBinding {

    /* renamed from: a */
    public final CoordinatorLayout f83569a;
    @NonNull
    public final FrameLayout contentOtpV3;

    public ActivityOtpV3Binding(CoordinatorLayout coordinatorLayout, FrameLayout frameLayout) {
        this.f83569a = coordinatorLayout;
        this.contentOtpV3 = frameLayout;
    }

    @NonNull
    public static ActivityOtpV3Binding bind(@NonNull View view) {
        int i = R.id.contentOtpV3;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            return new ActivityOtpV3Binding((CoordinatorLayout) view, frameLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityOtpV3Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityOtpV3Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_otp_v3, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.f83569a;
    }
}
