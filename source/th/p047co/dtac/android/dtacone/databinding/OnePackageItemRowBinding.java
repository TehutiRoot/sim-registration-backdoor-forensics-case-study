package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.flexbox.FlexboxLayout;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacCardView;

/* renamed from: th.co.dtac.android.dtacone.databinding.OnePackageItemRowBinding */
/* loaded from: classes7.dex */
public final class OnePackageItemRowBinding implements ViewBinding {

    /* renamed from: a */
    public final DtacCardView f84503a;
    @NonNull
    public final DtacCardView cardViewPackageItem;
    @NonNull
    public final AppCompatImageView ivData;
    @NonNull
    public final AppCompatImageView ivVoice;
    @NonNull
    public final AppCompatImageView ivWifi;
    @NonNull
    public final RelativeLayout layoutMainData;
    @NonNull
    public final ConstraintLayout layoutPackageDesc;
    @NonNull
    public final FlexboxLayout layoutPackageName;
    @NonNull
    public final RelativeLayout layoutPrice;
    @NonNull
    public final LinearLayoutCompat layoutVoiceBox;
    @NonNull
    public final LinearLayoutCompat layoutVoiceData;
    @NonNull
    public final LinearLayoutCompat layoutWifiData;
    @NonNull
    public final OneFontTextView tvBullet;
    @NonNull
    public final OneFontTextView tvPackageDesc;
    @NonNull
    public final OneFontTextView tvPackageName;
    @NonNull
    public final OneFontTextView tvPrice;
    @NonNull
    public final OneFontTextView tvPriceValue;
    @NonNull
    public final OneFontTextView tvVoiceBoxValue;
    @NonNull
    public final OneFontTextView tvVoiceDataValue;
    @NonNull
    public final OneFontTextView tvWifiDataValue;

    public OnePackageItemRowBinding(DtacCardView dtacCardView, DtacCardView dtacCardView2, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, RelativeLayout relativeLayout, ConstraintLayout constraintLayout, FlexboxLayout flexboxLayout, RelativeLayout relativeLayout2, LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2, LinearLayoutCompat linearLayoutCompat3, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5, OneFontTextView oneFontTextView6, OneFontTextView oneFontTextView7, OneFontTextView oneFontTextView8) {
        this.f84503a = dtacCardView;
        this.cardViewPackageItem = dtacCardView2;
        this.ivData = appCompatImageView;
        this.ivVoice = appCompatImageView2;
        this.ivWifi = appCompatImageView3;
        this.layoutMainData = relativeLayout;
        this.layoutPackageDesc = constraintLayout;
        this.layoutPackageName = flexboxLayout;
        this.layoutPrice = relativeLayout2;
        this.layoutVoiceBox = linearLayoutCompat;
        this.layoutVoiceData = linearLayoutCompat2;
        this.layoutWifiData = linearLayoutCompat3;
        this.tvBullet = oneFontTextView;
        this.tvPackageDesc = oneFontTextView2;
        this.tvPackageName = oneFontTextView3;
        this.tvPrice = oneFontTextView4;
        this.tvPriceValue = oneFontTextView5;
        this.tvVoiceBoxValue = oneFontTextView6;
        this.tvVoiceDataValue = oneFontTextView7;
        this.tvWifiDataValue = oneFontTextView8;
    }

    @NonNull
    public static OnePackageItemRowBinding bind(@NonNull View view) {
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
                    i = R.id.layoutMainData;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                    if (relativeLayout != null) {
                        i = R.id.layoutPackageDesc;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout != null) {
                            i = R.id.layoutPackageName;
                            FlexboxLayout flexboxLayout = (FlexboxLayout) ViewBindings.findChildViewById(view, i);
                            if (flexboxLayout != null) {
                                i = R.id.layoutPrice;
                                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                if (relativeLayout2 != null) {
                                    i = R.id.layoutVoiceBox;
                                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                    if (linearLayoutCompat != null) {
                                        i = R.id.layoutVoiceData;
                                        LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                        if (linearLayoutCompat2 != null) {
                                            i = R.id.layoutWifiData;
                                            LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                            if (linearLayoutCompat3 != null) {
                                                i = R.id.tvBullet;
                                                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (oneFontTextView != null) {
                                                    i = R.id.tvPackageDesc;
                                                    OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (oneFontTextView2 != null) {
                                                        i = R.id.tvPackageName;
                                                        OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (oneFontTextView3 != null) {
                                                            i = R.id.tvPrice;
                                                            OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                            if (oneFontTextView4 != null) {
                                                                i = R.id.tvPriceValue;
                                                                OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                if (oneFontTextView5 != null) {
                                                                    i = R.id.tvVoiceBoxValue;
                                                                    OneFontTextView oneFontTextView6 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (oneFontTextView6 != null) {
                                                                        i = R.id.tvVoiceDataValue;
                                                                        OneFontTextView oneFontTextView7 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (oneFontTextView7 != null) {
                                                                            i = R.id.tvWifiDataValue;
                                                                            OneFontTextView oneFontTextView8 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (oneFontTextView8 != null) {
                                                                                return new OnePackageItemRowBinding(dtacCardView, dtacCardView, appCompatImageView, appCompatImageView2, appCompatImageView3, relativeLayout, constraintLayout, flexboxLayout, relativeLayout2, linearLayoutCompat, linearLayoutCompat2, linearLayoutCompat3, oneFontTextView, oneFontTextView2, oneFontTextView3, oneFontTextView4, oneFontTextView5, oneFontTextView6, oneFontTextView7, oneFontTextView8);
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
    public static OnePackageItemRowBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OnePackageItemRowBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_package_item_row, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public DtacCardView getRoot() {
        return this.f84503a;
    }
}
