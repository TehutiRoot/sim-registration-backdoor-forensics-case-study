package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.loading.DtacSwipeRefresh;
import th.p047co.dtac.android.dtacone.widget.view.DtacClearableEditText;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentStvConfirmBinding */
/* loaded from: classes7.dex */
public final class FragmentStvConfirmBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f84198a;
    @NonNull
    public final ZBalanceBoxBinding balanceBox;
    @NonNull
    public final DtacSwipeRefresh confirmSwipeRefresh;
    @NonNull
    public final DtacFontTextView dtacFontTextView2;
    @NonNull
    public final LinearLayout rootLayout;
    @NonNull
    public final DtacClearableEditText stvConfirmEdtPinCode;
    @NonNull
    public final LinearLayout stvConfirmRoot;
    @NonNull
    public final NestedScrollView stvConfirmScroll;
    @NonNull
    public final DtacFontTextView stvConfirmTvPackageDescription;
    @NonNull
    public final DtacFontTextView stvConfirmTvPromotionName;
    @NonNull
    public final DtacFontTextView stvConfirmTvPromotionPrice;
    @NonNull
    public final DtacFontTextView stvConfirmTvPromotionPriceUnit;
    @NonNull
    public final DtacFontTextView stvTvConfirmSubscriberNumber;
    @NonNull
    public final LinearLayout topupLlvConfirmSubscriberNumber;

    public FragmentStvConfirmBinding(FrameLayout frameLayout, ZBalanceBoxBinding zBalanceBoxBinding, DtacSwipeRefresh dtacSwipeRefresh, DtacFontTextView dtacFontTextView, LinearLayout linearLayout, DtacClearableEditText dtacClearableEditText, LinearLayout linearLayout2, NestedScrollView nestedScrollView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5, DtacFontTextView dtacFontTextView6, LinearLayout linearLayout3) {
        this.f84198a = frameLayout;
        this.balanceBox = zBalanceBoxBinding;
        this.confirmSwipeRefresh = dtacSwipeRefresh;
        this.dtacFontTextView2 = dtacFontTextView;
        this.rootLayout = linearLayout;
        this.stvConfirmEdtPinCode = dtacClearableEditText;
        this.stvConfirmRoot = linearLayout2;
        this.stvConfirmScroll = nestedScrollView;
        this.stvConfirmTvPackageDescription = dtacFontTextView2;
        this.stvConfirmTvPromotionName = dtacFontTextView3;
        this.stvConfirmTvPromotionPrice = dtacFontTextView4;
        this.stvConfirmTvPromotionPriceUnit = dtacFontTextView5;
        this.stvTvConfirmSubscriberNumber = dtacFontTextView6;
        this.topupLlvConfirmSubscriberNumber = linearLayout3;
    }

    @NonNull
    public static FragmentStvConfirmBinding bind(@NonNull View view) {
        int i = R.id.balance_box;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            ZBalanceBoxBinding bind = ZBalanceBoxBinding.bind(findChildViewById);
            i = R.id.confirm_swipe_refresh;
            DtacSwipeRefresh dtacSwipeRefresh = (DtacSwipeRefresh) ViewBindings.findChildViewById(view, i);
            if (dtacSwipeRefresh != null) {
                i = R.id.dtacFontTextView2;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    i = R.id.rootLayout;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = R.id.stv_confirm_edt_pin_code;
                        DtacClearableEditText dtacClearableEditText = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
                        if (dtacClearableEditText != null) {
                            i = R.id.stv_confirm_root;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout2 != null) {
                                i = R.id.stv_confirm_scroll;
                                NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                                if (nestedScrollView != null) {
                                    i = R.id.stv_confirm_tv_package_description;
                                    DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView2 != null) {
                                        i = R.id.stv_confirm_tv_promotion_name;
                                        DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (dtacFontTextView3 != null) {
                                            i = R.id.stv_confirm_tv_promotion_price;
                                            DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (dtacFontTextView4 != null) {
                                                i = R.id.stv_confirm_tv_promotion_price_unit;
                                                DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (dtacFontTextView5 != null) {
                                                    i = R.id.stv_tv_confirm_subscriber_number;
                                                    DtacFontTextView dtacFontTextView6 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (dtacFontTextView6 != null) {
                                                        i = R.id.topup_llv_confirm_subscriber_number;
                                                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                        if (linearLayout3 != null) {
                                                            return new FragmentStvConfirmBinding((FrameLayout) view, bind, dtacSwipeRefresh, dtacFontTextView, linearLayout, dtacClearableEditText, linearLayout2, nestedScrollView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5, dtacFontTextView6, linearLayout3);
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
    public static FragmentStvConfirmBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentStvConfirmBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_stv_confirm, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f84198a;
    }
}
