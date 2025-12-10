package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.collection.MutableVector;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u0019"}, m28850d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "", "<init>", "()V", "", "start", "end", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo$Interval;", "addInterval", "(II)Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo$Interval;", "interval", "", "removeInterval", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo$Interval;)V", "", "hasIntervals", "()Z", "Landroidx/compose/runtime/collection/MutableVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/runtime/collection/MutableVector;", "beyondBoundsItems", "getStart", "()I", "getEnd", "Interval", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyLayoutBeyondBoundsInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutBeyondBoundsInfo.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,126:1\n1182#2:127\n1161#2,2:128\n460#3,11:130\n460#3,11:141\n*S KotlinDebug\n*F\n+ 1 LazyLayoutBeyondBoundsInfo.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo\n*L\n51#1:127\n51#1:128,2\n87#1:130,11\n102#1:141,11\n*E\n"})
/* loaded from: classes.dex */
public final class LazyLayoutBeyondBoundsInfo {

    /* renamed from: a */
    public final MutableVector f13618a = new MutableVector(new Interval[16], 0);

    @Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\bJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\b¨\u0006\u0019"}, m28850d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo$Interval;", "", "", "start", "end", "<init>", "(II)V", "component1", "()I", "component2", "copy", "(II)Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo$Interval;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getStart", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getEnd", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Interval {

        /* renamed from: a */
        public final int f13619a;

        /* renamed from: b */
        public final int f13620b;

        public Interval(int i, int i2) {
            this.f13619a = i;
            this.f13620b = i2;
            if (i >= 0) {
                if (i2 >= i) {
                    return;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        public static /* synthetic */ Interval copy$default(Interval interval, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = interval.f13619a;
            }
            if ((i3 & 2) != 0) {
                i2 = interval.f13620b;
            }
            return interval.copy(i, i2);
        }

        public final int component1() {
            return this.f13619a;
        }

        public final int component2() {
            return this.f13620b;
        }

        @NotNull
        public final Interval copy(int i, int i2) {
            return new Interval(i, i2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Interval) {
                Interval interval = (Interval) obj;
                return this.f13619a == interval.f13619a && this.f13620b == interval.f13620b;
            }
            return false;
        }

        public final int getEnd() {
            return this.f13620b;
        }

        public final int getStart() {
            return this.f13619a;
        }

        public int hashCode() {
            return (this.f13619a * 31) + this.f13620b;
        }

        @NotNull
        public String toString() {
            return "Interval(start=" + this.f13619a + ", end=" + this.f13620b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @NotNull
    public final Interval addInterval(int i, int i2) {
        Interval interval = new Interval(i, i2);
        this.f13618a.add(interval);
        return interval;
    }

    public final int getEnd() {
        int end = ((Interval) this.f13618a.first()).getEnd();
        MutableVector mutableVector = this.f13618a;
        int size = mutableVector.getSize();
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            int i = 0;
            do {
                Interval interval = (Interval) content[i];
                if (interval.getEnd() > end) {
                    end = interval.getEnd();
                }
                i++;
            } while (i < size);
            return end;
        }
        return end;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int getStart() {
        /*
            r6 = this;
            androidx.compose.runtime.collection.MutableVector r0 = r6.f13618a
            java.lang.Object r0 = r0.first()
            androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo$Interval r0 = (androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo.Interval) r0
            int r0 = r0.getStart()
            androidx.compose.runtime.collection.MutableVector r1 = r6.f13618a
            int r2 = r1.getSize()
            if (r2 <= 0) goto L2b
            java.lang.Object[] r1 = r1.getContent()
            r3 = 0
        L19:
            r4 = r1[r3]
            androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo$Interval r4 = (androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo.Interval) r4
            int r5 = r4.getStart()
            if (r5 >= r0) goto L27
            int r0 = r4.getStart()
        L27:
            int r3 = r3 + 1
            if (r3 < r2) goto L19
        L2b:
            if (r0 < 0) goto L2e
            return r0
        L2e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed requirement."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo.getStart():int");
    }

    public final boolean hasIntervals() {
        return this.f13618a.isNotEmpty();
    }

    public final void removeInterval(@NotNull Interval interval) {
        Intrinsics.checkNotNullParameter(interval, "interval");
        this.f13618a.remove(interval);
    }
}
