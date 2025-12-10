package th.p047co.dtac.android.dtacone.view.fragment.mrtr_mnp;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.mrtr_mnp.check_sim_info.response.MnpCheckSimInfoResponse;
import th.p047co.dtac.android.dtacone.view.activity.mrtr_mnp.MrtrMnpActivity;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/model/mrtr_mnp/check_sim_info/response/MnpCheckSimInfoResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_mnp.MrtrMnpScanSimFragment$setupViewModel$1$2 */
/* loaded from: classes9.dex */
public final class MrtrMnpScanSimFragment$setupViewModel$1$2 extends Lambda implements Function1<Resource<? extends MnpCheckSimInfoResponse>, Unit> {
    final /* synthetic */ MrtrMnpScanSimFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrMnpScanSimFragment$setupViewModel$1$2(MrtrMnpScanSimFragment mrtrMnpScanSimFragment) {
        super(1);
        this.this$0 = mrtrMnpScanSimFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends MnpCheckSimInfoResponse> resource) {
        invoke2((Resource<MnpCheckSimInfoResponse>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<MnpCheckSimInfoResponse> resource) {
        Resource<MnpCheckSimInfoResponse> resourceContentIfNotHandled;
        MrtrMnpActivity m6151p;
        if (resource == null || (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) == null) {
            return;
        }
        MrtrMnpScanSimFragment mrtrMnpScanSimFragment = this.this$0;
        if (resourceContentIfNotHandled.getStatus() != StatusResource.SUCCESS || resourceContentIfNotHandled.getData() == null) {
            return;
        }
        m6151p = mrtrMnpScanSimFragment.m6151p();
        if (m6151p.getMrtrMnpViewModel().getCheckSimInfoResponse() != null) {
            mrtrMnpScanSimFragment.gotoNext();
        }
    }
}