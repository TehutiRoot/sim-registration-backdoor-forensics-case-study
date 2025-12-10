package com.zxy.tiny.common;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class BatchCompressResult extends Result {
    public CompressResult[] results;

    public String toString() {
        return "BatchCompressResult{results=" + Arrays.toString(this.results) + ", success=" + this.success + ", throwable=" + this.throwable + '}';
    }
}
