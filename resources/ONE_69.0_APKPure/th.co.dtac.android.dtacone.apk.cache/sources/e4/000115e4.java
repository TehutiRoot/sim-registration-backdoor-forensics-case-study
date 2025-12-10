package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneBuyDolBankDetailBinding */
/* loaded from: classes7.dex */
public final class FragmentOneBuyDolBankDetailBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f83987a;
    @NonNull
    public final AppCompatImageView bankBrandImageView;
    @NonNull
    public final CardView bankItemCardView;
    @NonNull
    public final OneFontTextView bankNameTextView;
    @NonNull
    public final ImageView saveImageToGallerySuccessImageView;
    @NonNull
    public final OneFontTextView subTitleDescriptionTextView;
    @NonNull
    public final OneFontTextView subTitleTextView;
    @NonNull
    public final OneFontTextView topUpByBankContentStepTextView;
    @NonNull
    public final OneFontButton topUpByBankItemButton;
    @NonNull
    public final OneFontTextView topUpByBankItemDescriptionTitleTextView;

    public FragmentOneBuyDolBankDetailBinding(NestedScrollView nestedScrollView, AppCompatImageView appCompatImageView, CardView cardView, OneFontTextView oneFontTextView, ImageView imageView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, OneFontButton oneFontButton, OneFontTextView oneFontTextView5) {
        this.f83987a = nestedScrollView;
        this.bankBrandImageView = appCompatImageView;
        this.bankItemCardView = cardView;
        this.bankNameTextView = oneFontTextView;
        this.saveImageToGallerySuccessImageView = imageView;
        this.subTitleDescriptionTextView = oneFontTextView2;
        this.subTitleTextView = oneFontTextView3;
        this.topUpByBankContentStepTextView = oneFontTextView4;
        this.topUpByBankItemButton = oneFontButton;
        this.topUpByBankItemDescriptionTitleTextView = oneFontTextView5;
    }

    @NonNull
    public static FragmentOneBuyDolBankDetailBinding bind(@NonNull View view) {
        int i = R.id.bankBrandImageView;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.bankItemCardView;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
            if (cardView != null) {
                i = R.id.bankNameTextView;
                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView != null) {
                    i = R.id.saveImageToGallerySuccessImageView;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R.id.subTitleDescriptionTextView;
                        OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView2 != null) {
                            i = R.id.subTitleTextView;
                            OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView3 != null) {
                                i = R.id.topUpByBankContentStepTextView;
                                OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView4 != null) {
                                    i = R.id.topUpByBankItemButton;
                                    OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
                                    if (oneFontButton != null) {
                                        i = R.id.topUpByBankItemDescriptionTitleTextView;
                                        OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (oneFontTextView5 != null) {
                                            return new FragmentOneBuyDolBankDetailBinding((NestedScrollView) view, appCompatImageView, cardView, oneFontTextView, imageView, oneFontTextView2, oneFontTextView3, oneFontTextView4, oneFontButton, oneFontTextView5);
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
    public static FragmentOneBuyDolBankDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneBuyDolBankDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_buy_dol_bank_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f83987a;
    }
}