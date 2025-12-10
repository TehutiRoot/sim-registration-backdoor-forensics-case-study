package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZPre2postRecommendPackageItemBinding */
/* loaded from: classes7.dex */
public final class ZPre2postRecommendPackageItemBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f84688a;
    @NonNull
    public final RelativeLayout priceLayout;
    @NonNull
    public final RelativeLayout recommendPackageLayout;
    @NonNull
    public final DtacFontTextView tvPackageBillCycleDetail;
    @NonNull
    public final DtacFontTextView tvPackageDataDetail;
    @NonNull
    public final DtacFontTextView tvPackagePhoneDetail;
    @NonNull
    public final DtacFontTextView tvPackageStorageDetail;
    @NonNull
    public final DtacFontTextView tvPackageTitle;
    @NonNull
    public final DtacFontTextView tvPackageWifiDetail;
    @NonNull
    public final DtacFontTextView tvPrice;
    @NonNull
    public final DtacFontTextView tvPriceValue;

    public ZPre2postRecommendPackageItemBinding(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5, DtacFontTextView dtacFontTextView6, DtacFontTextView dtacFontTextView7, DtacFontTextView dtacFontTextView8) {
        this.f84688a = relativeLayout;
        this.priceLayout = relativeLayout2;
        this.recommendPackageLayout = relativeLayout3;
        this.tvPackageBillCycleDetail = dtacFontTextView;
        this.tvPackageDataDetail = dtacFontTextView2;
        this.tvPackagePhoneDetail = dtacFontTextView3;
        this.tvPackageStorageDetail = dtacFontTextView4;
        this.tvPackageTitle = dtacFontTextView5;
        this.tvPackageWifiDetail = dtacFontTextView6;
        this.tvPrice = dtacFontTextView7;
        this.tvPriceValue = dtacFontTextView8;
    }

    @NonNull
    public static ZPre2postRecommendPackageItemBinding bind(@NonNull View view) {
        int i = R.id.priceLayout;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
        if (relativeLayout != null) {
            RelativeLayout relativeLayout2 = (RelativeLayout) view;
            i = R.id.tvPackageBillCycleDetail;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView != null) {
                i = R.id.tvPackageDataDetail;
                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView2 != null) {
                    i = R.id.tvPackagePhoneDetail;
                    DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView3 != null) {
                        i = R.id.tvPackageStorageDetail;
                        DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView4 != null) {
                            i = R.id.tvPackageTitle;
                            DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView5 != null) {
                                i = R.id.tvPackageWifiDetail;
                                DtacFontTextView dtacFontTextView6 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView6 != null) {
                                    i = R.id.tvPrice;
                                    DtacFontTextView dtacFontTextView7 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView7 != null) {
                                        i = R.id.tvPriceValue;
                                        DtacFontTextView dtacFontTextView8 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (dtacFontTextView8 != null) {
                                            return new ZPre2postRecommendPackageItemBinding(relativeLayout2, relativeLayout, relativeLayout2, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5, dtacFontTextView6, dtacFontTextView7, dtacFontTextView8);
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
    public static ZPre2postRecommendPackageItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZPre2postRecommendPackageItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_pre2post_recommend_package_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f84688a;
    }
}
