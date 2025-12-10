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
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.RvCommissionReportDetailItemBinding */
/* loaded from: classes7.dex */
public final class RvCommissionReportDetailItemBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84568a;
    @NonNull
    public final CardView cardView2;
    @NonNull
    public final CardView cardView3;
    @NonNull
    public final LinearLayout commissionContainer;
    @NonNull
    public final Guideline contentGuildline;
    @NonNull
    public final ConstraintLayout detailHeaderContainer;
    @NonNull
    public final ImageView imageView11;
    @NonNull
    public final ConstraintLayout innerContainer;
    @NonNull
    public final ImageView ivExpand;
    @NonNull
    public final ImageView ivTypeIcon;
    @NonNull
    public final Guideline middleGuildline;
    @NonNull
    public final RecyclerView rvDetailItems;
    @NonNull
    public final DtacFontTextView tvDateAt;
    @NonNull
    public final DtacFontTextView tvLeftLabel;
    @NonNull
    public final DtacFontTextView tvLeftValue;
    @NonNull
    public final DtacFontTextView tvRightLabel;
    @NonNull
    public final DtacFontTextView tvRightValue;
    @NonNull
    public final DtacFontTextView tvTotal;
    @NonNull
    public final DtacFontTextView tvTypeTitle;
    @NonNull
    public final View vgExpandBox;
    @NonNull
    public final View view2;

    public RvCommissionReportDetailItemBinding(LinearLayout linearLayout, CardView cardView, CardView cardView2, LinearLayout linearLayout2, Guideline guideline, ConstraintLayout constraintLayout, ImageView imageView, ConstraintLayout constraintLayout2, ImageView imageView2, ImageView imageView3, Guideline guideline2, RecyclerView recyclerView, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5, DtacFontTextView dtacFontTextView6, DtacFontTextView dtacFontTextView7, View view, View view2) {
        this.f84568a = linearLayout;
        this.cardView2 = cardView;
        this.cardView3 = cardView2;
        this.commissionContainer = linearLayout2;
        this.contentGuildline = guideline;
        this.detailHeaderContainer = constraintLayout;
        this.imageView11 = imageView;
        this.innerContainer = constraintLayout2;
        this.ivExpand = imageView2;
        this.ivTypeIcon = imageView3;
        this.middleGuildline = guideline2;
        this.rvDetailItems = recyclerView;
        this.tvDateAt = dtacFontTextView;
        this.tvLeftLabel = dtacFontTextView2;
        this.tvLeftValue = dtacFontTextView3;
        this.tvRightLabel = dtacFontTextView4;
        this.tvRightValue = dtacFontTextView5;
        this.tvTotal = dtacFontTextView6;
        this.tvTypeTitle = dtacFontTextView7;
        this.vgExpandBox = view;
        this.view2 = view2;
    }

    @NonNull
    public static RvCommissionReportDetailItemBinding bind(@NonNull View view) {
        View findChildViewById;
        View findChildViewById2;
        int i = R.id.cardView2;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
        if (cardView != null) {
            i = R.id.cardView3;
            CardView cardView2 = (CardView) ViewBindings.findChildViewById(view, i);
            if (cardView2 != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                i = R.id.contentGuildline;
                Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                if (guideline != null) {
                    i = R.id.detailHeaderContainer;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout != null) {
                        i = R.id.imageView11;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            i = R.id.innerContainer;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                            if (constraintLayout2 != null) {
                                i = R.id.ivExpand;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView2 != null) {
                                    i = R.id.ivTypeIcon;
                                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView3 != null) {
                                        i = R.id.middleGuildline;
                                        Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i);
                                        if (guideline2 != null) {
                                            i = R.id.rvDetailItems;
                                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                            if (recyclerView != null) {
                                                i = R.id.tvDateAt;
                                                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (dtacFontTextView != null) {
                                                    i = R.id.tvLeftLabel;
                                                    DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (dtacFontTextView2 != null) {
                                                        i = R.id.tvLeftValue;
                                                        DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (dtacFontTextView3 != null) {
                                                            i = R.id.tvRightLabel;
                                                            DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                            if (dtacFontTextView4 != null) {
                                                                i = R.id.tvRightValue;
                                                                DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                if (dtacFontTextView5 != null) {
                                                                    i = R.id.tvTotal;
                                                                    DtacFontTextView dtacFontTextView6 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (dtacFontTextView6 != null) {
                                                                        i = R.id.tvTypeTitle;
                                                                        DtacFontTextView dtacFontTextView7 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (dtacFontTextView7 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.vgExpandBox))) != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.view2))) != null) {
                                                                            return new RvCommissionReportDetailItemBinding(linearLayout, cardView, cardView2, linearLayout, guideline, constraintLayout, imageView, constraintLayout2, imageView2, imageView3, guideline2, recyclerView, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5, dtacFontTextView6, dtacFontTextView7, findChildViewById, findChildViewById2);
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
    public static RvCommissionReportDetailItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static RvCommissionReportDetailItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.rv_commission_report_detail_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84568a;
    }
}
