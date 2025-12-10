package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.app_one.widget.OnePhoneBookEditText;
import th.p047co.dtac.android.dtacone.app_one.widget.loading.OneSwipeRefresh;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneTopupPricelistBinding */
/* loaded from: classes7.dex */
public final class FragmentOneTopupPricelistBinding implements ViewBinding {

    /* renamed from: a */
    public final OneSwipeRefresh f84232a;
    @NonNull
    public final OneBalanceBoxBinding balanceBox;
    @NonNull
    public final ImageView btnClearPhoneText;
    @NonNull
    public final OneFontButton btnConfirm;
    @NonNull
    public final LinearLayoutCompat lnlContainerButtonOkCancel;
    @NonNull
    public final ImageView oneTopUpBalanceImageView;
    @NonNull
    public final ConstraintLayout oneTopUpBalanceLayout;
    @NonNull
    public final ImageView oneTopUpBalanceRetryButton;
    @NonNull
    public final ConstraintLayout oneTopUpBalanceRetryLayout;
    @NonNull
    public final OneFontTextView oneTopUpBalanceRetryTextView;
    @NonNull
    public final OneFontTextView oneTopUpBalanceTitleTextView;
    @NonNull
    public final OneFontTextView oneTopUpBalanceValueTextView;
    @NonNull
    public final LinearLayoutCompat root;
    @NonNull
    public final NestedScrollView scrollRoot;
    @NonNull
    public final OneSwipeRefresh swipeRefresh;
    @NonNull
    public final OnePhoneBookEditText topUpEdtSubscriberNumber;

    public FragmentOneTopupPricelistBinding(OneSwipeRefresh oneSwipeRefresh, OneBalanceBoxBinding oneBalanceBoxBinding, ImageView imageView, OneFontButton oneFontButton, LinearLayoutCompat linearLayoutCompat, ImageView imageView2, ConstraintLayout constraintLayout, ImageView imageView3, ConstraintLayout constraintLayout2, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, LinearLayoutCompat linearLayoutCompat2, NestedScrollView nestedScrollView, OneSwipeRefresh oneSwipeRefresh2, OnePhoneBookEditText onePhoneBookEditText) {
        this.f84232a = oneSwipeRefresh;
        this.balanceBox = oneBalanceBoxBinding;
        this.btnClearPhoneText = imageView;
        this.btnConfirm = oneFontButton;
        this.lnlContainerButtonOkCancel = linearLayoutCompat;
        this.oneTopUpBalanceImageView = imageView2;
        this.oneTopUpBalanceLayout = constraintLayout;
        this.oneTopUpBalanceRetryButton = imageView3;
        this.oneTopUpBalanceRetryLayout = constraintLayout2;
        this.oneTopUpBalanceRetryTextView = oneFontTextView;
        this.oneTopUpBalanceTitleTextView = oneFontTextView2;
        this.oneTopUpBalanceValueTextView = oneFontTextView3;
        this.root = linearLayoutCompat2;
        this.scrollRoot = nestedScrollView;
        this.swipeRefresh = oneSwipeRefresh2;
        this.topUpEdtSubscriberNumber = onePhoneBookEditText;
    }

    @NonNull
    public static FragmentOneTopupPricelistBinding bind(@NonNull View view) {
        int i = R.id.balance_box;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            OneBalanceBoxBinding bind = OneBalanceBoxBinding.bind(findChildViewById);
            i = R.id.btnClearPhoneText;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.btn_confirm;
                OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
                if (oneFontButton != null) {
                    i = R.id.lnl_container_button_ok_cancel;
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                    if (linearLayoutCompat != null) {
                        i = R.id.oneTopUpBalanceImageView;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView2 != null) {
                            i = R.id.oneTopUpBalanceLayout;
                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                            if (constraintLayout != null) {
                                i = R.id.oneTopUpBalanceRetryButton;
                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView3 != null) {
                                    i = R.id.oneTopUpBalanceRetryLayout;
                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                    if (constraintLayout2 != null) {
                                        i = R.id.oneTopUpBalanceRetryTextView;
                                        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (oneFontTextView != null) {
                                            i = R.id.oneTopUpBalanceTitleTextView;
                                            OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (oneFontTextView2 != null) {
                                                i = R.id.oneTopUpBalanceValueTextView;
                                                OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (oneFontTextView3 != null) {
                                                    i = R.id.root;
                                                    LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                                    if (linearLayoutCompat2 != null) {
                                                        i = R.id.scrollRoot;
                                                        NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                                                        if (nestedScrollView != null) {
                                                            OneSwipeRefresh oneSwipeRefresh = (OneSwipeRefresh) view;
                                                            i = R.id.top_up_edt_subscriber_number;
                                                            OnePhoneBookEditText onePhoneBookEditText = (OnePhoneBookEditText) ViewBindings.findChildViewById(view, i);
                                                            if (onePhoneBookEditText != null) {
                                                                return new FragmentOneTopupPricelistBinding(oneSwipeRefresh, bind, imageView, oneFontButton, linearLayoutCompat, imageView2, constraintLayout, imageView3, constraintLayout2, oneFontTextView, oneFontTextView2, oneFontTextView3, linearLayoutCompat2, nestedScrollView, oneSwipeRefresh, onePhoneBookEditText);
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
    public static FragmentOneTopupPricelistBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneTopupPricelistBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_topup_pricelist, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public OneSwipeRefresh getRoot() {
        return this.f84232a;
    }
}