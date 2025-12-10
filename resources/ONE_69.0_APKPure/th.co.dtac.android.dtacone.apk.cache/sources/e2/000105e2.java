package p000;

import java.util.Iterator;
import java.util.Objects;
import org.apache.commons.p028io.function.IOConsumer;
import org.apache.commons.p028io.function.IOIterator;

/* renamed from: pa0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC21667pa0 {
    /* renamed from: a */
    public static Iterator m23838a(IOIterator iOIterator) {
        return new ZY1(iOIterator);
    }

    /* renamed from: b */
    public static void m23837b(IOIterator iOIterator, IOConsumer iOConsumer) {
        Objects.requireNonNull(iOConsumer);
        while (iOIterator.hasNext()) {
            iOConsumer.accept(iOIterator.next());
        }
    }

    /* renamed from: c */
    public static void m23836c(IOIterator iOIterator) {
        iOIterator.unwrap().remove();
    }

    /* renamed from: d */
    public static IOIterator m23835d(Iterable iterable) {
        return C21840qa0.m23623a(iterable.iterator());
    }

    /* renamed from: e */
    public static IOIterator m23834e(Iterator it) {
        return C21840qa0.m23623a(it);
    }
}