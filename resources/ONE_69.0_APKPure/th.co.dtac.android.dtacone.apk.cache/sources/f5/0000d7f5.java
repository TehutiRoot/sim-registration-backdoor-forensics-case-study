package jp.p022co.cyberagent.android.gpuimage;

import android.opengl.GLES20;

/* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageRGBFilter */
/* loaded from: classes5.dex */
public class GPUImageRGBFilter extends GPUImageFilter {
    public static final String RGB_FRAGMENT_SHADER = "  varying highp vec2 textureCoordinate;\n  \n  uniform sampler2D inputImageTexture;\n  uniform highp float red;\n  uniform highp float green;\n  uniform highp float blue;\n  \n  void main()\n  {\n      highp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n      \n      gl_FragColor = vec4(textureColor.r * red, textureColor.g * green, textureColor.b * blue, 1.0);\n  }\n";

    /* renamed from: e */
    public int f67608e;

    /* renamed from: f */
    public float f67609f;

    /* renamed from: g */
    public int f67610g;

    /* renamed from: h */
    public float f67611h;

    /* renamed from: i */
    public int f67612i;

    /* renamed from: j */
    public float f67613j;

    /* renamed from: k */
    public boolean f67614k;

    public GPUImageRGBFilter() {
        this(1.0f, 1.0f, 1.0f);
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onInit() {
        super.onInit();
        this.f67608e = GLES20.glGetUniformLocation(getProgram(), "red");
        this.f67610g = GLES20.glGetUniformLocation(getProgram(), "green");
        this.f67612i = GLES20.glGetUniformLocation(getProgram(), "blue");
        this.f67614k = true;
        setRed(this.f67609f);
        setGreen(this.f67611h);
        setBlue(this.f67613j);
    }

    public void setBlue(float f) {
        this.f67613j = f;
        if (this.f67614k) {
            setFloat(this.f67612i, f);
        }
    }

    public void setGreen(float f) {
        this.f67611h = f;
        if (this.f67614k) {
            setFloat(this.f67610g, f);
        }
    }

    public void setRed(float f) {
        this.f67609f = f;
        if (this.f67614k) {
            setFloat(this.f67608e, f);
        }
    }

    public GPUImageRGBFilter(float f, float f2, float f3) {
        super(GPUImageFilter.NO_FILTER_VERTEX_SHADER, RGB_FRAGMENT_SHADER);
        this.f67614k = false;
        this.f67609f = f;
        this.f67611h = f2;
        this.f67613j = f3;
    }
}