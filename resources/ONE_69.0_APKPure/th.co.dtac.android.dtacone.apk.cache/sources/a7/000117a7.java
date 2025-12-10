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
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemMyCampaignDetailCurrentSummaryBinding */
/* loaded from: classes7.dex */
public final class ItemMyCampaignDetailCurrentSummaryBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f84438a;
    @NonNull
    public final ImageView ivCurrentSummary;
    @NonNull
    public final RelativeLayout layoutCurrentSummary;
    @NonNull
    public final DtacFontTextView tvCurrentSummaryTitle;
    @NonNull
    public final DtacFontTextView tvCurrentSummaryValue;
    @NonNull
    public final View vLine;

    public ItemMyCampaignDetailCurrentSummaryBinding(RelativeLayout relativeLayout, ImageView imageView, RelativeLayout relativeLayout2, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, View view) {
        this.f84438a = relativeLayout;
        this.ivCurrentSummary = imageView;
        this.layoutCurrentSummary = relativeLayout2;
        this.tvCurrentSummaryTitle = dtacFontTextView;
        this.tvCurrentSummaryValue = dtacFontTextView2;
        this.vLine = view;
    }

    @NonNull
    public static ItemMyCampaignDetailCurrentSummaryBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.ivCurrentSummary;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            i = R.id.tvCurrentSummaryTitle;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView != null) {
                i = R.id.tvCurrentSummaryValue;
                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.vLine))) != null) {
                    return new ItemMyCampaignDetailCurrentSummaryBinding(relativeLayout, imageView, relativeLayout, dtacFontTextView, dtacFontTextView2, findChildViewById);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemMyCampaignDetailCurrentSummaryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemMyCampaignDetailCurrentSummaryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_my_campaign_detail_current_summary, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f84438a;
    }
}