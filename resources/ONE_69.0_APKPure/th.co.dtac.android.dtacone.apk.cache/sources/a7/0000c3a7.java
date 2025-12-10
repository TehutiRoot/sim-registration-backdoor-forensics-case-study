package com.zxy.tiny.common;

import android.graphics.Bitmap;

/* loaded from: classes5.dex */
public class BitmapResult extends Result {
    public Bitmap bitmap;

    public String toString() {
        return "BitmapResult{bitmap=" + this.bitmap + ", success=" + this.success + ", throwable=" + this.throwable + '}';
    }
}