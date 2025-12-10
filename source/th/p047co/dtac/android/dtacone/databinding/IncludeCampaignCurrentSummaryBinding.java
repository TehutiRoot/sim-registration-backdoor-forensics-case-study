package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.IncludeCampaignCurrentSummaryBinding */
/* loaded from: classes7.dex */
public final class IncludeCampaignCurrentSummaryBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84234a;
    @NonNull
    public final LinearLayout layoutCurrentSummary;
    @NonNull
    public final RecyclerView recyclerCurrentSummary;
    @NonNull
    public final DtacFontTextView tvCurrentSummaryHeaderTitle;

    public IncludeCampaignCurrentSummaryBinding(LinearLayout linearLayout, LinearLayout linearLayout2, RecyclerView recyclerView, DtacFontTextView dtacFontTextView) {
        this.f84234a = linearLayout;
        this.layoutCurrentSummary = linearLayout2;
        this.recyclerCurrentSummary = recyclerView;
        this.tvCurrentSummaryHeaderTitle = dtacFontTextView;
    }

    @NonNull
    public static IncludeCampaignCurrentSummaryBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = R.id.recyclerCurrentSummary;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = R.id.tvCurrentSummaryHeaderTitle;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView != null) {
                return new IncludeCampaignCurrentSummaryBinding(linearLayout, linearLayout, recyclerView, dtacFontTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static IncludeCampaignCurrentSummaryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IncludeCampaignCurrentSummaryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.include_campaign_current_summary, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84234a;
    }
}
