package th.p047co.dtac.android.dtacone.widget.compose.signature;

import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.graphics.GraphicsLayerScope;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.widget.compose.signature.SignaturePageScreenKt$PdfPreview$2$1$1 */
/* loaded from: classes9.dex */
public final class SignaturePageScreenKt$PdfPreview$2$1$1 extends Lambda implements Function1<GraphicsLayerScope, Unit> {
    final /* synthetic */ MutableState<Offset> $offset$delegate;
    final /* synthetic */ MutableFloatState $scale$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignaturePageScreenKt$PdfPreview$2$1$1(MutableFloatState mutableFloatState, MutableState<Offset> mutableState) {
        super(1);
        this.$scale$delegate = mutableFloatState;
        this.$offset$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
        invoke2(graphicsLayerScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull GraphicsLayerScope graphicsLayer) {
        float floatValue;
        float floatValue2;
        long invoke$lambda$3;
        long invoke$lambda$32;
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        floatValue = this.$scale$delegate.getFloatValue();
        graphicsLayer.setScaleX(floatValue);
        floatValue2 = this.$scale$delegate.getFloatValue();
        graphicsLayer.setScaleY(floatValue2);
        invoke$lambda$3 = SignaturePageScreenKt$PdfPreview$2.invoke$lambda$3(this.$offset$delegate);
        graphicsLayer.setTranslationX(Offset.m71686getXimpl(invoke$lambda$3));
        invoke$lambda$32 = SignaturePageScreenKt$PdfPreview$2.invoke$lambda$3(this.$offset$delegate);
        graphicsLayer.setTranslationY(Offset.m71687getYimpl(invoke$lambda$32));
    }
}