package jp.p022co.cyberagent.android.gpuimage;

import android.opengl.GLES20;

/* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageColorMatrixFilter */
/* loaded from: classes5.dex */
public class GPUImageColorMatrixFilter extends GPUImageFilter {
    public static final String COLOR_MATRIX_FRAGMENT_SHADER = "varying highp vec2 textureCoordinate;\n\nuniform sampler2D inputImageTexture;\n\nuniform lowp mat4 colorMatrix;\nuniform lowp float intensity;\n\nvoid main()\n{\n    lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n    lowp vec4 outputColor = textureColor * colorMatrix;\n    \n    gl_FragColor = (intensity * outputColor) + ((1.0 - intensity) * textureColor);\n}";

    /* renamed from: e */
    public float f67500e;

    /* renamed from: f */
    public float[] f67501f;

    /* renamed from: g */
    public int f67502g;

    /* renamed from: h */
    public int f67503h;

    public GPUImageColorMatrixFilter() {
        this(1.0f, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f});
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onInit() {
        super.onInit();
        this.f67502g = GLES20.glGetUniformLocation(getProgram(), "colorMatrix");
        this.f67503h = GLES20.glGetUniformLocation(getProgram(), "intensity");
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onInitialized() {
        super.onInitialized();
        setIntensity(this.f67500e);
        setColorMatrix(this.f67501f);
    }

    public void setColorMatrix(float[] fArr) {
        this.f67501f = fArr;
        setUniformMatrix4f(this.f67502g, fArr);
    }

    public void setIntensity(float f) {
        this.f67500e = f;
        setFloat(this.f67503h, f);
    }

    public GPUImageColorMatrixFilter(float f, float[] fArr) {
        super(GPUImageFilter.NO_FILTER_VERTEX_SHADER, COLOR_MATRIX_FRAGMENT_SHADER);
        this.f67500e = f;
        this.f67501f = fArr;
    }
}