package androidx.compose.material3.tokens;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bZ\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR \u0010\u000f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR \u0010\u0012\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR \u0010\u0015\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR \u0010\u0018\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\bR \u0010\u001b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR \u0010\u001e\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001d\u0010\bR \u0010!\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\bR \u0010$\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\"\u0010\u0006\u001a\u0004\b#\u0010\bR \u0010'\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b&\u0010\bR \u0010*\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b(\u0010\u0006\u001a\u0004\b)\u0010\bR \u0010-\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\bR \u00100\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b.\u0010\u0006\u001a\u0004\b/\u0010\bR \u00103\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b2\u0010\bR \u00106\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b4\u0010\u0006\u001a\u0004\b5\u0010\bR \u00109\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b7\u0010\u0006\u001a\u0004\b8\u0010\bR \u0010<\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b:\u0010\u0006\u001a\u0004\b;\u0010\bR \u0010?\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b=\u0010\u0006\u001a\u0004\b>\u0010\bR \u0010B\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b@\u0010\u0006\u001a\u0004\bA\u0010\bR \u0010E\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bC\u0010\u0006\u001a\u0004\bD\u0010\bR \u0010H\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bF\u0010\u0006\u001a\u0004\bG\u0010\bR \u0010K\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bI\u0010\u0006\u001a\u0004\bJ\u0010\bR \u0010N\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bL\u0010\u0006\u001a\u0004\bM\u0010\bR \u0010Q\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bO\u0010\u0006\u001a\u0004\bP\u0010\bR \u0010T\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bR\u0010\u0006\u001a\u0004\bS\u0010\bR \u0010W\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bU\u0010\u0006\u001a\u0004\bV\u0010\bR \u0010Z\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bX\u0010\u0006\u001a\u0004\bY\u0010\bR \u0010]\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b[\u0010\u0006\u001a\u0004\b\\\u0010\b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006^"}, m29142d2 = {"Landroidx/compose/material3/tokens/ColorLightTokens;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Color;", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, "getBackground-0d7_KjU", "()J", "Background", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getError-0d7_KjU", "Error", OperatorName.CURVE_TO, "getErrorContainer-0d7_KjU", "ErrorContainer", "d", "getInverseOnSurface-0d7_KjU", "InverseOnSurface", "e", "getInversePrimary-0d7_KjU", "InversePrimary", OperatorName.FILL_NON_ZERO, "getInverseSurface-0d7_KjU", "InverseSurface", OperatorName.NON_STROKING_GRAY, "getOnBackground-0d7_KjU", "OnBackground", OperatorName.CLOSE_PATH, "getOnError-0d7_KjU", "OnError", "i", "getOnErrorContainer-0d7_KjU", "OnErrorContainer", OperatorName.SET_LINE_JOINSTYLE, "getOnPrimary-0d7_KjU", "OnPrimary", OperatorName.NON_STROKING_CMYK, "getOnPrimaryContainer-0d7_KjU", "OnPrimaryContainer", OperatorName.LINE_TO, "getOnSecondary-0d7_KjU", "OnSecondary", OperatorName.MOVE_TO, "getOnSecondaryContainer-0d7_KjU", "OnSecondaryContainer", OperatorName.ENDPATH, "getOnSurface-0d7_KjU", "OnSurface", "o", "getOnSurfaceVariant-0d7_KjU", "OnSurfaceVariant", "p", "getOnTertiary-0d7_KjU", "OnTertiary", OperatorName.SAVE, "getOnTertiaryContainer-0d7_KjU", "OnTertiaryContainer", PDPageLabelRange.STYLE_ROMAN_LOWER, "getOutline-0d7_KjU", "Outline", OperatorName.CLOSE_AND_STROKE, "getOutlineVariant-0d7_KjU", "OutlineVariant", "t", "getPrimary-0d7_KjU", "Primary", "u", "getPrimaryContainer-0d7_KjU", "PrimaryContainer", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "getScrim-0d7_KjU", "Scrim", OperatorName.SET_LINE_WIDTH, "getSecondary-0d7_KjU", "Secondary", "x", "getSecondaryContainer-0d7_KjU", "SecondaryContainer", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "getSurface-0d7_KjU", "Surface", "z", "getSurfaceTint-0d7_KjU", "SurfaceTint", "A", "getSurfaceVariant-0d7_KjU", "SurfaceVariant", "B", "getTertiary-0d7_KjU", "Tertiary", "C", "getTertiaryContainer-0d7_KjU", "TertiaryContainer", "material3_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ColorLightTokens {

    /* renamed from: A */
    public static final long f26766A;

    /* renamed from: B */
    public static final long f26767B;

    /* renamed from: C */
    public static final long f26768C;
    @NotNull
    public static final ColorLightTokens INSTANCE = new ColorLightTokens();

    /* renamed from: a */
    public static final long f26769a;

    /* renamed from: b */
    public static final long f26770b;

    /* renamed from: c */
    public static final long f26771c;

    /* renamed from: d */
    public static final long f26772d;

    /* renamed from: e */
    public static final long f26773e;

    /* renamed from: f */
    public static final long f26774f;

    /* renamed from: g */
    public static final long f26775g;

    /* renamed from: h */
    public static final long f26776h;

    /* renamed from: i */
    public static final long f26777i;

    /* renamed from: j */
    public static final long f26778j;

    /* renamed from: k */
    public static final long f26779k;

    /* renamed from: l */
    public static final long f26780l;

    /* renamed from: m */
    public static final long f26781m;

    /* renamed from: n */
    public static final long f26782n;

    /* renamed from: o */
    public static final long f26783o;

    /* renamed from: p */
    public static final long f26784p;

    /* renamed from: q */
    public static final long f26785q;

    /* renamed from: r */
    public static final long f26786r;

    /* renamed from: s */
    public static final long f26787s;

    /* renamed from: t */
    public static final long f26788t;

    /* renamed from: u */
    public static final long f26789u;

    /* renamed from: v */
    public static final long f26790v;

    /* renamed from: w */
    public static final long f26791w;

    /* renamed from: x */
    public static final long f26792x;

    /* renamed from: y */
    public static final long f26793y;

    /* renamed from: z */
    public static final long f26794z;

    static {
        PaletteTokens paletteTokens = PaletteTokens.INSTANCE;
        f26769a = paletteTokens.m71362getNeutral990d7_KjU();
        f26770b = paletteTokens.m71342getError400d7_KjU();
        f26771c = paletteTokens.m71347getError900d7_KjU();
        f26772d = paletteTokens.m71361getNeutral950d7_KjU();
        f26773e = paletteTokens.m71385getPrimary800d7_KjU();
        f26774f = paletteTokens.m71353getNeutral200d7_KjU();
        f26775g = paletteTokens.m71351getNeutral100d7_KjU();
        f26776h = paletteTokens.m71339getError1000d7_KjU();
        f26777i = paletteTokens.m71338getError100d7_KjU();
        f26778j = paletteTokens.m71378getPrimary1000d7_KjU();
        f26779k = paletteTokens.m71377getPrimary100d7_KjU();
        f26780l = paletteTokens.m71391getSecondary1000d7_KjU();
        f26781m = paletteTokens.m71390getSecondary100d7_KjU();
        f26782n = paletteTokens.m71351getNeutral100d7_KjU();
        f26783o = paletteTokens.m71367getNeutralVariant300d7_KjU();
        f26784p = paletteTokens.m71404getTertiary1000d7_KjU();
        f26785q = paletteTokens.m71403getTertiary100d7_KjU();
        f26786r = paletteTokens.m71369getNeutralVariant500d7_KjU();
        f26787s = paletteTokens.m71372getNeutralVariant800d7_KjU();
        long m71381getPrimary400d7_KjU = paletteTokens.m71381getPrimary400d7_KjU();
        f26788t = m71381getPrimary400d7_KjU;
        f26789u = paletteTokens.m71386getPrimary900d7_KjU();
        f26790v = paletteTokens.m71350getNeutral00d7_KjU();
        f26791w = paletteTokens.m71394getSecondary400d7_KjU();
        f26792x = paletteTokens.m71399getSecondary900d7_KjU();
        f26793y = paletteTokens.m71362getNeutral990d7_KjU();
        f26794z = m71381getPrimary400d7_KjU;
        f26766A = paletteTokens.m71373getNeutralVariant900d7_KjU();
        f26767B = paletteTokens.m71407getTertiary400d7_KjU();
        f26768C = paletteTokens.m71412getTertiary900d7_KjU();
    }

    /* renamed from: getBackground-0d7_KjU  reason: not valid java name */
    public final long m71071getBackground0d7_KjU() {
        return f26769a;
    }

    /* renamed from: getError-0d7_KjU  reason: not valid java name */
    public final long m71072getError0d7_KjU() {
        return f26770b;
    }

    /* renamed from: getErrorContainer-0d7_KjU  reason: not valid java name */
    public final long m71073getErrorContainer0d7_KjU() {
        return f26771c;
    }

    /* renamed from: getInverseOnSurface-0d7_KjU  reason: not valid java name */
    public final long m71074getInverseOnSurface0d7_KjU() {
        return f26772d;
    }

    /* renamed from: getInversePrimary-0d7_KjU  reason: not valid java name */
    public final long m71075getInversePrimary0d7_KjU() {
        return f26773e;
    }

    /* renamed from: getInverseSurface-0d7_KjU  reason: not valid java name */
    public final long m71076getInverseSurface0d7_KjU() {
        return f26774f;
    }

    /* renamed from: getOnBackground-0d7_KjU  reason: not valid java name */
    public final long m71077getOnBackground0d7_KjU() {
        return f26775g;
    }

    /* renamed from: getOnError-0d7_KjU  reason: not valid java name */
    public final long m71078getOnError0d7_KjU() {
        return f26776h;
    }

    /* renamed from: getOnErrorContainer-0d7_KjU  reason: not valid java name */
    public final long m71079getOnErrorContainer0d7_KjU() {
        return f26777i;
    }

    /* renamed from: getOnPrimary-0d7_KjU  reason: not valid java name */
    public final long m71080getOnPrimary0d7_KjU() {
        return f26778j;
    }

    /* renamed from: getOnPrimaryContainer-0d7_KjU  reason: not valid java name */
    public final long m71081getOnPrimaryContainer0d7_KjU() {
        return f26779k;
    }

    /* renamed from: getOnSecondary-0d7_KjU  reason: not valid java name */
    public final long m71082getOnSecondary0d7_KjU() {
        return f26780l;
    }

    /* renamed from: getOnSecondaryContainer-0d7_KjU  reason: not valid java name */
    public final long m71083getOnSecondaryContainer0d7_KjU() {
        return f26781m;
    }

    /* renamed from: getOnSurface-0d7_KjU  reason: not valid java name */
    public final long m71084getOnSurface0d7_KjU() {
        return f26782n;
    }

    /* renamed from: getOnSurfaceVariant-0d7_KjU  reason: not valid java name */
    public final long m71085getOnSurfaceVariant0d7_KjU() {
        return f26783o;
    }

    /* renamed from: getOnTertiary-0d7_KjU  reason: not valid java name */
    public final long m71086getOnTertiary0d7_KjU() {
        return f26784p;
    }

    /* renamed from: getOnTertiaryContainer-0d7_KjU  reason: not valid java name */
    public final long m71087getOnTertiaryContainer0d7_KjU() {
        return f26785q;
    }

    /* renamed from: getOutline-0d7_KjU  reason: not valid java name */
    public final long m71088getOutline0d7_KjU() {
        return f26786r;
    }

    /* renamed from: getOutlineVariant-0d7_KjU  reason: not valid java name */
    public final long m71089getOutlineVariant0d7_KjU() {
        return f26787s;
    }

    /* renamed from: getPrimary-0d7_KjU  reason: not valid java name */
    public final long m71090getPrimary0d7_KjU() {
        return f26788t;
    }

    /* renamed from: getPrimaryContainer-0d7_KjU  reason: not valid java name */
    public final long m71091getPrimaryContainer0d7_KjU() {
        return f26789u;
    }

    /* renamed from: getScrim-0d7_KjU  reason: not valid java name */
    public final long m71092getScrim0d7_KjU() {
        return f26790v;
    }

    /* renamed from: getSecondary-0d7_KjU  reason: not valid java name */
    public final long m71093getSecondary0d7_KjU() {
        return f26791w;
    }

    /* renamed from: getSecondaryContainer-0d7_KjU  reason: not valid java name */
    public final long m71094getSecondaryContainer0d7_KjU() {
        return f26792x;
    }

    /* renamed from: getSurface-0d7_KjU  reason: not valid java name */
    public final long m71095getSurface0d7_KjU() {
        return f26793y;
    }

    /* renamed from: getSurfaceTint-0d7_KjU  reason: not valid java name */
    public final long m71096getSurfaceTint0d7_KjU() {
        return f26794z;
    }

    /* renamed from: getSurfaceVariant-0d7_KjU  reason: not valid java name */
    public final long m71097getSurfaceVariant0d7_KjU() {
        return f26766A;
    }

    /* renamed from: getTertiary-0d7_KjU  reason: not valid java name */
    public final long m71098getTertiary0d7_KjU() {
        return f26767B;
    }

    /* renamed from: getTertiaryContainer-0d7_KjU  reason: not valid java name */
    public final long m71099getTertiaryContainer0d7_KjU() {
        return f26768C;
    }
}