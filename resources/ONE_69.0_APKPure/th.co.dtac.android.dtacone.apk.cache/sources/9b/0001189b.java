package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.RvOneProfitSummaryItemBinding */
/* loaded from: classes7.dex */
public final class RvOneProfitSummaryItemBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84682a;
    @NonNull
    public final ProgressBar backgroundProgressbar;
    @NonNull
    public final ProgressBar backgroundProgressbarTrue;
    @NonNull
    public final ConstraintLayout constraintLayout;
    @NonNull
    public final Guideline guideline4;
    @NonNull
    public final Guideline guideline5;
    @NonNull
    public final ImageView imgBgChart;
    @NonNull
    public final ProgressBar statsProgressbar;
    @NonNull
    public final OneFontTextView tvDisplayLabel1;
    @NonNull
    public final OneFontTextView tvMonthly;
    @NonNull
    public final OneFontTextView tvMonthlyLabel;
    @NonNull
    public final OneFontTextView tvSummary;

    public RvOneProfitSummaryItemBinding(ConstraintLayout constraintLayout, ProgressBar progressBar, ProgressBar progressBar2, ConstraintLayout constraintLayout2, Guideline guideline, Guideline guideline2, ImageView imageView, ProgressBar progressBar3, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4) {
        this.f84682a = constraintLayout;
        this.backgroundProgressbar = progressBar;
        this.backgroundProgressbarTrue = progressBar2;
        this.constraintLayout = constraintLayout2;
        this.guideline4 = guideline;
        this.guideline5 = guideline2;
        this.imgBgChart = imageView;
        this.statsProgressbar = progressBar3;
        this.tvDisplayLabel1 = oneFontTextView;
        this.tvMonthly = oneFontTextView2;
        this.tvMonthlyLabel = oneFontTextView3;
        this.tvSummary = oneFontTextView4;
    }

    @NonNull
    public static RvOneProfitSummaryItemBinding bind(@NonNull View view) {
        int i = R.id.background_progressbar;
        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
        if (progressBar != null) {
            i = R.id.background_progressbar_true;
            ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view, i);
            if (progressBar2 != null) {
                i = R.id.constraintLayout;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout != null) {
                    i = R.id.guideline4;
                    Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                    if (guideline != null) {
                        i = R.id.guideline5;
                        Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i);
                        if (guideline2 != null) {
                            i = R.id.imgBgChart;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView != null) {
                                i = R.id.stats_progressbar;
                                ProgressBar progressBar3 = (ProgressBar) ViewBindings.findChildViewById(view, i);
                                if (progressBar3 != null) {
                                    i = R.id.tvDisplayLabel1;
                                    OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (oneFontTextView != null) {
                                        i = R.id.tvMonthly;
                                        OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (oneFontTextView2 != null) {
                                            i = R.id.tvMonthlyLabel;
                                            OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (oneFontTextView3 != null) {
                                                i = R.id.tvSummary;
                                                OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (oneFontTextView4 != null) {
                                                    return new RvOneProfitSummaryItemBinding((ConstraintLayout) view, progressBar, progressBar2, constraintLayout, guideline, guideline2, imageView, progressBar3, oneFontTextView, oneFontTextView2, oneFontTextView3, oneFontTextView4);
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
    public static RvOneProfitSummaryItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static RvOneProfitSummaryItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.rv_one_profit_summary_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84682a;
    }
}