package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.device_sale.OneCheckBlacklistSharingResponse;
import th.p047co.dtac.android.dtacone.model.blacklist.CheckBlacklistSharingResponse;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.repository.OnePostpaidRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/appOne/device_sale/OneCheckBlacklistSharingResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePostpaidRegistrationViewModel$callAPICheckBlacklistSharing$3 */
/* loaded from: classes10.dex */
public final class OnePostpaidRegistrationViewModel$callAPICheckBlacklistSharing$3 extends Lambda implements Function1<OneCheckBlacklistSharingResponse, Unit> {
    final /* synthetic */ OnePostpaidRegistrationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePostpaidRegistrationViewModel$callAPICheckBlacklistSharing$3(OnePostpaidRegistrationViewModel onePostpaidRegistrationViewModel) {
        super(1);
        this.this$0 = onePostpaidRegistrationViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneCheckBlacklistSharingResponse oneCheckBlacklistSharingResponse) {
        invoke2(oneCheckBlacklistSharingResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneCheckBlacklistSharingResponse oneCheckBlacklistSharingResponse) {
        OnePostpaidRepository onePostpaidRepository;
        MutableLiveData m11691M1;
        onePostpaidRepository = this.this$0.f94609b;
        CheckBlacklistSharingResponse data = oneCheckBlacklistSharingResponse.getData();
        onePostpaidRepository.setBlacklistSharingStatus((data == null || (r1 = data.getResult()) == null) ? "" : "");
        CheckBlacklistSharingResponse data2 = oneCheckBlacklistSharingResponse.getData();
        if (!Intrinsics.areEqual(data2 != null ? data2.getResult() : null, "00")) {
            this.this$0.m11692M0();
            return;
        }
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
        m11691M1 = this.this$0.m11691M1();
        m11691M1.postValue(Resource.Companion.success(null));
    }
}