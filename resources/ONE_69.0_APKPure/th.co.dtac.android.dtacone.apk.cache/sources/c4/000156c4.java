package th.p047co.dtac.android.dtacone.viewmodel.esim;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.esim.SimCardNumberResponse;
import th.p047co.dtac.android.dtacone.repository.esim.ESimRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/esim/SimCardNumberResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nESimViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ESimViewModel.kt\nth/co/dtac/android/dtacone/viewmodel/esim/ESimViewModel$getSimCardNumber$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3149:1\n1#2:3150\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.viewmodel.esim.ESimViewModel$getSimCardNumber$3 */
/* loaded from: classes9.dex */
public final class ESimViewModel$getSimCardNumber$3 extends Lambda implements Function1<SimCardNumberResponse, Unit> {
    final /* synthetic */ ESimViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ESimViewModel$getSimCardNumber$3(ESimViewModel eSimViewModel) {
        super(1);
        this.this$0 = eSimViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SimCardNumberResponse simCardNumberResponse) {
        invoke2(simCardNumberResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(SimCardNumberResponse simCardNumberResponse) {
        MutableLiveData m2683x0;
        ESimRepository eSimRepository;
        String simCardNumber = simCardNumberResponse.getSimCardNumber();
        if (simCardNumber != null) {
            eSimRepository = this.this$0.f105820b;
            eSimRepository.setSimCardNumber(simCardNumber);
        }
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
        m2683x0 = this.this$0.m2683x0();
        m2683x0.setValue(Resource.Companion.success(simCardNumberResponse));
    }
}