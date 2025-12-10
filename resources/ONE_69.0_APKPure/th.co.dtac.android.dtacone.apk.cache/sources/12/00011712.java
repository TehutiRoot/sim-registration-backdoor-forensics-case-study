package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.yarolegovich.discretescrollview.DiscreteScrollView;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentRtrProfitReportBinding */
/* loaded from: classes7.dex */
public final class FragmentRtrProfitReportBinding implements ViewBinding {

    /* renamed from: a */
    public final SwipeRefreshLayout f84289a;
    @NonNull
    public final ConstraintLayout campaignContainer;
    @NonNull
    public final RecyclerView commissionContainer;
    @NonNull
    public final View detailBarCampaign;
    @NonNull
    public final View detailBarProfit;
    @NonNull
    public final Button ibRetry;
    @NonNull
    public final ImageView imageView10;
    @NonNull
    public final ImageView imageView4;
    @NonNull
    public final ImageView imageView5;
    @NonNull
    public final ImageView ivNext;
    @NonNull
    public final ImageView ivPrev;
    @NonNull
    public final ConstraintLayout profitContainer;
    @NonNull
    public final NestedScrollView reportContainer;
    @NonNull
    public final ConstraintLayout retryContainer;
    @NonNull
    public final DiscreteScrollView rvSummaryChart;
    @NonNull
    public final SwipeRefreshLayout swiperefreshLayout;
    @NonNull
    public final DtacFontTextView textView2;
    @NonNull
    public final DtacFontTextView tvCampaign;
    @NonNull
    public final DtacFontTextView tvCampaignDisplayLabel1;
    @NonNull
    public final DtacFontTextView tvCampaignHeaderLabel;
    @NonNull
    public final DtacFontTextView tvNextMonthly;
    @NonNull
    public final DtacFontTextView tvPrevMonthly;
    @NonNull
    public final DtacFontTextView tvProfit;
    @NonNull
    public final DtacFontTextView tvProfitDisplayLabel1;
    @NonNull
    public final DtacFontTextView tvProfitLabel;
    @NonNull
    public final DtacFontTextView tvReportAtTimestamp;

    public FragmentRtrProfitReportBinding(SwipeRefreshLayout swipeRefreshLayout, ConstraintLayout constraintLayout, RecyclerView recyclerView, View view, View view2, Button button, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ConstraintLayout constraintLayout2, NestedScrollView nestedScrollView, ConstraintLayout constraintLayout3, DiscreteScrollView discreteScrollView, SwipeRefreshLayout swipeRefreshLayout2, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5, DtacFontTextView dtacFontTextView6, DtacFontTextView dtacFontTextView7, DtacFontTextView dtacFontTextView8, DtacFontTextView dtacFontTextView9, DtacFontTextView dtacFontTextView10) {
        this.f84289a = swipeRefreshLayout;
        this.campaignContainer = constraintLayout;
        this.commissionContainer = recyclerView;
        this.detailBarCampaign = view;
        this.detailBarProfit = view2;
        this.ibRetry = button;
        this.imageView10 = imageView;
        this.imageView4 = imageView2;
        this.imageView5 = imageView3;
        this.ivNext = imageView4;
        this.ivPrev = imageView5;
        this.profitContainer = constraintLayout2;
        this.reportContainer = nestedScrollView;
        this.retryContainer = constraintLayout3;
        this.rvSummaryChart = discreteScrollView;
        this.swiperefreshLayout = swipeRefreshLayout2;
        this.textView2 = dtacFontTextView;
        this.tvCampaign = dtacFontTextView2;
        this.tvCampaignDisplayLabel1 = dtacFontTextView3;
        this.tvCampaignHeaderLabel = dtacFontTextView4;
        this.tvNextMonthly = dtacFontTextView5;
        this.tvPrevMonthly = dtacFontTextView6;
        this.tvProfit = dtacFontTextView7;
        this.tvProfitDisplayLabel1 = dtacFontTextView8;
        this.tvProfitLabel = dtacFontTextView9;
        this.tvReportAtTimestamp = dtacFontTextView10;
    }

    @NonNull
    public static FragmentRtrProfitReportBinding bind(@NonNull View view) {
        View findChildViewById;
        View findChildViewById2;
        int i = R.id.campaignContainer;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = R.id.commissionContainer;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.detailBarCampaign))) != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.detailBarProfit))) != null) {
                i = R.id.ibRetry;
                Button button = (Button) ViewBindings.findChildViewById(view, i);
                if (button != null) {
                    i = R.id.imageView10;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R.id.imageView4;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView2 != null) {
                            i = R.id.imageView5;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView3 != null) {
                                i = R.id.ivNext;
                                ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView4 != null) {
                                    i = R.id.ivPrev;
                                    ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView5 != null) {
                                        i = R.id.profitContainer;
                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                        if (constraintLayout2 != null) {
                                            i = R.id.reportContainer;
                                            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                                            if (nestedScrollView != null) {
                                                i = R.id.retryContainer;
                                                ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                if (constraintLayout3 != null) {
                                                    i = R.id.rvSummaryChart;
                                                    DiscreteScrollView discreteScrollView = (DiscreteScrollView) ViewBindings.findChildViewById(view, i);
                                                    if (discreteScrollView != null) {
                                                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view;
                                                        i = R.id.textView2;
                                                        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (dtacFontTextView != null) {
                                                            i = R.id.tvCampaign;
                                                            DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                            if (dtacFontTextView2 != null) {
                                                                i = R.id.tvCampaignDisplayLabel1;
                                                                DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                if (dtacFontTextView3 != null) {
                                                                    i = R.id.tvCampaignHeaderLabel;
                                                                    DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (dtacFontTextView4 != null) {
                                                                        i = R.id.tvNextMonthly;
                                                                        DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (dtacFontTextView5 != null) {
                                                                            i = R.id.tvPrevMonthly;
                                                                            DtacFontTextView dtacFontTextView6 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (dtacFontTextView6 != null) {
                                                                                i = R.id.tvProfit;
                                                                                DtacFontTextView dtacFontTextView7 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                if (dtacFontTextView7 != null) {
                                                                                    i = R.id.tvProfitDisplayLabel1;
                                                                                    DtacFontTextView dtacFontTextView8 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (dtacFontTextView8 != null) {
                                                                                        i = R.id.tvProfitLabel;
                                                                                        DtacFontTextView dtacFontTextView9 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (dtacFontTextView9 != null) {
                                                                                            i = R.id.tvReportAtTimestamp;
                                                                                            DtacFontTextView dtacFontTextView10 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                            if (dtacFontTextView10 != null) {
                                                                                                return new FragmentRtrProfitReportBinding(swipeRefreshLayout, constraintLayout, recyclerView, findChildViewById, findChildViewById2, button, imageView, imageView2, imageView3, imageView4, imageView5, constraintLayout2, nestedScrollView, constraintLayout3, discreteScrollView, swipeRefreshLayout, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5, dtacFontTextView6, dtacFontTextView7, dtacFontTextView8, dtacFontTextView9, dtacFontTextView10);
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
    public static FragmentRtrProfitReportBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentRtrProfitReportBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_rtr_profit_report, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public SwipeRefreshLayout getRoot() {
        return this.f84289a;
    }
}