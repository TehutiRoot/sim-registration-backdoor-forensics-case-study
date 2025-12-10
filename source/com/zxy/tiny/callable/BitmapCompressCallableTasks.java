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
    public static final class BitmapArrayAsBitmapCallable extends AbstractCallableC16832ua {

        /* renamed from: b */
        public Bitmap[] f60934b;

        public BitmapArrayAsBitmapCallable(Tiny.BitmapCompressOptions bitmapCompressOptions, Bitmap[] bitmapArr) {
            super(bitmapCompressOptions);
            this.f60934b = bitmapArr;
        }

        @Override // java.util.concurrent.Callable
        public Bitmap[] call() throws Exception {
            Bitmap[] bitmapArr = this.f60934b;
            if (bitmapArr == null) {
                return null;
            }
            Bitmap[] bitmapArr2 = new Bitmap[bitmapArr.length];
            int i = 0;
            while (true) {
                Bitmap[] bitmapArr3 = this.f60934b;
                if (i >= bitmapArr3.length) {
                    return bitmapArr2;
                }
                bitmapArr2[i] = BitmapCompressor.compress(bitmapArr3[i], this.f107389a, true);
                i++;
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class BitmapAsBitmapCallable extends AbstractCallableC16904va {

        /* renamed from: b */
        public Bitmap f60935b;

        public BitmapAsBitmapCallable(Tiny.BitmapCompressOptions bitmapCompressOptions, Bitmap bitmap) {
            super(bitmapCompressOptions);
            this.f60935b = bitmap;
        }

        @Override // java.util.concurrent.Callable
        public Bitmap call() throws Exception {
            return BitmapCompressor.compress(this.f60935b, this.f107716a, true);
        }
    }

    /* loaded from: classes5.dex */
    public static final class ByteArrayAsBitmapCallable extends AbstractCallableC16904va {

        /* renamed from: b */
        public byte[] f60936b;

        public ByteArrayAsBitmapCallable(Tiny.BitmapCompressOptions bitmapCompressOptions, byte[] bArr) {
            super(bitmapCompressOptions);
            this.f60936b = bArr;
        }

        @Override // java.util.concurrent.Callable
        public Bitmap call() throws Exception {
            return BitmapCompressor.compress(this.f60936b, this.f107716a, true);
        }
    }

    /* loaded from: classes5.dex */
    public static final class FileArrayAsBitmapCallable extends AbstractCallableC16832ua {

        /* renamed from: b */
        public File[] f60937b;

        public FileArrayAsBitmapCallable(Tiny.BitmapCompressOptions bitmapCompressOptions, File[] fileArr) {
            super(bitmapCompressOptions);
            this.f60937b = fileArr;
        }

        @Override // java.util.concurrent.Callable
        public Bitmap[] call() throws Exception {
            File[] fileArr = this.f60937b;
            FileInputStream fileInputStream = null;
            if (fileArr == null) {
                return null;
            }
            Bitmap[] bitmapArr = new Bitmap[fileArr.length];
            int i = 0;
            while (true) {
                File[] fileArr2 = this.f60937b;
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
                            Bitmap compress = BitmapCompressor.compress(CompressKit.transformToByteArray(fileInputStream2), this.f107389a, true);
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
    public static final class FileAsBitmapCallable extends AbstractCallableC16904va {

        /* renamed from: b */
        public File f60938b;

        public FileAsBitmapCallable(Tiny.BitmapCompressOptions bitmapCompressOptions, File file) {
            super(bitmapCompressOptions);
            this.f60938b = file;
        }

        @Override // java.util.concurrent.Callable
        public Bitmap call() throws Exception {
            FileInputStream fileInputStream;
            Throwable th2;
            try {
                fileInputStream = new FileInputStream(this.f60938b);
            } catch (Throwable th3) {
                fileInputStream = null;
                th2 = th3;
            }
            try {
                Bitmap compress = BitmapCompressor.compress(CompressKit.transformToByteArray(fileInputStream), this.f107716a, true);
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
    public static final class InputStreamAsBitmapCallable extends AbstractCallableC16904va {

        /* renamed from: b */
        public InputStream f60939b;

        public InputStreamAsBitmapCallable(Tiny.BitmapCompressOptions bitmapCompressOptions, InputStream inputStream) {
            super(bitmapCompressOptions);
            this.f60939b = inputStream;
        }

        @Override // java.util.concurrent.Callable
        public Bitmap call() throws Exception {
            return BitmapCompressor.compress(CompressKit.transformToByteArray(this.f60939b), this.f107716a, true);
        }
    }

    /* loaded from: classes5.dex */
    public static final class ResourceArrayAsBitmapCallable extends AbstractCallableC16832ua {

        /* renamed from: b */
        public int[] f60940b;

        public ResourceArrayAsBitmapCallable(Tiny.BitmapCompressOptions bitmapCompressOptions, int[] iArr) {
            super(bitmapCompressOptions);
            this.f60940b = iArr;
        }

        @Override // java.util.concurrent.Callable
        public Bitmap[] call() throws Exception {
            int[] iArr = this.f60940b;
            if (iArr == null) {
                return null;
            }
            Bitmap[] bitmapArr = new Bitmap[iArr.length];
            int i = 0;
            while (true) {
                int[] iArr2 = this.f60940b;
                if (i >= iArr2.length) {
                    return bitmapArr;
                }
                bitmapArr[i] = BitmapCompressor.compress(iArr2[i], this.f107389a, true);
                i++;
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class ResourceAsBitmapCallable extends AbstractCallableC16904va {

        /* renamed from: b */
        public int f60941b;

        public ResourceAsBitmapCallable(Tiny.BitmapCompressOptions bitmapCompressOptions, int i) {
            super(bitmapCompressOptions);
            this.f60941b = i;
        }

        @Override // java.util.concurrent.Callable
        public Bitmap call() throws Exception {
            return BitmapCompressor.compress(this.f60941b, this.f107716a, true);
        }
    }

    /* loaded from: classes5.dex */
    public static final class UriArrayAsBitmapCallable extends AbstractCallableC16832ua {

        /* renamed from: b */
        public Uri[] f60942b;

        public UriArrayAsBitmapCallable(Tiny.BitmapCompressOptions bitmapCompressOptions, Uri[] uriArr) {
            super(bitmapCompressOptions);
            this.f60942b = uriArr;
        }

        @Override // java.util.concurrent.Callable
        public Bitmap[] call() throws Exception {
            Uri[] uriArr = this.f60942b;
            if (uriArr == null) {
                return null;
            }
            Bitmap[] bitmapArr = new Bitmap[uriArr.length];
            int i = 0;
            while (true) {
                Uri[] uriArr2 = this.f60942b;
                if (i >= uriArr2.length) {
                    return bitmapArr;
                }
                Uri uri = uriArr2[i];
                if (uri == null) {
                    bitmapArr[i] = null;
                } else {
                    bitmapArr[i] = new UriAsBitmapCallable(this.f107389a, uri).call();
                }
                i++;
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class UriAsBitmapCallable extends AbstractCallableC16904va {

        /* renamed from: b */
        public Uri f60943b;

        /* renamed from: c */
        public Bitmap f60944c;

        public UriAsBitmapCallable(Tiny.BitmapCompressOptions bitmapCompressOptions, Uri uri) {
            super(bitmapCompressOptions);
            this.f60944c = null;
            this.f60943b = uri;
        }

        @Override // java.util.concurrent.Callable
        public Bitmap call() throws Exception {
            if (!UriUtil.isNetworkUri(this.f60943b)) {
                if (UriUtil.isLocalContentUri(this.f60943b) || UriUtil.isLocalFileUri(this.f60943b)) {
                    String realPathFromUri = UriUtil.getRealPathFromUri(this.f60943b);
                    FileInputStream fileInputStream = null;
                    if (TextUtils.isEmpty(realPathFromUri)) {
                        return null;
                    }
                    if (Conditions.fileIsExist(realPathFromUri) && Conditions.fileCanRead(realPathFromUri)) {
                        try {
                            FileInputStream fileInputStream2 = new FileInputStream(new File(realPathFromUri));
                            try {
                                this.f60944c = BitmapCompressor.compress(CompressKit.transformToByteArray(fileInputStream2), this.f107716a, true);
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
                return this.f60944c;
            }
            throw new UnsupportedOperationException();
        }
    }
}
