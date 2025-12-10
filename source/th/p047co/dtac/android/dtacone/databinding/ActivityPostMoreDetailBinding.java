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
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.CustomImageView;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityPostMoreDetailBinding */
/* loaded from: classes7.dex */
public final class ActivityPostMoreDetailBinding implements ViewBinding {

    /* renamed from: a */
    public final CoordinatorLayout f83570a;
    @NonNull
    public final CustomImageView ivNewsFeedBanner;
    @NonNull
    public final AppCompatImageView ivNewsFeedImageProfile;
    @NonNull
    public final LinearLayout linkBox;
    @NonNull
    public final ZToolbarBinding toolbar;
    @NonNull
    public final DtacFontTextView tvNewsFeedFullContent;
    @NonNull
    public final DtacFontTextView tvNewsFeedTime;
    @NonNull
    public final DtacFontTextView tvUrlLink;
    @NonNull
    public final DtacFontTextView tvUsername;

    public ActivityPostMoreDetailBinding(CoordinatorLayout coordinatorLayout, CustomImageView customImageView, AppCompatImageView appCompatImageView, LinearLayout linearLayout, ZToolbarBinding zToolbarBinding, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4) {
        this.f83570a = coordinatorLayout;
        this.ivNewsFeedBanner = customImageView;
        this.ivNewsFeedImageProfile = appCompatImageView;
        this.linkBox = linearLayout;
        this.toolbar = zToolbarBinding;
        this.tvNewsFeedFullContent = dtacFontTextView;
        this.tvNewsFeedTime = dtacFontTextView2;
        this.tvUrlLink = dtacFontTextView3;
        this.tvUsername = dtacFontTextView4;
    }

    @NonNull
    public static ActivityPostMoreDetailBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.ivNewsFeedBanner;
        CustomImageView customImageView = (CustomImageView) ViewBindings.findChildViewById(view, i);
        if (customImageView != null) {
            i = R.id.ivNewsFeedImageProfile;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = R.id.linkBox;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.toolbar))) != null) {
                    ZToolbarBinding bind = ZToolbarBinding.bind(findChildViewById);
                    i = R.id.tvNewsFeedFullContent;
                    DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView != null) {
                        i = R.id.tvNewsFeedTime;
                        DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView2 != null) {
                            i = R.id.tvUrlLink;
                            DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView3 != null) {
                                i = R.id.tvUsername;
                                DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView4 != null) {
                                    return new ActivityPostMoreDetailBinding((CoordinatorLayout) view, customImageView, appCompatImageView, linearLayout, bind, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4);
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
    public static ActivityPostMoreDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityPostMoreDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_post_more_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.f83570a;
    }
}
