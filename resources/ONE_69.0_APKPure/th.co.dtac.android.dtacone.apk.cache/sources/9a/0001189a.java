package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.RvOneCommissionReportItemBinding */
/* loaded from: classes7.dex */
public final class RvOneCommissionReportItemBinding implements ViewBinding {

    /* renamed from: a */
    public final CardView f84681a;
    @NonNull
    public final ConstraintLayout commissionContainer;
    @NonNull
    public final View detailBarCommission;
    @NonNull
    public final ImageView imageView2;
    @NonNull
    public final ImageView profitReportCommissionImageView;
    @NonNull
    public final OneFontTextView tvCommission;
    @NonNull
    public final OneFontTextView tvCommissionDisplayLabel;
    @NonNull
    public final OneFontTextView tvCommissionHeader;
    @NonNull
    public final OneFontTextView tvCommissionRemark;

    public RvOneCommissionReportItemBinding(CardView cardView, ConstraintLayout constraintLayout, View view, ImageView imageView, ImageView imageView2, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4) {
        this.f84681a = cardView;
        this.commissionContainer = constraintLayout;
        this.detailBarCommission = view;
        this.imageView2 = imageView;
        this.profitReportCommissionImageView = imageView2;
        this.tvCommission = oneFontTextView;
        this.tvCommissionDisplayLabel = oneFontTextView2;
        this.tvCommissionHeader = oneFontTextView3;
        this.tvCommissionRemark = oneFontTextView4;
    }

    @NonNull
    public static RvOneCommissionReportItemBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.commissionContainer;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.detailBarCommission))) != null) {
            i = R.id.imageView2;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.profitReportCommissionImageView;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    i = R.id.tvCommission;
                    OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView != null) {
                        i = R.id.tvCommissionDisplayLabel;
                        OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView2 != null) {
                            i = R.id.tvCommissionHeader;
                            OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView3 != null) {
                                i = R.id.tvCommissionRemark;
                                OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView4 != null) {
                                    return new RvOneCommissionReportItemBinding((CardView) view, constraintLayout, findChildViewById, imageView, imageView2, oneFontTextView, oneFontTextView2, oneFontTextView3, oneFontTextView4);
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
    public static RvOneCommissionReportItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static RvOneCommissionReportItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.rv_one_commission_report_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CardView getRoot() {
        return this.f84681a;
    }
}