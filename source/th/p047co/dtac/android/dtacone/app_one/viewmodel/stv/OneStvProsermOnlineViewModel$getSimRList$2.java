package th.p047co.dtac.android.dtacone.app_one.viewmodel.stv;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.app_one.model.stv.SimRCollectionResponse;
import th.p047co.dtac.android.dtacone.app_one.repository.OneStvRepository;
import th.p047co.dtac.android.dtacone.model.StatusResource;

@Metadata(m28851d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28850d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/app_one/model/stv/SimRCollectionResponse;", "kotlin.jvm.PlatformType", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.viewmodel.stv.OneStvProsermOnlineViewModel$getSimRList$2 */
/* loaded from: classes7.dex */
public final class OneStvProsermOnlineViewModel$getSimRList$2 extends Lambda implements Function1<SimRCollectionResponse, Unit> {
    final /* synthetic */ OneStvProsermOnlineViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneStvProsermOnlineViewModel$getSimRList$2(OneStvProsermOnlineViewModel oneStvProsermOnlineViewModel) {
        super(1);
        this.this$0 = oneStvProsermOnlineViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SimRCollectionResponse simRCollectionResponse) {
        invoke2(simRCollectionResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(SimRCollectionResponse simRCollectionResponse) {
        OneStvRepository oneStvRepository;
        this.this$0.isRefreshing().setValue(StatusResource.SUCCESS);
        oneStvRepository = this.this$0.f82681b;
        oneStvRepository.setSimRCollection(simRCollectionResponse);
    }
}
