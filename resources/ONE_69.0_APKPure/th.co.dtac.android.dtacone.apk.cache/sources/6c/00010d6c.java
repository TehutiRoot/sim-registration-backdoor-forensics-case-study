package p000;

import java.util.function.LongSupplier;
import org.apache.commons.p028io.function.IOLongSupplier;
import org.apache.commons.p028io.function.Uncheck;

/* renamed from: sa0 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC22186sa0 {
    /* renamed from: a */
    public static LongSupplier m22804a(final IOLongSupplier iOLongSupplier) {
        return new LongSupplier() { // from class: ra0
            @Override // java.util.function.LongSupplier
            public final long getAsLong() {
                return AbstractC22186sa0.m22803b(IOLongSupplier.this);
            }
        };
    }

    /* renamed from: b */
    public static /* synthetic */ long m22803b(IOLongSupplier iOLongSupplier) {
        return Uncheck.getAsLong(iOLongSupplier);
    }
}