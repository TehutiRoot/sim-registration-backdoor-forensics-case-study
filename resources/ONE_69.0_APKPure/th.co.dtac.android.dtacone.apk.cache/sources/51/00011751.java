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
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacRadioButton;

/* renamed from: th.co.dtac.android.dtacone.databinding.IncludeMrtrPaymentSimPriceBinding */
/* loaded from: classes7.dex */
public final class IncludeMrtrPaymentSimPriceBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayoutCompat f84352a;
    @NonNull
    public final LinearLayoutCompat layoutSimType;
    @NonNull
    public final DtacRadioButton rbSimFree;
    @NonNull
    public final DtacRadioButton rbSimSale;
    @NonNull
    public final RadioGroup rdbGroupSimPrice;
    @NonNull
    public final DtacFontTextView tvSimTitle;

    public IncludeMrtrPaymentSimPriceBinding(LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2, DtacRadioButton dtacRadioButton, DtacRadioButton dtacRadioButton2, RadioGroup radioGroup, DtacFontTextView dtacFontTextView) {
        this.f84352a = linearLayoutCompat;
        this.layoutSimType = linearLayoutCompat2;
        this.rbSimFree = dtacRadioButton;
        this.rbSimSale = dtacRadioButton2;
        this.rdbGroupSimPrice = radioGroup;
        this.tvSimTitle = dtacFontTextView;
    }

    @NonNull
    public static IncludeMrtrPaymentSimPriceBinding bind(@NonNull View view) {
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
        int i = R.id.rbSimFree;
        DtacRadioButton dtacRadioButton = (DtacRadioButton) ViewBindings.findChildViewById(view, i);
        if (dtacRadioButton != null) {
            i = R.id.rbSimSale;
            DtacRadioButton dtacRadioButton2 = (DtacRadioButton) ViewBindings.findChildViewById(view, i);
            if (dtacRadioButton2 != null) {
                i = R.id.rdbGroupSimPrice;
                RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, i);
                if (radioGroup != null) {
                    i = R.id.tvSimTitle;
                    DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView != null) {
                        return new IncludeMrtrPaymentSimPriceBinding(linearLayoutCompat, linearLayoutCompat, dtacRadioButton, dtacRadioButton2, radioGroup, dtacFontTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static IncludeMrtrPaymentSimPriceBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IncludeMrtrPaymentSimPriceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.include_mrtr_payment_sim_price, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayoutCompat getRoot() {
        return this.f84352a;
    }
}