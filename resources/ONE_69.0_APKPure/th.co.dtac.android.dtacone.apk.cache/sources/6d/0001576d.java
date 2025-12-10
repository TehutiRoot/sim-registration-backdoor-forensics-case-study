package th.p047co.dtac.android.dtacone.viewmodel.home;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.home.homeDetail.HomeDetailResponse;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "resp", "Lth/co/dtac/android/dtacone/model/home/homeDetail/HomeDetailResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.home.HomeViewModel$oneGetCurrentBalanceAndStaffDetailAndGroupMenu$3 */
/* loaded from: classes9.dex */
public final class HomeViewModel$oneGetCurrentBalanceAndStaffDetailAndGroupMenu$3 extends Lambda implements Function1<HomeDetailResponse, Unit> {
    final /* synthetic */ HomeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$oneGetCurrentBalanceAndStaffDetailAndGroupMenu$3(HomeViewModel homeViewModel) {
        super(1);
        this.this$0 = homeViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(HomeDetailResponse homeDetailResponse) {
        invoke2(homeDetailResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(HomeDetailResponse homeDetailResponse) {
        MutableLiveData m2600D;
        MutableLiveData m2578v;
        MutableLiveData m2600D2;
        String name = homeDetailResponse.getStaffDetail().getName();
        if (name == null || name.length() == 0) {
            m2600D = this.this$0.m2600D();
            m2600D.setValue(Resource.Companion.error$default(Resource.Companion, "", null, null, 4, null));
        } else {
            m2600D2 = this.this$0.m2600D();
            m2600D2.setValue(Resource.Companion.success(homeDetailResponse.getStaffDetail()));
        }
        m2578v = this.this$0.m2578v();
        m2578v.setValue(Resource.Companion.success(homeDetailResponse.getGroupServiceList()));
    }
}