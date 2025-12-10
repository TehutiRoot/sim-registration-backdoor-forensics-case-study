package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.inthecheesefactory.thecheeselibrary.widget.AdjustableImageView;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityOnePostMoreDetailBinding */
/* loaded from: classes7.dex */
public final class ActivityOnePostMoreDetailBinding implements ViewBinding {

    /* renamed from: a */
    public final CoordinatorLayout f83550a;
    @NonNull
    public final OneIncludeLikeBinding incLikeLayout;
    @NonNull
    public final AdjustableImageView ivNewsFeedBanner;
    @NonNull
    public final AppCompatImageView ivNewsFeedImageProfile;
    @NonNull
    public final LinearLayout linkBox;
    @NonNull
    public final OneToolbarBinding toolbar;
    @NonNull
    public final OneFontTextView tvNewsFeedContent;
    @NonNull
    public final OneFontTextView tvNewsFeedTime;
    @NonNull
    public final OneFontTextView tvUrlLink;
    @NonNull
    public final OneFontTextView tvUsername;

    public ActivityOnePostMoreDetailBinding(CoordinatorLayout coordinatorLayout, OneIncludeLikeBinding oneIncludeLikeBinding, AdjustableImageView adjustableImageView, AppCompatImageView appCompatImageView, LinearLayout linearLayout, OneToolbarBinding oneToolbarBinding, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4) {
        this.f83550a = coordinatorLayout;
        this.incLikeLayout = oneIncludeLikeBinding;
        this.ivNewsFeedBanner = adjustableImageView;
        this.ivNewsFeedImageProfile = appCompatImageView;
        this.linkBox = linearLayout;
        this.toolbar = oneToolbarBinding;
        this.tvNewsFeedContent = oneFontTextView;
        this.tvNewsFeedTime = oneFontTextView2;
        this.tvUrlLink = oneFontTextView3;
        this.tvUsername = oneFontTextView4;
    }

    @NonNull
    public static ActivityOnePostMoreDetailBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.incLikeLayout;
        View findChildViewById2 = ViewBindings.findChildViewById(view, i);
        if (findChildViewById2 != null) {
            OneIncludeLikeBinding bind = OneIncludeLikeBinding.bind(findChildViewById2);
            i = R.id.ivNewsFeedBanner;
            AdjustableImageView adjustableImageView = (AdjustableImageView) ViewBindings.findChildViewById(view, i);
            if (adjustableImageView != null) {
                i = R.id.ivNewsFeedImageProfile;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView != null) {
                    i = R.id.linkBox;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.toolbar))) != null) {
                        OneToolbarBinding bind2 = OneToolbarBinding.bind(findChildViewById);
                        i = R.id.tvNewsFeedContent;
                        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView != null) {
                            i = R.id.tvNewsFeedTime;
                            OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView2 != null) {
                                i = R.id.tvUrlLink;
                                OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView3 != null) {
                                    i = R.id.tvUsername;
                                    OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (oneFontTextView4 != null) {
                                        return new ActivityOnePostMoreDetailBinding((CoordinatorLayout) view, bind, adjustableImageView, appCompatImageView, linearLayout, bind2, oneFontTextView, oneFontTextView2, oneFontTextView3, oneFontTextView4);
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
    public static ActivityOnePostMoreDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityOnePostMoreDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_one_post_more_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.f83550a;
    }
}
