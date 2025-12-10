package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.loading.DtacSwipeRefresh;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentCampaignListBinding */
/* loaded from: classes7.dex */
public final class FragmentCampaignListBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f83664a;
    @NonNull
    public final DtacFontButton btnConfirm;
    @NonNull
    public final LinearLayout layoutCampaignRedemptionList;
    @NonNull
    public final LinearLayout layoutEmptyCampaignList;
    @NonNull
    public final LinearLayout layoutMyCampaignList;
    @NonNull
    public final LinearLayout layoutNewCampaignList;
    @NonNull
    public final LinearLayout layoutNewCampaignListEmpty;
    @NonNull
    public final NestedScrollView nestedScrollView;
    @NonNull
    public final RecyclerView recyclerCampaignRedemption;
    @NonNull
    public final RecyclerView recyclerMyCampaign;
    @NonNull
    public final RecyclerView recyclerNewCampaign;
    @NonNull
    public final DtacSwipeRefresh swipeContainer;

    public FragmentCampaignListBinding(FrameLayout frameLayout, DtacFontButton dtacFontButton, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, NestedScrollView nestedScrollView, RecyclerView recyclerView, RecyclerView recyclerView2, RecyclerView recyclerView3, DtacSwipeRefresh dtacSwipeRefresh) {
        this.f83664a = frameLayout;
        this.btnConfirm = dtacFontButton;
        this.layoutCampaignRedemptionList = linearLayout;
        this.layoutEmptyCampaignList = linearLayout2;
        this.layoutMyCampaignList = linearLayout3;
        this.layoutNewCampaignList = linearLayout4;
        this.layoutNewCampaignListEmpty = linearLayout5;
        this.nestedScrollView = nestedScrollView;
        this.recyclerCampaignRedemption = recyclerView;
        this.recyclerMyCampaign = recyclerView2;
        this.recyclerNewCampaign = recyclerView3;
        this.swipeContainer = dtacSwipeRefresh;
    }

    @NonNull
    public static FragmentCampaignListBinding bind(@NonNull View view) {
        int i = R.id.btnConfirm;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.layoutCampaignRedemptionList;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = R.id.layoutEmptyCampaignList;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout2 != null) {
                    i = R.id.layoutMyCampaignList;
                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout3 != null) {
                        i = R.id.layoutNewCampaignList;
                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout4 != null) {
                            i = R.id.layoutNewCampaignListEmpty;
                            LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout5 != null) {
                                i = R.id.nestedScrollView;
                                NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                                if (nestedScrollView != null) {
                                    i = R.id.recyclerCampaignRedemption;
                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                    if (recyclerView != null) {
                                        i = R.id.recyclerMyCampaign;
                                        RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                        if (recyclerView2 != null) {
                                            i = R.id.recyclerNewCampaign;
                                            RecyclerView recyclerView3 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                            if (recyclerView3 != null) {
                                                i = R.id.swipeContainer;
                                                DtacSwipeRefresh dtacSwipeRefresh = (DtacSwipeRefresh) ViewBindings.findChildViewById(view, i);
                                                if (dtacSwipeRefresh != null) {
                                                    return new FragmentCampaignListBinding((FrameLayout) view, dtacFontButton, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, nestedScrollView, recyclerView, recyclerView2, recyclerView3, dtacSwipeRefresh);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentCampaignListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentCampaignListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_campaign_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f83664a;
    }
}
