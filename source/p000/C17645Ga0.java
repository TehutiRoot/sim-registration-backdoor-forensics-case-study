package p000;

import java.util.Objects;
import java.util.Spliterator;
import org.apache.commons.p028io.function.IOComparator;
import org.apache.commons.p028io.function.IOConsumer;
import org.apache.commons.p028io.function.IOSpliterator;

/* renamed from: Ga0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C17645Ga0 implements IOSpliterator {

    /* renamed from: a */
    public final Spliterator f1957a;

    public C17645Ga0(Spliterator spliterator) {
        Objects.requireNonNull(spliterator, "delegate");
        this.f1957a = AbstractC17581Fa0.m68393a(spliterator);
    }

    /* renamed from: a */
    public static C17645Ga0 m68227a(Spliterator spliterator) {
        return new C17645Ga0(spliterator);
    }

    @Override // org.apache.commons.p028io.function.IOSpliterator
    public /* synthetic */ Spliterator asSpliterator() {
        return AbstractC17517Ea0.m68488a(this);
    }

    @Override // org.apache.commons.p028io.function.IOSpliterator
    public /* synthetic */ int characteristics() {
        return AbstractC17517Ea0.m68487b(this);
    }

    @Override // org.apache.commons.p028io.function.IOSpliterator
    public /* synthetic */ long estimateSize() {
        return AbstractC17517Ea0.m68486c(this);
    }

    @Override // org.apache.commons.p028io.function.IOSpliterator
    public /* synthetic */ void forEachRemaining(IOConsumer iOConsumer) {
        AbstractC17517Ea0.m68485d(this, iOConsumer);
    }

    @Override // org.apache.commons.p028io.function.IOSpliterator
    public /* synthetic */ IOComparator getComparator() {
        return AbstractC17517Ea0.m68484e(this);
    }

    @Override // org.apache.commons.p028io.function.IOSpliterator
    public /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC17517Ea0.m68483f(this);
    }

    @Override // org.apache.commons.p028io.function.IOSpliterator
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return AbstractC17517Ea0.m68482g(this, i);
    }

    @Override // org.apache.commons.p028io.function.IOSpliterator
    public /* synthetic */ boolean tryAdvance(IOConsumer iOConsumer) {
        return AbstractC17517Ea0.m68481h(this, iOConsumer);
    }

    @Override // org.apache.commons.p028io.function.IOSpliterator
    public /* synthetic */ IOSpliterator trySplit() {
        return AbstractC17517Ea0.m68480i(this);
    }

    @Override // org.apache.commons.p028io.function.IOSpliterator
    public Spliterator unwrap() {
        return this.f1957a;
    }
}
