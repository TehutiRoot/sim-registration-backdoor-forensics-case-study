package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOnePre2postRecommendedPackageBinding */
/* loaded from: classes7.dex */
public final class FragmentOnePre2postRecommendedPackageBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84178a;
    @NonNull
    public final LinearLayout allPackageBox;
    @NonNull
    public final ImageView bell;
    @NonNull
    public final OneFontTextView dataUsageAverage3Month;
    @NonNull
    public final ImageView imageBottomLine;
    @NonNull
    public final ImageView imageBottomLine1;
    @NonNull
    public final ScrollingPagerIndicator indicatorScrolling;
    @NonNull
    public final ImageView ivArpu;
    @NonNull
    public final LinearLayout linearLayout10;
    @NonNull
    public final ImageView phoneStatusView;
    @NonNull
    public final RecyclerView recyclerRecommendPackage;
    @NonNull
    public final OneFontTextView textViewNoPackage;
    @NonNull
    public final OneFontTextView tvArpu;
    @NonNull
    public final OneFontTextView tvInternet;
    @NonNull
    public final OneFontTextView tvPhone;
    @NonNull
    public final OneFontTextView tvRecommendPackageTitle;
    @NonNull
    public final OneFontTextView tvRecommended;
    @NonNull
    public final OneFontTextView tvRecommendedTitle;

    public FragmentOnePre2postRecommendedPackageBinding(ConstraintLayout constraintLayout, LinearLayout linearLayout, ImageView imageView, OneFontTextView oneFontTextView, ImageView imageView2, ImageView imageView3, ScrollingPagerIndicator scrollingPagerIndicator, ImageView imageView4, LinearLayout linearLayout2, ImageView imageView5, RecyclerView recyclerView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5, OneFontTextView oneFontTextView6, OneFontTextView oneFontTextView7, OneFontTextView oneFontTextView8) {
        this.f84178a = constraintLayout;
        this.allPackageBox = linearLayout;
        this.bell = imageView;
        this.dataUsageAverage3Month = oneFontTextView;
        this.imageBottomLine = imageView2;
        this.imageBottomLine1 = imageView3;
        this.indicatorScrolling = scrollingPagerIndicator;
        this.ivArpu = imageView4;
        this.linearLayout10 = linearLayout2;
        this.phoneStatusView = imageView5;
        this.recyclerRecommendPackage = recyclerView;
        this.textViewNoPackage = oneFontTextView2;
        this.tvArpu = oneFontTextView3;
        this.tvInternet = oneFontTextView4;
        this.tvPhone = oneFontTextView5;
        this.tvRecommendPackageTitle = oneFontTextView6;
        this.tvRecommended = oneFontTextView7;
        this.tvRecommendedTitle = oneFontTextView8;
    }

    @NonNull
    public static FragmentOnePre2postRecommendedPackageBinding bind(@NonNull View view) {
        int i = R.id.allPackageBox;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.bell;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.dataUsageAverage3Month;
                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView != null) {
                    i = R.id.imageBottomLine;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView2 != null) {
                        i = R.id.imageBottomLine1;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView3 != null) {
                            i = R.id.indicatorScrolling;
                            ScrollingPagerIndicator scrollingPagerIndicator = (ScrollingPagerIndicator) ViewBindings.findChildViewById(view, i);
                            if (scrollingPagerIndicator != null) {
                                i = R.id.ivArpu;
                                ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView4 != null) {
                                    i = R.id.linearLayout10;
                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout2 != null) {
                                        i = R.id.phoneStatusView;
                                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, i);
                                        if (imageView5 != null) {
                                            i = R.id.recyclerRecommendPackage;
                                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                            if (recyclerView != null) {
                                                i = R.id.textViewNoPackage;
                                                OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (oneFontTextView2 != null) {
                                                    i = R.id.tvArpu;
                                                    OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (oneFontTextView3 != null) {
                                                        i = R.id.tvInternet;
                                                        OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (oneFontTextView4 != null) {
                                                            i = R.id.tvPhone;
                                                            OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                            if (oneFontTextView5 != null) {
                                                                i = R.id.tv_recommend_package_title;
                                                                OneFontTextView oneFontTextView6 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                if (oneFontTextView6 != null) {
                                                                    i = R.id.tvRecommended;
                                                                    OneFontTextView oneFontTextView7 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (oneFontTextView7 != null) {
                                                                        i = R.id.tvRecommendedTitle;
                                                                        OneFontTextView oneFontTextView8 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (oneFontTextView8 != null) {
                                                                            return new FragmentOnePre2postRecommendedPackageBinding((ConstraintLayout) view, linearLayout, imageView, oneFontTextView, imageView2, imageView3, scrollingPagerIndicator, imageView4, linearLayout2, imageView5, recyclerView, oneFontTextView2, oneFontTextView3, oneFontTextView4, oneFontTextView5, oneFontTextView6, oneFontTextView7, oneFontTextView8);
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
    public static FragmentOnePre2postRecommendedPackageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOnePre2postRecommendedPackageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_pre2post_recommended_package, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84178a;
    }
}