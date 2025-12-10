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
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacCardView;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneNewsFeedLinkItemRowBinding */
/* loaded from: classes7.dex */
public final class OneNewsFeedLinkItemRowBinding implements ViewBinding {

    /* renamed from: a */
    public final DtacCardView f84501a;
    @NonNull
    public final DtacCardView cvNewsFeed;
    @NonNull
    public final OneIncludeLikeBinding incLike;
    @NonNull
    public final AppCompatImageView ivNewsFeedImageProfile;
    @NonNull
    public final LinearLayout linkBox;
    @NonNull
    public final OneFontTextView tvNewsFeedTime;
    @NonNull
    public final OneFontTextView tvUrlLink;
    @NonNull
    public final OneFontTextView tvUsername;

    public OneNewsFeedLinkItemRowBinding(DtacCardView dtacCardView, DtacCardView dtacCardView2, OneIncludeLikeBinding oneIncludeLikeBinding, AppCompatImageView appCompatImageView, LinearLayout linearLayout, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3) {
        this.f84501a = dtacCardView;
        this.cvNewsFeed = dtacCardView2;
        this.incLike = oneIncludeLikeBinding;
        this.ivNewsFeedImageProfile = appCompatImageView;
        this.linkBox = linearLayout;
        this.tvNewsFeedTime = oneFontTextView;
        this.tvUrlLink = oneFontTextView2;
        this.tvUsername = oneFontTextView3;
    }

    @NonNull
    public static OneNewsFeedLinkItemRowBinding bind(@NonNull View view) {
        DtacCardView dtacCardView = (DtacCardView) view;
        int i = R.id.incLike;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            OneIncludeLikeBinding bind = OneIncludeLikeBinding.bind(findChildViewById);
            i = R.id.ivNewsFeedImageProfile;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = R.id.linkBox;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = R.id.tvNewsFeedTime;
                    OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView != null) {
                        i = R.id.tvUrlLink;
                        OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView2 != null) {
                            i = R.id.tvUsername;
                            OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView3 != null) {
                                return new OneNewsFeedLinkItemRowBinding(dtacCardView, dtacCardView, bind, appCompatImageView, linearLayout, oneFontTextView, oneFontTextView2, oneFontTextView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneNewsFeedLinkItemRowBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneNewsFeedLinkItemRowBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_news_feed_link_item_row, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public DtacCardView getRoot() {
        return this.f84501a;
    }
}
