package p000;

import java.util.Objects;
import java.util.stream.BaseStream;
import org.apache.commons.p028io.function.IOBaseStream;
import org.apache.commons.p028io.function.IOIterator;
import org.apache.commons.p028io.function.IORunnable;
import org.apache.commons.p028io.function.IOSpliterator;

/* renamed from: B90 */
/* loaded from: classes6.dex */
public abstract class B90 implements IOBaseStream {

    /* renamed from: a */
    public final BaseStream f327a;

    public B90(BaseStream baseStream) {
        Objects.requireNonNull(baseStream, "delegate");
        this.f327a = A90.m69319a(baseStream);
    }

    @Override // org.apache.commons.p028io.function.IOBaseStream
    public /* synthetic */ BaseStream asBaseStream() {
        return AbstractC23329z90.m187a(this);
    }

    @Override // org.apache.commons.p028io.function.IOBaseStream, java.io.Closeable, java.lang.AutoCloseable
    public /* synthetic */ void close() {
        AbstractC23329z90.m186b(this);
    }

    @Override // org.apache.commons.p028io.function.IOBaseStream
    public /* synthetic */ boolean isParallel() {
        return AbstractC23329z90.m185c(this);
    }

    @Override // org.apache.commons.p028io.function.IOBaseStream
    public /* synthetic */ IOIterator iterator() {
        return AbstractC23329z90.m184d(this);
    }

    @Override // org.apache.commons.p028io.function.IOBaseStream
    public /* synthetic */ IOBaseStream onClose(IORunnable iORunnable) {
        return AbstractC23329z90.m183e(this, iORunnable);
    }

    @Override // org.apache.commons.p028io.function.IOBaseStream
    public /* synthetic */ IOBaseStream parallel() {
        return AbstractC23329z90.m182f(this);
    }

    @Override // org.apache.commons.p028io.function.IOBaseStream
    public /* synthetic */ IOBaseStream sequential() {
        return AbstractC23329z90.m181g(this);
    }

    @Override // org.apache.commons.p028io.function.IOBaseStream
    public /* synthetic */ IOSpliterator spliterator() {
        return AbstractC23329z90.m180h(this);
    }

    @Override // org.apache.commons.p028io.function.IOBaseStream
    public /* synthetic */ IOBaseStream unordered() {
        return AbstractC23329z90.m179i(this);
    }

    @Override // org.apache.commons.p028io.function.IOBaseStream
    public BaseStream unwrap() {
        return this.f327a;
    }
}