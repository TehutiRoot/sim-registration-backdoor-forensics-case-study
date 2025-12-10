package th.p047co.dtac.android.dtacone.viewmodel.mrtr_pre2post;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.device_sale.Check1IDXDeviceResponse;
import th.p047co.dtac.android.dtacone.repository.mrtr_pre2post.MrtrPre2PostRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/device_sale/Check1IDXDeviceResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_pre2post.MrtrPre2PostViewModel$check1IDXDevice$2 */
/* loaded from: classes9.dex */
public final class MrtrPre2PostViewModel$check1IDXDevice$2 extends Lambda implements Function1<Check1IDXDeviceResponse, Unit> {
    final /* synthetic */ MrtrPre2PostViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPre2PostViewModel$check1IDXDevice$2(MrtrPre2PostViewModel mrtrPre2PostViewModel) {
        super(1);
        this.this$0 = mrtrPre2PostViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Check1IDXDeviceResponse check1IDXDeviceResponse) {
        invoke2(check1IDXDeviceResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Check1IDXDeviceResponse check1IDXDeviceResponse) {
        MrtrPre2PostRepository mrtrPre2PostRepository;
        MutableLiveData m2137q0;
        MutableLiveData m2145m0;
        mrtrPre2PostRepository = this.this$0.f106609c;
        mrtrPre2PostRepository.setCanBuyDeviceWithContract(check1IDXDeviceResponse.getCanBuyDeviceWithContract());
        if (Intrinsics.areEqual(check1IDXDeviceResponse.getCanBuyDeviceWithContract(), "N")) {
            m2145m0 = this.this$0.m2145m0();
            m2145m0.setValue(Resource.Companion.success(check1IDXDeviceResponse));
            return;
        }
        m2137q0 = this.this$0.m2137q0();
        m2137q0.setValue(Resource.Companion.success(check1IDXDeviceResponse));
    }
}