package p000;

import java.io.IOException;
import java.util.Spliterator;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import org.apache.commons.p028io.function.AbstractC12520a;
import org.apache.commons.p028io.function.Erase;
import org.apache.commons.p028io.function.IOConsumer;

/* renamed from: Lb0 */
/* loaded from: classes6.dex */
public abstract class AbstractC18002Lb0 {

    /* renamed from: a */
    public static final Object f3640a = new Object();

    /* renamed from: a */
    public static /* synthetic */ IOException m67545a(Integer num, IOException iOException) {
        return m67540f(num, iOException);
    }

    /* renamed from: b */
    public static /* synthetic */ void m67544b(IOConsumer iOConsumer, Object obj) {
        Erase.m25425b(iOConsumer, obj);
    }

    /* renamed from: c */
    public static void m67543c(Stream stream, IOConsumer iOConsumer) {
        m67542d(stream, iOConsumer, new BiFunction() { // from class: Kb0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return AbstractC18002Lb0.m67545a((Integer) obj, (IOException) obj2);
            }
        });
    }

    /* renamed from: d */
    public static void m67542d(Stream stream, IOConsumer iOConsumer, BiFunction biFunction) {
        AbstractC12520a.m25408I(stream).forAll(iOConsumer, new T90());
    }

    /* renamed from: e */
    public static void m67541e(Stream stream, IOConsumer iOConsumer) {
        final IOConsumer m67535k = m67535k(iOConsumer);
        m67537i(stream).forEach(new Consumer() { // from class: Jb0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                AbstractC18002Lb0.m67544b(IOConsumer.this, obj);
            }
        });
    }

    /* renamed from: h */
    public static Stream m67538h(Iterable iterable) {
        Spliterator spliterator;
        Stream stream;
        Stream empty;
        if (iterable == null) {
            empty = Stream.empty();
            return empty;
        }
        spliterator = iterable.spliterator();
        stream = StreamSupport.stream(spliterator, false);
        return stream;
    }

    /* renamed from: i */
    public static Stream m67537i(Stream stream) {
        Stream empty;
        if (stream == null) {
            empty = Stream.empty();
            return empty;
        }
        return stream;
    }

    /* renamed from: j */
    public static Stream m67536j(Object... objArr) {
        Stream of;
        Stream empty;
        if (objArr == null) {
            empty = Stream.empty();
            return empty;
        }
        of = Stream.of(objArr);
        return of;
    }

    /* renamed from: k */
    public static IOConsumer m67535k(IOConsumer iOConsumer) {
        if (iOConsumer == null) {
            return W90.m65797l();
        }
        return iOConsumer;
    }

    /* renamed from: f */
    public static /* synthetic */ IOException m67540f(Integer num, IOException iOException) {
        return iOException;
    }
}