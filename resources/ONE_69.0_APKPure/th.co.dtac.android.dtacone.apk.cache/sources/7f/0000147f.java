package p000;

import com.google.common.base.Preconditions;
import java.util.Iterator;

/* renamed from: VV1 */
/* loaded from: classes4.dex */
public abstract class VV1 implements Iterator {

    /* renamed from: a */
    public final Iterator f6929a;

    public VV1(Iterator it) {
        this.f6929a = (Iterator) Preconditions.checkNotNull(it);
    }

    /* renamed from: a */
    public abstract Object mo40358a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6929a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return mo40358a(this.f6929a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f6929a.remove();
    }
}