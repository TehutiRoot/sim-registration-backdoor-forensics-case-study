package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.makeramen.roundedimageview.RoundedImageView;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemOneMyCampaignBinding */
/* loaded from: classes7.dex */
public final class ItemOneMyCampaignBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f84355a;
    @NonNull
    public final RoundedImageView ivCampaignBanner;
    @NonNull
    public final ImageView ivCampaignDetail;
    @NonNull
    public final RelativeLayout layoutCampaign;
    @NonNull
    public final OneFontTextView tvCampaignDetail;
    @NonNull
    public final OneFontTextView tvCampaignName;

    public ItemOneMyCampaignBinding(RelativeLayout relativeLayout, RoundedImageView roundedImageView, ImageView imageView, RelativeLayout relativeLayout2, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2) {
        this.f84355a = relativeLayout;
        this.ivCampaignBanner = roundedImageView;
        this.ivCampaignDetail = imageView;
        this.layoutCampaign = relativeLayout2;
        this.tvCampaignDetail = oneFontTextView;
        this.tvCampaignName = oneFontTextView2;
    }

    @NonNull
    public static ItemOneMyCampaignBinding bind(@NonNull View view) {
        int i = R.id.ivCampaignBanner;
        RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(view, i);
        if (roundedImageView != null) {
            i = R.id.ivCampaignDetail;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                RelativeLayout relativeLayout = (RelativeLayout) view;
                i = R.id.tvCampaignDetail;
                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView != null) {
                    i = R.id.tvCampaignName;
                    OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView2 != null) {
                        return new ItemOneMyCampaignBinding(relativeLayout, roundedImageView, imageView, relativeLayout, oneFontTextView, oneFontTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemOneMyCampaignBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemOneMyCampaignBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_one_my_campaign, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f84355a;
    }
}
