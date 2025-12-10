package p000;

import java.util.Iterator;
import java.util.Objects;
import org.apache.commons.p028io.function.IOConsumer;
import org.apache.commons.p028io.function.IOIterator;

/* renamed from: ka0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C20745ka0 implements IOIterator {

    /* renamed from: a */
    public final Iterator f67942a;

    public C20745ka0(Iterator it) {
        Objects.requireNonNull(it, "delegate");
        this.f67942a = it;
    }

    /* renamed from: a */
    public static C20745ka0 m28913a(Iterator it) {
        return new C20745ka0(it);
    }

    @Override // org.apache.commons.p028io.function.IOIterator
    public /* synthetic */ Iterator asIterator() {
        return AbstractC20573ja0.m29195a(this);
    }

    @Override // org.apache.commons.p028io.function.IOIterator
    public /* synthetic */ void forEachRemaining(IOConsumer iOConsumer) {
        AbstractC20573ja0.m29194b(this, iOConsumer);
    }

    @Override // org.apache.commons.p028io.function.IOIterator
    public boolean hasNext() {
        return this.f67942a.hasNext();
    }

    @Override // org.apache.commons.p028io.function.IOIterator
    public Object next() {
        return this.f67942a.next();
    }

    @Override // org.apache.commons.p028io.function.IOIterator
    public /* synthetic */ void remove() {
        AbstractC20573ja0.m29193c(this);
    }

    @Override // org.apache.commons.p028io.function.IOIterator
    public Iterator unwrap() {
        return this.f67942a;
    }
}
