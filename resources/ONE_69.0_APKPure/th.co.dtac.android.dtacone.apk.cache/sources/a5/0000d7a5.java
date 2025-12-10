package jp.p022co.cyberagent.android.gpuimage;

import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.hardware.Camera;
import android.media.ExifInterface;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.opengl.GLSurfaceView;
import android.os.AsyncTask;
import android.os.Environment;
import android.os.Handler;
import android.view.WindowManager;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.zxy.tiny.common.UriUtil;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

/* renamed from: jp.co.cyberagent.android.gpuimage.GPUImage */
/* loaded from: classes5.dex */
public class GPUImage {

    /* renamed from: a */
    public final Context f67439a;

    /* renamed from: b */
    public final GPUImageRenderer f67440b;

    /* renamed from: c */
    public GLSurfaceView f67441c;

    /* renamed from: d */
    public GPUImageFilter f67442d;

    /* renamed from: e */
    public Bitmap f67443e;

    /* renamed from: f */
    public ScaleType f67444f = ScaleType.CENTER_CROP;

    /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImage$OnPictureSavedListener */
    /* loaded from: classes5.dex */
    public interface OnPictureSavedListener {
        void onPictureSaved(Uri uri);
    }

    /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImage$ResponseListener */
    /* loaded from: classes5.dex */
    public interface ResponseListener<T> {
        void response(T t);
    }

    /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImage$ScaleType */
    /* loaded from: classes5.dex */
    public enum ScaleType {
        CENTER_INSIDE,
        CENTER_CROP
    }

    /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImage$a */
    /* loaded from: classes5.dex */
    public class RunnableC11546a implements Runnable {
        public RunnableC11546a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (GPUImage.this.f67442d) {
                GPUImage.this.f67442d.destroy();
                GPUImage.this.f67442d.notify();
            }
        }
    }

    /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImage$b */
    /* loaded from: classes5.dex */
    public class AsyncTaskC11547b extends AbstractAsyncTaskC11548c {

        /* renamed from: e */
        public final File f67446e;

        public AsyncTaskC11547b(GPUImage gPUImage, File file) {
            super(gPUImage);
            this.f67446e = file;
        }

        @Override // jp.p022co.cyberagent.android.gpuimage.GPUImage.AbstractAsyncTaskC11548c
        /* renamed from: b */
        public Bitmap mo29409b(BitmapFactory.Options options) {
            return BitmapFactory.decodeFile(this.f67446e.getAbsolutePath(), options);
        }

        @Override // jp.p022co.cyberagent.android.gpuimage.GPUImage.AbstractAsyncTaskC11548c
        /* renamed from: d */
        public int mo29408d() {
            int attributeInt = new ExifInterface(this.f67446e.getAbsolutePath()).getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 1);
            if (attributeInt != 3) {
                if (attributeInt != 6) {
                    if (attributeInt != 8) {
                        return 0;
                    }
                    return BitmapUtil.IMAGE_270_DEGREE;
                }
                return 90;
            }
            return BitmapUtil.IMAGE_180_DEGREE;
        }
    }

    /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImage$c */
    /* loaded from: classes5.dex */
    public abstract class AbstractAsyncTaskC11548c extends AsyncTask {

        /* renamed from: a */
        public final GPUImage f67448a;

        /* renamed from: b */
        public int f67449b;

        /* renamed from: c */
        public int f67450c;

        public AbstractAsyncTaskC11548c(GPUImage gPUImage) {
            this.f67448a = gPUImage;
        }

        /* renamed from: a */
        public final boolean m29416a(boolean z, boolean z2) {
            if (GPUImage.this.f67444f == ScaleType.CENTER_CROP) {
                if (!z || !z2) {
                    return false;
                }
                return true;
            } else if (!z && !z2) {
                return false;
            } else {
                return true;
            }
        }

        /* renamed from: b */
        public abstract Bitmap mo29409b(BitmapFactory.Options options);

        @Override // android.os.AsyncTask
        /* renamed from: c */
        public Bitmap doInBackground(Void... voidArr) {
            if (GPUImage.this.f67440b != null && GPUImage.this.f67440b.getFrameWidth() == 0) {
                try {
                    synchronized (GPUImage.this.f67440b.mSurfaceChangedWaiter) {
                        GPUImage.this.f67440b.mSurfaceChangedWaiter.wait(3000L);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            this.f67449b = GPUImage.this.m29420h();
            this.f67450c = GPUImage.this.m29421g();
            return m29413f();
        }

        /* renamed from: d */
        public abstract int mo29408d();

        /* renamed from: e */
        public final int[] m29414e(int i, int i2) {
            float f;
            float f2;
            float f3 = i;
            float f4 = f3 / this.f67449b;
            float f5 = i2;
            float f6 = f5 / this.f67450c;
            if (GPUImage.this.f67444f != ScaleType.CENTER_CROP ? f4 < f6 : f4 > f6) {
                f = this.f67450c;
                f2 = (f / f5) * f3;
            } else {
                float f7 = this.f67449b;
                float f8 = (f7 / f3) * f5;
                f2 = f7;
                f = f8;
            }
            return new int[]{Math.round(f2), Math.round(f)};
        }

        /* renamed from: f */
        public final Bitmap m29413f() {
            boolean z;
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            mo29409b(options);
            int i = 1;
            while (true) {
                boolean z2 = false;
                if (options.outWidth / i > this.f67449b) {
                    z = true;
                } else {
                    z = false;
                }
                if (options.outHeight / i > this.f67450c) {
                    z2 = true;
                }
                if (!m29416a(z, z2)) {
                    break;
                }
                i++;
            }
            int i2 = i - 1;
            if (i2 < 1) {
                i2 = 1;
            }
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inSampleSize = i2;
            options2.inPreferredConfig = Bitmap.Config.RGB_565;
            options2.inPurgeable = true;
            options2.inTempStorage = new byte[32768];
            Bitmap mo29409b = mo29409b(options2);
            if (mo29409b == null) {
                return null;
            }
            return m29410i(m29411h(mo29409b));
        }

        @Override // android.os.AsyncTask
        /* renamed from: g */
        public void onPostExecute(Bitmap bitmap) {
            super.onPostExecute(bitmap);
            this.f67448a.deleteImage();
            this.f67448a.setImage(bitmap);
        }

        /* renamed from: h */
        public final Bitmap m29411h(Bitmap bitmap) {
            Bitmap bitmap2;
            IOException e;
            int mo29408d;
            if (bitmap == null) {
                return null;
            }
            try {
                mo29408d = mo29408d();
            } catch (IOException e2) {
                bitmap2 = bitmap;
                e = e2;
            }
            if (mo29408d != 0) {
                Matrix matrix = new Matrix();
                matrix.postRotate(mo29408d);
                bitmap2 = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                try {
                    bitmap.recycle();
                } catch (IOException e3) {
                    e = e3;
                    e.printStackTrace();
                    return bitmap2;
                }
                return bitmap2;
            }
            return bitmap;
        }

        /* renamed from: i */
        public final Bitmap m29410i(Bitmap bitmap) {
            int[] m29414e = m29414e(bitmap.getWidth(), bitmap.getHeight());
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, m29414e[0], m29414e[1], true);
            if (createScaledBitmap != bitmap) {
                bitmap.recycle();
                System.gc();
                bitmap = createScaledBitmap;
            }
            if (GPUImage.this.f67444f == ScaleType.CENTER_CROP) {
                int i = m29414e[0];
                int i2 = i - this.f67449b;
                int i3 = m29414e[1];
                int i4 = i3 - this.f67450c;
                Bitmap createBitmap = Bitmap.createBitmap(bitmap, i2 / 2, i4 / 2, i - i2, i3 - i4);
                if (createBitmap != bitmap) {
                    bitmap.recycle();
                    return createBitmap;
                }
                return bitmap;
            }
            return bitmap;
        }
    }

    /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImage$d */
    /* loaded from: classes5.dex */
    public class AsyncTaskC11549d extends AbstractAsyncTaskC11548c {

        /* renamed from: e */
        public final Uri f67452e;

        public AsyncTaskC11549d(GPUImage gPUImage, Uri uri) {
            super(gPUImage);
            this.f67452e = uri;
        }

        @Override // jp.p022co.cyberagent.android.gpuimage.GPUImage.AbstractAsyncTaskC11548c
        /* renamed from: b */
        public Bitmap mo29409b(BitmapFactory.Options options) {
            InputStream openStream;
            try {
                if (!this.f67452e.getScheme().startsWith("http") && !this.f67452e.getScheme().startsWith(UriUtil.HTTPS_SCHEME)) {
                    openStream = GPUImage.this.f67439a.getContentResolver().openInputStream(this.f67452e);
                    return BitmapFactory.decodeStream(openStream, null, options);
                }
                openStream = new URL(this.f67452e.toString()).openStream();
                return BitmapFactory.decodeStream(openStream, null, options);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        @Override // jp.p022co.cyberagent.android.gpuimage.GPUImage.AbstractAsyncTaskC11548c
        /* renamed from: d */
        public int mo29408d() {
            Cursor query = GPUImage.this.f67439a.getContentResolver().query(this.f67452e, new String[]{"orientation"}, null, null, null);
            if (query == null || query.getCount() != 1) {
                return 0;
            }
            query.moveToFirst();
            int i = query.getInt(0);
            query.close();
            return i;
        }
    }

    /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImage$e */
    /* loaded from: classes5.dex */
    public class AsyncTaskC11550e extends AsyncTask {

        /* renamed from: a */
        public final Bitmap f67454a;

        /* renamed from: b */
        public final String f67455b;

        /* renamed from: c */
        public final String f67456c;

        /* renamed from: d */
        public final OnPictureSavedListener f67457d;

        /* renamed from: e */
        public final Handler f67458e = new Handler();

        /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImage$e$a */
        /* loaded from: classes5.dex */
        public class C11551a implements MediaScannerConnection.OnScanCompletedListener {

            /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImage$e$a$a */
            /* loaded from: classes5.dex */
            public class RunnableC11552a implements Runnable {

                /* renamed from: a */
                public final /* synthetic */ Uri f67461a;

                public RunnableC11552a(Uri uri) {
                    this.f67461a = uri;
                }

                @Override // java.lang.Runnable
                public void run() {
                    AsyncTaskC11550e.this.f67457d.onPictureSaved(this.f67461a);
                }
            }

            public C11551a() {
            }

            @Override // android.media.MediaScannerConnection.OnScanCompletedListener
            public void onScanCompleted(String str, Uri uri) {
                if (AsyncTaskC11550e.this.f67457d != null) {
                    AsyncTaskC11550e.this.f67458e.post(new RunnableC11552a(uri));
                }
            }
        }

        public AsyncTaskC11550e(Bitmap bitmap, String str, String str2, OnPictureSavedListener onPictureSavedListener) {
            this.f67454a = bitmap;
            this.f67455b = str;
            this.f67456c = str2;
            this.f67457d = onPictureSavedListener;
        }

        @Override // android.os.AsyncTask
        /* renamed from: c */
        public Void doInBackground(Void... voidArr) {
            m29404d(this.f67455b, this.f67456c, GPUImage.this.getBitmapWithFilterApplied(this.f67454a));
            return null;
        }

        /* renamed from: d */
        public final void m29404d(String str, String str2, Bitmap bitmap) {
            File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
            File file = new File(externalStoragePublicDirectory, str + RemoteSettings.FORWARD_SLASH_STRING + str2);
            try {
                file.getParentFile().mkdirs();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 80, new FileOutputStream(file));
                MediaScannerConnection.scanFile(GPUImage.this.f67439a, new String[]{file.toString()}, null, new C11551a());
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public GPUImage(Context context) {
        if (m29417k(context)) {
            this.f67439a = context;
            this.f67442d = new GPUImageFilter();
            this.f67440b = new GPUImageRenderer(this.f67442d);
            return;
        }
        throw new IllegalStateException("OpenGL ES 2.0 is not supported on this phone.");
    }

    public static void getBitmapForMultipleFilters(Bitmap bitmap, List<GPUImageFilter> list, ResponseListener<Bitmap> responseListener) {
        if (list.isEmpty()) {
            return;
        }
        GPUImageRenderer gPUImageRenderer = new GPUImageRenderer(list.get(0));
        gPUImageRenderer.setImageBitmap(bitmap, false);
        PixelBuffer pixelBuffer = new PixelBuffer(bitmap.getWidth(), bitmap.getHeight());
        pixelBuffer.setRenderer(gPUImageRenderer);
        for (GPUImageFilter gPUImageFilter : list) {
            gPUImageRenderer.setFilter(gPUImageFilter);
            responseListener.response(pixelBuffer.getBitmap());
            gPUImageFilter.destroy();
        }
        gPUImageRenderer.deleteImage();
        pixelBuffer.destroy();
    }

    public void deleteImage() {
        this.f67440b.deleteImage();
        this.f67443e = null;
        requestRender();
    }

    /* renamed from: g */
    public final int m29421g() {
        GPUImageRenderer gPUImageRenderer = this.f67440b;
        if (gPUImageRenderer != null && gPUImageRenderer.getFrameHeight() != 0) {
            return this.f67440b.getFrameHeight();
        }
        Bitmap bitmap = this.f67443e;
        if (bitmap != null) {
            return bitmap.getHeight();
        }
        return ((WindowManager) this.f67439a.getSystemService("window")).getDefaultDisplay().getHeight();
    }

    public Bitmap getBitmapWithFilterApplied() {
        return getBitmapWithFilterApplied(this.f67443e);
    }

    /* renamed from: h */
    public final int m29420h() {
        GPUImageRenderer gPUImageRenderer = this.f67440b;
        if (gPUImageRenderer != null && gPUImageRenderer.getFrameWidth() != 0) {
            return this.f67440b.getFrameWidth();
        }
        Bitmap bitmap = this.f67443e;
        if (bitmap != null) {
            return bitmap.getWidth();
        }
        return ((WindowManager) this.f67439a.getSystemService("window")).getDefaultDisplay().getWidth();
    }

    /* renamed from: i */
    public void m29419i(Runnable runnable) {
        this.f67440b.runOnDrawEnd(runnable);
    }

    /* renamed from: j */
    public final void m29418j(Camera camera) {
        this.f67440b.setUpSurfaceTexture(camera);
    }

    /* renamed from: k */
    public final boolean m29417k(Context context) {
        if (((ActivityManager) context.getSystemService("activity")).getDeviceConfigurationInfo().reqGlEsVersion >= 131072) {
            return true;
        }
        return false;
    }

    public void requestRender() {
        GLSurfaceView gLSurfaceView = this.f67441c;
        if (gLSurfaceView != null) {
            gLSurfaceView.requestRender();
        }
    }

    @Deprecated
    public void saveToPictures(String str, String str2, OnPictureSavedListener onPictureSavedListener) {
        saveToPictures(this.f67443e, str, str2, onPictureSavedListener);
    }

    public void setBackgroundColor(float f, float f2, float f3) {
        this.f67440b.setBackgroundColor(f, f2, f3);
    }

    public void setFilter(GPUImageFilter gPUImageFilter) {
        this.f67442d = gPUImageFilter;
        this.f67440b.setFilter(gPUImageFilter);
        requestRender();
    }

    public void setGLSurfaceView(GLSurfaceView gLSurfaceView) {
        this.f67441c = gLSurfaceView;
        gLSurfaceView.setEGLContextClientVersion(2);
        this.f67441c.setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        this.f67441c.getHolder().setFormat(1);
        this.f67441c.setRenderer(this.f67440b);
        this.f67441c.setRenderMode(0);
        this.f67441c.requestRender();
    }

    public void setImage(Bitmap bitmap) {
        this.f67443e = bitmap;
        this.f67440b.setImageBitmap(bitmap, false);
        requestRender();
    }

    public void setRotation(Rotation rotation) {
        this.f67440b.setRotation(rotation);
    }

    public void setScaleType(ScaleType scaleType) {
        this.f67444f = scaleType;
        this.f67440b.setScaleType(scaleType);
        this.f67440b.deleteImage();
        this.f67443e = null;
        requestRender();
    }

    public void setUpCamera(Camera camera) {
        setUpCamera(camera, 0, false, false);
    }

    public Bitmap getBitmapWithFilterApplied(Bitmap bitmap) {
        if (this.f67441c != null) {
            this.f67440b.deleteImage();
            this.f67440b.runOnDraw(new RunnableC11546a());
            synchronized (this.f67442d) {
                requestRender();
                try {
                    this.f67442d.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        GPUImageRenderer gPUImageRenderer = new GPUImageRenderer(this.f67442d);
        gPUImageRenderer.setRotation(Rotation.NORMAL, this.f67440b.isFlippedHorizontally(), this.f67440b.isFlippedVertically());
        gPUImageRenderer.setScaleType(this.f67444f);
        PixelBuffer pixelBuffer = new PixelBuffer(bitmap.getWidth(), bitmap.getHeight());
        pixelBuffer.setRenderer(gPUImageRenderer);
        gPUImageRenderer.setImageBitmap(bitmap, false);
        Bitmap bitmap2 = pixelBuffer.getBitmap();
        this.f67442d.destroy();
        gPUImageRenderer.deleteImage();
        pixelBuffer.destroy();
        this.f67440b.setFilter(this.f67442d);
        Bitmap bitmap3 = this.f67443e;
        if (bitmap3 != null) {
            this.f67440b.setImageBitmap(bitmap3, false);
        }
        requestRender();
        return bitmap2;
    }

    @Deprecated
    public void saveToPictures(Bitmap bitmap, String str, String str2, OnPictureSavedListener onPictureSavedListener) {
        new AsyncTaskC11550e(bitmap, str, str2, onPictureSavedListener).execute(new Void[0]);
    }

    public void setRotation(Rotation rotation, boolean z, boolean z2) {
        this.f67440b.setRotation(rotation, z, z2);
    }

    public void setUpCamera(Camera camera, int i, boolean z, boolean z2) {
        this.f67441c.setRenderMode(1);
        m29418j(camera);
        Rotation rotation = Rotation.NORMAL;
        if (i == 90) {
            rotation = Rotation.ROTATION_90;
        } else if (i == 180) {
            rotation = Rotation.ROTATION_180;
        } else if (i == 270) {
            rotation = Rotation.ROTATION_270;
        }
        this.f67440b.setRotationCamera(rotation, z, z2);
    }

    public void setImage(Uri uri) {
        new AsyncTaskC11549d(this, uri).execute(new Void[0]);
    }

    public void setImage(File file) {
        new AsyncTaskC11547b(this, file).execute(new Void[0]);
    }
}