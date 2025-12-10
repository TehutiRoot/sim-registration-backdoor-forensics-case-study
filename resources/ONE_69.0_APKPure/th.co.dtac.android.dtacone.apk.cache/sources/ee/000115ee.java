package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.makeramen.roundedimageview.RoundedImageView;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneCampaignDetailBinding */
/* loaded from: classes7.dex */
public final class FragmentOneCampaignDetailBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f83997a;
    @NonNull
    public final RoundedImageView ivReward;
    @NonNull
    public final IncludeOneHeaderCampaignDetailBinding layoutHeader;
    @NonNull
    public final RelativeLayout layoutReward;
    @NonNull
    public final LinearLayout layoutRewardHeader;
    @NonNull
    public final NestedScrollView nestedScrollView;

    public FragmentOneCampaignDetailBinding(LinearLayout linearLayout, RoundedImageView roundedImageView, IncludeOneHeaderCampaignDetailBinding includeOneHeaderCampaignDetailBinding, RelativeLayout relativeLayout, LinearLayout linearLayout2, NestedScrollView nestedScrollView) {
        this.f83997a = linearLayout;
        this.ivReward = roundedImageView;
        this.layoutHeader = includeOneHeaderCampaignDetailBinding;
        this.layoutReward = relativeLayout;
        this.layoutRewardHeader = linearLayout2;
        this.nestedScrollView = nestedScrollView;
    }

    @NonNull
    public static FragmentOneCampaignDetailBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.ivReward;
        RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(view, i);
        if (roundedImageView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.layoutHeader))) != null) {
            IncludeOneHeaderCampaignDetailBinding bind = IncludeOneHeaderCampaignDetailBinding.bind(findChildViewById);
            i = R.id.layoutReward;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
            if (relativeLayout != null) {
                i = R.id.layoutRewardHeader;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = R.id.nestedScrollView;
                    NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                    if (nestedScrollView != null) {
                        return new FragmentOneCampaignDetailBinding((LinearLayout) view, roundedImageView, bind, relativeLayout, linearLayout, nestedScrollView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneCampaignDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneCampaignDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_campaign_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f83997a;
    }
}