package jp.p022co.cyberagent.android.gpuimage;

import android.opengl.GLES20;

/* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageExposureFilter */
/* loaded from: classes5.dex */
public class GPUImageExposureFilter extends GPUImageFilter {
    public static final String EXPOSURE_FRAGMENT_SHADER = " varying highp vec2 textureCoordinate;\n \n uniform sampler2D inputImageTexture;\n uniform highp float exposure;\n \n void main()\n {\n     highp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n     \n     gl_FragColor = vec4(textureColor.rgb * pow(2.0, exposure), textureColor.w);\n } ";

    /* renamed from: e */
    public int f67511e;

    /* renamed from: f */
    public float f67512f;

    public GPUImageExposureFilter() {
        this(1.0f);
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onInit() {
        super.onInit();
        this.f67511e = GLES20.glGetUniformLocation(getProgram(), "exposure");
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onInitialized() {
        super.onInitialized();
        setExposure(this.f67512f);
    }

    public void setExposure(float f) {
        this.f67512f = f;
        setFloat(this.f67511e, f);
    }

    public GPUImageExposureFilter(float f) {
        super(GPUImageFilter.NO_FILTER_VERTEX_SHADER, EXPOSURE_FRAGMENT_SHADER);
        this.f67512f = f;
    }
}