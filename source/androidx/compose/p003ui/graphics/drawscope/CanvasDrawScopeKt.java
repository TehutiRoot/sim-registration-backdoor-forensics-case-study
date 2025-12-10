package androidx.compose.p003ui.graphics.drawscope;

import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.geometry.SizeKt;
import androidx.compose.p003ui.graphics.Canvas;
import androidx.compose.p003ui.graphics.Path;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.DensityKt;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0005¨\u0006\u0007"}, m28850d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawContext;", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/ui/graphics/drawscope/DrawContext;)Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/Density;", "DefaultDensity", "ui-graphics_release"}, m28849k = 2, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.graphics.drawscope.CanvasDrawScopeKt */
/* loaded from: classes2.dex */
public final class CanvasDrawScopeKt {

    /* renamed from: a */
    public static final Density f29316a = DensityKt.Density(1.0f, 1.0f);

    /* renamed from: a */
    public static final DrawTransform m59679a(final DrawContext drawContext) {
        return new DrawTransform() { // from class: androidx.compose.ui.graphics.drawscope.CanvasDrawScopeKt$asDrawTransform$1
            @Override // androidx.compose.p003ui.graphics.drawscope.DrawTransform
            /* renamed from: clipPath-mtrdD-E  reason: not valid java name */
            public void mo72152clipPathmtrdDE(@NotNull Path path, int i) {
                Intrinsics.checkNotNullParameter(path, "path");
                DrawContext.this.getCanvas().mo71596clipPathmtrdDE(path, i);
            }

            @Override // androidx.compose.p003ui.graphics.drawscope.DrawTransform
            /* renamed from: clipRect-N_I0leg  reason: not valid java name */
            public void mo72153clipRectN_I0leg(float f, float f2, float f3, float f4, int i) {
                DrawContext.this.getCanvas().mo71597clipRectN_I0leg(f, f2, f3, f4, i);
            }

            @Override // androidx.compose.p003ui.graphics.drawscope.DrawTransform
            /* renamed from: getCenter-F1C5BW0  reason: not valid java name */
            public long mo72154getCenterF1C5BW0() {
                return SizeKt.m71581getCenteruvyYCjk(mo72155getSizeNHjbRc());
            }

            @Override // androidx.compose.p003ui.graphics.drawscope.DrawTransform
            /* renamed from: getSize-NH-jbRc  reason: not valid java name */
            public long mo72155getSizeNHjbRc() {
                return DrawContext.this.mo72150getSizeNHjbRc();
            }

            @Override // androidx.compose.p003ui.graphics.drawscope.DrawTransform
            public void inset(float f, float f2, float f3, float f4) {
                Canvas canvas = DrawContext.this.getCanvas();
                DrawContext drawContext2 = DrawContext.this;
                long Size = SizeKt.Size(Size.m71571getWidthimpl(mo72155getSizeNHjbRc()) - (f3 + f), Size.m71568getHeightimpl(mo72155getSizeNHjbRc()) - (f4 + f2));
                if (Size.m71571getWidthimpl(Size) >= 0.0f && Size.m71568getHeightimpl(Size) >= 0.0f) {
                    drawContext2.mo72151setSizeuvyYCjk(Size);
                    canvas.translate(f, f2);
                    return;
                }
                throw new IllegalArgumentException("Width and height must be greater than or equal to zero".toString());
            }

            @Override // androidx.compose.p003ui.graphics.drawscope.DrawTransform
            /* renamed from: rotate-Uv8p0NA  reason: not valid java name */
            public void mo72156rotateUv8p0NA(float f, long j) {
                Canvas canvas = DrawContext.this.getCanvas();
                canvas.translate(Offset.m71502getXimpl(j), Offset.m71503getYimpl(j));
                canvas.rotate(f);
                canvas.translate(-Offset.m71502getXimpl(j), -Offset.m71503getYimpl(j));
            }

            @Override // androidx.compose.p003ui.graphics.drawscope.DrawTransform
            /* renamed from: scale-0AR0LA0  reason: not valid java name */
            public void mo72157scale0AR0LA0(float f, float f2, long j) {
                Canvas canvas = DrawContext.this.getCanvas();
                canvas.translate(Offset.m71502getXimpl(j), Offset.m71503getYimpl(j));
                canvas.scale(f, f2);
                canvas.translate(-Offset.m71502getXimpl(j), -Offset.m71503getYimpl(j));
            }

            @Override // androidx.compose.p003ui.graphics.drawscope.DrawTransform
            /* renamed from: transform-58bKbWc  reason: not valid java name */
            public void mo72158transform58bKbWc(@NotNull float[] matrix) {
                Intrinsics.checkNotNullParameter(matrix, "matrix");
                DrawContext.this.getCanvas().mo71599concat58bKbWc(matrix);
            }

            @Override // androidx.compose.p003ui.graphics.drawscope.DrawTransform
            public void translate(float f, float f2) {
                DrawContext.this.getCanvas().translate(f, f2);
            }
        };
    }
}
