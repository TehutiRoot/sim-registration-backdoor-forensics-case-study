package p000;

import java.util.Objects;
import java.util.function.BiConsumer;
import org.apache.commons.p028io.function.IOBiConsumer;
import org.apache.commons.p028io.function.Uncheck;

/* renamed from: y90 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC23086y90 {
    /* renamed from: a */
    public static IOBiConsumer m331a(final IOBiConsumer iOBiConsumer, final IOBiConsumer iOBiConsumer2) {
        Objects.requireNonNull(iOBiConsumer2);
        return new IOBiConsumer() { // from class: w90
            @Override // org.apache.commons.p028io.function.IOBiConsumer
            public final void accept(Object obj, Object obj2) {
                AbstractC23086y90.m329c(iOBiConsumer, iOBiConsumer2, obj, obj2);
            }

            @Override // org.apache.commons.p028io.function.IOBiConsumer
            public /* synthetic */ IOBiConsumer andThen(IOBiConsumer iOBiConsumer3) {
                return AbstractC23086y90.m331a(this, iOBiConsumer3);
            }

            @Override // org.apache.commons.p028io.function.IOBiConsumer
            public /* synthetic */ BiConsumer asBiConsumer() {
                return AbstractC23086y90.m330b(this);
            }
        };
    }

    /* renamed from: b */
    public static BiConsumer m330b(final IOBiConsumer iOBiConsumer) {
        return new BiConsumer() { // from class: x90
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                AbstractC23086y90.m328d(iOBiConsumer, obj, obj2);
            }
        };
    }

    /* renamed from: c */
    public static /* synthetic */ void m329c(IOBiConsumer iOBiConsumer, IOBiConsumer iOBiConsumer2, Object obj, Object obj2) {
        iOBiConsumer.accept(obj, obj2);
        iOBiConsumer2.accept(obj, obj2);
    }

    /* renamed from: d */
    public static /* synthetic */ void m328d(IOBiConsumer iOBiConsumer, Object obj, Object obj2) {
        Uncheck.accept(iOBiConsumer, obj, obj2);
    }

    /* renamed from: e */
    public static IOBiConsumer m327e() {
        return AbstractC12253lx.f71778a;
    }
}
