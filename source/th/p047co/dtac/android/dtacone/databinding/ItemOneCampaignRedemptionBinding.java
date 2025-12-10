package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.makeramen.roundedimageview.RoundedImageView;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemOneCampaignRedemptionBinding */
/* loaded from: classes7.dex */
public final class ItemOneCampaignRedemptionBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f84347a;
    @NonNull
    public final OneFontButton btnJoinCampaign;
    @NonNull
    public final RoundedImageView ivCampaignBanner;
    @NonNull
    public final RelativeLayout layoutCampaign;
    @NonNull
    public final OneFontTextView tvCampaignDetail;
    @NonNull
    public final OneFontTextView tvCampaignName;

    public ItemOneCampaignRedemptionBinding(RelativeLayout relativeLayout, OneFontButton oneFontButton, RoundedImageView roundedImageView, RelativeLayout relativeLayout2, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2) {
        this.f84347a = relativeLayout;
        this.btnJoinCampaign = oneFontButton;
        this.ivCampaignBanner = roundedImageView;
        this.layoutCampaign = relativeLayout2;
        this.tvCampaignDetail = oneFontTextView;
        this.tvCampaignName = oneFontTextView2;
    }

    @NonNull
    public static ItemOneCampaignRedemptionBinding bind(@NonNull View view) {
        int i = R.id.btnJoinCampaign;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.ivCampaignBanner;
            RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(view, i);
            if (roundedImageView != null) {
                RelativeLayout relativeLayout = (RelativeLayout) view;
                i = R.id.tvCampaignDetail;
                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView != null) {
                    i = R.id.tvCampaignName;
                    OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView2 != null) {
                        return new ItemOneCampaignRedemptionBinding(relativeLayout, oneFontButton, roundedImageView, relativeLayout, oneFontTextView, oneFontTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemOneCampaignRedemptionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemOneCampaignRedemptionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_one_campaign_redemption, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f84347a;
    }
}
