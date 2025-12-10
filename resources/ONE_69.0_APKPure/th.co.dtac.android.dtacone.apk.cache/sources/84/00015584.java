package th.p047co.dtac.android.dtacone.viewmodel.device_sale;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.device_sale.CheckExternalBlacklistFlagResponse;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/device_sale/CheckExternalBlacklistFlagResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.device_sale.DeviceSaleViewModel$callAPICheckExternalBlacklistFlag$3 */
/* loaded from: classes9.dex */
public final class DeviceSaleViewModel$callAPICheckExternalBlacklistFlag$3 extends Lambda implements Function1<CheckExternalBlacklistFlagResponse, Unit> {
    final /* synthetic */ DeviceSaleViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceSaleViewModel$callAPICheckExternalBlacklistFlag$3(DeviceSaleViewModel deviceSaleViewModel) {
        super(1);
        this.this$0 = deviceSaleViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CheckExternalBlacklistFlagResponse checkExternalBlacklistFlagResponse) {
        invoke2(checkExternalBlacklistFlagResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(CheckExternalBlacklistFlagResponse checkExternalBlacklistFlagResponse) {
        MutableLiveData m3000I0;
        MutableLiveData m2926n0;
        if (Intrinsics.areEqual(checkExternalBlacklistFlagResponse.getBlacklistFlag(), "Y")) {
            this.this$0.m3001I();
            return;
        }
        m3000I0 = this.this$0.m3000I0();
        Resource.Companion companion = Resource.Companion;
        m3000I0.setValue(companion.success(null));
        m2926n0 = this.this$0.m2926n0();
        m2926n0.setValue(companion.success(null));
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
    }
}