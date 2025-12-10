package p000;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.sync.SemaphoreKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: GF1 */
/* loaded from: classes6.dex */
public final class GF1 extends Segment {

    /* renamed from: d */
    public final AtomicReferenceArray f1862d;

    public GF1(long j, GF1 gf1, int i) {
        super(j, gf1, i);
        int i2;
        i2 = SemaphoreKt.f71117f;
        this.f1862d = new AtomicReferenceArray(i2);
    }

    /* renamed from: d */
    public final AtomicReferenceArray m68280d() {
        return this.f1862d;
    }

    @Override // kotlinx.coroutines.internal.Segment
    public int getNumberOfSlots() {
        int i;
        i = SemaphoreKt.f71117f;
        return i;
    }

    @Override // kotlinx.coroutines.internal.Segment
    public void onCancellation(int i, Throwable th2, CoroutineContext coroutineContext) {
        Symbol symbol;
        symbol = SemaphoreKt.f71116e;
        m68280d().set(i, symbol);
        onSlotCleaned();
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.f71019id + ", hashCode=" + hashCode() + AbstractJsonLexerKt.END_LIST;
    }
}
