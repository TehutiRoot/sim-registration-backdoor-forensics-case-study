package p000;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.BaseStream;
import org.apache.commons.p028io.function.Erase;
import org.apache.commons.p028io.function.IOBaseStream;
import org.apache.commons.p028io.function.IOIterator;
import org.apache.commons.p028io.function.IORunnable;
import org.apache.commons.p028io.function.IOSpliterator;

/* renamed from: t90 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC22226t90 {
    /* renamed from: a */
    public static BaseStream m22499a(IOBaseStream iOBaseStream) {
        return new YX1(iOBaseStream);
    }

    /* renamed from: b */
    public static void m22498b(IOBaseStream iOBaseStream) {
        iOBaseStream.unwrap().close();
    }

    /* renamed from: c */
    public static boolean m22497c(IOBaseStream iOBaseStream) {
        boolean isParallel;
        isParallel = iOBaseStream.unwrap().isParallel();
        return isParallel;
    }

    /* renamed from: d */
    public static IOIterator m22496d(IOBaseStream iOBaseStream) {
        Iterator it;
        it = iOBaseStream.unwrap().iterator();
        return C20745ka0.m28913a(it);
    }

    /* renamed from: e */
    public static IOBaseStream m22495e(IOBaseStream iOBaseStream, final IORunnable iORunnable) {
        BaseStream onClose;
        onClose = iOBaseStream.unwrap().onClose(new Runnable() { // from class: s90
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC22226t90.m22490j(iORunnable);
            }
        });
        return iOBaseStream.wrap(onClose);
    }

    /* renamed from: f */
    public static IOBaseStream m22494f(IOBaseStream iOBaseStream) {
        BaseStream parallel;
        if (!iOBaseStream.isParallel()) {
            parallel = iOBaseStream.unwrap().parallel();
            return iOBaseStream.wrap(parallel);
        }
        return iOBaseStream;
    }

    /* renamed from: g */
    public static IOBaseStream m22493g(IOBaseStream iOBaseStream) {
        BaseStream sequential;
        if (iOBaseStream.isParallel()) {
            sequential = iOBaseStream.unwrap().sequential();
            return iOBaseStream.wrap(sequential);
        }
        return iOBaseStream;
    }

    /* renamed from: h */
    public static IOSpliterator m22492h(IOBaseStream iOBaseStream) {
        Spliterator spliterator;
        spliterator = iOBaseStream.unwrap().spliterator();
        return C17645Ga0.m68227a(spliterator);
    }

    /* renamed from: i */
    public static IOBaseStream m22491i(IOBaseStream iOBaseStream) {
        BaseStream unordered;
        unordered = iOBaseStream.unwrap().unordered();
        return iOBaseStream.wrap(unordered);
    }

    /* renamed from: j */
    public static /* synthetic */ void m22490j(IORunnable iORunnable) {
        Erase.m25230g(iORunnable);
    }
}
