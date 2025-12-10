package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneEditText;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacRecyclerView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneBuyDolPriceListBinding */
/* loaded from: classes7.dex */
public final class FragmentOneBuyDolPriceListBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f83895a;
    @NonNull
    public final ConstraintLayout buyDolPriceListLayout;
    @NonNull
    public final OneFontButton confirmSelectPriceButton;
    @NonNull
    public final OneEditText oneBuyDolPhoneNumberEditText;
    @NonNull
    public final DtacRecyclerView priceRecyclerView;
    @NonNull
    public final ConstraintLayout selectAmountLayout;
    @NonNull
    public final OneFontTextView selectAmountTextView;
    @NonNull
    public final OneFontTextView serviceChargeTextView;

    public FragmentOneBuyDolPriceListBinding(NestedScrollView nestedScrollView, ConstraintLayout constraintLayout, OneFontButton oneFontButton, OneEditText oneEditText, DtacRecyclerView dtacRecyclerView, ConstraintLayout constraintLayout2, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2) {
        this.f83895a = nestedScrollView;
        this.buyDolPriceListLayout = constraintLayout;
        this.confirmSelectPriceButton = oneFontButton;
        this.oneBuyDolPhoneNumberEditText = oneEditText;
        this.priceRecyclerView = dtacRecyclerView;
        this.selectAmountLayout = constraintLayout2;
        this.selectAmountTextView = oneFontTextView;
        this.serviceChargeTextView = oneFontTextView2;
    }

    @NonNull
    public static FragmentOneBuyDolPriceListBinding bind(@NonNull View view) {
        int i = R.id.buyDolPriceListLayout;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = R.id.confirmSelectPriceButton;
            OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
            if (oneFontButton != null) {
                i = R.id.oneBuyDolPhoneNumberEditText;
                OneEditText oneEditText = (OneEditText) ViewBindings.findChildViewById(view, i);
                if (oneEditText != null) {
                    i = R.id.priceRecyclerView;
                    DtacRecyclerView dtacRecyclerView = (DtacRecyclerView) ViewBindings.findChildViewById(view, i);
                    if (dtacRecyclerView != null) {
                        i = R.id.selectAmountLayout;
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout2 != null) {
                            i = R.id.selectAmountTextView;
                            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView != null) {
                                i = R.id.serviceChargeTextView;
                                OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView2 != null) {
                                    return new FragmentOneBuyDolPriceListBinding((NestedScrollView) view, constraintLayout, oneFontButton, oneEditText, dtacRecyclerView, constraintLayout2, oneFontTextView, oneFontTextView2);
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
    public static FragmentOneBuyDolPriceListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneBuyDolPriceListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_buy_dol_price_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f83895a;
    }
}
