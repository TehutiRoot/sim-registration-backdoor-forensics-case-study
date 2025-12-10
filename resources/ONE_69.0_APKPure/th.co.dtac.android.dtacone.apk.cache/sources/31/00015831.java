package th.p047co.dtac.android.dtacone.viewmodel.mrtr_change_sim;

import androidx.lifecycle.MutableLiveData;
import com.zxy.tiny.common.UriUtil;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.esim.AutoTransferEsimResponse;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", UriUtil.LOCAL_RESOURCE_SCHEME, "Lth/co/dtac/android/dtacone/model/esim/AutoTransferEsimResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_change_sim.MrtrChangeSimViewModel$autoTransferESim$2 */
/* loaded from: classes9.dex */
public final class MrtrChangeSimViewModel$autoTransferESim$2 extends Lambda implements Function1<AutoTransferEsimResponse, Unit> {
    final /* synthetic */ String $newSimCardNumber;
    final /* synthetic */ MrtrChangeSimViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrChangeSimViewModel$autoTransferESim$2(MrtrChangeSimViewModel mrtrChangeSimViewModel, String str) {
        super(1);
        this.this$0 = mrtrChangeSimViewModel;
        this.$newSimCardNumber = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AutoTransferEsimResponse autoTransferEsimResponse) {
        invoke2(autoTransferEsimResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(AutoTransferEsimResponse autoTransferEsimResponse) {
        MutableLiveData m2416A;
        this.this$0.setAutoTransferEsimResponse(autoTransferEsimResponse);
        m2416A = this.this$0.m2416A();
        m2416A.postValue(Resource.Companion.success("onNext"));
        this.this$0.m2406K(this.$newSimCardNumber);
    }
}