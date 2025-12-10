package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacCardView;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZPostpaidPackageItemRowBinding */
/* loaded from: classes7.dex */
public final class ZPostpaidPackageItemRowBinding implements ViewBinding {

    /* renamed from: a */
    public final DtacCardView f84684a;
    @NonNull
    public final AppCompatImageView appCompatImageView;
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
    public final DtacFontTextView packageListTvPackageSetTitle;
    @NonNull
    public final DtacFontTextView packageListTvPrice;
    @NonNull
    public final RelativeLayout priceBox;
    @NonNull
    public final LinearLayout storeBox;
    @NonNull
    public final DtacFontTextView tvBillCycle;
    @NonNull
    public final DtacFontTextView tvBillCycleUnit;
    @NonNull
    public final DtacFontTextView tvData;
    @NonNull
    public final DtacFontTextView tvDataUnit;
    @NonNull
    public final DtacFontTextView tvDescription;
    @NonNull
    public final DtacFontTextView tvPrice;
    @NonNull
    public final DtacFontTextView tvStorage;
    @NonNull
    public final DtacFontTextView tvStorageUnit;
    @NonNull
    public final DtacFontTextView tvVoice;
    @NonNull
    public final DtacFontTextView tvVoiceUnit;
    @NonNull
    public final DtacFontTextView tvWifi;
    @NonNull
    public final DtacFontTextView tvWifiUnit;
    @NonNull
    public final LinearLayout voiceBox;
    @NonNull
    public final LinearLayout wifiBox;

    public ZPostpaidPackageItemRowBinding(DtacCardView dtacCardView, AppCompatImageView appCompatImageView, LinearLayout linearLayout, LinearLayout linearLayout2, DtacCardView dtacCardView2, RelativeLayout relativeLayout, LinearLayout linearLayout3, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, RelativeLayout relativeLayout2, LinearLayout linearLayout4, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5, DtacFontTextView dtacFontTextView6, DtacFontTextView dtacFontTextView7, DtacFontTextView dtacFontTextView8, DtacFontTextView dtacFontTextView9, DtacFontTextView dtacFontTextView10, DtacFontTextView dtacFontTextView11, DtacFontTextView dtacFontTextView12, DtacFontTextView dtacFontTextView13, DtacFontTextView dtacFontTextView14, LinearLayout linearLayout5, LinearLayout linearLayout6) {
        this.f84684a = dtacCardView;
        this.appCompatImageView = appCompatImageView;
        this.billBox = linearLayout;
        this.callBox = linearLayout2;
        this.cvPackageList = dtacCardView2;
        this.packageBox = relativeLayout;
        this.packageInfoBox = linearLayout3;
        this.packageListTvPackageSetTitle = dtacFontTextView;
        this.packageListTvPrice = dtacFontTextView2;
        this.priceBox = relativeLayout2;
        this.storeBox = linearLayout4;
        this.tvBillCycle = dtacFontTextView3;
        this.tvBillCycleUnit = dtacFontTextView4;
        this.tvData = dtacFontTextView5;
        this.tvDataUnit = dtacFontTextView6;
        this.tvDescription = dtacFontTextView7;
        this.tvPrice = dtacFontTextView8;
        this.tvStorage = dtacFontTextView9;
        this.tvStorageUnit = dtacFontTextView10;
        this.tvVoice = dtacFontTextView11;
        this.tvVoiceUnit = dtacFontTextView12;
        this.tvWifi = dtacFontTextView13;
        this.tvWifiUnit = dtacFontTextView14;
        this.voiceBox = linearLayout5;
        this.wifiBox = linearLayout6;
    }

    @NonNull
    public static ZPostpaidPackageItemRowBinding bind(@NonNull View view) {
        int i = R.id.appCompatImageView;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.billBox;
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
                            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView != null) {
                                i = R.id.package_list_tv_price;
                                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView2 != null) {
                                    i = R.id.price_box;
                                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                    if (relativeLayout2 != null) {
                                        i = R.id.storeBox;
                                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                        if (linearLayout4 != null) {
                                            i = R.id.tvBillCycle;
                                            DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (dtacFontTextView3 != null) {
                                                i = R.id.tvBillCycleUnit;
                                                DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (dtacFontTextView4 != null) {
                                                    i = R.id.tvData;
                                                    DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (dtacFontTextView5 != null) {
                                                        i = R.id.tvDataUnit;
                                                        DtacFontTextView dtacFontTextView6 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (dtacFontTextView6 != null) {
                                                            i = R.id.tvDescription;
                                                            DtacFontTextView dtacFontTextView7 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                            if (dtacFontTextView7 != null) {
                                                                i = R.id.tvPrice;
                                                                DtacFontTextView dtacFontTextView8 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                if (dtacFontTextView8 != null) {
                                                                    i = R.id.tvStorage;
                                                                    DtacFontTextView dtacFontTextView9 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (dtacFontTextView9 != null) {
                                                                        i = R.id.tvStorageUnit;
                                                                        DtacFontTextView dtacFontTextView10 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (dtacFontTextView10 != null) {
                                                                            i = R.id.tvVoice;
                                                                            DtacFontTextView dtacFontTextView11 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (dtacFontTextView11 != null) {
                                                                                i = R.id.tvVoiceUnit;
                                                                                DtacFontTextView dtacFontTextView12 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                if (dtacFontTextView12 != null) {
                                                                                    i = R.id.tvWifi;
                                                                                    DtacFontTextView dtacFontTextView13 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (dtacFontTextView13 != null) {
                                                                                        i = R.id.tvWifiUnit;
                                                                                        DtacFontTextView dtacFontTextView14 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (dtacFontTextView14 != null) {
                                                                                            i = R.id.voiceBox;
                                                                                            LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                                            if (linearLayout5 != null) {
                                                                                                i = R.id.wifiBox;
                                                                                                LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                                                if (linearLayout6 != null) {
                                                                                                    return new ZPostpaidPackageItemRowBinding(dtacCardView, appCompatImageView, linearLayout, linearLayout2, dtacCardView, relativeLayout, linearLayout3, dtacFontTextView, dtacFontTextView2, relativeLayout2, linearLayout4, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5, dtacFontTextView6, dtacFontTextView7, dtacFontTextView8, dtacFontTextView9, dtacFontTextView10, dtacFontTextView11, dtacFontTextView12, dtacFontTextView13, dtacFontTextView14, linearLayout5, linearLayout6);
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
    public static ZPostpaidPackageItemRowBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZPostpaidPackageItemRowBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_postpaid_package_item_row, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public DtacCardView getRoot() {
        return this.f84684a;
    }
}
