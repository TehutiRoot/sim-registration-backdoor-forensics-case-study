package jp.p022co.cyberagent.android.gpuimage;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.LinkedList;
import java.util.Queue;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import jp.p022co.cyberagent.android.gpuimage.GPUImage;
import jp.p022co.cyberagent.android.gpuimage.util.TextureRotationUtil;

@TargetApi(11)
/* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageRenderer */
/* loaded from: classes5.dex */
public class GPUImageRenderer implements GLSurfaceView.Renderer, Camera.PreviewCallback {
    public static final int NO_IMAGE = -1;

    /* renamed from: u */
    public static final float[] f67558u = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: a */
    public GPUImageFilter f67559a;

    /* renamed from: d */
    public final FloatBuffer f67562d;

    /* renamed from: e */
    public final FloatBuffer f67563e;

    /* renamed from: f */
    public IntBuffer f67564f;

    /* renamed from: g */
    public int f67565g;

    /* renamed from: h */
    public int f67566h;

    /* renamed from: i */
    public int f67567i;

    /* renamed from: j */
    public int f67568j;

    /* renamed from: k */
    public int f67569k;

    /* renamed from: n */
    public Rotation f67572n;

    /* renamed from: o */
    public boolean f67573o;

    /* renamed from: p */
    public boolean f67574p;
    public final Object mSurfaceChangedWaiter = new Object();

    /* renamed from: b */
    public int f67560b = -1;

    /* renamed from: c */
    public SurfaceTexture f67561c = null;

    /* renamed from: q */
    public GPUImage.ScaleType f67575q = GPUImage.ScaleType.CENTER_CROP;

    /* renamed from: r */
    public float f67576r = 0.0f;

    /* renamed from: s */
    public float f67577s = 0.0f;

    /* renamed from: t */
    public float f67578t = 0.0f;

    /* renamed from: l */
    public final Queue f67570l = new LinkedList();

    /* renamed from: m */
    public final Queue f67571m = new LinkedList();

    /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageRenderer$a */
    /* loaded from: classes5.dex */
    public class RunnableC11579a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ byte[] f67579a;

        /* renamed from: b */
        public final /* synthetic */ Camera.Size f67580b;

        /* renamed from: c */
        public final /* synthetic */ Camera f67581c;

        public RunnableC11579a(byte[] bArr, Camera.Size size, Camera camera) {
            this.f67579a = bArr;
            this.f67580b = size;
            this.f67581c = camera;
        }

        @Override // java.lang.Runnable
        public void run() {
            byte[] bArr = this.f67579a;
            Camera.Size size = this.f67580b;
            GPUImageNativeLibrary.YUVtoRBGA(bArr, size.width, size.height, GPUImageRenderer.this.f67564f.array());
            GPUImageRenderer gPUImageRenderer = GPUImageRenderer.this;
            gPUImageRenderer.f67560b = OpenGlUtils.loadTexture(gPUImageRenderer.f67564f, this.f67580b, GPUImageRenderer.this.f67560b);
            this.f67581c.addCallbackBuffer(this.f67579a);
            int i = GPUImageRenderer.this.f67567i;
            int i2 = this.f67580b.width;
            if (i != i2) {
                GPUImageRenderer.this.f67567i = i2;
                GPUImageRenderer.this.f67568j = this.f67580b.height;
                GPUImageRenderer.this.m29084p();
            }
        }
    }

    /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageRenderer$b */
    /* loaded from: classes5.dex */
    public class RunnableC11580b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Camera f67583a;

        public RunnableC11580b(Camera camera) {
            this.f67583a = camera;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            GPUImageRenderer.this.f67561c = new SurfaceTexture(iArr[0]);
            try {
                this.f67583a.setPreviewTexture(GPUImageRenderer.this.f67561c);
                this.f67583a.setPreviewCallback(GPUImageRenderer.this);
                this.f67583a.startPreview();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageRenderer$c */
    /* loaded from: classes5.dex */
    public class RunnableC11581c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ GPUImageFilter f67585a;

        public RunnableC11581c(GPUImageFilter gPUImageFilter) {
            this.f67585a = gPUImageFilter;
        }

        @Override // java.lang.Runnable
        public void run() {
            GPUImageFilter gPUImageFilter = GPUImageRenderer.this.f67559a;
            GPUImageRenderer.this.f67559a = this.f67585a;
            if (gPUImageFilter != null) {
                gPUImageFilter.destroy();
            }
            GPUImageRenderer.this.f67559a.init();
            GLES20.glUseProgram(GPUImageRenderer.this.f67559a.getProgram());
            GPUImageRenderer.this.f67559a.onOutputSizeChanged(GPUImageRenderer.this.f67565g, GPUImageRenderer.this.f67566h);
        }
    }

    /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageRenderer$d */
    /* loaded from: classes5.dex */
    public class RunnableC11582d implements Runnable {
        public RunnableC11582d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GLES20.glDeleteTextures(1, new int[]{GPUImageRenderer.this.f67560b}, 0);
            GPUImageRenderer.this.f67560b = -1;
        }
    }

    /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageRenderer$e */
    /* loaded from: classes5.dex */
    public class RunnableC11583e implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Bitmap f67588a;

        /* renamed from: b */
        public final /* synthetic */ boolean f67589b;

        public RunnableC11583e(Bitmap bitmap, boolean z) {
            this.f67588a = bitmap;
            this.f67589b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            Bitmap bitmap;
            Bitmap bitmap2 = null;
            if (this.f67588a.getWidth() % 2 != 1) {
                GPUImageRenderer.this.f67569k = 0;
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(this.f67588a.getWidth() + 1, this.f67588a.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawARGB(0, 0, 0, 0);
                canvas.drawBitmap(this.f67588a, 0.0f, 0.0f, (Paint) null);
                GPUImageRenderer.this.f67569k = 1;
                bitmap2 = createBitmap;
            }
            GPUImageRenderer gPUImageRenderer = GPUImageRenderer.this;
            if (bitmap2 != null) {
                bitmap = bitmap2;
            } else {
                bitmap = this.f67588a;
            }
            gPUImageRenderer.f67560b = OpenGlUtils.loadTexture(bitmap, gPUImageRenderer.f67560b, this.f67589b);
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            GPUImageRenderer.this.f67567i = this.f67588a.getWidth();
            GPUImageRenderer.this.f67568j = this.f67588a.getHeight();
            GPUImageRenderer.this.m29084p();
        }
    }

    public GPUImageRenderer(GPUImageFilter gPUImageFilter) {
        this.f67559a = gPUImageFilter;
        float[] fArr = f67558u;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f67562d = asFloatBuffer;
        asFloatBuffer.put(fArr).position(0);
        this.f67563e = ByteBuffer.allocateDirect(TextureRotationUtil.TEXTURE_NO_ROTATION.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        setRotation(Rotation.NORMAL, false, false);
    }

    public void deleteImage() {
        runOnDraw(new RunnableC11582d());
    }

    public int getFrameHeight() {
        return this.f67566h;
    }

    public int getFrameWidth() {
        return this.f67565g;
    }

    public Rotation getRotation() {
        return this.f67572n;
    }

    public boolean isFlippedHorizontally() {
        return this.f67573o;
    }

    public boolean isFlippedVertically() {
        return this.f67574p;
    }

    /* renamed from: o */
    public final float m29085o(float f, float f2) {
        return f == 0.0f ? f2 : 1.0f - f2;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        GLES20.glClear(16640);
        m29083q(this.f67570l);
        this.f67559a.onDraw(this.f67560b, this.f67562d, this.f67563e);
        m29083q(this.f67571m);
        SurfaceTexture surfaceTexture = this.f67561c;
        if (surfaceTexture != null) {
            surfaceTexture.updateTexImage();
        }
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, Camera camera) {
        Camera.Size previewSize = camera.getParameters().getPreviewSize();
        if (this.f67564f == null) {
            this.f67564f = IntBuffer.allocate(previewSize.width * previewSize.height);
        }
        if (this.f67570l.isEmpty()) {
            runOnDraw(new RunnableC11579a(bArr, previewSize, camera));
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        this.f67565g = i;
        this.f67566h = i2;
        GLES20.glViewport(0, 0, i, i2);
        GLES20.glUseProgram(this.f67559a.getProgram());
        this.f67559a.onOutputSizeChanged(i, i2);
        m29084p();
        synchronized (this.mSurfaceChangedWaiter) {
            this.mSurfaceChangedWaiter.notifyAll();
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(this.f67576r, this.f67577s, this.f67578t, 1.0f);
        GLES20.glDisable(2929);
        this.f67559a.init();
    }

    /* renamed from: p */
    public final void m29084p() {
        int i = this.f67565g;
        float f = i;
        int i2 = this.f67566h;
        float f2 = i2;
        Rotation rotation = this.f67572n;
        if (rotation == Rotation.ROTATION_270 || rotation == Rotation.ROTATION_90) {
            f = i2;
            f2 = i;
        }
        float max = Math.max(f / this.f67567i, f2 / this.f67568j);
        float round = Math.round(this.f67567i * max) / f;
        float round2 = Math.round(this.f67568j * max) / f2;
        float[] fArr = f67558u;
        float[] rotation2 = TextureRotationUtil.getRotation(this.f67572n, this.f67573o, this.f67574p);
        if (this.f67575q == GPUImage.ScaleType.CENTER_CROP) {
            float f3 = (1.0f - (1.0f / round)) / 2.0f;
            float f4 = (1.0f - (1.0f / round2)) / 2.0f;
            rotation2 = new float[]{m29085o(rotation2[0], f3), m29085o(rotation2[1], f4), m29085o(rotation2[2], f3), m29085o(rotation2[3], f4), m29085o(rotation2[4], f3), m29085o(rotation2[5], f4), m29085o(rotation2[6], f3), m29085o(rotation2[7], f4)};
        } else {
            fArr = new float[]{fArr[0] / round2, fArr[1] / round, fArr[2] / round2, fArr[3] / round, fArr[4] / round2, fArr[5] / round, fArr[6] / round2, fArr[7] / round};
        }
        this.f67562d.clear();
        this.f67562d.put(fArr).position(0);
        this.f67563e.clear();
        this.f67563e.put(rotation2).position(0);
    }

    /* renamed from: q */
    public final void m29083q(Queue queue) {
        synchronized (queue) {
            while (!queue.isEmpty()) {
                try {
                    ((Runnable) queue.poll()).run();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void runOnDraw(Runnable runnable) {
        synchronized (this.f67570l) {
            this.f67570l.add(runnable);
        }
    }

    public void runOnDrawEnd(Runnable runnable) {
        synchronized (this.f67571m) {
            this.f67571m.add(runnable);
        }
    }

    public void setBackgroundColor(float f, float f2, float f3) {
        this.f67576r = f;
        this.f67577s = f2;
        this.f67578t = f3;
    }

    public void setFilter(GPUImageFilter gPUImageFilter) {
        runOnDraw(new RunnableC11581c(gPUImageFilter));
    }

    public void setImageBitmap(Bitmap bitmap) {
        setImageBitmap(bitmap, true);
    }

    public void setRotation(Rotation rotation) {
        this.f67572n = rotation;
        m29084p();
    }

    public void setRotationCamera(Rotation rotation, boolean z, boolean z2) {
        setRotation(rotation, z2, z);
    }

    public void setScaleType(GPUImage.ScaleType scaleType) {
        this.f67575q = scaleType;
    }

    public void setUpSurfaceTexture(Camera camera) {
        runOnDraw(new RunnableC11580b(camera));
    }

    public void setImageBitmap(Bitmap bitmap, boolean z) {
        if (bitmap == null) {
            return;
        }
        runOnDraw(new RunnableC11583e(bitmap, z));
    }

    public void setRotation(Rotation rotation, boolean z, boolean z2) {
        this.f67573o = z;
        this.f67574p = z2;
        setRotation(rotation);
    }
}
