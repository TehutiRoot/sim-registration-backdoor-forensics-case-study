package org.apache.http.entity;

import android.support.p001v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.util.Args;

/* loaded from: classes6.dex */
public class InputStreamEntity extends AbstractHttpEntity {

    /* renamed from: a */
    public final InputStream f73875a;

    /* renamed from: b */
    public final long f73876b;

    public InputStreamEntity(InputStream inputStream) {
        this(inputStream, -1L);
    }

    @Override // org.apache.http.HttpEntity
    public InputStream getContent() throws IOException {
        return this.f73875a;
    }

    @Override // org.apache.http.HttpEntity
    public long getContentLength() {
        return this.f73876b;
    }

    @Override // org.apache.http.HttpEntity
    public boolean isRepeatable() {
        return false;
    }

    @Override // org.apache.http.HttpEntity
    public boolean isStreaming() {
        return true;
    }

    @Override // org.apache.http.HttpEntity
    public void writeTo(OutputStream outputStream) throws IOException {
        int read;
        Args.notNull(outputStream, "Output stream");
        InputStream inputStream = this.f73875a;
        try {
            byte[] bArr = new byte[4096];
            long j = this.f73876b;
            if (j < 0) {
                while (true) {
                    int read2 = inputStream.read(bArr);
                    if (read2 == -1) {
                        break;
                    }
                    outputStream.write(bArr, 0, read2);
                }
            } else {
                while (j > 0 && (read = inputStream.read(bArr, 0, (int) Math.min((long) PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM, j))) != -1) {
                    outputStream.write(bArr, 0, read);
                    j -= read;
                }
            }
        } finally {
            inputStream.close();
        }
    }

    public InputStreamEntity(InputStream inputStream, long j) {
        this(inputStream, j, null);
    }

    public InputStreamEntity(InputStream inputStream, ContentType contentType) {
        this(inputStream, -1L, contentType);
    }

    public InputStreamEntity(InputStream inputStream, long j, ContentType contentType) {
        this.f73875a = (InputStream) Args.notNull(inputStream, "Source input stream");
        this.f73876b = j;
        if (contentType != null) {
            setContentType(contentType.toString());
        }
    }
}
