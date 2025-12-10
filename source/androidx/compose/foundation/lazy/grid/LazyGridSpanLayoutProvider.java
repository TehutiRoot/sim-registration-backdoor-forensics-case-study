package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0019\u00148B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0011\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR$\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u001c0\u001bj\b\u0012\u0004\u0012\u00020\u001c`\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001eR\u0016\u0010!\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010 R\u0016\u0010#\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010 R\u0016\u0010%\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010 R\u0016\u0010'\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010 R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00060(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002@\u0002X\u0082\u000eø\u0001\u0000¢\u0006\u0006\n\u0004\b,\u0010*R*\u00104\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010 \u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0011\u00106\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b5\u00101R\u0014\u00107\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u00101\u0082\u0002\u0004\n\u0002\b\u0019¨\u00069"}, m28850d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "", "Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent;", "gridContent", "<init>", "(Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent;)V", "", "lineIndex", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider$LineConfiguration;", "getLineConfiguration", "(I)Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider$LineConfiguration;", "itemIndex", "getLineIndexOfItem", "(I)I", "maxSpan", "spanOf", "(II)I", "currentSlotsPerLine", "", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(I)Ljava/util/List;", "", OperatorName.CURVE_TO, "()V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent;", "Ljava/util/ArrayList;", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider$a;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "buckets", "I", "lastLineIndex", "d", "lastLineStartItemIndex", "e", "lastLineStartKnownSpan", OperatorName.FILL_NON_ZERO, "cachedBucketIndex", "", OperatorName.NON_STROKING_GRAY, "Ljava/util/List;", "cachedBucket", OperatorName.CLOSE_PATH, "previousDefaultSpans", "value", "i", "getSlotsPerLine", "()I", "setSlotsPerLine", "(I)V", "slotsPerLine", "getTotalSize", "totalSize", "bucketSize", "LineConfiguration", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyGridSpanLayoutProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridSpanLayoutProvider.kt\nandroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,245:1\n1#2:246\n*E\n"})
/* loaded from: classes.dex */
public final class LazyGridSpanLayoutProvider {

    /* renamed from: a */
    public final LazyGridIntervalContent f13558a;

    /* renamed from: b */
    public final ArrayList f13559b;

    /* renamed from: c */
    public int f13560c;

    /* renamed from: d */
    public int f13561d;

    /* renamed from: e */
    public int f13562e;

    /* renamed from: f */
    public int f13563f;

    /* renamed from: g */
    public final List f13564g;

    /* renamed from: h */
    public List f13565h;

    /* renamed from: i */
    public int f13566i;

    @StabilityInferred(parameters = 0)
    @Metadata(m28851d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B \u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, m28850d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider$LineConfiguration;", "", "", "firstItemIndex", "", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "spans", "<init>", "(ILjava/util/List;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getFirstItemIndex", "()I", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/List;", "getSpans", "()Ljava/util/List;", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class LineConfiguration {
        public static final int $stable = 8;

        /* renamed from: a */
        public final int f13567a;

        /* renamed from: b */
        public final List f13568b;

        public LineConfiguration(int i, @NotNull List<GridItemSpan> spans) {
            Intrinsics.checkNotNullParameter(spans, "spans");
            this.f13567a = i;
            this.f13568b = spans;
        }

        public final int getFirstItemIndex() {
            return this.f13567a;
        }

        @NotNull
        public final List<GridItemSpan> getSpans() {
            return this.f13568b;
        }
    }

    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$b */
    /* loaded from: classes.dex */
    public static final class C2923b implements LazyGridItemSpanScope {

        /* renamed from: a */
        public static final C2923b f13571a = new C2923b();

        /* renamed from: b */
        public static int f13572b;

        /* renamed from: c */
        public static int f13573c;

        /* renamed from: a */
        public void m61226a(int i) {
            f13572b = i;
        }

        /* renamed from: b */
        public void m61225b(int i) {
            f13573c = i;
        }

        @Override // androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope
        public int getMaxCurrentLineSpan() {
            return f13572b;
        }

        @Override // androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope
        public int getMaxLineSpan() {
            return f13573c;
        }
    }

    public LazyGridSpanLayoutProvider(@NotNull LazyGridIntervalContent gridContent) {
        Intrinsics.checkNotNullParameter(gridContent, "gridContent");
        this.f13558a = gridContent;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C2922a(0, 0, 2, null));
        this.f13559b = arrayList;
        this.f13563f = -1;
        this.f13564g = new ArrayList();
        this.f13565h = CollectionsKt__CollectionsKt.emptyList();
    }

    /* renamed from: a */
    public final int m61231a() {
        return ((int) Math.sqrt((getTotalSize() * 1.0d) / this.f13566i)) + 1;
    }

    /* renamed from: b */
    public final List m61230b(int i) {
        if (i == this.f13565h.size()) {
            return this.f13565h;
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(GridItemSpan.m69607boximpl(LazyGridSpanKt.GridItemSpan(1)));
        }
        this.f13565h = arrayList;
        return arrayList;
    }

    /* renamed from: c */
    public final void m61229c() {
        this.f13559b.clear();
        this.f13559b.add(new C2922a(0, 0, 2, null));
        this.f13560c = 0;
        this.f13561d = 0;
        this.f13562e = 0;
        this.f13563f = -1;
        this.f13564g.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x008f, code lost:
        if (r7 < r6) goto L15;
     */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider.LineConfiguration getLineConfiguration(int r11) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider.getLineConfiguration(int):androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$LineConfiguration");
    }

    public final int getLineIndexOfItem(int i) {
        int i2;
        if (getTotalSize() <= 0) {
            return 0;
        }
        if (i < getTotalSize()) {
            if (!this.f13558a.getHasCustomSpans$foundation_release()) {
                return i / this.f13566i;
            }
            int binarySearch$default = CollectionsKt__CollectionsKt.binarySearch$default(this.f13559b, 0, 0, new LazyGridSpanLayoutProvider$getLineIndexOfItem$lowerBoundBucket$1(i), 3, (Object) null);
            if (binarySearch$default < 0) {
                binarySearch$default = (-binarySearch$default) - 2;
            }
            int m61231a = m61231a() * binarySearch$default;
            int m61228a = ((C2922a) this.f13559b.get(binarySearch$default)).m61228a();
            if (m61228a <= i) {
                int i3 = 0;
                while (m61228a < i) {
                    int i4 = m61228a + 1;
                    int spanOf = spanOf(m61228a, this.f13566i - i3);
                    i3 += spanOf;
                    int i5 = this.f13566i;
                    if (i3 >= i5) {
                        if (i3 == i5) {
                            m61231a++;
                            i3 = 0;
                        } else {
                            m61231a++;
                            i3 = spanOf;
                        }
                    }
                    if (m61231a % m61231a() == 0 && m61231a / m61231a() >= this.f13559b.size()) {
                        ArrayList arrayList = this.f13559b;
                        if (i3 > 0) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        arrayList.add(new C2922a(i4 - i2, 0, 2, null));
                    }
                    m61228a = i4;
                }
                if (i3 + spanOf(i, this.f13566i - i3) > this.f13566i) {
                    return m61231a + 1;
                }
                return m61231a;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final int getSlotsPerLine() {
        return this.f13566i;
    }

    public final int getTotalSize() {
        return this.f13558a.getIntervals().getSize();
    }

    public final void setSlotsPerLine(int i) {
        if (i != this.f13566i) {
            this.f13566i = i;
            m61229c();
        }
    }

    public final int spanOf(int i, int i2) {
        C2923b c2923b = C2923b.f13571a;
        c2923b.m61226a(i2);
        c2923b.m61225b(this.f13566i);
        IntervalList.Interval<LazyGridInterval> interval = this.f13558a.getIntervals().get(i);
        return GridItemSpan.m69611getCurrentLineSpanimpl(interval.getValue().getSpan().invoke(c2923b, Integer.valueOf(i - interval.getStartIndex())).m69614unboximpl());
    }

    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$a */
    /* loaded from: classes.dex */
    public static final class C2922a {

        /* renamed from: a */
        public final int f13569a;

        /* renamed from: b */
        public final int f13570b;

        public C2922a(int i, int i2) {
            this.f13569a = i;
            this.f13570b = i2;
        }

        /* renamed from: a */
        public final int m61228a() {
            return this.f13569a;
        }

        /* renamed from: b */
        public final int m61227b() {
            return this.f13570b;
        }

        public /* synthetic */ C2922a(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i3 & 2) != 0 ? 0 : i2);
        }
    }
}
