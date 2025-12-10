package com.zxy.tiny.callable;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import com.zxy.tiny.Tiny;
import com.zxy.tiny.common.Conditions;
import com.zxy.tiny.common.UriUtil;
import com.zxy.tiny.core.BitmapCompressor;
import com.zxy.tiny.core.CompressKit;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class BitmapCompressCallableTasks {

    /* loaded from: classes5.dex */
    public static final class BitmapArrayAsBitmapCallable extends AbstractCallableC16848ua {

        /* renamed from: b */
        public Bitmap[] f60946b;

        public BitmapArrayAsBitmapCallable(Tiny.BitmapCompressOptions bitmapCompressOptions, Bitmap[] bitmapArr) {
            super(bitmapCompressOptions);
            this.f60946b = bitmapArr;
        }

        @Override // java.util.concurrent.Callable
        public Bitmap[] call() throws Exception {
            Bitmap[] bitmapArr = this.f60946b;
            if (bitmapArr == null) {
                return null;
            }
            Bitmap[] bitmapArr2 = new Bitmap[bitmapArr.length];
            int i = 0;
            while (true) {
                Bitmap[] bitmapArr3 = this.f60946b;
                if (i >= bitmapArr3.length) {
                    return bitmapArr2;
                }
                bitmapArr2[i] = BitmapCompressor.compress(bitmapArr3[i], this.f107810a, true);
                i++;
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class BitmapAsBitmapCallable extends AbstractCallableC16918va {

        /* renamed from: b */
        public Bitmap f60947b;

        public BitmapAsBitmapCallable(Tiny.BitmapCompressOptions bitmapCompressOptions, Bitmap bitmap) {
            super(bitmapCompressOptions);
            this.f60947b = bitmap;
        }

        @Override // java.util.concurrent.Callable
        public Bitmap call() throws Exception {
            return BitmapCompressor.compress(this.f60947b, this.f108144a, true);
        }
    }

    /* loaded from: classes5.dex */
    public static final class ByteArrayAsBitmapCallable extends AbstractCallableC16918va {

        /* renamed from: b */
        public byte[] f60948b;

        public ByteArrayAsBitmapCallable(Tiny.BitmapCompressOptions bitmapCompressOptions, byte[] bArr) {
            super(bitmapCompressOptions);
            this.f60948b = bArr;
        }

        @Override // java.util.concurrent.Callable
        public Bitmap call() throws Exception {
            return BitmapCompressor.compress(this.f60948b, this.f108144a, true);
        }
    }

    /* loaded from: classes5.dex */
    public static final class FileArrayAsBitmapCallable extends AbstractCallableC16848ua {

        /* renamed from: b */
        public File[] f60949b;

        public FileArrayAsBitmapCallable(Tiny.BitmapCompressOptions bitmapCompressOptions, File[] fileArr) {
            super(bitmapCompressOptions);
            this.f60949b = fileArr;
        }

        @Override // java.util.concurrent.Callable
        public Bitmap[] call() throws Exception {
            File[] fileArr = this.f60949b;
            FileInputStream fileInputStream = null;
            if (fileArr == null) {
                return null;
            }
            Bitmap[] bitmapArr = new Bitmap[fileArr.length];
            int i = 0;
            while (true) {
                File[] fileArr2 = this.f60949b;
                if (i >= fileArr2.length) {
                    return bitmapArr;
                }
                File file = fileArr2[i];
                if (file == null) {
                    bitmapArr[i] = null;
                } else {
                    try {
                        FileInputStream fileInputStream2 = new FileInputStream(file);
                        try {
                            Bitmap compress = BitmapCompressor.compress(CompressKit.transformToByteArray(fileInputStream2), this.f107810a, true);
                            try {
                                fileInputStream2.close();
                            } catch (IOException unused) {
                            }
                            bitmapArr[i] = compress;
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
                i++;
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class FileAsBitmapCallable extends AbstractCallableC16918va {

        /* renamed from: b */
        public File f60950b;

        public FileAsBitmapCallable(Tiny.BitmapCompressOptions bitmapCompressOptions, File file) {
            super(bitmapCompressOptions);
            this.f60950b = file;
        }

        @Override // java.util.concurrent.Callable
        public Bitmap call() throws Exception {
            FileInputStream fileInputStream;
            Throwable th2;
            try {
                fileInputStream = new FileInputStream(this.f60950b);
            } catch (Throwable th3) {
                fileInputStream = null;
                th2 = th3;
            }
            try {
                Bitmap compress = BitmapCompressor.compress(CompressKit.transformToByteArray(fileInputStream), this.f108144a, true);
                try {
                    fileInputStream.close();
                } catch (IOException unused) {
                }
                return compress;
            } catch (Throwable th4) {
                th2 = th4;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th2;
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class InputStreamAsBitmapCallable extends AbstractCallableC16918va {

        /* renamed from: b */
        public InputStream f60951b;

        public InputStreamAsBitmapCallable(Tiny.BitmapCompressOptions bitmapCompressOptions, InputStream inputStream) {
            super(bitmapCompressOptions);
            this.f60951b = inputStream;
        }

        @Override // java.util.concurrent.Callable
        public Bitmap call() throws Exception {
            return BitmapCompressor.compress(CompressKit.transformToByteArray(this.f60951b), this.f108144a, true);
        }
    }

    /* loaded from: classes5.dex */
    public static final class ResourceArrayAsBitmapCallable extends AbstractCallableC16848ua {

        /* renamed from: b */
        public int[] f60952b;

        public ResourceArrayAsBitmapCallable(Tiny.BitmapCompressOptions bitmapCompressOptions, int[] iArr) {
            super(bitmapCompressOptions);
            this.f60952b = iArr;
        }

        @Override // java.util.concurrent.Callable
        public Bitmap[] call() throws Exception {
            int[] iArr = this.f60952b;
            if (iArr == null) {
                return null;
            }
            Bitmap[] bitmapArr = new Bitmap[iArr.length];
            int i = 0;
            while (true) {
                int[] iArr2 = this.f60952b;
                if (i >= iArr2.length) {
                    return bitmapArr;
                }
                bitmapArr[i] = BitmapCompressor.compress(iArr2[i], this.f107810a, true);
                i++;
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class ResourceAsBitmapCallable extends AbstractCallableC16918va {

        /* renamed from: b */
        public int f60953b;

        public ResourceAsBitmapCallable(Tiny.BitmapCompressOptions bitmapCompressOptions, int i) {
            super(bitmapCompressOptions);
            this.f60953b = i;
        }

        @Override // java.util.concurrent.Callable
        public Bitmap call() throws Exception {
            return BitmapCompressor.compress(this.f60953b, this.f108144a, true);
        }
    }

    /* loaded from: classes5.dex */
    public static final class UriArrayAsBitmapCallable extends AbstractCallableC16848ua {

        /* renamed from: b */
        public Uri[] f60954b;

        public UriArrayAsBitmapCallable(Tiny.BitmapCompressOptions bitmapCompressOptions, Uri[] uriArr) {
            super(bitmapCompressOptions);
            this.f60954b = uriArr;
        }

        @Override // java.util.concurrent.Callable
        public Bitmap[] call() throws Exception {
            Uri[] uriArr = this.f60954b;
            if (uriArr == null) {
                return null;
            }
            Bitmap[] bitmapArr = new Bitmap[uriArr.length];
            int i = 0;
            while (true) {
                Uri[] uriArr2 = this.f60954b;
                if (i >= uriArr2.length) {
                    return bitmapArr;
                }
                Uri uri = uriArr2[i];
                if (uri == null) {
                    bitmapArr[i] = null;
                } else {
                    bitmapArr[i] = new UriAsBitmapCallable(this.f107810a, uri).call();
                }
                i++;
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class UriAsBitmapCallable extends AbstractCallableC16918va {

        /* renamed from: b */
        public Uri f60955b;

        /* renamed from: c */
        public Bitmap f60956c;

        public UriAsBitmapCallable(Tiny.BitmapCompressOptions bitmapCompressOptions, Uri uri) {
            super(bitmapCompressOptions);
            this.f60956c = null;
            this.f60955b = uri;
        }

        @Override // java.util.concurrent.Callable
        public Bitmap call() throws Exception {
            if (!UriUtil.isNetworkUri(this.f60955b)) {
                if (UriUtil.isLocalContentUri(this.f60955b) || UriUtil.isLocalFileUri(this.f60955b)) {
                    String realPathFromUri = UriUtil.getRealPathFromUri(this.f60955b);
                    FileInputStream fileInputStream = null;
                    if (TextUtils.isEmpty(realPathFromUri)) {
                        return null;
                    }
                    if (Conditions.fileIsExist(realPathFromUri) && Conditions.fileCanRead(realPathFromUri)) {
                        try {
                            FileInputStream fileInputStream2 = new FileInputStream(new File(realPathFromUri));
                            try {
                                this.f60956c = BitmapCompressor.compress(CompressKit.transformToByteArray(fileInputStream2), this.f108144a, true);
                                try {
                                    fileInputStream2.close();
                                } catch (IOException unused) {
                                }
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
                return this.f60956c;
            }
            throw new UnsupportedOperationException();
        }
    }
}