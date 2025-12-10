package th.p047co.dtac.android.dtacone.viewmodel.change_sim;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.change_sim.ChangeSimRequestVerifyReason;
import th.p047co.dtac.android.dtacone.model.change_sim.ChangeSimResponseVerifyReason;
import th.p047co.dtac.android.dtacone.model.mnp.IdCardInformationCollection;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimResponseVerifyReason;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.change_sim.ChangeSimVerifyReasonViewModel$verifyReasonChangeSimWithFace$5 */
/* loaded from: classes9.dex */
public final class ChangeSimVerifyReasonViewModel$verifyReasonChangeSimWithFace$5 extends Lambda implements Function1<ChangeSimResponseVerifyReason, Unit> {
    final /* synthetic */ IdCardInformationCollection $idCardData;
    final /* synthetic */ ChangeSimRequestVerifyReason $reasonRequest;
    final /* synthetic */ ChangeSimVerifyReasonViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangeSimVerifyReasonViewModel$verifyReasonChangeSimWithFace$5(ChangeSimVerifyReasonViewModel changeSimVerifyReasonViewModel, IdCardInformationCollection idCardInformationCollection, ChangeSimRequestVerifyReason changeSimRequestVerifyReason) {
        super(1);
        this.this$0 = changeSimVerifyReasonViewModel;
        this.$idCardData = idCardInformationCollection;
        this.$reasonRequest = changeSimRequestVerifyReason;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ChangeSimResponseVerifyReason changeSimResponseVerifyReason) {
        invoke2(changeSimResponseVerifyReason);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ChangeSimResponseVerifyReason changeSimResponseVerifyReason) {
        MutableLiveData m3277n;
        MutableLiveData m3276o;
        MutableLiveData m3275p;
        m3277n = this.this$0.m3277n();
        m3277n.setValue(this.$idCardData);
        m3276o = this.this$0.m3276o();
        m3276o.setValue(this.$reasonRequest);
        m3275p = this.this$0.m3275p();
        m3275p.setValue(Resource.Companion.success(changeSimResponseVerifyReason));
    }
}