package id.zelory.compressor;

import android.content.Context;
import android.graphics.Bitmap;
import io.reactivex.Flowable;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
public class Compressor {

    /* renamed from: a */
    public int f62834a = 612;

    /* renamed from: b */
    public int f62835b = 816;

    /* renamed from: c */
    public Bitmap.CompressFormat f62836c = Bitmap.CompressFormat.JPEG;

    /* renamed from: d */
    public int f62837d = 80;

    /* renamed from: e */
    public String f62838e;

    /* renamed from: id.zelory.compressor.Compressor$a */
    /* loaded from: classes5.dex */
    public class CallableC10479a implements Callable {

        /* renamed from: a */
        public final /* synthetic */ File f62839a;

        /* renamed from: b */
        public final /* synthetic */ String f62840b;

        public CallableC10479a(File file, String str) {
            this.f62839a = file;
            this.f62840b = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Flowable call() {
            try {
                return Flowable.just(Compressor.this.compressToFile(this.f62839a, this.f62840b));
            } catch (IOException e) {
                return Flowable.error(e);
            }
        }
    }

    /* renamed from: id.zelory.compressor.Compressor$b */
    /* loaded from: classes5.dex */
    public class CallableC10480b implements Callable {

        /* renamed from: a */
        public final /* synthetic */ File f62842a;

        public CallableC10480b(File file) {
            this.f62842a = file;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Flowable call() {
            try {
                return Flowable.just(Compressor.this.compressToBitmap(this.f62842a));
            } catch (IOException e) {
                return Flowable.error(e);
            }
        }
    }

    public Compressor(Context context) {
        this.f62838e = context.getCacheDir().getPath() + File.separator + "images";
    }

    public Bitmap compressToBitmap(File file) throws IOException {
        return AbstractC21442od0.m25897c(file, this.f62834a, this.f62835b);
    }

    public Flowable<Bitmap> compressToBitmapAsFlowable(File file) {
        return Flowable.defer(new CallableC10480b(file));
    }

    public File compressToFile(File file) throws IOException {
        return compressToFile(file, file.getName());
    }

    public Flowable<File> compressToFileAsFlowable(File file) {
        return compressToFileAsFlowable(file, file.getName());
    }

    public Compressor setCompressFormat(Bitmap.CompressFormat compressFormat) {
        this.f62836c = compressFormat;
        return this;
    }

    public Compressor setDestinationDirectoryPath(String str) {
        this.f62838e = str;
        return this;
    }

    public Compressor setMaxHeight(int i) {
        this.f62835b = i;
        return this;
    }

    public Compressor setMaxWidth(int i) {
        this.f62834a = i;
        return this;
    }

    public Compressor setQuality(int i) {
        this.f62837d = i;
        return this;
    }

    public File compressToFile(File file, String str) throws IOException {
        int i = this.f62834a;
        int i2 = this.f62835b;
        Bitmap.CompressFormat compressFormat = this.f62836c;
        int i3 = this.f62837d;
        return AbstractC21442od0.m25898b(file, i, i2, compressFormat, i3, this.f62838e + File.separator + str);
    }

    public Flowable<File> compressToFileAsFlowable(File file, String str) {
        return Flowable.defer(new CallableC10479a(file, str));
    }
}
