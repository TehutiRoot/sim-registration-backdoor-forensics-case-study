package jp.p022co.cyberagent.android.gpuimage;

import android.opengl.GLES20;

/* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageLevelsFilter */
/* loaded from: classes5.dex */
public class GPUImageLevelsFilter extends GPUImageFilter {
    public static final String LEVELS_FRAGMET_SHADER = " varying highp vec2 textureCoordinate;\n \n uniform sampler2D inputImageTexture;\n uniform mediump vec3 levelMinimum;\n uniform mediump vec3 levelMiddle;\n uniform mediump vec3 levelMaximum;\n uniform mediump vec3 minOutput;\n uniform mediump vec3 maxOutput;\n \n void main()\n {\n     mediump vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n     \n     gl_FragColor = vec4( mix(minOutput, maxOutput, pow(min(max(textureColor.rgb -levelMinimum, vec3(0.0)) / (levelMaximum - levelMinimum  ), vec3(1.0)), 1.0 /levelMiddle)) , textureColor.a);\n }\n";

    /* renamed from: e */
    public int f67582e;

    /* renamed from: f */
    public float[] f67583f;

    /* renamed from: g */
    public int f67584g;

    /* renamed from: h */
    public float[] f67585h;

    /* renamed from: i */
    public int f67586i;

    /* renamed from: j */
    public float[] f67587j;

    /* renamed from: k */
    public int f67588k;

    /* renamed from: l */
    public float[] f67589l;

    /* renamed from: m */
    public int f67590m;

    /* renamed from: n */
    public float[] f67591n;

    public GPUImageLevelsFilter() {
        this(new float[]{0.0f, 0.0f, 0.0f}, new float[]{1.0f, 1.0f, 1.0f}, new float[]{1.0f, 1.0f, 1.0f}, new float[]{0.0f, 0.0f, 0.0f}, new float[]{1.0f, 1.0f, 1.0f});
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onInit() {
        super.onInit();
        this.f67582e = GLES20.glGetUniformLocation(getProgram(), "levelMinimum");
        this.f67584g = GLES20.glGetUniformLocation(getProgram(), "levelMiddle");
        this.f67586i = GLES20.glGetUniformLocation(getProgram(), "levelMaximum");
        this.f67588k = GLES20.glGetUniformLocation(getProgram(), "minOutput");
        this.f67590m = GLES20.glGetUniformLocation(getProgram(), "maxOutput");
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onInitialized() {
        super.onInitialized();
        updateUniforms();
    }

    public void setBlueMin(float f, float f2, float f3, float f4, float f5) {
        this.f67583f[2] = f;
        this.f67585h[2] = f2;
        this.f67587j[2] = f3;
        this.f67589l[2] = f4;
        this.f67591n[2] = f5;
        updateUniforms();
    }

    public void setGreenMin(float f, float f2, float f3, float f4, float f5) {
        this.f67583f[1] = f;
        this.f67585h[1] = f2;
        this.f67587j[1] = f3;
        this.f67589l[1] = f4;
        this.f67591n[1] = f5;
        updateUniforms();
    }

    public void setMin(float f, float f2, float f3, float f4, float f5) {
        setRedMin(f, f2, f3, f4, f5);
        setGreenMin(f, f2, f3, f4, f5);
        setBlueMin(f, f2, f3, f4, f5);
    }

    public void setRedMin(float f, float f2, float f3, float f4, float f5) {
        this.f67583f[0] = f;
        this.f67585h[0] = f2;
        this.f67587j[0] = f3;
        this.f67589l[0] = f4;
        this.f67591n[0] = f5;
        updateUniforms();
    }

    public void updateUniforms() {
        setFloatVec3(this.f67582e, this.f67583f);
        setFloatVec3(this.f67584g, this.f67585h);
        setFloatVec3(this.f67586i, this.f67587j);
        setFloatVec3(this.f67588k, this.f67589l);
        setFloatVec3(this.f67590m, this.f67591n);
    }

    public GPUImageLevelsFilter(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, float[] fArr5) {
        super(GPUImageFilter.NO_FILTER_VERTEX_SHADER, LEVELS_FRAGMET_SHADER);
        this.f67583f = fArr;
        this.f67585h = fArr2;
        this.f67587j = fArr3;
        this.f67589l = fArr4;
        this.f67591n = fArr5;
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