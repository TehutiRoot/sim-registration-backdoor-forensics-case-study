package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputLayout;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneCustomClearableEditText;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.app_one.widget.OneSelectLayout;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextLayoutView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneOnlineRegistChooseAddressBinding */
/* loaded from: classes7.dex */
public final class FragmentOneOnlineRegistChooseAddressBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84096a;
    @NonNull
    public final OneFontButton btnSave;
    @NonNull
    public final OneCustomClearableEditText etMailAddress1;
    @NonNull
    public final OneCustomClearableEditText etMailAddress2;
    @NonNull
    public final OneCustomClearableEditText etMailPostcode;
    @NonNull
    public final OneCustomClearableEditText etProductAddress1;
    @NonNull
    public final OneCustomClearableEditText etProductAddress2;
    @NonNull
    public final OneCustomClearableEditText etProductPostcode;
    @NonNull
    public final OneCustomClearableEditText etShopAddress1;
    @NonNull
    public final OneCustomClearableEditText etShopAddress2;
    @NonNull
    public final OneCustomClearableEditText etShopPostcode;
    @NonNull
    public final OneCustomClearableEditText etTaxAddress1;
    @NonNull
    public final OneCustomClearableEditText etTaxAddress2;
    @NonNull
    public final OneCustomClearableEditText etTaxPostcode;
    @NonNull
    public final ImageView ivMailAddressLabel;
    @NonNull
    public final ImageView ivMailDistrictSelect;
    @NonNull
    public final ImageView ivMailProvinceSelect;
    @NonNull
    public final ImageView ivProductAddressLabel;
    @NonNull
    public final ImageView ivProductDistrictSelect;
    @NonNull
    public final ImageView ivProductProvinceSelect;
    @NonNull
    public final ImageView ivShopAddressLabel;
    @NonNull
    public final ImageView ivShopDistrictSelect;
    @NonNull
    public final ImageView ivShopProvinceSelect;
    @NonNull
    public final ImageView ivTaxAddressLabel;
    @NonNull
    public final ImageView ivTaxDistrictSelect;
    @NonNull
    public final ImageView ivTaxProvinceSelect;
    @NonNull
    public final LinearLayoutCompat layoutAdditionalAddress;
    @NonNull
    public final LinearLayoutCompat layoutAddressTitle;
    @NonNull
    public final LinearLayoutCompat layoutDetailMailAddress;
    @NonNull
    public final LinearLayoutCompat layoutDetailProductAddress;
    @NonNull
    public final LinearLayoutCompat layoutDetailShopAddress;
    @NonNull
    public final LinearLayoutCompat layoutDetailTaxAddress;
    @NonNull
    public final LinearLayoutCompat layoutMailInputAddress;
    @NonNull
    public final LinearLayoutCompat layoutMailSameAddress;
    @NonNull
    public final LinearLayoutCompat layoutProductInputAddress;
    @NonNull
    public final LinearLayoutCompat layoutProductSameAddress;
    @NonNull
    public final LinearLayoutCompat layoutShopAddress;
    @NonNull
    public final LinearLayoutCompat layoutTaxInputAddress;
    @NonNull
    public final LinearLayoutCompat layoutTaxSameAddress;
    @NonNull
    public final OneTextLayoutView mailSubDistrictTextLayoutView;
    @NonNull
    public final OneTextLayoutView productSubDistrictTextLayoutView;
    @NonNull
    public final OneTextLayoutView shopSubDistrictTextLayoutView;
    @NonNull
    public final OneTextLayoutView taxSubDistrictTextLayoutView;
    @NonNull
    public final TextInputLayout tilMailAddress1Title;
    @NonNull
    public final TextInputLayout tilMailAddress2Title;
    @NonNull
    public final TextInputLayout tilMailPostcode;
    @NonNull
    public final TextInputLayout tilProductAddress1Title;
    @NonNull
    public final TextInputLayout tilProductAddress2Title;
    @NonNull
    public final TextInputLayout tilProductPostcode;
    @NonNull
    public final TextInputLayout tilShopAddress1Title;
    @NonNull
    public final TextInputLayout tilShopAddress2Title;
    @NonNull
    public final TextInputLayout tilShopPostcode;
    @NonNull
    public final TextInputLayout tilTaxAddress1Title;
    @NonNull
    public final TextInputLayout tilTaxAddress2Title;
    @NonNull
    public final TextInputLayout tilTaxPostcode;
    @NonNull
    public final OneFontTextView tvMailAddressSame;
    @NonNull
    public final OneSelectLayout tvMailDistrict;
    @NonNull
    public final OneFontTextView tvMailOtherAddressSelect;
    @NonNull
    public final OneSelectLayout tvMailProvince;
    @NonNull
    public final OneFontTextView tvProductAddressSame;
    @NonNull
    public final OneSelectLayout tvProductDistrict;
    @NonNull
    public final OneFontTextView tvProductOtherAddressSelect;
    @NonNull
    public final OneSelectLayout tvProductProvince;
    @NonNull
    public final OneSelectLayout tvShopDistrict;
    @NonNull
    public final OneSelectLayout tvShopProvince;
    @NonNull
    public final OneFontTextView tvTaxAddressSame;
    @NonNull
    public final OneSelectLayout tvTaxDistrict;
    @NonNull
    public final OneFontTextView tvTaxOtherAddressSelect;
    @NonNull
    public final OneSelectLayout tvTaxProvince;
    @NonNull
    public final View vBackground;
    @NonNull
    public final View vLineSeparateMailAddress1;
    @NonNull
    public final View vLineSeparateMailDistrict;
    @NonNull
    public final View vLineSeparateMailPostcode;
    @NonNull
    public final View vLineSeparateMailProvince;
    @NonNull
    public final View vLineSeparateMailSubDistrict;
    @NonNull
    public final View vLineSeparateProductAddress1;
    @NonNull
    public final View vLineSeparateProductDistrict;
    @NonNull
    public final View vLineSeparateProductPostcode;
    @NonNull
    public final View vLineSeparateProductProvince;
    @NonNull
    public final View vLineSeparateProductSubDistrict;
    @NonNull
    public final View vLineSeparateShopAddress1;
    @NonNull
    public final View vLineSeparateShopDistrict;
    @NonNull
    public final View vLineSeparateShopPostcode;
    @NonNull
    public final View vLineSeparateShopProvince;
    @NonNull
    public final View vLineSeparateShopSubDistrict;
    @NonNull
    public final View vLineSeparateTaxAddress1;
    @NonNull
    public final View vLineSeparateTaxDistrict;
    @NonNull
    public final View vLineSeparateTaxPostcode;
    @NonNull
    public final View vLineSeparateTaxProvince;
    @NonNull
    public final View vLineSeparateTaxSubDistrict;
    @NonNull
    public final View vLineSeparateTopMailPostcode;
    @NonNull
    public final View vLineSeparateTopProductPostcode;
    @NonNull
    public final View vLineSeparateTopTaxPostcode;

    public FragmentOneOnlineRegistChooseAddressBinding(ConstraintLayout constraintLayout, OneFontButton oneFontButton, OneCustomClearableEditText oneCustomClearableEditText, OneCustomClearableEditText oneCustomClearableEditText2, OneCustomClearableEditText oneCustomClearableEditText3, OneCustomClearableEditText oneCustomClearableEditText4, OneCustomClearableEditText oneCustomClearableEditText5, OneCustomClearableEditText oneCustomClearableEditText6, OneCustomClearableEditText oneCustomClearableEditText7, OneCustomClearableEditText oneCustomClearableEditText8, OneCustomClearableEditText oneCustomClearableEditText9, OneCustomClearableEditText oneCustomClearableEditText10, OneCustomClearableEditText oneCustomClearableEditText11, OneCustomClearableEditText oneCustomClearableEditText12, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, ImageView imageView8, ImageView imageView9, ImageView imageView10, ImageView imageView11, ImageView imageView12, LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2, LinearLayoutCompat linearLayoutCompat3, LinearLayoutCompat linearLayoutCompat4, LinearLayoutCompat linearLayoutCompat5, LinearLayoutCompat linearLayoutCompat6, LinearLayoutCompat linearLayoutCompat7, LinearLayoutCompat linearLayoutCompat8, LinearLayoutCompat linearLayoutCompat9, LinearLayoutCompat linearLayoutCompat10, LinearLayoutCompat linearLayoutCompat11, LinearLayoutCompat linearLayoutCompat12, LinearLayoutCompat linearLayoutCompat13, OneTextLayoutView oneTextLayoutView, OneTextLayoutView oneTextLayoutView2, OneTextLayoutView oneTextLayoutView3, OneTextLayoutView oneTextLayoutView4, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TextInputLayout textInputLayout4, TextInputLayout textInputLayout5, TextInputLayout textInputLayout6, TextInputLayout textInputLayout7, TextInputLayout textInputLayout8, TextInputLayout textInputLayout9, TextInputLayout textInputLayout10, TextInputLayout textInputLayout11, TextInputLayout textInputLayout12, OneFontTextView oneFontTextView, OneSelectLayout oneSelectLayout, OneFontTextView oneFontTextView2, OneSelectLayout oneSelectLayout2, OneFontTextView oneFontTextView3, OneSelectLayout oneSelectLayout3, OneFontTextView oneFontTextView4, OneSelectLayout oneSelectLayout4, OneSelectLayout oneSelectLayout5, OneSelectLayout oneSelectLayout6, OneFontTextView oneFontTextView5, OneSelectLayout oneSelectLayout7, OneFontTextView oneFontTextView6, OneSelectLayout oneSelectLayout8, View view, View view2, View view3, View view4, View view5, View view6, View view7, View view8, View view9, View view10, View view11, View view12, View view13, View view14, View view15, View view16, View view17, View view18, View view19, View view20, View view21, View view22, View view23, View view24) {
        this.f84096a = constraintLayout;
        this.btnSave = oneFontButton;
        this.etMailAddress1 = oneCustomClearableEditText;
        this.etMailAddress2 = oneCustomClearableEditText2;
        this.etMailPostcode = oneCustomClearableEditText3;
        this.etProductAddress1 = oneCustomClearableEditText4;
        this.etProductAddress2 = oneCustomClearableEditText5;
        this.etProductPostcode = oneCustomClearableEditText6;
        this.etShopAddress1 = oneCustomClearableEditText7;
        this.etShopAddress2 = oneCustomClearableEditText8;
        this.etShopPostcode = oneCustomClearableEditText9;
        this.etTaxAddress1 = oneCustomClearableEditText10;
        this.etTaxAddress2 = oneCustomClearableEditText11;
        this.etTaxPostcode = oneCustomClearableEditText12;
        this.ivMailAddressLabel = imageView;
        this.ivMailDistrictSelect = imageView2;
        this.ivMailProvinceSelect = imageView3;
        this.ivProductAddressLabel = imageView4;
        this.ivProductDistrictSelect = imageView5;
        this.ivProductProvinceSelect = imageView6;
        this.ivShopAddressLabel = imageView7;
        this.ivShopDistrictSelect = imageView8;
        this.ivShopProvinceSelect = imageView9;
        this.ivTaxAddressLabel = imageView10;
        this.ivTaxDistrictSelect = imageView11;
        this.ivTaxProvinceSelect = imageView12;
        this.layoutAdditionalAddress = linearLayoutCompat;
        this.layoutAddressTitle = linearLayoutCompat2;
        this.layoutDetailMailAddress = linearLayoutCompat3;
        this.layoutDetailProductAddress = linearLayoutCompat4;
        this.layoutDetailShopAddress = linearLayoutCompat5;
        this.layoutDetailTaxAddress = linearLayoutCompat6;
        this.layoutMailInputAddress = linearLayoutCompat7;
        this.layoutMailSameAddress = linearLayoutCompat8;
        this.layoutProductInputAddress = linearLayoutCompat9;
        this.layoutProductSameAddress = linearLayoutCompat10;
        this.layoutShopAddress = linearLayoutCompat11;
        this.layoutTaxInputAddress = linearLayoutCompat12;
        this.layoutTaxSameAddress = linearLayoutCompat13;
        this.mailSubDistrictTextLayoutView = oneTextLayoutView;
        this.productSubDistrictTextLayoutView = oneTextLayoutView2;
        this.shopSubDistrictTextLayoutView = oneTextLayoutView3;
        this.taxSubDistrictTextLayoutView = oneTextLayoutView4;
        this.tilMailAddress1Title = textInputLayout;
        this.tilMailAddress2Title = textInputLayout2;
        this.tilMailPostcode = textInputLayout3;
        this.tilProductAddress1Title = textInputLayout4;
        this.tilProductAddress2Title = textInputLayout5;
        this.tilProductPostcode = textInputLayout6;
        this.tilShopAddress1Title = textInputLayout7;
        this.tilShopAddress2Title = textInputLayout8;
        this.tilShopPostcode = textInputLayout9;
        this.tilTaxAddress1Title = textInputLayout10;
        this.tilTaxAddress2Title = textInputLayout11;
        this.tilTaxPostcode = textInputLayout12;
        this.tvMailAddressSame = oneFontTextView;
        this.tvMailDistrict = oneSelectLayout;
        this.tvMailOtherAddressSelect = oneFontTextView2;
        this.tvMailProvince = oneSelectLayout2;
        this.tvProductAddressSame = oneFontTextView3;
        this.tvProductDistrict = oneSelectLayout3;
        this.tvProductOtherAddressSelect = oneFontTextView4;
        this.tvProductProvince = oneSelectLayout4;
        this.tvShopDistrict = oneSelectLayout5;
        this.tvShopProvince = oneSelectLayout6;
        this.tvTaxAddressSame = oneFontTextView5;
        this.tvTaxDistrict = oneSelectLayout7;
        this.tvTaxOtherAddressSelect = oneFontTextView6;
        this.tvTaxProvince = oneSelectLayout8;
        this.vBackground = view;
        this.vLineSeparateMailAddress1 = view2;
        this.vLineSeparateMailDistrict = view3;
        this.vLineSeparateMailPostcode = view4;
        this.vLineSeparateMailProvince = view5;
        this.vLineSeparateMailSubDistrict = view6;
        this.vLineSeparateProductAddress1 = view7;
        this.vLineSeparateProductDistrict = view8;
        this.vLineSeparateProductPostcode = view9;
        this.vLineSeparateProductProvince = view10;
        this.vLineSeparateProductSubDistrict = view11;
        this.vLineSeparateShopAddress1 = view12;
        this.vLineSeparateShopDistrict = view13;
        this.vLineSeparateShopPostcode = view14;
        this.vLineSeparateShopProvince = view15;
        this.vLineSeparateShopSubDistrict = view16;
        this.vLineSeparateTaxAddress1 = view17;
        this.vLineSeparateTaxDistrict = view18;
        this.vLineSeparateTaxPostcode = view19;
        this.vLineSeparateTaxProvince = view20;
        this.vLineSeparateTaxSubDistrict = view21;
        this.vLineSeparateTopMailPostcode = view22;
        this.vLineSeparateTopProductPostcode = view23;
        this.vLineSeparateTopTaxPostcode = view24;
    }

    @NonNull
    public static FragmentOneOnlineRegistChooseAddressBinding bind(@NonNull View view) {
        View findChildViewById;
        View findChildViewById2;
        View findChildViewById3;
        View findChildViewById4;
        View findChildViewById5;
        View findChildViewById6;
        View findChildViewById7;
        View findChildViewById8;
        View findChildViewById9;
        View findChildViewById10;
        View findChildViewById11;
        View findChildViewById12;
        View findChildViewById13;
        View findChildViewById14;
        View findChildViewById15;
        View findChildViewById16;
        View findChildViewById17;
        View findChildViewById18;
        View findChildViewById19;
        View findChildViewById20;
        View findChildViewById21;
        View findChildViewById22;
        View findChildViewById23;
        View findChildViewById24;
        int i = R.id.btnSave;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.etMailAddress1;
            OneCustomClearableEditText oneCustomClearableEditText = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
            if (oneCustomClearableEditText != null) {
                i = R.id.etMailAddress2;
                OneCustomClearableEditText oneCustomClearableEditText2 = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
                if (oneCustomClearableEditText2 != null) {
                    i = R.id.etMailPostcode;
                    OneCustomClearableEditText oneCustomClearableEditText3 = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
                    if (oneCustomClearableEditText3 != null) {
                        i = R.id.etProductAddress1;
                        OneCustomClearableEditText oneCustomClearableEditText4 = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
                        if (oneCustomClearableEditText4 != null) {
                            i = R.id.etProductAddress2;
                            OneCustomClearableEditText oneCustomClearableEditText5 = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
                            if (oneCustomClearableEditText5 != null) {
                                i = R.id.etProductPostcode;
                                OneCustomClearableEditText oneCustomClearableEditText6 = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
                                if (oneCustomClearableEditText6 != null) {
                                    i = R.id.etShopAddress1;
                                    OneCustomClearableEditText oneCustomClearableEditText7 = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
                                    if (oneCustomClearableEditText7 != null) {
                                        i = R.id.etShopAddress2;
                                        OneCustomClearableEditText oneCustomClearableEditText8 = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
                                        if (oneCustomClearableEditText8 != null) {
                                            i = R.id.etShopPostcode;
                                            OneCustomClearableEditText oneCustomClearableEditText9 = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
                                            if (oneCustomClearableEditText9 != null) {
                                                i = R.id.etTaxAddress1;
                                                OneCustomClearableEditText oneCustomClearableEditText10 = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
                                                if (oneCustomClearableEditText10 != null) {
                                                    i = R.id.etTaxAddress2;
                                                    OneCustomClearableEditText oneCustomClearableEditText11 = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
                                                    if (oneCustomClearableEditText11 != null) {
                                                        i = R.id.etTaxPostcode;
                                                        OneCustomClearableEditText oneCustomClearableEditText12 = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
                                                        if (oneCustomClearableEditText12 != null) {
                                                            i = R.id.ivMailAddressLabel;
                                                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                                            if (imageView != null) {
                                                                i = R.id.ivMailDistrictSelect;
                                                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                if (imageView2 != null) {
                                                                    i = R.id.ivMailProvinceSelect;
                                                                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                    if (imageView3 != null) {
                                                                        i = R.id.ivProductAddressLabel;
                                                                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                        if (imageView4 != null) {
                                                                            i = R.id.ivProductDistrictSelect;
                                                                            ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                            if (imageView5 != null) {
                                                                                i = R.id.ivProductProvinceSelect;
                                                                                ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                                if (imageView6 != null) {
                                                                                    i = R.id.ivShopAddressLabel;
                                                                                    ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                                    if (imageView7 != null) {
                                                                                        i = R.id.ivShopDistrictSelect;
                                                                                        ImageView imageView8 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                                        if (imageView8 != null) {
                                                                                            i = R.id.ivShopProvinceSelect;
                                                                                            ImageView imageView9 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                                            if (imageView9 != null) {
                                                                                                i = R.id.ivTaxAddressLabel;
                                                                                                ImageView imageView10 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                                                if (imageView10 != null) {
                                                                                                    i = R.id.ivTaxDistrictSelect;
                                                                                                    ImageView imageView11 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                                                    if (imageView11 != null) {
                                                                                                        i = R.id.ivTaxProvinceSelect;
                                                                                                        ImageView imageView12 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                                                        if (imageView12 != null) {
                                                                                                            i = R.id.layoutAdditionalAddress;
                                                                                                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                                                                                            if (linearLayoutCompat != null) {
                                                                                                                i = R.id.layoutAddressTitle;
                                                                                                                LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                                                                                                if (linearLayoutCompat2 != null) {
                                                                                                                    i = R.id.layoutDetailMailAddress;
                                                                                                                    LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                                                                                                    if (linearLayoutCompat3 != null) {
                                                                                                                        i = R.id.layoutDetailProductAddress;
                                                                                                                        LinearLayoutCompat linearLayoutCompat4 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                                                                                                        if (linearLayoutCompat4 != null) {
                                                                                                                            i = R.id.layoutDetailShopAddress;
                                                                                                                            LinearLayoutCompat linearLayoutCompat5 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                                                                                                            if (linearLayoutCompat5 != null) {
                                                                                                                                i = R.id.layoutDetailTaxAddress;
                                                                                                                                LinearLayoutCompat linearLayoutCompat6 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                                                                                                                if (linearLayoutCompat6 != null) {
                                                                                                                                    i = R.id.layoutMailInputAddress;
                                                                                                                                    LinearLayoutCompat linearLayoutCompat7 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                                                                                                                    if (linearLayoutCompat7 != null) {
                                                                                                                                        i = R.id.layoutMailSameAddress;
                                                                                                                                        LinearLayoutCompat linearLayoutCompat8 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                                                                                                                        if (linearLayoutCompat8 != null) {
                                                                                                                                            i = R.id.layoutProductInputAddress;
                                                                                                                                            LinearLayoutCompat linearLayoutCompat9 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                                                                                                                            if (linearLayoutCompat9 != null) {
                                                                                                                                                i = R.id.layoutProductSameAddress;
                                                                                                                                                LinearLayoutCompat linearLayoutCompat10 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                                                                                                                                if (linearLayoutCompat10 != null) {
                                                                                                                                                    i = R.id.layoutShopAddress;
                                                                                                                                                    LinearLayoutCompat linearLayoutCompat11 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                                                                                                                                    if (linearLayoutCompat11 != null) {
                                                                                                                                                        i = R.id.layoutTaxInputAddress;
                                                                                                                                                        LinearLayoutCompat linearLayoutCompat12 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                                                                                                                                        if (linearLayoutCompat12 != null) {
                                                                                                                                                            i = R.id.layoutTaxSameAddress;
                                                                                                                                                            LinearLayoutCompat linearLayoutCompat13 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                                                                                                                                            if (linearLayoutCompat13 != null) {
                                                                                                                                                                i = R.id.mailSubDistrictTextLayoutView;
                                                                                                                                                                OneTextLayoutView oneTextLayoutView = (OneTextLayoutView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                if (oneTextLayoutView != null) {
                                                                                                                                                                    i = R.id.productSubDistrictTextLayoutView;
                                                                                                                                                                    OneTextLayoutView oneTextLayoutView2 = (OneTextLayoutView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                    if (oneTextLayoutView2 != null) {
                                                                                                                                                                        i = R.id.shopSubDistrictTextLayoutView;
                                                                                                                                                                        OneTextLayoutView oneTextLayoutView3 = (OneTextLayoutView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                        if (oneTextLayoutView3 != null) {
                                                                                                                                                                            i = R.id.taxSubDistrictTextLayoutView;
                                                                                                                                                                            OneTextLayoutView oneTextLayoutView4 = (OneTextLayoutView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                            if (oneTextLayoutView4 != null) {
                                                                                                                                                                                i = R.id.tilMailAddress1Title;
                                                                                                                                                                                TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                if (textInputLayout != null) {
                                                                                                                                                                                    i = R.id.tilMailAddress2Title;
                                                                                                                                                                                    TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                    if (textInputLayout2 != null) {
                                                                                                                                                                                        i = R.id.tilMailPostcode;
                                                                                                                                                                                        TextInputLayout textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                        if (textInputLayout3 != null) {
                                                                                                                                                                                            i = R.id.tilProductAddress1Title;
                                                                                                                                                                                            TextInputLayout textInputLayout4 = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                            if (textInputLayout4 != null) {
                                                                                                                                                                                                i = R.id.tilProductAddress2Title;
                                                                                                                                                                                                TextInputLayout textInputLayout5 = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                if (textInputLayout5 != null) {
                                                                                                                                                                                                    i = R.id.tilProductPostcode;
                                                                                                                                                                                                    TextInputLayout textInputLayout6 = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                    if (textInputLayout6 != null) {
                                                                                                                                                                                                        i = R.id.tilShopAddress1Title;
                                                                                                                                                                                                        TextInputLayout textInputLayout7 = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                        if (textInputLayout7 != null) {
                                                                                                                                                                                                            i = R.id.tilShopAddress2Title;
                                                                                                                                                                                                            TextInputLayout textInputLayout8 = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                            if (textInputLayout8 != null) {
                                                                                                                                                                                                                i = R.id.tilShopPostcode;
                                                                                                                                                                                                                TextInputLayout textInputLayout9 = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                if (textInputLayout9 != null) {
                                                                                                                                                                                                                    i = R.id.tilTaxAddress1Title;
                                                                                                                                                                                                                    TextInputLayout textInputLayout10 = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                    if (textInputLayout10 != null) {
                                                                                                                                                                                                                        i = R.id.tilTaxAddress2Title;
                                                                                                                                                                                                                        TextInputLayout textInputLayout11 = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                        if (textInputLayout11 != null) {
                                                                                                                                                                                                                            i = R.id.tilTaxPostcode;
                                                                                                                                                                                                                            TextInputLayout textInputLayout12 = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                            if (textInputLayout12 != null) {
                                                                                                                                                                                                                                i = R.id.tvMailAddressSame;
                                                                                                                                                                                                                                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                if (oneFontTextView != null) {
                                                                                                                                                                                                                                    i = R.id.tvMailDistrict;
                                                                                                                                                                                                                                    OneSelectLayout oneSelectLayout = (OneSelectLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                    if (oneSelectLayout != null) {
                                                                                                                                                                                                                                        i = R.id.tvMailOtherAddressSelect;
                                                                                                                                                                                                                                        OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                        if (oneFontTextView2 != null) {
                                                                                                                                                                                                                                            i = R.id.tvMailProvince;
                                                                                                                                                                                                                                            OneSelectLayout oneSelectLayout2 = (OneSelectLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                            if (oneSelectLayout2 != null) {
                                                                                                                                                                                                                                                i = R.id.tvProductAddressSame;
                                                                                                                                                                                                                                                OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                                if (oneFontTextView3 != null) {
                                                                                                                                                                                                                                                    i = R.id.tvProductDistrict;
                                                                                                                                                                                                                                                    OneSelectLayout oneSelectLayout3 = (OneSelectLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                                    if (oneSelectLayout3 != null) {
                                                                                                                                                                                                                                                        i = R.id.tvProductOtherAddressSelect;
                                                                                                                                                                                                                                                        OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                                        if (oneFontTextView4 != null) {
                                                                                                                                                                                                                                                            i = R.id.tvProductProvince;
                                                                                                                                                                                                                                                            OneSelectLayout oneSelectLayout4 = (OneSelectLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                                            if (oneSelectLayout4 != null) {
                                                                                                                                                                                                                                                                i = R.id.tvShopDistrict;
                                                                                                                                                                                                                                                                OneSelectLayout oneSelectLayout5 = (OneSelectLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                                                if (oneSelectLayout5 != null) {
                                                                                                                                                                                                                                                                    i = R.id.tvShopProvince;
                                                                                                                                                                                                                                                                    OneSelectLayout oneSelectLayout6 = (OneSelectLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                                                    if (oneSelectLayout6 != null) {
                                                                                                                                                                                                                                                                        i = R.id.tvTaxAddressSame;
                                                                                                                                                                                                                                                                        OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                                                        if (oneFontTextView5 != null) {
                                                                                                                                                                                                                                                                            i = R.id.tvTaxDistrict;
                                                                                                                                                                                                                                                                            OneSelectLayout oneSelectLayout7 = (OneSelectLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                                                            if (oneSelectLayout7 != null) {
                                                                                                                                                                                                                                                                                i = R.id.tvTaxOtherAddressSelect;
                                                                                                                                                                                                                                                                                OneFontTextView oneFontTextView6 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                                                                if (oneFontTextView6 != null) {
                                                                                                                                                                                                                                                                                    i = R.id.tvTaxProvince;
                                                                                                                                                                                                                                                                                    OneSelectLayout oneSelectLayout8 = (OneSelectLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                                                                    if (oneSelectLayout8 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.vBackground))) != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.vLineSeparateMailAddress1))) != null && (findChildViewById3 = ViewBindings.findChildViewById(view, (i = R.id.vLineSeparateMailDistrict))) != null && (findChildViewById4 = ViewBindings.findChildViewById(view, (i = R.id.vLineSeparateMailPostcode))) != null && (findChildViewById5 = ViewBindings.findChildViewById(view, (i = R.id.vLineSeparateMailProvince))) != null && (findChildViewById6 = ViewBindings.findChildViewById(view, (i = R.id.vLineSeparateMailSubDistrict))) != null && (findChildViewById7 = ViewBindings.findChildViewById(view, (i = R.id.vLineSeparateProductAddress1))) != null && (findChildViewById8 = ViewBindings.findChildViewById(view, (i = R.id.vLineSeparateProductDistrict))) != null && (findChildViewById9 = ViewBindings.findChildViewById(view, (i = R.id.vLineSeparateProductPostcode))) != null && (findChildViewById10 = ViewBindings.findChildViewById(view, (i = R.id.vLineSeparateProductProvince))) != null && (findChildViewById11 = ViewBindings.findChildViewById(view, (i = R.id.vLineSeparateProductSubDistrict))) != null && (findChildViewById12 = ViewBindings.findChildViewById(view, (i = R.id.vLineSeparateShopAddress1))) != null && (findChildViewById13 = ViewBindings.findChildViewById(view, (i = R.id.vLineSeparateShopDistrict))) != null && (findChildViewById14 = ViewBindings.findChildViewById(view, (i = R.id.vLineSeparateShopPostcode))) != null && (findChildViewById15 = ViewBindings.findChildViewById(view, (i = R.id.vLineSeparateShopProvince))) != null && (findChildViewById16 = ViewBindings.findChildViewById(view, (i = R.id.vLineSeparateShopSubDistrict))) != null && (findChildViewById17 = ViewBindings.findChildViewById(view, (i = R.id.vLineSeparateTaxAddress1))) != null && (findChildViewById18 = ViewBindings.findChildViewById(view, (i = R.id.vLineSeparateTaxDistrict))) != null && (findChildViewById19 = ViewBindings.findChildViewById(view, (i = R.id.vLineSeparateTaxPostcode))) != null && (findChildViewById20 = ViewBindings.findChildViewById(view, (i = R.id.vLineSeparateTaxProvince))) != null && (findChildViewById21 = ViewBindings.findChildViewById(view, (i = R.id.vLineSeparateTaxSubDistrict))) != null && (findChildViewById22 = ViewBindings.findChildViewById(view, (i = R.id.vLineSeparateTopMailPostcode))) != null && (findChildViewById23 = ViewBindings.findChildViewById(view, (i = R.id.vLineSeparateTopProductPostcode))) != null && (findChildViewById24 = ViewBindings.findChildViewById(view, (i = R.id.vLineSeparateTopTaxPostcode))) != null) {
                                                                                                                                                                                                                                                                                        return new FragmentOneOnlineRegistChooseAddressBinding((ConstraintLayout) view, oneFontButton, oneCustomClearableEditText, oneCustomClearableEditText2, oneCustomClearableEditText3, oneCustomClearableEditText4, oneCustomClearableEditText5, oneCustomClearableEditText6, oneCustomClearableEditText7, oneCustomClearableEditText8, oneCustomClearableEditText9, oneCustomClearableEditText10, oneCustomClearableEditText11, oneCustomClearableEditText12, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, imageView10, imageView11, imageView12, linearLayoutCompat, linearLayoutCompat2, linearLayoutCompat3, linearLayoutCompat4, linearLayoutCompat5, linearLayoutCompat6, linearLayoutCompat7, linearLayoutCompat8, linearLayoutCompat9, linearLayoutCompat10, linearLayoutCompat11, linearLayoutCompat12, linearLayoutCompat13, oneTextLayoutView, oneTextLayoutView2, oneTextLayoutView3, oneTextLayoutView4, textInputLayout, textInputLayout2, textInputLayout3, textInputLayout4, textInputLayout5, textInputLayout6, textInputLayout7, textInputLayout8, textInputLayout9, textInputLayout10, textInputLayout11, textInputLayout12, oneFontTextView, oneSelectLayout, oneFontTextView2, oneSelectLayout2, oneFontTextView3, oneSelectLayout3, oneFontTextView4, oneSelectLayout4, oneSelectLayout5, oneSelectLayout6, oneFontTextView5, oneSelectLayout7, oneFontTextView6, oneSelectLayout8, findChildViewById, findChildViewById2, findChildViewById3, findChildViewById4, findChildViewById5, findChildViewById6, findChildViewById7, findChildViewById8, findChildViewById9, findChildViewById10, findChildViewById11, findChildViewById12, findChildViewById13, findChildViewById14, findChildViewById15, findChildViewById16, findChildViewById17, findChildViewById18, findChildViewById19, findChildViewById20, findChildViewById21, findChildViewById22, findChildViewById23, findChildViewById24);
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
    public static FragmentOneOnlineRegistChooseAddressBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneOnlineRegistChooseAddressBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_online_regist_choose_address, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84096a;
    }
}