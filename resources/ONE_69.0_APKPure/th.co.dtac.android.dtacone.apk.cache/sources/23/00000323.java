package p000;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.sync.SemaphoreKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: DG1 */
/* loaded from: classes6.dex */
public final class DG1 extends Segment {

    /* renamed from: d */
    public final AtomicReferenceArray f972d;

    public DG1(long j, DG1 dg1, int i) {
        super(j, dg1, i);
        int i2;
        i2 = SemaphoreKt.f71151f;
        this.f972d = new AtomicReferenceArray(i2);
    }

    /* renamed from: d */
    public final AtomicReferenceArray m68852d() {
        return this.f972d;
    }

    @Override // kotlinx.coroutines.internal.Segment
    public int getNumberOfSlots() {
        int i;
        i = SemaphoreKt.f71151f;
        return i;
    }

    @Override // kotlinx.coroutines.internal.Segment
    public void onCancellation(int i, Throwable th2, CoroutineContext coroutineContext) {
        Symbol symbol;
        symbol = SemaphoreKt.f71150e;
        m68852d().set(i, symbol);
        onSlotCleaned();
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.f71053id + ", hashCode=" + hashCode() + AbstractJsonLexerKt.END_LIST;
    }
}