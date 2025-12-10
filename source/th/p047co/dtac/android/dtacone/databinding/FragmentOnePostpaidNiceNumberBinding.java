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
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOnePostpaidNiceNumberBinding */
/* loaded from: classes7.dex */
public final class FragmentOnePostpaidNiceNumberBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f84031a;
    @NonNull
    public final OneFontButton btnConfirm;
    @NonNull
    public final CardView cardCondition;
    @NonNull
    public final Guideline guideline6;
    @NonNull
    public final ImageView ivSignature;
    @NonNull
    public final FrameLayout signatureBox;
    @NonNull
    public final OneFontTextView tvAdvancedPayment;
    @NonNull
    public final OneFontTextView tvAdvancedPaymentLabel;
    @NonNull
    public final OneFontTextView tvContractPeriod;
    @NonNull
    public final OneFontTextView tvContractPeriodLabel;
    @NonNull
    public final OneFontTextView tvNiceNumberCondition;
    @NonNull
    public final OneFontTextView tvPackageName;
    @NonNull
    public final OneFontTextView tvPackageNameLabel;
    @NonNull
    public final OneFontTextView tvPhoneNumber;
    @NonNull
    public final OneFontTextView tvPhoneNumberLabel;
    @NonNull
    public final OneFontTextView tvSignature;
    @NonNull
    public final OneFontTextView tvSignatureHelper;
    @NonNull
    public final OneFontTextView tvSignatureTextHelper;
    @NonNull
    public final View viewDivide;

    public FragmentOnePostpaidNiceNumberBinding(NestedScrollView nestedScrollView, OneFontButton oneFontButton, CardView cardView, Guideline guideline, ImageView imageView, FrameLayout frameLayout, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5, OneFontTextView oneFontTextView6, OneFontTextView oneFontTextView7, OneFontTextView oneFontTextView8, OneFontTextView oneFontTextView9, OneFontTextView oneFontTextView10, OneFontTextView oneFontTextView11, OneFontTextView oneFontTextView12, View view) {
        this.f84031a = nestedScrollView;
        this.btnConfirm = oneFontButton;
        this.cardCondition = cardView;
        this.guideline6 = guideline;
        this.ivSignature = imageView;
        this.signatureBox = frameLayout;
        this.tvAdvancedPayment = oneFontTextView;
        this.tvAdvancedPaymentLabel = oneFontTextView2;
        this.tvContractPeriod = oneFontTextView3;
        this.tvContractPeriodLabel = oneFontTextView4;
        this.tvNiceNumberCondition = oneFontTextView5;
        this.tvPackageName = oneFontTextView6;
        this.tvPackageNameLabel = oneFontTextView7;
        this.tvPhoneNumber = oneFontTextView8;
        this.tvPhoneNumberLabel = oneFontTextView9;
        this.tvSignature = oneFontTextView10;
        this.tvSignatureHelper = oneFontTextView11;
        this.tvSignatureTextHelper = oneFontTextView12;
        this.viewDivide = view;
    }

    @NonNull
    public static FragmentOnePostpaidNiceNumberBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.btnConfirm;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
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
                            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView != null) {
                                i = R.id.tvAdvancedPaymentLabel;
                                OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView2 != null) {
                                    i = R.id.tvContractPeriod;
                                    OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (oneFontTextView3 != null) {
                                        i = R.id.tvContractPeriodLabel;
                                        OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (oneFontTextView4 != null) {
                                            i = R.id.tvNiceNumberCondition;
                                            OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (oneFontTextView5 != null) {
                                                i = R.id.tvPackageName;
                                                OneFontTextView oneFontTextView6 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (oneFontTextView6 != null) {
                                                    i = R.id.tvPackageNameLabel;
                                                    OneFontTextView oneFontTextView7 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (oneFontTextView7 != null) {
                                                        i = R.id.tvPhoneNumber;
                                                        OneFontTextView oneFontTextView8 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (oneFontTextView8 != null) {
                                                            i = R.id.tvPhoneNumberLabel;
                                                            OneFontTextView oneFontTextView9 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                            if (oneFontTextView9 != null) {
                                                                i = R.id.tvSignature;
                                                                OneFontTextView oneFontTextView10 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                if (oneFontTextView10 != null) {
                                                                    i = R.id.tvSignatureHelper;
                                                                    OneFontTextView oneFontTextView11 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (oneFontTextView11 != null) {
                                                                        i = R.id.tvSignatureTextHelper;
                                                                        OneFontTextView oneFontTextView12 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (oneFontTextView12 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.viewDivide))) != null) {
                                                                            return new FragmentOnePostpaidNiceNumberBinding((NestedScrollView) view, oneFontButton, cardView, guideline, imageView, frameLayout, oneFontTextView, oneFontTextView2, oneFontTextView3, oneFontTextView4, oneFontTextView5, oneFontTextView6, oneFontTextView7, oneFontTextView8, oneFontTextView9, oneFontTextView10, oneFontTextView11, oneFontTextView12, findChildViewById);
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
    public static FragmentOnePostpaidNiceNumberBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOnePostpaidNiceNumberBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_postpaid_nice_number, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f84031a;
    }
}
