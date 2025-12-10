package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.p003ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityOneMnpBinding */
/* loaded from: classes7.dex */
public final class ActivityOneMnpBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83545a;
    @NonNull
    public final ComposeView contentMnoComposeView;
    @NonNull
    public final FrameLayout contentMnp;
    @NonNull
    public final OneToolbarBinding includeToolbar;

    public ActivityOneMnpBinding(ConstraintLayout constraintLayout, ComposeView composeView, FrameLayout frameLayout, OneToolbarBinding oneToolbarBinding) {
        this.f83545a = constraintLayout;
        this.contentMnoComposeView = composeView;
        this.contentMnp = frameLayout;
        this.includeToolbar = oneToolbarBinding;
    }

    @NonNull
    public static ActivityOneMnpBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.contentMnoComposeView;
        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
        if (composeView != null) {
            i = R.id.contentMnp;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.include_toolbar))) != null) {
                return new ActivityOneMnpBinding((ConstraintLayout) view, composeView, frameLayout, OneToolbarBinding.bind(findChildViewById));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityOneMnpBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityOneMnpBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_one_mnp, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83545a;
    }
}
