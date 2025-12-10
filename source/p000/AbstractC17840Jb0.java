package p000;

import java.util.Objects;
import org.apache.commons.p028io.function.IOTriConsumer;

/* renamed from: Jb0 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC17840Jb0 {
    /* renamed from: a */
    public static IOTriConsumer m67741a(final IOTriConsumer iOTriConsumer, final IOTriConsumer iOTriConsumer2) {
        Objects.requireNonNull(iOTriConsumer2);
        return new IOTriConsumer() { // from class: Ib0
            @Override // org.apache.commons.p028io.function.IOTriConsumer
            public final void accept(Object obj, Object obj2, Object obj3) {
                AbstractC17840Jb0.m67740b(IOTriConsumer.this, iOTriConsumer2, obj, obj2, obj3);
            }

            @Override // org.apache.commons.p028io.function.IOTriConsumer
            public /* synthetic */ IOTriConsumer andThen(IOTriConsumer iOTriConsumer3) {
                return AbstractC17840Jb0.m67741a(this, iOTriConsumer3);
            }
        };
    }

    /* renamed from: b */
    public static /* synthetic */ void m67740b(IOTriConsumer iOTriConsumer, IOTriConsumer iOTriConsumer2, Object obj, Object obj2, Object obj3) {
        iOTriConsumer.accept(obj, obj2, obj3);
        iOTriConsumer2.accept(obj, obj2, obj3);
    }

    /* renamed from: c */
    public static IOTriConsumer m67739c() {
        return AbstractC12253lx.f71784g;
    }
}
