package th.p047co.dtac.android.dtacone.view.fragment.eSIM;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.esim.ESIMNumberResponse;
import th.p047co.dtac.android.dtacone.view.activity.eSIM.ESimActivity;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/model/esim/ESIMNumberResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.eSIM.ESimSelectTypeFragment$initView$1$1 */
/* loaded from: classes9.dex */
public final class ESimSelectTypeFragment$initView$1$1 extends Lambda implements Function1<Resource<? extends ESIMNumberResponse>, Unit> {
    final /* synthetic */ ESimSelectTypeFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ESimSelectTypeFragment$initView$1$1(ESimSelectTypeFragment eSimSelectTypeFragment) {
        super(1);
        this.this$0 = eSimSelectTypeFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends ESIMNumberResponse> resource) {
        invoke2((Resource<ESIMNumberResponse>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<ESIMNumberResponse> resource) {
        Resource<ESIMNumberResponse> resourceContentIfNotHandled;
        ESimActivity m7704o;
        if (resource == null || (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) == null) {
            return;
        }
        ESimSelectTypeFragment eSimSelectTypeFragment = this.this$0;
        if (resourceContentIfNotHandled.getStatus() == StatusResource.SUCCESS) {
            m7704o = eSimSelectTypeFragment.m7704o();
            m7704o.replaceFragment(ESimSelectNumberFragment.Companion.newInstance(), ESimSelectNumberFragment.TAG);
        }
    }
}