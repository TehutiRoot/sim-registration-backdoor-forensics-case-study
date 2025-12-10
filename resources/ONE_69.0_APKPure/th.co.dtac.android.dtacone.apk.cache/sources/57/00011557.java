package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.loading.DtacSwipeRefresh;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacTabLayoutCustomView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentEsimSelectSkuBinding */
/* loaded from: classes7.dex */
public final class FragmentEsimSelectSkuBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f83845a;
    @NonNull
    public final ConstraintLayout background;
    @NonNull
    public final FrameLayout fragment;
    @NonNull
    public final ImageView imageView33;
    @NonNull
    public final DtacFontTextView label;
    @NonNull
    public final DtacSwipeRefresh swipeRefreshLayout;
    @NonNull
    public final DtacTabLayoutCustomView tabLayout;
    @NonNull
    public final ViewPager viewPager;

    public FragmentEsimSelectSkuBinding(FrameLayout frameLayout, ConstraintLayout constraintLayout, FrameLayout frameLayout2, ImageView imageView, DtacFontTextView dtacFontTextView, DtacSwipeRefresh dtacSwipeRefresh, DtacTabLayoutCustomView dtacTabLayoutCustomView, ViewPager viewPager) {
        this.f83845a = frameLayout;
        this.background = constraintLayout;
        this.fragment = frameLayout2;
        this.imageView33 = imageView;
        this.label = dtacFontTextView;
        this.swipeRefreshLayout = dtacSwipeRefresh;
        this.tabLayout = dtacTabLayoutCustomView;
        this.viewPager = viewPager;
    }

    @NonNull
    public static FragmentEsimSelectSkuBinding bind(@NonNull View view) {
        int i = R.id.background;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = R.id.fragment;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = R.id.imageView33;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.label;
                    DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView != null) {
                        i = R.id.swipeRefreshLayout;
                        DtacSwipeRefresh dtacSwipeRefresh = (DtacSwipeRefresh) ViewBindings.findChildViewById(view, i);
                        if (dtacSwipeRefresh != null) {
                            i = R.id.tabLayout;
                            DtacTabLayoutCustomView dtacTabLayoutCustomView = (DtacTabLayoutCustomView) ViewBindings.findChildViewById(view, i);
                            if (dtacTabLayoutCustomView != null) {
                                i = R.id.viewPager;
                                ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, i);
                                if (viewPager != null) {
                                    return new FragmentEsimSelectSkuBinding((FrameLayout) view, constraintLayout, frameLayout, imageView, dtacFontTextView, dtacSwipeRefresh, dtacTabLayoutCustomView, viewPager);
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
    public static FragmentEsimSelectSkuBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentEsimSelectSkuBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_esim_select_sku, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f83845a;
    }
}