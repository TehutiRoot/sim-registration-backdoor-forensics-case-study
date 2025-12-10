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
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrPre2postRecommendedPackageBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrPre2postRecommendedPackageBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83854a;
    @NonNull
    public final LinearLayout allPackageBox;
    @NonNull
    public final ImageView bell;
    @NonNull
    public final DtacFontTextView dataUsageAverage3Month;
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
    public final DtacFontTextView textViewNoPackage;
    @NonNull
    public final DtacFontTextView textViewSubscriberNumber;
    @NonNull
    public final DtacFontTextView tvArpu;
    @NonNull
    public final DtacFontTextView tvInternet;
    @NonNull
    public final DtacFontTextView tvPhone;
    @NonNull
    public final DtacFontTextView tvRecommendPackageTitle;
    @NonNull
    public final DtacFontTextView tvRecommended;
    @NonNull
    public final DtacFontTextView tvRecommendedTitle;

    public FragmentMrtrPre2postRecommendedPackageBinding(ConstraintLayout constraintLayout, LinearLayout linearLayout, ImageView imageView, DtacFontTextView dtacFontTextView, ImageView imageView2, ImageView imageView3, ScrollingPagerIndicator scrollingPagerIndicator, ImageView imageView4, LinearLayout linearLayout2, ImageView imageView5, RecyclerView recyclerView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5, DtacFontTextView dtacFontTextView6, DtacFontTextView dtacFontTextView7, DtacFontTextView dtacFontTextView8, DtacFontTextView dtacFontTextView9) {
        this.f83854a = constraintLayout;
        this.allPackageBox = linearLayout;
        this.bell = imageView;
        this.dataUsageAverage3Month = dtacFontTextView;
        this.imageBottomLine = imageView2;
        this.imageBottomLine1 = imageView3;
        this.indicatorScrolling = scrollingPagerIndicator;
        this.ivArpu = imageView4;
        this.linearLayout10 = linearLayout2;
        this.phoneStatusView = imageView5;
        this.recyclerRecommendPackage = recyclerView;
        this.textViewNoPackage = dtacFontTextView2;
        this.textViewSubscriberNumber = dtacFontTextView3;
        this.tvArpu = dtacFontTextView4;
        this.tvInternet = dtacFontTextView5;
        this.tvPhone = dtacFontTextView6;
        this.tvRecommendPackageTitle = dtacFontTextView7;
        this.tvRecommended = dtacFontTextView8;
        this.tvRecommendedTitle = dtacFontTextView9;
    }

    @NonNull
    public static FragmentMrtrPre2postRecommendedPackageBinding bind(@NonNull View view) {
        int i = R.id.allPackageBox;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.bell;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.dataUsageAverage3Month;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
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
                                                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (dtacFontTextView2 != null) {
                                                    i = R.id.textViewSubscriberNumber;
                                                    DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (dtacFontTextView3 != null) {
                                                        i = R.id.tvArpu;
                                                        DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (dtacFontTextView4 != null) {
                                                            i = R.id.tvInternet;
                                                            DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                            if (dtacFontTextView5 != null) {
                                                                i = R.id.tvPhone;
                                                                DtacFontTextView dtacFontTextView6 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                if (dtacFontTextView6 != null) {
                                                                    i = R.id.tv_recommend_package_title;
                                                                    DtacFontTextView dtacFontTextView7 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (dtacFontTextView7 != null) {
                                                                        i = R.id.tvRecommended;
                                                                        DtacFontTextView dtacFontTextView8 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (dtacFontTextView8 != null) {
                                                                            i = R.id.tvRecommendedTitle;
                                                                            DtacFontTextView dtacFontTextView9 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (dtacFontTextView9 != null) {
                                                                                return new FragmentMrtrPre2postRecommendedPackageBinding((ConstraintLayout) view, linearLayout, imageView, dtacFontTextView, imageView2, imageView3, scrollingPagerIndicator, imageView4, linearLayout2, imageView5, recyclerView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5, dtacFontTextView6, dtacFontTextView7, dtacFontTextView8, dtacFontTextView9);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMrtrPre2postRecommendedPackageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrPre2postRecommendedPackageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_pre2post_recommended_package, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83854a;
    }
}
