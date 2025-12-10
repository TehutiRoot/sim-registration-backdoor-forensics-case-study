package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemOneBuyDolHistoryBinding */
/* loaded from: classes7.dex */
public final class ItemOneBuyDolHistoryBinding implements ViewBinding {

    /* renamed from: a */
    public final CardView f84345a;
    @NonNull
    public final OneFontTextView buyDolHistoryAmountTextView;
    @NonNull
    public final AppCompatImageView buyDolHistoryArrowImageView;
    @NonNull
    public final OneFontTextView buyDolHistoryBathCurrencyTextView;
    @NonNull
    public final OneFontTextView buyDolHistoryDateTextView;
    @NonNull
    public final OneFontTextView buyDolHistoryPhoneNumberTextView;
    @NonNull
    public final AppCompatImageView buyDolHistoryStatusImageView;
    @NonNull
    public final CardView historyItem;

    public ItemOneBuyDolHistoryBinding(CardView cardView, OneFontTextView oneFontTextView, AppCompatImageView appCompatImageView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, AppCompatImageView appCompatImageView2, CardView cardView2) {
        this.f84345a = cardView;
        this.buyDolHistoryAmountTextView = oneFontTextView;
        this.buyDolHistoryArrowImageView = appCompatImageView;
        this.buyDolHistoryBathCurrencyTextView = oneFontTextView2;
        this.buyDolHistoryDateTextView = oneFontTextView3;
        this.buyDolHistoryPhoneNumberTextView = oneFontTextView4;
        this.buyDolHistoryStatusImageView = appCompatImageView2;
        this.historyItem = cardView2;
    }

    @NonNull
    public static ItemOneBuyDolHistoryBinding bind(@NonNull View view) {
        int i = R.id.buyDolHistoryAmountTextView;
        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
        if (oneFontTextView != null) {
            i = R.id.buyDolHistoryArrowImageView;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = R.id.buyDolHistoryBathCurrencyTextView;
                OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView2 != null) {
                    i = R.id.buyDolHistoryDateTextView;
                    OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView3 != null) {
                        i = R.id.buyDolHistoryPhoneNumberTextView;
                        OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView4 != null) {
                            i = R.id.buyDolHistoryStatusImageView;
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                            if (appCompatImageView2 != null) {
                                CardView cardView = (CardView) view;
                                return new ItemOneBuyDolHistoryBinding(cardView, oneFontTextView, appCompatImageView, oneFontTextView2, oneFontTextView3, oneFontTextView4, appCompatImageView2, cardView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemOneBuyDolHistoryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemOneBuyDolHistoryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_one_buy_dol_history, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CardView getRoot() {
        return this.f84345a;
    }
}
