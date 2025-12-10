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
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.RecyclerViewMonthlyOneCommissionItemBinding */
/* loaded from: classes7.dex */
public final class RecyclerViewMonthlyOneCommissionItemBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84561a;
    @NonNull
    public final OneFontTextView barWarnningMessage;
    @NonNull
    public final ConstraintLayout body;
    @NonNull
    public final ConstraintLayout commissionHistoryHeader;
    @NonNull
    public final OneFontTextView dtacFontTextView16;
    @NonNull
    public final OneFontTextView dtacFontTextView17;
    @NonNull
    public final OneFontTextView dtacOnlinePaidTypeLabel;
    @NonNull
    public final OneFontTextView dtacOnlinePaidTypeValue;
    @NonNull
    public final Guideline guideline3;
    @NonNull
    public final OneFontTextView paidDate;
    @NonNull
    public final OneFontTextView paidTypeLabel;
    @NonNull
    public final OneFontTextView paidTypeValue;
    @NonNull
    public final OneFontTextView totalCommission;

    public RecyclerViewMonthlyOneCommissionItemBinding(ConstraintLayout constraintLayout, OneFontTextView oneFontTextView, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5, Guideline guideline, OneFontTextView oneFontTextView6, OneFontTextView oneFontTextView7, OneFontTextView oneFontTextView8, OneFontTextView oneFontTextView9) {
        this.f84561a = constraintLayout;
        this.barWarnningMessage = oneFontTextView;
        this.body = constraintLayout2;
        this.commissionHistoryHeader = constraintLayout3;
        this.dtacFontTextView16 = oneFontTextView2;
        this.dtacFontTextView17 = oneFontTextView3;
        this.dtacOnlinePaidTypeLabel = oneFontTextView4;
        this.dtacOnlinePaidTypeValue = oneFontTextView5;
        this.guideline3 = guideline;
        this.paidDate = oneFontTextView6;
        this.paidTypeLabel = oneFontTextView7;
        this.paidTypeValue = oneFontTextView8;
        this.totalCommission = oneFontTextView9;
    }

    @NonNull
    public static RecyclerViewMonthlyOneCommissionItemBinding bind(@NonNull View view) {
        int i = R.id.barWarnningMessage;
        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
        if (oneFontTextView != null) {
            i = R.id.body;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = R.id.commissionHistoryHeader;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout2 != null) {
                    i = R.id.dtacFontTextView16;
                    OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView2 != null) {
                        i = R.id.dtacFontTextView17;
                        OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView3 != null) {
                            i = R.id.dtacOnlinePaidTypeLabel;
                            OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView4 != null) {
                                i = R.id.dtacOnlinePaidTypeValue;
                                OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView5 != null) {
                                    i = R.id.guideline3;
                                    Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                                    if (guideline != null) {
                                        i = R.id.paidDate;
                                        OneFontTextView oneFontTextView6 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (oneFontTextView6 != null) {
                                            i = R.id.paidTypeLabel;
                                            OneFontTextView oneFontTextView7 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (oneFontTextView7 != null) {
                                                i = R.id.paidTypeValue;
                                                OneFontTextView oneFontTextView8 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (oneFontTextView8 != null) {
                                                    i = R.id.totalCommission;
                                                    OneFontTextView oneFontTextView9 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (oneFontTextView9 != null) {
                                                        return new RecyclerViewMonthlyOneCommissionItemBinding((ConstraintLayout) view, oneFontTextView, constraintLayout, constraintLayout2, oneFontTextView2, oneFontTextView3, oneFontTextView4, oneFontTextView5, guideline, oneFontTextView6, oneFontTextView7, oneFontTextView8, oneFontTextView9);
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
    public static RecyclerViewMonthlyOneCommissionItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static RecyclerViewMonthlyOneCommissionItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.recycler_view_monthly_one_commission_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84561a;
    }
}
