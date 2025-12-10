package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivitySimActivitionBinding */
/* loaded from: classes7.dex */
public final class ActivitySimActivitionBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f83586a;
    @NonNull
    public final FrameLayout contentSimActivation;

    public ActivitySimActivitionBinding(LinearLayout linearLayout, FrameLayout frameLayout) {
        this.f83586a = linearLayout;
        this.contentSimActivation = frameLayout;
    }

    @NonNull
    public static ActivitySimActivitionBinding bind(@NonNull View view) {
        int i = R.id.contentSimActivation;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            return new ActivitySimActivitionBinding((LinearLayout) view, frameLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivitySimActivitionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivitySimActivitionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_sim_activition, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f83586a;
    }
}
