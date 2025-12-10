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
import th.p047co.dtac.android.dtacone.widget.view.DtacCardView;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZPackageItemRowBinding */
/* loaded from: classes7.dex */
public final class ZPackageItemRowBinding implements ViewBinding {

    /* renamed from: a */
    public final DtacCardView f84789a;
    @NonNull
    public final DtacCardView cvPackageList;
    @NonNull
    public final LinearLayout dtacBox;
    @NonNull
    public final DtacFontTextView packageListTvDtacInfo;
    @NonNull
    public final DtacFontTextView packageListTvDtacUnit;
    @NonNull
    public final DtacFontTextView packageListTvPackageDataInfo;
    @NonNull
    public final DtacFontTextView packageListTvPackageDataUnit;
    @NonNull
    public final DtacFontTextView packageListTvPackageSetInfo;
    @NonNull
    public final DtacFontTextView packageListTvPackageSetTitle;
    @NonNull
    public final DtacFontTextView packageListTvPackageVoiceInfo;
    @NonNull
    public final DtacFontTextView packageListTvPackageVoiceUnit;
    @NonNull
    public final DtacFontTextView packageListTvPackageWifiInfo;
    @NonNull
    public final DtacFontTextView packageListTvPackageWifiUnit;
    @NonNull
    public final DtacFontTextView packageListTvPrice;
    @NonNull
    public final RelativeLayout priceBox;
    @NonNull
    public final DtacFontTextView tvPrice;
    @NonNull
    public final LinearLayout voiceBox;
    @NonNull
    public final LinearLayout voiceData;
    @NonNull
    public final LinearLayout wifiData;

    public ZPackageItemRowBinding(DtacCardView dtacCardView, DtacCardView dtacCardView2, LinearLayout linearLayout, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5, DtacFontTextView dtacFontTextView6, DtacFontTextView dtacFontTextView7, DtacFontTextView dtacFontTextView8, DtacFontTextView dtacFontTextView9, DtacFontTextView dtacFontTextView10, DtacFontTextView dtacFontTextView11, RelativeLayout relativeLayout, DtacFontTextView dtacFontTextView12, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4) {
        this.f84789a = dtacCardView;
        this.cvPackageList = dtacCardView2;
        this.dtacBox = linearLayout;
        this.packageListTvDtacInfo = dtacFontTextView;
        this.packageListTvDtacUnit = dtacFontTextView2;
        this.packageListTvPackageDataInfo = dtacFontTextView3;
        this.packageListTvPackageDataUnit = dtacFontTextView4;
        this.packageListTvPackageSetInfo = dtacFontTextView5;
        this.packageListTvPackageSetTitle = dtacFontTextView6;
        this.packageListTvPackageVoiceInfo = dtacFontTextView7;
        this.packageListTvPackageVoiceUnit = dtacFontTextView8;
        this.packageListTvPackageWifiInfo = dtacFontTextView9;
        this.packageListTvPackageWifiUnit = dtacFontTextView10;
        this.packageListTvPrice = dtacFontTextView11;
        this.priceBox = relativeLayout;
        this.tvPrice = dtacFontTextView12;
        this.voiceBox = linearLayout2;
        this.voiceData = linearLayout3;
        this.wifiData = linearLayout4;
    }

    @NonNull
    public static ZPackageItemRowBinding bind(@NonNull View view) {
        DtacCardView dtacCardView = (DtacCardView) view;
        int i = R.id.dtacBox;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.package_list_tv_dtac_info;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView != null) {
                i = R.id.package_list_tv_dtac_unit;
                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView2 != null) {
                    i = R.id.package_list_tv_package_data_info;
                    DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView3 != null) {
                        i = R.id.package_list_tv_package_data_unit;
                        DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView4 != null) {
                            i = R.id.package_list_tv_package_set_info;
                            DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView5 != null) {
                                i = R.id.package_list_tv_package_set_title;
                                DtacFontTextView dtacFontTextView6 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView6 != null) {
                                    i = R.id.package_list_tv_package_voice_info;
                                    DtacFontTextView dtacFontTextView7 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView7 != null) {
                                        i = R.id.package_list_tv_package_voice_unit;
                                        DtacFontTextView dtacFontTextView8 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (dtacFontTextView8 != null) {
                                            i = R.id.package_list_tv_package_wifi_info;
                                            DtacFontTextView dtacFontTextView9 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (dtacFontTextView9 != null) {
                                                i = R.id.package_list_tv_package_wifi_unit;
                                                DtacFontTextView dtacFontTextView10 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (dtacFontTextView10 != null) {
                                                    i = R.id.package_list_tv_price;
                                                    DtacFontTextView dtacFontTextView11 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (dtacFontTextView11 != null) {
                                                        i = R.id.price_box;
                                                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                                        if (relativeLayout != null) {
                                                            i = R.id.tvPrice;
                                                            DtacFontTextView dtacFontTextView12 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                            if (dtacFontTextView12 != null) {
                                                                i = R.id.voiceBox;
                                                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                if (linearLayout2 != null) {
                                                                    i = R.id.voiceData;
                                                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                    if (linearLayout3 != null) {
                                                                        i = R.id.wifiData;
                                                                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                        if (linearLayout4 != null) {
                                                                            return new ZPackageItemRowBinding(dtacCardView, dtacCardView, linearLayout, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5, dtacFontTextView6, dtacFontTextView7, dtacFontTextView8, dtacFontTextView9, dtacFontTextView10, dtacFontTextView11, relativeLayout, dtacFontTextView12, linearLayout2, linearLayout3, linearLayout4);
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
    public static ZPackageItemRowBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZPackageItemRowBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_package_item_row, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public DtacCardView getRoot() {
        return this.f84789a;
    }
}