package jp.p022co.cyberagent.android.gpuimage;

import android.opengl.GLES20;

/* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageLevelsFilter */
/* loaded from: classes5.dex */
public class GPUImageLevelsFilter extends GPUImageFilter {
    public static final String LEVELS_FRAGMET_SHADER = " varying highp vec2 textureCoordinate;\n \n uniform sampler2D inputImageTexture;\n uniform mediump vec3 levelMinimum;\n uniform mediump vec3 levelMiddle;\n uniform mediump vec3 levelMaximum;\n uniform mediump vec3 minOutput;\n uniform mediump vec3 maxOutput;\n \n void main()\n {\n     mediump vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n     \n     gl_FragColor = vec4( mix(minOutput, maxOutput, pow(min(max(textureColor.rgb -levelMinimum, vec3(0.0)) / (levelMaximum - levelMinimum  ), vec3(1.0)), 1.0 /levelMiddle)) , textureColor.a);\n }\n";

    /* renamed from: e */
    public int f67525e;

    /* renamed from: f */
    public float[] f67526f;

    /* renamed from: g */
    public int f67527g;

    /* renamed from: h */
    public float[] f67528h;

    /* renamed from: i */
    public int f67529i;

    /* renamed from: j */
    public float[] f67530j;

    /* renamed from: k */
    public int f67531k;

    /* renamed from: l */
    public float[] f67532l;

    /* renamed from: m */
    public int f67533m;

    /* renamed from: n */
    public float[] f67534n;

    public GPUImageLevelsFilter() {
        this(new float[]{0.0f, 0.0f, 0.0f}, new float[]{1.0f, 1.0f, 1.0f}, new float[]{1.0f, 1.0f, 1.0f}, new float[]{0.0f, 0.0f, 0.0f}, new float[]{1.0f, 1.0f, 1.0f});
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onInit() {
        super.onInit();
        this.f67525e = GLES20.glGetUniformLocation(getProgram(), "levelMinimum");
        this.f67527g = GLES20.glGetUniformLocation(getProgram(), "levelMiddle");
        this.f67529i = GLES20.glGetUniformLocation(getProgram(), "levelMaximum");
        this.f67531k = GLES20.glGetUniformLocation(getProgram(), "minOutput");
        this.f67533m = GLES20.glGetUniformLocation(getProgram(), "maxOutput");
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onInitialized() {
        super.onInitialized();
        updateUniforms();
    }

    public void setBlueMin(float f, float f2, float f3, float f4, float f5) {
        this.f67526f[2] = f;
        this.f67528h[2] = f2;
        this.f67530j[2] = f3;
        this.f67532l[2] = f4;
        this.f67534n[2] = f5;
        updateUniforms();
    }

    public void setGreenMin(float f, float f2, float f3, float f4, float f5) {
        this.f67526f[1] = f;
        this.f67528h[1] = f2;
        this.f67530j[1] = f3;
        this.f67532l[1] = f4;
        this.f67534n[1] = f5;
        updateUniforms();
    }

    public void setMin(float f, float f2, float f3, float f4, float f5) {
        setRedMin(f, f2, f3, f4, f5);
        setGreenMin(f, f2, f3, f4, f5);
        setBlueMin(f, f2, f3, f4, f5);
    }

    public void setRedMin(float f, float f2, float f3, float f4, float f5) {
        this.f67526f[0] = f;
        this.f67528h[0] = f2;
        this.f67530j[0] = f3;
        this.f67532l[0] = f4;
        this.f67534n[0] = f5;
        updateUniforms();
    }

    public void updateUniforms() {
        setFloatVec3(this.f67525e, this.f67526f);
        setFloatVec3(this.f67527g, this.f67528h);
        setFloatVec3(this.f67529i, this.f67530j);
        setFloatVec3(this.f67531k, this.f67532l);
        setFloatVec3(this.f67533m, this.f67534n);
    }

    public GPUImageLevelsFilter(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, float[] fArr5) {
        super(GPUImageFilter.NO_FILTER_VERTEX_SHADER, LEVELS_FRAGMET_SHADER);
        this.f67526f = fArr;
        this.f67528h = fArr2;
        this.f67530j = fArr3;
        this.f67532l = fArr4;
        this.f67534n = fArr5;
        setMin(0.0f, 1.0f, 1.0f, 0.0f, 1.0f);
    }

    public void setMin(float f, float f2, float f3) {
        setMin(f, f2, f3, 0.0f, 1.0f);
    }

    public void setBlueMin(float f, float f2, float f3) {
        setBlueMin(f, f2, f3, 0.0f, 1.0f);
    }

    public void setGreenMin(float f, float f2, float f3) {
        setGreenMin(f, f2, f3, 0.0f, 1.0f);
    }

    public void setRedMin(float f, float f2, float f3) {
        setRedMin(f, f2, f3, 0.0f, 1.0f);
    }
}
