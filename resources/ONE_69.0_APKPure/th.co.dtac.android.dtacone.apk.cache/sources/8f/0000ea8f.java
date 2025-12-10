package me.dm7.barcodescanner.core;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.util.AttributeSet;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.PlanarYUVLuminanceSource;
import com.google.zxing.Result;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.List;

/* loaded from: classes6.dex */
public class ZXingScannerView extends BarcodeScannerView {
    public static final List<BarcodeFormat> ALL_FORMATS;

    /* renamed from: i */
    public MultiFormatReader f72071i;

    /* renamed from: j */
    public List f72072j;

    /* renamed from: k */
    public ResultHandler f72073k;

    /* loaded from: classes6.dex */
    public interface ResultHandler {
        void handleResult(Result result, byte[] bArr);
    }

    /* renamed from: me.dm7.barcodescanner.core.ZXingScannerView$a */
    /* loaded from: classes6.dex */
    public class RunnableC12293a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ byte[] f72074a;

        /* renamed from: b */
        public final /* synthetic */ int f72075b;

        /* renamed from: c */
        public final /* synthetic */ int f72076c;

        /* renamed from: d */
        public final /* synthetic */ Result f72077d;

        public RunnableC12293a(byte[] bArr, int i, int i2, Result result) {
            this.f72074a = bArr;
            this.f72075b = i;
            this.f72076c = i2;
            this.f72077d = result;
        }

        @Override // java.lang.Runnable
        public void run() {
            ResultHandler resultHandler = ZXingScannerView.this.f72073k;
            ZXingScannerView.this.f72073k = null;
            ZXingScannerView.this.stopCameraPreview();
            if (resultHandler != null) {
                resultHandler.handleResult(this.f72077d, ZXingScannerView.this.m26600e(ZXingScannerView.this.m26598g(this.f72074a, this.f72075b, this.f72076c)));
            }
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        ALL_FORMATS = arrayList;
        arrayList.add(BarcodeFormat.EAN_13);
        arrayList.add(BarcodeFormat.UPC_E);
        arrayList.add(BarcodeFormat.EAN_8);
        arrayList.add(BarcodeFormat.RSS_14);
        arrayList.add(BarcodeFormat.CODE_39);
        arrayList.add(BarcodeFormat.CODE_93);
        arrayList.add(BarcodeFormat.CODE_128);
        arrayList.add(BarcodeFormat.ITF);
        arrayList.add(BarcodeFormat.CODABAR);
        arrayList.add(BarcodeFormat.QR_CODE);
        arrayList.add(BarcodeFormat.DATA_MATRIX);
        arrayList.add(BarcodeFormat.PDF_417);
    }

    public ZXingScannerView(Context context) {
        super(context);
        m26599f();
    }

    public static byte[] handleBitmap(byte[] bArr) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        options.inSampleSize = 5;
        options.inJustDecodeBounds = false;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        decodeByteArray.compress(Bitmap.CompressFormat.JPEG, 60, byteArrayOutputStream);
        decodeByteArray.recycle();
        return byteArrayOutputStream.toByteArray();
    }

    public PlanarYUVLuminanceSource buildLuminanceSource(byte[] bArr, int i, int i2) {
        Rect framingRectInPreview = getFramingRectInPreview(i, i2);
        if (framingRectInPreview == null) {
            return null;
        }
        try {
            return new PlanarYUVLuminanceSource(bArr, i, i2, framingRectInPreview.left, framingRectInPreview.top, framingRectInPreview.width(), framingRectInPreview.height(), false);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: e */
    public final byte[] m26600e(Bitmap bitmap) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } finally {
            System.out.close();
        }
    }

    /* renamed from: f */
    public final void m26599f() {
        EnumMap enumMap = new EnumMap(DecodeHintType.class);
        enumMap.put((EnumMap) DecodeHintType.POSSIBLE_FORMATS, (DecodeHintType) getFormats());
        MultiFormatReader multiFormatReader = new MultiFormatReader();
        this.f72071i = multiFormatReader;
        multiFormatReader.setHints(enumMap);
    }

    /* renamed from: g */
    public final Bitmap m26598g(byte[] bArr, int i, int i2) {
        Rect framingRectInPreview = getFramingRectInPreview(i, i2);
        int i3 = framingRectInPreview.left;
        int i4 = framingRectInPreview.top;
        int width = framingRectInPreview.width();
        int height = framingRectInPreview.height();
        int[] iArr = new int[width * height];
        int i5 = (i4 * i) + i3;
        for (int i6 = 0; i6 < height; i6++) {
            int i7 = i6 * width;
            for (int i8 = 0; i8 < width; i8++) {
                iArr[i7 + i8] = ((bArr[i5 + i8] & 255) * 65793) | (-16777216);
            }
            i5 += i;
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        createBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
        return createBitmap;
    }

    public Collection<BarcodeFormat> getFormats() {
        List list = this.f72072j;
        if (list == null) {
            return ALL_FORMATS;
        }
        return list;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0074 A[Catch: RuntimeException -> 0x0035, TryCatch #5 {RuntimeException -> 0x0035, blocks: (B:5:0x0005, B:7:0x001c, B:11:0x0026, B:14:0x0037, B:17:0x0040, B:19:0x0046, B:21:0x0056, B:32:0x0074, B:33:0x0088, B:26:0x0064, B:27:0x0066, B:28:0x006a, B:29:0x006d, B:20:0x0050), top: B:39:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0088 A[Catch: RuntimeException -> 0x0035, TRY_LEAVE, TryCatch #5 {RuntimeException -> 0x0035, blocks: (B:5:0x0005, B:7:0x001c, B:11:0x0026, B:14:0x0037, B:17:0x0040, B:19:0x0046, B:21:0x0056, B:32:0x0074, B:33:0x0088, B:26:0x0064, B:27:0x0066, B:28:0x006a, B:29:0x006d, B:20:0x0050), top: B:39:0x0005 }] */
    @Override // android.hardware.Camera.PreviewCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPreviewFrame(byte[] r10, android.hardware.Camera r11) {
        /*
            r9 = this;
            me.dm7.barcodescanner.core.ZXingScannerView$ResultHandler r0 = r9.f72073k
            if (r0 != 0) goto L5
            return
        L5:
            android.hardware.Camera$Parameters r0 = r11.getParameters()     // Catch: java.lang.RuntimeException -> L35
            android.hardware.Camera$Size r0 = r0.getPreviewSize()     // Catch: java.lang.RuntimeException -> L35
            int r1 = r0.width     // Catch: java.lang.RuntimeException -> L35
            int r0 = r0.height     // Catch: java.lang.RuntimeException -> L35
            android.content.Context r2 = r9.getContext()     // Catch: java.lang.RuntimeException -> L35
            int r2 = me.dm7.barcodescanner.core.DisplayUtils.getScreenOrientation(r2)     // Catch: java.lang.RuntimeException -> L35
            r3 = 1
            if (r2 != r3) goto L3d
            int r2 = r10.length     // Catch: java.lang.RuntimeException -> L35
            byte[] r2 = new byte[r2]     // Catch: java.lang.RuntimeException -> L35
            r4 = 0
            r5 = 0
        L21:
            if (r5 >= r0) goto L3a
            r6 = 0
        L24:
            if (r6 >= r1) goto L37
            int r7 = r6 * r0
            int r7 = r7 + r0
            int r7 = r7 - r5
            int r7 = r7 - r3
            int r8 = r5 * r1
            int r8 = r8 + r6
            r8 = r10[r8]     // Catch: java.lang.RuntimeException -> L35
            r2[r7] = r8     // Catch: java.lang.RuntimeException -> L35
            int r6 = r6 + 1
            goto L24
        L35:
            r10 = move-exception
            goto L8c
        L37:
            int r5 = r5 + 1
            goto L21
        L3a:
            r3 = r0
            r4 = r1
            goto L40
        L3d:
            r2 = r10
            r4 = r0
            r3 = r1
        L40:
            com.google.zxing.PlanarYUVLuminanceSource r10 = r9.buildLuminanceSource(r2, r3, r4)     // Catch: java.lang.RuntimeException -> L35
            if (r10 == 0) goto L70
            com.google.zxing.BinaryBitmap r0 = new com.google.zxing.BinaryBitmap     // Catch: java.lang.RuntimeException -> L35
            com.google.zxing.common.HybridBinarizer r1 = new com.google.zxing.common.HybridBinarizer     // Catch: java.lang.RuntimeException -> L35
            r1.<init>(r10)     // Catch: java.lang.RuntimeException -> L35
            r0.<init>(r1)     // Catch: java.lang.RuntimeException -> L35
            com.google.zxing.MultiFormatReader r10 = r9.f72071i     // Catch: java.lang.Throwable -> L5d java.lang.ArrayIndexOutOfBoundsException -> L64 java.lang.NullPointerException -> L6a com.google.zxing.ReaderException -> L6d
            com.google.zxing.Result r10 = r10.decodeWithState(r0)     // Catch: java.lang.Throwable -> L5d java.lang.ArrayIndexOutOfBoundsException -> L64 java.lang.NullPointerException -> L6a com.google.zxing.ReaderException -> L6d
            com.google.zxing.MultiFormatReader r0 = r9.f72071i     // Catch: java.lang.RuntimeException -> L35
            r0.reset()     // Catch: java.lang.RuntimeException -> L35
        L5b:
            r5 = r10
            goto L72
        L5d:
            r10 = move-exception
            com.google.zxing.MultiFormatReader r11 = r9.f72071i     // Catch: java.lang.RuntimeException -> L35
            r11.reset()     // Catch: java.lang.RuntimeException -> L35
            throw r10     // Catch: java.lang.RuntimeException -> L35
        L64:
            com.google.zxing.MultiFormatReader r10 = r9.f72071i     // Catch: java.lang.RuntimeException -> L35
        L66:
            r10.reset()     // Catch: java.lang.RuntimeException -> L35
            goto L70
        L6a:
            com.google.zxing.MultiFormatReader r10 = r9.f72071i     // Catch: java.lang.RuntimeException -> L35
            goto L66
        L6d:
            com.google.zxing.MultiFormatReader r10 = r9.f72071i     // Catch: java.lang.RuntimeException -> L35
            goto L66
        L70:
            r10 = 0
            goto L5b
        L72:
            if (r5 == 0) goto L88
            android.os.Handler r10 = new android.os.Handler     // Catch: java.lang.RuntimeException -> L35
            android.os.Looper r11 = android.os.Looper.getMainLooper()     // Catch: java.lang.RuntimeException -> L35
            r10.<init>(r11)     // Catch: java.lang.RuntimeException -> L35
            me.dm7.barcodescanner.core.ZXingScannerView$a r11 = new me.dm7.barcodescanner.core.ZXingScannerView$a     // Catch: java.lang.RuntimeException -> L35
            r0 = r11
            r1 = r9
            r0.<init>(r2, r3, r4, r5)     // Catch: java.lang.RuntimeException -> L35
            r10.post(r11)     // Catch: java.lang.RuntimeException -> L35
            goto L8f
        L88:
            r11.setOneShotPreviewCallback(r9)     // Catch: java.lang.RuntimeException -> L35
            goto L8f
        L8c:
            r10.toString()
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: me.dm7.barcodescanner.core.ZXingScannerView.onPreviewFrame(byte[], android.hardware.Camera):void");
    }

    public void resumeCameraPreview(ResultHandler resultHandler) {
        this.f72073k = resultHandler;
        super.resumeCameraPreview();
    }

    public void setFormats(List<BarcodeFormat> list) {
        this.f72072j = list;
        m26599f();
    }

    public void setResultHandler(ResultHandler resultHandler) {
        this.f72073k = resultHandler;
    }

    public ZXingScannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m26599f();
    }
}