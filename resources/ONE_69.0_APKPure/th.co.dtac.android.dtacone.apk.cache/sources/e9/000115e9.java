package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTabLayout;
import th.p047co.dtac.android.dtacone.widget.view.WrapContentViewPager;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneBuyDolPaymentInfoBinding */
/* loaded from: classes7.dex */
public final class FragmentOneBuyDolPaymentInfoBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f83992a;
    @NonNull
    public final OneFontTextView buyDolAmountMoneyTextView;
    @NonNull
    public final OneFontTextView buyDolAmountTextView;
    @NonNull
    public final OneFontTextView buyDolDesiredAmountOfMoney;
    @NonNull
    public final OneFontTextView buyDolDesiredAmountOfMoneyBahtTextView;
    @NonNull
    public final OneFontTextView buyDolDesiredAmountTextView;
    @NonNull
    public final OneFontTextView buyDolFeeTextView;
    @NonNull
    public final OneFontTextView buyDolMoneyOfFeeTextView;
    @NonNull
    public final OneFontTextView buyDolNumberOnlineTextView;
    @NonNull
    public final View lineView;
    @NonNull
    public final NestedScrollView oneBuyDolPaymentInfoNestedScrollView;
    @NonNull
    public final ConstraintLayout pagerLayout;
    @NonNull
    public final FrameLayout paymentInfoContainer;
    @NonNull
    public final ConstraintLayout paymentInfoDetailLayout;
    @NonNull
    public final OneFontTextView paymentInfoDetailTextView;
    @NonNull
    public final ConstraintLayout paymentInfoLayout;
    @NonNull
    public final ConstraintLayout paymentMethodDetailLayout;
    @NonNull
    public final ConstraintLayout paymentMethodInfoDetailLayout;
    @NonNull
    public final OneFontTextView paymentMethodInfoDetailTextView;
    @NonNull
    public final OneFontTextView phoneNumberTextView;
    @NonNull
    public final OneTabLayout selcetPaymentMethodTabLayout;
    @NonNull
    public final WrapContentViewPager selcetPaymentMethodViewPager;

    public FragmentOneBuyDolPaymentInfoBinding(NestedScrollView nestedScrollView, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5, OneFontTextView oneFontTextView6, OneFontTextView oneFontTextView7, OneFontTextView oneFontTextView8, View view, NestedScrollView nestedScrollView2, ConstraintLayout constraintLayout, FrameLayout frameLayout, ConstraintLayout constraintLayout2, OneFontTextView oneFontTextView9, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, ConstraintLayout constraintLayout5, OneFontTextView oneFontTextView10, OneFontTextView oneFontTextView11, OneTabLayout oneTabLayout, WrapContentViewPager wrapContentViewPager) {
        this.f83992a = nestedScrollView;
        this.buyDolAmountMoneyTextView = oneFontTextView;
        this.buyDolAmountTextView = oneFontTextView2;
        this.buyDolDesiredAmountOfMoney = oneFontTextView3;
        this.buyDolDesiredAmountOfMoneyBahtTextView = oneFontTextView4;
        this.buyDolDesiredAmountTextView = oneFontTextView5;
        this.buyDolFeeTextView = oneFontTextView6;
        this.buyDolMoneyOfFeeTextView = oneFontTextView7;
        this.buyDolNumberOnlineTextView = oneFontTextView8;
        this.lineView = view;
        this.oneBuyDolPaymentInfoNestedScrollView = nestedScrollView2;
        this.pagerLayout = constraintLayout;
        this.paymentInfoContainer = frameLayout;
        this.paymentInfoDetailLayout = constraintLayout2;
        this.paymentInfoDetailTextView = oneFontTextView9;
        this.paymentInfoLayout = constraintLayout3;
        this.paymentMethodDetailLayout = constraintLayout4;
        this.paymentMethodInfoDetailLayout = constraintLayout5;
        this.paymentMethodInfoDetailTextView = oneFontTextView10;
        this.phoneNumberTextView = oneFontTextView11;
        this.selcetPaymentMethodTabLayout = oneTabLayout;
        this.selcetPaymentMethodViewPager = wrapContentViewPager;
    }

    @NonNull
    public static FragmentOneBuyDolPaymentInfoBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.buyDolAmountMoneyTextView;
        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
        if (oneFontTextView != null) {
            i = R.id.buyDolAmountTextView;
            OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView2 != null) {
                i = R.id.buyDolDesiredAmountOfMoney;
                OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView3 != null) {
                    i = R.id.buyDolDesiredAmountOfMoneyBahtTextView;
                    OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView4 != null) {
                        i = R.id.buyDolDesiredAmountTextView;
                        OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView5 != null) {
                            i = R.id.buyDolFeeTextView;
                            OneFontTextView oneFontTextView6 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView6 != null) {
                                i = R.id.buyDolMoneyOfFeeTextView;
                                OneFontTextView oneFontTextView7 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView7 != null) {
                                    i = R.id.buyDolNumberOnlineTextView;
                                    OneFontTextView oneFontTextView8 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (oneFontTextView8 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.lineView))) != null) {
                                        NestedScrollView nestedScrollView = (NestedScrollView) view;
                                        i = R.id.pagerLayout;
                                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                        if (constraintLayout != null) {
                                            i = R.id.paymentInfoContainer;
                                            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                            if (frameLayout != null) {
                                                i = R.id.paymentInfoDetailLayout;
                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                if (constraintLayout2 != null) {
                                                    i = R.id.paymentInfoDetailTextView;
                                                    OneFontTextView oneFontTextView9 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (oneFontTextView9 != null) {
                                                        i = R.id.paymentInfoLayout;
                                                        ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                        if (constraintLayout3 != null) {
                                                            i = R.id.paymentMethodDetailLayout;
                                                            ConstraintLayout constraintLayout4 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                            if (constraintLayout4 != null) {
                                                                i = R.id.paymentMethodInfoDetailLayout;
                                                                ConstraintLayout constraintLayout5 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                if (constraintLayout5 != null) {
                                                                    i = R.id.paymentMethodInfoDetailTextView;
                                                                    OneFontTextView oneFontTextView10 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (oneFontTextView10 != null) {
                                                                        i = R.id.phoneNumberTextView;
                                                                        OneFontTextView oneFontTextView11 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (oneFontTextView11 != null) {
                                                                            i = R.id.selcetPaymentMethodTabLayout;
                                                                            OneTabLayout oneTabLayout = (OneTabLayout) ViewBindings.findChildViewById(view, i);
                                                                            if (oneTabLayout != null) {
                                                                                i = R.id.selcetPaymentMethodViewPager;
                                                                                WrapContentViewPager wrapContentViewPager = (WrapContentViewPager) ViewBindings.findChildViewById(view, i);
                                                                                if (wrapContentViewPager != null) {
                                                                                    return new FragmentOneBuyDolPaymentInfoBinding(nestedScrollView, oneFontTextView, oneFontTextView2, oneFontTextView3, oneFontTextView4, oneFontTextView5, oneFontTextView6, oneFontTextView7, oneFontTextView8, findChildViewById, nestedScrollView, constraintLayout, frameLayout, constraintLayout2, oneFontTextView9, constraintLayout3, constraintLayout4, constraintLayout5, oneFontTextView10, oneFontTextView11, oneTabLayout, wrapContentViewPager);
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
    public static FragmentOneBuyDolPaymentInfoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneBuyDolPaymentInfoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_buy_dol_payment_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f83992a;
    }
}