package p000;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import org.apache.commons.p028io.function.IOIntConsumer;
import org.apache.commons.p028io.function.Uncheck;

/* renamed from: ma0 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC21148ma0 {
    /* renamed from: a */
    public static IOIntConsumer m26625a(final IOIntConsumer iOIntConsumer, final IOIntConsumer iOIntConsumer2) {
        Objects.requireNonNull(iOIntConsumer2);
        return new IOIntConsumer() { // from class: ja0
            @Override // org.apache.commons.p028io.function.IOIntConsumer
            public final void accept(int i) {
                AbstractC21148ma0.m26622d(IOIntConsumer.this, iOIntConsumer2, i);
            }

            @Override // org.apache.commons.p028io.function.IOIntConsumer
            public /* synthetic */ IOIntConsumer andThen(IOIntConsumer iOIntConsumer3) {
                return AbstractC21148ma0.m26625a(this, iOIntConsumer3);
            }

            @Override // org.apache.commons.p028io.function.IOIntConsumer
            public /* synthetic */ Consumer asConsumer() {
                return AbstractC21148ma0.m26624b(this);
            }

            @Override // org.apache.commons.p028io.function.IOIntConsumer
            public /* synthetic */ IntConsumer asIntConsumer() {
                return AbstractC21148ma0.m26623c(this);
            }
        };
    }

    /* renamed from: b */
    public static Consumer m26624b(final IOIntConsumer iOIntConsumer) {
        return new Consumer() { // from class: ia0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                AbstractC21148ma0.m26621e(IOIntConsumer.this, (Integer) obj);
            }
        };
    }

    /* renamed from: c */
    public static IntConsumer m26623c(final IOIntConsumer iOIntConsumer) {
        return new IntConsumer() { // from class: la0
            @Override // java.util.function.IntConsumer
            public final void accept(int i) {
                AbstractC21148ma0.m26620f(IOIntConsumer.this, i);
            }
        };
    }

    /* renamed from: d */
    public static /* synthetic */ void m26622d(IOIntConsumer iOIntConsumer, IOIntConsumer iOIntConsumer2, int i) {
        iOIntConsumer.accept(i);
        iOIntConsumer2.accept(i);
    }

    /* renamed from: e */
    public static /* synthetic */ void m26621e(IOIntConsumer iOIntConsumer, Integer num) {
        Uncheck.accept(iOIntConsumer, num.intValue());
    }

    /* renamed from: f */
    public static /* synthetic */ void m26620f(IOIntConsumer iOIntConsumer, int i) {
        Uncheck.accept(iOIntConsumer, i);
    }

    /* renamed from: g */
    public static /* synthetic */ void m26619g(int i) {
    }
}