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
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.RvProfitSummaryItemBinding */
/* loaded from: classes7.dex */
public final class RvProfitSummaryItemBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84573a;
    @NonNull
    public final ProgressBar backgroundProgressbar;
    @NonNull
    public final ConstraintLayout constraintLayout;
    @NonNull
    public final Guideline guideline4;
    @NonNull
    public final Guideline guideline5;
    @NonNull
    public final ImageView imageView7;
    @NonNull
    public final ProgressBar statsProgressbar;
    @NonNull
    public final DtacFontTextView tvDisplayLabel1;
    @NonNull
    public final DtacFontTextView tvMonthly;
    @NonNull
    public final DtacFontTextView tvMonthlyLabel;
    @NonNull
    public final DtacFontTextView tvSummary;

    public RvProfitSummaryItemBinding(ConstraintLayout constraintLayout, ProgressBar progressBar, ConstraintLayout constraintLayout2, Guideline guideline, Guideline guideline2, ImageView imageView, ProgressBar progressBar2, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4) {
        this.f84573a = constraintLayout;
        this.backgroundProgressbar = progressBar;
        this.constraintLayout = constraintLayout2;
        this.guideline4 = guideline;
        this.guideline5 = guideline2;
        this.imageView7 = imageView;
        this.statsProgressbar = progressBar2;
        this.tvDisplayLabel1 = dtacFontTextView;
        this.tvMonthly = dtacFontTextView2;
        this.tvMonthlyLabel = dtacFontTextView3;
        this.tvSummary = dtacFontTextView4;
    }

    @NonNull
    public static RvProfitSummaryItemBinding bind(@NonNull View view) {
        int i = R.id.background_progressbar;
        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
        if (progressBar != null) {
            i = R.id.constraintLayout;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = R.id.guideline4;
                Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                if (guideline != null) {
                    i = R.id.guideline5;
                    Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i);
                    if (guideline2 != null) {
                        i = R.id.imageView7;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            i = R.id.stats_progressbar;
                            ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view, i);
                            if (progressBar2 != null) {
                                i = R.id.tvDisplayLabel1;
                                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView != null) {
                                    i = R.id.tvMonthly;
                                    DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView2 != null) {
                                        i = R.id.tvMonthlyLabel;
                                        DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (dtacFontTextView3 != null) {
                                            i = R.id.tvSummary;
                                            DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (dtacFontTextView4 != null) {
                                                return new RvProfitSummaryItemBinding((ConstraintLayout) view, progressBar, constraintLayout, guideline, guideline2, imageView, progressBar2, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4);
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
    public static RvProfitSummaryItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static RvProfitSummaryItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.rv_profit_summary_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84573a;
    }
}
