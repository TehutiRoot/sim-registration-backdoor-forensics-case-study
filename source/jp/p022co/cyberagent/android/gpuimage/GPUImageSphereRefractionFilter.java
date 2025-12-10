package jp.p022co.cyberagent.android.gpuimage;

import android.graphics.PointF;
import android.opengl.GLES20;
import th.p047co.dtac.android.dtacone.util.Constant;

/* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageSphereRefractionFilter */
/* loaded from: classes5.dex */
public class GPUImageSphereRefractionFilter extends GPUImageFilter {
    public static final String SPHERE_FRAGMENT_SHADER = "varying highp vec2 textureCoordinate;\n\nuniform sampler2D inputImageTexture;\n\nuniform highp vec2 center;\nuniform highp float radius;\nuniform highp float aspectRatio;\nuniform highp float refractiveIndex;\n\nvoid main()\n{\nhighp vec2 textureCoordinateToUse = vec2(textureCoordinate.x, (textureCoordinate.y * aspectRatio + 0.5 - 0.5 * aspectRatio));\nhighp float distanceFromCenter = distance(center, textureCoordinateToUse);\nlowp float checkForPresenceWithinSphere = step(distanceFromCenter, radius);\n\ndistanceFromCenter = distanceFromCenter / radius;\n\nhighp float normalizedDepth = radius * sqrt(1.0 - distanceFromCenter * distanceFromCenter);\nhighp vec3 sphereNormal = normalize(vec3(textureCoordinateToUse - center, normalizedDepth));\n\nhighp vec3 refractedVector = refract(vec3(0.0, 0.0, -1.0), sphereNormal, refractiveIndex);\n\ngl_FragColor = texture2D(inputImageTexture, (refractedVector.xy + 1.0) * 0.5) * checkForPresenceWithinSphere;     \n}\n";

    /* renamed from: e */
    public PointF f67601e;

    /* renamed from: f */
    public int f67602f;

    /* renamed from: g */
    public float f67603g;

    /* renamed from: h */
    public int f67604h;

    /* renamed from: i */
    public float f67605i;

    /* renamed from: j */
    public int f67606j;

    /* renamed from: k */
    public float f67607k;

    /* renamed from: l */
    public int f67608l;

    public GPUImageSphereRefractionFilter() {
        this(new PointF(0.5f, 0.5f), 0.25f, 0.71f);
    }

    private void setAspectRatio(float f) {
        this.f67605i = f;
        setFloat(this.f67606j, f);
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onInit() {
        super.onInit();
        this.f67602f = GLES20.glGetUniformLocation(getProgram(), Constant.VIEW_CENTER);
        this.f67604h = GLES20.glGetUniformLocation(getProgram(), "radius");
        this.f67606j = GLES20.glGetUniformLocation(getProgram(), "aspectRatio");
        this.f67608l = GLES20.glGetUniformLocation(getProgram(), "refractiveIndex");
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onInitialized() {
        super.onInitialized();
        setRadius(this.f67603g);
        setCenter(this.f67601e);
        setRefractiveIndex(this.f67607k);
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onOutputSizeChanged(int i, int i2) {
        float f = i2 / i;
        this.f67605i = f;
        setAspectRatio(f);
        super.onOutputSizeChanged(i, i2);
    }

    public void setCenter(PointF pointF) {
        this.f67601e = pointF;
        setPoint(this.f67602f, pointF);
    }

    public void setRadius(float f) {
        this.f67603g = f;
        setFloat(this.f67604h, f);
    }

    public void setRefractiveIndex(float f) {
        this.f67607k = f;
        setFloat(this.f67608l, f);
    }

    public GPUImageSphereRefractionFilter(PointF pointF, float f, float f2) {
        super(GPUImageFilter.NO_FILTER_VERTEX_SHADER, SPHERE_FRAGMENT_SHADER);
        this.f67601e = pointF;
        this.f67603g = f;
        this.f67607k = f2;
    }
}
