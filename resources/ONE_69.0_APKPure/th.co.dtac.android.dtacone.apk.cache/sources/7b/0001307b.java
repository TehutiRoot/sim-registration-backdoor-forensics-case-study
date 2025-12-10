package th.p047co.dtac.android.dtacone.view.appOne.eSign.screen;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.screen.ScanQrCodeScreenKt$ScanQrCodeScreen$8$1 */
/* loaded from: classes10.dex */
public final class ScanQrCodeScreenKt$ScanQrCodeScreen$8$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ MutableState<Boolean> $actionScan;
    final /* synthetic */ Function0<Unit> $onScanFailure;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScanQrCodeScreenKt$ScanQrCodeScreen$8$1(MutableState<Boolean> mutableState, Function0<Unit> function0) {
        super(0);
        this.$actionScan = mutableState;
        this.$onScanFailure = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$actionScan.setValue(Boolean.TRUE);
        this.$onScanFailure.invoke();
    }
}