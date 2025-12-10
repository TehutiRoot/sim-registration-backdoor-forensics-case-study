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
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.app_one.widget.OneRadioButton;

/* renamed from: th.co.dtac.android.dtacone.databinding.IncludeOnePaymentSimPriceBinding */
/* loaded from: classes7.dex */
public final class IncludeOnePaymentSimPriceBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayoutCompat f84381a;
    @NonNull
    public final LinearLayoutCompat layoutSimType;
    @NonNull
    public final OneRadioButton rbSimFree;
    @NonNull
    public final OneRadioButton rbSimSale;
    @NonNull
    public final RadioGroup rdbGroupSimPrice;
    @NonNull
    public final OneFontTextView tvSimTitle;

    public IncludeOnePaymentSimPriceBinding(LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2, OneRadioButton oneRadioButton, OneRadioButton oneRadioButton2, RadioGroup radioGroup, OneFontTextView oneFontTextView) {
        this.f84381a = linearLayoutCompat;
        this.layoutSimType = linearLayoutCompat2;
        this.rbSimFree = oneRadioButton;
        this.rbSimSale = oneRadioButton2;
        this.rdbGroupSimPrice = radioGroup;
        this.tvSimTitle = oneFontTextView;
    }

    @NonNull
    public static IncludeOnePaymentSimPriceBinding bind(@NonNull View view) {
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
        int i = R.id.rbSimFree;
        OneRadioButton oneRadioButton = (OneRadioButton) ViewBindings.findChildViewById(view, i);
        if (oneRadioButton != null) {
            i = R.id.rbSimSale;
            OneRadioButton oneRadioButton2 = (OneRadioButton) ViewBindings.findChildViewById(view, i);
            if (oneRadioButton2 != null) {
                i = R.id.rdbGroupSimPrice;
                RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, i);
                if (radioGroup != null) {
                    i = R.id.tvSimTitle;
                    OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView != null) {
                        return new IncludeOnePaymentSimPriceBinding(linearLayoutCompat, linearLayoutCompat, oneRadioButton, oneRadioButton2, radioGroup, oneFontTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static IncludeOnePaymentSimPriceBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IncludeOnePaymentSimPriceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.include_one_payment_sim_price, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayoutCompat getRoot() {
        return this.f84381a;
    }
}