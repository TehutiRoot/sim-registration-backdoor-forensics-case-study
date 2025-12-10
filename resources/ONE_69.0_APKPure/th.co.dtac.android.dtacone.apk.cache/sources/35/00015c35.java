package th.p047co.dtac.android.dtacone.widget.compose.consent;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelco;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.widget.compose.consent.ConsentTmnScreenKt$ConsentTmnScreen$3$1 */
/* loaded from: classes9.dex */
public final class ConsentTmnScreenKt$ConsentTmnScreen$3$1 extends Lambda implements Function1<ConsentNonTelco, Unit> {
    final /* synthetic */ MutableState<Boolean> $showConfirmDialog$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsentTmnScreenKt$ConsentTmnScreen$3$1(MutableState<Boolean> mutableState) {
        super(1);
        this.$showConfirmDialog$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ConsentNonTelco consentNonTelco) {
        invoke2(consentNonTelco);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull ConsentNonTelco it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ConsentTmnScreenKt.m1778d(this.$showConfirmDialog$delegate, true);
    }
}