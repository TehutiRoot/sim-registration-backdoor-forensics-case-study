package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.WrapContentHeightViewPager;

/* renamed from: th.co.dtac.android.dtacone.databinding.CustomAlertDialogBannerBinding */
/* loaded from: classes7.dex */
public final class CustomAlertDialogBannerBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f83703a;
    @NonNull
    public final ScrollingPagerIndicator indicatorScrolling;
    @NonNull
    public final WrapContentHeightViewPager viewPager;

    public CustomAlertDialogBannerBinding(LinearLayout linearLayout, ScrollingPagerIndicator scrollingPagerIndicator, WrapContentHeightViewPager wrapContentHeightViewPager) {
        this.f83703a = linearLayout;
        this.indicatorScrolling = scrollingPagerIndicator;
        this.viewPager = wrapContentHeightViewPager;
    }

    @NonNull
    public static CustomAlertDialogBannerBinding bind(@NonNull View view) {
        int i = R.id.indicatorScrolling;
        ScrollingPagerIndicator scrollingPagerIndicator = (ScrollingPagerIndicator) ViewBindings.findChildViewById(view, i);
        if (scrollingPagerIndicator != null) {
            i = R.id.viewPager;
            WrapContentHeightViewPager wrapContentHeightViewPager = (WrapContentHeightViewPager) ViewBindings.findChildViewById(view, i);
            if (wrapContentHeightViewPager != null) {
                return new CustomAlertDialogBannerBinding((LinearLayout) view, scrollingPagerIndicator, wrapContentHeightViewPager);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static CustomAlertDialogBannerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static CustomAlertDialogBannerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.custom_alert_dialog_banner, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f83703a;
    }
}