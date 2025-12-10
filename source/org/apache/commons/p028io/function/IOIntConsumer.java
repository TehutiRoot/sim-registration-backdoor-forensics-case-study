package org.apache.commons.p028io.function;

import java.io.IOException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import org.apache.commons.p028io.function.IOIntConsumer;

@FunctionalInterface
/* renamed from: org.apache.commons.io.function.IOIntConsumer */
/* loaded from: classes6.dex */
public interface IOIntConsumer {
    public static final IOIntConsumer NOOP = new IOIntConsumer() { // from class: ea0
        @Override // org.apache.commons.p028io.function.IOIntConsumer
        public final void accept(int i) {
            AbstractC20057ga0.m31089g(i);
        }

        @Override // org.apache.commons.p028io.function.IOIntConsumer
        public /* synthetic */ IOIntConsumer andThen(IOIntConsumer iOIntConsumer) {
            return AbstractC20057ga0.m31095a(this, iOIntConsumer);
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

    void accept(int i) throws IOException;

    IOIntConsumer andThen(IOIntConsumer iOIntConsumer);

    Consumer<Integer> asConsumer();

    IntConsumer asIntConsumer();
}
