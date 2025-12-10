package th.p047co.dtac.android.dtacone.presenter.home;

import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import th.p047co.dtac.android.dtacone.model.home.groupService.response.GroupServiceItem;
import th.p047co.dtac.android.dtacone.model.topup.BalanceCollection;
import th.p047co.dtac.android.dtacone.presenter.home.HomePresenter;

@Metadata(m29143d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000122\u0010\u0002\u001a.\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005 \u0007*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m29142d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "Lth/co/dtac/android/dtacone/model/topup/BalanceCollection;", "", "Lth/co/dtac/android/dtacone/model/home/groupService/response/GroupServiceItem;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nHomePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomePresenter.kt\nth/co/dtac/android/dtacone/presenter/home/HomePresenter$getCurrentBalanceAndGroupMenuRefresh$6\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,325:1\n1855#2,2:326\n*S KotlinDebug\n*F\n+ 1 HomePresenter.kt\nth/co/dtac/android/dtacone/presenter/home/HomePresenter$getCurrentBalanceAndGroupMenuRefresh$6\n*L\n161#1:326,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.presenter.home.HomePresenter$getCurrentBalanceAndGroupMenuRefresh$6 */
/* loaded from: classes8.dex */
public final class HomePresenter$getCurrentBalanceAndGroupMenuRefresh$6 extends Lambda implements Function1<Pair<? extends BalanceCollection, ? extends List<? extends GroupServiceItem>>, Unit> {
    final /* synthetic */ HomePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomePresenter$getCurrentBalanceAndGroupMenuRefresh$6(HomePresenter homePresenter) {
        super(1);
        this.this$0 = homePresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends BalanceCollection, ? extends List<? extends GroupServiceItem>> pair) {
        invoke2((Pair<? extends BalanceCollection, ? extends List<GroupServiceItem>>) pair);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Pair<? extends BalanceCollection, ? extends List<GroupServiceItem>> pair) {
        HomePresenter.View view;
        HomePresenter.View view2;
        HomePresenter.View view3;
        HomePresenter.View view4;
        String balance = pair.getFirst().getBalance();
        HomePresenter.View view5 = 0;
        if (balance == null || balance.length() == 0) {
            view = this.this$0.f85839f;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
                view = null;
            }
            view.onGetCurrentBalanceFailed();
        } else {
            view4 = this.this$0.f85839f;
            if (view4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
                view4 = null;
            }
            view4.onGetCurrentBalanceSuccess(pair.getFirst());
        }
        List<GroupServiceItem> second = pair.getSecond();
        if (second == null || second.isEmpty()) {
            view2 = this.this$0.f85839f;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            } else {
                view5 = view2;
            }
            view5.onGetHomeGroupMenuFailed();
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (GroupServiceItem groupServiceItem : pair.getSecond()) {
            arrayList.add(new GroupServiceItem(groupServiceItem.getGroupOrder(), new ArrayList(), groupServiceItem.getTitle()));
            arrayList.add(groupServiceItem);
        }
        view3 = this.this$0.f85839f;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
        } else {
            view5 = view3;
        }
        view5.onGetHomeGroupMenuSuccess(arrayList);
    }
}