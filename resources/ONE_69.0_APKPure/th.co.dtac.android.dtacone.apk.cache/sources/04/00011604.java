package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneDeviceSaleAdditionalAdvancePaymentBinding */
/* loaded from: classes7.dex */
public final class FragmentOneDeviceSaleAdditionalAdvancePaymentBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84019a;
    @NonNull
    public final OneFontButton btnNext;
    @NonNull
    public final CardView cardView7;
    @NonNull
    public final ConstraintLayout constraintLayout10;
    @NonNull
    public final ConstraintLayout frameLayout3;
    @NonNull
    public final ImageView ivDeviceType;
    @NonNull
    public final LinearLayoutCompat layoutContact;
    @NonNull
    public final OneTextInputLayoutText priceTextInputLayout;
    @NonNull
    public final ConstraintLayout root;
    @NonNull
    public final OneFontTextView textViewContract;
    @NonNull
    public final OneFontTextView tvTitle;

    public FragmentOneDeviceSaleAdditionalAdvancePaymentBinding(ConstraintLayout constraintLayout, OneFontButton oneFontButton, CardView cardView, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ImageView imageView, LinearLayoutCompat linearLayoutCompat, OneTextInputLayoutText oneTextInputLayoutText, ConstraintLayout constraintLayout4, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2) {
        this.f84019a = constraintLayout;
        this.btnNext = oneFontButton;
        this.cardView7 = cardView;
        this.constraintLayout10 = constraintLayout2;
        this.frameLayout3 = constraintLayout3;
        this.ivDeviceType = imageView;
        this.layoutContact = linearLayoutCompat;
        this.priceTextInputLayout = oneTextInputLayoutText;
        this.root = constraintLayout4;
        this.textViewContract = oneFontTextView;
        this.tvTitle = oneFontTextView2;
    }

    @NonNull
    public static FragmentOneDeviceSaleAdditionalAdvancePaymentBinding bind(@NonNull View view) {
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
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout2 != null) {
                        i = R.id.ivDeviceType;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            i = R.id.layoutContact;
                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                            if (linearLayoutCompat != null) {
                                i = R.id.priceTextInputLayout;
                                OneTextInputLayoutText oneTextInputLayoutText = (OneTextInputLayoutText) ViewBindings.findChildViewById(view, i);
                                if (oneTextInputLayoutText != null) {
                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) view;
                                    i = R.id.textViewContract;
                                    OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (oneFontTextView != null) {
                                        i = R.id.tvTitle;
                                        OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (oneFontTextView2 != null) {
                                            return new FragmentOneDeviceSaleAdditionalAdvancePaymentBinding(constraintLayout3, oneFontButton, cardView, constraintLayout, constraintLayout2, imageView, linearLayoutCompat, oneTextInputLayoutText, constraintLayout3, oneFontTextView, oneFontTextView2);
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
    public static FragmentOneDeviceSaleAdditionalAdvancePaymentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneDeviceSaleAdditionalAdvancePaymentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_device_sale_additional_advance_payment, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84019a;
    }
}