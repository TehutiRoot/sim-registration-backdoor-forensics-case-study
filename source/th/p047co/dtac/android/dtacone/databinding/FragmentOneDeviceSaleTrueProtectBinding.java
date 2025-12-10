package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneDeviceSaleTrueProtectBinding */
/* loaded from: classes7.dex */
public final class FragmentOneDeviceSaleTrueProtectBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f83941a;
    @NonNull
    public final ImageView ivProtect;
    @NonNull
    public final LinearLayoutCompat layoutDuration;
    @NonNull
    public final CardView layoutPrice;
    @NonNull
    public final LinearLayoutCompat layoutPriceBranded;
    @NonNull
    public final LinearLayoutCompat layoutPriceRetailer;
    @NonNull
    public final CardView layoutProtectDesc;
    @NonNull
    public final LinearLayoutCompat layoutReplacement;
    @NonNull
    public final LinearLayoutCompat layoutSwap;
    @NonNull
    public final OneFontButton selectBrandedMonthly;
    @NonNull
    public final OneFontButton selectBrandedYearly;
    @NonNull
    public final OneFontButton selectMonthly;
    @NonNull
    public final OneFontTextView skipped;
    @NonNull
    public final OneFontTextView tvClaimReplacePrice;
    @NonNull
    public final OneFontTextView tvClaimSwapPrice;
    @NonNull
    public final OneFontTextView tvHeader;
    @NonNull
    public final OneFontTextView tvInsuranceDuration;
    @NonNull
    public final OneFontTextView tvMonthlyPrice;
    @NonNull
    public final OneFontTextView tvMonthlyPriceRetailer;
    @NonNull
    public final OneFontTextView tvSubHeader;
    @NonNull
    public final OneFontTextView tvYearlyPrice;

    public FragmentOneDeviceSaleTrueProtectBinding(NestedScrollView nestedScrollView, ImageView imageView, LinearLayoutCompat linearLayoutCompat, CardView cardView, LinearLayoutCompat linearLayoutCompat2, LinearLayoutCompat linearLayoutCompat3, CardView cardView2, LinearLayoutCompat linearLayoutCompat4, LinearLayoutCompat linearLayoutCompat5, OneFontButton oneFontButton, OneFontButton oneFontButton2, OneFontButton oneFontButton3, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5, OneFontTextView oneFontTextView6, OneFontTextView oneFontTextView7, OneFontTextView oneFontTextView8, OneFontTextView oneFontTextView9) {
        this.f83941a = nestedScrollView;
        this.ivProtect = imageView;
        this.layoutDuration = linearLayoutCompat;
        this.layoutPrice = cardView;
        this.layoutPriceBranded = linearLayoutCompat2;
        this.layoutPriceRetailer = linearLayoutCompat3;
        this.layoutProtectDesc = cardView2;
        this.layoutReplacement = linearLayoutCompat4;
        this.layoutSwap = linearLayoutCompat5;
        this.selectBrandedMonthly = oneFontButton;
        this.selectBrandedYearly = oneFontButton2;
        this.selectMonthly = oneFontButton3;
        this.skipped = oneFontTextView;
        this.tvClaimReplacePrice = oneFontTextView2;
        this.tvClaimSwapPrice = oneFontTextView3;
        this.tvHeader = oneFontTextView4;
        this.tvInsuranceDuration = oneFontTextView5;
        this.tvMonthlyPrice = oneFontTextView6;
        this.tvMonthlyPriceRetailer = oneFontTextView7;
        this.tvSubHeader = oneFontTextView8;
        this.tvYearlyPrice = oneFontTextView9;
    }

    @NonNull
    public static FragmentOneDeviceSaleTrueProtectBinding bind(@NonNull View view) {
        int i = R.id.ivProtect;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.layoutDuration;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
            if (linearLayoutCompat != null) {
                i = R.id.layoutPrice;
                CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
                if (cardView != null) {
                    i = R.id.layoutPriceBranded;
                    LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                    if (linearLayoutCompat2 != null) {
                        i = R.id.layoutPriceRetailer;
                        LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                        if (linearLayoutCompat3 != null) {
                            i = R.id.layoutProtectDesc;
                            CardView cardView2 = (CardView) ViewBindings.findChildViewById(view, i);
                            if (cardView2 != null) {
                                i = R.id.layoutReplacement;
                                LinearLayoutCompat linearLayoutCompat4 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                if (linearLayoutCompat4 != null) {
                                    i = R.id.layoutSwap;
                                    LinearLayoutCompat linearLayoutCompat5 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                    if (linearLayoutCompat5 != null) {
                                        i = R.id.selectBrandedMonthly;
                                        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
                                        if (oneFontButton != null) {
                                            i = R.id.selectBrandedYearly;
                                            OneFontButton oneFontButton2 = (OneFontButton) ViewBindings.findChildViewById(view, i);
                                            if (oneFontButton2 != null) {
                                                i = R.id.selectMonthly;
                                                OneFontButton oneFontButton3 = (OneFontButton) ViewBindings.findChildViewById(view, i);
                                                if (oneFontButton3 != null) {
                                                    i = R.id.skipped;
                                                    OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (oneFontTextView != null) {
                                                        i = R.id.tvClaimReplacePrice;
                                                        OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (oneFontTextView2 != null) {
                                                            i = R.id.tvClaimSwapPrice;
                                                            OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                            if (oneFontTextView3 != null) {
                                                                i = R.id.tvHeader;
                                                                OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                if (oneFontTextView4 != null) {
                                                                    i = R.id.tvInsuranceDuration;
                                                                    OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (oneFontTextView5 != null) {
                                                                        i = R.id.tvMonthlyPrice;
                                                                        OneFontTextView oneFontTextView6 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (oneFontTextView6 != null) {
                                                                            i = R.id.tvMonthlyPriceRetailer;
                                                                            OneFontTextView oneFontTextView7 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (oneFontTextView7 != null) {
                                                                                i = R.id.tvSubHeader;
                                                                                OneFontTextView oneFontTextView8 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                if (oneFontTextView8 != null) {
                                                                                    i = R.id.tvYearlyPrice;
                                                                                    OneFontTextView oneFontTextView9 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (oneFontTextView9 != null) {
                                                                                        return new FragmentOneDeviceSaleTrueProtectBinding((NestedScrollView) view, imageView, linearLayoutCompat, cardView, linearLayoutCompat2, linearLayoutCompat3, cardView2, linearLayoutCompat4, linearLayoutCompat5, oneFontButton, oneFontButton2, oneFontButton3, oneFontTextView, oneFontTextView2, oneFontTextView3, oneFontTextView4, oneFontTextView5, oneFontTextView6, oneFontTextView7, oneFontTextView8, oneFontTextView9);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneDeviceSaleTrueProtectBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneDeviceSaleTrueProtectBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_device_sale_true_protect, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f83941a;
    }
}
