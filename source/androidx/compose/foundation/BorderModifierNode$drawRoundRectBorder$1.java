package androidx.compose.foundation;

import androidx.compose.p003ui.geometry.CornerRadius;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.ClipOp;
import androidx.compose.p003ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p003ui.graphics.drawscope.DrawContext;
import androidx.compose.p003ui.graphics.drawscope.Stroke;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m28850d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderModifierNode$drawRoundRectBorder$1\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,512:1\n221#2:513\n261#2,11:514\n*S KotlinDebug\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderModifierNode$drawRoundRectBorder$1\n*L\n325#1:513\n325#1:514,11\n*E\n"})
/* loaded from: classes.dex */
public final class BorderModifierNode$drawRoundRectBorder$1 extends Lambda implements Function1<ContentDrawScope, Unit> {
    final /* synthetic */ long $borderSize;
    final /* synthetic */ Stroke $borderStroke;
    final /* synthetic */ Brush $brush;
    final /* synthetic */ long $cornerRadius;
    final /* synthetic */ boolean $fillArea;
    final /* synthetic */ float $halfStroke;
    final /* synthetic */ float $strokeWidth;
    final /* synthetic */ long $topLeft;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BorderModifierNode$drawRoundRectBorder$1(boolean z, Brush brush, long j, float f, float f2, long j2, long j3, Stroke stroke) {
        super(1);
        this.$fillArea = z;
        this.$brush = brush;
        this.$cornerRadius = j;
        this.$halfStroke = f;
        this.$strokeWidth = f2;
        this.$topLeft = j2;
        this.$borderSize = j3;
        this.$borderStroke = stroke;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
        invoke2(contentDrawScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull ContentDrawScope onDrawWithContent) {
        long m61612e;
        Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
        onDrawWithContent.drawContent();
        if (this.$fillArea) {
            AbstractC12212lK.m26515L(onDrawWithContent, this.$brush, 0L, 0L, this.$cornerRadius, 0.0f, null, null, 0, 246, null);
            return;
        }
        float m71477getXimpl = CornerRadius.m71477getXimpl(this.$cornerRadius);
        float f = this.$halfStroke;
        if (m71477getXimpl < f) {
            float f2 = this.$strokeWidth;
            float m71571getWidthimpl = Size.m71571getWidthimpl(onDrawWithContent.mo72144getSizeNHjbRc()) - this.$strokeWidth;
            float m71568getHeightimpl = Size.m71568getHeightimpl(onDrawWithContent.mo72144getSizeNHjbRc()) - this.$strokeWidth;
            int m71723getDifferencertfAjoo = ClipOp.Companion.m71723getDifferencertfAjoo();
            Brush brush = this.$brush;
            long j = this.$cornerRadius;
            DrawContext drawContext = onDrawWithContent.getDrawContext();
            long mo72150getSizeNHjbRc = drawContext.mo72150getSizeNHjbRc();
            drawContext.getCanvas().save();
            drawContext.getTransform().mo72153clipRectN_I0leg(f2, f2, m71571getWidthimpl, m71568getHeightimpl, m71723getDifferencertfAjoo);
            AbstractC12212lK.m26515L(onDrawWithContent, brush, 0L, 0L, j, 0.0f, null, null, 0, 246, null);
            drawContext.getCanvas().restore();
            drawContext.mo72151setSizeuvyYCjk(mo72150getSizeNHjbRc);
            return;
        }
        Brush brush2 = this.$brush;
        long j2 = this.$topLeft;
        long j3 = this.$borderSize;
        m61612e = BorderKt.m61612e(this.$cornerRadius, f);
        AbstractC12212lK.m26515L(onDrawWithContent, brush2, j2, j3, m61612e, 0.0f, this.$borderStroke, null, 0, 208, null);
    }
}
