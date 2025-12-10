package p000;

import java.util.Comparator;
import java.util.Objects;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import org.apache.commons.p028io.function.IOConsumer;
import org.apache.commons.p028io.function.IOFunction;
import org.apache.commons.p028io.function.IOSpliterator;
import org.apache.commons.p028io.function.IOSupplier;
import org.apache.commons.p028io.function.Uncheck;

/* renamed from: iY1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C20398iY1 implements Spliterator {

    /* renamed from: a */
    public final IOSpliterator f62817a;

    public C20398iY1(IOSpliterator iOSpliterator) {
        Objects.requireNonNull(iOSpliterator, "delegate");
        this.f62817a = iOSpliterator;
    }

    @Override // java.util.Spliterator
    public int characteristics() {
        return this.f62817a.characteristics();
    }

    @Override // java.util.Spliterator
    public long estimateSize() {
        return this.f62817a.estimateSize();
    }

    @Override // java.util.Spliterator
    public void forEachRemaining(final Consumer consumer) {
        final IOSpliterator iOSpliterator = this.f62817a;
        Objects.requireNonNull(iOSpliterator);
        IOConsumer iOConsumer = new IOConsumer() { // from class: gY1
            @Override // org.apache.commons.p028io.function.IOConsumer
            public final void accept(Object obj) {
                IOSpliterator.this.forEachRemaining((IOConsumer) obj);
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer2) {
                return Q90.m66654a(this, iOConsumer2);
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ Consumer asConsumer() {
                return Q90.m66653b(this);
            }
        };
        Objects.requireNonNull(consumer);
        Uncheck.accept(iOConsumer, new IOConsumer() { // from class: hY1
            @Override // org.apache.commons.p028io.function.IOConsumer
            public final void accept(Object obj) {
                consumer.accept(obj);
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer2) {
                return Q90.m66654a(this, iOConsumer2);
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ Consumer asConsumer() {
                return Q90.m66653b(this);
            }
        });
    }

    @Override // java.util.Spliterator
    public Comparator getComparator() {
        return this.f62817a.getComparator().asComparator();
    }

    @Override // java.util.Spliterator
    public long getExactSizeIfKnown() {
        return this.f62817a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public boolean hasCharacteristics(int i) {
        return this.f62817a.hasCharacteristics(i);
    }

    @Override // java.util.Spliterator
    public boolean tryAdvance(final Consumer consumer) {
        final IOSpliterator iOSpliterator = this.f62817a;
        Objects.requireNonNull(iOSpliterator);
        IOFunction iOFunction = new IOFunction() { // from class: dY1
            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(Consumer consumer2) {
                return AbstractC19197ba0.m51989a(this, consumer2);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public final Object apply(Object obj) {
                return Boolean.valueOf(IOSpliterator.this.tryAdvance((IOConsumer) obj));
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
            public /* synthetic */ IOFunction compose(IOFunction iOFunction2) {
                return AbstractC19197ba0.m51983g(this, iOFunction2);
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
            public /* synthetic */ IOFunction andThen(IOFunction iOFunction2) {
                return AbstractC19197ba0.m51986d(this, iOFunction2);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOSupplier compose(IOSupplier iOSupplier) {
                return AbstractC19197ba0.m51981i(this, iOSupplier);
            }
        };
        Objects.requireNonNull(consumer);
        return ((Boolean) Uncheck.apply(iOFunction, new IOConsumer() { // from class: eY1
            @Override // org.apache.commons.p028io.function.IOConsumer
            public final void accept(Object obj) {
                consumer.accept(obj);
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
                return Q90.m66654a(this, iOConsumer);
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ Consumer asConsumer() {
                return Q90.m66653b(this);
            }
        })).booleanValue();
    }

    @Override // java.util.Spliterator
    public Spliterator trySplit() {
        final IOSpliterator iOSpliterator = this.f62817a;
        Objects.requireNonNull(iOSpliterator);
        return ((IOSpliterator) Uncheck.get(new IOSupplier() { // from class: fY1
            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Supplier asSupplier() {
                return AbstractC17712Hb0.m68064a(this);
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public final Object get() {
                return IOSpliterator.this.trySplit();
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Object getUnchecked() {
                return AbstractC17712Hb0.m68063b(this);
            }
        })).unwrap();
    }
}
