package com.zxy.tiny.common;

import android.graphics.Bitmap;
import java.util.List;

/* loaded from: classes5.dex */
public class BitmapBatchResult extends Result {
    public List<Bitmap> bitmaps;

    public String toString() {
        return "BitmapBatchResult{bitmaps=" + this.bitmaps + ", success=" + this.success + ", throwable=" + this.throwable + '}';
    }
}
