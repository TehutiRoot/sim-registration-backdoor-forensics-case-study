package p000;

import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.google.common.graph.EndpointPair;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* renamed from: uS */
/* loaded from: classes4.dex */
public abstract class AbstractC16818uS extends AbstractIterator {

    /* renamed from: c */
    public final InterfaceC0607Ia f107361c;

    /* renamed from: d */
    public final Iterator f107362d;

    /* renamed from: e */
    public Object f107363e;

    /* renamed from: f */
    public Iterator f107364f;

    /* renamed from: uS$b */
    /* loaded from: classes4.dex */
    public static final class C16820b extends AbstractC16818uS {
        @Override // com.google.common.collect.AbstractIterator
        /* renamed from: d */
        public EndpointPair computeNext() {
            while (!this.f107364f.hasNext()) {
                if (!m1267b()) {
                    return (EndpointPair) endOfData();
                }
            }
            Object obj = this.f107363e;
            Objects.requireNonNull(obj);
            return EndpointPair.ordered(obj, this.f107364f.next());
        }

        public C16820b(InterfaceC0607Ia interfaceC0607Ia) {
            super(interfaceC0607Ia);
        }
    }

    /* renamed from: uS$c */
    /* loaded from: classes4.dex */
    public static final class C16821c extends AbstractC16818uS {

        /* renamed from: g */
        public Set f107365g;

        @Override // com.google.common.collect.AbstractIterator
        /* renamed from: d */
        public EndpointPair computeNext() {
            do {
                Objects.requireNonNull(this.f107365g);
                while (this.f107364f.hasNext()) {
                    Object next = this.f107364f.next();
                    if (!this.f107365g.contains(next)) {
                        Object obj = this.f107363e;
                        Objects.requireNonNull(obj);
                        return EndpointPair.unordered(obj, next);
                    }
                }
                this.f107365g.add(this.f107363e);
            } while (m1267b());
            this.f107365g = null;
            return (EndpointPair) endOfData();
        }

        public C16821c(InterfaceC0607Ia interfaceC0607Ia) {
            super(interfaceC0607Ia);
            this.f107365g = Sets.newHashSetWithExpectedSize(interfaceC0607Ia.nodes().size() + 1);
        }
    }

    /* renamed from: c */
    public static AbstractC16818uS m1266c(InterfaceC0607Ia interfaceC0607Ia) {
        if (interfaceC0607Ia.isDirected()) {
            return new C16820b(interfaceC0607Ia);
        }
        return new C16821c(interfaceC0607Ia);
    }

    /* renamed from: b */
    public final boolean m1267b() {
        Preconditions.checkState(!this.f107364f.hasNext());
        if (!this.f107362d.hasNext()) {
            return false;
        }
        Object next = this.f107362d.next();
        this.f107363e = next;
        this.f107364f = this.f107361c.successors(next).iterator();
        return true;
    }

    public AbstractC16818uS(InterfaceC0607Ia interfaceC0607Ia) {
        this.f107363e = null;
        this.f107364f = ImmutableSet.m40931of().iterator();
        this.f107361c = interfaceC0607Ia;
        this.f107362d = interfaceC0607Ia.nodes().iterator();
    }
}
