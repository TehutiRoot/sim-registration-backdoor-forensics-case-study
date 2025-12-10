package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.IncludeOnePriceListButtonBinding */
/* loaded from: classes7.dex */
public final class IncludeOnePriceListButtonBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayoutCompat f84385a;
    @NonNull
    public final LinearLayoutCompat lnlContainerButton;
    @NonNull
    public final OneFontTextView topupBtnPriceOrder1;
    @NonNull
    public final OneFontTextView topupBtnPriceOrder2;
    @NonNull
    public final OneFontTextView topupBtnPriceOrder3;
    @NonNull
    public final OneFontTextView topupBtnPriceOrder4;
    @NonNull
    public final OneFontTextView topupBtnPriceOrder5;
    @NonNull
    public final OneFontTextView topupBtnPriceOrder6;
    @NonNull
    public final OneFontTextView topupBtnPriceOrderOther;

    public IncludeOnePriceListButtonBinding(LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5, OneFontTextView oneFontTextView6, OneFontTextView oneFontTextView7) {
        this.f84385a = linearLayoutCompat;
        this.lnlContainerButton = linearLayoutCompat2;
        this.topupBtnPriceOrder1 = oneFontTextView;
        this.topupBtnPriceOrder2 = oneFontTextView2;
        this.topupBtnPriceOrder3 = oneFontTextView3;
        this.topupBtnPriceOrder4 = oneFontTextView4;
        this.topupBtnPriceOrder5 = oneFontTextView5;
        this.topupBtnPriceOrder6 = oneFontTextView6;
        this.topupBtnPriceOrderOther = oneFontTextView7;
    }

    @NonNull
    public static IncludeOnePriceListButtonBinding bind(@NonNull View view) {
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
        int i = R.id.topup_btn_price_order_1;
        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
        if (oneFontTextView != null) {
            i = R.id.topup_btn_price_order_2;
            OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView2 != null) {
                i = R.id.topup_btn_price_order_3;
                OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView3 != null) {
                    i = R.id.topup_btn_price_order_4;
                    OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView4 != null) {
                        i = R.id.topup_btn_price_order_5;
                        OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView5 != null) {
                            i = R.id.topup_btn_price_order_6;
                            OneFontTextView oneFontTextView6 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView6 != null) {
                                i = R.id.topup_btn_price_order_other;
                                OneFontTextView oneFontTextView7 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView7 != null) {
                                    return new IncludeOnePriceListButtonBinding(linearLayoutCompat, linearLayoutCompat, oneFontTextView, oneFontTextView2, oneFontTextView3, oneFontTextView4, oneFontTextView5, oneFontTextView6, oneFontTextView7);
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
    public static IncludeOnePriceListButtonBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IncludeOnePriceListButtonBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.include_one_price_list_button, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayoutCompat getRoot() {
        return this.f84385a;
    }
}