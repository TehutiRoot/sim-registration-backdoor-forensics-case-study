package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneIncludeViewpagerImageBinding */
/* loaded from: classes7.dex */
public final class OneIncludeViewpagerImageBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayoutCompat f84491a;
    @NonNull
    public final ScrollingPagerIndicator indicatorScrolling;
    @NonNull
    public final ViewPager viewPager;

    public OneIncludeViewpagerImageBinding(LinearLayoutCompat linearLayoutCompat, ScrollingPagerIndicator scrollingPagerIndicator, ViewPager viewPager) {
        this.f84491a = linearLayoutCompat;
        this.indicatorScrolling = scrollingPagerIndicator;
        this.viewPager = viewPager;
    }

    @NonNull
    public static OneIncludeViewpagerImageBinding bind(@NonNull View view) {
        int i = R.id.indicatorScrolling;
        ScrollingPagerIndicator scrollingPagerIndicator = (ScrollingPagerIndicator) ViewBindings.findChildViewById(view, i);
        if (scrollingPagerIndicator != null) {
            i = R.id.viewPager;
            ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, i);
            if (viewPager != null) {
                return new OneIncludeViewpagerImageBinding((LinearLayoutCompat) view, scrollingPagerIndicator, viewPager);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneIncludeViewpagerImageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneIncludeViewpagerImageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_include_viewpager_image, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayoutCompat getRoot() {
        return this.f84491a;
    }
}
