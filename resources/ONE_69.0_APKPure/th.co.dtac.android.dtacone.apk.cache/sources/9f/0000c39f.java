package com.zxy.tiny.callback;

import android.graphics.Bitmap;
import com.zxy.tiny.common.BatchCompressResult;
import com.zxy.tiny.common.CompressResult;

/* loaded from: classes5.dex */
public class DefaultCallbackDispatcher<T> implements CallbackDispatcher<T> {

    /* renamed from: a */
    public Callback f60967a;

    public DefaultCallbackDispatcher(Callback callback) {
        this.f60967a = callback;
    }

    @Override // com.zxy.tiny.callback.CallbackDispatcher
    public void dispatch(T t, Throwable th2) {
        BatchCompressResult batchCompressResult;
        CompressResult[] compressResultArr;
        Bitmap bitmap;
        String str;
        BatchCompressResult batchCompressResult2;
        CompressResult[] compressResultArr2;
        String str2;
        Callback callback = this.f60967a;
        if (callback == null) {
            return;
        }
        int i = 0;
        if (callback instanceof BitmapCallback) {
            if (t != null && (t instanceof Bitmap)) {
                ((BitmapCallback) callback).callback(true, (Bitmap) t, null);
            } else {
                ((BitmapCallback) callback).callback(false, null, th2);
            }
        } else if (callback instanceof BitmapBatchCallback) {
            if (t != null && (t instanceof Bitmap[])) {
                ((BitmapBatchCallback) callback).callback(true, (Bitmap[]) t, null);
            } else {
                ((BitmapBatchCallback) callback).callback(false, null, th2);
            }
        } else if (callback instanceof FileCallback) {
            if (t != null && (t instanceof CompressResult)) {
                CompressResult compressResult = (CompressResult) t;
                ((FileCallback) callback).callback(compressResult.success, compressResult.outfile, compressResult.throwable);
                return;
            }
            ((FileCallback) callback).callback(false, null, th2);
        } else if (callback instanceof FileWithBitmapCallback) {
            if (t != null && (t instanceof CompressResult)) {
                CompressResult compressResult2 = (CompressResult) t;
                ((FileWithBitmapCallback) callback).callback(compressResult2.success, compressResult2.bitmap, compressResult2.outfile, compressResult2.throwable);
                return;
            }
            ((FileWithBitmapCallback) callback).callback(false, null, null, th2);
        } else if (callback instanceof FileBatchCallback) {
            if (t != null && (t instanceof BatchCompressResult) && (compressResultArr2 = (batchCompressResult2 = (BatchCompressResult) t).results) != null) {
                String[] strArr = new String[compressResultArr2.length];
                while (i < compressResultArr2.length) {
                    CompressResult compressResult3 = compressResultArr2[i];
                    if (compressResult3 == null) {
                        str2 = null;
                    } else {
                        str2 = compressResult3.outfile;
                    }
                    strArr[i] = str2;
                    i++;
                }
                ((FileBatchCallback) this.f60967a).callback(batchCompressResult2.success, strArr, batchCompressResult2.throwable);
                return;
            }
            ((FileBatchCallback) callback).callback(false, null, th2);
        } else if (callback instanceof FileWithBitmapBatchCallback) {
            if (t != null && (t instanceof BatchCompressResult) && (compressResultArr = (batchCompressResult = (BatchCompressResult) t).results) != null) {
                Bitmap[] bitmapArr = new Bitmap[compressResultArr.length];
                String[] strArr2 = new String[compressResultArr.length];
                while (i < compressResultArr.length) {
                    CompressResult compressResult4 = compressResultArr[i];
                    if (compressResult4 == null) {
                        bitmap = null;
                    } else {
                        bitmap = compressResult4.bitmap;
                    }
                    bitmapArr[i] = bitmap;
                    if (compressResult4 == null) {
                        str = null;
                    } else {
                        str = compressResult4.outfile;
                    }
                    strArr2[i] = str;
                    i++;
                }
                ((FileWithBitmapBatchCallback) this.f60967a).callback(batchCompressResult.success, bitmapArr, strArr2, batchCompressResult.throwable);
                return;
            }
            ((FileWithBitmapBatchCallback) callback).callback(false, null, null, th2);
        }
    }
}