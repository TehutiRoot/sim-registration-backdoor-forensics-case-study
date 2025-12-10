package p000;

import java.util.Objects;
import java.util.function.BiConsumer;
import org.apache.commons.p028io.function.IOBiConsumer;
import org.apache.commons.p028io.function.Uncheck;

/* renamed from: E90 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class E90 {
    /* renamed from: a */
    public static IOBiConsumer m68688a(final IOBiConsumer iOBiConsumer, final IOBiConsumer iOBiConsumer2) {
        Objects.requireNonNull(iOBiConsumer2);
        return new IOBiConsumer() { // from class: C90
            @Override // org.apache.commons.p028io.function.IOBiConsumer
            public final void accept(Object obj, Object obj2) {
                E90.m68686c(IOBiConsumer.this, iOBiConsumer2, obj, obj2);
            }

            @Override // org.apache.commons.p028io.function.IOBiConsumer
            public /* synthetic */ IOBiConsumer andThen(IOBiConsumer iOBiConsumer3) {
                return E90.m68688a(this, iOBiConsumer3);
            }

            @Override // org.apache.commons.p028io.function.IOBiConsumer
            public /* synthetic */ BiConsumer asBiConsumer() {
                return E90.m68687b(this);
            }
        };
    }

    /* renamed from: b */
    public static BiConsumer m68687b(final IOBiConsumer iOBiConsumer) {
        return new BiConsumer() { // from class: D90
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                E90.m68685d(IOBiConsumer.this, obj, obj2);
            }
        };
    }

    /* renamed from: c */
    public static /* synthetic */ void m68686c(IOBiConsumer iOBiConsumer, IOBiConsumer iOBiConsumer2, Object obj, Object obj2) {
        iOBiConsumer.accept(obj, obj2);
        iOBiConsumer2.accept(obj, obj2);
    }

    /* renamed from: d */
    public static /* synthetic */ void m68685d(IOBiConsumer iOBiConsumer, Object obj, Object obj2) {
        Uncheck.accept(iOBiConsumer, obj, obj2);
    }

    /* renamed from: e */
    public static IOBiConsumer m68684e() {
        return AbstractC12237lx.f71858a;
    }
}