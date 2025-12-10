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
    public int f62890a = 612;

    /* renamed from: b */
    public int f62891b = 816;

    /* renamed from: c */
    public Bitmap.CompressFormat f62892c = Bitmap.CompressFormat.JPEG;

    /* renamed from: d */
    public int f62893d = 80;

    /* renamed from: e */
    public String f62894e;

    /* renamed from: id.zelory.compressor.Compressor$a */
    /* loaded from: classes5.dex */
    public class CallableC10466a implements Callable {

        /* renamed from: a */
        public final /* synthetic */ File f62895a;

        /* renamed from: b */
        public final /* synthetic */ String f62896b;

        public CallableC10466a(File file, String str) {
            this.f62895a = file;
            this.f62896b = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Flowable call() {
            try {
                return Flowable.just(Compressor.this.compressToFile(this.f62895a, this.f62896b));
            } catch (IOException e) {
                return Flowable.error(e);
            }
        }
    }

    /* renamed from: id.zelory.compressor.Compressor$b */
    /* loaded from: classes5.dex */
    public class CallableC10467b implements Callable {

        /* renamed from: a */
        public final /* synthetic */ File f62898a;

        public CallableC10467b(File file) {
            this.f62898a = file;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Flowable call() {
            try {
                return Flowable.just(Compressor.this.compressToBitmap(this.f62898a));
            } catch (IOException e) {
                return Flowable.error(e);
            }
        }
    }

    public Compressor(Context context) {
        this.f62894e = context.getCacheDir().getPath() + File.separator + "images";
    }

    public Bitmap compressToBitmap(File file) throws IOException {
        return AbstractC22541ud0.m1083c(file, this.f62890a, this.f62891b);
    }

    public Flowable<Bitmap> compressToBitmapAsFlowable(File file) {
        return Flowable.defer(new CallableC10467b(file));
    }

    public File compressToFile(File file) throws IOException {
        return compressToFile(file, file.getName());
    }

    public Flowable<File> compressToFileAsFlowable(File file) {
        return compressToFileAsFlowable(file, file.getName());
    }

    public Compressor setCompressFormat(Bitmap.CompressFormat compressFormat) {
        this.f62892c = compressFormat;
        return this;
    }

    public Compressor setDestinationDirectoryPath(String str) {
        this.f62894e = str;
        return this;
    }

    public Compressor setMaxHeight(int i) {
        this.f62891b = i;
        return this;
    }

    public Compressor setMaxWidth(int i) {
        this.f62890a = i;
        return this;
    }

    public Compressor setQuality(int i) {
        this.f62893d = i;
        return this;
    }

    public File compressToFile(File file, String str) throws IOException {
        int i = this.f62890a;
        int i2 = this.f62891b;
        Bitmap.CompressFormat compressFormat = this.f62892c;
        int i3 = this.f62893d;
        return AbstractC22541ud0.m1084b(file, i, i2, compressFormat, i3, this.f62894e + File.separator + str);
    }

    public Flowable<File> compressToFileAsFlowable(File file, String str) {
        return Flowable.defer(new CallableC10466a(file, str));
    }
}