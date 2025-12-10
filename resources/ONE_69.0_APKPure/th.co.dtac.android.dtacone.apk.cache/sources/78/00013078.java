package th.p047co.dtac.android.dtacone.view.appOne.eSign.screen;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.state.OneVerifyQrCodeState;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.screen.ScanQrCodeScreenKt$ScanQrCodeScreen$11 */
/* loaded from: classes10.dex */
public final class ScanQrCodeScreenKt$ScanQrCodeScreen$11 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function0<Unit> $onNavigate;
    final /* synthetic */ Function1<String, Unit> $onQrCodeScanned;
    final /* synthetic */ Function0<Unit> $onScanFailure;
    final /* synthetic */ OneVerifyQrCodeState $verifyQrCodeState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScanQrCodeScreenKt$ScanQrCodeScreen$11(OneVerifyQrCodeState oneVerifyQrCodeState, Function1<? super String, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, int i) {
        super(2);
        this.$verifyQrCodeState = oneVerifyQrCodeState;
        this.$onQrCodeScanned = function1;
        this.$onScanFailure = function0;
        this.$onNavigate = function02;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        ScanQrCodeScreenKt.ScanQrCodeScreen(this.$verifyQrCodeState, this.$onQrCodeScanned, this.$onScanFailure, this.$onNavigate, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}