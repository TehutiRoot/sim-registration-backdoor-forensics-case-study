package androidx.print;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.pdf.PdfDocument;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentInfo;
import android.print.PrintManager;
import android.print.pdf.PrintedPdfDocument;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDWindowsLaunchParams;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class PrintHelper {
    @SuppressLint({"InlinedApi"})
    public static final int COLOR_MODE_COLOR = 2;
    @SuppressLint({"InlinedApi"})
    public static final int COLOR_MODE_MONOCHROME = 1;
    public static final int ORIENTATION_LANDSCAPE = 1;
    public static final int ORIENTATION_PORTRAIT = 2;
    public static final int SCALE_MODE_FILL = 2;
    public static final int SCALE_MODE_FIT = 1;

    /* renamed from: g */
    public static final boolean f36566g;

    /* renamed from: h */
    public static final boolean f36567h;

    /* renamed from: a */
    public final Context f36568a;

    /* renamed from: b */
    public BitmapFactory.Options f36569b = null;

    /* renamed from: c */
    public final Object f36570c = new Object();

    /* renamed from: d */
    public int f36571d = 2;

    /* renamed from: e */
    public int f36572e = 2;

    /* renamed from: f */
    public int f36573f = 1;

    /* loaded from: classes2.dex */
    public interface OnPrintFinishCallback {
        void onFinish();
    }

    /* renamed from: androidx.print.PrintHelper$a */
    /* loaded from: classes2.dex */
    public class AsyncTaskC4836a extends AsyncTask {

        /* renamed from: a */
        public final /* synthetic */ CancellationSignal f36574a;

        /* renamed from: b */
        public final /* synthetic */ PrintAttributes f36575b;

        /* renamed from: c */
        public final /* synthetic */ Bitmap f36576c;

        /* renamed from: d */
        public final /* synthetic */ PrintAttributes f36577d;

        /* renamed from: e */
        public final /* synthetic */ int f36578e;

        /* renamed from: f */
        public final /* synthetic */ ParcelFileDescriptor f36579f;

        /* renamed from: g */
        public final /* synthetic */ PrintDocumentAdapter.WriteResultCallback f36580g;

        public AsyncTaskC4836a(CancellationSignal cancellationSignal, PrintAttributes printAttributes, Bitmap bitmap, PrintAttributes printAttributes2, int i, ParcelFileDescriptor parcelFileDescriptor, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            this.f36574a = cancellationSignal;
            this.f36575b = printAttributes;
            this.f36576c = bitmap;
            this.f36577d = printAttributes2;
            this.f36578e = i;
            this.f36579f = parcelFileDescriptor;
            this.f36580g = writeResultCallback;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a */
        public Throwable doInBackground(Void... voidArr) {
            RectF rectF;
            try {
                if (this.f36574a.isCanceled()) {
                    return null;
                }
                PrintedPdfDocument printedPdfDocument = new PrintedPdfDocument(PrintHelper.this.f36568a, this.f36575b);
                Bitmap m53719a = PrintHelper.m53719a(this.f36576c, this.f36575b.getColorMode());
                if (this.f36574a.isCanceled()) {
                    return null;
                }
                PdfDocument.Page startPage = printedPdfDocument.startPage(1);
                boolean z = PrintHelper.f36567h;
                if (z) {
                    rectF = new RectF(startPage.getInfo().getContentRect());
                } else {
                    PrintedPdfDocument printedPdfDocument2 = new PrintedPdfDocument(PrintHelper.this.f36568a, this.f36577d);
                    PdfDocument.Page startPage2 = printedPdfDocument2.startPage(1);
                    RectF rectF2 = new RectF(startPage2.getInfo().getContentRect());
                    printedPdfDocument2.finishPage(startPage2);
                    printedPdfDocument2.close();
                    rectF = rectF2;
                }
                Matrix m53717c = PrintHelper.m53717c(m53719a.getWidth(), m53719a.getHeight(), rectF, this.f36578e);
                if (!z) {
                    m53717c.postTranslate(rectF.left, rectF.top);
                    startPage.getCanvas().clipRect(rectF);
                }
                startPage.getCanvas().drawBitmap(m53719a, m53717c, null);
                printedPdfDocument.finishPage(startPage);
                if (this.f36574a.isCanceled()) {
                    printedPdfDocument.close();
                    ParcelFileDescriptor parcelFileDescriptor = this.f36579f;
                    if (parcelFileDescriptor != null) {
                        try {
                            parcelFileDescriptor.close();
                        } catch (IOException unused) {
                        }
                    }
                    if (m53719a != this.f36576c) {
                        m53719a.recycle();
                    }
                    return null;
                }
                printedPdfDocument.writeTo(new FileOutputStream(this.f36579f.getFileDescriptor()));
                printedPdfDocument.close();
                ParcelFileDescriptor parcelFileDescriptor2 = this.f36579f;
                if (parcelFileDescriptor2 != null) {
                    try {
                        parcelFileDescriptor2.close();
                    } catch (IOException unused2) {
                    }
                }
                if (m53719a != this.f36576c) {
                    m53719a.recycle();
                }
                return null;
            } catch (Throwable th2) {
                return th2;
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b */
        public void onPostExecute(Throwable th2) {
            if (this.f36574a.isCanceled()) {
                this.f36580g.onWriteCancelled();
            } else if (th2 == null) {
                this.f36580g.onWriteFinished(new PageRange[]{PageRange.ALL_PAGES});
            } else {
                this.f36580g.onWriteFailed(null);
            }
        }
    }

    /* renamed from: androidx.print.PrintHelper$b */
    /* loaded from: classes2.dex */
    public class C4837b extends PrintDocumentAdapter {

        /* renamed from: a */
        public final String f36582a;

        /* renamed from: b */
        public final int f36583b;

        /* renamed from: c */
        public final Bitmap f36584c;

        /* renamed from: d */
        public final OnPrintFinishCallback f36585d;

        /* renamed from: e */
        public PrintAttributes f36586e;

        public C4837b(String str, int i, Bitmap bitmap, OnPrintFinishCallback onPrintFinishCallback) {
            this.f36582a = str;
            this.f36583b = i;
            this.f36584c = bitmap;
            this.f36585d = onPrintFinishCallback;
        }

        @Override // android.print.PrintDocumentAdapter
        public void onFinish() {
            OnPrintFinishCallback onPrintFinishCallback = this.f36585d;
            if (onPrintFinishCallback != null) {
                onPrintFinishCallback.onFinish();
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
            this.f36586e = printAttributes2;
            layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(this.f36582a).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
        }

        @Override // android.print.PrintDocumentAdapter
        public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            PrintHelper.this.m53713g(this.f36586e, this.f36583b, this.f36584c, parcelFileDescriptor, cancellationSignal, writeResultCallback);
        }
    }

    /* renamed from: androidx.print.PrintHelper$c */
    /* loaded from: classes2.dex */
    public class C4838c extends PrintDocumentAdapter {

        /* renamed from: a */
        public final String f36588a;

        /* renamed from: b */
        public final Uri f36589b;

        /* renamed from: c */
        public final OnPrintFinishCallback f36590c;

        /* renamed from: d */
        public final int f36591d;

        /* renamed from: e */
        public PrintAttributes f36592e;

        /* renamed from: f */
        public AsyncTask f36593f;

        /* renamed from: g */
        public Bitmap f36594g = null;

        /* renamed from: androidx.print.PrintHelper$c$a */
        /* loaded from: classes2.dex */
        public class AsyncTaskC4839a extends AsyncTask {

            /* renamed from: a */
            public final /* synthetic */ CancellationSignal f36596a;

            /* renamed from: b */
            public final /* synthetic */ PrintAttributes f36597b;

            /* renamed from: c */
            public final /* synthetic */ PrintAttributes f36598c;

            /* renamed from: d */
            public final /* synthetic */ PrintDocumentAdapter.LayoutResultCallback f36599d;

            /* renamed from: androidx.print.PrintHelper$c$a$a */
            /* loaded from: classes2.dex */
            public class C4840a implements CancellationSignal.OnCancelListener {
                public C4840a() {
                }

                @Override // android.os.CancellationSignal.OnCancelListener
                public void onCancel() {
                    C4838c.this.m53710a();
                    AsyncTaskC4839a.this.cancel(false);
                }
            }

            public AsyncTaskC4839a(CancellationSignal cancellationSignal, PrintAttributes printAttributes, PrintAttributes printAttributes2, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback) {
                this.f36596a = cancellationSignal;
                this.f36597b = printAttributes;
                this.f36598c = printAttributes2;
                this.f36599d = layoutResultCallback;
            }

            @Override // android.os.AsyncTask
            /* renamed from: a */
            public Bitmap doInBackground(Uri... uriArr) {
                try {
                    C4838c c4838c = C4838c.this;
                    return PrintHelper.this.m53714f(c4838c.f36589b);
                } catch (FileNotFoundException unused) {
                    return null;
                }
            }

            @Override // android.os.AsyncTask
            /* renamed from: b */
            public void onCancelled(Bitmap bitmap) {
                this.f36599d.onLayoutCancelled();
                C4838c.this.f36593f = null;
            }

            @Override // android.os.AsyncTask
            /* renamed from: c */
            public void onPostExecute(Bitmap bitmap) {
                PrintAttributes.MediaSize mediaSize;
                super.onPostExecute(bitmap);
                if (bitmap != null && (!PrintHelper.f36566g || PrintHelper.this.f36573f == 0)) {
                    synchronized (this) {
                        mediaSize = C4838c.this.f36592e.getMediaSize();
                    }
                    if (mediaSize != null && mediaSize.isPortrait() != PrintHelper.m53716d(bitmap)) {
                        Matrix matrix = new Matrix();
                        matrix.postRotate(90.0f);
                        bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                    }
                }
                C4838c.this.f36594g = bitmap;
                if (bitmap != null) {
                    this.f36599d.onLayoutFinished(new PrintDocumentInfo.Builder(C4838c.this.f36588a).setContentType(1).setPageCount(1).build(), true ^ this.f36597b.equals(this.f36598c));
                } else {
                    this.f36599d.onLayoutFailed(null);
                }
                C4838c.this.f36593f = null;
            }

            @Override // android.os.AsyncTask
            public void onPreExecute() {
                this.f36596a.setOnCancelListener(new C4840a());
            }
        }

        public C4838c(String str, Uri uri, OnPrintFinishCallback onPrintFinishCallback, int i) {
            this.f36588a = str;
            this.f36589b = uri;
            this.f36590c = onPrintFinishCallback;
            this.f36591d = i;
        }

        /* renamed from: a */
        public void m53710a() {
            synchronized (PrintHelper.this.f36570c) {
                try {
                    BitmapFactory.Options options = PrintHelper.this.f36569b;
                    if (options != null) {
                        if (Build.VERSION.SDK_INT < 24) {
                            options.requestCancelDecode();
                        }
                        PrintHelper.this.f36569b = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onFinish() {
            super.onFinish();
            m53710a();
            AsyncTask asyncTask = this.f36593f;
            if (asyncTask != null) {
                asyncTask.cancel(true);
            }
            OnPrintFinishCallback onPrintFinishCallback = this.f36590c;
            if (onPrintFinishCallback != null) {
                onPrintFinishCallback.onFinish();
            }
            Bitmap bitmap = this.f36594g;
            if (bitmap != null) {
                bitmap.recycle();
                this.f36594g = null;
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
            synchronized (this) {
                this.f36592e = printAttributes2;
            }
            if (cancellationSignal.isCanceled()) {
                layoutResultCallback.onLayoutCancelled();
            } else if (this.f36594g != null) {
                layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(this.f36588a).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
            } else {
                this.f36593f = new AsyncTaskC4839a(cancellationSignal, printAttributes2, printAttributes, layoutResultCallback).execute(new Uri[0]);
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            PrintHelper.this.m53713g(this.f36592e, this.f36591d, this.f36594g, parcelFileDescriptor, cancellationSignal, writeResultCallback);
        }
    }

    static {
        boolean z;
        int i = Build.VERSION.SDK_INT;
        boolean z2 = true;
        if (i > 23) {
            z = true;
        } else {
            z = false;
        }
        f36566g = z;
        if (i == 23) {
            z2 = false;
        }
        f36567h = z2;
    }

    public PrintHelper(@NonNull Context context) {
        this.f36568a = context;
    }

    /* renamed from: a */
    public static Bitmap m53719a(Bitmap bitmap, int i) {
        if (i != 1) {
            return bitmap;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    /* renamed from: b */
    public static PrintAttributes.Builder m53718b(PrintAttributes printAttributes) {
        int duplexMode;
        int duplexMode2;
        PrintAttributes.Builder minMargins = new PrintAttributes.Builder().setMediaSize(printAttributes.getMediaSize()).setResolution(printAttributes.getResolution()).setMinMargins(printAttributes.getMinMargins());
        if (printAttributes.getColorMode() != 0) {
            minMargins.setColorMode(printAttributes.getColorMode());
        }
        if (Build.VERSION.SDK_INT >= 23) {
            duplexMode = printAttributes.getDuplexMode();
            if (duplexMode != 0) {
                duplexMode2 = printAttributes.getDuplexMode();
                minMargins.setDuplexMode(duplexMode2);
            }
        }
        return minMargins;
    }

    /* renamed from: c */
    public static Matrix m53717c(int i, int i2, RectF rectF, int i3) {
        float min;
        Matrix matrix = new Matrix();
        float f = i;
        float width = rectF.width() / f;
        if (i3 == 2) {
            min = Math.max(width, rectF.height() / i2);
        } else {
            min = Math.min(width, rectF.height() / i2);
        }
        matrix.postScale(min, min);
        matrix.postTranslate((rectF.width() - (f * min)) / 2.0f, (rectF.height() - (i2 * min)) / 2.0f);
        return matrix;
    }

    /* renamed from: d */
    public static boolean m53716d(Bitmap bitmap) {
        if (bitmap.getWidth() <= bitmap.getHeight()) {
            return true;
        }
        return false;
    }

    public static boolean systemSupportsPrint() {
        return true;
    }

    /* renamed from: e */
    public final Bitmap m53715e(Uri uri, BitmapFactory.Options options) {
        Context context;
        InputStream openInputStream;
        if (uri != null && (context = this.f36568a) != null) {
            InputStream inputStream = null;
            try {
                openInputStream = context.getContentResolver().openInputStream(uri);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream, null, options);
                if (openInputStream != null) {
                    try {
                        openInputStream.close();
                    } catch (IOException e) {
                        Log.w("PrintHelper", "close fail ", e);
                    }
                }
                return decodeStream;
            } catch (Throwable th3) {
                th = th3;
                inputStream = openInputStream;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e2) {
                        Log.w("PrintHelper", "close fail ", e2);
                    }
                }
                throw th;
            }
        }
        throw new IllegalArgumentException("bad argument to loadBitmap");
    }

    /* renamed from: f */
    public Bitmap m53714f(Uri uri) {
        BitmapFactory.Options options;
        if (uri != null && this.f36568a != null) {
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inJustDecodeBounds = true;
            m53715e(uri, options2);
            int i = options2.outWidth;
            int i2 = options2.outHeight;
            if (i > 0 && i2 > 0) {
                int max = Math.max(i, i2);
                int i3 = 1;
                while (max > 3500) {
                    max >>>= 1;
                    i3 <<= 1;
                }
                if (i3 > 0 && Math.min(i, i2) / i3 > 0) {
                    synchronized (this.f36570c) {
                        options = new BitmapFactory.Options();
                        this.f36569b = options;
                        options.inMutable = true;
                        options.inSampleSize = i3;
                    }
                    try {
                        Bitmap m53715e = m53715e(uri, options);
                        synchronized (this.f36570c) {
                            this.f36569b = null;
                        }
                        return m53715e;
                    } catch (Throwable th2) {
                        synchronized (this.f36570c) {
                            this.f36569b = null;
                            throw th2;
                        }
                    }
                }
            }
            return null;
        }
        throw new IllegalArgumentException("bad argument to getScaledBitmap");
    }

    /* renamed from: g */
    public void m53713g(PrintAttributes printAttributes, int i, Bitmap bitmap, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
        PrintAttributes build;
        if (f36567h) {
            build = printAttributes;
        } else {
            build = m53718b(printAttributes).setMinMargins(new PrintAttributes.Margins(0, 0, 0, 0)).build();
        }
        new AsyncTaskC4836a(cancellationSignal, build, bitmap, printAttributes, i, parcelFileDescriptor, writeResultCallback).execute(new Void[0]);
    }

    public int getColorMode() {
        return this.f36572e;
    }

    public int getOrientation() {
        int i = this.f36573f;
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public int getScaleMode() {
        return this.f36571d;
    }

    public void printBitmap(@NonNull String str, @NonNull Bitmap bitmap) {
        printBitmap(str, bitmap, (OnPrintFinishCallback) null);
    }

    public void setColorMode(int i) {
        this.f36572e = i;
    }

    public void setOrientation(int i) {
        this.f36573f = i;
    }

    public void setScaleMode(int i) {
        this.f36571d = i;
    }

    public void printBitmap(@NonNull String str, @NonNull Bitmap bitmap, @Nullable OnPrintFinishCallback onPrintFinishCallback) {
        PrintAttributes.MediaSize mediaSize;
        if (bitmap == null) {
            return;
        }
        PrintManager printManager = (PrintManager) this.f36568a.getSystemService(PDWindowsLaunchParams.OPERATION_PRINT);
        if (m53716d(bitmap)) {
            mediaSize = PrintAttributes.MediaSize.UNKNOWN_PORTRAIT;
        } else {
            mediaSize = PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE;
        }
        printManager.print(str, new C4837b(str, this.f36571d, bitmap, onPrintFinishCallback), new PrintAttributes.Builder().setMediaSize(mediaSize).setColorMode(this.f36572e).build());
    }

    public void printBitmap(@NonNull String str, @NonNull Uri uri) throws FileNotFoundException {
        printBitmap(str, uri, (OnPrintFinishCallback) null);
    }

    public void printBitmap(@NonNull String str, @NonNull Uri uri, @Nullable OnPrintFinishCallback onPrintFinishCallback) throws FileNotFoundException {
        C4838c c4838c = new C4838c(str, uri, onPrintFinishCallback, this.f36571d);
        PrintManager printManager = (PrintManager) this.f36568a.getSystemService(PDWindowsLaunchParams.OPERATION_PRINT);
        PrintAttributes.Builder builder = new PrintAttributes.Builder();
        builder.setColorMode(this.f36572e);
        int i = this.f36573f;
        if (i == 1 || i == 0) {
            builder.setMediaSize(PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE);
        } else if (i == 2) {
            builder.setMediaSize(PrintAttributes.MediaSize.UNKNOWN_PORTRAIT);
        }
        printManager.print(str, c4838c, builder.build());
    }
}