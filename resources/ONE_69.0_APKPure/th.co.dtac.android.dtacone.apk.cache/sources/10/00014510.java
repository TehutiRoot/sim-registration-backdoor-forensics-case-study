package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage.OneFeeInfoScreenKt$ReasonCard$3 */
/* loaded from: classes10.dex */
public final class OneFeeInfoScreenKt$ReasonCard$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $isSelect;
    final /* synthetic */ Function0<Unit> $onSelect;
    final /* synthetic */ String $query;
    final /* synthetic */ String $reasonName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneFeeInfoScreenKt$ReasonCard$3(String str, String str2, boolean z, Function0<Unit> function0, int i, int i2) {
        super(2);
        this.$reasonName = str;
        this.$query = str2;
        this.$isSelect = z;
        this.$onSelect = function0;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        OneFeeInfoScreenKt.ReasonCard(this.$reasonName, this.$query, this.$isSelect, this.$onSelect, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}