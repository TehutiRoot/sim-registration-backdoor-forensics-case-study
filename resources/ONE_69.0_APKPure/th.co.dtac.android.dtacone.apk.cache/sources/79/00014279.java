package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.fixedLinePlus;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.OneRegisterTrueOnlineFixedLinePlusNumberState;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.fixedLinePlus.OneRegisterTrueOnlineFlpSelectNumberScreenKt$OneRegisterTrueOnlineFlpSelectNumberScreen$3 */
/* loaded from: classes10.dex */
public final class C15402x4d4a6b6a extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $checkPhoneNumber;
    final /* synthetic */ OneRegisterTrueOnlineFixedLinePlusNumberState $flpNumberState;
    final /* synthetic */ int $index;
    final /* synthetic */ boolean $isMultiHomePhoneNumber;
    final /* synthetic */ Function0<Unit> $onDismiss;
    final /* synthetic */ Function1<String, Unit> $onSelect;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C15402x4d4a6b6a(int i, OneRegisterTrueOnlineFixedLinePlusNumberState oneRegisterTrueOnlineFixedLinePlusNumberState, boolean z, boolean z2, Function0<Unit> function0, Function1<? super String, Unit> function1, int i2, int i3) {
        super(2);
        this.$index = i;
        this.$flpNumberState = oneRegisterTrueOnlineFixedLinePlusNumberState;
        this.$isMultiHomePhoneNumber = z;
        this.$checkPhoneNumber = z2;
        this.$onDismiss = function0;
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
        OneRegisterTrueOnlineFlpSelectNumberScreenKt.OneRegisterTrueOnlineFlpSelectNumberScreen(this.$index, this.$flpNumberState, this.$isMultiHomePhoneNumber, this.$checkPhoneNumber, this.$onDismiss, this.$onSelect, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}