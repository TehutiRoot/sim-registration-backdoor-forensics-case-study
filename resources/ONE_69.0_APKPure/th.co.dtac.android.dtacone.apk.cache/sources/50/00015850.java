package th.p047co.dtac.android.dtacone.viewmodel.mrtr_change_sim;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.esim.SendQRCodeRequest;
import th.p047co.dtac.android.dtacone.model.esim.SendQRCodeResponse;
import th.p047co.dtac.android.dtacone.util.Constant;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/esim/SendQRCodeResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_change_sim.MrtrChangeSimViewModel$sendQRCode$4 */
/* loaded from: classes9.dex */
public final class MrtrChangeSimViewModel$sendQRCode$4 extends Lambda implements Function1<SendQRCodeResponse, Unit> {
    final /* synthetic */ String $type;
    final /* synthetic */ String $value;
    final /* synthetic */ MrtrChangeSimViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrChangeSimViewModel$sendQRCode$4(MrtrChangeSimViewModel mrtrChangeSimViewModel, String str, String str2) {
        super(1);
        this.this$0 = mrtrChangeSimViewModel;
        this.$type = str;
        this.$value = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SendQRCodeResponse sendQRCodeResponse) {
        invoke2(sendQRCodeResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(SendQRCodeResponse sendQRCodeResponse) {
        MutableLiveData m2415B;
        m2415B = this.this$0.m2415B();
        Resource.Companion companion = Resource.Companion;
        String str = Intrinsics.areEqual(this.$type, "email") ? this.$value : "";
        String str2 = this.$type;
        m2415B.setValue(companion.success(new SendQRCodeRequest(null, null, null, null, null, str, str2, Intrinsics.areEqual(str2, Constant.SendQRType.mms) ? this.$value : "", 31, null)));
    }
}