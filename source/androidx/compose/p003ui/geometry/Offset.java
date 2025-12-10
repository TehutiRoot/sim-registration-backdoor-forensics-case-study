package androidx.compose.p003ui.geometry;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087@\u0018\u0000 ;2\u00020\u0001:\u0001;B\u0014\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0004\b\n\u0010\bJ*\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0014\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0015\u0010\bJ\u000f\u0010\u0018\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0017\u0010\bJ\u0019\u0010\u001a\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0005J\u001e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010 \u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001dJ!\u0010$\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0006H\u0087\u0002ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J!\u0010&\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0006H\u0087\u0002ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b%\u0010#J!\u0010(\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0006H\u0087\u0002ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b'\u0010#J\u000f\u0010,\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u0010\u00100\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00103\u001a\u00020\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001a\u0010\f\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b7\u00108\u001a\u0004\b6\u0010\bR\u001a\u0010\r\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b:\u00108\u001a\u0004\b9\u0010\b\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006<"}, m28850d2 = {"Landroidx/compose/ui/geometry/Offset;", "", "", "packedValue", "constructor-impl", "(J)J", "", "component1-impl", "(J)F", "component1", "component2-impl", "component2", "x", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "copy-dBAh8RU", "(JFF)J", "copy", "", "isValid-impl", "(J)Z", "isValid", "getDistance-impl", "getDistance", "getDistanceSquared-impl", "getDistanceSquared", "unaryMinus-F1C5BW0", "unaryMinus", "other", "minus-MK-Hz9U", "(JJ)J", "minus", "plus-MK-Hz9U", "plus", "operand", "times-tuRUvjQ", "(JF)J", "times", "div-tuRUvjQ", "div", "rem-tuRUvjQ", "rem", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "hashCode-impl", "(J)I", "hashCode", "equals-impl", "(JLjava/lang/Object;)Z", "equals", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, "getX-impl", "getX$annotations", "()V", "getY-impl", "getY$annotations", "Companion", "ui-geometry_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,266:1\n34#2:267\n41#2:268\n*S KotlinDebug\n*F\n+ 1 Offset.kt\nandroidx/compose/ui/geometry/Offset\n*L\n70#1:267\n80#1:268\n*E\n"})
/* renamed from: androidx.compose.ui.geometry.Offset */
/* loaded from: classes2.dex */
public final class Offset {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: b */
    public static final long f28947b = OffsetKt.Offset(0.0f, 0.0f);

    /* renamed from: c */
    public static final long f28948c = OffsetKt.Offset(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: d */
    public static final long f28949d = OffsetKt.Offset(Float.NaN, Float.NaN);

    /* renamed from: a */
    public final long f28950a;

    @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R'\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R'\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\u0007R'\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u0007\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000f"}, m28850d2 = {"Landroidx/compose/ui/geometry/Offset$Companion;", "", "()V", "Infinite", "Landroidx/compose/ui/geometry/Offset;", "getInfinite-F1C5BW0$annotations", "getInfinite-F1C5BW0", "()J", OperatorName.SET_LINE_CAPSTYLE, "Unspecified", "getUnspecified-F1C5BW0$annotations", "getUnspecified-F1C5BW0", "Zero", "getZero-F1C5BW0$annotations", "getZero-F1C5BW0", "ui-geometry_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.geometry.Offset$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Stable
        /* renamed from: getInfinite-F1C5BW0$annotations */
        public static /* synthetic */ void m71513getInfiniteF1C5BW0$annotations() {
        }

        @Stable
        /* renamed from: getUnspecified-F1C5BW0$annotations */
        public static /* synthetic */ void m71514getUnspecifiedF1C5BW0$annotations() {
        }

        @Stable
        /* renamed from: getZero-F1C5BW0$annotations */
        public static /* synthetic */ void m71515getZeroF1C5BW0$annotations() {
        }

        /* renamed from: getInfinite-F1C5BW0 */
        public final long m71516getInfiniteF1C5BW0() {
            return Offset.f28948c;
        }

        /* renamed from: getUnspecified-F1C5BW0 */
        public final long m71517getUnspecifiedF1C5BW0() {
            return Offset.f28949d;
        }

        /* renamed from: getZero-F1C5BW0 */
        public final long m71518getZeroF1C5BW0() {
            return Offset.f28947b;
        }

        public Companion() {
        }
    }

    public /* synthetic */ Offset(long j) {
        this.f28950a = j;
    }

    /* renamed from: box-impl */
    public static final /* synthetic */ Offset m71491boximpl(long j) {
        return new Offset(j);
    }

    @Stable
    /* renamed from: component1-impl */
    public static final float m71492component1impl(long j) {
        return m71502getXimpl(j);
    }

    @Stable
    /* renamed from: component2-impl */
    public static final float m71493component2impl(long j) {
        return m71503getYimpl(j);
    }

    /* renamed from: constructor-impl */
    public static long m71494constructorimpl(long j) {
        return j;
    }

    /* renamed from: copy-dBAh8RU */
    public static final long m71495copydBAh8RU(long j, float f, float f2) {
        return OffsetKt.Offset(f, f2);
    }

    /* renamed from: copy-dBAh8RU$default */
    public static /* synthetic */ long m71496copydBAh8RU$default(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m71502getXimpl(j);
        }
        if ((i & 2) != 0) {
            f2 = m71503getYimpl(j);
        }
        return m71495copydBAh8RU(j, f, f2);
    }

    @Stable
    /* renamed from: div-tuRUvjQ */
    public static final long m71497divtuRUvjQ(long j, float f) {
        return OffsetKt.Offset(m71502getXimpl(j) / f, m71503getYimpl(j) / f);
    }

    /* renamed from: equals-impl */
    public static boolean m71498equalsimpl(long j, Object obj) {
        return (obj instanceof Offset) && j == ((Offset) obj).m71512unboximpl();
    }

    /* renamed from: equals-impl0 */
    public static final boolean m71499equalsimpl0(long j, long j2) {
        return j == j2;
    }

    @Stable
    /* renamed from: getDistance-impl */
    public static final float m71500getDistanceimpl(long j) {
        return (float) Math.sqrt((m71502getXimpl(j) * m71502getXimpl(j)) + (m71503getYimpl(j) * m71503getYimpl(j)));
    }

    @Stable
    /* renamed from: getDistanceSquared-impl */
    public static final float m71501getDistanceSquaredimpl(long j) {
        return (m71502getXimpl(j) * m71502getXimpl(j)) + (m71503getYimpl(j) * m71503getYimpl(j));
    }

    @Stable
    public static /* synthetic */ void getX$annotations() {
    }

    /* renamed from: getX-impl */
    public static final float m71502getXimpl(long j) {
        if (j != f28949d) {
            FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
            return Float.intBitsToFloat((int) (j >> 32));
        }
        throw new IllegalStateException("Offset is unspecified".toString());
    }

    @Stable
    public static /* synthetic */ void getY$annotations() {
    }

    /* renamed from: getY-impl */
    public static final float m71503getYimpl(long j) {
        if (j != f28949d) {
            FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
            return Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax));
        }
        throw new IllegalStateException("Offset is unspecified".toString());
    }

    /* renamed from: hashCode-impl */
    public static int m71504hashCodeimpl(long j) {
        return AbstractC17792Ig1.m67882a(j);
    }

    @Stable
    /* renamed from: isValid-impl */
    public static final boolean m71505isValidimpl(long j) {
        if (!Float.isNaN(m71502getXimpl(j)) && !Float.isNaN(m71503getYimpl(j))) {
            return true;
        }
        throw new IllegalStateException("Offset argument contained a NaN value.".toString());
    }

    @Stable
    /* renamed from: minus-MK-Hz9U */
    public static final long m71506minusMKHz9U(long j, long j2) {
        return OffsetKt.Offset(m71502getXimpl(j) - m71502getXimpl(j2), m71503getYimpl(j) - m71503getYimpl(j2));
    }

    @Stable
    /* renamed from: plus-MK-Hz9U */
    public static final long m71507plusMKHz9U(long j, long j2) {
        return OffsetKt.Offset(m71502getXimpl(j) + m71502getXimpl(j2), m71503getYimpl(j) + m71503getYimpl(j2));
    }

    @Stable
    /* renamed from: rem-tuRUvjQ */
    public static final long m71508remtuRUvjQ(long j, float f) {
        return OffsetKt.Offset(m71502getXimpl(j) % f, m71503getYimpl(j) % f);
    }

    @Stable
    /* renamed from: times-tuRUvjQ */
    public static final long m71509timestuRUvjQ(long j, float f) {
        return OffsetKt.Offset(m71502getXimpl(j) * f, m71503getYimpl(j) * f);
    }

    @NotNull
    /* renamed from: toString-impl */
    public static String m71510toStringimpl(long j) {
        if (OffsetKt.m71521isSpecifiedk4lQ0M(j)) {
            return "Offset(" + GeometryUtilsKt.toStringAsFixed(m71502getXimpl(j), 1) + ", " + GeometryUtilsKt.toStringAsFixed(m71503getYimpl(j), 1) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
        return "Offset.Unspecified";
    }

    @Stable
    /* renamed from: unaryMinus-F1C5BW0 */
    public static final long m71511unaryMinusF1C5BW0(long j) {
        return OffsetKt.Offset(-m71502getXimpl(j), -m71503getYimpl(j));
    }

    public boolean equals(Object obj) {
        return m71498equalsimpl(this.f28950a, obj);
    }

    public int hashCode() {
        return m71504hashCodeimpl(this.f28950a);
    }

    @NotNull
    public String toString() {
        return m71510toStringimpl(this.f28950a);
    }

    /* renamed from: unbox-impl */
    public final /* synthetic */ long m71512unboximpl() {
        return this.f28950a;
    }
}
