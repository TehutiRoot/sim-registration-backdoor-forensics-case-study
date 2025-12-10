package th.p047co.dtac.android.dtacone.view.appOne.home.viewModel;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.app_one.model.newsFeed.OneNewsFeedResponse;
import th.p047co.dtac.android.dtacone.app_one.model.newsFeed.OneNewsItem;
import th.p047co.dtac.android.dtacone.view.appOne.home.viewModel.OneNewsFeedViewModel;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "newsFeed", "Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneNewsFeedResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.home.viewModel.OneNewsFeedViewModel$getOneNewsFeed$2 */
/* loaded from: classes10.dex */
public final class OneNewsFeedViewModel$getOneNewsFeed$2 extends Lambda implements Function1<OneNewsFeedResponse, Unit> {
    final /* synthetic */ OneNewsFeedViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneNewsFeedViewModel$getOneNewsFeed$2(OneNewsFeedViewModel oneNewsFeedViewModel) {
        super(1);
        this.this$0 = oneNewsFeedViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneNewsFeedResponse oneNewsFeedResponse) {
        invoke2(oneNewsFeedResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneNewsFeedResponse oneNewsFeedResponse) {
        OneNewsFeedViewModel.View view;
        this.this$0.m14007y();
        view = this.this$0.f91321g;
        if (view != null) {
            List<OneNewsItem> newList = oneNewsFeedResponse.getNewList();
            if (newList == null) {
                newList = CollectionsKt__CollectionsKt.emptyList();
            }
            view.getNewsFeedSuccess(newList);
        }
    }
}