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

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityUpPassTestBinding */
/* loaded from: classes7.dex */
public final class ActivityUpPassTestBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83690a;
    @NonNull
    public final ComposeView composeView;
    @NonNull
    public final FrameLayout contentUpPass;
    @NonNull
    public final OneToolbarBinding includeOneToolbar;
    @NonNull
    public final ZToolbarBinding includeToolbar;
    @NonNull
    public final ConstraintLayout layoutToolbar;
    @NonNull
    public final ConstraintLayout main;

    public ActivityUpPassTestBinding(ConstraintLayout constraintLayout, ComposeView composeView, FrameLayout frameLayout, OneToolbarBinding oneToolbarBinding, ZToolbarBinding zToolbarBinding, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3) {
        this.f83690a = constraintLayout;
        this.composeView = composeView;
        this.contentUpPass = frameLayout;
        this.includeOneToolbar = oneToolbarBinding;
        this.includeToolbar = zToolbarBinding;
        this.layoutToolbar = constraintLayout2;
        this.main = constraintLayout3;
    }

    @NonNull
    public static ActivityUpPassTestBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.composeView;
        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
        if (composeView != null) {
            i = R.id.contentUpPass;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.include_one_toolbar))) != null) {
                OneToolbarBinding bind = OneToolbarBinding.bind(findChildViewById);
                i = R.id.include_toolbar;
                View findChildViewById2 = ViewBindings.findChildViewById(view, i);
                if (findChildViewById2 != null) {
                    ZToolbarBinding bind2 = ZToolbarBinding.bind(findChildViewById2);
                    i = R.id.layoutToolbar;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout != null) {
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
                        return new ActivityUpPassTestBinding(constraintLayout2, composeView, frameLayout, bind, bind2, constraintLayout, constraintLayout2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityUpPassTestBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityUpPassTestBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_up_pass_test, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83690a;
    }
}