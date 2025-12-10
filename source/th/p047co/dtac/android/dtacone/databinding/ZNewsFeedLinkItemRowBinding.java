package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacCardView;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZNewsFeedLinkItemRowBinding */
/* loaded from: classes7.dex */
public final class ZNewsFeedLinkItemRowBinding implements ViewBinding {

    /* renamed from: a */
    public final DtacCardView f84672a;
    @NonNull
    public final DtacCardView cvNewsFeed;
    @NonNull
    public final ZIncludeLikeBinding incLike;
    @NonNull
    public final AppCompatImageView ivNewsFeedImageProfile;
    @NonNull
    public final LinearLayout linkBox;
    @NonNull
    public final DtacFontTextView tvNewsFeedTime;
    @NonNull
    public final DtacFontTextView tvUrlLink;
    @NonNull
    public final DtacFontTextView tvUsername;

    public ZNewsFeedLinkItemRowBinding(DtacCardView dtacCardView, DtacCardView dtacCardView2, ZIncludeLikeBinding zIncludeLikeBinding, AppCompatImageView appCompatImageView, LinearLayout linearLayout, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3) {
        this.f84672a = dtacCardView;
        this.cvNewsFeed = dtacCardView2;
        this.incLike = zIncludeLikeBinding;
        this.ivNewsFeedImageProfile = appCompatImageView;
        this.linkBox = linearLayout;
        this.tvNewsFeedTime = dtacFontTextView;
        this.tvUrlLink = dtacFontTextView2;
        this.tvUsername = dtacFontTextView3;
    }

    @NonNull
    public static ZNewsFeedLinkItemRowBinding bind(@NonNull View view) {
        DtacCardView dtacCardView = (DtacCardView) view;
        int i = R.id.incLike;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            ZIncludeLikeBinding bind = ZIncludeLikeBinding.bind(findChildViewById);
            i = R.id.ivNewsFeedImageProfile;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = R.id.linkBox;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = R.id.tvNewsFeedTime;
                    DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView != null) {
                        i = R.id.tvUrlLink;
                        DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView2 != null) {
                            i = R.id.tvUsername;
                            DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView3 != null) {
                                return new ZNewsFeedLinkItemRowBinding(dtacCardView, dtacCardView, bind, appCompatImageView, linearLayout, dtacFontTextView, dtacFontTextView2, dtacFontTextView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZNewsFeedLinkItemRowBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZNewsFeedLinkItemRowBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_news_feed_link_item_row, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public DtacCardView getRoot() {
        return this.f84672a;
    }
}
