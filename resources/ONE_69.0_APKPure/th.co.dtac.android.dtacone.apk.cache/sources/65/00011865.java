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
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.OnePre2postRecommendPackageItemBinding */
/* loaded from: classes7.dex */
public final class OnePre2postRecommendPackageItemBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f84628a;
    @NonNull
    public final RelativeLayout priceLayout;
    @NonNull
    public final RelativeLayout recommendPackageLayout;
    @NonNull
    public final OneFontTextView tvPackageBillCycleDetail;
    @NonNull
    public final OneFontTextView tvPackageDataDetail;
    @NonNull
    public final OneFontTextView tvPackagePhoneDetail;
    @NonNull
    public final OneFontTextView tvPackageStorageDetail;
    @NonNull
    public final OneFontTextView tvPackageTitle;
    @NonNull
    public final OneFontTextView tvPackageWifiDetail;
    @NonNull
    public final OneFontTextView tvPrice;
    @NonNull
    public final OneFontTextView tvPriceValue;

    public OnePre2postRecommendPackageItemBinding(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5, OneFontTextView oneFontTextView6, OneFontTextView oneFontTextView7, OneFontTextView oneFontTextView8) {
        this.f84628a = relativeLayout;
        this.priceLayout = relativeLayout2;
        this.recommendPackageLayout = relativeLayout3;
        this.tvPackageBillCycleDetail = oneFontTextView;
        this.tvPackageDataDetail = oneFontTextView2;
        this.tvPackagePhoneDetail = oneFontTextView3;
        this.tvPackageStorageDetail = oneFontTextView4;
        this.tvPackageTitle = oneFontTextView5;
        this.tvPackageWifiDetail = oneFontTextView6;
        this.tvPrice = oneFontTextView7;
        this.tvPriceValue = oneFontTextView8;
    }

    @NonNull
    public static OnePre2postRecommendPackageItemBinding bind(@NonNull View view) {
        int i = R.id.priceLayout;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
        if (relativeLayout != null) {
            RelativeLayout relativeLayout2 = (RelativeLayout) view;
            i = R.id.tvPackageBillCycleDetail;
            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView != null) {
                i = R.id.tvPackageDataDetail;
                OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView2 != null) {
                    i = R.id.tvPackagePhoneDetail;
                    OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView3 != null) {
                        i = R.id.tvPackageStorageDetail;
                        OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView4 != null) {
                            i = R.id.tvPackageTitle;
                            OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView5 != null) {
                                i = R.id.tvPackageWifiDetail;
                                OneFontTextView oneFontTextView6 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView6 != null) {
                                    i = R.id.tvPrice;
                                    OneFontTextView oneFontTextView7 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (oneFontTextView7 != null) {
                                        i = R.id.tvPriceValue;
                                        OneFontTextView oneFontTextView8 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (oneFontTextView8 != null) {
                                            return new OnePre2postRecommendPackageItemBinding(relativeLayout2, relativeLayout, relativeLayout2, oneFontTextView, oneFontTextView2, oneFontTextView3, oneFontTextView4, oneFontTextView5, oneFontTextView6, oneFontTextView7, oneFontTextView8);
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
    public static OnePre2postRecommendPackageItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OnePre2postRecommendPackageItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_pre2post_recommend_package_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f84628a;
    }
}