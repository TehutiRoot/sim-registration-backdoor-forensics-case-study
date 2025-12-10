package org.apache.http.client.entity;

import java.io.IOException;
import java.io.InputStream;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes6.dex */
public class DeflateInputStreamFactory implements InputStreamFactory {

    /* renamed from: a */
    public static final DeflateInputStreamFactory f73682a = new DeflateInputStreamFactory();

    public static DeflateInputStreamFactory getInstance() {
        return f73682a;
    }

    @Override // org.apache.http.client.entity.InputStreamFactory
    public InputStream create(InputStream inputStream) throws IOException {
        return new DeflateInputStream(inputStream);
    }
}
