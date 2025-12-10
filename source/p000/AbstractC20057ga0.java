package p000;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import org.apache.commons.p028io.function.IOIntConsumer;
import org.apache.commons.p028io.function.Uncheck;

/* renamed from: ga0 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC20057ga0 {
    /* renamed from: a */
    public static IOIntConsumer m31095a(final IOIntConsumer iOIntConsumer, final IOIntConsumer iOIntConsumer2) {
        Objects.requireNonNull(iOIntConsumer2);
        return new IOIntConsumer() { // from class: da0
            @Override // org.apache.commons.p028io.function.IOIntConsumer
            public final void accept(int i) {
                AbstractC20057ga0.m31092d(iOIntConsumer, iOIntConsumer2, i);
            }

            @Override // org.apache.commons.p028io.function.IOIntConsumer
            public /* synthetic */ IOIntConsumer andThen(IOIntConsumer iOIntConsumer3) {
                return AbstractC20057ga0.m31095a(this, iOIntConsumer3);
            }

            @Override // org.apache.commons.p028io.function.IOIntConsumer
            public /* synthetic */ Consumer asConsumer() {
                return AbstractC20057ga0.m31094b(this);
            }

            @Override // org.apache.commons.p028io.function.IOIntConsumer
            public /* synthetic */ IntConsumer asIntConsumer() {
                return AbstractC20057ga0.m31093c(this);
            }
        };
    }

    /* renamed from: b */
    public static Consumer m31094b(final IOIntConsumer iOIntConsumer) {
        return new Consumer() { // from class: ca0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                AbstractC20057ga0.m31091e(iOIntConsumer, (Integer) obj);
            }
        };
    }

    /* renamed from: c */
    public static IntConsumer m31093c(final IOIntConsumer iOIntConsumer) {
        return new IntConsumer() { // from class: fa0
            @Override // java.util.function.IntConsumer
            public final void accept(int i) {
                AbstractC20057ga0.m31090f(iOIntConsumer, i);
            }
        };
    }

    /* renamed from: d */
    public static /* synthetic */ void m31092d(IOIntConsumer iOIntConsumer, IOIntConsumer iOIntConsumer2, int i) {
        iOIntConsumer.accept(i);
        iOIntConsumer2.accept(i);
    }

    /* renamed from: e */
    public static /* synthetic */ void m31091e(IOIntConsumer iOIntConsumer, Integer num) {
        Uncheck.accept(iOIntConsumer, num.intValue());
    }

    /* renamed from: f */
    public static /* synthetic */ void m31090f(IOIntConsumer iOIntConsumer, int i) {
        Uncheck.accept(iOIntConsumer, i);
    }

    /* renamed from: g */
    public static /* synthetic */ void m31089g(int i) {
    }
}
