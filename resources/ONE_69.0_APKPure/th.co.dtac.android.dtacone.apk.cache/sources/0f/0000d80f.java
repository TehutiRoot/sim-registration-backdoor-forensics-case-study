package jp.p022co.cyberagent.android.gpuimage;

import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageTransformFilter */
/* loaded from: classes5.dex */
public class GPUImageTransformFilter extends GPUImageFilter {
    public static final String TRANSFORM_VERTEX_SHADER = "attribute vec4 position;\n attribute vec4 inputTextureCoordinate;\n \n uniform mat4 transformMatrix;\n uniform mat4 orthographicMatrix;\n \n varying vec2 textureCoordinate;\n \n void main()\n {\n     gl_Position = transformMatrix * vec4(position.xyz, 1.0) * orthographicMatrix;\n     textureCoordinate = inputTextureCoordinate.xy;\n }";

    /* renamed from: e */
    public int f67688e;

    /* renamed from: f */
    public int f67689f;

    /* renamed from: g */
    public float[] f67690g;

    /* renamed from: h */
    public float[] f67691h;

    /* renamed from: i */
    public boolean f67692i;

    /* renamed from: j */
    public boolean f67693j;

    public GPUImageTransformFilter() {
        super(TRANSFORM_VERTEX_SHADER, GPUImageFilter.NO_FILTER_FRAGMENT_SHADER);
        float[] fArr = new float[16];
        this.f67690g = fArr;
        Matrix.orthoM(fArr, 0, -1.0f, 1.0f, -1.0f, 1.0f, -1.0f, 1.0f);
        float[] fArr2 = new float[16];
        this.f67691h = fArr2;
        Matrix.setIdentityM(fArr2, 0);
    }

    public boolean anchorTopLeft() {
        return this.f67693j;
    }

    public float[] getTransform3D() {
        return this.f67691h;
    }

    public boolean ignoreAspectRatio() {
        return this.f67692i;
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onDraw(int i, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        if (!this.f67692i) {
            floatBuffer.position(0);
            floatBuffer.get(r0);
            float outputHeight = getOutputHeight() / getOutputWidth();
            float[] fArr = {0.0f, fArr[1] * outputHeight, 0.0f, fArr[3] * outputHeight, 0.0f, fArr[5] * outputHeight, 0.0f, fArr[7] * outputHeight};
            floatBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
            floatBuffer.put(fArr).position(0);
        }
        super.onDraw(i, floatBuffer, floatBuffer2);
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onInit() {
        super.onInit();
        this.f67688e = GLES20.glGetUniformLocation(getProgram(), "transformMatrix");
        this.f67689f = GLES20.glGetUniformLocation(getProgram(), "orthographicMatrix");
        setUniformMatrix4f(this.f67688e, this.f67691h);
        setUniformMatrix4f(this.f67689f, this.f67690g);
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onInitialized() {
        super.onInitialized();
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onOutputSizeChanged(int i, int i2) {
        super.onOutputSizeChanged(i, i2);
        if (!this.f67692i) {
            float f = i2;
            float f2 = i;
            Matrix.orthoM(this.f67690g, 0, -1.0f, 1.0f, ((-1.0f) * f) / f2, (f * 1.0f) / f2, -1.0f, 1.0f);
            setUniformMatrix4f(this.f67689f, this.f67690g);
        }
    }

    public void setAnchorTopLeft(boolean z) {
        this.f67693j = z;
        setIgnoreAspectRatio(this.f67692i);
    }

    public void setIgnoreAspectRatio(boolean z) {
        this.f67692i = z;
        if (z) {
            Matrix.orthoM(this.f67690g, 0, -1.0f, 1.0f, -1.0f, 1.0f, -1.0f, 1.0f);
            setUniformMatrix4f(this.f67689f, this.f67690g);
            return;
        }
        onOutputSizeChanged(getOutputWidth(), getOutputHeight());
    }

    public void setTransform3D(float[] fArr) {
        this.f67691h = fArr;
        setUniformMatrix4f(this.f67688e, fArr);
    }
}