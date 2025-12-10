package com.zxy.tiny.common;

import java.util.List;

/* loaded from: classes5.dex */
public class FileBatchResult extends Result {
    public List<String> outfiles;

    public String toString() {
        return "FileBatchResult{outfiles=" + this.outfiles + ", success=" + this.success + ", throwable=" + this.throwable + '}';
    }
}
