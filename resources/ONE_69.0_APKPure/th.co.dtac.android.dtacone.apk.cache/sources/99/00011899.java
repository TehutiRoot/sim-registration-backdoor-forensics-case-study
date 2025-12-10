package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.RvOneCommissionReportDetailItemBinding */
/* loaded from: classes7.dex */
public final class RvOneCommissionReportDetailItemBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84680a;
    @NonNull
    public final CardView cardView3;
    @NonNull
    public final LinearLayout commissionContainer;
    @NonNull
    public final Guideline contentGuildline;
    @NonNull
    public final ConstraintLayout detailHeaderContainer;
    @NonNull
    public final ConstraintLayout innerContainer;
    @NonNull
    public final CardView mainCrdView;
    @NonNull
    public final Guideline middleGuildline;
    @NonNull
    public final RecyclerView profitDetailRecyclerView;
    @NonNull
    public final OneFontTextView profitItemDateTextView;
    @NonNull
    public final ImageView profitItemExpandImageView;
    @NonNull
    public final OneFontTextView profitItemLabelLeftTextView;
    @NonNull
    public final OneFontTextView profitItemLabelTextView;
    @NonNull
    public final View profitItemLabelView;
    @NonNull
    public final ImageView profitItemPatternImageView;
    @NonNull
    public final OneFontTextView profitItemTotalTextView;
    @NonNull
    public final ImageView profitItemTypeImageView;
    @NonNull
    public final OneFontTextView profitItemTypeTextView;
    @NonNull
    public final OneFontTextView profitItemValueRightTextView;
    @NonNull
    public final OneFontTextView profitItemValueTextView;
    @NonNull
    public final View profitItemView;

    public RvOneCommissionReportDetailItemBinding(LinearLayout linearLayout, CardView cardView, LinearLayout linearLayout2, Guideline guideline, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, CardView cardView2, Guideline guideline2, RecyclerView recyclerView, OneFontTextView oneFontTextView, ImageView imageView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, View view, ImageView imageView2, OneFontTextView oneFontTextView4, ImageView imageView3, OneFontTextView oneFontTextView5, OneFontTextView oneFontTextView6, OneFontTextView oneFontTextView7, View view2) {
        this.f84680a = linearLayout;
        this.cardView3 = cardView;
        this.commissionContainer = linearLayout2;
        this.contentGuildline = guideline;
        this.detailHeaderContainer = constraintLayout;
        this.innerContainer = constraintLayout2;
        this.mainCrdView = cardView2;
        this.middleGuildline = guideline2;
        this.profitDetailRecyclerView = recyclerView;
        this.profitItemDateTextView = oneFontTextView;
        this.profitItemExpandImageView = imageView;
        this.profitItemLabelLeftTextView = oneFontTextView2;
        this.profitItemLabelTextView = oneFontTextView3;
        this.profitItemLabelView = view;
        this.profitItemPatternImageView = imageView2;
        this.profitItemTotalTextView = oneFontTextView4;
        this.profitItemTypeImageView = imageView3;
        this.profitItemTypeTextView = oneFontTextView5;
        this.profitItemValueRightTextView = oneFontTextView6;
        this.profitItemValueTextView = oneFontTextView7;
        this.profitItemView = view2;
    }

    @NonNull
    public static RvOneCommissionReportDetailItemBinding bind(@NonNull View view) {
        View findChildViewById;
        View findChildViewById2;
        int i = R.id.cardView3;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
        if (cardView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i = R.id.contentGuildline;
            Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
            if (guideline != null) {
                i = R.id.detailHeaderContainer;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout != null) {
                    i = R.id.innerContainer;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout2 != null) {
                        i = R.id.mainCrdView;
                        CardView cardView2 = (CardView) ViewBindings.findChildViewById(view, i);
                        if (cardView2 != null) {
                            i = R.id.middleGuildline;
                            Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i);
                            if (guideline2 != null) {
                                i = R.id.profitDetailRecyclerView;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                if (recyclerView != null) {
                                    i = R.id.profitItemDateTextView;
                                    OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (oneFontTextView != null) {
                                        i = R.id.profitItemExpandImageView;
                                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                        if (imageView != null) {
                                            i = R.id.profitItemLabelLeftTextView;
                                            OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (oneFontTextView2 != null) {
                                                i = R.id.profitItemLabelTextView;
                                                OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (oneFontTextView3 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.profitItemLabelView))) != null) {
                                                    i = R.id.profitItemPatternImageView;
                                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                    if (imageView2 != null) {
                                                        i = R.id.profitItemTotalTextView;
                                                        OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (oneFontTextView4 != null) {
                                                            i = R.id.profitItemTypeImageView;
                                                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                            if (imageView3 != null) {
                                                                i = R.id.profitItemTypeTextView;
                                                                OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                if (oneFontTextView5 != null) {
                                                                    i = R.id.profitItemValueRightTextView;
                                                                    OneFontTextView oneFontTextView6 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (oneFontTextView6 != null) {
                                                                        i = R.id.profitItemValueTextView;
                                                                        OneFontTextView oneFontTextView7 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (oneFontTextView7 != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.profitItemView))) != null) {
                                                                            return new RvOneCommissionReportDetailItemBinding(linearLayout, cardView, linearLayout, guideline, constraintLayout, constraintLayout2, cardView2, guideline2, recyclerView, oneFontTextView, imageView, oneFontTextView2, oneFontTextView3, findChildViewById, imageView2, oneFontTextView4, imageView3, oneFontTextView5, oneFontTextView6, oneFontTextView7, findChildViewById2);
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
    public static RvOneCommissionReportDetailItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static RvOneCommissionReportDetailItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.rv_one_commission_report_detail_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84680a;
    }
}