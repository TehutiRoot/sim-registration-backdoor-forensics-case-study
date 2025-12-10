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

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityMrtrPrepaidRegistrationBinding */
/* loaded from: classes7.dex */
public final class ActivityMrtrPrepaidRegistrationBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83526a;
    @NonNull
    public final ComposeView composeView;
    @NonNull
    public final FrameLayout contentMrtrPrepaid;
    @NonNull
    public final ZToolbarBinding toolbarLayout;

    public ActivityMrtrPrepaidRegistrationBinding(ConstraintLayout constraintLayout, ComposeView composeView, FrameLayout frameLayout, ZToolbarBinding zToolbarBinding) {
        this.f83526a = constraintLayout;
        this.composeView = composeView;
        this.contentMrtrPrepaid = frameLayout;
        this.toolbarLayout = zToolbarBinding;
    }

    @NonNull
    public static ActivityMrtrPrepaidRegistrationBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.composeView;
        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
        if (composeView != null) {
            i = R.id.contentMrtrPrepaid;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.toolbarLayout))) != null) {
                return new ActivityMrtrPrepaidRegistrationBinding((ConstraintLayout) view, composeView, frameLayout, ZToolbarBinding.bind(findChildViewById));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityMrtrPrepaidRegistrationBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityMrtrPrepaidRegistrationBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_mrtr_prepaid_registration, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83526a;
    }
}
