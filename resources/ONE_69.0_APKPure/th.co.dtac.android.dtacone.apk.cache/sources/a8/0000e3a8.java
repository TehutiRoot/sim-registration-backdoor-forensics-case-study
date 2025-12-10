package kotlin.text;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.ranges.AbstractC11695c;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000%\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0019*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0011\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0015\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\"\u0010\u0019\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R$\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0007\"\u0004\b\u001d\u0010\u001eR\"\u0010#\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\f\u001a\u0004\b!\u0010\u000e\"\u0004\b\"\u0010\u0010¨\u0006$"}, m29142d2 = {"kotlin/text/DelimitedRangesSequence$iterator$1", "", "Lkotlin/ranges/IntRange;", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "()V", "next", "()Lkotlin/ranges/IntRange;", "", "hasNext", "()Z", "", "I", "getNextState", "()I", "setNextState", "(I)V", "nextState", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getCurrentStartIndex", "setCurrentStartIndex", "currentStartIndex", OperatorName.CURVE_TO, "getNextSearchIndex", "setNextSearchIndex", "nextSearchIndex", "d", "Lkotlin/ranges/IntRange;", "getNextItem", "setNextItem", "(Lkotlin/ranges/IntRange;)V", "nextItem", "e", "getCounter", "setCounter", "counter", "kotlin-stdlib"}, m29141k = 1, m29140mv = {1, 9, 0})
/* loaded from: classes6.dex */
public final class DelimitedRangesSequence$iterator$1 implements Iterator<IntRange>, KMappedMarker {

    /* renamed from: a */
    public int f70534a = -1;

    /* renamed from: b */
    public int f70535b;

    /* renamed from: c */
    public int f70536c;

    /* renamed from: d */
    public IntRange f70537d;

    /* renamed from: e */
    public int f70538e;

    /* renamed from: f */
    public final /* synthetic */ DelimitedRangesSequence f70539f;

    public DelimitedRangesSequence$iterator$1(DelimitedRangesSequence delimitedRangesSequence) {
        int i;
        CharSequence charSequence;
        this.f70539f = delimitedRangesSequence;
        i = delimitedRangesSequence.f70531b;
        charSequence = delimitedRangesSequence.f70530a;
        int coerceIn = AbstractC11695c.coerceIn(i, 0, charSequence.length());
        this.f70535b = coerceIn;
        this.f70536c = coerceIn;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (r0 < r4) goto L13;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m27755a() {
        /*
            r6 = this;
            int r0 = r6.f70536c
            r1 = 0
            if (r0 >= 0) goto Lc
            r6.f70534a = r1
            r0 = 0
            r6.f70537d = r0
            goto L9e
        Lc:
            kotlin.text.DelimitedRangesSequence r0 = r6.f70539f
            int r0 = kotlin.text.DelimitedRangesSequence.m27757c(r0)
            r2 = -1
            r3 = 1
            if (r0 <= 0) goto L23
            int r0 = r6.f70538e
            int r0 = r0 + r3
            r6.f70538e = r0
            kotlin.text.DelimitedRangesSequence r4 = r6.f70539f
            int r4 = kotlin.text.DelimitedRangesSequence.m27757c(r4)
            if (r0 >= r4) goto L31
        L23:
            int r0 = r6.f70536c
            kotlin.text.DelimitedRangesSequence r4 = r6.f70539f
            java.lang.CharSequence r4 = kotlin.text.DelimitedRangesSequence.m27758b(r4)
            int r4 = r4.length()
            if (r0 <= r4) goto L47
        L31:
            kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
            int r1 = r6.f70535b
            kotlin.text.DelimitedRangesSequence r4 = r6.f70539f
            java.lang.CharSequence r4 = kotlin.text.DelimitedRangesSequence.m27758b(r4)
            int r4 = kotlin.text.StringsKt__StringsKt.getLastIndex(r4)
            r0.<init>(r1, r4)
            r6.f70537d = r0
            r6.f70536c = r2
            goto L9c
        L47:
            kotlin.text.DelimitedRangesSequence r0 = r6.f70539f
            kotlin.jvm.functions.Function2 r0 = kotlin.text.DelimitedRangesSequence.m27759a(r0)
            kotlin.text.DelimitedRangesSequence r4 = r6.f70539f
            java.lang.CharSequence r4 = kotlin.text.DelimitedRangesSequence.m27758b(r4)
            int r5 = r6.f70536c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r0 = r0.invoke(r4, r5)
            kotlin.Pair r0 = (kotlin.Pair) r0
            if (r0 != 0) goto L77
            kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
            int r1 = r6.f70535b
            kotlin.text.DelimitedRangesSequence r4 = r6.f70539f
            java.lang.CharSequence r4 = kotlin.text.DelimitedRangesSequence.m27758b(r4)
            int r4 = kotlin.text.StringsKt__StringsKt.getLastIndex(r4)
            r0.<init>(r1, r4)
            r6.f70537d = r0
            r6.f70536c = r2
            goto L9c
        L77:
            java.lang.Object r2 = r0.component1()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.component2()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r4 = r6.f70535b
            kotlin.ranges.IntRange r4 = kotlin.ranges.AbstractC11695c.until(r4, r2)
            r6.f70537d = r4
            int r2 = r2 + r0
            r6.f70535b = r2
            if (r0 != 0) goto L99
            r1 = 1
        L99:
            int r2 = r2 + r1
            r6.f70536c = r2
        L9c:
            r6.f70534a = r3
        L9e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.DelimitedRangesSequence$iterator$1.m27755a():void");
    }

    public final int getCounter() {
        return this.f70538e;
    }

    public final int getCurrentStartIndex() {
        return this.f70535b;
    }

    @Nullable
    public final IntRange getNextItem() {
        return this.f70537d;
    }

    public final int getNextSearchIndex() {
        return this.f70536c;
    }

    public final int getNextState() {
        return this.f70534a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f70534a == -1) {
            m27755a();
        }
        if (this.f70534a == 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setCounter(int i) {
        this.f70538e = i;
    }

    public final void setCurrentStartIndex(int i) {
        this.f70535b = i;
    }

    public final void setNextItem(@Nullable IntRange intRange) {
        this.f70537d = intRange;
    }

    public final void setNextSearchIndex(int i) {
        this.f70536c = i;
    }

    public final void setNextState(int i) {
        this.f70534a = i;
    }

    @Override // java.util.Iterator
    @NotNull
    public IntRange next() {
        if (this.f70534a == -1) {
            m27755a();
        }
        if (this.f70534a != 0) {
            IntRange intRange = this.f70537d;
            Intrinsics.checkNotNull(intRange, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f70537d = null;
            this.f70534a = -1;
            return intRange;
        }
        throw new NoSuchElementException();
    }
}