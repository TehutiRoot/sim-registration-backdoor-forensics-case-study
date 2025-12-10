package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.github.chrisbanes.photoview.PhotoView;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.widget.loading.DtacSwipeRefresh;

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityOneNewsNotificationBinding */
/* loaded from: classes7.dex */
public final class ActivityOneNewsNotificationBinding implements ViewBinding {

    /* renamed from: a */
    public final CoordinatorLayout f83546a;
    @NonNull
    public final CardView cvNewsFeed;
    @NonNull
    public final PhotoView ivNewsFeedBanner;
    @NonNull
    public final AppCompatImageView ivNewsFeedImageProfile;
    @NonNull
    public final LinearLayout linkBox;
    @NonNull
    public final DtacSwipeRefresh swipeContainer;
    @NonNull
    public final OneToolbarBinding toolbar;
    @NonNull
    public final OneFontTextView tvCreatedBy;
    @NonNull
    public final OneFontTextView tvNewsFeedContent;
    @NonNull
    public final OneFontTextView tvNewsFeedTime;
    @NonNull
    public final OneFontTextView tvUrlLink;

    public ActivityOneNewsNotificationBinding(CoordinatorLayout coordinatorLayout, CardView cardView, PhotoView photoView, AppCompatImageView appCompatImageView, LinearLayout linearLayout, DtacSwipeRefresh dtacSwipeRefresh, OneToolbarBinding oneToolbarBinding, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4) {
        this.f83546a = coordinatorLayout;
        this.cvNewsFeed = cardView;
        this.ivNewsFeedBanner = photoView;
        this.ivNewsFeedImageProfile = appCompatImageView;
        this.linkBox = linearLayout;
        this.swipeContainer = dtacSwipeRefresh;
        this.toolbar = oneToolbarBinding;
        this.tvCreatedBy = oneFontTextView;
        this.tvNewsFeedContent = oneFontTextView2;
        this.tvNewsFeedTime = oneFontTextView3;
        this.tvUrlLink = oneFontTextView4;
    }

    @NonNull
    public static ActivityOneNewsNotificationBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.cvNewsFeed;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
        if (cardView != null) {
            i = R.id.ivNewsFeedBanner;
            PhotoView photoView = (PhotoView) ViewBindings.findChildViewById(view, i);
            if (photoView != null) {
                i = R.id.ivNewsFeedImageProfile;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView != null) {
                    i = R.id.linkBox;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = R.id.swipeContainer;
                        DtacSwipeRefresh dtacSwipeRefresh = (DtacSwipeRefresh) ViewBindings.findChildViewById(view, i);
                        if (dtacSwipeRefresh != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.toolbar))) != null) {
                            OneToolbarBinding bind = OneToolbarBinding.bind(findChildViewById);
                            i = R.id.tvCreatedBy;
                            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView != null) {
                                i = R.id.tvNewsFeedContent;
                                OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView2 != null) {
                                    i = R.id.tvNewsFeedTime;
                                    OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (oneFontTextView3 != null) {
                                        i = R.id.tvUrlLink;
                                        OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (oneFontTextView4 != null) {
                                            return new ActivityOneNewsNotificationBinding((CoordinatorLayout) view, cardView, photoView, appCompatImageView, linearLayout, dtacSwipeRefresh, bind, oneFontTextView, oneFontTextView2, oneFontTextView3, oneFontTextView4);
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
    public static ActivityOneNewsNotificationBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityOneNewsNotificationBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_one_news_notification, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.f83546a;
    }
}
