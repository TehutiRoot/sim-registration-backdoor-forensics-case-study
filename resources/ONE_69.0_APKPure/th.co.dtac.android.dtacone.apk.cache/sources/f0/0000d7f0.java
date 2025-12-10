package jp.p022co.cyberagent.android.gpuimage;

import android.opengl.GLES20;

/* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageOpacityFilter */
/* loaded from: classes5.dex */
public class GPUImageOpacityFilter extends GPUImageFilter {
    public static final String OPACITY_FRAGMENT_SHADER = "  varying highp vec2 textureCoordinate;\n  \n  uniform sampler2D inputImageTexture;\n  uniform lowp float opacity;\n  \n  void main()\n  {\n      lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n      \n      gl_FragColor = vec4(textureColor.rgb, textureColor.a * opacity);\n  }\n";

    /* renamed from: e */
    public int f67600e;

    /* renamed from: f */
    public float f67601f;

    public GPUImageOpacityFilter() {
        this(1.0f);
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onInit() {
        super.onInit();
        this.f67600e = GLES20.glGetUniformLocation(getProgram(), "opacity");
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onInitialized() {
        super.onInitialized();
        setOpacity(this.f67601f);
    }

    public void setOpacity(float f) {
        this.f67601f = f;
        setFloat(this.f67600e, f);
    }

    public GPUImageOpacityFilter(float f) {
        super(GPUImageFilter.NO_FILTER_VERTEX_SHADER, OPACITY_FRAGMENT_SHADER);
        this.f67601f = f;
    }
}