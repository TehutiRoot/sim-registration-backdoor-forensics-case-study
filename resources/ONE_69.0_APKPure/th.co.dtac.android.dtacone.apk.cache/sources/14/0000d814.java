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
    public GLSurfaceView f67698a;

    /* renamed from: b */
    public GPUImage f67699b;

    /* renamed from: c */
    public GPUImageFilter f67700c;

    /* renamed from: d */
    public float f67701d;
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
        public int f67702a;

        /* renamed from: b */
        public int f67703b;

        public Size(int i, int i2) {
            this.f67702a = i;
            this.f67703b = i2;
        }
    }

    /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageView$a */
    /* loaded from: classes5.dex */
    public class ViewTreeObserver$OnGlobalLayoutListenerC11572a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        public final /* synthetic */ Semaphore f67704a;

        public ViewTreeObserver$OnGlobalLayoutListenerC11572a(Semaphore semaphore) {
            this.f67704a = semaphore;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            GPUImageView.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f67704a.release();
        }
    }

    /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageView$b */
    /* loaded from: classes5.dex */
    public class RunnableC11573b implements Runnable {
        public RunnableC11573b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GPUImageView gPUImageView = GPUImageView.this;
            GPUImageView gPUImageView2 = GPUImageView.this;
            gPUImageView.addView(new C11579h(gPUImageView2.getContext()));
            GPUImageView.this.f67698a.requestLayout();
        }
    }

    /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageView$c */
    /* loaded from: classes5.dex */
    public class RunnableC11574c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Semaphore f67707a;

        public RunnableC11574c(Semaphore semaphore) {
            this.f67707a = semaphore;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f67707a.release();
        }
    }

    /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageView$d */
    /* loaded from: classes5.dex */
    public class RunnableC11575d implements Runnable {
        public RunnableC11575d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GPUImageView.this.f67698a.requestLayout();
        }
    }

    /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageView$e */
    /* loaded from: classes5.dex */
    public class RunnableC11576e implements Runnable {
        public RunnableC11576e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GPUImageView.this.removeViewAt(1);
        }
    }

    /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageView$f */
    /* loaded from: classes5.dex */
    public class RunnableC11577f implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f67711a;

        /* renamed from: b */
        public final /* synthetic */ int f67712b;

        /* renamed from: c */
        public final /* synthetic */ int[] f67713c;

        /* renamed from: d */
        public final /* synthetic */ Semaphore f67714d;

        public RunnableC11577f(int i, int i2, int[] iArr, Semaphore semaphore) {
            this.f67711a = i;
            this.f67712b = i2;
            this.f67713c = iArr;
            this.f67714d = semaphore;
        }

        @Override // java.lang.Runnable
        public void run() {
            IntBuffer allocate = IntBuffer.allocate(this.f67711a * this.f67712b);
            GLES20.glReadPixels(0, 0, this.f67711a, this.f67712b, 6408, 5121, allocate);
            int[] array = allocate.array();
            for (int i = 0; i < this.f67712b; i++) {
                int i2 = 0;
                while (true) {
                    int i3 = this.f67711a;
                    if (i2 < i3) {
                        this.f67713c[(((this.f67712b - i) - 1) * i3) + i2] = array[(i3 * i) + i2];
                        i2++;
                    }
                }
            }
            this.f67714d.release();
        }
    }

    /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageView$g */
    /* loaded from: classes5.dex */
    public class C11578g extends GLSurfaceView {
        public C11578g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // android.view.SurfaceView, android.view.View
        public void onMeasure(int i, int i2) {
            Size size = GPUImageView.this.mForceSize;
            if (size != null) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size.f67702a, 1073741824), View.MeasureSpec.makeMeasureSpec(GPUImageView.this.mForceSize.f67703b, 1073741824));
            } else {
                super.onMeasure(i, i2);
            }
        }
    }

    /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageView$h */
    /* loaded from: classes5.dex */
    public class C11579h extends FrameLayout {
        public C11579h(Context context) {
            super(context);
            m29366a();
        }

        /* renamed from: a */
        public final void m29366a() {
            ProgressBar progressBar = new ProgressBar(getContext());
            progressBar.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
            addView(progressBar);
            setBackgroundColor(-16777216);
        }
    }

    /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageView$i */
    /* loaded from: classes5.dex */
    public class AsyncTaskC11580i extends AsyncTask {

        /* renamed from: a */
        public final String f67718a;

        /* renamed from: b */
        public final String f67719b;

        /* renamed from: c */
        public final int f67720c;

        /* renamed from: d */
        public final int f67721d;

        /* renamed from: e */
        public final OnPictureSavedListener f67722e;

        /* renamed from: f */
        public final Handler f67723f;

        /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageView$i$a */
        /* loaded from: classes5.dex */
        public class C11581a implements MediaScannerConnection.OnScanCompletedListener {

            /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageView$i$a$a */
            /* loaded from: classes5.dex */
            public class RunnableC11582a implements Runnable {

                /* renamed from: a */
                public final /* synthetic */ Uri f67726a;

                public RunnableC11582a(Uri uri) {
                    this.f67726a = uri;
                }

                @Override // java.lang.Runnable
                public void run() {
                    AsyncTaskC11580i.this.f67722e.onPictureSaved(this.f67726a);
                }
            }

            public C11581a() {
            }

            @Override // android.media.MediaScannerConnection.OnScanCompletedListener
            public void onScanCompleted(String str, Uri uri) {
                if (AsyncTaskC11580i.this.f67722e != null) {
                    AsyncTaskC11580i.this.f67723f.post(new RunnableC11582a(uri));
                }
            }
        }

        public AsyncTaskC11580i(GPUImageView gPUImageView, String str, String str2, OnPictureSavedListener onPictureSavedListener) {
            this(str, str2, 0, 0, onPictureSavedListener);
        }

        @Override // android.os.AsyncTask
        /* renamed from: c */
        public Void doInBackground(Void... voidArr) {
            Bitmap capture;
            try {
                int i = this.f67720c;
                if (i != 0) {
                    capture = GPUImageView.this.capture(i, this.f67721d);
                } else {
                    capture = GPUImageView.this.capture();
                }
                m29362d(this.f67718a, this.f67719b, capture);
                return null;
            } catch (InterruptedException e) {
                e.printStackTrace();
                return null;
            }
        }

        /* renamed from: d */
        public final void m29362d(String str, String str2, Bitmap bitmap) {
            File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
            File file = new File(externalStoragePublicDirectory, str + RemoteSettings.FORWARD_SLASH_STRING + str2);
            try {
                file.getParentFile().mkdirs();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 80, new FileOutputStream(file));
                MediaScannerConnection.scanFile(GPUImageView.this.getContext(), new String[]{file.toString()}, null, new C11581a());
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public AsyncTaskC11580i(String str, String str2, int i, int i2, OnPictureSavedListener onPictureSavedListener) {
            this.f67718a = str;
            this.f67719b = str2;
            this.f67720c = i;
            this.f67721d = i2;
            this.f67722e = onPictureSavedListener;
            this.f67723f = new Handler();
        }
    }

    public GPUImageView(Context context) {
        super(context);
        this.mForceSize = null;
        this.f67701d = 0.0f;
        m29367b(context, null);
    }

    /* renamed from: b */
    public final void m29367b(Context context, AttributeSet attributeSet) {
        C11578g c11578g = new C11578g(context, attributeSet);
        this.f67698a = c11578g;
        addView(c11578g);
        GPUImage gPUImage = new GPUImage(getContext());
        this.f67699b = gPUImage;
        gPUImage.setGLSurfaceView(this.f67698a);
    }

    public Bitmap capture(int i, int i2) throws InterruptedException {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.mForceSize = new Size(i, i2);
            Semaphore semaphore = new Semaphore(0);
            getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC11572a(semaphore));
            post(new RunnableC11573b());
            semaphore.acquire();
            this.f67699b.m29419i(new RunnableC11574c(semaphore));
            requestRender();
            semaphore.acquire();
            Bitmap capture = capture();
            this.mForceSize = null;
            post(new RunnableC11575d());
            requestRender();
            postDelayed(new RunnableC11576e(), 300L);
            return capture;
        }
        throw new IllegalStateException("Do not call this method from the UI thread!");
    }

    public GPUImageFilter getFilter() {
        return this.f67700c;
    }

    public GPUImage getGPUImage() {
        return this.f67699b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f67701d != 0.0f) {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            float f = size;
            float f2 = this.f67701d;
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
        this.f67698a.onPause();
    }

    public void onResume() {
        this.f67698a.onResume();
    }

    public void requestRender() {
        this.f67698a.requestRender();
    }

    public void saveToPictures(String str, String str2, OnPictureSavedListener onPictureSavedListener) {
        new AsyncTaskC11580i(this, str, str2, onPictureSavedListener).execute(new Void[0]);
    }

    public void setBackgroundColor(float f, float f2, float f3) {
        this.f67699b.setBackgroundColor(f, f2, f3);
    }

    public void setFilter(GPUImageFilter gPUImageFilter) {
        this.f67700c = gPUImageFilter;
        this.f67699b.setFilter(gPUImageFilter);
        requestRender();
    }

    public void setImage(Bitmap bitmap) {
        this.f67699b.setImage(bitmap);
    }

    public void setRatio(float f) {
        this.f67701d = f;
        this.f67698a.requestLayout();
        this.f67699b.deleteImage();
    }

    public void setRotation(Rotation rotation) {
        this.f67699b.setRotation(rotation);
        requestRender();
    }

    public void setScaleType(GPUImage.ScaleType scaleType) {
        this.f67699b.setScaleType(scaleType);
    }

    public void saveToPictures(String str, String str2, int i, int i2, OnPictureSavedListener onPictureSavedListener) {
        new AsyncTaskC11580i(str, str2, i, i2, onPictureSavedListener).execute(new Void[0]);
    }

    public void setImage(Uri uri) {
        this.f67699b.setImage(uri);
    }

    public void setImage(File file) {
        this.f67699b.setImage(file);
    }

    public GPUImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mForceSize = null;
        this.f67701d = 0.0f;
        m29367b(context, attributeSet);
    }

    public Bitmap capture() throws InterruptedException {
        Semaphore semaphore = new Semaphore(0);
        int measuredWidth = this.f67698a.getMeasuredWidth();
        int measuredHeight = this.f67698a.getMeasuredHeight();
        int[] iArr = new int[measuredWidth * measuredHeight];
        this.f67699b.m29419i(new RunnableC11577f(measuredWidth, measuredHeight, iArr, semaphore));
        requestRender();
        semaphore.acquire();
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(IntBuffer.wrap(iArr));
        return createBitmap;
    }
}