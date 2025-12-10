package th.p047co.dtac.android.dtacone.viewmodel.esim;

import com.zxy.tiny.common.UriUtil;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.mrtr_change_sim.verify.response.MrtrChangeSimVerifyResponse;
import th.p047co.dtac.android.dtacone.repository.esim.ESimRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", UriUtil.LOCAL_RESOURCE_SCHEME, "Lth/co/dtac/android/dtacone/model/mrtr_change_sim/verify/response/MrtrChangeSimVerifyResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.esim.ESimViewModel$verifySimCard$2 */
/* loaded from: classes9.dex */
public final class ESimViewModel$verifySimCard$2 extends Lambda implements Function1<MrtrChangeSimVerifyResponse, Unit> {
    final /* synthetic */ String $newSimCardNumber;
    final /* synthetic */ ESimViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ESimViewModel$verifySimCard$2(ESimViewModel eSimViewModel, String str) {
        super(1);
        this.this$0 = eSimViewModel;
        this.$newSimCardNumber = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(MrtrChangeSimVerifyResponse mrtrChangeSimVerifyResponse) {
        invoke2(mrtrChangeSimVerifyResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(MrtrChangeSimVerifyResponse mrtrChangeSimVerifyResponse) {
        ESimRepository eSimRepository;
        ESimRepository eSimRepository2;
        eSimRepository = this.this$0.f105820b;
        eSimRepository.setVerifyResponse(mrtrChangeSimVerifyResponse);
        eSimRepository2 = this.this$0.f105820b;
        if (eSimRepository2.isCheckSimStock()) {
            this.this$0.checkSimStock(this.$newSimCardNumber);
        } else {
            this.this$0.uploadImagePhysical();
        }
    }
}