package p000;

import java.util.Comparator;
import org.apache.commons.p028io.function.IOComparator;
import org.apache.commons.p028io.function.Uncheck;

/* renamed from: R90 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class R90 {
    /* renamed from: a */
    public static Comparator m66689a(final IOComparator iOComparator) {
        return new Comparator() { // from class: Q90
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return R90.m66688b(IOComparator.this, obj, obj2);
            }
        };
    }

    /* renamed from: b */
    public static /* synthetic */ int m66688b(IOComparator iOComparator, Object obj, Object obj2) {
        return Uncheck.compare(iOComparator, obj, obj2);
    }
}