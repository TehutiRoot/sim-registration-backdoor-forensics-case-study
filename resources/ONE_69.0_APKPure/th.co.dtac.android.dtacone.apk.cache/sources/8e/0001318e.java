package th.p047co.dtac.android.dtacone.view.appOne.home.viewModel;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.home.homeDetail.HomeDetailResponse;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "resp", "Lth/co/dtac/android/dtacone/model/home/homeDetail/HomeDetailResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.home.viewModel.OneHomeViewModel$oneGetCurrentBalanceAndStaffDetailAndGroupMenu$3 */
/* loaded from: classes10.dex */
public final class C14730xbea6b008 extends Lambda implements Function1<HomeDetailResponse, Unit> {
    final /* synthetic */ OneHomeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14730xbea6b008(OneHomeViewModel oneHomeViewModel) {
        super(1);
        this.this$0 = oneHomeViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(HomeDetailResponse homeDetailResponse) {
        invoke2(homeDetailResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(HomeDetailResponse homeDetailResponse) {
        MutableLiveData m14059W;
        MutableLiveData m14068N;
        MutableLiveData m14059W2;
        String name = homeDetailResponse.getStaffDetail().getName();
        if (name == null || name.length() == 0) {
            m14059W = this.this$0.m14059W();
            m14059W.setValue(Resource.Companion.error$default(Resource.Companion, "", null, null, 4, null));
        } else {
            m14059W2 = this.this$0.m14059W();
            m14059W2.setValue(Resource.Companion.success(homeDetailResponse.getStaffDetail()));
        }
        m14068N = this.this$0.m14068N();
        m14068N.setValue(Resource.Companion.success(homeDetailResponse.getGroupServiceList()));
    }
}