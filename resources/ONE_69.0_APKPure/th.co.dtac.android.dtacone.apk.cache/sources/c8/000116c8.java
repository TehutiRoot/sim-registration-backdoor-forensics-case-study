package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.inthecheesefactory.thecheeselibrary.widget.AdjustableImageView;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutIDCard;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutPhone;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutText;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneRetailerProfielContactInfoBinding */
/* loaded from: classes7.dex */
public final class FragmentOneRetailerProfielContactInfoBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f84215a;
    @NonNull
    public final OneFontButton confirmUpdateRetailerContactInfoButton;
    @NonNull
    public final CardView mainCardView;
    @NonNull
    public final CardView retailerContactIDCardCardView;
    @NonNull
    public final AdjustableImageView retailerContactIDCardImageView;
    @NonNull
    public final ConstraintLayout retailerContactInfoHeaderLayout;
    @NonNull
    public final OneFontTextView retailerContactInfoHeaderTextView;
    @NonNull
    public final AppCompatImageView retailerContactInfoImageView;
    @NonNull
    public final OneTextInputLayoutText retailerFirstNameEditText;
    @NonNull
    public final OneTextInputLayoutIDCard retailerIDCardEditText;
    @NonNull
    public final OneTextInputLayoutText retailerLastNameEditText;
    @NonNull
    public final OneTextInputLayoutPhone retailerPhoneNumberEditText;

    public FragmentOneRetailerProfielContactInfoBinding(NestedScrollView nestedScrollView, OneFontButton oneFontButton, CardView cardView, CardView cardView2, AdjustableImageView adjustableImageView, ConstraintLayout constraintLayout, OneFontTextView oneFontTextView, AppCompatImageView appCompatImageView, OneTextInputLayoutText oneTextInputLayoutText, OneTextInputLayoutIDCard oneTextInputLayoutIDCard, OneTextInputLayoutText oneTextInputLayoutText2, OneTextInputLayoutPhone oneTextInputLayoutPhone) {
        this.f84215a = nestedScrollView;
        this.confirmUpdateRetailerContactInfoButton = oneFontButton;
        this.mainCardView = cardView;
        this.retailerContactIDCardCardView = cardView2;
        this.retailerContactIDCardImageView = adjustableImageView;
        this.retailerContactInfoHeaderLayout = constraintLayout;
        this.retailerContactInfoHeaderTextView = oneFontTextView;
        this.retailerContactInfoImageView = appCompatImageView;
        this.retailerFirstNameEditText = oneTextInputLayoutText;
        this.retailerIDCardEditText = oneTextInputLayoutIDCard;
        this.retailerLastNameEditText = oneTextInputLayoutText2;
        this.retailerPhoneNumberEditText = oneTextInputLayoutPhone;
    }

    @NonNull
    public static FragmentOneRetailerProfielContactInfoBinding bind(@NonNull View view) {
        int i = R.id.confirmUpdateRetailerContactInfoButton;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.mainCardView;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
            if (cardView != null) {
                i = R.id.retailerContactIDCardCardView;
                CardView cardView2 = (CardView) ViewBindings.findChildViewById(view, i);
                if (cardView2 != null) {
                    i = R.id.retailerContactIDCardImageView;
                    AdjustableImageView adjustableImageView = (AdjustableImageView) ViewBindings.findChildViewById(view, i);
                    if (adjustableImageView != null) {
                        i = R.id.retailerContactInfoHeaderLayout;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout != null) {
                            i = R.id.retailerContactInfoHeaderTextView;
                            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView != null) {
                                i = R.id.retailerContactInfoImageView;
                                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                if (appCompatImageView != null) {
                                    i = R.id.retailerFirstNameEditText;
                                    OneTextInputLayoutText oneTextInputLayoutText = (OneTextInputLayoutText) ViewBindings.findChildViewById(view, i);
                                    if (oneTextInputLayoutText != null) {
                                        i = R.id.retailerIDCardEditText;
                                        OneTextInputLayoutIDCard oneTextInputLayoutIDCard = (OneTextInputLayoutIDCard) ViewBindings.findChildViewById(view, i);
                                        if (oneTextInputLayoutIDCard != null) {
                                            i = R.id.retailerLastNameEditText;
                                            OneTextInputLayoutText oneTextInputLayoutText2 = (OneTextInputLayoutText) ViewBindings.findChildViewById(view, i);
                                            if (oneTextInputLayoutText2 != null) {
                                                i = R.id.retailerPhoneNumberEditText;
                                                OneTextInputLayoutPhone oneTextInputLayoutPhone = (OneTextInputLayoutPhone) ViewBindings.findChildViewById(view, i);
                                                if (oneTextInputLayoutPhone != null) {
                                                    return new FragmentOneRetailerProfielContactInfoBinding((NestedScrollView) view, oneFontButton, cardView, cardView2, adjustableImageView, constraintLayout, oneFontTextView, appCompatImageView, oneTextInputLayoutText, oneTextInputLayoutIDCard, oneTextInputLayoutText2, oneTextInputLayoutPhone);
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
    public static FragmentOneRetailerProfielContactInfoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneRetailerProfielContactInfoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_retailer_profiel_contact_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f84215a;
    }
}