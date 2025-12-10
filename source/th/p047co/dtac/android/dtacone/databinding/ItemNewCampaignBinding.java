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
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemNewCampaignBinding */
/* loaded from: classes7.dex */
public final class ItemNewCampaignBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f84337a;
    @NonNull
    public final ImageView btnCampaignDetail;
    @NonNull
    public final RoundedImageView ivCampaignBanner;
    @NonNull
    public final RelativeLayout layoutNewCampaign;
    @NonNull
    public final DtacFontTextView tvCampaignDetail;
    @NonNull
    public final DtacFontTextView tvCampaignName;

    public ItemNewCampaignBinding(RelativeLayout relativeLayout, ImageView imageView, RoundedImageView roundedImageView, RelativeLayout relativeLayout2, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2) {
        this.f84337a = relativeLayout;
        this.btnCampaignDetail = imageView;
        this.ivCampaignBanner = roundedImageView;
        this.layoutNewCampaign = relativeLayout2;
        this.tvCampaignDetail = dtacFontTextView;
        this.tvCampaignName = dtacFontTextView2;
    }

    @NonNull
    public static ItemNewCampaignBinding bind(@NonNull View view) {
        int i = R.id.btnCampaignDetail;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.ivCampaignBanner;
            RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(view, i);
            if (roundedImageView != null) {
                RelativeLayout relativeLayout = (RelativeLayout) view;
                i = R.id.tvCampaignDetail;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    i = R.id.tvCampaignName;
                    DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView2 != null) {
                        return new ItemNewCampaignBinding(relativeLayout, imageView, roundedImageView, relativeLayout, dtacFontTextView, dtacFontTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemNewCampaignBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemNewCampaignBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_new_campaign, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f84337a;
    }
}
