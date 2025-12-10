package p000;

import java.util.Collection;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.WasExperimental;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: DX1 */
/* loaded from: classes5.dex */
public abstract class DX1 {
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfUByte")
    public static final int sumOfUByte(@NotNull Iterable<UByte> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        int i = 0;
        for (UByte uByte : iterable) {
            i = UInt.m74306constructorimpl(i + UInt.m74306constructorimpl(uByte.m74287unboximpl() & 255));
        }
        return i;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfUInt")
    public static final int sumOfUInt(@NotNull Iterable<UInt> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        int i = 0;
        for (UInt uInt : iterable) {
            i = UInt.m74306constructorimpl(i + uInt.m74311unboximpl());
        }
        return i;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfULong")
    public static final long sumOfULong(@NotNull Iterable<ULong> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        long j = 0;
        for (ULong uLong : iterable) {
            j = ULong.m74330constructorimpl(j + uLong.m74335unboximpl());
        }
        return j;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfUShort")
    public static final int sumOfUShort(@NotNull Iterable<UShort> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        int i = 0;
        for (UShort uShort : iterable) {
            i = UInt.m74306constructorimpl(i + UInt.m74306constructorimpl(uShort.m74359unboximpl() & UShort.MAX_VALUE));
        }
        return i;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final byte[] toUByteArray(@NotNull Collection<UByte> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        byte[] m74289constructorimpl = UByteArray.m74289constructorimpl(collection.size());
        int i = 0;
        for (UByte uByte : collection) {
            UByteArray.m74300setVurrAj0(m74289constructorimpl, i, uByte.m74287unboximpl());
            i++;
        }
        return m74289constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final int[] toUIntArray(@NotNull Collection<UInt> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        int[] m74313constructorimpl = UIntArray.m74313constructorimpl(collection.size());
        int i = 0;
        for (UInt uInt : collection) {
            UIntArray.m74324setVXSXFK8(m74313constructorimpl, i, uInt.m74311unboximpl());
            i++;
        }
        return m74313constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final long[] toULongArray(@NotNull Collection<ULong> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        long[] m74337constructorimpl = ULongArray.m74337constructorimpl(collection.size());
        int i = 0;
        for (ULong uLong : collection) {
            ULongArray.m74348setk8EXiF4(m74337constructorimpl, i, uLong.m74335unboximpl());
            i++;
        }
        return m74337constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final short[] toUShortArray(@NotNull Collection<UShort> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        short[] m74361constructorimpl = UShortArray.m74361constructorimpl(collection.size());
        int i = 0;
        for (UShort uShort : collection) {
            UShortArray.m74372set01HTLdE(m74361constructorimpl, i, uShort.m74359unboximpl());
            i++;
        }
        return m74361constructorimpl;
    }
}