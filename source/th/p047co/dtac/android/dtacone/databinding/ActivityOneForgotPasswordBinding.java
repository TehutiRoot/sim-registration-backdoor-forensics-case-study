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

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityOneForgotPasswordBinding */
/* loaded from: classes7.dex */
public final class ActivityOneForgotPasswordBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83542a;
    @NonNull
    public final ConstraintLayout layoutToolbar;
    @NonNull
    public final FrameLayout oneContent;
    @NonNull
    public final OneTransparentToolbarTextBlackBinding transparentToolbarLayout;

    public ActivityOneForgotPasswordBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, FrameLayout frameLayout, OneTransparentToolbarTextBlackBinding oneTransparentToolbarTextBlackBinding) {
        this.f83542a = constraintLayout;
        this.layoutToolbar = constraintLayout2;
        this.oneContent = frameLayout;
        this.transparentToolbarLayout = oneTransparentToolbarTextBlackBinding;
    }

    @NonNull
    public static ActivityOneForgotPasswordBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.layoutToolbar;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = R.id.one_content;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.transparentToolbarLayout))) != null) {
                return new ActivityOneForgotPasswordBinding((ConstraintLayout) view, constraintLayout, frameLayout, OneTransparentToolbarTextBlackBinding.bind(findChildViewById));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityOneForgotPasswordBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityOneForgotPasswordBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_one_forgot_password, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83542a;
    }
}
