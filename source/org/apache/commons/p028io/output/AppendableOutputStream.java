package org.apache.commons.p028io.output;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.Appendable;

/* renamed from: org.apache.commons.io.output.AppendableOutputStream */
/* loaded from: classes6.dex */
public class AppendableOutputStream<T extends Appendable> extends OutputStream {

    /* renamed from: a */
    public final Appendable f73543a;

    public AppendableOutputStream(T t) {
        this.f73543a = t;
    }

    public T getAppendable() {
        return (T) this.f73543a;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        this.f73543a.append((char) i);
    }
}
