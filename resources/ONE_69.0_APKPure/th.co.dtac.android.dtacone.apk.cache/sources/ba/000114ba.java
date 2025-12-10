package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivitySplashScreenBinding */
/* loaded from: classes7.dex */
public final class ActivitySplashScreenBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f83685a;

    public ActivitySplashScreenBinding(RelativeLayout relativeLayout) {
        this.f83685a = relativeLayout;
    }

    @NonNull
    public static ActivitySplashScreenBinding bind(@NonNull View view) {
        if (view != null) {
            return new ActivitySplashScreenBinding((RelativeLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static ActivitySplashScreenBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivitySplashScreenBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_splash_screen, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f83685a;
    }
}