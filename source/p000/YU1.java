package p000;

import com.google.common.base.Preconditions;
import java.util.Iterator;

/* renamed from: YU1 */
/* loaded from: classes4.dex */
public abstract class YU1 implements Iterator {

    /* renamed from: a */
    public final Iterator f7776a;

    public YU1(Iterator it) {
        this.f7776a = (Iterator) Preconditions.checkNotNull(it);
    }

    /* renamed from: a */
    public abstract Object mo40369a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7776a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return mo40369a(this.f7776a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f7776a.remove();
    }
}
