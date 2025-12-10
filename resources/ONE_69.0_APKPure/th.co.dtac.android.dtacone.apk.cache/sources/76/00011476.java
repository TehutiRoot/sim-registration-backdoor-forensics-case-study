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

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityMrtrChangeSimBinding */
/* loaded from: classes7.dex */
public final class ActivityMrtrChangeSimBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83617a;
    @NonNull
    public final ComposeView composeView;
    @NonNull
    public final FrameLayout contentContainer;
    @NonNull
    public final ZToolbarBinding includeToolbar;
    @NonNull
    public final ConstraintLayout layoutToolbar;
    @NonNull
    public final MrtrTransparentToolbarBinding transparentToolbarLayout;

    public ActivityMrtrChangeSimBinding(ConstraintLayout constraintLayout, ComposeView composeView, FrameLayout frameLayout, ZToolbarBinding zToolbarBinding, ConstraintLayout constraintLayout2, MrtrTransparentToolbarBinding mrtrTransparentToolbarBinding) {
        this.f83617a = constraintLayout;
        this.composeView = composeView;
        this.contentContainer = frameLayout;
        this.includeToolbar = zToolbarBinding;
        this.layoutToolbar = constraintLayout2;
        this.transparentToolbarLayout = mrtrTransparentToolbarBinding;
    }

    @NonNull
    public static ActivityMrtrChangeSimBinding bind(@NonNull View view) {
        View findChildViewById;
        View findChildViewById2;
        int i = R.id.composeView;
        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
        if (composeView != null) {
            i = R.id.contentContainer;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.include_toolbar))) != null) {
                ZToolbarBinding bind = ZToolbarBinding.bind(findChildViewById);
                i = R.id.layoutToolbar;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.transparentToolbarLayout))) != null) {
                    return new ActivityMrtrChangeSimBinding((ConstraintLayout) view, composeView, frameLayout, bind, constraintLayout, MrtrTransparentToolbarBinding.bind(findChildViewById2));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityMrtrChangeSimBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityMrtrChangeSimBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_mrtr_change_sim, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83617a;
    }
}