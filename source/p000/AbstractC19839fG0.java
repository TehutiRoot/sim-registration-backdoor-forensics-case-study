package p000;

import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.UnmodifiableIterator;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: fG0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC19839fG0 extends AbstractSet {

    /* renamed from: a */
    public final Map f61767a;

    /* renamed from: b */
    public final Object f61768b;

    /* renamed from: fG0$a */
    /* loaded from: classes4.dex */
    public class C10214a extends AbstractIterator {

        /* renamed from: c */
        public final /* synthetic */ Iterator f61769c;

        /* renamed from: d */
        public final /* synthetic */ AbstractC19839fG0 f61770d;

        public C10214a(AbstractC19839fG0 abstractC19839fG0, Iterator it) {
            this.f61769c = it;
            this.f61770d = abstractC19839fG0;
        }

        @Override // com.google.common.collect.AbstractIterator
        public Object computeNext() {
            while (this.f61769c.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f61769c.next();
                if (this.f61770d.f61768b.equals(entry.getValue())) {
                    return entry.getKey();
                }
            }
            return endOfData();
        }
    }

    public AbstractC19839fG0(Map map, Object obj) {
        this.f61767a = (Map) Preconditions.checkNotNull(map);
        this.f61768b = Preconditions.checkNotNull(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: b */
    public UnmodifiableIterator iterator() {
        return new C10214a(this, this.f61767a.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f61768b.equals(this.f61767a.get(obj));
    }
}
