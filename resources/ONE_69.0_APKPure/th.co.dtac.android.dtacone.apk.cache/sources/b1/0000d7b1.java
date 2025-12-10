package jp.p022co.cyberagent.android.gpuimage;

import android.opengl.GLES20;

/* renamed from: jp.co.cyberagent.android.gpuimage.GPUImage3x3TextureSamplingFilter */
/* loaded from: classes5.dex */
public class GPUImage3x3TextureSamplingFilter extends GPUImageFilter {
    public static final String THREE_X_THREE_TEXTURE_SAMPLING_VERTEX_SHADER = "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n\nuniform highp float texelWidth; \nuniform highp float texelHeight; \n\nvarying vec2 textureCoordinate;\nvarying vec2 leftTextureCoordinate;\nvarying vec2 rightTextureCoordinate;\n\nvarying vec2 topTextureCoordinate;\nvarying vec2 topLeftTextureCoordinate;\nvarying vec2 topRightTextureCoordinate;\n\nvarying vec2 bottomTextureCoordinate;\nvarying vec2 bottomLeftTextureCoordinate;\nvarying vec2 bottomRightTextureCoordinate;\n\nvoid main()\n{\n    gl_Position = position;\n\n    vec2 widthStep = vec2(texelWidth, 0.0);\n    vec2 heightStep = vec2(0.0, texelHeight);\n    vec2 widthHeightStep = vec2(texelWidth, texelHeight);\n    vec2 widthNegativeHeightStep = vec2(texelWidth, -texelHeight);\n\n    textureCoordinate = inputTextureCoordinate.xy;\n    leftTextureCoordinate = inputTextureCoordinate.xy - widthStep;\n    rightTextureCoordinate = inputTextureCoordinate.xy + widthStep;\n\n    topTextureCoordinate = inputTextureCoordinate.xy - heightStep;\n    topLeftTextureCoordinate = inputTextureCoordinate.xy - widthHeightStep;\n    topRightTextureCoordinate = inputTextureCoordinate.xy + widthNegativeHeightStep;\n\n    bottomTextureCoordinate = inputTextureCoordinate.xy + heightStep;\n    bottomLeftTextureCoordinate = inputTextureCoordinate.xy - widthNegativeHeightStep;\n    bottomRightTextureCoordinate = inputTextureCoordinate.xy + widthHeightStep;\n}";

    /* renamed from: e */
    public int f67465e;

    /* renamed from: f */
    public int f67466f;

    /* renamed from: g */
    public boolean f67467g;

    /* renamed from: h */
    public float f67468h;

    /* renamed from: i */
    public float f67469i;

    /* renamed from: j */
    public float f67470j;

    public GPUImage3x3TextureSamplingFilter() {
        this(GPUImageFilter.NO_FILTER_VERTEX_SHADER);
    }

    /* renamed from: a */
    public final void m29403a() {
        setFloat(this.f67465e, this.f67468h);
        setFloat(this.f67466f, this.f67469i);
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onInit() {
        super.onInit();
        this.f67465e = GLES20.glGetUniformLocation(getProgram(), "texelWidth");
        this.f67466f = GLES20.glGetUniformLocation(getProgram(), "texelHeight");
        if (this.f67468h != 0.0f) {
            m29403a();
        }
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onOutputSizeChanged(int i, int i2) {
        super.onOutputSizeChanged(i, i2);
        if (!this.f67467g) {
            setLineSize(this.f67470j);
        }
    }

    public void setLineSize(float f) {
        this.f67470j = f;
        this.f67468h = f / getOutputWidth();
        this.f67469i = f / getOutputHeight();
        m29403a();
    }

    public void setTexelHeight(float f) {
        this.f67467g = true;
        this.f67469i = f;
        setFloat(this.f67466f, f);
    }

    public void setTexelWidth(float f) {
        this.f67467g = true;
        this.f67468h = f;
        setFloat(this.f67465e, f);
    }

    public GPUImage3x3TextureSamplingFilter(String str) {
        super(THREE_X_THREE_TEXTURE_SAMPLING_VERTEX_SHADER, str);
        this.f67467g = false;
        this.f67470j = 1.0f;
    }
}