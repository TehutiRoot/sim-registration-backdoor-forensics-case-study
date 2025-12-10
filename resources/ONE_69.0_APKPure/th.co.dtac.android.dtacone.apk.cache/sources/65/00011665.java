package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutText;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOnePostpaidAdditionalAdvancePaymentTrueBinding */
/* loaded from: classes7.dex */
public final class FragmentOnePostpaidAdditionalAdvancePaymentTrueBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84116a;
    @NonNull
    public final OneFontButton btnNext;
    @NonNull
    public final CardView cardView7;
    @NonNull
    public final ConstraintLayout constraintLayout10;
    @NonNull
    public final FrameLayout frameLayout3;
    @NonNull
    public final LinearLayoutCompat layoutContact;
    @NonNull
    public final OneTextInputLayoutText priceTextInputLayout;
    @NonNull
    public final ConstraintLayout root;
    @NonNull
    public final OneFontTextView tvOpenMarket;
    @NonNull
    public final OneFontTextView tvTitle;
    @NonNull
    public final OneFontTextView tvTrueDevice;

    public FragmentOnePostpaidAdditionalAdvancePaymentTrueBinding(ConstraintLayout constraintLayout, OneFontButton oneFontButton, CardView cardView, ConstraintLayout constraintLayout2, FrameLayout frameLayout, LinearLayoutCompat linearLayoutCompat, OneTextInputLayoutText oneTextInputLayoutText, ConstraintLayout constraintLayout3, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3) {
        this.f84116a = constraintLayout;
        this.btnNext = oneFontButton;
        this.cardView7 = cardView;
        this.constraintLayout10 = constraintLayout2;
        this.frameLayout3 = frameLayout;
        this.layoutContact = linearLayoutCompat;
        this.priceTextInputLayout = oneTextInputLayoutText;
        this.root = constraintLayout3;
        this.tvOpenMarket = oneFontTextView;
        this.tvTitle = oneFontTextView2;
        this.tvTrueDevice = oneFontTextView3;
    }

    @NonNull
    public static FragmentOnePostpaidAdditionalAdvancePaymentTrueBinding bind(@NonNull View view) {
        int i = R.id.btnNext;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.cardView7;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
            if (cardView != null) {
                i = R.id.constraintLayout10;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout != null) {
                    i = R.id.frameLayout3;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                    if (frameLayout != null) {
                        i = R.id.layoutContact;
                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                        if (linearLayoutCompat != null) {
                            i = R.id.priceTextInputLayout;
                            OneTextInputLayoutText oneTextInputLayoutText = (OneTextInputLayoutText) ViewBindings.findChildViewById(view, i);
                            if (oneTextInputLayoutText != null) {
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
                                i = R.id.tvOpenMarket;
                                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView != null) {
                                    i = R.id.tvTitle;
                                    OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (oneFontTextView2 != null) {
                                        i = R.id.tvTrueDevice;
                                        OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (oneFontTextView3 != null) {
                                            return new FragmentOnePostpaidAdditionalAdvancePaymentTrueBinding(constraintLayout2, oneFontButton, cardView, constraintLayout, frameLayout, linearLayoutCompat, oneTextInputLayoutText, constraintLayout2, oneFontTextView, oneFontTextView2, oneFontTextView3);
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
    public static FragmentOnePostpaidAdditionalAdvancePaymentTrueBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOnePostpaidAdditionalAdvancePaymentTrueBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_postpaid_additional_advance_payment_true, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84116a;
    }
}