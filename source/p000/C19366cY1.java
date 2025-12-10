package p000;

import java.util.Iterator;
import java.util.Objects;
import java.util.function.Supplier;
import org.apache.commons.p028io.function.IOIterator;
import org.apache.commons.p028io.function.IORunnable;
import org.apache.commons.p028io.function.IOSupplier;
import org.apache.commons.p028io.function.Uncheck;

/* renamed from: cY1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C19366cY1 implements Iterator {

    /* renamed from: a */
    public final IOIterator f39453a;

    public C19366cY1(IOIterator iOIterator) {
        Objects.requireNonNull(iOIterator, "delegate");
        this.f39453a = iOIterator;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        final IOIterator iOIterator = this.f39453a;
        Objects.requireNonNull(iOIterator);
        return ((Boolean) Uncheck.get(new IOSupplier() { // from class: bY1
            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Supplier asSupplier() {
                return AbstractC17712Hb0.m68064a(this);
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public final Object get() {
                return Boolean.valueOf(IOIterator.this.hasNext());
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Object getUnchecked() {
                return AbstractC17712Hb0.m68063b(this);
            }
        })).booleanValue();
    }

    @Override // java.util.Iterator
    public Object next() {
        final IOIterator iOIterator = this.f39453a;
        Objects.requireNonNull(iOIterator);
        return Uncheck.get(new IOSupplier() { // from class: ZX1
            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Supplier asSupplier() {
                return AbstractC17712Hb0.m68064a(this);
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public final Object get() {
                return IOIterator.this.next();
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Object getUnchecked() {
                return AbstractC17712Hb0.m68063b(this);
            }
        });
    }

    @Override // java.util.Iterator
    public void remove() {
        final IOIterator iOIterator = this.f39453a;
        Objects.requireNonNull(iOIterator);
        Uncheck.run(new IORunnable() { // from class: aY1
            @Override // org.apache.commons.p028io.function.IORunnable
            public /* synthetic */ Runnable asRunnable() {
                return AbstractC22981xa0.m424a(this);
            }

            @Override // org.apache.commons.p028io.function.IORunnable
            public final void run() {
                IOIterator.this.remove();
            }
        });
    }
}
