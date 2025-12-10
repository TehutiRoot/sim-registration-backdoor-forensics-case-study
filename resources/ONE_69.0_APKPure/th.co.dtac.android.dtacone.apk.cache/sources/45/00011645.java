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
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneMnpSummaryBinding */
/* loaded from: classes7.dex */
public final class FragmentOneMnpSummaryBinding implements ViewBinding {

    /* renamed from: a */
    public final ScrollView f84084a;
    @NonNull
    public final OneFontButton btnConfirm;
    @NonNull
    public final ImageView imgTackMorePhoto;
    @NonNull
    public final LinearLayout layoutBillInfo;
    @NonNull
    public final ConstraintLayout layoutBillingInformation;
    @NonNull
    public final LinearLayout layoutInfo;
    @NonNull
    public final LinearLayout layoutPackageInfo;
    @NonNull
    public final LinearLayoutCompat layoutTruePSPrepaid;
    @NonNull
    public final FrameLayout packageGroup;
    @NonNull
    public final OnePostpaidPackageItemRowBinding packages;
    @NonNull
    public final OnePostpaidTruePackageItemBinding packagesTrue;
    @NonNull
    public final LinearLayoutCompat slideImage;
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
    public final OneFontTextView tvBullet1;
    @NonNull
    public final OneFontTextView tvBullet2;
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
    public final OneFontTextView tvGender;
    @NonNull
    public final OneFontTextView tvGenderLabel;
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
    public final OneFontTextView tvPhoneNumber;
    @NonNull
    public final OneFontTextView tvPhoneNumberContact;
    @NonNull
    public final OneFontTextView tvPhoneNumberContactLabel;
    @NonNull
    public final OneFontTextView tvPhoneNumberLabel;
    @NonNull
    public final OneFontTextView tvPhotoCount;
    @NonNull
    public final OneFontTextView tvPsFirstCondition;
    @NonNull
    public final OneFontTextView tvRegisterPhoneNumber;
    @NonNull
    public final OneFontTextView tvRegisterPhoneNumberLabel;

    public FragmentOneMnpSummaryBinding(ScrollView scrollView, OneFontButton oneFontButton, ImageView imageView, LinearLayout linearLayout, ConstraintLayout constraintLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayoutCompat linearLayoutCompat, FrameLayout frameLayout, OnePostpaidPackageItemRowBinding onePostpaidPackageItemRowBinding, OnePostpaidTruePackageItemBinding onePostpaidTruePackageItemBinding, LinearLayoutCompat linearLayoutCompat2, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5, OneFontTextView oneFontTextView6, OneFontTextView oneFontTextView7, OneFontTextView oneFontTextView8, OneFontTextView oneFontTextView9, OneFontTextView oneFontTextView10, OneFontTextView oneFontTextView11, OneFontTextView oneFontTextView12, OneFontTextView oneFontTextView13, OneFontTextView oneFontTextView14, OneFontTextView oneFontTextView15, OneFontTextView oneFontTextView16, OneFontTextView oneFontTextView17, OneFontTextView oneFontTextView18, OneFontTextView oneFontTextView19, OneFontTextView oneFontTextView20, OneFontTextView oneFontTextView21, OneFontTextView oneFontTextView22, OneFontTextView oneFontTextView23, OneFontTextView oneFontTextView24, OneFontTextView oneFontTextView25, OneFontTextView oneFontTextView26, OneFontTextView oneFontTextView27, OneFontTextView oneFontTextView28, OneFontTextView oneFontTextView29) {
        this.f84084a = scrollView;
        this.btnConfirm = oneFontButton;
        this.imgTackMorePhoto = imageView;
        this.layoutBillInfo = linearLayout;
        this.layoutBillingInformation = constraintLayout;
        this.layoutInfo = linearLayout2;
        this.layoutPackageInfo = linearLayout3;
        this.layoutTruePSPrepaid = linearLayoutCompat;
        this.packageGroup = frameLayout;
        this.packages = onePostpaidPackageItemRowBinding;
        this.packagesTrue = onePostpaidTruePackageItemBinding;
        this.slideImage = linearLayoutCompat2;
        this.tvAddMorePhoto = oneFontTextView;
        this.tvAddress = oneFontTextView2;
        this.tvAddressLabel = oneFontTextView3;
        this.tvBirthDate = oneFontTextView4;
        this.tvBirthDateLabel = oneFontTextView5;
        this.tvBullet1 = oneFontTextView6;
        this.tvBullet2 = oneFontTextView7;
        this.tvCardNumber = oneFontTextView8;
        this.tvCardNumberLabel = oneFontTextView9;
        this.tvCardType = oneFontTextView10;
        this.tvCardTypeLabel = oneFontTextView11;
        this.tvEmail = oneFontTextView12;
        this.tvEmailLabel = oneFontTextView13;
        this.tvGender = oneFontTextView14;
        this.tvGenderLabel = oneFontTextView15;
        this.tvInvoiceLang = oneFontTextView16;
        this.tvInvoiceLangLabel = oneFontTextView17;
        this.tvLastName = oneFontTextView18;
        this.tvLastNameLabel = oneFontTextView19;
        this.tvName = oneFontTextView20;
        this.tvNameLabel = oneFontTextView21;
        this.tvPhoneNumber = oneFontTextView22;
        this.tvPhoneNumberContact = oneFontTextView23;
        this.tvPhoneNumberContactLabel = oneFontTextView24;
        this.tvPhoneNumberLabel = oneFontTextView25;
        this.tvPhotoCount = oneFontTextView26;
        this.tvPsFirstCondition = oneFontTextView27;
        this.tvRegisterPhoneNumber = oneFontTextView28;
        this.tvRegisterPhoneNumberLabel = oneFontTextView29;
    }

    @NonNull
    public static FragmentOneMnpSummaryBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.btnConfirm;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.imgTackMorePhoto;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.layout_bill_info;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = R.id.layoutBillingInformation;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout != null) {
                        i = R.id.layout_info;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout2 != null) {
                            i = R.id.layout_package_info;
                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout3 != null) {
                                i = R.id.layoutTruePSPrepaid;
                                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                if (linearLayoutCompat != null) {
                                    i = R.id.packageGroup;
                                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                    if (frameLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.packages))) != null) {
                                        OnePostpaidPackageItemRowBinding bind = OnePostpaidPackageItemRowBinding.bind(findChildViewById);
                                        i = R.id.packagesTrue;
                                        View findChildViewById2 = ViewBindings.findChildViewById(view, i);
                                        if (findChildViewById2 != null) {
                                            OnePostpaidTruePackageItemBinding bind2 = OnePostpaidTruePackageItemBinding.bind(findChildViewById2);
                                            i = R.id.slideImage;
                                            LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                            if (linearLayoutCompat2 != null) {
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
                                                                    i = R.id.tvBullet1;
                                                                    OneFontTextView oneFontTextView6 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (oneFontTextView6 != null) {
                                                                        i = R.id.tvBullet2;
                                                                        OneFontTextView oneFontTextView7 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (oneFontTextView7 != null) {
                                                                            i = R.id.tvCardNumber;
                                                                            OneFontTextView oneFontTextView8 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (oneFontTextView8 != null) {
                                                                                i = R.id.tvCardNumberLabel;
                                                                                OneFontTextView oneFontTextView9 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                if (oneFontTextView9 != null) {
                                                                                    i = R.id.tvCardType;
                                                                                    OneFontTextView oneFontTextView10 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (oneFontTextView10 != null) {
                                                                                        i = R.id.tvCardTypeLabel;
                                                                                        OneFontTextView oneFontTextView11 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (oneFontTextView11 != null) {
                                                                                            i = R.id.tvEmail;
                                                                                            OneFontTextView oneFontTextView12 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                            if (oneFontTextView12 != null) {
                                                                                                i = R.id.tvEmailLabel;
                                                                                                OneFontTextView oneFontTextView13 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                if (oneFontTextView13 != null) {
                                                                                                    i = R.id.tvGender;
                                                                                                    OneFontTextView oneFontTextView14 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                    if (oneFontTextView14 != null) {
                                                                                                        i = R.id.tvGenderLabel;
                                                                                                        OneFontTextView oneFontTextView15 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                        if (oneFontTextView15 != null) {
                                                                                                            i = R.id.tvInvoiceLang;
                                                                                                            OneFontTextView oneFontTextView16 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                            if (oneFontTextView16 != null) {
                                                                                                                i = R.id.tvInvoiceLangLabel;
                                                                                                                OneFontTextView oneFontTextView17 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                if (oneFontTextView17 != null) {
                                                                                                                    i = R.id.tvLastName;
                                                                                                                    OneFontTextView oneFontTextView18 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                    if (oneFontTextView18 != null) {
                                                                                                                        i = R.id.tvLastNameLabel;
                                                                                                                        OneFontTextView oneFontTextView19 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                        if (oneFontTextView19 != null) {
                                                                                                                            i = R.id.tvName;
                                                                                                                            OneFontTextView oneFontTextView20 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                            if (oneFontTextView20 != null) {
                                                                                                                                i = R.id.tvNameLabel;
                                                                                                                                OneFontTextView oneFontTextView21 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                if (oneFontTextView21 != null) {
                                                                                                                                    i = R.id.tvPhoneNumber;
                                                                                                                                    OneFontTextView oneFontTextView22 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                    if (oneFontTextView22 != null) {
                                                                                                                                        i = R.id.tvPhoneNumberContact;
                                                                                                                                        OneFontTextView oneFontTextView23 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                        if (oneFontTextView23 != null) {
                                                                                                                                            i = R.id.tvPhoneNumberContactLabel;
                                                                                                                                            OneFontTextView oneFontTextView24 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                            if (oneFontTextView24 != null) {
                                                                                                                                                i = R.id.tvPhoneNumberLabel;
                                                                                                                                                OneFontTextView oneFontTextView25 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                if (oneFontTextView25 != null) {
                                                                                                                                                    i = R.id.tvPhotoCount;
                                                                                                                                                    OneFontTextView oneFontTextView26 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                    if (oneFontTextView26 != null) {
                                                                                                                                                        i = R.id.tvPsFirstCondition;
                                                                                                                                                        OneFontTextView oneFontTextView27 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                        if (oneFontTextView27 != null) {
                                                                                                                                                            i = R.id.tvRegisterPhoneNumber;
                                                                                                                                                            OneFontTextView oneFontTextView28 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                            if (oneFontTextView28 != null) {
                                                                                                                                                                i = R.id.tvRegisterPhoneNumberLabel;
                                                                                                                                                                OneFontTextView oneFontTextView29 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                if (oneFontTextView29 != null) {
                                                                                                                                                                    return new FragmentOneMnpSummaryBinding((ScrollView) view, oneFontButton, imageView, linearLayout, constraintLayout, linearLayout2, linearLayout3, linearLayoutCompat, frameLayout, bind, bind2, linearLayoutCompat2, oneFontTextView, oneFontTextView2, oneFontTextView3, oneFontTextView4, oneFontTextView5, oneFontTextView6, oneFontTextView7, oneFontTextView8, oneFontTextView9, oneFontTextView10, oneFontTextView11, oneFontTextView12, oneFontTextView13, oneFontTextView14, oneFontTextView15, oneFontTextView16, oneFontTextView17, oneFontTextView18, oneFontTextView19, oneFontTextView20, oneFontTextView21, oneFontTextView22, oneFontTextView23, oneFontTextView24, oneFontTextView25, oneFontTextView26, oneFontTextView27, oneFontTextView28, oneFontTextView29);
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
    public static FragmentOneMnpSummaryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneMnpSummaryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_mnp_summary, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ScrollView getRoot() {
        return this.f84084a;
    }
}