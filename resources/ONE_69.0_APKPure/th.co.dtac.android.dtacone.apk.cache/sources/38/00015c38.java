package th.p047co.dtac.android.dtacone.widget.compose.consent;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelco;
import th.p047co.dtac.android.dtacone.viewmodel.state.ConsentState;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.widget.compose.consent.ConsentTmnScreenKt$ConsentTmnScreen$6 */
/* loaded from: classes9.dex */
public final class ConsentTmnScreenKt$ConsentTmnScreen$6 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ ConsentState $consentState;
    final /* synthetic */ Function1<ConsentNonTelco, Unit> $onAgree;
    final /* synthetic */ Function1<ConsentNonTelco, Unit> $onDecline;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConsentTmnScreenKt$ConsentTmnScreen$6(ConsentState consentState, Function1<? super ConsentNonTelco, Unit> function1, Function1<? super ConsentNonTelco, Unit> function12, int i, int i2) {
        super(2);
        this.$consentState = consentState;
        this.$onAgree = function1;
        this.$onDecline = function12;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        ConsentTmnScreenKt.ConsentTmnScreen(this.$consentState, this.$onAgree, this.$onDecline, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}