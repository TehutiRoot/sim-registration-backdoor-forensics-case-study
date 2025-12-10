package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.images.RunnableC6341b;
import com.google.android.gms.common.internal.Asserts;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/* renamed from: P82 */
/* loaded from: classes3.dex */
public final class P82 implements Runnable {

    /* renamed from: a */
    public final Uri f4685a;

    /* renamed from: b */
    public final ParcelFileDescriptor f4686b;

    /* renamed from: c */
    public final /* synthetic */ ImageManager f4687c;

    public P82(ImageManager imageManager, Uri uri, ParcelFileDescriptor parcelFileDescriptor) {
        this.f4687c = imageManager;
        this.f4685a = uri;
        this.f4686b = parcelFileDescriptor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmap;
        boolean z;
        Handler handler;
        Asserts.checkNotMainThread("LoadBitmapFromDiskRunnable can't be executed in the main thread");
        ParcelFileDescriptor parcelFileDescriptor = this.f4686b;
        Bitmap bitmap2 = null;
        boolean z2 = false;
        if (parcelFileDescriptor != null) {
            try {
                bitmap2 = BitmapFactory.decodeFileDescriptor(parcelFileDescriptor.getFileDescriptor());
            } catch (OutOfMemoryError unused) {
                "OOM while loading bitmap for uri: ".concat(String.valueOf(this.f4685a));
                z2 = true;
            }
            try {
                this.f4686b.close();
            } catch (IOException unused2) {
            }
            bitmap = bitmap2;
            z = z2;
        } else {
            bitmap = null;
            z = false;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ImageManager imageManager = this.f4687c;
        Uri uri = this.f4685a;
        handler = imageManager.f45009b;
        handler.post(new RunnableC6341b(imageManager, uri, bitmap, z, countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException unused3) {
            Log.w("ImageManager", "Latch interrupted while posting ".concat(String.valueOf(this.f4685a)));
        }
    }
}