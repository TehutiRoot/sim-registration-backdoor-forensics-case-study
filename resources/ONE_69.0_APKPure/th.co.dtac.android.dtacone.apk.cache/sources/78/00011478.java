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

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityMrtrPostpaidRegistrationBinding */
/* loaded from: classes7.dex */
public final class ActivityMrtrPostpaidRegistrationBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83619a;
    @NonNull
    public final FrameLayout composeContainer;
    @NonNull
    public final ComposeView composeView;
    @NonNull
    public final FrameLayout contentMrtrPostpaidRegistration;
    @NonNull
    public final ZToolbarMrtrIconSearchBinding includeToolbar;

    public ActivityMrtrPostpaidRegistrationBinding(ConstraintLayout constraintLayout, FrameLayout frameLayout, ComposeView composeView, FrameLayout frameLayout2, ZToolbarMrtrIconSearchBinding zToolbarMrtrIconSearchBinding) {
        this.f83619a = constraintLayout;
        this.composeContainer = frameLayout;
        this.composeView = composeView;
        this.contentMrtrPostpaidRegistration = frameLayout2;
        this.includeToolbar = zToolbarMrtrIconSearchBinding;
    }

    @NonNull
    public static ActivityMrtrPostpaidRegistrationBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.compose_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.composeView;
            ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
            if (composeView != null) {
                i = R.id.contentMrtrPostpaidRegistration;
                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.include_toolbar))) != null) {
                    return new ActivityMrtrPostpaidRegistrationBinding((ConstraintLayout) view, frameLayout, composeView, frameLayout2, ZToolbarMrtrIconSearchBinding.bind(findChildViewById));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityMrtrPostpaidRegistrationBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityMrtrPostpaidRegistrationBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_mrtr_postpaid_registration, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83619a;
    }
}