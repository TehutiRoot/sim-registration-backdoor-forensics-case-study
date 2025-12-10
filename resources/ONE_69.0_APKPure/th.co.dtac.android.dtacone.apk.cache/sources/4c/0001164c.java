package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneNadOutboundTrueMoveHBinding */
/* loaded from: classes7.dex */
public final class FragmentOneNadOutboundTrueMoveHBinding implements ViewBinding {

    /* renamed from: a */
    public final SwipeRefreshLayout f84091a;
    @NonNull
    public final Guideline centerGuideline;
    @NonNull
    public final ImageView dropDownOverdueItemImageView;
    @NonNull
    public final ImageView dropDownPaymentDueStatusItemImageView;
    @NonNull
    public final ImageView filterContactStatusImageView;
    @NonNull
    public final ConstraintLayout filterContactStatusLayout;
    @NonNull
    public final OneFontTextView filterContactStatusTitleTextView;
    @NonNull
    public final OneFontTextView filterContactStatusValueTextView;
    @NonNull
    public final ImageView filterDropDownItemImageView;
    @NonNull
    public final ConstraintLayout filterLayout;
    @NonNull
    public final ConstraintLayout filterOverdueBillLayout;
    @NonNull
    public final OneFontTextView filterOverdueBillTitleTextView;
    @NonNull
    public final OneFontTextView filterOverdueBillValueTextView;
    @NonNull
    public final ConstraintLayout filterPaymentDueStatusLayout;
    @NonNull
    public final OneFontTextView filterPaymentDueStatusTitleTextView;
    @NonNull
    public final OneFontTextView filterPaymentDueStatusValueTextView;
    @NonNull
    public final ConstraintLayout mainLayout;
    @NonNull
    public final RecyclerView nadOutboundRecyclerView;
    @NonNull
    public final ConstraintLayout nadOutboundRetryLayout;
    @NonNull
    public final SwipeRefreshLayout nadOutboundSwipeRefreshLayout;
    @NonNull
    public final OneFontTextView notFoundNadListTextView;
    @NonNull
    public final OneFontButton retryButton;
    @NonNull
    public final OneFontTextView retryTextView;
    @NonNull
    public final Guideline startGuideline;

    public FragmentOneNadOutboundTrueMoveHBinding(SwipeRefreshLayout swipeRefreshLayout, Guideline guideline, ImageView imageView, ImageView imageView2, ImageView imageView3, ConstraintLayout constraintLayout, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, ImageView imageView4, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, ConstraintLayout constraintLayout4, OneFontTextView oneFontTextView5, OneFontTextView oneFontTextView6, ConstraintLayout constraintLayout5, RecyclerView recyclerView, ConstraintLayout constraintLayout6, SwipeRefreshLayout swipeRefreshLayout2, OneFontTextView oneFontTextView7, OneFontButton oneFontButton, OneFontTextView oneFontTextView8, Guideline guideline2) {
        this.f84091a = swipeRefreshLayout;
        this.centerGuideline = guideline;
        this.dropDownOverdueItemImageView = imageView;
        this.dropDownPaymentDueStatusItemImageView = imageView2;
        this.filterContactStatusImageView = imageView3;
        this.filterContactStatusLayout = constraintLayout;
        this.filterContactStatusTitleTextView = oneFontTextView;
        this.filterContactStatusValueTextView = oneFontTextView2;
        this.filterDropDownItemImageView = imageView4;
        this.filterLayout = constraintLayout2;
        this.filterOverdueBillLayout = constraintLayout3;
        this.filterOverdueBillTitleTextView = oneFontTextView3;
        this.filterOverdueBillValueTextView = oneFontTextView4;
        this.filterPaymentDueStatusLayout = constraintLayout4;
        this.filterPaymentDueStatusTitleTextView = oneFontTextView5;
        this.filterPaymentDueStatusValueTextView = oneFontTextView6;
        this.mainLayout = constraintLayout5;
        this.nadOutboundRecyclerView = recyclerView;
        this.nadOutboundRetryLayout = constraintLayout6;
        this.nadOutboundSwipeRefreshLayout = swipeRefreshLayout2;
        this.notFoundNadListTextView = oneFontTextView7;
        this.retryButton = oneFontButton;
        this.retryTextView = oneFontTextView8;
        this.startGuideline = guideline2;
    }

    @NonNull
    public static FragmentOneNadOutboundTrueMoveHBinding bind(@NonNull View view) {
        int i = R.id.centerGuideline;
        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
        if (guideline != null) {
            i = R.id.dropDownOverdueItemImageView;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.dropDownPaymentDueStatusItemImageView;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    i = R.id.filterContactStatusImageView;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView3 != null) {
                        i = R.id.filterContactStatusLayout;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout != null) {
                            i = R.id.filterContactStatusTitleTextView;
                            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView != null) {
                                i = R.id.filterContactStatusValueTextView;
                                OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView2 != null) {
                                    i = R.id.filterDropDownItemImageView;
                                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView4 != null) {
                                        i = R.id.filterLayout;
                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                        if (constraintLayout2 != null) {
                                            i = R.id.filterOverdueBillLayout;
                                            ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                            if (constraintLayout3 != null) {
                                                i = R.id.filterOverdueBillTitleTextView;
                                                OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (oneFontTextView3 != null) {
                                                    i = R.id.filterOverdueBillValueTextView;
                                                    OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (oneFontTextView4 != null) {
                                                        i = R.id.filterPaymentDueStatusLayout;
                                                        ConstraintLayout constraintLayout4 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                        if (constraintLayout4 != null) {
                                                            i = R.id.filterPaymentDueStatusTitleTextView;
                                                            OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                            if (oneFontTextView5 != null) {
                                                                i = R.id.filterPaymentDueStatusValueTextView;
                                                                OneFontTextView oneFontTextView6 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                if (oneFontTextView6 != null) {
                                                                    i = R.id.mainLayout;
                                                                    ConstraintLayout constraintLayout5 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                    if (constraintLayout5 != null) {
                                                                        i = R.id.nadOutboundRecyclerView;
                                                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                                        if (recyclerView != null) {
                                                                            i = R.id.nadOutboundRetryLayout;
                                                                            ConstraintLayout constraintLayout6 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                            if (constraintLayout6 != null) {
                                                                                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view;
                                                                                i = R.id.notFoundNadListTextView;
                                                                                OneFontTextView oneFontTextView7 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                if (oneFontTextView7 != null) {
                                                                                    i = R.id.retryButton;
                                                                                    OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
                                                                                    if (oneFontButton != null) {
                                                                                        i = R.id.retryTextView;
                                                                                        OneFontTextView oneFontTextView8 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (oneFontTextView8 != null) {
                                                                                            i = R.id.startGuideline;
                                                                                            Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i);
                                                                                            if (guideline2 != null) {
                                                                                                return new FragmentOneNadOutboundTrueMoveHBinding(swipeRefreshLayout, guideline, imageView, imageView2, imageView3, constraintLayout, oneFontTextView, oneFontTextView2, imageView4, constraintLayout2, constraintLayout3, oneFontTextView3, oneFontTextView4, constraintLayout4, oneFontTextView5, oneFontTextView6, constraintLayout5, recyclerView, constraintLayout6, swipeRefreshLayout, oneFontTextView7, oneFontButton, oneFontTextView8, guideline2);
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
    public static FragmentOneNadOutboundTrueMoveHBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneNadOutboundTrueMoveHBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_nad_outbound_true_move_h, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public SwipeRefreshLayout getRoot() {
        return this.f84091a;
    }
}