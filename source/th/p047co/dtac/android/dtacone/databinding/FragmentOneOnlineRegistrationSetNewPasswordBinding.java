package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutPhone;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutText;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneOnlineRegistrationSetNewPasswordBinding */
/* loaded from: classes7.dex */
public final class FragmentOneOnlineRegistrationSetNewPasswordBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84003a;
    @NonNull
    public final OneFontButton confirmSetNewPasswordButton;
    @NonNull
    public final OneTextInputLayoutText confirmSetNewPasswordEditText;
    @NonNull
    public final CardView mainCardView;
    @NonNull
    public final OneFontTextView setNewPasswordConditionTextView;
    @NonNull
    public final OneFontTextView setNewPasswordDescriptionTextView;
    @NonNull
    public final OneTextInputLayoutText setNewPasswordEditText;
    @NonNull
    public final OneTextInputLayoutPhone setNewPasswordPhoneNumberEditText;

    public FragmentOneOnlineRegistrationSetNewPasswordBinding(ConstraintLayout constraintLayout, OneFontButton oneFontButton, OneTextInputLayoutText oneTextInputLayoutText, CardView cardView, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneTextInputLayoutText oneTextInputLayoutText2, OneTextInputLayoutPhone oneTextInputLayoutPhone) {
        this.f84003a = constraintLayout;
        this.confirmSetNewPasswordButton = oneFontButton;
        this.confirmSetNewPasswordEditText = oneTextInputLayoutText;
        this.mainCardView = cardView;
        this.setNewPasswordConditionTextView = oneFontTextView;
        this.setNewPasswordDescriptionTextView = oneFontTextView2;
        this.setNewPasswordEditText = oneTextInputLayoutText2;
        this.setNewPasswordPhoneNumberEditText = oneTextInputLayoutPhone;
    }

    @NonNull
    public static FragmentOneOnlineRegistrationSetNewPasswordBinding bind(@NonNull View view) {
        int i = R.id.confirmSetNewPasswordButton;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.confirmSetNewPasswordEditText;
            OneTextInputLayoutText oneTextInputLayoutText = (OneTextInputLayoutText) ViewBindings.findChildViewById(view, i);
            if (oneTextInputLayoutText != null) {
                i = R.id.mainCardView;
                CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
                if (cardView != null) {
                    i = R.id.setNewPasswordConditionTextView;
                    OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView != null) {
                        i = R.id.setNewPasswordDescriptionTextView;
                        OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView2 != null) {
                            i = R.id.setNewPasswordEditText;
                            OneTextInputLayoutText oneTextInputLayoutText2 = (OneTextInputLayoutText) ViewBindings.findChildViewById(view, i);
                            if (oneTextInputLayoutText2 != null) {
                                i = R.id.setNewPasswordPhoneNumberEditText;
                                OneTextInputLayoutPhone oneTextInputLayoutPhone = (OneTextInputLayoutPhone) ViewBindings.findChildViewById(view, i);
                                if (oneTextInputLayoutPhone != null) {
                                    return new FragmentOneOnlineRegistrationSetNewPasswordBinding((ConstraintLayout) view, oneFontButton, oneTextInputLayoutText, cardView, oneFontTextView, oneFontTextView2, oneTextInputLayoutText2, oneTextInputLayoutPhone);
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
    public static FragmentOneOnlineRegistrationSetNewPasswordBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneOnlineRegistrationSetNewPasswordBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_online_registration_set_new_password, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84003a;
    }
}
