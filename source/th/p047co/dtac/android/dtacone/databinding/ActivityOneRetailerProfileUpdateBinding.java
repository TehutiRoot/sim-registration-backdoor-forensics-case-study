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

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityOneRetailerProfileUpdateBinding */
/* loaded from: classes7.dex */
public final class ActivityOneRetailerProfileUpdateBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83562a;
    @NonNull
    public final FrameLayout oneUpdateRetailerProfileContainer;
    @NonNull
    public final ConstraintLayout oneUpdateRetailerProfileToolbar;
    @NonNull
    public final OneTransparentToolbarBinding transparentToolbarLayout;

    public ActivityOneRetailerProfileUpdateBinding(ConstraintLayout constraintLayout, FrameLayout frameLayout, ConstraintLayout constraintLayout2, OneTransparentToolbarBinding oneTransparentToolbarBinding) {
        this.f83562a = constraintLayout;
        this.oneUpdateRetailerProfileContainer = frameLayout;
        this.oneUpdateRetailerProfileToolbar = constraintLayout2;
        this.transparentToolbarLayout = oneTransparentToolbarBinding;
    }

    @NonNull
    public static ActivityOneRetailerProfileUpdateBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.oneUpdateRetailerProfileContainer;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.oneUpdateRetailerProfileToolbar;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.transparentToolbarLayout))) != null) {
                return new ActivityOneRetailerProfileUpdateBinding((ConstraintLayout) view, frameLayout, constraintLayout, OneTransparentToolbarBinding.bind(findChildViewById));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityOneRetailerProfileUpdateBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityOneRetailerProfileUpdateBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_one_retailer_profile_update, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83562a;
    }
}
