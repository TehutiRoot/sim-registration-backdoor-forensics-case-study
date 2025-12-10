package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.layout.smartCard;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.layout.smartCard.IdCardReaderSwitchBarKt$IdCardReaderSwitchBar$2 */
/* loaded from: classes10.dex */
public final class IdCardReaderSwitchBarKt$IdCardReaderSwitchBar$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $cardReaderEnabled;
    final /* synthetic */ Function0<Unit> $onSwitchMode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdCardReaderSwitchBarKt$IdCardReaderSwitchBar$2(boolean z, Function0<Unit> function0, int i) {
        super(2);
        this.$cardReaderEnabled = z;
        this.$onSwitchMode = function0;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        IdCardReaderSwitchBarKt.IdCardReaderSwitchBar(this.$cardReaderEnabled, this.$onSwitchMode, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}