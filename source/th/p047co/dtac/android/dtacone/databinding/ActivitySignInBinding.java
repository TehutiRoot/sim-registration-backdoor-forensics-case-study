package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivitySignInBinding */
/* loaded from: classes7.dex */
public final class ActivitySignInBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f83585a;
    @NonNull
    public final FrameLayout contentSignIn;
    @NonNull
    public final TransparentToolbarBinding toolbarLayout;

    public ActivitySignInBinding(RelativeLayout relativeLayout, FrameLayout frameLayout, TransparentToolbarBinding transparentToolbarBinding) {
        this.f83585a = relativeLayout;
        this.contentSignIn = frameLayout;
        this.toolbarLayout = transparentToolbarBinding;
    }

    @NonNull
    public static ActivitySignInBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.contentSignIn;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.toolbarLayout))) != null) {
            return new ActivitySignInBinding((RelativeLayout) view, frameLayout, TransparentToolbarBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivitySignInBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivitySignInBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_sign_in, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f83585a;
    }
}
