package com.zxy.tiny.core;

import android.graphics.Bitmap;
import android.net.Uri;
import com.zxy.tiny.Tiny;
import com.zxy.tiny.callable.FileCompressCallableTasks;
import com.zxy.tiny.callback.Callback;
import com.zxy.tiny.callback.DefaultCallbackDispatcher;
import com.zxy.tiny.callback.FileCallback;
import com.zxy.tiny.callback.FileWithBitmapCallback;
import com.zxy.tiny.common.CompressResult;
import com.zxy.tiny.common.FileResult;
import com.zxy.tiny.common.FileWithBitmapResult;
import com.zxy.tiny.core.CompressEngine;
import java.io.File;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class FileCompressEngine extends CompressEngine {

    /* renamed from: c */
    public Tiny.FileCompressOptions f60971c;

    /* renamed from: a */
    private void m31974a(Callback callback) {
        boolean z = false;
        if (this.f60962b == null) {
            if (callback instanceof FileCallback) {
                ((FileCallback) callback).callback(false, null, new RuntimeException("the source is null!"));
                return;
            } else if (callback instanceof FileWithBitmapCallback) {
                ((FileWithBitmapCallback) callback).callback(false, null, null, new RuntimeException("the source is null!"));
                return;
            } else {
                return;
            }
        }
        if (callback != null && (callback instanceof FileWithBitmapCallback)) {
            z = true;
        }
        if (this.f60971c == null) {
            this.f60971c = new Tiny.FileCompressOptions();
        }
        CompressEngine.SourceType sourceType = this.f60961a;
        if (sourceType == CompressEngine.SourceType.FILE) {
            CompressExecutor.getExecutor().execute(new CompressFutureTask(new FileCompressCallableTasks.FileAsFileCallable(this.f60971c, z, (File) this.f60962b), new DefaultCallbackDispatcher(callback)));
        } else if (sourceType == CompressEngine.SourceType.BITMAP) {
            CompressExecutor.getExecutor().execute(new CompressFutureTask(new FileCompressCallableTasks.BitmapAsFileCallable(this.f60971c, z, (Bitmap) this.f60962b), new DefaultCallbackDispatcher(callback)));
        } else if (sourceType == CompressEngine.SourceType.URI) {
            CompressExecutor.getExecutor().execute(new CompressFutureTask(new FileCompressCallableTasks.UriAsFileCallable(this.f60971c, z, (Uri) this.f60962b), new DefaultCallbackDispatcher(callback)));
        } else if (sourceType == CompressEngine.SourceType.BYTE_ARRAY) {
            CompressExecutor.getExecutor().execute(new CompressFutureTask(new FileCompressCallableTasks.ByteArrayAsFileCallable(this.f60971c, z, (byte[]) this.f60962b), new DefaultCallbackDispatcher(callback)));
        } else if (sourceType == CompressEngine.SourceType.INPUT_STREAM) {
            CompressExecutor.getExecutor().execute(new CompressFutureTask(new FileCompressCallableTasks.InputStreamAsFileCallable(this.f60971c, z, (InputStream) this.f60962b), new DefaultCallbackDispatcher(callback)));
        } else if (sourceType == CompressEngine.SourceType.RES_ID) {
            CompressExecutor.getExecutor().execute(new CompressFutureTask(new FileCompressCallableTasks.ResourceAsFileCallable(this.f60971c, z, ((Integer) this.f60962b).intValue()), new DefaultCallbackDispatcher(callback)));
        }
    }

    /* renamed from: b */
    public final FileResult m31973b() {
        FileResult fileResult = new FileResult();
        if (this.f60962b == null) {
            fileResult.success = false;
            fileResult.throwable = new RuntimeException("the source is null!");
            return fileResult;
        }
        if (this.f60971c == null) {
            this.f60971c = new Tiny.FileCompressOptions();
        }
        CompressEngine.SourceType sourceType = this.f60961a;
        if (sourceType == CompressEngine.SourceType.FILE) {
            try {
                CompressResult call = new FileCompressCallableTasks.FileAsFileCallable(this.f60971c, false, (File) this.f60962b).call();
                fileResult.outfile = call.outfile;
                fileResult.success = call.success;
            } catch (Exception e) {
                fileResult.success = false;
                fileResult.throwable = e;
            }
        } else if (sourceType == CompressEngine.SourceType.BITMAP) {
            try {
                CompressResult call2 = new FileCompressCallableTasks.BitmapAsFileCallable(this.f60971c, false, (Bitmap) this.f60962b).call();
                fileResult.outfile = call2.outfile;
                fileResult.success = call2.success;
            } catch (Exception e2) {
                fileResult.success = false;
                fileResult.throwable = e2;
            }
        } else if (sourceType == CompressEngine.SourceType.URI) {
            try {
                CompressResult call3 = new FileCompressCallableTasks.UriAsFileCallable(this.f60971c, false, (Uri) this.f60962b).call();
                fileResult.outfile = call3.outfile;
                fileResult.success = call3.success;
            } catch (Exception e3) {
                fileResult.success = false;
                fileResult.throwable = e3;
            }
        } else if (sourceType == CompressEngine.SourceType.BYTE_ARRAY) {
            try {
                CompressResult call4 = new FileCompressCallableTasks.ByteArrayAsFileCallable(this.f60971c, false, (byte[]) this.f60962b).call();
                fileResult.outfile = call4.outfile;
                fileResult.success = call4.success;
            } catch (Exception e4) {
                fileResult.success = false;
                fileResult.throwable = e4;
            }
        } else if (sourceType == CompressEngine.SourceType.INPUT_STREAM) {
            try {
                CompressResult call5 = new FileCompressCallableTasks.InputStreamAsFileCallable(this.f60971c, false, (InputStream) this.f60962b).call();
                fileResult.outfile = call5.outfile;
                fileResult.success = call5.success;
            } catch (Exception e5) {
                fileResult.success = false;
                fileResult.throwable = e5;
            }
        } else if (sourceType == CompressEngine.SourceType.RES_ID) {
            try {
                CompressResult call6 = new FileCompressCallableTasks.ResourceAsFileCallable(this.f60971c, false, ((Integer) this.f60962b).intValue()).call();
                fileResult.outfile = call6.outfile;
                fileResult.success = call6.success;
            } catch (Exception e6) {
                fileResult.success = false;
                fileResult.throwable = e6;
            }
        }
        return fileResult;
    }

    /* renamed from: c */
    public final FileWithBitmapResult m31972c() {
        FileWithBitmapResult fileWithBitmapResult = new FileWithBitmapResult();
        if (this.f60962b == null) {
            fileWithBitmapResult.success = false;
            fileWithBitmapResult.throwable = new RuntimeException("the source is null!");
            return fileWithBitmapResult;
        }
        if (this.f60971c == null) {
            this.f60971c = new Tiny.FileCompressOptions();
        }
        CompressEngine.SourceType sourceType = this.f60961a;
        if (sourceType == CompressEngine.SourceType.FILE) {
            try {
                CompressResult call = new FileCompressCallableTasks.FileAsFileCallable(this.f60971c, true, (File) this.f60962b).call();
                fileWithBitmapResult.bitmap = call.bitmap;
                fileWithBitmapResult.outfile = call.outfile;
                fileWithBitmapResult.success = call.success;
            } catch (Exception e) {
                fileWithBitmapResult.success = false;
                fileWithBitmapResult.throwable = e;
            }
        } else if (sourceType == CompressEngine.SourceType.BITMAP) {
            try {
                CompressResult call2 = new FileCompressCallableTasks.BitmapAsFileCallable(this.f60971c, true, (Bitmap) this.f60962b).call();
                fileWithBitmapResult.bitmap = call2.bitmap;
                fileWithBitmapResult.outfile = call2.outfile;
                fileWithBitmapResult.success = call2.success;
            } catch (Exception e2) {
                fileWithBitmapResult.success = false;
                fileWithBitmapResult.throwable = e2;
            }
        } else if (sourceType == CompressEngine.SourceType.URI) {
            try {
                CompressResult call3 = new FileCompressCallableTasks.UriAsFileCallable(this.f60971c, true, (Uri) this.f60962b).call();
                fileWithBitmapResult.bitmap = call3.bitmap;
                fileWithBitmapResult.outfile = call3.outfile;
                fileWithBitmapResult.success = call3.success;
            } catch (Exception e3) {
                fileWithBitmapResult.success = false;
                fileWithBitmapResult.throwable = e3;
            }
        } else if (sourceType == CompressEngine.SourceType.BYTE_ARRAY) {
            try {
                CompressResult call4 = new FileCompressCallableTasks.ByteArrayAsFileCallable(this.f60971c, true, (byte[]) this.f60962b).call();
                fileWithBitmapResult.bitmap = call4.bitmap;
                fileWithBitmapResult.outfile = call4.outfile;
                fileWithBitmapResult.success = call4.success;
            } catch (Exception e4) {
                fileWithBitmapResult.success = false;
                fileWithBitmapResult.throwable = e4;
            }
        } else if (sourceType == CompressEngine.SourceType.INPUT_STREAM) {
            try {
                CompressResult call5 = new FileCompressCallableTasks.InputStreamAsFileCallable(this.f60971c, true, (InputStream) this.f60962b).call();
                fileWithBitmapResult.bitmap = call5.bitmap;
                fileWithBitmapResult.outfile = call5.outfile;
                fileWithBitmapResult.success = call5.success;
            } catch (Exception e5) {
                fileWithBitmapResult.success = false;
                fileWithBitmapResult.throwable = e5;
            }
        } else if (sourceType == CompressEngine.SourceType.RES_ID) {
            try {
                CompressResult call6 = new FileCompressCallableTasks.ResourceAsFileCallable(this.f60971c, true, ((Integer) this.f60962b).intValue()).call();
                fileWithBitmapResult.bitmap = call6.bitmap;
                fileWithBitmapResult.outfile = call6.outfile;
                fileWithBitmapResult.success = call6.success;
            } catch (Exception e6) {
                fileWithBitmapResult.success = false;
                fileWithBitmapResult.throwable = e6;
            }
        }
        return fileWithBitmapResult;
    }

    public void compress(FileCallback fileCallback) {
        m31974a(fileCallback);
    }

    public FileResult compressSync() {
        return m31973b();
    }

    public FileWithBitmapResult compressWithReturnBitmapSync() {
        return m31972c();
    }

    public FileCompressEngine withOptions(Tiny.FileCompressOptions fileCompressOptions) {
        fileCompressOptions.config = CompressKit.filterConfig(fileCompressOptions.config);
        this.f60971c = fileCompressOptions;
        return this;
    }

    public void compress(FileWithBitmapCallback fileWithBitmapCallback) {
        m31974a(fileWithBitmapCallback);
    }
}
