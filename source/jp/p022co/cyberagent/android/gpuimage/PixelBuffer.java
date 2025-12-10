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
    public GLSurfaceView.Renderer f67683a;

    /* renamed from: b */
    public int f67684b;

    /* renamed from: c */
    public int f67685c;

    /* renamed from: d */
    public Bitmap f67686d;

    /* renamed from: e */
    public EGL10 f67687e;

    /* renamed from: f */
    public EGLDisplay f67688f;

    /* renamed from: g */
    public EGLConfig[] f67689g;

    /* renamed from: h */
    public EGLConfig f67690h;

    /* renamed from: i */
    public EGLContext f67691i;

    /* renamed from: j */
    public EGLSurface f67692j;

    /* renamed from: k */
    public GL10 f67693k;

    /* renamed from: l */
    public String f67694l;

    public PixelBuffer(int i, int i2) {
        this.f67684b = i;
        this.f67685c = i2;
        int[] iArr = {12375, i, 12374, i2, 12344};
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f67687e = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f67688f = eglGetDisplay;
        this.f67687e.eglInitialize(eglGetDisplay, new int[2]);
        EGLConfig m29064a = m29064a();
        this.f67690h = m29064a;
        this.f67691i = this.f67687e.eglCreateContext(this.f67688f, m29064a, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
        EGLSurface eglCreatePbufferSurface = this.f67687e.eglCreatePbufferSurface(this.f67688f, this.f67690h, iArr);
        this.f67692j = eglCreatePbufferSurface;
        this.f67687e.eglMakeCurrent(this.f67688f, eglCreatePbufferSurface, eglCreatePbufferSurface, this.f67691i);
        this.f67693k = (GL10) this.f67691i.getGL();
        this.f67694l = Thread.currentThread().getName();
    }

    /* renamed from: a */
    public final EGLConfig m29064a() {
        int[] iArr = {12325, 0, 12326, 0, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344};
        int[] iArr2 = new int[1];
        this.f67687e.eglChooseConfig(this.f67688f, iArr, null, 0, iArr2);
        int i = iArr2[0];
        EGLConfig[] eGLConfigArr = new EGLConfig[i];
        this.f67689g = eGLConfigArr;
        this.f67687e.eglChooseConfig(this.f67688f, iArr, eGLConfigArr, i, iArr2);
        return this.f67689g[0];
    }

    /* renamed from: b */
    public final void m29063b() {
        int i = this.f67684b;
        int i2 = this.f67685c;
        int[] iArr = new int[i * i2];
        IntBuffer allocate = IntBuffer.allocate(i * i2);
        this.f67693k.glReadPixels(0, 0, this.f67684b, this.f67685c, 6408, 5121, allocate);
        int[] array = allocate.array();
        int i3 = 0;
        while (true) {
            int i4 = this.f67685c;
            if (i3 < i4) {
                int i5 = 0;
                while (true) {
                    int i6 = this.f67684b;
                    if (i5 < i6) {
                        iArr[(((this.f67685c - i3) - 1) * i6) + i5] = array[(i6 * i3) + i5];
                        i5++;
                    }
                }
                i3++;
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(this.f67684b, i4, Bitmap.Config.ARGB_8888);
                this.f67686d = createBitmap;
                createBitmap.copyPixelsFromBuffer(IntBuffer.wrap(iArr));
                return;
            }
        }
    }

    public void destroy() {
        this.f67683a.onDrawFrame(this.f67693k);
        this.f67683a.onDrawFrame(this.f67693k);
        EGL10 egl10 = this.f67687e;
        EGLDisplay eGLDisplay = this.f67688f;
        EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
        this.f67687e.eglDestroySurface(this.f67688f, this.f67692j);
        this.f67687e.eglDestroyContext(this.f67688f, this.f67691i);
        this.f67687e.eglTerminate(this.f67688f);
    }

    public Bitmap getBitmap() {
        if (this.f67683a == null || !Thread.currentThread().getName().equals(this.f67694l)) {
            return null;
        }
        this.f67683a.onDrawFrame(this.f67693k);
        this.f67683a.onDrawFrame(this.f67693k);
        m29063b();
        return this.f67686d;
    }

    public void setRenderer(GLSurfaceView.Renderer renderer) {
        this.f67683a = renderer;
        if (!Thread.currentThread().getName().equals(this.f67694l)) {
            return;
        }
        this.f67683a.onSurfaceCreated(this.f67693k, this.f67690h);
        this.f67683a.onSurfaceChanged(this.f67693k, this.f67684b, this.f67685c);
    }
}
