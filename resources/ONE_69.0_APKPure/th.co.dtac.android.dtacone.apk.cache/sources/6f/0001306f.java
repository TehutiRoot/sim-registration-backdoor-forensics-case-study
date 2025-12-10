package th.p047co.dtac.android.dtacone.view.appOne.eSign.screen;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.screen.ScanQrCodeScreenKt$CameraFilterOverlay$2 */
/* loaded from: classes10.dex */
public final class ScanQrCodeScreenKt$CameraFilterOverlay$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ int $centerSquareSize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScanQrCodeScreenKt$CameraFilterOverlay$2(int i, int i2, int i3) {
        super(2);
        this.$centerSquareSize = i;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        ScanQrCodeScreenKt.CameraFilterOverlay(this.$centerSquareSize, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}