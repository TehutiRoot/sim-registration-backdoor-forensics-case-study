package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneCustomClearableEditText;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.app_one.widget.loading.OneSwipeRefresh;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneTopupConfirmBinding */
/* loaded from: classes7.dex */
public final class FragmentOneTopupConfirmBinding implements ViewBinding {

    /* renamed from: a */
    public final OneSwipeRefresh f84231a;
    @NonNull
    public final OneBalanceBoxBinding balanceBox;
    @NonNull
    public final LinearLayoutCompat confirmBonusDetails;
    @NonNull
    public final LinearLayoutCompat confirmDetails;
    @NonNull
    public final OneSwipeRefresh confirmSwipeRefresh;
    @NonNull
    public final ImageView icMoney;
    @NonNull
    public final ImageView icPhone;
    @NonNull
    public final ImageView ivClearText;
    @NonNull
    public final RelativeLayout root;
    @NonNull
    public final OneCustomClearableEditText topupEdtConfirmPin;
    @NonNull
    public final LinearLayoutCompat topupLlvConfirmSubscriberNumber;
    @NonNull
    public final OneFontTextView topupTvConfirmSubscriberNumber;
    @NonNull
    public final OneFontTextView topupTvConfirmTopupAmountValue;
    @NonNull
    public final OneFontTextView tvBonus;
    @NonNull
    public final OneFontTextView tvBonusDetailTitle1;
    @NonNull
    public final OneFontTextView tvBonusDetailTitle2;
    @NonNull
    public final OneFontTextView tvBonusDetailValue1;
    @NonNull
    public final OneFontTextView tvBonusDetailValue2;
    @NonNull
    public final OneFontTextView tvInformationTitle;
    @NonNull
    public final View vSeparateLine;

    public FragmentOneTopupConfirmBinding(OneSwipeRefresh oneSwipeRefresh, OneBalanceBoxBinding oneBalanceBoxBinding, LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2, OneSwipeRefresh oneSwipeRefresh2, ImageView imageView, ImageView imageView2, ImageView imageView3, RelativeLayout relativeLayout, OneCustomClearableEditText oneCustomClearableEditText, LinearLayoutCompat linearLayoutCompat3, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5, OneFontTextView oneFontTextView6, OneFontTextView oneFontTextView7, OneFontTextView oneFontTextView8, View view) {
        this.f84231a = oneSwipeRefresh;
        this.balanceBox = oneBalanceBoxBinding;
        this.confirmBonusDetails = linearLayoutCompat;
        this.confirmDetails = linearLayoutCompat2;
        this.confirmSwipeRefresh = oneSwipeRefresh2;
        this.icMoney = imageView;
        this.icPhone = imageView2;
        this.ivClearText = imageView3;
        this.root = relativeLayout;
        this.topupEdtConfirmPin = oneCustomClearableEditText;
        this.topupLlvConfirmSubscriberNumber = linearLayoutCompat3;
        this.topupTvConfirmSubscriberNumber = oneFontTextView;
        this.topupTvConfirmTopupAmountValue = oneFontTextView2;
        this.tvBonus = oneFontTextView3;
        this.tvBonusDetailTitle1 = oneFontTextView4;
        this.tvBonusDetailTitle2 = oneFontTextView5;
        this.tvBonusDetailValue1 = oneFontTextView6;
        this.tvBonusDetailValue2 = oneFontTextView7;
        this.tvInformationTitle = oneFontTextView8;
        this.vSeparateLine = view;
    }

    @NonNull
    public static FragmentOneTopupConfirmBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.balance_box;
        View findChildViewById2 = ViewBindings.findChildViewById(view, i);
        if (findChildViewById2 != null) {
            OneBalanceBoxBinding bind = OneBalanceBoxBinding.bind(findChildViewById2);
            i = R.id.confirm_bonus_details;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
            if (linearLayoutCompat != null) {
                i = R.id.confirm_details;
                LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                if (linearLayoutCompat2 != null) {
                    OneSwipeRefresh oneSwipeRefresh = (OneSwipeRefresh) view;
                    i = R.id.icMoney;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R.id.icPhone;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView2 != null) {
                            i = R.id.ivClearText;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView3 != null) {
                                i = R.id.root;
                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                if (relativeLayout != null) {
                                    i = R.id.topup_edt_confirm_pin;
                                    OneCustomClearableEditText oneCustomClearableEditText = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
                                    if (oneCustomClearableEditText != null) {
                                        i = R.id.topup_llv_confirm_subscriber_number;
                                        LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                        if (linearLayoutCompat3 != null) {
                                            i = R.id.topup_tv_confirm_subscriber_number;
                                            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (oneFontTextView != null) {
                                                i = R.id.topup_tv_confirm_topup_amount_value;
                                                OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (oneFontTextView2 != null) {
                                                    i = R.id.tv_bonus;
                                                    OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (oneFontTextView3 != null) {
                                                        i = R.id.tvBonusDetailTitle1;
                                                        OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (oneFontTextView4 != null) {
                                                            i = R.id.tvBonusDetailTitle2;
                                                            OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                            if (oneFontTextView5 != null) {
                                                                i = R.id.tvBonusDetailValue1;
                                                                OneFontTextView oneFontTextView6 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                if (oneFontTextView6 != null) {
                                                                    i = R.id.tvBonusDetailValue2;
                                                                    OneFontTextView oneFontTextView7 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (oneFontTextView7 != null) {
                                                                        i = R.id.tvInformationTitle;
                                                                        OneFontTextView oneFontTextView8 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (oneFontTextView8 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.vSeparateLine))) != null) {
                                                                            return new FragmentOneTopupConfirmBinding(oneSwipeRefresh, bind, linearLayoutCompat, linearLayoutCompat2, oneSwipeRefresh, imageView, imageView2, imageView3, relativeLayout, oneCustomClearableEditText, linearLayoutCompat3, oneFontTextView, oneFontTextView2, oneFontTextView3, oneFontTextView4, oneFontTextView5, oneFontTextView6, oneFontTextView7, oneFontTextView8, findChildViewById);
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
    public static FragmentOneTopupConfirmBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneTopupConfirmBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_topup_confirm, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public OneSwipeRefresh getRoot() {
        return this.f84231a;
    }
}