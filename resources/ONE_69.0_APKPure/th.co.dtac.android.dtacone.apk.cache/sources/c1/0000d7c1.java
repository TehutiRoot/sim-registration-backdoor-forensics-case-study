package jp.p022co.cyberagent.android.gpuimage;

import android.opengl.GLES20;

/* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageContrastFilter */
/* loaded from: classes5.dex */
public class GPUImageContrastFilter extends GPUImageFilter {
    public static final String CONTRAST_FRAGMENT_SHADER = "varying highp vec2 textureCoordinate;\n \n uniform sampler2D inputImageTexture;\n uniform lowp float contrast;\n \n void main()\n {\n     lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n     \n     gl_FragColor = vec4(((textureColor.rgb - vec3(0.5)) * contrast + vec3(0.5)), textureColor.w);\n }";

    /* renamed from: e */
    public int f67504e;

    /* renamed from: f */
    public float f67505f;

    public GPUImageContrastFilter() {
        this(1.2f);
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onInit() {
        super.onInit();
        this.f67504e = GLES20.glGetUniformLocation(getProgram(), "contrast");
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onInitialized() {
        super.onInitialized();
        setContrast(this.f67505f);
    }

    public void setContrast(float f) {
        this.f67505f = f;
        setFloat(this.f67504e, f);
    }

    public GPUImageContrastFilter(float f) {
        super(GPUImageFilter.NO_FILTER_VERTEX_SHADER, CONTRAST_FRAGMENT_SHADER);
        this.f67505f = f;
    }
}