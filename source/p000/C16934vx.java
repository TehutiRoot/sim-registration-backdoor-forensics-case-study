package p000;

import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractIterator;
import java.util.Queue;

/* renamed from: vx */
/* loaded from: classes4.dex */
public final class C16934vx extends AbstractIterator {

    /* renamed from: c */
    public final Queue f107858c;

    public C16934vx(Queue queue) {
        this.f107858c = (Queue) Preconditions.checkNotNull(queue);
    }

    @Override // com.google.common.collect.AbstractIterator
    public Object computeNext() {
        if (this.f107858c.isEmpty()) {
            return endOfData();
        }
        return this.f107858c.remove();
    }
}
