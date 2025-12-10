package androidx.compose.p003ui.graphics;

import androidx.compose.p003ui.graphics.colorspace.ColorSpace;
import androidx.compose.p003ui.graphics.colorspace.ColorSpaceKt;
import androidx.compose.p003ui.graphics.colorspace.ColorSpaces;
import androidx.compose.p003ui.graphics.colorspace.Rgb;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.UnsignedKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal.p026ws.WebSocketProtocol;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087@\u0018\u0000 ;2\u00020\u0001:\u0001;B\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000bH\u0087\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u000bH\u0087\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u000bH\u0087\u0002¢\u0006\u0004\b\u0011\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u000bH\u0087\u0002¢\u0006\u0004\b\u0013\u0010\rJ\u0010\u0010\u0017\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0004\b\u0015\u0010\u0016J@\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000bH\u0007ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\"\u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0010\u0010&\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010+\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\u0007\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b1\u00102\u001a\u0004\b0\u0010\u0016R\u001a\u0010\u0019\u001a\u00020\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b4\u00102\u001a\u0004\b3\u0010\rR\u001a\u0010\u001a\u001a\u00020\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b6\u00102\u001a\u0004\b5\u0010\rR\u001a\u0010\u001b\u001a\u00020\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b8\u00102\u001a\u0004\b7\u0010\rR\u001a\u0010\u0018\u001a\u00020\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b:\u00102\u001a\u0004\b9\u0010\r\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006<"}, m28850d2 = {"Landroidx/compose/ui/graphics/Color;", "", "Lkotlin/ULong;", "value", "constructor-impl", "(J)J", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "colorSpace", "convert-vNxB06k", "(JLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "convert", "", "component1-impl", "(J)F", "component1", "component2-impl", "component2", "component3-impl", "component3", "component4-impl", "component4", "component5-impl", "(J)Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "component5", "alpha", "red", "green", "blue", "copy-wmQWz5c", "(JFFFF)J", "copy", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "hashCode-impl", "(J)I", "hashCode", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, "getValue-s-VKNKU", "()J", "getColorSpace-impl", "getColorSpace$annotations", "()V", "getRed-impl", "getRed$annotations", "getGreen-impl", "getGreen$annotations", "getBlue-impl", "getBlue$annotations", "getAlpha-impl", "getAlpha$annotations", "Companion", "ui-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nColor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/Color\n+ 2 ColorSpaces.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpaces\n*L\n1#1,672:1\n320#2:673\n*S KotlinDebug\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/Color\n*L\n123#1:673\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.Color */
/* loaded from: classes2.dex */
public final class Color {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: b */
    public static final long f29033b = ColorKt.Color(4278190080L);

    /* renamed from: c */
    public static final long f29034c = ColorKt.Color(4282664004L);

    /* renamed from: d */
    public static final long f29035d = ColorKt.Color(4287137928L);

    /* renamed from: e */
    public static final long f29036e = ColorKt.Color(4291611852L);

    /* renamed from: f */
    public static final long f29037f = ColorKt.Color((long) BodyPartID.bodyIdMax);

    /* renamed from: g */
    public static final long f29038g = ColorKt.Color(4294901760L);

    /* renamed from: h */
    public static final long f29039h = ColorKt.Color(4278255360L);

    /* renamed from: i */
    public static final long f29040i = ColorKt.Color(4278190335L);

    /* renamed from: j */
    public static final long f29041j = ColorKt.Color(4294967040L);

    /* renamed from: k */
    public static final long f29042k = ColorKt.Color(4278255615L);

    /* renamed from: l */
    public static final long f29043l = ColorKt.Color(4294902015L);

    /* renamed from: m */
    public static final long f29044m = ColorKt.Color(0);

    /* renamed from: n */
    public static final long f29045n = ColorKt.Color(0.0f, 0.0f, 0.0f, 0.0f, ColorSpaces.INSTANCE.getUnspecified$ui_graphics_release());

    /* renamed from: a */
    public final long f29046a;

    @Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b0\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000bJB\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u0012ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0015\u0010\u0016JB\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u0012ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0019\u0010\u0016R)\u0010\u001b\u001a\u00020\u00148\u0006X\u0087\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001f\u0010\u0003\u001a\u0004\b\u001d\u0010\u001eR)\u0010 \u001a\u00020\u00148\u0006X\u0087\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b \u0010\u001c\u0012\u0004\b\"\u0010\u0003\u001a\u0004\b!\u0010\u001eR)\u0010#\u001a\u00020\u00148\u0006X\u0087\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b#\u0010\u001c\u0012\u0004\b%\u0010\u0003\u001a\u0004\b$\u0010\u001eR)\u0010&\u001a\u00020\u00148\u0006X\u0087\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b&\u0010\u001c\u0012\u0004\b(\u0010\u0003\u001a\u0004\b'\u0010\u001eR)\u0010)\u001a\u00020\u00148\u0006X\u0087\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b)\u0010\u001c\u0012\u0004\b+\u0010\u0003\u001a\u0004\b*\u0010\u001eR)\u0010,\u001a\u00020\u00148\u0006X\u0087\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b,\u0010\u001c\u0012\u0004\b.\u0010\u0003\u001a\u0004\b-\u0010\u001eR)\u0010/\u001a\u00020\u00148\u0006X\u0087\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b/\u0010\u001c\u0012\u0004\b1\u0010\u0003\u001a\u0004\b0\u0010\u001eR)\u00102\u001a\u00020\u00148\u0006X\u0087\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b2\u0010\u001c\u0012\u0004\b4\u0010\u0003\u001a\u0004\b3\u0010\u001eR)\u00105\u001a\u00020\u00148\u0006X\u0087\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b5\u0010\u001c\u0012\u0004\b7\u0010\u0003\u001a\u0004\b6\u0010\u001eR)\u00108\u001a\u00020\u00148\u0006X\u0087\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b8\u0010\u001c\u0012\u0004\b:\u0010\u0003\u001a\u0004\b9\u0010\u001eR)\u0010;\u001a\u00020\u00148\u0006X\u0087\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b;\u0010\u001c\u0012\u0004\b=\u0010\u0003\u001a\u0004\b<\u0010\u001eR)\u0010>\u001a\u00020\u00148\u0006X\u0087\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b>\u0010\u001c\u0012\u0004\b@\u0010\u0003\u001a\u0004\b?\u0010\u001eR)\u0010A\u001a\u00020\u00148\u0006X\u0087\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\bA\u0010\u001c\u0012\u0004\bC\u0010\u0003\u001a\u0004\bB\u0010\u001e\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006D"}, m28850d2 = {"Landroidx/compose/ui/graphics/Color$Companion;", "", "<init>", "()V", "", OperatorName.ENDPATH, "", OperatorName.CLOSE_PATH, OperatorName.CLOSE_AND_STROKE, OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(IFFF)F", OperatorName.LINE_TO, PDPageLabelRange.STYLE_LETTERS_LOWER, "hue", "saturation", "value", "alpha", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "colorSpace", "Landroidx/compose/ui/graphics/Color;", "hsv-JlNiLsg", "(FFFFLandroidx/compose/ui/graphics/colorspace/Rgb;)J", "hsv", "lightness", "hsl-JlNiLsg", "hsl", "Black", OperatorName.SET_LINE_CAPSTYLE, "getBlack-0d7_KjU", "()J", "getBlack-0d7_KjU$annotations", "DarkGray", "getDarkGray-0d7_KjU", "getDarkGray-0d7_KjU$annotations", "Gray", "getGray-0d7_KjU", "getGray-0d7_KjU$annotations", "LightGray", "getLightGray-0d7_KjU", "getLightGray-0d7_KjU$annotations", "White", "getWhite-0d7_KjU", "getWhite-0d7_KjU$annotations", "Red", "getRed-0d7_KjU", "getRed-0d7_KjU$annotations", "Green", "getGreen-0d7_KjU", "getGreen-0d7_KjU$annotations", "Blue", "getBlue-0d7_KjU", "getBlue-0d7_KjU$annotations", "Yellow", "getYellow-0d7_KjU", "getYellow-0d7_KjU$annotations", "Cyan", "getCyan-0d7_KjU", "getCyan-0d7_KjU$annotations", "Magenta", "getMagenta-0d7_KjU", "getMagenta-0d7_KjU$annotations", "Transparent", "getTransparent-0d7_KjU", "getTransparent-0d7_KjU$annotations", "Unspecified", "getUnspecified-0d7_KjU", "getUnspecified-0d7_KjU$annotations", "ui-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.graphics.Color$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Stable
        /* renamed from: getBlack-0d7_KjU$annotations */
        public static /* synthetic */ void m71746getBlack0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getBlue-0d7_KjU$annotations */
        public static /* synthetic */ void m71747getBlue0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getCyan-0d7_KjU$annotations */
        public static /* synthetic */ void m71748getCyan0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getDarkGray-0d7_KjU$annotations */
        public static /* synthetic */ void m71749getDarkGray0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getGray-0d7_KjU$annotations */
        public static /* synthetic */ void m71750getGray0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getGreen-0d7_KjU$annotations */
        public static /* synthetic */ void m71751getGreen0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getLightGray-0d7_KjU$annotations */
        public static /* synthetic */ void m71752getLightGray0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getMagenta-0d7_KjU$annotations */
        public static /* synthetic */ void m71753getMagenta0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getRed-0d7_KjU$annotations */
        public static /* synthetic */ void m71754getRed0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getTransparent-0d7_KjU$annotations */
        public static /* synthetic */ void m71755getTransparent0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getUnspecified-0d7_KjU$annotations */
        public static /* synthetic */ void m71756getUnspecified0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getWhite-0d7_KjU$annotations */
        public static /* synthetic */ void m71757getWhite0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getYellow-0d7_KjU$annotations */
        public static /* synthetic */ void m71758getYellow0d7_KjU$annotations() {
        }

        /* renamed from: hsl-JlNiLsg$default */
        public static /* synthetic */ long m71759hslJlNiLsg$default(Companion companion, float f, float f2, float f3, float f4, Rgb rgb, int i, Object obj) {
            float f5;
            if ((i & 8) != 0) {
                f5 = 1.0f;
            } else {
                f5 = f4;
            }
            if ((i & 16) != 0) {
                rgb = ColorSpaces.INSTANCE.getSrgb();
            }
            return companion.m71774hslJlNiLsg(f, f2, f3, f5, rgb);
        }

        /* renamed from: hsv-JlNiLsg$default */
        public static /* synthetic */ long m71760hsvJlNiLsg$default(Companion companion, float f, float f2, float f3, float f4, Rgb rgb, int i, Object obj) {
            float f5;
            if ((i & 8) != 0) {
                f5 = 1.0f;
            } else {
                f5 = f4;
            }
            if ((i & 16) != 0) {
                rgb = ColorSpaces.INSTANCE.getSrgb();
            }
            return companion.m71775hsvJlNiLsg(f, f2, f3, f5, rgb);
        }

        /* renamed from: a */
        public final float m59753a(int i, float f, float f2, float f3) {
            float f4 = (i + (f / 30.0f)) % 12.0f;
            return f3 - ((f2 * Math.min(f3, 1.0f - f3)) * Math.max(-1.0f, Math.min(f4 - 3, Math.min(9 - f4, 1.0f))));
        }

        /* renamed from: b */
        public final float m59752b(int i, float f, float f2, float f3) {
            float f4 = (i + (f / 60.0f)) % 6.0f;
            return f3 - ((f2 * f3) * Math.max(0.0f, Math.min(f4, Math.min(4 - f4, 1.0f))));
        }

        /* renamed from: getBlack-0d7_KjU */
        public final long m71761getBlack0d7_KjU() {
            return Color.f29033b;
        }

        /* renamed from: getBlue-0d7_KjU */
        public final long m71762getBlue0d7_KjU() {
            return Color.f29040i;
        }

        /* renamed from: getCyan-0d7_KjU */
        public final long m71763getCyan0d7_KjU() {
            return Color.f29042k;
        }

        /* renamed from: getDarkGray-0d7_KjU */
        public final long m71764getDarkGray0d7_KjU() {
            return Color.f29034c;
        }

        /* renamed from: getGray-0d7_KjU */
        public final long m71765getGray0d7_KjU() {
            return Color.f29035d;
        }

        /* renamed from: getGreen-0d7_KjU */
        public final long m71766getGreen0d7_KjU() {
            return Color.f29039h;
        }

        /* renamed from: getLightGray-0d7_KjU */
        public final long m71767getLightGray0d7_KjU() {
            return Color.f29036e;
        }

        /* renamed from: getMagenta-0d7_KjU */
        public final long m71768getMagenta0d7_KjU() {
            return Color.f29043l;
        }

        /* renamed from: getRed-0d7_KjU */
        public final long m71769getRed0d7_KjU() {
            return Color.f29038g;
        }

        /* renamed from: getTransparent-0d7_KjU */
        public final long m71770getTransparent0d7_KjU() {
            return Color.f29044m;
        }

        /* renamed from: getUnspecified-0d7_KjU */
        public final long m71771getUnspecified0d7_KjU() {
            return Color.f29045n;
        }

        /* renamed from: getWhite-0d7_KjU */
        public final long m71772getWhite0d7_KjU() {
            return Color.f29037f;
        }

        /* renamed from: getYellow-0d7_KjU */
        public final long m71773getYellow0d7_KjU() {
            return Color.f29041j;
        }

        /* renamed from: hsl-JlNiLsg */
        public final long m71774hslJlNiLsg(float f, float f2, float f3, float f4, @NotNull Rgb colorSpace) {
            Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
            if (0.0f <= f && f <= 360.0f && 0.0f <= f2 && f2 <= 1.0f && 0.0f <= f3 && f3 <= 1.0f) {
                return ColorKt.Color(m59753a(0, f, f2, f3), m59753a(8, f, f2, f3), m59753a(4, f, f2, f3), f4, colorSpace);
            }
            throw new IllegalArgumentException(("HSL (" + f + ", " + f2 + ", " + f3 + ") must be in range (0..360, 0..1, 0..1)").toString());
        }

        /* renamed from: hsv-JlNiLsg */
        public final long m71775hsvJlNiLsg(float f, float f2, float f3, float f4, @NotNull Rgb colorSpace) {
            Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
            if (0.0f <= f && f <= 360.0f && 0.0f <= f2 && f2 <= 1.0f && 0.0f <= f3 && f3 <= 1.0f) {
                return ColorKt.Color(m59752b(5, f, f2, f3), m59752b(3, f, f2, f3), m59752b(1, f, f2, f3), f4, colorSpace);
            }
            throw new IllegalArgumentException(("HSV (" + f + ", " + f2 + ", " + f3 + ") must be in range (0..360, 0..1, 0..1)").toString());
        }

        public Companion() {
        }
    }

    public /* synthetic */ Color(long j) {
        this.f29046a = j;
    }

    /* renamed from: box-impl */
    public static final /* synthetic */ Color m71725boximpl(long j) {
        return new Color(j);
    }

    @Stable
    /* renamed from: component1-impl */
    public static final float m71726component1impl(long j) {
        return m71741getRedimpl(j);
    }

    @Stable
    /* renamed from: component2-impl */
    public static final float m71727component2impl(long j) {
        return m71740getGreenimpl(j);
    }

    @Stable
    /* renamed from: component3-impl */
    public static final float m71728component3impl(long j) {
        return m71738getBlueimpl(j);
    }

    @Stable
    /* renamed from: component4-impl */
    public static final float m71729component4impl(long j) {
        return m71737getAlphaimpl(j);
    }

    @Stable
    @NotNull
    /* renamed from: component5-impl */
    public static final ColorSpace m71730component5impl(long j) {
        return m71739getColorSpaceimpl(j);
    }

    /* renamed from: constructor-impl */
    public static long m71731constructorimpl(long j) {
        return j;
    }

    /* renamed from: convert-vNxB06k */
    public static final long m71732convertvNxB06k(long j, @NotNull ColorSpace colorSpace) {
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        ColorSpace m71739getColorSpaceimpl = m71739getColorSpaceimpl(j);
        if (Intrinsics.areEqual(colorSpace, m71739getColorSpaceimpl)) {
            return j;
        }
        return ColorSpaceKt.m72108connectYBCOT_4$default(m71739getColorSpaceimpl, colorSpace, 0, 2, null).mo72110transformToColorwmQWz5c$ui_graphics_release(m71741getRedimpl(j), m71740getGreenimpl(j), m71738getBlueimpl(j), m71737getAlphaimpl(j));
    }

    @Stable
    /* renamed from: copy-wmQWz5c */
    public static final long m71733copywmQWz5c(long j, float f, float f2, float f3, float f4) {
        return ColorKt.Color(f2, f3, f4, f, m71739getColorSpaceimpl(j));
    }

    /* renamed from: copy-wmQWz5c$default */
    public static /* synthetic */ long m71734copywmQWz5c$default(long j, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m71737getAlphaimpl(j);
        }
        float f5 = f;
        if ((i & 2) != 0) {
            f2 = m71741getRedimpl(j);
        }
        float f6 = f2;
        if ((i & 4) != 0) {
            f3 = m71740getGreenimpl(j);
        }
        float f7 = f3;
        if ((i & 8) != 0) {
            f4 = m71738getBlueimpl(j);
        }
        return m71733copywmQWz5c(j, f5, f6, f7, f4);
    }

    /* renamed from: equals-impl */
    public static boolean m71735equalsimpl(long j, Object obj) {
        return (obj instanceof Color) && j == ((Color) obj).m71745unboximpl();
    }

    /* renamed from: equals-impl0 */
    public static final boolean m71736equalsimpl0(long j, long j2) {
        return ULong.m74148equalsimpl0(j, j2);
    }

    @Stable
    public static /* synthetic */ void getAlpha$annotations() {
    }

    /* renamed from: getAlpha-impl */
    public static final float m71737getAlphaimpl(long j) {
        float ulongToDouble;
        float f;
        if (ULong.m74146constructorimpl(63 & j) == 0) {
            ulongToDouble = (float) UnsignedKt.ulongToDouble(ULong.m74146constructorimpl(ULong.m74146constructorimpl(j >>> 56) & 255));
            f = 255.0f;
        } else {
            ulongToDouble = (float) UnsignedKt.ulongToDouble(ULong.m74146constructorimpl(ULong.m74146constructorimpl(j >>> 6) & 1023));
            f = 1023.0f;
        }
        return ulongToDouble / f;
    }

    @Stable
    public static /* synthetic */ void getBlue$annotations() {
    }

    /* renamed from: getBlue-impl */
    public static final float m71738getBlueimpl(long j) {
        if (ULong.m74146constructorimpl(63 & j) == 0) {
            return ((float) UnsignedKt.ulongToDouble(ULong.m74146constructorimpl(ULong.m74146constructorimpl(j >>> 32) & 255))) / 255.0f;
        }
        return Float16.m71852toFloatimpl(Float16.m71836constructorimpl((short) ULong.m74146constructorimpl(ULong.m74146constructorimpl(j >>> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX)));
    }

    @Stable
    public static /* synthetic */ void getColorSpace$annotations() {
    }

    @NotNull
    /* renamed from: getColorSpace-impl */
    public static final ColorSpace m71739getColorSpaceimpl(long j) {
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        return colorSpaces.getColorSpacesArray$ui_graphics_release()[(int) ULong.m74146constructorimpl(j & 63)];
    }

    @Stable
    public static /* synthetic */ void getGreen$annotations() {
    }

    /* renamed from: getGreen-impl */
    public static final float m71740getGreenimpl(long j) {
        if (ULong.m74146constructorimpl(63 & j) == 0) {
            return ((float) UnsignedKt.ulongToDouble(ULong.m74146constructorimpl(ULong.m74146constructorimpl(j >>> 40) & 255))) / 255.0f;
        }
        return Float16.m71852toFloatimpl(Float16.m71836constructorimpl((short) ULong.m74146constructorimpl(ULong.m74146constructorimpl(j >>> 32) & WebSocketProtocol.PAYLOAD_SHORT_MAX)));
    }

    @Stable
    public static /* synthetic */ void getRed$annotations() {
    }

    /* renamed from: getRed-impl */
    public static final float m71741getRedimpl(long j) {
        if (ULong.m74146constructorimpl(63 & j) == 0) {
            return ((float) UnsignedKt.ulongToDouble(ULong.m74146constructorimpl(ULong.m74146constructorimpl(j >>> 48) & 255))) / 255.0f;
        }
        return Float16.m71852toFloatimpl(Float16.m71836constructorimpl((short) ULong.m74146constructorimpl(ULong.m74146constructorimpl(j >>> 48) & WebSocketProtocol.PAYLOAD_SHORT_MAX)));
    }

    /* renamed from: hashCode-impl */
    public static int m71742hashCodeimpl(long j) {
        return ULong.m74149hashCodeimpl(j);
    }

    @NotNull
    /* renamed from: toString-impl */
    public static String m71743toStringimpl(long j) {
        return "Color(" + m71741getRedimpl(j) + ", " + m71740getGreenimpl(j) + ", " + m71738getBlueimpl(j) + ", " + m71737getAlphaimpl(j) + ", " + m71739getColorSpaceimpl(j).getName() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return m71735equalsimpl(this.f29046a, obj);
    }

    /* renamed from: getValue-s-VKNKU */
    public final long m71744getValuesVKNKU() {
        return this.f29046a;
    }

    public int hashCode() {
        return m71742hashCodeimpl(this.f29046a);
    }

    @NotNull
    public String toString() {
        return m71743toStringimpl(this.f29046a);
    }

    /* renamed from: unbox-impl */
    public final /* synthetic */ long m71745unboximpl() {
        return this.f29046a;
    }
}
