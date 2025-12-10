package androidx.compose.p003ui.graphics.colorspace;

import androidx.exifinterface.media.ExifInterface;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0014\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\bR\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u0017\u0010\u001e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001d\u0010\bR\u0017\u0010!\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\bR\u001a\u0010'\u001a\u00020\"8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, m28850d2 = {"Landroidx/compose/ui/graphics/colorspace/Illuminant;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "getA", "()Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "A", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getB", "B", OperatorName.CURVE_TO, "getC", "C", "d", "getD50", "D50", "e", "getD55", "D55", OperatorName.FILL_NON_ZERO, "getD60", "D60", OperatorName.NON_STROKING_GRAY, "getD65", "D65", OperatorName.CLOSE_PATH, "getD75", "D75", "i", "getE", ExifInterface.LONGITUDE_EAST, "", OperatorName.SET_LINE_JOINSTYLE, "[F", "getD50Xyz$ui_graphics_release", "()[F", "D50Xyz", "ui-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.graphics.colorspace.Illuminant */
/* loaded from: classes2.dex */
public final class Illuminant {
    @NotNull
    public static final Illuminant INSTANCE = new Illuminant();

    /* renamed from: a */
    public static final WhitePoint f29262a = new WhitePoint(0.44757f, 0.40745f);

    /* renamed from: b */
    public static final WhitePoint f29263b = new WhitePoint(0.34842f, 0.35161f);

    /* renamed from: c */
    public static final WhitePoint f29264c = new WhitePoint(0.31006f, 0.31616f);

    /* renamed from: d */
    public static final WhitePoint f29265d = new WhitePoint(0.34567f, 0.3585f);

    /* renamed from: e */
    public static final WhitePoint f29266e = new WhitePoint(0.33242f, 0.34743f);

    /* renamed from: f */
    public static final WhitePoint f29267f = new WhitePoint(0.32168f, 0.33767f);

    /* renamed from: g */
    public static final WhitePoint f29268g = new WhitePoint(0.31271f, 0.32902f);

    /* renamed from: h */
    public static final WhitePoint f29269h = new WhitePoint(0.29902f, 0.31485f);

    /* renamed from: i */
    public static final WhitePoint f29270i = new WhitePoint(0.33333f, 0.33333f);

    /* renamed from: j */
    public static final float[] f29271j = {0.964212f, 1.0f, 0.825188f};

    @NotNull
    public final WhitePoint getA() {
        return f29262a;
    }

    @NotNull
    public final WhitePoint getB() {
        return f29263b;
    }

    @NotNull
    public final WhitePoint getC() {
        return f29264c;
    }

    @NotNull
    public final WhitePoint getD50() {
        return f29265d;
    }

    @NotNull
    public final float[] getD50Xyz$ui_graphics_release() {
        return f29271j;
    }

    @NotNull
    public final WhitePoint getD55() {
        return f29266e;
    }

    @NotNull
    public final WhitePoint getD60() {
        return f29267f;
    }

    @NotNull
    public final WhitePoint getD65() {
        return f29268g;
    }

    @NotNull
    public final WhitePoint getD75() {
        return f29269h;
    }

    @NotNull
    public final WhitePoint getE() {
        return f29270i;
    }
}
