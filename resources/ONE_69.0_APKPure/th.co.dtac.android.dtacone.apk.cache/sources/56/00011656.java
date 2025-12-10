package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneEditText;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextInputLayout;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneOnlineRegistrationInputNumberBinding */
/* loaded from: classes7.dex */
public final class FragmentOneOnlineRegistrationInputNumberBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84101a;
    @NonNull
    public final View backgroundView;
    @NonNull
    public final ImageView clearPhoneNumberImageView;
    @NonNull
    public final ImageView clearSaleCodeImageView;
    @NonNull
    public final CardView inputFiledCardView;
    @NonNull
    public final RelativeLayout layoutInputInfo;
    @NonNull
    public final OneFontButton nextButton;
    @NonNull
    public final ConstraintLayout onlineRegistrationInputNumberMainLayout;
    @NonNull
    public final OneEditText phoneEditText;
    @NonNull
    public final OneTextInputLayout phoneTextInputLayout;
    @NonNull
    public final IncludeOneTypeRetailerBinding retailerHeaderTypeLayout;
    @NonNull
    public final OneEditText saleCodeEditText;
    @NonNull
    public final OneTextInputLayout saleCodeTextInputLayout;

    public FragmentOneOnlineRegistrationInputNumberBinding(ConstraintLayout constraintLayout, View view, ImageView imageView, ImageView imageView2, CardView cardView, RelativeLayout relativeLayout, OneFontButton oneFontButton, ConstraintLayout constraintLayout2, OneEditText oneEditText, OneTextInputLayout oneTextInputLayout, IncludeOneTypeRetailerBinding includeOneTypeRetailerBinding, OneEditText oneEditText2, OneTextInputLayout oneTextInputLayout2) {
        this.f84101a = constraintLayout;
        this.backgroundView = view;
        this.clearPhoneNumberImageView = imageView;
        this.clearSaleCodeImageView = imageView2;
        this.inputFiledCardView = cardView;
        this.layoutInputInfo = relativeLayout;
        this.nextButton = oneFontButton;
        this.onlineRegistrationInputNumberMainLayout = constraintLayout2;
        this.phoneEditText = oneEditText;
        this.phoneTextInputLayout = oneTextInputLayout;
        this.retailerHeaderTypeLayout = includeOneTypeRetailerBinding;
        this.saleCodeEditText = oneEditText2;
        this.saleCodeTextInputLayout = oneTextInputLayout2;
    }

    @NonNull
    public static FragmentOneOnlineRegistrationInputNumberBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.backgroundView;
        View findChildViewById2 = ViewBindings.findChildViewById(view, i);
        if (findChildViewById2 != null) {
            i = R.id.clearPhoneNumberImageView;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.clearSaleCodeImageView;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    i = R.id.inputFiledCardView;
                    CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
                    if (cardView != null) {
                        i = R.id.layoutInputInfo;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                        if (relativeLayout != null) {
                            i = R.id.nextButton;
                            OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
                            if (oneFontButton != null) {
                                i = R.id.onlineRegistrationInputNumberMainLayout;
                                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                if (constraintLayout != null) {
                                    i = R.id.phoneEditText;
                                    OneEditText oneEditText = (OneEditText) ViewBindings.findChildViewById(view, i);
                                    if (oneEditText != null) {
                                        i = R.id.phoneTextInputLayout;
                                        OneTextInputLayout oneTextInputLayout = (OneTextInputLayout) ViewBindings.findChildViewById(view, i);
                                        if (oneTextInputLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.retailerHeaderTypeLayout))) != null) {
                                            IncludeOneTypeRetailerBinding bind = IncludeOneTypeRetailerBinding.bind(findChildViewById);
                                            i = R.id.saleCodeEditText;
                                            OneEditText oneEditText2 = (OneEditText) ViewBindings.findChildViewById(view, i);
                                            if (oneEditText2 != null) {
                                                i = R.id.saleCodeTextInputLayout;
                                                OneTextInputLayout oneTextInputLayout2 = (OneTextInputLayout) ViewBindings.findChildViewById(view, i);
                                                if (oneTextInputLayout2 != null) {
                                                    return new FragmentOneOnlineRegistrationInputNumberBinding((ConstraintLayout) view, findChildViewById2, imageView, imageView2, cardView, relativeLayout, oneFontButton, constraintLayout, oneEditText, oneTextInputLayout, bind, oneEditText2, oneTextInputLayout2);
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
    public static FragmentOneOnlineRegistrationInputNumberBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneOnlineRegistrationInputNumberBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_online_registration_input_number, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84101a;
    }
}