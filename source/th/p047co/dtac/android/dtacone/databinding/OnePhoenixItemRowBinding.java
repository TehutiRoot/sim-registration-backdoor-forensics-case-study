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
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.OnePhoenixItemRowBinding */
/* loaded from: classes7.dex */
public final class OnePhoenixItemRowBinding implements ViewBinding {

    /* renamed from: a */
    public final CardView f84506a;
    @NonNull
    public final CardView cvPhoenix;
    @NonNull
    public final LinearLayout linearBox;
    @NonNull
    public final LinearLayout rdb30Day;
    @NonNull
    public final LinearLayout rdb60Day;
    @NonNull
    public final LinearLayout rdb7Day;
    @NonNull
    public final OneFontTextView tv30DayStvCommissionPercent;
    @NonNull
    public final OneFontTextView tv30DayStvPrice;
    @NonNull
    public final OneFontTextView tv60DayStvCommissionPercent;
    @NonNull
    public final OneFontTextView tv60DayStvPrice;
    @NonNull
    public final OneFontTextView tv7DayStvCommissionPercent;
    @NonNull
    public final OneFontTextView tv7DayStvPrice;
    @NonNull
    public final OneFontTextView tvSpeed;
    @NonNull
    public final View v30DayOpacity;
    @NonNull
    public final View v60DayOpacity;
    @NonNull
    public final View v7DayOpacity;

    public OnePhoenixItemRowBinding(CardView cardView, CardView cardView2, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5, OneFontTextView oneFontTextView6, OneFontTextView oneFontTextView7, View view, View view2, View view3) {
        this.f84506a = cardView;
        this.cvPhoenix = cardView2;
        this.linearBox = linearLayout;
        this.rdb30Day = linearLayout2;
        this.rdb60Day = linearLayout3;
        this.rdb7Day = linearLayout4;
        this.tv30DayStvCommissionPercent = oneFontTextView;
        this.tv30DayStvPrice = oneFontTextView2;
        this.tv60DayStvCommissionPercent = oneFontTextView3;
        this.tv60DayStvPrice = oneFontTextView4;
        this.tv7DayStvCommissionPercent = oneFontTextView5;
        this.tv7DayStvPrice = oneFontTextView6;
        this.tvSpeed = oneFontTextView7;
        this.v30DayOpacity = view;
        this.v60DayOpacity = view2;
        this.v7DayOpacity = view3;
    }

    @NonNull
    public static OnePhoenixItemRowBinding bind(@NonNull View view) {
        View findChildViewById;
        View findChildViewById2;
        View findChildViewById3;
        CardView cardView = (CardView) view;
        int i = R.id.linearBox;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.rdb30Day;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout2 != null) {
                i = R.id.rdb60Day;
                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout3 != null) {
                    i = R.id.rdb7Day;
                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout4 != null) {
                        i = R.id.tv30DayStvCommissionPercent;
                        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView != null) {
                            i = R.id.tv30DayStvPrice;
                            OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView2 != null) {
                                i = R.id.tv60DayStvCommissionPercent;
                                OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView3 != null) {
                                    i = R.id.tv60DayStvPrice;
                                    OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (oneFontTextView4 != null) {
                                        i = R.id.tv7DayStvCommissionPercent;
                                        OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (oneFontTextView5 != null) {
                                            i = R.id.tv7DayStvPrice;
                                            OneFontTextView oneFontTextView6 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (oneFontTextView6 != null) {
                                                i = R.id.tvSpeed;
                                                OneFontTextView oneFontTextView7 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (oneFontTextView7 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.v30DayOpacity))) != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.v60DayOpacity))) != null && (findChildViewById3 = ViewBindings.findChildViewById(view, (i = R.id.v7DayOpacity))) != null) {
                                                    return new OnePhoenixItemRowBinding(cardView, cardView, linearLayout, linearLayout2, linearLayout3, linearLayout4, oneFontTextView, oneFontTextView2, oneFontTextView3, oneFontTextView4, oneFontTextView5, oneFontTextView6, oneFontTextView7, findChildViewById, findChildViewById2, findChildViewById3);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OnePhoenixItemRowBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OnePhoenixItemRowBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_phoenix_item_row, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CardView getRoot() {
        return this.f84506a;
    }
}
