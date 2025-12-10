package th.p047co.dtac.android.dtacone.view.appOne.eSign.screen;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.state.OneVerifyQrCodeState;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.screen.ScanQrCodeScreenKt$PreviewCameraLayout$2 */
/* loaded from: classes10.dex */
public final class ScanQrCodeScreenKt$PreviewCameraLayout$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ MutableState<Boolean> $actionScan;
    final /* synthetic */ Context $context;
    final /* synthetic */ LifecycleOwner $lifecycleOwner;
    final /* synthetic */ Function1<String, Unit> $onQrCodeScanned;
    final /* synthetic */ OneVerifyQrCodeState $verifyQrCodeState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScanQrCodeScreenKt$PreviewCameraLayout$2(Context context, OneVerifyQrCodeState oneVerifyQrCodeState, Function1<? super String, Unit> function1, LifecycleOwner lifecycleOwner, MutableState<Boolean> mutableState, int i) {
        super(2);
        this.$context = context;
        this.$verifyQrCodeState = oneVerifyQrCodeState;
        this.$onQrCodeScanned = function1;
        this.$lifecycleOwner = lifecycleOwner;
        this.$actionScan = mutableState;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        ScanQrCodeScreenKt.PreviewCameraLayout(this.$context, this.$verifyQrCodeState, this.$onQrCodeScanned, this.$lifecycleOwner, this.$actionScan, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}