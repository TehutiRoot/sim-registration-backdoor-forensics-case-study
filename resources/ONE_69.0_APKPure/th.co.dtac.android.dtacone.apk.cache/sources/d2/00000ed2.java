package p000;

import java.util.Objects;
import org.apache.commons.p028io.function.IOTriConsumer;

/* renamed from: Pb0 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC18262Pb0 {
    /* renamed from: a */
    public static IOTriConsumer m66954a(final IOTriConsumer iOTriConsumer, final IOTriConsumer iOTriConsumer2) {
        Objects.requireNonNull(iOTriConsumer2);
        return new IOTriConsumer() { // from class: Ob0
            @Override // org.apache.commons.p028io.function.IOTriConsumer
            public final void accept(Object obj, Object obj2, Object obj3) {
                AbstractC18262Pb0.m66953b(IOTriConsumer.this, iOTriConsumer2, obj, obj2, obj3);
            }

            @Override // org.apache.commons.p028io.function.IOTriConsumer
            public /* synthetic */ IOTriConsumer andThen(IOTriConsumer iOTriConsumer3) {
                return AbstractC18262Pb0.m66954a(this, iOTriConsumer3);
            }
        };
    }

    /* renamed from: b */
    public static /* synthetic */ void m66953b(IOTriConsumer iOTriConsumer, IOTriConsumer iOTriConsumer2, Object obj, Object obj2, Object obj3) {
        iOTriConsumer.accept(obj, obj2, obj3);
        iOTriConsumer2.accept(obj, obj2, obj3);
    }

    /* renamed from: c */
    public static IOTriConsumer m66952c() {
        return AbstractC12237lx.f71864g;
    }
}