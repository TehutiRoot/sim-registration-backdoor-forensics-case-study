package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZIncludeViewpagerImageBinding */
/* loaded from: classes7.dex */
public final class ZIncludeViewpagerImageBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84658a;
    @NonNull
    public final ScrollingPagerIndicator indicatorScrolling;
    @NonNull
    public final ViewPager viewPager;

    public ZIncludeViewpagerImageBinding(ConstraintLayout constraintLayout, ScrollingPagerIndicator scrollingPagerIndicator, ViewPager viewPager) {
        this.f84658a = constraintLayout;
        this.indicatorScrolling = scrollingPagerIndicator;
        this.viewPager = viewPager;
    }

    @NonNull
    public static ZIncludeViewpagerImageBinding bind(@NonNull View view) {
        int i = R.id.indicatorScrolling;
        ScrollingPagerIndicator scrollingPagerIndicator = (ScrollingPagerIndicator) ViewBindings.findChildViewById(view, i);
        if (scrollingPagerIndicator != null) {
            i = R.id.viewPager;
            ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, i);
            if (viewPager != null) {
                return new ZIncludeViewpagerImageBinding((ConstraintLayout) view, scrollingPagerIndicator, viewPager);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZIncludeViewpagerImageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZIncludeViewpagerImageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_include_viewpager_image, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84658a;
    }
}
