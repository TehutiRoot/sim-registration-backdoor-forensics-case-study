package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityOneActivateSimBinding */
/* loaded from: classes7.dex */
public final class ActivityOneActivateSimBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83627a;
    @NonNull
    public final FrameLayout oneActivateSimContainer;
    @NonNull
    public final OneToolbarBinding oneActivateSimToolbar;

    public ActivityOneActivateSimBinding(ConstraintLayout constraintLayout, FrameLayout frameLayout, OneToolbarBinding oneToolbarBinding) {
        this.f83627a = constraintLayout;
        this.oneActivateSimContainer = frameLayout;
        this.oneActivateSimToolbar = oneToolbarBinding;
    }

    @NonNull
    public static ActivityOneActivateSimBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.oneActivateSimContainer;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.oneActivateSimToolbar))) != null) {
            return new ActivityOneActivateSimBinding((ConstraintLayout) view, frameLayout, OneToolbarBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityOneActivateSimBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityOneActivateSimBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_one_activate_sim, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83627a;
    }
}