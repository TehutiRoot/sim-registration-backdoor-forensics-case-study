package th.p047co.dtac.android.dtacone.widget.compose.success;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.app_one.util.theme.compose.CompanyThemes;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.widget.compose.success.SuccessScreenKt$SuccessScreen$2 */
/* loaded from: classes9.dex */
public final class SuccessScreenKt$SuccessScreen$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ CompanyThemes $companyThemes;
    final /* synthetic */ String $description;
    final /* synthetic */ Function0<Unit> $onDismiss;
    final /* synthetic */ String $title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuccessScreenKt$SuccessScreen$2(CompanyThemes companyThemes, String str, String str2, Function0<Unit> function0, int i, int i2) {
        super(2);
        this.$companyThemes = companyThemes;
        this.$title = str;
        this.$description = str2;
        this.$onDismiss = function0;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        SuccessScreenKt.SuccessScreen(this.$companyThemes, this.$title, this.$description, this.$onDismiss, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}