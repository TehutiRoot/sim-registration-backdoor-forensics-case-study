package org.apache.commons.p028io;

import java.nio.charset.Charset;
import java.util.Objects;

/* renamed from: org.apache.commons.io.StandardLineSeparator */
/* loaded from: classes6.dex */
public enum StandardLineSeparator {
    CR("\r"),
    CRLF("\r\n"),
    LF("\n");
    
    private final String lineSeparator;

    StandardLineSeparator(String str) {
        Objects.requireNonNull(str, "lineSeparator");
        this.lineSeparator = str;
    }

    public byte[] getBytes(Charset charset) {
        return this.lineSeparator.getBytes(charset);
    }

    public String getString() {
        return this.lineSeparator;
    }
}