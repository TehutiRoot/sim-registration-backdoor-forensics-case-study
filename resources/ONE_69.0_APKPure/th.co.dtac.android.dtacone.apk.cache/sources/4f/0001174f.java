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
import th.p047co.dtac.android.dtacone.widget.view.DtacClearableEditText;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacRadioButton;

/* renamed from: th.co.dtac.android.dtacone.databinding.IncludeMrtrPaymentChannelBinding */
/* loaded from: classes7.dex */
public final class IncludeMrtrPaymentChannelBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayoutCompat f84350a;
    @NonNull
    public final DtacClearableEditText edtInputIdCredit;
    @NonNull
    public final DtacClearableEditText etCashRemainForCombine;
    @NonNull
    public final DtacClearableEditText etCreditCardAmount;
    @NonNull
    public final DtacClearableEditText etCreditCardNumber;
    @NonNull
    public final LinearLayoutCompat layoutInputCashCredit;
    @NonNull
    public final LinearLayoutCompat layoutPaymentChanel;
    @NonNull
    public final DtacRadioButton rbCash;
    @NonNull
    public final DtacRadioButton rbCashCredit;
    @NonNull
    public final DtacRadioButton rbCredit;
    @NonNull
    public final RadioGroup rdbGroupPayment;
    @NonNull
    public final DtacFontTextView tvPaymentTitle;

    public IncludeMrtrPaymentChannelBinding(LinearLayoutCompat linearLayoutCompat, DtacClearableEditText dtacClearableEditText, DtacClearableEditText dtacClearableEditText2, DtacClearableEditText dtacClearableEditText3, DtacClearableEditText dtacClearableEditText4, LinearLayoutCompat linearLayoutCompat2, LinearLayoutCompat linearLayoutCompat3, DtacRadioButton dtacRadioButton, DtacRadioButton dtacRadioButton2, DtacRadioButton dtacRadioButton3, RadioGroup radioGroup, DtacFontTextView dtacFontTextView) {
        this.f84350a = linearLayoutCompat;
        this.edtInputIdCredit = dtacClearableEditText;
        this.etCashRemainForCombine = dtacClearableEditText2;
        this.etCreditCardAmount = dtacClearableEditText3;
        this.etCreditCardNumber = dtacClearableEditText4;
        this.layoutInputCashCredit = linearLayoutCompat2;
        this.layoutPaymentChanel = linearLayoutCompat3;
        this.rbCash = dtacRadioButton;
        this.rbCashCredit = dtacRadioButton2;
        this.rbCredit = dtacRadioButton3;
        this.rdbGroupPayment = radioGroup;
        this.tvPaymentTitle = dtacFontTextView;
    }

    @NonNull
    public static IncludeMrtrPaymentChannelBinding bind(@NonNull View view) {
        int i = R.id.edtInputIdCredit;
        DtacClearableEditText dtacClearableEditText = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
        if (dtacClearableEditText != null) {
            i = R.id.etCashRemainForCombine;
            DtacClearableEditText dtacClearableEditText2 = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
            if (dtacClearableEditText2 != null) {
                i = R.id.etCreditCardAmount;
                DtacClearableEditText dtacClearableEditText3 = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
                if (dtacClearableEditText3 != null) {
                    i = R.id.etCreditCardNumber;
                    DtacClearableEditText dtacClearableEditText4 = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
                    if (dtacClearableEditText4 != null) {
                        i = R.id.layoutInputCashCredit;
                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                        if (linearLayoutCompat != null) {
                            LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) view;
                            i = R.id.rbCash;
                            DtacRadioButton dtacRadioButton = (DtacRadioButton) ViewBindings.findChildViewById(view, i);
                            if (dtacRadioButton != null) {
                                i = R.id.rbCashCredit;
                                DtacRadioButton dtacRadioButton2 = (DtacRadioButton) ViewBindings.findChildViewById(view, i);
                                if (dtacRadioButton2 != null) {
                                    i = R.id.rbCredit;
                                    DtacRadioButton dtacRadioButton3 = (DtacRadioButton) ViewBindings.findChildViewById(view, i);
                                    if (dtacRadioButton3 != null) {
                                        i = R.id.rdbGroupPayment;
                                        RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, i);
                                        if (radioGroup != null) {
                                            i = R.id.tvPaymentTitle;
                                            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (dtacFontTextView != null) {
                                                return new IncludeMrtrPaymentChannelBinding(linearLayoutCompat2, dtacClearableEditText, dtacClearableEditText2, dtacClearableEditText3, dtacClearableEditText4, linearLayoutCompat, linearLayoutCompat2, dtacRadioButton, dtacRadioButton2, dtacRadioButton3, radioGroup, dtacFontTextView);
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
    public static IncludeMrtrPaymentChannelBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IncludeMrtrPaymentChannelBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.include_mrtr_payment_channel, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayoutCompat getRoot() {
        return this.f84350a;
    }
}