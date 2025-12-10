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

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityOnePre2PostBinding */
/* loaded from: classes7.dex */
public final class ActivityOnePre2PostBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83651a;
    @NonNull
    public final OneToolbarBinding includeToolbar;
    @NonNull
    public final ConstraintLayout main;
    @NonNull
    public final FrameLayout pre2postContainer;

    public ActivityOnePre2PostBinding(ConstraintLayout constraintLayout, OneToolbarBinding oneToolbarBinding, ConstraintLayout constraintLayout2, FrameLayout frameLayout) {
        this.f83651a = constraintLayout;
        this.includeToolbar = oneToolbarBinding;
        this.main = constraintLayout2;
        this.pre2postContainer = frameLayout;
    }

    @NonNull
    public static ActivityOnePre2PostBinding bind(@NonNull View view) {
        int i = R.id.include_toolbar;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            OneToolbarBinding bind = OneToolbarBinding.bind(findChildViewById);
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            int i2 = R.id.pre2postContainer;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i2);
            if (frameLayout != null) {
                return new ActivityOnePre2PostBinding(constraintLayout, bind, constraintLayout, frameLayout);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityOnePre2PostBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityOnePre2PostBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_one_pre2_post, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83651a;
    }
}