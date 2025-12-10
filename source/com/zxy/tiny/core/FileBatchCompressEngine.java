package com.zxy.tiny.core;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import com.zxy.tiny.Tiny;
import com.zxy.tiny.callable.FileCompressCallableTasks;
import com.zxy.tiny.callback.Callback;
import com.zxy.tiny.callback.DefaultCallbackDispatcher;
import com.zxy.tiny.callback.FileBatchCallback;
import com.zxy.tiny.callback.FileWithBitmapBatchCallback;
import com.zxy.tiny.common.BatchCompressResult;
import com.zxy.tiny.common.CompressResult;
import com.zxy.tiny.common.FileBatchResult;
import com.zxy.tiny.common.FileWithBitmapBatchResult;
import com.zxy.tiny.common.FileWithBitmapResult;
import com.zxy.tiny.core.CompressEngine;
import java.io.File;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public class FileBatchCompressEngine extends CompressEngine {

    /* renamed from: c */
    public Tiny.FileCompressOptions f60970c;

    /* renamed from: a */
    private void m31977a(Callback callback) {
        boolean z = false;
        if (this.f60962b == null) {
            if (callback instanceof FileBatchCallback) {
                ((FileBatchCallback) callback).callback(false, null, new RuntimeException("the source is null!"));
                return;
            } else if (callback instanceof FileWithBitmapBatchCallback) {
                ((FileWithBitmapBatchCallback) callback).callback(false, null, null, new RuntimeException("the source is null!"));
                return;
            } else {
                return;
            }
        }
        if (callback != null && (callback instanceof FileWithBitmapBatchCallback)) {
            z = true;
        }
        if (this.f60970c == null) {
            this.f60970c = new Tiny.FileCompressOptions();
        }
        CompressEngine.SourceType sourceType = this.f60961a;
        if (sourceType == CompressEngine.SourceType.FILE_ARRAY) {
            CompressExecutor.getExecutor().execute(new CompressFutureTask(new FileCompressCallableTasks.FileArrayAsFileCallable(this.f60970c, z, (File[]) this.f60962b), new DefaultCallbackDispatcher(callback)));
        } else if (sourceType == CompressEngine.SourceType.BITMAP_ARRAY) {
            CompressExecutor.getExecutor().execute(new CompressFutureTask(new FileCompressCallableTasks.BitmapArrayAsFileCallable(this.f60970c, z, (Bitmap[]) this.f60962b), new DefaultCallbackDispatcher(callback)));
        } else if (sourceType == CompressEngine.SourceType.URI_ARRAY) {
            CompressExecutor.getExecutor().execute(new CompressFutureTask(new FileCompressCallableTasks.UriArrayAsFileCallable(this.f60970c, z, (Uri[]) this.f60962b), new DefaultCallbackDispatcher(callback)));
        } else if (sourceType == CompressEngine.SourceType.RES_ID_ARRAY) {
            CompressExecutor.getExecutor().execute(new CompressFutureTask(new FileCompressCallableTasks.ResourceArrayAsFileCallable(this.f60970c, z, (int[]) this.f60962b), new DefaultCallbackDispatcher(callback)));
        }
    }

    /* renamed from: b */
    public final FileBatchResult m31976b() {
        FileBatchResult fileBatchResult = new FileBatchResult();
        if (this.f60962b == null) {
            fileBatchResult.success = false;
            fileBatchResult.throwable = new RuntimeException("the source is null!");
            return fileBatchResult;
        }
        if (this.f60970c == null) {
            this.f60970c = new Tiny.FileCompressOptions();
        }
        CompressEngine.SourceType sourceType = this.f60961a;
        if (sourceType == CompressEngine.SourceType.FILE_ARRAY) {
            try {
                BatchCompressResult call = new FileCompressCallableTasks.FileArrayAsFileCallable(this.f60970c, false, (File[]) this.f60962b).call();
                ArrayList arrayList = new ArrayList();
                if (call != null && call.results != null) {
                    int i = 0;
                    while (true) {
                        CompressResult[] compressResultArr = call.results;
                        if (i >= compressResultArr.length) {
                            break;
                        }
                        CompressResult compressResult = compressResultArr[i];
                        if (compressResult != null && !TextUtils.isEmpty(compressResult.outfile)) {
                            arrayList.add(compressResult.outfile);
                        }
                        i++;
                    }
                    fileBatchResult.success = call.success;
                } else {
                    fileBatchResult.success = false;
                    fileBatchResult.throwable = new RuntimeException("the compress result is null!");
                }
                fileBatchResult.outfiles = arrayList;
            } catch (Exception e) {
                fileBatchResult.success = false;
                fileBatchResult.throwable = e;
            }
        } else if (sourceType == CompressEngine.SourceType.BITMAP_ARRAY) {
            try {
                BatchCompressResult call2 = new FileCompressCallableTasks.BitmapArrayAsFileCallable(this.f60970c, false, (Bitmap[]) this.f60962b).call();
                ArrayList arrayList2 = new ArrayList();
                if (call2 != null && call2.results != null) {
                    int i2 = 0;
                    while (true) {
                        CompressResult[] compressResultArr2 = call2.results;
                        if (i2 >= compressResultArr2.length) {
                            break;
                        }
                        CompressResult compressResult2 = compressResultArr2[i2];
                        if (compressResult2 != null && !TextUtils.isEmpty(compressResult2.outfile)) {
                            arrayList2.add(compressResult2.outfile);
                        }
                        i2++;
                    }
                    fileBatchResult.success = call2.success;
                } else {
                    fileBatchResult.success = false;
                    fileBatchResult.throwable = new RuntimeException("the compress result is null!");
                }
                fileBatchResult.outfiles = arrayList2;
            } catch (Exception e2) {
                fileBatchResult.success = false;
                fileBatchResult.throwable = e2;
            }
        } else if (sourceType == CompressEngine.SourceType.URI_ARRAY) {
            try {
                BatchCompressResult call3 = new FileCompressCallableTasks.UriArrayAsFileCallable(this.f60970c, false, (Uri[]) this.f60962b).call();
                ArrayList arrayList3 = new ArrayList();
                if (call3 != null && call3.results != null) {
                    int i3 = 0;
                    while (true) {
                        CompressResult[] compressResultArr3 = call3.results;
                        if (i3 >= compressResultArr3.length) {
                            break;
                        }
                        CompressResult compressResult3 = compressResultArr3[i3];
                        if (compressResult3 != null && !TextUtils.isEmpty(compressResult3.outfile)) {
                            arrayList3.add(compressResult3.outfile);
                        }
                        i3++;
                    }
                    fileBatchResult.success = call3.success;
                } else {
                    fileBatchResult.success = false;
                    fileBatchResult.throwable = new RuntimeException("the compress result is null!");
                }
                fileBatchResult.outfiles = arrayList3;
            } catch (Exception e3) {
                fileBatchResult.success = false;
                fileBatchResult.throwable = e3;
            }
        } else if (sourceType == CompressEngine.SourceType.RES_ID_ARRAY) {
            try {
                BatchCompressResult call4 = new FileCompressCallableTasks.ResourceArrayAsFileCallable(this.f60970c, false, (int[]) this.f60962b).call();
                ArrayList arrayList4 = new ArrayList();
                if (call4 != null && call4.results != null) {
                    int i4 = 0;
                    while (true) {
                        CompressResult[] compressResultArr4 = call4.results;
                        if (i4 >= compressResultArr4.length) {
                            break;
                        }
                        CompressResult compressResult4 = compressResultArr4[i4];
                        if (compressResult4 != null && !TextUtils.isEmpty(compressResult4.outfile)) {
                            arrayList4.add(compressResult4.outfile);
                        }
                        i4++;
                    }
                    fileBatchResult.success = call4.success;
                } else {
                    fileBatchResult.success = false;
                    fileBatchResult.throwable = new RuntimeException("the compress result is null!");
                }
                fileBatchResult.outfiles = arrayList4;
            } catch (Exception e4) {
                fileBatchResult.success = false;
                fileBatchResult.throwable = e4;
            }
        }
        return fileBatchResult;
    }

    public void batchCompress(FileBatchCallback fileBatchCallback) {
        m31977a(fileBatchCallback);
    }

    public FileBatchResult batchCompressSync() {
        return m31976b();
    }

    public FileWithBitmapBatchResult batchCompressWithReturnBitmapResult() {
        return m31975c();
    }

    /* renamed from: c */
    public final FileWithBitmapBatchResult m31975c() {
        FileWithBitmapBatchResult fileWithBitmapBatchResult = new FileWithBitmapBatchResult();
        if (this.f60962b == null) {
            fileWithBitmapBatchResult.success = false;
            fileWithBitmapBatchResult.throwable = new RuntimeException("the source is null!");
            return fileWithBitmapBatchResult;
        }
        if (this.f60970c == null) {
            this.f60970c = new Tiny.FileCompressOptions();
        }
        CompressEngine.SourceType sourceType = this.f60961a;
        if (sourceType == CompressEngine.SourceType.FILE_ARRAY) {
            try {
                BatchCompressResult call = new FileCompressCallableTasks.FileArrayAsFileCallable(this.f60970c, true, (File[]) this.f60962b).call();
                ArrayList arrayList = new ArrayList();
                if (call != null && call.results != null) {
                    int i = 0;
                    while (true) {
                        CompressResult[] compressResultArr = call.results;
                        if (i >= compressResultArr.length) {
                            break;
                        }
                        CompressResult compressResult = compressResultArr[i];
                        if (compressResult != null) {
                            FileWithBitmapResult fileWithBitmapResult = new FileWithBitmapResult();
                            fileWithBitmapResult.outfile = compressResult.outfile;
                            fileWithBitmapResult.bitmap = compressResult.bitmap;
                            arrayList.add(fileWithBitmapResult);
                        }
                        i++;
                    }
                    fileWithBitmapBatchResult.success = call.success;
                } else {
                    fileWithBitmapBatchResult.success = false;
                    fileWithBitmapBatchResult.throwable = new RuntimeException("the compress result is null!");
                }
                fileWithBitmapBatchResult.results = arrayList;
            } catch (Exception e) {
                fileWithBitmapBatchResult.success = false;
                fileWithBitmapBatchResult.throwable = e;
            }
        } else if (sourceType == CompressEngine.SourceType.BITMAP_ARRAY) {
            try {
                BatchCompressResult call2 = new FileCompressCallableTasks.BitmapArrayAsFileCallable(this.f60970c, true, (Bitmap[]) this.f60962b).call();
                ArrayList arrayList2 = new ArrayList();
                if (call2 != null && call2.results != null) {
                    int i2 = 0;
                    while (true) {
                        CompressResult[] compressResultArr2 = call2.results;
                        if (i2 >= compressResultArr2.length) {
                            break;
                        }
                        CompressResult compressResult2 = compressResultArr2[i2];
                        if (compressResult2 != null) {
                            FileWithBitmapResult fileWithBitmapResult2 = new FileWithBitmapResult();
                            fileWithBitmapResult2.outfile = compressResult2.outfile;
                            fileWithBitmapResult2.bitmap = compressResult2.bitmap;
                            arrayList2.add(fileWithBitmapResult2);
                        }
                        i2++;
                    }
                    fileWithBitmapBatchResult.success = call2.success;
                } else {
                    fileWithBitmapBatchResult.success = false;
                    fileWithBitmapBatchResult.throwable = new RuntimeException("the compress result is null!");
                }
                fileWithBitmapBatchResult.results = arrayList2;
            } catch (Exception e2) {
                fileWithBitmapBatchResult.success = false;
                fileWithBitmapBatchResult.throwable = e2;
            }
        } else if (sourceType == CompressEngine.SourceType.URI_ARRAY) {
            try {
                BatchCompressResult call3 = new FileCompressCallableTasks.UriArrayAsFileCallable(this.f60970c, true, (Uri[]) this.f60962b).call();
                ArrayList arrayList3 = new ArrayList();
                if (call3 != null && call3.results != null) {
                    int i3 = 0;
                    while (true) {
                        CompressResult[] compressResultArr3 = call3.results;
                        if (i3 >= compressResultArr3.length) {
                            break;
                        }
                        CompressResult compressResult3 = compressResultArr3[i3];
                        if (compressResult3 != null) {
                            FileWithBitmapResult fileWithBitmapResult3 = new FileWithBitmapResult();
                            fileWithBitmapResult3.outfile = compressResult3.outfile;
                            fileWithBitmapResult3.bitmap = compressResult3.bitmap;
                            arrayList3.add(fileWithBitmapResult3);
                        }
                        i3++;
                    }
                    fileWithBitmapBatchResult.success = call3.success;
                } else {
                    fileWithBitmapBatchResult.success = false;
                    fileWithBitmapBatchResult.throwable = new RuntimeException("the compress result is null!");
                }
                fileWithBitmapBatchResult.results = arrayList3;
            } catch (Exception e3) {
                fileWithBitmapBatchResult.success = false;
                fileWithBitmapBatchResult.throwable = e3;
            }
        } else if (sourceType == CompressEngine.SourceType.RES_ID_ARRAY) {
            try {
                BatchCompressResult call4 = new FileCompressCallableTasks.ResourceArrayAsFileCallable(this.f60970c, true, (int[]) this.f60962b).call();
                ArrayList arrayList4 = new ArrayList();
                if (call4 != null && call4.results != null) {
                    int i4 = 0;
                    while (true) {
                        CompressResult[] compressResultArr4 = call4.results;
                        if (i4 >= compressResultArr4.length) {
                            break;
                        }
                        CompressResult compressResult4 = compressResultArr4[i4];
                        if (compressResult4 != null) {
                            FileWithBitmapResult fileWithBitmapResult4 = new FileWithBitmapResult();
                            fileWithBitmapResult4.outfile = compressResult4.outfile;
                            fileWithBitmapResult4.bitmap = compressResult4.bitmap;
                            arrayList4.add(fileWithBitmapResult4);
                        }
                        i4++;
                    }
                    fileWithBitmapBatchResult.success = call4.success;
                } else {
                    fileWithBitmapBatchResult.success = false;
                    fileWithBitmapBatchResult.throwable = new RuntimeException("the compress result is null!");
                }
                fileWithBitmapBatchResult.results = arrayList4;
            } catch (Exception e4) {
                fileWithBitmapBatchResult.success = false;
                fileWithBitmapBatchResult.throwable = e4;
            }
        }
        return fileWithBitmapBatchResult;
    }

    public FileBatchCompressEngine withOptions(Tiny.FileCompressOptions fileCompressOptions) {
        fileCompressOptions.config = CompressKit.filterConfig(fileCompressOptions.config);
        this.f60970c = fileCompressOptions;
        return this;
    }

    public void batchCompress(FileWithBitmapBatchCallback fileWithBitmapBatchCallback) {
        m31977a(fileWithBitmapBatchCallback);
    }
}
