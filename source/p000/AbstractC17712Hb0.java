package p000;

import java.util.function.Supplier;
import org.apache.commons.p028io.function.IOSupplier;
import org.apache.commons.p028io.function.Uncheck;

/* renamed from: Hb0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC17712Hb0 {
    /* renamed from: a */
    public static Supplier m68064a(final IOSupplier iOSupplier) {
        return new Supplier() { // from class: Gb0
            @Override // java.util.function.Supplier
            public final Object get() {
                return IOSupplier.this.getUnchecked();
            }
        };
    }

    /* renamed from: b */
    public static Object m68063b(IOSupplier iOSupplier) {
        return Uncheck.get(iOSupplier);
    }
}
