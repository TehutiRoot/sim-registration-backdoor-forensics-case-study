package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.loading.DtacSwipeRefresh;
import th.p047co.dtac.android.dtacone.widget.view.DtacClearableEditText;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentTopupConfirmBinding */
/* loaded from: classes7.dex */
public final class FragmentTopupConfirmBinding implements ViewBinding {

    /* renamed from: a */
    public final DtacSwipeRefresh f84211a;
    @NonNull
    public final ZBalanceBoxBinding balanceBox;
    @NonNull
    public final LinearLayout confirmBonusDetails;
    @NonNull
    public final LinearLayout confirmDetails;
    @NonNull
    public final DtacSwipeRefresh confirmSwipeRefresh;
    @NonNull
    public final RelativeLayout root;
    @NonNull
    public final DtacClearableEditText topupEdtConfirmPin;
    @NonNull
    public final LinearLayout topupLlvConfirmSubscriberNumber;
    @NonNull
    public final DtacFontTextView topupTvConfirmInformationTitle;
    @NonNull
    public final DtacFontTextView topupTvConfirmSubscriberNumber;
    @NonNull
    public final DtacFontTextView topupTvConfirmTopupAmountValue;
    @NonNull
    public final DtacFontTextView tvBonus;
    @NonNull
    public final DtacFontTextView tvBonusDetailTitle1;
    @NonNull
    public final DtacFontTextView tvBonusDetailTitle2;
    @NonNull
    public final DtacFontTextView tvBonusDetailValue1;
    @NonNull
    public final DtacFontTextView tvBonusDetailValue2;

    public FragmentTopupConfirmBinding(DtacSwipeRefresh dtacSwipeRefresh, ZBalanceBoxBinding zBalanceBoxBinding, LinearLayout linearLayout, LinearLayout linearLayout2, DtacSwipeRefresh dtacSwipeRefresh2, RelativeLayout relativeLayout, DtacClearableEditText dtacClearableEditText, LinearLayout linearLayout3, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5, DtacFontTextView dtacFontTextView6, DtacFontTextView dtacFontTextView7, DtacFontTextView dtacFontTextView8) {
        this.f84211a = dtacSwipeRefresh;
        this.balanceBox = zBalanceBoxBinding;
        this.confirmBonusDetails = linearLayout;
        this.confirmDetails = linearLayout2;
        this.confirmSwipeRefresh = dtacSwipeRefresh2;
        this.root = relativeLayout;
        this.topupEdtConfirmPin = dtacClearableEditText;
        this.topupLlvConfirmSubscriberNumber = linearLayout3;
        this.topupTvConfirmInformationTitle = dtacFontTextView;
        this.topupTvConfirmSubscriberNumber = dtacFontTextView2;
        this.topupTvConfirmTopupAmountValue = dtacFontTextView3;
        this.tvBonus = dtacFontTextView4;
        this.tvBonusDetailTitle1 = dtacFontTextView5;
        this.tvBonusDetailTitle2 = dtacFontTextView6;
        this.tvBonusDetailValue1 = dtacFontTextView7;
        this.tvBonusDetailValue2 = dtacFontTextView8;
    }

    @NonNull
    public static FragmentTopupConfirmBinding bind(@NonNull View view) {
        int i = R.id.balance_box;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            ZBalanceBoxBinding bind = ZBalanceBoxBinding.bind(findChildViewById);
            i = R.id.confirm_bonus_details;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = R.id.confirm_details;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout2 != null) {
                    DtacSwipeRefresh dtacSwipeRefresh = (DtacSwipeRefresh) view;
                    i = R.id.root;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                    if (relativeLayout != null) {
                        i = R.id.topup_edt_confirm_pin;
                        DtacClearableEditText dtacClearableEditText = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
                        if (dtacClearableEditText != null) {
                            i = R.id.topup_llv_confirm_subscriber_number;
                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout3 != null) {
                                i = R.id.topup_tv_confirm_information_title;
                                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView != null) {
                                    i = R.id.topup_tv_confirm_subscriber_number;
                                    DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView2 != null) {
                                        i = R.id.topup_tv_confirm_topup_amount_value;
                                        DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (dtacFontTextView3 != null) {
                                            i = R.id.tv_bonus;
                                            DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (dtacFontTextView4 != null) {
                                                i = R.id.tvBonusDetailTitle1;
                                                DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (dtacFontTextView5 != null) {
                                                    i = R.id.tvBonusDetailTitle2;
                                                    DtacFontTextView dtacFontTextView6 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (dtacFontTextView6 != null) {
                                                        i = R.id.tvBonusDetailValue1;
                                                        DtacFontTextView dtacFontTextView7 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (dtacFontTextView7 != null) {
                                                            i = R.id.tvBonusDetailValue2;
                                                            DtacFontTextView dtacFontTextView8 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                            if (dtacFontTextView8 != null) {
                                                                return new FragmentTopupConfirmBinding(dtacSwipeRefresh, bind, linearLayout, linearLayout2, dtacSwipeRefresh, relativeLayout, dtacClearableEditText, linearLayout3, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5, dtacFontTextView6, dtacFontTextView7, dtacFontTextView8);
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
    public static FragmentTopupConfirmBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentTopupConfirmBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_topup_confirm, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public DtacSwipeRefresh getRoot() {
        return this.f84211a;
    }
}
