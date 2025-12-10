package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneDeviceSaleSummaryBinding */
/* loaded from: classes7.dex */
public final class FragmentOneDeviceSaleSummaryBinding implements ViewBinding {

    /* renamed from: a */
    public final ScrollView f83938a;
    @NonNull
    public final OneFontButton btnNext;
    @NonNull
    public final CardView cardViewCondition;
    @NonNull
    public final CardView cardViewDetail;
    @NonNull
    public final LinearLayout fAdvancePayment;
    @NonNull
    public final LinearLayout fPeriod;
    @NonNull
    public final LinearLayout frameAdvancePayment;
    @NonNull
    public final LinearLayout frameNormalPrice;
    @NonNull
    public final LinearLayout framePriceAfterDiscount;
    @NonNull
    public final FrameLayout frameSignature;
    @NonNull
    public final LinearLayout frameTotalAdvancePayment;
    @NonNull
    public final ImageView iconConditionImageView;
    @NonNull
    public final ImageView iconImageView;
    @NonNull
    public final ImageView ivSignature;
    @NonNull
    public final LinearLayout mainLayout;
    @NonNull
    public final ConstraintLayout signatureLayout;
    @NonNull
    public final ConstraintLayout topBarDeviceConditionLayout;
    @NonNull
    public final ConstraintLayout topBarDeviceInformationLayout;
    @NonNull
    public final OneFontTextView tvAdvancePayment;
    @NonNull
    public final OneFontTextView tvAdvancePaymentByCondition;
    @NonNull
    public final OneFontTextView tvConditionPeriod;
    @NonNull
    public final OneFontTextView tvDiscount;
    @NonNull
    public final OneFontTextView tvDiscountContract;
    @NonNull
    public final OneFontTextView tvIMEI;
    @NonNull
    public final OneFontTextView tvModel;
    @NonNull
    public final OneFontTextView tvNormalPrice;
    @NonNull
    public final OneFontTextView tvPackage;
    @NonNull
    public final OneFontTextView tvPriceAfterDiscount;
    @NonNull
    public final OneFontTextView tvSignature;
    @NonNull
    public final OneFontTextView tvSignatureHelper;
    @NonNull
    public final OneFontTextView tvSignatureTextHelper;
    @NonNull
    public final OneFontTextView tvSubrNumb;
    @NonNull
    public final OneFontTextView tvTotalAdvancePayment;

    public FragmentOneDeviceSaleSummaryBinding(ScrollView scrollView, OneFontButton oneFontButton, CardView cardView, CardView cardView2, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, FrameLayout frameLayout, LinearLayout linearLayout6, ImageView imageView, ImageView imageView2, ImageView imageView3, LinearLayout linearLayout7, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5, OneFontTextView oneFontTextView6, OneFontTextView oneFontTextView7, OneFontTextView oneFontTextView8, OneFontTextView oneFontTextView9, OneFontTextView oneFontTextView10, OneFontTextView oneFontTextView11, OneFontTextView oneFontTextView12, OneFontTextView oneFontTextView13, OneFontTextView oneFontTextView14, OneFontTextView oneFontTextView15) {
        this.f83938a = scrollView;
        this.btnNext = oneFontButton;
        this.cardViewCondition = cardView;
        this.cardViewDetail = cardView2;
        this.fAdvancePayment = linearLayout;
        this.fPeriod = linearLayout2;
        this.frameAdvancePayment = linearLayout3;
        this.frameNormalPrice = linearLayout4;
        this.framePriceAfterDiscount = linearLayout5;
        this.frameSignature = frameLayout;
        this.frameTotalAdvancePayment = linearLayout6;
        this.iconConditionImageView = imageView;
        this.iconImageView = imageView2;
        this.ivSignature = imageView3;
        this.mainLayout = linearLayout7;
        this.signatureLayout = constraintLayout;
        this.topBarDeviceConditionLayout = constraintLayout2;
        this.topBarDeviceInformationLayout = constraintLayout3;
        this.tvAdvancePayment = oneFontTextView;
        this.tvAdvancePaymentByCondition = oneFontTextView2;
        this.tvConditionPeriod = oneFontTextView3;
        this.tvDiscount = oneFontTextView4;
        this.tvDiscountContract = oneFontTextView5;
        this.tvIMEI = oneFontTextView6;
        this.tvModel = oneFontTextView7;
        this.tvNormalPrice = oneFontTextView8;
        this.tvPackage = oneFontTextView9;
        this.tvPriceAfterDiscount = oneFontTextView10;
        this.tvSignature = oneFontTextView11;
        this.tvSignatureHelper = oneFontTextView12;
        this.tvSignatureTextHelper = oneFontTextView13;
        this.tvSubrNumb = oneFontTextView14;
        this.tvTotalAdvancePayment = oneFontTextView15;
    }

    @NonNull
    public static FragmentOneDeviceSaleSummaryBinding bind(@NonNull View view) {
        int i = R.id.btnNext;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.cardViewCondition;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
            if (cardView != null) {
                i = R.id.cardViewDetail;
                CardView cardView2 = (CardView) ViewBindings.findChildViewById(view, i);
                if (cardView2 != null) {
                    i = R.id.fAdvancePayment;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = R.id.fPeriod;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout2 != null) {
                            i = R.id.frameAdvancePayment;
                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout3 != null) {
                                i = R.id.frameNormalPrice;
                                LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout4 != null) {
                                    i = R.id.framePriceAfterDiscount;
                                    LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout5 != null) {
                                        i = R.id.frameSignature;
                                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                        if (frameLayout != null) {
                                            i = R.id.frameTotalAdvancePayment;
                                            LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                            if (linearLayout6 != null) {
                                                i = R.id.iconConditionImageView;
                                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                                if (imageView != null) {
                                                    i = R.id.iconImageView;
                                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                    if (imageView2 != null) {
                                                        i = R.id.ivSignature;
                                                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                        if (imageView3 != null) {
                                                            i = R.id.mainLayout;
                                                            LinearLayout linearLayout7 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                            if (linearLayout7 != null) {
                                                                i = R.id.signatureLayout;
                                                                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                if (constraintLayout != null) {
                                                                    i = R.id.topBarDeviceConditionLayout;
                                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                    if (constraintLayout2 != null) {
                                                                        i = R.id.topBarDeviceInformationLayout;
                                                                        ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                        if (constraintLayout3 != null) {
                                                                            i = R.id.tvAdvancePayment;
                                                                            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (oneFontTextView != null) {
                                                                                i = R.id.tvAdvancePaymentByCondition;
                                                                                OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                if (oneFontTextView2 != null) {
                                                                                    i = R.id.tvConditionPeriod;
                                                                                    OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (oneFontTextView3 != null) {
                                                                                        i = R.id.tvDiscount;
                                                                                        OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (oneFontTextView4 != null) {
                                                                                            i = R.id.tvDiscountContract;
                                                                                            OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                            if (oneFontTextView5 != null) {
                                                                                                i = R.id.tvIMEI;
                                                                                                OneFontTextView oneFontTextView6 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                if (oneFontTextView6 != null) {
                                                                                                    i = R.id.tvModel;
                                                                                                    OneFontTextView oneFontTextView7 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                    if (oneFontTextView7 != null) {
                                                                                                        i = R.id.tvNormalPrice;
                                                                                                        OneFontTextView oneFontTextView8 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                        if (oneFontTextView8 != null) {
                                                                                                            i = R.id.tvPackage;
                                                                                                            OneFontTextView oneFontTextView9 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                            if (oneFontTextView9 != null) {
                                                                                                                i = R.id.tvPriceAfterDiscount;
                                                                                                                OneFontTextView oneFontTextView10 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                if (oneFontTextView10 != null) {
                                                                                                                    i = R.id.tvSignature;
                                                                                                                    OneFontTextView oneFontTextView11 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                    if (oneFontTextView11 != null) {
                                                                                                                        i = R.id.tvSignatureHelper;
                                                                                                                        OneFontTextView oneFontTextView12 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                        if (oneFontTextView12 != null) {
                                                                                                                            i = R.id.tvSignatureTextHelper;
                                                                                                                            OneFontTextView oneFontTextView13 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                            if (oneFontTextView13 != null) {
                                                                                                                                i = R.id.tvSubrNumb;
                                                                                                                                OneFontTextView oneFontTextView14 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                if (oneFontTextView14 != null) {
                                                                                                                                    i = R.id.tvTotalAdvancePayment;
                                                                                                                                    OneFontTextView oneFontTextView15 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                    if (oneFontTextView15 != null) {
                                                                                                                                        return new FragmentOneDeviceSaleSummaryBinding((ScrollView) view, oneFontButton, cardView, cardView2, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, frameLayout, linearLayout6, imageView, imageView2, imageView3, linearLayout7, constraintLayout, constraintLayout2, constraintLayout3, oneFontTextView, oneFontTextView2, oneFontTextView3, oneFontTextView4, oneFontTextView5, oneFontTextView6, oneFontTextView7, oneFontTextView8, oneFontTextView9, oneFontTextView10, oneFontTextView11, oneFontTextView12, oneFontTextView13, oneFontTextView14, oneFontTextView15);
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
    public static FragmentOneDeviceSaleSummaryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneDeviceSaleSummaryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_device_sale_summary, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ScrollView getRoot() {
        return this.f83938a;
    }
}
