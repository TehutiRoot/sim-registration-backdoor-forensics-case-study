package th.p047co.dtac.android.dtacone.presenter.sim_r;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.SimRCollection;
import th.p047co.dtac.android.dtacone.presenter.sim_r.SimRListPresenter;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/SimRCollection;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.sim_r.SimRListPresenter$getSimRList$4 */
/* loaded from: classes8.dex */
public final class SimRListPresenter$getSimRList$4 extends Lambda implements Function1<SimRCollection, Unit> {
    final /* synthetic */ SimRListPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimRListPresenter$getSimRList$4(SimRListPresenter simRListPresenter) {
        super(1);
        this.this$0 = simRListPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SimRCollection simRCollection) {
        invoke2(simRCollection);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(SimRCollection it) {
        SimRListPresenter.View view = this.this$0.getView();
        Intrinsics.checkNotNullExpressionValue(it, "it");
        view.onSimRListSuccess(it);
    }
}