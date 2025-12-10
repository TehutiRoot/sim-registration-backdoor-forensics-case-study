package p000;

import java.util.Iterator;
import java.util.Objects;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.BaseStream;
import org.apache.commons.p028io.function.IOBaseStream;
import org.apache.commons.p028io.function.IOConsumer;
import org.apache.commons.p028io.function.IOFunction;
import org.apache.commons.p028io.function.IORunnable;
import org.apache.commons.p028io.function.IOSupplier;
import org.apache.commons.p028io.function.Uncheck;

/* renamed from: YX1 */
/* loaded from: classes6.dex */
public final class YX1 implements BaseStream {

    /* renamed from: a */
    public final IOBaseStream f7782a;

    public YX1(IOBaseStream iOBaseStream) {
        this.f7782a = iOBaseStream;
    }

    /* renamed from: b */
    public static /* synthetic */ void m65339b(Runnable runnable) {
        runnable.run();
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public void close() {
        this.f7782a.close();
    }

    @Override // java.util.stream.BaseStream
    public boolean isParallel() {
        return this.f7782a.isParallel();
    }

    @Override // java.util.stream.BaseStream
    public Iterator iterator() {
        return this.f7782a.iterator().asIterator();
    }

    @Override // java.util.stream.BaseStream
    public BaseStream onClose(final Runnable runnable) {
        final IOBaseStream iOBaseStream = this.f7782a;
        Objects.requireNonNull(iOBaseStream);
        return ((IOBaseStream) Uncheck.apply(new IOFunction() { // from class: WX1
            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(Consumer consumer) {
                return AbstractC19197ba0.m51989a(this, consumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public final Object apply(Object obj) {
                return IOBaseStream.this.onClose((IORunnable) obj);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ Function asFunction() {
                return AbstractC19197ba0.m51985e(this);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction compose(Function function) {
                return AbstractC19197ba0.m51984f(this, function);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
                return AbstractC19197ba0.m51988b(this, iOConsumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction compose(IOFunction iOFunction) {
                return AbstractC19197ba0.m51983g(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction andThen(Function function) {
                return AbstractC19197ba0.m51987c(this, function);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOSupplier compose(Supplier supplier) {
                return AbstractC19197ba0.m51982h(this, supplier);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction andThen(IOFunction iOFunction) {
                return AbstractC19197ba0.m51986d(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOSupplier compose(IOSupplier iOSupplier) {
                return AbstractC19197ba0.m51981i(this, iOSupplier);
            }
        }, new IORunnable() { // from class: XX1
            @Override // org.apache.commons.p028io.function.IORunnable
            public /* synthetic */ Runnable asRunnable() {
                return AbstractC22981xa0.m424a(this);
            }

            @Override // org.apache.commons.p028io.function.IORunnable
            public final void run() {
                YX1.m65339b(runnable);
            }
        })).unwrap();
    }

    @Override // java.util.stream.BaseStream
    public BaseStream parallel() {
        return this.f7782a.parallel().unwrap();
    }

    @Override // java.util.stream.BaseStream
    public BaseStream sequential() {
        return this.f7782a.sequential().unwrap();
    }

    @Override // java.util.stream.BaseStream
    public Spliterator spliterator() {
        return this.f7782a.spliterator().unwrap();
    }

    @Override // java.util.stream.BaseStream
    public BaseStream unordered() {
        return this.f7782a.unordered().unwrap();
    }
}
