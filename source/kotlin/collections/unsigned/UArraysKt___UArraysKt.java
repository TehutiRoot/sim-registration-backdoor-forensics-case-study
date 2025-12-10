package kotlin.collections.unsigned;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.ExperimentalStdlibApi;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Pair;
import kotlin.SinceKotlin;
import kotlin.TuplesKt;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.WasExperimental;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.IndexingIterable;
import kotlin.collections.UArraySortingKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.AbstractC11719c;
import kotlin.ranges.IntRange;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes5.dex */
public abstract class UArraysKt___UArraysKt extends UArraysKt___UArraysJvmKt {
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: contentEquals-FGO6Aew  reason: not valid java name */
    public static boolean m74254contentEqualsFGO6Aew(@Nullable short[] sArr, @Nullable short[] sArr2) {
        if (sArr == null) {
            sArr = null;
        }
        if (sArr2 == null) {
            sArr2 = null;
        }
        return Arrays.equals(sArr, sArr2);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: contentEquals-KJPZfPQ  reason: not valid java name */
    public static boolean m74255contentEqualsKJPZfPQ(@Nullable int[] iArr, @Nullable int[] iArr2) {
        if (iArr == null) {
            iArr = null;
        }
        if (iArr2 == null) {
            iArr2 = null;
        }
        return Arrays.equals(iArr, iArr2);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: contentEquals-kV0jMPg  reason: not valid java name */
    public static boolean m74256contentEqualskV0jMPg(@Nullable byte[] bArr, @Nullable byte[] bArr2) {
        if (bArr == null) {
            bArr = null;
        }
        if (bArr2 == null) {
            bArr2 = null;
        }
        return Arrays.equals(bArr, bArr2);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: contentEquals-lec5QzE  reason: not valid java name */
    public static boolean m74257contentEqualslec5QzE(@Nullable long[] jArr, @Nullable long[] jArr2) {
        if (jArr == null) {
            jArr = null;
        }
        if (jArr2 == null) {
            jArr2 = null;
        }
        return Arrays.equals(jArr, jArr2);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: contentHashCode-2csIQuQ  reason: not valid java name */
    public static final int m74258contentHashCode2csIQuQ(@Nullable byte[] bArr) {
        if (bArr == null) {
            bArr = null;
        }
        return Arrays.hashCode(bArr);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: contentHashCode-XUkPCBk  reason: not valid java name */
    public static final int m74259contentHashCodeXUkPCBk(@Nullable int[] iArr) {
        if (iArr == null) {
            iArr = null;
        }
        return Arrays.hashCode(iArr);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: contentHashCode-d-6D3K8  reason: not valid java name */
    public static final int m74260contentHashCoded6D3K8(@Nullable short[] sArr) {
        if (sArr == null) {
            sArr = null;
        }
        return Arrays.hashCode(sArr);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: contentHashCode-uLth9ew  reason: not valid java name */
    public static final int m74261contentHashCodeuLth9ew(@Nullable long[] jArr) {
        if (jArr == null) {
            jArr = null;
        }
        return Arrays.hashCode(jArr);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: contentToString-2csIQuQ  reason: not valid java name */
    public static String m74262contentToString2csIQuQ(@Nullable byte[] bArr) {
        String joinToString$default;
        if (bArr == null || (joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(UByteArray.m74104boximpl(bArr), ", ", "[", "]", 0, null, null, 56, null)) == null) {
            return AbstractJsonLexerKt.NULL;
        }
        return joinToString$default;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: contentToString-XUkPCBk  reason: not valid java name */
    public static String m74263contentToStringXUkPCBk(@Nullable int[] iArr) {
        String joinToString$default;
        if (iArr == null || (joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(UIntArray.m74128boximpl(iArr), ", ", "[", "]", 0, null, null, 56, null)) == null) {
            return AbstractJsonLexerKt.NULL;
        }
        return joinToString$default;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: contentToString-d-6D3K8  reason: not valid java name */
    public static String m74264contentToStringd6D3K8(@Nullable short[] sArr) {
        String joinToString$default;
        if (sArr == null || (joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(UShortArray.m74176boximpl(sArr), ", ", "[", "]", 0, null, null, 56, null)) == null) {
            return AbstractJsonLexerKt.NULL;
        }
        return joinToString$default;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: contentToString-uLth9ew  reason: not valid java name */
    public static String m74265contentToStringuLth9ew(@Nullable long[] jArr) {
        String joinToString$default;
        if (jArr == null || (joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(ULongArray.m74152boximpl(jArr), ", ", "[", "]", 0, null, null, 56, null)) == null) {
            return AbstractJsonLexerKt.NULL;
        }
        return joinToString$default;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: drop-PpDY95g  reason: not valid java name */
    public static final List<UByte> m74266dropPpDY95g(@NotNull byte[] drop, int i) {
        Intrinsics.checkNotNullParameter(drop, "$this$drop");
        if (i >= 0) {
            return m74426takeLastPpDY95g(drop, AbstractC11719c.coerceAtLeast(UByteArray.m74112getSizeimpl(drop) - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: drop-nggk6HY  reason: not valid java name */
    public static final List<UShort> m74267dropnggk6HY(@NotNull short[] drop, int i) {
        Intrinsics.checkNotNullParameter(drop, "$this$drop");
        if (i >= 0) {
            return m74427takeLastnggk6HY(drop, AbstractC11719c.coerceAtLeast(UShortArray.m74184getSizeimpl(drop) - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: drop-qFRl0hI  reason: not valid java name */
    public static final List<UInt> m74268dropqFRl0hI(@NotNull int[] drop, int i) {
        Intrinsics.checkNotNullParameter(drop, "$this$drop");
        if (i >= 0) {
            return m74428takeLastqFRl0hI(drop, AbstractC11719c.coerceAtLeast(UIntArray.m74136getSizeimpl(drop) - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: drop-r7IrZao  reason: not valid java name */
    public static final List<ULong> m74269dropr7IrZao(@NotNull long[] drop, int i) {
        Intrinsics.checkNotNullParameter(drop, "$this$drop");
        if (i >= 0) {
            return m74429takeLastr7IrZao(drop, AbstractC11719c.coerceAtLeast(ULongArray.m74160getSizeimpl(drop) - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: dropLast-PpDY95g  reason: not valid java name */
    public static final List<UByte> m74270dropLastPpDY95g(@NotNull byte[] dropLast, int i) {
        Intrinsics.checkNotNullParameter(dropLast, "$this$dropLast");
        if (i >= 0) {
            return m74422takePpDY95g(dropLast, AbstractC11719c.coerceAtLeast(UByteArray.m74112getSizeimpl(dropLast) - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: dropLast-nggk6HY  reason: not valid java name */
    public static final List<UShort> m74271dropLastnggk6HY(@NotNull short[] dropLast, int i) {
        Intrinsics.checkNotNullParameter(dropLast, "$this$dropLast");
        if (i >= 0) {
            return m74423takenggk6HY(dropLast, AbstractC11719c.coerceAtLeast(UShortArray.m74184getSizeimpl(dropLast) - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: dropLast-qFRl0hI  reason: not valid java name */
    public static final List<UInt> m74272dropLastqFRl0hI(@NotNull int[] dropLast, int i) {
        Intrinsics.checkNotNullParameter(dropLast, "$this$dropLast");
        if (i >= 0) {
            return m74424takeqFRl0hI(dropLast, AbstractC11719c.coerceAtLeast(UIntArray.m74136getSizeimpl(dropLast) - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: dropLast-r7IrZao  reason: not valid java name */
    public static final List<ULong> m74273dropLastr7IrZao(@NotNull long[] dropLast, int i) {
        Intrinsics.checkNotNullParameter(dropLast, "$this$dropLast");
        if (i >= 0) {
            return m74425taker7IrZao(dropLast, AbstractC11719c.coerceAtLeast(ULongArray.m74160getSizeimpl(dropLast) - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: fill-2fe2U9s  reason: not valid java name */
    public static final void m74274fill2fe2U9s(@NotNull int[] fill, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(fill, "$this$fill");
        ArraysKt___ArraysJvmKt.fill(fill, i, i2, i3);
    }

    /* renamed from: fill-2fe2U9s$default  reason: not valid java name */
    public static /* synthetic */ void m74275fill2fe2U9s$default(int[] iArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = UIntArray.m74136getSizeimpl(iArr);
        }
        m74274fill2fe2U9s(iArr, i, i2, i3);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: fill-EtDCXyQ  reason: not valid java name */
    public static final void m74276fillEtDCXyQ(@NotNull short[] fill, short s, int i, int i2) {
        Intrinsics.checkNotNullParameter(fill, "$this$fill");
        ArraysKt___ArraysJvmKt.fill(fill, s, i, i2);
    }

    /* renamed from: fill-EtDCXyQ$default  reason: not valid java name */
    public static /* synthetic */ void m74277fillEtDCXyQ$default(short[] sArr, short s, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = UShortArray.m74184getSizeimpl(sArr);
        }
        m74276fillEtDCXyQ(sArr, s, i, i2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: fill-K6DWlUc  reason: not valid java name */
    public static final void m74278fillK6DWlUc(@NotNull long[] fill, long j, int i, int i2) {
        Intrinsics.checkNotNullParameter(fill, "$this$fill");
        ArraysKt___ArraysJvmKt.fill(fill, j, i, i2);
    }

    /* renamed from: fill-K6DWlUc$default  reason: not valid java name */
    public static /* synthetic */ void m74279fillK6DWlUc$default(long[] jArr, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = ULongArray.m74160getSizeimpl(jArr);
        }
        m74278fillK6DWlUc(jArr, j, i, i2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: fill-WpHrYlw  reason: not valid java name */
    public static final void m74280fillWpHrYlw(@NotNull byte[] fill, byte b, int i, int i2) {
        Intrinsics.checkNotNullParameter(fill, "$this$fill");
        ArraysKt___ArraysJvmKt.fill(fill, b, i, i2);
    }

    /* renamed from: fill-WpHrYlw$default  reason: not valid java name */
    public static /* synthetic */ void m74281fillWpHrYlw$default(byte[] bArr, byte b, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = UByteArray.m74112getSizeimpl(bArr);
        }
        m74280fillWpHrYlw(bArr, b, i, i2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: firstOrNull--ajY-9A  reason: not valid java name */
    public static final UInt m74282firstOrNullajY9A(@NotNull int[] firstOrNull) {
        Intrinsics.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        if (UIntArray.m74138isEmptyimpl(firstOrNull)) {
            return null;
        }
        return UInt.m74121boximpl(UIntArray.m74135getpVg5ArA(firstOrNull, 0));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: firstOrNull-GBYM_sE  reason: not valid java name */
    public static final UByte m74283firstOrNullGBYM_sE(@NotNull byte[] firstOrNull) {
        Intrinsics.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        if (UByteArray.m74114isEmptyimpl(firstOrNull)) {
            return null;
        }
        return UByte.m74097boximpl(UByteArray.m74111getw2LRezQ(firstOrNull, 0));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: firstOrNull-QwZRm1k  reason: not valid java name */
    public static final ULong m74284firstOrNullQwZRm1k(@NotNull long[] firstOrNull) {
        Intrinsics.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        if (ULongArray.m74162isEmptyimpl(firstOrNull)) {
            return null;
        }
        return ULong.m74145boximpl(ULongArray.m74159getsVKNKU(firstOrNull, 0));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: firstOrNull-rL5Bavg  reason: not valid java name */
    public static final UShort m74285firstOrNullrL5Bavg(@NotNull short[] firstOrNull) {
        Intrinsics.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        if (UShortArray.m74186isEmptyimpl(firstOrNull)) {
            return null;
        }
        return UShort.m74169boximpl(UShortArray.m74183getMh2AYeg(firstOrNull, 0));
    }

    @NotNull
    /* renamed from: getIndices--ajY-9A  reason: not valid java name */
    public static final IntRange m74286getIndicesajY9A(@NotNull int[] indices) {
        Intrinsics.checkNotNullParameter(indices, "$this$indices");
        return ArraysKt___ArraysKt.getIndices(indices);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: getIndices--ajY-9A$annotations  reason: not valid java name */
    public static /* synthetic */ void m74287getIndicesajY9A$annotations(int[] iArr) {
    }

    @NotNull
    /* renamed from: getIndices-GBYM_sE  reason: not valid java name */
    public static final IntRange m74288getIndicesGBYM_sE(@NotNull byte[] indices) {
        Intrinsics.checkNotNullParameter(indices, "$this$indices");
        return ArraysKt___ArraysKt.getIndices(indices);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: getIndices-GBYM_sE$annotations  reason: not valid java name */
    public static /* synthetic */ void m74289getIndicesGBYM_sE$annotations(byte[] bArr) {
    }

    @NotNull
    /* renamed from: getIndices-QwZRm1k  reason: not valid java name */
    public static final IntRange m74290getIndicesQwZRm1k(@NotNull long[] indices) {
        Intrinsics.checkNotNullParameter(indices, "$this$indices");
        return ArraysKt___ArraysKt.getIndices(indices);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: getIndices-QwZRm1k$annotations  reason: not valid java name */
    public static /* synthetic */ void m74291getIndicesQwZRm1k$annotations(long[] jArr) {
    }

    @NotNull
    /* renamed from: getIndices-rL5Bavg  reason: not valid java name */
    public static final IntRange m74292getIndicesrL5Bavg(@NotNull short[] indices) {
        Intrinsics.checkNotNullParameter(indices, "$this$indices");
        return ArraysKt___ArraysKt.getIndices(indices);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: getIndices-rL5Bavg$annotations  reason: not valid java name */
    public static /* synthetic */ void m74293getIndicesrL5Bavg$annotations(short[] sArr) {
    }

    /* renamed from: getLastIndex--ajY-9A  reason: not valid java name */
    public static final int m74294getLastIndexajY9A(@NotNull int[] lastIndex) {
        Intrinsics.checkNotNullParameter(lastIndex, "$this$lastIndex");
        return ArraysKt___ArraysKt.getLastIndex(lastIndex);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: getLastIndex--ajY-9A$annotations  reason: not valid java name */
    public static /* synthetic */ void m74295getLastIndexajY9A$annotations(int[] iArr) {
    }

    /* renamed from: getLastIndex-GBYM_sE  reason: not valid java name */
    public static final int m74296getLastIndexGBYM_sE(@NotNull byte[] lastIndex) {
        Intrinsics.checkNotNullParameter(lastIndex, "$this$lastIndex");
        return ArraysKt___ArraysKt.getLastIndex(lastIndex);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: getLastIndex-GBYM_sE$annotations  reason: not valid java name */
    public static /* synthetic */ void m74297getLastIndexGBYM_sE$annotations(byte[] bArr) {
    }

    /* renamed from: getLastIndex-QwZRm1k  reason: not valid java name */
    public static final int m74298getLastIndexQwZRm1k(@NotNull long[] lastIndex) {
        Intrinsics.checkNotNullParameter(lastIndex, "$this$lastIndex");
        return ArraysKt___ArraysKt.getLastIndex(lastIndex);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: getLastIndex-QwZRm1k$annotations  reason: not valid java name */
    public static /* synthetic */ void m74299getLastIndexQwZRm1k$annotations(long[] jArr) {
    }

    /* renamed from: getLastIndex-rL5Bavg  reason: not valid java name */
    public static final int m74300getLastIndexrL5Bavg(@NotNull short[] lastIndex) {
        Intrinsics.checkNotNullParameter(lastIndex, "$this$lastIndex");
        return ArraysKt___ArraysKt.getLastIndex(lastIndex);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: getLastIndex-rL5Bavg$annotations  reason: not valid java name */
    public static /* synthetic */ void m74301getLastIndexrL5Bavg$annotations(short[] sArr) {
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: getOrNull-PpDY95g  reason: not valid java name */
    public static final UByte m74302getOrNullPpDY95g(@NotNull byte[] getOrNull, int i) {
        Intrinsics.checkNotNullParameter(getOrNull, "$this$getOrNull");
        if (i >= 0 && i <= ArraysKt___ArraysKt.getLastIndex(getOrNull)) {
            return UByte.m74097boximpl(UByteArray.m74111getw2LRezQ(getOrNull, i));
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: getOrNull-nggk6HY  reason: not valid java name */
    public static final UShort m74303getOrNullnggk6HY(@NotNull short[] getOrNull, int i) {
        Intrinsics.checkNotNullParameter(getOrNull, "$this$getOrNull");
        if (i >= 0 && i <= ArraysKt___ArraysKt.getLastIndex(getOrNull)) {
            return UShort.m74169boximpl(UShortArray.m74183getMh2AYeg(getOrNull, i));
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: getOrNull-qFRl0hI  reason: not valid java name */
    public static final UInt m74304getOrNullqFRl0hI(@NotNull int[] getOrNull, int i) {
        Intrinsics.checkNotNullParameter(getOrNull, "$this$getOrNull");
        if (i >= 0 && i <= ArraysKt___ArraysKt.getLastIndex(getOrNull)) {
            return UInt.m74121boximpl(UIntArray.m74135getpVg5ArA(getOrNull, i));
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: getOrNull-r7IrZao  reason: not valid java name */
    public static final ULong m74305getOrNullr7IrZao(@NotNull long[] getOrNull, int i) {
        Intrinsics.checkNotNullParameter(getOrNull, "$this$getOrNull");
        if (i >= 0 && i <= ArraysKt___ArraysKt.getLastIndex(getOrNull)) {
            return ULong.m74145boximpl(ULongArray.m74159getsVKNKU(getOrNull, i));
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: lastOrNull--ajY-9A  reason: not valid java name */
    public static final UInt m74306lastOrNullajY9A(@NotNull int[] lastOrNull) {
        Intrinsics.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        if (UIntArray.m74138isEmptyimpl(lastOrNull)) {
            return null;
        }
        return UInt.m74121boximpl(UIntArray.m74135getpVg5ArA(lastOrNull, UIntArray.m74136getSizeimpl(lastOrNull) - 1));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: lastOrNull-GBYM_sE  reason: not valid java name */
    public static final UByte m74307lastOrNullGBYM_sE(@NotNull byte[] lastOrNull) {
        Intrinsics.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        if (UByteArray.m74114isEmptyimpl(lastOrNull)) {
            return null;
        }
        return UByte.m74097boximpl(UByteArray.m74111getw2LRezQ(lastOrNull, UByteArray.m74112getSizeimpl(lastOrNull) - 1));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: lastOrNull-QwZRm1k  reason: not valid java name */
    public static final ULong m74308lastOrNullQwZRm1k(@NotNull long[] lastOrNull) {
        Intrinsics.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        if (ULongArray.m74162isEmptyimpl(lastOrNull)) {
            return null;
        }
        return ULong.m74145boximpl(ULongArray.m74159getsVKNKU(lastOrNull, ULongArray.m74160getSizeimpl(lastOrNull) - 1));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: lastOrNull-rL5Bavg  reason: not valid java name */
    public static final UShort m74309lastOrNullrL5Bavg(@NotNull short[] lastOrNull) {
        Intrinsics.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        if (UShortArray.m74186isEmptyimpl(lastOrNull)) {
            return null;
        }
        return UShort.m74169boximpl(UShortArray.m74183getMh2AYeg(lastOrNull, UShortArray.m74184getSizeimpl(lastOrNull) - 1));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: maxOrNull--ajY-9A  reason: not valid java name */
    public static final UInt m74310maxOrNullajY9A(@NotNull int[] maxOrNull) {
        int compare;
        Intrinsics.checkNotNullParameter(maxOrNull, "$this$maxOrNull");
        if (UIntArray.m74138isEmptyimpl(maxOrNull)) {
            return null;
        }
        int m74135getpVg5ArA = UIntArray.m74135getpVg5ArA(maxOrNull, 0);
        ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(maxOrNull)).iterator();
        while (it.hasNext()) {
            int m74135getpVg5ArA2 = UIntArray.m74135getpVg5ArA(maxOrNull, it.nextInt());
            compare = Integer.compare(m74135getpVg5ArA ^ Integer.MIN_VALUE, m74135getpVg5ArA2 ^ Integer.MIN_VALUE);
            if (compare < 0) {
                m74135getpVg5ArA = m74135getpVg5ArA2;
            }
        }
        return UInt.m74121boximpl(m74135getpVg5ArA);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: maxOrNull-GBYM_sE  reason: not valid java name */
    public static final UByte m74311maxOrNullGBYM_sE(@NotNull byte[] maxOrNull) {
        Intrinsics.checkNotNullParameter(maxOrNull, "$this$maxOrNull");
        if (UByteArray.m74114isEmptyimpl(maxOrNull)) {
            return null;
        }
        byte m74111getw2LRezQ = UByteArray.m74111getw2LRezQ(maxOrNull, 0);
        ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(maxOrNull)).iterator();
        while (it.hasNext()) {
            byte m74111getw2LRezQ2 = UByteArray.m74111getw2LRezQ(maxOrNull, it.nextInt());
            if (Intrinsics.compare(m74111getw2LRezQ & 255, m74111getw2LRezQ2 & 255) < 0) {
                m74111getw2LRezQ = m74111getw2LRezQ2;
            }
        }
        return UByte.m74097boximpl(m74111getw2LRezQ);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: maxOrNull-QwZRm1k  reason: not valid java name */
    public static final ULong m74312maxOrNullQwZRm1k(@NotNull long[] maxOrNull) {
        int compare;
        Intrinsics.checkNotNullParameter(maxOrNull, "$this$maxOrNull");
        if (ULongArray.m74162isEmptyimpl(maxOrNull)) {
            return null;
        }
        long m74159getsVKNKU = ULongArray.m74159getsVKNKU(maxOrNull, 0);
        ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(maxOrNull)).iterator();
        while (it.hasNext()) {
            long m74159getsVKNKU2 = ULongArray.m74159getsVKNKU(maxOrNull, it.nextInt());
            compare = Long.compare(m74159getsVKNKU ^ Long.MIN_VALUE, m74159getsVKNKU2 ^ Long.MIN_VALUE);
            if (compare < 0) {
                m74159getsVKNKU = m74159getsVKNKU2;
            }
        }
        return ULong.m74145boximpl(m74159getsVKNKU);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: maxOrNull-rL5Bavg  reason: not valid java name */
    public static final UShort m74313maxOrNullrL5Bavg(@NotNull short[] maxOrNull) {
        Intrinsics.checkNotNullParameter(maxOrNull, "$this$maxOrNull");
        if (UShortArray.m74186isEmptyimpl(maxOrNull)) {
            return null;
        }
        short m74183getMh2AYeg = UShortArray.m74183getMh2AYeg(maxOrNull, 0);
        ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(maxOrNull)).iterator();
        while (it.hasNext()) {
            short m74183getMh2AYeg2 = UShortArray.m74183getMh2AYeg(maxOrNull, it.nextInt());
            if (Intrinsics.compare(m74183getMh2AYeg & UShort.MAX_VALUE, 65535 & m74183getMh2AYeg2) < 0) {
                m74183getMh2AYeg = m74183getMh2AYeg2;
            }
        }
        return UShort.m74169boximpl(m74183getMh2AYeg);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "maxOrThrow-U")
    /* renamed from: maxOrThrow-U  reason: not valid java name */
    public static final int m74315maxOrThrowU(@NotNull int[] max) {
        int compare;
        Intrinsics.checkNotNullParameter(max, "$this$max");
        if (!UIntArray.m74138isEmptyimpl(max)) {
            int m74135getpVg5ArA = UIntArray.m74135getpVg5ArA(max, 0);
            ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(max)).iterator();
            while (it.hasNext()) {
                int m74135getpVg5ArA2 = UIntArray.m74135getpVg5ArA(max, it.nextInt());
                compare = Integer.compare(m74135getpVg5ArA ^ Integer.MIN_VALUE, m74135getpVg5ArA2 ^ Integer.MIN_VALUE);
                if (compare < 0) {
                    m74135getpVg5ArA = m74135getpVg5ArA2;
                }
            }
            return m74135getpVg5ArA;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: maxWithOrNull-XMRcp5o  reason: not valid java name */
    public static final UByte m74318maxWithOrNullXMRcp5o(@NotNull byte[] maxWithOrNull, @NotNull Comparator<? super UByte> comparator) {
        Intrinsics.checkNotNullParameter(maxWithOrNull, "$this$maxWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (UByteArray.m74114isEmptyimpl(maxWithOrNull)) {
            return null;
        }
        byte m74111getw2LRezQ = UByteArray.m74111getw2LRezQ(maxWithOrNull, 0);
        ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(maxWithOrNull)).iterator();
        while (it.hasNext()) {
            byte m74111getw2LRezQ2 = UByteArray.m74111getw2LRezQ(maxWithOrNull, it.nextInt());
            if (comparator.compare(UByte.m74097boximpl(m74111getw2LRezQ), UByte.m74097boximpl(m74111getw2LRezQ2)) < 0) {
                m74111getw2LRezQ = m74111getw2LRezQ2;
            }
        }
        return UByte.m74097boximpl(m74111getw2LRezQ);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: maxWithOrNull-YmdZ_VM  reason: not valid java name */
    public static final UInt m74319maxWithOrNullYmdZ_VM(@NotNull int[] maxWithOrNull, @NotNull Comparator<? super UInt> comparator) {
        Intrinsics.checkNotNullParameter(maxWithOrNull, "$this$maxWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (UIntArray.m74138isEmptyimpl(maxWithOrNull)) {
            return null;
        }
        int m74135getpVg5ArA = UIntArray.m74135getpVg5ArA(maxWithOrNull, 0);
        ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(maxWithOrNull)).iterator();
        while (it.hasNext()) {
            int m74135getpVg5ArA2 = UIntArray.m74135getpVg5ArA(maxWithOrNull, it.nextInt());
            if (comparator.compare(UInt.m74121boximpl(m74135getpVg5ArA), UInt.m74121boximpl(m74135getpVg5ArA2)) < 0) {
                m74135getpVg5ArA = m74135getpVg5ArA2;
            }
        }
        return UInt.m74121boximpl(m74135getpVg5ArA);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: maxWithOrNull-eOHTfZs  reason: not valid java name */
    public static final UShort m74320maxWithOrNulleOHTfZs(@NotNull short[] maxWithOrNull, @NotNull Comparator<? super UShort> comparator) {
        Intrinsics.checkNotNullParameter(maxWithOrNull, "$this$maxWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (UShortArray.m74186isEmptyimpl(maxWithOrNull)) {
            return null;
        }
        short m74183getMh2AYeg = UShortArray.m74183getMh2AYeg(maxWithOrNull, 0);
        ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(maxWithOrNull)).iterator();
        while (it.hasNext()) {
            short m74183getMh2AYeg2 = UShortArray.m74183getMh2AYeg(maxWithOrNull, it.nextInt());
            if (comparator.compare(UShort.m74169boximpl(m74183getMh2AYeg), UShort.m74169boximpl(m74183getMh2AYeg2)) < 0) {
                m74183getMh2AYeg = m74183getMh2AYeg2;
            }
        }
        return UShort.m74169boximpl(m74183getMh2AYeg);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: maxWithOrNull-zrEWJaI  reason: not valid java name */
    public static final ULong m74321maxWithOrNullzrEWJaI(@NotNull long[] maxWithOrNull, @NotNull Comparator<? super ULong> comparator) {
        Intrinsics.checkNotNullParameter(maxWithOrNull, "$this$maxWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (ULongArray.m74162isEmptyimpl(maxWithOrNull)) {
            return null;
        }
        long m74159getsVKNKU = ULongArray.m74159getsVKNKU(maxWithOrNull, 0);
        ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(maxWithOrNull)).iterator();
        while (it.hasNext()) {
            long m74159getsVKNKU2 = ULongArray.m74159getsVKNKU(maxWithOrNull, it.nextInt());
            if (comparator.compare(ULong.m74145boximpl(m74159getsVKNKU), ULong.m74145boximpl(m74159getsVKNKU2)) < 0) {
                m74159getsVKNKU = m74159getsVKNKU2;
            }
        }
        return ULong.m74145boximpl(m74159getsVKNKU);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "maxWithOrThrow-U")
    /* renamed from: maxWithOrThrow-U  reason: not valid java name */
    public static final int m74323maxWithOrThrowU(@NotNull int[] maxWith, @NotNull Comparator<? super UInt> comparator) {
        Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!UIntArray.m74138isEmptyimpl(maxWith)) {
            int m74135getpVg5ArA = UIntArray.m74135getpVg5ArA(maxWith, 0);
            ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(maxWith)).iterator();
            while (it.hasNext()) {
                int m74135getpVg5ArA2 = UIntArray.m74135getpVg5ArA(maxWith, it.nextInt());
                if (comparator.compare(UInt.m74121boximpl(m74135getpVg5ArA), UInt.m74121boximpl(m74135getpVg5ArA2)) < 0) {
                    m74135getpVg5ArA = m74135getpVg5ArA2;
                }
            }
            return m74135getpVg5ArA;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: minOrNull--ajY-9A  reason: not valid java name */
    public static final UInt m74326minOrNullajY9A(@NotNull int[] minOrNull) {
        int compare;
        Intrinsics.checkNotNullParameter(minOrNull, "$this$minOrNull");
        if (UIntArray.m74138isEmptyimpl(minOrNull)) {
            return null;
        }
        int m74135getpVg5ArA = UIntArray.m74135getpVg5ArA(minOrNull, 0);
        ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(minOrNull)).iterator();
        while (it.hasNext()) {
            int m74135getpVg5ArA2 = UIntArray.m74135getpVg5ArA(minOrNull, it.nextInt());
            compare = Integer.compare(m74135getpVg5ArA ^ Integer.MIN_VALUE, m74135getpVg5ArA2 ^ Integer.MIN_VALUE);
            if (compare > 0) {
                m74135getpVg5ArA = m74135getpVg5ArA2;
            }
        }
        return UInt.m74121boximpl(m74135getpVg5ArA);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: minOrNull-GBYM_sE  reason: not valid java name */
    public static final UByte m74327minOrNullGBYM_sE(@NotNull byte[] minOrNull) {
        Intrinsics.checkNotNullParameter(minOrNull, "$this$minOrNull");
        if (UByteArray.m74114isEmptyimpl(minOrNull)) {
            return null;
        }
        byte m74111getw2LRezQ = UByteArray.m74111getw2LRezQ(minOrNull, 0);
        ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(minOrNull)).iterator();
        while (it.hasNext()) {
            byte m74111getw2LRezQ2 = UByteArray.m74111getw2LRezQ(minOrNull, it.nextInt());
            if (Intrinsics.compare(m74111getw2LRezQ & 255, m74111getw2LRezQ2 & 255) > 0) {
                m74111getw2LRezQ = m74111getw2LRezQ2;
            }
        }
        return UByte.m74097boximpl(m74111getw2LRezQ);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: minOrNull-QwZRm1k  reason: not valid java name */
    public static final ULong m74328minOrNullQwZRm1k(@NotNull long[] minOrNull) {
        int compare;
        Intrinsics.checkNotNullParameter(minOrNull, "$this$minOrNull");
        if (ULongArray.m74162isEmptyimpl(minOrNull)) {
            return null;
        }
        long m74159getsVKNKU = ULongArray.m74159getsVKNKU(minOrNull, 0);
        ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(minOrNull)).iterator();
        while (it.hasNext()) {
            long m74159getsVKNKU2 = ULongArray.m74159getsVKNKU(minOrNull, it.nextInt());
            compare = Long.compare(m74159getsVKNKU ^ Long.MIN_VALUE, m74159getsVKNKU2 ^ Long.MIN_VALUE);
            if (compare > 0) {
                m74159getsVKNKU = m74159getsVKNKU2;
            }
        }
        return ULong.m74145boximpl(m74159getsVKNKU);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: minOrNull-rL5Bavg  reason: not valid java name */
    public static final UShort m74329minOrNullrL5Bavg(@NotNull short[] minOrNull) {
        Intrinsics.checkNotNullParameter(minOrNull, "$this$minOrNull");
        if (UShortArray.m74186isEmptyimpl(minOrNull)) {
            return null;
        }
        short m74183getMh2AYeg = UShortArray.m74183getMh2AYeg(minOrNull, 0);
        ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(minOrNull)).iterator();
        while (it.hasNext()) {
            short m74183getMh2AYeg2 = UShortArray.m74183getMh2AYeg(minOrNull, it.nextInt());
            if (Intrinsics.compare(m74183getMh2AYeg & UShort.MAX_VALUE, 65535 & m74183getMh2AYeg2) > 0) {
                m74183getMh2AYeg = m74183getMh2AYeg2;
            }
        }
        return UShort.m74169boximpl(m74183getMh2AYeg);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "minOrThrow-U")
    /* renamed from: minOrThrow-U  reason: not valid java name */
    public static final int m74331minOrThrowU(@NotNull int[] min) {
        int compare;
        Intrinsics.checkNotNullParameter(min, "$this$min");
        if (!UIntArray.m74138isEmptyimpl(min)) {
            int m74135getpVg5ArA = UIntArray.m74135getpVg5ArA(min, 0);
            ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(min)).iterator();
            while (it.hasNext()) {
                int m74135getpVg5ArA2 = UIntArray.m74135getpVg5ArA(min, it.nextInt());
                compare = Integer.compare(m74135getpVg5ArA ^ Integer.MIN_VALUE, m74135getpVg5ArA2 ^ Integer.MIN_VALUE);
                if (compare > 0) {
                    m74135getpVg5ArA = m74135getpVg5ArA2;
                }
            }
            return m74135getpVg5ArA;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: minWithOrNull-XMRcp5o  reason: not valid java name */
    public static final UByte m74334minWithOrNullXMRcp5o(@NotNull byte[] minWithOrNull, @NotNull Comparator<? super UByte> comparator) {
        Intrinsics.checkNotNullParameter(minWithOrNull, "$this$minWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (UByteArray.m74114isEmptyimpl(minWithOrNull)) {
            return null;
        }
        byte m74111getw2LRezQ = UByteArray.m74111getw2LRezQ(minWithOrNull, 0);
        ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(minWithOrNull)).iterator();
        while (it.hasNext()) {
            byte m74111getw2LRezQ2 = UByteArray.m74111getw2LRezQ(minWithOrNull, it.nextInt());
            if (comparator.compare(UByte.m74097boximpl(m74111getw2LRezQ), UByte.m74097boximpl(m74111getw2LRezQ2)) > 0) {
                m74111getw2LRezQ = m74111getw2LRezQ2;
            }
        }
        return UByte.m74097boximpl(m74111getw2LRezQ);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: minWithOrNull-YmdZ_VM  reason: not valid java name */
    public static final UInt m74335minWithOrNullYmdZ_VM(@NotNull int[] minWithOrNull, @NotNull Comparator<? super UInt> comparator) {
        Intrinsics.checkNotNullParameter(minWithOrNull, "$this$minWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (UIntArray.m74138isEmptyimpl(minWithOrNull)) {
            return null;
        }
        int m74135getpVg5ArA = UIntArray.m74135getpVg5ArA(minWithOrNull, 0);
        ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(minWithOrNull)).iterator();
        while (it.hasNext()) {
            int m74135getpVg5ArA2 = UIntArray.m74135getpVg5ArA(minWithOrNull, it.nextInt());
            if (comparator.compare(UInt.m74121boximpl(m74135getpVg5ArA), UInt.m74121boximpl(m74135getpVg5ArA2)) > 0) {
                m74135getpVg5ArA = m74135getpVg5ArA2;
            }
        }
        return UInt.m74121boximpl(m74135getpVg5ArA);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: minWithOrNull-eOHTfZs  reason: not valid java name */
    public static final UShort m74336minWithOrNulleOHTfZs(@NotNull short[] minWithOrNull, @NotNull Comparator<? super UShort> comparator) {
        Intrinsics.checkNotNullParameter(minWithOrNull, "$this$minWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (UShortArray.m74186isEmptyimpl(minWithOrNull)) {
            return null;
        }
        short m74183getMh2AYeg = UShortArray.m74183getMh2AYeg(minWithOrNull, 0);
        ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(minWithOrNull)).iterator();
        while (it.hasNext()) {
            short m74183getMh2AYeg2 = UShortArray.m74183getMh2AYeg(minWithOrNull, it.nextInt());
            if (comparator.compare(UShort.m74169boximpl(m74183getMh2AYeg), UShort.m74169boximpl(m74183getMh2AYeg2)) > 0) {
                m74183getMh2AYeg = m74183getMh2AYeg2;
            }
        }
        return UShort.m74169boximpl(m74183getMh2AYeg);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: minWithOrNull-zrEWJaI  reason: not valid java name */
    public static final ULong m74337minWithOrNullzrEWJaI(@NotNull long[] minWithOrNull, @NotNull Comparator<? super ULong> comparator) {
        Intrinsics.checkNotNullParameter(minWithOrNull, "$this$minWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (ULongArray.m74162isEmptyimpl(minWithOrNull)) {
            return null;
        }
        long m74159getsVKNKU = ULongArray.m74159getsVKNKU(minWithOrNull, 0);
        ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(minWithOrNull)).iterator();
        while (it.hasNext()) {
            long m74159getsVKNKU2 = ULongArray.m74159getsVKNKU(minWithOrNull, it.nextInt());
            if (comparator.compare(ULong.m74145boximpl(m74159getsVKNKU), ULong.m74145boximpl(m74159getsVKNKU2)) > 0) {
                m74159getsVKNKU = m74159getsVKNKU2;
            }
        }
        return ULong.m74145boximpl(m74159getsVKNKU);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "minWithOrThrow-U")
    /* renamed from: minWithOrThrow-U  reason: not valid java name */
    public static final int m74339minWithOrThrowU(@NotNull int[] minWith, @NotNull Comparator<? super UInt> comparator) {
        Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!UIntArray.m74138isEmptyimpl(minWith)) {
            int m74135getpVg5ArA = UIntArray.m74135getpVg5ArA(minWith, 0);
            ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(minWith)).iterator();
            while (it.hasNext()) {
                int m74135getpVg5ArA2 = UIntArray.m74135getpVg5ArA(minWith, it.nextInt());
                if (comparator.compare(UInt.m74121boximpl(m74135getpVg5ArA), UInt.m74121boximpl(m74135getpVg5ArA2)) > 0) {
                    m74135getpVg5ArA = m74135getpVg5ArA2;
                }
            }
            return m74135getpVg5ArA;
        }
        throw new NoSuchElementException();
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: plus-CFIt9YE  reason: not valid java name */
    public static final int[] m74342plusCFIt9YE(@NotNull int[] plus, @NotNull Collection<UInt> elements) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int m74136getSizeimpl = UIntArray.m74136getSizeimpl(plus);
        int[] copyOf = Arrays.copyOf(plus, UIntArray.m74136getSizeimpl(plus) + elements.size());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        for (UInt uInt : elements) {
            copyOf[m74136getSizeimpl] = uInt.m74127unboximpl();
            m74136getSizeimpl++;
        }
        return UIntArray.m74130constructorimpl(copyOf);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: plus-kzHmqpY  reason: not valid java name */
    public static final long[] m74343pluskzHmqpY(@NotNull long[] plus, @NotNull Collection<ULong> elements) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int m74160getSizeimpl = ULongArray.m74160getSizeimpl(plus);
        long[] copyOf = Arrays.copyOf(plus, ULongArray.m74160getSizeimpl(plus) + elements.size());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        for (ULong uLong : elements) {
            copyOf[m74160getSizeimpl] = uLong.m74151unboximpl();
            m74160getSizeimpl++;
        }
        return ULongArray.m74154constructorimpl(copyOf);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: plus-ojwP5H8  reason: not valid java name */
    public static final short[] m74344plusojwP5H8(@NotNull short[] plus, @NotNull Collection<UShort> elements) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int m74184getSizeimpl = UShortArray.m74184getSizeimpl(plus);
        short[] copyOf = Arrays.copyOf(plus, UShortArray.m74184getSizeimpl(plus) + elements.size());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        for (UShort uShort : elements) {
            copyOf[m74184getSizeimpl] = uShort.m74175unboximpl();
            m74184getSizeimpl++;
        }
        return UShortArray.m74178constructorimpl(copyOf);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: plus-xo_DsdI  reason: not valid java name */
    public static final byte[] m74345plusxo_DsdI(@NotNull byte[] plus, @NotNull Collection<UByte> elements) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int m74112getSizeimpl = UByteArray.m74112getSizeimpl(plus);
        byte[] copyOf = Arrays.copyOf(plus, UByteArray.m74112getSizeimpl(plus) + elements.size());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        for (UByte uByte : elements) {
            copyOf[m74112getSizeimpl] = uByte.m74103unboximpl();
            m74112getSizeimpl++;
        }
        return UByteArray.m74106constructorimpl(copyOf);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: random-2D5oskM  reason: not valid java name */
    public static final int m74346random2D5oskM(@NotNull int[] random, @NotNull Random random2) {
        Intrinsics.checkNotNullParameter(random, "$this$random");
        Intrinsics.checkNotNullParameter(random2, "random");
        if (!UIntArray.m74138isEmptyimpl(random)) {
            return UIntArray.m74135getpVg5ArA(random, random2.nextInt(UIntArray.m74136getSizeimpl(random)));
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: random-JzugnMA  reason: not valid java name */
    public static final long m74347randomJzugnMA(@NotNull long[] random, @NotNull Random random2) {
        Intrinsics.checkNotNullParameter(random, "$this$random");
        Intrinsics.checkNotNullParameter(random2, "random");
        if (!ULongArray.m74162isEmptyimpl(random)) {
            return ULongArray.m74159getsVKNKU(random, random2.nextInt(ULongArray.m74160getSizeimpl(random)));
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: random-oSF2wD8  reason: not valid java name */
    public static final byte m74348randomoSF2wD8(@NotNull byte[] random, @NotNull Random random2) {
        Intrinsics.checkNotNullParameter(random, "$this$random");
        Intrinsics.checkNotNullParameter(random2, "random");
        if (!UByteArray.m74114isEmptyimpl(random)) {
            return UByteArray.m74111getw2LRezQ(random, random2.nextInt(UByteArray.m74112getSizeimpl(random)));
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: random-s5X_as8  reason: not valid java name */
    public static final short m74349randoms5X_as8(@NotNull short[] random, @NotNull Random random2) {
        Intrinsics.checkNotNullParameter(random, "$this$random");
        Intrinsics.checkNotNullParameter(random2, "random");
        if (!UShortArray.m74186isEmptyimpl(random)) {
            return UShortArray.m74183getMh2AYeg(random, random2.nextInt(UShortArray.m74184getSizeimpl(random)));
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* renamed from: randomOrNull-2D5oskM  reason: not valid java name */
    public static final UInt m74350randomOrNull2D5oskM(@NotNull int[] randomOrNull, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        Intrinsics.checkNotNullParameter(random, "random");
        if (UIntArray.m74138isEmptyimpl(randomOrNull)) {
            return null;
        }
        return UInt.m74121boximpl(UIntArray.m74135getpVg5ArA(randomOrNull, random.nextInt(UIntArray.m74136getSizeimpl(randomOrNull))));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* renamed from: randomOrNull-JzugnMA  reason: not valid java name */
    public static final ULong m74351randomOrNullJzugnMA(@NotNull long[] randomOrNull, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        Intrinsics.checkNotNullParameter(random, "random");
        if (ULongArray.m74162isEmptyimpl(randomOrNull)) {
            return null;
        }
        return ULong.m74145boximpl(ULongArray.m74159getsVKNKU(randomOrNull, random.nextInt(ULongArray.m74160getSizeimpl(randomOrNull))));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* renamed from: randomOrNull-oSF2wD8  reason: not valid java name */
    public static final UByte m74352randomOrNulloSF2wD8(@NotNull byte[] randomOrNull, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        Intrinsics.checkNotNullParameter(random, "random");
        if (UByteArray.m74114isEmptyimpl(randomOrNull)) {
            return null;
        }
        return UByte.m74097boximpl(UByteArray.m74111getw2LRezQ(randomOrNull, random.nextInt(UByteArray.m74112getSizeimpl(randomOrNull))));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* renamed from: randomOrNull-s5X_as8  reason: not valid java name */
    public static final UShort m74353randomOrNulls5X_as8(@NotNull short[] randomOrNull, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        Intrinsics.checkNotNullParameter(random, "random");
        if (UShortArray.m74186isEmptyimpl(randomOrNull)) {
            return null;
        }
        return UShort.m74169boximpl(UShortArray.m74183getMh2AYeg(randomOrNull, random.nextInt(UShortArray.m74184getSizeimpl(randomOrNull))));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: reversed--ajY-9A  reason: not valid java name */
    public static final List<UInt> m74354reversedajY9A(@NotNull int[] reversed) {
        Intrinsics.checkNotNullParameter(reversed, "$this$reversed");
        if (UIntArray.m74138isEmptyimpl(reversed)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<UInt> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) UIntArray.m74128boximpl(reversed));
        AbstractC11606js.reverse(mutableList);
        return mutableList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: reversed-GBYM_sE  reason: not valid java name */
    public static final List<UByte> m74355reversedGBYM_sE(@NotNull byte[] reversed) {
        Intrinsics.checkNotNullParameter(reversed, "$this$reversed");
        if (UByteArray.m74114isEmptyimpl(reversed)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<UByte> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) UByteArray.m74104boximpl(reversed));
        AbstractC11606js.reverse(mutableList);
        return mutableList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: reversed-QwZRm1k  reason: not valid java name */
    public static final List<ULong> m74356reversedQwZRm1k(@NotNull long[] reversed) {
        Intrinsics.checkNotNullParameter(reversed, "$this$reversed");
        if (ULongArray.m74162isEmptyimpl(reversed)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<ULong> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) ULongArray.m74152boximpl(reversed));
        AbstractC11606js.reverse(mutableList);
        return mutableList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: reversed-rL5Bavg  reason: not valid java name */
    public static final List<UShort> m74357reversedrL5Bavg(@NotNull short[] reversed) {
        Intrinsics.checkNotNullParameter(reversed, "$this$reversed");
        if (UShortArray.m74186isEmptyimpl(reversed)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<UShort> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) UShortArray.m74176boximpl(reversed));
        AbstractC11606js.reverse(mutableList);
        return mutableList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: shuffle--ajY-9A  reason: not valid java name */
    public static final void m74358shuffleajY9A(@NotNull int[] shuffle) {
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        m74359shuffle2D5oskM(shuffle, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: shuffle-2D5oskM  reason: not valid java name */
    public static final void m74359shuffle2D5oskM(@NotNull int[] shuffle, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = ArraysKt___ArraysKt.getLastIndex(shuffle); lastIndex > 0; lastIndex--) {
            int nextInt = random.nextInt(lastIndex + 1);
            int m74135getpVg5ArA = UIntArray.m74135getpVg5ArA(shuffle, lastIndex);
            UIntArray.m74140setVXSXFK8(shuffle, lastIndex, UIntArray.m74135getpVg5ArA(shuffle, nextInt));
            UIntArray.m74140setVXSXFK8(shuffle, nextInt, m74135getpVg5ArA);
        }
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: shuffle-GBYM_sE  reason: not valid java name */
    public static final void m74360shuffleGBYM_sE(@NotNull byte[] shuffle) {
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        m74363shuffleoSF2wD8(shuffle, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: shuffle-JzugnMA  reason: not valid java name */
    public static final void m74361shuffleJzugnMA(@NotNull long[] shuffle, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = ArraysKt___ArraysKt.getLastIndex(shuffle); lastIndex > 0; lastIndex--) {
            int nextInt = random.nextInt(lastIndex + 1);
            long m74159getsVKNKU = ULongArray.m74159getsVKNKU(shuffle, lastIndex);
            ULongArray.m74164setk8EXiF4(shuffle, lastIndex, ULongArray.m74159getsVKNKU(shuffle, nextInt));
            ULongArray.m74164setk8EXiF4(shuffle, nextInt, m74159getsVKNKU);
        }
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: shuffle-QwZRm1k  reason: not valid java name */
    public static final void m74362shuffleQwZRm1k(@NotNull long[] shuffle) {
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        m74361shuffleJzugnMA(shuffle, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: shuffle-oSF2wD8  reason: not valid java name */
    public static final void m74363shuffleoSF2wD8(@NotNull byte[] shuffle, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = ArraysKt___ArraysKt.getLastIndex(shuffle); lastIndex > 0; lastIndex--) {
            int nextInt = random.nextInt(lastIndex + 1);
            byte m74111getw2LRezQ = UByteArray.m74111getw2LRezQ(shuffle, lastIndex);
            UByteArray.m74116setVurrAj0(shuffle, lastIndex, UByteArray.m74111getw2LRezQ(shuffle, nextInt));
            UByteArray.m74116setVurrAj0(shuffle, nextInt, m74111getw2LRezQ);
        }
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: shuffle-rL5Bavg  reason: not valid java name */
    public static final void m74364shufflerL5Bavg(@NotNull short[] shuffle) {
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        m74365shuffles5X_as8(shuffle, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: shuffle-s5X_as8  reason: not valid java name */
    public static final void m74365shuffles5X_as8(@NotNull short[] shuffle, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = ArraysKt___ArraysKt.getLastIndex(shuffle); lastIndex > 0; lastIndex--) {
            int nextInt = random.nextInt(lastIndex + 1);
            short m74183getMh2AYeg = UShortArray.m74183getMh2AYeg(shuffle, lastIndex);
            UShortArray.m74188set01HTLdE(shuffle, lastIndex, UShortArray.m74183getMh2AYeg(shuffle, nextInt));
            UShortArray.m74188set01HTLdE(shuffle, nextInt, m74183getMh2AYeg);
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: singleOrNull--ajY-9A  reason: not valid java name */
    public static final UInt m74366singleOrNullajY9A(@NotNull int[] singleOrNull) {
        Intrinsics.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        if (UIntArray.m74136getSizeimpl(singleOrNull) == 1) {
            return UInt.m74121boximpl(UIntArray.m74135getpVg5ArA(singleOrNull, 0));
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: singleOrNull-GBYM_sE  reason: not valid java name */
    public static final UByte m74367singleOrNullGBYM_sE(@NotNull byte[] singleOrNull) {
        Intrinsics.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        if (UByteArray.m74112getSizeimpl(singleOrNull) == 1) {
            return UByte.m74097boximpl(UByteArray.m74111getw2LRezQ(singleOrNull, 0));
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: singleOrNull-QwZRm1k  reason: not valid java name */
    public static final ULong m74368singleOrNullQwZRm1k(@NotNull long[] singleOrNull) {
        Intrinsics.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        if (ULongArray.m74160getSizeimpl(singleOrNull) == 1) {
            return ULong.m74145boximpl(ULongArray.m74159getsVKNKU(singleOrNull, 0));
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: singleOrNull-rL5Bavg  reason: not valid java name */
    public static final UShort m74369singleOrNullrL5Bavg(@NotNull short[] singleOrNull) {
        Intrinsics.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        if (UShortArray.m74184getSizeimpl(singleOrNull) == 1) {
            return UShort.m74169boximpl(UShortArray.m74183getMh2AYeg(singleOrNull, 0));
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: slice-F7u83W8  reason: not valid java name */
    public static final List<ULong> m74370sliceF7u83W8(@NotNull long[] slice, @NotNull Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int collectionSizeOrDefault = AbstractC10176es.collectionSizeOrDefault(indices, 10);
        if (collectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Integer num : indices) {
            arrayList.add(ULong.m74145boximpl(ULongArray.m74159getsVKNKU(slice, num.intValue())));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: slice-HwE9HBo  reason: not valid java name */
    public static final List<UInt> m74371sliceHwE9HBo(@NotNull int[] slice, @NotNull Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int collectionSizeOrDefault = AbstractC10176es.collectionSizeOrDefault(indices, 10);
        if (collectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Integer num : indices) {
            arrayList.add(UInt.m74121boximpl(UIntArray.m74135getpVg5ArA(slice, num.intValue())));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: slice-JGPC0-M  reason: not valid java name */
    public static final List<UShort> m74372sliceJGPC0M(@NotNull short[] slice, @NotNull Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int collectionSizeOrDefault = AbstractC10176es.collectionSizeOrDefault(indices, 10);
        if (collectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Integer num : indices) {
            arrayList.add(UShort.m74169boximpl(UShortArray.m74183getMh2AYeg(slice, num.intValue())));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: slice-JQknh5Q  reason: not valid java name */
    public static final List<UByte> m74373sliceJQknh5Q(@NotNull byte[] slice, @NotNull Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int collectionSizeOrDefault = AbstractC10176es.collectionSizeOrDefault(indices, 10);
        if (collectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Integer num : indices) {
            arrayList.add(UByte.m74097boximpl(UByteArray.m74111getw2LRezQ(slice, num.intValue())));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: slice-Q6IL4kU  reason: not valid java name */
    public static final List<UShort> m74374sliceQ6IL4kU(@NotNull short[] slice, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        if (indices.isEmpty()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        return UArraysKt___UArraysJvmKt.m74213asListrL5Bavg(UShortArray.m74178constructorimpl(ArraysKt___ArraysJvmKt.copyOfRange(slice, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1)));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: slice-ZRhS8yI  reason: not valid java name */
    public static final List<ULong> m74375sliceZRhS8yI(@NotNull long[] slice, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        if (indices.isEmpty()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        return UArraysKt___UArraysJvmKt.m74212asListQwZRm1k(ULongArray.m74154constructorimpl(ArraysKt___ArraysJvmKt.copyOfRange(slice, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1)));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: slice-c0bezYM  reason: not valid java name */
    public static final List<UByte> m74376slicec0bezYM(@NotNull byte[] slice, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        if (indices.isEmpty()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        return UArraysKt___UArraysJvmKt.m74211asListGBYM_sE(UByteArray.m74106constructorimpl(ArraysKt___ArraysJvmKt.copyOfRange(slice, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1)));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: slice-tAntMlw  reason: not valid java name */
    public static final List<UInt> m74377slicetAntMlw(@NotNull int[] slice, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        if (indices.isEmpty()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        return UArraysKt___UArraysJvmKt.m74210asListajY9A(UIntArray.m74130constructorimpl(ArraysKt___ArraysJvmKt.copyOfRange(slice, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1)));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: sliceArray-CFIt9YE  reason: not valid java name */
    public static final int[] m74378sliceArrayCFIt9YE(@NotNull int[] sliceArray, @NotNull Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return UIntArray.m74130constructorimpl(ArraysKt___ArraysKt.sliceArray(sliceArray, indices));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: sliceArray-Q6IL4kU  reason: not valid java name */
    public static final short[] m74379sliceArrayQ6IL4kU(@NotNull short[] sliceArray, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return UShortArray.m74178constructorimpl(ArraysKt___ArraysKt.sliceArray(sliceArray, indices));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: sliceArray-ZRhS8yI  reason: not valid java name */
    public static final long[] m74380sliceArrayZRhS8yI(@NotNull long[] sliceArray, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return ULongArray.m74154constructorimpl(ArraysKt___ArraysKt.sliceArray(sliceArray, indices));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: sliceArray-c0bezYM  reason: not valid java name */
    public static final byte[] m74381sliceArrayc0bezYM(@NotNull byte[] sliceArray, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return UByteArray.m74106constructorimpl(ArraysKt___ArraysKt.sliceArray(sliceArray, indices));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: sliceArray-kzHmqpY  reason: not valid java name */
    public static final long[] m74382sliceArraykzHmqpY(@NotNull long[] sliceArray, @NotNull Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return ULongArray.m74154constructorimpl(ArraysKt___ArraysKt.sliceArray(sliceArray, indices));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: sliceArray-ojwP5H8  reason: not valid java name */
    public static final short[] m74383sliceArrayojwP5H8(@NotNull short[] sliceArray, @NotNull Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return UShortArray.m74178constructorimpl(ArraysKt___ArraysKt.sliceArray(sliceArray, indices));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: sliceArray-tAntMlw  reason: not valid java name */
    public static final int[] m74384sliceArraytAntMlw(@NotNull int[] sliceArray, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return UIntArray.m74130constructorimpl(ArraysKt___ArraysKt.sliceArray(sliceArray, indices));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: sliceArray-xo_DsdI  reason: not valid java name */
    public static final byte[] m74385sliceArrayxo_DsdI(@NotNull byte[] sliceArray, @NotNull Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return UByteArray.m74106constructorimpl(ArraysKt___ArraysKt.sliceArray(sliceArray, indices));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: sort--ajY-9A  reason: not valid java name */
    public static final void m74386sortajY9A(@NotNull int[] sort) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        if (UIntArray.m74136getSizeimpl(sort) > 1) {
            UArraySortingKt.m74208sortArrayoBK06Vg(sort, 0, UIntArray.m74136getSizeimpl(sort));
        }
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: sort--nroSd4  reason: not valid java name */
    public static final void m74387sortnroSd4(@NotNull long[] sort, int i, int i2) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i, i2, ULongArray.m74160getSizeimpl(sort));
        UArraySortingKt.m74205sortArraynroSd4(sort, i, i2);
    }

    /* renamed from: sort--nroSd4$default  reason: not valid java name */
    public static /* synthetic */ void m74388sortnroSd4$default(long[] jArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = ULongArray.m74160getSizeimpl(jArr);
        }
        m74387sortnroSd4(jArr, i, i2);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: sort-4UcCI2c  reason: not valid java name */
    public static final void m74389sort4UcCI2c(@NotNull byte[] sort, int i, int i2) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i, i2, UByteArray.m74112getSizeimpl(sort));
        UArraySortingKt.m74206sortArray4UcCI2c(sort, i, i2);
    }

    /* renamed from: sort-4UcCI2c$default  reason: not valid java name */
    public static /* synthetic */ void m74390sort4UcCI2c$default(byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = UByteArray.m74112getSizeimpl(bArr);
        }
        m74389sort4UcCI2c(bArr, i, i2);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: sort-Aa5vz7o  reason: not valid java name */
    public static final void m74391sortAa5vz7o(@NotNull short[] sort, int i, int i2) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i, i2, UShortArray.m74184getSizeimpl(sort));
        UArraySortingKt.m74207sortArrayAa5vz7o(sort, i, i2);
    }

    /* renamed from: sort-Aa5vz7o$default  reason: not valid java name */
    public static /* synthetic */ void m74392sortAa5vz7o$default(short[] sArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = UShortArray.m74184getSizeimpl(sArr);
        }
        m74391sortAa5vz7o(sArr, i, i2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: sort-GBYM_sE  reason: not valid java name */
    public static final void m74393sortGBYM_sE(@NotNull byte[] sort) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        if (UByteArray.m74112getSizeimpl(sort) > 1) {
            UArraySortingKt.m74206sortArray4UcCI2c(sort, 0, UByteArray.m74112getSizeimpl(sort));
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: sort-QwZRm1k  reason: not valid java name */
    public static final void m74394sortQwZRm1k(@NotNull long[] sort) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        if (ULongArray.m74160getSizeimpl(sort) > 1) {
            UArraySortingKt.m74205sortArraynroSd4(sort, 0, ULongArray.m74160getSizeimpl(sort));
        }
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: sort-oBK06Vg  reason: not valid java name */
    public static final void m74395sortoBK06Vg(@NotNull int[] sort, int i, int i2) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i, i2, UIntArray.m74136getSizeimpl(sort));
        UArraySortingKt.m74208sortArrayoBK06Vg(sort, i, i2);
    }

    /* renamed from: sort-oBK06Vg$default  reason: not valid java name */
    public static /* synthetic */ void m74396sortoBK06Vg$default(int[] iArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = UIntArray.m74136getSizeimpl(iArr);
        }
        m74395sortoBK06Vg(iArr, i, i2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: sort-rL5Bavg  reason: not valid java name */
    public static final void m74397sortrL5Bavg(@NotNull short[] sort) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        if (UShortArray.m74184getSizeimpl(sort) > 1) {
            UArraySortingKt.m74207sortArrayAa5vz7o(sort, 0, UShortArray.m74184getSizeimpl(sort));
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: sortDescending--ajY-9A  reason: not valid java name */
    public static final void m74398sortDescendingajY9A(@NotNull int[] sortDescending) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        if (UIntArray.m74136getSizeimpl(sortDescending) > 1) {
            m74386sortajY9A(sortDescending);
            ArraysKt___ArraysKt.reverse(sortDescending);
        }
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: sortDescending--nroSd4  reason: not valid java name */
    public static final void m74399sortDescendingnroSd4(@NotNull long[] sortDescending, int i, int i2) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        m74387sortnroSd4(sortDescending, i, i2);
        ArraysKt___ArraysKt.reverse(sortDescending, i, i2);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: sortDescending-4UcCI2c  reason: not valid java name */
    public static final void m74400sortDescending4UcCI2c(@NotNull byte[] sortDescending, int i, int i2) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        m74389sort4UcCI2c(sortDescending, i, i2);
        ArraysKt___ArraysKt.reverse(sortDescending, i, i2);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: sortDescending-Aa5vz7o  reason: not valid java name */
    public static final void m74401sortDescendingAa5vz7o(@NotNull short[] sortDescending, int i, int i2) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        m74391sortAa5vz7o(sortDescending, i, i2);
        ArraysKt___ArraysKt.reverse(sortDescending, i, i2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: sortDescending-GBYM_sE  reason: not valid java name */
    public static final void m74402sortDescendingGBYM_sE(@NotNull byte[] sortDescending) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        if (UByteArray.m74112getSizeimpl(sortDescending) > 1) {
            m74393sortGBYM_sE(sortDescending);
            ArraysKt___ArraysKt.reverse(sortDescending);
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: sortDescending-QwZRm1k  reason: not valid java name */
    public static final void m74403sortDescendingQwZRm1k(@NotNull long[] sortDescending) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        if (ULongArray.m74160getSizeimpl(sortDescending) > 1) {
            m74394sortQwZRm1k(sortDescending);
            ArraysKt___ArraysKt.reverse(sortDescending);
        }
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: sortDescending-oBK06Vg  reason: not valid java name */
    public static final void m74404sortDescendingoBK06Vg(@NotNull int[] sortDescending, int i, int i2) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        m74395sortoBK06Vg(sortDescending, i, i2);
        ArraysKt___ArraysKt.reverse(sortDescending, i, i2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: sortDescending-rL5Bavg  reason: not valid java name */
    public static final void m74405sortDescendingrL5Bavg(@NotNull short[] sortDescending) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        if (UShortArray.m74184getSizeimpl(sortDescending) > 1) {
            m74397sortrL5Bavg(sortDescending);
            ArraysKt___ArraysKt.reverse(sortDescending);
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: sorted--ajY-9A  reason: not valid java name */
    public static final List<UInt> m74406sortedajY9A(@NotNull int[] sorted) {
        Intrinsics.checkNotNullParameter(sorted, "$this$sorted");
        int[] copyOf = Arrays.copyOf(sorted, sorted.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        int[] m74130constructorimpl = UIntArray.m74130constructorimpl(copyOf);
        m74386sortajY9A(m74130constructorimpl);
        return UArraysKt___UArraysJvmKt.m74210asListajY9A(m74130constructorimpl);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: sorted-GBYM_sE  reason: not valid java name */
    public static final List<UByte> m74407sortedGBYM_sE(@NotNull byte[] sorted) {
        Intrinsics.checkNotNullParameter(sorted, "$this$sorted");
        byte[] copyOf = Arrays.copyOf(sorted, sorted.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        byte[] m74106constructorimpl = UByteArray.m74106constructorimpl(copyOf);
        m74393sortGBYM_sE(m74106constructorimpl);
        return UArraysKt___UArraysJvmKt.m74211asListGBYM_sE(m74106constructorimpl);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: sorted-QwZRm1k  reason: not valid java name */
    public static final List<ULong> m74408sortedQwZRm1k(@NotNull long[] sorted) {
        Intrinsics.checkNotNullParameter(sorted, "$this$sorted");
        long[] copyOf = Arrays.copyOf(sorted, sorted.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        long[] m74154constructorimpl = ULongArray.m74154constructorimpl(copyOf);
        m74394sortQwZRm1k(m74154constructorimpl);
        return UArraysKt___UArraysJvmKt.m74212asListQwZRm1k(m74154constructorimpl);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: sorted-rL5Bavg  reason: not valid java name */
    public static final List<UShort> m74409sortedrL5Bavg(@NotNull short[] sorted) {
        Intrinsics.checkNotNullParameter(sorted, "$this$sorted");
        short[] copyOf = Arrays.copyOf(sorted, sorted.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        short[] m74178constructorimpl = UShortArray.m74178constructorimpl(copyOf);
        m74397sortrL5Bavg(m74178constructorimpl);
        return UArraysKt___UArraysJvmKt.m74213asListrL5Bavg(m74178constructorimpl);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: sortedArray--ajY-9A  reason: not valid java name */
    public static final int[] m74410sortedArrayajY9A(@NotNull int[] sortedArray) {
        Intrinsics.checkNotNullParameter(sortedArray, "$this$sortedArray");
        if (UIntArray.m74138isEmptyimpl(sortedArray)) {
            return sortedArray;
        }
        int[] copyOf = Arrays.copyOf(sortedArray, sortedArray.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        int[] m74130constructorimpl = UIntArray.m74130constructorimpl(copyOf);
        m74386sortajY9A(m74130constructorimpl);
        return m74130constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: sortedArray-GBYM_sE  reason: not valid java name */
    public static final byte[] m74411sortedArrayGBYM_sE(@NotNull byte[] sortedArray) {
        Intrinsics.checkNotNullParameter(sortedArray, "$this$sortedArray");
        if (UByteArray.m74114isEmptyimpl(sortedArray)) {
            return sortedArray;
        }
        byte[] copyOf = Arrays.copyOf(sortedArray, sortedArray.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        byte[] m74106constructorimpl = UByteArray.m74106constructorimpl(copyOf);
        m74393sortGBYM_sE(m74106constructorimpl);
        return m74106constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: sortedArray-QwZRm1k  reason: not valid java name */
    public static final long[] m74412sortedArrayQwZRm1k(@NotNull long[] sortedArray) {
        Intrinsics.checkNotNullParameter(sortedArray, "$this$sortedArray");
        if (ULongArray.m74162isEmptyimpl(sortedArray)) {
            return sortedArray;
        }
        long[] copyOf = Arrays.copyOf(sortedArray, sortedArray.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        long[] m74154constructorimpl = ULongArray.m74154constructorimpl(copyOf);
        m74394sortQwZRm1k(m74154constructorimpl);
        return m74154constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: sortedArray-rL5Bavg  reason: not valid java name */
    public static final short[] m74413sortedArrayrL5Bavg(@NotNull short[] sortedArray) {
        Intrinsics.checkNotNullParameter(sortedArray, "$this$sortedArray");
        if (UShortArray.m74186isEmptyimpl(sortedArray)) {
            return sortedArray;
        }
        short[] copyOf = Arrays.copyOf(sortedArray, sortedArray.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        short[] m74178constructorimpl = UShortArray.m74178constructorimpl(copyOf);
        m74397sortrL5Bavg(m74178constructorimpl);
        return m74178constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: sortedArrayDescending--ajY-9A  reason: not valid java name */
    public static final int[] m74414sortedArrayDescendingajY9A(@NotNull int[] sortedArrayDescending) {
        Intrinsics.checkNotNullParameter(sortedArrayDescending, "$this$sortedArrayDescending");
        if (UIntArray.m74138isEmptyimpl(sortedArrayDescending)) {
            return sortedArrayDescending;
        }
        int[] copyOf = Arrays.copyOf(sortedArrayDescending, sortedArrayDescending.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        int[] m74130constructorimpl = UIntArray.m74130constructorimpl(copyOf);
        m74398sortDescendingajY9A(m74130constructorimpl);
        return m74130constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: sortedArrayDescending-GBYM_sE  reason: not valid java name */
    public static final byte[] m74415sortedArrayDescendingGBYM_sE(@NotNull byte[] sortedArrayDescending) {
        Intrinsics.checkNotNullParameter(sortedArrayDescending, "$this$sortedArrayDescending");
        if (UByteArray.m74114isEmptyimpl(sortedArrayDescending)) {
            return sortedArrayDescending;
        }
        byte[] copyOf = Arrays.copyOf(sortedArrayDescending, sortedArrayDescending.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        byte[] m74106constructorimpl = UByteArray.m74106constructorimpl(copyOf);
        m74402sortDescendingGBYM_sE(m74106constructorimpl);
        return m74106constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: sortedArrayDescending-QwZRm1k  reason: not valid java name */
    public static final long[] m74416sortedArrayDescendingQwZRm1k(@NotNull long[] sortedArrayDescending) {
        Intrinsics.checkNotNullParameter(sortedArrayDescending, "$this$sortedArrayDescending");
        if (ULongArray.m74162isEmptyimpl(sortedArrayDescending)) {
            return sortedArrayDescending;
        }
        long[] copyOf = Arrays.copyOf(sortedArrayDescending, sortedArrayDescending.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        long[] m74154constructorimpl = ULongArray.m74154constructorimpl(copyOf);
        m74403sortDescendingQwZRm1k(m74154constructorimpl);
        return m74154constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: sortedArrayDescending-rL5Bavg  reason: not valid java name */
    public static final short[] m74417sortedArrayDescendingrL5Bavg(@NotNull short[] sortedArrayDescending) {
        Intrinsics.checkNotNullParameter(sortedArrayDescending, "$this$sortedArrayDescending");
        if (UShortArray.m74186isEmptyimpl(sortedArrayDescending)) {
            return sortedArrayDescending;
        }
        short[] copyOf = Arrays.copyOf(sortedArrayDescending, sortedArrayDescending.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        short[] m74178constructorimpl = UShortArray.m74178constructorimpl(copyOf);
        m74405sortDescendingrL5Bavg(m74178constructorimpl);
        return m74178constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: sortedDescending--ajY-9A  reason: not valid java name */
    public static final List<UInt> m74418sortedDescendingajY9A(@NotNull int[] sortedDescending) {
        Intrinsics.checkNotNullParameter(sortedDescending, "$this$sortedDescending");
        int[] copyOf = Arrays.copyOf(sortedDescending, sortedDescending.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        int[] m74130constructorimpl = UIntArray.m74130constructorimpl(copyOf);
        m74386sortajY9A(m74130constructorimpl);
        return m74354reversedajY9A(m74130constructorimpl);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: sortedDescending-GBYM_sE  reason: not valid java name */
    public static final List<UByte> m74419sortedDescendingGBYM_sE(@NotNull byte[] sortedDescending) {
        Intrinsics.checkNotNullParameter(sortedDescending, "$this$sortedDescending");
        byte[] copyOf = Arrays.copyOf(sortedDescending, sortedDescending.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        byte[] m74106constructorimpl = UByteArray.m74106constructorimpl(copyOf);
        m74393sortGBYM_sE(m74106constructorimpl);
        return m74355reversedGBYM_sE(m74106constructorimpl);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: sortedDescending-QwZRm1k  reason: not valid java name */
    public static final List<ULong> m74420sortedDescendingQwZRm1k(@NotNull long[] sortedDescending) {
        Intrinsics.checkNotNullParameter(sortedDescending, "$this$sortedDescending");
        long[] copyOf = Arrays.copyOf(sortedDescending, sortedDescending.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        long[] m74154constructorimpl = ULongArray.m74154constructorimpl(copyOf);
        m74394sortQwZRm1k(m74154constructorimpl);
        return m74356reversedQwZRm1k(m74154constructorimpl);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: sortedDescending-rL5Bavg  reason: not valid java name */
    public static final List<UShort> m74421sortedDescendingrL5Bavg(@NotNull short[] sortedDescending) {
        Intrinsics.checkNotNullParameter(sortedDescending, "$this$sortedDescending");
        short[] copyOf = Arrays.copyOf(sortedDescending, sortedDescending.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        short[] m74178constructorimpl = UShortArray.m74178constructorimpl(copyOf);
        m74397sortrL5Bavg(m74178constructorimpl);
        return m74357reversedrL5Bavg(m74178constructorimpl);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfUByte")
    public static final int sumOfUByte(@NotNull UByte[] uByteArr) {
        Intrinsics.checkNotNullParameter(uByteArr, "<this>");
        int i = 0;
        for (UByte uByte : uByteArr) {
            i = UInt.m74122constructorimpl(i + UInt.m74122constructorimpl(uByte.m74103unboximpl() & 255));
        }
        return i;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfUInt")
    public static final int sumOfUInt(@NotNull UInt[] uIntArr) {
        Intrinsics.checkNotNullParameter(uIntArr, "<this>");
        int i = 0;
        for (UInt uInt : uIntArr) {
            i = UInt.m74122constructorimpl(i + uInt.m74127unboximpl());
        }
        return i;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfULong")
    public static final long sumOfULong(@NotNull ULong[] uLongArr) {
        Intrinsics.checkNotNullParameter(uLongArr, "<this>");
        long j = 0;
        for (ULong uLong : uLongArr) {
            j = ULong.m74146constructorimpl(j + uLong.m74151unboximpl());
        }
        return j;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfUShort")
    public static final int sumOfUShort(@NotNull UShort[] uShortArr) {
        Intrinsics.checkNotNullParameter(uShortArr, "<this>");
        int i = 0;
        for (UShort uShort : uShortArr) {
            i = UInt.m74122constructorimpl(i + UInt.m74122constructorimpl(uShort.m74175unboximpl() & UShort.MAX_VALUE));
        }
        return i;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: take-PpDY95g  reason: not valid java name */
    public static final List<UByte> m74422takePpDY95g(@NotNull byte[] take, int i) {
        Intrinsics.checkNotNullParameter(take, "$this$take");
        if (i >= 0) {
            if (i == 0) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            if (i >= UByteArray.m74112getSizeimpl(take)) {
                return CollectionsKt___CollectionsKt.toList(UByteArray.m74104boximpl(take));
            }
            if (i == 1) {
                return AbstractC10108ds.listOf(UByte.m74097boximpl(UByteArray.m74111getw2LRezQ(take, 0)));
            }
            ArrayList arrayList = new ArrayList(i);
            int m74112getSizeimpl = UByteArray.m74112getSizeimpl(take);
            int i2 = 0;
            for (int i3 = 0; i3 < m74112getSizeimpl; i3++) {
                arrayList.add(UByte.m74097boximpl(UByteArray.m74111getw2LRezQ(take, i3)));
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: take-nggk6HY  reason: not valid java name */
    public static final List<UShort> m74423takenggk6HY(@NotNull short[] take, int i) {
        Intrinsics.checkNotNullParameter(take, "$this$take");
        if (i >= 0) {
            if (i == 0) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            if (i >= UShortArray.m74184getSizeimpl(take)) {
                return CollectionsKt___CollectionsKt.toList(UShortArray.m74176boximpl(take));
            }
            if (i == 1) {
                return AbstractC10108ds.listOf(UShort.m74169boximpl(UShortArray.m74183getMh2AYeg(take, 0)));
            }
            ArrayList arrayList = new ArrayList(i);
            int m74184getSizeimpl = UShortArray.m74184getSizeimpl(take);
            int i2 = 0;
            for (int i3 = 0; i3 < m74184getSizeimpl; i3++) {
                arrayList.add(UShort.m74169boximpl(UShortArray.m74183getMh2AYeg(take, i3)));
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: take-qFRl0hI  reason: not valid java name */
    public static final List<UInt> m74424takeqFRl0hI(@NotNull int[] take, int i) {
        Intrinsics.checkNotNullParameter(take, "$this$take");
        if (i >= 0) {
            if (i == 0) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            if (i >= UIntArray.m74136getSizeimpl(take)) {
                return CollectionsKt___CollectionsKt.toList(UIntArray.m74128boximpl(take));
            }
            if (i == 1) {
                return AbstractC10108ds.listOf(UInt.m74121boximpl(UIntArray.m74135getpVg5ArA(take, 0)));
            }
            ArrayList arrayList = new ArrayList(i);
            int m74136getSizeimpl = UIntArray.m74136getSizeimpl(take);
            int i2 = 0;
            for (int i3 = 0; i3 < m74136getSizeimpl; i3++) {
                arrayList.add(UInt.m74121boximpl(UIntArray.m74135getpVg5ArA(take, i3)));
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: take-r7IrZao  reason: not valid java name */
    public static final List<ULong> m74425taker7IrZao(@NotNull long[] take, int i) {
        Intrinsics.checkNotNullParameter(take, "$this$take");
        if (i >= 0) {
            if (i == 0) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            if (i >= ULongArray.m74160getSizeimpl(take)) {
                return CollectionsKt___CollectionsKt.toList(ULongArray.m74152boximpl(take));
            }
            if (i == 1) {
                return AbstractC10108ds.listOf(ULong.m74145boximpl(ULongArray.m74159getsVKNKU(take, 0)));
            }
            ArrayList arrayList = new ArrayList(i);
            int m74160getSizeimpl = ULongArray.m74160getSizeimpl(take);
            int i2 = 0;
            for (int i3 = 0; i3 < m74160getSizeimpl; i3++) {
                arrayList.add(ULong.m74145boximpl(ULongArray.m74159getsVKNKU(take, i3)));
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: takeLast-PpDY95g  reason: not valid java name */
    public static final List<UByte> m74426takeLastPpDY95g(@NotNull byte[] takeLast, int i) {
        Intrinsics.checkNotNullParameter(takeLast, "$this$takeLast");
        if (i >= 0) {
            if (i == 0) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            int m74112getSizeimpl = UByteArray.m74112getSizeimpl(takeLast);
            if (i >= m74112getSizeimpl) {
                return CollectionsKt___CollectionsKt.toList(UByteArray.m74104boximpl(takeLast));
            }
            if (i == 1) {
                return AbstractC10108ds.listOf(UByte.m74097boximpl(UByteArray.m74111getw2LRezQ(takeLast, m74112getSizeimpl - 1)));
            }
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = m74112getSizeimpl - i; i2 < m74112getSizeimpl; i2++) {
                arrayList.add(UByte.m74097boximpl(UByteArray.m74111getw2LRezQ(takeLast, i2)));
            }
            return arrayList;
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: takeLast-nggk6HY  reason: not valid java name */
    public static final List<UShort> m74427takeLastnggk6HY(@NotNull short[] takeLast, int i) {
        Intrinsics.checkNotNullParameter(takeLast, "$this$takeLast");
        if (i >= 0) {
            if (i == 0) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            int m74184getSizeimpl = UShortArray.m74184getSizeimpl(takeLast);
            if (i >= m74184getSizeimpl) {
                return CollectionsKt___CollectionsKt.toList(UShortArray.m74176boximpl(takeLast));
            }
            if (i == 1) {
                return AbstractC10108ds.listOf(UShort.m74169boximpl(UShortArray.m74183getMh2AYeg(takeLast, m74184getSizeimpl - 1)));
            }
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = m74184getSizeimpl - i; i2 < m74184getSizeimpl; i2++) {
                arrayList.add(UShort.m74169boximpl(UShortArray.m74183getMh2AYeg(takeLast, i2)));
            }
            return arrayList;
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: takeLast-qFRl0hI  reason: not valid java name */
    public static final List<UInt> m74428takeLastqFRl0hI(@NotNull int[] takeLast, int i) {
        Intrinsics.checkNotNullParameter(takeLast, "$this$takeLast");
        if (i >= 0) {
            if (i == 0) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            int m74136getSizeimpl = UIntArray.m74136getSizeimpl(takeLast);
            if (i >= m74136getSizeimpl) {
                return CollectionsKt___CollectionsKt.toList(UIntArray.m74128boximpl(takeLast));
            }
            if (i == 1) {
                return AbstractC10108ds.listOf(UInt.m74121boximpl(UIntArray.m74135getpVg5ArA(takeLast, m74136getSizeimpl - 1)));
            }
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = m74136getSizeimpl - i; i2 < m74136getSizeimpl; i2++) {
                arrayList.add(UInt.m74121boximpl(UIntArray.m74135getpVg5ArA(takeLast, i2)));
            }
            return arrayList;
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: takeLast-r7IrZao  reason: not valid java name */
    public static final List<ULong> m74429takeLastr7IrZao(@NotNull long[] takeLast, int i) {
        Intrinsics.checkNotNullParameter(takeLast, "$this$takeLast");
        if (i >= 0) {
            if (i == 0) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            int m74160getSizeimpl = ULongArray.m74160getSizeimpl(takeLast);
            if (i >= m74160getSizeimpl) {
                return CollectionsKt___CollectionsKt.toList(ULongArray.m74152boximpl(takeLast));
            }
            if (i == 1) {
                return AbstractC10108ds.listOf(ULong.m74145boximpl(ULongArray.m74159getsVKNKU(takeLast, m74160getSizeimpl - 1)));
            }
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = m74160getSizeimpl - i; i2 < m74160getSizeimpl; i2++) {
                arrayList.add(ULong.m74145boximpl(ULongArray.m74159getsVKNKU(takeLast, i2)));
            }
            return arrayList;
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: toTypedArray--ajY-9A  reason: not valid java name */
    public static final UInt[] m74430toTypedArrayajY9A(@NotNull int[] toTypedArray) {
        Intrinsics.checkNotNullParameter(toTypedArray, "$this$toTypedArray");
        int m74136getSizeimpl = UIntArray.m74136getSizeimpl(toTypedArray);
        UInt[] uIntArr = new UInt[m74136getSizeimpl];
        for (int i = 0; i < m74136getSizeimpl; i++) {
            uIntArr[i] = UInt.m74121boximpl(UIntArray.m74135getpVg5ArA(toTypedArray, i));
        }
        return uIntArr;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: toTypedArray-GBYM_sE  reason: not valid java name */
    public static final UByte[] m74431toTypedArrayGBYM_sE(@NotNull byte[] toTypedArray) {
        Intrinsics.checkNotNullParameter(toTypedArray, "$this$toTypedArray");
        int m74112getSizeimpl = UByteArray.m74112getSizeimpl(toTypedArray);
        UByte[] uByteArr = new UByte[m74112getSizeimpl];
        for (int i = 0; i < m74112getSizeimpl; i++) {
            uByteArr[i] = UByte.m74097boximpl(UByteArray.m74111getw2LRezQ(toTypedArray, i));
        }
        return uByteArr;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: toTypedArray-QwZRm1k  reason: not valid java name */
    public static final ULong[] m74432toTypedArrayQwZRm1k(@NotNull long[] toTypedArray) {
        Intrinsics.checkNotNullParameter(toTypedArray, "$this$toTypedArray");
        int m74160getSizeimpl = ULongArray.m74160getSizeimpl(toTypedArray);
        ULong[] uLongArr = new ULong[m74160getSizeimpl];
        for (int i = 0; i < m74160getSizeimpl; i++) {
            uLongArr[i] = ULong.m74145boximpl(ULongArray.m74159getsVKNKU(toTypedArray, i));
        }
        return uLongArr;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: toTypedArray-rL5Bavg  reason: not valid java name */
    public static final UShort[] m74433toTypedArrayrL5Bavg(@NotNull short[] toTypedArray) {
        Intrinsics.checkNotNullParameter(toTypedArray, "$this$toTypedArray");
        int m74184getSizeimpl = UShortArray.m74184getSizeimpl(toTypedArray);
        UShort[] uShortArr = new UShort[m74184getSizeimpl];
        for (int i = 0; i < m74184getSizeimpl; i++) {
            uShortArr[i] = UShort.m74169boximpl(UShortArray.m74183getMh2AYeg(toTypedArray, i));
        }
        return uShortArr;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final byte[] toUByteArray(@NotNull UByte[] uByteArr) {
        Intrinsics.checkNotNullParameter(uByteArr, "<this>");
        int length = uByteArr.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = uByteArr[i].m74103unboximpl();
        }
        return UByteArray.m74106constructorimpl(bArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final int[] toUIntArray(@NotNull UInt[] uIntArr) {
        Intrinsics.checkNotNullParameter(uIntArr, "<this>");
        int length = uIntArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = uIntArr[i].m74127unboximpl();
        }
        return UIntArray.m74130constructorimpl(iArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final long[] toULongArray(@NotNull ULong[] uLongArr) {
        Intrinsics.checkNotNullParameter(uLongArr, "<this>");
        int length = uLongArr.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = uLongArr[i].m74151unboximpl();
        }
        return ULongArray.m74154constructorimpl(jArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final short[] toUShortArray(@NotNull UShort[] uShortArr) {
        Intrinsics.checkNotNullParameter(uShortArr, "<this>");
        int length = uShortArr.length;
        short[] sArr = new short[length];
        for (int i = 0; i < length; i++) {
            sArr[i] = uShortArr[i].m74175unboximpl();
        }
        return UShortArray.m74178constructorimpl(sArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: withIndex--ajY-9A  reason: not valid java name */
    public static final Iterable<IndexedValue<UInt>> m74434withIndexajY9A(@NotNull int[] withIndex) {
        Intrinsics.checkNotNullParameter(withIndex, "$this$withIndex");
        return new IndexingIterable(new UArraysKt___UArraysKt$withIndex$1(withIndex));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: withIndex-GBYM_sE  reason: not valid java name */
    public static final Iterable<IndexedValue<UByte>> m74435withIndexGBYM_sE(@NotNull byte[] withIndex) {
        Intrinsics.checkNotNullParameter(withIndex, "$this$withIndex");
        return new IndexingIterable(new UArraysKt___UArraysKt$withIndex$3(withIndex));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: withIndex-QwZRm1k  reason: not valid java name */
    public static final Iterable<IndexedValue<ULong>> m74436withIndexQwZRm1k(@NotNull long[] withIndex) {
        Intrinsics.checkNotNullParameter(withIndex, "$this$withIndex");
        return new IndexingIterable(new UArraysKt___UArraysKt$withIndex$2(withIndex));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: withIndex-rL5Bavg  reason: not valid java name */
    public static final Iterable<IndexedValue<UShort>> m74437withIndexrL5Bavg(@NotNull short[] withIndex) {
        Intrinsics.checkNotNullParameter(withIndex, "$this$withIndex");
        return new IndexingIterable(new UArraysKt___UArraysKt$withIndex$4(withIndex));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: zip-C-E_24M  reason: not valid java name */
    public static final <R> List<Pair<UInt, R>> m74438zipCE_24M(@NotNull int[] zip, @NotNull R[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(UIntArray.m74136getSizeimpl(zip), other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            int m74135getpVg5ArA = UIntArray.m74135getpVg5ArA(zip, i);
            arrayList.add(TuplesKt.m28844to(UInt.m74121boximpl(m74135getpVg5ArA), other[i]));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: zip-F7u83W8  reason: not valid java name */
    public static final <R> List<Pair<ULong, R>> m74439zipF7u83W8(@NotNull long[] zip, @NotNull Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int m74160getSizeimpl = ULongArray.m74160getSizeimpl(zip);
        ArrayList arrayList = new ArrayList(Math.min(AbstractC10176es.collectionSizeOrDefault(other, 10), m74160getSizeimpl));
        int i = 0;
        for (R r : other) {
            if (i >= m74160getSizeimpl) {
                break;
            }
            arrayList.add(TuplesKt.m28844to(ULong.m74145boximpl(ULongArray.m74159getsVKNKU(zip, i)), r));
            i++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: zip-HwE9HBo  reason: not valid java name */
    public static final <R> List<Pair<UInt, R>> m74440zipHwE9HBo(@NotNull int[] zip, @NotNull Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int m74136getSizeimpl = UIntArray.m74136getSizeimpl(zip);
        ArrayList arrayList = new ArrayList(Math.min(AbstractC10176es.collectionSizeOrDefault(other, 10), m74136getSizeimpl));
        int i = 0;
        for (R r : other) {
            if (i >= m74136getSizeimpl) {
                break;
            }
            arrayList.add(TuplesKt.m28844to(UInt.m74121boximpl(UIntArray.m74135getpVg5ArA(zip, i)), r));
            i++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: zip-JGPC0-M  reason: not valid java name */
    public static final <R> List<Pair<UShort, R>> m74441zipJGPC0M(@NotNull short[] zip, @NotNull Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int m74184getSizeimpl = UShortArray.m74184getSizeimpl(zip);
        ArrayList arrayList = new ArrayList(Math.min(AbstractC10176es.collectionSizeOrDefault(other, 10), m74184getSizeimpl));
        int i = 0;
        for (R r : other) {
            if (i >= m74184getSizeimpl) {
                break;
            }
            arrayList.add(TuplesKt.m28844to(UShort.m74169boximpl(UShortArray.m74183getMh2AYeg(zip, i)), r));
            i++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: zip-JQknh5Q  reason: not valid java name */
    public static final <R> List<Pair<UByte, R>> m74442zipJQknh5Q(@NotNull byte[] zip, @NotNull Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int m74112getSizeimpl = UByteArray.m74112getSizeimpl(zip);
        ArrayList arrayList = new ArrayList(Math.min(AbstractC10176es.collectionSizeOrDefault(other, 10), m74112getSizeimpl));
        int i = 0;
        for (R r : other) {
            if (i >= m74112getSizeimpl) {
                break;
            }
            arrayList.add(TuplesKt.m28844to(UByte.m74097boximpl(UByteArray.m74111getw2LRezQ(zip, i)), r));
            i++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: zip-ctEhBpI  reason: not valid java name */
    public static final List<Pair<UInt, UInt>> m74443zipctEhBpI(@NotNull int[] zip, @NotNull int[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(UIntArray.m74136getSizeimpl(zip), UIntArray.m74136getSizeimpl(other));
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(TuplesKt.m28844to(UInt.m74121boximpl(UIntArray.m74135getpVg5ArA(zip, i)), UInt.m74121boximpl(UIntArray.m74135getpVg5ArA(other, i))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: zip-f7H3mmw  reason: not valid java name */
    public static final <R> List<Pair<ULong, R>> m74444zipf7H3mmw(@NotNull long[] zip, @NotNull R[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(ULongArray.m74160getSizeimpl(zip), other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            long m74159getsVKNKU = ULongArray.m74159getsVKNKU(zip, i);
            arrayList.add(TuplesKt.m28844to(ULong.m74145boximpl(m74159getsVKNKU), other[i]));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: zip-kdPth3s  reason: not valid java name */
    public static final List<Pair<UByte, UByte>> m74445zipkdPth3s(@NotNull byte[] zip, @NotNull byte[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(UByteArray.m74112getSizeimpl(zip), UByteArray.m74112getSizeimpl(other));
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(TuplesKt.m28844to(UByte.m74097boximpl(UByteArray.m74111getw2LRezQ(zip, i)), UByte.m74097boximpl(UByteArray.m74111getw2LRezQ(other, i))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: zip-mazbYpA  reason: not valid java name */
    public static final List<Pair<UShort, UShort>> m74446zipmazbYpA(@NotNull short[] zip, @NotNull short[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(UShortArray.m74184getSizeimpl(zip), UShortArray.m74184getSizeimpl(other));
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(TuplesKt.m28844to(UShort.m74169boximpl(UShortArray.m74183getMh2AYeg(zip, i)), UShort.m74169boximpl(UShortArray.m74183getMh2AYeg(other, i))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: zip-nl983wc  reason: not valid java name */
    public static final <R> List<Pair<UByte, R>> m74447zipnl983wc(@NotNull byte[] zip, @NotNull R[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(UByteArray.m74112getSizeimpl(zip), other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            byte m74111getw2LRezQ = UByteArray.m74111getw2LRezQ(zip, i);
            arrayList.add(TuplesKt.m28844to(UByte.m74097boximpl(m74111getw2LRezQ), other[i]));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: zip-uaTIQ5s  reason: not valid java name */
    public static final <R> List<Pair<UShort, R>> m74448zipuaTIQ5s(@NotNull short[] zip, @NotNull R[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(UShortArray.m74184getSizeimpl(zip), other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            short m74183getMh2AYeg = UShortArray.m74183getMh2AYeg(zip, i);
            arrayList.add(TuplesKt.m28844to(UShort.m74169boximpl(m74183getMh2AYeg), other[i]));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: zip-us8wMrg  reason: not valid java name */
    public static final List<Pair<ULong, ULong>> m74449zipus8wMrg(@NotNull long[] zip, @NotNull long[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(ULongArray.m74160getSizeimpl(zip), ULongArray.m74160getSizeimpl(other));
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(TuplesKt.m28844to(ULong.m74145boximpl(ULongArray.m74159getsVKNKU(zip, i)), ULong.m74145boximpl(ULongArray.m74159getsVKNKU(other, i))));
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "maxOrThrow-U")
    /* renamed from: maxOrThrow-U  reason: not valid java name */
    public static final long m74316maxOrThrowU(@NotNull long[] max) {
        int compare;
        Intrinsics.checkNotNullParameter(max, "$this$max");
        if (!ULongArray.m74162isEmptyimpl(max)) {
            long m74159getsVKNKU = ULongArray.m74159getsVKNKU(max, 0);
            ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(max)).iterator();
            while (it.hasNext()) {
                long m74159getsVKNKU2 = ULongArray.m74159getsVKNKU(max, it.nextInt());
                compare = Long.compare(m74159getsVKNKU ^ Long.MIN_VALUE, m74159getsVKNKU2 ^ Long.MIN_VALUE);
                if (compare < 0) {
                    m74159getsVKNKU = m74159getsVKNKU2;
                }
            }
            return m74159getsVKNKU;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "maxWithOrThrow-U")
    /* renamed from: maxWithOrThrow-U  reason: not valid java name */
    public static final long m74324maxWithOrThrowU(@NotNull long[] maxWith, @NotNull Comparator<? super ULong> comparator) {
        Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!ULongArray.m74162isEmptyimpl(maxWith)) {
            long m74159getsVKNKU = ULongArray.m74159getsVKNKU(maxWith, 0);
            ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(maxWith)).iterator();
            while (it.hasNext()) {
                long m74159getsVKNKU2 = ULongArray.m74159getsVKNKU(maxWith, it.nextInt());
                if (comparator.compare(ULong.m74145boximpl(m74159getsVKNKU), ULong.m74145boximpl(m74159getsVKNKU2)) < 0) {
                    m74159getsVKNKU = m74159getsVKNKU2;
                }
            }
            return m74159getsVKNKU;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "minOrThrow-U")
    /* renamed from: minOrThrow-U  reason: not valid java name */
    public static final long m74332minOrThrowU(@NotNull long[] min) {
        int compare;
        Intrinsics.checkNotNullParameter(min, "$this$min");
        if (!ULongArray.m74162isEmptyimpl(min)) {
            long m74159getsVKNKU = ULongArray.m74159getsVKNKU(min, 0);
            ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(min)).iterator();
            while (it.hasNext()) {
                long m74159getsVKNKU2 = ULongArray.m74159getsVKNKU(min, it.nextInt());
                compare = Long.compare(m74159getsVKNKU ^ Long.MIN_VALUE, m74159getsVKNKU2 ^ Long.MIN_VALUE);
                if (compare > 0) {
                    m74159getsVKNKU = m74159getsVKNKU2;
                }
            }
            return m74159getsVKNKU;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "minWithOrThrow-U")
    /* renamed from: minWithOrThrow-U  reason: not valid java name */
    public static final long m74340minWithOrThrowU(@NotNull long[] minWith, @NotNull Comparator<? super ULong> comparator) {
        Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!ULongArray.m74162isEmptyimpl(minWith)) {
            long m74159getsVKNKU = ULongArray.m74159getsVKNKU(minWith, 0);
            ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(minWith)).iterator();
            while (it.hasNext()) {
                long m74159getsVKNKU2 = ULongArray.m74159getsVKNKU(minWith, it.nextInt());
                if (comparator.compare(ULong.m74145boximpl(m74159getsVKNKU), ULong.m74145boximpl(m74159getsVKNKU2)) > 0) {
                    m74159getsVKNKU = m74159getsVKNKU2;
                }
            }
            return m74159getsVKNKU;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "maxOrThrow-U")
    /* renamed from: maxOrThrow-U  reason: not valid java name */
    public static final byte m74314maxOrThrowU(@NotNull byte[] max) {
        Intrinsics.checkNotNullParameter(max, "$this$max");
        if (!UByteArray.m74114isEmptyimpl(max)) {
            byte m74111getw2LRezQ = UByteArray.m74111getw2LRezQ(max, 0);
            ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(max)).iterator();
            while (it.hasNext()) {
                byte m74111getw2LRezQ2 = UByteArray.m74111getw2LRezQ(max, it.nextInt());
                if (Intrinsics.compare(m74111getw2LRezQ & 255, m74111getw2LRezQ2 & 255) < 0) {
                    m74111getw2LRezQ = m74111getw2LRezQ2;
                }
            }
            return m74111getw2LRezQ;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "maxWithOrThrow-U")
    /* renamed from: maxWithOrThrow-U  reason: not valid java name */
    public static final byte m74322maxWithOrThrowU(@NotNull byte[] maxWith, @NotNull Comparator<? super UByte> comparator) {
        Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!UByteArray.m74114isEmptyimpl(maxWith)) {
            byte m74111getw2LRezQ = UByteArray.m74111getw2LRezQ(maxWith, 0);
            ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(maxWith)).iterator();
            while (it.hasNext()) {
                byte m74111getw2LRezQ2 = UByteArray.m74111getw2LRezQ(maxWith, it.nextInt());
                if (comparator.compare(UByte.m74097boximpl(m74111getw2LRezQ), UByte.m74097boximpl(m74111getw2LRezQ2)) < 0) {
                    m74111getw2LRezQ = m74111getw2LRezQ2;
                }
            }
            return m74111getw2LRezQ;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "minOrThrow-U")
    /* renamed from: minOrThrow-U  reason: not valid java name */
    public static final byte m74330minOrThrowU(@NotNull byte[] min) {
        Intrinsics.checkNotNullParameter(min, "$this$min");
        if (!UByteArray.m74114isEmptyimpl(min)) {
            byte m74111getw2LRezQ = UByteArray.m74111getw2LRezQ(min, 0);
            ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(min)).iterator();
            while (it.hasNext()) {
                byte m74111getw2LRezQ2 = UByteArray.m74111getw2LRezQ(min, it.nextInt());
                if (Intrinsics.compare(m74111getw2LRezQ & 255, m74111getw2LRezQ2 & 255) > 0) {
                    m74111getw2LRezQ = m74111getw2LRezQ2;
                }
            }
            return m74111getw2LRezQ;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "minWithOrThrow-U")
    /* renamed from: minWithOrThrow-U  reason: not valid java name */
    public static final byte m74338minWithOrThrowU(@NotNull byte[] minWith, @NotNull Comparator<? super UByte> comparator) {
        Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!UByteArray.m74114isEmptyimpl(minWith)) {
            byte m74111getw2LRezQ = UByteArray.m74111getw2LRezQ(minWith, 0);
            ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(minWith)).iterator();
            while (it.hasNext()) {
                byte m74111getw2LRezQ2 = UByteArray.m74111getw2LRezQ(minWith, it.nextInt());
                if (comparator.compare(UByte.m74097boximpl(m74111getw2LRezQ), UByte.m74097boximpl(m74111getw2LRezQ2)) > 0) {
                    m74111getw2LRezQ = m74111getw2LRezQ2;
                }
            }
            return m74111getw2LRezQ;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "maxOrThrow-U")
    /* renamed from: maxOrThrow-U  reason: not valid java name */
    public static final short m74317maxOrThrowU(@NotNull short[] max) {
        Intrinsics.checkNotNullParameter(max, "$this$max");
        if (!UShortArray.m74186isEmptyimpl(max)) {
            short m74183getMh2AYeg = UShortArray.m74183getMh2AYeg(max, 0);
            ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(max)).iterator();
            while (it.hasNext()) {
                short m74183getMh2AYeg2 = UShortArray.m74183getMh2AYeg(max, it.nextInt());
                if (Intrinsics.compare(m74183getMh2AYeg & UShort.MAX_VALUE, 65535 & m74183getMh2AYeg2) < 0) {
                    m74183getMh2AYeg = m74183getMh2AYeg2;
                }
            }
            return m74183getMh2AYeg;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "maxWithOrThrow-U")
    /* renamed from: maxWithOrThrow-U  reason: not valid java name */
    public static final short m74325maxWithOrThrowU(@NotNull short[] maxWith, @NotNull Comparator<? super UShort> comparator) {
        Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!UShortArray.m74186isEmptyimpl(maxWith)) {
            short m74183getMh2AYeg = UShortArray.m74183getMh2AYeg(maxWith, 0);
            ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(maxWith)).iterator();
            while (it.hasNext()) {
                short m74183getMh2AYeg2 = UShortArray.m74183getMh2AYeg(maxWith, it.nextInt());
                if (comparator.compare(UShort.m74169boximpl(m74183getMh2AYeg), UShort.m74169boximpl(m74183getMh2AYeg2)) < 0) {
                    m74183getMh2AYeg = m74183getMh2AYeg2;
                }
            }
            return m74183getMh2AYeg;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "minOrThrow-U")
    /* renamed from: minOrThrow-U  reason: not valid java name */
    public static final short m74333minOrThrowU(@NotNull short[] min) {
        Intrinsics.checkNotNullParameter(min, "$this$min");
        if (!UShortArray.m74186isEmptyimpl(min)) {
            short m74183getMh2AYeg = UShortArray.m74183getMh2AYeg(min, 0);
            ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(min)).iterator();
            while (it.hasNext()) {
                short m74183getMh2AYeg2 = UShortArray.m74183getMh2AYeg(min, it.nextInt());
                if (Intrinsics.compare(m74183getMh2AYeg & UShort.MAX_VALUE, 65535 & m74183getMh2AYeg2) > 0) {
                    m74183getMh2AYeg = m74183getMh2AYeg2;
                }
            }
            return m74183getMh2AYeg;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "minWithOrThrow-U")
    /* renamed from: minWithOrThrow-U  reason: not valid java name */
    public static final short m74341minWithOrThrowU(@NotNull short[] minWith, @NotNull Comparator<? super UShort> comparator) {
        Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!UShortArray.m74186isEmptyimpl(minWith)) {
            short m74183getMh2AYeg = UShortArray.m74183getMh2AYeg(minWith, 0);
            ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(minWith)).iterator();
            while (it.hasNext()) {
                short m74183getMh2AYeg2 = UShortArray.m74183getMh2AYeg(minWith, it.nextInt());
                if (comparator.compare(UShort.m74169boximpl(m74183getMh2AYeg), UShort.m74169boximpl(m74183getMh2AYeg2)) > 0) {
                    m74183getMh2AYeg = m74183getMh2AYeg2;
                }
            }
            return m74183getMh2AYeg;
        }
        throw new NoSuchElementException();
    }
}
