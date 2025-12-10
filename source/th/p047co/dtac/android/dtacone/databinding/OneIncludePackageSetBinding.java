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
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTabLayout;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneIncludePackageSetBinding */
/* loaded from: classes7.dex */
public final class OneIncludePackageSetBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84476a;
    @NonNull
    public final LinearLayout contentList;
    @NonNull
    public final OneTabLayout tabLayout;
    @NonNull
    public final OneFontTextView tvPackageTitle;
    @NonNull
    public final ViewPager viewPager;

    public OneIncludePackageSetBinding(LinearLayout linearLayout, LinearLayout linearLayout2, OneTabLayout oneTabLayout, OneFontTextView oneFontTextView, ViewPager viewPager) {
        this.f84476a = linearLayout;
        this.contentList = linearLayout2;
        this.tabLayout = oneTabLayout;
        this.tvPackageTitle = oneFontTextView;
        this.viewPager = viewPager;
    }

    @NonNull
    public static OneIncludePackageSetBinding bind(@NonNull View view) {
        int i = R.id.contentList;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.tabLayout;
            OneTabLayout oneTabLayout = (OneTabLayout) ViewBindings.findChildViewById(view, i);
            if (oneTabLayout != null) {
                i = R.id.tvPackageTitle;
                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView != null) {
                    i = R.id.viewPager;
                    ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, i);
                    if (viewPager != null) {
                        return new OneIncludePackageSetBinding((LinearLayout) view, linearLayout, oneTabLayout, oneFontTextView, viewPager);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneIncludePackageSetBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneIncludePackageSetBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_include_package_set, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84476a;
    }
}
