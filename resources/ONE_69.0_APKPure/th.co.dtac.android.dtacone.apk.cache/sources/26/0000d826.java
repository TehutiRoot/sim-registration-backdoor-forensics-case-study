package jp.p022co.cyberagent.android.gpuimage;

import android.graphics.Bitmap;
import android.opengl.GLSurfaceView;
import java.nio.IntBuffer;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: jp.co.cyberagent.android.gpuimage.PixelBuffer */
/* loaded from: classes5.dex */
public class PixelBuffer {

    /* renamed from: a */
    public GLSurfaceView.Renderer f67740a;

    /* renamed from: b */
    public int f67741b;

    /* renamed from: c */
    public int f67742c;

    /* renamed from: d */
    public Bitmap f67743d;

    /* renamed from: e */
    public EGL10 f67744e;

    /* renamed from: f */
    public EGLDisplay f67745f;

    /* renamed from: g */
    public EGLConfig[] f67746g;

    /* renamed from: h */
    public EGLConfig f67747h;

    /* renamed from: i */
    public EGLContext f67748i;

    /* renamed from: j */
    public EGLSurface f67749j;

    /* renamed from: k */
    public GL10 f67750k;

    /* renamed from: l */
    public String f67751l;

    public PixelBuffer(int i, int i2) {
        this.f67741b = i;
        this.f67742c = i2;
        int[] iArr = {12375, i, 12374, i2, 12344};
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f67744e = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f67745f = eglGetDisplay;
        this.f67744e.eglInitialize(eglGetDisplay, new int[2]);
        EGLConfig m29361a = m29361a();
        this.f67747h = m29361a;
        this.f67748i = this.f67744e.eglCreateContext(this.f67745f, m29361a, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
        EGLSurface eglCreatePbufferSurface = this.f67744e.eglCreatePbufferSurface(this.f67745f, this.f67747h, iArr);
        this.f67749j = eglCreatePbufferSurface;
        this.f67744e.eglMakeCurrent(this.f67745f, eglCreatePbufferSurface, eglCreatePbufferSurface, this.f67748i);
        this.f67750k = (GL10) this.f67748i.getGL();
        this.f67751l = Thread.currentThread().getName();
    }

    /* renamed from: a */
    public final EGLConfig m29361a() {
        int[] iArr = {12325, 0, 12326, 0, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344};
        int[] iArr2 = new int[1];
        this.f67744e.eglChooseConfig(this.f67745f, iArr, null, 0, iArr2);
        int i = iArr2[0];
        EGLConfig[] eGLConfigArr = new EGLConfig[i];
        this.f67746g = eGLConfigArr;
        this.f67744e.eglChooseConfig(this.f67745f, iArr, eGLConfigArr, i, iArr2);
        return this.f67746g[0];
    }

    /* renamed from: b */
    public final void m29360b() {
        int i = this.f67741b;
        int i2 = this.f67742c;
        int[] iArr = new int[i * i2];
        IntBuffer allocate = IntBuffer.allocate(i * i2);
        this.f67750k.glReadPixels(0, 0, this.f67741b, this.f67742c, 6408, 5121, allocate);
        int[] array = allocate.array();
        int i3 = 0;
        while (true) {
            int i4 = this.f67742c;
            if (i3 < i4) {
                int i5 = 0;
                while (true) {
                    int i6 = this.f67741b;
                    if (i5 < i6) {
                        iArr[(((this.f67742c - i3) - 1) * i6) + i5] = array[(i6 * i3) + i5];
                        i5++;
                    }
                }
                i3++;
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(this.f67741b, i4, Bitmap.Config.ARGB_8888);
                this.f67743d = createBitmap;
                createBitmap.copyPixelsFromBuffer(IntBuffer.wrap(iArr));
                return;
            }
        }
    }

    public void destroy() {
        this.f67740a.onDrawFrame(this.f67750k);
        this.f67740a.onDrawFrame(this.f67750k);
        EGL10 egl10 = this.f67744e;
        EGLDisplay eGLDisplay = this.f67745f;
        EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
        this.f67744e.eglDestroySurface(this.f67745f, this.f67749j);
        this.f67744e.eglDestroyContext(this.f67745f, this.f67748i);
        this.f67744e.eglTerminate(this.f67745f);
    }

    public Bitmap getBitmap() {
        if (this.f67740a == null || !Thread.currentThread().getName().equals(this.f67751l)) {
            return null;
        }
        this.f67740a.onDrawFrame(this.f67750k);
        this.f67740a.onDrawFrame(this.f67750k);
        m29360b();
        return this.f67743d;
    }

    public void setRenderer(GLSurfaceView.Renderer renderer) {
        this.f67740a = renderer;
        if (!Thread.currentThread().getName().equals(this.f67751l)) {
            return;
        }
        this.f67740a.onSurfaceCreated(this.f67750k, this.f67747h);
        this.f67740a.onSurfaceChanged(this.f67750k, this.f67741b, this.f67742c);
    }
}