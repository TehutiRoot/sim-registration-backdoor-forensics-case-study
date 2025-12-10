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

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityOneChangeOwnerBinding */
/* loaded from: classes7.dex */
public final class ActivityOneChangeOwnerBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83633a;
    @NonNull
    public final FrameLayout contentChangeOwner;
    @NonNull
    public final ComposeView contentComposeView;
    @NonNull
    public final OneToolbarBinding includeToolbar;

    public ActivityOneChangeOwnerBinding(ConstraintLayout constraintLayout, FrameLayout frameLayout, ComposeView composeView, OneToolbarBinding oneToolbarBinding) {
        this.f83633a = constraintLayout;
        this.contentChangeOwner = frameLayout;
        this.contentComposeView = composeView;
        this.includeToolbar = oneToolbarBinding;
    }

    @NonNull
    public static ActivityOneChangeOwnerBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.contentChangeOwner;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.contentComposeView;
            ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
            if (composeView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.include_toolbar))) != null) {
                return new ActivityOneChangeOwnerBinding((ConstraintLayout) view, frameLayout, composeView, OneToolbarBinding.bind(findChildViewById));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityOneChangeOwnerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityOneChangeOwnerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_one_change_owner, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83633a;
    }
}