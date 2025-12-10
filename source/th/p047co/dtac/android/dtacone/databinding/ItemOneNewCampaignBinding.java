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

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemOneNewCampaignBinding */
/* loaded from: classes7.dex */
public final class ItemOneNewCampaignBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f84356a;
    @NonNull
    public final ImageView btnCampaignDetail;
    @NonNull
    public final RoundedImageView ivCampaignBanner;
    @NonNull
    public final RelativeLayout layoutNewCampaign;
    @NonNull
    public final OneFontTextView tvCampaignDetail;
    @NonNull
    public final OneFontTextView tvCampaignName;

    public ItemOneNewCampaignBinding(RelativeLayout relativeLayout, ImageView imageView, RoundedImageView roundedImageView, RelativeLayout relativeLayout2, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2) {
        this.f84356a = relativeLayout;
        this.btnCampaignDetail = imageView;
        this.ivCampaignBanner = roundedImageView;
        this.layoutNewCampaign = relativeLayout2;
        this.tvCampaignDetail = oneFontTextView;
        this.tvCampaignName = oneFontTextView2;
    }

    @NonNull
    public static ItemOneNewCampaignBinding bind(@NonNull View view) {
        int i = R.id.btnCampaignDetail;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
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
                        return new ItemOneNewCampaignBinding(relativeLayout, imageView, roundedImageView, relativeLayout, oneFontTextView, oneFontTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemOneNewCampaignBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemOneNewCampaignBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_one_new_campaign, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f84356a;
    }
}
