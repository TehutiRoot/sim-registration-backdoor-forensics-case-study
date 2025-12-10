package p000;

import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.google.common.graph.EndpointPair;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* renamed from: yS */
/* loaded from: classes4.dex */
public abstract class AbstractC17130yS extends AbstractIterator {

    /* renamed from: c */
    public final InterfaceC0597Ia f109038c;

    /* renamed from: d */
    public final Iterator f109039d;

    /* renamed from: e */
    public Object f109040e;

    /* renamed from: f */
    public Iterator f109041f;

    /* renamed from: yS$b */
    /* loaded from: classes4.dex */
    public static final class C17132b extends AbstractC17130yS {
        @Override // com.google.common.collect.AbstractIterator
        /* renamed from: d */
        public EndpointPair computeNext() {
            while (!this.f109041f.hasNext()) {
                if (!m301b()) {
                    return (EndpointPair) endOfData();
                }
            }
            Object obj = this.f109040e;
            Objects.requireNonNull(obj);
            return EndpointPair.ordered(obj, this.f109041f.next());
        }

        public C17132b(InterfaceC0597Ia interfaceC0597Ia) {
            super(interfaceC0597Ia);
        }
    }

    /* renamed from: yS$c */
    /* loaded from: classes4.dex */
    public static final class C17133c extends AbstractC17130yS {

        /* renamed from: g */
        public Set f109042g;

        @Override // com.google.common.collect.AbstractIterator
        /* renamed from: d */
        public EndpointPair computeNext() {
            do {
                Objects.requireNonNull(this.f109042g);
                while (this.f109041f.hasNext()) {
                    Object next = this.f109041f.next();
                    if (!this.f109042g.contains(next)) {
                        Object obj = this.f109040e;
                        Objects.requireNonNull(obj);
                        return EndpointPair.unordered(obj, next);
                    }
                }
                this.f109042g.add(this.f109040e);
            } while (m301b());
            this.f109042g = null;
            return (EndpointPair) endOfData();
        }

        public C17133c(InterfaceC0597Ia interfaceC0597Ia) {
            super(interfaceC0597Ia);
            this.f109042g = Sets.newHashSetWithExpectedSize(interfaceC0597Ia.nodes().size() + 1);
        }
    }

    /* renamed from: c */
    public static AbstractC17130yS m300c(InterfaceC0597Ia interfaceC0597Ia) {
        if (interfaceC0597Ia.isDirected()) {
            return new C17132b(interfaceC0597Ia);
        }
        return new C17133c(interfaceC0597Ia);
    }

    /* renamed from: b */
    public final boolean m301b() {
        Preconditions.checkState(!this.f109041f.hasNext());
        if (!this.f109039d.hasNext()) {
            return false;
        }
        Object next = this.f109039d.next();
        this.f109040e = next;
        this.f109041f = this.f109038c.successors(next).iterator();
        return true;
    }

    public AbstractC17130yS(InterfaceC0597Ia interfaceC0597Ia) {
        this.f109040e = null;
        this.f109041f = ImmutableSet.m40920of().iterator();
        this.f109038c = interfaceC0597Ia;
        this.f109039d = interfaceC0597Ia.nodes().iterator();
    }
}