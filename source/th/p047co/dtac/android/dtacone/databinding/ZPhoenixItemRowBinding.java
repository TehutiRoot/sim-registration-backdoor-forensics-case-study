package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZPhoenixItemRowBinding */
/* loaded from: classes7.dex */
public final class ZPhoenixItemRowBinding implements ViewBinding {

    /* renamed from: a */
    public final CardView f84680a;
    @NonNull
    public final CardView cvPhoenix;
    @NonNull
    public final LinearLayout linearBox;
    @NonNull
    public final LinearLayout rdb30Day;
    @NonNull
    public final LinearLayout rdb7Day;
    @NonNull
    public final DtacFontTextView tv30DayStvCommissionPercent;
    @NonNull
    public final DtacFontTextView tv30DayStvPrice;
    @NonNull
    public final DtacFontTextView tv7DayStvCommissionPercent;
    @NonNull
    public final DtacFontTextView tv7DayStvPrice;
    @NonNull
    public final DtacFontTextView tvSpeed;
    @NonNull
    public final View v30DayOpacity;
    @NonNull
    public final View v7DayOpacity;

    public ZPhoenixItemRowBinding(CardView cardView, CardView cardView2, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5, View view, View view2) {
        this.f84680a = cardView;
        this.cvPhoenix = cardView2;
        this.linearBox = linearLayout;
        this.rdb30Day = linearLayout2;
        this.rdb7Day = linearLayout3;
        this.tv30DayStvCommissionPercent = dtacFontTextView;
        this.tv30DayStvPrice = dtacFontTextView2;
        this.tv7DayStvCommissionPercent = dtacFontTextView3;
        this.tv7DayStvPrice = dtacFontTextView4;
        this.tvSpeed = dtacFontTextView5;
        this.v30DayOpacity = view;
        this.v7DayOpacity = view2;
    }

    @NonNull
    public static ZPhoenixItemRowBinding bind(@NonNull View view) {
        View findChildViewById;
        View findChildViewById2;
        CardView cardView = (CardView) view;
        int i = R.id.linearBox;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.rdb30Day;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout2 != null) {
                i = R.id.rdb7Day;
                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout3 != null) {
                    i = R.id.tv30DayStvCommissionPercent;
                    DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView != null) {
                        i = R.id.tv30DayStvPrice;
                        DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView2 != null) {
                            i = R.id.tv7DayStvCommissionPercent;
                            DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView3 != null) {
                                i = R.id.tv7DayStvPrice;
                                DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView4 != null) {
                                    i = R.id.tvSpeed;
                                    DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView5 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.v30DayOpacity))) != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.v7DayOpacity))) != null) {
                                        return new ZPhoenixItemRowBinding(cardView, cardView, linearLayout, linearLayout2, linearLayout3, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5, findChildViewById, findChildViewById2);
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
    public static ZPhoenixItemRowBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZPhoenixItemRowBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_phoenix_item_row, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CardView getRoot() {
        return this.f84680a;
    }
}
