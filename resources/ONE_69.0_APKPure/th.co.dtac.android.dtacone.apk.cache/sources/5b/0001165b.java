package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputLayout;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneCustomClearableEditText;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.app_one.widget.OneSelectLayout;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextLayoutView;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTooltipLayout;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneOnlineRegistrationRetailerInfoBinding */
/* loaded from: classes7.dex */
public final class FragmentOneOnlineRegistrationRetailerInfoBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84106a;
    @NonNull
    public final OneTextLayoutView addressMailingTextLayoutView;
    @NonNull
    public final OneTextLayoutView addressProductTextLayoutView;
    @NonNull
    public final OneTextLayoutView addressRetailerTextLayoutView;
    @NonNull
    public final OneTextLayoutView addressTaxTextLayoutView;
    @NonNull
    public final OneFontButton btnNext;
    @NonNull
    public final OneTextLayoutView businessTypeTextLayoutView;
    @NonNull
    public final OneCustomClearableEditText edtDolNumberDtac;
    @NonNull
    public final OneCustomClearableEditText edtDolNumberTrue;
    @NonNull
    public final OneCustomClearableEditText edtRtrName;
    @NonNull
    public final ImageView ivAddressLabel;
    @NonNull
    public final ImageView ivBrandLabel;
    @NonNull
    public final ImageView ivBusinessTypeSelect;
    @NonNull
    public final ImageView ivShopLabel;
    @NonNull
    public final LinearLayoutCompat layoutAdditionalAddress;
    @NonNull
    public final LinearLayoutCompat layoutAllAddress;
    @NonNull
    public final LinearLayoutCompat layoutSellDol;
    @NonNull
    public final ConstraintLayout layoutSellDolPhoneNumber;
    @NonNull
    public final LinearLayoutCompat layoutSellSim;
    @NonNull
    public final ConstraintLayout layoutTypeBusiness;
    @NonNull
    public final LinearLayoutCompat layoutTypeRetailer;
    @NonNull
    public final NestedScrollView scrollRetailer;
    @NonNull
    public final TextInputLayout tilRtrName;
    @NonNull
    public final OneTooltipLayout tooltipDtacOnline;
    @NonNull
    public final OneTooltipLayout tooltipTrueOnline;
    @NonNull
    public final OneFontTextView tvDtacOnlineTitle;
    @NonNull
    public final OneFontTextView tvNotSellDol;
    @NonNull
    public final OneFontTextView tvNotSellSim;
    @NonNull
    public final OneSelectLayout tvSelectBusinessType;
    @NonNull
    public final OneFontTextView tvSellDol;
    @NonNull
    public final OneFontTextView tvSellSim;
    @NonNull
    public final OneFontTextView tvSellSimTitle;
    @NonNull
    public final View vBackground;
    @NonNull
    public final View vLineSeparateAddressMailing;
    @NonNull
    public final View vLineSeparateAddressRetailer;
    @NonNull
    public final View vLineSeparateAddressTax;
    @NonNull
    public final View vLineSeparateIdCardNumber;
    @NonNull
    public final View vLineSeparateSellSim;

    public FragmentOneOnlineRegistrationRetailerInfoBinding(ConstraintLayout constraintLayout, OneTextLayoutView oneTextLayoutView, OneTextLayoutView oneTextLayoutView2, OneTextLayoutView oneTextLayoutView3, OneTextLayoutView oneTextLayoutView4, OneFontButton oneFontButton, OneTextLayoutView oneTextLayoutView5, OneCustomClearableEditText oneCustomClearableEditText, OneCustomClearableEditText oneCustomClearableEditText2, OneCustomClearableEditText oneCustomClearableEditText3, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2, LinearLayoutCompat linearLayoutCompat3, ConstraintLayout constraintLayout2, LinearLayoutCompat linearLayoutCompat4, ConstraintLayout constraintLayout3, LinearLayoutCompat linearLayoutCompat5, NestedScrollView nestedScrollView, TextInputLayout textInputLayout, OneTooltipLayout oneTooltipLayout, OneTooltipLayout oneTooltipLayout2, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneSelectLayout oneSelectLayout, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5, OneFontTextView oneFontTextView6, View view, View view2, View view3, View view4, View view5, View view6) {
        this.f84106a = constraintLayout;
        this.addressMailingTextLayoutView = oneTextLayoutView;
        this.addressProductTextLayoutView = oneTextLayoutView2;
        this.addressRetailerTextLayoutView = oneTextLayoutView3;
        this.addressTaxTextLayoutView = oneTextLayoutView4;
        this.btnNext = oneFontButton;
        this.businessTypeTextLayoutView = oneTextLayoutView5;
        this.edtDolNumberDtac = oneCustomClearableEditText;
        this.edtDolNumberTrue = oneCustomClearableEditText2;
        this.edtRtrName = oneCustomClearableEditText3;
        this.ivAddressLabel = imageView;
        this.ivBrandLabel = imageView2;
        this.ivBusinessTypeSelect = imageView3;
        this.ivShopLabel = imageView4;
        this.layoutAdditionalAddress = linearLayoutCompat;
        this.layoutAllAddress = linearLayoutCompat2;
        this.layoutSellDol = linearLayoutCompat3;
        this.layoutSellDolPhoneNumber = constraintLayout2;
        this.layoutSellSim = linearLayoutCompat4;
        this.layoutTypeBusiness = constraintLayout3;
        this.layoutTypeRetailer = linearLayoutCompat5;
        this.scrollRetailer = nestedScrollView;
        this.tilRtrName = textInputLayout;
        this.tooltipDtacOnline = oneTooltipLayout;
        this.tooltipTrueOnline = oneTooltipLayout2;
        this.tvDtacOnlineTitle = oneFontTextView;
        this.tvNotSellDol = oneFontTextView2;
        this.tvNotSellSim = oneFontTextView3;
        this.tvSelectBusinessType = oneSelectLayout;
        this.tvSellDol = oneFontTextView4;
        this.tvSellSim = oneFontTextView5;
        this.tvSellSimTitle = oneFontTextView6;
        this.vBackground = view;
        this.vLineSeparateAddressMailing = view2;
        this.vLineSeparateAddressRetailer = view3;
        this.vLineSeparateAddressTax = view4;
        this.vLineSeparateIdCardNumber = view5;
        this.vLineSeparateSellSim = view6;
    }

    @NonNull
    public static FragmentOneOnlineRegistrationRetailerInfoBinding bind(@NonNull View view) {
        View findChildViewById;
        View findChildViewById2;
        View findChildViewById3;
        View findChildViewById4;
        View findChildViewById5;
        View findChildViewById6;
        int i = R.id.addressMailingTextLayoutView;
        OneTextLayoutView oneTextLayoutView = (OneTextLayoutView) ViewBindings.findChildViewById(view, i);
        if (oneTextLayoutView != null) {
            i = R.id.addressProductTextLayoutView;
            OneTextLayoutView oneTextLayoutView2 = (OneTextLayoutView) ViewBindings.findChildViewById(view, i);
            if (oneTextLayoutView2 != null) {
                i = R.id.addressRetailerTextLayoutView;
                OneTextLayoutView oneTextLayoutView3 = (OneTextLayoutView) ViewBindings.findChildViewById(view, i);
                if (oneTextLayoutView3 != null) {
                    i = R.id.addressTaxTextLayoutView;
                    OneTextLayoutView oneTextLayoutView4 = (OneTextLayoutView) ViewBindings.findChildViewById(view, i);
                    if (oneTextLayoutView4 != null) {
                        i = R.id.btnNext;
                        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
                        if (oneFontButton != null) {
                            i = R.id.businessTypeTextLayoutView;
                            OneTextLayoutView oneTextLayoutView5 = (OneTextLayoutView) ViewBindings.findChildViewById(view, i);
                            if (oneTextLayoutView5 != null) {
                                i = R.id.edtDolNumberDtac;
                                OneCustomClearableEditText oneCustomClearableEditText = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
                                if (oneCustomClearableEditText != null) {
                                    i = R.id.edtDolNumberTrue;
                                    OneCustomClearableEditText oneCustomClearableEditText2 = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
                                    if (oneCustomClearableEditText2 != null) {
                                        i = R.id.edtRtrName;
                                        OneCustomClearableEditText oneCustomClearableEditText3 = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
                                        if (oneCustomClearableEditText3 != null) {
                                            i = R.id.ivAddressLabel;
                                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                            if (imageView != null) {
                                                i = R.id.ivBrandLabel;
                                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                if (imageView2 != null) {
                                                    i = R.id.ivBusinessTypeSelect;
                                                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                    if (imageView3 != null) {
                                                        i = R.id.ivShopLabel;
                                                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                        if (imageView4 != null) {
                                                            i = R.id.layoutAdditionalAddress;
                                                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                                            if (linearLayoutCompat != null) {
                                                                i = R.id.layoutAllAddress;
                                                                LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                                                if (linearLayoutCompat2 != null) {
                                                                    i = R.id.layoutSellDol;
                                                                    LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                                                    if (linearLayoutCompat3 != null) {
                                                                        i = R.id.layoutSellDolPhoneNumber;
                                                                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                        if (constraintLayout != null) {
                                                                            i = R.id.layoutSellSim;
                                                                            LinearLayoutCompat linearLayoutCompat4 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                                                            if (linearLayoutCompat4 != null) {
                                                                                i = R.id.layoutTypeBusiness;
                                                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                                if (constraintLayout2 != null) {
                                                                                    i = R.id.layoutTypeRetailer;
                                                                                    LinearLayoutCompat linearLayoutCompat5 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                                                                    if (linearLayoutCompat5 != null) {
                                                                                        i = R.id.scrollRetailer;
                                                                                        NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                                                                                        if (nestedScrollView != null) {
                                                                                            i = R.id.tilRtrName;
                                                                                            TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                                                                                            if (textInputLayout != null) {
                                                                                                i = R.id.tooltipDtacOnline;
                                                                                                OneTooltipLayout oneTooltipLayout = (OneTooltipLayout) ViewBindings.findChildViewById(view, i);
                                                                                                if (oneTooltipLayout != null) {
                                                                                                    i = R.id.tooltipTrueOnline;
                                                                                                    OneTooltipLayout oneTooltipLayout2 = (OneTooltipLayout) ViewBindings.findChildViewById(view, i);
                                                                                                    if (oneTooltipLayout2 != null) {
                                                                                                        i = R.id.tvDtacOnlineTitle;
                                                                                                        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                        if (oneFontTextView != null) {
                                                                                                            i = R.id.tvNotSellDol;
                                                                                                            OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                            if (oneFontTextView2 != null) {
                                                                                                                i = R.id.tvNotSellSim;
                                                                                                                OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                if (oneFontTextView3 != null) {
                                                                                                                    i = R.id.tvSelectBusinessType;
                                                                                                                    OneSelectLayout oneSelectLayout = (OneSelectLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                    if (oneSelectLayout != null) {
                                                                                                                        i = R.id.tvSellDol;
                                                                                                                        OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                        if (oneFontTextView4 != null) {
                                                                                                                            i = R.id.tvSellSim;
                                                                                                                            OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                            if (oneFontTextView5 != null) {
                                                                                                                                i = R.id.tvSellSimTitle;
                                                                                                                                OneFontTextView oneFontTextView6 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                if (oneFontTextView6 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.vBackground))) != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.vLineSeparateAddressMailing))) != null && (findChildViewById3 = ViewBindings.findChildViewById(view, (i = R.id.vLineSeparateAddressRetailer))) != null && (findChildViewById4 = ViewBindings.findChildViewById(view, (i = R.id.vLineSeparateAddressTax))) != null && (findChildViewById5 = ViewBindings.findChildViewById(view, (i = R.id.vLineSeparateIdCardNumber))) != null && (findChildViewById6 = ViewBindings.findChildViewById(view, (i = R.id.vLineSeparateSellSim))) != null) {
                                                                                                                                    return new FragmentOneOnlineRegistrationRetailerInfoBinding((ConstraintLayout) view, oneTextLayoutView, oneTextLayoutView2, oneTextLayoutView3, oneTextLayoutView4, oneFontButton, oneTextLayoutView5, oneCustomClearableEditText, oneCustomClearableEditText2, oneCustomClearableEditText3, imageView, imageView2, imageView3, imageView4, linearLayoutCompat, linearLayoutCompat2, linearLayoutCompat3, constraintLayout, linearLayoutCompat4, constraintLayout2, linearLayoutCompat5, nestedScrollView, textInputLayout, oneTooltipLayout, oneTooltipLayout2, oneFontTextView, oneFontTextView2, oneFontTextView3, oneSelectLayout, oneFontTextView4, oneFontTextView5, oneFontTextView6, findChildViewById, findChildViewById2, findChildViewById3, findChildViewById4, findChildViewById5, findChildViewById6);
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
    public static FragmentOneOnlineRegistrationRetailerInfoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneOnlineRegistrationRetailerInfoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_online_registration_retailer_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84106a;
    }
}