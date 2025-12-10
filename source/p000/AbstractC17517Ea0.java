package p000;

import java.util.Comparator;
import java.util.Objects;
import java.util.Spliterator;
import org.apache.commons.p028io.function.IOComparator;
import org.apache.commons.p028io.function.IOConsumer;
import org.apache.commons.p028io.function.IOSpliterator;

/* renamed from: Ea0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC17517Ea0 {
    /* renamed from: a */
    public static Spliterator m68488a(IOSpliterator iOSpliterator) {
        return new C20398iY1(iOSpliterator);
    }

    /* renamed from: b */
    public static int m68487b(IOSpliterator iOSpliterator) {
        int characteristics;
        characteristics = iOSpliterator.unwrap().characteristics();
        return characteristics;
    }

    /* renamed from: c */
    public static long m68486c(IOSpliterator iOSpliterator) {
        long estimateSize;
        estimateSize = iOSpliterator.unwrap().estimateSize();
        return estimateSize;
    }

    /* renamed from: d */
    public static void m68485d(IOSpliterator iOSpliterator, IOConsumer iOConsumer) {
        do {
        } while (iOSpliterator.tryAdvance(iOConsumer));
    }

    /* renamed from: e */
    public static IOComparator m68484e(IOSpliterator iOSpliterator) {
        Comparator comparator;
        comparator = iOSpliterator.unwrap().getComparator();
        return (IOComparator) comparator;
    }

    /* renamed from: f */
    public static long m68483f(IOSpliterator iOSpliterator) {
        long exactSizeIfKnown;
        exactSizeIfKnown = iOSpliterator.unwrap().getExactSizeIfKnown();
        return exactSizeIfKnown;
    }

    /* renamed from: g */
    public static boolean m68482g(IOSpliterator iOSpliterator, int i) {
        boolean hasCharacteristics;
        hasCharacteristics = iOSpliterator.unwrap().hasCharacteristics(i);
        return hasCharacteristics;
    }

    /* renamed from: h */
    public static boolean m68481h(IOSpliterator iOSpliterator, IOConsumer iOConsumer) {
        boolean tryAdvance;
        Spliterator unwrap = iOSpliterator.unwrap();
        Objects.requireNonNull(iOConsumer, "action");
        tryAdvance = unwrap.tryAdvance(iOConsumer.asConsumer());
        return tryAdvance;
    }

    /* renamed from: i */
    public static IOSpliterator m68480i(IOSpliterator iOSpliterator) {
        Spliterator trySplit;
        trySplit = iOSpliterator.unwrap().trySplit();
        return m68479j(trySplit);
    }

    /* renamed from: j */
    public static IOSpliterator m68479j(Spliterator spliterator) {
        return C17645Ga0.m68227a(spliterator);
    }
}
