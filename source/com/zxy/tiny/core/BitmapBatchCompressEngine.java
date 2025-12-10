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
    public Tiny.BitmapCompressOptions f60958c;

    /* renamed from: a */
    public final void m31987a(Callback callback) {
        if (this.f60962b == null) {
            if (callback instanceof BitmapBatchCallback) {
                ((BitmapBatchCallback) callback).callback(false, null, new RuntimeException("the source is null!"));
                return;
            }
            return;
        }
        if (this.f60958c == null) {
            this.f60958c = new Tiny.BitmapCompressOptions();
        }
        CompressEngine.SourceType sourceType = this.f60961a;
        if (sourceType == CompressEngine.SourceType.FILE_ARRAY) {
            CompressExecutor.getExecutor().execute(new CompressFutureTask(new BitmapCompressCallableTasks.FileArrayAsBitmapCallable(this.f60958c, (File[]) this.f60962b), new DefaultCallbackDispatcher(callback)));
        } else if (sourceType == CompressEngine.SourceType.BITMAP_ARRAY) {
            CompressExecutor.getExecutor().execute(new CompressFutureTask(new BitmapCompressCallableTasks.BitmapArrayAsBitmapCallable(this.f60958c, (Bitmap[]) this.f60962b), new DefaultCallbackDispatcher(callback)));
        } else if (sourceType == CompressEngine.SourceType.URI_ARRAY) {
            CompressExecutor.getExecutor().execute(new CompressFutureTask(new BitmapCompressCallableTasks.UriArrayAsBitmapCallable(this.f60958c, (Uri[]) this.f60962b), new DefaultCallbackDispatcher(callback)));
        } else if (sourceType == CompressEngine.SourceType.RES_ID_ARRAY) {
            CompressExecutor.getExecutor().execute(new CompressFutureTask(new BitmapCompressCallableTasks.ResourceArrayAsBitmapCallable(this.f60958c, (int[]) this.f60962b), new DefaultCallbackDispatcher(callback)));
        }
    }

    /* renamed from: b */
    public final BitmapBatchResult m31986b() {
        BitmapBatchResult bitmapBatchResult = new BitmapBatchResult();
        if (this.f60962b == null) {
            bitmapBatchResult.success = false;
            bitmapBatchResult.throwable = new RuntimeException("the source is null!");
            return bitmapBatchResult;
        }
        if (this.f60958c == null) {
            this.f60958c = new Tiny.BitmapCompressOptions();
        }
        CompressEngine.SourceType sourceType = this.f60961a;
        if (sourceType == CompressEngine.SourceType.FILE_ARRAY) {
            try {
                Bitmap[] call = new BitmapCompressCallableTasks.FileArrayAsBitmapCallable(this.f60958c, (File[]) this.f60962b).call();
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
                Bitmap[] call2 = new BitmapCompressCallableTasks.BitmapArrayAsBitmapCallable(this.f60958c, (Bitmap[]) this.f60962b).call();
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
                Bitmap[] call3 = new BitmapCompressCallableTasks.UriArrayAsBitmapCallable(this.f60958c, (Uri[]) this.f60962b).call();
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
                Bitmap[] call4 = new BitmapCompressCallableTasks.ResourceArrayAsBitmapCallable(this.f60958c, (int[]) this.f60962b).call();
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
        m31987a(bitmapBatchCallback);
    }

    public BitmapBatchResult batchCompressSync() {
        return m31986b();
    }

    public BitmapBatchCompressEngine withOptions(Tiny.BitmapCompressOptions bitmapCompressOptions) {
        bitmapCompressOptions.config = CompressKit.filterConfig(bitmapCompressOptions.config);
        this.f60958c = bitmapCompressOptions;
        return this;
    }
}
