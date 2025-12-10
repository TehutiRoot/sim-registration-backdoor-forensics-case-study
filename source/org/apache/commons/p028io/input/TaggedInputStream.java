package org.apache.commons.p028io.input;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.UUID;
import org.apache.commons.p028io.TaggedIOException;

/* renamed from: org.apache.commons.io.input.TaggedInputStream */
/* loaded from: classes6.dex */
public class TaggedInputStream extends ProxyInputStream {

    /* renamed from: d */
    public final Serializable f73452d;

    public TaggedInputStream(InputStream inputStream) {
        super(inputStream);
        this.f73452d = UUID.randomUUID();
    }

    @Override // org.apache.commons.p028io.input.ProxyInputStream
    public void handleIOException(IOException iOException) throws IOException {
        throw new TaggedIOException(iOException, this.f73452d);
    }

    public boolean isCauseOf(Throwable th2) {
        return TaggedIOException.isTaggedWith(th2, this.f73452d);
    }

    public void throwIfCauseOf(Throwable th2) throws IOException {
        TaggedIOException.throwCauseIfTaggedWith(th2, this.f73452d);
    }
}
