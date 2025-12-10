package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.Immutable;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0001\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,B+\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0000¢\u0006\u0004\b\u0015\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0000¢\u0006\u0004\b\u0016\u0010\u0014J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001d\u001a\u00020\u001b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001b0\u001aH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006-"}, m28850d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "", "", "", "upperSet", "lowerSet", "lowerBound", "", "belowBound", "<init>", "(JJI[I)V", "bit", "", "get", "(I)Z", "set", "(I)Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "clear", "bits", "andNot", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "and", "or", "", "iterator", "()Ljava/util/Iterator;", "Lkotlin/Function1;", "", "block", "fastForEach", "(Lkotlin/jvm/functions/Function1;)V", "default", "lowest", "(I)I", "", "toString", "()Ljava/lang/String;", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.CURVE_TO, "I", "d", "[I", "Companion", "runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@Immutable
@SourceDebugExtension({"SMAP\nSnapshotIdSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotIdSet.kt\nandroidx/compose/runtime/snapshots/SnapshotIdSet\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,397:1\n13600#2,2:398\n1789#3,3:400\n1789#3,3:403\n1789#3,3:406\n1789#3,3:409\n1789#3,3:412\n1549#3:415\n1620#3,3:416\n*S KotlinDebug\n*F\n+ 1 SnapshotIdSet.kt\nandroidx/compose/runtime/snapshots/SnapshotIdSet\n*L\n107#1:398,2\n236#1:400,3\n257#1:403,3\n261#1:406,3\n283#1:409,3\n286#1:412,3\n343#1:415\n343#1:416,3\n*E\n"})
/* loaded from: classes2.dex */
public final class SnapshotIdSet implements Iterable<Integer>, KMappedMarker {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: e */
    public static final SnapshotIdSet f28735e = new SnapshotIdSet(0, 0, 0, null);

    /* renamed from: a */
    public final long f28736a;

    /* renamed from: b */
    public final long f28737b;

    /* renamed from: c */
    public final int f28738c;

    /* renamed from: d */
    public final int[] f28739d;

    @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28850d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet$Companion;", "", "()V", "EMPTY", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "getEMPTY", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SnapshotIdSet getEMPTY() {
            return SnapshotIdSet.f28735e;
        }

        public Companion() {
        }
    }

    public SnapshotIdSet(long j, long j2, int i, int[] iArr) {
        this.f28736a = j;
        this.f28737b = j2;
        this.f28738c = i;
        this.f28739d = iArr;
    }

    @NotNull
    public final SnapshotIdSet and(@NotNull SnapshotIdSet bits) {
        Intrinsics.checkNotNullParameter(bits, "bits");
        SnapshotIdSet snapshotIdSet = f28735e;
        if (Intrinsics.areEqual(bits, snapshotIdSet)) {
            return snapshotIdSet;
        }
        if (Intrinsics.areEqual(this, snapshotIdSet)) {
            return snapshotIdSet;
        }
        int i = bits.f28738c;
        int i2 = this.f28738c;
        if (i == i2) {
            int[] iArr = bits.f28739d;
            int[] iArr2 = this.f28739d;
            if (iArr == iArr2) {
                long j = this.f28736a;
                long j2 = bits.f28736a;
                long j3 = this.f28737b;
                long j4 = bits.f28737b;
                long j5 = j3 & j4;
                if ((j & j2) != 0 || j5 != 0 || iArr2 != null) {
                    return new SnapshotIdSet(j2 & j, j3 & j4, i2, iArr2);
                }
                return snapshotIdSet;
            }
        }
        if (this.f28739d == null) {
            Iterator<Integer> it = iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                if (bits.get(intValue)) {
                    snapshotIdSet = snapshotIdSet.set(intValue);
                }
            }
            return snapshotIdSet;
        }
        Iterator<Integer> it2 = bits.iterator();
        while (it2.hasNext()) {
            int intValue2 = it2.next().intValue();
            if (get(intValue2)) {
                snapshotIdSet = snapshotIdSet.set(intValue2);
            }
        }
        return snapshotIdSet;
    }

    @NotNull
    public final SnapshotIdSet andNot(@NotNull SnapshotIdSet bits) {
        Intrinsics.checkNotNullParameter(bits, "bits");
        SnapshotIdSet snapshotIdSet = f28735e;
        if (bits == snapshotIdSet) {
            return this;
        }
        if (this == snapshotIdSet) {
            return snapshotIdSet;
        }
        int i = bits.f28738c;
        int i2 = this.f28738c;
        if (i == i2) {
            int[] iArr = bits.f28739d;
            int[] iArr2 = this.f28739d;
            if (iArr == iArr2) {
                return new SnapshotIdSet(this.f28736a & (~bits.f28736a), this.f28737b & (~bits.f28737b), i2, iArr2);
            }
        }
        Iterator<Integer> it = bits.iterator();
        SnapshotIdSet snapshotIdSet2 = this;
        while (it.hasNext()) {
            snapshotIdSet2 = snapshotIdSet2.clear(it.next().intValue());
        }
        return snapshotIdSet2;
    }

    @NotNull
    public final SnapshotIdSet clear(int i) {
        int[] iArr;
        int binarySearch;
        int i2 = this.f28738c;
        int i3 = i - i2;
        if (i3 >= 0 && i3 < 64) {
            long j = 1 << i3;
            long j2 = this.f28737b;
            if ((j2 & j) != 0) {
                return new SnapshotIdSet(this.f28736a, j2 & (~j), i2, this.f28739d);
            }
        } else if (i3 >= 64 && i3 < 128) {
            long j3 = 1 << (i3 - 64);
            long j4 = this.f28736a;
            if ((j4 & j3) != 0) {
                return new SnapshotIdSet(j4 & (~j3), this.f28737b, i2, this.f28739d);
            }
        } else if (i3 < 0 && (iArr = this.f28739d) != null && (binarySearch = SnapshotIdSetKt.binarySearch(iArr, i)) >= 0) {
            int length = iArr.length;
            int i4 = length - 1;
            if (i4 == 0) {
                return new SnapshotIdSet(this.f28736a, this.f28737b, this.f28738c, null);
            }
            int[] iArr2 = new int[i4];
            if (binarySearch > 0) {
                ArraysKt___ArraysJvmKt.copyInto(iArr, iArr2, 0, 0, binarySearch);
            }
            if (binarySearch < i4) {
                ArraysKt___ArraysJvmKt.copyInto(iArr, iArr2, binarySearch, binarySearch + 1, length);
            }
            return new SnapshotIdSet(this.f28736a, this.f28737b, this.f28738c, iArr2);
        }
        return this;
    }

    public final void fastForEach(@NotNull Function1<? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int[] iArr = this.f28739d;
        if (iArr != null) {
            for (int i : iArr) {
                block.invoke(Integer.valueOf(i));
            }
        }
        if (this.f28737b != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if ((this.f28737b & (1 << i2)) != 0) {
                    block.invoke(Integer.valueOf(this.f28738c + i2));
                }
            }
        }
        if (this.f28736a != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if ((this.f28736a & (1 << i3)) != 0) {
                    block.invoke(Integer.valueOf(i3 + 64 + this.f28738c));
                }
            }
        }
    }

    public final boolean get(int i) {
        int[] iArr;
        int i2 = i - this.f28738c;
        boolean z = true;
        if (i2 >= 0 && i2 < 64) {
            if (((1 << i2) & this.f28737b) != 0) {
                return true;
            }
            return false;
        } else if (i2 >= 64 && i2 < 128) {
            if (((1 << (i2 - 64)) & this.f28736a) != 0) {
                return true;
            }
            return false;
        } else if (i2 > 0 || (iArr = this.f28739d) == null) {
            return false;
        } else {
            if (SnapshotIdSetKt.binarySearch(iArr, i) < 0) {
                z = false;
            }
            return z;
        }
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<Integer> iterator() {
        return SequencesKt__SequenceBuilderKt.sequence(new SnapshotIdSet$iterator$1(this, null)).iterator();
    }

    public final int lowest(int i) {
        int m59921a;
        int m59921a2;
        int[] iArr = this.f28739d;
        if (iArr != null) {
            return iArr[0];
        }
        long j = this.f28737b;
        if (j != 0) {
            int i2 = this.f28738c;
            m59921a2 = SnapshotIdSetKt.m59921a(j);
            return i2 + m59921a2;
        }
        long j2 = this.f28736a;
        if (j2 != 0) {
            m59921a = SnapshotIdSetKt.m59921a(j2);
            return this.f28738c + 64 + m59921a;
        }
        return i;
    }

    @NotNull
    /* renamed from: or */
    public final SnapshotIdSet m59922or(@NotNull SnapshotIdSet bits) {
        Intrinsics.checkNotNullParameter(bits, "bits");
        SnapshotIdSet snapshotIdSet = f28735e;
        if (bits == snapshotIdSet) {
            return this;
        }
        if (this == snapshotIdSet) {
            return bits;
        }
        int i = bits.f28738c;
        int i2 = this.f28738c;
        if (i == i2) {
            int[] iArr = bits.f28739d;
            int[] iArr2 = this.f28739d;
            if (iArr == iArr2) {
                return new SnapshotIdSet(this.f28736a | bits.f28736a, this.f28737b | bits.f28737b, i2, iArr2);
            }
        }
        if (this.f28739d == null) {
            Iterator<Integer> it = iterator();
            while (it.hasNext()) {
                bits = bits.set(it.next().intValue());
            }
            return bits;
        }
        Iterator<Integer> it2 = bits.iterator();
        SnapshotIdSet snapshotIdSet2 = this;
        while (it2.hasNext()) {
            snapshotIdSet2 = snapshotIdSet2.set(it2.next().intValue());
        }
        return snapshotIdSet2;
    }

    @NotNull
    public final SnapshotIdSet set(int i) {
        int i2;
        int[] iArr;
        int i3 = this.f28738c;
        int i4 = i - i3;
        long j = 0;
        if (i4 >= 0 && i4 < 64) {
            long j2 = 1 << i4;
            long j3 = this.f28737b;
            if ((j3 & j2) == 0) {
                return new SnapshotIdSet(this.f28736a, j3 | j2, i3, this.f28739d);
            }
        } else if (i4 >= 64 && i4 < 128) {
            long j4 = 1 << (i4 - 64);
            long j5 = this.f28736a;
            if ((j5 & j4) == 0) {
                return new SnapshotIdSet(j5 | j4, this.f28737b, i3, this.f28739d);
            }
        } else if (i4 >= 128) {
            if (!get(i)) {
                long j6 = this.f28736a;
                long j7 = this.f28737b;
                int i5 = this.f28738c;
                int i6 = ((i + 1) / 64) * 64;
                ArrayList arrayList = null;
                long j8 = j7;
                long j9 = j6;
                while (true) {
                    if (i5 < i6) {
                        if (j8 != j) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                int[] iArr2 = this.f28739d;
                                if (iArr2 != null) {
                                    for (int i7 : iArr2) {
                                        arrayList.add(Integer.valueOf(i7));
                                    }
                                }
                            }
                            for (int i8 = 0; i8 < 64; i8++) {
                                if (((1 << i8) & j8) != 0) {
                                    arrayList.add(Integer.valueOf(i8 + i5));
                                }
                            }
                            j = 0;
                        }
                        if (j9 == j) {
                            i2 = i6;
                            j8 = j;
                            break;
                        }
                        i5 += 64;
                        j8 = j9;
                        j9 = j;
                    } else {
                        i2 = i5;
                        break;
                    }
                }
                if (arrayList == null || (iArr = CollectionsKt___CollectionsKt.toIntArray(arrayList)) == null) {
                    iArr = this.f28739d;
                }
                return new SnapshotIdSet(j9, j8, i2, iArr).set(i);
            }
        } else {
            int[] iArr3 = this.f28739d;
            if (iArr3 == null) {
                return new SnapshotIdSet(this.f28736a, this.f28737b, i3, new int[]{i});
            }
            int binarySearch = SnapshotIdSetKt.binarySearch(iArr3, i);
            if (binarySearch < 0) {
                int i9 = -(binarySearch + 1);
                int length = iArr3.length;
                int[] iArr4 = new int[length + 1];
                ArraysKt___ArraysJvmKt.copyInto(iArr3, iArr4, 0, 0, i9);
                ArraysKt___ArraysJvmKt.copyInto(iArr3, iArr4, i9 + 1, i9, length);
                iArr4[i9] = i;
                return new SnapshotIdSet(this.f28736a, this.f28737b, this.f28738c, iArr4);
            }
        }
        return this;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(AbstractC10176es.collectionSizeOrDefault(this, 10));
        Iterator<Integer> it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().intValue()));
        }
        sb.append(ListUtilsKt.fastJoinToString$default(arrayList, null, null, null, 0, null, null, 63, null));
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }
}
