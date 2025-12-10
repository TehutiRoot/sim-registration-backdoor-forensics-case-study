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

/* renamed from: th.co.dtac.android.dtacone.databinding.RecyclerViewOneCommissionPaybyItemTrueDetailBinding */
/* loaded from: classes7.dex */
public final class RecyclerViewOneCommissionPaybyItemTrueDetailBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84675a;
    @NonNull
    public final OneFontTextView amount;
    @NonNull
    public final OneFontTextView commissionDetail;
    @NonNull
    public final OneFontTextView dotView;
    @NonNull
    public final Guideline guideline2;
    @NonNull
    public final Guideline guideline3;
    @NonNull
    public final OneFontTextView quantity;

    public RecyclerViewOneCommissionPaybyItemTrueDetailBinding(ConstraintLayout constraintLayout, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, Guideline guideline, Guideline guideline2, OneFontTextView oneFontTextView4) {
        this.f84675a = constraintLayout;
        this.amount = oneFontTextView;
        this.commissionDetail = oneFontTextView2;
        this.dotView = oneFontTextView3;
        this.guideline2 = guideline;
        this.guideline3 = guideline2;
        this.quantity = oneFontTextView4;
    }

    @NonNull
    public static RecyclerViewOneCommissionPaybyItemTrueDetailBinding bind(@NonNull View view) {
        int i = R.id.amount;
        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
        if (oneFontTextView != null) {
            i = R.id.commissionDetail;
            OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView2 != null) {
                i = R.id.dotView;
                OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView3 != null) {
                    i = R.id.guideline2;
                    Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                    if (guideline != null) {
                        i = R.id.guideline3;
                        Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i);
                        if (guideline2 != null) {
                            i = R.id.quantity;
                            OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView4 != null) {
                                return new RecyclerViewOneCommissionPaybyItemTrueDetailBinding((ConstraintLayout) view, oneFontTextView, oneFontTextView2, oneFontTextView3, guideline, guideline2, oneFontTextView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static RecyclerViewOneCommissionPaybyItemTrueDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static RecyclerViewOneCommissionPaybyItemTrueDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.recycler_view_one_commission_payby_item_true_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84675a;
    }
}