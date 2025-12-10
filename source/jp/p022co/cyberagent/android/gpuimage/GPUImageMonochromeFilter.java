package jp.p022co.cyberagent.android.gpuimage;

import android.opengl.GLES20;

/* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageMonochromeFilter */
/* loaded from: classes5.dex */
public class GPUImageMonochromeFilter extends GPUImageFilter {
    public static final String MONOCHROME_FRAGMENT_SHADER = " precision lowp float;\n  \n  varying highp vec2 textureCoordinate;\n  \n  uniform sampler2D inputImageTexture;\n  uniform float intensity;\n  uniform vec3 filterColor;\n  \n  const mediump vec3 luminanceWeighting = vec3(0.2125, 0.7154, 0.0721);\n  \n  void main()\n  {\n \t//desat, then apply overlay blend\n \tlowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n \tfloat luminance = dot(textureColor.rgb, luminanceWeighting);\n \t\n \tlowp vec4 desat = vec4(vec3(luminance), 1.0);\n \t\n \t//overlay\n \tlowp vec4 outputColor = vec4(\n                                  (desat.r < 0.5 ? (2.0 * desat.r * filterColor.r) : (1.0 - 2.0 * (1.0 - desat.r) * (1.0 - filterColor.r))),\n                                  (desat.g < 0.5 ? (2.0 * desat.g * filterColor.g) : (1.0 - 2.0 * (1.0 - desat.g) * (1.0 - filterColor.g))),\n                                  (desat.b < 0.5 ? (2.0 * desat.b * filterColor.b) : (1.0 - 2.0 * (1.0 - desat.b) * (1.0 - filterColor.b))),\n                                  1.0\n                                  );\n \t\n \t//which is better, or are they equal?\n \tgl_FragColor = vec4( mix(textureColor.rgb, outputColor.rgb, intensity), textureColor.a);\n  }";

    /* renamed from: e */
    public int f67539e;

    /* renamed from: f */
    public float f67540f;

    /* renamed from: g */
    public int f67541g;

    /* renamed from: h */
    public float[] f67542h;

    public GPUImageMonochromeFilter() {
        this(1.0f, new float[]{0.6f, 0.45f, 0.3f, 1.0f});
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onInit() {
        super.onInit();
        this.f67539e = GLES20.glGetUniformLocation(getProgram(), "intensity");
        this.f67541g = GLES20.glGetUniformLocation(getProgram(), "filterColor");
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onInitialized() {
        super.onInitialized();
        setIntensity(1.0f);
        setColor(new float[]{0.6f, 0.45f, 0.3f, 1.0f});
    }

    public void setColor(float[] fArr) {
        this.f67542h = fArr;
        setColorRed(fArr[0], fArr[1], fArr[2]);
    }

    public void setColorRed(float f, float f2, float f3) {
        setFloatVec3(this.f67541g, new float[]{f, f2, f3});
    }

    public void setIntensity(float f) {
        this.f67540f = f;
        setFloat(this.f67539e, f);
    }

    public GPUImageMonochromeFilter(float f, float[] fArr) {
        super(GPUImageFilter.NO_FILTER_VERTEX_SHADER, MONOCHROME_FRAGMENT_SHADER);
        this.f67540f = f;
        this.f67542h = fArr;
    }
}
