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

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemMyCampaignDetailCurrentSummaryCalculateBinding */
/* loaded from: classes7.dex */
public final class ItemMyCampaignDetailCurrentSummaryCalculateBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f84439a;
    @NonNull
    public final RelativeLayout layoutCalCurrentSummary;
    @NonNull
    public final DtacFontTextView tvCalCurrentSummaryTitle;
    @NonNull
    public final DtacFontTextView tvCalCurrentSummaryValue;
    @NonNull
    public final View vLine;

    public ItemMyCampaignDetailCurrentSummaryCalculateBinding(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, View view) {
        this.f84439a = relativeLayout;
        this.layoutCalCurrentSummary = relativeLayout2;
        this.tvCalCurrentSummaryTitle = dtacFontTextView;
        this.tvCalCurrentSummaryValue = dtacFontTextView2;
        this.vLine = view;
    }

    @NonNull
    public static ItemMyCampaignDetailCurrentSummaryCalculateBinding bind(@NonNull View view) {
        View findChildViewById;
        RelativeLayout relativeLayout = (RelativeLayout) view;
        int i = R.id.tvCalCurrentSummaryTitle;
        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
        if (dtacFontTextView != null) {
            i = R.id.tvCalCurrentSummaryValue;
            DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.vLine))) != null) {
                return new ItemMyCampaignDetailCurrentSummaryCalculateBinding(relativeLayout, relativeLayout, dtacFontTextView, dtacFontTextView2, findChildViewById);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemMyCampaignDetailCurrentSummaryCalculateBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemMyCampaignDetailCurrentSummaryCalculateBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_my_campaign_detail_current_summary_calculate, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f84439a;
    }
}