package kotlin.collections;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.UByteArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u001a'\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\r\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a'\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a'\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a'\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u001b\u0010\t\u001a'\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u001d\u0010\u000e\u001a'\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u001e\u0010\u0013\u001a'\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u001f\u0010\u0018¨\u0006 "}, m28850d2 = {"Lkotlin/UByteArray;", "array", "", "left", "right", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "([BII)I", "", OperatorName.FILL_NON_ZERO, "([BII)V", "Lkotlin/UShortArray;", OperatorName.CURVE_TO, "([SII)I", OperatorName.NON_STROKING_GRAY, "([SII)V", "Lkotlin/UIntArray;", "d", "([III)I", OperatorName.CLOSE_PATH, "([III)V", "Lkotlin/ULongArray;", PDPageLabelRange.STYLE_LETTERS_LOWER, "([JII)I", "e", "([JII)V", "fromIndex", "toIndex", "sortArray-4UcCI2c", "sortArray", "sortArray-Aa5vz7o", "sortArray-oBK06Vg", "sortArray--nroSd4", "kotlin-stdlib"}, m28849k = 2, m28848mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class UArraySortingKt {
    /* JADX WARN: Incorrect condition in loop: B:5:0x0012 */
    /* JADX WARN: Incorrect condition in loop: B:8:0x001f */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int m28816a(long[] r6, int r7, int r8) {
        /*
            int r0 = r7 + r8
            int r0 = r0 / 2
            long r0 = kotlin.ULongArray.m74159getsVKNKU(r6, r0)
        L8:
            if (r7 > r8) goto L39
        La:
            long r2 = kotlin.ULongArray.m74159getsVKNKU(r6, r7)
            int r2 = p000.AbstractC5374bW.m51994a(r2, r0)
            if (r2 >= 0) goto L17
            int r7 = r7 + 1
            goto La
        L17:
            long r2 = kotlin.ULongArray.m74159getsVKNKU(r6, r8)
            int r2 = p000.AbstractC5374bW.m51994a(r2, r0)
            if (r2 <= 0) goto L24
            int r8 = r8 + (-1)
            goto L17
        L24:
            if (r7 > r8) goto L8
            long r2 = kotlin.ULongArray.m74159getsVKNKU(r6, r7)
            long r4 = kotlin.ULongArray.m74159getsVKNKU(r6, r8)
            kotlin.ULongArray.m74164setk8EXiF4(r6, r7, r4)
            kotlin.ULongArray.m74164setk8EXiF4(r6, r8, r2)
            int r7 = r7 + 1
            int r8 = r8 + (-1)
            goto L8
        L39:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.UArraySortingKt.m28816a(long[], int, int):int");
    }

    /* renamed from: b */
    public static final int m28815b(byte[] bArr, int i, int i2) {
        int i3;
        byte m74111getw2LRezQ = UByteArray.m74111getw2LRezQ(bArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                i3 = m74111getw2LRezQ & 255;
                if (Intrinsics.compare(UByteArray.m74111getw2LRezQ(bArr, i) & 255, i3) >= 0) {
                    break;
                }
                i++;
            }
            while (Intrinsics.compare(UByteArray.m74111getw2LRezQ(bArr, i2) & 255, i3) > 0) {
                i2--;
            }
            if (i <= i2) {
                byte m74111getw2LRezQ2 = UByteArray.m74111getw2LRezQ(bArr, i);
                UByteArray.m74116setVurrAj0(bArr, i, UByteArray.m74111getw2LRezQ(bArr, i2));
                UByteArray.m74116setVurrAj0(bArr, i2, m74111getw2LRezQ2);
                i++;
                i2--;
            }
        }
        return i;
    }

    /* renamed from: c */
    public static final int m28814c(short[] sArr, int i, int i2) {
        int i3;
        short m74183getMh2AYeg = UShortArray.m74183getMh2AYeg(sArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                int m74183getMh2AYeg2 = UShortArray.m74183getMh2AYeg(sArr, i) & UShort.MAX_VALUE;
                i3 = m74183getMh2AYeg & UShort.MAX_VALUE;
                if (Intrinsics.compare(m74183getMh2AYeg2, i3) >= 0) {
                    break;
                }
                i++;
            }
            while (Intrinsics.compare(UShortArray.m74183getMh2AYeg(sArr, i2) & UShort.MAX_VALUE, i3) > 0) {
                i2--;
            }
            if (i <= i2) {
                short m74183getMh2AYeg3 = UShortArray.m74183getMh2AYeg(sArr, i);
                UShortArray.m74188set01HTLdE(sArr, i, UShortArray.m74183getMh2AYeg(sArr, i2));
                UShortArray.m74188set01HTLdE(sArr, i2, m74183getMh2AYeg3);
                i++;
                i2--;
            }
        }
        return i;
    }

    /* JADX WARN: Incorrect condition in loop: B:5:0x0012 */
    /* JADX WARN: Incorrect condition in loop: B:8:0x001f */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int m28813d(int[] r3, int r4, int r5) {
        /*
            int r0 = r4 + r5
            int r0 = r0 / 2
            int r0 = kotlin.UIntArray.m74135getpVg5ArA(r3, r0)
        L8:
            if (r4 > r5) goto L39
        La:
            int r1 = kotlin.UIntArray.m74135getpVg5ArA(r3, r4)
            int r1 = p000.FW1.m68395a(r1, r0)
            if (r1 >= 0) goto L17
            int r4 = r4 + 1
            goto La
        L17:
            int r1 = kotlin.UIntArray.m74135getpVg5ArA(r3, r5)
            int r1 = p000.FW1.m68395a(r1, r0)
            if (r1 <= 0) goto L24
            int r5 = r5 + (-1)
            goto L17
        L24:
            if (r4 > r5) goto L8
            int r1 = kotlin.UIntArray.m74135getpVg5ArA(r3, r4)
            int r2 = kotlin.UIntArray.m74135getpVg5ArA(r3, r5)
            kotlin.UIntArray.m74140setVXSXFK8(r3, r4, r2)
            kotlin.UIntArray.m74140setVXSXFK8(r3, r5, r1)
            int r4 = r4 + 1
            int r5 = r5 + (-1)
            goto L8
        L39:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.UArraySortingKt.m28813d(int[], int, int):int");
    }

    /* renamed from: e */
    public static final void m28812e(long[] jArr, int i, int i2) {
        int m28816a = m28816a(jArr, i, i2);
        int i3 = m28816a - 1;
        if (i < i3) {
            m28812e(jArr, i, i3);
        }
        if (m28816a < i2) {
            m28812e(jArr, m28816a, i2);
        }
    }

    /* renamed from: f */
    public static final void m28811f(byte[] bArr, int i, int i2) {
        int m28815b = m28815b(bArr, i, i2);
        int i3 = m28815b - 1;
        if (i < i3) {
            m28811f(bArr, i, i3);
        }
        if (m28815b < i2) {
            m28811f(bArr, m28815b, i2);
        }
    }

    /* renamed from: g */
    public static final void m28810g(short[] sArr, int i, int i2) {
        int m28814c = m28814c(sArr, i, i2);
        int i3 = m28814c - 1;
        if (i < i3) {
            m28810g(sArr, i, i3);
        }
        if (m28814c < i2) {
            m28810g(sArr, m28814c, i2);
        }
    }

    /* renamed from: h */
    public static final void m28809h(int[] iArr, int i, int i2) {
        int m28813d = m28813d(iArr, i, i2);
        int i3 = m28813d - 1;
        if (i < i3) {
            m28809h(iArr, i, i3);
        }
        if (m28813d < i2) {
            m28809h(iArr, m28813d, i2);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray--nroSd4  reason: not valid java name */
    public static final void m74205sortArraynroSd4(@NotNull long[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        m28812e(array, i, i2 - 1);
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray-4UcCI2c  reason: not valid java name */
    public static final void m74206sortArray4UcCI2c(@NotNull byte[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        m28811f(array, i, i2 - 1);
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray-Aa5vz7o  reason: not valid java name */
    public static final void m74207sortArrayAa5vz7o(@NotNull short[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        m28810g(array, i, i2 - 1);
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray-oBK06Vg  reason: not valid java name */
    public static final void m74208sortArrayoBK06Vg(@NotNull int[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        m28809h(array, i, i2 - 1);
    }
}
