package jp.p022co.cyberagent.android.gpuimage;

import android.opengl.GLES20;

/* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageHalftoneFilter */
/* loaded from: classes5.dex */
public class GPUImageHalftoneFilter extends GPUImageFilter {
    public static final String HALFTONE_FRAGMENT_SHADER = "varying highp vec2 textureCoordinate;\nuniform sampler2D inputImageTexture;\nuniform highp float fractionalWidthOfPixel;\nuniform highp float aspectRatio;\nconst highp vec3 W = vec3(0.2125, 0.7154, 0.0721);\nvoid main()\n{\n  highp vec2 sampleDivisor = vec2(fractionalWidthOfPixel, fractionalWidthOfPixel / aspectRatio);\n  highp vec2 samplePos = textureCoordinate - mod(textureCoordinate, sampleDivisor) + 0.5 * sampleDivisor;\n  highp vec2 textureCoordinateToUse = vec2(textureCoordinate.x, (textureCoordinate.y * aspectRatio + 0.5 - 0.5 * aspectRatio));\n  highp vec2 adjustedSamplePos = vec2(samplePos.x, (samplePos.y * aspectRatio + 0.5 - 0.5 * aspectRatio));\n  highp float distanceFromSamplePoint = distance(adjustedSamplePos, textureCoordinateToUse);\n  lowp vec3 sampledColor = texture2D(inputImageTexture, samplePos).rgb;\n  highp float dotScaling = 1.0 - dot(sampledColor, W);\n  lowp float checkForPresenceWithinDot = 1.0 - step(distanceFromSamplePoint, (fractionalWidthOfPixel * 0.5) * dotScaling);\n  gl_FragColor = vec4(vec3(checkForPresenceWithinDot), 1.0);\n}";

    /* renamed from: e */
    public int f67564e;

    /* renamed from: f */
    public int f67565f;

    /* renamed from: g */
    public float f67566g;

    /* renamed from: h */
    public float f67567h;

    public GPUImageHalftoneFilter() {
        this(0.01f);
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onInit() {
        super.onInit();
        this.f67564e = GLES20.glGetUniformLocation(getProgram(), "fractionalWidthOfPixel");
        this.f67565f = GLES20.glGetUniformLocation(getProgram(), "aspectRatio");
        setFractionalWidthOfAPixel(this.f67566g);
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onOutputSizeChanged(int i, int i2) {
        super.onOutputSizeChanged(i, i2);
        setAspectRatio(i2 / i);
    }

    public void setAspectRatio(float f) {
        this.f67567h = f;
        setFloat(this.f67565f, f);
    }

    public void setFractionalWidthOfAPixel(float f) {
        this.f67566g = f;
        setFloat(this.f67564e, f);
    }

    public GPUImageHalftoneFilter(float f) {
        super(GPUImageFilter.NO_FILTER_VERTEX_SHADER, HALFTONE_FRAGMENT_SHADER);
        this.f67566g = f;
    }
}