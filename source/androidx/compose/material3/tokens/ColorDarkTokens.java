package androidx.compose.material3.tokens;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bZ\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR \u0010\u000f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR \u0010\u0012\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR \u0010\u0015\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR \u0010\u0018\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\bR \u0010\u001b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR \u0010\u001e\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001d\u0010\bR \u0010!\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\bR \u0010$\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\"\u0010\u0006\u001a\u0004\b#\u0010\bR \u0010'\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b&\u0010\bR \u0010*\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b(\u0010\u0006\u001a\u0004\b)\u0010\bR \u0010-\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\bR \u00100\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b.\u0010\u0006\u001a\u0004\b/\u0010\bR \u00103\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b2\u0010\bR \u00106\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b4\u0010\u0006\u001a\u0004\b5\u0010\bR \u00109\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b7\u0010\u0006\u001a\u0004\b8\u0010\bR \u0010<\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b:\u0010\u0006\u001a\u0004\b;\u0010\bR \u0010?\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b=\u0010\u0006\u001a\u0004\b>\u0010\bR \u0010B\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b@\u0010\u0006\u001a\u0004\bA\u0010\bR \u0010E\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bC\u0010\u0006\u001a\u0004\bD\u0010\bR \u0010H\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bF\u0010\u0006\u001a\u0004\bG\u0010\bR \u0010K\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bI\u0010\u0006\u001a\u0004\bJ\u0010\bR \u0010N\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bL\u0010\u0006\u001a\u0004\bM\u0010\bR \u0010Q\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bO\u0010\u0006\u001a\u0004\bP\u0010\bR \u0010T\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bR\u0010\u0006\u001a\u0004\bS\u0010\bR \u0010W\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bU\u0010\u0006\u001a\u0004\bV\u0010\bR \u0010Z\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bX\u0010\u0006\u001a\u0004\bY\u0010\bR \u0010]\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b[\u0010\u0006\u001a\u0004\b\\\u0010\b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006^"}, m28850d2 = {"Landroidx/compose/material3/tokens/ColorDarkTokens;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Color;", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, "getBackground-0d7_KjU", "()J", "Background", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getError-0d7_KjU", "Error", OperatorName.CURVE_TO, "getErrorContainer-0d7_KjU", "ErrorContainer", "d", "getInverseOnSurface-0d7_KjU", "InverseOnSurface", "e", "getInversePrimary-0d7_KjU", "InversePrimary", OperatorName.FILL_NON_ZERO, "getInverseSurface-0d7_KjU", "InverseSurface", OperatorName.NON_STROKING_GRAY, "getOnBackground-0d7_KjU", "OnBackground", OperatorName.CLOSE_PATH, "getOnError-0d7_KjU", "OnError", "i", "getOnErrorContainer-0d7_KjU", "OnErrorContainer", OperatorName.SET_LINE_JOINSTYLE, "getOnPrimary-0d7_KjU", "OnPrimary", OperatorName.NON_STROKING_CMYK, "getOnPrimaryContainer-0d7_KjU", "OnPrimaryContainer", OperatorName.LINE_TO, "getOnSecondary-0d7_KjU", "OnSecondary", OperatorName.MOVE_TO, "getOnSecondaryContainer-0d7_KjU", "OnSecondaryContainer", OperatorName.ENDPATH, "getOnSurface-0d7_KjU", "OnSurface", "o", "getOnSurfaceVariant-0d7_KjU", "OnSurfaceVariant", "p", "getOnTertiary-0d7_KjU", "OnTertiary", OperatorName.SAVE, "getOnTertiaryContainer-0d7_KjU", "OnTertiaryContainer", PDPageLabelRange.STYLE_ROMAN_LOWER, "getOutline-0d7_KjU", "Outline", OperatorName.CLOSE_AND_STROKE, "getOutlineVariant-0d7_KjU", "OutlineVariant", "t", "getPrimary-0d7_KjU", "Primary", "u", "getPrimaryContainer-0d7_KjU", "PrimaryContainer", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "getScrim-0d7_KjU", "Scrim", OperatorName.SET_LINE_WIDTH, "getSecondary-0d7_KjU", "Secondary", "x", "getSecondaryContainer-0d7_KjU", "SecondaryContainer", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "getSurface-0d7_KjU", "Surface", "z", "getSurfaceTint-0d7_KjU", "SurfaceTint", "A", "getSurfaceVariant-0d7_KjU", "SurfaceVariant", "B", "getTertiary-0d7_KjU", "Tertiary", "C", "getTertiaryContainer-0d7_KjU", "TertiaryContainer", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ColorDarkTokens {

    /* renamed from: A */
    public static final long f26649A;

    /* renamed from: B */
    public static final long f26650B;

    /* renamed from: C */
    public static final long f26651C;
    @NotNull
    public static final ColorDarkTokens INSTANCE = new ColorDarkTokens();

    /* renamed from: a */
    public static final long f26652a;

    /* renamed from: b */
    public static final long f26653b;

    /* renamed from: c */
    public static final long f26654c;

    /* renamed from: d */
    public static final long f26655d;

    /* renamed from: e */
    public static final long f26656e;

    /* renamed from: f */
    public static final long f26657f;

    /* renamed from: g */
    public static final long f26658g;

    /* renamed from: h */
    public static final long f26659h;

    /* renamed from: i */
    public static final long f26660i;

    /* renamed from: j */
    public static final long f26661j;

    /* renamed from: k */
    public static final long f26662k;

    /* renamed from: l */
    public static final long f26663l;

    /* renamed from: m */
    public static final long f26664m;

    /* renamed from: n */
    public static final long f26665n;

    /* renamed from: o */
    public static final long f26666o;

    /* renamed from: p */
    public static final long f26667p;

    /* renamed from: q */
    public static final long f26668q;

    /* renamed from: r */
    public static final long f26669r;

    /* renamed from: s */
    public static final long f26670s;

    /* renamed from: t */
    public static final long f26671t;

    /* renamed from: u */
    public static final long f26672u;

    /* renamed from: v */
    public static final long f26673v;

    /* renamed from: w */
    public static final long f26674w;

    /* renamed from: x */
    public static final long f26675x;

    /* renamed from: y */
    public static final long f26676y;

    /* renamed from: z */
    public static final long f26677z;

    static {
        PaletteTokens paletteTokens = PaletteTokens.INSTANCE;
        f26652a = paletteTokens.m71167getNeutral100d7_KjU();
        f26653b = paletteTokens.m71162getError800d7_KjU();
        f26654c = paletteTokens.m71157getError300d7_KjU();
        f26655d = paletteTokens.m71169getNeutral200d7_KjU();
        f26656e = paletteTokens.m71197getPrimary400d7_KjU();
        f26657f = paletteTokens.m71176getNeutral900d7_KjU();
        f26658g = paletteTokens.m71176getNeutral900d7_KjU();
        f26659h = paletteTokens.m71156getError200d7_KjU();
        f26660i = paletteTokens.m71163getError900d7_KjU();
        f26661j = paletteTokens.m71195getPrimary200d7_KjU();
        f26662k = paletteTokens.m71202getPrimary900d7_KjU();
        f26663l = paletteTokens.m71208getSecondary200d7_KjU();
        f26664m = paletteTokens.m71215getSecondary900d7_KjU();
        f26665n = paletteTokens.m71176getNeutral900d7_KjU();
        f26666o = paletteTokens.m71188getNeutralVariant800d7_KjU();
        f26667p = paletteTokens.m71221getTertiary200d7_KjU();
        f26668q = paletteTokens.m71228getTertiary900d7_KjU();
        f26669r = paletteTokens.m71186getNeutralVariant600d7_KjU();
        f26670s = paletteTokens.m71183getNeutralVariant300d7_KjU();
        long m71201getPrimary800d7_KjU = paletteTokens.m71201getPrimary800d7_KjU();
        f26671t = m71201getPrimary800d7_KjU;
        f26672u = paletteTokens.m71196getPrimary300d7_KjU();
        f26673v = paletteTokens.m71166getNeutral00d7_KjU();
        f26674w = paletteTokens.m71214getSecondary800d7_KjU();
        f26675x = paletteTokens.m71209getSecondary300d7_KjU();
        f26676y = paletteTokens.m71167getNeutral100d7_KjU();
        f26677z = m71201getPrimary800d7_KjU;
        f26649A = paletteTokens.m71183getNeutralVariant300d7_KjU();
        f26650B = paletteTokens.m71227getTertiary800d7_KjU();
        f26651C = paletteTokens.m71222getTertiary300d7_KjU();
    }

    /* renamed from: getBackground-0d7_KjU  reason: not valid java name */
    public final long m70858getBackground0d7_KjU() {
        return f26652a;
    }

    /* renamed from: getError-0d7_KjU  reason: not valid java name */
    public final long m70859getError0d7_KjU() {
        return f26653b;
    }

    /* renamed from: getErrorContainer-0d7_KjU  reason: not valid java name */
    public final long m70860getErrorContainer0d7_KjU() {
        return f26654c;
    }

    /* renamed from: getInverseOnSurface-0d7_KjU  reason: not valid java name */
    public final long m70861getInverseOnSurface0d7_KjU() {
        return f26655d;
    }

    /* renamed from: getInversePrimary-0d7_KjU  reason: not valid java name */
    public final long m70862getInversePrimary0d7_KjU() {
        return f26656e;
    }

    /* renamed from: getInverseSurface-0d7_KjU  reason: not valid java name */
    public final long m70863getInverseSurface0d7_KjU() {
        return f26657f;
    }

    /* renamed from: getOnBackground-0d7_KjU  reason: not valid java name */
    public final long m70864getOnBackground0d7_KjU() {
        return f26658g;
    }

    /* renamed from: getOnError-0d7_KjU  reason: not valid java name */
    public final long m70865getOnError0d7_KjU() {
        return f26659h;
    }

    /* renamed from: getOnErrorContainer-0d7_KjU  reason: not valid java name */
    public final long m70866getOnErrorContainer0d7_KjU() {
        return f26660i;
    }

    /* renamed from: getOnPrimary-0d7_KjU  reason: not valid java name */
    public final long m70867getOnPrimary0d7_KjU() {
        return f26661j;
    }

    /* renamed from: getOnPrimaryContainer-0d7_KjU  reason: not valid java name */
    public final long m70868getOnPrimaryContainer0d7_KjU() {
        return f26662k;
    }

    /* renamed from: getOnSecondary-0d7_KjU  reason: not valid java name */
    public final long m70869getOnSecondary0d7_KjU() {
        return f26663l;
    }

    /* renamed from: getOnSecondaryContainer-0d7_KjU  reason: not valid java name */
    public final long m70870getOnSecondaryContainer0d7_KjU() {
        return f26664m;
    }

    /* renamed from: getOnSurface-0d7_KjU  reason: not valid java name */
    public final long m70871getOnSurface0d7_KjU() {
        return f26665n;
    }

    /* renamed from: getOnSurfaceVariant-0d7_KjU  reason: not valid java name */
    public final long m70872getOnSurfaceVariant0d7_KjU() {
        return f26666o;
    }

    /* renamed from: getOnTertiary-0d7_KjU  reason: not valid java name */
    public final long m70873getOnTertiary0d7_KjU() {
        return f26667p;
    }

    /* renamed from: getOnTertiaryContainer-0d7_KjU  reason: not valid java name */
    public final long m70874getOnTertiaryContainer0d7_KjU() {
        return f26668q;
    }

    /* renamed from: getOutline-0d7_KjU  reason: not valid java name */
    public final long m70875getOutline0d7_KjU() {
        return f26669r;
    }

    /* renamed from: getOutlineVariant-0d7_KjU  reason: not valid java name */
    public final long m70876getOutlineVariant0d7_KjU() {
        return f26670s;
    }

    /* renamed from: getPrimary-0d7_KjU  reason: not valid java name */
    public final long m70877getPrimary0d7_KjU() {
        return f26671t;
    }

    /* renamed from: getPrimaryContainer-0d7_KjU  reason: not valid java name */
    public final long m70878getPrimaryContainer0d7_KjU() {
        return f26672u;
    }

    /* renamed from: getScrim-0d7_KjU  reason: not valid java name */
    public final long m70879getScrim0d7_KjU() {
        return f26673v;
    }

    /* renamed from: getSecondary-0d7_KjU  reason: not valid java name */
    public final long m70880getSecondary0d7_KjU() {
        return f26674w;
    }

    /* renamed from: getSecondaryContainer-0d7_KjU  reason: not valid java name */
    public final long m70881getSecondaryContainer0d7_KjU() {
        return f26675x;
    }

    /* renamed from: getSurface-0d7_KjU  reason: not valid java name */
    public final long m70882getSurface0d7_KjU() {
        return f26676y;
    }

    /* renamed from: getSurfaceTint-0d7_KjU  reason: not valid java name */
    public final long m70883getSurfaceTint0d7_KjU() {
        return f26677z;
    }

    /* renamed from: getSurfaceVariant-0d7_KjU  reason: not valid java name */
    public final long m70884getSurfaceVariant0d7_KjU() {
        return f26649A;
    }

    /* renamed from: getTertiary-0d7_KjU  reason: not valid java name */
    public final long m70885getTertiary0d7_KjU() {
        return f26650B;
    }

    /* renamed from: getTertiaryContainer-0d7_KjU  reason: not valid java name */
    public final long m70886getTertiaryContainer0d7_KjU() {
        return f26651C;
    }
}
