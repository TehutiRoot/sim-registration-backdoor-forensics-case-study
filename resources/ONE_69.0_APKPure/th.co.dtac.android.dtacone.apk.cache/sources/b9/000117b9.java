package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.app_one.widget.OneRadioButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacCardView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemOneCreditCardBinding */
/* loaded from: classes7.dex */
public final class ItemOneCreditCardBinding implements ViewBinding {

    /* renamed from: a */
    public final DtacCardView f84456a;
    @NonNull
    public final AppCompatImageView creditCardImageView;
    @NonNull
    public final DtacCardView creditCardLayout;
    @NonNull
    public final OneFontTextView creditCardNameTextView;
    @NonNull
    public final OneFontTextView creditCardNumberTextView;
    @NonNull
    public final OneRadioButton creditCardRadioButton;
    @NonNull
    public final RadioGroup creditCardRadioGroup;
    @NonNull
    public final AppCompatImageView deleteCreditCardImageView;

    public ItemOneCreditCardBinding(DtacCardView dtacCardView, AppCompatImageView appCompatImageView, DtacCardView dtacCardView2, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneRadioButton oneRadioButton, RadioGroup radioGroup, AppCompatImageView appCompatImageView2) {
        this.f84456a = dtacCardView;
        this.creditCardImageView = appCompatImageView;
        this.creditCardLayout = dtacCardView2;
        this.creditCardNameTextView = oneFontTextView;
        this.creditCardNumberTextView = oneFontTextView2;
        this.creditCardRadioButton = oneRadioButton;
        this.creditCardRadioGroup = radioGroup;
        this.deleteCreditCardImageView = appCompatImageView2;
    }

    @NonNull
    public static ItemOneCreditCardBinding bind(@NonNull View view) {
        int i = R.id.creditCardImageView;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            DtacCardView dtacCardView = (DtacCardView) view;
            i = R.id.creditCardNameTextView;
            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView != null) {
                i = R.id.creditCardNumberTextView;
                OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView2 != null) {
                    i = R.id.creditCardRadioButton;
                    OneRadioButton oneRadioButton = (OneRadioButton) ViewBindings.findChildViewById(view, i);
                    if (oneRadioButton != null) {
                        i = R.id.creditCardRadioGroup;
                        RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, i);
                        if (radioGroup != null) {
                            i = R.id.deleteCreditCardImageView;
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                            if (appCompatImageView2 != null) {
                                return new ItemOneCreditCardBinding(dtacCardView, appCompatImageView, dtacCardView, oneFontTextView, oneFontTextView2, oneRadioButton, radioGroup, appCompatImageView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemOneCreditCardBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemOneCreditCardBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_one_credit_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public DtacCardView getRoot() {
        return this.f84456a;
    }
}