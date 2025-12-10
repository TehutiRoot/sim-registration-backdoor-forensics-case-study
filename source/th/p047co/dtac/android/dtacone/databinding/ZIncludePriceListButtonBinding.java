package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZIncludePriceListButtonBinding */
/* loaded from: classes7.dex */
public final class ZIncludePriceListButtonBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84646a;
    @NonNull
    public final LinearLayout lnlContainerButton;
    @NonNull
    public final DtacFontButton topupBtnPriceOrder1;
    @NonNull
    public final DtacFontButton topupBtnPriceOrder2;
    @NonNull
    public final DtacFontButton topupBtnPriceOrder3;
    @NonNull
    public final DtacFontButton topupBtnPriceOrder4;
    @NonNull
    public final DtacFontButton topupBtnPriceOrder5;
    @NonNull
    public final DtacFontButton topupBtnPriceOrder6;
    @NonNull
    public final DtacFontButton topupBtnPriceOrderOther;

    public ZIncludePriceListButtonBinding(LinearLayout linearLayout, LinearLayout linearLayout2, DtacFontButton dtacFontButton, DtacFontButton dtacFontButton2, DtacFontButton dtacFontButton3, DtacFontButton dtacFontButton4, DtacFontButton dtacFontButton5, DtacFontButton dtacFontButton6, DtacFontButton dtacFontButton7) {
        this.f84646a = linearLayout;
        this.lnlContainerButton = linearLayout2;
        this.topupBtnPriceOrder1 = dtacFontButton;
        this.topupBtnPriceOrder2 = dtacFontButton2;
        this.topupBtnPriceOrder3 = dtacFontButton3;
        this.topupBtnPriceOrder4 = dtacFontButton4;
        this.topupBtnPriceOrder5 = dtacFontButton5;
        this.topupBtnPriceOrder6 = dtacFontButton6;
        this.topupBtnPriceOrderOther = dtacFontButton7;
    }

    @NonNull
    public static ZIncludePriceListButtonBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = R.id.topup_btn_price_order_1;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.topup_btn_price_order_2;
            DtacFontButton dtacFontButton2 = (DtacFontButton) ViewBindings.findChildViewById(view, i);
            if (dtacFontButton2 != null) {
                i = R.id.topup_btn_price_order_3;
                DtacFontButton dtacFontButton3 = (DtacFontButton) ViewBindings.findChildViewById(view, i);
                if (dtacFontButton3 != null) {
                    i = R.id.topup_btn_price_order_4;
                    DtacFontButton dtacFontButton4 = (DtacFontButton) ViewBindings.findChildViewById(view, i);
                    if (dtacFontButton4 != null) {
                        i = R.id.topup_btn_price_order_5;
                        DtacFontButton dtacFontButton5 = (DtacFontButton) ViewBindings.findChildViewById(view, i);
                        if (dtacFontButton5 != null) {
                            i = R.id.topup_btn_price_order_6;
                            DtacFontButton dtacFontButton6 = (DtacFontButton) ViewBindings.findChildViewById(view, i);
                            if (dtacFontButton6 != null) {
                                i = R.id.topup_btn_price_order_other;
                                DtacFontButton dtacFontButton7 = (DtacFontButton) ViewBindings.findChildViewById(view, i);
                                if (dtacFontButton7 != null) {
                                    return new ZIncludePriceListButtonBinding(linearLayout, linearLayout, dtacFontButton, dtacFontButton2, dtacFontButton3, dtacFontButton4, dtacFontButton5, dtacFontButton6, dtacFontButton7);
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
    public static ZIncludePriceListButtonBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZIncludePriceListButtonBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_include_price_list_button, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84646a;
    }
}
