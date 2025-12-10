package jp.p022co.cyberagent.android.gpuimage;

import android.graphics.PointF;
import android.opengl.GLES20;

/* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageGlassSphereFilter */
/* loaded from: classes5.dex */
public class GPUImageGlassSphereFilter extends GPUImageFilter {
    public static final String SPHERE_FRAGMENT_SHADER = "varying highp vec2 textureCoordinate;\n\nuniform sampler2D inputImageTexture;\n\nuniform highp vec2 center;\nuniform highp float radius;\nuniform highp float aspectRatio;\nuniform highp float refractiveIndex;\n// uniform vec3 lightPosition;\nconst highp vec3 lightPosition = vec3(-0.5, 0.5, 1.0);\nconst highp vec3 ambientLightPosition = vec3(0.0, 0.0, 1.0);\n\nvoid main()\n{\nhighp vec2 textureCoordinateToUse = vec2(textureCoordinate.x, (textureCoordinate.y * aspectRatio + 0.5 - 0.5 * aspectRatio));\nhighp float distanceFromCenter = distance(center, textureCoordinateToUse);\nlowp float checkForPresenceWithinSphere = step(distanceFromCenter, radius);\n\ndistanceFromCenter = distanceFromCenter / radius;\n\nhighp float normalizedDepth = radius * sqrt(1.0 - distanceFromCenter * distanceFromCenter);\nhighp vec3 sphereNormal = normalize(vec3(textureCoordinateToUse - center, normalizedDepth));\n\nhighp vec3 refractedVector = 2.0 * refract(vec3(0.0, 0.0, -1.0), sphereNormal, refractiveIndex);\nrefractedVector.xy = -refractedVector.xy;\n\nhighp vec3 finalSphereColor = texture2D(inputImageTexture, (refractedVector.xy + 1.0) * 0.5).rgb;\n\n// Grazing angle lighting\nhighp float lightingIntensity = 2.5 * (1.0 - pow(clamp(dot(ambientLightPosition, sphereNormal), 0.0, 1.0), 0.25));\nfinalSphereColor += lightingIntensity;\n\n// Specular lighting\nlightingIntensity  = clamp(dot(normalize(lightPosition), sphereNormal), 0.0, 1.0);\nlightingIntensity  = pow(lightingIntensity, 15.0);\nfinalSphereColor += vec3(0.8, 0.8, 0.8) * lightingIntensity;\n\ngl_FragColor = vec4(finalSphereColor, 1.0) * checkForPresenceWithinSphere;\n}\n";

    /* renamed from: e */
    public PointF f67556e;

    /* renamed from: f */
    public int f67557f;

    /* renamed from: g */
    public float f67558g;

    /* renamed from: h */
    public int f67559h;

    /* renamed from: i */
    public float f67560i;

    /* renamed from: j */
    public int f67561j;

    /* renamed from: k */
    public float f67562k;

    /* renamed from: l */
    public int f67563l;

    public GPUImageGlassSphereFilter() {
        this(new PointF(0.5f, 0.5f), 0.25f, 0.71f);
    }

    private void setAspectRatio(float f) {
        this.f67560i = f;
        setFloat(this.f67561j, f);
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onInit() {
        super.onInit();
        this.f67557f = GLES20.glGetUniformLocation(getProgram(), "center");
        this.f67559h = GLES20.glGetUniformLocation(getProgram(), "radius");
        this.f67561j = GLES20.glGetUniformLocation(getProgram(), "aspectRatio");
        this.f67563l = GLES20.glGetUniformLocation(getProgram(), "refractiveIndex");
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onInitialized() {
        super.onInitialized();
        setRadius(this.f67558g);
        setCenter(this.f67556e);
        setRefractiveIndex(this.f67562k);
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onOutputSizeChanged(int i, int i2) {
        float f = i2 / i;
        this.f67560i = f;
        setAspectRatio(f);
        super.onOutputSizeChanged(i, i2);
    }

    public void setCenter(PointF pointF) {
        this.f67556e = pointF;
        setPoint(this.f67557f, pointF);
    }

    public void setRadius(float f) {
        this.f67558g = f;
        setFloat(this.f67559h, f);
    }

    public void setRefractiveIndex(float f) {
        this.f67562k = f;
        setFloat(this.f67563l, f);
    }

    public GPUImageGlassSphereFilter(PointF pointF, float f, float f2) {
        super(GPUImageFilter.NO_FILTER_VERTEX_SHADER, SPHERE_FRAGMENT_SHADER);
        this.f67556e = pointF;
        this.f67558g = f;
        this.f67562k = f2;
    }
}