package p000;

import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractIterator;
import java.util.Queue;

/* renamed from: vx */
/* loaded from: classes4.dex */
public final class C16945vx extends AbstractIterator {

    /* renamed from: c */
    public final Queue f108278c;

    public C16945vx(Queue queue) {
        this.f108278c = (Queue) Preconditions.checkNotNull(queue);
    }

    @Override // com.google.common.collect.AbstractIterator
    public Object computeNext() {
        if (this.f108278c.isEmpty()) {
            return endOfData();
        }
        return this.f108278c.remove();
    }
}