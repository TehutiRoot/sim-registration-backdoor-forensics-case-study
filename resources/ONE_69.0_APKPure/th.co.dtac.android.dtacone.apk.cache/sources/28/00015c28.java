package th.p047co.dtac.android.dtacone.widget.compose.consent;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelco;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.widget.compose.consent.ConsentScreenKt$ConsentSection$2$3 */
/* loaded from: classes9.dex */
public final class ConsentScreenKt$ConsentSection$2$3 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Function1<ConsentNonTelco, Unit> $onAgree;
    final /* synthetic */ ConsentNonTelco $selectedConsent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConsentScreenKt$ConsentSection$2$3(Function1<? super ConsentNonTelco, Unit> function1, ConsentNonTelco consentNonTelco) {
        super(0);
        this.$onAgree = function1;
        this.$selectedConsent = consentNonTelco;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Function1<ConsentNonTelco, Unit> function1 = this.$onAgree;
        ConsentNonTelco consentNonTelco = this.$selectedConsent;
        Intrinsics.checkNotNull(consentNonTelco);
        function1.invoke(consentNonTelco);
    }
}