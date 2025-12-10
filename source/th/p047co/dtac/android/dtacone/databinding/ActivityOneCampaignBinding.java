package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityOneCampaignBinding */
/* loaded from: classes7.dex */
public final class ActivityOneCampaignBinding implements ViewBinding {

    /* renamed from: a */
    public final CoordinatorLayout f83535a;
    @NonNull
    public final FrameLayout contentCampaign;
    @NonNull
    public final OneTransparentToolbarBinding incTransparentToolbar;

    public ActivityOneCampaignBinding(CoordinatorLayout coordinatorLayout, FrameLayout frameLayout, OneTransparentToolbarBinding oneTransparentToolbarBinding) {
        this.f83535a = coordinatorLayout;
        this.contentCampaign = frameLayout;
        this.incTransparentToolbar = oneTransparentToolbarBinding;
    }

    @NonNull
    public static ActivityOneCampaignBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.contentCampaign;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.incTransparentToolbar))) != null) {
            return new ActivityOneCampaignBinding((CoordinatorLayout) view, frameLayout, OneTransparentToolbarBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityOneCampaignBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityOneCampaignBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_one_campaign, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.f83535a;
    }
}
