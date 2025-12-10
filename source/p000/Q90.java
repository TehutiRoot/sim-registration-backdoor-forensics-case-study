package p000;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.stream.Stream;
import org.apache.commons.p028io.function.IOConsumer;
import org.apache.commons.p028io.function.Uncheck;

/* renamed from: Q90 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class Q90 {
    static {
        IOConsumer<?> iOConsumer = IOConsumer.NOOP_IO_CONSUMER;
    }

    /* renamed from: a */
    public static IOConsumer m66654a(final IOConsumer iOConsumer, final IOConsumer iOConsumer2) {
        Objects.requireNonNull(iOConsumer2, "after");
        return new IOConsumer() { // from class: O90
            @Override // org.apache.commons.p028io.function.IOConsumer
            public final void accept(Object obj) {
                Q90.m66652c(iOConsumer, iOConsumer2, obj);
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer3) {
                return Q90.m66654a(this, iOConsumer3);
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ Consumer asConsumer() {
                return Q90.m66653b(this);
            }
        };
    }

    /* renamed from: b */
    public static Consumer m66653b(final IOConsumer iOConsumer) {
        return new Consumer() { // from class: M90
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Q90.m66651d(iOConsumer, obj);
            }
        };
    }

    /* renamed from: c */
    public static /* synthetic */ void m66652c(IOConsumer iOConsumer, IOConsumer iOConsumer2, Object obj) {
        iOConsumer.accept(obj);
        iOConsumer2.accept(obj);
    }

    /* renamed from: d */
    public static /* synthetic */ void m66651d(IOConsumer iOConsumer, Object obj) {
        Uncheck.accept(iOConsumer, obj);
    }

    /* renamed from: e */
    public static void m66650e(IOConsumer iOConsumer, Iterable iterable) {
        AbstractC17584Fb0.m68390c(AbstractC17584Fb0.m68385h(iterable), iOConsumer);
    }

    /* renamed from: f */
    public static void m66649f(IOConsumer iOConsumer, Stream stream) {
        AbstractC17584Fb0.m68389d(stream, iOConsumer, new N90());
    }

    /* renamed from: g */
    public static void m66648g(IOConsumer iOConsumer, Object... objArr) {
        AbstractC17584Fb0.m68390c(AbstractC17584Fb0.m68383j(objArr), iOConsumer);
    }

    /* renamed from: h */
    public static void m66647h(Iterable iterable, IOConsumer iOConsumer) {
        AbstractC17584Fb0.m68388e(AbstractC17584Fb0.m68385h(iterable), iOConsumer);
    }

    /* renamed from: i */
    public static void m66646i(Stream stream, IOConsumer iOConsumer) {
        AbstractC17584Fb0.m68388e(stream, iOConsumer);
    }

    /* renamed from: j */
    public static void m66645j(Object[] objArr, IOConsumer iOConsumer) {
        AbstractC17584Fb0.m68388e(AbstractC17584Fb0.m68383j(objArr), iOConsumer);
    }

    /* renamed from: l */
    public static IOConsumer m66643l() {
        return IOConsumer.NOOP_IO_CONSUMER;
    }

    /* renamed from: k */
    public static /* synthetic */ void m66644k(Object obj) {
    }
}
