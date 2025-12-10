package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.github.chrisbanes.photoview.PhotoView;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityPostMoreImageBinding */
/* loaded from: classes7.dex */
public final class ActivityPostMoreImageBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f83669a;
    @NonNull
    public final NestedScrollView activityPostMoreDetail;
    @NonNull
    public final PhotoView ivBanner;
    @NonNull
    public final AppCompatImageView ivClose;
    @NonNull
    public final DtacFontTextView tvNewsFeedContentDtac;
    @NonNull
    public final OneFontTextView tvNewsFeedContentOne;

    public ActivityPostMoreImageBinding(NestedScrollView nestedScrollView, NestedScrollView nestedScrollView2, PhotoView photoView, AppCompatImageView appCompatImageView, DtacFontTextView dtacFontTextView, OneFontTextView oneFontTextView) {
        this.f83669a = nestedScrollView;
        this.activityPostMoreDetail = nestedScrollView2;
        this.ivBanner = photoView;
        this.ivClose = appCompatImageView;
        this.tvNewsFeedContentDtac = dtacFontTextView;
        this.tvNewsFeedContentOne = oneFontTextView;
    }

    @NonNull
    public static ActivityPostMoreImageBinding bind(@NonNull View view) {
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        int i = R.id.ivBanner;
        PhotoView photoView = (PhotoView) ViewBindings.findChildViewById(view, i);
        if (photoView != null) {
            i = R.id.ivClose;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = R.id.tvNewsFeedContentDtac;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    i = R.id.tvNewsFeedContentOne;
                    OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView != null) {
                        return new ActivityPostMoreImageBinding(nestedScrollView, nestedScrollView, photoView, appCompatImageView, dtacFontTextView, oneFontTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityPostMoreImageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityPostMoreImageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_post_more_image, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f83669a;
    }
}