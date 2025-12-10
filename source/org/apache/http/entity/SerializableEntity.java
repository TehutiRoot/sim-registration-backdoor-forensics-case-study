package org.apache.http.entity;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import org.apache.http.util.Args;

/* loaded from: classes6.dex */
public class SerializableEntity extends AbstractHttpEntity {

    /* renamed from: a */
    public byte[] f73877a;

    /* renamed from: b */
    public Serializable f73878b;

    public SerializableEntity(Serializable serializable, boolean z) throws IOException {
        Args.notNull(serializable, "Source object");
        if (z) {
            m24770a(serializable);
        } else {
            this.f73878b = serializable;
        }
    }

    /* renamed from: a */
    public final void m24770a(Serializable serializable) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(serializable);
        objectOutputStream.flush();
        this.f73877a = byteArrayOutputStream.toByteArray();
    }

    @Override // org.apache.http.HttpEntity
    public InputStream getContent() throws IOException, IllegalStateException {
        if (this.f73877a == null) {
            m24770a(this.f73878b);
        }
        return new ByteArrayInputStream(this.f73877a);
    }

    @Override // org.apache.http.HttpEntity
    public long getContentLength() {
        byte[] bArr = this.f73877a;
        if (bArr == null) {
            return -1L;
        }
        return bArr.length;
    }

    @Override // org.apache.http.HttpEntity
    public boolean isRepeatable() {
        return true;
    }

    @Override // org.apache.http.HttpEntity
    public boolean isStreaming() {
        if (this.f73877a == null) {
            return true;
        }
        return false;
    }

    @Override // org.apache.http.HttpEntity
    public void writeTo(OutputStream outputStream) throws IOException {
        Args.notNull(outputStream, "Output stream");
        byte[] bArr = this.f73877a;
        if (bArr == null) {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(this.f73878b);
            objectOutputStream.flush();
            return;
        }
        outputStream.write(bArr);
        outputStream.flush();
    }

    public SerializableEntity(Serializable serializable) {
        Args.notNull(serializable, "Source object");
        this.f73878b = serializable;
    }
}
