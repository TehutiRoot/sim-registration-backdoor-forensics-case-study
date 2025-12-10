package jp.p022co.cyberagent.android.gpuimage;

import android.opengl.GLES20;

/* renamed from: jp.co.cyberagent.android.gpuimage.GPUImagePosterizeFilter */
/* loaded from: classes5.dex */
public class GPUImagePosterizeFilter extends GPUImageFilter {
    public static final String POSTERIZE_FRAGMENT_SHADER = "varying highp vec2 textureCoordinate;\n\nuniform sampler2D inputImageTexture;\nuniform highp float colorLevels;\n\nvoid main()\n{\n   highp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n   \n   gl_FragColor = floor((textureColor * colorLevels) + vec4(0.5)) / colorLevels;\n}";

    /* renamed from: e */
    public int f67549e;

    /* renamed from: f */
    public int f67550f;

    public GPUImagePosterizeFilter() {
        this(10);
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onInit() {
        super.onInit();
        this.f67549e = GLES20.glGetUniformLocation(getProgram(), "colorLevels");
        setColorLevels(this.f67550f);
    }

    public void setColorLevels(int i) {
        this.f67550f = i;
        setFloat(this.f67549e, i);
    }

    public GPUImagePosterizeFilter(int i) {
        super(GPUImageFilter.NO_FILTER_VERTEX_SHADER, POSTERIZE_FRAGMENT_SHADER);
        this.f67550f = i;
    }
}
