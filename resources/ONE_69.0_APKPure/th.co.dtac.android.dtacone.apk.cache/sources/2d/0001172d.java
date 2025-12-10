package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.loading.DtacSwipeRefresh;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacPhoneBookEditText;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentTopupPricelistBinding */
/* loaded from: classes7.dex */
public final class FragmentTopupPricelistBinding implements ViewBinding {

    /* renamed from: a */
    public final DtacSwipeRefresh f84316a;
    @NonNull
    public final ZBalanceBoxBinding balanceBox;
    @NonNull
    public final ZFullButtonOkBinding incFullButtonOk;
    @NonNull
    public final ZIncludePriceListButtonBinding incPriceListButton;
    @NonNull
    public final IncludeViewStretchRefillBinding incStretchRefill;
    @NonNull
    public final View oneTopUpBalanceView;
    @NonNull
    public final LinearLayout root;
    @NonNull
    public final NestedScrollView scrollRoot;
    @NonNull
    public final DtacSwipeRefresh swipeRefresh;
    @NonNull
    public final ImageView topUpBalanceImageView;
    @NonNull
    public final ConstraintLayout topUpBalanceMainLayout;
    @NonNull
    public final ImageView topUpBalanceRetryButton;
    @NonNull
    public final ConstraintLayout topUpBalanceRetryLayout;
    @NonNull
    public final DtacFontTextView topUpBalanceRetryTextView;
    @NonNull
    public final DtacFontTextView topUpBalanceTitleTextView;
    @NonNull
    public final DtacFontTextView topUpBalanceValueTextView;
    @NonNull
    public final DtacPhoneBookEditText topupEdtSubscriberNumber;

    public FragmentTopupPricelistBinding(DtacSwipeRefresh dtacSwipeRefresh, ZBalanceBoxBinding zBalanceBoxBinding, ZFullButtonOkBinding zFullButtonOkBinding, ZIncludePriceListButtonBinding zIncludePriceListButtonBinding, IncludeViewStretchRefillBinding includeViewStretchRefillBinding, View view, LinearLayout linearLayout, NestedScrollView nestedScrollView, DtacSwipeRefresh dtacSwipeRefresh2, ImageView imageView, ConstraintLayout constraintLayout, ImageView imageView2, ConstraintLayout constraintLayout2, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacPhoneBookEditText dtacPhoneBookEditText) {
        this.f84316a = dtacSwipeRefresh;
        this.balanceBox = zBalanceBoxBinding;
        this.incFullButtonOk = zFullButtonOkBinding;
        this.incPriceListButton = zIncludePriceListButtonBinding;
        this.incStretchRefill = includeViewStretchRefillBinding;
        this.oneTopUpBalanceView = view;
        this.root = linearLayout;
        this.scrollRoot = nestedScrollView;
        this.swipeRefresh = dtacSwipeRefresh2;
        this.topUpBalanceImageView = imageView;
        this.topUpBalanceMainLayout = constraintLayout;
        this.topUpBalanceRetryButton = imageView2;
        this.topUpBalanceRetryLayout = constraintLayout2;
        this.topUpBalanceRetryTextView = dtacFontTextView;
        this.topUpBalanceTitleTextView = dtacFontTextView2;
        this.topUpBalanceValueTextView = dtacFontTextView3;
        this.topupEdtSubscriberNumber = dtacPhoneBookEditText;
    }

    @NonNull
    public static FragmentTopupPricelistBinding bind(@NonNull View view) {
        int i = R.id.balance_box;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            ZBalanceBoxBinding bind = ZBalanceBoxBinding.bind(findChildViewById);
            i = R.id.incFullButtonOk;
            View findChildViewById2 = ViewBindings.findChildViewById(view, i);
            if (findChildViewById2 != null) {
                ZFullButtonOkBinding bind2 = ZFullButtonOkBinding.bind(findChildViewById2);
                i = R.id.incPriceListButton;
                View findChildViewById3 = ViewBindings.findChildViewById(view, i);
                if (findChildViewById3 != null) {
                    ZIncludePriceListButtonBinding bind3 = ZIncludePriceListButtonBinding.bind(findChildViewById3);
                    i = R.id.incStretchRefill;
                    View findChildViewById4 = ViewBindings.findChildViewById(view, i);
                    if (findChildViewById4 != null) {
                        IncludeViewStretchRefillBinding bind4 = IncludeViewStretchRefillBinding.bind(findChildViewById4);
                        i = R.id.oneTopUpBalanceView;
                        View findChildViewById5 = ViewBindings.findChildViewById(view, i);
                        if (findChildViewById5 != null) {
                            i = R.id.root;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout != null) {
                                i = R.id.scrollRoot;
                                NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                                if (nestedScrollView != null) {
                                    DtacSwipeRefresh dtacSwipeRefresh = (DtacSwipeRefresh) view;
                                    i = R.id.topUpBalanceImageView;
                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView != null) {
                                        i = R.id.topUpBalanceMainLayout;
                                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                        if (constraintLayout != null) {
                                            i = R.id.topUpBalanceRetryButton;
                                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                            if (imageView2 != null) {
                                                i = R.id.topUpBalanceRetryLayout;
                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                if (constraintLayout2 != null) {
                                                    i = R.id.topUpBalanceRetryTextView;
                                                    DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (dtacFontTextView != null) {
                                                        i = R.id.topUpBalanceTitleTextView;
                                                        DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (dtacFontTextView2 != null) {
                                                            i = R.id.topUpBalanceValueTextView;
                                                            DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                            if (dtacFontTextView3 != null) {
                                                                i = R.id.topup_edt_subscriber_number;
                                                                DtacPhoneBookEditText dtacPhoneBookEditText = (DtacPhoneBookEditText) ViewBindings.findChildViewById(view, i);
                                                                if (dtacPhoneBookEditText != null) {
                                                                    return new FragmentTopupPricelistBinding(dtacSwipeRefresh, bind, bind2, bind3, bind4, findChildViewById5, linearLayout, nestedScrollView, dtacSwipeRefresh, imageView, constraintLayout, imageView2, constraintLayout2, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacPhoneBookEditText);
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
    public static FragmentTopupPricelistBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentTopupPricelistBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_topup_pricelist, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public DtacSwipeRefresh getRoot() {
        return this.f84316a;
    }
}