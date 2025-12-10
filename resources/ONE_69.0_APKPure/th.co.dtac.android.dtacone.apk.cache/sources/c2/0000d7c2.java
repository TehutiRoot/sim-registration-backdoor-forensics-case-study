package jp.p022co.cyberagent.android.gpuimage;

import android.opengl.GLES20;

/* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageCrosshatchFilter */
/* loaded from: classes5.dex */
public class GPUImageCrosshatchFilter extends GPUImageFilter {
    public static final String CROSSHATCH_FRAGMENT_SHADER = "varying highp vec2 textureCoordinate;\nuniform sampler2D inputImageTexture;\nuniform highp float crossHatchSpacing;\nuniform highp float lineWidth;\nconst highp vec3 W = vec3(0.2125, 0.7154, 0.0721);\nvoid main()\n{\nhighp float luminance = dot(texture2D(inputImageTexture, textureCoordinate).rgb, W);\nlowp vec4 colorToDisplay = vec4(1.0, 1.0, 1.0, 1.0);\nif (luminance < 1.00)\n{\nif (mod(textureCoordinate.x + textureCoordinate.y, crossHatchSpacing) <= lineWidth)\n{\ncolorToDisplay = vec4(0.0, 0.0, 0.0, 1.0);\n}\n}\nif (luminance < 0.75)\n{\nif (mod(textureCoordinate.x - textureCoordinate.y, crossHatchSpacing) <= lineWidth)\n{\ncolorToDisplay = vec4(0.0, 0.0, 0.0, 1.0);\n}\n}\nif (luminance < 0.50)\n{\nif (mod(textureCoordinate.x + textureCoordinate.y - (crossHatchSpacing / 2.0), crossHatchSpacing) <= lineWidth)\n{\ncolorToDisplay = vec4(0.0, 0.0, 0.0, 1.0);\n}\n}\nif (luminance < 0.3)\n{\nif (mod(textureCoordinate.x - textureCoordinate.y - (crossHatchSpacing / 2.0), crossHatchSpacing) <= lineWidth)\n{\ncolorToDisplay = vec4(0.0, 0.0, 0.0, 1.0);\n}\n}\ngl_FragColor = colorToDisplay;\n}\n";

    /* renamed from: e */
    public float f67506e;

    /* renamed from: f */
    public int f67507f;

    /* renamed from: g */
    public float f67508g;

    /* renamed from: h */
    public int f67509h;

    public GPUImageCrosshatchFilter() {
        this(0.03f, 0.003f);
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onInit() {
        super.onInit();
        this.f67507f = GLES20.glGetUniformLocation(getProgram(), "crossHatchSpacing");
        this.f67509h = GLES20.glGetUniformLocation(getProgram(), "lineWidth");
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onInitialized() {
        super.onInitialized();
        setCrossHatchSpacing(this.f67506e);
        setLineWidth(this.f67508g);
    }

    public void setCrossHatchSpacing(float f) {
        float f2;
        if (getOutputWidth() != 0) {
            f2 = 1.0f / getOutputWidth();
        } else {
            f2 = 4.8828125E-4f;
        }
        if (f < f2) {
            this.f67506e = f2;
        } else {
            this.f67506e = f;
        }
        setFloat(this.f67507f, this.f67506e);
    }

    public void setLineWidth(float f) {
        this.f67508g = f;
        setFloat(this.f67509h, f);
    }

    public GPUImageCrosshatchFilter(float f, float f2) {
        super(GPUImageFilter.NO_FILTER_VERTEX_SHADER, CROSSHATCH_FRAGMENT_SHADER);
        this.f67506e = f;
        this.f67508g = f2;
    }
}