package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZIncCommissionDetailBinding */
/* loaded from: classes7.dex */
public final class ZIncCommissionDetailBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84608a;
    @NonNull
    public final DtacFontTextView commissionLabel;
    @NonNull
    public final DtacFontTextView commissionValue;
    @NonNull
    public final DtacFontTextView dtacFontTextView41;
    @NonNull
    public final Guideline guideline2;
    @NonNull
    public final View lineSep;
    @NonNull
    public final RecyclerView payByCommissionRecyclerView;
    @NonNull
    public final DtacFontTextView totalCommissionHilight;
    @NonNull
    public final DtacFontTextView tvLabel1;
    @NonNull
    public final DtacFontTextView tvMonthly1;
    @NonNull
    public final DtacFontTextView tvTotalLabel;
    @NonNull
    public final DtacFontTextView vatLabel;
    @NonNull
    public final DtacFontTextView vatValue;
    @NonNull
    public final DtacFontTextView withholdTaxLabel;
    @NonNull
    public final DtacFontTextView withholdTaxValue;

    public ZIncCommissionDetailBinding(ConstraintLayout constraintLayout, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, Guideline guideline, View view, RecyclerView recyclerView, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5, DtacFontTextView dtacFontTextView6, DtacFontTextView dtacFontTextView7, DtacFontTextView dtacFontTextView8, DtacFontTextView dtacFontTextView9, DtacFontTextView dtacFontTextView10, DtacFontTextView dtacFontTextView11) {
        this.f84608a = constraintLayout;
        this.commissionLabel = dtacFontTextView;
        this.commissionValue = dtacFontTextView2;
        this.dtacFontTextView41 = dtacFontTextView3;
        this.guideline2 = guideline;
        this.lineSep = view;
        this.payByCommissionRecyclerView = recyclerView;
        this.totalCommissionHilight = dtacFontTextView4;
        this.tvLabel1 = dtacFontTextView5;
        this.tvMonthly1 = dtacFontTextView6;
        this.tvTotalLabel = dtacFontTextView7;
        this.vatLabel = dtacFontTextView8;
        this.vatValue = dtacFontTextView9;
        this.withholdTaxLabel = dtacFontTextView10;
        this.withholdTaxValue = dtacFontTextView11;
    }

    @NonNull
    public static ZIncCommissionDetailBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.commissionLabel;
        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
        if (dtacFontTextView != null) {
            i = R.id.commissionValue;
            DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView2 != null) {
                i = R.id.dtacFontTextView41;
                DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView3 != null) {
                    i = R.id.guideline2;
                    Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                    if (guideline != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.line_sep))) != null) {
                        i = R.id.payByCommissionRecyclerView;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                        if (recyclerView != null) {
                            i = R.id.totalCommissionHilight;
                            DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView4 != null) {
                                i = R.id.tvLabel1;
                                DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView5 != null) {
                                    i = R.id.tvMonthly1;
                                    DtacFontTextView dtacFontTextView6 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView6 != null) {
                                        i = R.id.tvTotalLabel;
                                        DtacFontTextView dtacFontTextView7 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (dtacFontTextView7 != null) {
                                            i = R.id.vatLabel;
                                            DtacFontTextView dtacFontTextView8 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (dtacFontTextView8 != null) {
                                                i = R.id.vatValue;
                                                DtacFontTextView dtacFontTextView9 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (dtacFontTextView9 != null) {
                                                    i = R.id.withholdTaxLabel;
                                                    DtacFontTextView dtacFontTextView10 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (dtacFontTextView10 != null) {
                                                        i = R.id.withholdTaxValue;
                                                        DtacFontTextView dtacFontTextView11 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (dtacFontTextView11 != null) {
                                                            return new ZIncCommissionDetailBinding((ConstraintLayout) view, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, guideline, findChildViewById, recyclerView, dtacFontTextView4, dtacFontTextView5, dtacFontTextView6, dtacFontTextView7, dtacFontTextView8, dtacFontTextView9, dtacFontTextView10, dtacFontTextView11);
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
    public static ZIncCommissionDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZIncCommissionDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_inc_commission_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84608a;
    }
}
