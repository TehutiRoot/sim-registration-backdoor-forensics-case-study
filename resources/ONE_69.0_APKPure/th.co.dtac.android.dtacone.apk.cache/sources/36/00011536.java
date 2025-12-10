package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.loading.DtacSwipeRefresh;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacPhoneBookEditText;
import th.p047co.dtac.android.dtacone.widget.view.DtacRadioButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacRecyclerView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentEpinPricelistBinding */
/* loaded from: classes7.dex */
public final class FragmentEpinPricelistBinding implements ViewBinding {

    /* renamed from: a */
    public final DtacSwipeRefresh f83812a;
    @NonNull
    public final ZBalanceBoxBinding balanceBox;
    @NonNull
    public final DtacFontButton btnConfirm;
    @NonNull
    public final LinearLayout epinBanner;
    @NonNull
    public final ImageView epinBannerBg;
    @NonNull
    public final DtacPhoneBookEditText epinEdtSubscriberNumber;
    @NonNull
    public final ImageView ivEPIN;
    @NonNull
    public final RadioGroup rdbGroupPrice;
    @NonNull
    public final DtacRadioButton rdbPrice;
    @NonNull
    public final LinearLayout rootLayout;
    @NonNull
    public final DtacRecyclerView rvPrices;
    @NonNull
    public final DtacSwipeRefresh swipeRefresh;

    public FragmentEpinPricelistBinding(DtacSwipeRefresh dtacSwipeRefresh, ZBalanceBoxBinding zBalanceBoxBinding, DtacFontButton dtacFontButton, LinearLayout linearLayout, ImageView imageView, DtacPhoneBookEditText dtacPhoneBookEditText, ImageView imageView2, RadioGroup radioGroup, DtacRadioButton dtacRadioButton, LinearLayout linearLayout2, DtacRecyclerView dtacRecyclerView, DtacSwipeRefresh dtacSwipeRefresh2) {
        this.f83812a = dtacSwipeRefresh;
        this.balanceBox = zBalanceBoxBinding;
        this.btnConfirm = dtacFontButton;
        this.epinBanner = linearLayout;
        this.epinBannerBg = imageView;
        this.epinEdtSubscriberNumber = dtacPhoneBookEditText;
        this.ivEPIN = imageView2;
        this.rdbGroupPrice = radioGroup;
        this.rdbPrice = dtacRadioButton;
        this.rootLayout = linearLayout2;
        this.rvPrices = dtacRecyclerView;
        this.swipeRefresh = dtacSwipeRefresh2;
    }

    @NonNull
    public static FragmentEpinPricelistBinding bind(@NonNull View view) {
        int i = R.id.balance_box;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            ZBalanceBoxBinding bind = ZBalanceBoxBinding.bind(findChildViewById);
            i = R.id.btnConfirm;
            DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
            if (dtacFontButton != null) {
                i = R.id.epin_banner;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = R.id.epin_banner_bg;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R.id.epin_edt_subscriber_number;
                        DtacPhoneBookEditText dtacPhoneBookEditText = (DtacPhoneBookEditText) ViewBindings.findChildViewById(view, i);
                        if (dtacPhoneBookEditText != null) {
                            i = R.id.ivEPIN;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView2 != null) {
                                i = R.id.rdbGroupPrice;
                                RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, i);
                                if (radioGroup != null) {
                                    i = R.id.rdbPrice;
                                    DtacRadioButton dtacRadioButton = (DtacRadioButton) ViewBindings.findChildViewById(view, i);
                                    if (dtacRadioButton != null) {
                                        i = R.id.rootLayout;
                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                        if (linearLayout2 != null) {
                                            i = R.id.rvPrices;
                                            DtacRecyclerView dtacRecyclerView = (DtacRecyclerView) ViewBindings.findChildViewById(view, i);
                                            if (dtacRecyclerView != null) {
                                                DtacSwipeRefresh dtacSwipeRefresh = (DtacSwipeRefresh) view;
                                                return new FragmentEpinPricelistBinding(dtacSwipeRefresh, bind, dtacFontButton, linearLayout, imageView, dtacPhoneBookEditText, imageView2, radioGroup, dtacRadioButton, linearLayout2, dtacRecyclerView, dtacSwipeRefresh);
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
    public static FragmentEpinPricelistBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentEpinPricelistBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_epin_pricelist, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public DtacSwipeRefresh getRoot() {
        return this.f83812a;
    }
}