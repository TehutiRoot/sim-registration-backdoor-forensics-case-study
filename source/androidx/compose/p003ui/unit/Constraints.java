package androidx.compose.p003ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Immutable
@Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087@\u0018\u0000 12\u00020\u0001:\u00011B\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J>\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0006ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0019\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0013R\u0011\u0010\b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b \u0010\u0013R\u0011\u0010\t\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b!\u0010\u0013R\u0011\u0010\n\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0013R\u0011\u0010%\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010'\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b&\u0010$R\u001a\u0010*\u001a\u00020\u00168FX\u0087\u0004¢\u0006\f\u0012\u0004\b)\u0010\u001d\u001a\u0004\b(\u0010$R\u001a\u0010-\u001a\u00020\u00168FX\u0087\u0004¢\u0006\f\u0012\u0004\b,\u0010\u001d\u001a\u0004\b+\u0010$R\u001a\u00100\u001a\u00020\u00168FX\u0087\u0004¢\u0006\f\u0012\u0004\b/\u0010\u001d\u001a\u0004\b.\u0010$\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00062"}, m28850d2 = {"Landroidx/compose/ui/unit/Constraints;", "", "", "value", "constructor-impl", "(J)J", "", "minWidth", "maxWidth", "minHeight", "maxHeight", "copy-Zbe2FdA", "(JIIII)J", "copy", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "hashCode-impl", "(J)I", "hashCode", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, "getValue$annotations", "()V", "focusIndex", "getMinWidth-impl", "getMaxWidth-impl", "getMinHeight-impl", "getMaxHeight-impl", "getHasBoundedWidth-impl", "(J)Z", "hasBoundedWidth", "getHasBoundedHeight-impl", "hasBoundedHeight", "getHasFixedWidth-impl", "getHasFixedWidth$annotations", "hasFixedWidth", "getHasFixedHeight-impl", "getHasFixedHeight$annotations", "hasFixedHeight", "isZero-impl", "isZero$annotations", "isZero", "Companion", "ui-unit_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@JvmInline
/* renamed from: androidx.compose.ui.unit.Constraints */
/* loaded from: classes2.dex */
public final class Constraints {
    public static final int Infinity = Integer.MAX_VALUE;

    /* renamed from: a */
    public final long f31743a;
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: b */
    public static final int[] f31740b = {18, 20, 17, 15};

    /* renamed from: c */
    public static final int[] f31741c = {65535, 262143, 32767, 8191};

    /* renamed from: d */
    public static final int[] f31742d = {32767, 8191, 65535, 262143};

    @Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0013\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\b\u0010\tJ \u0010\r\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000e\u0010\fJ8\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010!R\u0014\u0010#\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u001cR\u0014\u0010$\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010!R\u0014\u0010%\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\u001cR\u0014\u0010&\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010!R\u0014\u0010'\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010!R\u0014\u0010(\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010!R\u0014\u0010)\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010\u001cR\u0014\u0010*\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010!R\u0014\u0010+\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010\u001cR\u0014\u0010,\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u001fR\u0014\u0010-\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010!R\u0014\u0010.\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010!R\u0014\u0010/\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u001f\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00060"}, m28850d2 = {"Landroidx/compose/ui/unit/Constraints$Companion;", "", "<init>", "()V", "", "width", "height", "Landroidx/compose/ui/unit/Constraints;", "fixed-JhjzzOo", "(II)J", "fixed", "fixedWidth-OenEA2s", "(I)J", "fixedWidth", "fixedHeight-OenEA2s", "fixedHeight", "minWidth", "maxWidth", "minHeight", "maxHeight", "createConstraints-Zbe2FdA$ui_unit_release", "(IIII)J", "createConstraints", "size", PDPageLabelRange.STYLE_LETTERS_LOWER, "(I)I", "", "FocusMask", OperatorName.SET_LINE_CAPSTYLE, "", "HeightMask", "[I", "Infinity", "I", "MaxFocusBits", "MaxFocusHeight", "MaxFocusMask", "MaxFocusWidth", "MaxNonFocusBits", "MaxNonFocusMask", "MinFocusBits", "MinFocusHeight", "MinFocusMask", "MinFocusWidth", "MinHeightOffsets", "MinNonFocusBits", "MinNonFocusMask", "WidthMask", "ui-unit_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.unit.Constraints$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int m58872a(int i) {
            if (i < 8191) {
                return 13;
            }
            if (i < 32767) {
                return 15;
            }
            if (i < 65535) {
                return 16;
            }
            if (i < 262143) {
                return 18;
            }
            throw new IllegalArgumentException("Can't represent a size of " + i + " in Constraints");
        }

        /* renamed from: createConstraints-Zbe2FdA$ui_unit_release  reason: not valid java name */
        public final long m73633createConstraintsZbe2FdA$ui_unit_release(int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            long j;
            int i7;
            if (i4 == Integer.MAX_VALUE) {
                i5 = i3;
            } else {
                i5 = i4;
            }
            int m58872a = m58872a(i5);
            if (i2 == Integer.MAX_VALUE) {
                i6 = i;
            } else {
                i6 = i2;
            }
            int m58872a2 = m58872a(i6);
            if (m58872a + m58872a2 <= 31) {
                if (m58872a2 != 13) {
                    if (m58872a2 != 18) {
                        if (m58872a2 != 15) {
                            if (m58872a2 == 16) {
                                j = 0;
                            } else {
                                throw new IllegalStateException("Should only have the provided constants.");
                            }
                        } else {
                            j = 2;
                        }
                    } else {
                        j = 1;
                    }
                } else {
                    j = 3;
                }
                int i8 = 0;
                if (i2 == Integer.MAX_VALUE) {
                    i7 = 0;
                } else {
                    i7 = i2 + 1;
                }
                if (i4 != Integer.MAX_VALUE) {
                    i8 = i4 + 1;
                }
                int i9 = Constraints.f31740b[(int) j];
                return Constraints.m73616constructorimpl((i7 << 33) | j | (i << 2) | (i3 << i9) | (i8 << (i9 + 31)));
            }
            throw new IllegalArgumentException("Can't represent a width of " + i6 + " and height of " + i5 + " in Constraints");
        }

        @Stable
        /* renamed from: fixed-JhjzzOo  reason: not valid java name */
        public final long m73634fixedJhjzzOo(int i, int i2) {
            if (i >= 0 && i2 >= 0) {
                return m73633createConstraintsZbe2FdA$ui_unit_release(i, i, i2, i2);
            }
            throw new IllegalArgumentException(("width(" + i + ") and height(" + i2 + ") must be >= 0").toString());
        }

        @Stable
        /* renamed from: fixedHeight-OenEA2s  reason: not valid java name */
        public final long m73635fixedHeightOenEA2s(int i) {
            if (i >= 0) {
                return m73633createConstraintsZbe2FdA$ui_unit_release(0, Integer.MAX_VALUE, i, i);
            }
            throw new IllegalArgumentException(("height(" + i + ") must be >= 0").toString());
        }

        @Stable
        /* renamed from: fixedWidth-OenEA2s  reason: not valid java name */
        public final long m73636fixedWidthOenEA2s(int i) {
            if (i >= 0) {
                return m73633createConstraintsZbe2FdA$ui_unit_release(i, i, 0, Integer.MAX_VALUE);
            }
            throw new IllegalArgumentException(("width(" + i + ") must be >= 0").toString());
        }

        public Companion() {
        }
    }

    public /* synthetic */ Constraints(long j) {
        this.f31743a = j;
    }

    /* renamed from: a */
    public static final int m58873a(long j) {
        return (int) (j & 3);
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Constraints m73615boximpl(long j) {
        return new Constraints(j);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m73616constructorimpl(long j) {
        return j;
    }

    /* renamed from: copy-Zbe2FdA  reason: not valid java name */
    public static final long m73617copyZbe2FdA(long j, int i, int i2, int i3, int i4) {
        if (i3 >= 0 && i >= 0) {
            if (i2 < i && i2 != Integer.MAX_VALUE) {
                throw new IllegalArgumentException(("maxWidth(" + i2 + ") must be >= minWidth(" + i + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
            } else if (i4 < i3 && i4 != Integer.MAX_VALUE) {
                throw new IllegalArgumentException(("maxHeight(" + i4 + ") must be >= minHeight(" + i3 + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
            } else {
                return Companion.m73633createConstraintsZbe2FdA$ui_unit_release(i, i2, i3, i4);
            }
        }
        throw new IllegalArgumentException(("minHeight(" + i3 + ") and minWidth(" + i + ") must be >= 0").toString());
    }

    /* renamed from: copy-Zbe2FdA$default  reason: not valid java name */
    public static /* synthetic */ long m73618copyZbe2FdA$default(long j, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = m73628getMinWidthimpl(j);
        }
        int i6 = i;
        if ((i5 & 2) != 0) {
            i2 = m73626getMaxWidthimpl(j);
        }
        int i7 = i2;
        if ((i5 & 4) != 0) {
            i3 = m73627getMinHeightimpl(j);
        }
        int i8 = i3;
        if ((i5 & 8) != 0) {
            i4 = m73625getMaxHeightimpl(j);
        }
        return m73617copyZbe2FdA(j, i6, i7, i8, i4);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m73619equalsimpl(long j, Object obj) {
        return (obj instanceof Constraints) && j == ((Constraints) obj).m73632unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m73620equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getHasBoundedHeight-impl  reason: not valid java name */
    public static final boolean m73621getHasBoundedHeightimpl(long j) {
        int m58873a = m58873a(j);
        if ((((int) (j >> (f31740b[m58873a] + 31))) & f31742d[m58873a]) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: getHasBoundedWidth-impl  reason: not valid java name */
    public static final boolean m73622getHasBoundedWidthimpl(long j) {
        if ((((int) (j >> 33)) & f31741c[m58873a(j)]) != 0) {
            return true;
        }
        return false;
    }

    @Stable
    public static /* synthetic */ void getHasFixedHeight$annotations() {
    }

    /* renamed from: getHasFixedHeight-impl  reason: not valid java name */
    public static final boolean m73623getHasFixedHeightimpl(long j) {
        if (m73625getMaxHeightimpl(j) == m73627getMinHeightimpl(j)) {
            return true;
        }
        return false;
    }

    @Stable
    public static /* synthetic */ void getHasFixedWidth$annotations() {
    }

    /* renamed from: getHasFixedWidth-impl  reason: not valid java name */
    public static final boolean m73624getHasFixedWidthimpl(long j) {
        if (m73626getMaxWidthimpl(j) == m73628getMinWidthimpl(j)) {
            return true;
        }
        return false;
    }

    /* renamed from: getMaxHeight-impl  reason: not valid java name */
    public static final int m73625getMaxHeightimpl(long j) {
        int m58873a = m58873a(j);
        int i = ((int) (j >> (f31740b[m58873a] + 31))) & f31742d[m58873a];
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i - 1;
    }

    /* renamed from: getMaxWidth-impl  reason: not valid java name */
    public static final int m73626getMaxWidthimpl(long j) {
        int i = ((int) (j >> 33)) & f31741c[m58873a(j)];
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i - 1;
    }

    /* renamed from: getMinHeight-impl  reason: not valid java name */
    public static final int m73627getMinHeightimpl(long j) {
        int m58873a = m58873a(j);
        return ((int) (j >> f31740b[m58873a])) & f31742d[m58873a];
    }

    /* renamed from: getMinWidth-impl  reason: not valid java name */
    public static final int m73628getMinWidthimpl(long j) {
        return ((int) (j >> 2)) & f31741c[m58873a(j)];
    }

    @PublishedApi
    public static /* synthetic */ void getValue$annotations() {
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m73629hashCodeimpl(long j) {
        return AbstractC17792Ig1.m67882a(j);
    }

    @Stable
    public static /* synthetic */ void isZero$annotations() {
    }

    /* renamed from: isZero-impl  reason: not valid java name */
    public static final boolean m73630isZeroimpl(long j) {
        if (m73626getMaxWidthimpl(j) != 0 && m73625getMaxHeightimpl(j) != 0) {
            return false;
        }
        return true;
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m73631toStringimpl(long j) {
        String valueOf;
        int m73626getMaxWidthimpl = m73626getMaxWidthimpl(j);
        String str = "Infinity";
        if (m73626getMaxWidthimpl == Integer.MAX_VALUE) {
            valueOf = "Infinity";
        } else {
            valueOf = String.valueOf(m73626getMaxWidthimpl);
        }
        int m73625getMaxHeightimpl = m73625getMaxHeightimpl(j);
        if (m73625getMaxHeightimpl != Integer.MAX_VALUE) {
            str = String.valueOf(m73625getMaxHeightimpl);
        }
        return "Constraints(minWidth = " + m73628getMinWidthimpl(j) + ", maxWidth = " + valueOf + ", minHeight = " + m73627getMinHeightimpl(j) + ", maxHeight = " + str + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return m73619equalsimpl(this.f31743a, obj);
    }

    public int hashCode() {
        return m73629hashCodeimpl(this.f31743a);
    }

    @NotNull
    public String toString() {
        return m73631toStringimpl(this.f31743a);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m73632unboximpl() {
        return this.f31743a;
    }
}
