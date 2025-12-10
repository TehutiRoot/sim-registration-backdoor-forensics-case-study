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
    public final Context f67382a;

    /* renamed from: b */
    public final GPUImageRenderer f67383b;

    /* renamed from: c */
    public GLSurfaceView f67384c;

    /* renamed from: d */
    public GPUImageFilter f67385d;

    /* renamed from: e */
    public Bitmap f67386e;

    /* renamed from: f */
    public ScaleType f67387f = ScaleType.CENTER_CROP;

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
    public class RunnableC11561a implements Runnable {
        public RunnableC11561a() {
            GPUImage.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (GPUImage.this.f67385d) {
                GPUImage.this.f67385d.destroy();
                GPUImage.this.f67385d.notify();
            }
        }
    }

    /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImage$b */
    /* loaded from: classes5.dex */
    public class AsyncTaskC11562b extends AbstractAsyncTaskC11563c {

        /* renamed from: e */
        public final File f67389e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AsyncTaskC11562b(GPUImage gPUImage, File file) {
            super(gPUImage);
            GPUImage.this = r1;
            this.f67389e = file;
        }

        @Override // jp.p022co.cyberagent.android.gpuimage.GPUImage.AbstractAsyncTaskC11563c
        /* renamed from: b */
        public Bitmap mo29112b(BitmapFactory.Options options) {
            return BitmapFactory.decodeFile(this.f67389e.getAbsolutePath(), options);
        }

        @Override // jp.p022co.cyberagent.android.gpuimage.GPUImage.AbstractAsyncTaskC11563c
        /* renamed from: d */
        public int mo29111d() {
            int attributeInt = new ExifInterface(this.f67389e.getAbsolutePath()).getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 1);
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
    public abstract class AbstractAsyncTaskC11563c extends AsyncTask {

        /* renamed from: a */
        public final GPUImage f67391a;

        /* renamed from: b */
        public int f67392b;

        /* renamed from: c */
        public int f67393c;

        public AbstractAsyncTaskC11563c(GPUImage gPUImage) {
            GPUImage.this = r1;
            this.f67391a = gPUImage;
        }

        /* renamed from: a */
        public final boolean m29119a(boolean z, boolean z2) {
            if (GPUImage.this.f67387f == ScaleType.CENTER_CROP) {
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
        public abstract Bitmap mo29112b(BitmapFactory.Options options);

        @Override // android.os.AsyncTask
        /* renamed from: c */
        public Bitmap doInBackground(Void... voidArr) {
            if (GPUImage.this.f67383b != null && GPUImage.this.f67383b.getFrameWidth() == 0) {
                try {
                    synchronized (GPUImage.this.f67383b.mSurfaceChangedWaiter) {
                        GPUImage.this.f67383b.mSurfaceChangedWaiter.wait(3000L);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            this.f67392b = GPUImage.this.m29123h();
            this.f67393c = GPUImage.this.m29124g();
            return m29116f();
        }

        /* renamed from: d */
        public abstract int mo29111d();

        /* renamed from: e */
        public final int[] m29117e(int i, int i2) {
            float f;
            float f2;
            float f3 = i;
            float f4 = f3 / this.f67392b;
            float f5 = i2;
            float f6 = f5 / this.f67393c;
            if (GPUImage.this.f67387f != ScaleType.CENTER_CROP ? f4 < f6 : f4 > f6) {
                f = this.f67393c;
                f2 = (f / f5) * f3;
            } else {
                float f7 = this.f67392b;
                float f8 = (f7 / f3) * f5;
                f2 = f7;
                f = f8;
            }
            return new int[]{Math.round(f2), Math.round(f)};
        }

        /* renamed from: f */
        public final Bitmap m29116f() {
            boolean z;
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            mo29112b(options);
            int i = 1;
            while (true) {
                boolean z2 = false;
                if (options.outWidth / i > this.f67392b) {
                    z = true;
                } else {
                    z = false;
                }
                if (options.outHeight / i > this.f67393c) {
                    z2 = true;
                }
                if (!m29119a(z, z2)) {
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
            Bitmap mo29112b = mo29112b(options2);
            if (mo29112b == null) {
                return null;
            }
            return m29113i(m29114h(mo29112b));
        }

        @Override // android.os.AsyncTask
        /* renamed from: g */
        public void onPostExecute(Bitmap bitmap) {
            super.onPostExecute(bitmap);
            this.f67391a.deleteImage();
            this.f67391a.setImage(bitmap);
        }

        /* renamed from: h */
        public final Bitmap m29114h(Bitmap bitmap) {
            Bitmap bitmap2;
            IOException e;
            int mo29111d;
            if (bitmap == null) {
                return null;
            }
            try {
                mo29111d = mo29111d();
            } catch (IOException e2) {
                bitmap2 = bitmap;
                e = e2;
            }
            if (mo29111d != 0) {
                Matrix matrix = new Matrix();
                matrix.postRotate(mo29111d);
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
        public final Bitmap m29113i(Bitmap bitmap) {
            int[] m29117e = m29117e(bitmap.getWidth(), bitmap.getHeight());
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, m29117e[0], m29117e[1], true);
            if (createScaledBitmap != bitmap) {
                bitmap.recycle();
                System.gc();
                bitmap = createScaledBitmap;
            }
            if (GPUImage.this.f67387f == ScaleType.CENTER_CROP) {
                int i = m29117e[0];
                int i2 = i - this.f67392b;
                int i3 = m29117e[1];
                int i4 = i3 - this.f67393c;
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
    public class AsyncTaskC11564d extends AbstractAsyncTaskC11563c {

        /* renamed from: e */
        public final Uri f67395e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AsyncTaskC11564d(GPUImage gPUImage, Uri uri) {
            super(gPUImage);
            GPUImage.this = r1;
            this.f67395e = uri;
        }

        @Override // jp.p022co.cyberagent.android.gpuimage.GPUImage.AbstractAsyncTaskC11563c
        /* renamed from: b */
        public Bitmap mo29112b(BitmapFactory.Options options) {
            InputStream openStream;
            try {
                if (!this.f67395e.getScheme().startsWith("http") && !this.f67395e.getScheme().startsWith(UriUtil.HTTPS_SCHEME)) {
                    openStream = GPUImage.this.f67382a.getContentResolver().openInputStream(this.f67395e);
                    return BitmapFactory.decodeStream(openStream, null, options);
                }
                openStream = new URL(this.f67395e.toString()).openStream();
                return BitmapFactory.decodeStream(openStream, null, options);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        @Override // jp.p022co.cyberagent.android.gpuimage.GPUImage.AbstractAsyncTaskC11563c
        /* renamed from: d */
        public int mo29111d() {
            Cursor query = GPUImage.this.f67382a.getContentResolver().query(this.f67395e, new String[]{"orientation"}, null, null, null);
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
    public class AsyncTaskC11565e extends AsyncTask {

        /* renamed from: a */
        public final Bitmap f67397a;

        /* renamed from: b */
        public final String f67398b;

        /* renamed from: c */
        public final String f67399c;

        /* renamed from: d */
        public final OnPictureSavedListener f67400d;

        /* renamed from: e */
        public final Handler f67401e = new Handler();

        /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImage$e$a */
        /* loaded from: classes5.dex */
        public class C11566a implements MediaScannerConnection.OnScanCompletedListener {

            /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImage$e$a$a */
            /* loaded from: classes5.dex */
            public class RunnableC11567a implements Runnable {

                /* renamed from: a */
                public final /* synthetic */ Uri f67404a;

                public RunnableC11567a(Uri uri) {
                    C11566a.this = r1;
                    this.f67404a = uri;
                }

                @Override // java.lang.Runnable
                public void run() {
                    AsyncTaskC11565e.this.f67400d.onPictureSaved(this.f67404a);
                }
            }

            public C11566a() {
                AsyncTaskC11565e.this = r1;
            }

            @Override // android.media.MediaScannerConnection.OnScanCompletedListener
            public void onScanCompleted(String str, Uri uri) {
                if (AsyncTaskC11565e.this.f67400d != null) {
                    AsyncTaskC11565e.this.f67401e.post(new RunnableC11567a(uri));
                }
            }
        }

        public AsyncTaskC11565e(Bitmap bitmap, String str, String str2, OnPictureSavedListener onPictureSavedListener) {
            GPUImage.this = r1;
            this.f67397a = bitmap;
            this.f67398b = str;
            this.f67399c = str2;
            this.f67400d = onPictureSavedListener;
        }

        @Override // android.os.AsyncTask
        /* renamed from: c */
        public Void doInBackground(Void... voidArr) {
            m29107d(this.f67398b, this.f67399c, GPUImage.this.getBitmapWithFilterApplied(this.f67397a));
            return null;
        }

        /* renamed from: d */
        public final void m29107d(String str, String str2, Bitmap bitmap) {
            File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
            File file = new File(externalStoragePublicDirectory, str + RemoteSettings.FORWARD_SLASH_STRING + str2);
            try {
                file.getParentFile().mkdirs();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 80, new FileOutputStream(file));
                MediaScannerConnection.scanFile(GPUImage.this.f67382a, new String[]{file.toString()}, null, new C11566a());
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public GPUImage(Context context) {
        if (m29120k(context)) {
            this.f67382a = context;
            this.f67385d = new GPUImageFilter();
            this.f67383b = new GPUImageRenderer(this.f67385d);
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
        this.f67383b.deleteImage();
        this.f67386e = null;
        requestRender();
    }

    /* renamed from: g */
    public final int m29124g() {
        GPUImageRenderer gPUImageRenderer = this.f67383b;
        if (gPUImageRenderer != null && gPUImageRenderer.getFrameHeight() != 0) {
            return this.f67383b.getFrameHeight();
        }
        Bitmap bitmap = this.f67386e;
        if (bitmap != null) {
            return bitmap.getHeight();
        }
        return ((WindowManager) this.f67382a.getSystemService("window")).getDefaultDisplay().getHeight();
    }

    public Bitmap getBitmapWithFilterApplied() {
        return getBitmapWithFilterApplied(this.f67386e);
    }

    /* renamed from: h */
    public final int m29123h() {
        GPUImageRenderer gPUImageRenderer = this.f67383b;
        if (gPUImageRenderer != null && gPUImageRenderer.getFrameWidth() != 0) {
            return this.f67383b.getFrameWidth();
        }
        Bitmap bitmap = this.f67386e;
        if (bitmap != null) {
            return bitmap.getWidth();
        }
        return ((WindowManager) this.f67382a.getSystemService("window")).getDefaultDisplay().getWidth();
    }

    /* renamed from: i */
    public void m29122i(Runnable runnable) {
        this.f67383b.runOnDrawEnd(runnable);
    }

    /* renamed from: j */
    public final void m29121j(Camera camera) {
        this.f67383b.setUpSurfaceTexture(camera);
    }

    /* renamed from: k */
    public final boolean m29120k(Context context) {
        if (((ActivityManager) context.getSystemService("activity")).getDeviceConfigurationInfo().reqGlEsVersion >= 131072) {
            return true;
        }
        return false;
    }

    public void requestRender() {
        GLSurfaceView gLSurfaceView = this.f67384c;
        if (gLSurfaceView != null) {
            gLSurfaceView.requestRender();
        }
    }

    @Deprecated
    public void saveToPictures(String str, String str2, OnPictureSavedListener onPictureSavedListener) {
        saveToPictures(this.f67386e, str, str2, onPictureSavedListener);
    }

    public void setBackgroundColor(float f, float f2, float f3) {
        this.f67383b.setBackgroundColor(f, f2, f3);
    }

    public void setFilter(GPUImageFilter gPUImageFilter) {
        this.f67385d = gPUImageFilter;
        this.f67383b.setFilter(gPUImageFilter);
        requestRender();
    }

    public void setGLSurfaceView(GLSurfaceView gLSurfaceView) {
        this.f67384c = gLSurfaceView;
        gLSurfaceView.setEGLContextClientVersion(2);
        this.f67384c.setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        this.f67384c.getHolder().setFormat(1);
        this.f67384c.setRenderer(this.f67383b);
        this.f67384c.setRenderMode(0);
        this.f67384c.requestRender();
    }

    public void setImage(Bitmap bitmap) {
        this.f67386e = bitmap;
        this.f67383b.setImageBitmap(bitmap, false);
        requestRender();
    }

    public void setRotation(Rotation rotation) {
        this.f67383b.setRotation(rotation);
    }

    public void setScaleType(ScaleType scaleType) {
        this.f67387f = scaleType;
        this.f67383b.setScaleType(scaleType);
        this.f67383b.deleteImage();
        this.f67386e = null;
        requestRender();
    }

    public void setUpCamera(Camera camera) {
        setUpCamera(camera, 0, false, false);
    }

    public Bitmap getBitmapWithFilterApplied(Bitmap bitmap) {
        if (this.f67384c != null) {
            this.f67383b.deleteImage();
            this.f67383b.runOnDraw(new RunnableC11561a());
            synchronized (this.f67385d) {
                requestRender();
                try {
                    this.f67385d.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        GPUImageRenderer gPUImageRenderer = new GPUImageRenderer(this.f67385d);
        gPUImageRenderer.setRotation(Rotation.NORMAL, this.f67383b.isFlippedHorizontally(), this.f67383b.isFlippedVertically());
        gPUImageRenderer.setScaleType(this.f67387f);
        PixelBuffer pixelBuffer = new PixelBuffer(bitmap.getWidth(), bitmap.getHeight());
        pixelBuffer.setRenderer(gPUImageRenderer);
        gPUImageRenderer.setImageBitmap(bitmap, false);
        Bitmap bitmap2 = pixelBuffer.getBitmap();
        this.f67385d.destroy();
        gPUImageRenderer.deleteImage();
        pixelBuffer.destroy();
        this.f67383b.setFilter(this.f67385d);
        Bitmap bitmap3 = this.f67386e;
        if (bitmap3 != null) {
            this.f67383b.setImageBitmap(bitmap3, false);
        }
        requestRender();
        return bitmap2;
    }

    @Deprecated
    public void saveToPictures(Bitmap bitmap, String str, String str2, OnPictureSavedListener onPictureSavedListener) {
        new AsyncTaskC11565e(bitmap, str, str2, onPictureSavedListener).execute(new Void[0]);
    }

    public void setRotation(Rotation rotation, boolean z, boolean z2) {
        this.f67383b.setRotation(rotation, z, z2);
    }

    public void setUpCamera(Camera camera, int i, boolean z, boolean z2) {
        this.f67384c.setRenderMode(1);
        m29121j(camera);
        Rotation rotation = Rotation.NORMAL;
        if (i == 90) {
            rotation = Rotation.ROTATION_90;
        } else if (i == 180) {
            rotation = Rotation.ROTATION_180;
        } else if (i == 270) {
            rotation = Rotation.ROTATION_270;
        }
        this.f67383b.setRotationCamera(rotation, z, z2);
    }

    public void setImage(Uri uri) {
        new AsyncTaskC11564d(this, uri).execute(new Void[0]);
    }

    public void setImage(File file) {
        new AsyncTaskC11562b(this, file).execute(new Void[0]);
    }
}
