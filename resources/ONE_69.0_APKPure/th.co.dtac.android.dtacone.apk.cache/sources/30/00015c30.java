package th.p047co.dtac.android.dtacone.widget.compose.consent;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelco;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.widget.compose.consent.ConsentTmnScreenKt$ConsentSection$1$3 */
/* loaded from: classes9.dex */
public final class ConsentTmnScreenKt$ConsentSection$1$3 extends Lambda implements Function0<Unit> {
    final /* synthetic */ ConsentNonTelco $consent;
    final /* synthetic */ Function1<ConsentNonTelco, Unit> $onDecline;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConsentTmnScreenKt$ConsentSection$1$3(Function1<? super ConsentNonTelco, Unit> function1, ConsentNonTelco consentNonTelco) {
        super(0);
        this.$onDecline = function1;
        this.$consent = consentNonTelco;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Function1<ConsentNonTelco, Unit> function1 = this.$onDecline;
        ConsentNonTelco consentNonTelco = this.$consent;
        Intrinsics.checkNotNull(consentNonTelco);
        function1.invoke(consentNonTelco);
    }
}