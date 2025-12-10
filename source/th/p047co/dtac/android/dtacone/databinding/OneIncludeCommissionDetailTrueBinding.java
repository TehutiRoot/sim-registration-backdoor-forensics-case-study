package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneIncludeCommissionDetailTrueBinding */
/* loaded from: classes7.dex */
public final class OneIncludeCommissionDetailTrueBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84467a;
    @NonNull
    public final OneFontTextView commissionLabel;
    @NonNull
    public final OneFontTextView commissionValue;
    @NonNull
    public final OneFontTextView dtacFontTextView41;
    @NonNull
    public final Guideline guideline2;
    @NonNull
    public final View lineSep;
    @NonNull
    public final RecyclerView payByCommissionRecyclerView;
    @NonNull
    public final LinearLayoutCompat scSubHeader;
    @NonNull
    public final OneFontTextView totalCommissionHilight;
    @NonNull
    public final OneFontTextView tvLabel1;
    @NonNull
    public final OneFontTextView tvMonthly1;
    @NonNull
    public final OneFontTextView tvTotalLabel;
    @NonNull
    public final OneFontTextView vatLabel;
    @NonNull
    public final OneFontTextView vatValue;
    @NonNull
    public final OneFontTextView withholdTaxLabel;
    @NonNull
    public final OneFontTextView withholdTaxValue;

    public OneIncludeCommissionDetailTrueBinding(ConstraintLayout constraintLayout, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, Guideline guideline, View view, RecyclerView recyclerView, LinearLayoutCompat linearLayoutCompat, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5, OneFontTextView oneFontTextView6, OneFontTextView oneFontTextView7, OneFontTextView oneFontTextView8, OneFontTextView oneFontTextView9, OneFontTextView oneFontTextView10, OneFontTextView oneFontTextView11) {
        this.f84467a = constraintLayout;
        this.commissionLabel = oneFontTextView;
        this.commissionValue = oneFontTextView2;
        this.dtacFontTextView41 = oneFontTextView3;
        this.guideline2 = guideline;
        this.lineSep = view;
        this.payByCommissionRecyclerView = recyclerView;
        this.scSubHeader = linearLayoutCompat;
        this.totalCommissionHilight = oneFontTextView4;
        this.tvLabel1 = oneFontTextView5;
        this.tvMonthly1 = oneFontTextView6;
        this.tvTotalLabel = oneFontTextView7;
        this.vatLabel = oneFontTextView8;
        this.vatValue = oneFontTextView9;
        this.withholdTaxLabel = oneFontTextView10;
        this.withholdTaxValue = oneFontTextView11;
    }

    @NonNull
    public static OneIncludeCommissionDetailTrueBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.commissionLabel;
        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
        if (oneFontTextView != null) {
            i = R.id.commissionValue;
            OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView2 != null) {
                i = R.id.dtacFontTextView41;
                OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView3 != null) {
                    i = R.id.guideline2;
                    Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                    if (guideline != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.line_sep))) != null) {
                        i = R.id.payByCommissionRecyclerView;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                        if (recyclerView != null) {
                            i = R.id.scSubHeader;
                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                            if (linearLayoutCompat != null) {
                                i = R.id.totalCommissionHilight;
                                OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView4 != null) {
                                    i = R.id.tvLabel1;
                                    OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (oneFontTextView5 != null) {
                                        i = R.id.tvMonthly1;
                                        OneFontTextView oneFontTextView6 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (oneFontTextView6 != null) {
                                            i = R.id.tvTotalLabel;
                                            OneFontTextView oneFontTextView7 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (oneFontTextView7 != null) {
                                                i = R.id.vatLabel;
                                                OneFontTextView oneFontTextView8 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (oneFontTextView8 != null) {
                                                    i = R.id.vatValue;
                                                    OneFontTextView oneFontTextView9 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (oneFontTextView9 != null) {
                                                        i = R.id.withholdTaxLabel;
                                                        OneFontTextView oneFontTextView10 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (oneFontTextView10 != null) {
                                                            i = R.id.withholdTaxValue;
                                                            OneFontTextView oneFontTextView11 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                            if (oneFontTextView11 != null) {
                                                                return new OneIncludeCommissionDetailTrueBinding((ConstraintLayout) view, oneFontTextView, oneFontTextView2, oneFontTextView3, guideline, findChildViewById, recyclerView, linearLayoutCompat, oneFontTextView4, oneFontTextView5, oneFontTextView6, oneFontTextView7, oneFontTextView8, oneFontTextView9, oneFontTextView10, oneFontTextView11);
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
    public static OneIncludeCommissionDetailTrueBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneIncludeCommissionDetailTrueBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_include_commission_detail_true, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84467a;
    }
}
