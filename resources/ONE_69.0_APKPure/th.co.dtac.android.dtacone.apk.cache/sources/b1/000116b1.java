package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.yarolegovich.discretescrollview.DiscreteScrollView;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneProfitReportBinding */
/* loaded from: classes7.dex */
public final class FragmentOneProfitReportBinding implements ViewBinding {

    /* renamed from: a */
    public final SwipeRefreshLayout f84192a;
    @NonNull
    public final ImageView nextProfitSummaryImageView;
    @NonNull
    public final ImageView prevProfitSummaryImageView;
    @NonNull
    public final OneFontTextView profitReportAtTimestampTextView;
    @NonNull
    public final CardView profitReportCampaignCardView;
    @NonNull
    public final ConstraintLayout profitReportCampaignContainer;
    @NonNull
    public final OneFontTextView profitReportCampaignDisplayLabel1TextView;
    @NonNull
    public final OneFontTextView profitReportCampaignHeaderLabelTextView;
    @NonNull
    public final OneFontTextView profitReportCampaignTextView;
    @NonNull
    public final CardView profitReportCardProfitCardView;
    @NonNull
    public final RecyclerView profitReportCommissionContainer;
    @NonNull
    public final View profitReportDetailBarCampaignView;
    @NonNull
    public final View profitReportDetailBarProfitView;
    @NonNull
    public final ImageView profitReportIconBoxImageView;
    @NonNull
    public final ImageView profitReportIconDetailImageView;
    @NonNull
    public final ConstraintLayout profitReportProfitContainer;
    @NonNull
    public final NestedScrollView profitReportReportContainer;
    @NonNull
    public final OneFontButton profitReportRetryButton;
    @NonNull
    public final ConstraintLayout profitReportRetryContainer;
    @NonNull
    public final ImageView profitReportRetryImageView;
    @NonNull
    public final OneFontTextView profitReportRetryTextView;
    @NonNull
    public final DiscreteScrollView profitReportSummaryChartRecyclerView;
    @NonNull
    public final OneFontTextView profitSummaryDescriptionLabel;
    @NonNull
    public final OneFontTextView profitSummaryLabelTextView;
    @NonNull
    public final OneFontTextView profitSummaryNextMonthlyTextView;
    @NonNull
    public final OneFontTextView profitSummaryPreviousMonthlyTextView;
    @NonNull
    public final OneFontTextView profitSummaryTextView;
    @NonNull
    public final SwipeRefreshLayout swipeRefreshLayout;

    public FragmentOneProfitReportBinding(SwipeRefreshLayout swipeRefreshLayout, ImageView imageView, ImageView imageView2, OneFontTextView oneFontTextView, CardView cardView, ConstraintLayout constraintLayout, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, CardView cardView2, RecyclerView recyclerView, View view, View view2, ImageView imageView3, ImageView imageView4, ConstraintLayout constraintLayout2, NestedScrollView nestedScrollView, OneFontButton oneFontButton, ConstraintLayout constraintLayout3, ImageView imageView5, OneFontTextView oneFontTextView5, DiscreteScrollView discreteScrollView, OneFontTextView oneFontTextView6, OneFontTextView oneFontTextView7, OneFontTextView oneFontTextView8, OneFontTextView oneFontTextView9, OneFontTextView oneFontTextView10, SwipeRefreshLayout swipeRefreshLayout2) {
        this.f84192a = swipeRefreshLayout;
        this.nextProfitSummaryImageView = imageView;
        this.prevProfitSummaryImageView = imageView2;
        this.profitReportAtTimestampTextView = oneFontTextView;
        this.profitReportCampaignCardView = cardView;
        this.profitReportCampaignContainer = constraintLayout;
        this.profitReportCampaignDisplayLabel1TextView = oneFontTextView2;
        this.profitReportCampaignHeaderLabelTextView = oneFontTextView3;
        this.profitReportCampaignTextView = oneFontTextView4;
        this.profitReportCardProfitCardView = cardView2;
        this.profitReportCommissionContainer = recyclerView;
        this.profitReportDetailBarCampaignView = view;
        this.profitReportDetailBarProfitView = view2;
        this.profitReportIconBoxImageView = imageView3;
        this.profitReportIconDetailImageView = imageView4;
        this.profitReportProfitContainer = constraintLayout2;
        this.profitReportReportContainer = nestedScrollView;
        this.profitReportRetryButton = oneFontButton;
        this.profitReportRetryContainer = constraintLayout3;
        this.profitReportRetryImageView = imageView5;
        this.profitReportRetryTextView = oneFontTextView5;
        this.profitReportSummaryChartRecyclerView = discreteScrollView;
        this.profitSummaryDescriptionLabel = oneFontTextView6;
        this.profitSummaryLabelTextView = oneFontTextView7;
        this.profitSummaryNextMonthlyTextView = oneFontTextView8;
        this.profitSummaryPreviousMonthlyTextView = oneFontTextView9;
        this.profitSummaryTextView = oneFontTextView10;
        this.swipeRefreshLayout = swipeRefreshLayout2;
    }

    @NonNull
    public static FragmentOneProfitReportBinding bind(@NonNull View view) {
        View findChildViewById;
        View findChildViewById2;
        int i = R.id.nextProfitSummaryImageView;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.prevProfitSummaryImageView;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = R.id.profitReportAtTimestampTextView;
                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView != null) {
                    i = R.id.profitReportCampaignCardView;
                    CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
                    if (cardView != null) {
                        i = R.id.profitReportCampaignContainer;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout != null) {
                            i = R.id.profitReportCampaignDisplayLabel1TextView;
                            OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView2 != null) {
                                i = R.id.profitReportCampaignHeaderLabelTextView;
                                OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView3 != null) {
                                    i = R.id.profitReportCampaignTextView;
                                    OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (oneFontTextView4 != null) {
                                        i = R.id.profitReportCardProfitCardView;
                                        CardView cardView2 = (CardView) ViewBindings.findChildViewById(view, i);
                                        if (cardView2 != null) {
                                            i = R.id.profitReportCommissionContainer;
                                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                            if (recyclerView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.profitReportDetailBarCampaignView))) != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.profitReportDetailBarProfitView))) != null) {
                                                i = R.id.profitReportIconBoxImageView;
                                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                if (imageView3 != null) {
                                                    i = R.id.profitReportIconDetailImageView;
                                                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                    if (imageView4 != null) {
                                                        i = R.id.profitReportProfitContainer;
                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                        if (constraintLayout2 != null) {
                                                            i = R.id.profitReportReportContainer;
                                                            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                                                            if (nestedScrollView != null) {
                                                                i = R.id.profitReportRetryButton;
                                                                OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
                                                                if (oneFontButton != null) {
                                                                    i = R.id.profitReportRetryContainer;
                                                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                    if (constraintLayout3 != null) {
                                                                        i = R.id.profitReportRetryImageView;
                                                                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                        if (imageView5 != null) {
                                                                            i = R.id.profitReportRetryTextView;
                                                                            OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (oneFontTextView5 != null) {
                                                                                i = R.id.profitReportSummaryChartRecyclerView;
                                                                                DiscreteScrollView discreteScrollView = (DiscreteScrollView) ViewBindings.findChildViewById(view, i);
                                                                                if (discreteScrollView != null) {
                                                                                    i = R.id.profitSummaryDescriptionLabel;
                                                                                    OneFontTextView oneFontTextView6 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (oneFontTextView6 != null) {
                                                                                        i = R.id.profitSummaryLabelTextView;
                                                                                        OneFontTextView oneFontTextView7 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (oneFontTextView7 != null) {
                                                                                            i = R.id.profitSummaryNextMonthlyTextView;
                                                                                            OneFontTextView oneFontTextView8 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                            if (oneFontTextView8 != null) {
                                                                                                i = R.id.profitSummaryPreviousMonthlyTextView;
                                                                                                OneFontTextView oneFontTextView9 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                if (oneFontTextView9 != null) {
                                                                                                    i = R.id.profitSummaryTextView;
                                                                                                    OneFontTextView oneFontTextView10 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                    if (oneFontTextView10 != null) {
                                                                                                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view;
                                                                                                        return new FragmentOneProfitReportBinding(swipeRefreshLayout, imageView, imageView2, oneFontTextView, cardView, constraintLayout, oneFontTextView2, oneFontTextView3, oneFontTextView4, cardView2, recyclerView, findChildViewById, findChildViewById2, imageView3, imageView4, constraintLayout2, nestedScrollView, oneFontButton, constraintLayout3, imageView5, oneFontTextView5, discreteScrollView, oneFontTextView6, oneFontTextView7, oneFontTextView8, oneFontTextView9, oneFontTextView10, swipeRefreshLayout);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneProfitReportBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneProfitReportBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_profit_report, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public SwipeRefreshLayout getRoot() {
        return this.f84192a;
    }
}