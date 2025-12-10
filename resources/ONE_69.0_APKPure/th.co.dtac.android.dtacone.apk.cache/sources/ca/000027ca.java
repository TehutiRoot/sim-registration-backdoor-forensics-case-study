package androidx.compose.foundation.lazy.staggeredgrid;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0015\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 -2\u00020\u0001:\u0002-\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0003J\u001d\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010\"\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\"\u0010\tR\u0016\u0010$\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010'\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006."}, m29142d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "", "<init>", "()V", "", "itemIndex", "lane", "", "setLane", "(II)V", "getLane", "(I)I", "targetLane", "", "assignedToLane", "(II)Z", "upperBound", "()I", "lowerBound", "reset", "findPreviousItemIndex", "(II)I", "findNextItemIndex", "requestedIndex", "ensureValidIndex", "(I)V", "", "gaps", "setGaps", "(I[I)V", "getGaps", "(I)[I", "capacity", "newOffset", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "anchor", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "[I", "lanes", "Lkotlin/collections/ArrayDeque;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo$a;", OperatorName.CURVE_TO, "Lkotlin/collections/ArrayDeque;", "spannedItems", "Companion", "foundation_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyStaggeredGridLaneInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridLaneInfo.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt\n*L\n1#1,207:1\n1#2:208\n388#3,7:209\n388#3,7:216\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridLaneInfo.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo\n*L\n167#1:209,7\n187#1:216,7\n*E\n"})
/* loaded from: classes.dex */
public final class LazyStaggeredGridLaneInfo {
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int FullSpan = -2;
    public static final int Unset = -1;

    /* renamed from: a */
    public int f13809a;

    /* renamed from: b */
    public int[] f13810b = new int[16];

    /* renamed from: c */
    public final ArrayDeque f13811c = new ArrayDeque();

    @Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m29142d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo$Companion;", "", "()V", "FullSpan", "", "MaxCapacity", "Unset", "foundation_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo$a */
    /* loaded from: classes.dex */
    public static final class C2933a {

        /* renamed from: a */
        public final int f13812a;

        /* renamed from: b */
        public int[] f13813b;

        public C2933a(int i, int[] gaps) {
            Intrinsics.checkNotNullParameter(gaps, "gaps");
            this.f13812a = i;
            this.f13813b = gaps;
        }

        /* renamed from: a */
        public final int[] m61110a() {
            return this.f13813b;
        }

        /* renamed from: b */
        public final int m61109b() {
            return this.f13812a;
        }

        /* renamed from: c */
        public final void m61108c(int[] iArr) {
            Intrinsics.checkNotNullParameter(iArr, "<set-?>");
            this.f13813b = iArr;
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m61111b(LazyStaggeredGridLaneInfo lazyStaggeredGridLaneInfo, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        lazyStaggeredGridLaneInfo.m61112a(i, i2);
    }

    /* renamed from: a */
    public final void m61112a(int i, int i2) {
        if (i <= 131072) {
            int[] iArr = this.f13810b;
            if (iArr.length < i) {
                int length = iArr.length;
                while (length < i) {
                    length *= 2;
                }
                this.f13810b = ArraysKt___ArraysJvmKt.copyInto$default(this.f13810b, new int[length], i2, 0, 0, 12, (Object) null);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("Requested item capacity " + i + " is larger than max supported: 131072!").toString());
    }

    public final boolean assignedToLane(int i, int i2) {
        int lane = getLane(i);
        if (lane != i2 && lane != -1 && lane != -2) {
            return false;
        }
        return true;
    }

    public final void ensureValidIndex(int i) {
        int i2 = this.f13809a;
        int i3 = i - i2;
        if (i3 >= 0 && i3 < 131072) {
            m61111b(this, i3 + 1, 0, 2, null);
        } else {
            int max = Math.max(i - (this.f13810b.length / 2), 0);
            this.f13809a = max;
            int i4 = max - i2;
            if (i4 >= 0) {
                int[] iArr = this.f13810b;
                if (i4 < iArr.length) {
                    ArraysKt___ArraysJvmKt.copyInto(iArr, iArr, 0, i4, iArr.length);
                }
                int[] iArr2 = this.f13810b;
                ArraysKt___ArraysJvmKt.fill(iArr2, 0, Math.max(0, iArr2.length - i4), this.f13810b.length);
            } else {
                int i5 = -i4;
                int[] iArr3 = this.f13810b;
                if (iArr3.length + i5 < 131072) {
                    m61112a(iArr3.length + i5 + 1, i5);
                } else {
                    if (i5 < iArr3.length) {
                        ArraysKt___ArraysJvmKt.copyInto(iArr3, iArr3, i5, 0, iArr3.length - i5);
                    }
                    int[] iArr4 = this.f13810b;
                    ArraysKt___ArraysJvmKt.fill(iArr4, 0, 0, Math.min(iArr4.length, i5));
                }
            }
        }
        while ((!this.f13811c.isEmpty()) && ((C2933a) this.f13811c.first()).m61109b() < lowerBound()) {
            this.f13811c.removeFirst();
        }
        while ((!this.f13811c.isEmpty()) && ((C2933a) this.f13811c.last()).m61109b() > upperBound()) {
            this.f13811c.removeLast();
        }
    }

    public final int findNextItemIndex(int i, int i2) {
        int upperBound = upperBound();
        for (int i3 = i + 1; i3 < upperBound; i3++) {
            if (assignedToLane(i3, i2)) {
                return i3;
            }
        }
        return upperBound();
    }

    public final int findPreviousItemIndex(int i, int i2) {
        while (true) {
            i--;
            if (-1 >= i) {
                return -1;
            }
            if (assignedToLane(i, i2)) {
                return i;
            }
        }
    }

    @Nullable
    public final int[] getGaps(int i) {
        ArrayDeque arrayDeque = this.f13811c;
        C2933a c2933a = (C2933a) CollectionsKt___CollectionsKt.getOrNull(this.f13811c, CollectionsKt__CollectionsKt.binarySearch(arrayDeque, 0, arrayDeque.size(), new C2934x6e01acca(Integer.valueOf(i))));
        if (c2933a != null) {
            return c2933a.m61110a();
        }
        return null;
    }

    public final int getLane(int i) {
        if (i >= lowerBound() && i < upperBound()) {
            return this.f13810b[i - this.f13809a] - 1;
        }
        return -1;
    }

    public final int lowerBound() {
        return this.f13809a;
    }

    public final void reset() {
        ArraysKt___ArraysJvmKt.fill$default(this.f13810b, 0, 0, 0, 6, (Object) null);
        this.f13811c.clear();
    }

    public final void setGaps(int i, @Nullable int[] iArr) {
        ArrayDeque arrayDeque = this.f13811c;
        int binarySearch = CollectionsKt__CollectionsKt.binarySearch(arrayDeque, 0, arrayDeque.size(), new C2935x583b0d6(Integer.valueOf(i)));
        if (binarySearch < 0) {
            if (iArr == null) {
                return;
            }
            this.f13811c.add(-(binarySearch + 1), new C2933a(i, iArr));
        } else if (iArr == null) {
            this.f13811c.remove(binarySearch);
        } else {
            ((C2933a) this.f13811c.get(binarySearch)).m61108c(iArr);
        }
    }

    public final void setLane(int i, int i2) {
        if (i >= 0) {
            ensureValidIndex(i);
            this.f13810b[i - this.f13809a] = i2 + 1;
            return;
        }
        throw new IllegalArgumentException("Negative lanes are not supported".toString());
    }

    public final int upperBound() {
        return this.f13809a + this.f13810b.length;
    }
}