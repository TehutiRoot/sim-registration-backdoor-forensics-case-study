package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentDeviceSalePaymentInfoBinding */
/* loaded from: classes7.dex */
public final class FragmentDeviceSalePaymentInfoBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f83696a;
    @NonNull
    public final DtacFontButton btnConfirm;
    @NonNull
    public final LinearLayout layoutAdvancePayment;
    @NonNull
    public final LinearLayout layoutDiscount;
    @NonNull
    public final LinearLayout layoutInput;
    @NonNull
    public final NestedScrollView layoutScrollView;
    @NonNull
    public final DtacFontTextView tvAdvancePayment;
    @NonNull
    public final DtacFontTextView tvDeviceDiscount;
    @NonNull
    public final DtacFontTextView tvDevicePrice;
    @NonNull
    public final DtacFontTextView tvTotalAmount;

    public FragmentDeviceSalePaymentInfoBinding(NestedScrollView nestedScrollView, DtacFontButton dtacFontButton, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, NestedScrollView nestedScrollView2, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4) {
        this.f83696a = nestedScrollView;
        this.btnConfirm = dtacFontButton;
        this.layoutAdvancePayment = linearLayout;
        this.layoutDiscount = linearLayout2;
        this.layoutInput = linearLayout3;
        this.layoutScrollView = nestedScrollView2;
        this.tvAdvancePayment = dtacFontTextView;
        this.tvDeviceDiscount = dtacFontTextView2;
        this.tvDevicePrice = dtacFontTextView3;
        this.tvTotalAmount = dtacFontTextView4;
    }

    @NonNull
    public static FragmentDeviceSalePaymentInfoBinding bind(@NonNull View view) {
        int i = R.id.btnConfirm;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.layoutAdvancePayment;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = R.id.layout_discount;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout2 != null) {
                    i = R.id.layoutInput;
                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout3 != null) {
                        NestedScrollView nestedScrollView = (NestedScrollView) view;
                        i = R.id.tvAdvancePayment;
                        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView != null) {
                            i = R.id.tvDeviceDiscount;
                            DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView2 != null) {
                                i = R.id.tvDevicePrice;
                                DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView3 != null) {
                                    i = R.id.tvTotalAmount;
                                    DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView4 != null) {
                                        return new FragmentDeviceSalePaymentInfoBinding(nestedScrollView, dtacFontButton, linearLayout, linearLayout2, linearLayout3, nestedScrollView, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4);
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
    public static FragmentDeviceSalePaymentInfoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentDeviceSalePaymentInfoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_device_sale_payment_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f83696a;
    }
}
