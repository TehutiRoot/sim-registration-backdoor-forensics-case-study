package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacEditTextColor;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacRecyclerView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentBuyDolPriceListBinding */
/* loaded from: classes7.dex */
public final class FragmentBuyDolPriceListBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f83652a;
    @NonNull
    public final DtacFontButton btnConfirmPrice;
    @NonNull
    public final DtacEditTextColor edtPhoneNumberBuyDol;
    @NonNull
    public final DtacRecyclerView rvPricesBuyDOL;
    @NonNull
    public final DtacFontTextView tvPickAmountMoney;
    @NonNull
    public final DtacFontTextView tvService;

    public FragmentBuyDolPriceListBinding(NestedScrollView nestedScrollView, DtacFontButton dtacFontButton, DtacEditTextColor dtacEditTextColor, DtacRecyclerView dtacRecyclerView, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2) {
        this.f83652a = nestedScrollView;
        this.btnConfirmPrice = dtacFontButton;
        this.edtPhoneNumberBuyDol = dtacEditTextColor;
        this.rvPricesBuyDOL = dtacRecyclerView;
        this.tvPickAmountMoney = dtacFontTextView;
        this.tvService = dtacFontTextView2;
    }

    @NonNull
    public static FragmentBuyDolPriceListBinding bind(@NonNull View view) {
        int i = R.id.btnConfirmPrice;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.edt_phone_number_buy_dol;
            DtacEditTextColor dtacEditTextColor = (DtacEditTextColor) ViewBindings.findChildViewById(view, i);
            if (dtacEditTextColor != null) {
                i = R.id.rvPricesBuyDOL;
                DtacRecyclerView dtacRecyclerView = (DtacRecyclerView) ViewBindings.findChildViewById(view, i);
                if (dtacRecyclerView != null) {
                    i = R.id.tv_pick_amount_money;
                    DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView != null) {
                        i = R.id.tv_service;
                        DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView2 != null) {
                            return new FragmentBuyDolPriceListBinding((NestedScrollView) view, dtacFontButton, dtacEditTextColor, dtacRecyclerView, dtacFontTextView, dtacFontTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentBuyDolPriceListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentBuyDolPriceListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_buy_dol_price_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f83652a;
    }
}
