package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentBuyDolSummaryBinding */
/* loaded from: classes7.dex */
public final class FragmentBuyDolSummaryBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f83654a;
    @NonNull
    public final DtacFontButton btnFinish;
    @NonNull
    public final CardView cardSummary;
    @NonNull
    public final RelativeLayout summary;
    @NonNull
    public final DtacFontTextView tvBuyDolAmountOfMoney;
    @NonNull
    public final DtacFontTextView tvBuyDolAmountOfPayment;
    @NonNull
    public final DtacFontTextView tvBuyDolBahtAmountOfMoney;
    @NonNull
    public final DtacFontTextView tvBuyDolBahtAmountOfPayment;
    @NonNull
    public final DtacFontTextView tvBuyDolBahtOfFee;
    @NonNull
    public final DtacFontTextView tvBuyDolDayOfService;
    @NonNull
    public final DtacFontTextView tvBuyDolFee;
    @NonNull
    public final DtacFontTextView tvBuyDolMoneyOfAmount;
    @NonNull
    public final DtacFontTextView tvBuyDolMoneyOfFee;
    @NonNull
    public final DtacFontTextView tvBuyDolMoneyTotalOfPayment;
    @NonNull
    public final DtacFontTextView tvBuyDolNumberOnline;
    @NonNull
    public final DtacFontTextView tvBuyDolNumberRefer;
    @NonNull
    public final DtacFontTextView tvBuyDolOnlineNumber;
    @NonNull
    public final DtacFontTextView tvBuyDolReferNumber;
    @NonNull
    public final DtacFontTextView tvBuyDolServiceOfDay;
    @NonNull
    public final DtacFontTextView tvBuyDolThankyou;
    @NonNull
    public final DtacFontTextView tvSuccessStatus;
    @NonNull
    public final View vBuyDolAlineBill;
    @NonNull
    public final View vBuyDolLineBill;

    public FragmentBuyDolSummaryBinding(NestedScrollView nestedScrollView, DtacFontButton dtacFontButton, CardView cardView, RelativeLayout relativeLayout, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5, DtacFontTextView dtacFontTextView6, DtacFontTextView dtacFontTextView7, DtacFontTextView dtacFontTextView8, DtacFontTextView dtacFontTextView9, DtacFontTextView dtacFontTextView10, DtacFontTextView dtacFontTextView11, DtacFontTextView dtacFontTextView12, DtacFontTextView dtacFontTextView13, DtacFontTextView dtacFontTextView14, DtacFontTextView dtacFontTextView15, DtacFontTextView dtacFontTextView16, DtacFontTextView dtacFontTextView17, View view, View view2) {
        this.f83654a = nestedScrollView;
        this.btnFinish = dtacFontButton;
        this.cardSummary = cardView;
        this.summary = relativeLayout;
        this.tvBuyDolAmountOfMoney = dtacFontTextView;
        this.tvBuyDolAmountOfPayment = dtacFontTextView2;
        this.tvBuyDolBahtAmountOfMoney = dtacFontTextView3;
        this.tvBuyDolBahtAmountOfPayment = dtacFontTextView4;
        this.tvBuyDolBahtOfFee = dtacFontTextView5;
        this.tvBuyDolDayOfService = dtacFontTextView6;
        this.tvBuyDolFee = dtacFontTextView7;
        this.tvBuyDolMoneyOfAmount = dtacFontTextView8;
        this.tvBuyDolMoneyOfFee = dtacFontTextView9;
        this.tvBuyDolMoneyTotalOfPayment = dtacFontTextView10;
        this.tvBuyDolNumberOnline = dtacFontTextView11;
        this.tvBuyDolNumberRefer = dtacFontTextView12;
        this.tvBuyDolOnlineNumber = dtacFontTextView13;
        this.tvBuyDolReferNumber = dtacFontTextView14;
        this.tvBuyDolServiceOfDay = dtacFontTextView15;
        this.tvBuyDolThankyou = dtacFontTextView16;
        this.tvSuccessStatus = dtacFontTextView17;
        this.vBuyDolAlineBill = view;
        this.vBuyDolLineBill = view2;
    }

    @NonNull
    public static FragmentBuyDolSummaryBinding bind(@NonNull View view) {
        View findChildViewById;
        View findChildViewById2;
        int i = R.id.btnFinish;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.card_summary;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
            if (cardView != null) {
                i = R.id.summary;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                if (relativeLayout != null) {
                    i = R.id.tv_buy_dol_amount_of_money;
                    DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView != null) {
                        i = R.id.tv_buy_dol_amount_of_payment;
                        DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView2 != null) {
                            i = R.id.tv_buy_dol_baht_amount_of_money;
                            DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView3 != null) {
                                i = R.id.tv_buy_dol_baht_amount_of_payment;
                                DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView4 != null) {
                                    i = R.id.tv_buy_dol_baht_of_fee;
                                    DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView5 != null) {
                                        i = R.id.tv_buy_dol_day_of_service;
                                        DtacFontTextView dtacFontTextView6 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (dtacFontTextView6 != null) {
                                            i = R.id.tv_buy_dol_fee;
                                            DtacFontTextView dtacFontTextView7 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (dtacFontTextView7 != null) {
                                                i = R.id.tv_buy_dol_money_of_amount;
                                                DtacFontTextView dtacFontTextView8 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (dtacFontTextView8 != null) {
                                                    i = R.id.tv_buy_dol_money_of_fee;
                                                    DtacFontTextView dtacFontTextView9 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (dtacFontTextView9 != null) {
                                                        i = R.id.tv_buy_dol_money_total_of_payment;
                                                        DtacFontTextView dtacFontTextView10 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (dtacFontTextView10 != null) {
                                                            i = R.id.tv_buy_dol_number_online;
                                                            DtacFontTextView dtacFontTextView11 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                            if (dtacFontTextView11 != null) {
                                                                i = R.id.tv_buy_dol_number_refer;
                                                                DtacFontTextView dtacFontTextView12 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                if (dtacFontTextView12 != null) {
                                                                    i = R.id.tv_buy_dol_online_number;
                                                                    DtacFontTextView dtacFontTextView13 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (dtacFontTextView13 != null) {
                                                                        i = R.id.tv_buy_dol_refer_number;
                                                                        DtacFontTextView dtacFontTextView14 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (dtacFontTextView14 != null) {
                                                                            i = R.id.tv_buy_dol_service_of_day;
                                                                            DtacFontTextView dtacFontTextView15 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (dtacFontTextView15 != null) {
                                                                                i = R.id.tv_buy_dol_thankyou;
                                                                                DtacFontTextView dtacFontTextView16 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                if (dtacFontTextView16 != null) {
                                                                                    i = R.id.tvSuccessStatus;
                                                                                    DtacFontTextView dtacFontTextView17 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (dtacFontTextView17 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.v_buy_dol_aline_bill))) != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.v_buy_dol_line_bill))) != null) {
                                                                                        return new FragmentBuyDolSummaryBinding((NestedScrollView) view, dtacFontButton, cardView, relativeLayout, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5, dtacFontTextView6, dtacFontTextView7, dtacFontTextView8, dtacFontTextView9, dtacFontTextView10, dtacFontTextView11, dtacFontTextView12, dtacFontTextView13, dtacFontTextView14, dtacFontTextView15, dtacFontTextView16, dtacFontTextView17, findChildViewById, findChildViewById2);
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
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentBuyDolSummaryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentBuyDolSummaryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_buy_dol_summary, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f83654a;
    }
}
