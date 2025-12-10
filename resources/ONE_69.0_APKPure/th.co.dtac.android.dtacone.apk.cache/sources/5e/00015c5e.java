package th.p047co.dtac.android.dtacone.widget.compose.signature;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.widget.compose.signature.viewModel.PathState;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.widget.compose.signature.ComposeSignatureCustomKt$DrawingCanvas$3 */
/* loaded from: classes9.dex */
public final class ComposeSignatureCustomKt$DrawingCanvas$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ MutableState<Float> $drawBrush;
    final /* synthetic */ MutableState<Color> $drawColor;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function0<Unit> $onUpdateDrawing;
    final /* synthetic */ List<PathState> $path;
    final /* synthetic */ long $signaturePadColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeSignatureCustomKt$DrawingCanvas$3(MutableState<Color> mutableState, MutableState<Float> mutableState2, List<PathState> list, Modifier modifier, long j, Function0<Unit> function0, int i) {
        super(2);
        this.$drawColor = mutableState;
        this.$drawBrush = mutableState2;
        this.$path = list;
        this.$modifier = modifier;
        this.$signaturePadColor = j;
        this.$onUpdateDrawing = function0;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        ComposeSignatureCustomKt.m75354DrawingCanvasyrwZFoE(this.$drawColor, this.$drawBrush, this.$path, this.$modifier, this.$signaturePadColor, this.$onUpdateDrawing, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}