package th.p047co.dtac.android.dtacone.presenter.home;

import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import th.p047co.dtac.android.dtacone.model.home.groupService.response.GroupServiceItem;
import th.p047co.dtac.android.dtacone.model.home.homeDetail.HomeDetailResponse;
import th.p047co.dtac.android.dtacone.presenter.home.HomePresenter;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/home/homeDetail/HomeDetailResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nHomePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomePresenter.kt\nth/co/dtac/android/dtacone/presenter/home/HomePresenter$getCurrentBalanceAndStaffDetailAndGroupMenu$5\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,325:1\n1855#2,2:326\n*S KotlinDebug\n*F\n+ 1 HomePresenter.kt\nth/co/dtac/android/dtacone/presenter/home/HomePresenter$getCurrentBalanceAndStaffDetailAndGroupMenu$5\n*L\n248#1:326,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.presenter.home.HomePresenter$getCurrentBalanceAndStaffDetailAndGroupMenu$5 */
/* loaded from: classes8.dex */
public final class HomePresenter$getCurrentBalanceAndStaffDetailAndGroupMenu$5 extends Lambda implements Function1<HomeDetailResponse, Unit> {
    final /* synthetic */ HomePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomePresenter$getCurrentBalanceAndStaffDetailAndGroupMenu$5(HomePresenter homePresenter) {
        super(1);
        this.this$0 = homePresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(HomeDetailResponse homeDetailResponse) {
        invoke2(homeDetailResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(HomeDetailResponse homeDetailResponse) {
        HomePresenter.View view;
        HomePresenter.View view2;
        HomePresenter.View view3;
        HomePresenter.View view4;
        HomePresenter.View view5;
        HomePresenter.View view6;
        String balance = homeDetailResponse.getBalance().getBalance();
        HomePresenter.View view7 = null;
        if (balance == null || balance.length() == 0) {
            view = this.this$0.f85839f;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
                view = null;
            }
            view.onGetCurrentBalanceFailed();
        } else {
            view6 = this.this$0.f85839f;
            if (view6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
                view6 = null;
            }
            view6.onGetCurrentBalanceSuccess(homeDetailResponse.getBalance());
        }
        List<GroupServiceItem> groupServiceList = homeDetailResponse.getGroupServiceList();
        if (groupServiceList == null || groupServiceList.isEmpty()) {
            view2 = this.this$0.f85839f;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
                view2 = null;
            }
            view2.onGetHomeGroupMenuFailed();
        } else {
            ArrayList arrayList = new ArrayList();
            for (GroupServiceItem groupServiceItem : homeDetailResponse.getGroupServiceList()) {
                arrayList.add(new GroupServiceItem(groupServiceItem.getGroupOrder(), new ArrayList(), groupServiceItem.getTitle()));
                arrayList.add(groupServiceItem);
            }
            view5 = this.this$0.f85839f;
            if (view5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
                view5 = null;
            }
            view5.onGetHomeGroupMenuSuccess(arrayList);
        }
        String name = homeDetailResponse.getStaffDetail().getName();
        if (name == null || name.length() == 0) {
            view3 = this.this$0.f85839f;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            } else {
                view7 = view3;
            }
            view7.onGetStaffDetailFailed();
            return;
        }
        view4 = this.this$0.f85839f;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
        } else {
            view7 = view4;
        }
        view7.onGetStaffDetailSuccess(homeDetailResponse.getStaffDetail());
    }
}