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

/* renamed from: Fb0 */
/* loaded from: classes6.dex */
public abstract class AbstractC17584Fb0 {

    /* renamed from: a */
    public static final Object f1644a = new Object();

    /* renamed from: a */
    public static /* synthetic */ IOException m68392a(Integer num, IOException iOException) {
        return m68387f(num, iOException);
    }

    /* renamed from: b */
    public static /* synthetic */ void m68391b(IOConsumer iOConsumer, Object obj) {
        Erase.m25235b(iOConsumer, obj);
    }

    /* renamed from: c */
    public static void m68390c(Stream stream, IOConsumer iOConsumer) {
        m68389d(stream, iOConsumer, new BiFunction() { // from class: Eb0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return AbstractC17584Fb0.m68392a((Integer) obj, (IOException) obj2);
            }
        });
    }

    /* renamed from: d */
    public static void m68389d(Stream stream, IOConsumer iOConsumer, BiFunction biFunction) {
        AbstractC12520a.m25218I(stream).forAll(iOConsumer, new N90());
    }

    /* renamed from: e */
    public static void m68388e(Stream stream, IOConsumer iOConsumer) {
        final IOConsumer m68382k = m68382k(iOConsumer);
        m68384i(stream).forEach(new Consumer() { // from class: Db0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                AbstractC17584Fb0.m68391b(m68382k, obj);
            }
        });
    }

    /* renamed from: h */
    public static Stream m68385h(Iterable iterable) {
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
    public static Stream m68384i(Stream stream) {
        Stream empty;
        if (stream == null) {
            empty = Stream.empty();
            return empty;
        }
        return stream;
    }

    /* renamed from: j */
    public static Stream m68383j(Object... objArr) {
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
    public static IOConsumer m68382k(IOConsumer iOConsumer) {
        if (iOConsumer == null) {
            return Q90.m66643l();
        }
        return iOConsumer;
    }

    /* renamed from: f */
    public static /* synthetic */ IOException m68387f(Integer num, IOException iOException) {
        return iOException;
    }
}
