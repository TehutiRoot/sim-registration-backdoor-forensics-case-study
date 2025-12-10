package th.p047co.dtac.android.dtacone.view.appOne.home.viewModel;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.app_one.model.newsFeed.OneLikeNewsResponse;
import th.p047co.dtac.android.dtacone.app_one.model.newsFeed.OneNewsItem;
import th.p047co.dtac.android.dtacone.view.appOne.home.viewModel.OneNewsFeedViewModel;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneLikeNewsResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.home.viewModel.OneNewsFeedViewModel$like$1 */
/* loaded from: classes10.dex */
public final class OneNewsFeedViewModel$like$1 extends Lambda implements Function1<OneLikeNewsResponse, Unit> {
    final /* synthetic */ OneNewsItem $news;
    final /* synthetic */ int $position;
    final /* synthetic */ Object $viewHolder;
    final /* synthetic */ OneNewsFeedViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneNewsFeedViewModel$like$1(OneNewsFeedViewModel oneNewsFeedViewModel, OneNewsItem oneNewsItem, int i, Object obj) {
        super(1);
        this.this$0 = oneNewsFeedViewModel;
        this.$news = oneNewsItem;
        this.$position = i;
        this.$viewHolder = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneLikeNewsResponse oneLikeNewsResponse) {
        invoke2(oneLikeNewsResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneLikeNewsResponse oneLikeNewsResponse) {
        OneNewsFeedViewModel.View view;
        this.this$0.m14007y();
        this.$news.setLike(Boolean.TRUE);
        Integer liked = this.$news.getLiked();
        this.$news.setLiked(Integer.valueOf((liked != null ? liked.intValue() : 0) + 1));
        view = this.this$0.f91321g;
        if (view != null) {
            view.onRefreshLike(this.$news, this.$position, this.$viewHolder);
        }
    }
}