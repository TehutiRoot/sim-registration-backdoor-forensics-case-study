package p000;

import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.UnmodifiableIterator;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: lG0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC20928lG0 extends AbstractSet {

    /* renamed from: a */
    public final Map f71641a;

    /* renamed from: b */
    public final Object f71642b;

    /* renamed from: lG0$a */
    /* loaded from: classes4.dex */
    public class C12184a extends AbstractIterator {

        /* renamed from: c */
        public final /* synthetic */ Iterator f71643c;

        /* renamed from: d */
        public final /* synthetic */ AbstractC20928lG0 f71644d;

        public C12184a(AbstractC20928lG0 abstractC20928lG0, Iterator it) {
            this.f71643c = it;
            this.f71644d = abstractC20928lG0;
        }

        @Override // com.google.common.collect.AbstractIterator
        public Object computeNext() {
            while (this.f71643c.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f71643c.next();
                if (this.f71644d.f71642b.equals(entry.getValue())) {
                    return entry.getKey();
                }
            }
            return endOfData();
        }
    }

    public AbstractC20928lG0(Map map, Object obj) {
        this.f71641a = (Map) Preconditions.checkNotNull(map);
        this.f71642b = Preconditions.checkNotNull(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: b */
    public UnmodifiableIterator iterator() {
        return new C12184a(this, this.f71641a.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f71642b.equals(this.f71641a.get(obj));
    }
}