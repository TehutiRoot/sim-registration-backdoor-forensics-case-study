package org.apache.http.entity;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.impl.p029io.EmptyInputStream;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

/* loaded from: classes6.dex */
public class BasicHttpEntity extends AbstractHttpEntity {

    /* renamed from: a */
    public InputStream f73868a;

    /* renamed from: b */
    public long f73869b = -1;

    @Override // org.apache.http.HttpEntity
    public InputStream getContent() throws IllegalStateException {
        boolean z;
        if (this.f73868a != null) {
            z = true;
        } else {
            z = false;
        }
        Asserts.check(z, "Content has not been provided");
        return this.f73868a;
    }

    @Override // org.apache.http.HttpEntity
    public long getContentLength() {
        return this.f73869b;
    }

    @Override // org.apache.http.HttpEntity
    public boolean isRepeatable() {
        return false;
    }

    @Override // org.apache.http.HttpEntity
    public boolean isStreaming() {
        InputStream inputStream = this.f73868a;
        if (inputStream != null && inputStream != EmptyInputStream.INSTANCE) {
            return true;
        }
        return false;
    }

    public void setContent(InputStream inputStream) {
        this.f73868a = inputStream;
    }

    public void setContentLength(long j) {
        this.f73869b = j;
    }

    @Override // org.apache.http.HttpEntity
    public void writeTo(OutputStream outputStream) throws IOException {
        Args.notNull(outputStream, "Output stream");
        InputStream content = getContent();
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = content.read(bArr);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                } else {
                    return;
                }
            }
        } finally {
            content.close();
        }
    }
}
