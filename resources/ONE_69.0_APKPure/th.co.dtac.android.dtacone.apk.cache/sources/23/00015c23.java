package th.p047co.dtac.android.dtacone.widget.compose.consent;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.app_one.util.theme.compose.CompanyThemes;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelco;
import th.p047co.dtac.android.dtacone.viewmodel.state.ConsentState;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.widget.compose.consent.ConsentScreenKt$ConsentScreen$6 */
/* loaded from: classes9.dex */
public final class ConsentScreenKt$ConsentScreen$6 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ CompanyThemes $companyThemes;
    final /* synthetic */ ConsentState $consentState;
    final /* synthetic */ ConsentType $consentType;
    final /* synthetic */ Function1<ConsentNonTelco, Unit> $onAgree;
    final /* synthetic */ Function0<Unit> $onClear;
    final /* synthetic */ Function1<ConsentNonTelco, Unit> $onDecline;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConsentScreenKt$ConsentScreen$6(CompanyThemes companyThemes, ConsentType consentType, ConsentState consentState, Function1<? super ConsentNonTelco, Unit> function1, Function1<? super ConsentNonTelco, Unit> function12, Function0<Unit> function0, int i, int i2) {
        super(2);
        this.$companyThemes = companyThemes;
        this.$consentType = consentType;
        this.$consentState = consentState;
        this.$onAgree = function1;
        this.$onDecline = function12;
        this.$onClear = function0;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        ConsentScreenKt.ConsentScreen(this.$companyThemes, this.$consentType, this.$consentState, this.$onAgree, this.$onDecline, this.$onClear, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}