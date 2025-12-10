package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentRtrPerformanceCommissionBinding */
/* loaded from: classes7.dex */
public final class FragmentRtrPerformanceCommissionBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84181a;
    @NonNull
    public final ConstraintLayout btnGotoHistory;
    @NonNull
    public final DtacFontTextView commissionDate;
    @NonNull
    public final DtacFontTextView commissionDateLabel;
    @NonNull
    public final DtacFontTextView dtacFontTextView10;
    @NonNull
    public final ZIncErrorCannotLoadContainerBinding errorCannotLoadContaner;
    @NonNull
    public final ZIncGotoHistoryBinding gotoLoadHistoryContainer;
    @NonNull
    public final ImageView imageView6;
    @NonNull
    public final ImageView ivDownload;
    @NonNull
    public final LinearLayout linearLayout123;
    @NonNull
    public final NestedScrollView nsvSummaryCommissionContainer;
    @NonNull
    public final DtacFontTextView paidDate;
    @NonNull
    public final DtacFontTextView paidDateCurrentLabel;
    @NonNull
    public final ZIncCommissionDetailBinding scDetail;
    @NonNull
    public final ConstraintLayout scHeader;
    @NonNull
    public final ConstraintLayout summaryCommissionContainer;
    @NonNull
    public final DtacFontTextView totalCommission;
    @NonNull
    public final DtacFontTextView totalCommissionBath;
    @NonNull
    public final DtacFontTextView tvLabel;

    public FragmentRtrPerformanceCommissionBinding(LinearLayout linearLayout, ConstraintLayout constraintLayout, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, ZIncErrorCannotLoadContainerBinding zIncErrorCannotLoadContainerBinding, ZIncGotoHistoryBinding zIncGotoHistoryBinding, ImageView imageView, ImageView imageView2, LinearLayout linearLayout2, NestedScrollView nestedScrollView, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5, ZIncCommissionDetailBinding zIncCommissionDetailBinding, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, DtacFontTextView dtacFontTextView6, DtacFontTextView dtacFontTextView7, DtacFontTextView dtacFontTextView8) {
        this.f84181a = linearLayout;
        this.btnGotoHistory = constraintLayout;
        this.commissionDate = dtacFontTextView;
        this.commissionDateLabel = dtacFontTextView2;
        this.dtacFontTextView10 = dtacFontTextView3;
        this.errorCannotLoadContaner = zIncErrorCannotLoadContainerBinding;
        this.gotoLoadHistoryContainer = zIncGotoHistoryBinding;
        this.imageView6 = imageView;
        this.ivDownload = imageView2;
        this.linearLayout123 = linearLayout2;
        this.nsvSummaryCommissionContainer = nestedScrollView;
        this.paidDate = dtacFontTextView4;
        this.paidDateCurrentLabel = dtacFontTextView5;
        this.scDetail = zIncCommissionDetailBinding;
        this.scHeader = constraintLayout2;
        this.summaryCommissionContainer = constraintLayout3;
        this.totalCommission = dtacFontTextView6;
        this.totalCommissionBath = dtacFontTextView7;
        this.tvLabel = dtacFontTextView8;
    }

    @NonNull
    public static FragmentRtrPerformanceCommissionBinding bind(@NonNull View view) {
        View findChildViewById;
        View findChildViewById2;
        int i = R.id.btnGotoHistory;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = R.id.commissionDate;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView != null) {
                i = R.id.commissionDateLabel;
                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView2 != null) {
                    i = R.id.dtacFontTextView10;
                    DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView3 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.errorCannotLoadContaner))) != null) {
                        ZIncErrorCannotLoadContainerBinding bind = ZIncErrorCannotLoadContainerBinding.bind(findChildViewById);
                        i = R.id.gotoLoadHistoryContainer;
                        View findChildViewById3 = ViewBindings.findChildViewById(view, i);
                        if (findChildViewById3 != null) {
                            ZIncGotoHistoryBinding bind2 = ZIncGotoHistoryBinding.bind(findChildViewById3);
                            i = R.id.imageView6;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView != null) {
                                i = R.id.ivDownload;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView2 != null) {
                                    LinearLayout linearLayout = (LinearLayout) view;
                                    i = R.id.nsvSummaryCommissionContainer;
                                    NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                                    if (nestedScrollView != null) {
                                        i = R.id.paidDate;
                                        DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (dtacFontTextView4 != null) {
                                            i = R.id.paidDateCurrentLabel;
                                            DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (dtacFontTextView5 != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.scDetail))) != null) {
                                                ZIncCommissionDetailBinding bind3 = ZIncCommissionDetailBinding.bind(findChildViewById2);
                                                i = R.id.scHeader;
                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                if (constraintLayout2 != null) {
                                                    i = R.id.summaryCommissionContainer;
                                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                    if (constraintLayout3 != null) {
                                                        i = R.id.totalCommission;
                                                        DtacFontTextView dtacFontTextView6 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (dtacFontTextView6 != null) {
                                                            i = R.id.totalCommissionBath;
                                                            DtacFontTextView dtacFontTextView7 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                            if (dtacFontTextView7 != null) {
                                                                i = R.id.tvLabel;
                                                                DtacFontTextView dtacFontTextView8 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                if (dtacFontTextView8 != null) {
                                                                    return new FragmentRtrPerformanceCommissionBinding(linearLayout, constraintLayout, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, bind, bind2, imageView, imageView2, linearLayout, nestedScrollView, dtacFontTextView4, dtacFontTextView5, bind3, constraintLayout2, constraintLayout3, dtacFontTextView6, dtacFontTextView7, dtacFontTextView8);
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
    public static FragmentRtrPerformanceCommissionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentRtrPerformanceCommissionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_rtr_performance_commission, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84181a;
    }
}
