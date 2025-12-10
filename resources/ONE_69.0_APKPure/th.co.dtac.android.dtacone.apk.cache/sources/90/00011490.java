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

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityOneNadOutboundBinding */
/* loaded from: classes7.dex */
public final class ActivityOneNadOutboundBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83643a;
    @NonNull
    public final FrameLayout contentNadOutbound;
    @NonNull
    public final ComposeView contentNadOutboundComposeView;
    @NonNull
    public final OneTransparentToolbarBinding includeToolbar;
    @NonNull
    public final ConstraintLayout main;

    public ActivityOneNadOutboundBinding(ConstraintLayout constraintLayout, FrameLayout frameLayout, ComposeView composeView, OneTransparentToolbarBinding oneTransparentToolbarBinding, ConstraintLayout constraintLayout2) {
        this.f83643a = constraintLayout;
        this.contentNadOutbound = frameLayout;
        this.contentNadOutboundComposeView = composeView;
        this.includeToolbar = oneTransparentToolbarBinding;
        this.main = constraintLayout2;
    }

    @NonNull
    public static ActivityOneNadOutboundBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.contentNadOutbound;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.contentNadOutboundComposeView;
            ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
            if (composeView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.include_toolbar))) != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                return new ActivityOneNadOutboundBinding(constraintLayout, frameLayout, composeView, OneTransparentToolbarBinding.bind(findChildViewById), constraintLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityOneNadOutboundBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityOneNadOutboundBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_one_nad_outbound, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83643a;
    }
}