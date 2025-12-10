package jp.p022co.cyberagent.android.gpuimage;

import android.opengl.GLES20;

/* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageHazeFilter */
/* loaded from: classes5.dex */
public class GPUImageHazeFilter extends GPUImageFilter {
    public static final String HAZE_FRAGMENT_SHADER = "varying highp vec2 textureCoordinate;\n\nuniform sampler2D inputImageTexture;\n\nuniform lowp float distance;\nuniform highp float slope;\n\nvoid main()\n{\n\t//todo reconsider precision modifiers\t \n\t highp vec4 color = vec4(1.0);//todo reimplement as a parameter\n\n\t highp float  d = textureCoordinate.y * slope  +  distance; \n\n\t highp vec4 c = texture2D(inputImageTexture, textureCoordinate) ; // consider using unpremultiply\n\n\t c = (c - d * color) / (1.0 -d);\n\n\t gl_FragColor = c; //consider using premultiply(c);\n}\n";

    /* renamed from: e */
    public float f67568e;

    /* renamed from: f */
    public int f67569f;

    /* renamed from: g */
    public float f67570g;

    /* renamed from: h */
    public int f67571h;

    public GPUImageHazeFilter() {
        this(0.2f, 0.0f);
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onInit() {
        super.onInit();
        this.f67569f = GLES20.glGetUniformLocation(getProgram(), "distance");
        this.f67571h = GLES20.glGetUniformLocation(getProgram(), "slope");
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onInitialized() {
        super.onInitialized();
        setDistance(this.f67568e);
        setSlope(this.f67570g);
    }

    public void setDistance(float f) {
        this.f67568e = f;
        setFloat(this.f67569f, f);
    }

    public void setSlope(float f) {
        this.f67570g = f;
        setFloat(this.f67571h, f);
    }

    public GPUImageHazeFilter(float f, float f2) {
        super(GPUImageFilter.NO_FILTER_VERTEX_SHADER, HAZE_FRAGMENT_SHADER);
        this.f67568e = f;
        this.f67570g = f2;
    }
}