package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ToggleButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.IncludeMrtrPaymentBinding */
/* loaded from: classes7.dex */
public final class IncludeMrtrPaymentBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayoutCompat f84245a;
    @NonNull
    public final DtacFontButton btnConfirm;
    @NonNull
    public final LinearLayout layoutDiscount;
    @NonNull
    public final LinearLayout layoutInput;
    @NonNull
    public final ConstraintLayout layoutToggleReceipt;
    @NonNull
    public final ToggleButton selectGetInvoice;
    @NonNull
    public final DtacFontTextView tvMailingTitle;
    @NonNull
    public final DtacFontTextView tvProductName;
    @NonNull
    public final DtacFontTextView tvSimDiscount;
    @NonNull
    public final DtacFontTextView tvSimPrice;
    @NonNull
    public final DtacFontTextView tvTotalAmount;

    public IncludeMrtrPaymentBinding(LinearLayoutCompat linearLayoutCompat, DtacFontButton dtacFontButton, LinearLayout linearLayout, LinearLayout linearLayout2, ConstraintLayout constraintLayout, ToggleButton toggleButton, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5) {
        this.f84245a = linearLayoutCompat;
        this.btnConfirm = dtacFontButton;
        this.layoutDiscount = linearLayout;
        this.layoutInput = linearLayout2;
        this.layoutToggleReceipt = constraintLayout;
        this.selectGetInvoice = toggleButton;
        this.tvMailingTitle = dtacFontTextView;
        this.tvProductName = dtacFontTextView2;
        this.tvSimDiscount = dtacFontTextView3;
        this.tvSimPrice = dtacFontTextView4;
        this.tvTotalAmount = dtacFontTextView5;
    }

    @NonNull
    public static IncludeMrtrPaymentBinding bind(@NonNull View view) {
        int i = R.id.btnConfirm;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.layout_discount;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = R.id.layoutInput;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout2 != null) {
                    i = R.id.layout_toggle_receipt;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout != null) {
                        i = R.id.selectGetInvoice;
                        ToggleButton toggleButton = (ToggleButton) ViewBindings.findChildViewById(view, i);
                        if (toggleButton != null) {
                            i = R.id.tv_mailing_title;
                            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView != null) {
                                i = R.id.tvProductName;
                                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView2 != null) {
                                    i = R.id.tvSimDiscount;
                                    DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView3 != null) {
                                        i = R.id.tvSimPrice;
                                        DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (dtacFontTextView4 != null) {
                                            i = R.id.tvTotalAmount;
                                            DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (dtacFontTextView5 != null) {
                                                return new IncludeMrtrPaymentBinding((LinearLayoutCompat) view, dtacFontButton, linearLayout, linearLayout2, constraintLayout, toggleButton, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5);
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
    public static IncludeMrtrPaymentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IncludeMrtrPaymentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.include_mrtr_payment, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayoutCompat getRoot() {
        return this.f84245a;
    }
}
