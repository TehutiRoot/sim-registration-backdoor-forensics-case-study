package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneBuyDolSummaryBinding */
/* loaded from: classes7.dex */
public final class FragmentOneBuyDolSummaryBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f83897a;
    @NonNull
    public final OneFontButton backButton;
    @NonNull
    public final OneFontTextView buyDolSummaryAmountTextView;
    @NonNull
    public final OneFontTextView buyDolSummaryAmountTitleTextView;
    @NonNull
    public final View buyDolSummaryBottomLineView;
    @NonNull
    public final View buyDolSummaryCenterLineView;
    @NonNull
    public final OneFontTextView buyDolSummaryDesiredAmountOfMoney;
    @NonNull
    public final OneFontTextView buyDolSummaryMoneyOfFeeTextView;
    @NonNull
    public final OneFontTextView buyDolSummaryMoneyOfFeeTitleTextView;
    @NonNull
    public final OneFontTextView buyDolSummaryNumberOnlineTextView;
    @NonNull
    public final OneFontTextView buyDolSummaryNumberOnlineTitleTextView;
    @NonNull
    public final OneFontTextView buyDolSummaryReferenceNumberTextView;
    @NonNull
    public final OneFontTextView buyDolSummaryReferenceNumberTitleTextView;
    @NonNull
    public final OneFontTextView buyDolSummaryServiceDateTextView;
    @NonNull
    public final OneFontTextView buyDolSummaryServiceDateTitleTextView;
    @NonNull
    public final View buyDolSummaryTopLineView;
    @NonNull
    public final CardView mainBuyDolSummaryLayout;
    @NonNull
    public final OneFontTextView payAmountTextView;
    @NonNull
    public final ImageView saveImageToGallerySuccessImageView;
    @NonNull
    public final OneFontTextView saveImageToGallerySuccessTextView;
    @NonNull
    public final OneFontTextView thankTextView;

    public FragmentOneBuyDolSummaryBinding(NestedScrollView nestedScrollView, OneFontButton oneFontButton, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, View view, View view2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5, OneFontTextView oneFontTextView6, OneFontTextView oneFontTextView7, OneFontTextView oneFontTextView8, OneFontTextView oneFontTextView9, OneFontTextView oneFontTextView10, OneFontTextView oneFontTextView11, View view3, CardView cardView, OneFontTextView oneFontTextView12, ImageView imageView, OneFontTextView oneFontTextView13, OneFontTextView oneFontTextView14) {
        this.f83897a = nestedScrollView;
        this.backButton = oneFontButton;
        this.buyDolSummaryAmountTextView = oneFontTextView;
        this.buyDolSummaryAmountTitleTextView = oneFontTextView2;
        this.buyDolSummaryBottomLineView = view;
        this.buyDolSummaryCenterLineView = view2;
        this.buyDolSummaryDesiredAmountOfMoney = oneFontTextView3;
        this.buyDolSummaryMoneyOfFeeTextView = oneFontTextView4;
        this.buyDolSummaryMoneyOfFeeTitleTextView = oneFontTextView5;
        this.buyDolSummaryNumberOnlineTextView = oneFontTextView6;
        this.buyDolSummaryNumberOnlineTitleTextView = oneFontTextView7;
        this.buyDolSummaryReferenceNumberTextView = oneFontTextView8;
        this.buyDolSummaryReferenceNumberTitleTextView = oneFontTextView9;
        this.buyDolSummaryServiceDateTextView = oneFontTextView10;
        this.buyDolSummaryServiceDateTitleTextView = oneFontTextView11;
        this.buyDolSummaryTopLineView = view3;
        this.mainBuyDolSummaryLayout = cardView;
        this.payAmountTextView = oneFontTextView12;
        this.saveImageToGallerySuccessImageView = imageView;
        this.saveImageToGallerySuccessTextView = oneFontTextView13;
        this.thankTextView = oneFontTextView14;
    }

    @NonNull
    public static FragmentOneBuyDolSummaryBinding bind(@NonNull View view) {
        View findChildViewById;
        View findChildViewById2;
        View findChildViewById3;
        int i = R.id.backButton;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.buyDolSummaryAmountTextView;
            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView != null) {
                i = R.id.buyDolSummaryAmountTitleTextView;
                OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.buyDolSummaryBottomLineView))) != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.buyDolSummaryCenterLineView))) != null) {
                    i = R.id.buyDolSummaryDesiredAmountOfMoney;
                    OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView3 != null) {
                        i = R.id.buyDolSummaryMoneyOfFeeTextView;
                        OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView4 != null) {
                            i = R.id.buyDolSummaryMoneyOfFeeTitleTextView;
                            OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView5 != null) {
                                i = R.id.buyDolSummaryNumberOnlineTextView;
                                OneFontTextView oneFontTextView6 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView6 != null) {
                                    i = R.id.buyDolSummaryNumberOnlineTitleTextView;
                                    OneFontTextView oneFontTextView7 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (oneFontTextView7 != null) {
                                        i = R.id.buyDolSummaryReferenceNumberTextView;
                                        OneFontTextView oneFontTextView8 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (oneFontTextView8 != null) {
                                            i = R.id.buyDolSummaryReferenceNumberTitleTextView;
                                            OneFontTextView oneFontTextView9 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (oneFontTextView9 != null) {
                                                i = R.id.buyDolSummaryServiceDateTextView;
                                                OneFontTextView oneFontTextView10 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (oneFontTextView10 != null) {
                                                    i = R.id.buyDolSummaryServiceDateTitleTextView;
                                                    OneFontTextView oneFontTextView11 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (oneFontTextView11 != null && (findChildViewById3 = ViewBindings.findChildViewById(view, (i = R.id.buyDolSummaryTopLineView))) != null) {
                                                        i = R.id.mainBuyDolSummaryLayout;
                                                        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
                                                        if (cardView != null) {
                                                            i = R.id.payAmountTextView;
                                                            OneFontTextView oneFontTextView12 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                            if (oneFontTextView12 != null) {
                                                                i = R.id.saveImageToGallerySuccessImageView;
                                                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                if (imageView != null) {
                                                                    i = R.id.saveImageToGallerySuccessTextView;
                                                                    OneFontTextView oneFontTextView13 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (oneFontTextView13 != null) {
                                                                        i = R.id.thankTextView;
                                                                        OneFontTextView oneFontTextView14 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (oneFontTextView14 != null) {
                                                                            return new FragmentOneBuyDolSummaryBinding((NestedScrollView) view, oneFontButton, oneFontTextView, oneFontTextView2, findChildViewById, findChildViewById2, oneFontTextView3, oneFontTextView4, oneFontTextView5, oneFontTextView6, oneFontTextView7, oneFontTextView8, oneFontTextView9, oneFontTextView10, oneFontTextView11, findChildViewById3, cardView, oneFontTextView12, imageView, oneFontTextView13, oneFontTextView14);
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
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneBuyDolSummaryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneBuyDolSummaryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_buy_dol_summary, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f83897a;
    }
}
