package jp.p022co.cyberagent.android.gpuimage;

import android.opengl.GLES20;

/* renamed from: jp.co.cyberagent.android.gpuimage.GPUImagePixelationFilter */
/* loaded from: classes5.dex */
public class GPUImagePixelationFilter extends GPUImageFilter {
    public static final String PIXELATION_FRAGMENT_SHADER = "precision highp float;\nvarying vec2 textureCoordinate;\nuniform float imageWidthFactor;\nuniform float imageHeightFactor;\nuniform sampler2D inputImageTexture;\nuniform float pixel;\nvoid main()\n{\n  vec2 uv  = textureCoordinate.xy;\n  float dx = pixel * imageWidthFactor;\n  float dy = pixel * imageHeightFactor;\n  vec2 coord = vec2(dx * floor(uv.x / dx), dy * floor(uv.y / dy));\n  vec3 tc = texture2D(inputImageTexture, coord).xyz;\n  gl_FragColor = vec4(tc, 1.0);\n}";

    /* renamed from: e */
    public int f67545e;

    /* renamed from: f */
    public int f67546f;

    /* renamed from: g */
    public float f67547g;

    /* renamed from: h */
    public int f67548h;

    public GPUImagePixelationFilter() {
        super(GPUImageFilter.NO_FILTER_VERTEX_SHADER, PIXELATION_FRAGMENT_SHADER);
        this.f67547g = 1.0f;
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onInit() {
        super.onInit();
        this.f67545e = GLES20.glGetUniformLocation(getProgram(), "imageWidthFactor");
        this.f67546f = GLES20.glGetUniformLocation(getProgram(), "imageHeightFactor");
        this.f67548h = GLES20.glGetUniformLocation(getProgram(), "pixel");
        setPixel(this.f67547g);
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onOutputSizeChanged(int i, int i2) {
        super.onOutputSizeChanged(i, i2);
        setFloat(this.f67545e, 1.0f / i);
        setFloat(this.f67546f, 1.0f / i2);
    }

    public void setPixel(float f) {
        this.f67547g = f;
        setFloat(this.f67548h, f);
    }
}
