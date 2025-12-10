package androidx.compose.p003ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087@\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001(B\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\n\u0010\bJ\u0019\u0010\r\u001a\u00020\u0000H\u0087\nø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0005J!\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0002H\u0087\nø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\bJ!\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0010H\u0087\nø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u0011J\u001e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\bJ!\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0002H\u0087\nø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\bJ!\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0010H\u0087\nø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0011J\u001e\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0000H\u0097\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u001b\u001a\u00020\u0018H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010#\u001a\u00020 2\b\u0010\u0006\u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006)"}, m28850d2 = {"Landroidx/compose/ui/unit/Dp;", "", "", "value", "constructor-impl", "(F)F", "other", "plus-5rwHm24", "(FF)F", "plus", "minus-5rwHm24", "minus", "unaryMinus-D9Ej5fM", "unaryMinus", "div-u2uoSUM", "div", "", "(FI)F", "div-0680j_4", "times-u2uoSUM", "times", "compareTo-0680j_4", "(FF)I", "compareTo", "", "toString-impl", "(F)Ljava/lang/String;", "toString", "hashCode-impl", "(F)I", "hashCode", "", "", "equals-impl", "(FLjava/lang/Object;)Z", "equals", PDPageLabelRange.STYLE_LETTERS_LOWER, "F", "getValue", "()F", "Companion", "ui-unit_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,557:1\n137#2:558\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n101#1:558\n*E\n"})
/* renamed from: androidx.compose.ui.unit.Dp */
/* loaded from: classes2.dex */
public final class C3641Dp implements Comparable<C3641Dp> {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: b */
    public static final float f31744b = m73658constructorimpl(0.0f);

    /* renamed from: c */
    public static final float f31745c = m73658constructorimpl(Float.POSITIVE_INFINITY);

    /* renamed from: d */
    public static final float f31746d = m73658constructorimpl(Float.NaN);

    /* renamed from: a */
    public final float f31747a;

    @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R'\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R'\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\u0007R'\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u0007\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000f"}, m28850d2 = {"Landroidx/compose/ui/unit/Dp$Companion;", "", "()V", "Hairline", "Landroidx/compose/ui/unit/Dp;", "getHairline-D9Ej5fM$annotations", "getHairline-D9Ej5fM", "()F", "F", "Infinity", "getInfinity-D9Ej5fM$annotations", "getInfinity-D9Ej5fM", "Unspecified", "getUnspecified-D9Ej5fM$annotations", "getUnspecified-D9Ej5fM", "ui-unit_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.unit.Dp$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Stable
        /* renamed from: getHairline-D9Ej5fM$annotations  reason: not valid java name */
        public static /* synthetic */ void m73673getHairlineD9Ej5fM$annotations() {
        }

        @Stable
        /* renamed from: getInfinity-D9Ej5fM$annotations  reason: not valid java name */
        public static /* synthetic */ void m73674getInfinityD9Ej5fM$annotations() {
        }

        @Stable
        /* renamed from: getUnspecified-D9Ej5fM$annotations  reason: not valid java name */
        public static /* synthetic */ void m73675getUnspecifiedD9Ej5fM$annotations() {
        }

        /* renamed from: getHairline-D9Ej5fM  reason: not valid java name */
        public final float m73676getHairlineD9Ej5fM() {
            return C3641Dp.f31744b;
        }

        /* renamed from: getInfinity-D9Ej5fM  reason: not valid java name */
        public final float m73677getInfinityD9Ej5fM() {
            return C3641Dp.f31745c;
        }

        /* renamed from: getUnspecified-D9Ej5fM  reason: not valid java name */
        public final float m73678getUnspecifiedD9Ej5fM() {
            return C3641Dp.f31746d;
        }

        public Companion() {
        }
    }

    public /* synthetic */ C3641Dp(float f) {
        this.f31747a = f;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ C3641Dp m73656boximpl(float f) {
        return new C3641Dp(f);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static float m73658constructorimpl(float f) {
        return f;
    }

    @Stable
    /* renamed from: div-0680j_4  reason: not valid java name */
    public static final float m73659div0680j_4(float f, float f2) {
        return f / f2;
    }

    @Stable
    /* renamed from: div-u2uoSUM  reason: not valid java name */
    public static final float m73660divu2uoSUM(float f, float f2) {
        return m73658constructorimpl(f / f2);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m73662equalsimpl(float f, Object obj) {
        return (obj instanceof C3641Dp) && Float.compare(f, ((C3641Dp) obj).m73672unboximpl()) == 0;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m73663equalsimpl0(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m73664hashCodeimpl(float f) {
        return Float.floatToIntBits(f);
    }

    @Stable
    /* renamed from: minus-5rwHm24  reason: not valid java name */
    public static final float m73665minus5rwHm24(float f, float f2) {
        return m73658constructorimpl(f - f2);
    }

    @Stable
    /* renamed from: plus-5rwHm24  reason: not valid java name */
    public static final float m73666plus5rwHm24(float f, float f2) {
        return m73658constructorimpl(f + f2);
    }

    @Stable
    /* renamed from: times-u2uoSUM  reason: not valid java name */
    public static final float m73667timesu2uoSUM(float f, float f2) {
        return m73658constructorimpl(f * f2);
    }

    @Stable
    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m73669toStringimpl(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    @Stable
    /* renamed from: unaryMinus-D9Ej5fM  reason: not valid java name */
    public static final float m73670unaryMinusD9Ej5fM(float f) {
        return m73658constructorimpl(-f);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(C3641Dp c3641Dp) {
        return m73671compareTo0680j_4(c3641Dp.m73672unboximpl());
    }

    @Stable
    /* renamed from: compareTo-0680j_4  reason: not valid java name */
    public int m73671compareTo0680j_4(float f) {
        return m73657compareTo0680j_4(this.f31747a, f);
    }

    public boolean equals(Object obj) {
        return m73662equalsimpl(this.f31747a, obj);
    }

    public final float getValue() {
        return this.f31747a;
    }

    public int hashCode() {
        return m73664hashCodeimpl(this.f31747a);
    }

    @Stable
    @NotNull
    public String toString() {
        return m73669toStringimpl(this.f31747a);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ float m73672unboximpl() {
        return this.f31747a;
    }

    @Stable
    /* renamed from: compareTo-0680j_4  reason: not valid java name */
    public static int m73657compareTo0680j_4(float f, float f2) {
        return Float.compare(f, f2);
    }

    @Stable
    /* renamed from: div-u2uoSUM  reason: not valid java name */
    public static final float m73661divu2uoSUM(float f, int i) {
        return m73658constructorimpl(f / i);
    }

    @Stable
    /* renamed from: times-u2uoSUM  reason: not valid java name */
    public static final float m73668timesu2uoSUM(float f, int i) {
        return m73658constructorimpl(f * i);
    }
}
