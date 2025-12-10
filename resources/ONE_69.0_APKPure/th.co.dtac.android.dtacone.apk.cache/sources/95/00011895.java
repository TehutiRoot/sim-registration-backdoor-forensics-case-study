package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.RecyclerViewPaybyItemBinding */
/* loaded from: classes7.dex */
public final class RecyclerViewPaybyItemBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84676a;
    @NonNull
    public final DtacFontTextView amount;
    @NonNull
    public final DtacFontTextView commissionDetail;
    @NonNull
    public final DtacFontTextView commissionDetail2;
    @NonNull
    public final DtacFontTextView commissionDetail3;
    @NonNull
    public final DtacFontTextView commissionDetail4;
    @NonNull
    public final DtacFontTextView commissionDetail5;
    @NonNull
    public final DtacFontTextView commissionDetail6;
    @NonNull
    public final DtacFontTextView commissionType;
    @NonNull
    public final LinearLayout detailContainer;
    @NonNull
    public final Guideline guideline2;
    @NonNull
    public final DtacFontTextView quantity;

    public RecyclerViewPaybyItemBinding(ConstraintLayout constraintLayout, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5, DtacFontTextView dtacFontTextView6, DtacFontTextView dtacFontTextView7, DtacFontTextView dtacFontTextView8, LinearLayout linearLayout, Guideline guideline, DtacFontTextView dtacFontTextView9) {
        this.f84676a = constraintLayout;
        this.amount = dtacFontTextView;
        this.commissionDetail = dtacFontTextView2;
        this.commissionDetail2 = dtacFontTextView3;
        this.commissionDetail3 = dtacFontTextView4;
        this.commissionDetail4 = dtacFontTextView5;
        this.commissionDetail5 = dtacFontTextView6;
        this.commissionDetail6 = dtacFontTextView7;
        this.commissionType = dtacFontTextView8;
        this.detailContainer = linearLayout;
        this.guideline2 = guideline;
        this.quantity = dtacFontTextView9;
    }

    @NonNull
    public static RecyclerViewPaybyItemBinding bind(@NonNull View view) {
        int i = R.id.amount;
        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
        if (dtacFontTextView != null) {
            i = R.id.commissionDetail;
            DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView2 != null) {
                i = R.id.commissionDetail2;
                DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView3 != null) {
                    i = R.id.commissionDetail3;
                    DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView4 != null) {
                        i = R.id.commissionDetail4;
                        DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView5 != null) {
                            i = R.id.commissionDetail5;
                            DtacFontTextView dtacFontTextView6 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView6 != null) {
                                i = R.id.commissionDetail6;
                                DtacFontTextView dtacFontTextView7 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView7 != null) {
                                    i = R.id.commissionType;
                                    DtacFontTextView dtacFontTextView8 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView8 != null) {
                                        i = R.id.detailContainer;
                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                        if (linearLayout != null) {
                                            i = R.id.guideline2;
                                            Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                                            if (guideline != null) {
                                                i = R.id.quantity;
                                                DtacFontTextView dtacFontTextView9 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (dtacFontTextView9 != null) {
                                                    return new RecyclerViewPaybyItemBinding((ConstraintLayout) view, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5, dtacFontTextView6, dtacFontTextView7, dtacFontTextView8, linearLayout, guideline, dtacFontTextView9);
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
    public static RecyclerViewPaybyItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static RecyclerViewPaybyItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.recycler_view_payby_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84676a;
    }
}