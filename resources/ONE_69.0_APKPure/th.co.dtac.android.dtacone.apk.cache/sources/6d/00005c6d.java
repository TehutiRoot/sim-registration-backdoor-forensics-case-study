package androidx.compose.material3.tokens;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bZ\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR \u0010\u000f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR \u0010\u0012\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR \u0010\u0015\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR \u0010\u0018\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\bR \u0010\u001b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR \u0010\u001e\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001d\u0010\bR \u0010!\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\bR \u0010$\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\"\u0010\u0006\u001a\u0004\b#\u0010\bR \u0010'\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b&\u0010\bR \u0010*\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b(\u0010\u0006\u001a\u0004\b)\u0010\bR \u0010-\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\bR \u00100\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b.\u0010\u0006\u001a\u0004\b/\u0010\bR \u00103\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b2\u0010\bR \u00106\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b4\u0010\u0006\u001a\u0004\b5\u0010\bR \u00109\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b7\u0010\u0006\u001a\u0004\b8\u0010\bR \u0010<\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b:\u0010\u0006\u001a\u0004\b;\u0010\bR \u0010?\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b=\u0010\u0006\u001a\u0004\b>\u0010\bR \u0010B\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b@\u0010\u0006\u001a\u0004\bA\u0010\bR \u0010E\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bC\u0010\u0006\u001a\u0004\bD\u0010\bR \u0010H\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bF\u0010\u0006\u001a\u0004\bG\u0010\bR \u0010K\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bI\u0010\u0006\u001a\u0004\bJ\u0010\bR \u0010N\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bL\u0010\u0006\u001a\u0004\bM\u0010\bR \u0010Q\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bO\u0010\u0006\u001a\u0004\bP\u0010\bR \u0010T\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bR\u0010\u0006\u001a\u0004\bS\u0010\bR \u0010W\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bU\u0010\u0006\u001a\u0004\bV\u0010\bR \u0010Z\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bX\u0010\u0006\u001a\u0004\bY\u0010\bR \u0010]\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b[\u0010\u0006\u001a\u0004\b\\\u0010\b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006^"}, m29142d2 = {"Landroidx/compose/material3/tokens/ColorDarkTokens;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Color;", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, "getBackground-0d7_KjU", "()J", "Background", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getError-0d7_KjU", "Error", OperatorName.CURVE_TO, "getErrorContainer-0d7_KjU", "ErrorContainer", "d", "getInverseOnSurface-0d7_KjU", "InverseOnSurface", "e", "getInversePrimary-0d7_KjU", "InversePrimary", OperatorName.FILL_NON_ZERO, "getInverseSurface-0d7_KjU", "InverseSurface", OperatorName.NON_STROKING_GRAY, "getOnBackground-0d7_KjU", "OnBackground", OperatorName.CLOSE_PATH, "getOnError-0d7_KjU", "OnError", "i", "getOnErrorContainer-0d7_KjU", "OnErrorContainer", OperatorName.SET_LINE_JOINSTYLE, "getOnPrimary-0d7_KjU", "OnPrimary", OperatorName.NON_STROKING_CMYK, "getOnPrimaryContainer-0d7_KjU", "OnPrimaryContainer", OperatorName.LINE_TO, "getOnSecondary-0d7_KjU", "OnSecondary", OperatorName.MOVE_TO, "getOnSecondaryContainer-0d7_KjU", "OnSecondaryContainer", OperatorName.ENDPATH, "getOnSurface-0d7_KjU", "OnSurface", "o", "getOnSurfaceVariant-0d7_KjU", "OnSurfaceVariant", "p", "getOnTertiary-0d7_KjU", "OnTertiary", OperatorName.SAVE, "getOnTertiaryContainer-0d7_KjU", "OnTertiaryContainer", PDPageLabelRange.STYLE_ROMAN_LOWER, "getOutline-0d7_KjU", "Outline", OperatorName.CLOSE_AND_STROKE, "getOutlineVariant-0d7_KjU", "OutlineVariant", "t", "getPrimary-0d7_KjU", "Primary", "u", "getPrimaryContainer-0d7_KjU", "PrimaryContainer", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "getScrim-0d7_KjU", "Scrim", OperatorName.SET_LINE_WIDTH, "getSecondary-0d7_KjU", "Secondary", "x", "getSecondaryContainer-0d7_KjU", "SecondaryContainer", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "getSurface-0d7_KjU", "Surface", "z", "getSurfaceTint-0d7_KjU", "SurfaceTint", "A", "getSurfaceVariant-0d7_KjU", "SurfaceVariant", "B", "getTertiary-0d7_KjU", "Tertiary", "C", "getTertiaryContainer-0d7_KjU", "TertiaryContainer", "material3_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ColorDarkTokens {

    /* renamed from: A */
    public static final long f26737A;

    /* renamed from: B */
    public static final long f26738B;

    /* renamed from: C */
    public static final long f26739C;
    @NotNull
    public static final ColorDarkTokens INSTANCE = new ColorDarkTokens();

    /* renamed from: a */
    public static final long f26740a;

    /* renamed from: b */
    public static final long f26741b;

    /* renamed from: c */
    public static final long f26742c;

    /* renamed from: d */
    public static final long f26743d;

    /* renamed from: e */
    public static final long f26744e;

    /* renamed from: f */
    public static final long f26745f;

    /* renamed from: g */
    public static final long f26746g;

    /* renamed from: h */
    public static final long f26747h;

    /* renamed from: i */
    public static final long f26748i;

    /* renamed from: j */
    public static final long f26749j;

    /* renamed from: k */
    public static final long f26750k;

    /* renamed from: l */
    public static final long f26751l;

    /* renamed from: m */
    public static final long f26752m;

    /* renamed from: n */
    public static final long f26753n;

    /* renamed from: o */
    public static final long f26754o;

    /* renamed from: p */
    public static final long f26755p;

    /* renamed from: q */
    public static final long f26756q;

    /* renamed from: r */
    public static final long f26757r;

    /* renamed from: s */
    public static final long f26758s;

    /* renamed from: t */
    public static final long f26759t;

    /* renamed from: u */
    public static final long f26760u;

    /* renamed from: v */
    public static final long f26761v;

    /* renamed from: w */
    public static final long f26762w;

    /* renamed from: x */
    public static final long f26763x;

    /* renamed from: y */
    public static final long f26764y;

    /* renamed from: z */
    public static final long f26765z;

    static {
        PaletteTokens paletteTokens = PaletteTokens.INSTANCE;
        f26740a = paletteTokens.m71351getNeutral100d7_KjU();
        f26741b = paletteTokens.m71346getError800d7_KjU();
        f26742c = paletteTokens.m71341getError300d7_KjU();
        f26743d = paletteTokens.m71353getNeutral200d7_KjU();
        f26744e = paletteTokens.m71381getPrimary400d7_KjU();
        f26745f = paletteTokens.m71360getNeutral900d7_KjU();
        f26746g = paletteTokens.m71360getNeutral900d7_KjU();
        f26747h = paletteTokens.m71340getError200d7_KjU();
        f26748i = paletteTokens.m71347getError900d7_KjU();
        f26749j = paletteTokens.m71379getPrimary200d7_KjU();
        f26750k = paletteTokens.m71386getPrimary900d7_KjU();
        f26751l = paletteTokens.m71392getSecondary200d7_KjU();
        f26752m = paletteTokens.m71399getSecondary900d7_KjU();
        f26753n = paletteTokens.m71360getNeutral900d7_KjU();
        f26754o = paletteTokens.m71372getNeutralVariant800d7_KjU();
        f26755p = paletteTokens.m71405getTertiary200d7_KjU();
        f26756q = paletteTokens.m71412getTertiary900d7_KjU();
        f26757r = paletteTokens.m71370getNeutralVariant600d7_KjU();
        f26758s = paletteTokens.m71367getNeutralVariant300d7_KjU();
        long m71385getPrimary800d7_KjU = paletteTokens.m71385getPrimary800d7_KjU();
        f26759t = m71385getPrimary800d7_KjU;
        f26760u = paletteTokens.m71380getPrimary300d7_KjU();
        f26761v = paletteTokens.m71350getNeutral00d7_KjU();
        f26762w = paletteTokens.m71398getSecondary800d7_KjU();
        f26763x = paletteTokens.m71393getSecondary300d7_KjU();
        f26764y = paletteTokens.m71351getNeutral100d7_KjU();
        f26765z = m71385getPrimary800d7_KjU;
        f26737A = paletteTokens.m71367getNeutralVariant300d7_KjU();
        f26738B = paletteTokens.m71411getTertiary800d7_KjU();
        f26739C = paletteTokens.m71406getTertiary300d7_KjU();
    }

    /* renamed from: getBackground-0d7_KjU  reason: not valid java name */
    public final long m71042getBackground0d7_KjU() {
        return f26740a;
    }

    /* renamed from: getError-0d7_KjU  reason: not valid java name */
    public final long m71043getError0d7_KjU() {
        return f26741b;
    }

    /* renamed from: getErrorContainer-0d7_KjU  reason: not valid java name */
    public final long m71044getErrorContainer0d7_KjU() {
        return f26742c;
    }

    /* renamed from: getInverseOnSurface-0d7_KjU  reason: not valid java name */
    public final long m71045getInverseOnSurface0d7_KjU() {
        return f26743d;
    }

    /* renamed from: getInversePrimary-0d7_KjU  reason: not valid java name */
    public final long m71046getInversePrimary0d7_KjU() {
        return f26744e;
    }

    /* renamed from: getInverseSurface-0d7_KjU  reason: not valid java name */
    public final long m71047getInverseSurface0d7_KjU() {
        return f26745f;
    }

    /* renamed from: getOnBackground-0d7_KjU  reason: not valid java name */
    public final long m71048getOnBackground0d7_KjU() {
        return f26746g;
    }

    /* renamed from: getOnError-0d7_KjU  reason: not valid java name */
    public final long m71049getOnError0d7_KjU() {
        return f26747h;
    }

    /* renamed from: getOnErrorContainer-0d7_KjU  reason: not valid java name */
    public final long m71050getOnErrorContainer0d7_KjU() {
        return f26748i;
    }

    /* renamed from: getOnPrimary-0d7_KjU  reason: not valid java name */
    public final long m71051getOnPrimary0d7_KjU() {
        return f26749j;
    }

    /* renamed from: getOnPrimaryContainer-0d7_KjU  reason: not valid java name */
    public final long m71052getOnPrimaryContainer0d7_KjU() {
        return f26750k;
    }

    /* renamed from: getOnSecondary-0d7_KjU  reason: not valid java name */
    public final long m71053getOnSecondary0d7_KjU() {
        return f26751l;
    }

    /* renamed from: getOnSecondaryContainer-0d7_KjU  reason: not valid java name */
    public final long m71054getOnSecondaryContainer0d7_KjU() {
        return f26752m;
    }

    /* renamed from: getOnSurface-0d7_KjU  reason: not valid java name */
    public final long m71055getOnSurface0d7_KjU() {
        return f26753n;
    }

    /* renamed from: getOnSurfaceVariant-0d7_KjU  reason: not valid java name */
    public final long m71056getOnSurfaceVariant0d7_KjU() {
        return f26754o;
    }

    /* renamed from: getOnTertiary-0d7_KjU  reason: not valid java name */
    public final long m71057getOnTertiary0d7_KjU() {
        return f26755p;
    }

    /* renamed from: getOnTertiaryContainer-0d7_KjU  reason: not valid java name */
    public final long m71058getOnTertiaryContainer0d7_KjU() {
        return f26756q;
    }

    /* renamed from: getOutline-0d7_KjU  reason: not valid java name */
    public final long m71059getOutline0d7_KjU() {
        return f26757r;
    }

    /* renamed from: getOutlineVariant-0d7_KjU  reason: not valid java name */
    public final long m71060getOutlineVariant0d7_KjU() {
        return f26758s;
    }

    /* renamed from: getPrimary-0d7_KjU  reason: not valid java name */
    public final long m71061getPrimary0d7_KjU() {
        return f26759t;
    }

    /* renamed from: getPrimaryContainer-0d7_KjU  reason: not valid java name */
    public final long m71062getPrimaryContainer0d7_KjU() {
        return f26760u;
    }

    /* renamed from: getScrim-0d7_KjU  reason: not valid java name */
    public final long m71063getScrim0d7_KjU() {
        return f26761v;
    }

    /* renamed from: getSecondary-0d7_KjU  reason: not valid java name */
    public final long m71064getSecondary0d7_KjU() {
        return f26762w;
    }

    /* renamed from: getSecondaryContainer-0d7_KjU  reason: not valid java name */
    public final long m71065getSecondaryContainer0d7_KjU() {
        return f26763x;
    }

    /* renamed from: getSurface-0d7_KjU  reason: not valid java name */
    public final long m71066getSurface0d7_KjU() {
        return f26764y;
    }

    /* renamed from: getSurfaceTint-0d7_KjU  reason: not valid java name */
    public final long m71067getSurfaceTint0d7_KjU() {
        return f26765z;
    }

    /* renamed from: getSurfaceVariant-0d7_KjU  reason: not valid java name */
    public final long m71068getSurfaceVariant0d7_KjU() {
        return f26737A;
    }

    /* renamed from: getTertiary-0d7_KjU  reason: not valid java name */
    public final long m71069getTertiary0d7_KjU() {
        return f26738B;
    }

    /* renamed from: getTertiaryContainer-0d7_KjU  reason: not valid java name */
    public final long m71070getTertiaryContainer0d7_KjU() {
        return f26739C;
    }
}