package jp.p022co.cyberagent.android.gpuimage;

import android.opengl.GLES20;

/* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageBrightnessFilter */
/* loaded from: classes5.dex */
public class GPUImageBrightnessFilter extends GPUImageFilter {
    public static final String BRIGHTNESS_FRAGMENT_SHADER = "varying highp vec2 textureCoordinate;\n \n uniform sampler2D inputImageTexture;\n uniform lowp float brightness;\n \n void main()\n {\n     lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n     \n     gl_FragColor = vec4((textureColor.rgb + vec3(brightness)), textureColor.w);\n }";

    /* renamed from: e */
    public int f67476e;

    /* renamed from: f */
    public float f67477f;

    public GPUImageBrightnessFilter() {
        this(0.0f);
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onInit() {
        super.onInit();
        this.f67476e = GLES20.glGetUniformLocation(getProgram(), "brightness");
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onInitialized() {
        super.onInitialized();
        setBrightness(this.f67477f);
    }

    public void setBrightness(float f) {
        this.f67477f = f;
        setFloat(this.f67476e, f);
    }

    public GPUImageBrightnessFilter(float f) {
        super(GPUImageFilter.NO_FILTER_VERTEX_SHADER, BRIGHTNESS_FRAGMENT_SHADER);
        this.f67477f = f;
    }
}