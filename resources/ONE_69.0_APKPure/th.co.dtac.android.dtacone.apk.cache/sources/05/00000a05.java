package p000;

import java.util.Comparator;
import java.util.Objects;
import java.util.Spliterator;
import org.apache.commons.p028io.function.IOComparator;
import org.apache.commons.p028io.function.IOConsumer;
import org.apache.commons.p028io.function.IOSpliterator;

/* renamed from: Ka0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC17934Ka0 {
    /* renamed from: a */
    public static Spliterator m67703a(IOSpliterator iOSpliterator) {
        return new C19936fZ1(iOSpliterator);
    }

    /* renamed from: b */
    public static int m67702b(IOSpliterator iOSpliterator) {
        int characteristics;
        characteristics = iOSpliterator.unwrap().characteristics();
        return characteristics;
    }

    /* renamed from: c */
    public static long m67701c(IOSpliterator iOSpliterator) {
        long estimateSize;
        estimateSize = iOSpliterator.unwrap().estimateSize();
        return estimateSize;
    }

    /* renamed from: d */
    public static void m67700d(IOSpliterator iOSpliterator, IOConsumer iOConsumer) {
        do {
        } while (iOSpliterator.tryAdvance(iOConsumer));
    }

    /* renamed from: e */
    public static IOComparator m67699e(IOSpliterator iOSpliterator) {
        Comparator comparator;
        comparator = iOSpliterator.unwrap().getComparator();
        return (IOComparator) comparator;
    }

    /* renamed from: f */
    public static long m67698f(IOSpliterator iOSpliterator) {
        long exactSizeIfKnown;
        exactSizeIfKnown = iOSpliterator.unwrap().getExactSizeIfKnown();
        return exactSizeIfKnown;
    }

    /* renamed from: g */
    public static boolean m67697g(IOSpliterator iOSpliterator, int i) {
        boolean hasCharacteristics;
        hasCharacteristics = iOSpliterator.unwrap().hasCharacteristics(i);
        return hasCharacteristics;
    }

    /* renamed from: h */
    public static boolean m67696h(IOSpliterator iOSpliterator, IOConsumer iOConsumer) {
        boolean tryAdvance;
        Spliterator unwrap = iOSpliterator.unwrap();
        Objects.requireNonNull(iOConsumer, "action");
        tryAdvance = unwrap.tryAdvance(iOConsumer.asConsumer());
        return tryAdvance;
    }

    /* renamed from: i */
    public static IOSpliterator m67695i(IOSpliterator iOSpliterator) {
        Spliterator trySplit;
        trySplit = iOSpliterator.unwrap().trySplit();
        return m67694j(trySplit);
    }

    /* renamed from: j */
    public static IOSpliterator m67694j(Spliterator spliterator) {
        return C18064Ma0.m67361a(spliterator);
    }
}