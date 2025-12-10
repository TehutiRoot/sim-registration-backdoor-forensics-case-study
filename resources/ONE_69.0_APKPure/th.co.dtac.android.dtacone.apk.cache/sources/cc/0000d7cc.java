package jp.p022co.cyberagent.android.gpuimage;

import android.opengl.GLES20;

/* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageFalseColorFilter */
/* loaded from: classes5.dex */
public class GPUImageFalseColorFilter extends GPUImageFilter {
    public static final String FALSECOLOR_FRAGMENT_SHADER = "precision lowp float;\n\nvarying highp vec2 textureCoordinate;\n\nuniform sampler2D inputImageTexture;\nuniform float intensity;\nuniform vec3 firstColor;\nuniform vec3 secondColor;\n\nconst mediump vec3 luminanceWeighting = vec3(0.2125, 0.7154, 0.0721);\n\nvoid main()\n{\nlowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\nfloat luminance = dot(textureColor.rgb, luminanceWeighting);\n\ngl_FragColor = vec4( mix(firstColor.rgb, secondColor.rgb, luminance), textureColor.a);\n}\n";

    /* renamed from: e */
    public float[] f67513e;

    /* renamed from: f */
    public int f67514f;

    /* renamed from: g */
    public float[] f67515g;

    /* renamed from: h */
    public int f67516h;

    public GPUImageFalseColorFilter() {
        this(0.0f, 0.0f, 0.5f, 1.0f, 0.0f, 0.0f);
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onInit() {
        super.onInit();
        this.f67514f = GLES20.glGetUniformLocation(getProgram(), "firstColor");
        this.f67516h = GLES20.glGetUniformLocation(getProgram(), "secondColor");
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onInitialized() {
        super.onInitialized();
        setFirstColor(this.f67513e);
        setSecondColor(this.f67515g);
    }

    public void setFirstColor(float[] fArr) {
        this.f67513e = fArr;
        setFloatVec3(this.f67514f, fArr);
    }

    public void setSecondColor(float[] fArr) {
        this.f67515g = fArr;
        setFloatVec3(this.f67516h, fArr);
    }

    public GPUImageFalseColorFilter(float f, float f2, float f3, float f4, float f5, float f6) {
        this(new float[]{f, f2, f3}, new float[]{f4, f5, f6});
    }

    public GPUImageFalseColorFilter(float[] fArr, float[] fArr2) {
        super(GPUImageFilter.NO_FILTER_VERTEX_SHADER, FALSECOLOR_FRAGMENT_SHADER);
        this.f67513e = fArr;
        this.f67515g = fArr2;
    }
}