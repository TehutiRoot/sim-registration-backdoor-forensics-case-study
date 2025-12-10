package p000;

import java.util.Objects;
import java.util.stream.BaseStream;
import org.apache.commons.p028io.function.IOBaseStream;
import org.apache.commons.p028io.function.IOIterator;
import org.apache.commons.p028io.function.IORunnable;
import org.apache.commons.p028io.function.IOSpliterator;

/* renamed from: v90  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC22570v90 implements IOBaseStream {

    /* renamed from: a */
    public final BaseStream f107595a;

    public AbstractC22570v90(BaseStream baseStream) {
        Objects.requireNonNull(baseStream, "delegate");
        this.f107595a = AbstractC22398u90.m1314a(baseStream);
    }

    @Override // org.apache.commons.p028io.function.IOBaseStream
    public /* synthetic */ BaseStream asBaseStream() {
        return AbstractC22226t90.m22499a(this);
    }

    @Override // org.apache.commons.p028io.function.IOBaseStream, java.io.Closeable, java.lang.AutoCloseable
    public /* synthetic */ void close() {
        AbstractC22226t90.m22498b(this);
    }

    @Override // org.apache.commons.p028io.function.IOBaseStream
    public /* synthetic */ boolean isParallel() {
        return AbstractC22226t90.m22497c(this);
    }

    @Override // org.apache.commons.p028io.function.IOBaseStream
    public /* synthetic */ IOIterator iterator() {
        return AbstractC22226t90.m22496d(this);
    }

    @Override // org.apache.commons.p028io.function.IOBaseStream
    public /* synthetic */ IOBaseStream onClose(IORunnable iORunnable) {
        return AbstractC22226t90.m22495e(this, iORunnable);
    }

    @Override // org.apache.commons.p028io.function.IOBaseStream
    public /* synthetic */ IOBaseStream parallel() {
        return AbstractC22226t90.m22494f(this);
    }

    @Override // org.apache.commons.p028io.function.IOBaseStream
    public /* synthetic */ IOBaseStream sequential() {
        return AbstractC22226t90.m22493g(this);
    }

    @Override // org.apache.commons.p028io.function.IOBaseStream
    public /* synthetic */ IOSpliterator spliterator() {
        return AbstractC22226t90.m22492h(this);
    }

    @Override // org.apache.commons.p028io.function.IOBaseStream
    public /* synthetic */ IOBaseStream unordered() {
        return AbstractC22226t90.m22491i(this);
    }

    @Override // org.apache.commons.p028io.function.IOBaseStream
    public BaseStream unwrap() {
        return this.f107595a;
    }
}
