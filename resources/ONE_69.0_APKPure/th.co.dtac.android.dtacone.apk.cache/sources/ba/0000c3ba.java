package com.zxy.tiny.core;

import android.graphics.Bitmap;
import android.net.Uri;
import com.zxy.tiny.Tiny;
import com.zxy.tiny.callable.BitmapCompressCallableTasks;
import com.zxy.tiny.callback.BitmapCallback;
import com.zxy.tiny.callback.Callback;
import com.zxy.tiny.callback.DefaultCallbackDispatcher;
import com.zxy.tiny.common.BitmapResult;
import com.zxy.tiny.core.CompressEngine;
import java.io.File;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class BitmapCompressEngine extends CompressEngine {

    /* renamed from: c */
    public Tiny.BitmapCompressOptions f60971c;

    /* renamed from: a */
    private void m31977a(Callback callback) {
        if (this.f60974b == null) {
            if (callback instanceof BitmapCallback) {
                ((BitmapCallback) callback).callback(false, null, new RuntimeException("the source is null!"));
                return;
            }
            return;
        }
        if (this.f60971c == null) {
            this.f60971c = new Tiny.BitmapCompressOptions();
        }
        CompressEngine.SourceType sourceType = this.f60973a;
        if (sourceType == CompressEngine.SourceType.FILE) {
            CompressExecutor.getExecutor().execute(new CompressFutureTask(new BitmapCompressCallableTasks.FileAsBitmapCallable(this.f60971c, (File) this.f60974b), new DefaultCallbackDispatcher(callback)));
        } else if (sourceType == CompressEngine.SourceType.BITMAP) {
            CompressExecutor.getExecutor().execute(new CompressFutureTask(new BitmapCompressCallableTasks.BitmapAsBitmapCallable(this.f60971c, (Bitmap) this.f60974b), new DefaultCallbackDispatcher(callback)));
        } else if (sourceType == CompressEngine.SourceType.URI) {
            CompressExecutor.getExecutor().execute(new CompressFutureTask(new BitmapCompressCallableTasks.UriAsBitmapCallable(this.f60971c, (Uri) this.f60974b), new DefaultCallbackDispatcher(callback)));
        } else if (sourceType == CompressEngine.SourceType.BYTE_ARRAY) {
            CompressExecutor.getExecutor().execute(new CompressFutureTask(new BitmapCompressCallableTasks.ByteArrayAsBitmapCallable(this.f60971c, (byte[]) this.f60974b), new DefaultCallbackDispatcher(callback)));
        } else if (sourceType == CompressEngine.SourceType.INPUT_STREAM) {
            CompressExecutor.getExecutor().execute(new CompressFutureTask(new BitmapCompressCallableTasks.InputStreamAsBitmapCallable(this.f60971c, (InputStream) this.f60974b), new DefaultCallbackDispatcher(callback)));
        } else if (sourceType == CompressEngine.SourceType.RES_ID) {
            CompressExecutor.getExecutor().execute(new CompressFutureTask(new BitmapCompressCallableTasks.ResourceAsBitmapCallable(this.f60971c, ((Integer) this.f60974b).intValue()), new DefaultCallbackDispatcher(callback)));
        }
    }

    /* renamed from: b */
    public final BitmapResult m31976b() {
        BitmapResult bitmapResult = new BitmapResult();
        if (this.f60974b == null) {
            bitmapResult.success = false;
            bitmapResult.throwable = new RuntimeException("the source is null!");
            return bitmapResult;
        }
        if (this.f60971c == null) {
            this.f60971c = new Tiny.BitmapCompressOptions();
        }
        CompressEngine.SourceType sourceType = this.f60973a;
        if (sourceType == CompressEngine.SourceType.FILE) {
            try {
                bitmapResult.bitmap = new BitmapCompressCallableTasks.FileAsBitmapCallable(this.f60971c, (File) this.f60974b).call();
                bitmapResult.success = true;
            } catch (Exception e) {
                bitmapResult.success = false;
                bitmapResult.throwable = e;
            }
        } else if (sourceType == CompressEngine.SourceType.BITMAP) {
            try {
                bitmapResult.bitmap = new BitmapCompressCallableTasks.BitmapAsBitmapCallable(this.f60971c, (Bitmap) this.f60974b).call();
                bitmapResult.success = true;
            } catch (Exception e2) {
                bitmapResult.success = false;
                bitmapResult.throwable = e2;
            }
        } else if (sourceType == CompressEngine.SourceType.URI) {
            try {
                bitmapResult.bitmap = new BitmapCompressCallableTasks.UriAsBitmapCallable(this.f60971c, (Uri) this.f60974b).call();
                bitmapResult.success = true;
            } catch (Exception e3) {
                bitmapResult.success = false;
                bitmapResult.throwable = e3;
            }
        } else if (sourceType == CompressEngine.SourceType.BYTE_ARRAY) {
            try {
                bitmapResult.bitmap = new BitmapCompressCallableTasks.ByteArrayAsBitmapCallable(this.f60971c, (byte[]) this.f60974b).call();
                bitmapResult.success = true;
            } catch (Exception e4) {
                bitmapResult.success = false;
                bitmapResult.throwable = e4;
            }
        } else if (sourceType == CompressEngine.SourceType.INPUT_STREAM) {
            try {
                bitmapResult.bitmap = new BitmapCompressCallableTasks.InputStreamAsBitmapCallable(this.f60971c, (InputStream) this.f60974b).call();
                bitmapResult.success = true;
            } catch (Exception e5) {
                bitmapResult.success = false;
                bitmapResult.throwable = e5;
            }
        } else if (sourceType == CompressEngine.SourceType.RES_ID) {
            try {
                bitmapResult.bitmap = new BitmapCompressCallableTasks.ResourceAsBitmapCallable(this.f60971c, ((Integer) this.f60974b).intValue()).call();
                bitmapResult.success = true;
            } catch (Exception e6) {
                bitmapResult.success = false;
                bitmapResult.throwable = e6;
            }
        }
        return bitmapResult;
    }

    public void compress(BitmapCallback bitmapCallback) {
        m31977a(bitmapCallback);
    }

    public BitmapResult compressSync() {
        return m31976b();
    }

    public BitmapCompressEngine withOptions(Tiny.BitmapCompressOptions bitmapCompressOptions) {
        bitmapCompressOptions.config = CompressKit.filterConfig(bitmapCompressOptions.config);
        this.f60971c = bitmapCompressOptions;
        return this;
    }
}