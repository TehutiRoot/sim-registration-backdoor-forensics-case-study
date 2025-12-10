package p000;

import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Canvas;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.Shadow;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.graphics.drawscope.DrawStyle;
import androidx.compose.p003ui.text.Paragraph;
import androidx.compose.p003ui.text.style.TextDecoration;

/* renamed from: Ci1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC17439Ci1 {
    /* renamed from: a */
    public static /* synthetic */ int m68925a(Paragraph paragraph, int i, boolean z, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                z = false;
            }
            return paragraph.getLineEnd(i, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEnd");
    }

    /* renamed from: b */
    public static /* synthetic */ void m68924b(Paragraph paragraph, Canvas canvas, long j, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i, int i2, Object obj) {
        long j2;
        Shadow shadow2;
        TextDecoration textDecoration2;
        int i3;
        if (obj == null) {
            if ((i2 & 2) != 0) {
                j2 = Color.Companion.m71955getUnspecified0d7_KjU();
            } else {
                j2 = j;
            }
            DrawStyle drawStyle2 = null;
            if ((i2 & 4) != 0) {
                shadow2 = null;
            } else {
                shadow2 = shadow;
            }
            if ((i2 & 8) != 0) {
                textDecoration2 = null;
            } else {
                textDecoration2 = textDecoration;
            }
            if ((i2 & 16) == 0) {
                drawStyle2 = drawStyle;
            }
            if ((i2 & 32) != 0) {
                i3 = DrawScope.Companion.m72358getDefaultBlendMode0nO6VwU();
            } else {
                i3 = i;
            }
            paragraph.mo73272paintLG529CI(canvas, j2, shadow2, textDecoration2, drawStyle2, i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-LG529CI");
    }

    /* renamed from: c */
    public static /* synthetic */ void m68923c(Paragraph paragraph, Canvas canvas, long j, Shadow shadow, TextDecoration textDecoration, int i, Object obj) {
        Shadow shadow2;
        TextDecoration textDecoration2;
        if (obj == null) {
            if ((i & 2) != 0) {
                j = Color.Companion.m71955getUnspecified0d7_KjU();
            }
            long j2 = j;
            if ((i & 4) != 0) {
                shadow2 = null;
            } else {
                shadow2 = shadow;
            }
            if ((i & 8) != 0) {
                textDecoration2 = null;
            } else {
                textDecoration2 = textDecoration;
            }
            paragraph.mo73273paintRPmYEkk(canvas, j2, shadow2, textDecoration2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-RPmYEkk");
    }

    /* renamed from: d */
    public static /* synthetic */ void m68922d(Paragraph paragraph, Canvas canvas, Brush brush, float f, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i, int i2, Object obj) {
        float f2;
        Shadow shadow2;
        TextDecoration textDecoration2;
        DrawStyle drawStyle2;
        int i3;
        if (obj == null) {
            if ((i2 & 4) != 0) {
                f2 = Float.NaN;
            } else {
                f2 = f;
            }
            if ((i2 & 8) != 0) {
                shadow2 = null;
            } else {
                shadow2 = shadow;
            }
            if ((i2 & 16) != 0) {
                textDecoration2 = null;
            } else {
                textDecoration2 = textDecoration;
            }
            if ((i2 & 32) != 0) {
                drawStyle2 = null;
            } else {
                drawStyle2 = drawStyle;
            }
            if ((i2 & 64) != 0) {
                i3 = DrawScope.Companion.m72358getDefaultBlendMode0nO6VwU();
            } else {
                i3 = i;
            }
            paragraph.mo73274painthn5TExg(canvas, brush, f2, shadow2, textDecoration2, drawStyle2, i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-hn5TExg");
    }
}