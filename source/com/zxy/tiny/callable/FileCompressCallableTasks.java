package com.zxy.tiny.callable;

import android.graphics.Bitmap;
import android.net.Uri;
import com.zxy.tiny.Tiny;
import com.zxy.tiny.common.BatchCompressResult;
import com.zxy.tiny.common.CompressResult;
import com.zxy.tiny.common.UriUtil;
import com.zxy.tiny.core.CompressKit;
import com.zxy.tiny.core.FileCompressor;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class FileCompressCallableTasks {

    /* loaded from: classes5.dex */
    public static final class BitmapArrayAsFileCallable extends AbstractCallableC0396Fa {

        /* renamed from: c */
        public Bitmap[] f60945c;

        public BitmapArrayAsFileCallable(Tiny.FileCompressOptions fileCompressOptions, boolean z, Bitmap[] bitmapArr) {
            super(fileCompressOptions, z);
            this.f60945c = bitmapArr;
        }

        @Override // java.util.concurrent.Callable
        public BatchCompressResult call() throws Exception {
            if (this.f60945c == null) {
                return null;
            }
            BatchCompressResult batchCompressResult = new BatchCompressResult();
            Bitmap[] bitmapArr = this.f60945c;
            batchCompressResult.results = new CompressResult[bitmapArr.length];
            String[] m31990b = FileCompressCallableTasks.m31990b(this.f1640a, bitmapArr.length);
            int i = 0;
            while (true) {
                Bitmap[] bitmapArr2 = this.f60945c;
                if (i >= bitmapArr2.length) {
                    return batchCompressResult;
                }
                Bitmap shouldKeepSampling = FileCompressor.shouldKeepSampling(bitmapArr2[i], this.f1640a);
                Tiny.FileCompressOptions fileCompressOptions = this.f1640a;
                if (fileCompressOptions != null && m31990b != null && m31990b.length == this.f60945c.length) {
                    fileCompressOptions.outfile = m31990b[i];
                }
                CompressResult compress = FileCompressor.compress(shouldKeepSampling, fileCompressOptions, this.f1641b, false);
                if (compress != null) {
                    batchCompressResult.success = true;
                }
                batchCompressResult.results[i] = compress;
                i++;
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class BitmapAsFileCallable extends AbstractCallableC0465Ga {

        /* renamed from: c */
        public Bitmap f60946c;

        public BitmapAsFileCallable(Tiny.FileCompressOptions fileCompressOptions, boolean z, Bitmap bitmap) {
            super(fileCompressOptions, z);
            this.f60946c = bitmap;
        }

        @Override // java.util.concurrent.Callable
        public CompressResult call() throws Exception {
            return FileCompressor.compress(FileCompressor.shouldKeepSampling(this.f60946c, this.f1955a), this.f1955a, this.f1956b, false);
        }
    }

    /* loaded from: classes5.dex */
    public static final class ByteArrayAsFileCallable extends AbstractCallableC0465Ga {

        /* renamed from: c */
        public byte[] f60947c;

        public ByteArrayAsFileCallable(Tiny.FileCompressOptions fileCompressOptions, boolean z, byte[] bArr) {
            super(fileCompressOptions, z);
            this.f60947c = bArr;
        }

        @Override // java.util.concurrent.Callable
        public CompressResult call() throws Exception {
            return FileCompressor.compress(this.f60947c, this.f1955a, this.f1956b, true);
        }
    }

    /* loaded from: classes5.dex */
    public static final class FileArrayAsFileCallable extends AbstractCallableC0396Fa {

        /* renamed from: c */
        public File[] f60948c;

        public FileArrayAsFileCallable(Tiny.FileCompressOptions fileCompressOptions, boolean z, File[] fileArr) {
            super(fileCompressOptions, z);
            this.f60948c = fileArr;
        }

        @Override // java.util.concurrent.Callable
        public BatchCompressResult call() throws Exception {
            FileInputStream fileInputStream;
            FileInputStream fileInputStream2 = null;
            if (this.f60948c == null) {
                return null;
            }
            BatchCompressResult batchCompressResult = new BatchCompressResult();
            File[] fileArr = this.f60948c;
            batchCompressResult.results = new CompressResult[fileArr.length];
            String[] m31990b = FileCompressCallableTasks.m31990b(this.f1640a, fileArr.length);
            int i = 0;
            while (true) {
                File[] fileArr2 = this.f60948c;
                if (i >= fileArr2.length) {
                    return batchCompressResult;
                }
                File file = fileArr2[i];
                if (file == null) {
                    batchCompressResult.results[i] = null;
                } else {
                    try {
                        Tiny.FileCompressOptions fileCompressOptions = this.f1640a;
                        if (fileCompressOptions != null) {
                            if (m31990b != null && m31990b.length == fileArr2.length) {
                                fileCompressOptions.outfile = m31990b[i];
                            }
                            if (fileCompressOptions.overrideSource) {
                                fileCompressOptions.outfile = file.getAbsolutePath();
                            }
                        }
                        fileInputStream = new FileInputStream(file);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        CompressResult compress = FileCompressor.compress(CompressKit.transformToByteArray(fileInputStream), this.f1640a, this.f1641b, true);
                        try {
                            fileInputStream.close();
                        } catch (IOException unused) {
                        }
                        if (compress != null) {
                            batchCompressResult.success = true;
                        }
                        batchCompressResult.results[i] = compress;
                    } catch (Throwable th3) {
                        th = th3;
                        fileInputStream2 = fileInputStream;
                        if (fileInputStream2 != null) {
                            try {
                                fileInputStream2.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                }
                i++;
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class FileAsFileCallable extends AbstractCallableC0465Ga {

        /* renamed from: c */
        public File f60949c;

        public FileAsFileCallable(Tiny.FileCompressOptions fileCompressOptions, boolean z, File file) {
            super(fileCompressOptions, z);
            this.f60949c = file;
        }

        @Override // java.util.concurrent.Callable
        public CompressResult call() throws Exception {
            FileInputStream fileInputStream = null;
            try {
                Tiny.FileCompressOptions fileCompressOptions = this.f1955a;
                if (fileCompressOptions != null && fileCompressOptions.overrideSource) {
                    fileCompressOptions.outfile = this.f60949c.getAbsolutePath();
                }
                FileInputStream fileInputStream2 = new FileInputStream(this.f60949c);
                try {
                    CompressResult compress = FileCompressor.compress(CompressKit.transformToByteArray(fileInputStream2), this.f1955a, this.f1956b, true);
                    try {
                        fileInputStream2.close();
                    } catch (IOException unused) {
                    }
                    return compress;
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class InputStreamAsFileCallable extends AbstractCallableC0465Ga {

        /* renamed from: c */
        public InputStream f60950c;

        public InputStreamAsFileCallable(Tiny.FileCompressOptions fileCompressOptions, boolean z, InputStream inputStream) {
            super(fileCompressOptions, z);
            this.f60950c = inputStream;
        }

        @Override // java.util.concurrent.Callable
        public CompressResult call() throws Exception {
            return FileCompressor.compress(CompressKit.transformToByteArray(this.f60950c), this.f1955a, this.f1956b, true);
        }
    }

    /* loaded from: classes5.dex */
    public static final class ResourceArrayAsFileCallable extends AbstractCallableC0396Fa {

        /* renamed from: c */
        public int[] f60951c;

        public ResourceArrayAsFileCallable(Tiny.FileCompressOptions fileCompressOptions, boolean z, int[] iArr) {
            super(fileCompressOptions, z);
            this.f60951c = iArr;
        }

        @Override // java.util.concurrent.Callable
        public BatchCompressResult call() throws Exception {
            if (this.f60951c == null) {
                return null;
            }
            BatchCompressResult batchCompressResult = new BatchCompressResult();
            int[] iArr = this.f60951c;
            batchCompressResult.results = new CompressResult[iArr.length];
            String[] m31990b = FileCompressCallableTasks.m31990b(this.f1640a, iArr.length);
            int i = 0;
            while (true) {
                int[] iArr2 = this.f60951c;
                if (i >= iArr2.length) {
                    return batchCompressResult;
                }
                Bitmap shouldKeepSampling = FileCompressor.shouldKeepSampling(iArr2[i], this.f1640a);
                Tiny.FileCompressOptions fileCompressOptions = this.f1640a;
                if (fileCompressOptions != null && m31990b != null && m31990b.length == this.f60951c.length) {
                    fileCompressOptions.outfile = m31990b[i];
                }
                CompressResult compress = FileCompressor.compress(shouldKeepSampling, fileCompressOptions, this.f1641b, true);
                if (compress != null) {
                    batchCompressResult.success = true;
                }
                batchCompressResult.results[i] = compress;
                i++;
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class ResourceAsFileCallable extends AbstractCallableC0465Ga {

        /* renamed from: c */
        public int f60952c;

        public ResourceAsFileCallable(Tiny.FileCompressOptions fileCompressOptions, boolean z, int i) {
            super(fileCompressOptions, z);
            this.f60952c = i;
        }

        @Override // java.util.concurrent.Callable
        public CompressResult call() throws Exception {
            return FileCompressor.compress(FileCompressor.shouldKeepSampling(this.f60952c, this.f1955a), this.f1955a, this.f1956b, true);
        }
    }

    /* loaded from: classes5.dex */
    public static final class UriArrayAsFileCallable extends AbstractCallableC0396Fa {

        /* renamed from: c */
        public Uri[] f60953c;

        public UriArrayAsFileCallable(Tiny.FileCompressOptions fileCompressOptions, boolean z, Uri[] uriArr) {
            super(fileCompressOptions, z);
            this.f60953c = uriArr;
        }

        @Override // java.util.concurrent.Callable
        public BatchCompressResult call() throws Exception {
            if (this.f60953c == null) {
                return null;
            }
            BatchCompressResult batchCompressResult = new BatchCompressResult();
            Uri[] uriArr = this.f60953c;
            batchCompressResult.results = new CompressResult[uriArr.length];
            String[] m31990b = FileCompressCallableTasks.m31990b(this.f1640a, uriArr.length);
            int i = 0;
            while (true) {
                Uri[] uriArr2 = this.f60953c;
                if (i >= uriArr2.length) {
                    return batchCompressResult;
                }
                Uri uri = uriArr2[i];
                if (uri == null) {
                    batchCompressResult.results[i] = null;
                } else {
                    Tiny.FileCompressOptions fileCompressOptions = this.f1640a;
                    if (fileCompressOptions != null && m31990b != null && m31990b.length == uriArr2.length) {
                        fileCompressOptions.outfile = m31990b[i];
                    }
                    CompressResult call = new UriAsFileCallable(fileCompressOptions, this.f1641b, uri).call();
                    if (call != null) {
                        batchCompressResult.success = true;
                    }
                    batchCompressResult.results[i] = call;
                }
                i++;
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class UriAsFileCallable extends AbstractCallableC0465Ga {

        /* renamed from: c */
        public Uri f60954c;

        public UriAsFileCallable(Tiny.FileCompressOptions fileCompressOptions, boolean z, Uri uri) {
            super(fileCompressOptions, z);
            this.f60954c = uri;
        }

        @Override // java.util.concurrent.Callable
        public CompressResult call() throws Exception {
            Bitmap shouldKeepSampling = FileCompressor.shouldKeepSampling(this.f60954c, this.f1955a);
            Tiny.FileCompressOptions fileCompressOptions = this.f1955a;
            if (fileCompressOptions != null && fileCompressOptions.overrideSource && (UriUtil.isLocalContentUri(this.f60954c) || UriUtil.isLocalFileUri(this.f60954c))) {
                this.f1955a.outfile = UriUtil.getRealPathFromUri(this.f60954c);
            }
            return FileCompressor.compress(shouldKeepSampling, this.f1955a, this.f1956b, true);
        }
    }

    /* renamed from: b */
    public static String[] m31990b(Tiny.FileCompressOptions fileCompressOptions, int i) {
        if (fileCompressOptions == null || i <= 0) {
            return null;
        }
        if (fileCompressOptions instanceof Tiny.BatchFileCompressOptions) {
            String[] strArr = ((Tiny.BatchFileCompressOptions) fileCompressOptions).outfiles;
            if (strArr == null || strArr.length <= 0) {
                return null;
            }
            String[] strArr2 = new String[i];
            if (strArr.length >= i) {
                System.arraycopy(strArr, 0, strArr2, 0, i);
            } else {
                for (int i2 = 0; i2 < i; i2++) {
                    try {
                        strArr2[i2] = strArr[i2];
                    } catch (Exception unused) {
                        strArr2[i2] = null;
                    }
                }
            }
            return strArr2;
        }
        fileCompressOptions.outfile = null;
        return null;
    }
}
