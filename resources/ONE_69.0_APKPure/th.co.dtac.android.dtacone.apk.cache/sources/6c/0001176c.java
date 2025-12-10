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
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.IncludeOnePaymentBinding */
/* loaded from: classes7.dex */
public final class IncludeOnePaymentBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayoutCompat f84379a;
    @NonNull
    public final OneFontButton btnConfirm;
    @NonNull
    public final LinearLayout layoutDiscount;
    @NonNull
    public final LinearLayout layoutInput;
    @NonNull
    public final ConstraintLayout layoutToggleReceipt;
    @NonNull
    public final ToggleButton selectGetInvoice;
    @NonNull
    public final OneFontTextView tvMailingTitle;
    @NonNull
    public final OneFontTextView tvProductName;
    @NonNull
    public final OneFontTextView tvSimDiscount;
    @NonNull
    public final OneFontTextView tvSimPrice;
    @NonNull
    public final OneFontTextView tvTotalAmount;

    public IncludeOnePaymentBinding(LinearLayoutCompat linearLayoutCompat, OneFontButton oneFontButton, LinearLayout linearLayout, LinearLayout linearLayout2, ConstraintLayout constraintLayout, ToggleButton toggleButton, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5) {
        this.f84379a = linearLayoutCompat;
        this.btnConfirm = oneFontButton;
        this.layoutDiscount = linearLayout;
        this.layoutInput = linearLayout2;
        this.layoutToggleReceipt = constraintLayout;
        this.selectGetInvoice = toggleButton;
        this.tvMailingTitle = oneFontTextView;
        this.tvProductName = oneFontTextView2;
        this.tvSimDiscount = oneFontTextView3;
        this.tvSimPrice = oneFontTextView4;
        this.tvTotalAmount = oneFontTextView5;
    }

    @NonNull
    public static IncludeOnePaymentBinding bind(@NonNull View view) {
        int i = R.id.btnConfirm;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
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
                            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView != null) {
                                i = R.id.tvProductName;
                                OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView2 != null) {
                                    i = R.id.tvSimDiscount;
                                    OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (oneFontTextView3 != null) {
                                        i = R.id.tvSimPrice;
                                        OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (oneFontTextView4 != null) {
                                            i = R.id.tvTotalAmount;
                                            OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (oneFontTextView5 != null) {
                                                return new IncludeOnePaymentBinding((LinearLayoutCompat) view, oneFontButton, linearLayout, linearLayout2, constraintLayout, toggleButton, oneFontTextView, oneFontTextView2, oneFontTextView3, oneFontTextView4, oneFontTextView5);
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
    public static IncludeOnePaymentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IncludeOnePaymentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.include_one_payment, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayoutCompat getRoot() {
        return this.f84379a;
    }
}