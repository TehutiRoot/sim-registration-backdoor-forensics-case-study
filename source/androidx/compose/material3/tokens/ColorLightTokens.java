package androidx.compose.material3.tokens;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bZ\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR \u0010\u000f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR \u0010\u0012\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR \u0010\u0015\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR \u0010\u0018\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\bR \u0010\u001b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR \u0010\u001e\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001d\u0010\bR \u0010!\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\bR \u0010$\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\"\u0010\u0006\u001a\u0004\b#\u0010\bR \u0010'\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b&\u0010\bR \u0010*\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b(\u0010\u0006\u001a\u0004\b)\u0010\bR \u0010-\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\bR \u00100\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b.\u0010\u0006\u001a\u0004\b/\u0010\bR \u00103\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b2\u0010\bR \u00106\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b4\u0010\u0006\u001a\u0004\b5\u0010\bR \u00109\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b7\u0010\u0006\u001a\u0004\b8\u0010\bR \u0010<\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b:\u0010\u0006\u001a\u0004\b;\u0010\bR \u0010?\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b=\u0010\u0006\u001a\u0004\b>\u0010\bR \u0010B\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b@\u0010\u0006\u001a\u0004\bA\u0010\bR \u0010E\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bC\u0010\u0006\u001a\u0004\bD\u0010\bR \u0010H\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bF\u0010\u0006\u001a\u0004\bG\u0010\bR \u0010K\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bI\u0010\u0006\u001a\u0004\bJ\u0010\bR \u0010N\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bL\u0010\u0006\u001a\u0004\bM\u0010\bR \u0010Q\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bO\u0010\u0006\u001a\u0004\bP\u0010\bR \u0010T\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bR\u0010\u0006\u001a\u0004\bS\u0010\bR \u0010W\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bU\u0010\u0006\u001a\u0004\bV\u0010\bR \u0010Z\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bX\u0010\u0006\u001a\u0004\bY\u0010\bR \u0010]\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b[\u0010\u0006\u001a\u0004\b\\\u0010\b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006^"}, m28850d2 = {"Landroidx/compose/material3/tokens/ColorLightTokens;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Color;", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, "getBackground-0d7_KjU", "()J", "Background", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getError-0d7_KjU", "Error", OperatorName.CURVE_TO, "getErrorContainer-0d7_KjU", "ErrorContainer", "d", "getInverseOnSurface-0d7_KjU", "InverseOnSurface", "e", "getInversePrimary-0d7_KjU", "InversePrimary", OperatorName.FILL_NON_ZERO, "getInverseSurface-0d7_KjU", "InverseSurface", OperatorName.NON_STROKING_GRAY, "getOnBackground-0d7_KjU", "OnBackground", OperatorName.CLOSE_PATH, "getOnError-0d7_KjU", "OnError", "i", "getOnErrorContainer-0d7_KjU", "OnErrorContainer", OperatorName.SET_LINE_JOINSTYLE, "getOnPrimary-0d7_KjU", "OnPrimary", OperatorName.NON_STROKING_CMYK, "getOnPrimaryContainer-0d7_KjU", "OnPrimaryContainer", OperatorName.LINE_TO, "getOnSecondary-0d7_KjU", "OnSecondary", OperatorName.MOVE_TO, "getOnSecondaryContainer-0d7_KjU", "OnSecondaryContainer", OperatorName.ENDPATH, "getOnSurface-0d7_KjU", "OnSurface", "o", "getOnSurfaceVariant-0d7_KjU", "OnSurfaceVariant", "p", "getOnTertiary-0d7_KjU", "OnTertiary", OperatorName.SAVE, "getOnTertiaryContainer-0d7_KjU", "OnTertiaryContainer", PDPageLabelRange.STYLE_ROMAN_LOWER, "getOutline-0d7_KjU", "Outline", OperatorName.CLOSE_AND_STROKE, "getOutlineVariant-0d7_KjU", "OutlineVariant", "t", "getPrimary-0d7_KjU", "Primary", "u", "getPrimaryContainer-0d7_KjU", "PrimaryContainer", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "getScrim-0d7_KjU", "Scrim", OperatorName.SET_LINE_WIDTH, "getSecondary-0d7_KjU", "Secondary", "x", "getSecondaryContainer-0d7_KjU", "SecondaryContainer", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "getSurface-0d7_KjU", "Surface", "z", "getSurfaceTint-0d7_KjU", "SurfaceTint", "A", "getSurfaceVariant-0d7_KjU", "SurfaceVariant", "B", "getTertiary-0d7_KjU", "Tertiary", "C", "getTertiaryContainer-0d7_KjU", "TertiaryContainer", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ColorLightTokens {

    /* renamed from: A */
    public static final long f26678A;

    /* renamed from: B */
    public static final long f26679B;

    /* renamed from: C */
    public static final long f26680C;
    @NotNull
    public static final ColorLightTokens INSTANCE = new ColorLightTokens();

    /* renamed from: a */
    public static final long f26681a;

    /* renamed from: b */
    public static final long f26682b;

    /* renamed from: c */
    public static final long f26683c;

    /* renamed from: d */
    public static final long f26684d;

    /* renamed from: e */
    public static final long f26685e;

    /* renamed from: f */
    public static final long f26686f;

    /* renamed from: g */
    public static final long f26687g;

    /* renamed from: h */
    public static final long f26688h;

    /* renamed from: i */
    public static final long f26689i;

    /* renamed from: j */
    public static final long f26690j;

    /* renamed from: k */
    public static final long f26691k;

    /* renamed from: l */
    public static final long f26692l;

    /* renamed from: m */
    public static final long f26693m;

    /* renamed from: n */
    public static final long f26694n;

    /* renamed from: o */
    public static final long f26695o;

    /* renamed from: p */
    public static final long f26696p;

    /* renamed from: q */
    public static final long f26697q;

    /* renamed from: r */
    public static final long f26698r;

    /* renamed from: s */
    public static final long f26699s;

    /* renamed from: t */
    public static final long f26700t;

    /* renamed from: u */
    public static final long f26701u;

    /* renamed from: v */
    public static final long f26702v;

    /* renamed from: w */
    public static final long f26703w;

    /* renamed from: x */
    public static final long f26704x;

    /* renamed from: y */
    public static final long f26705y;

    /* renamed from: z */
    public static final long f26706z;

    static {
        PaletteTokens paletteTokens = PaletteTokens.INSTANCE;
        f26681a = paletteTokens.m71178getNeutral990d7_KjU();
        f26682b = paletteTokens.m71158getError400d7_KjU();
        f26683c = paletteTokens.m71163getError900d7_KjU();
        f26684d = paletteTokens.m71177getNeutral950d7_KjU();
        f26685e = paletteTokens.m71201getPrimary800d7_KjU();
        f26686f = paletteTokens.m71169getNeutral200d7_KjU();
        f26687g = paletteTokens.m71167getNeutral100d7_KjU();
        f26688h = paletteTokens.m71155getError1000d7_KjU();
        f26689i = paletteTokens.m71154getError100d7_KjU();
        f26690j = paletteTokens.m71194getPrimary1000d7_KjU();
        f26691k = paletteTokens.m71193getPrimary100d7_KjU();
        f26692l = paletteTokens.m71207getSecondary1000d7_KjU();
        f26693m = paletteTokens.m71206getSecondary100d7_KjU();
        f26694n = paletteTokens.m71167getNeutral100d7_KjU();
        f26695o = paletteTokens.m71183getNeutralVariant300d7_KjU();
        f26696p = paletteTokens.m71220getTertiary1000d7_KjU();
        f26697q = paletteTokens.m71219getTertiary100d7_KjU();
        f26698r = paletteTokens.m71185getNeutralVariant500d7_KjU();
        f26699s = paletteTokens.m71188getNeutralVariant800d7_KjU();
        long m71197getPrimary400d7_KjU = paletteTokens.m71197getPrimary400d7_KjU();
        f26700t = m71197getPrimary400d7_KjU;
        f26701u = paletteTokens.m71202getPrimary900d7_KjU();
        f26702v = paletteTokens.m71166getNeutral00d7_KjU();
        f26703w = paletteTokens.m71210getSecondary400d7_KjU();
        f26704x = paletteTokens.m71215getSecondary900d7_KjU();
        f26705y = paletteTokens.m71178getNeutral990d7_KjU();
        f26706z = m71197getPrimary400d7_KjU;
        f26678A = paletteTokens.m71189getNeutralVariant900d7_KjU();
        f26679B = paletteTokens.m71223getTertiary400d7_KjU();
        f26680C = paletteTokens.m71228getTertiary900d7_KjU();
    }

    /* renamed from: getBackground-0d7_KjU  reason: not valid java name */
    public final long m70887getBackground0d7_KjU() {
        return f26681a;
    }

    /* renamed from: getError-0d7_KjU  reason: not valid java name */
    public final long m70888getError0d7_KjU() {
        return f26682b;
    }

    /* renamed from: getErrorContainer-0d7_KjU  reason: not valid java name */
    public final long m70889getErrorContainer0d7_KjU() {
        return f26683c;
    }

    /* renamed from: getInverseOnSurface-0d7_KjU  reason: not valid java name */
    public final long m70890getInverseOnSurface0d7_KjU() {
        return f26684d;
    }

    /* renamed from: getInversePrimary-0d7_KjU  reason: not valid java name */
    public final long m70891getInversePrimary0d7_KjU() {
        return f26685e;
    }

    /* renamed from: getInverseSurface-0d7_KjU  reason: not valid java name */
    public final long m70892getInverseSurface0d7_KjU() {
        return f26686f;
    }

    /* renamed from: getOnBackground-0d7_KjU  reason: not valid java name */
    public final long m70893getOnBackground0d7_KjU() {
        return f26687g;
    }

    /* renamed from: getOnError-0d7_KjU  reason: not valid java name */
    public final long m70894getOnError0d7_KjU() {
        return f26688h;
    }

    /* renamed from: getOnErrorContainer-0d7_KjU  reason: not valid java name */
    public final long m70895getOnErrorContainer0d7_KjU() {
        return f26689i;
    }

    /* renamed from: getOnPrimary-0d7_KjU  reason: not valid java name */
    public final long m70896getOnPrimary0d7_KjU() {
        return f26690j;
    }

    /* renamed from: getOnPrimaryContainer-0d7_KjU  reason: not valid java name */
    public final long m70897getOnPrimaryContainer0d7_KjU() {
        return f26691k;
    }

    /* renamed from: getOnSecondary-0d7_KjU  reason: not valid java name */
    public final long m70898getOnSecondary0d7_KjU() {
        return f26692l;
    }

    /* renamed from: getOnSecondaryContainer-0d7_KjU  reason: not valid java name */
    public final long m70899getOnSecondaryContainer0d7_KjU() {
        return f26693m;
    }

    /* renamed from: getOnSurface-0d7_KjU  reason: not valid java name */
    public final long m70900getOnSurface0d7_KjU() {
        return f26694n;
    }

    /* renamed from: getOnSurfaceVariant-0d7_KjU  reason: not valid java name */
    public final long m70901getOnSurfaceVariant0d7_KjU() {
        return f26695o;
    }

    /* renamed from: getOnTertiary-0d7_KjU  reason: not valid java name */
    public final long m70902getOnTertiary0d7_KjU() {
        return f26696p;
    }

    /* renamed from: getOnTertiaryContainer-0d7_KjU  reason: not valid java name */
    public final long m70903getOnTertiaryContainer0d7_KjU() {
        return f26697q;
    }

    /* renamed from: getOutline-0d7_KjU  reason: not valid java name */
    public final long m70904getOutline0d7_KjU() {
        return f26698r;
    }

    /* renamed from: getOutlineVariant-0d7_KjU  reason: not valid java name */
    public final long m70905getOutlineVariant0d7_KjU() {
        return f26699s;
    }

    /* renamed from: getPrimary-0d7_KjU  reason: not valid java name */
    public final long m70906getPrimary0d7_KjU() {
        return f26700t;
    }

    /* renamed from: getPrimaryContainer-0d7_KjU  reason: not valid java name */
    public final long m70907getPrimaryContainer0d7_KjU() {
        return f26701u;
    }

    /* renamed from: getScrim-0d7_KjU  reason: not valid java name */
    public final long m70908getScrim0d7_KjU() {
        return f26702v;
    }

    /* renamed from: getSecondary-0d7_KjU  reason: not valid java name */
    public final long m70909getSecondary0d7_KjU() {
        return f26703w;
    }

    /* renamed from: getSecondaryContainer-0d7_KjU  reason: not valid java name */
    public final long m70910getSecondaryContainer0d7_KjU() {
        return f26704x;
    }

    /* renamed from: getSurface-0d7_KjU  reason: not valid java name */
    public final long m70911getSurface0d7_KjU() {
        return f26705y;
    }

    /* renamed from: getSurfaceTint-0d7_KjU  reason: not valid java name */
    public final long m70912getSurfaceTint0d7_KjU() {
        return f26706z;
    }

    /* renamed from: getSurfaceVariant-0d7_KjU  reason: not valid java name */
    public final long m70913getSurfaceVariant0d7_KjU() {
        return f26678A;
    }

    /* renamed from: getTertiary-0d7_KjU  reason: not valid java name */
    public final long m70914getTertiary0d7_KjU() {
        return f26679B;
    }

    /* renamed from: getTertiaryContainer-0d7_KjU  reason: not valid java name */
    public final long m70915getTertiaryContainer0d7_KjU() {
        return f26680C;
    }
}
