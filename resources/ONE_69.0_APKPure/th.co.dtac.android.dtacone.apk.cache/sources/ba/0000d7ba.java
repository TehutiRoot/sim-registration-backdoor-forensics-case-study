package jp.p022co.cyberagent.android.gpuimage;

import android.opengl.GLES20;

/* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageChromaKeyBlendFilter */
/* loaded from: classes5.dex */
public class GPUImageChromaKeyBlendFilter extends GPUImageTwoInputFilter {
    public static final String CHROMA_KEY_BLEND_FRAGMENT_SHADER = " precision highp float;\n \n varying highp vec2 textureCoordinate;\n varying highp vec2 textureCoordinate2;\n\n uniform float thresholdSensitivity;\n uniform float smoothing;\n uniform vec3 colorToReplace;\n uniform sampler2D inputImageTexture;\n uniform sampler2D inputImageTexture2;\n \n void main()\n {\n     vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n     vec4 textureColor2 = texture2D(inputImageTexture2, textureCoordinate2);\n     \n     float maskY = 0.2989 * colorToReplace.r + 0.5866 * colorToReplace.g + 0.1145 * colorToReplace.b;\n     float maskCr = 0.7132 * (colorToReplace.r - maskY);\n     float maskCb = 0.5647 * (colorToReplace.b - maskY);\n     \n     float Y = 0.2989 * textureColor.r + 0.5866 * textureColor.g + 0.1145 * textureColor.b;\n     float Cr = 0.7132 * (textureColor.r - Y);\n     float Cb = 0.5647 * (textureColor.b - Y);\n     \n     float blendValue = 1.0 - smoothstep(thresholdSensitivity, thresholdSensitivity + smoothing, distance(vec2(Cr, Cb), vec2(maskCr, maskCb)));\n     gl_FragColor = mix(textureColor, textureColor2, blendValue);\n }";

    /* renamed from: g */
    public int f67486g;

    /* renamed from: h */
    public int f67487h;

    /* renamed from: i */
    public int f67488i;

    /* renamed from: j */
    public float f67489j;

    /* renamed from: k */
    public float f67490k;

    /* renamed from: l */
    public float[] f67491l;

    public GPUImageChromaKeyBlendFilter() {
        super(CHROMA_KEY_BLEND_FRAGMENT_SHADER);
        this.f67489j = 0.1f;
        this.f67490k = 0.3f;
        this.f67491l = new float[]{0.0f, 1.0f, 0.0f};
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageTwoInputFilter, jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onInit() {
        super.onInit();
        this.f67486g = GLES20.glGetUniformLocation(getProgram(), "thresholdSensitivity");
        this.f67487h = GLES20.glGetUniformLocation(getProgram(), "smoothing");
        this.f67488i = GLES20.glGetUniformLocation(getProgram(), "colorToReplace");
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onInitialized() {
        super.onInitialized();
        setSmoothing(this.f67489j);
        setThresholdSensitivity(this.f67490k);
        float[] fArr = this.f67491l;
        setColorToReplace(fArr[0], fArr[1], fArr[2]);
    }

    public void setColorToReplace(float f, float f2, float f3) {
        float[] fArr = {f, f2, f3};
        this.f67491l = fArr;
        setFloatVec3(this.f67488i, fArr);
    }

    public void setSmoothing(float f) {
        this.f67489j = f;
        setFloat(this.f67487h, f);
    }

    public void setThresholdSensitivity(float f) {
        this.f67490k = f;
        setFloat(this.f67486g, f);
    }
}