package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import com.bumptech.glide.util.ByteBufferUtil;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes3.dex */
public final class ImageHeaderParserUtils {

    /* renamed from: com.bumptech.glide.load.ImageHeaderParserUtils$a */
    /* loaded from: classes3.dex */
    public class C5754a implements InterfaceC5761h {

        /* renamed from: a */
        public final /* synthetic */ InputStream f41829a;

        public C5754a(InputStream inputStream) {
            this.f41829a = inputStream;
        }

        @Override // com.bumptech.glide.load.ImageHeaderParserUtils.InterfaceC5761h
        /* renamed from: a */
        public ImageHeaderParser.ImageType mo50505a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.getType(this.f41829a);
            } finally {
                this.f41829a.reset();
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.ImageHeaderParserUtils$b */
    /* loaded from: classes3.dex */
    public class C5755b implements InterfaceC5761h {

        /* renamed from: a */
        public final /* synthetic */ ByteBuffer f41830a;

        public C5755b(ByteBuffer byteBuffer) {
            this.f41830a = byteBuffer;
        }

        @Override // com.bumptech.glide.load.ImageHeaderParserUtils.InterfaceC5761h
        /* renamed from: a */
        public ImageHeaderParser.ImageType mo50505a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.getType(this.f41830a);
            } finally {
                ByteBufferUtil.rewind(this.f41830a);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.ImageHeaderParserUtils$c */
    /* loaded from: classes3.dex */
    public class C5756c implements InterfaceC5761h {

        /* renamed from: a */
        public final /* synthetic */ ParcelFileDescriptorRewinder f41831a;

        /* renamed from: b */
        public final /* synthetic */ ArrayPool f41832b;

        public C5756c(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, ArrayPool arrayPool) {
            this.f41831a = parcelFileDescriptorRewinder;
            this.f41832b = arrayPool;
        }

        @Override // com.bumptech.glide.load.ImageHeaderParserUtils.InterfaceC5761h
        /* renamed from: a */
        public ImageHeaderParser.ImageType mo50505a(ImageHeaderParser imageHeaderParser) {
            RecyclableBufferedInputStream recyclableBufferedInputStream;
            RecyclableBufferedInputStream recyclableBufferedInputStream2 = null;
            try {
                recyclableBufferedInputStream = new RecyclableBufferedInputStream(new FileInputStream(this.f41831a.rewindAndGet().getFileDescriptor()), this.f41832b);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                ImageHeaderParser.ImageType type = imageHeaderParser.getType(recyclableBufferedInputStream);
                recyclableBufferedInputStream.release();
                this.f41831a.rewindAndGet();
                return type;
            } catch (Throwable th3) {
                th = th3;
                recyclableBufferedInputStream2 = recyclableBufferedInputStream;
                if (recyclableBufferedInputStream2 != null) {
                    recyclableBufferedInputStream2.release();
                }
                this.f41831a.rewindAndGet();
                throw th;
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.ImageHeaderParserUtils$d */
    /* loaded from: classes3.dex */
    public class C5757d implements InterfaceC5760g {

        /* renamed from: a */
        public final /* synthetic */ ByteBuffer f41833a;

        /* renamed from: b */
        public final /* synthetic */ ArrayPool f41834b;

        public C5757d(ByteBuffer byteBuffer, ArrayPool arrayPool) {
            this.f41833a = byteBuffer;
            this.f41834b = arrayPool;
        }

        @Override // com.bumptech.glide.load.ImageHeaderParserUtils.InterfaceC5760g
        /* renamed from: a */
        public int mo50506a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.getOrientation(this.f41833a, this.f41834b);
            } finally {
                ByteBufferUtil.rewind(this.f41833a);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.ImageHeaderParserUtils$e */
    /* loaded from: classes3.dex */
    public class C5758e implements InterfaceC5760g {

        /* renamed from: a */
        public final /* synthetic */ InputStream f41835a;

        /* renamed from: b */
        public final /* synthetic */ ArrayPool f41836b;

        public C5758e(InputStream inputStream, ArrayPool arrayPool) {
            this.f41835a = inputStream;
            this.f41836b = arrayPool;
        }

        @Override // com.bumptech.glide.load.ImageHeaderParserUtils.InterfaceC5760g
        /* renamed from: a */
        public int mo50506a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.getOrientation(this.f41835a, this.f41836b);
            } finally {
                this.f41835a.reset();
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.ImageHeaderParserUtils$f */
    /* loaded from: classes3.dex */
    public class C5759f implements InterfaceC5760g {

        /* renamed from: a */
        public final /* synthetic */ ParcelFileDescriptorRewinder f41837a;

        /* renamed from: b */
        public final /* synthetic */ ArrayPool f41838b;

        public C5759f(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, ArrayPool arrayPool) {
            this.f41837a = parcelFileDescriptorRewinder;
            this.f41838b = arrayPool;
        }

        @Override // com.bumptech.glide.load.ImageHeaderParserUtils.InterfaceC5760g
        /* renamed from: a */
        public int mo50506a(ImageHeaderParser imageHeaderParser) {
            RecyclableBufferedInputStream recyclableBufferedInputStream;
            RecyclableBufferedInputStream recyclableBufferedInputStream2 = null;
            try {
                recyclableBufferedInputStream = new RecyclableBufferedInputStream(new FileInputStream(this.f41837a.rewindAndGet().getFileDescriptor()), this.f41838b);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                int orientation = imageHeaderParser.getOrientation(recyclableBufferedInputStream, this.f41838b);
                recyclableBufferedInputStream.release();
                this.f41837a.rewindAndGet();
                return orientation;
            } catch (Throwable th3) {
                th = th3;
                recyclableBufferedInputStream2 = recyclableBufferedInputStream;
                if (recyclableBufferedInputStream2 != null) {
                    recyclableBufferedInputStream2.release();
                }
                this.f41837a.rewindAndGet();
                throw th;
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.ImageHeaderParserUtils$g */
    /* loaded from: classes3.dex */
    public interface InterfaceC5760g {
        /* renamed from: a */
        int mo50506a(ImageHeaderParser imageHeaderParser);
    }

    /* renamed from: com.bumptech.glide.load.ImageHeaderParserUtils$h */
    /* loaded from: classes3.dex */
    public interface InterfaceC5761h {
        /* renamed from: a */
        ImageHeaderParser.ImageType mo50505a(ImageHeaderParser imageHeaderParser);
    }

    /* renamed from: a */
    public static int m50508a(List list, InterfaceC5760g interfaceC5760g) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int mo50506a = interfaceC5760g.mo50506a((ImageHeaderParser) list.get(i));
            if (mo50506a != -1) {
                return mo50506a;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public static ImageHeaderParser.ImageType m50507b(List list, InterfaceC5761h interfaceC5761h) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser.ImageType mo50505a = interfaceC5761h.mo50505a((ImageHeaderParser) list.get(i));
            if (mo50505a != ImageHeaderParser.ImageType.UNKNOWN) {
                return mo50505a;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public static int getOrientation(@NonNull List<ImageHeaderParser> list, @Nullable ByteBuffer byteBuffer, @NonNull ArrayPool arrayPool) throws IOException {
        if (byteBuffer == null) {
            return -1;
        }
        return m50508a(list, new C5757d(byteBuffer, arrayPool));
    }

    @NonNull
    public static ImageHeaderParser.ImageType getType(@NonNull List<ImageHeaderParser> list, @Nullable InputStream inputStream, @NonNull ArrayPool arrayPool) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, arrayPool);
        }
        inputStream.mark(5242880);
        return m50507b(list, new C5754a(inputStream));
    }

    public static int getOrientation(@NonNull List<ImageHeaderParser> list, @Nullable InputStream inputStream, @NonNull ArrayPool arrayPool) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, arrayPool);
        }
        inputStream.mark(5242880);
        return m50508a(list, new C5758e(inputStream, arrayPool));
    }

    @RequiresApi(21)
    public static int getOrientation(@NonNull List<ImageHeaderParser> list, @NonNull ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, @NonNull ArrayPool arrayPool) throws IOException {
        return m50508a(list, new C5759f(parcelFileDescriptorRewinder, arrayPool));
    }

    @NonNull
    public static ImageHeaderParser.ImageType getType(@NonNull List<ImageHeaderParser> list, @Nullable ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        return m50507b(list, new C5755b(byteBuffer));
    }

    @NonNull
    @RequiresApi(21)
    public static ImageHeaderParser.ImageType getType(@NonNull List<ImageHeaderParser> list, @NonNull ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, @NonNull ArrayPool arrayPool) throws IOException {
        return m50507b(list, new C5756c(parcelFileDescriptorRewinder, arrayPool));
    }
}
