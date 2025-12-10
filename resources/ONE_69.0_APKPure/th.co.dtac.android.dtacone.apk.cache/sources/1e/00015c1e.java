package th.p047co.dtac.android.dtacone.widget.compose.consent;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelco;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.widget.compose.consent.ConsentScreenKt$ConsentScreen$1 */
/* loaded from: classes9.dex */
public final class ConsentScreenKt$ConsentScreen$1 extends Lambda implements Function1<ConsentNonTelco, Unit> {
    public static final ConsentScreenKt$ConsentScreen$1 INSTANCE = new ConsentScreenKt$ConsentScreen$1();

    public ConsentScreenKt$ConsentScreen$1() {
        super(1);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull ConsentNonTelco it) {
        Intrinsics.checkNotNullParameter(it, "it");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ConsentNonTelco consentNonTelco) {
        invoke2(consentNonTelco);
        return Unit.INSTANCE;
    }
}