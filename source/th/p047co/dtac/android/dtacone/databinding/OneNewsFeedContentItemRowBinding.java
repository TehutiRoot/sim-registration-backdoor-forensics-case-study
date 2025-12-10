package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacCardView;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneNewsFeedContentItemRowBinding */
/* loaded from: classes7.dex */
public final class OneNewsFeedContentItemRowBinding implements ViewBinding {

    /* renamed from: a */
    public final DtacCardView f84496a;
    @NonNull
    public final DtacCardView cvNewsFeed;
    @NonNull
    public final OneIncludeLikeBinding incLike;
    @NonNull
    public final AppCompatImageView ivNewsFeedImageProfile;
    @NonNull
    public final OneFontTextView tvNewsFeedContent;
    @NonNull
    public final OneFontTextView tvNewsFeedTime;
    @NonNull
    public final OneFontTextView tvUsername;

    public OneNewsFeedContentItemRowBinding(DtacCardView dtacCardView, DtacCardView dtacCardView2, OneIncludeLikeBinding oneIncludeLikeBinding, AppCompatImageView appCompatImageView, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3) {
        this.f84496a = dtacCardView;
        this.cvNewsFeed = dtacCardView2;
        this.incLike = oneIncludeLikeBinding;
        this.ivNewsFeedImageProfile = appCompatImageView;
        this.tvNewsFeedContent = oneFontTextView;
        this.tvNewsFeedTime = oneFontTextView2;
        this.tvUsername = oneFontTextView3;
    }

    @NonNull
    public static OneNewsFeedContentItemRowBinding bind(@NonNull View view) {
        DtacCardView dtacCardView = (DtacCardView) view;
        int i = R.id.incLike;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            OneIncludeLikeBinding bind = OneIncludeLikeBinding.bind(findChildViewById);
            i = R.id.ivNewsFeedImageProfile;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = R.id.tvNewsFeedContent;
                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView != null) {
                    i = R.id.tvNewsFeedTime;
                    OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView2 != null) {
                        i = R.id.tvUsername;
                        OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView3 != null) {
                            return new OneNewsFeedContentItemRowBinding(dtacCardView, dtacCardView, bind, appCompatImageView, oneFontTextView, oneFontTextView2, oneFontTextView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneNewsFeedContentItemRowBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneNewsFeedContentItemRowBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_news_feed_content_item_row, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public DtacCardView getRoot() {
        return this.f84496a;
    }
}
