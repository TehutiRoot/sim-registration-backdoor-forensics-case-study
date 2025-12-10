package org.apache.commons.p028io.input;

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.util.UUID;
import org.apache.commons.p028io.TaggedIOException;

/* renamed from: org.apache.commons.io.input.TaggedReader */
/* loaded from: classes6.dex */
public class TaggedReader extends ProxyReader {

    /* renamed from: a */
    public final Serializable f73453a;

    public TaggedReader(Reader reader) {
        super(reader);
        this.f73453a = UUID.randomUUID();
    }

    @Override // org.apache.commons.p028io.input.ProxyReader
    public void handleIOException(IOException iOException) throws IOException {
        throw new TaggedIOException(iOException, this.f73453a);
    }

    public boolean isCauseOf(Throwable th2) {
        return TaggedIOException.isTaggedWith(th2, this.f73453a);
    }

    public void throwIfCauseOf(Throwable th2) throws IOException {
        TaggedIOException.throwCauseIfTaggedWith(th2, this.f73453a);
    }
}
