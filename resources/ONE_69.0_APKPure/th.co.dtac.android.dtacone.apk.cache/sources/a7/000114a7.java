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

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityOnlineRegistrationBinding */
/* loaded from: classes7.dex */
public final class ActivityOnlineRegistrationBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83666a;
    @NonNull
    public final ComposeView composeView;
    @NonNull
    public final FrameLayout onlineRegistrationContainer;
    @NonNull
    public final OneTransparentToolbarBinding onlineRegistrationToolbarLayout;

    public ActivityOnlineRegistrationBinding(ConstraintLayout constraintLayout, ComposeView composeView, FrameLayout frameLayout, OneTransparentToolbarBinding oneTransparentToolbarBinding) {
        this.f83666a = constraintLayout;
        this.composeView = composeView;
        this.onlineRegistrationContainer = frameLayout;
        this.onlineRegistrationToolbarLayout = oneTransparentToolbarBinding;
    }

    @NonNull
    public static ActivityOnlineRegistrationBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.composeView;
        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
        if (composeView != null) {
            i = R.id.onlineRegistrationContainer;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.onlineRegistrationToolbarLayout))) != null) {
                return new ActivityOnlineRegistrationBinding((ConstraintLayout) view, composeView, frameLayout, OneTransparentToolbarBinding.bind(findChildViewById));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityOnlineRegistrationBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityOnlineRegistrationBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_online_registration, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83666a;
    }
}