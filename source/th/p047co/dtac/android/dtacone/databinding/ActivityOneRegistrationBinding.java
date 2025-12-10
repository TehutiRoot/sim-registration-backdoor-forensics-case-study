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

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityOneRegistrationBinding */
/* loaded from: classes7.dex */
public final class ActivityOneRegistrationBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83560a;
    @NonNull
    public final ConstraintLayout layoutToolbar;
    @NonNull
    public final FrameLayout oneContent;
    @NonNull
    public final OneTransparentToolbarTextBlackBinding transparentToolbarLayout;

    public ActivityOneRegistrationBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, FrameLayout frameLayout, OneTransparentToolbarTextBlackBinding oneTransparentToolbarTextBlackBinding) {
        this.f83560a = constraintLayout;
        this.layoutToolbar = constraintLayout2;
        this.oneContent = frameLayout;
        this.transparentToolbarLayout = oneTransparentToolbarTextBlackBinding;
    }

    @NonNull
    public static ActivityOneRegistrationBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.layoutToolbar;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = R.id.one_content;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.transparentToolbarLayout))) != null) {
                return new ActivityOneRegistrationBinding((ConstraintLayout) view, constraintLayout, frameLayout, OneTransparentToolbarTextBlackBinding.bind(findChildViewById));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityOneRegistrationBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityOneRegistrationBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_one_registration, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83560a;
    }
}
