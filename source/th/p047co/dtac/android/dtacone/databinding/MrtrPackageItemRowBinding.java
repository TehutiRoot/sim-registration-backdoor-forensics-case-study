package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacCardView;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.MrtrPackageItemRowBinding */
/* loaded from: classes7.dex */
public final class MrtrPackageItemRowBinding implements ViewBinding {

    /* renamed from: a */
    public final DtacCardView f84417a;
    @NonNull
    public final DtacCardView cardViewPackageItem;
    @NonNull
    public final AppCompatImageView ivData;
    @NonNull
    public final AppCompatImageView ivVoice;
    @NonNull
    public final AppCompatImageView ivWifi;
    @NonNull
    public final RelativeLayout layoutPrice;
    @NonNull
    public final LinearLayoutCompat layoutVoiceBox;
    @NonNull
    public final LinearLayoutCompat layoutVoiceData;
    @NonNull
    public final LinearLayoutCompat layoutWifiData;
    @NonNull
    public final DtacFontTextView tvPackageName;
    @NonNull
    public final DtacFontTextView tvPrice;
    @NonNull
    public final DtacFontTextView tvPriceValue;
    @NonNull
    public final DtacFontTextView tvVoiceBoxValue;
    @NonNull
    public final DtacFontTextView tvVoiceDataValue;
    @NonNull
    public final DtacFontTextView tvWifiDataValue;

    public MrtrPackageItemRowBinding(DtacCardView dtacCardView, DtacCardView dtacCardView2, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, RelativeLayout relativeLayout, LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2, LinearLayoutCompat linearLayoutCompat3, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5, DtacFontTextView dtacFontTextView6) {
        this.f84417a = dtacCardView;
        this.cardViewPackageItem = dtacCardView2;
        this.ivData = appCompatImageView;
        this.ivVoice = appCompatImageView2;
        this.ivWifi = appCompatImageView3;
        this.layoutPrice = relativeLayout;
        this.layoutVoiceBox = linearLayoutCompat;
        this.layoutVoiceData = linearLayoutCompat2;
        this.layoutWifiData = linearLayoutCompat3;
        this.tvPackageName = dtacFontTextView;
        this.tvPrice = dtacFontTextView2;
        this.tvPriceValue = dtacFontTextView3;
        this.tvVoiceBoxValue = dtacFontTextView4;
        this.tvVoiceDataValue = dtacFontTextView5;
        this.tvWifiDataValue = dtacFontTextView6;
    }

    @NonNull
    public static MrtrPackageItemRowBinding bind(@NonNull View view) {
        DtacCardView dtacCardView = (DtacCardView) view;
        int i = R.id.ivData;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.ivVoice;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView2 != null) {
                i = R.id.ivWifi;
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView3 != null) {
                    i = R.id.layoutPrice;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                    if (relativeLayout != null) {
                        i = R.id.layoutVoiceBox;
                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                        if (linearLayoutCompat != null) {
                            i = R.id.layoutVoiceData;
                            LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                            if (linearLayoutCompat2 != null) {
                                i = R.id.layoutWifiData;
                                LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                if (linearLayoutCompat3 != null) {
                                    i = R.id.tvPackageName;
                                    DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView != null) {
                                        i = R.id.tvPrice;
                                        DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (dtacFontTextView2 != null) {
                                            i = R.id.tvPriceValue;
                                            DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (dtacFontTextView3 != null) {
                                                i = R.id.tvVoiceBoxValue;
                                                DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (dtacFontTextView4 != null) {
                                                    i = R.id.tvVoiceDataValue;
                                                    DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (dtacFontTextView5 != null) {
                                                        i = R.id.tvWifiDataValue;
                                                        DtacFontTextView dtacFontTextView6 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (dtacFontTextView6 != null) {
                                                            return new MrtrPackageItemRowBinding(dtacCardView, dtacCardView, appCompatImageView, appCompatImageView2, appCompatImageView3, relativeLayout, linearLayoutCompat, linearLayoutCompat2, linearLayoutCompat3, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5, dtacFontTextView6);
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
    public static MrtrPackageItemRowBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static MrtrPackageItemRowBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.mrtr_package_item_row, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public DtacCardView getRoot() {
        return this.f84417a;
    }
}
