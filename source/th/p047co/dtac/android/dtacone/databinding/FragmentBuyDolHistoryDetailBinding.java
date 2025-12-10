package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentBuyDolHistoryDetailBinding */
/* loaded from: classes7.dex */
public final class FragmentBuyDolHistoryDetailBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f83649a;
    @NonNull
    public final DtacFontButton btnBuy;
    @NonNull
    public final DtacFontTextView tvBuyDolAmountOfMoney;
    @NonNull
    public final DtacFontTextView tvBuyDolBahtAmountOfMoney;
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
    public final DtacFontTextView tvBuyDolNumberOnline;
    @NonNull
    public final DtacFontTextView tvBuyDolNumberRefer;
    @NonNull
    public final DtacFontTextView tvBuyDolOnlineNumber;
    @NonNull
    public final DtacFontTextView tvBuyDolReferNumber;
    @NonNull
    public final DtacFontTextView tvBuyDolServiceOfDay;

    public FragmentBuyDolHistoryDetailBinding(FrameLayout frameLayout, DtacFontButton dtacFontButton, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5, DtacFontTextView dtacFontTextView6, DtacFontTextView dtacFontTextView7, DtacFontTextView dtacFontTextView8, DtacFontTextView dtacFontTextView9, DtacFontTextView dtacFontTextView10, DtacFontTextView dtacFontTextView11, DtacFontTextView dtacFontTextView12) {
        this.f83649a = frameLayout;
        this.btnBuy = dtacFontButton;
        this.tvBuyDolAmountOfMoney = dtacFontTextView;
        this.tvBuyDolBahtAmountOfMoney = dtacFontTextView2;
        this.tvBuyDolBahtOfFee = dtacFontTextView3;
        this.tvBuyDolDayOfService = dtacFontTextView4;
        this.tvBuyDolFee = dtacFontTextView5;
        this.tvBuyDolMoneyOfAmount = dtacFontTextView6;
        this.tvBuyDolMoneyOfFee = dtacFontTextView7;
        this.tvBuyDolNumberOnline = dtacFontTextView8;
        this.tvBuyDolNumberRefer = dtacFontTextView9;
        this.tvBuyDolOnlineNumber = dtacFontTextView10;
        this.tvBuyDolReferNumber = dtacFontTextView11;
        this.tvBuyDolServiceOfDay = dtacFontTextView12;
    }

    @NonNull
    public static FragmentBuyDolHistoryDetailBinding bind(@NonNull View view) {
        int i = R.id.btnBuy;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.tv_buy_dol_amount_of_money;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView != null) {
                i = R.id.tv_buy_dol_baht_amount_of_money;
                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView2 != null) {
                    i = R.id.tv_buy_dol_baht_of_fee;
                    DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView3 != null) {
                        i = R.id.tv_buy_dol_day_of_service;
                        DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView4 != null) {
                            i = R.id.tv_buy_dol_fee;
                            DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView5 != null) {
                                i = R.id.tv_buy_dol_money_of_amount;
                                DtacFontTextView dtacFontTextView6 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView6 != null) {
                                    i = R.id.tv_buy_dol_money_of_fee;
                                    DtacFontTextView dtacFontTextView7 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView7 != null) {
                                        i = R.id.tv_buy_dol_number_online;
                                        DtacFontTextView dtacFontTextView8 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (dtacFontTextView8 != null) {
                                            i = R.id.tv_buy_dol_number_refer;
                                            DtacFontTextView dtacFontTextView9 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (dtacFontTextView9 != null) {
                                                i = R.id.tv_buy_dol_online_number;
                                                DtacFontTextView dtacFontTextView10 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (dtacFontTextView10 != null) {
                                                    i = R.id.tv_buy_dol_refer_number;
                                                    DtacFontTextView dtacFontTextView11 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (dtacFontTextView11 != null) {
                                                        i = R.id.tv_buy_dol_service_of_day;
                                                        DtacFontTextView dtacFontTextView12 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (dtacFontTextView12 != null) {
                                                            return new FragmentBuyDolHistoryDetailBinding((FrameLayout) view, dtacFontButton, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5, dtacFontTextView6, dtacFontTextView7, dtacFontTextView8, dtacFontTextView9, dtacFontTextView10, dtacFontTextView11, dtacFontTextView12);
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
    public static FragmentBuyDolHistoryDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentBuyDolHistoryDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_buy_dol_history_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f83649a;
    }
}
