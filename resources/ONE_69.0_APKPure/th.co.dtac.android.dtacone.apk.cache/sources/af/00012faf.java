package th.p047co.dtac.android.dtacone.view.appOne.device_sale.viewmodel;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.device_sale.OneCheckExternalBlacklistFlagResponse;
import th.p047co.dtac.android.dtacone.model.device_sale.CheckExternalBlacklistFlagResponse;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/appOne/device_sale/OneCheckExternalBlacklistFlagResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.viewmodel.OneDeviceSaleViewModel$callAPICheckExternalBlacklistFlag$3 */
/* loaded from: classes10.dex */
public final class OneDeviceSaleViewModel$callAPICheckExternalBlacklistFlag$3 extends Lambda implements Function1<OneCheckExternalBlacklistFlagResponse, Unit> {
    final /* synthetic */ OneDeviceSaleViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDeviceSaleViewModel$callAPICheckExternalBlacklistFlag$3(OneDeviceSaleViewModel oneDeviceSaleViewModel) {
        super(1);
        this.this$0 = oneDeviceSaleViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneCheckExternalBlacklistFlagResponse oneCheckExternalBlacklistFlagResponse) {
        invoke2(oneCheckExternalBlacklistFlagResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneCheckExternalBlacklistFlagResponse oneCheckExternalBlacklistFlagResponse) {
        MutableLiveData m14364m0;
        MutableLiveData m14392W;
        CheckExternalBlacklistFlagResponse data = oneCheckExternalBlacklistFlagResponse.getData();
        if (Intrinsics.areEqual(data != null ? data.getBlacklistFlag() : null, "Y")) {
            this.this$0.m14339z();
            return;
        }
        m14364m0 = this.this$0.m14364m0();
        Resource.Companion companion = Resource.Companion;
        m14364m0.setValue(companion.success(null));
        m14392W = this.this$0.m14392W();
        m14392W.setValue(companion.success(null));
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
    }
}