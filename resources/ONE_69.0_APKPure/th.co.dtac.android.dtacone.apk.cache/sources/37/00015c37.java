package th.p047co.dtac.android.dtacone.widget.compose.consent;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelco;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.widget.compose.consent.ConsentTmnScreenKt$ConsentTmnScreen$5$1 */
/* loaded from: classes9.dex */
public final class ConsentTmnScreenKt$ConsentTmnScreen$5$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ MutableState<ConsentNonTelco> $consent$delegate;
    final /* synthetic */ Function1<ConsentNonTelco, Unit> $onDecline;
    final /* synthetic */ MutableState<Boolean> $showConfirmDialog$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConsentTmnScreenKt$ConsentTmnScreen$5$1(Function1<? super ConsentNonTelco, Unit> function1, MutableState<ConsentNonTelco> mutableState, MutableState<Boolean> mutableState2) {
        super(0);
        this.$onDecline = function1;
        this.$consent$delegate = mutableState;
        this.$showConfirmDialog$delegate = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ConsentNonTelco m1777e;
        Function1<ConsentNonTelco, Unit> function1 = this.$onDecline;
        m1777e = ConsentTmnScreenKt.m1777e(this.$consent$delegate);
        Intrinsics.checkNotNull(m1777e);
        function1.invoke(m1777e);
        ConsentTmnScreenKt.m1778d(this.$showConfirmDialog$delegate, false);
    }
}