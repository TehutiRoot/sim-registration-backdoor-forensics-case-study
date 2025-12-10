package jp.p022co.cyberagent.android.gpuimage;

import android.graphics.PointF;
import android.opengl.GLES20;

/* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageVignetteFilter */
/* loaded from: classes5.dex */
public class GPUImageVignetteFilter extends GPUImageFilter {
    public static final String VIGNETTING_FRAGMENT_SHADER = " uniform sampler2D inputImageTexture;\n varying highp vec2 textureCoordinate;\n \n uniform lowp vec2 vignetteCenter;\n uniform lowp vec3 vignetteColor;\n uniform highp float vignetteStart;\n uniform highp float vignetteEnd;\n \n void main()\n {\n     /*\n     lowp vec3 rgb = texture2D(inputImageTexture, textureCoordinate).rgb;\n     lowp float d = distance(textureCoordinate, vec2(0.5,0.5));\n     rgb *= (1.0 - smoothstep(vignetteStart, vignetteEnd, d));\n     gl_FragColor = vec4(vec3(rgb),1.0);\n      */\n     \n     lowp vec3 rgb = texture2D(inputImageTexture, textureCoordinate).rgb;\n     lowp float d = distance(textureCoordinate, vec2(vignetteCenter.x, vignetteCenter.y));\n     lowp float percent = smoothstep(vignetteStart, vignetteEnd, d);\n     gl_FragColor = vec4(mix(rgb.x, vignetteColor.x, percent), mix(rgb.y, vignetteColor.y, percent), mix(rgb.z, vignetteColor.z, percent), 1.0);\n }";

    /* renamed from: e */
    public int f67671e;

    /* renamed from: f */
    public PointF f67672f;

    /* renamed from: g */
    public int f67673g;

    /* renamed from: h */
    public float[] f67674h;

    /* renamed from: i */
    public int f67675i;

    /* renamed from: j */
    public float f67676j;

    /* renamed from: k */
    public int f67677k;

    /* renamed from: l */
    public float f67678l;

    public GPUImageVignetteFilter() {
        this(new PointF(), new float[]{0.0f, 0.0f, 0.0f}, 0.3f, 0.75f);
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onInit() {
        super.onInit();
        this.f67671e = GLES20.glGetUniformLocation(getProgram(), "vignetteCenter");
        this.f67673g = GLES20.glGetUniformLocation(getProgram(), "vignetteColor");
        this.f67675i = GLES20.glGetUniformLocation(getProgram(), "vignetteStart");
        this.f67677k = GLES20.glGetUniformLocation(getProgram(), "vignetteEnd");
        setVignetteCenter(this.f67672f);
        setVignetteColor(this.f67674h);
        setVignetteStart(this.f67676j);
        setVignetteEnd(this.f67678l);
    }

    public void setVignetteCenter(PointF pointF) {
        this.f67672f = pointF;
        setPoint(this.f67671e, pointF);
    }

    public void setVignetteColor(float[] fArr) {
        this.f67674h = fArr;
        setFloatVec3(this.f67673g, fArr);
    }

    public void setVignetteEnd(float f) {
        this.f67678l = f;
        setFloat(this.f67677k, f);
    }

    public void setVignetteStart(float f) {
        this.f67676j = f;
        setFloat(this.f67675i, f);
    }

    public GPUImageVignetteFilter(PointF pointF, float[] fArr, float f, float f2) {
        super(GPUImageFilter.NO_FILTER_VERTEX_SHADER, VIGNETTING_FRAGMENT_SHADER);
        this.f67672f = pointF;
        this.f67674h = fArr;
        this.f67676j = f;
        this.f67678l = f2;
    }
}
