package org.apache.http.client.entity;

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes6.dex */
public class GZIPInputStreamFactory implements InputStreamFactory {

    /* renamed from: a */
    public static final GZIPInputStreamFactory f73693a = new GZIPInputStreamFactory();

    public static GZIPInputStreamFactory getInstance() {
        return f73693a;
    }

    @Override // org.apache.http.client.entity.InputStreamFactory
    public InputStream create(InputStream inputStream) throws IOException {
        return new GZIPInputStream(inputStream);
    }
}
