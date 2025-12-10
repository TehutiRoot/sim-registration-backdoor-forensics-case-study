package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.AppBarLayout;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.loading.DtacSwipeRefresh;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacTabLayout;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentCampaignHappyPointDetailBinding */
/* loaded from: classes7.dex */
public final class FragmentCampaignHappyPointDetailBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f83663a;
    @NonNull
    public final AppBarLayout appBar;
    @NonNull
    public final LinearLayout contentList;
    @NonNull
    public final IncludeCampaignCurrentSummaryBinding layoutCurrentSummary;
    @NonNull
    public final IncludeHeaderCampaignDetailBinding layoutHeader;
    @NonNull
    public final CoordinatorLayout rootLayout;
    @NonNull
    public final DtacSwipeRefresh swipeRefresh;
    @NonNull
    public final DtacTabLayout tabLayout;
    @NonNull
    public final DtacFontTextView tvDisplayDate;
    @NonNull
    public final ViewPager viewPager;

    public FragmentCampaignHappyPointDetailBinding(FrameLayout frameLayout, AppBarLayout appBarLayout, LinearLayout linearLayout, IncludeCampaignCurrentSummaryBinding includeCampaignCurrentSummaryBinding, IncludeHeaderCampaignDetailBinding includeHeaderCampaignDetailBinding, CoordinatorLayout coordinatorLayout, DtacSwipeRefresh dtacSwipeRefresh, DtacTabLayout dtacTabLayout, DtacFontTextView dtacFontTextView, ViewPager viewPager) {
        this.f83663a = frameLayout;
        this.appBar = appBarLayout;
        this.contentList = linearLayout;
        this.layoutCurrentSummary = includeCampaignCurrentSummaryBinding;
        this.layoutHeader = includeHeaderCampaignDetailBinding;
        this.rootLayout = coordinatorLayout;
        this.swipeRefresh = dtacSwipeRefresh;
        this.tabLayout = dtacTabLayout;
        this.tvDisplayDate = dtacFontTextView;
        this.viewPager = viewPager;
    }

    @NonNull
    public static FragmentCampaignHappyPointDetailBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.appBar;
        AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, i);
        if (appBarLayout != null) {
            i = R.id.contentList;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.layoutCurrentSummary))) != null) {
                IncludeCampaignCurrentSummaryBinding bind = IncludeCampaignCurrentSummaryBinding.bind(findChildViewById);
                i = R.id.layoutHeader;
                View findChildViewById2 = ViewBindings.findChildViewById(view, i);
                if (findChildViewById2 != null) {
                    IncludeHeaderCampaignDetailBinding bind2 = IncludeHeaderCampaignDetailBinding.bind(findChildViewById2);
                    i = R.id.rootLayout;
                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(view, i);
                    if (coordinatorLayout != null) {
                        i = R.id.swipeRefresh;
                        DtacSwipeRefresh dtacSwipeRefresh = (DtacSwipeRefresh) ViewBindings.findChildViewById(view, i);
                        if (dtacSwipeRefresh != null) {
                            i = R.id.tabLayout;
                            DtacTabLayout dtacTabLayout = (DtacTabLayout) ViewBindings.findChildViewById(view, i);
                            if (dtacTabLayout != null) {
                                i = R.id.tvDisplayDate;
                                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView != null) {
                                    i = R.id.viewPager;
                                    ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, i);
                                    if (viewPager != null) {
                                        return new FragmentCampaignHappyPointDetailBinding((FrameLayout) view, appBarLayout, linearLayout, bind, bind2, coordinatorLayout, dtacSwipeRefresh, dtacTabLayout, dtacFontTextView, viewPager);
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
    public static FragmentCampaignHappyPointDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentCampaignHappyPointDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_campaign_happy_point_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f83663a;
    }
}
