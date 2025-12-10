package com.zxy.tiny.core;

import android.graphics.Bitmap;
import android.net.Uri;
import com.zxy.tiny.Tiny;
import com.zxy.tiny.callable.BitmapCompressCallableTasks;
import com.zxy.tiny.callback.BitmapBatchCallback;
import com.zxy.tiny.callback.Callback;
import com.zxy.tiny.callback.DefaultCallbackDispatcher;
import com.zxy.tiny.common.BitmapBatchResult;
import com.zxy.tiny.core.CompressEngine;
import java.io.File;
import java.util.Arrays;

/* loaded from: classes5.dex */
public class BitmapBatchCompressEngine extends CompressEngine {

    /* renamed from: c */
    public Tiny.BitmapCompressOptions f60970c;

    /* renamed from: a */
    public final void m31979a(Callback callback) {
        if (this.f60974b == null) {
            if (callback instanceof BitmapBatchCallback) {
                ((BitmapBatchCallback) callback).callback(false, null, new RuntimeException("the source is null!"));
                return;
            }
            return;
        }
        if (this.f60970c == null) {
            this.f60970c = new Tiny.BitmapCompressOptions();
        }
        CompressEngine.SourceType sourceType = this.f60973a;
        if (sourceType == CompressEngine.SourceType.FILE_ARRAY) {
            CompressExecutor.getExecutor().execute(new CompressFutureTask(new BitmapCompressCallableTasks.FileArrayAsBitmapCallable(this.f60970c, (File[]) this.f60974b), new DefaultCallbackDispatcher(callback)));
        } else if (sourceType == CompressEngine.SourceType.BITMAP_ARRAY) {
            CompressExecutor.getExecutor().execute(new CompressFutureTask(new BitmapCompressCallableTasks.BitmapArrayAsBitmapCallable(this.f60970c, (Bitmap[]) this.f60974b), new DefaultCallbackDispatcher(callback)));
        } else if (sourceType == CompressEngine.SourceType.URI_ARRAY) {
            CompressExecutor.getExecutor().execute(new CompressFutureTask(new BitmapCompressCallableTasks.UriArrayAsBitmapCallable(this.f60970c, (Uri[]) this.f60974b), new DefaultCallbackDispatcher(callback)));
        } else if (sourceType == CompressEngine.SourceType.RES_ID_ARRAY) {
            CompressExecutor.getExecutor().execute(new CompressFutureTask(new BitmapCompressCallableTasks.ResourceArrayAsBitmapCallable(this.f60970c, (int[]) this.f60974b), new DefaultCallbackDispatcher(callback)));
        }
    }

    /* renamed from: b */
    public final BitmapBatchResult m31978b() {
        BitmapBatchResult bitmapBatchResult = new BitmapBatchResult();
        if (this.f60974b == null) {
            bitmapBatchResult.success = false;
            bitmapBatchResult.throwable = new RuntimeException("the source is null!");
            return bitmapBatchResult;
        }
        if (this.f60970c == null) {
            this.f60970c = new Tiny.BitmapCompressOptions();
        }
        CompressEngine.SourceType sourceType = this.f60973a;
        if (sourceType == CompressEngine.SourceType.FILE_ARRAY) {
            try {
                Bitmap[] call = new BitmapCompressCallableTasks.FileArrayAsBitmapCallable(this.f60970c, (File[]) this.f60974b).call();
                if (call != null && call.length != 0) {
                    bitmapBatchResult.bitmaps = Arrays.asList(call);
                    bitmapBatchResult.success = true;
                }
                bitmapBatchResult.bitmaps = null;
                bitmapBatchResult.success = false;
                bitmapBatchResult.throwable = new RuntimeException("the compress result is null!");
            } catch (Exception e) {
                bitmapBatchResult.success = false;
                bitmapBatchResult.throwable = e;
            }
        } else if (sourceType == CompressEngine.SourceType.BITMAP_ARRAY) {
            try {
                Bitmap[] call2 = new BitmapCompressCallableTasks.BitmapArrayAsBitmapCallable(this.f60970c, (Bitmap[]) this.f60974b).call();
                if (call2 != null && call2.length != 0) {
                    bitmapBatchResult.bitmaps = Arrays.asList(call2);
                    bitmapBatchResult.success = true;
                }
                bitmapBatchResult.bitmaps = null;
                bitmapBatchResult.success = false;
                bitmapBatchResult.throwable = new RuntimeException("the compress result is null!");
            } catch (Exception e2) {
                bitmapBatchResult.success = false;
                bitmapBatchResult.throwable = e2;
            }
        } else if (sourceType == CompressEngine.SourceType.URI_ARRAY) {
            try {
                Bitmap[] call3 = new BitmapCompressCallableTasks.UriArrayAsBitmapCallable(this.f60970c, (Uri[]) this.f60974b).call();
                if (call3 != null && call3.length != 0) {
                    bitmapBatchResult.bitmaps = Arrays.asList(call3);
                    bitmapBatchResult.success = true;
                }
                bitmapBatchResult.bitmaps = null;
                bitmapBatchResult.success = false;
                bitmapBatchResult.throwable = new RuntimeException("the compress result is null!");
            } catch (Exception e3) {
                bitmapBatchResult.success = false;
                bitmapBatchResult.throwable = e3;
            }
        } else if (sourceType == CompressEngine.SourceType.RES_ID_ARRAY) {
            try {
                Bitmap[] call4 = new BitmapCompressCallableTasks.ResourceArrayAsBitmapCallable(this.f60970c, (int[]) this.f60974b).call();
                if (call4 != null && call4.length != 0) {
                    bitmapBatchResult.bitmaps = Arrays.asList(call4);
                    bitmapBatchResult.success = true;
                }
                bitmapBatchResult.bitmaps = null;
                bitmapBatchResult.success = false;
                bitmapBatchResult.throwable = new RuntimeException("the compress result is null!");
            } catch (Exception e4) {
                bitmapBatchResult.success = false;
                bitmapBatchResult.throwable = e4;
            }
        }
        return bitmapBatchResult;
    }

    public void batchCompress(BitmapBatchCallback bitmapBatchCallback) {
        m31979a(bitmapBatchCallback);
    }

    public BitmapBatchResult batchCompressSync() {
        return m31978b();
    }

    public BitmapBatchCompressEngine withOptions(Tiny.BitmapCompressOptions bitmapCompressOptions) {
        bitmapCompressOptions.config = CompressKit.filterConfig(bitmapCompressOptions.config);
        this.f60970c = bitmapCompressOptions;
        return this;
    }
}