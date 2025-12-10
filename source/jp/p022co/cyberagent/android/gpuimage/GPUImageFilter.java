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
    public final LinkedList f67460a;

    /* renamed from: b */
    public final String f67461b;

    /* renamed from: c */
    public final String f67462c;

    /* renamed from: d */
    public boolean f67463d;
    protected int mGLAttribPosition;
    protected int mGLAttribTextureCoordinate;
    protected int mGLProgId;
    protected int mGLUniformTexture;
    protected int mOutputHeight;
    protected int mOutputWidth;

    /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageFilter$a */
    /* loaded from: classes5.dex */
    public class RunnableC11569a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f67464a;

        /* renamed from: b */
        public final /* synthetic */ int f67465b;

        public RunnableC11569a(int i, int i2) {
            this.f67464a = i;
            this.f67465b = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            GLES20.glUniform1i(this.f67464a, this.f67465b);
        }
    }

    /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageFilter$b */
    /* loaded from: classes5.dex */
    public class RunnableC11570b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f67467a;

        /* renamed from: b */
        public final /* synthetic */ float f67468b;

        public RunnableC11570b(int i, float f) {
            this.f67467a = i;
            this.f67468b = f;
        }

        @Override // java.lang.Runnable
        public void run() {
            GLES20.glUniform1f(this.f67467a, this.f67468b);
        }
    }

    /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageFilter$c */
    /* loaded from: classes5.dex */
    public class RunnableC11571c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f67470a;

        /* renamed from: b */
        public final /* synthetic */ float[] f67471b;

        public RunnableC11571c(int i, float[] fArr) {
            this.f67470a = i;
            this.f67471b = fArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            GLES20.glUniform2fv(this.f67470a, 1, FloatBuffer.wrap(this.f67471b));
        }
    }

    /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageFilter$d */
    /* loaded from: classes5.dex */
    public class RunnableC11572d implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f67473a;

        /* renamed from: b */
        public final /* synthetic */ float[] f67474b;

        public RunnableC11572d(int i, float[] fArr) {
            this.f67473a = i;
            this.f67474b = fArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            GLES20.glUniform3fv(this.f67473a, 1, FloatBuffer.wrap(this.f67474b));
        }
    }

    /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageFilter$e */
    /* loaded from: classes5.dex */
    public class RunnableC11573e implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f67476a;

        /* renamed from: b */
        public final /* synthetic */ float[] f67477b;

        public RunnableC11573e(int i, float[] fArr) {
            this.f67476a = i;
            this.f67477b = fArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            GLES20.glUniform4fv(this.f67476a, 1, FloatBuffer.wrap(this.f67477b));
        }
    }

    /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageFilter$f */
    /* loaded from: classes5.dex */
    public class RunnableC11574f implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f67479a;

        /* renamed from: b */
        public final /* synthetic */ float[] f67480b;

        public RunnableC11574f(int i, float[] fArr) {
            this.f67479a = i;
            this.f67480b = fArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = this.f67479a;
            float[] fArr = this.f67480b;
            GLES20.glUniform1fv(i, fArr.length, FloatBuffer.wrap(fArr));
        }
    }

    /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageFilter$g */
    /* loaded from: classes5.dex */
    public class RunnableC11575g implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ PointF f67482a;

        /* renamed from: b */
        public final /* synthetic */ int f67483b;

        public RunnableC11575g(PointF pointF, int i) {
            this.f67482a = pointF;
            this.f67483b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            PointF pointF = this.f67482a;
            GLES20.glUniform2fv(this.f67483b, 1, new float[]{pointF.x, pointF.y}, 0);
        }
    }

    /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageFilter$h */
    /* loaded from: classes5.dex */
    public class RunnableC11576h implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f67485a;

        /* renamed from: b */
        public final /* synthetic */ float[] f67486b;

        public RunnableC11576h(int i, float[] fArr) {
            this.f67485a = i;
            this.f67486b = fArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            GLES20.glUniformMatrix3fv(this.f67485a, 1, false, this.f67486b, 0);
        }
    }

    /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageFilter$i */
    /* loaded from: classes5.dex */
    public class RunnableC11577i implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f67488a;

        /* renamed from: b */
        public final /* synthetic */ float[] f67489b;

        public RunnableC11577i(int i, float[] fArr) {
            this.f67488a = i;
            this.f67489b = fArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            GLES20.glUniformMatrix4fv(this.f67488a, 1, false, this.f67489b, 0);
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
        this.f67463d = false;
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
        this.f67463d = true;
        onInitialized();
    }

    public boolean isInitialized() {
        return this.f67463d;
    }

    public void onDestroy() {
    }

    public void onDraw(int i, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        GLES20.glUseProgram(this.mGLProgId);
        runPendingOnDrawTasks();
        if (!this.f67463d) {
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
        int loadProgram = OpenGlUtils.loadProgram(this.f67461b, this.f67462c);
        this.mGLProgId = loadProgram;
        this.mGLAttribPosition = GLES20.glGetAttribLocation(loadProgram, "position");
        this.mGLUniformTexture = GLES20.glGetUniformLocation(this.mGLProgId, "inputImageTexture");
        this.mGLAttribTextureCoordinate = GLES20.glGetAttribLocation(this.mGLProgId, "inputTextureCoordinate");
        this.f67463d = true;
    }

    public void onInitialized() {
    }

    public void onOutputSizeChanged(int i, int i2) {
        this.mOutputWidth = i;
        this.mOutputHeight = i2;
    }

    public void runOnDraw(Runnable runnable) {
        synchronized (this.f67460a) {
            this.f67460a.addLast(runnable);
        }
    }

    public void runPendingOnDrawTasks() {
        while (!this.f67460a.isEmpty()) {
            ((Runnable) this.f67460a.removeFirst()).run();
        }
    }

    public void setFloat(int i, float f) {
        runOnDraw(new RunnableC11570b(i, f));
    }

    public void setFloatArray(int i, float[] fArr) {
        runOnDraw(new RunnableC11574f(i, fArr));
    }

    public void setFloatVec2(int i, float[] fArr) {
        runOnDraw(new RunnableC11571c(i, fArr));
    }

    public void setFloatVec3(int i, float[] fArr) {
        runOnDraw(new RunnableC11572d(i, fArr));
    }

    public void setFloatVec4(int i, float[] fArr) {
        runOnDraw(new RunnableC11573e(i, fArr));
    }

    public void setInteger(int i, int i2) {
        runOnDraw(new RunnableC11569a(i, i2));
    }

    public void setPoint(int i, PointF pointF) {
        runOnDraw(new RunnableC11575g(pointF, i));
    }

    public void setUniformMatrix3f(int i, float[] fArr) {
        runOnDraw(new RunnableC11576h(i, fArr));
    }

    public void setUniformMatrix4f(int i, float[] fArr) {
        runOnDraw(new RunnableC11577i(i, fArr));
    }

    public GPUImageFilter(String str, String str2) {
        this.f67460a = new LinkedList();
        this.f67461b = str;
        this.f67462c = str2;
    }
}
