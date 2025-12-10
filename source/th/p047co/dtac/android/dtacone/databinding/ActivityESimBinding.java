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

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityESimBinding */
/* loaded from: classes7.dex */
public final class ActivityESimBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83513a;
    @NonNull
    public final FrameLayout composeContainer;
    @NonNull
    public final ComposeView composeView;
    @NonNull
    public final FrameLayout contentESim;
    @NonNull
    public final ZToolbarMrtrIconSearchBinding includeToolbar;
    @NonNull
    public final ConstraintLayout layoutToolbar;
    @NonNull
    public final MrtrTransparentToolbarBinding transparentToolbarLayout;

    public ActivityESimBinding(ConstraintLayout constraintLayout, FrameLayout frameLayout, ComposeView composeView, FrameLayout frameLayout2, ZToolbarMrtrIconSearchBinding zToolbarMrtrIconSearchBinding, ConstraintLayout constraintLayout2, MrtrTransparentToolbarBinding mrtrTransparentToolbarBinding) {
        this.f83513a = constraintLayout;
        this.composeContainer = frameLayout;
        this.composeView = composeView;
        this.contentESim = frameLayout2;
        this.includeToolbar = zToolbarMrtrIconSearchBinding;
        this.layoutToolbar = constraintLayout2;
        this.transparentToolbarLayout = mrtrTransparentToolbarBinding;
    }

    @NonNull
    public static ActivityESimBinding bind(@NonNull View view) {
        View findChildViewById;
        View findChildViewById2;
        int i = R.id.compose_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.composeView;
            ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
            if (composeView != null) {
                i = R.id.contentESim;
                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.include_toolbar))) != null) {
                    ZToolbarMrtrIconSearchBinding bind = ZToolbarMrtrIconSearchBinding.bind(findChildViewById);
                    i = R.id.layoutToolbar;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.transparentToolbarLayout))) != null) {
                        return new ActivityESimBinding((ConstraintLayout) view, frameLayout, composeView, frameLayout2, bind, constraintLayout, MrtrTransparentToolbarBinding.bind(findChildViewById2));
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityESimBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityESimBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_e_sim, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83513a;
    }
}
