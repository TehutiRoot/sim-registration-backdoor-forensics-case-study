package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemCampaignRewardDescriptionBinding */
/* loaded from: classes7.dex */
public final class ItemCampaignRewardDescriptionBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f84310a;
    @NonNull
    public final DtacFontTextView tvRewardDescription;

    public ItemCampaignRewardDescriptionBinding(RelativeLayout relativeLayout, DtacFontTextView dtacFontTextView) {
        this.f84310a = relativeLayout;
        this.tvRewardDescription = dtacFontTextView;
    }

    @NonNull
    public static ItemCampaignRewardDescriptionBinding bind(@NonNull View view) {
        int i = R.id.tvRewardDescription;
        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
        if (dtacFontTextView != null) {
            return new ItemCampaignRewardDescriptionBinding((RelativeLayout) view, dtacFontTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemCampaignRewardDescriptionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemCampaignRewardDescriptionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_campaign_reward_description, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f84310a;
    }
}
