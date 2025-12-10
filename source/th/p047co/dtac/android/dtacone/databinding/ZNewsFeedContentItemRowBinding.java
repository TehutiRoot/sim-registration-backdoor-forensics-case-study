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
import th.p047co.dtac.android.dtacone.widget.view.DtacCardView;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZNewsFeedContentItemRowBinding */
/* loaded from: classes7.dex */
public final class ZNewsFeedContentItemRowBinding implements ViewBinding {

    /* renamed from: a */
    public final DtacCardView f84667a;
    @NonNull
    public final DtacCardView cvNewsFeed;
    @NonNull
    public final ZIncludeLikeBinding incLike;
    @NonNull
    public final AppCompatImageView ivNewsFeedImageProfile;
    @NonNull
    public final DtacFontTextView tvNewsFeedContent;
    @NonNull
    public final DtacFontTextView tvNewsFeedReadmore;
    @NonNull
    public final DtacFontTextView tvNewsFeedTime;
    @NonNull
    public final DtacFontTextView tvUsername;

    public ZNewsFeedContentItemRowBinding(DtacCardView dtacCardView, DtacCardView dtacCardView2, ZIncludeLikeBinding zIncludeLikeBinding, AppCompatImageView appCompatImageView, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4) {
        this.f84667a = dtacCardView;
        this.cvNewsFeed = dtacCardView2;
        this.incLike = zIncludeLikeBinding;
        this.ivNewsFeedImageProfile = appCompatImageView;
        this.tvNewsFeedContent = dtacFontTextView;
        this.tvNewsFeedReadmore = dtacFontTextView2;
        this.tvNewsFeedTime = dtacFontTextView3;
        this.tvUsername = dtacFontTextView4;
    }

    @NonNull
    public static ZNewsFeedContentItemRowBinding bind(@NonNull View view) {
        DtacCardView dtacCardView = (DtacCardView) view;
        int i = R.id.incLike;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            ZIncludeLikeBinding bind = ZIncludeLikeBinding.bind(findChildViewById);
            i = R.id.ivNewsFeedImageProfile;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = R.id.tvNewsFeedContent;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    i = R.id.tvNewsFeedReadmore;
                    DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView2 != null) {
                        i = R.id.tvNewsFeedTime;
                        DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView3 != null) {
                            i = R.id.tvUsername;
                            DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView4 != null) {
                                return new ZNewsFeedContentItemRowBinding(dtacCardView, dtacCardView, bind, appCompatImageView, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZNewsFeedContentItemRowBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZNewsFeedContentItemRowBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_news_feed_content_item_row, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public DtacCardView getRoot() {
        return this.f84667a;
    }
}
