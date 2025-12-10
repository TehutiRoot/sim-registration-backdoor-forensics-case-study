package jp.p022co.cyberagent.android.gpuimage;

import android.graphics.PointF;
import android.opengl.GLES20;

/* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageSphereRefractionFilter */
/* loaded from: classes5.dex */
public class GPUImageSphereRefractionFilter extends GPUImageFilter {
    public static final String SPHERE_FRAGMENT_SHADER = "varying highp vec2 textureCoordinate;\n\nuniform sampler2D inputImageTexture;\n\nuniform highp vec2 center;\nuniform highp float radius;\nuniform highp float aspectRatio;\nuniform highp float refractiveIndex;\n\nvoid main()\n{\nhighp vec2 textureCoordinateToUse = vec2(textureCoordinate.x, (textureCoordinate.y * aspectRatio + 0.5 - 0.5 * aspectRatio));\nhighp float distanceFromCenter = distance(center, textureCoordinateToUse);\nlowp float checkForPresenceWithinSphere = step(distanceFromCenter, radius);\n\ndistanceFromCenter = distanceFromCenter / radius;\n\nhighp float normalizedDepth = radius * sqrt(1.0 - distanceFromCenter * distanceFromCenter);\nhighp vec3 sphereNormal = normalize(vec3(textureCoordinateToUse - center, normalizedDepth));\n\nhighp vec3 refractedVector = refract(vec3(0.0, 0.0, -1.0), sphereNormal, refractiveIndex);\n\ngl_FragColor = texture2D(inputImageTexture, (refractedVector.xy + 1.0) * 0.5) * checkForPresenceWithinSphere;     \n}\n";

    /* renamed from: e */
    public PointF f67658e;

    /* renamed from: f */
    public int f67659f;

    /* renamed from: g */
    public float f67660g;

    /* renamed from: h */
    public int f67661h;

    /* renamed from: i */
    public float f67662i;

    /* renamed from: j */
    public int f67663j;

    /* renamed from: k */
    public float f67664k;

    /* renamed from: l */
    public int f67665l;

    public GPUImageSphereRefractionFilter() {
        this(new PointF(0.5f, 0.5f), 0.25f, 0.71f);
    }

    private void setAspectRatio(float f) {
        this.f67662i = f;
        setFloat(this.f67663j, f);
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onInit() {
        super.onInit();
        this.f67659f = GLES20.glGetUniformLocation(getProgram(), "center");
        this.f67661h = GLES20.glGetUniformLocation(getProgram(), "radius");
        this.f67663j = GLES20.glGetUniformLocation(getProgram(), "aspectRatio");
        this.f67665l = GLES20.glGetUniformLocation(getProgram(), "refractiveIndex");
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onInitialized() {
        super.onInitialized();
        setRadius(this.f67660g);
        setCenter(this.f67658e);
        setRefractiveIndex(this.f67664k);
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onOutputSizeChanged(int i, int i2) {
        float f = i2 / i;
        this.f67662i = f;
        setAspectRatio(f);
        super.onOutputSizeChanged(i, i2);
    }

    public void setCenter(PointF pointF) {
        this.f67658e = pointF;
        setPoint(this.f67659f, pointF);
    }

    public void setRadius(float f) {
        this.f67660g = f;
        setFloat(this.f67661h, f);
    }

    public void setRefractiveIndex(float f) {
        this.f67664k = f;
        setFloat(this.f67665l, f);
    }

    public GPUImageSphereRefractionFilter(PointF pointF, float f, float f2) {
        super(GPUImageFilter.NO_FILTER_VERTEX_SHADER, SPHERE_FRAGMENT_SHADER);
        this.f67658e = pointF;
        this.f67660g = f;
        this.f67664k = f2;
    }
}