package th.p047co.dtac.android.dtacone.presenter.newsfeed;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.newsfeed.list.response.NewsItem;
import th.p047co.dtac.android.dtacone.presenter.newsfeed.NewsFeedPresenter;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.newsfeed.NewsFeedPresenter$unlike$1 */
/* loaded from: classes8.dex */
public final class NewsFeedPresenter$unlike$1 extends Lambda implements Function1<Void, Unit> {
    final /* synthetic */ NewsItem $news;
    final /* synthetic */ int $position;
    final /* synthetic */ Object $viewHolder;
    final /* synthetic */ NewsFeedPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewsFeedPresenter$unlike$1(NewsFeedPresenter newsFeedPresenter, NewsItem newsItem, int i, Object obj) {
        super(1);
        this.this$0 = newsFeedPresenter;
        this.$news = newsItem;
        this.$position = i;
        this.$viewHolder = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Void r1) {
        invoke2(r1);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Void r4) {
        NewsFeedPresenter.View view;
        this.this$0.m17775y();
        this.$news.setLike(Boolean.FALSE);
        Integer liked = this.$news.getLiked();
        int intValue = liked != null ? liked.intValue() : 0;
        if (intValue > 0) {
            this.$news.setLiked(Integer.valueOf(intValue - 1));
        }
        view = this.this$0.f86082f;
        Intrinsics.checkNotNull(view);
        view.onRefreshLike(this.$news, this.$position, this.$viewHolder);
    }
}