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
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemMyCampaignBinding */
/* loaded from: classes7.dex */
public final class ItemMyCampaignBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f84333a;
    @NonNull
    public final RoundedImageView ivCampaignBanner;
    @NonNull
    public final RelativeLayout layoutCampaign;
    @NonNull
    public final DtacFontTextView tvCampaignDetail;
    @NonNull
    public final DtacFontTextView tvCampaignName;

    public ItemMyCampaignBinding(RelativeLayout relativeLayout, RoundedImageView roundedImageView, RelativeLayout relativeLayout2, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2) {
        this.f84333a = relativeLayout;
        this.ivCampaignBanner = roundedImageView;
        this.layoutCampaign = relativeLayout2;
        this.tvCampaignDetail = dtacFontTextView;
        this.tvCampaignName = dtacFontTextView2;
    }

    @NonNull
    public static ItemMyCampaignBinding bind(@NonNull View view) {
        int i = R.id.ivCampaignBanner;
        RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(view, i);
        if (roundedImageView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            i = R.id.tvCampaignDetail;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView != null) {
                i = R.id.tvCampaignName;
                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView2 != null) {
                    return new ItemMyCampaignBinding(relativeLayout, roundedImageView, relativeLayout, dtacFontTextView, dtacFontTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemMyCampaignBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemMyCampaignBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_my_campaign, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f84333a;
    }
}
