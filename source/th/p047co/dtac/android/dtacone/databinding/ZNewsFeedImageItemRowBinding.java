package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.inthecheesefactory.thecheeselibrary.widget.AdjustableImageView;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacCardView;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZNewsFeedImageItemRowBinding */
/* loaded from: classes7.dex */
public final class ZNewsFeedImageItemRowBinding implements ViewBinding {

    /* renamed from: a */
    public final DtacCardView f84670a;
    @NonNull
    public final DtacCardView cvNewsFeed;
    @NonNull
    public final ZIncludeLikeBinding incLike;
    @NonNull
    public final AdjustableImageView ivNewsFeedBanner;
    @NonNull
    public final AppCompatImageView ivNewsFeedImageProfile;
    @NonNull
    public final DtacFontTextView tvNewsFeedTime;
    @NonNull
    public final DtacFontTextView tvUsername;

    public ZNewsFeedImageItemRowBinding(DtacCardView dtacCardView, DtacCardView dtacCardView2, ZIncludeLikeBinding zIncludeLikeBinding, AdjustableImageView adjustableImageView, AppCompatImageView appCompatImageView, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2) {
        this.f84670a = dtacCardView;
        this.cvNewsFeed = dtacCardView2;
        this.incLike = zIncludeLikeBinding;
        this.ivNewsFeedBanner = adjustableImageView;
        this.ivNewsFeedImageProfile = appCompatImageView;
        this.tvNewsFeedTime = dtacFontTextView;
        this.tvUsername = dtacFontTextView2;
    }

    @NonNull
    public static ZNewsFeedImageItemRowBinding bind(@NonNull View view) {
        DtacCardView dtacCardView = (DtacCardView) view;
        int i = R.id.incLike;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            ZIncludeLikeBinding bind = ZIncludeLikeBinding.bind(findChildViewById);
            i = R.id.ivNewsFeedBanner;
            AdjustableImageView adjustableImageView = (AdjustableImageView) ViewBindings.findChildViewById(view, i);
            if (adjustableImageView != null) {
                i = R.id.ivNewsFeedImageProfile;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView != null) {
                    i = R.id.tvNewsFeedTime;
                    DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView != null) {
                        i = R.id.tvUsername;
                        DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView2 != null) {
                            return new ZNewsFeedImageItemRowBinding(dtacCardView, dtacCardView, bind, adjustableImageView, appCompatImageView, dtacFontTextView, dtacFontTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZNewsFeedImageItemRowBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZNewsFeedImageItemRowBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_news_feed_image_item_row, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public DtacCardView getRoot() {
        return this.f84670a;
    }
}
