package jp.p022co.cyberagent.android.gpuimage;

import android.graphics.PointF;
import android.opengl.GLES20;
import th.p047co.dtac.android.dtacone.util.Constant;

/* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageSwirlFilter */
/* loaded from: classes5.dex */
public class GPUImageSwirlFilter extends GPUImageFilter {
    public static final String SWIRL_FRAGMENT_SHADER = "varying highp vec2 textureCoordinate;\n\nuniform sampler2D inputImageTexture;\n\nuniform highp vec2 center;\nuniform highp float radius;\nuniform highp float angle;\n\nvoid main()\n{\nhighp vec2 textureCoordinateToUse = textureCoordinate;\nhighp float dist = distance(center, textureCoordinate);\nif (dist < radius)\n{\ntextureCoordinateToUse -= center;\nhighp float percent = (radius - dist) / radius;\nhighp float theta = percent * percent * angle * 8.0;\nhighp float s = sin(theta);\nhighp float c = cos(theta);\ntextureCoordinateToUse = vec2(dot(textureCoordinateToUse, vec2(c, -s)), dot(textureCoordinateToUse, vec2(s, c)));\ntextureCoordinateToUse += center;\n}\n\ngl_FragColor = texture2D(inputImageTexture, textureCoordinateToUse );\n\n}\n";

    /* renamed from: e */
    public float f67609e;

    /* renamed from: f */
    public int f67610f;

    /* renamed from: g */
    public float f67611g;

    /* renamed from: h */
    public int f67612h;

    /* renamed from: i */
    public PointF f67613i;

    /* renamed from: j */
    public int f67614j;

    public GPUImageSwirlFilter() {
        this(0.5f, 1.0f, new PointF(0.5f, 0.5f));
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onInit() {
        super.onInit();
        this.f67610f = GLES20.glGetUniformLocation(getProgram(), "angle");
        this.f67612h = GLES20.glGetUniformLocation(getProgram(), "radius");
        this.f67614j = GLES20.glGetUniformLocation(getProgram(), Constant.VIEW_CENTER);
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onInitialized() {
        super.onInitialized();
        setRadius(this.f67611g);
        setAngle(this.f67609e);
        setCenter(this.f67613i);
    }

    public void setAngle(float f) {
        this.f67609e = f;
        setFloat(this.f67610f, f);
    }

    public void setCenter(PointF pointF) {
        this.f67613i = pointF;
        setPoint(this.f67614j, pointF);
    }

    public void setRadius(float f) {
        this.f67611g = f;
        setFloat(this.f67612h, f);
    }

    public GPUImageSwirlFilter(float f, float f2, PointF pointF) {
        super(GPUImageFilter.NO_FILTER_VERTEX_SHADER, SWIRL_FRAGMENT_SHADER);
        this.f67611g = f;
        this.f67609e = f2;
        this.f67613i = pointF;
    }
}
