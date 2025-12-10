package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacCardView;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneMnpTruePackageItemBinding */
/* loaded from: classes7.dex */
public final class OneMnpTruePackageItemBinding implements ViewBinding {

    /* renamed from: a */
    public final DtacCardView f84494a;
    @NonNull
    public final AppCompatImageView appCompatImageView;
    @NonNull
    public final LinearLayoutCompat billCycleBoxTrue;
    @NonNull
    public final OneFontTextView campaignName;
    @NonNull
    public final DtacCardView cvPackageList;
    @NonNull
    public final LinearLayoutCompat dataBoxTrue;
    @NonNull
    public final ImageView icSale;
    @NonNull
    public final LinearLayoutCompat layoutCampaign;
    @NonNull
    public final LinearLayoutCompat layoutPackageBox;
    @NonNull
    public final LinearLayoutCompat layoutProposition;
    @NonNull
    public final ConstraintLayout packageBox;
    @NonNull
    public final LinearLayoutCompat packageInfoBox;
    @NonNull
    public final OneFontTextView packageNameTrue;
    @NonNull
    public final ConstraintLayout priceBox;
    @NonNull
    public final OneFontTextView propositionName;
    @NonNull
    public final RecyclerView rvDescListTrue;
    @NonNull
    public final LinearLayoutCompat storageBoxTrue;
    @NonNull
    public final OneFontTextView tvBillCycleTrue;
    @NonNull
    public final OneFontTextView tvBillCycleUnitTrue;
    @NonNull
    public final OneFontTextView tvDataTrue;
    @NonNull
    public final OneFontTextView tvDataUnitTrue;
    @NonNull
    public final OneFontTextView tvPackageBox;
    @NonNull
    public final OneFontTextView tvPriceLabel;
    @NonNull
    public final OneFontTextView tvPriceTrue;
    @NonNull
    public final OneFontTextView tvStorageTrue;
    @NonNull
    public final OneFontTextView tvStorageUnitTrue;
    @NonNull
    public final OneFontTextView tvVoiceTrue;
    @NonNull
    public final OneFontTextView tvVoiceUnitTrue;
    @NonNull
    public final OneFontTextView tvWifiTrue;
    @NonNull
    public final OneFontTextView tvWifiUnitTrue;
    @NonNull
    public final LinearLayoutCompat voiceBoxTrue;
    @NonNull
    public final LinearLayoutCompat wifiBoxTrue;

    public OneMnpTruePackageItemBinding(DtacCardView dtacCardView, AppCompatImageView appCompatImageView, LinearLayoutCompat linearLayoutCompat, OneFontTextView oneFontTextView, DtacCardView dtacCardView2, LinearLayoutCompat linearLayoutCompat2, ImageView imageView, LinearLayoutCompat linearLayoutCompat3, LinearLayoutCompat linearLayoutCompat4, LinearLayoutCompat linearLayoutCompat5, ConstraintLayout constraintLayout, LinearLayoutCompat linearLayoutCompat6, OneFontTextView oneFontTextView2, ConstraintLayout constraintLayout2, OneFontTextView oneFontTextView3, RecyclerView recyclerView, LinearLayoutCompat linearLayoutCompat7, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5, OneFontTextView oneFontTextView6, OneFontTextView oneFontTextView7, OneFontTextView oneFontTextView8, OneFontTextView oneFontTextView9, OneFontTextView oneFontTextView10, OneFontTextView oneFontTextView11, OneFontTextView oneFontTextView12, OneFontTextView oneFontTextView13, OneFontTextView oneFontTextView14, OneFontTextView oneFontTextView15, OneFontTextView oneFontTextView16, LinearLayoutCompat linearLayoutCompat8, LinearLayoutCompat linearLayoutCompat9) {
        this.f84494a = dtacCardView;
        this.appCompatImageView = appCompatImageView;
        this.billCycleBoxTrue = linearLayoutCompat;
        this.campaignName = oneFontTextView;
        this.cvPackageList = dtacCardView2;
        this.dataBoxTrue = linearLayoutCompat2;
        this.icSale = imageView;
        this.layoutCampaign = linearLayoutCompat3;
        this.layoutPackageBox = linearLayoutCompat4;
        this.layoutProposition = linearLayoutCompat5;
        this.packageBox = constraintLayout;
        this.packageInfoBox = linearLayoutCompat6;
        this.packageNameTrue = oneFontTextView2;
        this.priceBox = constraintLayout2;
        this.propositionName = oneFontTextView3;
        this.rvDescListTrue = recyclerView;
        this.storageBoxTrue = linearLayoutCompat7;
        this.tvBillCycleTrue = oneFontTextView4;
        this.tvBillCycleUnitTrue = oneFontTextView5;
        this.tvDataTrue = oneFontTextView6;
        this.tvDataUnitTrue = oneFontTextView7;
        this.tvPackageBox = oneFontTextView8;
        this.tvPriceLabel = oneFontTextView9;
        this.tvPriceTrue = oneFontTextView10;
        this.tvStorageTrue = oneFontTextView11;
        this.tvStorageUnitTrue = oneFontTextView12;
        this.tvVoiceTrue = oneFontTextView13;
        this.tvVoiceUnitTrue = oneFontTextView14;
        this.tvWifiTrue = oneFontTextView15;
        this.tvWifiUnitTrue = oneFontTextView16;
        this.voiceBoxTrue = linearLayoutCompat8;
        this.wifiBoxTrue = linearLayoutCompat9;
    }

    @NonNull
    public static OneMnpTruePackageItemBinding bind(@NonNull View view) {
        int i = R.id.appCompatImageView;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.billCycleBoxTrue;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
            if (linearLayoutCompat != null) {
                i = R.id.campaignName;
                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView != null) {
                    DtacCardView dtacCardView = (DtacCardView) view;
                    i = R.id.dataBoxTrue;
                    LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                    if (linearLayoutCompat2 != null) {
                        i = R.id.ic_sale;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            i = R.id.layoutCampaign;
                            LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                            if (linearLayoutCompat3 != null) {
                                i = R.id.layoutPackageBox;
                                LinearLayoutCompat linearLayoutCompat4 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                if (linearLayoutCompat4 != null) {
                                    i = R.id.layoutProposition;
                                    LinearLayoutCompat linearLayoutCompat5 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                    if (linearLayoutCompat5 != null) {
                                        i = R.id.package_box;
                                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                        if (constraintLayout != null) {
                                            i = R.id.package_info_box;
                                            LinearLayoutCompat linearLayoutCompat6 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                            if (linearLayoutCompat6 != null) {
                                                i = R.id.packageNameTrue;
                                                OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (oneFontTextView2 != null) {
                                                    i = R.id.price_box;
                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                    if (constraintLayout2 != null) {
                                                        i = R.id.propositionName;
                                                        OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (oneFontTextView3 != null) {
                                                            i = R.id.rvDescListTrue;
                                                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                            if (recyclerView != null) {
                                                                i = R.id.storageBoxTrue;
                                                                LinearLayoutCompat linearLayoutCompat7 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                                                if (linearLayoutCompat7 != null) {
                                                                    i = R.id.tvBillCycleTrue;
                                                                    OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (oneFontTextView4 != null) {
                                                                        i = R.id.tvBillCycleUnitTrue;
                                                                        OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (oneFontTextView5 != null) {
                                                                            i = R.id.tvDataTrue;
                                                                            OneFontTextView oneFontTextView6 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (oneFontTextView6 != null) {
                                                                                i = R.id.tvDataUnitTrue;
                                                                                OneFontTextView oneFontTextView7 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                if (oneFontTextView7 != null) {
                                                                                    i = R.id.tvPackageBox;
                                                                                    OneFontTextView oneFontTextView8 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (oneFontTextView8 != null) {
                                                                                        i = R.id.tvPriceLabel;
                                                                                        OneFontTextView oneFontTextView9 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (oneFontTextView9 != null) {
                                                                                            i = R.id.tvPriceTrue;
                                                                                            OneFontTextView oneFontTextView10 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                            if (oneFontTextView10 != null) {
                                                                                                i = R.id.tvStorageTrue;
                                                                                                OneFontTextView oneFontTextView11 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                if (oneFontTextView11 != null) {
                                                                                                    i = R.id.tvStorageUnitTrue;
                                                                                                    OneFontTextView oneFontTextView12 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                    if (oneFontTextView12 != null) {
                                                                                                        i = R.id.tvVoiceTrue;
                                                                                                        OneFontTextView oneFontTextView13 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                        if (oneFontTextView13 != null) {
                                                                                                            i = R.id.tvVoiceUnitTrue;
                                                                                                            OneFontTextView oneFontTextView14 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                            if (oneFontTextView14 != null) {
                                                                                                                i = R.id.tvWifiTrue;
                                                                                                                OneFontTextView oneFontTextView15 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                if (oneFontTextView15 != null) {
                                                                                                                    i = R.id.tvWifiUnitTrue;
                                                                                                                    OneFontTextView oneFontTextView16 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                    if (oneFontTextView16 != null) {
                                                                                                                        i = R.id.voiceBoxTrue;
                                                                                                                        LinearLayoutCompat linearLayoutCompat8 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                                                                                                        if (linearLayoutCompat8 != null) {
                                                                                                                            i = R.id.wifiBoxTrue;
                                                                                                                            LinearLayoutCompat linearLayoutCompat9 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                                                                                                            if (linearLayoutCompat9 != null) {
                                                                                                                                return new OneMnpTruePackageItemBinding(dtacCardView, appCompatImageView, linearLayoutCompat, oneFontTextView, dtacCardView, linearLayoutCompat2, imageView, linearLayoutCompat3, linearLayoutCompat4, linearLayoutCompat5, constraintLayout, linearLayoutCompat6, oneFontTextView2, constraintLayout2, oneFontTextView3, recyclerView, linearLayoutCompat7, oneFontTextView4, oneFontTextView5, oneFontTextView6, oneFontTextView7, oneFontTextView8, oneFontTextView9, oneFontTextView10, oneFontTextView11, oneFontTextView12, oneFontTextView13, oneFontTextView14, oneFontTextView15, oneFontTextView16, linearLayoutCompat8, linearLayoutCompat9);
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
    public static OneMnpTruePackageItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneMnpTruePackageItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_mnp_true_package_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public DtacCardView getRoot() {
        return this.f84494a;
    }
}
