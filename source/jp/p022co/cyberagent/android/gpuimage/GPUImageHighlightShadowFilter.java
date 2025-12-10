package jp.p022co.cyberagent.android.gpuimage;

import android.opengl.GLES20;

/* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageHighlightShadowFilter */
/* loaded from: classes5.dex */
public class GPUImageHighlightShadowFilter extends GPUImageFilter {
    public static final String HIGHLIGHT_SHADOW_FRAGMENT_SHADER = " uniform sampler2D inputImageTexture;\n varying highp vec2 textureCoordinate;\n  \n uniform lowp float shadows;\n uniform lowp float highlights;\n \n const mediump vec3 luminanceWeighting = vec3(0.3, 0.3, 0.3);\n \n void main()\n {\n \tlowp vec4 source = texture2D(inputImageTexture, textureCoordinate);\n \tmediump float luminance = dot(source.rgb, luminanceWeighting);\n \n \tmediump float shadow = clamp((pow(luminance, 1.0/(shadows+1.0)) + (-0.76)*pow(luminance, 2.0/(shadows+1.0))) - luminance, 0.0, 1.0);\n \tmediump float highlight = clamp((1.0 - (pow(1.0-luminance, 1.0/(2.0-highlights)) + (-0.8)*pow(1.0-luminance, 2.0/(2.0-highlights)))) - luminance, -1.0, 0.0);\n \tlowp vec3 result = vec3(0.0, 0.0, 0.0) + ((luminance + shadow + highlight) - 0.0) * ((source.rgb - vec3(0.0, 0.0, 0.0))/(luminance - 0.0));\n \n \tgl_FragColor = vec4(result.rgb, source.a);\n }";

    /* renamed from: e */
    public int f67515e;

    /* renamed from: f */
    public float f67516f;

    /* renamed from: g */
    public int f67517g;

    /* renamed from: h */
    public float f67518h;

    public GPUImageHighlightShadowFilter() {
        this(0.0f, 1.0f);
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onInit() {
        super.onInit();
        this.f67517g = GLES20.glGetUniformLocation(getProgram(), "highlights");
        this.f67515e = GLES20.glGetUniformLocation(getProgram(), "shadows");
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onInitialized() {
        super.onInitialized();
        setHighlights(this.f67518h);
        setShadows(this.f67516f);
    }

    public void setHighlights(float f) {
        this.f67518h = f;
        setFloat(this.f67517g, f);
    }

    public void setShadows(float f) {
        this.f67516f = f;
        setFloat(this.f67515e, f);
    }

    public GPUImageHighlightShadowFilter(float f, float f2) {
        super(GPUImageFilter.NO_FILTER_VERTEX_SHADER, HIGHLIGHT_SHADOW_FRAGMENT_SHADER);
        this.f67518h = f2;
        this.f67516f = f;
    }
}
