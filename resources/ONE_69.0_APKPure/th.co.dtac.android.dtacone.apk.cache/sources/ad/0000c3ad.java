package com.zxy.tiny.common;

import android.graphics.Bitmap;
import ch.qos.logback.core.CoreConstants;

/* loaded from: classes5.dex */
public class FileWithBitmapResult extends Result {
    public Bitmap bitmap;
    public String outfile;

    public String toString() {
        return "FileWithBitmapResult{bitmap=" + this.bitmap + ", outfile='" + this.outfile + CoreConstants.SINGLE_QUOTE_CHAR + ", success=" + this.success + ", throwable=" + this.throwable + '}';
    }
}