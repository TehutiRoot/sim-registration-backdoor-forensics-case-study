package jp.p022co.cyberagent.android.gpuimage;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.GLES20;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.LinkedList;
import java.util.Scanner;

/* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageFilter */
/* loaded from: classes5.dex */
public class GPUImageFilter {
    public static final String NO_FILTER_FRAGMENT_SHADER = "varying highp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}";
    public static final String NO_FILTER_VERTEX_SHADER = "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}";

    /* renamed from: a */
    public final LinkedList f67517a;

    /* renamed from: b */
    public final String f67518b;

    /* renamed from: c */
    public final String f67519c;

    /* renamed from: d */
    public boolean f67520d;
    protected int mGLAttribPosition;
    protected int mGLAttribTextureCoordinate;
    protected int mGLProgId;
    protected int mGLUniformTexture;
    protected int mOutputHeight;
    protected int mOutputWidth;

    /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageFilter$a */
    /* loaded from: classes5.dex */
    public class RunnableC11554a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f67521a;

        /* renamed from: b */
        public final /* synthetic */ int f67522b;

        public RunnableC11554a(int i, int i2) {
            this.f67521a = i;
            this.f67522b = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            GLES20.glUniform1i(this.f67521a, this.f67522b);
        }
    }

    /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageFilter$b */
    /* loaded from: classes5.dex */
    public class RunnableC11555b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f67524a;

        /* renamed from: b */
        public final /* synthetic */ float f67525b;

        public RunnableC11555b(int i, float f) {
            this.f67524a = i;
            this.f67525b = f;
        }

        @Override // java.lang.Runnable
        public void run() {
            GLES20.glUniform1f(this.f67524a, this.f67525b);
        }
    }

    /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageFilter$c */
    /* loaded from: classes5.dex */
    public class RunnableC11556c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f67527a;

        /* renamed from: b */
        public final /* synthetic */ float[] f67528b;

        public RunnableC11556c(int i, float[] fArr) {
            this.f67527a = i;
            this.f67528b = fArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            GLES20.glUniform2fv(this.f67527a, 1, FloatBuffer.wrap(this.f67528b));
        }
    }

    /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageFilter$d */
    /* loaded from: classes5.dex */
    public class RunnableC11557d implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f67530a;

        /* renamed from: b */
        public final /* synthetic */ float[] f67531b;

        public RunnableC11557d(int i, float[] fArr) {
            this.f67530a = i;
            this.f67531b = fArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            GLES20.glUniform3fv(this.f67530a, 1, FloatBuffer.wrap(this.f67531b));
        }
    }

    /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageFilter$e */
    /* loaded from: classes5.dex */
    public class RunnableC11558e implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f67533a;

        /* renamed from: b */
        public final /* synthetic */ float[] f67534b;

        public RunnableC11558e(int i, float[] fArr) {
            this.f67533a = i;
            this.f67534b = fArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            GLES20.glUniform4fv(this.f67533a, 1, FloatBuffer.wrap(this.f67534b));
        }
    }

    /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageFilter$f */
    /* loaded from: classes5.dex */
    public class RunnableC11559f implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f67536a;

        /* renamed from: b */
        public final /* synthetic */ float[] f67537b;

        public RunnableC11559f(int i, float[] fArr) {
            this.f67536a = i;
            this.f67537b = fArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = this.f67536a;
            float[] fArr = this.f67537b;
            GLES20.glUniform1fv(i, fArr.length, FloatBuffer.wrap(fArr));
        }
    }

    /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageFilter$g */
    /* loaded from: classes5.dex */
    public class RunnableC11560g implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ PointF f67539a;

        /* renamed from: b */
        public final /* synthetic */ int f67540b;

        public RunnableC11560g(PointF pointF, int i) {
            this.f67539a = pointF;
            this.f67540b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            PointF pointF = this.f67539a;
            GLES20.glUniform2fv(this.f67540b, 1, new float[]{pointF.x, pointF.y}, 0);
        }
    }

    /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageFilter$h */
    /* loaded from: classes5.dex */
    public class RunnableC11561h implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f67542a;

        /* renamed from: b */
        public final /* synthetic */ float[] f67543b;

        public RunnableC11561h(int i, float[] fArr) {
            this.f67542a = i;
            this.f67543b = fArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            GLES20.glUniformMatrix3fv(this.f67542a, 1, false, this.f67543b, 0);
        }
    }

    /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageFilter$i */
    /* loaded from: classes5.dex */
    public class RunnableC11562i implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f67545a;

        /* renamed from: b */
        public final /* synthetic */ float[] f67546b;

        public RunnableC11562i(int i, float[] fArr) {
            this.f67545a = i;
            this.f67546b = fArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            GLES20.glUniformMatrix4fv(this.f67545a, 1, false, this.f67546b, 0);
        }
    }

    public GPUImageFilter() {
        this(NO_FILTER_VERTEX_SHADER, NO_FILTER_FRAGMENT_SHADER);
    }

    public static String convertStreamToString(InputStream inputStream) {
        Scanner useDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        if (useDelimiter.hasNext()) {
            return useDelimiter.next();
        }
        return "";
    }

    public static String loadShader(String str, Context context) {
        try {
            InputStream open = context.getAssets().open(str);
            String convertStreamToString = convertStreamToString(open);
            open.close();
            return convertStreamToString;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public final void destroy() {
        this.f67520d = false;
        GLES20.glDeleteProgram(this.mGLProgId);
        onDestroy();
    }

    public int getAttribPosition() {
        return this.mGLAttribPosition;
    }

    public int getAttribTextureCoordinate() {
        return this.mGLAttribTextureCoordinate;
    }

    public int getOutputHeight() {
        return this.mOutputHeight;
    }

    public int getOutputWidth() {
        return this.mOutputWidth;
    }

    public int getProgram() {
        return this.mGLProgId;
    }

    public int getUniformTexture() {
        return this.mGLUniformTexture;
    }

    public final void init() {
        onInit();
        this.f67520d = true;
        onInitialized();
    }

    public boolean isInitialized() {
        return this.f67520d;
    }

    public void onDestroy() {
    }

    public void onDraw(int i, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        GLES20.glUseProgram(this.mGLProgId);
        runPendingOnDrawTasks();
        if (!this.f67520d) {
            return;
        }
        floatBuffer.position(0);
        GLES20.glVertexAttribPointer(this.mGLAttribPosition, 2, 5126, false, 0, (Buffer) floatBuffer);
        GLES20.glEnableVertexAttribArray(this.mGLAttribPosition);
        floatBuffer2.position(0);
        GLES20.glVertexAttribPointer(this.mGLAttribTextureCoordinate, 2, 5126, false, 0, (Buffer) floatBuffer2);
        GLES20.glEnableVertexAttribArray(this.mGLAttribTextureCoordinate);
        if (i != -1) {
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, i);
            GLES20.glUniform1i(this.mGLUniformTexture, 0);
        }
        onDrawArraysPre();
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.mGLAttribPosition);
        GLES20.glDisableVertexAttribArray(this.mGLAttribTextureCoordinate);
        GLES20.glBindTexture(3553, 0);
    }

    public void onDrawArraysPre() {
    }

    public void onInit() {
        int loadProgram = OpenGlUtils.loadProgram(this.f67518b, this.f67519c);
        this.mGLProgId = loadProgram;
        this.mGLAttribPosition = GLES20.glGetAttribLocation(loadProgram, "position");
        this.mGLUniformTexture = GLES20.glGetUniformLocation(this.mGLProgId, "inputImageTexture");
        this.mGLAttribTextureCoordinate = GLES20.glGetAttribLocation(this.mGLProgId, "inputTextureCoordinate");
        this.f67520d = true;
    }

    public void onInitialized() {
    }

    public void onOutputSizeChanged(int i, int i2) {
        this.mOutputWidth = i;
        this.mOutputHeight = i2;
    }

    public void runOnDraw(Runnable runnable) {
        synchronized (this.f67517a) {
            this.f67517a.addLast(runnable);
        }
    }

    public void runPendingOnDrawTasks() {
        while (!this.f67517a.isEmpty()) {
            ((Runnable) this.f67517a.removeFirst()).run();
        }
    }

    public void setFloat(int i, float f) {
        runOnDraw(new RunnableC11555b(i, f));
    }

    public void setFloatArray(int i, float[] fArr) {
        runOnDraw(new RunnableC11559f(i, fArr));
    }

    public void setFloatVec2(int i, float[] fArr) {
        runOnDraw(new RunnableC11556c(i, fArr));
    }

    public void setFloatVec3(int i, float[] fArr) {
        runOnDraw(new RunnableC11557d(i, fArr));
    }

    public void setFloatVec4(int i, float[] fArr) {
        runOnDraw(new RunnableC11558e(i, fArr));
    }

    public void setInteger(int i, int i2) {
        runOnDraw(new RunnableC11554a(i, i2));
    }

    public void setPoint(int i, PointF pointF) {
        runOnDraw(new RunnableC11560g(pointF, i));
    }

    public void setUniformMatrix3f(int i, float[] fArr) {
        runOnDraw(new RunnableC11561h(i, fArr));
    }

    public void setUniformMatrix4f(int i, float[] fArr) {
        runOnDraw(new RunnableC11562i(i, fArr));
    }

    public GPUImageFilter(String str, String str2) {
        this.f67517a = new LinkedList();
        this.f67518b = str;
        this.f67519c = str2;
    }
}