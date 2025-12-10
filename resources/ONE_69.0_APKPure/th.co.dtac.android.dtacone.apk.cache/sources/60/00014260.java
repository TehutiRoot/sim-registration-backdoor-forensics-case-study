package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.fixedLinePlus;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.OneRegisterTrueOnlineFixedLinePlusMarketingState;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.fixedLinePlus.OneRegisterTrueOnlineFlpMarketingCodeScreenKt$OneRegisterTrueOnlineFlpMarketingCodeScreen$3 */
/* loaded from: classes10.dex */
public final class C15387x65ae472 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ OneRegisterTrueOnlineFixedLinePlusMarketingState $flpMarketingState;
    final /* synthetic */ int $index;
    final /* synthetic */ boolean $isMultiHomePhoneNumber;
    final /* synthetic */ Function1<String, Unit> $onSelect;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C15387x65ae472(int i, OneRegisterTrueOnlineFixedLinePlusMarketingState oneRegisterTrueOnlineFixedLinePlusMarketingState, boolean z, Function1<? super String, Unit> function1, int i2, int i3) {
        super(2);
        this.$index = i;
        this.$flpMarketingState = oneRegisterTrueOnlineFixedLinePlusMarketingState;
        this.$isMultiHomePhoneNumber = z;
        this.$onSelect = function1;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        OneRegisterTrueOnlineFlpMarketingCodeScreenKt.OneRegisterTrueOnlineFlpMarketingCodeScreen(this.$index, this.$flpMarketingState, this.$isMultiHomePhoneNumber, this.$onSelect, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}