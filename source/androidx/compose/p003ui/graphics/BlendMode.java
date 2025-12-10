package androidx.compose.p003ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.exifinterface.media.ExifInterface;
import com.tom_roush.fontbox.ttf.OpenTypeScript;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Immutable
@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0014\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0005J\u001a\u0010\u0010\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, m28850d2 = {"Landroidx/compose/ui/graphics/BlendMode;", "", "", "value", "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "Companion", "ui-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@JvmInline
/* renamed from: androidx.compose.ui.graphics.BlendMode */
/* loaded from: classes2.dex */
public final class BlendMode {

    /* renamed from: a */
    public final int f29017a;
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: b */
    public static final int f28992b = m71653constructorimpl(0);

    /* renamed from: c */
    public static final int f28993c = m71653constructorimpl(1);

    /* renamed from: d */
    public static final int f28994d = m71653constructorimpl(2);

    /* renamed from: e */
    public static final int f28995e = m71653constructorimpl(3);

    /* renamed from: f */
    public static final int f28996f = m71653constructorimpl(4);

    /* renamed from: g */
    public static final int f28997g = m71653constructorimpl(5);

    /* renamed from: h */
    public static final int f28998h = m71653constructorimpl(6);

    /* renamed from: i */
    public static final int f28999i = m71653constructorimpl(7);

    /* renamed from: j */
    public static final int f29000j = m71653constructorimpl(8);

    /* renamed from: k */
    public static final int f29001k = m71653constructorimpl(9);

    /* renamed from: l */
    public static final int f29002l = m71653constructorimpl(10);

    /* renamed from: m */
    public static final int f29003m = m71653constructorimpl(11);

    /* renamed from: n */
    public static final int f29004n = m71653constructorimpl(12);

    /* renamed from: o */
    public static final int f29005o = m71653constructorimpl(13);

    /* renamed from: p */
    public static final int f29006p = m71653constructorimpl(14);

    /* renamed from: q */
    public static final int f29007q = m71653constructorimpl(15);

    /* renamed from: r */
    public static final int f29008r = m71653constructorimpl(16);

    /* renamed from: s */
    public static final int f29009s = m71653constructorimpl(17);

    /* renamed from: t */
    public static final int f29010t = m71653constructorimpl(18);

    /* renamed from: u */
    public static final int f29011u = m71653constructorimpl(19);

    /* renamed from: v */
    public static final int f29012v = m71653constructorimpl(20);

    /* renamed from: w */
    public static final int f29013w = m71653constructorimpl(21);

    /* renamed from: x */
    public static final int f29014x = m71653constructorimpl(22);

    /* renamed from: y */
    public static final int f29015y = m71653constructorimpl(23);

    /* renamed from: z */
    public static final int f29016z = m71653constructorimpl(24);

    /* renamed from: A */
    public static final int f28988A = m71653constructorimpl(25);

    /* renamed from: B */
    public static final int f28989B = m71653constructorimpl(26);

    /* renamed from: C */
    public static final int f28990C = m71653constructorimpl(27);

    /* renamed from: D */
    public static final int f28991D = m71653constructorimpl(28);

    @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b<\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u001c\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u001c\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006R\u001c\u0010\u0010\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0011\u0010\u0006R\u001c\u0010\u0012\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0013\u0010\u0006R\u001c\u0010\u0014\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0015\u0010\u0006R\u001c\u0010\u0016\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0017\u0010\u0006R\u001c\u0010\u0018\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0019\u0010\u0006R\u001c\u0010\u001a\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001b\u0010\u0006R\u001c\u0010\u001c\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001d\u0010\u0006R\u001c\u0010\u001e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001f\u0010\u0006R\u001c\u0010 \u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b!\u0010\u0006R\u001c\u0010\"\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b#\u0010\u0006R\u001c\u0010$\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b%\u0010\u0006R\u001c\u0010&\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b'\u0010\u0006R\u001c\u0010(\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b)\u0010\u0006R\u001c\u0010*\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b+\u0010\u0006R\u001c\u0010,\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b-\u0010\u0006R\u001c\u0010.\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b/\u0010\u0006R\u001c\u00100\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b1\u0010\u0006R\u001c\u00102\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b3\u0010\u0006R\u001c\u00104\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b5\u0010\u0006R\u001c\u00106\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b7\u0010\u0006R\u001c\u00108\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b9\u0010\u0006R\u001c\u0010:\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b;\u0010\u0006R\u001c\u0010<\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b=\u0010\u0006R\u001c\u0010>\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b?\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006@"}, m28850d2 = {"Landroidx/compose/ui/graphics/BlendMode$Companion;", "", "()V", "Clear", "Landroidx/compose/ui/graphics/BlendMode;", "getClear-0nO6VwU", "()I", "I", "Color", "getColor-0nO6VwU", "ColorBurn", "getColorBurn-0nO6VwU", "ColorDodge", "getColorDodge-0nO6VwU", "Darken", "getDarken-0nO6VwU", "Difference", "getDifference-0nO6VwU", "Dst", "getDst-0nO6VwU", "DstAtop", "getDstAtop-0nO6VwU", "DstIn", "getDstIn-0nO6VwU", "DstOut", "getDstOut-0nO6VwU", "DstOver", "getDstOver-0nO6VwU", "Exclusion", "getExclusion-0nO6VwU", "Hardlight", "getHardlight-0nO6VwU", "Hue", "getHue-0nO6VwU", "Lighten", "getLighten-0nO6VwU", "Luminosity", "getLuminosity-0nO6VwU", "Modulate", "getModulate-0nO6VwU", "Multiply", "getMultiply-0nO6VwU", "Overlay", "getOverlay-0nO6VwU", "Plus", "getPlus-0nO6VwU", ExifInterface.TAG_SATURATION, "getSaturation-0nO6VwU", "Screen", "getScreen-0nO6VwU", "Softlight", "getSoftlight-0nO6VwU", "Src", "getSrc-0nO6VwU", "SrcAtop", "getSrcAtop-0nO6VwU", "SrcIn", "getSrcIn-0nO6VwU", "SrcOut", "getSrcOut-0nO6VwU", "SrcOver", "getSrcOver-0nO6VwU", "Xor", "getXor-0nO6VwU", "ui-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.graphics.BlendMode$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getClear-0nO6VwU  reason: not valid java name */
        public final int m71659getClear0nO6VwU() {
            return BlendMode.f28992b;
        }

        /* renamed from: getColor-0nO6VwU  reason: not valid java name */
        public final int m71660getColor0nO6VwU() {
            return BlendMode.f28990C;
        }

        /* renamed from: getColorBurn-0nO6VwU  reason: not valid java name */
        public final int m71661getColorBurn0nO6VwU() {
            return BlendMode.f29011u;
        }

        /* renamed from: getColorDodge-0nO6VwU  reason: not valid java name */
        public final int m71662getColorDodge0nO6VwU() {
            return BlendMode.f29010t;
        }

        /* renamed from: getDarken-0nO6VwU  reason: not valid java name */
        public final int m71663getDarken0nO6VwU() {
            return BlendMode.f29008r;
        }

        /* renamed from: getDifference-0nO6VwU  reason: not valid java name */
        public final int m71664getDifference0nO6VwU() {
            return BlendMode.f29014x;
        }

        /* renamed from: getDst-0nO6VwU  reason: not valid java name */
        public final int m71665getDst0nO6VwU() {
            return BlendMode.f28994d;
        }

        /* renamed from: getDstAtop-0nO6VwU  reason: not valid java name */
        public final int m71666getDstAtop0nO6VwU() {
            return BlendMode.f29002l;
        }

        /* renamed from: getDstIn-0nO6VwU  reason: not valid java name */
        public final int m71667getDstIn0nO6VwU() {
            return BlendMode.f28998h;
        }

        /* renamed from: getDstOut-0nO6VwU  reason: not valid java name */
        public final int m71668getDstOut0nO6VwU() {
            return BlendMode.f29000j;
        }

        /* renamed from: getDstOver-0nO6VwU  reason: not valid java name */
        public final int m71669getDstOver0nO6VwU() {
            return BlendMode.f28996f;
        }

        /* renamed from: getExclusion-0nO6VwU  reason: not valid java name */
        public final int m71670getExclusion0nO6VwU() {
            return BlendMode.f29015y;
        }

        /* renamed from: getHardlight-0nO6VwU  reason: not valid java name */
        public final int m71671getHardlight0nO6VwU() {
            return BlendMode.f29012v;
        }

        /* renamed from: getHue-0nO6VwU  reason: not valid java name */
        public final int m71672getHue0nO6VwU() {
            return BlendMode.f28988A;
        }

        /* renamed from: getLighten-0nO6VwU  reason: not valid java name */
        public final int m71673getLighten0nO6VwU() {
            return BlendMode.f29009s;
        }

        /* renamed from: getLuminosity-0nO6VwU  reason: not valid java name */
        public final int m71674getLuminosity0nO6VwU() {
            return BlendMode.f28991D;
        }

        /* renamed from: getModulate-0nO6VwU  reason: not valid java name */
        public final int m71675getModulate0nO6VwU() {
            return BlendMode.f29005o;
        }

        /* renamed from: getMultiply-0nO6VwU  reason: not valid java name */
        public final int m71676getMultiply0nO6VwU() {
            return BlendMode.f29016z;
        }

        /* renamed from: getOverlay-0nO6VwU  reason: not valid java name */
        public final int m71677getOverlay0nO6VwU() {
            return BlendMode.f29007q;
        }

        /* renamed from: getPlus-0nO6VwU  reason: not valid java name */
        public final int m71678getPlus0nO6VwU() {
            return BlendMode.f29004n;
        }

        /* renamed from: getSaturation-0nO6VwU  reason: not valid java name */
        public final int m71679getSaturation0nO6VwU() {
            return BlendMode.f28989B;
        }

        /* renamed from: getScreen-0nO6VwU  reason: not valid java name */
        public final int m71680getScreen0nO6VwU() {
            return BlendMode.f29006p;
        }

        /* renamed from: getSoftlight-0nO6VwU  reason: not valid java name */
        public final int m71681getSoftlight0nO6VwU() {
            return BlendMode.f29013w;
        }

        /* renamed from: getSrc-0nO6VwU  reason: not valid java name */
        public final int m71682getSrc0nO6VwU() {
            return BlendMode.f28993c;
        }

        /* renamed from: getSrcAtop-0nO6VwU  reason: not valid java name */
        public final int m71683getSrcAtop0nO6VwU() {
            return BlendMode.f29001k;
        }

        /* renamed from: getSrcIn-0nO6VwU  reason: not valid java name */
        public final int m71684getSrcIn0nO6VwU() {
            return BlendMode.f28997g;
        }

        /* renamed from: getSrcOut-0nO6VwU  reason: not valid java name */
        public final int m71685getSrcOut0nO6VwU() {
            return BlendMode.f28999i;
        }

        /* renamed from: getSrcOver-0nO6VwU  reason: not valid java name */
        public final int m71686getSrcOver0nO6VwU() {
            return BlendMode.f28995e;
        }

        /* renamed from: getXor-0nO6VwU  reason: not valid java name */
        public final int m71687getXor0nO6VwU() {
            return BlendMode.f29003m;
        }

        public Companion() {
        }
    }

    public /* synthetic */ BlendMode(int i) {
        this.f29017a = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ BlendMode m71652boximpl(int i) {
        return new BlendMode(i);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m71653constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m71654equalsimpl(int i, Object obj) {
        return (obj instanceof BlendMode) && i == ((BlendMode) obj).m71658unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m71655equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m71656hashCodeimpl(int i) {
        return i;
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m71657toStringimpl(int i) {
        if (m71655equalsimpl0(i, f28992b)) {
            return "Clear";
        }
        if (m71655equalsimpl0(i, f28993c)) {
            return "Src";
        }
        if (m71655equalsimpl0(i, f28994d)) {
            return "Dst";
        }
        if (m71655equalsimpl0(i, f28995e)) {
            return "SrcOver";
        }
        if (m71655equalsimpl0(i, f28996f)) {
            return "DstOver";
        }
        if (m71655equalsimpl0(i, f28997g)) {
            return "SrcIn";
        }
        if (m71655equalsimpl0(i, f28998h)) {
            return "DstIn";
        }
        if (m71655equalsimpl0(i, f28999i)) {
            return "SrcOut";
        }
        if (m71655equalsimpl0(i, f29000j)) {
            return "DstOut";
        }
        if (m71655equalsimpl0(i, f29001k)) {
            return "SrcAtop";
        }
        if (m71655equalsimpl0(i, f29002l)) {
            return "DstAtop";
        }
        if (m71655equalsimpl0(i, f29003m)) {
            return "Xor";
        }
        if (m71655equalsimpl0(i, f29004n)) {
            return "Plus";
        }
        if (m71655equalsimpl0(i, f29005o)) {
            return "Modulate";
        }
        if (m71655equalsimpl0(i, f29006p)) {
            return "Screen";
        }
        if (m71655equalsimpl0(i, f29007q)) {
            return "Overlay";
        }
        if (m71655equalsimpl0(i, f29008r)) {
            return "Darken";
        }
        if (m71655equalsimpl0(i, f29009s)) {
            return "Lighten";
        }
        if (m71655equalsimpl0(i, f29010t)) {
            return "ColorDodge";
        }
        if (m71655equalsimpl0(i, f29011u)) {
            return "ColorBurn";
        }
        if (m71655equalsimpl0(i, f29012v)) {
            return "HardLight";
        }
        if (m71655equalsimpl0(i, f29013w)) {
            return "Softlight";
        }
        if (m71655equalsimpl0(i, f29014x)) {
            return "Difference";
        }
        if (m71655equalsimpl0(i, f29015y)) {
            return "Exclusion";
        }
        if (m71655equalsimpl0(i, f29016z)) {
            return "Multiply";
        }
        if (m71655equalsimpl0(i, f28988A)) {
            return "Hue";
        }
        if (m71655equalsimpl0(i, f28989B)) {
            return ExifInterface.TAG_SATURATION;
        }
        if (m71655equalsimpl0(i, f28990C)) {
            return "Color";
        }
        if (m71655equalsimpl0(i, f28991D)) {
            return "Luminosity";
        }
        return OpenTypeScript.UNKNOWN;
    }

    public boolean equals(Object obj) {
        return m71654equalsimpl(this.f29017a, obj);
    }

    public int hashCode() {
        return m71656hashCodeimpl(this.f29017a);
    }

    @NotNull
    public String toString() {
        return m71657toStringimpl(this.f29017a);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m71658unboximpl() {
        return this.f29017a;
    }
}
