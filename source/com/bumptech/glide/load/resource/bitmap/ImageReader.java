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
        public final byte[] f42343a;

        /* renamed from: b */
        public final List f42344b;

        /* renamed from: c */
        public final ArrayPool f42345c;

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        @Nullable
        public Bitmap decodeBitmap(BitmapFactory.Options options) {
            byte[] bArr = this.f42343a;
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public int getImageOrientation() throws IOException {
            return ImageHeaderParserUtils.getOrientation(this.f42344b, ByteBuffer.wrap(this.f42343a), this.f42345c);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public ImageHeaderParser.ImageType getImageType() throws IOException {
            return ImageHeaderParserUtils.getType(this.f42344b, ByteBuffer.wrap(this.f42343a));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public void stopGrowingBuffers() {
        }
    }

    /* loaded from: classes3.dex */
    public static final class ByteBufferReader implements ImageReader {

        /* renamed from: a */
        public final ByteBuffer f42346a;

        /* renamed from: b */
        public final List f42347b;

        /* renamed from: c */
        public final ArrayPool f42348c;

        public ByteBufferReader(ByteBuffer byteBuffer, List list, ArrayPool arrayPool) {
            this.f42346a = byteBuffer;
            this.f42347b = list;
            this.f42348c = arrayPool;
        }

        /* renamed from: a */
        public final InputStream m50205a() {
            return ByteBufferUtil.toStream(ByteBufferUtil.rewind(this.f42346a));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        @Nullable
        public Bitmap decodeBitmap(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(m50205a(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public int getImageOrientation() throws IOException {
            return ImageHeaderParserUtils.getOrientation(this.f42347b, ByteBufferUtil.rewind(this.f42346a), this.f42348c);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public ImageHeaderParser.ImageType getImageType() throws IOException {
            return ImageHeaderParserUtils.getType(this.f42347b, ByteBufferUtil.rewind(this.f42346a));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public void stopGrowingBuffers() {
        }
    }

    /* loaded from: classes3.dex */
    public static final class FileReader implements ImageReader {

        /* renamed from: a */
        public final File f42349a;

        /* renamed from: b */
        public final List f42350b;

        /* renamed from: c */
        public final ArrayPool f42351c;

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        @Nullable
        public Bitmap decodeBitmap(BitmapFactory.Options options) throws FileNotFoundException {
            RecyclableBufferedInputStream recyclableBufferedInputStream;
            RecyclableBufferedInputStream recyclableBufferedInputStream2 = null;
            try {
                recyclableBufferedInputStream = new RecyclableBufferedInputStream(new FileInputStream(this.f42349a), this.f42351c);
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
                recyclableBufferedInputStream = new RecyclableBufferedInputStream(new FileInputStream(this.f42349a), this.f42351c);
            } catch (Throwable th3) {
                recyclableBufferedInputStream = null;
                th2 = th3;
            }
            try {
                int orientation = ImageHeaderParserUtils.getOrientation(this.f42350b, recyclableBufferedInputStream, this.f42351c);
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
                recyclableBufferedInputStream = new RecyclableBufferedInputStream(new FileInputStream(this.f42349a), this.f42351c);
            } catch (Throwable th3) {
                recyclableBufferedInputStream = null;
                th2 = th3;
            }
            try {
                ImageHeaderParser.ImageType type = ImageHeaderParserUtils.getType(this.f42350b, recyclableBufferedInputStream, this.f42351c);
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
        public final InputStreamRewinder f42352a;

        /* renamed from: b */
        public final ArrayPool f42353b;

        /* renamed from: c */
        public final List f42354c;

        public InputStreamImageReader(InputStream inputStream, List list, ArrayPool arrayPool) {
            this.f42353b = (ArrayPool) Preconditions.checkNotNull(arrayPool);
            this.f42354c = (List) Preconditions.checkNotNull(list);
            this.f42352a = new InputStreamRewinder(inputStream, arrayPool);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        @Nullable
        public Bitmap decodeBitmap(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeStream(this.f42352a.rewindAndGet(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public int getImageOrientation() throws IOException {
            return ImageHeaderParserUtils.getOrientation(this.f42354c, this.f42352a.rewindAndGet(), this.f42353b);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public ImageHeaderParser.ImageType getImageType() throws IOException {
            return ImageHeaderParserUtils.getType(this.f42354c, this.f42352a.rewindAndGet(), this.f42353b);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public void stopGrowingBuffers() {
            this.f42352a.fixMarkLimits();
        }
    }

    @RequiresApi(21)
    /* loaded from: classes3.dex */
    public static final class ParcelFileDescriptorImageReader implements ImageReader {

        /* renamed from: a */
        public final ArrayPool f42355a;

        /* renamed from: b */
        public final List f42356b;

        /* renamed from: c */
        public final ParcelFileDescriptorRewinder f42357c;

        public ParcelFileDescriptorImageReader(ParcelFileDescriptor parcelFileDescriptor, List list, ArrayPool arrayPool) {
            this.f42355a = (ArrayPool) Preconditions.checkNotNull(arrayPool);
            this.f42356b = (List) Preconditions.checkNotNull(list);
            this.f42357c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        @Nullable
        public Bitmap decodeBitmap(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.f42357c.rewindAndGet().getFileDescriptor(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public int getImageOrientation() throws IOException {
            return ImageHeaderParserUtils.getOrientation(this.f42356b, this.f42357c, this.f42355a);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public ImageHeaderParser.ImageType getImageType() throws IOException {
            return ImageHeaderParserUtils.getType(this.f42356b, this.f42357c, this.f42355a);
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
