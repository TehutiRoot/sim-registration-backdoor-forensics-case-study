package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.RecyclerViewMonthlyCommissionItemBinding */
/* loaded from: classes7.dex */
public final class RecyclerViewMonthlyCommissionItemBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84670a;
    @NonNull
    public final DtacFontTextView barWarnningMessage;
    @NonNull
    public final ConstraintLayout body;
    @NonNull
    public final ConstraintLayout commissionHistoryHeader;
    @NonNull
    public final DtacFontTextView dtacFontTextView16;
    @NonNull
    public final DtacFontTextView dtacFontTextView17;
    @NonNull
    public final DtacFontTextView dtacOnlinePaidTypeLabel;
    @NonNull
    public final DtacFontTextView dtacOnlinePaidTypeValue;
    @NonNull
    public final Guideline guideline3;
    @NonNull
    public final DtacFontTextView paidDate;
    @NonNull
    public final DtacFontTextView paidTypeLabel;
    @NonNull
    public final DtacFontTextView paidTypeValue;
    @NonNull
    public final DtacFontTextView totalCommission;

    public RecyclerViewMonthlyCommissionItemBinding(ConstraintLayout constraintLayout, DtacFontTextView dtacFontTextView, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5, Guideline guideline, DtacFontTextView dtacFontTextView6, DtacFontTextView dtacFontTextView7, DtacFontTextView dtacFontTextView8, DtacFontTextView dtacFontTextView9) {
        this.f84670a = constraintLayout;
        this.barWarnningMessage = dtacFontTextView;
        this.body = constraintLayout2;
        this.commissionHistoryHeader = constraintLayout3;
        this.dtacFontTextView16 = dtacFontTextView2;
        this.dtacFontTextView17 = dtacFontTextView3;
        this.dtacOnlinePaidTypeLabel = dtacFontTextView4;
        this.dtacOnlinePaidTypeValue = dtacFontTextView5;
        this.guideline3 = guideline;
        this.paidDate = dtacFontTextView6;
        this.paidTypeLabel = dtacFontTextView7;
        this.paidTypeValue = dtacFontTextView8;
        this.totalCommission = dtacFontTextView9;
    }

    @NonNull
    public static RecyclerViewMonthlyCommissionItemBinding bind(@NonNull View view) {
        int i = R.id.barWarnningMessage;
        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
        if (dtacFontTextView != null) {
            i = R.id.body;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = R.id.commissionHistoryHeader;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout2 != null) {
                    i = R.id.dtacFontTextView16;
                    DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView2 != null) {
                        i = R.id.dtacFontTextView17;
                        DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView3 != null) {
                            i = R.id.dtacOnlinePaidTypeLabel;
                            DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView4 != null) {
                                i = R.id.dtacOnlinePaidTypeValue;
                                DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView5 != null) {
                                    i = R.id.guideline3;
                                    Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                                    if (guideline != null) {
                                        i = R.id.paidDate;
                                        DtacFontTextView dtacFontTextView6 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (dtacFontTextView6 != null) {
                                            i = R.id.paidTypeLabel;
                                            DtacFontTextView dtacFontTextView7 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (dtacFontTextView7 != null) {
                                                i = R.id.paidTypeValue;
                                                DtacFontTextView dtacFontTextView8 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (dtacFontTextView8 != null) {
                                                    i = R.id.totalCommission;
                                                    DtacFontTextView dtacFontTextView9 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (dtacFontTextView9 != null) {
                                                        return new RecyclerViewMonthlyCommissionItemBinding((ConstraintLayout) view, dtacFontTextView, constraintLayout, constraintLayout2, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5, guideline, dtacFontTextView6, dtacFontTextView7, dtacFontTextView8, dtacFontTextView9);
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
    public static RecyclerViewMonthlyCommissionItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static RecyclerViewMonthlyCommissionItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.recycler_view_monthly_commission_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84670a;
    }
}