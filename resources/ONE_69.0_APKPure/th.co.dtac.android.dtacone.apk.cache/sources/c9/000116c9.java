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
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputLayout;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutText;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextLayoutView;
import th.p047co.dtac.android.dtacone.widget.view.DtacEditText;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneRetailerProfileAddressInfoBinding */
/* loaded from: classes7.dex */
public final class FragmentOneRetailerProfileAddressInfoBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f84216a;
    @NonNull
    public final ImageView clearRetailerAddress2ImageView;
    @NonNull
    public final ImageView clearRetailerAddressImageView;
    @NonNull
    public final OneFontButton confirmUpdateRetailerInfoButton;
    @NonNull
    public final CardView retailerAddressInfoCardView;
    @NonNull
    public final ConstraintLayout retailerAddressInfoHeaderLayout;
    @NonNull
    public final OneFontTextView retailerAddressInfoHeaderTextView;
    @NonNull
    public final AppCompatImageView retailerAddressInfoImageView;
    @NonNull
    public final ConstraintLayout retailerContactInfoHeaderLayout;
    @NonNull
    public final OneFontTextView retailerContactInfoHeaderTextView;
    @NonNull
    public final AppCompatImageView retailerContactInfoImageView;
    @NonNull
    public final OneTextLayoutView retailerDistrictEditText;
    @NonNull
    public final CardView retailerInfoCardView;
    @NonNull
    public final OneTextLayoutView retailerPostCodeEditText;
    @NonNull
    public final OneTextLayoutView retailerProvinceEditText;
    @NonNull
    public final OneTextInputLayoutText retailerShopCodeInputLayout;
    @NonNull
    public final OneTextInputLayoutText retailerShopNameInputLayout;
    @NonNull
    public final TextInputLayout retailerSubAddressDetail2;
    @NonNull
    public final DtacEditText retailerSubAddressDetail2EditText;
    @NonNull
    public final DtacEditText retailerSubAddressDetailEditText;
    @NonNull
    public final TextInputLayout retailerSubAddressDetailTextInputLayout;
    @NonNull
    public final OneTextLayoutView retailerSubDistrictEditText;

    public FragmentOneRetailerProfileAddressInfoBinding(NestedScrollView nestedScrollView, ImageView imageView, ImageView imageView2, OneFontButton oneFontButton, CardView cardView, ConstraintLayout constraintLayout, OneFontTextView oneFontTextView, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout2, OneFontTextView oneFontTextView2, AppCompatImageView appCompatImageView2, OneTextLayoutView oneTextLayoutView, CardView cardView2, OneTextLayoutView oneTextLayoutView2, OneTextLayoutView oneTextLayoutView3, OneTextInputLayoutText oneTextInputLayoutText, OneTextInputLayoutText oneTextInputLayoutText2, TextInputLayout textInputLayout, DtacEditText dtacEditText, DtacEditText dtacEditText2, TextInputLayout textInputLayout2, OneTextLayoutView oneTextLayoutView4) {
        this.f84216a = nestedScrollView;
        this.clearRetailerAddress2ImageView = imageView;
        this.clearRetailerAddressImageView = imageView2;
        this.confirmUpdateRetailerInfoButton = oneFontButton;
        this.retailerAddressInfoCardView = cardView;
        this.retailerAddressInfoHeaderLayout = constraintLayout;
        this.retailerAddressInfoHeaderTextView = oneFontTextView;
        this.retailerAddressInfoImageView = appCompatImageView;
        this.retailerContactInfoHeaderLayout = constraintLayout2;
        this.retailerContactInfoHeaderTextView = oneFontTextView2;
        this.retailerContactInfoImageView = appCompatImageView2;
        this.retailerDistrictEditText = oneTextLayoutView;
        this.retailerInfoCardView = cardView2;
        this.retailerPostCodeEditText = oneTextLayoutView2;
        this.retailerProvinceEditText = oneTextLayoutView3;
        this.retailerShopCodeInputLayout = oneTextInputLayoutText;
        this.retailerShopNameInputLayout = oneTextInputLayoutText2;
        this.retailerSubAddressDetail2 = textInputLayout;
        this.retailerSubAddressDetail2EditText = dtacEditText;
        this.retailerSubAddressDetailEditText = dtacEditText2;
        this.retailerSubAddressDetailTextInputLayout = textInputLayout2;
        this.retailerSubDistrictEditText = oneTextLayoutView4;
    }

    @NonNull
    public static FragmentOneRetailerProfileAddressInfoBinding bind(@NonNull View view) {
        int i = R.id.clearRetailerAddress2ImageView;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.clearRetailerAddressImageView;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = R.id.confirmUpdateRetailerInfoButton;
                OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
                if (oneFontButton != null) {
                    i = R.id.retailerAddressInfoCardView;
                    CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
                    if (cardView != null) {
                        i = R.id.retailerAddressInfoHeaderLayout;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout != null) {
                            i = R.id.retailerAddressInfoHeaderTextView;
                            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView != null) {
                                i = R.id.retailerAddressInfoImageView;
                                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                if (appCompatImageView != null) {
                                    i = R.id.retailerContactInfoHeaderLayout;
                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                    if (constraintLayout2 != null) {
                                        i = R.id.retailerContactInfoHeaderTextView;
                                        OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (oneFontTextView2 != null) {
                                            i = R.id.retailerContactInfoImageView;
                                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                            if (appCompatImageView2 != null) {
                                                i = R.id.retailerDistrictEditText;
                                                OneTextLayoutView oneTextLayoutView = (OneTextLayoutView) ViewBindings.findChildViewById(view, i);
                                                if (oneTextLayoutView != null) {
                                                    i = R.id.retailerInfoCardView;
                                                    CardView cardView2 = (CardView) ViewBindings.findChildViewById(view, i);
                                                    if (cardView2 != null) {
                                                        i = R.id.retailerPostCodeEditText;
                                                        OneTextLayoutView oneTextLayoutView2 = (OneTextLayoutView) ViewBindings.findChildViewById(view, i);
                                                        if (oneTextLayoutView2 != null) {
                                                            i = R.id.retailerProvinceEditText;
                                                            OneTextLayoutView oneTextLayoutView3 = (OneTextLayoutView) ViewBindings.findChildViewById(view, i);
                                                            if (oneTextLayoutView3 != null) {
                                                                i = R.id.retailerShopCodeInputLayout;
                                                                OneTextInputLayoutText oneTextInputLayoutText = (OneTextInputLayoutText) ViewBindings.findChildViewById(view, i);
                                                                if (oneTextInputLayoutText != null) {
                                                                    i = R.id.retailerShopNameInputLayout;
                                                                    OneTextInputLayoutText oneTextInputLayoutText2 = (OneTextInputLayoutText) ViewBindings.findChildViewById(view, i);
                                                                    if (oneTextInputLayoutText2 != null) {
                                                                        i = R.id.retailerSubAddressDetail2;
                                                                        TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                                                                        if (textInputLayout != null) {
                                                                            i = R.id.retailerSubAddressDetail2EditText;
                                                                            DtacEditText dtacEditText = (DtacEditText) ViewBindings.findChildViewById(view, i);
                                                                            if (dtacEditText != null) {
                                                                                i = R.id.retailerSubAddressDetailEditText;
                                                                                DtacEditText dtacEditText2 = (DtacEditText) ViewBindings.findChildViewById(view, i);
                                                                                if (dtacEditText2 != null) {
                                                                                    i = R.id.retailerSubAddressDetailTextInputLayout;
                                                                                    TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                                                                                    if (textInputLayout2 != null) {
                                                                                        i = R.id.retailerSubDistrictEditText;
                                                                                        OneTextLayoutView oneTextLayoutView4 = (OneTextLayoutView) ViewBindings.findChildViewById(view, i);
                                                                                        if (oneTextLayoutView4 != null) {
                                                                                            return new FragmentOneRetailerProfileAddressInfoBinding((NestedScrollView) view, imageView, imageView2, oneFontButton, cardView, constraintLayout, oneFontTextView, appCompatImageView, constraintLayout2, oneFontTextView2, appCompatImageView2, oneTextLayoutView, cardView2, oneTextLayoutView2, oneTextLayoutView3, oneTextInputLayoutText, oneTextInputLayoutText2, textInputLayout, dtacEditText, dtacEditText2, textInputLayout2, oneTextLayoutView4);
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
    public static FragmentOneRetailerProfileAddressInfoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneRetailerProfileAddressInfoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_retailer_profile_address_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f84216a;
    }
}