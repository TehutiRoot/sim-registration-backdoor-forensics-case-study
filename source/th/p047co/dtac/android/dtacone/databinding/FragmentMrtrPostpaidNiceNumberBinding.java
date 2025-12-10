package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrPostpaidNiceNumberBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrPostpaidNiceNumberBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f83833a;
    @NonNull
    public final DtacFontButton btnConfirm;
    @NonNull
    public final CardView cardCondition;
    @NonNull
    public final Guideline guideline6;
    @NonNull
    public final ImageView ivSignature;
    @NonNull
    public final FrameLayout signatureBox;
    @NonNull
    public final DtacFontTextView tvAdvancedPayment;
    @NonNull
    public final DtacFontTextView tvAdvancedPaymentLabel;
    @NonNull
    public final DtacFontTextView tvContractPeriod;
    @NonNull
    public final DtacFontTextView tvContractPeriodLabel;
    @NonNull
    public final DtacFontTextView tvNiceNumberCondition;
    @NonNull
    public final DtacFontTextView tvPackageName;
    @NonNull
    public final DtacFontTextView tvPackageNameLabel;
    @NonNull
    public final DtacFontTextView tvPhoneNumber;
    @NonNull
    public final DtacFontTextView tvPhoneNumberLabel;
    @NonNull
    public final DtacFontTextView tvSignature;
    @NonNull
    public final DtacFontTextView tvSignatureHelper;
    @NonNull
    public final DtacFontTextView tvSignatureTextHelper;
    @NonNull
    public final View viewDivide;

    public FragmentMrtrPostpaidNiceNumberBinding(NestedScrollView nestedScrollView, DtacFontButton dtacFontButton, CardView cardView, Guideline guideline, ImageView imageView, FrameLayout frameLayout, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5, DtacFontTextView dtacFontTextView6, DtacFontTextView dtacFontTextView7, DtacFontTextView dtacFontTextView8, DtacFontTextView dtacFontTextView9, DtacFontTextView dtacFontTextView10, DtacFontTextView dtacFontTextView11, DtacFontTextView dtacFontTextView12, View view) {
        this.f83833a = nestedScrollView;
        this.btnConfirm = dtacFontButton;
        this.cardCondition = cardView;
        this.guideline6 = guideline;
        this.ivSignature = imageView;
        this.signatureBox = frameLayout;
        this.tvAdvancedPayment = dtacFontTextView;
        this.tvAdvancedPaymentLabel = dtacFontTextView2;
        this.tvContractPeriod = dtacFontTextView3;
        this.tvContractPeriodLabel = dtacFontTextView4;
        this.tvNiceNumberCondition = dtacFontTextView5;
        this.tvPackageName = dtacFontTextView6;
        this.tvPackageNameLabel = dtacFontTextView7;
        this.tvPhoneNumber = dtacFontTextView8;
        this.tvPhoneNumberLabel = dtacFontTextView9;
        this.tvSignature = dtacFontTextView10;
        this.tvSignatureHelper = dtacFontTextView11;
        this.tvSignatureTextHelper = dtacFontTextView12;
        this.viewDivide = view;
    }

    @NonNull
    public static FragmentMrtrPostpaidNiceNumberBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.btnConfirm;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.cardCondition;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
            if (cardView != null) {
                i = R.id.guideline6;
                Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                if (guideline != null) {
                    i = R.id.ivSignature;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R.id.signatureBox;
                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                        if (frameLayout != null) {
                            i = R.id.tvAdvancedPayment;
                            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView != null) {
                                i = R.id.tvAdvancedPaymentLabel;
                                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView2 != null) {
                                    i = R.id.tvContractPeriod;
                                    DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView3 != null) {
                                        i = R.id.tvContractPeriodLabel;
                                        DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (dtacFontTextView4 != null) {
                                            i = R.id.tvNiceNumberCondition;
                                            DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (dtacFontTextView5 != null) {
                                                i = R.id.tvPackageName;
                                                DtacFontTextView dtacFontTextView6 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (dtacFontTextView6 != null) {
                                                    i = R.id.tvPackageNameLabel;
                                                    DtacFontTextView dtacFontTextView7 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (dtacFontTextView7 != null) {
                                                        i = R.id.tvPhoneNumber;
                                                        DtacFontTextView dtacFontTextView8 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (dtacFontTextView8 != null) {
                                                            i = R.id.tvPhoneNumberLabel;
                                                            DtacFontTextView dtacFontTextView9 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                            if (dtacFontTextView9 != null) {
                                                                i = R.id.tvSignature;
                                                                DtacFontTextView dtacFontTextView10 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                if (dtacFontTextView10 != null) {
                                                                    i = R.id.tvSignatureHelper;
                                                                    DtacFontTextView dtacFontTextView11 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (dtacFontTextView11 != null) {
                                                                        i = R.id.tvSignatureTextHelper;
                                                                        DtacFontTextView dtacFontTextView12 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (dtacFontTextView12 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.viewDivide))) != null) {
                                                                            return new FragmentMrtrPostpaidNiceNumberBinding((NestedScrollView) view, dtacFontButton, cardView, guideline, imageView, frameLayout, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5, dtacFontTextView6, dtacFontTextView7, dtacFontTextView8, dtacFontTextView9, dtacFontTextView10, dtacFontTextView11, dtacFontTextView12, findChildViewById);
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
    public static FragmentMrtrPostpaidNiceNumberBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrPostpaidNiceNumberBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_postpaid_nice_number, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f83833a;
    }
}
