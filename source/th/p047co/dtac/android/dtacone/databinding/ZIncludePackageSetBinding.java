package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacTabLayout;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZIncludePackageSetBinding */
/* loaded from: classes7.dex */
public final class ZIncludePackageSetBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84641a;
    @NonNull
    public final LinearLayout contentList;
    @NonNull
    public final DtacTabLayout tabLayout;
    @NonNull
    public final DtacFontTextView tvPackageTitle;
    @NonNull
    public final ViewPager viewPager;

    public ZIncludePackageSetBinding(LinearLayout linearLayout, LinearLayout linearLayout2, DtacTabLayout dtacTabLayout, DtacFontTextView dtacFontTextView, ViewPager viewPager) {
        this.f84641a = linearLayout;
        this.contentList = linearLayout2;
        this.tabLayout = dtacTabLayout;
        this.tvPackageTitle = dtacFontTextView;
        this.viewPager = viewPager;
    }

    @NonNull
    public static ZIncludePackageSetBinding bind(@NonNull View view) {
        int i = R.id.contentList;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.tabLayout;
            DtacTabLayout dtacTabLayout = (DtacTabLayout) ViewBindings.findChildViewById(view, i);
            if (dtacTabLayout != null) {
                i = R.id.tvPackageTitle;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    i = R.id.viewPager;
                    ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, i);
                    if (viewPager != null) {
                        return new ZIncludePackageSetBinding((LinearLayout) view, linearLayout, dtacTabLayout, dtacFontTextView, viewPager);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZIncludePackageSetBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZIncludePackageSetBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_include_package_set, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84641a;
    }
}
