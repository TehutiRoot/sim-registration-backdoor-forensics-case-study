package jp.p022co.cyberagent.android.gpuimage;

import android.graphics.PointF;
import android.opengl.GLES20;
import th.p047co.dtac.android.dtacone.util.Constant;

/* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageBulgeDistortionFilter */
/* loaded from: classes5.dex */
public class GPUImageBulgeDistortionFilter extends GPUImageFilter {
    public static final String BULGE_FRAGMENT_SHADER = "varying highp vec2 textureCoordinate;\n\nuniform sampler2D inputImageTexture;\n\nuniform highp float aspectRatio;\nuniform highp vec2 center;\nuniform highp float radius;\nuniform highp float scale;\n\nvoid main()\n{\nhighp vec2 textureCoordinateToUse = vec2(textureCoordinate.x, (textureCoordinate.y * aspectRatio + 0.5 - 0.5 * aspectRatio));\nhighp float dist = distance(center, textureCoordinateToUse);\ntextureCoordinateToUse = textureCoordinate;\n\nif (dist < radius)\n{\ntextureCoordinateToUse -= center;\nhighp float percent = 1.0 - ((radius - dist) / radius) * scale;\npercent = percent * percent;\n\ntextureCoordinateToUse = textureCoordinateToUse * percent;\ntextureCoordinateToUse += center;\n}\n\ngl_FragColor = texture2D(inputImageTexture, textureCoordinateToUse );    \n}\n";

    /* renamed from: e */
    public float f67421e;

    /* renamed from: f */
    public int f67422f;

    /* renamed from: g */
    public float f67423g;

    /* renamed from: h */
    public int f67424h;

    /* renamed from: i */
    public PointF f67425i;

    /* renamed from: j */
    public int f67426j;

    /* renamed from: k */
    public float f67427k;

    /* renamed from: l */
    public int f67428l;

    public GPUImageBulgeDistortionFilter() {
        this(0.25f, 0.5f, new PointF(0.5f, 0.5f));
    }

    private void setAspectRatio(float f) {
        this.f67427k = f;
        setFloat(this.f67428l, f);
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onInit() {
        super.onInit();
        this.f67422f = GLES20.glGetUniformLocation(getProgram(), "scale");
        this.f67424h = GLES20.glGetUniformLocation(getProgram(), "radius");
        this.f67426j = GLES20.glGetUniformLocation(getProgram(), Constant.VIEW_CENTER);
        this.f67428l = GLES20.glGetUniformLocation(getProgram(), "aspectRatio");
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onInitialized() {
        super.onInitialized();
        setRadius(this.f67423g);
        setScale(this.f67421e);
        setCenter(this.f67425i);
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onOutputSizeChanged(int i, int i2) {
        float f = i2 / i;
        this.f67427k = f;
        setAspectRatio(f);
        super.onOutputSizeChanged(i, i2);
    }

    public void setCenter(PointF pointF) {
        this.f67425i = pointF;
        setPoint(this.f67426j, pointF);
    }

    public void setRadius(float f) {
        this.f67423g = f;
        setFloat(this.f67424h, f);
    }

    public void setScale(float f) {
        this.f67421e = f;
        setFloat(this.f67422f, f);
    }

    public GPUImageBulgeDistortionFilter(float f, float f2, PointF pointF) {
        super(GPUImageFilter.NO_FILTER_VERTEX_SHADER, BULGE_FRAGMENT_SHADER);
        this.f67423g = f;
        this.f67421e = f2;
        this.f67425i = pointF;
    }
}
