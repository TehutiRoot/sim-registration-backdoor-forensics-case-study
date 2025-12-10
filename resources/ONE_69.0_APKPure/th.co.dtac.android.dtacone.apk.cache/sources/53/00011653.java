package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputLayout;
import com.makeramen.roundedimageview.RoundedImageView;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneCustomClearableEditText;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.app_one.widget.OneRadioButton;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneOnlineRegistrationCommissionInfoBinding */
/* loaded from: classes7.dex */
public final class FragmentOneOnlineRegistrationCommissionInfoBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84098a;
    @NonNull
    public final OneFontButton btnNext;
    @NonNull
    public final OneCustomClearableEditText etBankAccountBranch;
    @NonNull
    public final OneCustomClearableEditText etBankAccountName;
    @NonNull
    public final OneCustomClearableEditText etBankAccountNumber;
    @NonNull
    public final RoundedImageView ivBankAccountPhoto;
    @NonNull
    public final ImageView ivIconPhoto;
    @NonNull
    public final ImageView ivPhotoIdCardLabel;
    @NonNull
    public final ConstraintLayout layoutBankAccountPhoto;
    @NonNull
    public final ConstraintLayout layoutBankAccountPhotoBlank;
    @NonNull
    public final LinearLayoutCompat layoutComToBankDetail;
    @NonNull
    public final LinearLayoutCompat layoutTypeRetailer;
    @NonNull
    public final AppCompatImageView onlineRegisterRetakeImageView;
    @NonNull
    public final OneFontTextView onlineRegisterRetakeTextView;
    @NonNull
    public final OneRadioButton rbGetReturn;
    @NonNull
    public final RadioGroup rbGroupReturn;
    @NonNull
    public final OneRadioButton rbNotGetReturn;
    @NonNull
    public final RecyclerView rvBank;
    @NonNull
    public final OneFontTextView tvAdditionalImageTitle;
    @NonNull
    public final TextInputLayout tvBankAccountBranchTitle;
    @NonNull
    public final TextInputLayout tvBankAccountNameTitle;
    @NonNull
    public final TextInputLayout tvBankAccountNumberTitle;
    @NonNull
    public final OneFontTextView tvBankAccountPhotoTitle;
    @NonNull
    public final OneFontTextView tvSelectBankTitle;
    @NonNull
    public final View vBackground;
    @NonNull
    public final View vLineSeparateBankAccountBranch;
    @NonNull
    public final View vLineSeparateBankAccountName;
    @NonNull
    public final View vLineSeparateBankAccountNumber;
    @NonNull
    public final View vLineSeparateSelectBank;
    @NonNull
    public final View vLineSeparateradioToBankDetail;

    public FragmentOneOnlineRegistrationCommissionInfoBinding(ConstraintLayout constraintLayout, OneFontButton oneFontButton, OneCustomClearableEditText oneCustomClearableEditText, OneCustomClearableEditText oneCustomClearableEditText2, OneCustomClearableEditText oneCustomClearableEditText3, RoundedImageView roundedImageView, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2, AppCompatImageView appCompatImageView, OneFontTextView oneFontTextView, OneRadioButton oneRadioButton, RadioGroup radioGroup, OneRadioButton oneRadioButton2, RecyclerView recyclerView, OneFontTextView oneFontTextView2, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, View view, View view2, View view3, View view4, View view5, View view6) {
        this.f84098a = constraintLayout;
        this.btnNext = oneFontButton;
        this.etBankAccountBranch = oneCustomClearableEditText;
        this.etBankAccountName = oneCustomClearableEditText2;
        this.etBankAccountNumber = oneCustomClearableEditText3;
        this.ivBankAccountPhoto = roundedImageView;
        this.ivIconPhoto = imageView;
        this.ivPhotoIdCardLabel = imageView2;
        this.layoutBankAccountPhoto = constraintLayout2;
        this.layoutBankAccountPhotoBlank = constraintLayout3;
        this.layoutComToBankDetail = linearLayoutCompat;
        this.layoutTypeRetailer = linearLayoutCompat2;
        this.onlineRegisterRetakeImageView = appCompatImageView;
        this.onlineRegisterRetakeTextView = oneFontTextView;
        this.rbGetReturn = oneRadioButton;
        this.rbGroupReturn = radioGroup;
        this.rbNotGetReturn = oneRadioButton2;
        this.rvBank = recyclerView;
        this.tvAdditionalImageTitle = oneFontTextView2;
        this.tvBankAccountBranchTitle = textInputLayout;
        this.tvBankAccountNameTitle = textInputLayout2;
        this.tvBankAccountNumberTitle = textInputLayout3;
        this.tvBankAccountPhotoTitle = oneFontTextView3;
        this.tvSelectBankTitle = oneFontTextView4;
        this.vBackground = view;
        this.vLineSeparateBankAccountBranch = view2;
        this.vLineSeparateBankAccountName = view3;
        this.vLineSeparateBankAccountNumber = view4;
        this.vLineSeparateSelectBank = view5;
        this.vLineSeparateradioToBankDetail = view6;
    }

    @NonNull
    public static FragmentOneOnlineRegistrationCommissionInfoBinding bind(@NonNull View view) {
        View findChildViewById;
        View findChildViewById2;
        View findChildViewById3;
        View findChildViewById4;
        View findChildViewById5;
        View findChildViewById6;
        int i = R.id.btnNext;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.etBankAccountBranch;
            OneCustomClearableEditText oneCustomClearableEditText = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
            if (oneCustomClearableEditText != null) {
                i = R.id.etBankAccountName;
                OneCustomClearableEditText oneCustomClearableEditText2 = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
                if (oneCustomClearableEditText2 != null) {
                    i = R.id.etBankAccountNumber;
                    OneCustomClearableEditText oneCustomClearableEditText3 = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
                    if (oneCustomClearableEditText3 != null) {
                        i = R.id.ivBankAccountPhoto;
                        RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(view, i);
                        if (roundedImageView != null) {
                            i = R.id.ivIconPhoto;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView != null) {
                                i = R.id.ivPhotoIdCardLabel;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView2 != null) {
                                    i = R.id.layoutBankAccountPhoto;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                    if (constraintLayout != null) {
                                        i = R.id.layoutBankAccountPhotoBlank;
                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                        if (constraintLayout2 != null) {
                                            i = R.id.layoutComToBankDetail;
                                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                            if (linearLayoutCompat != null) {
                                                i = R.id.layoutTypeRetailer;
                                                LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                                if (linearLayoutCompat2 != null) {
                                                    i = R.id.onlineRegisterRetakeImageView;
                                                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                                    if (appCompatImageView != null) {
                                                        i = R.id.onlineRegisterRetakeTextView;
                                                        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (oneFontTextView != null) {
                                                            i = R.id.rbGetReturn;
                                                            OneRadioButton oneRadioButton = (OneRadioButton) ViewBindings.findChildViewById(view, i);
                                                            if (oneRadioButton != null) {
                                                                i = R.id.rbGroupReturn;
                                                                RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, i);
                                                                if (radioGroup != null) {
                                                                    i = R.id.rbNotGetReturn;
                                                                    OneRadioButton oneRadioButton2 = (OneRadioButton) ViewBindings.findChildViewById(view, i);
                                                                    if (oneRadioButton2 != null) {
                                                                        i = R.id.rvBank;
                                                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                                        if (recyclerView != null) {
                                                                            i = R.id.tvAdditionalImageTitle;
                                                                            OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (oneFontTextView2 != null) {
                                                                                i = R.id.tvBankAccountBranchTitle;
                                                                                TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                                                                                if (textInputLayout != null) {
                                                                                    i = R.id.tvBankAccountNameTitle;
                                                                                    TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                                                                                    if (textInputLayout2 != null) {
                                                                                        i = R.id.tvBankAccountNumberTitle;
                                                                                        TextInputLayout textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                                                                                        if (textInputLayout3 != null) {
                                                                                            i = R.id.tvBankAccountPhotoTitle;
                                                                                            OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                            if (oneFontTextView3 != null) {
                                                                                                i = R.id.tvSelectBankTitle;
                                                                                                OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                if (oneFontTextView4 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.vBackground))) != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.vLineSeparateBankAccountBranch))) != null && (findChildViewById3 = ViewBindings.findChildViewById(view, (i = R.id.vLineSeparateBankAccountName))) != null && (findChildViewById4 = ViewBindings.findChildViewById(view, (i = R.id.vLineSeparateBankAccountNumber))) != null && (findChildViewById5 = ViewBindings.findChildViewById(view, (i = R.id.vLineSeparateSelectBank))) != null && (findChildViewById6 = ViewBindings.findChildViewById(view, (i = R.id.vLineSeparateradioToBankDetail))) != null) {
                                                                                                    return new FragmentOneOnlineRegistrationCommissionInfoBinding((ConstraintLayout) view, oneFontButton, oneCustomClearableEditText, oneCustomClearableEditText2, oneCustomClearableEditText3, roundedImageView, imageView, imageView2, constraintLayout, constraintLayout2, linearLayoutCompat, linearLayoutCompat2, appCompatImageView, oneFontTextView, oneRadioButton, radioGroup, oneRadioButton2, recyclerView, oneFontTextView2, textInputLayout, textInputLayout2, textInputLayout3, oneFontTextView3, oneFontTextView4, findChildViewById, findChildViewById2, findChildViewById3, findChildViewById4, findChildViewById5, findChildViewById6);
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
    public static FragmentOneOnlineRegistrationCommissionInfoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneOnlineRegistrationCommissionInfoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_online_registration_commission_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84098a;
    }
}