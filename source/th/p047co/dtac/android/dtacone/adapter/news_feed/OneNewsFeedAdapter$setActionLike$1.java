package th.p047co.dtac.android.dtacone.adapter.news_feed;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.adapter.news_feed.OneNewsFeedAdapter;
import th.p047co.dtac.android.dtacone.app_one.model.newsFeed.OneNewsItem;

@Metadata(m28851d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28850d2 = {"<anonymous>", "", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.adapter.news_feed.OneNewsFeedAdapter$setActionLike$1 */
/* loaded from: classes7.dex */
public final class OneNewsFeedAdapter$setActionLike$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ OneNewsItem $newsFeed;
    final /* synthetic */ int $position;
    final /* synthetic */ Object $viewHolder;
    final /* synthetic */ OneNewsFeedAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneNewsFeedAdapter$setActionLike$1(OneNewsFeedAdapter oneNewsFeedAdapter, OneNewsItem oneNewsItem, int i, Object obj) {
        super(0);
        this.this$0 = oneNewsFeedAdapter;
        this.$newsFeed = oneNewsItem;
        this.$position = i;
        this.$viewHolder = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        OneNewsFeedAdapter.OnClickSeeMoreDetail onClickSeeMoreDetail = this.this$0.f81294d;
        Intrinsics.checkNotNull(onClickSeeMoreDetail);
        onClickSeeMoreDetail.onClickLike(this.$newsFeed, this.$position, this.$viewHolder);
    }
}
