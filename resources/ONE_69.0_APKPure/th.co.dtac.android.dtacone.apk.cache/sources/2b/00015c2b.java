package th.p047co.dtac.android.dtacone.widget.compose.consent;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.app_one.util.theme.compose.CompanyThemes;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelco;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.widget.compose.consent.ConsentScreenKt$ConsentSection$3 */
/* loaded from: classes9.dex */
public final class ConsentScreenKt$ConsentSection$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ CompanyThemes $companyThemes;
    final /* synthetic */ ConsentType $consentType;
    final /* synthetic */ List<ConsentNonTelco> $consents;
    final /* synthetic */ Function1<ConsentNonTelco, Unit> $onAgree;
    final /* synthetic */ Function1<ConsentNonTelco, Unit> $onDecline;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConsentScreenKt$ConsentSection$3(CompanyThemes companyThemes, ConsentType consentType, List<ConsentNonTelco> list, Function1<? super ConsentNonTelco, Unit> function1, Function1<? super ConsentNonTelco, Unit> function12, int i) {
        super(2);
        this.$companyThemes = companyThemes;
        this.$consentType = consentType;
        this.$consents = list;
        this.$onAgree = function1;
        this.$onDecline = function12;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        ConsentScreenKt.m1787c(this.$companyThemes, this.$consentType, this.$consents, this.$onAgree, this.$onDecline, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}