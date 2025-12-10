package androidx.compose.p003ui.graphics.painter;

import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.geometry.RectKt;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.geometry.SizeKt;
import androidx.compose.p003ui.graphics.AndroidPaint_androidKt;
import androidx.compose.p003ui.graphics.Canvas;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.graphics.Paint;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.unit.LayoutDirection;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H$¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J5\u0010\u0019\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010$R\u0016\u0010'\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010&R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010(R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010)R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R%\u00100\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050,¢\u0006\u0002\b-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001d\u00103\u001a\u00020\u00158&X¦\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b1\u00102\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u00064"}, m28850d2 = {"Landroidx/compose/ui/graphics/painter/Painter;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "onDraw", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "", "alpha", "", "applyAlpha", "(F)Z", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "applyColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)Z", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "applyLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)Z", "Landroidx/compose/ui/geometry/Size;", "size", "draw-x_KDEd0", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFLandroidx/compose/ui/graphics/ColorFilter;)V", "draw", "Landroidx/compose/ui/graphics/Paint;", "d", "()Landroidx/compose/ui/graphics/Paint;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroidx/compose/ui/graphics/ColorFilter;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "(F)V", "rtl", OperatorName.CURVE_TO, "(Landroidx/compose/ui/unit/LayoutDirection;)V", "Landroidx/compose/ui/graphics/Paint;", "layerPaint", "Z", "useLayer", "Landroidx/compose/ui/graphics/ColorFilter;", "F", "e", "Landroidx/compose/ui/unit/LayoutDirection;", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", OperatorName.FILL_NON_ZERO, "Lkotlin/jvm/functions/Function1;", "drawLambda", "getIntrinsicSize-NH-jbRc", "()J", "intrinsicSize", "ui-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Painter.kt\nandroidx/compose/ui/graphics/painter/Painter\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 3 Canvas.kt\nandroidx/compose/ui/graphics/CanvasKt\n*L\n1#1,217:1\n66#2,2:218\n245#2:220\n68#2,2:228\n111#3,7:221\n*S KotlinDebug\n*F\n+ 1 Painter.kt\nandroidx/compose/ui/graphics/painter/Painter\n*L\n195#1:218,2\n206#1:220\n195#1:228,2\n207#1:221,7\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.painter.Painter */
/* loaded from: classes2.dex */
public abstract class Painter {

    /* renamed from: a */
    public Paint f29342a;

    /* renamed from: b */
    public boolean f29343b;

    /* renamed from: c */
    public ColorFilter f29344c;

    /* renamed from: d */
    public float f29345d = 1.0f;

    /* renamed from: e */
    public LayoutDirection f29346e = LayoutDirection.Ltr;

    /* renamed from: f */
    public final Function1 f29347f = new Painter$drawLambda$1(this);

    /* renamed from: draw-x_KDEd0$default  reason: not valid java name */
    public static /* synthetic */ void m72241drawx_KDEd0$default(Painter painter, DrawScope drawScope, long j, float f, ColorFilter colorFilter, int i, Object obj) {
        float f2;
        if (obj == null) {
            if ((i & 2) != 0) {
                f2 = 1.0f;
            } else {
                f2 = f;
            }
            if ((i & 4) != 0) {
                colorFilter = null;
            }
            painter.m72242drawx_KDEd0(drawScope, j, f2, colorFilter);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: draw-x_KDEd0");
    }

    /* renamed from: a */
    public final void m59677a(float f) {
        if (this.f29345d != f) {
            if (!applyAlpha(f)) {
                if (f == 1.0f) {
                    Paint paint = this.f29342a;
                    if (paint != null) {
                        paint.setAlpha(f);
                    }
                    this.f29343b = false;
                } else {
                    m59674d().setAlpha(f);
                    this.f29343b = true;
                }
            }
            this.f29345d = f;
        }
    }

    public boolean applyAlpha(float f) {
        return false;
    }

    public boolean applyColorFilter(@Nullable ColorFilter colorFilter) {
        return false;
    }

    public boolean applyLayoutDirection(@NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return false;
    }

    /* renamed from: b */
    public final void m59676b(ColorFilter colorFilter) {
        if (!Intrinsics.areEqual(this.f29344c, colorFilter)) {
            if (!applyColorFilter(colorFilter)) {
                if (colorFilter == null) {
                    Paint paint = this.f29342a;
                    if (paint != null) {
                        paint.setColorFilter(null);
                    }
                    this.f29343b = false;
                } else {
                    m59674d().setColorFilter(colorFilter);
                    this.f29343b = true;
                }
            }
            this.f29344c = colorFilter;
        }
    }

    /* renamed from: c */
    public final void m59675c(LayoutDirection layoutDirection) {
        if (this.f29346e != layoutDirection) {
            applyLayoutDirection(layoutDirection);
            this.f29346e = layoutDirection;
        }
    }

    /* renamed from: d */
    public final Paint m59674d() {
        Paint paint = this.f29342a;
        if (paint == null) {
            Paint Paint = AndroidPaint_androidKt.Paint();
            this.f29342a = Paint;
            return Paint;
        }
        return paint;
    }

    /* renamed from: draw-x_KDEd0  reason: not valid java name */
    public final void m72242drawx_KDEd0(@NotNull DrawScope draw, long j, float f, @Nullable ColorFilter colorFilter) {
        Intrinsics.checkNotNullParameter(draw, "$this$draw");
        m59677a(f);
        m59676b(colorFilter);
        m59675c(draw.getLayoutDirection());
        float m71571getWidthimpl = Size.m71571getWidthimpl(draw.mo72144getSizeNHjbRc()) - Size.m71571getWidthimpl(j);
        float m71568getHeightimpl = Size.m71568getHeightimpl(draw.mo72144getSizeNHjbRc()) - Size.m71568getHeightimpl(j);
        draw.getDrawContext().getTransform().inset(0.0f, 0.0f, m71571getWidthimpl, m71568getHeightimpl);
        if (f > 0.0f && Size.m71571getWidthimpl(j) > 0.0f && Size.m71568getHeightimpl(j) > 0.0f) {
            if (this.f29343b) {
                Rect m71542Recttz77jQw = RectKt.m71542Recttz77jQw(Offset.Companion.m71518getZeroF1C5BW0(), SizeKt.Size(Size.m71571getWidthimpl(j), Size.m71568getHeightimpl(j)));
                Canvas canvas = draw.getDrawContext().getCanvas();
                try {
                    canvas.saveLayer(m71542Recttz77jQw, m59674d());
                    onDraw(draw);
                } finally {
                    canvas.restore();
                }
            } else {
                onDraw(draw);
            }
        }
        draw.getDrawContext().getTransform().inset(-0.0f, -0.0f, -m71571getWidthimpl, -m71568getHeightimpl);
    }

    /* renamed from: getIntrinsicSize-NH-jbRc */
    public abstract long mo72236getIntrinsicSizeNHjbRc();

    public abstract void onDraw(@NotNull DrawScope drawScope);
}
