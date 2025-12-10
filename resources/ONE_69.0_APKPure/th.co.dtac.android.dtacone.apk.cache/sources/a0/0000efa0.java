package org.apache.commons.p028io.function;

import java.io.IOException;
import java.util.function.Consumer;
import org.apache.commons.p028io.function.IOConsumer;

@FunctionalInterface
/* renamed from: org.apache.commons.io.function.IOConsumer */
/* loaded from: classes6.dex */
public interface IOConsumer<T> {
    public static final IOConsumer<?> NOOP_IO_CONSUMER = new IOConsumer() { // from class: V90
        @Override // org.apache.commons.p028io.function.IOConsumer
        public final void accept(Object obj) {
            W90.m65798k(obj);
        }

        @Override // org.apache.commons.p028io.function.IOConsumer
        public /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
            return W90.m65808a(this, iOConsumer);
        }

        @Override // org.apache.commons.p028io.function.IOConsumer
        public /* synthetic */ Consumer asConsumer() {
            return W90.m65807b(this);
        }
    };

    void accept(T t) throws IOException;

    IOConsumer<T> andThen(IOConsumer<? super T> iOConsumer);

    Consumer<T> asConsumer();
}