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
import th.p047co.dtac.android.dtacone.widget.loading.DtacSwipeRefresh;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityNewsNotificationBinding */
/* loaded from: classes7.dex */
public final class ActivityNewsNotificationBinding implements ViewBinding {

    /* renamed from: a */
    public final CoordinatorLayout f83528a;
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
    public final ZToolbarBinding toolbar;
    @NonNull
    public final DtacFontTextView tvCreatedBy;
    @NonNull
    public final DtacFontTextView tvNewsFeedContent;
    @NonNull
    public final DtacFontTextView tvNewsFeedTime;
    @NonNull
    public final DtacFontTextView tvUrlLink;

    public ActivityNewsNotificationBinding(CoordinatorLayout coordinatorLayout, CardView cardView, PhotoView photoView, AppCompatImageView appCompatImageView, LinearLayout linearLayout, DtacSwipeRefresh dtacSwipeRefresh, ZToolbarBinding zToolbarBinding, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4) {
        this.f83528a = coordinatorLayout;
        this.cvNewsFeed = cardView;
        this.ivNewsFeedBanner = photoView;
        this.ivNewsFeedImageProfile = appCompatImageView;
        this.linkBox = linearLayout;
        this.swipeContainer = dtacSwipeRefresh;
        this.toolbar = zToolbarBinding;
        this.tvCreatedBy = dtacFontTextView;
        this.tvNewsFeedContent = dtacFontTextView2;
        this.tvNewsFeedTime = dtacFontTextView3;
        this.tvUrlLink = dtacFontTextView4;
    }

    @NonNull
    public static ActivityNewsNotificationBinding bind(@NonNull View view) {
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
                            ZToolbarBinding bind = ZToolbarBinding.bind(findChildViewById);
                            i = R.id.tvCreatedBy;
                            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView != null) {
                                i = R.id.tvNewsFeedContent;
                                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView2 != null) {
                                    i = R.id.tvNewsFeedTime;
                                    DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView3 != null) {
                                        i = R.id.tvUrlLink;
                                        DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (dtacFontTextView4 != null) {
                                            return new ActivityNewsNotificationBinding((CoordinatorLayout) view, cardView, photoView, appCompatImageView, linearLayout, dtacSwipeRefresh, bind, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4);
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
    public static ActivityNewsNotificationBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityNewsNotificationBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_news_notification, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.f83528a;
    }
}
