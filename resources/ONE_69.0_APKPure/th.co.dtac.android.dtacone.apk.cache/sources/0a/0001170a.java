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
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentRtrOnePerformanceCommissionBinding */
/* loaded from: classes7.dex */
public final class FragmentRtrOnePerformanceCommissionBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84281a;
    @NonNull
    public final ConstraintLayout btnGotoHistory;
    @NonNull
    public final OneFontTextView commissionDate;
    @NonNull
    public final OneFontTextView commissionDateLabel;
    @NonNull
    public final OneFontTextView dtacFontTextView10;
    @NonNull
    public final OneIncErrorCannotLoadContainerBinding errorCannotLoadContainer;
    @NonNull
    public final OneIncCommissionGotoHistoryBinding gotoLoadHistoryContainer;
    @NonNull
    public final ImageView imageView6;
    @NonNull
    public final ImageView ivDownload;
    @NonNull
    public final LinearLayout linearLayout123;
    @NonNull
    public final NestedScrollView nsvSummaryCommissionContainer;
    @NonNull
    public final OneFontTextView paidDate;
    @NonNull
    public final OneFontTextView paidDateCurrentLabel;
    @NonNull
    public final OneIncludeCommissionDetailBinding scDetail;
    @NonNull
    public final ConstraintLayout scHeader;
    @NonNull
    public final ConstraintLayout summaryCommissionContainer;
    @NonNull
    public final OneFontTextView totalCommission;
    @NonNull
    public final OneFontTextView totalCommissionBath;
    @NonNull
    public final OneFontTextView tvLabel;

    public FragmentRtrOnePerformanceCommissionBinding(LinearLayout linearLayout, ConstraintLayout constraintLayout, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneIncErrorCannotLoadContainerBinding oneIncErrorCannotLoadContainerBinding, OneIncCommissionGotoHistoryBinding oneIncCommissionGotoHistoryBinding, ImageView imageView, ImageView imageView2, LinearLayout linearLayout2, NestedScrollView nestedScrollView, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5, OneIncludeCommissionDetailBinding oneIncludeCommissionDetailBinding, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, OneFontTextView oneFontTextView6, OneFontTextView oneFontTextView7, OneFontTextView oneFontTextView8) {
        this.f84281a = linearLayout;
        this.btnGotoHistory = constraintLayout;
        this.commissionDate = oneFontTextView;
        this.commissionDateLabel = oneFontTextView2;
        this.dtacFontTextView10 = oneFontTextView3;
        this.errorCannotLoadContainer = oneIncErrorCannotLoadContainerBinding;
        this.gotoLoadHistoryContainer = oneIncCommissionGotoHistoryBinding;
        this.imageView6 = imageView;
        this.ivDownload = imageView2;
        this.linearLayout123 = linearLayout2;
        this.nsvSummaryCommissionContainer = nestedScrollView;
        this.paidDate = oneFontTextView4;
        this.paidDateCurrentLabel = oneFontTextView5;
        this.scDetail = oneIncludeCommissionDetailBinding;
        this.scHeader = constraintLayout2;
        this.summaryCommissionContainer = constraintLayout3;
        this.totalCommission = oneFontTextView6;
        this.totalCommissionBath = oneFontTextView7;
        this.tvLabel = oneFontTextView8;
    }

    @NonNull
    public static FragmentRtrOnePerformanceCommissionBinding bind(@NonNull View view) {
        View findChildViewById;
        View findChildViewById2;
        int i = R.id.btnGotoHistory;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = R.id.commissionDate;
            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView != null) {
                i = R.id.commissionDateLabel;
                OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView2 != null) {
                    i = R.id.dtacFontTextView10;
                    OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView3 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.errorCannotLoadContainer))) != null) {
                        OneIncErrorCannotLoadContainerBinding bind = OneIncErrorCannotLoadContainerBinding.bind(findChildViewById);
                        i = R.id.gotoLoadHistoryContainer;
                        View findChildViewById3 = ViewBindings.findChildViewById(view, i);
                        if (findChildViewById3 != null) {
                            OneIncCommissionGotoHistoryBinding bind2 = OneIncCommissionGotoHistoryBinding.bind(findChildViewById3);
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
                                        OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (oneFontTextView4 != null) {
                                            i = R.id.paidDateCurrentLabel;
                                            OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (oneFontTextView5 != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.scDetail))) != null) {
                                                OneIncludeCommissionDetailBinding bind3 = OneIncludeCommissionDetailBinding.bind(findChildViewById2);
                                                i = R.id.scHeader;
                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                if (constraintLayout2 != null) {
                                                    i = R.id.summaryCommissionContainer;
                                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                    if (constraintLayout3 != null) {
                                                        i = R.id.totalCommission;
                                                        OneFontTextView oneFontTextView6 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (oneFontTextView6 != null) {
                                                            i = R.id.totalCommissionBath;
                                                            OneFontTextView oneFontTextView7 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                            if (oneFontTextView7 != null) {
                                                                i = R.id.tvLabel;
                                                                OneFontTextView oneFontTextView8 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                if (oneFontTextView8 != null) {
                                                                    return new FragmentRtrOnePerformanceCommissionBinding(linearLayout, constraintLayout, oneFontTextView, oneFontTextView2, oneFontTextView3, bind, bind2, imageView, imageView2, linearLayout, nestedScrollView, oneFontTextView4, oneFontTextView5, bind3, constraintLayout2, constraintLayout3, oneFontTextView6, oneFontTextView7, oneFontTextView8);
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
    public static FragmentRtrOnePerformanceCommissionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentRtrOnePerformanceCommissionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_rtr_one_performance_commission, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84281a;
    }
}