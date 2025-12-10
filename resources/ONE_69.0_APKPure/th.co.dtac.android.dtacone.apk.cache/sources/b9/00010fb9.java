package th.p047co.dtac.android.dtacone.adapter.news_feed;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.bumptech.glide.request.target.BitmapImageViewTarget;
import com.bumptech.glide.signature.ObjectKey;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.inthecheesefactory.thecheeselibrary.widget.AdjustableImageView;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes;
import java.util.ArrayList;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.cli.HelpFormatter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.adapter.news_feed.OneNewsFeedAdapter;
import th.p047co.dtac.android.dtacone.app_one.model.newsFeed.OneNewsItem;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.databinding.OneNewsFeedContentImageItemRowBinding;
import th.p047co.dtac.android.dtacone.databinding.OneNewsFeedContentItemRowBinding;
import th.p047co.dtac.android.dtacone.databinding.OneNewsFeedContentLinkItemRowBinding;
import th.p047co.dtac.android.dtacone.databinding.OneNewsFeedFullContentItemRowBinding;
import th.p047co.dtac.android.dtacone.databinding.OneNewsFeedImageItemRowBinding;
import th.p047co.dtac.android.dtacone.databinding.OneNewsFeedImageLinkItemRowBinding;
import th.p047co.dtac.android.dtacone.databinding.OneNewsFeedLinkItemRowBinding;
import th.p047co.dtac.android.dtacone.databinding.ZNewsFeedLoadingItemRowBinding;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.util.constant.LanguageSupport;
import th.p047co.dtac.android.dtacone.util.date.DateUtil;
import th.p047co.dtac.android.dtacone.view.appOne.home.viewModel.OneNewsFeedViewModel;
import th.p047co.dtac.android.dtacone.widget.view.listener.OnSingleClickListenerKt;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\nKLMNOPQRSTB'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0011\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0010¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0019H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\u0002H\u0016¢\u0006\u0004\b(\u0010)J\u0015\u0010,\u001a\u00020\u00102\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J'\u00100\u001a\u00020\u00102\u0006\u0010.\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010/¢\u0006\u0004\b0\u00101J7\u00105\u001a\u00020\u00102\u0006\u0010.\u001a\u00020\b2\u0006\u00102\u001a\u00020\u000e2\u0006\u00104\u001a\u0002032\u0006\u0010\u001e\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010/¢\u0006\u0004\b5\u00106J\u0015\u00108\u001a\u0002072\u0006\u0010.\u001a\u00020\b¢\u0006\u0004\b8\u00109J\u001f\u0010<\u001a\u00020\u00102\u0006\u0010;\u001a\u00020:2\u0006\u0010.\u001a\u00020\bH\u0002¢\u0006\u0004\b<\u0010=J!\u0010>\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b>\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010?R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010@R\u001c\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010AR\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010F\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010H\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010ER\u0016\u0010J\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010E¨\u0006U"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/news_feed/OneNewsFeedAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/content/Context;", "mContext", "Lth/co/dtac/android/dtacone/view/appOne/home/viewModel/OneNewsFeedViewModel;", "presenter", "Ljava/util/ArrayList;", "Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneNewsItem;", "mNewsFeedList", "<init>", "(Landroid/content/Context;Lth/co/dtac/android/dtacone/view/appOne/home/viewModel/OneNewsFeedViewModel;Ljava/util/ArrayList;)V", "", "imageUrl", "Landroid/widget/ImageView;", "ivImageBanner", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Ljava/lang/String;Landroid/widget/ImageView;)V", "", "lastPage", "setLastPage", "(Z)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewHolder", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "addLoadingFooter", "()V", "getItemViewType", "(I)I", "getItemCount", "()I", "holder", "onViewRecycled", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "Lth/co/dtac/android/dtacone/adapter/news_feed/OneNewsFeedAdapter$OnClickSeeMoreDetail;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnClickMoreDetail", "(Lth/co/dtac/android/dtacone/adapter/news_feed/OneNewsFeedAdapter$OnClickSeeMoreDetail;)V", "newsFeed", "", "updateItem", "(Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneNewsItem;ILjava/lang/Object;)V", "ivLike", "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "tvCountLike", "setActionLike", "(Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneNewsItem;Landroid/widget/ImageView;Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;ILjava/lang/Object;)V", "Landroid/text/SpannableString;", "setSpanReadMore", "(Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneNewsItem;)Landroid/text/SpannableString;", "Lcom/inthecheesefactory/thecheeselibrary/widget/AdjustableImageView;", "imageView", OperatorName.CURVE_TO, "(Lcom/inthecheesefactory/thecheeselibrary/widget/AdjustableImageView;Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneNewsItem;)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/content/Context;", "Lth/co/dtac/android/dtacone/view/appOne/home/viewModel/OneNewsFeedViewModel;", "Ljava/util/ArrayList;", "d", "Lth/co/dtac/android/dtacone/adapter/news_feed/OneNewsFeedAdapter$OnClickSeeMoreDetail;", "e", "Z", "isLoadingAdded", OperatorName.FILL_NON_ZERO, "isLastPage", OperatorName.NON_STROKING_GRAY, "isUpdate", "NewsFeedContentImageViewHolder", "NewsFeedContentLinkViewHolder", "NewsFeedContentViewHolder", "NewsFeedFullContentViewHolder", "NewsFeedImageLinkViewHolder", "NewsFeedImageViewHolder", "NewsFeedLinkViewHolder", "NewsFeedLoadingViewHolder", "OnClickSeeMoreDetail", "TYPE", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.adapter.news_feed.OneNewsFeedAdapter */
/* loaded from: classes7.dex */
public final class OneNewsFeedAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final Context f81382a;

    /* renamed from: b */
    public final OneNewsFeedViewModel f81383b;

    /* renamed from: c */
    public final ArrayList f81384c;

    /* renamed from: d */
    public OnClickSeeMoreDetail f81385d;

    /* renamed from: e */
    public boolean f81386e;

    /* renamed from: f */
    public boolean f81387f;

    /* renamed from: g */
    public boolean f81388g;

    @Metadata(m29143d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ3\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\u0010\u0010\u001a\u00060\u0000R\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/news_feed/OneNewsFeedAdapter$NewsFeedContentImageViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/OneNewsFeedContentImageItemRowBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/adapter/news_feed/OneNewsFeedAdapter;Lth/co/dtac/android/dtacone/databinding/OneNewsFeedContentImageItemRowBinding;)V", "Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneNewsItem;", "newsFeed", "", "updateLike", "(Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneNewsItem;)V", "", "timeAgo", "Landroid/view/animation/Animation;", "animation", "Lth/co/dtac/android/dtacone/adapter/news_feed/OneNewsFeedAdapter;", "viewHolder", "bind", "(Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneNewsItem;Ljava/lang/String;Landroid/view/animation/Animation;Lth/co/dtac/android/dtacone/adapter/news_feed/OneNewsFeedAdapter$NewsFeedContentImageViewHolder;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/OneNewsFeedContentImageItemRowBinding;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOneNewsFeedAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneNewsFeedAdapter.kt\nth/co/dtac/android/dtacone/adapter/news_feed/OneNewsFeedAdapter$NewsFeedContentImageViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,637:1\n1#2:638\n*E\n"})
    /* renamed from: th.co.dtac.android.dtacone.adapter.news_feed.OneNewsFeedAdapter$NewsFeedContentImageViewHolder */
    /* loaded from: classes7.dex */
    public final class NewsFeedContentImageViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final OneNewsFeedContentImageItemRowBinding f81389a;

        /* renamed from: b */
        public final /* synthetic */ OneNewsFeedAdapter f81390b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewsFeedContentImageViewHolder(@NotNull OneNewsFeedAdapter oneNewsFeedAdapter, OneNewsFeedContentImageItemRowBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f81390b = oneNewsFeedAdapter;
            this.f81389a = binding;
        }

        /* renamed from: b */
        public static /* synthetic */ void m20508b(OneNewsFeedAdapter oneNewsFeedAdapter, OneNewsItem oneNewsItem, NewsFeedContentImageViewHolder newsFeedContentImageViewHolder, NewsFeedContentImageViewHolder newsFeedContentImageViewHolder2, View view) {
            m20505e(oneNewsFeedAdapter, oneNewsItem, newsFeedContentImageViewHolder, newsFeedContentImageViewHolder2, view);
        }

        /* renamed from: c */
        public static /* synthetic */ void m20507c(OneNewsFeedAdapter oneNewsFeedAdapter, OneNewsItem oneNewsItem, View view) {
            m20506d(oneNewsFeedAdapter, oneNewsItem, view);
        }

        /* renamed from: d */
        public static final void m20506d(OneNewsFeedAdapter this$0, OneNewsItem newsFeed, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(newsFeed, "$newsFeed");
            OnClickSeeMoreDetail onClickSeeMoreDetail = this$0.f81385d;
            Intrinsics.checkNotNull(onClickSeeMoreDetail);
            onClickSeeMoreDetail.onClickMoreImageOriginal(newsFeed);
        }

        /* renamed from: e */
        public static final void m20505e(OneNewsFeedAdapter this$0, OneNewsItem newsFeed, NewsFeedContentImageViewHolder this$1, NewsFeedContentImageViewHolder viewHolder, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(newsFeed, "$newsFeed");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Intrinsics.checkNotNullParameter(viewHolder, "$viewHolder");
            if (this$0.f81383b.hasContentDetail(newsFeed)) {
                OnClickSeeMoreDetail onClickSeeMoreDetail = this$0.f81385d;
                Intrinsics.checkNotNull(onClickSeeMoreDetail);
                onClickSeeMoreDetail.onClickMoreContentDetail(newsFeed, this$1.getAdapterPosition(), viewHolder);
            }
        }

        public final void bind(@NotNull final OneNewsItem newsFeed, @NotNull String timeAgo, @Nullable Animation animation, @NotNull final NewsFeedContentImageViewHolder viewHolder) {
            Intrinsics.checkNotNullParameter(newsFeed, "newsFeed");
            Intrinsics.checkNotNullParameter(timeAgo, "timeAgo");
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            AdjustableImageView adjustableImageView = this.f81389a.ivNewsFeedBanner;
            final OneNewsFeedAdapter oneNewsFeedAdapter = this.f81390b;
            adjustableImageView.setOnClickListener(new View.OnClickListener() { // from class: lY0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OneNewsFeedAdapter.NewsFeedContentImageViewHolder.m20507c(OneNewsFeedAdapter.this, newsFeed, view);
                }
            });
            OneFontTextView oneFontTextView = this.f81389a.tvNewsFeedContent;
            final OneNewsFeedAdapter oneNewsFeedAdapter2 = this.f81390b;
            oneFontTextView.setOnClickListener(new View.OnClickListener() { // from class: mY0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OneNewsFeedAdapter.NewsFeedContentImageViewHolder.m20508b(OneNewsFeedAdapter.this, newsFeed, this, viewHolder, view);
                }
            });
            OneNewsFeedAdapter oneNewsFeedAdapter3 = this.f81390b;
            ImageView imageView = this.f81389a.incLike.ivLike;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.incLike.ivLike");
            OneFontTextView oneFontTextView2 = this.f81389a.incLike.tvCountLike;
            Intrinsics.checkNotNullExpressionValue(oneFontTextView2, "binding.incLike.tvCountLike");
            oneNewsFeedAdapter3.setActionLike(newsFeed, imageView, oneFontTextView2, getAdapterPosition(), viewHolder);
            if (animation != null) {
                this.f81389a.cvNewsFeed.startAnimation(animation);
            }
            OneNewsFeedAdapter oneNewsFeedAdapter4 = this.f81390b;
            AdjustableImageView adjustableImageView2 = this.f81389a.ivNewsFeedBanner;
            Intrinsics.checkNotNullExpressionValue(adjustableImageView2, "binding.ivNewsFeedBanner");
            oneNewsFeedAdapter4.m20509c(adjustableImageView2, newsFeed);
            this.f81390b.m20511a(newsFeed.getScreenshot(), this.f81389a.ivNewsFeedBanner);
            OneNewsFeedAdapter oneNewsFeedAdapter5 = this.f81390b;
            String publisherImg = newsFeed.getPublisherImg();
            AppCompatImageView appCompatImageView = this.f81389a.ivNewsFeedImageProfile;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "binding.ivNewsFeedImageProfile");
            oneNewsFeedAdapter5.m20510b(publisherImg, appCompatImageView);
            this.f81389a.tvUsername.setText(newsFeed.getPublisherName());
            this.f81389a.tvNewsFeedTime.setText(timeAgo);
            if (newsFeed.getContentPreview().length() >= newsFeed.getMAXIMUM_PREVIEW()) {
                this.f81389a.tvNewsFeedContent.setText(this.f81390b.setSpanReadMore(newsFeed));
                return;
            }
            this.f81389a.tvNewsFeedContent.setText(newsFeed.getContentPreview());
        }

        public final void updateLike(@NotNull OneNewsItem newsFeed) {
            int i;
            Intrinsics.checkNotNullParameter(newsFeed, "newsFeed");
            if (Intrinsics.areEqual(newsFeed.isLike(), Boolean.TRUE)) {
                this.f81389a.incLike.ivLike.setImageResource(R.drawable.iconsnewslike);
            } else {
                this.f81389a.incLike.ivLike.setImageResource(R.drawable.iconsnewsdislike);
            }
            Integer liked = newsFeed.getLiked();
            if (liked != null) {
                i = liked.intValue();
            } else {
                i = 0;
            }
            if (i > 0) {
                OneFontTextView oneFontTextView = this.f81389a.incLike.tvCountLike;
                Intrinsics.checkNotNullExpressionValue(oneFontTextView, "binding.incLike.tvCountLike");
                ViewVisibleExtKt.toVisible(oneFontTextView);
                this.f81389a.incLike.tvCountLike.setText(String.valueOf(newsFeed.getLiked()));
                return;
            }
            OneFontTextView oneFontTextView2 = this.f81389a.incLike.tvCountLike;
            Intrinsics.checkNotNullExpressionValue(oneFontTextView2, "binding.incLike.tvCountLike");
            ViewVisibleExtKt.toGone(oneFontTextView2);
        }
    }

    @Metadata(m29143d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ3\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\u0010\u0010\u001a\u00060\u0000R\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/news_feed/OneNewsFeedAdapter$NewsFeedContentLinkViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/OneNewsFeedContentLinkItemRowBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/adapter/news_feed/OneNewsFeedAdapter;Lth/co/dtac/android/dtacone/databinding/OneNewsFeedContentLinkItemRowBinding;)V", "Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneNewsItem;", "newsFeed", "", "updateLike", "(Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneNewsItem;)V", "", "timeAgo", "Landroid/view/animation/Animation;", "animation", "Lth/co/dtac/android/dtacone/adapter/news_feed/OneNewsFeedAdapter;", "viewHolder", "bind", "(Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneNewsItem;Ljava/lang/String;Landroid/view/animation/Animation;Lth/co/dtac/android/dtacone/adapter/news_feed/OneNewsFeedAdapter$NewsFeedContentLinkViewHolder;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/OneNewsFeedContentLinkItemRowBinding;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOneNewsFeedAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneNewsFeedAdapter.kt\nth/co/dtac/android/dtacone/adapter/news_feed/OneNewsFeedAdapter$NewsFeedContentLinkViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,637:1\n1#2:638\n*E\n"})
    /* renamed from: th.co.dtac.android.dtacone.adapter.news_feed.OneNewsFeedAdapter$NewsFeedContentLinkViewHolder */
    /* loaded from: classes7.dex */
    public final class NewsFeedContentLinkViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final OneNewsFeedContentLinkItemRowBinding f81391a;

        /* renamed from: b */
        public final /* synthetic */ OneNewsFeedAdapter f81392b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewsFeedContentLinkViewHolder(@NotNull OneNewsFeedAdapter oneNewsFeedAdapter, OneNewsFeedContentLinkItemRowBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f81392b = oneNewsFeedAdapter;
            this.f81391a = binding;
        }

        /* renamed from: b */
        public static /* synthetic */ void m20504b(OneNewsFeedAdapter oneNewsFeedAdapter, OneNewsItem oneNewsItem, NewsFeedContentLinkViewHolder newsFeedContentLinkViewHolder, NewsFeedContentLinkViewHolder newsFeedContentLinkViewHolder2, View view) {
            m20501e(oneNewsFeedAdapter, oneNewsItem, newsFeedContentLinkViewHolder, newsFeedContentLinkViewHolder2, view);
        }

        /* renamed from: c */
        public static /* synthetic */ void m20503c(OneNewsFeedAdapter oneNewsFeedAdapter, OneNewsItem oneNewsItem, View view) {
            m20502d(oneNewsFeedAdapter, oneNewsItem, view);
        }

        /* renamed from: d */
        public static final void m20502d(OneNewsFeedAdapter this$0, OneNewsItem newsFeed, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(newsFeed, "$newsFeed");
            OnClickSeeMoreDetail onClickSeeMoreDetail = this$0.f81385d;
            Intrinsics.checkNotNull(onClickSeeMoreDetail);
            onClickSeeMoreDetail.onClickOpenWebView(newsFeed);
        }

        /* renamed from: e */
        public static final void m20501e(OneNewsFeedAdapter this$0, OneNewsItem newsFeed, NewsFeedContentLinkViewHolder this$1, NewsFeedContentLinkViewHolder viewHolder, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(newsFeed, "$newsFeed");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Intrinsics.checkNotNullParameter(viewHolder, "$viewHolder");
            if (this$0.f81383b.hasContentDetail(newsFeed)) {
                OnClickSeeMoreDetail onClickSeeMoreDetail = this$0.f81385d;
                Intrinsics.checkNotNull(onClickSeeMoreDetail);
                onClickSeeMoreDetail.onClickMoreContentDetail(newsFeed, this$1.getAdapterPosition(), viewHolder);
            }
        }

        public final void bind(@NotNull final OneNewsItem newsFeed, @NotNull String timeAgo, @Nullable Animation animation, @NotNull final NewsFeedContentLinkViewHolder viewHolder) {
            Intrinsics.checkNotNullParameter(newsFeed, "newsFeed");
            Intrinsics.checkNotNullParameter(timeAgo, "timeAgo");
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            LinearLayout linearLayout = this.f81391a.linkBox;
            final OneNewsFeedAdapter oneNewsFeedAdapter = this.f81392b;
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: nY0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OneNewsFeedAdapter.NewsFeedContentLinkViewHolder.m20503c(OneNewsFeedAdapter.this, newsFeed, view);
                }
            });
            OneFontTextView oneFontTextView = this.f81391a.tvNewsFeedContent;
            final OneNewsFeedAdapter oneNewsFeedAdapter2 = this.f81392b;
            oneFontTextView.setOnClickListener(new View.OnClickListener() { // from class: oY0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OneNewsFeedAdapter.NewsFeedContentLinkViewHolder.m20504b(OneNewsFeedAdapter.this, newsFeed, this, viewHolder, view);
                }
            });
            OneNewsFeedAdapter oneNewsFeedAdapter3 = this.f81392b;
            ImageView imageView = this.f81391a.incLike.ivLike;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.incLike.ivLike");
            OneFontTextView oneFontTextView2 = this.f81391a.incLike.tvCountLike;
            Intrinsics.checkNotNullExpressionValue(oneFontTextView2, "binding.incLike.tvCountLike");
            oneNewsFeedAdapter3.setActionLike(newsFeed, imageView, oneFontTextView2, getAdapterPosition(), viewHolder);
            if (animation != null) {
                this.f81391a.cvNewsFeed.startAnimation(animation);
            }
            OneNewsFeedAdapter oneNewsFeedAdapter4 = this.f81392b;
            String publisherImg = newsFeed.getPublisherImg();
            AppCompatImageView appCompatImageView = this.f81391a.ivNewsFeedImageProfile;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "binding.ivNewsFeedImageProfile");
            oneNewsFeedAdapter4.m20510b(publisherImg, appCompatImageView);
            this.f81391a.tvUsername.setText(newsFeed.getPublisherName());
            this.f81391a.tvNewsFeedTime.setText(timeAgo);
            this.f81391a.tvUrlLink.setText(newsFeed.getUri());
            if (newsFeed.getContentPreview().length() >= newsFeed.getMAXIMUM_PREVIEW()) {
                this.f81391a.tvNewsFeedContent.setText(this.f81392b.setSpanReadMore(newsFeed));
                return;
            }
            this.f81391a.tvNewsFeedContent.setText(newsFeed.getContentPreview());
        }

        public final void updateLike(@NotNull OneNewsItem newsFeed) {
            int i;
            Intrinsics.checkNotNullParameter(newsFeed, "newsFeed");
            if (Intrinsics.areEqual(newsFeed.isLike(), Boolean.TRUE)) {
                this.f81391a.incLike.ivLike.setImageResource(R.drawable.iconsnewslike);
            } else {
                this.f81391a.incLike.ivLike.setImageResource(R.drawable.iconsnewsdislike);
            }
            Integer liked = newsFeed.getLiked();
            if (liked != null) {
                i = liked.intValue();
            } else {
                i = 0;
            }
            if (i > 0) {
                OneFontTextView oneFontTextView = this.f81391a.incLike.tvCountLike;
                Intrinsics.checkNotNullExpressionValue(oneFontTextView, "binding.incLike.tvCountLike");
                ViewVisibleExtKt.toVisible(oneFontTextView);
                this.f81391a.incLike.tvCountLike.setText(String.valueOf(newsFeed.getLiked()));
                return;
            }
            OneFontTextView oneFontTextView2 = this.f81391a.incLike.tvCountLike;
            Intrinsics.checkNotNullExpressionValue(oneFontTextView2, "binding.incLike.tvCountLike");
            ViewVisibleExtKt.toGone(oneFontTextView2);
        }
    }

    @Metadata(m29143d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ3\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\u0010\u0010\u001a\u00060\u0000R\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/news_feed/OneNewsFeedAdapter$NewsFeedContentViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/OneNewsFeedContentItemRowBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/adapter/news_feed/OneNewsFeedAdapter;Lth/co/dtac/android/dtacone/databinding/OneNewsFeedContentItemRowBinding;)V", "Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneNewsItem;", "newsFeed", "", "updateLike", "(Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneNewsItem;)V", "", "timeAgo", "Landroid/view/animation/Animation;", "animation", "Lth/co/dtac/android/dtacone/adapter/news_feed/OneNewsFeedAdapter;", "viewHolder", "bind", "(Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneNewsItem;Ljava/lang/String;Landroid/view/animation/Animation;Lth/co/dtac/android/dtacone/adapter/news_feed/OneNewsFeedAdapter$NewsFeedContentViewHolder;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/OneNewsFeedContentItemRowBinding;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOneNewsFeedAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneNewsFeedAdapter.kt\nth/co/dtac/android/dtacone/adapter/news_feed/OneNewsFeedAdapter$NewsFeedContentViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,637:1\n1#2:638\n*E\n"})
    /* renamed from: th.co.dtac.android.dtacone.adapter.news_feed.OneNewsFeedAdapter$NewsFeedContentViewHolder */
    /* loaded from: classes7.dex */
    public final class NewsFeedContentViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final OneNewsFeedContentItemRowBinding f81393a;

        /* renamed from: b */
        public final /* synthetic */ OneNewsFeedAdapter f81394b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewsFeedContentViewHolder(@NotNull OneNewsFeedAdapter oneNewsFeedAdapter, OneNewsFeedContentItemRowBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f81394b = oneNewsFeedAdapter;
            this.f81393a = binding;
        }

        /* renamed from: b */
        public static /* synthetic */ void m20500b(OneNewsFeedAdapter oneNewsFeedAdapter, OneNewsItem oneNewsItem, NewsFeedContentViewHolder newsFeedContentViewHolder, NewsFeedContentViewHolder newsFeedContentViewHolder2, View view) {
            m20499c(oneNewsFeedAdapter, oneNewsItem, newsFeedContentViewHolder, newsFeedContentViewHolder2, view);
        }

        /* renamed from: c */
        public static final void m20499c(OneNewsFeedAdapter this$0, OneNewsItem newsFeed, NewsFeedContentViewHolder this$1, NewsFeedContentViewHolder viewHolder, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(newsFeed, "$newsFeed");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Intrinsics.checkNotNullParameter(viewHolder, "$viewHolder");
            if (this$0.f81383b.hasContentDetail(newsFeed)) {
                OnClickSeeMoreDetail onClickSeeMoreDetail = this$0.f81385d;
                Intrinsics.checkNotNull(onClickSeeMoreDetail);
                onClickSeeMoreDetail.onClickMoreContentDetail(newsFeed, this$1.getAdapterPosition(), viewHolder);
            }
        }

        public final void bind(@NotNull final OneNewsItem newsFeed, @NotNull String timeAgo, @Nullable Animation animation, @NotNull final NewsFeedContentViewHolder viewHolder) {
            Intrinsics.checkNotNullParameter(newsFeed, "newsFeed");
            Intrinsics.checkNotNullParameter(timeAgo, "timeAgo");
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            OneFontTextView oneFontTextView = this.f81393a.tvNewsFeedContent;
            final OneNewsFeedAdapter oneNewsFeedAdapter = this.f81394b;
            oneFontTextView.setOnClickListener(new View.OnClickListener() { // from class: pY0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OneNewsFeedAdapter.NewsFeedContentViewHolder.m20500b(OneNewsFeedAdapter.this, newsFeed, this, viewHolder, view);
                }
            });
            OneNewsFeedAdapter oneNewsFeedAdapter2 = this.f81394b;
            ImageView imageView = this.f81393a.incLike.ivLike;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.incLike.ivLike");
            OneFontTextView oneFontTextView2 = this.f81393a.incLike.tvCountLike;
            Intrinsics.checkNotNullExpressionValue(oneFontTextView2, "binding.incLike.tvCountLike");
            oneNewsFeedAdapter2.setActionLike(newsFeed, imageView, oneFontTextView2, getAdapterPosition(), viewHolder);
            if (animation != null) {
                this.f81393a.cvNewsFeed.startAnimation(animation);
            }
            OneNewsFeedAdapter oneNewsFeedAdapter3 = this.f81394b;
            String publisherImg = newsFeed.getPublisherImg();
            AppCompatImageView appCompatImageView = this.f81393a.ivNewsFeedImageProfile;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "binding.ivNewsFeedImageProfile");
            oneNewsFeedAdapter3.m20510b(publisherImg, appCompatImageView);
            this.f81393a.tvUsername.setText(newsFeed.getPublisherName());
            this.f81393a.tvNewsFeedTime.setText(timeAgo);
            if (newsFeed.getContentPreview().length() >= newsFeed.getMAXIMUM_PREVIEW()) {
                this.f81393a.tvNewsFeedContent.setText(this.f81394b.setSpanReadMore(newsFeed));
                return;
            }
            this.f81393a.tvNewsFeedContent.setText(newsFeed.getContentPreview());
        }

        public final void updateLike(@NotNull OneNewsItem newsFeed) {
            int i;
            Intrinsics.checkNotNullParameter(newsFeed, "newsFeed");
            if (Intrinsics.areEqual(newsFeed.isLike(), Boolean.TRUE)) {
                this.f81393a.incLike.ivLike.setImageResource(R.drawable.iconsnewslike);
            } else {
                this.f81393a.incLike.ivLike.setImageResource(R.drawable.iconsnewsdislike);
            }
            Integer liked = newsFeed.getLiked();
            if (liked != null) {
                i = liked.intValue();
            } else {
                i = 0;
            }
            if (i > 0) {
                OneFontTextView oneFontTextView = this.f81393a.incLike.tvCountLike;
                Intrinsics.checkNotNullExpressionValue(oneFontTextView, "binding.incLike.tvCountLike");
                ViewVisibleExtKt.toVisible(oneFontTextView);
                this.f81393a.incLike.tvCountLike.setText(String.valueOf(newsFeed.getLiked()));
                return;
            }
            OneFontTextView oneFontTextView2 = this.f81393a.incLike.tvCountLike;
            Intrinsics.checkNotNullExpressionValue(oneFontTextView2, "binding.incLike.tvCountLike");
            ViewVisibleExtKt.toGone(oneFontTextView2);
        }
    }

    @Metadata(m29143d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ3\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\u0010\u0010\u001a\u00060\u0000R\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/news_feed/OneNewsFeedAdapter$NewsFeedFullContentViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/OneNewsFeedFullContentItemRowBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/adapter/news_feed/OneNewsFeedAdapter;Lth/co/dtac/android/dtacone/databinding/OneNewsFeedFullContentItemRowBinding;)V", "Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneNewsItem;", "newsFeed", "", "updateLike", "(Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneNewsItem;)V", "", "timeAgo", "Landroid/view/animation/Animation;", "animation", "Lth/co/dtac/android/dtacone/adapter/news_feed/OneNewsFeedAdapter;", "viewHolder", "bind", "(Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneNewsItem;Ljava/lang/String;Landroid/view/animation/Animation;Lth/co/dtac/android/dtacone/adapter/news_feed/OneNewsFeedAdapter$NewsFeedFullContentViewHolder;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/OneNewsFeedFullContentItemRowBinding;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOneNewsFeedAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneNewsFeedAdapter.kt\nth/co/dtac/android/dtacone/adapter/news_feed/OneNewsFeedAdapter$NewsFeedFullContentViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,637:1\n1#2:638\n*E\n"})
    /* renamed from: th.co.dtac.android.dtacone.adapter.news_feed.OneNewsFeedAdapter$NewsFeedFullContentViewHolder */
    /* loaded from: classes7.dex */
    public final class NewsFeedFullContentViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final OneNewsFeedFullContentItemRowBinding f81395a;

        /* renamed from: b */
        public final /* synthetic */ OneNewsFeedAdapter f81396b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewsFeedFullContentViewHolder(@NotNull OneNewsFeedAdapter oneNewsFeedAdapter, OneNewsFeedFullContentItemRowBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f81396b = oneNewsFeedAdapter;
            this.f81395a = binding;
        }

        /* renamed from: b */
        public static /* synthetic */ void m20498b(OneNewsFeedAdapter oneNewsFeedAdapter, OneNewsItem oneNewsItem, NewsFeedFullContentViewHolder newsFeedFullContentViewHolder, NewsFeedFullContentViewHolder newsFeedFullContentViewHolder2, View view) {
            m20493g(oneNewsFeedAdapter, oneNewsItem, newsFeedFullContentViewHolder, newsFeedFullContentViewHolder2, view);
        }

        /* renamed from: c */
        public static /* synthetic */ void m20497c(OneNewsFeedAdapter oneNewsFeedAdapter, OneNewsItem oneNewsItem, View view) {
            m20494f(oneNewsFeedAdapter, oneNewsItem, view);
        }

        /* renamed from: d */
        public static /* synthetic */ void m20496d(OneNewsFeedAdapter oneNewsFeedAdapter, OneNewsItem oneNewsItem, View view) {
            m20495e(oneNewsFeedAdapter, oneNewsItem, view);
        }

        /* renamed from: e */
        public static final void m20495e(OneNewsFeedAdapter this$0, OneNewsItem newsFeed, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(newsFeed, "$newsFeed");
            OnClickSeeMoreDetail onClickSeeMoreDetail = this$0.f81385d;
            Intrinsics.checkNotNull(onClickSeeMoreDetail);
            onClickSeeMoreDetail.onClickOpenWebView(newsFeed);
        }

        /* renamed from: f */
        public static final void m20494f(OneNewsFeedAdapter this$0, OneNewsItem newsFeed, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(newsFeed, "$newsFeed");
            OnClickSeeMoreDetail onClickSeeMoreDetail = this$0.f81385d;
            Intrinsics.checkNotNull(onClickSeeMoreDetail);
            onClickSeeMoreDetail.onClickOpenWebView(newsFeed);
        }

        /* renamed from: g */
        public static final void m20493g(OneNewsFeedAdapter this$0, OneNewsItem newsFeed, NewsFeedFullContentViewHolder this$1, NewsFeedFullContentViewHolder viewHolder, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(newsFeed, "$newsFeed");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Intrinsics.checkNotNullParameter(viewHolder, "$viewHolder");
            if (this$0.f81383b.hasContentDetail(newsFeed) && newsFeed.getContent() != null) {
                OnClickSeeMoreDetail onClickSeeMoreDetail = this$0.f81385d;
                Intrinsics.checkNotNull(onClickSeeMoreDetail);
                onClickSeeMoreDetail.onClickMoreContentDetail(newsFeed, this$1.getAdapterPosition(), viewHolder);
            }
        }

        public final void bind(@NotNull final OneNewsItem newsFeed, @NotNull String timeAgo, @Nullable Animation animation, @NotNull final NewsFeedFullContentViewHolder viewHolder) {
            Intrinsics.checkNotNullParameter(newsFeed, "newsFeed");
            Intrinsics.checkNotNullParameter(timeAgo, "timeAgo");
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            LinearLayout linearLayout = this.f81395a.linkBox;
            final OneNewsFeedAdapter oneNewsFeedAdapter = this.f81396b;
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: qY0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OneNewsFeedAdapter.NewsFeedFullContentViewHolder.m20496d(OneNewsFeedAdapter.this, newsFeed, view);
                }
            });
            AdjustableImageView adjustableImageView = this.f81395a.ivNewsFeedBanner;
            final OneNewsFeedAdapter oneNewsFeedAdapter2 = this.f81396b;
            adjustableImageView.setOnClickListener(new View.OnClickListener() { // from class: rY0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OneNewsFeedAdapter.NewsFeedFullContentViewHolder.m20497c(OneNewsFeedAdapter.this, newsFeed, view);
                }
            });
            OneFontTextView oneFontTextView = this.f81395a.tvNewsFeedContent;
            final OneNewsFeedAdapter oneNewsFeedAdapter3 = this.f81396b;
            oneFontTextView.setOnClickListener(new View.OnClickListener() { // from class: sY0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OneNewsFeedAdapter.NewsFeedFullContentViewHolder.m20498b(OneNewsFeedAdapter.this, newsFeed, this, viewHolder, view);
                }
            });
            OneNewsFeedAdapter oneNewsFeedAdapter4 = this.f81396b;
            ImageView imageView = this.f81395a.incLike.ivLike;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.incLike.ivLike");
            OneFontTextView oneFontTextView2 = this.f81395a.incLike.tvCountLike;
            Intrinsics.checkNotNullExpressionValue(oneFontTextView2, "binding.incLike.tvCountLike");
            oneNewsFeedAdapter4.setActionLike(newsFeed, imageView, oneFontTextView2, getAdapterPosition(), viewHolder);
            if (animation != null) {
                this.f81395a.cvNewsFeed.startAnimation(animation);
            }
            OneNewsFeedAdapter oneNewsFeedAdapter5 = this.f81396b;
            AdjustableImageView adjustableImageView2 = this.f81395a.ivNewsFeedBanner;
            Intrinsics.checkNotNullExpressionValue(adjustableImageView2, "binding.ivNewsFeedBanner");
            oneNewsFeedAdapter5.m20509c(adjustableImageView2, newsFeed);
            this.f81396b.m20511a(newsFeed.getScreenshot(), this.f81395a.ivNewsFeedBanner);
            OneNewsFeedAdapter oneNewsFeedAdapter6 = this.f81396b;
            String publisherImg = newsFeed.getPublisherImg();
            AppCompatImageView appCompatImageView = this.f81395a.ivNewsFeedImageProfile;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "binding.ivNewsFeedImageProfile");
            oneNewsFeedAdapter6.m20510b(publisherImg, appCompatImageView);
            this.f81395a.tvUrlLink.setText(newsFeed.getUri());
            this.f81395a.tvUsername.setText(newsFeed.getPublisherName());
            this.f81395a.tvNewsFeedTime.setText(timeAgo);
            if (newsFeed.getContentPreview().length() >= newsFeed.getMAXIMUM_PREVIEW()) {
                this.f81395a.tvNewsFeedContent.setText(this.f81396b.setSpanReadMore(newsFeed));
                return;
            }
            this.f81395a.tvNewsFeedContent.setText(newsFeed.getContentPreview());
        }

        public final void updateLike(@NotNull OneNewsItem newsFeed) {
            int i;
            Intrinsics.checkNotNullParameter(newsFeed, "newsFeed");
            if (Intrinsics.areEqual(newsFeed.isLike(), Boolean.TRUE)) {
                this.f81395a.incLike.ivLike.setImageResource(R.drawable.iconsnewslike);
            } else {
                this.f81395a.incLike.ivLike.setImageResource(R.drawable.iconsnewsdislike);
            }
            Integer liked = newsFeed.getLiked();
            if (liked != null) {
                i = liked.intValue();
            } else {
                i = 0;
            }
            if (i > 0) {
                OneFontTextView oneFontTextView = this.f81395a.incLike.tvCountLike;
                Intrinsics.checkNotNullExpressionValue(oneFontTextView, "binding.incLike.tvCountLike");
                ViewVisibleExtKt.toVisible(oneFontTextView);
                this.f81395a.incLike.tvCountLike.setText(String.valueOf(newsFeed.getLiked()));
                return;
            }
            OneFontTextView oneFontTextView2 = this.f81395a.incLike.tvCountLike;
            Intrinsics.checkNotNullExpressionValue(oneFontTextView2, "binding.incLike.tvCountLike");
            ViewVisibleExtKt.toGone(oneFontTextView2);
        }
    }

    @Metadata(m29143d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ3\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\u0010\u0010\u001a\u00060\u0000R\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/news_feed/OneNewsFeedAdapter$NewsFeedImageLinkViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/OneNewsFeedImageLinkItemRowBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/adapter/news_feed/OneNewsFeedAdapter;Lth/co/dtac/android/dtacone/databinding/OneNewsFeedImageLinkItemRowBinding;)V", "Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneNewsItem;", "newsFeed", "", "updateLike", "(Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneNewsItem;)V", "", "timeAgo", "Landroid/view/animation/Animation;", "animation", "Lth/co/dtac/android/dtacone/adapter/news_feed/OneNewsFeedAdapter;", "viewHolder", "bind", "(Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneNewsItem;Ljava/lang/String;Landroid/view/animation/Animation;Lth/co/dtac/android/dtacone/adapter/news_feed/OneNewsFeedAdapter$NewsFeedImageLinkViewHolder;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/OneNewsFeedImageLinkItemRowBinding;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOneNewsFeedAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneNewsFeedAdapter.kt\nth/co/dtac/android/dtacone/adapter/news_feed/OneNewsFeedAdapter$NewsFeedImageLinkViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,637:1\n1#2:638\n*E\n"})
    /* renamed from: th.co.dtac.android.dtacone.adapter.news_feed.OneNewsFeedAdapter$NewsFeedImageLinkViewHolder */
    /* loaded from: classes7.dex */
    public final class NewsFeedImageLinkViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final OneNewsFeedImageLinkItemRowBinding f81397a;

        /* renamed from: b */
        public final /* synthetic */ OneNewsFeedAdapter f81398b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewsFeedImageLinkViewHolder(@NotNull OneNewsFeedAdapter oneNewsFeedAdapter, OneNewsFeedImageLinkItemRowBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f81398b = oneNewsFeedAdapter;
            this.f81397a = binding;
        }

        /* renamed from: b */
        public static /* synthetic */ void m20492b(OneNewsFeedAdapter oneNewsFeedAdapter, OneNewsItem oneNewsItem, View view) {
            m20490d(oneNewsFeedAdapter, oneNewsItem, view);
        }

        /* renamed from: d */
        public static final void m20490d(OneNewsFeedAdapter this$0, OneNewsItem newsFeed, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(newsFeed, "$newsFeed");
            OnClickSeeMoreDetail onClickSeeMoreDetail = this$0.f81385d;
            Intrinsics.checkNotNull(onClickSeeMoreDetail);
            onClickSeeMoreDetail.onClickOpenWebView(newsFeed);
        }

        /* renamed from: e */
        public static final void m20489e(OneNewsFeedAdapter this$0, OneNewsItem newsFeed, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(newsFeed, "$newsFeed");
            OnClickSeeMoreDetail onClickSeeMoreDetail = this$0.f81385d;
            Intrinsics.checkNotNull(onClickSeeMoreDetail);
            onClickSeeMoreDetail.onClickOpenWebView(newsFeed);
        }

        public final void bind(@NotNull final OneNewsItem newsFeed, @NotNull String timeAgo, @Nullable Animation animation, @NotNull NewsFeedImageLinkViewHolder viewHolder) {
            Intrinsics.checkNotNullParameter(newsFeed, "newsFeed");
            Intrinsics.checkNotNullParameter(timeAgo, "timeAgo");
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            LinearLayout linearLayout = this.f81397a.linkBox;
            final OneNewsFeedAdapter oneNewsFeedAdapter = this.f81398b;
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: tY0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OneNewsFeedAdapter.NewsFeedImageLinkViewHolder.m20492b(OneNewsFeedAdapter.this, newsFeed, view);
                }
            });
            AdjustableImageView adjustableImageView = this.f81397a.ivNewsFeedBanner;
            final OneNewsFeedAdapter oneNewsFeedAdapter2 = this.f81398b;
            adjustableImageView.setOnClickListener(new View.OnClickListener() { // from class: uY0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OneNewsFeedAdapter.NewsFeedImageLinkViewHolder.m20489e(OneNewsFeedAdapter.this, newsFeed, view);
                }
            });
            OneNewsFeedAdapter oneNewsFeedAdapter3 = this.f81398b;
            ImageView imageView = this.f81397a.incLike.ivLike;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.incLike.ivLike");
            OneFontTextView oneFontTextView = this.f81397a.incLike.tvCountLike;
            Intrinsics.checkNotNullExpressionValue(oneFontTextView, "binding.incLike.tvCountLike");
            oneNewsFeedAdapter3.setActionLike(newsFeed, imageView, oneFontTextView, getAdapterPosition(), viewHolder);
            if (animation != null) {
                this.f81397a.cvNewsFeed.startAnimation(animation);
            }
            this.f81398b.m20511a(newsFeed.getScreenshot(), this.f81397a.ivNewsFeedBanner);
            OneNewsFeedAdapter oneNewsFeedAdapter4 = this.f81398b;
            String publisherImg = newsFeed.getPublisherImg();
            AppCompatImageView appCompatImageView = this.f81397a.ivNewsFeedImageProfile;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "binding.ivNewsFeedImageProfile");
            oneNewsFeedAdapter4.m20510b(publisherImg, appCompatImageView);
            this.f81397a.tvUsername.setText(newsFeed.getPublisherName());
            this.f81397a.tvUrlLink.setText(newsFeed.getUri());
            this.f81397a.tvNewsFeedTime.setText(timeAgo);
        }

        public final void updateLike(@NotNull OneNewsItem newsFeed) {
            int i;
            Intrinsics.checkNotNullParameter(newsFeed, "newsFeed");
            if (Intrinsics.areEqual(newsFeed.isLike(), Boolean.TRUE)) {
                this.f81397a.incLike.ivLike.setImageResource(R.drawable.iconsnewslike);
            } else {
                this.f81397a.incLike.ivLike.setImageResource(R.drawable.iconsnewsdislike);
            }
            Integer liked = newsFeed.getLiked();
            if (liked != null) {
                i = liked.intValue();
            } else {
                i = 0;
            }
            if (i > 0) {
                OneFontTextView oneFontTextView = this.f81397a.incLike.tvCountLike;
                Intrinsics.checkNotNullExpressionValue(oneFontTextView, "binding.incLike.tvCountLike");
                ViewVisibleExtKt.toVisible(oneFontTextView);
                this.f81397a.incLike.tvCountLike.setText(String.valueOf(newsFeed.getLiked()));
                return;
            }
            OneFontTextView oneFontTextView2 = this.f81397a.incLike.tvCountLike;
            Intrinsics.checkNotNullExpressionValue(oneFontTextView2, "binding.incLike.tvCountLike");
            ViewVisibleExtKt.toGone(oneFontTextView2);
        }
    }

    @Metadata(m29143d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ3\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\u0010\u0010\u001a\u00060\u0000R\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/news_feed/OneNewsFeedAdapter$NewsFeedImageViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/OneNewsFeedImageItemRowBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/adapter/news_feed/OneNewsFeedAdapter;Lth/co/dtac/android/dtacone/databinding/OneNewsFeedImageItemRowBinding;)V", "Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneNewsItem;", "newsFeed", "", "updateLike", "(Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneNewsItem;)V", "", "timeAgo", "Landroid/view/animation/Animation;", "animation", "Lth/co/dtac/android/dtacone/adapter/news_feed/OneNewsFeedAdapter;", "viewHolder", "bind", "(Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneNewsItem;Ljava/lang/String;Landroid/view/animation/Animation;Lth/co/dtac/android/dtacone/adapter/news_feed/OneNewsFeedAdapter$NewsFeedImageViewHolder;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/OneNewsFeedImageItemRowBinding;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOneNewsFeedAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneNewsFeedAdapter.kt\nth/co/dtac/android/dtacone/adapter/news_feed/OneNewsFeedAdapter$NewsFeedImageViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,637:1\n1#2:638\n*E\n"})
    /* renamed from: th.co.dtac.android.dtacone.adapter.news_feed.OneNewsFeedAdapter$NewsFeedImageViewHolder */
    /* loaded from: classes7.dex */
    public final class NewsFeedImageViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final OneNewsFeedImageItemRowBinding f81399a;

        /* renamed from: b */
        public final /* synthetic */ OneNewsFeedAdapter f81400b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewsFeedImageViewHolder(@NotNull OneNewsFeedAdapter oneNewsFeedAdapter, OneNewsFeedImageItemRowBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f81400b = oneNewsFeedAdapter;
            this.f81399a = binding;
        }

        /* renamed from: c */
        public static final void m20487c(OneNewsFeedAdapter this$0, OneNewsItem newsFeed, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(newsFeed, "$newsFeed");
            OnClickSeeMoreDetail onClickSeeMoreDetail = this$0.f81385d;
            Intrinsics.checkNotNull(onClickSeeMoreDetail);
            onClickSeeMoreDetail.onClickMoreImageOriginal(newsFeed);
        }

        public final void bind(@NotNull final OneNewsItem newsFeed, @NotNull String timeAgo, @Nullable Animation animation, @NotNull NewsFeedImageViewHolder viewHolder) {
            Intrinsics.checkNotNullParameter(newsFeed, "newsFeed");
            Intrinsics.checkNotNullParameter(timeAgo, "timeAgo");
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            AdjustableImageView adjustableImageView = this.f81399a.ivNewsFeedBanner;
            final OneNewsFeedAdapter oneNewsFeedAdapter = this.f81400b;
            adjustableImageView.setOnClickListener(new View.OnClickListener() { // from class: vY0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OneNewsFeedAdapter.NewsFeedImageViewHolder.m20487c(OneNewsFeedAdapter.this, newsFeed, view);
                }
            });
            OneNewsFeedAdapter oneNewsFeedAdapter2 = this.f81400b;
            ImageView imageView = this.f81399a.incLike.ivLike;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.incLike.ivLike");
            OneFontTextView oneFontTextView = this.f81399a.incLike.tvCountLike;
            Intrinsics.checkNotNullExpressionValue(oneFontTextView, "binding.incLike.tvCountLike");
            oneNewsFeedAdapter2.setActionLike(newsFeed, imageView, oneFontTextView, getAdapterPosition(), viewHolder);
            if (animation != null) {
                this.f81399a.cvNewsFeed.startAnimation(animation);
            }
            OneNewsFeedAdapter oneNewsFeedAdapter3 = this.f81400b;
            AdjustableImageView adjustableImageView2 = this.f81399a.ivNewsFeedBanner;
            Intrinsics.checkNotNullExpressionValue(adjustableImageView2, "binding.ivNewsFeedBanner");
            oneNewsFeedAdapter3.m20509c(adjustableImageView2, newsFeed);
            this.f81400b.m20511a(newsFeed.getScreenshot(), this.f81399a.ivNewsFeedBanner);
            OneNewsFeedAdapter oneNewsFeedAdapter4 = this.f81400b;
            String publisherImg = newsFeed.getPublisherImg();
            AppCompatImageView appCompatImageView = this.f81399a.ivNewsFeedImageProfile;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "binding.ivNewsFeedImageProfile");
            oneNewsFeedAdapter4.m20510b(publisherImg, appCompatImageView);
            this.f81399a.tvUsername.setText(newsFeed.getPublisherName());
            this.f81399a.tvNewsFeedTime.setText(timeAgo);
        }

        public final void updateLike(@NotNull OneNewsItem newsFeed) {
            int i;
            Intrinsics.checkNotNullParameter(newsFeed, "newsFeed");
            if (Intrinsics.areEqual(newsFeed.isLike(), Boolean.TRUE)) {
                this.f81399a.incLike.ivLike.setImageResource(R.drawable.iconsnewslike);
            } else {
                this.f81399a.incLike.ivLike.setImageResource(R.drawable.iconsnewsdislike);
            }
            Integer liked = newsFeed.getLiked();
            if (liked != null) {
                i = liked.intValue();
            } else {
                i = 0;
            }
            if (i > 0) {
                OneFontTextView oneFontTextView = this.f81399a.incLike.tvCountLike;
                Intrinsics.checkNotNullExpressionValue(oneFontTextView, "binding.incLike.tvCountLike");
                ViewVisibleExtKt.toVisible(oneFontTextView);
                this.f81399a.incLike.tvCountLike.setText(String.valueOf(newsFeed.getLiked()));
                return;
            }
            OneFontTextView oneFontTextView2 = this.f81399a.incLike.tvCountLike;
            Intrinsics.checkNotNullExpressionValue(oneFontTextView2, "binding.incLike.tvCountLike");
            ViewVisibleExtKt.toGone(oneFontTextView2);
        }
    }

    @Metadata(m29143d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ3\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\u0010\u0010\u001a\u00060\u0000R\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/news_feed/OneNewsFeedAdapter$NewsFeedLinkViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/OneNewsFeedLinkItemRowBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/adapter/news_feed/OneNewsFeedAdapter;Lth/co/dtac/android/dtacone/databinding/OneNewsFeedLinkItemRowBinding;)V", "Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneNewsItem;", "newsFeed", "", "updateLike", "(Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneNewsItem;)V", "", "timeAgo", "Landroid/view/animation/Animation;", "animation", "Lth/co/dtac/android/dtacone/adapter/news_feed/OneNewsFeedAdapter;", "viewHolder", "bind", "(Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneNewsItem;Ljava/lang/String;Landroid/view/animation/Animation;Lth/co/dtac/android/dtacone/adapter/news_feed/OneNewsFeedAdapter$NewsFeedLinkViewHolder;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/OneNewsFeedLinkItemRowBinding;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOneNewsFeedAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneNewsFeedAdapter.kt\nth/co/dtac/android/dtacone/adapter/news_feed/OneNewsFeedAdapter$NewsFeedLinkViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,637:1\n1#2:638\n*E\n"})
    /* renamed from: th.co.dtac.android.dtacone.adapter.news_feed.OneNewsFeedAdapter$NewsFeedLinkViewHolder */
    /* loaded from: classes7.dex */
    public final class NewsFeedLinkViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final OneNewsFeedLinkItemRowBinding f81401a;

        /* renamed from: b */
        public final /* synthetic */ OneNewsFeedAdapter f81402b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewsFeedLinkViewHolder(@NotNull OneNewsFeedAdapter oneNewsFeedAdapter, OneNewsFeedLinkItemRowBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f81402b = oneNewsFeedAdapter;
            this.f81401a = binding;
        }

        /* renamed from: c */
        public static final void m20485c(OneNewsFeedAdapter this$0, OneNewsItem newsFeed, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(newsFeed, "$newsFeed");
            OnClickSeeMoreDetail onClickSeeMoreDetail = this$0.f81385d;
            Intrinsics.checkNotNull(onClickSeeMoreDetail);
            onClickSeeMoreDetail.onClickOpenWebView(newsFeed);
        }

        public final void bind(@NotNull final OneNewsItem newsFeed, @NotNull String timeAgo, @Nullable Animation animation, @NotNull NewsFeedLinkViewHolder viewHolder) {
            Intrinsics.checkNotNullParameter(newsFeed, "newsFeed");
            Intrinsics.checkNotNullParameter(timeAgo, "timeAgo");
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            LinearLayout linearLayout = this.f81401a.linkBox;
            final OneNewsFeedAdapter oneNewsFeedAdapter = this.f81402b;
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: wY0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OneNewsFeedAdapter.NewsFeedLinkViewHolder.m20485c(OneNewsFeedAdapter.this, newsFeed, view);
                }
            });
            OneNewsFeedAdapter oneNewsFeedAdapter2 = this.f81402b;
            ImageView imageView = this.f81401a.incLike.ivLike;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.incLike.ivLike");
            OneFontTextView oneFontTextView = this.f81401a.incLike.tvCountLike;
            Intrinsics.checkNotNullExpressionValue(oneFontTextView, "binding.incLike.tvCountLike");
            oneNewsFeedAdapter2.setActionLike(newsFeed, imageView, oneFontTextView, getAdapterPosition(), viewHolder);
            if (animation != null) {
                this.f81401a.cvNewsFeed.startAnimation(animation);
            }
            OneNewsFeedAdapter oneNewsFeedAdapter3 = this.f81402b;
            String publisherImg = newsFeed.getPublisherImg();
            AppCompatImageView appCompatImageView = this.f81401a.ivNewsFeedImageProfile;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "binding.ivNewsFeedImageProfile");
            oneNewsFeedAdapter3.m20510b(publisherImg, appCompatImageView);
            this.f81401a.tvUsername.setText(newsFeed.getPublisherName());
            this.f81401a.tvNewsFeedTime.setText(timeAgo);
            this.f81401a.tvUrlLink.setText(newsFeed.getUri());
        }

        public final void updateLike(@NotNull OneNewsItem newsFeed) {
            int i;
            Intrinsics.checkNotNullParameter(newsFeed, "newsFeed");
            if (Intrinsics.areEqual(newsFeed.isLike(), Boolean.TRUE)) {
                this.f81401a.incLike.ivLike.setImageResource(R.drawable.iconsnewslike);
            } else {
                this.f81401a.incLike.ivLike.setImageResource(R.drawable.iconsnewsdislike);
            }
            Integer liked = newsFeed.getLiked();
            if (liked != null) {
                i = liked.intValue();
            } else {
                i = 0;
            }
            if (i > 0) {
                OneFontTextView oneFontTextView = this.f81401a.incLike.tvCountLike;
                Intrinsics.checkNotNullExpressionValue(oneFontTextView, "binding.incLike.tvCountLike");
                ViewVisibleExtKt.toVisible(oneFontTextView);
                this.f81401a.incLike.tvCountLike.setText(String.valueOf(newsFeed.getLiked()));
                return;
            }
            OneFontTextView oneFontTextView2 = this.f81401a.incLike.tvCountLike;
            Intrinsics.checkNotNullExpressionValue(oneFontTextView2, "binding.incLike.tvCountLike");
            ViewVisibleExtKt.toGone(oneFontTextView2);
        }
    }

    @Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/news_feed/OneNewsFeedAdapter$NewsFeedLoadingViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/ZNewsFeedLoadingItemRowBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/adapter/news_feed/OneNewsFeedAdapter;Lth/co/dtac/android/dtacone/databinding/ZNewsFeedLoadingItemRowBinding;)V", "", "setLoadingComponent", "()V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/ZNewsFeedLoadingItemRowBinding;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.adapter.news_feed.OneNewsFeedAdapter$NewsFeedLoadingViewHolder */
    /* loaded from: classes7.dex */
    public final class NewsFeedLoadingViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ZNewsFeedLoadingItemRowBinding f81403a;

        /* renamed from: b */
        public final /* synthetic */ OneNewsFeedAdapter f81404b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewsFeedLoadingViewHolder(@NotNull OneNewsFeedAdapter oneNewsFeedAdapter, ZNewsFeedLoadingItemRowBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f81404b = oneNewsFeedAdapter;
            this.f81403a = binding;
        }

        public final void setLoadingComponent() {
            ArrayList arrayList = this.f81404b.f81384c;
            Intrinsics.checkNotNull(arrayList);
            if (!arrayList.isEmpty() && !this.f81404b.f81387f) {
                this.itemView.setVisibility(0);
            } else {
                this.itemView.setVisibility(8);
            }
        }
    }

    @Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001H&J\"\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\r"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/news_feed/OneNewsFeedAdapter$OnClickSeeMoreDetail;", "", "onClickLike", "", "newsFeed", "Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneNewsItem;", "position", "", "viewHolder", "onClickMoreContentDetail", "adapterPosition", "onClickMoreImageOriginal", "onClickOpenWebView", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.adapter.news_feed.OneNewsFeedAdapter$OnClickSeeMoreDetail */
    /* loaded from: classes7.dex */
    public interface OnClickSeeMoreDetail {
        void onClickLike(@NotNull OneNewsItem oneNewsItem, int i, @Nullable Object obj);

        void onClickMoreContentDetail(@NotNull OneNewsItem oneNewsItem, int i, @Nullable Object obj);

        void onClickMoreImageOriginal(@NotNull OneNewsItem oneNewsItem);

        void onClickOpenWebView(@NotNull OneNewsItem oneNewsItem);
    }

    @Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/news_feed/OneNewsFeedAdapter$TYPE;", "", "(Ljava/lang/String;I)V", "FULL", "CONTENT_LINK", "CONTENT", "IMAGE_LINK", "IMAGE", "CONTENT_IMAGE", "LINK", "LOADING", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.adapter.news_feed.OneNewsFeedAdapter$TYPE */
    /* loaded from: classes7.dex */
    public enum TYPE {
        FULL,
        CONTENT_LINK,
        CONTENT,
        IMAGE_LINK,
        IMAGE,
        CONTENT_IMAGE,
        LINK,
        LOADING
    }

    public OneNewsFeedAdapter(@NotNull Context mContext, @NotNull OneNewsFeedViewModel presenter, @Nullable ArrayList<OneNewsItem> arrayList) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        this.f81382a = mContext;
        this.f81383b = presenter;
        this.f81384c = arrayList;
        this.f81386e = true;
    }

    /* renamed from: a */
    public final void m20511a(String str, ImageView imageView) {
        RequestManager with = Glide.with(this.f81382a);
        Intrinsics.checkNotNull(imageView);
        with.clear(imageView);
        Glide.with(this.f81382a).m74229load(str).skipMemoryCache(true).fitCenter().transition(DrawableTransitionOptions.withCrossFade()).placeholder(ContextCompat.getDrawable(this.f81382a, R.drawable.z_white)).error(R.drawable.ic_one_banner_default).diskCacheStrategy(DiskCacheStrategy.DATA).signature(new ObjectKey(UUID.randomUUID().toString())).into(imageView);
    }

    public final void addLoadingFooter() {
        this.f81386e = true;
    }

    /* renamed from: b */
    public final void m20510b(String str, ImageView imageView) {
        Glide.with(this.f81382a).clear(imageView);
        Glide.with(this.f81382a).asBitmap().m74220load(str).skipMemoryCache(true).circleCrop().error(R.drawable.ic_one_resource_default).diskCacheStrategy(DiskCacheStrategy.DATA).signature(new ObjectKey(UUID.randomUUID().toString())).into((RequestBuilder) new BitmapImageViewTarget(imageView, this) { // from class: th.co.dtac.android.dtacone.adapter.news_feed.OneNewsFeedAdapter$glideRoundImageLoader$1

            /* renamed from: i */
            public final /* synthetic */ ImageView f81405i;

            /* renamed from: j */
            public final /* synthetic */ OneNewsFeedAdapter f81406j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(imageView);
                this.f81405i = imageView;
                this.f81406j = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.bumptech.glide.request.target.BitmapImageViewTarget, com.bumptech.glide.request.target.ImageViewTarget
            public void setResource(@Nullable Bitmap bitmap) {
                Context context;
                context = this.f81406j.f81382a;
                RoundedBitmapDrawable create = RoundedBitmapDrawableFactory.create(context.getResources(), bitmap);
                Intrinsics.checkNotNullExpressionValue(create, "create(mContext.resources, resource)");
                create.setCircular(true);
                this.f81405i.setImageDrawable(create);
            }
        });
    }

    /* renamed from: c */
    public final void m20509c(final AdjustableImageView adjustableImageView, OneNewsItem oneNewsItem) {
        adjustableImageView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: th.co.dtac.android.dtacone.adapter.news_feed.OneNewsFeedAdapter$observeForChangeImageView$1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                AdjustableImageView.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                AdjustableImageView.this.setAdjustViewBounds(true);
                AdjustableImageView.this.requestLayout();
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (this.f81386e) {
            ArrayList arrayList = this.f81384c;
            Intrinsics.checkNotNull(arrayList);
            return arrayList.size() + 1;
        }
        ArrayList arrayList2 = this.f81384c;
        if (arrayList2 != null) {
            return arrayList2.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        ArrayList arrayList = this.f81384c;
        Intrinsics.checkNotNull(arrayList);
        if (i == arrayList.size() && this.f81386e) {
            return TYPE.LOADING.ordinal();
        }
        Object obj = this.f81384c.get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "mNewsFeedList[position]");
        OneNewsItem oneNewsItem = (OneNewsItem) obj;
        if (this.f81383b.isFullContentView(oneNewsItem)) {
            return TYPE.FULL.ordinal();
        }
        if (this.f81383b.isContentLinkView(oneNewsItem)) {
            return TYPE.CONTENT_LINK.ordinal();
        }
        if (this.f81383b.isContentImage(oneNewsItem)) {
            return TYPE.CONTENT_IMAGE.ordinal();
        }
        if (this.f81383b.isImageLinkView(oneNewsItem)) {
            return TYPE.IMAGE_LINK.ordinal();
        }
        if (this.f81383b.isContentOnly(oneNewsItem)) {
            return TYPE.CONTENT.ordinal();
        }
        if (this.f81383b.hasLink(oneNewsItem)) {
            return TYPE.LINK.ordinal();
        }
        return TYPE.IMAGE.ordinal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
        Animation animation;
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        ArrayList arrayList = this.f81384c;
        Intrinsics.checkNotNull(arrayList);
        if (i == arrayList.size() && this.f81386e) {
            if (viewHolder instanceof NewsFeedLoadingViewHolder) {
                ((NewsFeedLoadingViewHolder) viewHolder).setLoadingComponent();
                return;
            }
            return;
        }
        if (!this.f81388g) {
            animation = AnimationUtils.loadAnimation(this.f81382a, R.anim.slide_up);
            animation.setDuration(400L);
        } else {
            this.f81388g = false;
            animation = null;
        }
        Object obj = this.f81384c.get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "mNewsFeedList[position]");
        OneNewsItem oneNewsItem = (OneNewsItem) obj;
        String effectiveDate = oneNewsItem.getEffectiveDate();
        String effectiveTime = oneNewsItem.getEffectiveTime();
        String timeAgo = DateUtil.getRelativeDateTime(effectiveDate + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + effectiveTime, DateUtil.FORMAT_SERVER_FULL_DATE_TIME, new Locale(LanguageSupport.LANG_TH, StandardStructureTypes.f60307TH));
        if (viewHolder instanceof NewsFeedFullContentViewHolder) {
            NewsFeedFullContentViewHolder newsFeedFullContentViewHolder = (NewsFeedFullContentViewHolder) viewHolder;
            Intrinsics.checkNotNullExpressionValue(timeAgo, "timeAgo");
            newsFeedFullContentViewHolder.bind(oneNewsItem, timeAgo, animation, newsFeedFullContentViewHolder);
        } else if (viewHolder instanceof NewsFeedImageLinkViewHolder) {
            NewsFeedImageLinkViewHolder newsFeedImageLinkViewHolder = (NewsFeedImageLinkViewHolder) viewHolder;
            Intrinsics.checkNotNullExpressionValue(timeAgo, "timeAgo");
            newsFeedImageLinkViewHolder.bind(oneNewsItem, timeAgo, animation, newsFeedImageLinkViewHolder);
        } else if (viewHolder instanceof NewsFeedImageViewHolder) {
            NewsFeedImageViewHolder newsFeedImageViewHolder = (NewsFeedImageViewHolder) viewHolder;
            Intrinsics.checkNotNullExpressionValue(timeAgo, "timeAgo");
            newsFeedImageViewHolder.bind(oneNewsItem, timeAgo, animation, newsFeedImageViewHolder);
        } else if (viewHolder instanceof NewsFeedContentLinkViewHolder) {
            NewsFeedContentLinkViewHolder newsFeedContentLinkViewHolder = (NewsFeedContentLinkViewHolder) viewHolder;
            Intrinsics.checkNotNullExpressionValue(timeAgo, "timeAgo");
            newsFeedContentLinkViewHolder.bind(oneNewsItem, timeAgo, animation, newsFeedContentLinkViewHolder);
        } else if (viewHolder instanceof NewsFeedContentImageViewHolder) {
            NewsFeedContentImageViewHolder newsFeedContentImageViewHolder = (NewsFeedContentImageViewHolder) viewHolder;
            Intrinsics.checkNotNullExpressionValue(timeAgo, "timeAgo");
            newsFeedContentImageViewHolder.bind(oneNewsItem, timeAgo, animation, newsFeedContentImageViewHolder);
        } else if (viewHolder instanceof NewsFeedLinkViewHolder) {
            NewsFeedLinkViewHolder newsFeedLinkViewHolder = (NewsFeedLinkViewHolder) viewHolder;
            Intrinsics.checkNotNullExpressionValue(timeAgo, "timeAgo");
            newsFeedLinkViewHolder.bind(oneNewsItem, timeAgo, animation, newsFeedLinkViewHolder);
        } else if (viewHolder instanceof NewsFeedLoadingViewHolder) {
            ((NewsFeedLoadingViewHolder) viewHolder).setLoadingComponent();
        } else if (viewHolder instanceof NewsFeedContentViewHolder) {
            NewsFeedContentViewHolder newsFeedContentViewHolder = (NewsFeedContentViewHolder) viewHolder;
            Intrinsics.checkNotNullExpressionValue(timeAgo, "timeAgo");
            newsFeedContentViewHolder.bind(oneNewsItem, timeAgo, animation, newsFeedContentViewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (i == TYPE.FULL.ordinal()) {
            OneNewsFeedFullContentItemRowBinding inflate = OneNewsFeedFullContentItemRowBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(LayoutInflater.f….context), parent, false)");
            return new NewsFeedFullContentViewHolder(this, inflate);
        } else if (i == TYPE.CONTENT_LINK.ordinal()) {
            OneNewsFeedImageLinkItemRowBinding inflate2 = OneNewsFeedImageLinkItemRowBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate2, "inflate(LayoutInflater.f….context), parent, false)");
            return new NewsFeedImageLinkViewHolder(this, inflate2);
        } else if (i == TYPE.IMAGE.ordinal()) {
            OneNewsFeedImageItemRowBinding inflate3 = OneNewsFeedImageItemRowBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate3, "inflate(LayoutInflater.f….context), parent, false)");
            return new NewsFeedImageViewHolder(this, inflate3);
        } else if (i == TYPE.IMAGE_LINK.ordinal()) {
            OneNewsFeedContentLinkItemRowBinding inflate4 = OneNewsFeedContentLinkItemRowBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate4, "inflate(LayoutInflater.f….context), parent, false)");
            return new NewsFeedContentLinkViewHolder(this, inflate4);
        } else if (i == TYPE.CONTENT_IMAGE.ordinal()) {
            OneNewsFeedContentImageItemRowBinding inflate5 = OneNewsFeedContentImageItemRowBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate5, "inflate(LayoutInflater.f….context), parent, false)");
            return new NewsFeedContentImageViewHolder(this, inflate5);
        } else if (i == TYPE.LINK.ordinal()) {
            OneNewsFeedLinkItemRowBinding inflate6 = OneNewsFeedLinkItemRowBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate6, "inflate(LayoutInflater.f….context), parent, false)");
            return new NewsFeedLinkViewHolder(this, inflate6);
        } else if (i == TYPE.LOADING.ordinal()) {
            ZNewsFeedLoadingItemRowBinding inflate7 = ZNewsFeedLoadingItemRowBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate7, "inflate(LayoutInflater.f….context), parent, false)");
            return new NewsFeedLoadingViewHolder(this, inflate7);
        } else {
            OneNewsFeedContentItemRowBinding inflate8 = OneNewsFeedContentItemRowBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate8, "inflate(LayoutInflater.f….context), parent, false)");
            return new NewsFeedContentViewHolder(this, inflate8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(@NotNull RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder.itemView instanceof ImageView) {
            Glide.with(this.f81382a).clear(holder.itemView);
            View view = holder.itemView;
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.widget.ImageView");
            ((ImageView) view).setImageDrawable(null);
        }
        super.onViewRecycled(holder);
    }

    public final void setActionLike(@NotNull OneNewsItem newsFeed, @NotNull ImageView ivLike, @NotNull OneFontTextView tvCountLike, int i, @Nullable Object obj) {
        int i2;
        Intrinsics.checkNotNullParameter(newsFeed, "newsFeed");
        Intrinsics.checkNotNullParameter(ivLike, "ivLike");
        Intrinsics.checkNotNullParameter(tvCountLike, "tvCountLike");
        if (Intrinsics.areEqual(newsFeed.isLike(), Boolean.TRUE)) {
            ivLike.setImageResource(R.drawable.iconsnewslike);
        } else {
            ivLike.setImageResource(R.drawable.iconsnewsdislike);
        }
        Integer liked = newsFeed.getLiked();
        if (liked != null) {
            i2 = liked.intValue();
        } else {
            i2 = 0;
        }
        if (i2 > 0) {
            ViewVisibleExtKt.toVisible(tvCountLike);
            tvCountLike.setText(String.valueOf(newsFeed.getLiked()));
        } else {
            ViewVisibleExtKt.toGone(tvCountLike);
        }
        OnSingleClickListenerKt.setOnSingleClickListener(ivLike, new OneNewsFeedAdapter$setActionLike$1(this, newsFeed, i, obj));
    }

    public final void setLastPage(boolean z) {
        this.f81387f = z;
    }

    public final void setOnClickMoreDetail(@NotNull OnClickSeeMoreDetail listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f81385d = listener;
    }

    @NotNull
    public final SpannableString setSpanReadMore(@NotNull OneNewsItem newsFeed) {
        Intrinsics.checkNotNullParameter(newsFeed, "newsFeed");
        String substring = newsFeed.getContentPreview().substring(0, newsFeed.getMAXIMUM_PREVIEW());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        SpannableString spannableString = new SpannableString(substring + "...อ่านต่อ");
        spannableString.setSpan(new StyleSpan(1), spannableString.length() + (-7), spannableString.length(), 18);
        return spannableString;
    }

    public final void updateItem(@NotNull OneNewsItem newsFeed, int i, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(newsFeed, "newsFeed");
        this.f81388g = true;
        ArrayList arrayList = this.f81384c;
        if (arrayList != null) {
            OneNewsItem oneNewsItem = (OneNewsItem) arrayList.set(i, newsFeed);
        }
        if (obj instanceof NewsFeedFullContentViewHolder) {
            ((NewsFeedFullContentViewHolder) obj).updateLike(newsFeed);
        } else if (obj instanceof NewsFeedImageLinkViewHolder) {
            ((NewsFeedImageLinkViewHolder) obj).updateLike(newsFeed);
        } else if (obj instanceof NewsFeedImageViewHolder) {
            ((NewsFeedImageViewHolder) obj).updateLike(newsFeed);
        } else if (obj instanceof NewsFeedContentLinkViewHolder) {
            ((NewsFeedContentLinkViewHolder) obj).updateLike(newsFeed);
        } else if (obj instanceof NewsFeedContentImageViewHolder) {
            ((NewsFeedContentImageViewHolder) obj).updateLike(newsFeed);
        } else if (obj instanceof NewsFeedLinkViewHolder) {
            ((NewsFeedLinkViewHolder) obj).updateLike(newsFeed);
        } else if (obj instanceof NewsFeedContentViewHolder) {
            ((NewsFeedContentViewHolder) obj).updateLike(newsFeed);
        }
    }
}