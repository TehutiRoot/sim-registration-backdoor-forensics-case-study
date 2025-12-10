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

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityUpdatePrepaidMrtrBinding */
/* loaded from: classes7.dex */
public final class ActivityUpdatePrepaidMrtrBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83691a;
    @NonNull
    public final ComposeView contentComposeView;
    @NonNull
    public final FrameLayout contentMrtrPrepaidReRegist;
    @NonNull
    public final ZToolbarBinding include3;

    public ActivityUpdatePrepaidMrtrBinding(ConstraintLayout constraintLayout, ComposeView composeView, FrameLayout frameLayout, ZToolbarBinding zToolbarBinding) {
        this.f83691a = constraintLayout;
        this.contentComposeView = composeView;
        this.contentMrtrPrepaidReRegist = frameLayout;
        this.include3 = zToolbarBinding;
    }

    @NonNull
    public static ActivityUpdatePrepaidMrtrBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.contentComposeView;
        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
        if (composeView != null) {
            i = R.id.contentMrtrPrepaidReRegist;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.include3))) != null) {
                return new ActivityUpdatePrepaidMrtrBinding((ConstraintLayout) view, composeView, frameLayout, ZToolbarBinding.bind(findChildViewById));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityUpdatePrepaidMrtrBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityUpdatePrepaidMrtrBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_update_prepaid_mrtr, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83691a;
    }
}