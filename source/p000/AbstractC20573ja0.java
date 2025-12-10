package p000;

import java.util.Iterator;
import java.util.Objects;
import org.apache.commons.p028io.function.IOConsumer;
import org.apache.commons.p028io.function.IOIterator;

/* renamed from: ja0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC20573ja0 {
    /* renamed from: a */
    public static Iterator m29195a(IOIterator iOIterator) {
        return new C19366cY1(iOIterator);
    }

    /* renamed from: b */
    public static void m29194b(IOIterator iOIterator, IOConsumer iOConsumer) {
        Objects.requireNonNull(iOConsumer);
        while (iOIterator.hasNext()) {
            iOConsumer.accept(iOIterator.next());
        }
    }

    /* renamed from: c */
    public static void m29193c(IOIterator iOIterator) {
        iOIterator.unwrap().remove();
    }

    /* renamed from: d */
    public static IOIterator m29192d(Iterable iterable) {
        return C20745ka0.m28913a(iterable.iterator());
    }

    /* renamed from: e */
    public static IOIterator m29191e(Iterator it) {
        return C20745ka0.m28913a(it);
    }
}
