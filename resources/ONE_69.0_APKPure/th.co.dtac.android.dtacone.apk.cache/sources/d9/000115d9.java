package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacRecyclerView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMyCampaignDetailPointHistoryBinding */
/* loaded from: classes7.dex */
public final class FragmentMyCampaignDetailPointHistoryBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f83976a;
    @NonNull
    public final LinearLayout btnRetry;
    @NonNull
    public final LinearLayout layoutEmptyPointHistory;
    @NonNull
    public final RelativeLayout layoutProgressBar;
    @NonNull
    public final DtacRecyclerView recyclerPointHistory;
    @NonNull
    public final DtacFontTextView tvEmptyPointHistory;

    public FragmentMyCampaignDetailPointHistoryBinding(RelativeLayout relativeLayout, LinearLayout linearLayout, LinearLayout linearLayout2, RelativeLayout relativeLayout2, DtacRecyclerView dtacRecyclerView, DtacFontTextView dtacFontTextView) {
        this.f83976a = relativeLayout;
        this.btnRetry = linearLayout;
        this.layoutEmptyPointHistory = linearLayout2;
        this.layoutProgressBar = relativeLayout2;
        this.recyclerPointHistory = dtacRecyclerView;
        this.tvEmptyPointHistory = dtacFontTextView;
    }

    @NonNull
    public static FragmentMyCampaignDetailPointHistoryBinding bind(@NonNull View view) {
        int i = R.id.btnRetry;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.layoutEmptyPointHistory;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout2 != null) {
                i = R.id.layoutProgressBar;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                if (relativeLayout != null) {
                    i = R.id.recyclerPointHistory;
                    DtacRecyclerView dtacRecyclerView = (DtacRecyclerView) ViewBindings.findChildViewById(view, i);
                    if (dtacRecyclerView != null) {
                        i = R.id.tvEmptyPointHistory;
                        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView != null) {
                            return new FragmentMyCampaignDetailPointHistoryBinding((RelativeLayout) view, linearLayout, linearLayout2, relativeLayout, dtacRecyclerView, dtacFontTextView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMyCampaignDetailPointHistoryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMyCampaignDetailPointHistoryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_my_campaign_detail_point_history, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f83976a;
    }
}