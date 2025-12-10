package com.zxy.tiny.common;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes5.dex */
public class FileResult extends Result {
    public String outfile;

    public String toString() {
        return "FileResult{outfile='" + this.outfile + CoreConstants.SINGLE_QUOTE_CHAR + ", success=" + this.success + ", throwable=" + this.throwable + '}';
    }
}
