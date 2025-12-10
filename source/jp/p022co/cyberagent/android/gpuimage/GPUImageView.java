package jp.p022co.cyberagent.android.gpuimage;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.os.AsyncTask;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.IntBuffer;
import java.util.concurrent.Semaphore;
import jp.p022co.cyberagent.android.gpuimage.GPUImage;

/* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageView */
/* loaded from: classes5.dex */
public class GPUImageView extends FrameLayout {

    /* renamed from: a */
    public GLSurfaceView f67641a;

    /* renamed from: b */
    public GPUImage f67642b;

    /* renamed from: c */
    public GPUImageFilter f67643c;

    /* renamed from: d */
    public float f67644d;
    public Size mForceSize;

    /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageView$OnPictureSavedListener */
    /* loaded from: classes5.dex */
    public interface OnPictureSavedListener {
        void onPictureSaved(Uri uri);
    }

    /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageView$Size */
    /* loaded from: classes5.dex */
    public static class Size {

        /* renamed from: a */
        public int f67645a;

        /* renamed from: b */
        public int f67646b;

        public Size(int i, int i2) {
            this.f67645a = i;
            this.f67646b = i2;
        }
    }

    /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageView$a */
    /* loaded from: classes5.dex */
    public class ViewTreeObserver$OnGlobalLayoutListenerC11587a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        public final /* synthetic */ Semaphore f67647a;

        public ViewTreeObserver$OnGlobalLayoutListenerC11587a(Semaphore semaphore) {
            this.f67647a = semaphore;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            GPUImageView.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f67647a.release();
        }
    }

    /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageView$b */
    /* loaded from: classes5.dex */
    public class RunnableC11588b implements Runnable {
        public RunnableC11588b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GPUImageView gPUImageView = GPUImageView.this;
            GPUImageView gPUImageView2 = GPUImageView.this;
            gPUImageView.addView(new C11594h(gPUImageView2.getContext()));
            GPUImageView.this.f67641a.requestLayout();
        }
    }

    /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageView$c */
    /* loaded from: classes5.dex */
    public class RunnableC11589c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Semaphore f67650a;

        public RunnableC11589c(Semaphore semaphore) {
            this.f67650a = semaphore;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f67650a.release();
        }
    }

    /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageView$d */
    /* loaded from: classes5.dex */
    public class RunnableC11590d implements Runnable {
        public RunnableC11590d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GPUImageView.this.f67641a.requestLayout();
        }
    }

    /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageView$e */
    /* loaded from: classes5.dex */
    public class RunnableC11591e implements Runnable {
        public RunnableC11591e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GPUImageView.this.removeViewAt(1);
        }
    }

    /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageView$f */
    /* loaded from: classes5.dex */
    public class RunnableC11592f implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f67654a;

        /* renamed from: b */
        public final /* synthetic */ int f67655b;

        /* renamed from: c */
        public final /* synthetic */ int[] f67656c;

        /* renamed from: d */
        public final /* synthetic */ Semaphore f67657d;

        public RunnableC11592f(int i, int i2, int[] iArr, Semaphore semaphore) {
            this.f67654a = i;
            this.f67655b = i2;
            this.f67656c = iArr;
            this.f67657d = semaphore;
        }

        @Override // java.lang.Runnable
        public void run() {
            IntBuffer allocate = IntBuffer.allocate(this.f67654a * this.f67655b);
            GLES20.glReadPixels(0, 0, this.f67654a, this.f67655b, 6408, 5121, allocate);
            int[] array = allocate.array();
            for (int i = 0; i < this.f67655b; i++) {
                int i2 = 0;
                while (true) {
                    int i3 = this.f67654a;
                    if (i2 < i3) {
                        this.f67656c[(((this.f67655b - i) - 1) * i3) + i2] = array[(i3 * i) + i2];
                        i2++;
                    }
                }
            }
            this.f67657d.release();
        }
    }

    /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageView$g */
    /* loaded from: classes5.dex */
    public class C11593g extends GLSurfaceView {
        public C11593g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // android.view.SurfaceView, android.view.View
        public void onMeasure(int i, int i2) {
            Size size = GPUImageView.this.mForceSize;
            if (size != null) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size.f67645a, 1073741824), View.MeasureSpec.makeMeasureSpec(GPUImageView.this.mForceSize.f67646b, 1073741824));
            } else {
                super.onMeasure(i, i2);
            }
        }
    }

    /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageView$h */
    /* loaded from: classes5.dex */
    public class C11594h extends FrameLayout {
        public C11594h(Context context) {
            super(context);
            m29069a();
        }

        /* renamed from: a */
        public final void m29069a() {
            ProgressBar progressBar = new ProgressBar(getContext());
            progressBar.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
            addView(progressBar);
            setBackgroundColor(-16777216);
        }
    }

    /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageView$i */
    /* loaded from: classes5.dex */
    public class AsyncTaskC11595i extends AsyncTask {

        /* renamed from: a */
        public final String f67661a;

        /* renamed from: b */
        public final String f67662b;

        /* renamed from: c */
        public final int f67663c;

        /* renamed from: d */
        public final int f67664d;

        /* renamed from: e */
        public final OnPictureSavedListener f67665e;

        /* renamed from: f */
        public final Handler f67666f;

        /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageView$i$a */
        /* loaded from: classes5.dex */
        public class C11596a implements MediaScannerConnection.OnScanCompletedListener {

            /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageView$i$a$a */
            /* loaded from: classes5.dex */
            public class RunnableC11597a implements Runnable {

                /* renamed from: a */
                public final /* synthetic */ Uri f67669a;

                public RunnableC11597a(Uri uri) {
                    this.f67669a = uri;
                }

                @Override // java.lang.Runnable
                public void run() {
                    AsyncTaskC11595i.this.f67665e.onPictureSaved(this.f67669a);
                }
            }

            public C11596a() {
            }

            @Override // android.media.MediaScannerConnection.OnScanCompletedListener
            public void onScanCompleted(String str, Uri uri) {
                if (AsyncTaskC11595i.this.f67665e != null) {
                    AsyncTaskC11595i.this.f67666f.post(new RunnableC11597a(uri));
                }
            }
        }

        public AsyncTaskC11595i(GPUImageView gPUImageView, String str, String str2, OnPictureSavedListener onPictureSavedListener) {
            this(str, str2, 0, 0, onPictureSavedListener);
        }

        @Override // android.os.AsyncTask
        /* renamed from: c */
        public Void doInBackground(Void... voidArr) {
            Bitmap capture;
            try {
                int i = this.f67663c;
                if (i != 0) {
                    capture = GPUImageView.this.capture(i, this.f67664d);
                } else {
                    capture = GPUImageView.this.capture();
                }
                m29065d(this.f67661a, this.f67662b, capture);
                return null;
            } catch (InterruptedException e) {
                e.printStackTrace();
                return null;
            }
        }

        /* renamed from: d */
        public final void m29065d(String str, String str2, Bitmap bitmap) {
            File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
            File file = new File(externalStoragePublicDirectory, str + RemoteSettings.FORWARD_SLASH_STRING + str2);
            try {
                file.getParentFile().mkdirs();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 80, new FileOutputStream(file));
                MediaScannerConnection.scanFile(GPUImageView.this.getContext(), new String[]{file.toString()}, null, new C11596a());
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public AsyncTaskC11595i(String str, String str2, int i, int i2, OnPictureSavedListener onPictureSavedListener) {
            this.f67661a = str;
            this.f67662b = str2;
            this.f67663c = i;
            this.f67664d = i2;
            this.f67665e = onPictureSavedListener;
            this.f67666f = new Handler();
        }
    }

    public GPUImageView(Context context) {
        super(context);
        this.mForceSize = null;
        this.f67644d = 0.0f;
        m29070b(context, null);
    }

    /* renamed from: b */
    public final void m29070b(Context context, AttributeSet attributeSet) {
        C11593g c11593g = new C11593g(context, attributeSet);
        this.f67641a = c11593g;
        addView(c11593g);
        GPUImage gPUImage = new GPUImage(getContext());
        this.f67642b = gPUImage;
        gPUImage.setGLSurfaceView(this.f67641a);
    }

    public Bitmap capture(int i, int i2) throws InterruptedException {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.mForceSize = new Size(i, i2);
            Semaphore semaphore = new Semaphore(0);
            getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC11587a(semaphore));
            post(new RunnableC11588b());
            semaphore.acquire();
            this.f67642b.m29122i(new RunnableC11589c(semaphore));
            requestRender();
            semaphore.acquire();
            Bitmap capture = capture();
            this.mForceSize = null;
            post(new RunnableC11590d());
            requestRender();
            postDelayed(new RunnableC11591e(), 300L);
            return capture;
        }
        throw new IllegalStateException("Do not call this method from the UI thread!");
    }

    public GPUImageFilter getFilter() {
        return this.f67643c;
    }

    public GPUImage getGPUImage() {
        return this.f67642b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f67644d != 0.0f) {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            float f = size;
            float f2 = this.f67644d;
            float f3 = size2;
            if (f / f2 < f3) {
                size2 = Math.round(f / f2);
            } else {
                size = Math.round(f3 * f2);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            return;
        }
        super.onMeasure(i, i2);
    }

    public void onPause() {
        this.f67641a.onPause();
    }

    public void onResume() {
        this.f67641a.onResume();
    }

    public void requestRender() {
        this.f67641a.requestRender();
    }

    public void saveToPictures(String str, String str2, OnPictureSavedListener onPictureSavedListener) {
        new AsyncTaskC11595i(this, str, str2, onPictureSavedListener).execute(new Void[0]);
    }

    public void setBackgroundColor(float f, float f2, float f3) {
        this.f67642b.setBackgroundColor(f, f2, f3);
    }

    public void setFilter(GPUImageFilter gPUImageFilter) {
        this.f67643c = gPUImageFilter;
        this.f67642b.setFilter(gPUImageFilter);
        requestRender();
    }

    public void setImage(Bitmap bitmap) {
        this.f67642b.setImage(bitmap);
    }

    public void setRatio(float f) {
        this.f67644d = f;
        this.f67641a.requestLayout();
        this.f67642b.deleteImage();
    }

    public void setRotation(Rotation rotation) {
        this.f67642b.setRotation(rotation);
        requestRender();
    }

    public void setScaleType(GPUImage.ScaleType scaleType) {
        this.f67642b.setScaleType(scaleType);
    }

    public void saveToPictures(String str, String str2, int i, int i2, OnPictureSavedListener onPictureSavedListener) {
        new AsyncTaskC11595i(str, str2, i, i2, onPictureSavedListener).execute(new Void[0]);
    }

    public void setImage(Uri uri) {
        this.f67642b.setImage(uri);
    }

    public void setImage(File file) {
        this.f67642b.setImage(file);
    }

    public GPUImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mForceSize = null;
        this.f67644d = 0.0f;
        m29070b(context, attributeSet);
    }

    public Bitmap capture() throws InterruptedException {
        Semaphore semaphore = new Semaphore(0);
        int measuredWidth = this.f67641a.getMeasuredWidth();
        int measuredHeight = this.f67641a.getMeasuredHeight();
        int[] iArr = new int[measuredWidth * measuredHeight];
        this.f67642b.m29122i(new RunnableC11592f(measuredWidth, measuredHeight, iArr, semaphore));
        requestRender();
        semaphore.acquire();
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(IntBuffer.wrap(iArr));
        return createBitmap;
    }
}
