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
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacCardView;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneNewsFeedImageItemRowBinding */
/* loaded from: classes7.dex */
public final class OneNewsFeedImageItemRowBinding implements ViewBinding {

    /* renamed from: a */
    public final DtacCardView f84499a;
    @NonNull
    public final DtacCardView cvNewsFeed;
    @NonNull
    public final OneIncludeLikeBinding incLike;
    @NonNull
    public final AdjustableImageView ivNewsFeedBanner;
    @NonNull
    public final AppCompatImageView ivNewsFeedImageProfile;
    @NonNull
    public final OneFontTextView tvNewsFeedTime;
    @NonNull
    public final OneFontTextView tvUsername;

    public OneNewsFeedImageItemRowBinding(DtacCardView dtacCardView, DtacCardView dtacCardView2, OneIncludeLikeBinding oneIncludeLikeBinding, AdjustableImageView adjustableImageView, AppCompatImageView appCompatImageView, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2) {
        this.f84499a = dtacCardView;
        this.cvNewsFeed = dtacCardView2;
        this.incLike = oneIncludeLikeBinding;
        this.ivNewsFeedBanner = adjustableImageView;
        this.ivNewsFeedImageProfile = appCompatImageView;
        this.tvNewsFeedTime = oneFontTextView;
        this.tvUsername = oneFontTextView2;
    }

    @NonNull
    public static OneNewsFeedImageItemRowBinding bind(@NonNull View view) {
        DtacCardView dtacCardView = (DtacCardView) view;
        int i = R.id.incLike;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            OneIncludeLikeBinding bind = OneIncludeLikeBinding.bind(findChildViewById);
            i = R.id.ivNewsFeedBanner;
            AdjustableImageView adjustableImageView = (AdjustableImageView) ViewBindings.findChildViewById(view, i);
            if (adjustableImageView != null) {
                i = R.id.ivNewsFeedImageProfile;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView != null) {
                    i = R.id.tvNewsFeedTime;
                    OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView != null) {
                        i = R.id.tvUsername;
                        OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView2 != null) {
                            return new OneNewsFeedImageItemRowBinding(dtacCardView, dtacCardView, bind, adjustableImageView, appCompatImageView, oneFontTextView, oneFontTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneNewsFeedImageItemRowBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneNewsFeedImageItemRowBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_news_feed_image_item_row, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public DtacCardView getRoot() {
        return this.f84499a;
    }
}
