package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacClearableEditText;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentBuyDolVerifyOtpBinding */
/* loaded from: classes7.dex */
public final class FragmentBuyDolVerifyOtpBinding implements ViewBinding {

    /* renamed from: a */
    public final ScrollView f83753a;
    @NonNull
    public final View bar1;
    @NonNull
    public final View bar2;
    @NonNull
    public final DtacFontButton btnResendOtp;
    @NonNull
    public final DtacFontTextView dtacClearableEditText;
    @NonNull
    public final DtacClearableEditText edtVerifyOtp;
    @NonNull
    public final ConstraintLayout rootView;
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
    public final DtacFontTextView tvConfirmInformationTitle;
    @NonNull
    public final DtacFontTextView tvOtpPhoneNumber;
    @NonNull
    public final DtacFontTextView tvPhoneNumber;

    public FragmentBuyDolVerifyOtpBinding(ScrollView scrollView, View view, View view2, DtacFontButton dtacFontButton, DtacFontTextView dtacFontTextView, DtacClearableEditText dtacClearableEditText, ConstraintLayout constraintLayout, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5, DtacFontTextView dtacFontTextView6, DtacFontTextView dtacFontTextView7, DtacFontTextView dtacFontTextView8, DtacFontTextView dtacFontTextView9, DtacFontTextView dtacFontTextView10, DtacFontTextView dtacFontTextView11, DtacFontTextView dtacFontTextView12, DtacFontTextView dtacFontTextView13, DtacFontTextView dtacFontTextView14) {
        this.f83753a = scrollView;
        this.bar1 = view;
        this.bar2 = view2;
        this.btnResendOtp = dtacFontButton;
        this.dtacClearableEditText = dtacFontTextView;
        this.edtVerifyOtp = dtacClearableEditText;
        this.rootView = constraintLayout;
        this.tvBuyDolAmountMoney = dtacFontTextView2;
        this.tvBuyDolDesiredAmount = dtacFontTextView3;
        this.tvBuyDolDesiredAmountOfMoney = dtacFontTextView4;
        this.tvBuyDolDesiredAmountOfMoneyBaht = dtacFontTextView5;
        this.tvBuyDolFee = dtacFontTextView6;
        this.tvBuyDolMoneyOfAmount = dtacFontTextView7;
        this.tvBuyDolMoneyOfAmountBaht = dtacFontTextView8;
        this.tvBuyDolMoneyOfFee = dtacFontTextView9;
        this.tvBuyDolMoneyOfFeeBaht = dtacFontTextView10;
        this.tvBuyDolNumberOnline = dtacFontTextView11;
        this.tvConfirmInformationTitle = dtacFontTextView12;
        this.tvOtpPhoneNumber = dtacFontTextView13;
        this.tvPhoneNumber = dtacFontTextView14;
    }

    @NonNull
    public static FragmentBuyDolVerifyOtpBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.bar1;
        View findChildViewById2 = ViewBindings.findChildViewById(view, i);
        if (findChildViewById2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.bar2))) != null) {
            i = R.id.btn_resend_otp;
            DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
            if (dtacFontButton != null) {
                i = R.id.dtacClearableEditText;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    i = R.id.edt_verify_otp;
                    DtacClearableEditText dtacClearableEditText = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
                    if (dtacClearableEditText != null) {
                        i = R.id.rootView;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout != null) {
                            i = R.id.tv_buy_dol_amount_money;
                            DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView2 != null) {
                                i = R.id.tv_buy_dol_desired_amount;
                                DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView3 != null) {
                                    i = R.id.tv_buy_dol_desired_amount_of_money;
                                    DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView4 != null) {
                                        i = R.id.tv_buy_dol_desired_amount_of_money_baht;
                                        DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (dtacFontTextView5 != null) {
                                            i = R.id.tv_buy_dol_fee;
                                            DtacFontTextView dtacFontTextView6 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (dtacFontTextView6 != null) {
                                                i = R.id.tv_buy_dol_money_of_amount;
                                                DtacFontTextView dtacFontTextView7 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (dtacFontTextView7 != null) {
                                                    i = R.id.tv_buy_dol_money_of_amount_baht;
                                                    DtacFontTextView dtacFontTextView8 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (dtacFontTextView8 != null) {
                                                        i = R.id.tv_buy_dol_money_of_fee;
                                                        DtacFontTextView dtacFontTextView9 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (dtacFontTextView9 != null) {
                                                            i = R.id.tv_buy_dol_money_of_fee_baht;
                                                            DtacFontTextView dtacFontTextView10 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                            if (dtacFontTextView10 != null) {
                                                                i = R.id.tv_buy_dol_number_online;
                                                                DtacFontTextView dtacFontTextView11 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                if (dtacFontTextView11 != null) {
                                                                    i = R.id.tv_confirm_information_title;
                                                                    DtacFontTextView dtacFontTextView12 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (dtacFontTextView12 != null) {
                                                                        i = R.id.tv_otp_phone_number;
                                                                        DtacFontTextView dtacFontTextView13 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (dtacFontTextView13 != null) {
                                                                            i = R.id.tv_phone_number;
                                                                            DtacFontTextView dtacFontTextView14 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (dtacFontTextView14 != null) {
                                                                                return new FragmentBuyDolVerifyOtpBinding((ScrollView) view, findChildViewById2, findChildViewById, dtacFontButton, dtacFontTextView, dtacClearableEditText, constraintLayout, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5, dtacFontTextView6, dtacFontTextView7, dtacFontTextView8, dtacFontTextView9, dtacFontTextView10, dtacFontTextView11, dtacFontTextView12, dtacFontTextView13, dtacFontTextView14);
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
    public static FragmentBuyDolVerifyOtpBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentBuyDolVerifyOtpBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_buy_dol_verify_otp, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ScrollView getRoot() {
        return this.f83753a;
    }
}