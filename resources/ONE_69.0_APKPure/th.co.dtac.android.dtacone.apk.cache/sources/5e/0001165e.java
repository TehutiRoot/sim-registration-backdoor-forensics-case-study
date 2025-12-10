package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputLayout;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacEditText;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneOnlineRegistrationSummaryBinding */
/* loaded from: classes7.dex */
public final class FragmentOneOnlineRegistrationSummaryBinding implements ViewBinding {
    @NonNull
    public final OneFontTextView AddressInfoHeaderTextView;

    /* renamed from: a */
    public final ConstraintLayout f84109a;
    @NonNull
    public final RecyclerView additionalImageRecyclerView;
    @NonNull
    public final ConstraintLayout additionalInfoHeaderLayout;
    @NonNull
    public final OneFontTextView additionalInfoHeaderTextView;
    @NonNull
    public final AppCompatImageView additionalInfoImageView;
    @NonNull
    public final View backgroundView;
    @NonNull
    public final ConstraintLayout bankInfoLayout;
    @NonNull
    public final ConstraintLayout bookBankLayout;
    @NonNull
    public final OneFontTextView businessTypeTextView;
    @NonNull
    public final OneFontTextView businessTypeTitleTextView;
    @NonNull
    public final OneFontTextView commissionBankAccountNameTextView;
    @NonNull
    public final OneFontTextView commissionBankAccountNameTitleTextView;
    @NonNull
    public final OneFontTextView commissionBankAccountNumberTextView;
    @NonNull
    public final OneFontTextView commissionBankAccountNumberTitleTextView;
    @NonNull
    public final OneFontTextView commissionBankBranchTextView;
    @NonNull
    public final OneFontTextView commissionBankBranchTitleTextView;
    @NonNull
    public final OneFontTextView commissionBankNameTextView;
    @NonNull
    public final OneFontTextView commissionBankNameTitleTextView;
    @NonNull
    public final CardView commissionBookBankImageCardView;
    @NonNull
    public final ImageView commissionBookBankImageView;
    @NonNull
    public final OneFontTextView commissionBookBankTitleTextView;
    @NonNull
    public final OneFontTextView commissionInfoHeaderTextView;
    @NonNull
    public final OneFontTextView commissionMethodTitleTextView;
    @NonNull
    public final OneFontTextView commissionTextView;
    @NonNull
    public final OneFontButton confirmButton;
    @NonNull
    public final OneFontTextView dateOfBirthTextView;
    @NonNull
    public final OneFontTextView dateOfBirthTitleTextView;
    @NonNull
    public final ConstraintLayout dtacOnlineLayout;
    @NonNull
    public final ImageView dtacOnlinePhoneImageView;
    @NonNull
    public final OneFontTextView dtacOnlinePhoneNumberTextView;
    @NonNull
    public final OneFontTextView dtacOnlinePhoneTitleTextView;
    @NonNull
    public final OneFontTextView emailTextView;
    @NonNull
    public final OneFontTextView emailTitleTextView;
    @NonNull
    public final OneFontTextView firstNameTextView;
    @NonNull
    public final OneFontTextView firstNameTitleTextView;
    @NonNull
    public final CardView idCardImageCardView;
    @NonNull
    public final ConstraintLayout idCardImageInfoHeaderLayout;
    @NonNull
    public final ImageView idCardImageView;
    @NonNull
    public final AppCompatImageView idCardInfoImageView;
    @NonNull
    public final OneFontTextView idCardTextView;
    @NonNull
    public final OneFontTextView idCardTitleTextView;
    @NonNull
    public final OneFontTextView lastNameTextView;
    @NonNull
    public final OneFontTextView lastNameTitleTextView;
    @NonNull
    public final View lineView1;
    @NonNull
    public final View lineView2;
    @NonNull
    public final View lineView3;
    @NonNull
    public final AppCompatImageView onlineProductSummaryInfoImageView;
    @NonNull
    public final CardView onlineRegisterAdditionalImageInfoCardView;
    @NonNull
    public final ConstraintLayout onlineRegisterAdditionalInfoHeaderLayout;
    @NonNull
    public final ConstraintLayout onlineRegisterCommissionInfoHeaderLayout;
    @NonNull
    public final ConstraintLayout onlineRegisterInfoHeaderLayout;
    @NonNull
    public final OneFontTextView onlineRegisterInfoHeaderTextView;
    @NonNull
    public final ConstraintLayout onlineRegisterProductInfoHeaderLayout;
    @NonNull
    public final ConstraintLayout onlineRegisterRetailerInfoHeaderLayout;
    @NonNull
    public final CardView onlineRegisterSummaryAddressInfoCardView;
    @NonNull
    public final AppCompatImageView onlineRegisterSummaryAddressInfoImageView;
    @NonNull
    public final CardView onlineRegisterSummaryCommissionInfoCardView;
    @NonNull
    public final CardView onlineRegisterSummaryIdCardInfoCardView;
    @NonNull
    public final AppCompatImageView onlineRegisterSummaryInfoImageView;
    @NonNull
    public final CardView onlineRegisterSummaryPersonalInfoCardView;
    @NonNull
    public final CardView onlineRegisterSummaryProductInfoCardView;
    @NonNull
    public final CardView onlineRegisterSummaryRetailerInfoCardView;
    @NonNull
    public final ConstraintLayout onlineRegistrationSummaryMainLayout;
    @NonNull
    public final AppCompatImageView onlineRetailerCommissionInfoImageView;
    @NonNull
    public final AppCompatImageView onlineRetailerSummaryInfoImageView;
    @NonNull
    public final OneFontTextView phoneNumberTextView;
    @NonNull
    public final OneFontTextView phoneNumberTitleTextView;
    @NonNull
    public final OneFontTextView productInfoHeaderTextView;
    @NonNull
    public final OneFontTextView productSimNameTextView;
    @NonNull
    public final OneFontTextView productSimNameTitleTextView;
    @NonNull
    public final OneFontTextView productSimNameTopUpTextView;
    @NonNull
    public final OneFontTextView productSimNameTopUpTitleTextView;
    @NonNull
    public final DtacEditText retailerAddressEditText;
    @NonNull
    public final TextInputLayout retailerAddressTextInputLayoutText;
    @NonNull
    public final OneFontTextView retailerContactInfoHeaderTextView;
    @NonNull
    public final DtacEditText retailerDocumentAddressEditText;
    @NonNull
    public final TextInputLayout retailerDocumentAddressTextInputLayoutText;
    @NonNull
    public final DtacEditText retailerDocumentTaxProductAddressEditText;
    @NonNull
    public final TextInputLayout retailerDocumentTaxProductAddressTextInputLayoutText;
    @NonNull
    public final IncludeOneTypeRetailerBinding retailerHeaderTypeLayout;
    @NonNull
    public final OneFontTextView retailerInfoHeaderTextView;
    @NonNull
    public final OneFontTextView retailerNameTextView;
    @NonNull
    public final OneFontTextView retailerNameTitleTextView;
    @NonNull
    public final DtacEditText retailerTaxAddressEditText;
    @NonNull
    public final TextInputLayout retailerTaxAddressTextInputLayoutText;
    @NonNull
    public final ConstraintLayout trueOnlineLayout;
    @NonNull
    public final ImageView trueOnlinePhoneImageView;
    @NonNull
    public final OneFontTextView trueOnlinePhoneNumberTextView;
    @NonNull
    public final OneFontTextView trueOnlinePhoneTitleTextView;

    public FragmentOneOnlineRegistrationSummaryBinding(ConstraintLayout constraintLayout, OneFontTextView oneFontTextView, RecyclerView recyclerView, ConstraintLayout constraintLayout2, OneFontTextView oneFontTextView2, AppCompatImageView appCompatImageView, View view, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5, OneFontTextView oneFontTextView6, OneFontTextView oneFontTextView7, OneFontTextView oneFontTextView8, OneFontTextView oneFontTextView9, OneFontTextView oneFontTextView10, OneFontTextView oneFontTextView11, OneFontTextView oneFontTextView12, CardView cardView, ImageView imageView, OneFontTextView oneFontTextView13, OneFontTextView oneFontTextView14, OneFontTextView oneFontTextView15, OneFontTextView oneFontTextView16, OneFontButton oneFontButton, OneFontTextView oneFontTextView17, OneFontTextView oneFontTextView18, ConstraintLayout constraintLayout5, ImageView imageView2, OneFontTextView oneFontTextView19, OneFontTextView oneFontTextView20, OneFontTextView oneFontTextView21, OneFontTextView oneFontTextView22, OneFontTextView oneFontTextView23, OneFontTextView oneFontTextView24, CardView cardView2, ConstraintLayout constraintLayout6, ImageView imageView3, AppCompatImageView appCompatImageView2, OneFontTextView oneFontTextView25, OneFontTextView oneFontTextView26, OneFontTextView oneFontTextView27, OneFontTextView oneFontTextView28, View view2, View view3, View view4, AppCompatImageView appCompatImageView3, CardView cardView3, ConstraintLayout constraintLayout7, ConstraintLayout constraintLayout8, ConstraintLayout constraintLayout9, OneFontTextView oneFontTextView29, ConstraintLayout constraintLayout10, ConstraintLayout constraintLayout11, CardView cardView4, AppCompatImageView appCompatImageView4, CardView cardView5, CardView cardView6, AppCompatImageView appCompatImageView5, CardView cardView7, CardView cardView8, CardView cardView9, ConstraintLayout constraintLayout12, AppCompatImageView appCompatImageView6, AppCompatImageView appCompatImageView7, OneFontTextView oneFontTextView30, OneFontTextView oneFontTextView31, OneFontTextView oneFontTextView32, OneFontTextView oneFontTextView33, OneFontTextView oneFontTextView34, OneFontTextView oneFontTextView35, OneFontTextView oneFontTextView36, DtacEditText dtacEditText, TextInputLayout textInputLayout, OneFontTextView oneFontTextView37, DtacEditText dtacEditText2, TextInputLayout textInputLayout2, DtacEditText dtacEditText3, TextInputLayout textInputLayout3, IncludeOneTypeRetailerBinding includeOneTypeRetailerBinding, OneFontTextView oneFontTextView38, OneFontTextView oneFontTextView39, OneFontTextView oneFontTextView40, DtacEditText dtacEditText4, TextInputLayout textInputLayout4, ConstraintLayout constraintLayout13, ImageView imageView4, OneFontTextView oneFontTextView41, OneFontTextView oneFontTextView42) {
        this.f84109a = constraintLayout;
        this.AddressInfoHeaderTextView = oneFontTextView;
        this.additionalImageRecyclerView = recyclerView;
        this.additionalInfoHeaderLayout = constraintLayout2;
        this.additionalInfoHeaderTextView = oneFontTextView2;
        this.additionalInfoImageView = appCompatImageView;
        this.backgroundView = view;
        this.bankInfoLayout = constraintLayout3;
        this.bookBankLayout = constraintLayout4;
        this.businessTypeTextView = oneFontTextView3;
        this.businessTypeTitleTextView = oneFontTextView4;
        this.commissionBankAccountNameTextView = oneFontTextView5;
        this.commissionBankAccountNameTitleTextView = oneFontTextView6;
        this.commissionBankAccountNumberTextView = oneFontTextView7;
        this.commissionBankAccountNumberTitleTextView = oneFontTextView8;
        this.commissionBankBranchTextView = oneFontTextView9;
        this.commissionBankBranchTitleTextView = oneFontTextView10;
        this.commissionBankNameTextView = oneFontTextView11;
        this.commissionBankNameTitleTextView = oneFontTextView12;
        this.commissionBookBankImageCardView = cardView;
        this.commissionBookBankImageView = imageView;
        this.commissionBookBankTitleTextView = oneFontTextView13;
        this.commissionInfoHeaderTextView = oneFontTextView14;
        this.commissionMethodTitleTextView = oneFontTextView15;
        this.commissionTextView = oneFontTextView16;
        this.confirmButton = oneFontButton;
        this.dateOfBirthTextView = oneFontTextView17;
        this.dateOfBirthTitleTextView = oneFontTextView18;
        this.dtacOnlineLayout = constraintLayout5;
        this.dtacOnlinePhoneImageView = imageView2;
        this.dtacOnlinePhoneNumberTextView = oneFontTextView19;
        this.dtacOnlinePhoneTitleTextView = oneFontTextView20;
        this.emailTextView = oneFontTextView21;
        this.emailTitleTextView = oneFontTextView22;
        this.firstNameTextView = oneFontTextView23;
        this.firstNameTitleTextView = oneFontTextView24;
        this.idCardImageCardView = cardView2;
        this.idCardImageInfoHeaderLayout = constraintLayout6;
        this.idCardImageView = imageView3;
        this.idCardInfoImageView = appCompatImageView2;
        this.idCardTextView = oneFontTextView25;
        this.idCardTitleTextView = oneFontTextView26;
        this.lastNameTextView = oneFontTextView27;
        this.lastNameTitleTextView = oneFontTextView28;
        this.lineView1 = view2;
        this.lineView2 = view3;
        this.lineView3 = view4;
        this.onlineProductSummaryInfoImageView = appCompatImageView3;
        this.onlineRegisterAdditionalImageInfoCardView = cardView3;
        this.onlineRegisterAdditionalInfoHeaderLayout = constraintLayout7;
        this.onlineRegisterCommissionInfoHeaderLayout = constraintLayout8;
        this.onlineRegisterInfoHeaderLayout = constraintLayout9;
        this.onlineRegisterInfoHeaderTextView = oneFontTextView29;
        this.onlineRegisterProductInfoHeaderLayout = constraintLayout10;
        this.onlineRegisterRetailerInfoHeaderLayout = constraintLayout11;
        this.onlineRegisterSummaryAddressInfoCardView = cardView4;
        this.onlineRegisterSummaryAddressInfoImageView = appCompatImageView4;
        this.onlineRegisterSummaryCommissionInfoCardView = cardView5;
        this.onlineRegisterSummaryIdCardInfoCardView = cardView6;
        this.onlineRegisterSummaryInfoImageView = appCompatImageView5;
        this.onlineRegisterSummaryPersonalInfoCardView = cardView7;
        this.onlineRegisterSummaryProductInfoCardView = cardView8;
        this.onlineRegisterSummaryRetailerInfoCardView = cardView9;
        this.onlineRegistrationSummaryMainLayout = constraintLayout12;
        this.onlineRetailerCommissionInfoImageView = appCompatImageView6;
        this.onlineRetailerSummaryInfoImageView = appCompatImageView7;
        this.phoneNumberTextView = oneFontTextView30;
        this.phoneNumberTitleTextView = oneFontTextView31;
        this.productInfoHeaderTextView = oneFontTextView32;
        this.productSimNameTextView = oneFontTextView33;
        this.productSimNameTitleTextView = oneFontTextView34;
        this.productSimNameTopUpTextView = oneFontTextView35;
        this.productSimNameTopUpTitleTextView = oneFontTextView36;
        this.retailerAddressEditText = dtacEditText;
        this.retailerAddressTextInputLayoutText = textInputLayout;
        this.retailerContactInfoHeaderTextView = oneFontTextView37;
        this.retailerDocumentAddressEditText = dtacEditText2;
        this.retailerDocumentAddressTextInputLayoutText = textInputLayout2;
        this.retailerDocumentTaxProductAddressEditText = dtacEditText3;
        this.retailerDocumentTaxProductAddressTextInputLayoutText = textInputLayout3;
        this.retailerHeaderTypeLayout = includeOneTypeRetailerBinding;
        this.retailerInfoHeaderTextView = oneFontTextView38;
        this.retailerNameTextView = oneFontTextView39;
        this.retailerNameTitleTextView = oneFontTextView40;
        this.retailerTaxAddressEditText = dtacEditText4;
        this.retailerTaxAddressTextInputLayoutText = textInputLayout4;
        this.trueOnlineLayout = constraintLayout13;
        this.trueOnlinePhoneImageView = imageView4;
        this.trueOnlinePhoneNumberTextView = oneFontTextView41;
        this.trueOnlinePhoneTitleTextView = oneFontTextView42;
    }

    @NonNull
    public static FragmentOneOnlineRegistrationSummaryBinding bind(@NonNull View view) {
        View findChildViewById;
        View findChildViewById2;
        View findChildViewById3;
        View findChildViewById4;
        View findChildViewById5;
        int i = R.id.AddressInfoHeaderTextView;
        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
        if (oneFontTextView != null) {
            i = R.id.additionalImageRecyclerView;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = R.id.additionalInfoHeaderLayout;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout != null) {
                    i = R.id.additionalInfoHeaderTextView;
                    OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView2 != null) {
                        i = R.id.additionalInfoImageView;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                        if (appCompatImageView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.backgroundView))) != null) {
                            i = R.id.bankInfoLayout;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                            if (constraintLayout2 != null) {
                                i = R.id.bookBankLayout;
                                ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                if (constraintLayout3 != null) {
                                    i = R.id.businessTypeTextView;
                                    OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (oneFontTextView3 != null) {
                                        i = R.id.businessTypeTitleTextView;
                                        OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (oneFontTextView4 != null) {
                                            i = R.id.commissionBankAccountNameTextView;
                                            OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (oneFontTextView5 != null) {
                                                i = R.id.commissionBankAccountNameTitleTextView;
                                                OneFontTextView oneFontTextView6 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (oneFontTextView6 != null) {
                                                    i = R.id.commissionBankAccountNumberTextView;
                                                    OneFontTextView oneFontTextView7 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (oneFontTextView7 != null) {
                                                        i = R.id.commissionBankAccountNumberTitleTextView;
                                                        OneFontTextView oneFontTextView8 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (oneFontTextView8 != null) {
                                                            i = R.id.commissionBankBranchTextView;
                                                            OneFontTextView oneFontTextView9 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                            if (oneFontTextView9 != null) {
                                                                i = R.id.commissionBankBranchTitleTextView;
                                                                OneFontTextView oneFontTextView10 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                if (oneFontTextView10 != null) {
                                                                    i = R.id.commissionBankNameTextView;
                                                                    OneFontTextView oneFontTextView11 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (oneFontTextView11 != null) {
                                                                        i = R.id.commissionBankNameTitleTextView;
                                                                        OneFontTextView oneFontTextView12 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (oneFontTextView12 != null) {
                                                                            i = R.id.commissionBookBankImageCardView;
                                                                            CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
                                                                            if (cardView != null) {
                                                                                i = R.id.commissionBookBankImageView;
                                                                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                                if (imageView != null) {
                                                                                    i = R.id.commissionBookBankTitleTextView;
                                                                                    OneFontTextView oneFontTextView13 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (oneFontTextView13 != null) {
                                                                                        i = R.id.commissionInfoHeaderTextView;
                                                                                        OneFontTextView oneFontTextView14 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (oneFontTextView14 != null) {
                                                                                            i = R.id.commissionMethodTitleTextView;
                                                                                            OneFontTextView oneFontTextView15 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                            if (oneFontTextView15 != null) {
                                                                                                i = R.id.commissionTextView;
                                                                                                OneFontTextView oneFontTextView16 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                if (oneFontTextView16 != null) {
                                                                                                    i = R.id.confirmButton;
                                                                                                    OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
                                                                                                    if (oneFontButton != null) {
                                                                                                        i = R.id.dateOfBirthTextView;
                                                                                                        OneFontTextView oneFontTextView17 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                        if (oneFontTextView17 != null) {
                                                                                                            i = R.id.dateOfBirthTitleTextView;
                                                                                                            OneFontTextView oneFontTextView18 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                            if (oneFontTextView18 != null) {
                                                                                                                i = R.id.dtacOnlineLayout;
                                                                                                                ConstraintLayout constraintLayout4 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                if (constraintLayout4 != null) {
                                                                                                                    i = R.id.dtacOnlinePhoneImageView;
                                                                                                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                                                                    if (imageView2 != null) {
                                                                                                                        i = R.id.dtacOnlinePhoneNumberTextView;
                                                                                                                        OneFontTextView oneFontTextView19 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                        if (oneFontTextView19 != null) {
                                                                                                                            i = R.id.dtacOnlinePhoneTitleTextView;
                                                                                                                            OneFontTextView oneFontTextView20 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                            if (oneFontTextView20 != null) {
                                                                                                                                i = R.id.emailTextView;
                                                                                                                                OneFontTextView oneFontTextView21 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                if (oneFontTextView21 != null) {
                                                                                                                                    i = R.id.emailTitleTextView;
                                                                                                                                    OneFontTextView oneFontTextView22 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                    if (oneFontTextView22 != null) {
                                                                                                                                        i = R.id.firstNameTextView;
                                                                                                                                        OneFontTextView oneFontTextView23 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                        if (oneFontTextView23 != null) {
                                                                                                                                            i = R.id.firstNameTitleTextView;
                                                                                                                                            OneFontTextView oneFontTextView24 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                            if (oneFontTextView24 != null) {
                                                                                                                                                i = R.id.idCardImageCardView;
                                                                                                                                                CardView cardView2 = (CardView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                if (cardView2 != null) {
                                                                                                                                                    i = R.id.idCardImageInfoHeaderLayout;
                                                                                                                                                    ConstraintLayout constraintLayout5 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                                                    if (constraintLayout5 != null) {
                                                                                                                                                        i = R.id.idCardImageView;
                                                                                                                                                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                        if (imageView3 != null) {
                                                                                                                                                            i = R.id.idCardInfoImageView;
                                                                                                                                                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                            if (appCompatImageView2 != null) {
                                                                                                                                                                i = R.id.idCardTextView;
                                                                                                                                                                OneFontTextView oneFontTextView25 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                if (oneFontTextView25 != null) {
                                                                                                                                                                    i = R.id.idCardTitleTextView;
                                                                                                                                                                    OneFontTextView oneFontTextView26 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                    if (oneFontTextView26 != null) {
                                                                                                                                                                        i = R.id.lastNameTextView;
                                                                                                                                                                        OneFontTextView oneFontTextView27 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                        if (oneFontTextView27 != null) {
                                                                                                                                                                            i = R.id.lastNameTitleTextView;
                                                                                                                                                                            OneFontTextView oneFontTextView28 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                            if (oneFontTextView28 != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.lineView1))) != null && (findChildViewById3 = ViewBindings.findChildViewById(view, (i = R.id.lineView2))) != null && (findChildViewById4 = ViewBindings.findChildViewById(view, (i = R.id.lineView3))) != null) {
                                                                                                                                                                                i = R.id.onlineProductSummaryInfoImageView;
                                                                                                                                                                                AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                if (appCompatImageView3 != null) {
                                                                                                                                                                                    i = R.id.onlineRegisterAdditionalImageInfoCardView;
                                                                                                                                                                                    CardView cardView3 = (CardView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                    if (cardView3 != null) {
                                                                                                                                                                                        i = R.id.onlineRegisterAdditionalInfoHeaderLayout;
                                                                                                                                                                                        ConstraintLayout constraintLayout6 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                        if (constraintLayout6 != null) {
                                                                                                                                                                                            i = R.id.onlineRegisterCommissionInfoHeaderLayout;
                                                                                                                                                                                            ConstraintLayout constraintLayout7 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                            if (constraintLayout7 != null) {
                                                                                                                                                                                                i = R.id.onlineRegisterInfoHeaderLayout;
                                                                                                                                                                                                ConstraintLayout constraintLayout8 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                if (constraintLayout8 != null) {
                                                                                                                                                                                                    i = R.id.onlineRegisterInfoHeaderTextView;
                                                                                                                                                                                                    OneFontTextView oneFontTextView29 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                    if (oneFontTextView29 != null) {
                                                                                                                                                                                                        i = R.id.onlineRegisterProductInfoHeaderLayout;
                                                                                                                                                                                                        ConstraintLayout constraintLayout9 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                        if (constraintLayout9 != null) {
                                                                                                                                                                                                            i = R.id.onlineRegisterRetailerInfoHeaderLayout;
                                                                                                                                                                                                            ConstraintLayout constraintLayout10 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                            if (constraintLayout10 != null) {
                                                                                                                                                                                                                i = R.id.onlineRegisterSummaryAddressInfoCardView;
                                                                                                                                                                                                                CardView cardView4 = (CardView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                if (cardView4 != null) {
                                                                                                                                                                                                                    i = R.id.onlineRegisterSummaryAddressInfoImageView;
                                                                                                                                                                                                                    AppCompatImageView appCompatImageView4 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                    if (appCompatImageView4 != null) {
                                                                                                                                                                                                                        i = R.id.onlineRegisterSummaryCommissionInfoCardView;
                                                                                                                                                                                                                        CardView cardView5 = (CardView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                        if (cardView5 != null) {
                                                                                                                                                                                                                            i = R.id.onlineRegisterSummaryIdCardInfoCardView;
                                                                                                                                                                                                                            CardView cardView6 = (CardView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                            if (cardView6 != null) {
                                                                                                                                                                                                                                i = R.id.onlineRegisterSummaryInfoImageView;
                                                                                                                                                                                                                                AppCompatImageView appCompatImageView5 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                if (appCompatImageView5 != null) {
                                                                                                                                                                                                                                    i = R.id.onlineRegisterSummaryPersonalInfoCardView;
                                                                                                                                                                                                                                    CardView cardView7 = (CardView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                    if (cardView7 != null) {
                                                                                                                                                                                                                                        i = R.id.onlineRegisterSummaryProductInfoCardView;
                                                                                                                                                                                                                                        CardView cardView8 = (CardView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                        if (cardView8 != null) {
                                                                                                                                                                                                                                            i = R.id.onlineRegisterSummaryRetailerInfoCardView;
                                                                                                                                                                                                                                            CardView cardView9 = (CardView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                            if (cardView9 != null) {
                                                                                                                                                                                                                                                i = R.id.onlineRegistrationSummaryMainLayout;
                                                                                                                                                                                                                                                ConstraintLayout constraintLayout11 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                                if (constraintLayout11 != null) {
                                                                                                                                                                                                                                                    i = R.id.onlineRetailerCommissionInfoImageView;
                                                                                                                                                                                                                                                    AppCompatImageView appCompatImageView6 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                                    if (appCompatImageView6 != null) {
                                                                                                                                                                                                                                                        i = R.id.onlineRetailerSummaryInfoImageView;
                                                                                                                                                                                                                                                        AppCompatImageView appCompatImageView7 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                                        if (appCompatImageView7 != null) {
                                                                                                                                                                                                                                                            i = R.id.phoneNumberTextView;
                                                                                                                                                                                                                                                            OneFontTextView oneFontTextView30 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                                            if (oneFontTextView30 != null) {
                                                                                                                                                                                                                                                                i = R.id.phoneNumberTitleTextView;
                                                                                                                                                                                                                                                                OneFontTextView oneFontTextView31 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                                                if (oneFontTextView31 != null) {
                                                                                                                                                                                                                                                                    i = R.id.productInfoHeaderTextView;
                                                                                                                                                                                                                                                                    OneFontTextView oneFontTextView32 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                                                    if (oneFontTextView32 != null) {
                                                                                                                                                                                                                                                                        i = R.id.productSimNameTextView;
                                                                                                                                                                                                                                                                        OneFontTextView oneFontTextView33 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                                                        if (oneFontTextView33 != null) {
                                                                                                                                                                                                                                                                            i = R.id.productSimNameTitleTextView;
                                                                                                                                                                                                                                                                            OneFontTextView oneFontTextView34 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                                                            if (oneFontTextView34 != null) {
                                                                                                                                                                                                                                                                                i = R.id.productSimNameTopUpTextView;
                                                                                                                                                                                                                                                                                OneFontTextView oneFontTextView35 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                                                                if (oneFontTextView35 != null) {
                                                                                                                                                                                                                                                                                    i = R.id.productSimNameTopUpTitleTextView;
                                                                                                                                                                                                                                                                                    OneFontTextView oneFontTextView36 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                                                                    if (oneFontTextView36 != null) {
                                                                                                                                                                                                                                                                                        i = R.id.retailerAddressEditText;
                                                                                                                                                                                                                                                                                        DtacEditText dtacEditText = (DtacEditText) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                                                                        if (dtacEditText != null) {
                                                                                                                                                                                                                                                                                            i = R.id.retailerAddressTextInputLayoutText;
                                                                                                                                                                                                                                                                                            TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                                                                            if (textInputLayout != null) {
                                                                                                                                                                                                                                                                                                i = R.id.retailerContactInfoHeaderTextView;
                                                                                                                                                                                                                                                                                                OneFontTextView oneFontTextView37 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                                                                                if (oneFontTextView37 != null) {
                                                                                                                                                                                                                                                                                                    i = R.id.retailerDocumentAddressEditText;
                                                                                                                                                                                                                                                                                                    DtacEditText dtacEditText2 = (DtacEditText) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                                                                                    if (dtacEditText2 != null) {
                                                                                                                                                                                                                                                                                                        i = R.id.retailerDocumentAddressTextInputLayoutText;
                                                                                                                                                                                                                                                                                                        TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                                                                                        if (textInputLayout2 != null) {
                                                                                                                                                                                                                                                                                                            i = R.id.retailerDocumentTaxProductAddressEditText;
                                                                                                                                                                                                                                                                                                            DtacEditText dtacEditText3 = (DtacEditText) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                                                                                            if (dtacEditText3 != null) {
                                                                                                                                                                                                                                                                                                                i = R.id.retailerDocumentTaxProductAddressTextInputLayoutText;
                                                                                                                                                                                                                                                                                                                TextInputLayout textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                                                                                                if (textInputLayout3 != null && (findChildViewById5 = ViewBindings.findChildViewById(view, (i = R.id.retailerHeaderTypeLayout))) != null) {
                                                                                                                                                                                                                                                                                                                    IncludeOneTypeRetailerBinding bind = IncludeOneTypeRetailerBinding.bind(findChildViewById5);
                                                                                                                                                                                                                                                                                                                    i = R.id.retailerInfoHeaderTextView;
                                                                                                                                                                                                                                                                                                                    OneFontTextView oneFontTextView38 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                                                                                                    if (oneFontTextView38 != null) {
                                                                                                                                                                                                                                                                                                                        i = R.id.retailerNameTextView;
                                                                                                                                                                                                                                                                                                                        OneFontTextView oneFontTextView39 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                                                                                                        if (oneFontTextView39 != null) {
                                                                                                                                                                                                                                                                                                                            i = R.id.retailerNameTitleTextView;
                                                                                                                                                                                                                                                                                                                            OneFontTextView oneFontTextView40 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                                                                                                            if (oneFontTextView40 != null) {
                                                                                                                                                                                                                                                                                                                                i = R.id.retailerTaxAddressEditText;
                                                                                                                                                                                                                                                                                                                                DtacEditText dtacEditText4 = (DtacEditText) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                                                                                                                if (dtacEditText4 != null) {
                                                                                                                                                                                                                                                                                                                                    i = R.id.retailerTaxAddressTextInputLayoutText;
                                                                                                                                                                                                                                                                                                                                    TextInputLayout textInputLayout4 = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                                                                                                                    if (textInputLayout4 != null) {
                                                                                                                                                                                                                                                                                                                                        i = R.id.trueOnlineLayout;
                                                                                                                                                                                                                                                                                                                                        ConstraintLayout constraintLayout12 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                                                                                                                        if (constraintLayout12 != null) {
                                                                                                                                                                                                                                                                                                                                            i = R.id.trueOnlinePhoneImageView;
                                                                                                                                                                                                                                                                                                                                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                                                                                                                            if (imageView4 != null) {
                                                                                                                                                                                                                                                                                                                                                i = R.id.trueOnlinePhoneNumberTextView;
                                                                                                                                                                                                                                                                                                                                                OneFontTextView oneFontTextView41 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                                                                                                                                if (oneFontTextView41 != null) {
                                                                                                                                                                                                                                                                                                                                                    i = R.id.trueOnlinePhoneTitleTextView;
                                                                                                                                                                                                                                                                                                                                                    OneFontTextView oneFontTextView42 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                                                                                                                                    if (oneFontTextView42 != null) {
                                                                                                                                                                                                                                                                                                                                                        return new FragmentOneOnlineRegistrationSummaryBinding((ConstraintLayout) view, oneFontTextView, recyclerView, constraintLayout, oneFontTextView2, appCompatImageView, findChildViewById, constraintLayout2, constraintLayout3, oneFontTextView3, oneFontTextView4, oneFontTextView5, oneFontTextView6, oneFontTextView7, oneFontTextView8, oneFontTextView9, oneFontTextView10, oneFontTextView11, oneFontTextView12, cardView, imageView, oneFontTextView13, oneFontTextView14, oneFontTextView15, oneFontTextView16, oneFontButton, oneFontTextView17, oneFontTextView18, constraintLayout4, imageView2, oneFontTextView19, oneFontTextView20, oneFontTextView21, oneFontTextView22, oneFontTextView23, oneFontTextView24, cardView2, constraintLayout5, imageView3, appCompatImageView2, oneFontTextView25, oneFontTextView26, oneFontTextView27, oneFontTextView28, findChildViewById2, findChildViewById3, findChildViewById4, appCompatImageView3, cardView3, constraintLayout6, constraintLayout7, constraintLayout8, oneFontTextView29, constraintLayout9, constraintLayout10, cardView4, appCompatImageView4, cardView5, cardView6, appCompatImageView5, cardView7, cardView8, cardView9, constraintLayout11, appCompatImageView6, appCompatImageView7, oneFontTextView30, oneFontTextView31, oneFontTextView32, oneFontTextView33, oneFontTextView34, oneFontTextView35, oneFontTextView36, dtacEditText, textInputLayout, oneFontTextView37, dtacEditText2, textInputLayout2, dtacEditText3, textInputLayout3, bind, oneFontTextView38, oneFontTextView39, oneFontTextView40, dtacEditText4, textInputLayout4, constraintLayout12, imageView4, oneFontTextView41, oneFontTextView42);
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
    public static FragmentOneOnlineRegistrationSummaryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneOnlineRegistrationSummaryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_online_registration_summary, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84109a;
    }
}