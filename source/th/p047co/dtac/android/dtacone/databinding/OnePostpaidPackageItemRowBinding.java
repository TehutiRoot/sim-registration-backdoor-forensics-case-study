package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacCardView;

/* renamed from: th.co.dtac.android.dtacone.databinding.OnePostpaidPackageItemRowBinding */
/* loaded from: classes7.dex */
public final class OnePostpaidPackageItemRowBinding implements ViewBinding {

    /* renamed from: a */
    public final DtacCardView f84508a;
    @NonNull
    public final LinearLayout billBox;
    @NonNull
    public final LinearLayout callBox;
    @NonNull
    public final DtacCardView cvPackageList;
    @NonNull
    public final RelativeLayout packageBox;
    @NonNull
    public final LinearLayout packageInfoBox;
    @NonNull
    public final OneFontTextView packageListTvPackageSetTitle;
    @NonNull
    public final OneFontTextView packageListTvPrice;
    @NonNull
    public final RelativeLayout priceBox;
    @NonNull
    public final LinearLayout storeBox;
    @NonNull
    public final OneFontTextView tvBillCycle;
    @NonNull
    public final OneFontTextView tvBillCycleUnit;
    @NonNull
    public final OneFontTextView tvData;
    @NonNull
    public final OneFontTextView tvDataUnit;
    @NonNull
    public final OneFontTextView tvDescription;
    @NonNull
    public final OneFontTextView tvPrice;
    @NonNull
    public final OneFontTextView tvStorage;
    @NonNull
    public final OneFontTextView tvStorageUnit;
    @NonNull
    public final OneFontTextView tvVoice;
    @NonNull
    public final OneFontTextView tvVoiceUnit;
    @NonNull
    public final OneFontTextView tvWifi;
    @NonNull
    public final OneFontTextView tvWifiUnit;
    @NonNull
    public final LinearLayout voiceBox;
    @NonNull
    public final LinearLayout wifiBox;

    public OnePostpaidPackageItemRowBinding(DtacCardView dtacCardView, LinearLayout linearLayout, LinearLayout linearLayout2, DtacCardView dtacCardView2, RelativeLayout relativeLayout, LinearLayout linearLayout3, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, RelativeLayout relativeLayout2, LinearLayout linearLayout4, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5, OneFontTextView oneFontTextView6, OneFontTextView oneFontTextView7, OneFontTextView oneFontTextView8, OneFontTextView oneFontTextView9, OneFontTextView oneFontTextView10, OneFontTextView oneFontTextView11, OneFontTextView oneFontTextView12, OneFontTextView oneFontTextView13, OneFontTextView oneFontTextView14, LinearLayout linearLayout5, LinearLayout linearLayout6) {
        this.f84508a = dtacCardView;
        this.billBox = linearLayout;
        this.callBox = linearLayout2;
        this.cvPackageList = dtacCardView2;
        this.packageBox = relativeLayout;
        this.packageInfoBox = linearLayout3;
        this.packageListTvPackageSetTitle = oneFontTextView;
        this.packageListTvPrice = oneFontTextView2;
        this.priceBox = relativeLayout2;
        this.storeBox = linearLayout4;
        this.tvBillCycle = oneFontTextView3;
        this.tvBillCycleUnit = oneFontTextView4;
        this.tvData = oneFontTextView5;
        this.tvDataUnit = oneFontTextView6;
        this.tvDescription = oneFontTextView7;
        this.tvPrice = oneFontTextView8;
        this.tvStorage = oneFontTextView9;
        this.tvStorageUnit = oneFontTextView10;
        this.tvVoice = oneFontTextView11;
        this.tvVoiceUnit = oneFontTextView12;
        this.tvWifi = oneFontTextView13;
        this.tvWifiUnit = oneFontTextView14;
        this.voiceBox = linearLayout5;
        this.wifiBox = linearLayout6;
    }

    @NonNull
    public static OnePostpaidPackageItemRowBinding bind(@NonNull View view) {
        int i = R.id.billBox;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.callBox;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout2 != null) {
                DtacCardView dtacCardView = (DtacCardView) view;
                i = R.id.package_box;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                if (relativeLayout != null) {
                    i = R.id.package_info_box;
                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout3 != null) {
                        i = R.id.package_list_tv_package_set_title;
                        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView != null) {
                            i = R.id.package_list_tv_price;
                            OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView2 != null) {
                                i = R.id.price_box;
                                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                if (relativeLayout2 != null) {
                                    i = R.id.storeBox;
                                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout4 != null) {
                                        i = R.id.tvBillCycle;
                                        OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (oneFontTextView3 != null) {
                                            i = R.id.tvBillCycleUnit;
                                            OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (oneFontTextView4 != null) {
                                                i = R.id.tvData;
                                                OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (oneFontTextView5 != null) {
                                                    i = R.id.tvDataUnit;
                                                    OneFontTextView oneFontTextView6 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (oneFontTextView6 != null) {
                                                        i = R.id.tvDescription;
                                                        OneFontTextView oneFontTextView7 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (oneFontTextView7 != null) {
                                                            i = R.id.tvPrice;
                                                            OneFontTextView oneFontTextView8 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                            if (oneFontTextView8 != null) {
                                                                i = R.id.tvStorage;
                                                                OneFontTextView oneFontTextView9 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                if (oneFontTextView9 != null) {
                                                                    i = R.id.tvStorageUnit;
                                                                    OneFontTextView oneFontTextView10 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (oneFontTextView10 != null) {
                                                                        i = R.id.tvVoice;
                                                                        OneFontTextView oneFontTextView11 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (oneFontTextView11 != null) {
                                                                            i = R.id.tvVoiceUnit;
                                                                            OneFontTextView oneFontTextView12 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (oneFontTextView12 != null) {
                                                                                i = R.id.tvWifi;
                                                                                OneFontTextView oneFontTextView13 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                if (oneFontTextView13 != null) {
                                                                                    i = R.id.tvWifiUnit;
                                                                                    OneFontTextView oneFontTextView14 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (oneFontTextView14 != null) {
                                                                                        i = R.id.voiceBox;
                                                                                        LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                                        if (linearLayout5 != null) {
                                                                                            i = R.id.wifiBox;
                                                                                            LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                                            if (linearLayout6 != null) {
                                                                                                return new OnePostpaidPackageItemRowBinding(dtacCardView, linearLayout, linearLayout2, dtacCardView, relativeLayout, linearLayout3, oneFontTextView, oneFontTextView2, relativeLayout2, linearLayout4, oneFontTextView3, oneFontTextView4, oneFontTextView5, oneFontTextView6, oneFontTextView7, oneFontTextView8, oneFontTextView9, oneFontTextView10, oneFontTextView11, oneFontTextView12, oneFontTextView13, oneFontTextView14, linearLayout5, linearLayout6);
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
    public static OnePostpaidPackageItemRowBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OnePostpaidPackageItemRowBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_postpaid_package_item_row, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public DtacCardView getRoot() {
        return this.f84508a;
    }
}
