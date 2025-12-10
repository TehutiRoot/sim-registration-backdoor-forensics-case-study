package p000;

import androidx.compose.p003ui.geometry.CornerRadius;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.geometry.SizeKt;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.graphics.ImageBitmap;
import androidx.compose.p003ui.graphics.Path;
import androidx.compose.p003ui.graphics.PathEffect;
import androidx.compose.p003ui.graphics.StrokeCap;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.graphics.drawscope.DrawStyle;
import androidx.compose.p003ui.graphics.drawscope.Fill;
import androidx.compose.p003ui.graphics.drawscope.Stroke;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntSizeKt;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: lK */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC12212lK {
    static {
        DrawScope.Companion companion = DrawScope.Companion;
    }

    /* renamed from: A */
    public static /* synthetic */ void m26526A(DrawScope drawScope, ImageBitmap imageBitmap, long j, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        long j2;
        float f2;
        DrawStyle drawStyle2;
        ColorFilter colorFilter2;
        int i3;
        if (obj == null) {
            if ((i2 & 2) != 0) {
                j2 = Offset.Companion.m71518getZeroF1C5BW0();
            } else {
                j2 = j;
            }
            if ((i2 & 4) != 0) {
                f2 = 1.0f;
            } else {
                f2 = f;
            }
            if ((i2 & 8) != 0) {
                drawStyle2 = Fill.INSTANCE;
            } else {
                drawStyle2 = drawStyle;
            }
            if ((i2 & 16) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i2 & 32) != 0) {
                i3 = DrawScope.Companion.m72174getDefaultBlendMode0nO6VwU();
            } else {
                i3 = i;
            }
            drawScope.mo72130drawImagegbVJVH8(imageBitmap, j2, f2, drawStyle2, colorFilter2, i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-gbVJVH8");
    }

    /* renamed from: B */
    public static /* synthetic */ void m26525B(DrawScope drawScope, Brush brush, long j, long j2, float f, int i, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i2, int i3, Object obj) {
        float f3;
        int i4;
        PathEffect pathEffect2;
        float f4;
        ColorFilter colorFilter2;
        int i5;
        if (obj == null) {
            if ((i3 & 8) != 0) {
                f3 = 0.0f;
            } else {
                f3 = f;
            }
            if ((i3 & 16) != 0) {
                i4 = Stroke.Companion.m72233getDefaultCapKaPHkGw();
            } else {
                i4 = i;
            }
            if ((i3 & 32) != 0) {
                pathEffect2 = null;
            } else {
                pathEffect2 = pathEffect;
            }
            if ((i3 & 64) != 0) {
                f4 = 1.0f;
            } else {
                f4 = f2;
            }
            if ((i3 & 128) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i3 & 256) != 0) {
                i5 = DrawScope.Companion.m72174getDefaultBlendMode0nO6VwU();
            } else {
                i5 = i2;
            }
            drawScope.mo72131drawLine1RTmtNc(brush, j, j2, f3, i4, pathEffect2, f4, colorFilter2, i5);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-1RTmtNc");
    }

    /* renamed from: C */
    public static /* synthetic */ void m26524C(DrawScope drawScope, long j, long j2, long j3, float f, int i, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i2, int i3, Object obj) {
        float f3;
        int i4;
        PathEffect pathEffect2;
        float f4;
        ColorFilter colorFilter2;
        int i5;
        if (obj == null) {
            if ((i3 & 8) != 0) {
                f3 = 0.0f;
            } else {
                f3 = f;
            }
            if ((i3 & 16) != 0) {
                i4 = Stroke.Companion.m72233getDefaultCapKaPHkGw();
            } else {
                i4 = i;
            }
            if ((i3 & 32) != 0) {
                pathEffect2 = null;
            } else {
                pathEffect2 = pathEffect;
            }
            if ((i3 & 64) != 0) {
                f4 = 1.0f;
            } else {
                f4 = f2;
            }
            if ((i3 & 128) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i3 & 256) != 0) {
                i5 = DrawScope.Companion.m72174getDefaultBlendMode0nO6VwU();
            } else {
                i5 = i2;
            }
            drawScope.mo72132drawLineNGM6Ib0(j, j2, j3, f3, i4, pathEffect2, f4, colorFilter2, i5);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-NGM6Ib0");
    }

    /* renamed from: D */
    public static /* synthetic */ void m26523D(DrawScope drawScope, Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        long j3;
        long j4;
        float f2;
        DrawStyle drawStyle2;
        ColorFilter colorFilter2;
        int i3;
        if (obj == null) {
            if ((i2 & 2) != 0) {
                j3 = Offset.Companion.m71518getZeroF1C5BW0();
            } else {
                j3 = j;
            }
            if ((i2 & 4) != 0) {
                j4 = m26510d(drawScope, drawScope.mo72144getSizeNHjbRc(), j3);
            } else {
                j4 = j2;
            }
            if ((i2 & 8) != 0) {
                f2 = 1.0f;
            } else {
                f2 = f;
            }
            if ((i2 & 16) != 0) {
                drawStyle2 = Fill.INSTANCE;
            } else {
                drawStyle2 = drawStyle;
            }
            if ((i2 & 32) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i2 & 64) != 0) {
                i3 = DrawScope.Companion.m72174getDefaultBlendMode0nO6VwU();
            } else {
                i3 = i;
            }
            drawScope.mo72133drawOvalAsUm42w(brush, j3, j4, f2, drawStyle2, colorFilter2, i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawOval-AsUm42w");
    }

    /* renamed from: E */
    public static /* synthetic */ void m26522E(DrawScope drawScope, long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        long j4;
        long j5;
        float f2;
        Fill fill;
        ColorFilter colorFilter2;
        int i3;
        if (obj == null) {
            if ((i2 & 2) != 0) {
                j4 = Offset.Companion.m71518getZeroF1C5BW0();
            } else {
                j4 = j2;
            }
            if ((i2 & 4) != 0) {
                j5 = m26510d(drawScope, drawScope.mo72144getSizeNHjbRc(), j4);
            } else {
                j5 = j3;
            }
            if ((i2 & 8) != 0) {
                f2 = 1.0f;
            } else {
                f2 = f;
            }
            if ((i2 & 16) != 0) {
                fill = Fill.INSTANCE;
            } else {
                fill = drawStyle;
            }
            if ((i2 & 32) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i2 & 64) != 0) {
                i3 = DrawScope.Companion.m72174getDefaultBlendMode0nO6VwU();
            } else {
                i3 = i;
            }
            drawScope.mo72134drawOvalnJ9OG0(j, j4, j5, f2, fill, colorFilter2, i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawOval-n-J9OG0");
    }

    /* renamed from: F */
    public static /* synthetic */ void m26521F(DrawScope drawScope, Path path, Brush brush, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        float f2;
        if (obj == null) {
            if ((i2 & 4) != 0) {
                f2 = 1.0f;
            } else {
                f2 = f;
            }
            if ((i2 & 8) != 0) {
                drawStyle = Fill.INSTANCE;
            }
            DrawStyle drawStyle2 = drawStyle;
            if ((i2 & 16) != 0) {
                colorFilter = null;
            }
            ColorFilter colorFilter2 = colorFilter;
            if ((i2 & 32) != 0) {
                i = DrawScope.Companion.m72174getDefaultBlendMode0nO6VwU();
            }
            drawScope.mo72135drawPathGBMwjPU(path, brush, f2, drawStyle2, colorFilter2, i);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-GBMwjPU");
    }

    /* renamed from: G */
    public static /* synthetic */ void m26520G(DrawScope drawScope, Path path, long j, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        float f2;
        Fill fill;
        ColorFilter colorFilter2;
        int i3;
        if (obj == null) {
            if ((i2 & 4) != 0) {
                f2 = 1.0f;
            } else {
                f2 = f;
            }
            if ((i2 & 8) != 0) {
                fill = Fill.INSTANCE;
            } else {
                fill = drawStyle;
            }
            if ((i2 & 16) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i2 & 32) != 0) {
                i3 = DrawScope.Companion.m72174getDefaultBlendMode0nO6VwU();
            } else {
                i3 = i;
            }
            drawScope.mo72136drawPathLG529CI(path, j, f2, fill, colorFilter2, i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-LG529CI");
    }

    /* renamed from: H */
    public static /* synthetic */ void m26519H(DrawScope drawScope, List list, int i, long j, float f, int i2, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i3, int i4, Object obj) {
        float f3;
        int i5;
        PathEffect pathEffect2;
        float f4;
        ColorFilter colorFilter2;
        int i6;
        if (obj == null) {
            if ((i4 & 8) != 0) {
                f3 = 0.0f;
            } else {
                f3 = f;
            }
            if ((i4 & 16) != 0) {
                i5 = StrokeCap.Companion.m72043getButtKaPHkGw();
            } else {
                i5 = i2;
            }
            if ((i4 & 32) != 0) {
                pathEffect2 = null;
            } else {
                pathEffect2 = pathEffect;
            }
            if ((i4 & 64) != 0) {
                f4 = 1.0f;
            } else {
                f4 = f2;
            }
            if ((i4 & 128) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i4 & 256) != 0) {
                i6 = DrawScope.Companion.m72174getDefaultBlendMode0nO6VwU();
            } else {
                i6 = i3;
            }
            drawScope.mo72137drawPointsF8ZwMP8(list, i, j, f3, i5, pathEffect2, f4, colorFilter2, i6);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPoints-F8ZwMP8");
    }

    /* renamed from: I */
    public static /* synthetic */ void m26518I(DrawScope drawScope, List list, int i, Brush brush, float f, int i2, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i3, int i4, Object obj) {
        float f3;
        int i5;
        PathEffect pathEffect2;
        float f4;
        ColorFilter colorFilter2;
        int i6;
        if (obj == null) {
            if ((i4 & 8) != 0) {
                f3 = 0.0f;
            } else {
                f3 = f;
            }
            if ((i4 & 16) != 0) {
                i5 = StrokeCap.Companion.m72043getButtKaPHkGw();
            } else {
                i5 = i2;
            }
            if ((i4 & 32) != 0) {
                pathEffect2 = null;
            } else {
                pathEffect2 = pathEffect;
            }
            if ((i4 & 64) != 0) {
                f4 = 1.0f;
            } else {
                f4 = f2;
            }
            if ((i4 & 128) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i4 & 256) != 0) {
                i6 = DrawScope.Companion.m72174getDefaultBlendMode0nO6VwU();
            } else {
                i6 = i3;
            }
            drawScope.mo72138drawPointsGsft0Ws(list, i, brush, f3, i5, pathEffect2, f4, colorFilter2, i6);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPoints-Gsft0Ws");
    }

    /* renamed from: J */
    public static /* synthetic */ void m26517J(DrawScope drawScope, Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        long j3;
        long j4;
        float f2;
        DrawStyle drawStyle2;
        ColorFilter colorFilter2;
        int i3;
        if (obj == null) {
            if ((i2 & 2) != 0) {
                j3 = Offset.Companion.m71518getZeroF1C5BW0();
            } else {
                j3 = j;
            }
            if ((i2 & 4) != 0) {
                j4 = m26510d(drawScope, drawScope.mo72144getSizeNHjbRc(), j3);
            } else {
                j4 = j2;
            }
            if ((i2 & 8) != 0) {
                f2 = 1.0f;
            } else {
                f2 = f;
            }
            if ((i2 & 16) != 0) {
                drawStyle2 = Fill.INSTANCE;
            } else {
                drawStyle2 = drawStyle;
            }
            if ((i2 & 32) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i2 & 64) != 0) {
                i3 = DrawScope.Companion.m72174getDefaultBlendMode0nO6VwU();
            } else {
                i3 = i;
            }
            drawScope.mo72139drawRectAsUm42w(brush, j3, j4, f2, drawStyle2, colorFilter2, i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-AsUm42w");
    }

    /* renamed from: K */
    public static /* synthetic */ void m26516K(DrawScope drawScope, long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        long j4;
        long j5;
        float f2;
        Fill fill;
        ColorFilter colorFilter2;
        int i3;
        if (obj == null) {
            if ((i2 & 2) != 0) {
                j4 = Offset.Companion.m71518getZeroF1C5BW0();
            } else {
                j4 = j2;
            }
            if ((i2 & 4) != 0) {
                j5 = m26510d(drawScope, drawScope.mo72144getSizeNHjbRc(), j4);
            } else {
                j5 = j3;
            }
            if ((i2 & 8) != 0) {
                f2 = 1.0f;
            } else {
                f2 = f;
            }
            if ((i2 & 16) != 0) {
                fill = Fill.INSTANCE;
            } else {
                fill = drawStyle;
            }
            if ((i2 & 32) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i2 & 64) != 0) {
                i3 = DrawScope.Companion.m72174getDefaultBlendMode0nO6VwU();
            } else {
                i3 = i;
            }
            drawScope.mo72140drawRectnJ9OG0(j, j4, j5, f2, fill, colorFilter2, i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-n-J9OG0");
    }

    /* renamed from: L */
    public static /* synthetic */ void m26515L(DrawScope drawScope, Brush brush, long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        long j4;
        long j5;
        long j6;
        float f2;
        DrawStyle drawStyle2;
        ColorFilter colorFilter2;
        int i3;
        if (obj == null) {
            if ((i2 & 2) != 0) {
                j4 = Offset.Companion.m71518getZeroF1C5BW0();
            } else {
                j4 = j;
            }
            if ((i2 & 4) != 0) {
                j5 = m26510d(drawScope, drawScope.mo72144getSizeNHjbRc(), j4);
            } else {
                j5 = j2;
            }
            if ((i2 & 8) != 0) {
                j6 = CornerRadius.Companion.m71487getZerokKHJgLs();
            } else {
                j6 = j3;
            }
            if ((i2 & 16) != 0) {
                f2 = 1.0f;
            } else {
                f2 = f;
            }
            if ((i2 & 32) != 0) {
                drawStyle2 = Fill.INSTANCE;
            } else {
                drawStyle2 = drawStyle;
            }
            if ((i2 & 64) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i2 & 128) != 0) {
                i3 = DrawScope.Companion.m72174getDefaultBlendMode0nO6VwU();
            } else {
                i3 = i;
            }
            drawScope.mo72141drawRoundRectZuiqVtQ(brush, j4, j5, j6, f2, drawStyle2, colorFilter2, i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-ZuiqVtQ");
    }

    /* renamed from: M */
    public static /* synthetic */ void m26514M(DrawScope drawScope, long j, long j2, long j3, long j4, DrawStyle drawStyle, float f, ColorFilter colorFilter, int i, int i2, Object obj) {
        long j5;
        long j6;
        long j7;
        Fill fill;
        float f2;
        ColorFilter colorFilter2;
        int i3;
        if (obj == null) {
            if ((i2 & 2) != 0) {
                j5 = Offset.Companion.m71518getZeroF1C5BW0();
            } else {
                j5 = j2;
            }
            if ((i2 & 4) != 0) {
                j6 = m26510d(drawScope, drawScope.mo72144getSizeNHjbRc(), j5);
            } else {
                j6 = j3;
            }
            if ((i2 & 8) != 0) {
                j7 = CornerRadius.Companion.m71487getZerokKHJgLs();
            } else {
                j7 = j4;
            }
            if ((i2 & 16) != 0) {
                fill = Fill.INSTANCE;
            } else {
                fill = drawStyle;
            }
            if ((i2 & 32) != 0) {
                f2 = 1.0f;
            } else {
                f2 = f;
            }
            if ((i2 & 64) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i2 & 128) != 0) {
                i3 = DrawScope.Companion.m72174getDefaultBlendMode0nO6VwU();
            } else {
                i3 = i;
            }
            drawScope.mo72142drawRoundRectuAw5IA(j, j5, j6, j7, fill, f2, colorFilter2, i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-u-Aw5IA");
    }

    /* renamed from: a */
    public static void m26513a(DrawScope drawScope, ImageBitmap image, long j, long j2, long j3, long j4, float f, DrawStyle style, ColorFilter colorFilter, int i, int i2) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(style, "style");
        m26488z(drawScope, image, j, j2, j3, j4, f, style, colorFilter, i, 0, 512, null);
    }

    /* renamed from: b */
    public static long m26512b(DrawScope drawScope) {
        return SizeKt.m71581getCenteruvyYCjk(drawScope.getDrawContext().mo72150getSizeNHjbRc());
    }

    /* renamed from: c */
    public static long m26511c(DrawScope drawScope) {
        return drawScope.getDrawContext().mo72150getSizeNHjbRc();
    }

    /* renamed from: d */
    public static long m26510d(DrawScope drawScope, long j, long j2) {
        return SizeKt.Size(Size.m71571getWidthimpl(j) - Offset.m71502getXimpl(j2), Size.m71568getHeightimpl(j) - Offset.m71503getYimpl(j2));
    }

    /* renamed from: u */
    public static /* synthetic */ void m26493u(DrawScope drawScope, Brush brush, float f, float f2, boolean z, long j, long j2, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        long j3;
        long j4;
        float f4;
        Fill fill;
        ColorFilter colorFilter2;
        int i3;
        if (obj == null) {
            if ((i2 & 16) != 0) {
                j3 = Offset.Companion.m71518getZeroF1C5BW0();
            } else {
                j3 = j;
            }
            if ((i2 & 32) != 0) {
                j4 = m26510d(drawScope, drawScope.mo72144getSizeNHjbRc(), j3);
            } else {
                j4 = j2;
            }
            if ((i2 & 64) != 0) {
                f4 = 1.0f;
            } else {
                f4 = f3;
            }
            if ((i2 & 128) != 0) {
                fill = Fill.INSTANCE;
            } else {
                fill = drawStyle;
            }
            if ((i2 & 256) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i2 & 512) != 0) {
                i3 = DrawScope.Companion.m72174getDefaultBlendMode0nO6VwU();
            } else {
                i3 = i;
            }
            drawScope.mo72124drawArcillE91I(brush, f, f2, z, j3, j4, f4, fill, colorFilter2, i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-illE91I");
    }

    /* renamed from: v */
    public static /* synthetic */ void m26492v(DrawScope drawScope, long j, float f, float f2, boolean z, long j2, long j3, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        long j4;
        long j5;
        float f4;
        Fill fill;
        ColorFilter colorFilter2;
        int i3;
        if (obj == null) {
            if ((i2 & 16) != 0) {
                j4 = Offset.Companion.m71518getZeroF1C5BW0();
            } else {
                j4 = j2;
            }
            if ((i2 & 32) != 0) {
                j5 = m26510d(drawScope, drawScope.mo72144getSizeNHjbRc(), j4);
            } else {
                j5 = j3;
            }
            if ((i2 & 64) != 0) {
                f4 = 1.0f;
            } else {
                f4 = f3;
            }
            if ((i2 & 128) != 0) {
                fill = Fill.INSTANCE;
            } else {
                fill = drawStyle;
            }
            if ((i2 & 256) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i2 & 512) != 0) {
                i3 = DrawScope.Companion.m72174getDefaultBlendMode0nO6VwU();
            } else {
                i3 = i;
            }
            drawScope.mo72125drawArcyD3GUKo(j, f, f2, z, j4, j5, f4, fill, colorFilter2, i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-yD3GUKo");
    }

    /* renamed from: w */
    public static /* synthetic */ void m26491w(DrawScope drawScope, Brush brush, float f, long j, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        float f3;
        long j2;
        float f4;
        DrawStyle drawStyle2;
        ColorFilter colorFilter2;
        int i3;
        if (obj == null) {
            if ((i2 & 2) != 0) {
                f3 = Size.m71570getMinDimensionimpl(drawScope.mo72144getSizeNHjbRc()) / 2.0f;
            } else {
                f3 = f;
            }
            if ((i2 & 4) != 0) {
                j2 = drawScope.mo72143getCenterF1C5BW0();
            } else {
                j2 = j;
            }
            if ((i2 & 8) != 0) {
                f4 = 1.0f;
            } else {
                f4 = f2;
            }
            if ((i2 & 16) != 0) {
                drawStyle2 = Fill.INSTANCE;
            } else {
                drawStyle2 = drawStyle;
            }
            if ((i2 & 32) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i2 & 64) != 0) {
                i3 = DrawScope.Companion.m72174getDefaultBlendMode0nO6VwU();
            } else {
                i3 = i;
            }
            drawScope.mo72126drawCircleV9BoPsw(brush, f3, j2, f4, drawStyle2, colorFilter2, i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-V9BoPsw");
    }

    /* renamed from: x */
    public static /* synthetic */ void m26490x(DrawScope drawScope, long j, float f, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        float f3;
        long j3;
        float f4;
        Fill fill;
        ColorFilter colorFilter2;
        int i3;
        if (obj == null) {
            if ((i2 & 2) != 0) {
                f3 = Size.m71570getMinDimensionimpl(drawScope.mo72144getSizeNHjbRc()) / 2.0f;
            } else {
                f3 = f;
            }
            if ((i2 & 4) != 0) {
                j3 = drawScope.mo72143getCenterF1C5BW0();
            } else {
                j3 = j2;
            }
            if ((i2 & 8) != 0) {
                f4 = 1.0f;
            } else {
                f4 = f2;
            }
            if ((i2 & 16) != 0) {
                fill = Fill.INSTANCE;
            } else {
                fill = drawStyle;
            }
            if ((i2 & 32) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i2 & 64) != 0) {
                i3 = DrawScope.Companion.m72174getDefaultBlendMode0nO6VwU();
            } else {
                i3 = i;
            }
            drawScope.mo72127drawCircleVaOC9Bg(j, f3, j3, f4, fill, colorFilter2, i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-VaOC9Bg");
    }

    /* renamed from: y */
    public static /* synthetic */ void m26489y(DrawScope drawScope, ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        long j5;
        long j6;
        long j7;
        long j8;
        float f2;
        DrawStyle drawStyle2;
        ColorFilter colorFilter2;
        int i3;
        if (obj == null) {
            if ((i2 & 2) != 0) {
                j5 = IntOffset.Companion.m73786getZeronOccac();
            } else {
                j5 = j;
            }
            if ((i2 & 4) != 0) {
                j6 = IntSizeKt.IntSize(imageBitmap.getWidth(), imageBitmap.getHeight());
            } else {
                j6 = j2;
            }
            if ((i2 & 8) != 0) {
                j7 = IntOffset.Companion.m73786getZeronOccac();
            } else {
                j7 = j3;
            }
            if ((i2 & 16) != 0) {
                j8 = j6;
            } else {
                j8 = j4;
            }
            if ((i2 & 32) != 0) {
                f2 = 1.0f;
            } else {
                f2 = f;
            }
            if ((i2 & 64) != 0) {
                drawStyle2 = Fill.INSTANCE;
            } else {
                drawStyle2 = drawStyle;
            }
            if ((i2 & 128) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i2 & 256) != 0) {
                i3 = DrawScope.Companion.m72174getDefaultBlendMode0nO6VwU();
            } else {
                i3 = i;
            }
            drawScope.mo72128drawImage9jGpkUE(imageBitmap, j5, j6, j7, j8, f2, drawStyle2, colorFilter2, i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-9jGpkUE");
    }

    /* renamed from: z */
    public static /* synthetic */ void m26488z(DrawScope drawScope, ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, int i3, Object obj) {
        long j5;
        long j6;
        long j7;
        long j8;
        float f2;
        DrawStyle drawStyle2;
        ColorFilter colorFilter2;
        int i4;
        int i5;
        if (obj == null) {
            if ((i3 & 2) != 0) {
                j5 = IntOffset.Companion.m73786getZeronOccac();
            } else {
                j5 = j;
            }
            if ((i3 & 4) != 0) {
                j6 = IntSizeKt.IntSize(imageBitmap.getWidth(), imageBitmap.getHeight());
            } else {
                j6 = j2;
            }
            if ((i3 & 8) != 0) {
                j7 = IntOffset.Companion.m73786getZeronOccac();
            } else {
                j7 = j3;
            }
            if ((i3 & 16) != 0) {
                j8 = j6;
            } else {
                j8 = j4;
            }
            if ((i3 & 32) != 0) {
                f2 = 1.0f;
            } else {
                f2 = f;
            }
            if ((i3 & 64) != 0) {
                drawStyle2 = Fill.INSTANCE;
            } else {
                drawStyle2 = drawStyle;
            }
            if ((i3 & 128) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i3 & 256) != 0) {
                i4 = DrawScope.Companion.m72174getDefaultBlendMode0nO6VwU();
            } else {
                i4 = i;
            }
            if ((i3 & 512) != 0) {
                i5 = DrawScope.Companion.m72175getDefaultFilterQualityfv9h1I();
            } else {
                i5 = i2;
            }
            drawScope.mo72129drawImageAZ2fEMs(imageBitmap, j5, j6, j7, j8, f2, drawStyle2, colorFilter2, i4, i5);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-AZ2fEMs");
    }
}
