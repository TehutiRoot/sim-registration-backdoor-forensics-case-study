package th.p047co.dtac.android.dtacone.presenter.newsfeed;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.newsfeed.list.response.NewsItem;
import th.p047co.dtac.android.dtacone.presenter.newsfeed.NewsFeedPresenter;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "", "newsFeed", "", "Lth/co/dtac/android/dtacone/model/newsfeed/list/response/NewsItem;", "kotlin.jvm.PlatformType", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.newsfeed.NewsFeedPresenter$getNewsFeed$2 */
/* loaded from: classes8.dex */
public final class NewsFeedPresenter$getNewsFeed$2 extends Lambda implements Function1<List<NewsItem>, Unit> {
    final /* synthetic */ NewsFeedPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewsFeedPresenter$getNewsFeed$2(NewsFeedPresenter newsFeedPresenter) {
        super(1);
        this.this$0 = newsFeedPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<NewsItem> list) {
        invoke2(list);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<NewsItem> newsFeed) {
        NewsFeedPresenter.View view;
        this.this$0.m17775y();
        view = this.this$0.f86082f;
        Intrinsics.checkNotNull(view);
        Intrinsics.checkNotNullExpressionValue(newsFeed, "newsFeed");
        view.getNewsFeedSuccess(newsFeed);
    }
}