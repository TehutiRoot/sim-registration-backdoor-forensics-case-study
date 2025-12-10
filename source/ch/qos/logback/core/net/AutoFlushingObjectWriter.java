package ch.qos.logback.core.net;

import java.io.IOException;
import java.io.ObjectOutputStream;

/* loaded from: classes.dex */
public class AutoFlushingObjectWriter implements ObjectWriter {

    /* renamed from: a */
    public final ObjectOutputStream f39855a;

    /* renamed from: b */
    public final int f39856b;

    /* renamed from: c */
    public int f39857c = 0;

    public AutoFlushingObjectWriter(ObjectOutputStream objectOutputStream, int i) {
        this.f39855a = objectOutputStream;
        this.f39856b = i;
    }

    /* renamed from: a */
    public final void m51460a() {
        int i = this.f39857c + 1;
        this.f39857c = i;
        if (i >= this.f39856b) {
            this.f39855a.reset();
            this.f39857c = 0;
        }
    }

    @Override // ch.qos.logback.core.net.ObjectWriter
    public void write(Object obj) throws IOException {
        this.f39855a.writeObject(obj);
        this.f39855a.flush();
        m51460a();
    }
}
