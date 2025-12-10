package p000;

import java.util.Iterator;
import java.util.Objects;
import java.util.function.Supplier;
import org.apache.commons.p028io.function.IOIterator;
import org.apache.commons.p028io.function.IORunnable;
import org.apache.commons.p028io.function.IOSupplier;
import org.apache.commons.p028io.function.Uncheck;

/* renamed from: ZY1 */
/* loaded from: classes6.dex */
public final class ZY1 implements Iterator {

    /* renamed from: a */
    public final IOIterator f8199a;

    public ZY1(IOIterator iOIterator) {
        Objects.requireNonNull(iOIterator, "delegate");
        this.f8199a = iOIterator;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        final IOIterator iOIterator = this.f8199a;
        Objects.requireNonNull(iOIterator);
        return ((Boolean) Uncheck.get(new IOSupplier() { // from class: YY1
            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Supplier asSupplier() {
                return AbstractC18132Nb0.m67225a(this);
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public final Object get() {
                return Boolean.valueOf(IOIterator.this.hasNext());
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Object getUnchecked() {
                return AbstractC18132Nb0.m67224b(this);
            }
        })).booleanValue();
    }

    @Override // java.util.Iterator
    public Object next() {
        final IOIterator iOIterator = this.f8199a;
        Objects.requireNonNull(iOIterator);
        return Uncheck.get(new IOSupplier() { // from class: WY1
            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Supplier asSupplier() {
                return AbstractC18132Nb0.m67225a(this);
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public final Object get() {
                return IOIterator.this.next();
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Object getUnchecked() {
                return AbstractC18132Nb0.m67224b(this);
            }
        });
    }

    @Override // java.util.Iterator
    public void remove() {
        final IOIterator iOIterator = this.f8199a;
        Objects.requireNonNull(iOIterator);
        Uncheck.run(new IORunnable() { // from class: XY1
            @Override // org.apache.commons.p028io.function.IORunnable
            public /* synthetic */ Runnable asRunnable() {
                return AbstractC17479Da0.m68815a(this);
            }

            @Override // org.apache.commons.p028io.function.IORunnable
            public final void run() {
                IOIterator.this.remove();
            }
        });
    }
}