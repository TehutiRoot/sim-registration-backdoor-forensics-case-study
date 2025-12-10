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
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0014\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0005J\u001a\u0010\u0010\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, m29142d2 = {"Landroidx/compose/ui/graphics/BlendMode;", "", "", "value", "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "Companion", "ui-graphics_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@JvmInline
/* renamed from: androidx.compose.ui.graphics.BlendMode */
/* loaded from: classes2.dex */
public final class BlendMode {

    /* renamed from: a */
    public final int f29105a;
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: b */
    public static final int f29080b = m71837constructorimpl(0);

    /* renamed from: c */
    public static final int f29081c = m71837constructorimpl(1);

    /* renamed from: d */
    public static final int f29082d = m71837constructorimpl(2);

    /* renamed from: e */
    public static final int f29083e = m71837constructorimpl(3);

    /* renamed from: f */
    public static final int f29084f = m71837constructorimpl(4);

    /* renamed from: g */
    public static final int f29085g = m71837constructorimpl(5);

    /* renamed from: h */
    public static final int f29086h = m71837constructorimpl(6);

    /* renamed from: i */
    public static final int f29087i = m71837constructorimpl(7);

    /* renamed from: j */
    public static final int f29088j = m71837constructorimpl(8);

    /* renamed from: k */
    public static final int f29089k = m71837constructorimpl(9);

    /* renamed from: l */
    public static final int f29090l = m71837constructorimpl(10);

    /* renamed from: m */
    public static final int f29091m = m71837constructorimpl(11);

    /* renamed from: n */
    public static final int f29092n = m71837constructorimpl(12);

    /* renamed from: o */
    public static final int f29093o = m71837constructorimpl(13);

    /* renamed from: p */
    public static final int f29094p = m71837constructorimpl(14);

    /* renamed from: q */
    public static final int f29095q = m71837constructorimpl(15);

    /* renamed from: r */
    public static final int f29096r = m71837constructorimpl(16);

    /* renamed from: s */
    public static final int f29097s = m71837constructorimpl(17);

    /* renamed from: t */
    public static final int f29098t = m71837constructorimpl(18);

    /* renamed from: u */
    public static final int f29099u = m71837constructorimpl(19);

    /* renamed from: v */
    public static final int f29100v = m71837constructorimpl(20);

    /* renamed from: w */
    public static final int f29101w = m71837constructorimpl(21);

    /* renamed from: x */
    public static final int f29102x = m71837constructorimpl(22);

    /* renamed from: y */
    public static final int f29103y = m71837constructorimpl(23);

    /* renamed from: z */
    public static final int f29104z = m71837constructorimpl(24);

    /* renamed from: A */
    public static final int f29076A = m71837constructorimpl(25);

    /* renamed from: B */
    public static final int f29077B = m71837constructorimpl(26);

    /* renamed from: C */
    public static final int f29078C = m71837constructorimpl(27);

    /* renamed from: D */
    public static final int f29079D = m71837constructorimpl(28);

    @Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b<\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u001c\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u001c\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006R\u001c\u0010\u0010\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0011\u0010\u0006R\u001c\u0010\u0012\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0013\u0010\u0006R\u001c\u0010\u0014\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0015\u0010\u0006R\u001c\u0010\u0016\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0017\u0010\u0006R\u001c\u0010\u0018\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0019\u0010\u0006R\u001c\u0010\u001a\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001b\u0010\u0006R\u001c\u0010\u001c\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001d\u0010\u0006R\u001c\u0010\u001e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001f\u0010\u0006R\u001c\u0010 \u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b!\u0010\u0006R\u001c\u0010\"\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b#\u0010\u0006R\u001c\u0010$\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b%\u0010\u0006R\u001c\u0010&\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b'\u0010\u0006R\u001c\u0010(\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b)\u0010\u0006R\u001c\u0010*\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b+\u0010\u0006R\u001c\u0010,\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b-\u0010\u0006R\u001c\u0010.\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b/\u0010\u0006R\u001c\u00100\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b1\u0010\u0006R\u001c\u00102\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b3\u0010\u0006R\u001c\u00104\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b5\u0010\u0006R\u001c\u00106\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b7\u0010\u0006R\u001c\u00108\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b9\u0010\u0006R\u001c\u0010:\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b;\u0010\u0006R\u001c\u0010<\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b=\u0010\u0006R\u001c\u0010>\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b?\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006@"}, m29142d2 = {"Landroidx/compose/ui/graphics/BlendMode$Companion;", "", "()V", "Clear", "Landroidx/compose/ui/graphics/BlendMode;", "getClear-0nO6VwU", "()I", "I", "Color", "getColor-0nO6VwU", "ColorBurn", "getColorBurn-0nO6VwU", "ColorDodge", "getColorDodge-0nO6VwU", "Darken", "getDarken-0nO6VwU", "Difference", "getDifference-0nO6VwU", "Dst", "getDst-0nO6VwU", "DstAtop", "getDstAtop-0nO6VwU", "DstIn", "getDstIn-0nO6VwU", "DstOut", "getDstOut-0nO6VwU", "DstOver", "getDstOver-0nO6VwU", "Exclusion", "getExclusion-0nO6VwU", "Hardlight", "getHardlight-0nO6VwU", "Hue", "getHue-0nO6VwU", "Lighten", "getLighten-0nO6VwU", "Luminosity", "getLuminosity-0nO6VwU", "Modulate", "getModulate-0nO6VwU", "Multiply", "getMultiply-0nO6VwU", "Overlay", "getOverlay-0nO6VwU", "Plus", "getPlus-0nO6VwU", ExifInterface.TAG_SATURATION, "getSaturation-0nO6VwU", "Screen", "getScreen-0nO6VwU", "Softlight", "getSoftlight-0nO6VwU", "Src", "getSrc-0nO6VwU", "SrcAtop", "getSrcAtop-0nO6VwU", "SrcIn", "getSrcIn-0nO6VwU", "SrcOut", "getSrcOut-0nO6VwU", "SrcOver", "getSrcOver-0nO6VwU", "Xor", "getXor-0nO6VwU", "ui-graphics_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: androidx.compose.ui.graphics.BlendMode$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getClear-0nO6VwU  reason: not valid java name */
        public final int m71843getClear0nO6VwU() {
            return BlendMode.f29080b;
        }

        /* renamed from: getColor-0nO6VwU  reason: not valid java name */
        public final int m71844getColor0nO6VwU() {
            return BlendMode.f29078C;
        }

        /* renamed from: getColorBurn-0nO6VwU  reason: not valid java name */
        public final int m71845getColorBurn0nO6VwU() {
            return BlendMode.f29099u;
        }

        /* renamed from: getColorDodge-0nO6VwU  reason: not valid java name */
        public final int m71846getColorDodge0nO6VwU() {
            return BlendMode.f29098t;
        }

        /* renamed from: getDarken-0nO6VwU  reason: not valid java name */
        public final int m71847getDarken0nO6VwU() {
            return BlendMode.f29096r;
        }

        /* renamed from: getDifference-0nO6VwU  reason: not valid java name */
        public final int m71848getDifference0nO6VwU() {
            return BlendMode.f29102x;
        }

        /* renamed from: getDst-0nO6VwU  reason: not valid java name */
        public final int m71849getDst0nO6VwU() {
            return BlendMode.f29082d;
        }

        /* renamed from: getDstAtop-0nO6VwU  reason: not valid java name */
        public final int m71850getDstAtop0nO6VwU() {
            return BlendMode.f29090l;
        }

        /* renamed from: getDstIn-0nO6VwU  reason: not valid java name */
        public final int m71851getDstIn0nO6VwU() {
            return BlendMode.f29086h;
        }

        /* renamed from: getDstOut-0nO6VwU  reason: not valid java name */
        public final int m71852getDstOut0nO6VwU() {
            return BlendMode.f29088j;
        }

        /* renamed from: getDstOver-0nO6VwU  reason: not valid java name */
        public final int m71853getDstOver0nO6VwU() {
            return BlendMode.f29084f;
        }

        /* renamed from: getExclusion-0nO6VwU  reason: not valid java name */
        public final int m71854getExclusion0nO6VwU() {
            return BlendMode.f29103y;
        }

        /* renamed from: getHardlight-0nO6VwU  reason: not valid java name */
        public final int m71855getHardlight0nO6VwU() {
            return BlendMode.f29100v;
        }

        /* renamed from: getHue-0nO6VwU  reason: not valid java name */
        public final int m71856getHue0nO6VwU() {
            return BlendMode.f29076A;
        }

        /* renamed from: getLighten-0nO6VwU  reason: not valid java name */
        public final int m71857getLighten0nO6VwU() {
            return BlendMode.f29097s;
        }

        /* renamed from: getLuminosity-0nO6VwU  reason: not valid java name */
        public final int m71858getLuminosity0nO6VwU() {
            return BlendMode.f29079D;
        }

        /* renamed from: getModulate-0nO6VwU  reason: not valid java name */
        public final int m71859getModulate0nO6VwU() {
            return BlendMode.f29093o;
        }

        /* renamed from: getMultiply-0nO6VwU  reason: not valid java name */
        public final int m71860getMultiply0nO6VwU() {
            return BlendMode.f29104z;
        }

        /* renamed from: getOverlay-0nO6VwU  reason: not valid java name */
        public final int m71861getOverlay0nO6VwU() {
            return BlendMode.f29095q;
        }

        /* renamed from: getPlus-0nO6VwU  reason: not valid java name */
        public final int m71862getPlus0nO6VwU() {
            return BlendMode.f29092n;
        }

        /* renamed from: getSaturation-0nO6VwU  reason: not valid java name */
        public final int m71863getSaturation0nO6VwU() {
            return BlendMode.f29077B;
        }

        /* renamed from: getScreen-0nO6VwU  reason: not valid java name */
        public final int m71864getScreen0nO6VwU() {
            return BlendMode.f29094p;
        }

        /* renamed from: getSoftlight-0nO6VwU  reason: not valid java name */
        public final int m71865getSoftlight0nO6VwU() {
            return BlendMode.f29101w;
        }

        /* renamed from: getSrc-0nO6VwU  reason: not valid java name */
        public final int m71866getSrc0nO6VwU() {
            return BlendMode.f29081c;
        }

        /* renamed from: getSrcAtop-0nO6VwU  reason: not valid java name */
        public final int m71867getSrcAtop0nO6VwU() {
            return BlendMode.f29089k;
        }

        /* renamed from: getSrcIn-0nO6VwU  reason: not valid java name */
        public final int m71868getSrcIn0nO6VwU() {
            return BlendMode.f29085g;
        }

        /* renamed from: getSrcOut-0nO6VwU  reason: not valid java name */
        public final int m71869getSrcOut0nO6VwU() {
            return BlendMode.f29087i;
        }

        /* renamed from: getSrcOver-0nO6VwU  reason: not valid java name */
        public final int m71870getSrcOver0nO6VwU() {
            return BlendMode.f29083e;
        }

        /* renamed from: getXor-0nO6VwU  reason: not valid java name */
        public final int m71871getXor0nO6VwU() {
            return BlendMode.f29091m;
        }

        public Companion() {
        }
    }

    public /* synthetic */ BlendMode(int i) {
        this.f29105a = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ BlendMode m71836boximpl(int i) {
        return new BlendMode(i);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m71837constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m71838equalsimpl(int i, Object obj) {
        return (obj instanceof BlendMode) && i == ((BlendMode) obj).m71842unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m71839equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m71840hashCodeimpl(int i) {
        return i;
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m71841toStringimpl(int i) {
        if (m71839equalsimpl0(i, f29080b)) {
            return "Clear";
        }
        if (m71839equalsimpl0(i, f29081c)) {
            return "Src";
        }
        if (m71839equalsimpl0(i, f29082d)) {
            return "Dst";
        }
        if (m71839equalsimpl0(i, f29083e)) {
            return "SrcOver";
        }
        if (m71839equalsimpl0(i, f29084f)) {
            return "DstOver";
        }
        if (m71839equalsimpl0(i, f29085g)) {
            return "SrcIn";
        }
        if (m71839equalsimpl0(i, f29086h)) {
            return "DstIn";
        }
        if (m71839equalsimpl0(i, f29087i)) {
            return "SrcOut";
        }
        if (m71839equalsimpl0(i, f29088j)) {
            return "DstOut";
        }
        if (m71839equalsimpl0(i, f29089k)) {
            return "SrcAtop";
        }
        if (m71839equalsimpl0(i, f29090l)) {
            return "DstAtop";
        }
        if (m71839equalsimpl0(i, f29091m)) {
            return "Xor";
        }
        if (m71839equalsimpl0(i, f29092n)) {
            return "Plus";
        }
        if (m71839equalsimpl0(i, f29093o)) {
            return "Modulate";
        }
        if (m71839equalsimpl0(i, f29094p)) {
            return "Screen";
        }
        if (m71839equalsimpl0(i, f29095q)) {
            return "Overlay";
        }
        if (m71839equalsimpl0(i, f29096r)) {
            return "Darken";
        }
        if (m71839equalsimpl0(i, f29097s)) {
            return "Lighten";
        }
        if (m71839equalsimpl0(i, f29098t)) {
            return "ColorDodge";
        }
        if (m71839equalsimpl0(i, f29099u)) {
            return "ColorBurn";
        }
        if (m71839equalsimpl0(i, f29100v)) {
            return "HardLight";
        }
        if (m71839equalsimpl0(i, f29101w)) {
            return "Softlight";
        }
        if (m71839equalsimpl0(i, f29102x)) {
            return "Difference";
        }
        if (m71839equalsimpl0(i, f29103y)) {
            return "Exclusion";
        }
        if (m71839equalsimpl0(i, f29104z)) {
            return "Multiply";
        }
        if (m71839equalsimpl0(i, f29076A)) {
            return "Hue";
        }
        if (m71839equalsimpl0(i, f29077B)) {
            return ExifInterface.TAG_SATURATION;
        }
        if (m71839equalsimpl0(i, f29078C)) {
            return "Color";
        }
        if (m71839equalsimpl0(i, f29079D)) {
            return "Luminosity";
        }
        return OpenTypeScript.UNKNOWN;
    }

    public boolean equals(Object obj) {
        return m71838equalsimpl(this.f29105a, obj);
    }

    public int hashCode() {
        return m71840hashCodeimpl(this.f29105a);
    }

    @NotNull
    public String toString() {
        return m71841toStringimpl(this.f29105a);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m71842unboximpl() {
        return this.f29105a;
    }
}