package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneCreditCardEditText;
import th.p047co.dtac.android.dtacone.app_one.widget.OneCustomClearableEditText;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacRecyclerView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneBuyDolCreditCardBinding */
/* loaded from: classes7.dex */
public final class FragmentOneBuyDolCreditCardBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83989a;
    @NonNull
    public final ConstraintLayout addCreditCardLayout;
    @NonNull
    public final LinearLayout addMoreCreditLayout;
    @NonNull
    public final OneFontButton cancelSaveCreditCardButton;
    @NonNull
    public final OneCustomClearableEditText cardExpiredEditText;
    @NonNull
    public final DtacRecyclerView cardListRecyclerView;
    @NonNull
    public final OneCreditCardEditText ccvCreditCardEditText;
    @NonNull
    public final Guideline centerAddCreditCardHorizontalGuideLine;
    @NonNull
    public final OneFontButton confirmSaveCreditCardButton;
    @NonNull
    public final ConstraintLayout creditCardListLayout;
    @NonNull
    public final ConstraintLayout creditCardMainLayout;
    @NonNull
    public final OneCreditCardEditText creditCardNumberEditText;
    @NonNull
    public final AppCompatCheckBox saveCreditCheckBox;
    @NonNull
    public final OneFontTextView tvAddCreditCard;
    @NonNull
    public final OneCustomClearableEditText userCreditCardEditText;

    public FragmentOneBuyDolCreditCardBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, LinearLayout linearLayout, OneFontButton oneFontButton, OneCustomClearableEditText oneCustomClearableEditText, DtacRecyclerView dtacRecyclerView, OneCreditCardEditText oneCreditCardEditText, Guideline guideline, OneFontButton oneFontButton2, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, OneCreditCardEditText oneCreditCardEditText2, AppCompatCheckBox appCompatCheckBox, OneFontTextView oneFontTextView, OneCustomClearableEditText oneCustomClearableEditText2) {
        this.f83989a = constraintLayout;
        this.addCreditCardLayout = constraintLayout2;
        this.addMoreCreditLayout = linearLayout;
        this.cancelSaveCreditCardButton = oneFontButton;
        this.cardExpiredEditText = oneCustomClearableEditText;
        this.cardListRecyclerView = dtacRecyclerView;
        this.ccvCreditCardEditText = oneCreditCardEditText;
        this.centerAddCreditCardHorizontalGuideLine = guideline;
        this.confirmSaveCreditCardButton = oneFontButton2;
        this.creditCardListLayout = constraintLayout3;
        this.creditCardMainLayout = constraintLayout4;
        this.creditCardNumberEditText = oneCreditCardEditText2;
        this.saveCreditCheckBox = appCompatCheckBox;
        this.tvAddCreditCard = oneFontTextView;
        this.userCreditCardEditText = oneCustomClearableEditText2;
    }

    @NonNull
    public static FragmentOneBuyDolCreditCardBinding bind(@NonNull View view) {
        int i = R.id.addCreditCardLayout;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = R.id.addMoreCreditLayout;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = R.id.cancelSaveCreditCardButton;
                OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
                if (oneFontButton != null) {
                    i = R.id.cardExpiredEditText;
                    OneCustomClearableEditText oneCustomClearableEditText = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
                    if (oneCustomClearableEditText != null) {
                        i = R.id.cardListRecyclerView;
                        DtacRecyclerView dtacRecyclerView = (DtacRecyclerView) ViewBindings.findChildViewById(view, i);
                        if (dtacRecyclerView != null) {
                            i = R.id.ccvCreditCardEditText;
                            OneCreditCardEditText oneCreditCardEditText = (OneCreditCardEditText) ViewBindings.findChildViewById(view, i);
                            if (oneCreditCardEditText != null) {
                                i = R.id.centerAddCreditCardHorizontalGuideLine;
                                Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                                if (guideline != null) {
                                    i = R.id.confirmSaveCreditCardButton;
                                    OneFontButton oneFontButton2 = (OneFontButton) ViewBindings.findChildViewById(view, i);
                                    if (oneFontButton2 != null) {
                                        i = R.id.creditCardListLayout;
                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                        if (constraintLayout2 != null) {
                                            i = R.id.creditCardMainLayout;
                                            ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                            if (constraintLayout3 != null) {
                                                i = R.id.creditCardNumberEditText;
                                                OneCreditCardEditText oneCreditCardEditText2 = (OneCreditCardEditText) ViewBindings.findChildViewById(view, i);
                                                if (oneCreditCardEditText2 != null) {
                                                    i = R.id.saveCreditCheckBox;
                                                    AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(view, i);
                                                    if (appCompatCheckBox != null) {
                                                        i = R.id.tvAddCreditCard;
                                                        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (oneFontTextView != null) {
                                                            i = R.id.userCreditCardEditText;
                                                            OneCustomClearableEditText oneCustomClearableEditText2 = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
                                                            if (oneCustomClearableEditText2 != null) {
                                                                return new FragmentOneBuyDolCreditCardBinding((ConstraintLayout) view, constraintLayout, linearLayout, oneFontButton, oneCustomClearableEditText, dtacRecyclerView, oneCreditCardEditText, guideline, oneFontButton2, constraintLayout2, constraintLayout3, oneCreditCardEditText2, appCompatCheckBox, oneFontTextView, oneCustomClearableEditText2);
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
    public static FragmentOneBuyDolCreditCardBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneBuyDolCreditCardBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_buy_dol_credit_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83989a;
    }
}