package th.p047co.dtac.android.dtacone.view.appOne.home.viewModel;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.topup.BalanceCollection;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "resp", "Lth/co/dtac/android/dtacone/model/topup/BalanceCollection;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.home.viewModel.OneHomeViewModel$getCurrentBalance$2 */
/* loaded from: classes10.dex */
public final class OneHomeViewModel$getCurrentBalance$2 extends Lambda implements Function1<BalanceCollection, Unit> {
    final /* synthetic */ OneHomeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneHomeViewModel$getCurrentBalance$2(OneHomeViewModel oneHomeViewModel) {
        super(1);
        this.this$0 = oneHomeViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(BalanceCollection balanceCollection) {
        invoke2(balanceCollection);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(BalanceCollection balanceCollection) {
        MutableLiveData m14071K;
        m14071K = this.this$0.m14071K();
        m14071K.setValue(Resource.Companion.success(balanceCollection));
    }
}