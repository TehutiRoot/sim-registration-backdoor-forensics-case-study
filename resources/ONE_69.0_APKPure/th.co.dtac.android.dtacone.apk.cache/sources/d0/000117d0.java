package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.flexbox.FlexboxLayout;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemOneSummaryPackageBinding */
/* loaded from: classes7.dex */
public final class ItemOneSummaryPackageBinding implements ViewBinding {

    /* renamed from: a */
    public final CardView f84479a;
    @NonNull
    public final AppCompatImageView ivBillCycle;
    @NonNull
    public final AppCompatImageView ivData;
    @NonNull
    public final AppCompatImageView ivStorage;
    @NonNull
    public final AppCompatImageView ivVoice;
    @NonNull
    public final AppCompatImageView ivWifi;
    @NonNull
    public final LinearLayoutCompat layoutBillCycleData;
    @NonNull
    public final RelativeLayout layoutMainData;
    @NonNull
    public final ConstraintLayout layoutPackageDesc;
    @NonNull
    public final FlexboxLayout layoutPackageName;
    @NonNull
    public final LinearLayoutCompat layoutStorageData;
    @NonNull
    public final LinearLayoutCompat layoutVoiceBox;
    @NonNull
    public final LinearLayoutCompat layoutVoiceData;
    @NonNull
    public final LinearLayoutCompat layoutWifiData;
    @NonNull
    public final OneFontTextView packageBillCycleDataTitleTextView;
    @NonNull
    public final OneFontTextView packageBillCycleDataUnitTextView;
    @NonNull
    public final OneFontTextView packageDescTextView;
    @NonNull
    public final OneFontTextView packagePriceValueTextView;
    @NonNull
    public final OneFontTextView packageStorageDataTitleTextView;
    @NonNull
    public final OneFontTextView packageStorageDataUnitTextView;
    @NonNull
    public final OneFontTextView packageTitleTextView;
    @NonNull
    public final OneFontTextView packageVoiceBoxTitleTextView;
    @NonNull
    public final OneFontTextView packageVoiceBoxUnitTextView;
    @NonNull
    public final OneFontTextView packageVoiceDataTitleTextView;
    @NonNull
    public final OneFontTextView packageVoiceDataUnitTextView;
    @NonNull
    public final OneFontTextView packageWifiDataTitleTextView;
    @NonNull
    public final OneFontTextView packageWifiDataUnitTextView;
    @NonNull
    public final ConstraintLayout priceLayout;
    @NonNull
    public final OneFontTextView priceTitleTextView;
    @NonNull
    public final OneFontTextView tvBullet;

    public ItemOneSummaryPackageBinding(CardView cardView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, AppCompatImageView appCompatImageView5, LinearLayoutCompat linearLayoutCompat, RelativeLayout relativeLayout, ConstraintLayout constraintLayout, FlexboxLayout flexboxLayout, LinearLayoutCompat linearLayoutCompat2, LinearLayoutCompat linearLayoutCompat3, LinearLayoutCompat linearLayoutCompat4, LinearLayoutCompat linearLayoutCompat5, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5, OneFontTextView oneFontTextView6, OneFontTextView oneFontTextView7, OneFontTextView oneFontTextView8, OneFontTextView oneFontTextView9, OneFontTextView oneFontTextView10, OneFontTextView oneFontTextView11, OneFontTextView oneFontTextView12, OneFontTextView oneFontTextView13, ConstraintLayout constraintLayout2, OneFontTextView oneFontTextView14, OneFontTextView oneFontTextView15) {
        this.f84479a = cardView;
        this.ivBillCycle = appCompatImageView;
        this.ivData = appCompatImageView2;
        this.ivStorage = appCompatImageView3;
        this.ivVoice = appCompatImageView4;
        this.ivWifi = appCompatImageView5;
        this.layoutBillCycleData = linearLayoutCompat;
        this.layoutMainData = relativeLayout;
        this.layoutPackageDesc = constraintLayout;
        this.layoutPackageName = flexboxLayout;
        this.layoutStorageData = linearLayoutCompat2;
        this.layoutVoiceBox = linearLayoutCompat3;
        this.layoutVoiceData = linearLayoutCompat4;
        this.layoutWifiData = linearLayoutCompat5;
        this.packageBillCycleDataTitleTextView = oneFontTextView;
        this.packageBillCycleDataUnitTextView = oneFontTextView2;
        this.packageDescTextView = oneFontTextView3;
        this.packagePriceValueTextView = oneFontTextView4;
        this.packageStorageDataTitleTextView = oneFontTextView5;
        this.packageStorageDataUnitTextView = oneFontTextView6;
        this.packageTitleTextView = oneFontTextView7;
        this.packageVoiceBoxTitleTextView = oneFontTextView8;
        this.packageVoiceBoxUnitTextView = oneFontTextView9;
        this.packageVoiceDataTitleTextView = oneFontTextView10;
        this.packageVoiceDataUnitTextView = oneFontTextView11;
        this.packageWifiDataTitleTextView = oneFontTextView12;
        this.packageWifiDataUnitTextView = oneFontTextView13;
        this.priceLayout = constraintLayout2;
        this.priceTitleTextView = oneFontTextView14;
        this.tvBullet = oneFontTextView15;
    }

    @NonNull
    public static ItemOneSummaryPackageBinding bind(@NonNull View view) {
        int i = R.id.ivBillCycle;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.ivData;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView2 != null) {
                i = R.id.ivStorage;
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView3 != null) {
                    i = R.id.ivVoice;
                    AppCompatImageView appCompatImageView4 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                    if (appCompatImageView4 != null) {
                        i = R.id.ivWifi;
                        AppCompatImageView appCompatImageView5 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                        if (appCompatImageView5 != null) {
                            i = R.id.layoutBillCycleData;
                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                            if (linearLayoutCompat != null) {
                                i = R.id.layoutMainData;
                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                if (relativeLayout != null) {
                                    i = R.id.layoutPackageDesc;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                    if (constraintLayout != null) {
                                        i = R.id.layoutPackageName;
                                        FlexboxLayout flexboxLayout = (FlexboxLayout) ViewBindings.findChildViewById(view, i);
                                        if (flexboxLayout != null) {
                                            i = R.id.layoutStorageData;
                                            LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                            if (linearLayoutCompat2 != null) {
                                                i = R.id.layoutVoiceBox;
                                                LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                                if (linearLayoutCompat3 != null) {
                                                    i = R.id.layoutVoiceData;
                                                    LinearLayoutCompat linearLayoutCompat4 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                                    if (linearLayoutCompat4 != null) {
                                                        i = R.id.layoutWifiData;
                                                        LinearLayoutCompat linearLayoutCompat5 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                                        if (linearLayoutCompat5 != null) {
                                                            i = R.id.packageBillCycleDataTitleTextView;
                                                            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                            if (oneFontTextView != null) {
                                                                i = R.id.packageBillCycleDataUnitTextView;
                                                                OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                if (oneFontTextView2 != null) {
                                                                    i = R.id.packageDescTextView;
                                                                    OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (oneFontTextView3 != null) {
                                                                        i = R.id.packagePriceValueTextView;
                                                                        OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (oneFontTextView4 != null) {
                                                                            i = R.id.packageStorageDataTitleTextView;
                                                                            OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (oneFontTextView5 != null) {
                                                                                i = R.id.packageStorageDataUnitTextView;
                                                                                OneFontTextView oneFontTextView6 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                if (oneFontTextView6 != null) {
                                                                                    i = R.id.packageTitleTextView;
                                                                                    OneFontTextView oneFontTextView7 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (oneFontTextView7 != null) {
                                                                                        i = R.id.packageVoiceBoxTitleTextView;
                                                                                        OneFontTextView oneFontTextView8 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (oneFontTextView8 != null) {
                                                                                            i = R.id.packageVoiceBoxUnitTextView;
                                                                                            OneFontTextView oneFontTextView9 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                            if (oneFontTextView9 != null) {
                                                                                                i = R.id.packageVoiceDataTitleTextView;
                                                                                                OneFontTextView oneFontTextView10 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                if (oneFontTextView10 != null) {
                                                                                                    i = R.id.packageVoiceDataUnitTextView;
                                                                                                    OneFontTextView oneFontTextView11 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                    if (oneFontTextView11 != null) {
                                                                                                        i = R.id.packageWifiDataTitleTextView;
                                                                                                        OneFontTextView oneFontTextView12 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                        if (oneFontTextView12 != null) {
                                                                                                            i = R.id.packageWifiDataUnitTextView;
                                                                                                            OneFontTextView oneFontTextView13 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                            if (oneFontTextView13 != null) {
                                                                                                                i = R.id.priceLayout;
                                                                                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                if (constraintLayout2 != null) {
                                                                                                                    i = R.id.priceTitleTextView;
                                                                                                                    OneFontTextView oneFontTextView14 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                    if (oneFontTextView14 != null) {
                                                                                                                        i = R.id.tvBullet;
                                                                                                                        OneFontTextView oneFontTextView15 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                        if (oneFontTextView15 != null) {
                                                                                                                            return new ItemOneSummaryPackageBinding((CardView) view, appCompatImageView, appCompatImageView2, appCompatImageView3, appCompatImageView4, appCompatImageView5, linearLayoutCompat, relativeLayout, constraintLayout, flexboxLayout, linearLayoutCompat2, linearLayoutCompat3, linearLayoutCompat4, linearLayoutCompat5, oneFontTextView, oneFontTextView2, oneFontTextView3, oneFontTextView4, oneFontTextView5, oneFontTextView6, oneFontTextView7, oneFontTextView8, oneFontTextView9, oneFontTextView10, oneFontTextView11, oneFontTextView12, oneFontTextView13, constraintLayout2, oneFontTextView14, oneFontTextView15);
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
    public static ItemOneSummaryPackageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemOneSummaryPackageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_one_summary_package, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CardView getRoot() {
        return this.f84479a;
    }
}