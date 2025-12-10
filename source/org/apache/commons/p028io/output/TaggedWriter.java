package org.apache.commons.p028io.output;

import java.io.IOException;
import java.io.Serializable;
import java.io.Writer;
import java.util.UUID;
import org.apache.commons.p028io.TaggedIOException;

/* renamed from: org.apache.commons.io.output.TaggedWriter */
/* loaded from: classes6.dex */
public class TaggedWriter extends ProxyWriter {

    /* renamed from: a */
    public final Serializable f73572a;

    public TaggedWriter(Writer writer) {
        super(writer);
        this.f73572a = UUID.randomUUID();
    }

    @Override // org.apache.commons.p028io.output.ProxyWriter
    public void handleIOException(IOException iOException) throws IOException {
        throw new TaggedIOException(iOException, this.f73572a);
    }

    public boolean isCauseOf(Exception exc) {
        return TaggedIOException.isTaggedWith(exc, this.f73572a);
    }

    public void throwIfCauseOf(Exception exc) throws IOException {
        TaggedIOException.throwCauseIfTaggedWith(exc, this.f73572a);
    }
}
