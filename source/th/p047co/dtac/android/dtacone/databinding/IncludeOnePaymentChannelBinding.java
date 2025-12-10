package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneCustomClearableEditText;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.app_one.widget.OneRadioButton;

/* renamed from: th.co.dtac.android.dtacone.databinding.IncludeOnePaymentChannelBinding */
/* loaded from: classes7.dex */
public final class IncludeOnePaymentChannelBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayoutCompat f84276a;
    @NonNull
    public final OneCustomClearableEditText edtInputIdCredit;
    @NonNull
    public final OneCustomClearableEditText etCashRemainForCombine;
    @NonNull
    public final OneCustomClearableEditText etCreditCardAmount;
    @NonNull
    public final OneCustomClearableEditText etCreditCardNumber;
    @NonNull
    public final LinearLayoutCompat layoutInputCashCredit;
    @NonNull
    public final LinearLayoutCompat layoutPaymentChanel;
    @NonNull
    public final OneRadioButton rbCash;
    @NonNull
    public final OneRadioButton rbCashCredit;
    @NonNull
    public final OneRadioButton rbCredit;
    @NonNull
    public final RadioGroup rdbGroupPayment;
    @NonNull
    public final OneFontTextView tvPaymentTitle;

    public IncludeOnePaymentChannelBinding(LinearLayoutCompat linearLayoutCompat, OneCustomClearableEditText oneCustomClearableEditText, OneCustomClearableEditText oneCustomClearableEditText2, OneCustomClearableEditText oneCustomClearableEditText3, OneCustomClearableEditText oneCustomClearableEditText4, LinearLayoutCompat linearLayoutCompat2, LinearLayoutCompat linearLayoutCompat3, OneRadioButton oneRadioButton, OneRadioButton oneRadioButton2, OneRadioButton oneRadioButton3, RadioGroup radioGroup, OneFontTextView oneFontTextView) {
        this.f84276a = linearLayoutCompat;
        this.edtInputIdCredit = oneCustomClearableEditText;
        this.etCashRemainForCombine = oneCustomClearableEditText2;
        this.etCreditCardAmount = oneCustomClearableEditText3;
        this.etCreditCardNumber = oneCustomClearableEditText4;
        this.layoutInputCashCredit = linearLayoutCompat2;
        this.layoutPaymentChanel = linearLayoutCompat3;
        this.rbCash = oneRadioButton;
        this.rbCashCredit = oneRadioButton2;
        this.rbCredit = oneRadioButton3;
        this.rdbGroupPayment = radioGroup;
        this.tvPaymentTitle = oneFontTextView;
    }

    @NonNull
    public static IncludeOnePaymentChannelBinding bind(@NonNull View view) {
        int i = R.id.edtInputIdCredit;
        OneCustomClearableEditText oneCustomClearableEditText = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
        if (oneCustomClearableEditText != null) {
            i = R.id.etCashRemainForCombine;
            OneCustomClearableEditText oneCustomClearableEditText2 = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
            if (oneCustomClearableEditText2 != null) {
                i = R.id.etCreditCardAmount;
                OneCustomClearableEditText oneCustomClearableEditText3 = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
                if (oneCustomClearableEditText3 != null) {
                    i = R.id.etCreditCardNumber;
                    OneCustomClearableEditText oneCustomClearableEditText4 = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
                    if (oneCustomClearableEditText4 != null) {
                        i = R.id.layoutInputCashCredit;
                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                        if (linearLayoutCompat != null) {
                            LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) view;
                            i = R.id.rbCash;
                            OneRadioButton oneRadioButton = (OneRadioButton) ViewBindings.findChildViewById(view, i);
                            if (oneRadioButton != null) {
                                i = R.id.rbCashCredit;
                                OneRadioButton oneRadioButton2 = (OneRadioButton) ViewBindings.findChildViewById(view, i);
                                if (oneRadioButton2 != null) {
                                    i = R.id.rbCredit;
                                    OneRadioButton oneRadioButton3 = (OneRadioButton) ViewBindings.findChildViewById(view, i);
                                    if (oneRadioButton3 != null) {
                                        i = R.id.rdbGroupPayment;
                                        RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, i);
                                        if (radioGroup != null) {
                                            i = R.id.tvPaymentTitle;
                                            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (oneFontTextView != null) {
                                                return new IncludeOnePaymentChannelBinding(linearLayoutCompat2, oneCustomClearableEditText, oneCustomClearableEditText2, oneCustomClearableEditText3, oneCustomClearableEditText4, linearLayoutCompat, linearLayoutCompat2, oneRadioButton, oneRadioButton2, oneRadioButton3, radioGroup, oneFontTextView);
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
    public static IncludeOnePaymentChannelBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IncludeOnePaymentChannelBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.include_one_payment_channel, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayoutCompat getRoot() {
        return this.f84276a;
    }
}
