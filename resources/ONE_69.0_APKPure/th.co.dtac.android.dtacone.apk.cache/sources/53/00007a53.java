package ch.qos.logback.core.net;

import java.io.IOException;
import java.io.ObjectOutputStream;

/* loaded from: classes.dex */
public class AutoFlushingObjectWriter implements ObjectWriter {

    /* renamed from: a */
    public final ObjectOutputStream f39853a;

    /* renamed from: b */
    public final int f39854b;

    /* renamed from: c */
    public int f39855c = 0;

    public AutoFlushingObjectWriter(ObjectOutputStream objectOutputStream, int i) {
        this.f39853a = objectOutputStream;
        this.f39854b = i;
    }

    /* renamed from: a */
    public final void m51455a() {
        int i = this.f39855c + 1;
        this.f39855c = i;
        if (i >= this.f39854b) {
            this.f39853a.reset();
            this.f39855c = 0;
        }
    }

    @Override // ch.qos.logback.core.net.ObjectWriter
    public void write(Object obj) throws IOException {
        this.f39853a.writeObject(obj);
        this.f39853a.flush();
        m51455a();
    }
}