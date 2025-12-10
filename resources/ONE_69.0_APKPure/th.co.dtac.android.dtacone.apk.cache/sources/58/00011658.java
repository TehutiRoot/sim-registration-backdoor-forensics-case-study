package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneEditText;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextInputLayout;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutIDCard;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutPhone;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutText;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneOnlineRegistrationPersonalInfoBinding */
/* loaded from: classes7.dex */
public final class FragmentOneOnlineRegistrationPersonalInfoBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84103a;
    @NonNull
    public final View backgroundView;
    @NonNull
    public final ImageView calendarImageView;
    @NonNull
    public final View calendarView;
    @NonNull
    public final ImageView clearFirstNameImageView;
    @NonNull
    public final ImageView clearLastNameImageView;
    @NonNull
    public final OneEditText dateOfBirthEditText;
    @NonNull
    public final RelativeLayout dateOfBirthInputLayout;
    @NonNull
    public final OneTextInputLayout dateOfBirthTextInputLayout;
    @NonNull
    public final OneTextInputLayoutText emailTextInputLayoutText;
    @NonNull
    public final OneEditText firstNameEditText;
    @NonNull
    public final RelativeLayout firstNameInputLayout;
    @NonNull
    public final OneTextInputLayout firstNameTextInputLayout;
    @NonNull
    public final OneTextInputLayoutIDCard idCardNumberTextInputLayoutText;
    @NonNull
    public final OneEditText lastNameEditText;
    @NonNull
    public final RelativeLayout lastNameInputLayout;
    @NonNull
    public final OneTextInputLayout lastNameTextInputLayout;
    @NonNull
    public final View lineView1;
    @NonNull
    public final View lineView2;
    @NonNull
    public final View lineView3;
    @NonNull
    public final View lineView4;
    @NonNull
    public final View lineView5;
    @NonNull
    public final OneFontButton nextButton;
    @NonNull
    public final ImageView ocrImageView;
    @NonNull
    public final ConstraintLayout onlineRegisterAdditionalInfoHeaderLayout;
    @NonNull
    public final AppCompatImageView onlineRegisterAdditionalInfoImageView;
    @NonNull
    public final CardView onlineRegisterPersonalInfoCardView;
    @NonNull
    public final ConstraintLayout onlineRegistrationInputNumberMainLayout;
    @NonNull
    public final OneTextInputLayoutPhone phoneNumberTextInputLayout;
    @NonNull
    public final OneFontTextView retailerContactInfoHeaderTextView;
    @NonNull
    public final IncludeOneTypeRetailerBinding retailerHeaderTypeLayout;

    public FragmentOneOnlineRegistrationPersonalInfoBinding(ConstraintLayout constraintLayout, View view, ImageView imageView, View view2, ImageView imageView2, ImageView imageView3, OneEditText oneEditText, RelativeLayout relativeLayout, OneTextInputLayout oneTextInputLayout, OneTextInputLayoutText oneTextInputLayoutText, OneEditText oneEditText2, RelativeLayout relativeLayout2, OneTextInputLayout oneTextInputLayout2, OneTextInputLayoutIDCard oneTextInputLayoutIDCard, OneEditText oneEditText3, RelativeLayout relativeLayout3, OneTextInputLayout oneTextInputLayout3, View view3, View view4, View view5, View view6, View view7, OneFontButton oneFontButton, ImageView imageView4, ConstraintLayout constraintLayout2, AppCompatImageView appCompatImageView, CardView cardView, ConstraintLayout constraintLayout3, OneTextInputLayoutPhone oneTextInputLayoutPhone, OneFontTextView oneFontTextView, IncludeOneTypeRetailerBinding includeOneTypeRetailerBinding) {
        this.f84103a = constraintLayout;
        this.backgroundView = view;
        this.calendarImageView = imageView;
        this.calendarView = view2;
        this.clearFirstNameImageView = imageView2;
        this.clearLastNameImageView = imageView3;
        this.dateOfBirthEditText = oneEditText;
        this.dateOfBirthInputLayout = relativeLayout;
        this.dateOfBirthTextInputLayout = oneTextInputLayout;
        this.emailTextInputLayoutText = oneTextInputLayoutText;
        this.firstNameEditText = oneEditText2;
        this.firstNameInputLayout = relativeLayout2;
        this.firstNameTextInputLayout = oneTextInputLayout2;
        this.idCardNumberTextInputLayoutText = oneTextInputLayoutIDCard;
        this.lastNameEditText = oneEditText3;
        this.lastNameInputLayout = relativeLayout3;
        this.lastNameTextInputLayout = oneTextInputLayout3;
        this.lineView1 = view3;
        this.lineView2 = view4;
        this.lineView3 = view5;
        this.lineView4 = view6;
        this.lineView5 = view7;
        this.nextButton = oneFontButton;
        this.ocrImageView = imageView4;
        this.onlineRegisterAdditionalInfoHeaderLayout = constraintLayout2;
        this.onlineRegisterAdditionalInfoImageView = appCompatImageView;
        this.onlineRegisterPersonalInfoCardView = cardView;
        this.onlineRegistrationInputNumberMainLayout = constraintLayout3;
        this.phoneNumberTextInputLayout = oneTextInputLayoutPhone;
        this.retailerContactInfoHeaderTextView = oneFontTextView;
        this.retailerHeaderTypeLayout = includeOneTypeRetailerBinding;
    }

    @NonNull
    public static FragmentOneOnlineRegistrationPersonalInfoBinding bind(@NonNull View view) {
        View findChildViewById;
        View findChildViewById2;
        View findChildViewById3;
        View findChildViewById4;
        View findChildViewById5;
        View findChildViewById6;
        View findChildViewById7;
        int i = R.id.backgroundView;
        View findChildViewById8 = ViewBindings.findChildViewById(view, i);
        if (findChildViewById8 != null) {
            i = R.id.calendarImageView;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.calendarView))) != null) {
                i = R.id.clearFirstNameImageView;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    i = R.id.clearLastNameImageView;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView3 != null) {
                        i = R.id.dateOfBirthEditText;
                        OneEditText oneEditText = (OneEditText) ViewBindings.findChildViewById(view, i);
                        if (oneEditText != null) {
                            i = R.id.dateOfBirthInputLayout;
                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                            if (relativeLayout != null) {
                                i = R.id.dateOfBirthTextInputLayout;
                                OneTextInputLayout oneTextInputLayout = (OneTextInputLayout) ViewBindings.findChildViewById(view, i);
                                if (oneTextInputLayout != null) {
                                    i = R.id.emailTextInputLayoutText;
                                    OneTextInputLayoutText oneTextInputLayoutText = (OneTextInputLayoutText) ViewBindings.findChildViewById(view, i);
                                    if (oneTextInputLayoutText != null) {
                                        i = R.id.firstNameEditText;
                                        OneEditText oneEditText2 = (OneEditText) ViewBindings.findChildViewById(view, i);
                                        if (oneEditText2 != null) {
                                            i = R.id.firstNameInputLayout;
                                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                            if (relativeLayout2 != null) {
                                                i = R.id.firstNameTextInputLayout;
                                                OneTextInputLayout oneTextInputLayout2 = (OneTextInputLayout) ViewBindings.findChildViewById(view, i);
                                                if (oneTextInputLayout2 != null) {
                                                    i = R.id.idCardNumberTextInputLayoutText;
                                                    OneTextInputLayoutIDCard oneTextInputLayoutIDCard = (OneTextInputLayoutIDCard) ViewBindings.findChildViewById(view, i);
                                                    if (oneTextInputLayoutIDCard != null) {
                                                        i = R.id.lastNameEditText;
                                                        OneEditText oneEditText3 = (OneEditText) ViewBindings.findChildViewById(view, i);
                                                        if (oneEditText3 != null) {
                                                            i = R.id.lastNameInputLayout;
                                                            RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                                            if (relativeLayout3 != null) {
                                                                i = R.id.lastNameTextInputLayout;
                                                                OneTextInputLayout oneTextInputLayout3 = (OneTextInputLayout) ViewBindings.findChildViewById(view, i);
                                                                if (oneTextInputLayout3 != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.lineView1))) != null && (findChildViewById3 = ViewBindings.findChildViewById(view, (i = R.id.lineView2))) != null && (findChildViewById4 = ViewBindings.findChildViewById(view, (i = R.id.lineView3))) != null && (findChildViewById5 = ViewBindings.findChildViewById(view, (i = R.id.lineView4))) != null && (findChildViewById6 = ViewBindings.findChildViewById(view, (i = R.id.lineView5))) != null) {
                                                                    i = R.id.nextButton;
                                                                    OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
                                                                    if (oneFontButton != null) {
                                                                        i = R.id.ocrImageView;
                                                                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                        if (imageView4 != null) {
                                                                            i = R.id.onlineRegisterAdditionalInfoHeaderLayout;
                                                                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                            if (constraintLayout != null) {
                                                                                i = R.id.onlineRegisterAdditionalInfoImageView;
                                                                                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                                                                if (appCompatImageView != null) {
                                                                                    i = R.id.onlineRegisterPersonalInfoCardView;
                                                                                    CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
                                                                                    if (cardView != null) {
                                                                                        i = R.id.onlineRegistrationInputNumberMainLayout;
                                                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                                        if (constraintLayout2 != null) {
                                                                                            i = R.id.phoneNumberTextInputLayout;
                                                                                            OneTextInputLayoutPhone oneTextInputLayoutPhone = (OneTextInputLayoutPhone) ViewBindings.findChildViewById(view, i);
                                                                                            if (oneTextInputLayoutPhone != null) {
                                                                                                i = R.id.retailerContactInfoHeaderTextView;
                                                                                                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                if (oneFontTextView != null && (findChildViewById7 = ViewBindings.findChildViewById(view, (i = R.id.retailerHeaderTypeLayout))) != null) {
                                                                                                    return new FragmentOneOnlineRegistrationPersonalInfoBinding((ConstraintLayout) view, findChildViewById8, imageView, findChildViewById, imageView2, imageView3, oneEditText, relativeLayout, oneTextInputLayout, oneTextInputLayoutText, oneEditText2, relativeLayout2, oneTextInputLayout2, oneTextInputLayoutIDCard, oneEditText3, relativeLayout3, oneTextInputLayout3, findChildViewById2, findChildViewById3, findChildViewById4, findChildViewById5, findChildViewById6, oneFontButton, imageView4, constraintLayout, appCompatImageView, cardView, constraintLayout2, oneTextInputLayoutPhone, oneFontTextView, IncludeOneTypeRetailerBinding.bind(findChildViewById7));
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
    public static FragmentOneOnlineRegistrationPersonalInfoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneOnlineRegistrationPersonalInfoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_online_registration_personal_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84103a;
    }
}