package th.p047co.dtac.android.dtacone.widget.compose.signature;

import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.Path;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.graphics.drawscope.Stroke;
import androidx.compose.runtime.MutableState;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.widget.compose.signature.viewModel.PathState;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nComposeSignatureCustom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeSignatureCustom.kt\nth/co/dtac/android/dtacone/widget/compose/signature/ComposeSignatureCustomKt$DrawingCanvas$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,284:1\n1855#2,2:285\n*S KotlinDebug\n*F\n+ 1 ComposeSignatureCustom.kt\nth/co/dtac/android/dtacone/widget/compose/signature/ComposeSignatureCustomKt$DrawingCanvas$2\n*L\n203#1:285,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.widget.compose.signature.ComposeSignatureCustomKt$DrawingCanvas$2 */
/* loaded from: classes9.dex */
public final class ComposeSignatureCustomKt$DrawingCanvas$2 extends Lambda implements Function1<DrawScope, Unit> {
    final /* synthetic */ Path $currentPath;
    final /* synthetic */ MutableState<Float> $drawBrush;
    final /* synthetic */ MutableState<Color> $drawColor;
    final /* synthetic */ MutableState<Offset> $movePath;
    final /* synthetic */ List<PathState> $path;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeSignatureCustomKt$DrawingCanvas$2(MutableState<Offset> mutableState, List<PathState> list, Path path, MutableState<Color> mutableState2, MutableState<Float> mutableState3) {
        super(1);
        this.$movePath = mutableState;
        this.$path = list;
        this.$currentPath = path;
        this.$drawColor = mutableState2;
        this.$drawBrush = mutableState3;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
        invoke2(drawScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        Offset value = this.$movePath.getValue();
        if (value != null) {
            Path path = this.$currentPath;
            MutableState<Color> mutableState = this.$drawColor;
            MutableState<Float> mutableState2 = this.$drawBrush;
            long m71696unboximpl = value.m71696unboximpl();
            path.lineTo(Offset.m71686getXimpl(m71696unboximpl), Offset.m71687getYimpl(m71696unboximpl));
            AbstractC12264mK.m26709G(Canvas, path, mutableState.getValue().m71929unboximpl(), 0.0f, new Stroke(mutableState2.getValue().floatValue(), 0.0f, 0, 0, null, 30, null), null, 0, 52, null);
        }
        for (PathState pathState : this.$path) {
            AbstractC12264mK.m26709G(Canvas, pathState.getPath(), pathState.m75362getColor0d7_KjU(), 0.0f, new Stroke(pathState.getStroke(), 0.0f, 0, 0, null, 30, null), null, 0, 52, null);
        }
    }
}