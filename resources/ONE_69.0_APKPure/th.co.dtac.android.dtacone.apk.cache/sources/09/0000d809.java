package jp.p022co.cyberagent.android.gpuimage;

import android.graphics.PointF;
import android.opengl.GLES20;

/* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageSwirlFilter */
/* loaded from: classes5.dex */
public class GPUImageSwirlFilter extends GPUImageFilter {
    public static final String SWIRL_FRAGMENT_SHADER = "varying highp vec2 textureCoordinate;\n\nuniform sampler2D inputImageTexture;\n\nuniform highp vec2 center;\nuniform highp float radius;\nuniform highp float angle;\n\nvoid main()\n{\nhighp vec2 textureCoordinateToUse = textureCoordinate;\nhighp float dist = distance(center, textureCoordinate);\nif (dist < radius)\n{\ntextureCoordinateToUse -= center;\nhighp float percent = (radius - dist) / radius;\nhighp float theta = percent * percent * angle * 8.0;\nhighp float s = sin(theta);\nhighp float c = cos(theta);\ntextureCoordinateToUse = vec2(dot(textureCoordinateToUse, vec2(c, -s)), dot(textureCoordinateToUse, vec2(s, c)));\ntextureCoordinateToUse += center;\n}\n\ngl_FragColor = texture2D(inputImageTexture, textureCoordinateToUse );\n\n}\n";

    /* renamed from: e */
    public float f67666e;

    /* renamed from: f */
    public int f67667f;

    /* renamed from: g */
    public float f67668g;

    /* renamed from: h */
    public int f67669h;

    /* renamed from: i */
    public PointF f67670i;

    /* renamed from: j */
    public int f67671j;

    public GPUImageSwirlFilter() {
        this(0.5f, 1.0f, new PointF(0.5f, 0.5f));
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onInit() {
        super.onInit();
        this.f67667f = GLES20.glGetUniformLocation(getProgram(), "angle");
        this.f67669h = GLES20.glGetUniformLocation(getProgram(), "radius");
        this.f67671j = GLES20.glGetUniformLocation(getProgram(), "center");
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onInitialized() {
        super.onInitialized();
        setRadius(this.f67668g);
        setAngle(this.f67666e);
        setCenter(this.f67670i);
    }

    public void setAngle(float f) {
        this.f67666e = f;
        setFloat(this.f67667f, f);
    }

    public void setCenter(PointF pointF) {
        this.f67670i = pointF;
        setPoint(this.f67671j, pointF);
    }

    public void setRadius(float f) {
        this.f67668g = f;
        setFloat(this.f67669h, f);
    }

    public GPUImageSwirlFilter(float f, float f2, PointF pointF) {
        super(GPUImageFilter.NO_FILTER_VERTEX_SHADER, SWIRL_FRAGMENT_SHADER);
        this.f67668g = f;
        this.f67666e = f2;
        this.f67670i = pointF;
    }
}