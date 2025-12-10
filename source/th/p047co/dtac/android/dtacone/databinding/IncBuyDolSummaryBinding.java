package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.IncBuyDolSummaryBinding */
/* loaded from: classes7.dex */
public final class IncBuyDolSummaryBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84233a;
    @NonNull
    public final ConstraintLayout linearLayout;
    @NonNull
    public final DtacFontTextView tvBuyDolAmountMoney;
    @NonNull
    public final DtacFontTextView tvBuyDolDesiredAmount;
    @NonNull
    public final DtacFontTextView tvBuyDolDesiredAmountOfMoney;
    @NonNull
    public final DtacFontTextView tvBuyDolDesiredAmountOfMoneyBaht;
    @NonNull
    public final DtacFontTextView tvBuyDolFee;
    @NonNull
    public final DtacFontTextView tvBuyDolMoneyOfAmount;
    @NonNull
    public final DtacFontTextView tvBuyDolMoneyOfAmountBaht;
    @NonNull
    public final DtacFontTextView tvBuyDolMoneyOfFee;
    @NonNull
    public final DtacFontTextView tvBuyDolMoneyOfFeeBaht;
    @NonNull
    public final DtacFontTextView tvBuyDolNumberOnline;
    @NonNull
    public final DtacFontTextView tvPhoneNumber;

    public IncBuyDolSummaryBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5, DtacFontTextView dtacFontTextView6, DtacFontTextView dtacFontTextView7, DtacFontTextView dtacFontTextView8, DtacFontTextView dtacFontTextView9, DtacFontTextView dtacFontTextView10, DtacFontTextView dtacFontTextView11) {
        this.f84233a = constraintLayout;
        this.linearLayout = constraintLayout2;
        this.tvBuyDolAmountMoney = dtacFontTextView;
        this.tvBuyDolDesiredAmount = dtacFontTextView2;
        this.tvBuyDolDesiredAmountOfMoney = dtacFontTextView3;
        this.tvBuyDolDesiredAmountOfMoneyBaht = dtacFontTextView4;
        this.tvBuyDolFee = dtacFontTextView5;
        this.tvBuyDolMoneyOfAmount = dtacFontTextView6;
        this.tvBuyDolMoneyOfAmountBaht = dtacFontTextView7;
        this.tvBuyDolMoneyOfFee = dtacFontTextView8;
        this.tvBuyDolMoneyOfFeeBaht = dtacFontTextView9;
        this.tvBuyDolNumberOnline = dtacFontTextView10;
        this.tvPhoneNumber = dtacFontTextView11;
    }

    @NonNull
    public static IncBuyDolSummaryBinding bind(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.tv_buy_dol_amount_money;
        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
        if (dtacFontTextView != null) {
            i = R.id.tv_buy_dol_desired_amount;
            DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView2 != null) {
                i = R.id.tv_buy_dol_desired_amount_of_money;
                DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView3 != null) {
                    i = R.id.tv_buy_dol_desired_amount_of_money_baht;
                    DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView4 != null) {
                        i = R.id.tv_buy_dol_fee;
                        DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView5 != null) {
                            i = R.id.tv_buy_dol_money_of_amount;
                            DtacFontTextView dtacFontTextView6 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView6 != null) {
                                i = R.id.tv_buy_dol_money_of_amount_baht;
                                DtacFontTextView dtacFontTextView7 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView7 != null) {
                                    i = R.id.tv_buy_dol_money_of_fee;
                                    DtacFontTextView dtacFontTextView8 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView8 != null) {
                                        i = R.id.tv_buy_dol_money_of_fee_baht;
                                        DtacFontTextView dtacFontTextView9 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (dtacFontTextView9 != null) {
                                            i = R.id.tv_buy_dol_number_online;
                                            DtacFontTextView dtacFontTextView10 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (dtacFontTextView10 != null) {
                                                i = R.id.tv_phone_number;
                                                DtacFontTextView dtacFontTextView11 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (dtacFontTextView11 != null) {
                                                    return new IncBuyDolSummaryBinding(constraintLayout, constraintLayout, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5, dtacFontTextView6, dtacFontTextView7, dtacFontTextView8, dtacFontTextView9, dtacFontTextView10, dtacFontTextView11);
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
    public static IncBuyDolSummaryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IncBuyDolSummaryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.inc_buy_dol_summary, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84233a;
    }
}
