package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityMrtrPre2postBinding */
/* loaded from: classes7.dex */
public final class ActivityMrtrPre2postBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83621a;
    @NonNull
    public final FrameLayout contentMrtrPre2Post;
    @NonNull
    public final ZToolbarMrtrIconSearchBinding includeToolbar;

    public ActivityMrtrPre2postBinding(ConstraintLayout constraintLayout, FrameLayout frameLayout, ZToolbarMrtrIconSearchBinding zToolbarMrtrIconSearchBinding) {
        this.f83621a = constraintLayout;
        this.contentMrtrPre2Post = frameLayout;
        this.includeToolbar = zToolbarMrtrIconSearchBinding;
    }

    @NonNull
    public static ActivityMrtrPre2postBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.contentMrtrPre2Post;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.include_toolbar))) != null) {
            return new ActivityMrtrPre2postBinding((ConstraintLayout) view, frameLayout, ZToolbarMrtrIconSearchBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityMrtrPre2postBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityMrtrPre2postBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_mrtr_pre2post, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83621a;
    }
}