package jp.p022co.cyberagent.android.gpuimage;

import android.opengl.GLES20;

/* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageGammaFilter */
/* loaded from: classes5.dex */
public class GPUImageGammaFilter extends GPUImageFilter {
    public static final String GAMMA_FRAGMENT_SHADER = "varying highp vec2 textureCoordinate;\n \n uniform sampler2D inputImageTexture;\n uniform lowp float gamma;\n \n void main()\n {\n     lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n     \n     gl_FragColor = vec4(pow(textureColor.rgb, vec3(gamma)), textureColor.w);\n }";

    /* renamed from: e */
    public int f67496e;

    /* renamed from: f */
    public float f67497f;

    public GPUImageGammaFilter() {
        this(1.2f);
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onInit() {
        super.onInit();
        this.f67496e = GLES20.glGetUniformLocation(getProgram(), "gamma");
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onInitialized() {
        super.onInitialized();
        setGamma(this.f67497f);
    }

    public void setGamma(float f) {
        this.f67497f = f;
        setFloat(this.f67496e, f);
    }

    public GPUImageGammaFilter(float f) {
        super(GPUImageFilter.NO_FILTER_VERTEX_SHADER, GAMMA_FRAGMENT_SHADER);
        this.f67497f = f;
    }
}
