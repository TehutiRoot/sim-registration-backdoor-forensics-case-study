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
import com.inthecheesefactory.thecheeselibrary.widget.AdjustableImageView;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacCardView;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZNewsFeedFullContentItemRowBinding */
/* loaded from: classes7.dex */
public final class ZNewsFeedFullContentItemRowBinding implements ViewBinding {

    /* renamed from: a */
    public final DtacCardView f84669a;
    @NonNull
    public final DtacCardView cvNewsFeed;
    @NonNull
    public final ZIncludeLikeBinding incLike;
    @NonNull
    public final AdjustableImageView ivNewsFeedBanner;
    @NonNull
    public final AppCompatImageView ivNewsFeedImageProfile;
    @NonNull
    public final LinearLayout linkBox;
    @NonNull
    public final DtacFontTextView tvNewsFeedContent;
    @NonNull
    public final DtacFontTextView tvNewsFeedReadmore;
    @NonNull
    public final DtacFontTextView tvNewsFeedTime;
    @NonNull
    public final DtacFontTextView tvUrlLink;
    @NonNull
    public final DtacFontTextView tvUsername;

    public ZNewsFeedFullContentItemRowBinding(DtacCardView dtacCardView, DtacCardView dtacCardView2, ZIncludeLikeBinding zIncludeLikeBinding, AdjustableImageView adjustableImageView, AppCompatImageView appCompatImageView, LinearLayout linearLayout, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5) {
        this.f84669a = dtacCardView;
        this.cvNewsFeed = dtacCardView2;
        this.incLike = zIncludeLikeBinding;
        this.ivNewsFeedBanner = adjustableImageView;
        this.ivNewsFeedImageProfile = appCompatImageView;
        this.linkBox = linearLayout;
        this.tvNewsFeedContent = dtacFontTextView;
        this.tvNewsFeedReadmore = dtacFontTextView2;
        this.tvNewsFeedTime = dtacFontTextView3;
        this.tvUrlLink = dtacFontTextView4;
        this.tvUsername = dtacFontTextView5;
    }

    @NonNull
    public static ZNewsFeedFullContentItemRowBinding bind(@NonNull View view) {
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
                    i = R.id.linkBox;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = R.id.tvNewsFeedContent;
                        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView != null) {
                            i = R.id.tvNewsFeedReadmore;
                            DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView2 != null) {
                                i = R.id.tvNewsFeedTime;
                                DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView3 != null) {
                                    i = R.id.tvUrlLink;
                                    DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView4 != null) {
                                        i = R.id.tvUsername;
                                        DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (dtacFontTextView5 != null) {
                                            return new ZNewsFeedFullContentItemRowBinding(dtacCardView, dtacCardView, bind, adjustableImageView, appCompatImageView, linearLayout, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5);
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
    public static ZNewsFeedFullContentItemRowBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZNewsFeedFullContentItemRowBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_news_feed_full_content_item_row, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public DtacCardView getRoot() {
        return this.f84669a;
    }
}
