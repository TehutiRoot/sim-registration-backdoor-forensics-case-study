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

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityOneChangePasswordBinding */
/* loaded from: classes7.dex */
public final class ActivityOneChangePasswordBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83537a;
    @NonNull
    public final ConstraintLayout layoutToolbar;
    @NonNull
    public final FrameLayout oneContent;
    @NonNull
    public final OneTransparentToolbarBinding transparentToolbarLayout;

    public ActivityOneChangePasswordBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, FrameLayout frameLayout, OneTransparentToolbarBinding oneTransparentToolbarBinding) {
        this.f83537a = constraintLayout;
        this.layoutToolbar = constraintLayout2;
        this.oneContent = frameLayout;
        this.transparentToolbarLayout = oneTransparentToolbarBinding;
    }

    @NonNull
    public static ActivityOneChangePasswordBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.layoutToolbar;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = R.id.one_content;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.transparentToolbarLayout))) != null) {
                return new ActivityOneChangePasswordBinding((ConstraintLayout) view, constraintLayout, frameLayout, OneTransparentToolbarBinding.bind(findChildViewById));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityOneChangePasswordBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityOneChangePasswordBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_one_change_password, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83537a;
    }
}
