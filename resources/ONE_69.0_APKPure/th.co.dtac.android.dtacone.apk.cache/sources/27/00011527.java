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
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentDeviceSaleSummaryBinding */
/* loaded from: classes7.dex */
public final class FragmentDeviceSaleSummaryBinding implements ViewBinding {

    /* renamed from: a */
    public final ScrollView f83797a;
    @NonNull
    public final DtacFontButton btnNext;
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
    public final LinearLayout frameTotalAdvancePayment;
    @NonNull
    public final LinearLayout gConditionBox;
    @NonNull
    public final LinearLayout gConditionBoxOriginalContract;
    @NonNull
    public final ImageView ivSignature;
    @NonNull
    public final LinearLayout layoutTextSign;
    @NonNull
    public final FrameLayout signatureBox;
    @NonNull
    public final DtacFontTextView tvAdvancePayment;
    @NonNull
    public final DtacFontTextView tvAdvancePaymentByCondition;
    @NonNull
    public final DtacFontTextView tvBundleTitle;
    @NonNull
    public final DtacFontTextView tvBundleTitleOriginalContract;
    @NonNull
    public final DtacFontTextView tvConditionPeriod;
    @NonNull
    public final DtacFontTextView tvDiscount;
    @NonNull
    public final DtacFontTextView tvDiscountContract;
    @NonNull
    public final DtacFontTextView tvDiscountOriginalContract;
    @NonNull
    public final DtacFontTextView tvIMEI;
    @NonNull
    public final DtacFontTextView tvModel;
    @NonNull
    public final DtacFontTextView tvNormalPrice;
    @NonNull
    public final DtacFontTextView tvPackage;
    @NonNull
    public final DtacFontTextView tvPriceAfterDiscount;
    @NonNull
    public final DtacFontTextView tvSignature;
    @NonNull
    public final DtacFontTextView tvSignatureHelper;
    @NonNull
    public final DtacFontTextView tvSignatureTextHelper;
    @NonNull
    public final DtacFontTextView tvSubrNumb;
    @NonNull
    public final DtacFontTextView tvTotalAdvancePayment;

    public FragmentDeviceSaleSummaryBinding(ScrollView scrollView, DtacFontButton dtacFontButton, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, LinearLayout linearLayout8, ImageView imageView, LinearLayout linearLayout9, FrameLayout frameLayout, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5, DtacFontTextView dtacFontTextView6, DtacFontTextView dtacFontTextView7, DtacFontTextView dtacFontTextView8, DtacFontTextView dtacFontTextView9, DtacFontTextView dtacFontTextView10, DtacFontTextView dtacFontTextView11, DtacFontTextView dtacFontTextView12, DtacFontTextView dtacFontTextView13, DtacFontTextView dtacFontTextView14, DtacFontTextView dtacFontTextView15, DtacFontTextView dtacFontTextView16, DtacFontTextView dtacFontTextView17, DtacFontTextView dtacFontTextView18) {
        this.f83797a = scrollView;
        this.btnNext = dtacFontButton;
        this.fAdvancePayment = linearLayout;
        this.fPeriod = linearLayout2;
        this.frameAdvancePayment = linearLayout3;
        this.frameNormalPrice = linearLayout4;
        this.framePriceAfterDiscount = linearLayout5;
        this.frameTotalAdvancePayment = linearLayout6;
        this.gConditionBox = linearLayout7;
        this.gConditionBoxOriginalContract = linearLayout8;
        this.ivSignature = imageView;
        this.layoutTextSign = linearLayout9;
        this.signatureBox = frameLayout;
        this.tvAdvancePayment = dtacFontTextView;
        this.tvAdvancePaymentByCondition = dtacFontTextView2;
        this.tvBundleTitle = dtacFontTextView3;
        this.tvBundleTitleOriginalContract = dtacFontTextView4;
        this.tvConditionPeriod = dtacFontTextView5;
        this.tvDiscount = dtacFontTextView6;
        this.tvDiscountContract = dtacFontTextView7;
        this.tvDiscountOriginalContract = dtacFontTextView8;
        this.tvIMEI = dtacFontTextView9;
        this.tvModel = dtacFontTextView10;
        this.tvNormalPrice = dtacFontTextView11;
        this.tvPackage = dtacFontTextView12;
        this.tvPriceAfterDiscount = dtacFontTextView13;
        this.tvSignature = dtacFontTextView14;
        this.tvSignatureHelper = dtacFontTextView15;
        this.tvSignatureTextHelper = dtacFontTextView16;
        this.tvSubrNumb = dtacFontTextView17;
        this.tvTotalAdvancePayment = dtacFontTextView18;
    }

    @NonNull
    public static FragmentDeviceSaleSummaryBinding bind(@NonNull View view) {
        int i = R.id.btnNext;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
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
                                i = R.id.frameTotalAdvancePayment;
                                LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout6 != null) {
                                    i = R.id.gConditionBox;
                                    LinearLayout linearLayout7 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout7 != null) {
                                        i = R.id.gConditionBoxOriginalContract;
                                        LinearLayout linearLayout8 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                        if (linearLayout8 != null) {
                                            i = R.id.ivSignature;
                                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                            if (imageView != null) {
                                                i = R.id.layoutTextSign;
                                                LinearLayout linearLayout9 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                if (linearLayout9 != null) {
                                                    i = R.id.signatureBox;
                                                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                                    if (frameLayout != null) {
                                                        i = R.id.tvAdvancePayment;
                                                        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (dtacFontTextView != null) {
                                                            i = R.id.tvAdvancePaymentByCondition;
                                                            DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                            if (dtacFontTextView2 != null) {
                                                                i = R.id.tvBundleTitle;
                                                                DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                if (dtacFontTextView3 != null) {
                                                                    i = R.id.tvBundleTitleOriginalContract;
                                                                    DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (dtacFontTextView4 != null) {
                                                                        i = R.id.tvConditionPeriod;
                                                                        DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (dtacFontTextView5 != null) {
                                                                            i = R.id.tvDiscount;
                                                                            DtacFontTextView dtacFontTextView6 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (dtacFontTextView6 != null) {
                                                                                i = R.id.tvDiscountContract;
                                                                                DtacFontTextView dtacFontTextView7 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                if (dtacFontTextView7 != null) {
                                                                                    i = R.id.tvDiscountOriginalContract;
                                                                                    DtacFontTextView dtacFontTextView8 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (dtacFontTextView8 != null) {
                                                                                        i = R.id.tvIMEI;
                                                                                        DtacFontTextView dtacFontTextView9 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (dtacFontTextView9 != null) {
                                                                                            i = R.id.tvModel;
                                                                                            DtacFontTextView dtacFontTextView10 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                            if (dtacFontTextView10 != null) {
                                                                                                i = R.id.tvNormalPrice;
                                                                                                DtacFontTextView dtacFontTextView11 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                if (dtacFontTextView11 != null) {
                                                                                                    i = R.id.tvPackage;
                                                                                                    DtacFontTextView dtacFontTextView12 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                    if (dtacFontTextView12 != null) {
                                                                                                        i = R.id.tvPriceAfterDiscount;
                                                                                                        DtacFontTextView dtacFontTextView13 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                        if (dtacFontTextView13 != null) {
                                                                                                            i = R.id.tvSignature;
                                                                                                            DtacFontTextView dtacFontTextView14 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                            if (dtacFontTextView14 != null) {
                                                                                                                i = R.id.tvSignatureHelper;
                                                                                                                DtacFontTextView dtacFontTextView15 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                if (dtacFontTextView15 != null) {
                                                                                                                    i = R.id.tvSignatureTextHelper;
                                                                                                                    DtacFontTextView dtacFontTextView16 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                    if (dtacFontTextView16 != null) {
                                                                                                                        i = R.id.tvSubrNumb;
                                                                                                                        DtacFontTextView dtacFontTextView17 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                        if (dtacFontTextView17 != null) {
                                                                                                                            i = R.id.tvTotalAdvancePayment;
                                                                                                                            DtacFontTextView dtacFontTextView18 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                            if (dtacFontTextView18 != null) {
                                                                                                                                return new FragmentDeviceSaleSummaryBinding((ScrollView) view, dtacFontButton, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, linearLayout8, imageView, linearLayout9, frameLayout, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5, dtacFontTextView6, dtacFontTextView7, dtacFontTextView8, dtacFontTextView9, dtacFontTextView10, dtacFontTextView11, dtacFontTextView12, dtacFontTextView13, dtacFontTextView14, dtacFontTextView15, dtacFontTextView16, dtacFontTextView17, dtacFontTextView18);
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
    public static FragmentDeviceSaleSummaryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentDeviceSaleSummaryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_device_sale_summary, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ScrollView getRoot() {
        return this.f83797a;
    }
}