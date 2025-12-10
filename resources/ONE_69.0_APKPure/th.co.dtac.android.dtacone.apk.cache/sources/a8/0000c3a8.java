package com.zxy.tiny.common;

import android.graphics.Bitmap;
import ch.qos.logback.core.CoreConstants;

/* loaded from: classes5.dex */
public final class CompressResult extends Result {
    public Bitmap bitmap;
    public String outfile;

    public String toString() {
        return "CompressResult{bitmap=" + this.bitmap + ", success=" + this.success + ", outfile='" + this.outfile + CoreConstants.SINGLE_QUOTE_CHAR + ", throwable=" + this.throwable + '}';
    }
}