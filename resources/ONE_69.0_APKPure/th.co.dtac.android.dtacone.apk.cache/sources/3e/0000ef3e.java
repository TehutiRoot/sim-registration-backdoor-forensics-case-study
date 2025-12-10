package org.apache.commons.p028io;

import java.io.IOException;
import java.io.Serializable;

/* renamed from: org.apache.commons.io.TaggedIOException */
/* loaded from: classes6.dex */
public class TaggedIOException extends IOExceptionWithCause {
    private static final long serialVersionUID = -6994123481142850163L;
    private final Serializable tag;

    public TaggedIOException(IOException iOException, Serializable serializable) {
        super(iOException.getMessage(), iOException);
        this.tag = serializable;
    }

    public static boolean isTaggedWith(Throwable th2, Object obj) {
        if (obj != null && (th2 instanceof TaggedIOException) && obj.equals(((TaggedIOException) th2).tag)) {
            return true;
        }
        return false;
    }

    public static void throwCauseIfTaggedWith(Throwable th2, Object obj) throws IOException {
        if (!isTaggedWith(th2, obj)) {
            return;
        }
        throw ((TaggedIOException) th2).getCause();
    }

    public Serializable getTag() {
        return this.tag;
    }

    @Override // java.lang.Throwable
    public synchronized IOException getCause() {
        return (IOException) super.getCause();
    }
}