package th.p047co.dtac.android.dtacone.viewmodel.mrtr_change_sim;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.repository.mrtr_change_sim.MrtrChangeSimRepository;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_change_sim.MrtrChangeSimViewModel$getAuthorizationByRTR$1 */
/* loaded from: classes9.dex */
public final class MrtrChangeSimViewModel$getAuthorizationByRTR$1 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ MrtrChangeSimViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrChangeSimViewModel$getAuthorizationByRTR$1(MrtrChangeSimViewModel mrtrChangeSimViewModel) {
        super(1);
        this.this$0 = mrtrChangeSimViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Throwable it) {
        MrtrChangeSimRepository mrtrChangeSimRepository;
        MrtrChangeSimRepository mrtrChangeSimRepository2;
        Intrinsics.checkNotNullParameter(it, "it");
        mrtrChangeSimRepository = this.this$0.f106258b;
        mrtrChangeSimRepository.setRequireFaceRecognition(false);
        mrtrChangeSimRepository2 = this.this$0.f106258b;
        mrtrChangeSimRepository2.setCheckSimStock(false);
        this.this$0.m2395l();
    }
}