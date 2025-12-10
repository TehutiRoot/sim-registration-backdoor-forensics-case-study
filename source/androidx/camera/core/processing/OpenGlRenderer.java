package androidx.camera.core.processing;

import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.WorkerThread;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.Logger;
import androidx.core.util.Preconditions;
import androidx.work.Data;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

@RequiresApi(21)
@WorkerThread
/* loaded from: classes.dex */
public final class OpenGlRenderer {

    /* renamed from: n */
    public static final String f11396n;

    /* renamed from: o */
    public static final String f11397o;

    /* renamed from: p */
    public static final String f11398p;

    /* renamed from: q */
    public static final String f11399q;

    /* renamed from: r */
    public static final float[] f11400r;

    /* renamed from: s */
    public static final FloatBuffer f11401s;

    /* renamed from: t */
    public static final float[] f11402t;

    /* renamed from: u */
    public static final FloatBuffer f11403u;

    /* renamed from: v */
    public static final AbstractC2556a f11404v;

    /* renamed from: c */
    public Thread f11407c;

    /* renamed from: f */
    public EGLConfig f11410f;

    /* renamed from: h */
    public Surface f11412h;

    /* renamed from: a */
    public final AtomicBoolean f11405a = new AtomicBoolean(false);

    /* renamed from: b */
    public final Map f11406b = new HashMap();

    /* renamed from: d */
    public EGLDisplay f11408d = EGL14.EGL_NO_DISPLAY;

    /* renamed from: e */
    public EGLContext f11409e = EGL14.EGL_NO_CONTEXT;

    /* renamed from: g */
    public EGLSurface f11411g = EGL14.EGL_NO_SURFACE;

    /* renamed from: i */
    public int f11413i = -1;

    /* renamed from: j */
    public int f11414j = -1;

    /* renamed from: k */
    public int f11415k = -1;

    /* renamed from: l */
    public int f11416l = -1;

    /* renamed from: m */
    public int f11417m = -1;

    /* renamed from: androidx.camera.core.processing.OpenGlRenderer$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2556a {
        /* renamed from: d */
        public static AbstractC2556a m62706d(EGLSurface eGLSurface, int i, int i2) {
            return new C2562b(eGLSurface, i, i2);
        }

        /* renamed from: a */
        public abstract EGLSurface mo62660a();

        /* renamed from: b */
        public abstract int mo62659b();

        /* renamed from: c */
        public abstract int mo62658c();
    }

    static {
        Locale locale = Locale.US;
        f11396n = String.format(locale, "uniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 %s;\nvoid main() {\n    gl_Position = aPosition;\n    %s = (uTexMatrix * aTextureCoord).xy;\n}\n", "vTextureCoord", "vTextureCoord");
        f11397o = String.format(locale, "#version 300 es\nin vec4 aPosition;\nin vec4 aTextureCoord;\nuniform mat4 uTexMatrix;\nout vec2 %s;\nvoid main() {\n  gl_Position = aPosition;\n  %s = (uTexMatrix * aTextureCoord).xy;\n}\n", "vTextureCoord", "vTextureCoord");
        f11398p = String.format(locale, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 %s;\nuniform samplerExternalOES %s;\nvoid main() {\n    gl_FragColor = texture2D(%s, %s);\n}\n", "vTextureCoord", "sTexture", "sTexture", "vTextureCoord");
        f11399q = String.format(locale, "#version 300 es\n#extension GL_OES_EGL_image_external : require\n#extension GL_EXT_YUV_target : require\nprecision mediump float;\nuniform __samplerExternal2DY2YEXT %s;\nin vec2 %s;\nout vec4 outColor;\n\nvec3 yuvToRgb(vec3 yuv) {\n  const vec3 yuvOffset = vec3(0.0625, 0.5, 0.5);\n  const mat3 yuvToRgbColorTransform = mat3(\n    1.1689f, 1.1689f, 1.1689f,\n    0.0000f, -0.1881f, 2.1502f,\n    1.6853f, -0.6530f, 0.0000f\n  );\n  return clamp(yuvToRgbColorTransform * (yuv - yuvOffset), 0.0, 1.0);\n}\n\nvoid main() {\n  vec3 srcYuv = texture(%s, %s).xyz;\n  outColor = vec4(yuvToRgb(srcYuv), 1.0);\n}", "sTexture", "vTextureCoord", "sTexture", "vTextureCoord");
        float[] fArr = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        f11400r = fArr;
        f11401s = createFloatBuffer(fArr);
        float[] fArr2 = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        f11402t = fArr2;
        f11403u = createFloatBuffer(fArr2);
        f11404v = AbstractC2556a.m62706d(EGL14.EGL_NO_SURFACE, 0, 0);
    }

    /* renamed from: a */
    public static void m62732a(String str) {
        try {
            m62731b(str);
        } catch (IllegalStateException e) {
            Logger.m63227e("OpenGlRenderer", e.toString(), e);
        }
    }

    /* renamed from: b */
    public static void m62731b(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            return;
        }
        throw new IllegalStateException(str + ": EGL error: 0x" + Integer.toHexString(eglGetError));
    }

    /* renamed from: c */
    public static void m62730c(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        throw new IllegalStateException(str + ": GL error 0x" + Integer.toHexString(glGetError));
    }

    @NonNull
    public static FloatBuffer createFloatBuffer(@NonNull float[] fArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        return asFloatBuffer;
    }

    /* renamed from: f */
    public static void m62727f(int i, String str) {
        if (i >= 0) {
            return;
        }
        throw new IllegalStateException("Unable to locate '" + str + "' in program");
    }

    /* renamed from: i */
    public static EGLSurface m62724i(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, i, 12374, i2, 12344}, 0);
        m62731b("eglCreatePbufferSurface");
        if (eglCreatePbufferSurface != null) {
            return eglCreatePbufferSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    /* renamed from: m */
    public static EGLSurface m62720m(EGLDisplay eGLDisplay, EGLConfig eGLConfig, Surface surface) {
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, new int[]{12344}, 0);
        m62731b("eglCreateWindowSurface");
        if (eglCreateWindowSurface != null) {
            return eglCreateWindowSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    /* renamed from: n */
    public static void m62719n(int i) {
        GLES20.glDeleteFramebuffers(1, new int[]{i}, 0);
        m62730c("glDeleteFramebuffers");
    }

    /* renamed from: o */
    public static void m62718o(int i) {
        GLES20.glDeleteTextures(1, new int[]{i}, 0);
        m62730c("glDeleteTextures");
    }

    /* renamed from: p */
    public static int m62717p() {
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        m62730c("glGenFramebuffers");
        return iArr[0];
    }

    /* renamed from: q */
    public static int m62716q() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        m62730c("glGenTextures");
        return iArr[0];
    }

    /* renamed from: w */
    public static int m62710w(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        m62730c("glCreateShader type=" + i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        Logger.m63223w("OpenGlRenderer", "Could not compile shader: " + str);
        GLES20.glDeleteShader(glCreateShader);
        throw new IllegalStateException("Could not compile shader type " + i + ":" + GLES20.glGetShaderInfoLog(glCreateShader));
    }

    /* renamed from: y */
    public static int m62708y(EGLDisplay eGLDisplay, EGLSurface eGLSurface, int i) {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(eGLDisplay, eGLSurface, i, iArr, 0);
        return iArr[0];
    }

    /* renamed from: A */
    public final void m62735A(Surface surface, boolean z) {
        AbstractC2556a abstractC2556a;
        if (this.f11412h == surface) {
            this.f11412h = null;
            m62709x(this.f11411g);
        }
        if (z) {
            abstractC2556a = (AbstractC2556a) this.f11406b.remove(surface);
        } else {
            abstractC2556a = (AbstractC2556a) this.f11406b.put(surface, f11404v);
        }
        if (abstractC2556a != null && abstractC2556a != f11404v) {
            try {
                EGL14.eglDestroySurface(this.f11408d, abstractC2556a.mo62660a());
            } catch (RuntimeException e) {
                Logger.m63222w("OpenGlRenderer", "Failed to destroy EGL surface: " + e.getMessage(), e);
            }
        }
    }

    /* renamed from: B */
    public final void m62734B(ByteBuffer byteBuffer, Size size, float[] fArr) {
        boolean z;
        if (byteBuffer.capacity() == size.getWidth() * size.getHeight() * 4) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "ByteBuffer capacity is not equal to width * height * 4.");
        Preconditions.checkArgument(byteBuffer.isDirect(), "ByteBuffer is not direct.");
        int m62716q = m62716q();
        GLES20.glActiveTexture(33985);
        m62730c("glActiveTexture");
        GLES20.glBindTexture(3553, m62716q);
        m62730c("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, size.getWidth(), size.getHeight(), 0, 6407, 5121, null);
        m62730c("glTexImage2D");
        GLES20.glTexParameteri(3553, Data.MAX_DATA_BYTES, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int m62717p = m62717p();
        GLES20.glBindFramebuffer(36160, m62717p);
        m62730c("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, m62716q, 0);
        m62730c("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        m62730c("glActiveTexture");
        GLES20.glBindTexture(36197, this.f11413i);
        m62730c("glBindTexture");
        this.f11412h = null;
        GLES20.glViewport(0, 0, size.getWidth(), size.getHeight());
        GLES20.glScissor(0, 0, size.getWidth(), size.getHeight());
        GLES20.glUniformMatrix4fv(this.f11415k, 1, false, fArr, 0);
        m62730c("glUniformMatrix4fv");
        GLES20.glDrawArrays(5, 0, 4);
        m62730c("glDrawArrays");
        GLES20.glReadPixels(0, 0, size.getWidth(), size.getHeight(), 6408, 5121, byteBuffer);
        m62730c("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        m62718o(m62716q);
        m62719n(m62717p);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.f11413i);
    }

    /* renamed from: C */
    public final void m62733C() {
        GLES20.glUseProgram(this.f11414j);
        m62730c("glUseProgram");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.f11413i);
        GLES20.glEnableVertexAttribArray(this.f11416l);
        m62730c("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.f11416l, 2, 5126, false, 0, (Buffer) f11401s);
        m62730c("glVertexAttribPointer");
        GLES20.glEnableVertexAttribArray(this.f11417m);
        m62730c("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.f11417m, 2, 5126, false, 0, (Buffer) f11403u);
        m62730c("glVertexAttribPointer");
    }

    /* renamed from: d */
    public final void m62729d() {
        boolean z;
        if (this.f11407c == Thread.currentThread()) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "Method call must be called on the GL thread.");
    }

    /* renamed from: e */
    public final void m62728e(boolean z) {
        boolean z2;
        String str;
        if (z == this.f11405a.get()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            str = "OpenGlRenderer is not initialized";
        } else {
            str = "OpenGlRenderer is already initialized";
        }
        Preconditions.checkState(z2, str);
    }

    /* renamed from: g */
    public final void m62726g(DynamicRange dynamicRange) {
        int i;
        int i2;
        int i3;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f11408d = eglGetDisplay;
        if (!Objects.equals(eglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            int i4 = 2;
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(this.f11408d, iArr, 0, iArr, 1)) {
                if (dynamicRange.is10BitHdr()) {
                    i = 10;
                } else {
                    i = 8;
                }
                if (dynamicRange.is10BitHdr()) {
                    i2 = 2;
                } else {
                    i2 = 8;
                }
                if (dynamicRange.is10BitHdr()) {
                    i3 = 64;
                } else {
                    i3 = 4;
                }
                int i5 = i;
                int i6 = i;
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (EGL14.eglChooseConfig(this.f11408d, new int[]{12324, i5, 12323, i6, 12322, i, 12321, i2, 12325, 0, 12326, 0, 12352, i3, 12610, !dynamicRange.is10BitHdr(), 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    if (dynamicRange.is10BitHdr()) {
                        i4 = 3;
                    }
                    EGLContext eglCreateContext = EGL14.eglCreateContext(this.f11408d, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, i4, 12344}, 0);
                    m62731b("eglCreateContext");
                    this.f11410f = eGLConfig;
                    this.f11409e = eglCreateContext;
                    int[] iArr2 = new int[1];
                    EGL14.eglQueryContext(this.f11408d, eglCreateContext, 12440, iArr2, 0);
                    StringBuilder sb = new StringBuilder();
                    sb.append("EGLContext created, client version ");
                    sb.append(iArr2[0]);
                    return;
                }
                throw new IllegalStateException("Unable to find a suitable EGLConfig");
            }
            this.f11408d = EGL14.EGL_NO_DISPLAY;
            throw new IllegalStateException("Unable to initialize EGL14");
        }
        throw new IllegalStateException("Unable to get EGL14 display");
    }

    public int getTextureName() {
        m62728e(true);
        m62729d();
        return this.f11413i;
    }

    /* renamed from: h */
    public final AbstractC2556a m62725h(Surface surface) {
        try {
            EGLDisplay eGLDisplay = this.f11408d;
            EGLConfig eGLConfig = this.f11410f;
            Objects.requireNonNull(eGLConfig);
            EGLSurface m62720m = m62720m(eGLDisplay, eGLConfig, surface);
            Size m62713t = m62713t(m62720m);
            return AbstractC2556a.m62706d(m62720m, m62713t.getWidth(), m62713t.getHeight());
        } catch (IllegalArgumentException | IllegalStateException e) {
            Logger.m63222w("OpenGlRenderer", "Failed to create EGL surface: " + e.getMessage(), e);
            return null;
        }
    }

    public void init(@NonNull DynamicRange dynamicRange, @NonNull ShaderProvider shaderProvider) {
        m62728e(false);
        try {
            if (dynamicRange.is10BitHdr() && !m62715r(dynamicRange).contains("GL_EXT_YUV_target")) {
                Log.w("OpenGlRenderer", "Device does not support GL_EXT_YUV_target. Fallback to SDR.");
                dynamicRange = DynamicRange.SDR;
            }
            m62726g(dynamicRange);
            m62722k();
            m62709x(this.f11411g);
            m62723j(dynamicRange, shaderProvider);
            m62711v();
            m62721l();
            m62733C();
            this.f11407c = Thread.currentThread();
            this.f11405a.set(true);
        } catch (IllegalArgumentException e) {
            e = e;
            m62707z();
            throw e;
        } catch (IllegalStateException e2) {
            e = e2;
            m62707z();
            throw e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0089  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m62723j(androidx.camera.core.DynamicRange r8, androidx.camera.core.processing.ShaderProvider r9) {
        /*
            r7 = this;
            java.lang.String r0 = "glAttachShader"
            r1 = -1
            boolean r2 = r8.is10BitHdr()     // Catch: java.lang.IllegalArgumentException -> Ld java.lang.IllegalStateException -> L13
            if (r2 == 0) goto L15
            java.lang.String r2 = androidx.camera.core.processing.OpenGlRenderer.f11397o     // Catch: java.lang.IllegalArgumentException -> Ld java.lang.IllegalStateException -> L13
            goto L17
        Ld:
            r8 = move-exception
        Le:
            r9 = -1
            r0 = -1
            r2 = -1
            goto L7d
        L13:
            r8 = move-exception
            goto Le
        L15:
            java.lang.String r2 = androidx.camera.core.processing.OpenGlRenderer.f11396n     // Catch: java.lang.IllegalArgumentException -> Ld java.lang.IllegalStateException -> L13
        L17:
            r3 = 35633(0x8b31, float:4.9932E-41)
            int r2 = m62710w(r3, r2)     // Catch: java.lang.IllegalArgumentException -> Ld java.lang.IllegalStateException -> L13
            int r8 = r7.m62712u(r8, r9)     // Catch: java.lang.IllegalArgumentException -> L77 java.lang.IllegalStateException -> L7b
            int r9 = android.opengl.GLES20.glCreateProgram()     // Catch: java.lang.IllegalArgumentException -> L6f java.lang.IllegalStateException -> L75
            java.lang.String r3 = "glCreateProgram"
            m62730c(r3)     // Catch: java.lang.IllegalArgumentException -> L4c java.lang.IllegalStateException -> L52
            android.opengl.GLES20.glAttachShader(r9, r2)     // Catch: java.lang.IllegalArgumentException -> L4c java.lang.IllegalStateException -> L52
            m62730c(r0)     // Catch: java.lang.IllegalArgumentException -> L4c java.lang.IllegalStateException -> L52
            android.opengl.GLES20.glAttachShader(r9, r8)     // Catch: java.lang.IllegalArgumentException -> L4c java.lang.IllegalStateException -> L52
            m62730c(r0)     // Catch: java.lang.IllegalArgumentException -> L4c java.lang.IllegalStateException -> L52
            android.opengl.GLES20.glLinkProgram(r9)     // Catch: java.lang.IllegalArgumentException -> L4c java.lang.IllegalStateException -> L52
            r0 = 1
            int[] r3 = new int[r0]     // Catch: java.lang.IllegalArgumentException -> L4c java.lang.IllegalStateException -> L52
            r4 = 35714(0x8b82, float:5.0046E-41)
            r5 = 0
            android.opengl.GLES20.glGetProgramiv(r9, r4, r3, r5)     // Catch: java.lang.IllegalArgumentException -> L4c java.lang.IllegalStateException -> L52
            r3 = r3[r5]     // Catch: java.lang.IllegalArgumentException -> L4c java.lang.IllegalStateException -> L52
            if (r3 != r0) goto L54
            r7.f11414j = r9     // Catch: java.lang.IllegalArgumentException -> L4c java.lang.IllegalStateException -> L52
            return
        L4c:
            r0 = move-exception
        L4d:
            r6 = r9
            r9 = r8
            r8 = r0
            r0 = r6
            goto L7d
        L52:
            r0 = move-exception
            goto L4d
        L54:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.IllegalArgumentException -> L4c java.lang.IllegalStateException -> L52
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L4c java.lang.IllegalStateException -> L52
            r3.<init>()     // Catch: java.lang.IllegalArgumentException -> L4c java.lang.IllegalStateException -> L52
            java.lang.String r4 = "Could not link program: "
            r3.append(r4)     // Catch: java.lang.IllegalArgumentException -> L4c java.lang.IllegalStateException -> L52
            java.lang.String r4 = android.opengl.GLES20.glGetProgramInfoLog(r9)     // Catch: java.lang.IllegalArgumentException -> L4c java.lang.IllegalStateException -> L52
            r3.append(r4)     // Catch: java.lang.IllegalArgumentException -> L4c java.lang.IllegalStateException -> L52
            java.lang.String r3 = r3.toString()     // Catch: java.lang.IllegalArgumentException -> L4c java.lang.IllegalStateException -> L52
            r0.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L4c java.lang.IllegalStateException -> L52
            throw r0     // Catch: java.lang.IllegalArgumentException -> L4c java.lang.IllegalStateException -> L52
        L6f:
            r9 = move-exception
        L70:
            r0 = -1
            r6 = r9
            r9 = r8
            r8 = r6
            goto L7d
        L75:
            r9 = move-exception
            goto L70
        L77:
            r8 = move-exception
        L78:
            r9 = -1
            r0 = -1
            goto L7d
        L7b:
            r8 = move-exception
            goto L78
        L7d:
            if (r2 == r1) goto L82
            android.opengl.GLES20.glDeleteShader(r2)
        L82:
            if (r9 == r1) goto L87
            android.opengl.GLES20.glDeleteShader(r9)
        L87:
            if (r0 == r1) goto L8c
            android.opengl.GLES20.glDeleteProgram(r0)
        L8c:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.processing.OpenGlRenderer.m62723j(androidx.camera.core.DynamicRange, androidx.camera.core.processing.ShaderProvider):void");
    }

    /* renamed from: k */
    public final void m62722k() {
        EGLDisplay eGLDisplay = this.f11408d;
        EGLConfig eGLConfig = this.f11410f;
        Objects.requireNonNull(eGLConfig);
        this.f11411g = m62724i(eGLDisplay, eGLConfig, 1, 1);
    }

    /* renamed from: l */
    public final void m62721l() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        m62730c("glGenTextures");
        int i = iArr[0];
        GLES20.glBindTexture(36197, i);
        m62730c("glBindTexture " + i);
        GLES20.glTexParameterf(36197, 10241, 9728.0f);
        GLES20.glTexParameterf(36197, Data.MAX_DATA_BYTES, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        m62730c("glTexParameter");
        this.f11413i = i;
    }

    /* renamed from: r */
    public final String m62715r(DynamicRange dynamicRange) {
        String str = "";
        m62728e(false);
        try {
            m62726g(dynamicRange);
            m62722k();
            m62709x(this.f11411g);
            String glGetString = GLES20.glGetString(7939);
            if (glGetString != null) {
                str = glGetString;
            }
            return str;
        } catch (IllegalStateException e) {
            Logger.m63222w("OpenGlRenderer", "Failed to get GL extensions: " + e.getMessage(), e);
            return "";
        } finally {
            m62707z();
        }
    }

    public void registerOutputSurface(@NonNull Surface surface) {
        m62728e(true);
        m62729d();
        if (!this.f11406b.containsKey(surface)) {
            this.f11406b.put(surface, f11404v);
        }
    }

    public void release() {
        if (!this.f11405a.getAndSet(false)) {
            return;
        }
        m62729d();
        m62707z();
    }

    public void render(long j, @NonNull float[] fArr, @NonNull Surface surface) {
        m62728e(true);
        m62729d();
        AbstractC2556a m62714s = m62714s(surface);
        if (m62714s == f11404v) {
            m62714s = m62725h(surface);
            if (m62714s == null) {
                return;
            }
            this.f11406b.put(surface, m62714s);
        }
        if (surface != this.f11412h) {
            m62709x(m62714s.mo62660a());
            this.f11412h = surface;
            GLES20.glViewport(0, 0, m62714s.mo62658c(), m62714s.mo62659b());
            GLES20.glScissor(0, 0, m62714s.mo62658c(), m62714s.mo62659b());
        }
        GLES20.glUniformMatrix4fv(this.f11415k, 1, false, fArr, 0);
        m62730c("glUniformMatrix4fv");
        GLES20.glDrawArrays(5, 0, 4);
        m62730c("glDrawArrays");
        EGLExt.eglPresentationTimeANDROID(this.f11408d, m62714s.mo62660a(), j);
        if (!EGL14.eglSwapBuffers(this.f11408d, m62714s.mo62660a())) {
            Logger.m63223w("OpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
            m62735A(surface, false);
        }
    }

    /* renamed from: s */
    public final AbstractC2556a m62714s(Surface surface) {
        Preconditions.checkState(this.f11406b.containsKey(surface), "The surface is not registered.");
        AbstractC2556a abstractC2556a = (AbstractC2556a) this.f11406b.get(surface);
        Objects.requireNonNull(abstractC2556a);
        return abstractC2556a;
    }

    @NonNull
    public Bitmap snapshot(@NonNull Size size, @NonNull float[] fArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(size.getWidth() * size.getHeight() * 4);
        m62734B(allocateDirect, size, fArr);
        Bitmap createBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), Bitmap.Config.ARGB_8888);
        allocateDirect.rewind();
        ImageProcessingUtil.copyByteBufferToBitmap(createBitmap, allocateDirect, size.getWidth() * 4);
        return createBitmap;
    }

    /* renamed from: t */
    public final Size m62713t(EGLSurface eGLSurface) {
        return new Size(m62708y(this.f11408d, eGLSurface, 12375), m62708y(this.f11408d, eGLSurface, 12374));
    }

    /* renamed from: u */
    public final int m62712u(DynamicRange dynamicRange, ShaderProvider shaderProvider) {
        String str;
        if (shaderProvider == ShaderProvider.DEFAULT) {
            if (dynamicRange.is10BitHdr()) {
                str = f11399q;
            } else {
                str = f11398p;
            }
            return m62710w(35632, str);
        }
        try {
            String createFragmentShader = shaderProvider.createFragmentShader("sTexture", "vTextureCoord");
            if (createFragmentShader != null && createFragmentShader.contains("vTextureCoord") && createFragmentShader.contains("sTexture")) {
                return m62710w(35632, createFragmentShader);
            }
            throw new IllegalArgumentException("Invalid fragment shader");
        } catch (Throwable th2) {
            if (th2 instanceof IllegalArgumentException) {
                throw th2;
            }
            throw new IllegalArgumentException("Unable to compile fragment shader", th2);
        }
    }

    public void unregisterOutputSurface(@NonNull Surface surface) {
        m62728e(true);
        m62729d();
        m62735A(surface, true);
    }

    /* renamed from: v */
    public final void m62711v() {
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.f11414j, "aPosition");
        this.f11416l = glGetAttribLocation;
        m62727f(glGetAttribLocation, "aPosition");
        int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.f11414j, "aTextureCoord");
        this.f11417m = glGetAttribLocation2;
        m62727f(glGetAttribLocation2, "aTextureCoord");
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.f11414j, "uTexMatrix");
        this.f11415k = glGetUniformLocation;
        m62727f(glGetUniformLocation, "uTexMatrix");
    }

    /* renamed from: x */
    public final void m62709x(EGLSurface eGLSurface) {
        Preconditions.checkNotNull(this.f11408d);
        Preconditions.checkNotNull(this.f11409e);
        if (EGL14.eglMakeCurrent(this.f11408d, eGLSurface, eGLSurface, this.f11409e)) {
            return;
        }
        throw new IllegalStateException("eglMakeCurrent failed");
    }

    /* renamed from: z */
    public final void m62707z() {
        int i = this.f11414j;
        if (i != -1) {
            GLES20.glDeleteProgram(i);
            this.f11414j = -1;
        }
        if (!Objects.equals(this.f11408d, EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay = this.f11408d;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            for (AbstractC2556a abstractC2556a : this.f11406b.values()) {
                if (!Objects.equals(abstractC2556a.mo62660a(), EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface(this.f11408d, abstractC2556a.mo62660a())) {
                    m62732a("eglDestroySurface");
                }
            }
            this.f11406b.clear();
            if (!Objects.equals(this.f11411g, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f11408d, this.f11411g);
                this.f11411g = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals(this.f11409e, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext(this.f11408d, this.f11409e);
                this.f11409e = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f11408d);
            this.f11408d = EGL14.EGL_NO_DISPLAY;
        }
        this.f11410f = null;
        this.f11414j = -1;
        this.f11415k = -1;
        this.f11416l = -1;
        this.f11417m = -1;
        this.f11413i = -1;
        this.f11412h = null;
        this.f11407c = null;
    }
}
