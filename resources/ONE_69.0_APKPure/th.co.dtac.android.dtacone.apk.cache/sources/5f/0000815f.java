package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParserUtils;
import com.bumptech.glide.load.data.InputStreamRewinder;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.util.ByteBufferUtil;
import com.bumptech.glide.util.Preconditions;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes3.dex */
public interface ImageReader {

    /* loaded from: classes3.dex */
    public static final class ByteArrayReader implements ImageReader {

        /* renamed from: a */
        public final byte[] f42355a;

        /* renamed from: b */
        public final List f42356b;

        /* renamed from: c */
        public final ArrayPool f42357c;

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        @Nullable
        public Bitmap decodeBitmap(BitmapFactory.Options options) {
            byte[] bArr = this.f42355a;
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public int getImageOrientation() throws IOException {
            return ImageHeaderParserUtils.getOrientation(this.f42356b, ByteBuffer.wrap(this.f42355a), this.f42357c);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public ImageHeaderParser.ImageType getImageType() throws IOException {
            return ImageHeaderParserUtils.getType(this.f42356b, ByteBuffer.wrap(this.f42355a));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public void stopGrowingBuffers() {
        }
    }

    /* loaded from: classes3.dex */
    public static final class ByteBufferReader implements ImageReader {

        /* renamed from: a */
        public final ByteBuffer f42358a;

        /* renamed from: b */
        public final List f42359b;

        /* renamed from: c */
        public final ArrayPool f42360c;

        public ByteBufferReader(ByteBuffer byteBuffer, List list, ArrayPool arrayPool) {
            this.f42358a = byteBuffer;
            this.f42359b = list;
            this.f42360c = arrayPool;
        }

        /* renamed from: a */
        public final InputStream m50202a() {
            return ByteBufferUtil.toStream(ByteBufferUtil.rewind(this.f42358a));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        @Nullable
        public Bitmap decodeBitmap(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(m50202a(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public int getImageOrientation() throws IOException {
            return ImageHeaderParserUtils.getOrientation(this.f42359b, ByteBufferUtil.rewind(this.f42358a), this.f42360c);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public ImageHeaderParser.ImageType getImageType() throws IOException {
            return ImageHeaderParserUtils.getType(this.f42359b, ByteBufferUtil.rewind(this.f42358a));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public void stopGrowingBuffers() {
        }
    }

    /* loaded from: classes3.dex */
    public static final class FileReader implements ImageReader {

        /* renamed from: a */
        public final File f42361a;

        /* renamed from: b */
        public final List f42362b;

        /* renamed from: c */
        public final ArrayPool f42363c;

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        @Nullable
        public Bitmap decodeBitmap(BitmapFactory.Options options) throws FileNotFoundException {
            RecyclableBufferedInputStream recyclableBufferedInputStream;
            RecyclableBufferedInputStream recyclableBufferedInputStream2 = null;
            try {
                recyclableBufferedInputStream = new RecyclableBufferedInputStream(new FileInputStream(this.f42361a), this.f42363c);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(recyclableBufferedInputStream, null, options);
                try {
                    recyclableBufferedInputStream.close();
                } catch (IOException unused) {
                }
                return decodeStream;
            } catch (Throwable th3) {
                th = th3;
                recyclableBufferedInputStream2 = recyclableBufferedInputStream;
                if (recyclableBufferedInputStream2 != null) {
                    try {
                        recyclableBufferedInputStream2.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public int getImageOrientation() throws IOException {
            RecyclableBufferedInputStream recyclableBufferedInputStream;
            Throwable th2;
            try {
                recyclableBufferedInputStream = new RecyclableBufferedInputStream(new FileInputStream(this.f42361a), this.f42363c);
            } catch (Throwable th3) {
                recyclableBufferedInputStream = null;
                th2 = th3;
            }
            try {
                int orientation = ImageHeaderParserUtils.getOrientation(this.f42362b, recyclableBufferedInputStream, this.f42363c);
                try {
                    recyclableBufferedInputStream.close();
                } catch (IOException unused) {
                }
                return orientation;
            } catch (Throwable th4) {
                th2 = th4;
                if (recyclableBufferedInputStream != null) {
                    try {
                        recyclableBufferedInputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th2;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public ImageHeaderParser.ImageType getImageType() throws IOException {
            RecyclableBufferedInputStream recyclableBufferedInputStream;
            Throwable th2;
            try {
                recyclableBufferedInputStream = new RecyclableBufferedInputStream(new FileInputStream(this.f42361a), this.f42363c);
            } catch (Throwable th3) {
                recyclableBufferedInputStream = null;
                th2 = th3;
            }
            try {
                ImageHeaderParser.ImageType type = ImageHeaderParserUtils.getType(this.f42362b, recyclableBufferedInputStream, this.f42363c);
                try {
                    recyclableBufferedInputStream.close();
                } catch (IOException unused) {
                }
                return type;
            } catch (Throwable th4) {
                th2 = th4;
                if (recyclableBufferedInputStream != null) {
                    try {
                        recyclableBufferedInputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th2;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public void stopGrowingBuffers() {
        }
    }

    /* loaded from: classes3.dex */
    public static final class InputStreamImageReader implements ImageReader {

        /* renamed from: a */
        public final InputStreamRewinder f42364a;

        /* renamed from: b */
        public final ArrayPool f42365b;

        /* renamed from: c */
        public final List f42366c;

        public InputStreamImageReader(InputStream inputStream, List list, ArrayPool arrayPool) {
            this.f42365b = (ArrayPool) Preconditions.checkNotNull(arrayPool);
            this.f42366c = (List) Preconditions.checkNotNull(list);
            this.f42364a = new InputStreamRewinder(inputStream, arrayPool);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        @Nullable
        public Bitmap decodeBitmap(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeStream(this.f42364a.rewindAndGet(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public int getImageOrientation() throws IOException {
            return ImageHeaderParserUtils.getOrientation(this.f42366c, this.f42364a.rewindAndGet(), this.f42365b);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public ImageHeaderParser.ImageType getImageType() throws IOException {
            return ImageHeaderParserUtils.getType(this.f42366c, this.f42364a.rewindAndGet(), this.f42365b);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public void stopGrowingBuffers() {
            this.f42364a.fixMarkLimits();
        }
    }

    @RequiresApi(21)
    /* loaded from: classes3.dex */
    public static final class ParcelFileDescriptorImageReader implements ImageReader {

        /* renamed from: a */
        public final ArrayPool f42367a;

        /* renamed from: b */
        public final List f42368b;

        /* renamed from: c */
        public final ParcelFileDescriptorRewinder f42369c;

        public ParcelFileDescriptorImageReader(ParcelFileDescriptor parcelFileDescriptor, List list, ArrayPool arrayPool) {
            this.f42367a = (ArrayPool) Preconditions.checkNotNull(arrayPool);
            this.f42368b = (List) Preconditions.checkNotNull(list);
            this.f42369c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        @Nullable
        public Bitmap decodeBitmap(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.f42369c.rewindAndGet().getFileDescriptor(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public int getImageOrientation() throws IOException {
            return ImageHeaderParserUtils.getOrientation(this.f42368b, this.f42369c, this.f42367a);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public ImageHeaderParser.ImageType getImageType() throws IOException {
            return ImageHeaderParserUtils.getType(this.f42368b, this.f42369c, this.f42367a);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public void stopGrowingBuffers() {
        }
    }

    Bitmap decodeBitmap(BitmapFactory.Options options);

    int getImageOrientation();

    ImageHeaderParser.ImageType getImageType();

    void stopGrowingBuffers();
}