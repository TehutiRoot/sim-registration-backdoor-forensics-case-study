package th.p047co.dtac.android.dtacone.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.bumptech.glide.signature.ObjectKey;
import com.google.android.gms.analytics.ecommerce.Promotion;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.adapter.NewsFeedAdapter;
import th.p047co.dtac.android.dtacone.databinding.ZNewsFeedContentImageItemRowBinding;
import th.p047co.dtac.android.dtacone.databinding.ZNewsFeedContentItemRowBinding;
import th.p047co.dtac.android.dtacone.databinding.ZNewsFeedContentLinkItemRowBinding;
import th.p047co.dtac.android.dtacone.databinding.ZNewsFeedFullContentItemRowBinding;
import th.p047co.dtac.android.dtacone.databinding.ZNewsFeedImageItemRowBinding;
import th.p047co.dtac.android.dtacone.databinding.ZNewsFeedImageLinkItemRowBinding;
import th.p047co.dtac.android.dtacone.databinding.ZNewsFeedLinkItemRowBinding;
import th.p047co.dtac.android.dtacone.databinding.ZNewsFeedLoadingItemRowBinding;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.model.newsfeed.list.response.NewsItem;
import th.p047co.dtac.android.dtacone.presenter.newsfeed.NewsFeedPresenter;
import th.p047co.dtac.android.dtacone.util.constant.LanguageSupport;
import th.p047co.dtac.android.dtacone.util.date.DateUtil;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\nLMNOPQRSTUB3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u000f¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0014H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u0002H\u0016¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J'\u0010+\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010*¢\u0006\u0004\b+\u0010,J7\u00101\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\b2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/2\u0006\u0010\u0019\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010*¢\u0006\u0004\b1\u00102J\u001f\u00105\u001a\u00020\u000f2\u0006\u00104\u001a\u0002032\u0006\u0010)\u001a\u00020\bH\u0002¢\u0006\u0004\b5\u00106J\u001f\u00109\u001a\u00020\u000f2\u0006\u00108\u001a\u0002072\u0006\u0010)\u001a\u00020\bH\u0002¢\u0006\u0004\b9\u0010:J#\u0010>\u001a\u00020\u000f2\b\u0010<\u001a\u0004\u0018\u00010;2\b\u0010=\u001a\u0004\u0018\u00010-H\u0002¢\u0006\u0004\b>\u0010?R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010BR(\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010CR\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010DR\u0016\u0010G\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010I\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010FR\u0016\u0010K\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010F¨\u0006V"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/NewsFeedAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/content/Context;", "mContext", "Lth/co/dtac/android/dtacone/presenter/newsfeed/NewsFeedPresenter;", "presenter", "Ljava/util/ArrayList;", "Lth/co/dtac/android/dtacone/model/newsfeed/list/response/NewsItem;", "Lkotlin/collections/ArrayList;", "mNewsFeedList", "<init>", "(Landroid/content/Context;Lth/co/dtac/android/dtacone/presenter/newsfeed/NewsFeedPresenter;Ljava/util/ArrayList;)V", "", "lastPage", "", "setLastPage", "(Z)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewHolder", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "addLoadingFooter", "()V", "getItemViewType", "(I)I", "getItemCount", "()I", "holder", "onViewRecycled", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "Lth/co/dtac/android/dtacone/adapter/NewsFeedAdapter$OnClickSeeMoreDetail;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnClickMoreDetail", "(Lth/co/dtac/android/dtacone/adapter/NewsFeedAdapter$OnClickSeeMoreDetail;)V", "newsFeed", "", "updateItem", "(Lth/co/dtac/android/dtacone/model/newsfeed/list/response/NewsItem;ILjava/lang/Object;)V", "Landroid/widget/ImageView;", "ivLike", "Lth/co/dtac/android/dtacone/widget/view/DtacFontTextView;", "tvCountLike", "setActionLike", "(Lth/co/dtac/android/dtacone/model/newsfeed/list/response/NewsItem;Landroid/widget/ImageView;Lth/co/dtac/android/dtacone/widget/view/DtacFontTextView;ILjava/lang/Object;)V", "Landroid/view/View;", Promotion.ACTION_VIEW, OperatorName.CURVE_TO, "(Landroid/view/View;Lth/co/dtac/android/dtacone/model/newsfeed/list/response/NewsItem;)V", "Lcom/inthecheesefactory/thecheeselibrary/widget/AdjustableImageView;", "imageView", "d", "(Lcom/inthecheesefactory/thecheeselibrary/widget/AdjustableImageView;Lth/co/dtac/android/dtacone/model/newsfeed/list/response/NewsItem;)V", "", "imageUrl", "ivImageBanner", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Ljava/lang/String;Landroid/widget/ImageView;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/content/Context;", "Lth/co/dtac/android/dtacone/presenter/newsfeed/NewsFeedPresenter;", "Ljava/util/ArrayList;", "Lth/co/dtac/android/dtacone/adapter/NewsFeedAdapter$OnClickSeeMoreDetail;", "e", "Z", "isLoadingAdded", OperatorName.FILL_NON_ZERO, "isLastPage", OperatorName.NON_STROKING_GRAY, "isUpdate", "NewsFeedContentImageViewHolder", "NewsFeedContentLinkViewHolder", "NewsFeedContentViewHolder", "NewsFeedFullContentViewHolder", "NewsFeedImageLinkViewHolder", "NewsFeedImageViewHolder", "NewsFeedLinkViewHolder", "NewsFeedLoadingViewHolder", "OnClickSeeMoreDetail", "TYPE", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.adapter.NewsFeedAdapter */
/* loaded from: classes7.dex */
public final class NewsFeedAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final Context f81028a;

    /* renamed from: b */
    public final NewsFeedPresenter f81029b;

    /* renamed from: c */
    public final ArrayList f81030c;

    /* renamed from: d */
    public OnClickSeeMoreDetail f81031d;

    /* renamed from: e */
    public boolean f81032e;

    /* renamed from: f */
    public boolean f81033f;

    /* renamed from: g */
    public boolean f81034g;

    @Metadata(m29143d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ3\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\u0010\u0010\u001a\u00060\u0000R\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/NewsFeedAdapter$NewsFeedContentImageViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/ZNewsFeedContentImageItemRowBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/adapter/NewsFeedAdapter;Lth/co/dtac/android/dtacone/databinding/ZNewsFeedContentImageItemRowBinding;)V", "Lth/co/dtac/android/dtacone/model/newsfeed/list/response/NewsItem;", "newsFeed", "", "updateLike", "(Lth/co/dtac/android/dtacone/model/newsfeed/list/response/NewsItem;)V", "", "timeAgo", "Landroid/view/animation/Animation;", "animation", "Lth/co/dtac/android/dtacone/adapter/NewsFeedAdapter;", "viewHolder", "bind", "(Lth/co/dtac/android/dtacone/model/newsfeed/list/response/NewsItem;Ljava/lang/String;Landroid/view/animation/Animation;Lth/co/dtac/android/dtacone/adapter/NewsFeedAdapter$NewsFeedContentImageViewHolder;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/ZNewsFeedContentImageItemRowBinding;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nNewsFeedAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewsFeedAdapter.kt\nth/co/dtac/android/dtacone/adapter/NewsFeedAdapter$NewsFeedContentImageViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,587:1\n1#2:588\n*E\n"})
    /* renamed from: th.co.dtac.android.dtacone.adapter.NewsFeedAdapter$NewsFeedContentImageViewHolder */
    /* loaded from: classes7.dex */
    public final class NewsFeedContentImageViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ZNewsFeedContentImageItemRowBinding f81035a;

        /* renamed from: b */
        public final /* synthetic */ NewsFeedAdapter f81036b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewsFeedContentImageViewHolder(@NotNull NewsFeedAdapter newsFeedAdapter, ZNewsFeedContentImageItemRowBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f81036b = newsFeedAdapter;
            this.f81035a = binding;
        }

        /* renamed from: b */
        public static /* synthetic */ void m20660b(NewsFeedAdapter newsFeedAdapter, NewsItem newsItem, View view) {
            m20656f(newsFeedAdapter, newsItem, view);
        }

        /* renamed from: c */
        public static /* synthetic */ void m20659c(NewsFeedAdapter newsFeedAdapter, NewsItem newsItem, View view) {
            m20657e(newsFeedAdapter, newsItem, view);
        }

        /* renamed from: d */
        public static /* synthetic */ void m20658d(NewsFeedAdapter newsFeedAdapter, NewsItem newsItem, View view) {
            m20655g(newsFeedAdapter, newsItem, view);
        }

        /* renamed from: e */
        public static final void m20657e(NewsFeedAdapter this$0, NewsItem newsFeed, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(newsFeed, "$newsFeed");
            OnClickSeeMoreDetail onClickSeeMoreDetail = this$0.f81031d;
            Intrinsics.checkNotNull(onClickSeeMoreDetail);
            onClickSeeMoreDetail.onClickMoreImageOriginal(newsFeed);
        }

        /* renamed from: f */
        public static final void m20656f(NewsFeedAdapter this$0, NewsItem newsFeed, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(newsFeed, "$newsFeed");
            if (this$0.f81029b.hasContentDetail(newsFeed)) {
                OnClickSeeMoreDetail onClickSeeMoreDetail = this$0.f81031d;
                Intrinsics.checkNotNull(onClickSeeMoreDetail);
                onClickSeeMoreDetail.onClickMoreContentDetail(newsFeed);
            }
        }

        /* renamed from: g */
        public static final void m20655g(NewsFeedAdapter this$0, NewsItem newsFeed, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(newsFeed, "$newsFeed");
            if (this$0.f81029b.hasContentDetail(newsFeed)) {
                OnClickSeeMoreDetail onClickSeeMoreDetail = this$0.f81031d;
                Intrinsics.checkNotNull(onClickSeeMoreDetail);
                onClickSeeMoreDetail.onClickMoreContentDetail(newsFeed);
            }
        }

        public final void bind(@NotNull final NewsItem newsFeed, @NotNull String timeAgo, @Nullable Animation animation, @NotNull NewsFeedContentImageViewHolder viewHolder) {
            Intrinsics.checkNotNullParameter(newsFeed, "newsFeed");
            Intrinsics.checkNotNullParameter(timeAgo, "timeAgo");
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            AdjustableImageView adjustableImageView = this.f81035a.ivNewsFeedBanner;
            final NewsFeedAdapter newsFeedAdapter = this.f81036b;
            adjustableImageView.setOnClickListener(new View.OnClickListener() { // from class: GH0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    NewsFeedAdapter.NewsFeedContentImageViewHolder.m20659c(NewsFeedAdapter.this, newsFeed, view);
                }
            });
            DtacFontTextView dtacFontTextView = this.f81035a.tvNewsFeedReadmore;
            final NewsFeedAdapter newsFeedAdapter2 = this.f81036b;
            dtacFontTextView.setOnClickListener(new View.OnClickListener() { // from class: HH0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    NewsFeedAdapter.NewsFeedContentImageViewHolder.m20660b(NewsFeedAdapter.this, newsFeed, view);
                }
            });
            DtacFontTextView dtacFontTextView2 = this.f81035a.tvNewsFeedContent;
            final NewsFeedAdapter newsFeedAdapter3 = this.f81036b;
            dtacFontTextView2.setOnClickListener(new View.OnClickListener() { // from class: IH0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    NewsFeedAdapter.NewsFeedContentImageViewHolder.m20658d(NewsFeedAdapter.this, newsFeed, view);
                }
            });
            NewsFeedAdapter newsFeedAdapter4 = this.f81036b;
            ImageView imageView = this.f81035a.incLike.ivLike;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.incLike.ivLike");
            DtacFontTextView dtacFontTextView3 = this.f81035a.incLike.tvCountLike;
            Intrinsics.checkNotNullExpressionValue(dtacFontTextView3, "binding.incLike.tvCountLike");
            newsFeedAdapter4.setActionLike(newsFeed, imageView, dtacFontTextView3, getAdapterPosition(), viewHolder);
            if (animation != null) {
                this.f81035a.cvNewsFeed.startAnimation(animation);
            }
            NewsFeedAdapter newsFeedAdapter5 = this.f81036b;
            AdjustableImageView adjustableImageView2 = this.f81035a.ivNewsFeedBanner;
            Intrinsics.checkNotNullExpressionValue(adjustableImageView2, "binding.ivNewsFeedBanner");
            newsFeedAdapter5.m20662d(adjustableImageView2, newsFeed);
            this.f81036b.m20664b(newsFeed.getScreenshot(), this.f81035a.ivNewsFeedBanner);
            this.f81036b.m20664b(newsFeed.getCreatedByImg(), this.f81035a.ivNewsFeedImageProfile);
            this.f81035a.tvUsername.setText(newsFeed.getCreatedByName());
            this.f81035a.tvNewsFeedContent.setText(newsFeed.getContentPreview());
            this.f81035a.tvNewsFeedTime.setText(timeAgo);
            NewsFeedAdapter newsFeedAdapter6 = this.f81036b;
            DtacFontTextView dtacFontTextView4 = this.f81035a.tvNewsFeedReadmore;
            Intrinsics.checkNotNullExpressionValue(dtacFontTextView4, "binding.tvNewsFeedReadmore");
            newsFeedAdapter6.m20663c(dtacFontTextView4, newsFeed);
        }

        public final void updateLike(@NotNull NewsItem newsFeed) {
            int i;
            Intrinsics.checkNotNullParameter(newsFeed, "newsFeed");
            if (Intrinsics.areEqual(newsFeed.isLike(), Boolean.TRUE)) {
                this.f81035a.incLike.ivLike.setImageResource(R.drawable.ic_newslikeactive);
            } else {
                this.f81035a.incLike.ivLike.setImageResource(R.drawable.iconsnewslikedisactive);
            }
            Integer liked = newsFeed.getLiked();
            if (liked != null) {
                i = liked.intValue();
            } else {
                i = 0;
            }
            if (i > 0) {
                DtacFontTextView dtacFontTextView = this.f81035a.incLike.tvCountLike;
                Intrinsics.checkNotNullExpressionValue(dtacFontTextView, "binding.incLike.tvCountLike");
                ViewVisibleExtKt.toVisible(dtacFontTextView);
                this.f81035a.incLike.tvCountLike.setText(String.valueOf(newsFeed.getLiked()));
                return;
            }
            DtacFontTextView dtacFontTextView2 = this.f81035a.incLike.tvCountLike;
            Intrinsics.checkNotNullExpressionValue(dtacFontTextView2, "binding.incLike.tvCountLike");
            ViewVisibleExtKt.toGone(dtacFontTextView2);
        }
    }

    @Metadata(m29143d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ3\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\u0010\u0010\u001a\u00060\u0000R\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/NewsFeedAdapter$NewsFeedContentLinkViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/ZNewsFeedContentLinkItemRowBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/adapter/NewsFeedAdapter;Lth/co/dtac/android/dtacone/databinding/ZNewsFeedContentLinkItemRowBinding;)V", "Lth/co/dtac/android/dtacone/model/newsfeed/list/response/NewsItem;", "newsFeed", "", "updateLike", "(Lth/co/dtac/android/dtacone/model/newsfeed/list/response/NewsItem;)V", "", "timeAgo", "Landroid/view/animation/Animation;", "animation", "Lth/co/dtac/android/dtacone/adapter/NewsFeedAdapter;", "viewHolder", "bind", "(Lth/co/dtac/android/dtacone/model/newsfeed/list/response/NewsItem;Ljava/lang/String;Landroid/view/animation/Animation;Lth/co/dtac/android/dtacone/adapter/NewsFeedAdapter$NewsFeedContentLinkViewHolder;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/ZNewsFeedContentLinkItemRowBinding;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nNewsFeedAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewsFeedAdapter.kt\nth/co/dtac/android/dtacone/adapter/NewsFeedAdapter$NewsFeedContentLinkViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,587:1\n1#2:588\n*E\n"})
    /* renamed from: th.co.dtac.android.dtacone.adapter.NewsFeedAdapter$NewsFeedContentLinkViewHolder */
    /* loaded from: classes7.dex */
    public final class NewsFeedContentLinkViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ZNewsFeedContentLinkItemRowBinding f81037a;

        /* renamed from: b */
        public final /* synthetic */ NewsFeedAdapter f81038b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewsFeedContentLinkViewHolder(@NotNull NewsFeedAdapter newsFeedAdapter, ZNewsFeedContentLinkItemRowBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f81038b = newsFeedAdapter;
            this.f81037a = binding;
        }

        /* renamed from: b */
        public static /* synthetic */ void m20654b(NewsFeedAdapter newsFeedAdapter, NewsItem newsItem, View view) {
            m20650f(newsFeedAdapter, newsItem, view);
        }

        /* renamed from: c */
        public static /* synthetic */ void m20653c(NewsFeedAdapter newsFeedAdapter, NewsItem newsItem, View view) {
            m20651e(newsFeedAdapter, newsItem, view);
        }

        /* renamed from: d */
        public static /* synthetic */ void m20652d(NewsFeedAdapter newsFeedAdapter, NewsItem newsItem, View view) {
            m20649g(newsFeedAdapter, newsItem, view);
        }

        /* renamed from: e */
        public static final void m20651e(NewsFeedAdapter this$0, NewsItem newsFeed, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(newsFeed, "$newsFeed");
            OnClickSeeMoreDetail onClickSeeMoreDetail = this$0.f81031d;
            Intrinsics.checkNotNull(onClickSeeMoreDetail);
            onClickSeeMoreDetail.onClickOpenWebView(newsFeed);
        }

        /* renamed from: f */
        public static final void m20650f(NewsFeedAdapter this$0, NewsItem newsFeed, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(newsFeed, "$newsFeed");
            if (this$0.f81029b.hasContentDetail(newsFeed)) {
                OnClickSeeMoreDetail onClickSeeMoreDetail = this$0.f81031d;
                Intrinsics.checkNotNull(onClickSeeMoreDetail);
                onClickSeeMoreDetail.onClickMoreContentDetail(newsFeed);
            }
        }

        /* renamed from: g */
        public static final void m20649g(NewsFeedAdapter this$0, NewsItem newsFeed, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(newsFeed, "$newsFeed");
            if (this$0.f81029b.hasContentDetail(newsFeed)) {
                OnClickSeeMoreDetail onClickSeeMoreDetail = this$0.f81031d;
                Intrinsics.checkNotNull(onClickSeeMoreDetail);
                onClickSeeMoreDetail.onClickMoreContentDetail(newsFeed);
            }
        }

        public final void bind(@NotNull final NewsItem newsFeed, @NotNull String timeAgo, @Nullable Animation animation, @NotNull NewsFeedContentLinkViewHolder viewHolder) {
            Intrinsics.checkNotNullParameter(newsFeed, "newsFeed");
            Intrinsics.checkNotNullParameter(timeAgo, "timeAgo");
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            LinearLayout linearLayout = this.f81037a.linkBox;
            final NewsFeedAdapter newsFeedAdapter = this.f81038b;
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: JH0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    NewsFeedAdapter.NewsFeedContentLinkViewHolder.m20653c(NewsFeedAdapter.this, newsFeed, view);
                }
            });
            DtacFontTextView dtacFontTextView = this.f81037a.tvNewsFeedReadmore;
            final NewsFeedAdapter newsFeedAdapter2 = this.f81038b;
            dtacFontTextView.setOnClickListener(new View.OnClickListener() { // from class: KH0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    NewsFeedAdapter.NewsFeedContentLinkViewHolder.m20654b(NewsFeedAdapter.this, newsFeed, view);
                }
            });
            DtacFontTextView dtacFontTextView2 = this.f81037a.tvNewsFeedContent;
            final NewsFeedAdapter newsFeedAdapter3 = this.f81038b;
            dtacFontTextView2.setOnClickListener(new View.OnClickListener() { // from class: LH0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    NewsFeedAdapter.NewsFeedContentLinkViewHolder.m20652d(NewsFeedAdapter.this, newsFeed, view);
                }
            });
            NewsFeedAdapter newsFeedAdapter4 = this.f81038b;
            ImageView imageView = this.f81037a.incLike.ivLike;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.incLike.ivLike");
            DtacFontTextView dtacFontTextView3 = this.f81037a.incLike.tvCountLike;
            Intrinsics.checkNotNullExpressionValue(dtacFontTextView3, "binding.incLike.tvCountLike");
            newsFeedAdapter4.setActionLike(newsFeed, imageView, dtacFontTextView3, getAdapterPosition(), viewHolder);
            if (animation != null) {
                this.f81037a.cvNewsFeed.startAnimation(animation);
            }
            this.f81038b.m20664b(newsFeed.getCreatedByImg(), this.f81037a.ivNewsFeedImageProfile);
            this.f81037a.tvUsername.setText(newsFeed.getCreatedByName());
            this.f81037a.tvNewsFeedContent.setText(newsFeed.getContentPreview());
            this.f81037a.tvNewsFeedTime.setText(timeAgo);
            this.f81037a.tvUrlLink.setText(newsFeed.getUri());
            NewsFeedAdapter newsFeedAdapter5 = this.f81038b;
            DtacFontTextView dtacFontTextView4 = this.f81037a.tvNewsFeedReadmore;
            Intrinsics.checkNotNullExpressionValue(dtacFontTextView4, "binding.tvNewsFeedReadmore");
            newsFeedAdapter5.m20663c(dtacFontTextView4, newsFeed);
        }

        public final void updateLike(@NotNull NewsItem newsFeed) {
            int i;
            Intrinsics.checkNotNullParameter(newsFeed, "newsFeed");
            if (Intrinsics.areEqual(newsFeed.isLike(), Boolean.TRUE)) {
                this.f81037a.incLike.ivLike.setImageResource(R.drawable.ic_newslikeactive);
            } else {
                this.f81037a.incLike.ivLike.setImageResource(R.drawable.iconsnewslikedisactive);
            }
            Integer liked = newsFeed.getLiked();
            if (liked != null) {
                i = liked.intValue();
            } else {
                i = 0;
            }
            if (i > 0) {
                DtacFontTextView dtacFontTextView = this.f81037a.incLike.tvCountLike;
                Intrinsics.checkNotNullExpressionValue(dtacFontTextView, "binding.incLike.tvCountLike");
                ViewVisibleExtKt.toVisible(dtacFontTextView);
                this.f81037a.incLike.tvCountLike.setText(String.valueOf(newsFeed.getLiked()));
                return;
            }
            DtacFontTextView dtacFontTextView2 = this.f81037a.incLike.tvCountLike;
            Intrinsics.checkNotNullExpressionValue(dtacFontTextView2, "binding.incLike.tvCountLike");
            ViewVisibleExtKt.toGone(dtacFontTextView2);
        }
    }

    @Metadata(m29143d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ3\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\u0010\u0010\u001a\u00060\u0000R\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/NewsFeedAdapter$NewsFeedContentViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/ZNewsFeedContentItemRowBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/adapter/NewsFeedAdapter;Lth/co/dtac/android/dtacone/databinding/ZNewsFeedContentItemRowBinding;)V", "Lth/co/dtac/android/dtacone/model/newsfeed/list/response/NewsItem;", "newsFeed", "", "updateLike", "(Lth/co/dtac/android/dtacone/model/newsfeed/list/response/NewsItem;)V", "", "timeAgo", "Landroid/view/animation/Animation;", "animation", "Lth/co/dtac/android/dtacone/adapter/NewsFeedAdapter;", "viewHolder", "bind", "(Lth/co/dtac/android/dtacone/model/newsfeed/list/response/NewsItem;Ljava/lang/String;Landroid/view/animation/Animation;Lth/co/dtac/android/dtacone/adapter/NewsFeedAdapter$NewsFeedContentViewHolder;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/ZNewsFeedContentItemRowBinding;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nNewsFeedAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewsFeedAdapter.kt\nth/co/dtac/android/dtacone/adapter/NewsFeedAdapter$NewsFeedContentViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,587:1\n1#2:588\n*E\n"})
    /* renamed from: th.co.dtac.android.dtacone.adapter.NewsFeedAdapter$NewsFeedContentViewHolder */
    /* loaded from: classes7.dex */
    public final class NewsFeedContentViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ZNewsFeedContentItemRowBinding f81039a;

        /* renamed from: b */
        public final /* synthetic */ NewsFeedAdapter f81040b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewsFeedContentViewHolder(@NotNull NewsFeedAdapter newsFeedAdapter, ZNewsFeedContentItemRowBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f81040b = newsFeedAdapter;
            this.f81039a = binding;
        }

        /* renamed from: b */
        public static /* synthetic */ void m20648b(NewsFeedAdapter newsFeedAdapter, NewsItem newsItem, View view) {
            m20646d(newsFeedAdapter, newsItem, view);
        }

        /* renamed from: c */
        public static /* synthetic */ void m20647c(NewsFeedAdapter newsFeedAdapter, NewsItem newsItem, View view) {
            m20645e(newsFeedAdapter, newsItem, view);
        }

        /* renamed from: d */
        public static final void m20646d(NewsFeedAdapter this$0, NewsItem newsFeed, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(newsFeed, "$newsFeed");
            if (this$0.f81029b.hasContentDetail(newsFeed)) {
                OnClickSeeMoreDetail onClickSeeMoreDetail = this$0.f81031d;
                Intrinsics.checkNotNull(onClickSeeMoreDetail);
                onClickSeeMoreDetail.onClickMoreContentDetail(newsFeed);
            }
        }

        /* renamed from: e */
        public static final void m20645e(NewsFeedAdapter this$0, NewsItem newsFeed, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(newsFeed, "$newsFeed");
            if (this$0.f81029b.hasContentDetail(newsFeed)) {
                OnClickSeeMoreDetail onClickSeeMoreDetail = this$0.f81031d;
                Intrinsics.checkNotNull(onClickSeeMoreDetail);
                onClickSeeMoreDetail.onClickMoreContentDetail(newsFeed);
            }
        }

        public final void bind(@NotNull final NewsItem newsFeed, @NotNull String timeAgo, @Nullable Animation animation, @NotNull NewsFeedContentViewHolder viewHolder) {
            Intrinsics.checkNotNullParameter(newsFeed, "newsFeed");
            Intrinsics.checkNotNullParameter(timeAgo, "timeAgo");
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            DtacFontTextView dtacFontTextView = this.f81039a.tvNewsFeedReadmore;
            final NewsFeedAdapter newsFeedAdapter = this.f81040b;
            dtacFontTextView.setOnClickListener(new View.OnClickListener() { // from class: MH0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    NewsFeedAdapter.NewsFeedContentViewHolder.m20648b(NewsFeedAdapter.this, newsFeed, view);
                }
            });
            DtacFontTextView dtacFontTextView2 = this.f81039a.tvNewsFeedContent;
            final NewsFeedAdapter newsFeedAdapter2 = this.f81040b;
            dtacFontTextView2.setOnClickListener(new View.OnClickListener() { // from class: NH0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    NewsFeedAdapter.NewsFeedContentViewHolder.m20647c(NewsFeedAdapter.this, newsFeed, view);
                }
            });
            NewsFeedAdapter newsFeedAdapter3 = this.f81040b;
            ImageView imageView = this.f81039a.incLike.ivLike;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.incLike.ivLike");
            DtacFontTextView dtacFontTextView3 = this.f81039a.incLike.tvCountLike;
            Intrinsics.checkNotNullExpressionValue(dtacFontTextView3, "binding.incLike.tvCountLike");
            newsFeedAdapter3.setActionLike(newsFeed, imageView, dtacFontTextView3, getAdapterPosition(), viewHolder);
            if (animation != null) {
                this.f81039a.cvNewsFeed.startAnimation(animation);
            }
            this.f81040b.m20664b(newsFeed.getCreatedByImg(), this.f81039a.ivNewsFeedImageProfile);
            this.f81039a.tvUsername.setText(newsFeed.getCreatedByName());
            this.f81039a.tvNewsFeedContent.setText(newsFeed.getContentPreview());
            this.f81039a.tvNewsFeedTime.setText(timeAgo);
            NewsFeedAdapter newsFeedAdapter4 = this.f81040b;
            DtacFontTextView dtacFontTextView4 = this.f81039a.tvNewsFeedReadmore;
            Intrinsics.checkNotNullExpressionValue(dtacFontTextView4, "binding.tvNewsFeedReadmore");
            newsFeedAdapter4.m20663c(dtacFontTextView4, newsFeed);
        }

        public final void updateLike(@NotNull NewsItem newsFeed) {
            int i;
            Intrinsics.checkNotNullParameter(newsFeed, "newsFeed");
            if (Intrinsics.areEqual(newsFeed.isLike(), Boolean.TRUE)) {
                this.f81039a.incLike.ivLike.setImageResource(R.drawable.ic_newslikeactive);
            } else {
                this.f81039a.incLike.ivLike.setImageResource(R.drawable.iconsnewslikedisactive);
            }
            Integer liked = newsFeed.getLiked();
            if (liked != null) {
                i = liked.intValue();
            } else {
                i = 0;
            }
            if (i > 0) {
                DtacFontTextView dtacFontTextView = this.f81039a.incLike.tvCountLike;
                Intrinsics.checkNotNullExpressionValue(dtacFontTextView, "binding.incLike.tvCountLike");
                ViewVisibleExtKt.toVisible(dtacFontTextView);
                this.f81039a.incLike.tvCountLike.setText(String.valueOf(newsFeed.getLiked()));
                return;
            }
            DtacFontTextView dtacFontTextView2 = this.f81039a.incLike.tvCountLike;
            Intrinsics.checkNotNullExpressionValue(dtacFontTextView2, "binding.incLike.tvCountLike");
            ViewVisibleExtKt.toGone(dtacFontTextView2);
        }
    }

    @Metadata(m29143d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ3\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\u0010\u0010\u001a\u00060\u0000R\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/NewsFeedAdapter$NewsFeedFullContentViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/ZNewsFeedFullContentItemRowBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/adapter/NewsFeedAdapter;Lth/co/dtac/android/dtacone/databinding/ZNewsFeedFullContentItemRowBinding;)V", "Lth/co/dtac/android/dtacone/model/newsfeed/list/response/NewsItem;", "newsFeed", "", "updateLike", "(Lth/co/dtac/android/dtacone/model/newsfeed/list/response/NewsItem;)V", "", "timeAgo", "Landroid/view/animation/Animation;", "animation", "Lth/co/dtac/android/dtacone/adapter/NewsFeedAdapter;", "viewHolder", "bind", "(Lth/co/dtac/android/dtacone/model/newsfeed/list/response/NewsItem;Ljava/lang/String;Landroid/view/animation/Animation;Lth/co/dtac/android/dtacone/adapter/NewsFeedAdapter$NewsFeedFullContentViewHolder;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/ZNewsFeedFullContentItemRowBinding;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nNewsFeedAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewsFeedAdapter.kt\nth/co/dtac/android/dtacone/adapter/NewsFeedAdapter$NewsFeedFullContentViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,587:1\n1#2:588\n*E\n"})
    /* renamed from: th.co.dtac.android.dtacone.adapter.NewsFeedAdapter$NewsFeedFullContentViewHolder */
    /* loaded from: classes7.dex */
    public final class NewsFeedFullContentViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ZNewsFeedFullContentItemRowBinding f81041a;

        /* renamed from: b */
        public final /* synthetic */ NewsFeedAdapter f81042b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewsFeedFullContentViewHolder(@NotNull NewsFeedAdapter newsFeedAdapter, ZNewsFeedFullContentItemRowBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f81042b = newsFeedAdapter;
            this.f81041a = binding;
        }

        /* renamed from: b */
        public static /* synthetic */ void m20644b(NewsFeedAdapter newsFeedAdapter, NewsItem newsItem, View view) {
            m20640f(newsFeedAdapter, newsItem, view);
        }

        /* renamed from: c */
        public static /* synthetic */ void m20643c(NewsItem newsItem, NewsFeedAdapter newsFeedAdapter, View view) {
            m20638h(newsItem, newsFeedAdapter, view);
        }

        /* renamed from: d */
        public static /* synthetic */ void m20642d(NewsFeedAdapter newsFeedAdapter, NewsItem newsItem, View view) {
            m20639g(newsFeedAdapter, newsItem, view);
        }

        /* renamed from: e */
        public static /* synthetic */ void m20641e(NewsItem newsItem, NewsFeedAdapter newsFeedAdapter, View view) {
            m20637i(newsItem, newsFeedAdapter, view);
        }

        /* renamed from: f */
        public static final void m20640f(NewsFeedAdapter this$0, NewsItem newsFeed, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(newsFeed, "$newsFeed");
            OnClickSeeMoreDetail onClickSeeMoreDetail = this$0.f81031d;
            Intrinsics.checkNotNull(onClickSeeMoreDetail);
            onClickSeeMoreDetail.onClickOpenWebView(newsFeed);
        }

        /* renamed from: g */
        public static final void m20639g(NewsFeedAdapter this$0, NewsItem newsFeed, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(newsFeed, "$newsFeed");
            OnClickSeeMoreDetail onClickSeeMoreDetail = this$0.f81031d;
            Intrinsics.checkNotNull(onClickSeeMoreDetail);
            onClickSeeMoreDetail.onClickOpenWebView(newsFeed);
        }

        /* renamed from: h */
        public static final void m20638h(NewsItem newsFeed, NewsFeedAdapter this$0, View view) {
            Intrinsics.checkNotNullParameter(newsFeed, "$newsFeed");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (newsFeed.getContent() != null) {
                OnClickSeeMoreDetail onClickSeeMoreDetail = this$0.f81031d;
                Intrinsics.checkNotNull(onClickSeeMoreDetail);
                onClickSeeMoreDetail.onClickMoreContentDetail(newsFeed);
            }
        }

        /* renamed from: i */
        public static final void m20637i(NewsItem newsFeed, NewsFeedAdapter this$0, View view) {
            Intrinsics.checkNotNullParameter(newsFeed, "$newsFeed");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (newsFeed.getContent() != null) {
                OnClickSeeMoreDetail onClickSeeMoreDetail = this$0.f81031d;
                Intrinsics.checkNotNull(onClickSeeMoreDetail);
                onClickSeeMoreDetail.onClickMoreContentDetail(newsFeed);
            }
        }

        public final void bind(@NotNull final NewsItem newsFeed, @NotNull String timeAgo, @Nullable Animation animation, @NotNull NewsFeedFullContentViewHolder viewHolder) {
            Intrinsics.checkNotNullParameter(newsFeed, "newsFeed");
            Intrinsics.checkNotNullParameter(timeAgo, "timeAgo");
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            LinearLayout linearLayout = this.f81041a.linkBox;
            final NewsFeedAdapter newsFeedAdapter = this.f81042b;
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: OH0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    NewsFeedAdapter.NewsFeedFullContentViewHolder.m20644b(NewsFeedAdapter.this, newsFeed, view);
                }
            });
            AdjustableImageView adjustableImageView = this.f81041a.ivNewsFeedBanner;
            final NewsFeedAdapter newsFeedAdapter2 = this.f81042b;
            adjustableImageView.setOnClickListener(new View.OnClickListener() { // from class: PH0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    NewsFeedAdapter.NewsFeedFullContentViewHolder.m20642d(NewsFeedAdapter.this, newsFeed, view);
                }
            });
            DtacFontTextView dtacFontTextView = this.f81041a.tvNewsFeedReadmore;
            final NewsFeedAdapter newsFeedAdapter3 = this.f81042b;
            dtacFontTextView.setOnClickListener(new View.OnClickListener() { // from class: QH0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    NewsFeedAdapter.NewsFeedFullContentViewHolder.m20643c(NewsItem.this, newsFeedAdapter3, view);
                }
            });
            DtacFontTextView dtacFontTextView2 = this.f81041a.tvNewsFeedContent;
            final NewsFeedAdapter newsFeedAdapter4 = this.f81042b;
            dtacFontTextView2.setOnClickListener(new View.OnClickListener() { // from class: RH0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    NewsFeedAdapter.NewsFeedFullContentViewHolder.m20641e(NewsItem.this, newsFeedAdapter4, view);
                }
            });
            NewsFeedAdapter newsFeedAdapter5 = this.f81042b;
            ImageView imageView = this.f81041a.incLike.ivLike;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.incLike.ivLike");
            DtacFontTextView dtacFontTextView3 = this.f81041a.incLike.tvCountLike;
            Intrinsics.checkNotNullExpressionValue(dtacFontTextView3, "binding.incLike.tvCountLike");
            newsFeedAdapter5.setActionLike(newsFeed, imageView, dtacFontTextView3, getAdapterPosition(), viewHolder);
            if (animation != null) {
                this.f81041a.cvNewsFeed.startAnimation(animation);
            }
            NewsFeedAdapter newsFeedAdapter6 = this.f81042b;
            AdjustableImageView adjustableImageView2 = this.f81041a.ivNewsFeedBanner;
            Intrinsics.checkNotNullExpressionValue(adjustableImageView2, "binding.ivNewsFeedBanner");
            newsFeedAdapter6.m20662d(adjustableImageView2, newsFeed);
            this.f81042b.m20664b(newsFeed.getScreenshot(), this.f81041a.ivNewsFeedBanner);
            this.f81042b.m20664b(newsFeed.getCreatedByImg(), this.f81041a.ivNewsFeedImageProfile);
            this.f81041a.tvUrlLink.setText(newsFeed.getUri());
            this.f81041a.tvUsername.setText(newsFeed.getCreatedByName());
            this.f81041a.tvNewsFeedTime.setText(timeAgo);
            this.f81041a.tvNewsFeedContent.setText(newsFeed.getContentPreview());
            NewsFeedAdapter newsFeedAdapter7 = this.f81042b;
            DtacFontTextView dtacFontTextView4 = this.f81041a.tvNewsFeedReadmore;
            Intrinsics.checkNotNullExpressionValue(dtacFontTextView4, "binding.tvNewsFeedReadmore");
            newsFeedAdapter7.m20663c(dtacFontTextView4, newsFeed);
        }

        public final void updateLike(@NotNull NewsItem newsFeed) {
            int i;
            Intrinsics.checkNotNullParameter(newsFeed, "newsFeed");
            if (Intrinsics.areEqual(newsFeed.isLike(), Boolean.TRUE)) {
                this.f81041a.incLike.ivLike.setImageResource(R.drawable.ic_newslikeactive);
            } else {
                this.f81041a.incLike.ivLike.setImageResource(R.drawable.iconsnewslikedisactive);
            }
            Integer liked = newsFeed.getLiked();
            if (liked != null) {
                i = liked.intValue();
            } else {
                i = 0;
            }
            if (i > 0) {
                DtacFontTextView dtacFontTextView = this.f81041a.incLike.tvCountLike;
                Intrinsics.checkNotNullExpressionValue(dtacFontTextView, "binding.incLike.tvCountLike");
                ViewVisibleExtKt.toVisible(dtacFontTextView);
                this.f81041a.incLike.tvCountLike.setText(String.valueOf(newsFeed.getLiked()));
                return;
            }
            DtacFontTextView dtacFontTextView2 = this.f81041a.incLike.tvCountLike;
            Intrinsics.checkNotNullExpressionValue(dtacFontTextView2, "binding.incLike.tvCountLike");
            ViewVisibleExtKt.toGone(dtacFontTextView2);
        }
    }

    @Metadata(m29143d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ3\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\u0010\u0010\u001a\u00060\u0000R\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/NewsFeedAdapter$NewsFeedImageLinkViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/ZNewsFeedImageLinkItemRowBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/adapter/NewsFeedAdapter;Lth/co/dtac/android/dtacone/databinding/ZNewsFeedImageLinkItemRowBinding;)V", "Lth/co/dtac/android/dtacone/model/newsfeed/list/response/NewsItem;", "newsFeed", "", "updateLike", "(Lth/co/dtac/android/dtacone/model/newsfeed/list/response/NewsItem;)V", "", "timeAgo", "Landroid/view/animation/Animation;", "animation", "Lth/co/dtac/android/dtacone/adapter/NewsFeedAdapter;", "viewHolder", "bind", "(Lth/co/dtac/android/dtacone/model/newsfeed/list/response/NewsItem;Ljava/lang/String;Landroid/view/animation/Animation;Lth/co/dtac/android/dtacone/adapter/NewsFeedAdapter$NewsFeedImageLinkViewHolder;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/ZNewsFeedImageLinkItemRowBinding;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nNewsFeedAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewsFeedAdapter.kt\nth/co/dtac/android/dtacone/adapter/NewsFeedAdapter$NewsFeedImageLinkViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,587:1\n1#2:588\n*E\n"})
    /* renamed from: th.co.dtac.android.dtacone.adapter.NewsFeedAdapter$NewsFeedImageLinkViewHolder */
    /* loaded from: classes7.dex */
    public final class NewsFeedImageLinkViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ZNewsFeedImageLinkItemRowBinding f81043a;

        /* renamed from: b */
        public final /* synthetic */ NewsFeedAdapter f81044b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewsFeedImageLinkViewHolder(@NotNull NewsFeedAdapter newsFeedAdapter, ZNewsFeedImageLinkItemRowBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f81044b = newsFeedAdapter;
            this.f81043a = binding;
        }

        /* renamed from: b */
        public static /* synthetic */ void m20636b(NewsFeedAdapter newsFeedAdapter, NewsItem newsItem, View view) {
            m20634d(newsFeedAdapter, newsItem, view);
        }

        /* renamed from: c */
        public static /* synthetic */ void m20635c(NewsFeedAdapter newsFeedAdapter, NewsItem newsItem, View view) {
            m20633e(newsFeedAdapter, newsItem, view);
        }

        /* renamed from: d */
        public static final void m20634d(NewsFeedAdapter this$0, NewsItem newsFeed, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(newsFeed, "$newsFeed");
            OnClickSeeMoreDetail onClickSeeMoreDetail = this$0.f81031d;
            Intrinsics.checkNotNull(onClickSeeMoreDetail);
            onClickSeeMoreDetail.onClickOpenWebView(newsFeed);
        }

        /* renamed from: e */
        public static final void m20633e(NewsFeedAdapter this$0, NewsItem newsFeed, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(newsFeed, "$newsFeed");
            OnClickSeeMoreDetail onClickSeeMoreDetail = this$0.f81031d;
            Intrinsics.checkNotNull(onClickSeeMoreDetail);
            onClickSeeMoreDetail.onClickOpenWebView(newsFeed);
        }

        public final void bind(@NotNull final NewsItem newsFeed, @NotNull String timeAgo, @Nullable Animation animation, @NotNull NewsFeedImageLinkViewHolder viewHolder) {
            Intrinsics.checkNotNullParameter(newsFeed, "newsFeed");
            Intrinsics.checkNotNullParameter(timeAgo, "timeAgo");
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            LinearLayout linearLayout = this.f81043a.linkBox;
            final NewsFeedAdapter newsFeedAdapter = this.f81044b;
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: SH0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    NewsFeedAdapter.NewsFeedImageLinkViewHolder.m20636b(NewsFeedAdapter.this, newsFeed, view);
                }
            });
            AdjustableImageView adjustableImageView = this.f81043a.ivNewsFeedBanner;
            final NewsFeedAdapter newsFeedAdapter2 = this.f81044b;
            adjustableImageView.setOnClickListener(new View.OnClickListener() { // from class: TH0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    NewsFeedAdapter.NewsFeedImageLinkViewHolder.m20635c(NewsFeedAdapter.this, newsFeed, view);
                }
            });
            NewsFeedAdapter newsFeedAdapter3 = this.f81044b;
            ImageView imageView = this.f81043a.incLike.ivLike;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.incLike.ivLike");
            DtacFontTextView dtacFontTextView = this.f81043a.incLike.tvCountLike;
            Intrinsics.checkNotNullExpressionValue(dtacFontTextView, "binding.incLike.tvCountLike");
            newsFeedAdapter3.setActionLike(newsFeed, imageView, dtacFontTextView, getAdapterPosition(), viewHolder);
            if (animation != null) {
                this.f81043a.cvNewsFeed.startAnimation(animation);
            }
            this.f81044b.m20664b(newsFeed.getScreenshot(), this.f81043a.ivNewsFeedBanner);
            this.f81044b.m20664b(newsFeed.getCreatedByImg(), this.f81043a.ivNewsFeedImageProfile);
            this.f81043a.tvUsername.setText(newsFeed.getCreatedByName());
            this.f81043a.tvUrlLink.setText(newsFeed.getUri());
            this.f81043a.tvNewsFeedTime.setText(timeAgo);
        }

        public final void updateLike(@NotNull NewsItem newsFeed) {
            int i;
            Intrinsics.checkNotNullParameter(newsFeed, "newsFeed");
            if (Intrinsics.areEqual(newsFeed.isLike(), Boolean.TRUE)) {
                this.f81043a.incLike.ivLike.setImageResource(R.drawable.ic_newslikeactive);
            } else {
                this.f81043a.incLike.ivLike.setImageResource(R.drawable.iconsnewslikedisactive);
            }
            Integer liked = newsFeed.getLiked();
            if (liked != null) {
                i = liked.intValue();
            } else {
                i = 0;
            }
            if (i > 0) {
                DtacFontTextView dtacFontTextView = this.f81043a.incLike.tvCountLike;
                Intrinsics.checkNotNullExpressionValue(dtacFontTextView, "binding.incLike.tvCountLike");
                ViewVisibleExtKt.toVisible(dtacFontTextView);
                this.f81043a.incLike.tvCountLike.setText(String.valueOf(newsFeed.getLiked()));
                return;
            }
            DtacFontTextView dtacFontTextView2 = this.f81043a.incLike.tvCountLike;
            Intrinsics.checkNotNullExpressionValue(dtacFontTextView2, "binding.incLike.tvCountLike");
            ViewVisibleExtKt.toGone(dtacFontTextView2);
        }
    }

    @Metadata(m29143d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ3\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\u0010\u0010\u001a\u00060\u0000R\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/NewsFeedAdapter$NewsFeedImageViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/ZNewsFeedImageItemRowBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/adapter/NewsFeedAdapter;Lth/co/dtac/android/dtacone/databinding/ZNewsFeedImageItemRowBinding;)V", "Lth/co/dtac/android/dtacone/model/newsfeed/list/response/NewsItem;", "newsFeed", "", "updateLike", "(Lth/co/dtac/android/dtacone/model/newsfeed/list/response/NewsItem;)V", "", "timeAgo", "Landroid/view/animation/Animation;", "animation", "Lth/co/dtac/android/dtacone/adapter/NewsFeedAdapter;", "viewHolder", "bind", "(Lth/co/dtac/android/dtacone/model/newsfeed/list/response/NewsItem;Ljava/lang/String;Landroid/view/animation/Animation;Lth/co/dtac/android/dtacone/adapter/NewsFeedAdapter$NewsFeedImageViewHolder;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/ZNewsFeedImageItemRowBinding;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nNewsFeedAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewsFeedAdapter.kt\nth/co/dtac/android/dtacone/adapter/NewsFeedAdapter$NewsFeedImageViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,587:1\n1#2:588\n*E\n"})
    /* renamed from: th.co.dtac.android.dtacone.adapter.NewsFeedAdapter$NewsFeedImageViewHolder */
    /* loaded from: classes7.dex */
    public final class NewsFeedImageViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ZNewsFeedImageItemRowBinding f81045a;

        /* renamed from: b */
        public final /* synthetic */ NewsFeedAdapter f81046b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewsFeedImageViewHolder(@NotNull NewsFeedAdapter newsFeedAdapter, ZNewsFeedImageItemRowBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f81046b = newsFeedAdapter;
            this.f81045a = binding;
        }

        /* renamed from: b */
        public static /* synthetic */ void m20632b(NewsFeedAdapter newsFeedAdapter, NewsItem newsItem, View view) {
            m20631c(newsFeedAdapter, newsItem, view);
        }

        /* renamed from: c */
        public static final void m20631c(NewsFeedAdapter this$0, NewsItem newsFeed, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(newsFeed, "$newsFeed");
            OnClickSeeMoreDetail onClickSeeMoreDetail = this$0.f81031d;
            Intrinsics.checkNotNull(onClickSeeMoreDetail);
            onClickSeeMoreDetail.onClickMoreImageOriginal(newsFeed);
        }

        public final void bind(@NotNull final NewsItem newsFeed, @NotNull String timeAgo, @Nullable Animation animation, @NotNull NewsFeedImageViewHolder viewHolder) {
            Intrinsics.checkNotNullParameter(newsFeed, "newsFeed");
            Intrinsics.checkNotNullParameter(timeAgo, "timeAgo");
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            AdjustableImageView adjustableImageView = this.f81045a.ivNewsFeedBanner;
            final NewsFeedAdapter newsFeedAdapter = this.f81046b;
            adjustableImageView.setOnClickListener(new View.OnClickListener() { // from class: UH0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    NewsFeedAdapter.NewsFeedImageViewHolder.m20632b(NewsFeedAdapter.this, newsFeed, view);
                }
            });
            NewsFeedAdapter newsFeedAdapter2 = this.f81046b;
            ImageView imageView = this.f81045a.incLike.ivLike;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.incLike.ivLike");
            DtacFontTextView dtacFontTextView = this.f81045a.incLike.tvCountLike;
            Intrinsics.checkNotNullExpressionValue(dtacFontTextView, "binding.incLike.tvCountLike");
            newsFeedAdapter2.setActionLike(newsFeed, imageView, dtacFontTextView, getAdapterPosition(), viewHolder);
            if (animation != null) {
                this.f81045a.cvNewsFeed.startAnimation(animation);
            }
            NewsFeedAdapter newsFeedAdapter3 = this.f81046b;
            AdjustableImageView adjustableImageView2 = this.f81045a.ivNewsFeedBanner;
            Intrinsics.checkNotNullExpressionValue(adjustableImageView2, "binding.ivNewsFeedBanner");
            newsFeedAdapter3.m20662d(adjustableImageView2, newsFeed);
            this.f81046b.m20664b(newsFeed.getScreenshot(), this.f81045a.ivNewsFeedBanner);
            this.f81046b.m20664b(newsFeed.getCreatedByImg(), this.f81045a.ivNewsFeedImageProfile);
            this.f81045a.tvUsername.setText(newsFeed.getCreatedByName());
            this.f81045a.tvNewsFeedTime.setText(timeAgo);
        }

        public final void updateLike(@NotNull NewsItem newsFeed) {
            int i;
            Intrinsics.checkNotNullParameter(newsFeed, "newsFeed");
            if (Intrinsics.areEqual(newsFeed.isLike(), Boolean.TRUE)) {
                this.f81045a.incLike.ivLike.setImageResource(R.drawable.ic_newslikeactive);
            } else {
                this.f81045a.incLike.ivLike.setImageResource(R.drawable.iconsnewslikedisactive);
            }
            Integer liked = newsFeed.getLiked();
            if (liked != null) {
                i = liked.intValue();
            } else {
                i = 0;
            }
            if (i > 0) {
                DtacFontTextView dtacFontTextView = this.f81045a.incLike.tvCountLike;
                Intrinsics.checkNotNullExpressionValue(dtacFontTextView, "binding.incLike.tvCountLike");
                ViewVisibleExtKt.toVisible(dtacFontTextView);
                this.f81045a.incLike.tvCountLike.setText(String.valueOf(newsFeed.getLiked()));
                return;
            }
            DtacFontTextView dtacFontTextView2 = this.f81045a.incLike.tvCountLike;
            Intrinsics.checkNotNullExpressionValue(dtacFontTextView2, "binding.incLike.tvCountLike");
            ViewVisibleExtKt.toGone(dtacFontTextView2);
        }
    }

    @Metadata(m29143d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ3\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\u0010\u0010\u001a\u00060\u0000R\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/NewsFeedAdapter$NewsFeedLinkViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/ZNewsFeedLinkItemRowBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/adapter/NewsFeedAdapter;Lth/co/dtac/android/dtacone/databinding/ZNewsFeedLinkItemRowBinding;)V", "Lth/co/dtac/android/dtacone/model/newsfeed/list/response/NewsItem;", "newsFeed", "", "updateLike", "(Lth/co/dtac/android/dtacone/model/newsfeed/list/response/NewsItem;)V", "", "timeAgo", "Landroid/view/animation/Animation;", "animation", "Lth/co/dtac/android/dtacone/adapter/NewsFeedAdapter;", "viewHolder", "bind", "(Lth/co/dtac/android/dtacone/model/newsfeed/list/response/NewsItem;Ljava/lang/String;Landroid/view/animation/Animation;Lth/co/dtac/android/dtacone/adapter/NewsFeedAdapter$NewsFeedLinkViewHolder;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/ZNewsFeedLinkItemRowBinding;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nNewsFeedAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewsFeedAdapter.kt\nth/co/dtac/android/dtacone/adapter/NewsFeedAdapter$NewsFeedLinkViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,587:1\n1#2:588\n*E\n"})
    /* renamed from: th.co.dtac.android.dtacone.adapter.NewsFeedAdapter$NewsFeedLinkViewHolder */
    /* loaded from: classes7.dex */
    public final class NewsFeedLinkViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ZNewsFeedLinkItemRowBinding f81047a;

        /* renamed from: b */
        public final /* synthetic */ NewsFeedAdapter f81048b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewsFeedLinkViewHolder(@NotNull NewsFeedAdapter newsFeedAdapter, ZNewsFeedLinkItemRowBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f81048b = newsFeedAdapter;
            this.f81047a = binding;
        }

        /* renamed from: b */
        public static /* synthetic */ void m20630b(NewsFeedAdapter newsFeedAdapter, NewsItem newsItem, View view) {
            m20629c(newsFeedAdapter, newsItem, view);
        }

        /* renamed from: c */
        public static final void m20629c(NewsFeedAdapter this$0, NewsItem newsFeed, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(newsFeed, "$newsFeed");
            OnClickSeeMoreDetail onClickSeeMoreDetail = this$0.f81031d;
            Intrinsics.checkNotNull(onClickSeeMoreDetail);
            onClickSeeMoreDetail.onClickOpenWebView(newsFeed);
        }

        public final void bind(@NotNull final NewsItem newsFeed, @NotNull String timeAgo, @Nullable Animation animation, @NotNull NewsFeedLinkViewHolder viewHolder) {
            Intrinsics.checkNotNullParameter(newsFeed, "newsFeed");
            Intrinsics.checkNotNullParameter(timeAgo, "timeAgo");
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            LinearLayout linearLayout = this.f81047a.linkBox;
            final NewsFeedAdapter newsFeedAdapter = this.f81048b;
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: VH0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    NewsFeedAdapter.NewsFeedLinkViewHolder.m20630b(NewsFeedAdapter.this, newsFeed, view);
                }
            });
            NewsFeedAdapter newsFeedAdapter2 = this.f81048b;
            ImageView imageView = this.f81047a.incLike.ivLike;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.incLike.ivLike");
            DtacFontTextView dtacFontTextView = this.f81047a.incLike.tvCountLike;
            Intrinsics.checkNotNullExpressionValue(dtacFontTextView, "binding.incLike.tvCountLike");
            newsFeedAdapter2.setActionLike(newsFeed, imageView, dtacFontTextView, getAdapterPosition(), viewHolder);
            if (animation != null) {
                this.f81047a.cvNewsFeed.startAnimation(animation);
            }
            this.f81048b.m20664b(newsFeed.getCreatedByImg(), this.f81047a.ivNewsFeedImageProfile);
            this.f81047a.tvUsername.setText(newsFeed.getCreatedByName());
            this.f81047a.tvNewsFeedTime.setText(timeAgo);
            this.f81047a.tvUrlLink.setText(newsFeed.getUri());
        }

        public final void updateLike(@NotNull NewsItem newsFeed) {
            int i;
            Intrinsics.checkNotNullParameter(newsFeed, "newsFeed");
            if (Intrinsics.areEqual(newsFeed.isLike(), Boolean.TRUE)) {
                this.f81047a.incLike.ivLike.setImageResource(R.drawable.ic_newslikeactive);
            } else {
                this.f81047a.incLike.ivLike.setImageResource(R.drawable.iconsnewslikedisactive);
            }
            Integer liked = newsFeed.getLiked();
            if (liked != null) {
                i = liked.intValue();
            } else {
                i = 0;
            }
            if (i > 0) {
                DtacFontTextView dtacFontTextView = this.f81047a.incLike.tvCountLike;
                Intrinsics.checkNotNullExpressionValue(dtacFontTextView, "binding.incLike.tvCountLike");
                ViewVisibleExtKt.toVisible(dtacFontTextView);
                this.f81047a.incLike.tvCountLike.setText(String.valueOf(newsFeed.getLiked()));
                return;
            }
            DtacFontTextView dtacFontTextView2 = this.f81047a.incLike.tvCountLike;
            Intrinsics.checkNotNullExpressionValue(dtacFontTextView2, "binding.incLike.tvCountLike");
            ViewVisibleExtKt.toGone(dtacFontTextView2);
        }
    }

    @Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/NewsFeedAdapter$NewsFeedLoadingViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/ZNewsFeedLoadingItemRowBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/adapter/NewsFeedAdapter;Lth/co/dtac/android/dtacone/databinding/ZNewsFeedLoadingItemRowBinding;)V", "", "setLoadingComponent", "()V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/ZNewsFeedLoadingItemRowBinding;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.adapter.NewsFeedAdapter$NewsFeedLoadingViewHolder */
    /* loaded from: classes7.dex */
    public final class NewsFeedLoadingViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ZNewsFeedLoadingItemRowBinding f81049a;

        /* renamed from: b */
        public final /* synthetic */ NewsFeedAdapter f81050b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewsFeedLoadingViewHolder(@NotNull NewsFeedAdapter newsFeedAdapter, ZNewsFeedLoadingItemRowBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f81050b = newsFeedAdapter;
            this.f81049a = binding;
        }

        public final void setLoadingComponent() {
            ArrayList arrayList = this.f81050b.f81030c;
            Intrinsics.checkNotNull(arrayList);
            if (!arrayList.isEmpty() && !this.f81050b.f81033f) {
                this.itemView.setVisibility(0);
            } else {
                this.itemView.setVisibility(8);
            }
        }
    }

    @Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/NewsFeedAdapter$OnClickSeeMoreDetail;", "", "onClickLike", "", "newsFeed", "Lth/co/dtac/android/dtacone/model/newsfeed/list/response/NewsItem;", "position", "", "viewHolder", "onClickMoreContentDetail", "onClickMoreImageOriginal", "onClickOpenWebView", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.adapter.NewsFeedAdapter$OnClickSeeMoreDetail */
    /* loaded from: classes7.dex */
    public interface OnClickSeeMoreDetail {
        void onClickLike(@NotNull NewsItem newsItem, int i, @Nullable Object obj);

        void onClickMoreContentDetail(@NotNull NewsItem newsItem);

        void onClickMoreImageOriginal(@NotNull NewsItem newsItem);

        void onClickOpenWebView(@NotNull NewsItem newsItem);
    }

    @Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/NewsFeedAdapter$TYPE;", "", "(Ljava/lang/String;I)V", "FULL", "CONTENT_LINK", "CONTENT", "IMAGE_LINK", "IMAGE", "CONTENT_IMAGE", "LINK", "LOADING", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.adapter.NewsFeedAdapter$TYPE */
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

    public NewsFeedAdapter(@NotNull Context mContext, @NotNull NewsFeedPresenter presenter, @Nullable ArrayList<NewsItem> arrayList) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        this.f81028a = mContext;
        this.f81029b = presenter;
        this.f81030c = arrayList;
        this.f81032e = true;
    }

    /* renamed from: a */
    public static /* synthetic */ void m20665a(NewsFeedAdapter newsFeedAdapter, NewsItem newsItem, int i, Object obj, View view) {
        m20661e(newsFeedAdapter, newsItem, i, obj, view);
    }

    /* renamed from: e */
    public static final void m20661e(NewsFeedAdapter this$0, NewsItem newsFeed, int i, Object obj, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(newsFeed, "$newsFeed");
        OnClickSeeMoreDetail onClickSeeMoreDetail = this$0.f81031d;
        Intrinsics.checkNotNull(onClickSeeMoreDetail);
        onClickSeeMoreDetail.onClickLike(newsFeed, i, obj);
    }

    public final void addLoadingFooter() {
        this.f81032e = true;
    }

    /* renamed from: b */
    public final void m20664b(String str, ImageView imageView) {
        RequestManager with = Glide.with(this.f81028a);
        Intrinsics.checkNotNull(imageView);
        with.clear(imageView);
        Glide.with(this.f81028a).m74229load(str).skipMemoryCache(true).fitCenter().transition(DrawableTransitionOptions.withCrossFade()).placeholder(ContextCompat.getDrawable(this.f81028a, R.drawable.z_white)).error(R.drawable.image_banner_default).diskCacheStrategy(DiskCacheStrategy.DATA).signature(new ObjectKey(UUID.randomUUID().toString())).into(imageView);
    }

    /* renamed from: c */
    public final void m20663c(View view, NewsItem newsItem) {
        int i;
        if (this.f81029b.hasContentDetail(newsItem)) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    /* renamed from: d */
    public final void m20662d(final AdjustableImageView adjustableImageView, NewsItem newsItem) {
        adjustableImageView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: th.co.dtac.android.dtacone.adapter.NewsFeedAdapter$observeForChangeImageView$1
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
        if (this.f81032e) {
            ArrayList arrayList = this.f81030c;
            Intrinsics.checkNotNull(arrayList);
            return arrayList.size() + 1;
        }
        ArrayList arrayList2 = this.f81030c;
        if (arrayList2 != null) {
            return arrayList2.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        ArrayList arrayList = this.f81030c;
        Intrinsics.checkNotNull(arrayList);
        if (i == arrayList.size() && this.f81032e) {
            return TYPE.LOADING.ordinal();
        }
        Object obj = this.f81030c.get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "mNewsFeedList[position]");
        NewsItem newsItem = (NewsItem) obj;
        if (this.f81029b.isFullContentView(newsItem)) {
            return TYPE.FULL.ordinal();
        }
        if (this.f81029b.isContentLinkView(newsItem)) {
            return TYPE.CONTENT_LINK.ordinal();
        }
        if (this.f81029b.isContentImage(newsItem)) {
            return TYPE.CONTENT_IMAGE.ordinal();
        }
        if (this.f81029b.isImageLinkView(newsItem)) {
            return TYPE.IMAGE_LINK.ordinal();
        }
        if (this.f81029b.isContentOnly(newsItem)) {
            return TYPE.CONTENT.ordinal();
        }
        if (this.f81029b.hasLink(newsItem)) {
            return TYPE.LINK.ordinal();
        }
        return TYPE.IMAGE.ordinal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
        Animation animation;
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        ArrayList arrayList = this.f81030c;
        Intrinsics.checkNotNull(arrayList);
        if (i == arrayList.size() && this.f81032e) {
            if (viewHolder instanceof NewsFeedLoadingViewHolder) {
                ((NewsFeedLoadingViewHolder) viewHolder).setLoadingComponent();
                return;
            }
            return;
        }
        if (!this.f81034g) {
            animation = AnimationUtils.loadAnimation(this.f81028a, R.anim.slide_up);
            animation.setDuration(400L);
        } else {
            this.f81034g = false;
            animation = null;
        }
        Object obj = this.f81030c.get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "mNewsFeedList[position]");
        NewsItem newsItem = (NewsItem) obj;
        String timeAgo = DateUtil.getRelativeDateTime(newsItem.getCreatedDate(), DateUtil.FORMAT_SERVER_FULL_DATE_TIME, new Locale(LanguageSupport.LANG_TH, StandardStructureTypes.f60307TH));
        if (viewHolder instanceof NewsFeedFullContentViewHolder) {
            NewsFeedFullContentViewHolder newsFeedFullContentViewHolder = (NewsFeedFullContentViewHolder) viewHolder;
            Intrinsics.checkNotNullExpressionValue(timeAgo, "timeAgo");
            newsFeedFullContentViewHolder.bind(newsItem, timeAgo, animation, newsFeedFullContentViewHolder);
        } else if (viewHolder instanceof NewsFeedImageLinkViewHolder) {
            NewsFeedImageLinkViewHolder newsFeedImageLinkViewHolder = (NewsFeedImageLinkViewHolder) viewHolder;
            Intrinsics.checkNotNullExpressionValue(timeAgo, "timeAgo");
            newsFeedImageLinkViewHolder.bind(newsItem, timeAgo, animation, newsFeedImageLinkViewHolder);
        } else if (viewHolder instanceof NewsFeedImageViewHolder) {
            NewsFeedImageViewHolder newsFeedImageViewHolder = (NewsFeedImageViewHolder) viewHolder;
            Intrinsics.checkNotNullExpressionValue(timeAgo, "timeAgo");
            newsFeedImageViewHolder.bind(newsItem, timeAgo, animation, newsFeedImageViewHolder);
        } else if (viewHolder instanceof NewsFeedContentLinkViewHolder) {
            NewsFeedContentLinkViewHolder newsFeedContentLinkViewHolder = (NewsFeedContentLinkViewHolder) viewHolder;
            Intrinsics.checkNotNullExpressionValue(timeAgo, "timeAgo");
            newsFeedContentLinkViewHolder.bind(newsItem, timeAgo, animation, newsFeedContentLinkViewHolder);
        } else if (viewHolder instanceof NewsFeedContentImageViewHolder) {
            NewsFeedContentImageViewHolder newsFeedContentImageViewHolder = (NewsFeedContentImageViewHolder) viewHolder;
            Intrinsics.checkNotNullExpressionValue(timeAgo, "timeAgo");
            newsFeedContentImageViewHolder.bind(newsItem, timeAgo, animation, newsFeedContentImageViewHolder);
        } else if (viewHolder instanceof NewsFeedLinkViewHolder) {
            NewsFeedLinkViewHolder newsFeedLinkViewHolder = (NewsFeedLinkViewHolder) viewHolder;
            Intrinsics.checkNotNullExpressionValue(timeAgo, "timeAgo");
            newsFeedLinkViewHolder.bind(newsItem, timeAgo, animation, newsFeedLinkViewHolder);
        } else if (viewHolder instanceof NewsFeedLoadingViewHolder) {
            ((NewsFeedLoadingViewHolder) viewHolder).setLoadingComponent();
        } else if (viewHolder instanceof NewsFeedContentViewHolder) {
            NewsFeedContentViewHolder newsFeedContentViewHolder = (NewsFeedContentViewHolder) viewHolder;
            Intrinsics.checkNotNullExpressionValue(timeAgo, "timeAgo");
            newsFeedContentViewHolder.bind(newsItem, timeAgo, animation, newsFeedContentViewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (i == TYPE.FULL.ordinal()) {
            ZNewsFeedFullContentItemRowBinding inflate = ZNewsFeedFullContentItemRowBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(LayoutInflater.f….context), parent, false)");
            return new NewsFeedFullContentViewHolder(this, inflate);
        } else if (i == TYPE.IMAGE_LINK.ordinal()) {
            ZNewsFeedImageLinkItemRowBinding inflate2 = ZNewsFeedImageLinkItemRowBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate2, "inflate(LayoutInflater.f….context), parent, false)");
            return new NewsFeedImageLinkViewHolder(this, inflate2);
        } else if (i == TYPE.IMAGE.ordinal()) {
            ZNewsFeedImageItemRowBinding inflate3 = ZNewsFeedImageItemRowBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate3, "inflate(LayoutInflater.f….context), parent, false)");
            return new NewsFeedImageViewHolder(this, inflate3);
        } else if (i == TYPE.CONTENT_LINK.ordinal()) {
            ZNewsFeedContentLinkItemRowBinding inflate4 = ZNewsFeedContentLinkItemRowBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate4, "inflate(LayoutInflater.f….context), parent, false)");
            return new NewsFeedContentLinkViewHolder(this, inflate4);
        } else if (i == TYPE.CONTENT_IMAGE.ordinal()) {
            ZNewsFeedContentImageItemRowBinding inflate5 = ZNewsFeedContentImageItemRowBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate5, "inflate(LayoutInflater.f….context), parent, false)");
            return new NewsFeedContentImageViewHolder(this, inflate5);
        } else if (i == TYPE.LINK.ordinal()) {
            ZNewsFeedLinkItemRowBinding inflate6 = ZNewsFeedLinkItemRowBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate6, "inflate(LayoutInflater.f….context), parent, false)");
            return new NewsFeedLinkViewHolder(this, inflate6);
        } else if (i == TYPE.LOADING.ordinal()) {
            ZNewsFeedLoadingItemRowBinding inflate7 = ZNewsFeedLoadingItemRowBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate7, "inflate(LayoutInflater.f….context), parent, false)");
            return new NewsFeedLoadingViewHolder(this, inflate7);
        } else {
            ZNewsFeedContentItemRowBinding inflate8 = ZNewsFeedContentItemRowBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate8, "inflate(LayoutInflater.f….context), parent, false)");
            return new NewsFeedContentViewHolder(this, inflate8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(@NotNull RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder.itemView instanceof ImageView) {
            Glide.with(this.f81028a).clear(holder.itemView);
            View view = holder.itemView;
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.widget.ImageView");
            ((ImageView) view).setImageDrawable(null);
        }
        super.onViewRecycled(holder);
    }

    public final void setActionLike(@NotNull final NewsItem newsFeed, @NotNull ImageView ivLike, @NotNull DtacFontTextView tvCountLike, final int i, @Nullable final Object obj) {
        int i2;
        Intrinsics.checkNotNullParameter(newsFeed, "newsFeed");
        Intrinsics.checkNotNullParameter(ivLike, "ivLike");
        Intrinsics.checkNotNullParameter(tvCountLike, "tvCountLike");
        if (Intrinsics.areEqual(newsFeed.isLike(), Boolean.TRUE)) {
            ivLike.setImageResource(R.drawable.ic_newslikeactive);
        } else {
            ivLike.setImageResource(R.drawable.iconsnewslikedisactive);
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
        ivLike.setOnClickListener(new View.OnClickListener() { // from class: FH0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewsFeedAdapter.m20665a(NewsFeedAdapter.this, newsFeed, i, obj, view);
            }
        });
    }

    public final void setLastPage(boolean z) {
        this.f81033f = z;
    }

    public final void setOnClickMoreDetail(@NotNull OnClickSeeMoreDetail listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f81031d = listener;
    }

    public final void updateItem(@NotNull NewsItem newsFeed, int i, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(newsFeed, "newsFeed");
        this.f81034g = true;
        ArrayList arrayList = this.f81030c;
        if (arrayList != null) {
            NewsItem newsItem = (NewsItem) arrayList.set(i, newsFeed);
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