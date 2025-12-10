package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacCardView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemOneSummaryPackageTrueBinding */
/* loaded from: classes7.dex */
public final class ItemOneSummaryPackageTrueBinding implements ViewBinding {

    /* renamed from: a */
    public final DtacCardView f84371a;
    @NonNull
    public final LinearLayoutCompat billCycleDataLayout;
    @NonNull
    public final OneFontTextView billCycleDataTextView;
    @NonNull
    public final OneFontTextView billCycleDataUnitTextView;
    @NonNull
    public final LinearLayoutCompat callDataLayout;
    @NonNull
    public final OneFontTextView callDataTextView;
    @NonNull
    public final OneFontTextView callDataUnitTextView;
    @NonNull
    public final LinearLayoutCompat campaignLayout;
    @NonNull
    public final OneFontTextView campaignNameTextView;
    @NonNull
    public final OneFontTextView internetSpeedDescriptionTextView;
    @NonNull
    public final LinearLayoutCompat internetSpeedLayout;
    @NonNull
    public final OneFontTextView internetSpeedTextView;
    @NonNull
    public final OneFontTextView internetSpeedUnitTextView;
    @NonNull
    public final LinearLayoutCompat packageInfoLayout;
    @NonNull
    public final LinearLayoutCompat packageLayout;
    @NonNull
    public final OneFontTextView packageNameTextView;
    @NonNull
    public final OneFontTextView packageNameTitleTextView;
    @NonNull
    public final ImageView packagePriceImageView;
    @NonNull
    public final OneFontTextView packagePriceLabelTextView;
    @NonNull
    public final ConstraintLayout packagePriceLayout;
    @NonNull
    public final OneFontTextView packagePriceTextView;
    @NonNull
    public final LinearLayoutCompat propositionLayout;
    @NonNull
    public final OneFontTextView propositionNameTextView;
    @NonNull
    public final LinearLayoutCompat storageDataLayout;
    @NonNull
    public final OneFontTextView storageDataTextView;
    @NonNull
    public final OneFontTextView storageDataUnitTextView;
    @NonNull
    public final RecyclerView summaryDescriptionRecyclerView;
    @NonNull
    public final LinearLayoutCompat wifiDataLayout;
    @NonNull
    public final OneFontTextView wifiDataTextView;
    @NonNull
    public final OneFontTextView wifiDataUnitTextView;

    public ItemOneSummaryPackageTrueBinding(DtacCardView dtacCardView, LinearLayoutCompat linearLayoutCompat, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, LinearLayoutCompat linearLayoutCompat2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, LinearLayoutCompat linearLayoutCompat3, OneFontTextView oneFontTextView5, OneFontTextView oneFontTextView6, LinearLayoutCompat linearLayoutCompat4, OneFontTextView oneFontTextView7, OneFontTextView oneFontTextView8, LinearLayoutCompat linearLayoutCompat5, LinearLayoutCompat linearLayoutCompat6, OneFontTextView oneFontTextView9, OneFontTextView oneFontTextView10, ImageView imageView, OneFontTextView oneFontTextView11, ConstraintLayout constraintLayout, OneFontTextView oneFontTextView12, LinearLayoutCompat linearLayoutCompat7, OneFontTextView oneFontTextView13, LinearLayoutCompat linearLayoutCompat8, OneFontTextView oneFontTextView14, OneFontTextView oneFontTextView15, RecyclerView recyclerView, LinearLayoutCompat linearLayoutCompat9, OneFontTextView oneFontTextView16, OneFontTextView oneFontTextView17) {
        this.f84371a = dtacCardView;
        this.billCycleDataLayout = linearLayoutCompat;
        this.billCycleDataTextView = oneFontTextView;
        this.billCycleDataUnitTextView = oneFontTextView2;
        this.callDataLayout = linearLayoutCompat2;
        this.callDataTextView = oneFontTextView3;
        this.callDataUnitTextView = oneFontTextView4;
        this.campaignLayout = linearLayoutCompat3;
        this.campaignNameTextView = oneFontTextView5;
        this.internetSpeedDescriptionTextView = oneFontTextView6;
        this.internetSpeedLayout = linearLayoutCompat4;
        this.internetSpeedTextView = oneFontTextView7;
        this.internetSpeedUnitTextView = oneFontTextView8;
        this.packageInfoLayout = linearLayoutCompat5;
        this.packageLayout = linearLayoutCompat6;
        this.packageNameTextView = oneFontTextView9;
        this.packageNameTitleTextView = oneFontTextView10;
        this.packagePriceImageView = imageView;
        this.packagePriceLabelTextView = oneFontTextView11;
        this.packagePriceLayout = constraintLayout;
        this.packagePriceTextView = oneFontTextView12;
        this.propositionLayout = linearLayoutCompat7;
        this.propositionNameTextView = oneFontTextView13;
        this.storageDataLayout = linearLayoutCompat8;
        this.storageDataTextView = oneFontTextView14;
        this.storageDataUnitTextView = oneFontTextView15;
        this.summaryDescriptionRecyclerView = recyclerView;
        this.wifiDataLayout = linearLayoutCompat9;
        this.wifiDataTextView = oneFontTextView16;
        this.wifiDataUnitTextView = oneFontTextView17;
    }

    @NonNull
    public static ItemOneSummaryPackageTrueBinding bind(@NonNull View view) {
        int i = R.id.billCycleDataLayout;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
        if (linearLayoutCompat != null) {
            i = R.id.billCycleDataTextView;
            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView != null) {
                i = R.id.billCycleDataUnitTextView;
                OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView2 != null) {
                    i = R.id.callDataLayout;
                    LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                    if (linearLayoutCompat2 != null) {
                        i = R.id.callDataTextView;
                        OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView3 != null) {
                            i = R.id.callDataUnitTextView;
                            OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView4 != null) {
                                i = R.id.campaignLayout;
                                LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                if (linearLayoutCompat3 != null) {
                                    i = R.id.campaignNameTextView;
                                    OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (oneFontTextView5 != null) {
                                        i = R.id.internetSpeedDescriptionTextView;
                                        OneFontTextView oneFontTextView6 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (oneFontTextView6 != null) {
                                            i = R.id.internetSpeedLayout;
                                            LinearLayoutCompat linearLayoutCompat4 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                            if (linearLayoutCompat4 != null) {
                                                i = R.id.internetSpeedTextView;
                                                OneFontTextView oneFontTextView7 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (oneFontTextView7 != null) {
                                                    i = R.id.internetSpeedUnitTextView;
                                                    OneFontTextView oneFontTextView8 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (oneFontTextView8 != null) {
                                                        i = R.id.packageInfoLayout;
                                                        LinearLayoutCompat linearLayoutCompat5 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                                        if (linearLayoutCompat5 != null) {
                                                            i = R.id.packageLayout;
                                                            LinearLayoutCompat linearLayoutCompat6 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                                            if (linearLayoutCompat6 != null) {
                                                                i = R.id.packageNameTextView;
                                                                OneFontTextView oneFontTextView9 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                if (oneFontTextView9 != null) {
                                                                    i = R.id.packageNameTitleTextView;
                                                                    OneFontTextView oneFontTextView10 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (oneFontTextView10 != null) {
                                                                        i = R.id.packagePriceImageView;
                                                                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                        if (imageView != null) {
                                                                            i = R.id.packagePriceLabelTextView;
                                                                            OneFontTextView oneFontTextView11 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (oneFontTextView11 != null) {
                                                                                i = R.id.packagePriceLayout;
                                                                                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                                if (constraintLayout != null) {
                                                                                    i = R.id.packagePriceTextView;
                                                                                    OneFontTextView oneFontTextView12 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (oneFontTextView12 != null) {
                                                                                        i = R.id.propositionLayout;
                                                                                        LinearLayoutCompat linearLayoutCompat7 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                                                                        if (linearLayoutCompat7 != null) {
                                                                                            i = R.id.propositionNameTextView;
                                                                                            OneFontTextView oneFontTextView13 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                            if (oneFontTextView13 != null) {
                                                                                                i = R.id.storageDataLayout;
                                                                                                LinearLayoutCompat linearLayoutCompat8 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                                                                                if (linearLayoutCompat8 != null) {
                                                                                                    i = R.id.storageDataTextView;
                                                                                                    OneFontTextView oneFontTextView14 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                    if (oneFontTextView14 != null) {
                                                                                                        i = R.id.storageDataUnitTextView;
                                                                                                        OneFontTextView oneFontTextView15 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                        if (oneFontTextView15 != null) {
                                                                                                            i = R.id.summaryDescriptionRecyclerView;
                                                                                                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                                                                            if (recyclerView != null) {
                                                                                                                i = R.id.wifiDataLayout;
                                                                                                                LinearLayoutCompat linearLayoutCompat9 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                                                                                                if (linearLayoutCompat9 != null) {
                                                                                                                    i = R.id.wifiDataTextView;
                                                                                                                    OneFontTextView oneFontTextView16 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                    if (oneFontTextView16 != null) {
                                                                                                                        i = R.id.wifiDataUnitTextView;
                                                                                                                        OneFontTextView oneFontTextView17 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                        if (oneFontTextView17 != null) {
                                                                                                                            return new ItemOneSummaryPackageTrueBinding((DtacCardView) view, linearLayoutCompat, oneFontTextView, oneFontTextView2, linearLayoutCompat2, oneFontTextView3, oneFontTextView4, linearLayoutCompat3, oneFontTextView5, oneFontTextView6, linearLayoutCompat4, oneFontTextView7, oneFontTextView8, linearLayoutCompat5, linearLayoutCompat6, oneFontTextView9, oneFontTextView10, imageView, oneFontTextView11, constraintLayout, oneFontTextView12, linearLayoutCompat7, oneFontTextView13, linearLayoutCompat8, oneFontTextView14, oneFontTextView15, recyclerView, linearLayoutCompat9, oneFontTextView16, oneFontTextView17);
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
    public static ItemOneSummaryPackageTrueBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemOneSummaryPackageTrueBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_one_summary_package_true, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public DtacCardView getRoot() {
        return this.f84371a;
    }
}
