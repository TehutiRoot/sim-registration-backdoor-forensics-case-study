package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneBuyDolHistoryDetailBinding */
/* loaded from: classes7.dex */
public final class FragmentOneBuyDolHistoryDetailBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f83991a;
    @NonNull
    public final OneFontButton buyDolAgainButton;
    @NonNull
    public final OneFontTextView buyDolHistoryAmountTextView;
    @NonNull
    public final OneFontTextView buyDolHistoryAmountTitleTextView;
    @NonNull
    public final OneFontTextView buyDolHistoryMoneyOfFeeTitleTextView;
    @NonNull
    public final OneFontTextView buyDolHistoryNumberOnlineTextView;
    @NonNull
    public final OneFontTextView buyDolHistoryNumberOnlineTitleTextView;
    @NonNull
    public final OneFontTextView buyDolHistoryReferenceNumberTextView;
    @NonNull
    public final OneFontTextView buyDolHistoryReferenceNumberTitleTextView;
    @NonNull
    public final OneFontTextView buyDolHistoryServiceDateTextView;
    @NonNull
    public final OneFontTextView buyDolHistoryServiceDateTitleTextView;
    @NonNull
    public final OneFontTextView buyDolSummaryMoneyOfFeeTextView;
    @NonNull
    public final CardView mainBuyDolSummaryLayout;

    public FragmentOneBuyDolHistoryDetailBinding(NestedScrollView nestedScrollView, OneFontButton oneFontButton, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5, OneFontTextView oneFontTextView6, OneFontTextView oneFontTextView7, OneFontTextView oneFontTextView8, OneFontTextView oneFontTextView9, OneFontTextView oneFontTextView10, CardView cardView) {
        this.f83991a = nestedScrollView;
        this.buyDolAgainButton = oneFontButton;
        this.buyDolHistoryAmountTextView = oneFontTextView;
        this.buyDolHistoryAmountTitleTextView = oneFontTextView2;
        this.buyDolHistoryMoneyOfFeeTitleTextView = oneFontTextView3;
        this.buyDolHistoryNumberOnlineTextView = oneFontTextView4;
        this.buyDolHistoryNumberOnlineTitleTextView = oneFontTextView5;
        this.buyDolHistoryReferenceNumberTextView = oneFontTextView6;
        this.buyDolHistoryReferenceNumberTitleTextView = oneFontTextView7;
        this.buyDolHistoryServiceDateTextView = oneFontTextView8;
        this.buyDolHistoryServiceDateTitleTextView = oneFontTextView9;
        this.buyDolSummaryMoneyOfFeeTextView = oneFontTextView10;
        this.mainBuyDolSummaryLayout = cardView;
    }

    @NonNull
    public static FragmentOneBuyDolHistoryDetailBinding bind(@NonNull View view) {
        int i = R.id.buyDolAgainButton;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.buyDolHistoryAmountTextView;
            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView != null) {
                i = R.id.buyDolHistoryAmountTitleTextView;
                OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView2 != null) {
                    i = R.id.buyDolHistoryMoneyOfFeeTitleTextView;
                    OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView3 != null) {
                        i = R.id.buyDolHistoryNumberOnlineTextView;
                        OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView4 != null) {
                            i = R.id.buyDolHistoryNumberOnlineTitleTextView;
                            OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView5 != null) {
                                i = R.id.buyDolHistoryReferenceNumberTextView;
                                OneFontTextView oneFontTextView6 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView6 != null) {
                                    i = R.id.buyDolHistoryReferenceNumberTitleTextView;
                                    OneFontTextView oneFontTextView7 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (oneFontTextView7 != null) {
                                        i = R.id.buyDolHistoryServiceDateTextView;
                                        OneFontTextView oneFontTextView8 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (oneFontTextView8 != null) {
                                            i = R.id.buyDolHistoryServiceDateTitleTextView;
                                            OneFontTextView oneFontTextView9 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (oneFontTextView9 != null) {
                                                i = R.id.buyDolSummaryMoneyOfFeeTextView;
                                                OneFontTextView oneFontTextView10 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (oneFontTextView10 != null) {
                                                    i = R.id.mainBuyDolSummaryLayout;
                                                    CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
                                                    if (cardView != null) {
                                                        return new FragmentOneBuyDolHistoryDetailBinding((NestedScrollView) view, oneFontButton, oneFontTextView, oneFontTextView2, oneFontTextView3, oneFontTextView4, oneFontTextView5, oneFontTextView6, oneFontTextView7, oneFontTextView8, oneFontTextView9, oneFontTextView10, cardView);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneBuyDolHistoryDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneBuyDolHistoryDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_buy_dol_history_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f83991a;
    }
}