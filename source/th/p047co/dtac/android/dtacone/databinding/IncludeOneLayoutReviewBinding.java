package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.IncludeOneLayoutReviewBinding */
/* loaded from: classes7.dex */
public final class IncludeOneLayoutReviewBinding implements ViewBinding {

    /* renamed from: a */
    public final ScrollView f84270a;
    @NonNull
    public final OneFontButton btnConfirm;
    @NonNull
    public final Guideline guidelineAddress;
    @NonNull
    public final ImageView imgTackMorePhoto;
    @NonNull
    public final LinearLayout layoutBillInfo;
    @NonNull
    public final LinearLayout layoutInfo;
    @NonNull
    public final LinearLayout layoutPackageInfo;
    @NonNull
    public final LinearLayout layoutPaymentBillInfo;
    @NonNull
    public final ConstraintLayout layoutReceipt;
    @NonNull
    public final FrameLayout packageGroup;
    @NonNull
    public final OnePostpaidPackageItemRowBinding packages;
    @NonNull
    public final OnePostpaidTruePackageItemBinding packagesTrue;
    @NonNull
    public final LinearLayout packgagesDx;
    @NonNull
    public final RelativeLayout slideImage;
    @NonNull
    public final OneFontTextView tvAddMorePhoto;
    @NonNull
    public final OneFontTextView tvAddress;
    @NonNull
    public final OneFontTextView tvAddressLabel;
    @NonNull
    public final OneFontTextView tvBirthDate;
    @NonNull
    public final OneFontTextView tvBirthDateLabel;
    @NonNull
    public final OneFontTextView tvCardNumber;
    @NonNull
    public final OneFontTextView tvCardNumberLabel;
    @NonNull
    public final OneFontTextView tvCardType;
    @NonNull
    public final OneFontTextView tvCardTypeLabel;
    @NonNull
    public final OneFontTextView tvEmail;
    @NonNull
    public final OneFontTextView tvEmailLabel;
    @NonNull
    public final OneFontTextView tvInvoiceLang;
    @NonNull
    public final OneFontTextView tvInvoiceLangLabel;
    @NonNull
    public final OneFontTextView tvLastName;
    @NonNull
    public final OneFontTextView tvLastNameLabel;
    @NonNull
    public final OneFontTextView tvName;
    @NonNull
    public final OneFontTextView tvNameLabel;
    @NonNull
    public final OneFontTextView tvPaymentBackCard;
    @NonNull
    public final OneFontTextView tvPaymentBackCardLabel;
    @NonNull
    public final OneFontTextView tvPaymentBillAddress;
    @NonNull
    public final OneFontTextView tvPaymentBillAddressLabel;
    @NonNull
    public final OneFontTextView tvPaymentBranchCode;
    @NonNull
    public final OneFontTextView tvPaymentBranchCodeLabel;
    @NonNull
    public final OneFontTextView tvPaymentCardNumber;
    @NonNull
    public final OneFontTextView tvPaymentCardNumberLabel;
    @NonNull
    public final OneFontTextView tvPaymentCash;
    @NonNull
    public final OneFontTextView tvPaymentCashLabel;
    @NonNull
    public final OneFontTextView tvPaymentChannel;
    @NonNull
    public final OneFontTextView tvPaymentChannelLabel;
    @NonNull
    public final OneFontTextView tvPaymentCreditCard;
    @NonNull
    public final OneFontTextView tvPaymentCreditCardLabel;
    @NonNull
    public final OneFontTextView tvPaymentDataType;
    @NonNull
    public final OneFontTextView tvPaymentDataTypeLabel;
    @NonNull
    public final OneFontTextView tvPaymentReceipt;
    @NonNull
    public final OneFontTextView tvPaymentReceiptLabel;
    @NonNull
    public final OneFontTextView tvPaymentTaxNumber;
    @NonNull
    public final OneFontTextView tvPaymentTaxNumberLabel;
    @NonNull
    public final OneFontTextView tvPhoneNumber;
    @NonNull
    public final OneFontTextView tvPhoneNumberContact;
    @NonNull
    public final OneFontTextView tvPhoneNumberContactLabel;
    @NonNull
    public final OneFontTextView tvPhoneNumberLabel;
    @NonNull
    public final OneFontTextView tvPhotoCount;

    public IncludeOneLayoutReviewBinding(ScrollView scrollView, OneFontButton oneFontButton, Guideline guideline, ImageView imageView, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, ConstraintLayout constraintLayout, FrameLayout frameLayout, OnePostpaidPackageItemRowBinding onePostpaidPackageItemRowBinding, OnePostpaidTruePackageItemBinding onePostpaidTruePackageItemBinding, LinearLayout linearLayout5, RelativeLayout relativeLayout, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5, OneFontTextView oneFontTextView6, OneFontTextView oneFontTextView7, OneFontTextView oneFontTextView8, OneFontTextView oneFontTextView9, OneFontTextView oneFontTextView10, OneFontTextView oneFontTextView11, OneFontTextView oneFontTextView12, OneFontTextView oneFontTextView13, OneFontTextView oneFontTextView14, OneFontTextView oneFontTextView15, OneFontTextView oneFontTextView16, OneFontTextView oneFontTextView17, OneFontTextView oneFontTextView18, OneFontTextView oneFontTextView19, OneFontTextView oneFontTextView20, OneFontTextView oneFontTextView21, OneFontTextView oneFontTextView22, OneFontTextView oneFontTextView23, OneFontTextView oneFontTextView24, OneFontTextView oneFontTextView25, OneFontTextView oneFontTextView26, OneFontTextView oneFontTextView27, OneFontTextView oneFontTextView28, OneFontTextView oneFontTextView29, OneFontTextView oneFontTextView30, OneFontTextView oneFontTextView31, OneFontTextView oneFontTextView32, OneFontTextView oneFontTextView33, OneFontTextView oneFontTextView34, OneFontTextView oneFontTextView35, OneFontTextView oneFontTextView36, OneFontTextView oneFontTextView37, OneFontTextView oneFontTextView38, OneFontTextView oneFontTextView39, OneFontTextView oneFontTextView40, OneFontTextView oneFontTextView41, OneFontTextView oneFontTextView42) {
        this.f84270a = scrollView;
        this.btnConfirm = oneFontButton;
        this.guidelineAddress = guideline;
        this.imgTackMorePhoto = imageView;
        this.layoutBillInfo = linearLayout;
        this.layoutInfo = linearLayout2;
        this.layoutPackageInfo = linearLayout3;
        this.layoutPaymentBillInfo = linearLayout4;
        this.layoutReceipt = constraintLayout;
        this.packageGroup = frameLayout;
        this.packages = onePostpaidPackageItemRowBinding;
        this.packagesTrue = onePostpaidTruePackageItemBinding;
        this.packgagesDx = linearLayout5;
        this.slideImage = relativeLayout;
        this.tvAddMorePhoto = oneFontTextView;
        this.tvAddress = oneFontTextView2;
        this.tvAddressLabel = oneFontTextView3;
        this.tvBirthDate = oneFontTextView4;
        this.tvBirthDateLabel = oneFontTextView5;
        this.tvCardNumber = oneFontTextView6;
        this.tvCardNumberLabel = oneFontTextView7;
        this.tvCardType = oneFontTextView8;
        this.tvCardTypeLabel = oneFontTextView9;
        this.tvEmail = oneFontTextView10;
        this.tvEmailLabel = oneFontTextView11;
        this.tvInvoiceLang = oneFontTextView12;
        this.tvInvoiceLangLabel = oneFontTextView13;
        this.tvLastName = oneFontTextView14;
        this.tvLastNameLabel = oneFontTextView15;
        this.tvName = oneFontTextView16;
        this.tvNameLabel = oneFontTextView17;
        this.tvPaymentBackCard = oneFontTextView18;
        this.tvPaymentBackCardLabel = oneFontTextView19;
        this.tvPaymentBillAddress = oneFontTextView20;
        this.tvPaymentBillAddressLabel = oneFontTextView21;
        this.tvPaymentBranchCode = oneFontTextView22;
        this.tvPaymentBranchCodeLabel = oneFontTextView23;
        this.tvPaymentCardNumber = oneFontTextView24;
        this.tvPaymentCardNumberLabel = oneFontTextView25;
        this.tvPaymentCash = oneFontTextView26;
        this.tvPaymentCashLabel = oneFontTextView27;
        this.tvPaymentChannel = oneFontTextView28;
        this.tvPaymentChannelLabel = oneFontTextView29;
        this.tvPaymentCreditCard = oneFontTextView30;
        this.tvPaymentCreditCardLabel = oneFontTextView31;
        this.tvPaymentDataType = oneFontTextView32;
        this.tvPaymentDataTypeLabel = oneFontTextView33;
        this.tvPaymentReceipt = oneFontTextView34;
        this.tvPaymentReceiptLabel = oneFontTextView35;
        this.tvPaymentTaxNumber = oneFontTextView36;
        this.tvPaymentTaxNumberLabel = oneFontTextView37;
        this.tvPhoneNumber = oneFontTextView38;
        this.tvPhoneNumberContact = oneFontTextView39;
        this.tvPhoneNumberContactLabel = oneFontTextView40;
        this.tvPhoneNumberLabel = oneFontTextView41;
        this.tvPhotoCount = oneFontTextView42;
    }

    @NonNull
    public static IncludeOneLayoutReviewBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.btnConfirm;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.guidelineAddress;
            Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
            if (guideline != null) {
                i = R.id.imgTackMorePhoto;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.layout_bill_info;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = R.id.layout_info;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout2 != null) {
                            i = R.id.layout_package_info;
                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout3 != null) {
                                i = R.id.layout_payment_bill_info;
                                LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout4 != null) {
                                    i = R.id.layoutReceipt;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                    if (constraintLayout != null) {
                                        i = R.id.packageGroup;
                                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                        if (frameLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.packages))) != null) {
                                            OnePostpaidPackageItemRowBinding bind = OnePostpaidPackageItemRowBinding.bind(findChildViewById);
                                            i = R.id.packagesTrue;
                                            View findChildViewById2 = ViewBindings.findChildViewById(view, i);
                                            if (findChildViewById2 != null) {
                                                OnePostpaidTruePackageItemBinding bind2 = OnePostpaidTruePackageItemBinding.bind(findChildViewById2);
                                                i = R.id.packgages_dx;
                                                LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                if (linearLayout5 != null) {
                                                    i = R.id.slideImage;
                                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                                    if (relativeLayout != null) {
                                                        i = R.id.tvAddMorePhoto;
                                                        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (oneFontTextView != null) {
                                                            i = R.id.tvAddress;
                                                            OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                            if (oneFontTextView2 != null) {
                                                                i = R.id.tvAddressLabel;
                                                                OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                if (oneFontTextView3 != null) {
                                                                    i = R.id.tvBirthDate;
                                                                    OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (oneFontTextView4 != null) {
                                                                        i = R.id.tvBirthDateLabel;
                                                                        OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (oneFontTextView5 != null) {
                                                                            i = R.id.tvCardNumber;
                                                                            OneFontTextView oneFontTextView6 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (oneFontTextView6 != null) {
                                                                                i = R.id.tvCardNumberLabel;
                                                                                OneFontTextView oneFontTextView7 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                if (oneFontTextView7 != null) {
                                                                                    i = R.id.tvCardType;
                                                                                    OneFontTextView oneFontTextView8 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (oneFontTextView8 != null) {
                                                                                        i = R.id.tvCardTypeLabel;
                                                                                        OneFontTextView oneFontTextView9 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (oneFontTextView9 != null) {
                                                                                            i = R.id.tvEmail;
                                                                                            OneFontTextView oneFontTextView10 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                            if (oneFontTextView10 != null) {
                                                                                                i = R.id.tvEmailLabel;
                                                                                                OneFontTextView oneFontTextView11 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                if (oneFontTextView11 != null) {
                                                                                                    i = R.id.tvInvoiceLang;
                                                                                                    OneFontTextView oneFontTextView12 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                    if (oneFontTextView12 != null) {
                                                                                                        i = R.id.tvInvoiceLangLabel;
                                                                                                        OneFontTextView oneFontTextView13 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                        if (oneFontTextView13 != null) {
                                                                                                            i = R.id.tvLastName;
                                                                                                            OneFontTextView oneFontTextView14 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                            if (oneFontTextView14 != null) {
                                                                                                                i = R.id.tvLastNameLabel;
                                                                                                                OneFontTextView oneFontTextView15 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                if (oneFontTextView15 != null) {
                                                                                                                    i = R.id.tvName;
                                                                                                                    OneFontTextView oneFontTextView16 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                    if (oneFontTextView16 != null) {
                                                                                                                        i = R.id.tvNameLabel;
                                                                                                                        OneFontTextView oneFontTextView17 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                        if (oneFontTextView17 != null) {
                                                                                                                            i = R.id.tvPaymentBackCard;
                                                                                                                            OneFontTextView oneFontTextView18 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                            if (oneFontTextView18 != null) {
                                                                                                                                i = R.id.tvPaymentBackCardLabel;
                                                                                                                                OneFontTextView oneFontTextView19 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                if (oneFontTextView19 != null) {
                                                                                                                                    i = R.id.tvPaymentBillAddress;
                                                                                                                                    OneFontTextView oneFontTextView20 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                    if (oneFontTextView20 != null) {
                                                                                                                                        i = R.id.tvPaymentBillAddressLabel;
                                                                                                                                        OneFontTextView oneFontTextView21 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                        if (oneFontTextView21 != null) {
                                                                                                                                            i = R.id.tvPaymentBranchCode;
                                                                                                                                            OneFontTextView oneFontTextView22 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                            if (oneFontTextView22 != null) {
                                                                                                                                                i = R.id.tvPaymentBranchCodeLabel;
                                                                                                                                                OneFontTextView oneFontTextView23 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                if (oneFontTextView23 != null) {
                                                                                                                                                    i = R.id.tvPaymentCardNumber;
                                                                                                                                                    OneFontTextView oneFontTextView24 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                    if (oneFontTextView24 != null) {
                                                                                                                                                        i = R.id.tvPaymentCardNumberLabel;
                                                                                                                                                        OneFontTextView oneFontTextView25 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                        if (oneFontTextView25 != null) {
                                                                                                                                                            i = R.id.tvPaymentCash;
                                                                                                                                                            OneFontTextView oneFontTextView26 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                            if (oneFontTextView26 != null) {
                                                                                                                                                                i = R.id.tvPaymentCashLabel;
                                                                                                                                                                OneFontTextView oneFontTextView27 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                if (oneFontTextView27 != null) {
                                                                                                                                                                    i = R.id.tvPaymentChannel;
                                                                                                                                                                    OneFontTextView oneFontTextView28 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                    if (oneFontTextView28 != null) {
                                                                                                                                                                        i = R.id.tvPaymentChannelLabel;
                                                                                                                                                                        OneFontTextView oneFontTextView29 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                        if (oneFontTextView29 != null) {
                                                                                                                                                                            i = R.id.tvPaymentCreditCard;
                                                                                                                                                                            OneFontTextView oneFontTextView30 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                            if (oneFontTextView30 != null) {
                                                                                                                                                                                i = R.id.tvPaymentCreditCardLabel;
                                                                                                                                                                                OneFontTextView oneFontTextView31 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                if (oneFontTextView31 != null) {
                                                                                                                                                                                    i = R.id.tvPaymentDataType;
                                                                                                                                                                                    OneFontTextView oneFontTextView32 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                    if (oneFontTextView32 != null) {
                                                                                                                                                                                        i = R.id.tvPaymentDataTypeLabel;
                                                                                                                                                                                        OneFontTextView oneFontTextView33 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                        if (oneFontTextView33 != null) {
                                                                                                                                                                                            i = R.id.tvPaymentReceipt;
                                                                                                                                                                                            OneFontTextView oneFontTextView34 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                            if (oneFontTextView34 != null) {
                                                                                                                                                                                                i = R.id.tvPaymentReceiptLabel;
                                                                                                                                                                                                OneFontTextView oneFontTextView35 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                if (oneFontTextView35 != null) {
                                                                                                                                                                                                    i = R.id.tvPaymentTaxNumber;
                                                                                                                                                                                                    OneFontTextView oneFontTextView36 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                    if (oneFontTextView36 != null) {
                                                                                                                                                                                                        i = R.id.tvPaymentTaxNumberLabel;
                                                                                                                                                                                                        OneFontTextView oneFontTextView37 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                        if (oneFontTextView37 != null) {
                                                                                                                                                                                                            i = R.id.tvPhoneNumber;
                                                                                                                                                                                                            OneFontTextView oneFontTextView38 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                            if (oneFontTextView38 != null) {
                                                                                                                                                                                                                i = R.id.tvPhoneNumberContact;
                                                                                                                                                                                                                OneFontTextView oneFontTextView39 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                if (oneFontTextView39 != null) {
                                                                                                                                                                                                                    i = R.id.tvPhoneNumberContactLabel;
                                                                                                                                                                                                                    OneFontTextView oneFontTextView40 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                    if (oneFontTextView40 != null) {
                                                                                                                                                                                                                        i = R.id.tvPhoneNumberLabel;
                                                                                                                                                                                                                        OneFontTextView oneFontTextView41 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                        if (oneFontTextView41 != null) {
                                                                                                                                                                                                                            i = R.id.tvPhotoCount;
                                                                                                                                                                                                                            OneFontTextView oneFontTextView42 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                            if (oneFontTextView42 != null) {
                                                                                                                                                                                                                                return new IncludeOneLayoutReviewBinding((ScrollView) view, oneFontButton, guideline, imageView, linearLayout, linearLayout2, linearLayout3, linearLayout4, constraintLayout, frameLayout, bind, bind2, linearLayout5, relativeLayout, oneFontTextView, oneFontTextView2, oneFontTextView3, oneFontTextView4, oneFontTextView5, oneFontTextView6, oneFontTextView7, oneFontTextView8, oneFontTextView9, oneFontTextView10, oneFontTextView11, oneFontTextView12, oneFontTextView13, oneFontTextView14, oneFontTextView15, oneFontTextView16, oneFontTextView17, oneFontTextView18, oneFontTextView19, oneFontTextView20, oneFontTextView21, oneFontTextView22, oneFontTextView23, oneFontTextView24, oneFontTextView25, oneFontTextView26, oneFontTextView27, oneFontTextView28, oneFontTextView29, oneFontTextView30, oneFontTextView31, oneFontTextView32, oneFontTextView33, oneFontTextView34, oneFontTextView35, oneFontTextView36, oneFontTextView37, oneFontTextView38, oneFontTextView39, oneFontTextView40, oneFontTextView41, oneFontTextView42);
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
    public static IncludeOneLayoutReviewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IncludeOneLayoutReviewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.include_one_layout_review, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ScrollView getRoot() {
        return this.f84270a;
    }
}
