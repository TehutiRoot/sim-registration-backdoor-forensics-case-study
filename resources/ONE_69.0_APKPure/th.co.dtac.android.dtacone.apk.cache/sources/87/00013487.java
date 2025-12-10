package th.p047co.dtac.android.dtacone.view.appOne.news.activity;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.app_one.model.newsFeed.OneNewsItem;
import th.p047co.dtac.android.dtacone.view.appOne.home.viewModel.OneNewsFeedViewModel;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.news.activity.OnePostMoreDetailActivity$setActionLike$1 */
/* loaded from: classes10.dex */
public final class OnePostMoreDetailActivity$setActionLike$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ OnePostMoreDetailActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePostMoreDetailActivity$setActionLike$1(OnePostMoreDetailActivity onePostMoreDetailActivity) {
        super(0);
        this.this$0 = onePostMoreDetailActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        boolean z;
        int i;
        boolean z2;
        int i2;
        boolean z3;
        z = this.this$0.f92436s;
        if (z) {
            OneNewsFeedViewModel viewModelNewsFeed = this.this$0.getViewModelNewsFeed();
            i2 = this.this$0.f92437t;
            z3 = this.this$0.f92436s;
            viewModelNewsFeed.unlike(new OneNewsItem(null, Boolean.valueOf(z3), null, null, null, null, null, null, null, null, null, Integer.valueOf(i2), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 1073739773, null), 0, null);
            return;
        }
        OneNewsFeedViewModel viewModelNewsFeed2 = this.this$0.getViewModelNewsFeed();
        i = this.this$0.f92437t;
        z2 = this.this$0.f92436s;
        viewModelNewsFeed2.like(new OneNewsItem(null, Boolean.valueOf(z2), null, null, null, null, null, null, null, null, null, Integer.valueOf(i), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 1073739773, null), 0, null);
    }
}