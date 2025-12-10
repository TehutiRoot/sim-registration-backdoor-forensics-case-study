package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Event;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.device_sale.OneExtraAdvanceMasterResponse;
import th.p047co.dtac.android.dtacone.model.livedata.FragmentNavEvent;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.blacklist.OnePostpaidCheckBlacklistAdditionalAdvanceFragment;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.repository.OnePostpaidRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "response", "Lth/co/dtac/android/dtacone/model/appOne/device_sale/OneExtraAdvanceMasterResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePostpaidRegistrationViewModel$getExtraAdvanceMasterT$3 */
/* loaded from: classes10.dex */
public final class OnePostpaidRegistrationViewModel$getExtraAdvanceMasterT$3 extends Lambda implements Function1<OneExtraAdvanceMasterResponse, Unit> {
    final /* synthetic */ Function1<String, Unit> $onExtraAdvanceMasterCallback;
    final /* synthetic */ OnePostpaidRegistrationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OnePostpaidRegistrationViewModel$getExtraAdvanceMasterT$3(OnePostpaidRegistrationViewModel onePostpaidRegistrationViewModel, Function1<? super String, Unit> function1) {
        super(1);
        this.this$0 = onePostpaidRegistrationViewModel;
        this.$onExtraAdvanceMasterCallback = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneExtraAdvanceMasterResponse oneExtraAdvanceMasterResponse) {
        invoke2(oneExtraAdvanceMasterResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneExtraAdvanceMasterResponse oneExtraAdvanceMasterResponse) {
        MutableLiveData m11659U1;
        OnePostpaidRepository onePostpaidRepository;
        MutableLiveData m11590j2;
        m11659U1 = this.this$0.m11659U1();
        m11659U1.setValue(Resource.Companion.success(oneExtraAdvanceMasterResponse));
        this.this$0.getLiveDataState().setValue(StatusResource.SUCCESS);
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
        if (this.this$0.getSkipReserveList()) {
            m11590j2 = this.this$0.m11590j2();
            m11590j2.setValue(new Event(new FragmentNavEvent(OnePostpaidCheckBlacklistAdditionalAdvanceFragment.class, null, null, 4, null)));
            return;
        }
        Function1<String, Unit> function1 = this.$onExtraAdvanceMasterCallback;
        if (function1 != null) {
            onePostpaidRepository = this.this$0.f94609b;
            String statusColor = onePostpaidRepository.getStatusColor();
            if (statusColor == null) {
                statusColor = "YELLOW";
            }
            function1.invoke(statusColor);
        }
    }
}