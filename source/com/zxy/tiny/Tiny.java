package com.zxy.tiny;

import android.app.Application;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import com.zxy.tiny.common.ApplicationLoader;
import com.zxy.tiny.common.TinyException;
import com.zxy.tiny.core.CompressEngine;
import com.zxy.tiny.core.CompressKit;
import com.zxy.tiny.core.FileKit;
import java.io.File;
import java.io.InputStream;

/* loaded from: classes5.dex */
public final class Tiny {
    private static volatile Tiny sInstance;
    private boolean isDebug = false;
    private Application mApplication;

    /* loaded from: classes5.dex */
    public static class BatchFileCompressOptions extends FileCompressOptions {
        public String[] outfiles;
    }

    /* loaded from: classes5.dex */
    public static class BitmapCompressOptions {
        public int baseline;
        public Bitmap.Config config = CompressKit.DEFAULT_CONFIG;
        public int height;
        public int width;
    }

    /* loaded from: classes5.dex */
    public static class FileCompressOptions extends BitmapCompressOptions {
        public String compressDirectory;
        public String outfile;
        public float size;
        public int quality = 76;
        public boolean isKeepSampling = false;
        public boolean overrideSource = false;
    }

    private Tiny() {
    }

    public static Tiny getInstance() {
        if (sInstance == null) {
            synchronized (Tiny.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new Tiny();
                    }
                } finally {
                }
            }
        }
        return sInstance;
    }

    public synchronized boolean clearCompressDirectory() {
        try {
        } catch (Exception unused) {
            return false;
        }
        return FileKit.clearDirectory(FileKit.getDefaultFileCompressDirectory());
    }

    public Tiny debug(boolean z) {
        this.isDebug = z;
        return this;
    }

    public Application getApplication() {
        if (this.mApplication == null) {
            this.mApplication = ApplicationLoader.get();
        }
        return this.mApplication;
    }

    @Deprecated
    public void init(Application application) {
        if (application != null) {
            this.mApplication = application;
            return;
        }
        throw new TinyException.IllegalArgumentException("application can not be null!");
    }

    public boolean isDebug() {
        return this.isDebug;
    }

    public synchronized CompressEngine source(String str) {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return new CompressEngine().source(TextUtils.isEmpty(str) ? new File("") : new File(str));
    }

    public synchronized CompressEngine source(File file) {
        return new CompressEngine().source(file);
    }

    public synchronized CompressEngine source(String[] strArr) {
        return new CompressEngine().source(FileKit.wrap(strArr));
    }

    public synchronized CompressEngine source(File[] fileArr) {
        return new CompressEngine().source(fileArr);
    }

    public synchronized CompressEngine source(Bitmap bitmap) {
        return new CompressEngine().source(bitmap);
    }

    public synchronized CompressEngine source(Bitmap[] bitmapArr) {
        return new CompressEngine().source(bitmapArr);
    }

    public synchronized CompressEngine source(Uri uri) {
        return new CompressEngine().source(uri);
    }

    public synchronized CompressEngine source(Uri[] uriArr) {
        return new CompressEngine().source(uriArr);
    }

    public synchronized CompressEngine source(byte[] bArr) {
        return new CompressEngine().source(bArr);
    }

    public synchronized CompressEngine source(InputStream inputStream) {
        return new CompressEngine().source(inputStream);
    }

    public synchronized CompressEngine source(int i) {
        return new CompressEngine().source(i);
    }

    public synchronized CompressEngine source(int[] iArr) {
        return new CompressEngine().source(iArr);
    }
}
