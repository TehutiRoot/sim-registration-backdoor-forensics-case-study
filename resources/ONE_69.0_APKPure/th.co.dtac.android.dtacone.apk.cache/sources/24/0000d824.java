package jp.p022co.cyberagent.android.gpuimage;

import android.opengl.GLES20;

/* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageWhiteBalanceFilter */
/* loaded from: classes5.dex */
public class GPUImageWhiteBalanceFilter extends GPUImageFilter {
    public static final String WHITE_BALANCE_FRAGMENT_SHADER = "uniform sampler2D inputImageTexture;\nvarying highp vec2 textureCoordinate;\n \nuniform lowp float temperature;\nuniform lowp float tint;\n\nconst lowp vec3 warmFilter = vec3(0.93, 0.54, 0.0);\n\nconst mediump mat3 RGBtoYIQ = mat3(0.299, 0.587, 0.114, 0.596, -0.274, -0.322, 0.212, -0.523, 0.311);\nconst mediump mat3 YIQtoRGB = mat3(1.0, 0.956, 0.621, 1.0, -0.272, -0.647, 1.0, -1.105, 1.702);\n\nvoid main()\n{\n\tlowp vec4 source = texture2D(inputImageTexture, textureCoordinate);\n\t\n\tmediump vec3 yiq = RGBtoYIQ * source.rgb; //adjusting tint\n\tyiq.b = clamp(yiq.b + tint*0.5226*0.1, -0.5226, 0.5226);\n\tlowp vec3 rgb = YIQtoRGB * yiq;\n\n\tlowp vec3 processed = vec3(\n\t\t(rgb.r < 0.5 ? (2.0 * rgb.r * warmFilter.r) : (1.0 - 2.0 * (1.0 - rgb.r) * (1.0 - warmFilter.r))), //adjusting temperature\n\t\t(rgb.g < 0.5 ? (2.0 * rgb.g * warmFilter.g) : (1.0 - 2.0 * (1.0 - rgb.g) * (1.0 - warmFilter.g))), \n\t\t(rgb.b < 0.5 ? (2.0 * rgb.b * warmFilter.b) : (1.0 - 2.0 * (1.0 - rgb.b) * (1.0 - warmFilter.b))));\n\n\tgl_FragColor = vec4(mix(rgb, processed, temperature), source.a);\n}";

    /* renamed from: e */
    public int f67736e;

    /* renamed from: f */
    public float f67737f;

    /* renamed from: g */
    public int f67738g;

    /* renamed from: h */
    public float f67739h;

    public GPUImageWhiteBalanceFilter() {
        this(5000.0f, 0.0f);
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onInit() {
        super.onInit();
        this.f67736e = GLES20.glGetUniformLocation(getProgram(), "temperature");
        this.f67738g = GLES20.glGetUniformLocation(getProgram(), "tint");
        setTemperature(this.f67737f);
        setTint(this.f67739h);
    }

    public void setTemperature(float f) {
        double d;
        this.f67737f = f;
        int i = this.f67736e;
        double d2 = f - 5000.0d;
        if (f < 5000.0f) {
            d = 4.0E-4d;
        } else {
            d = 6.0E-5d;
        }
        setFloat(i, (float) (d2 * d));
    }

    public void setTint(float f) {
        this.f67739h = f;
        setFloat(this.f67738g, (float) (f / 100.0d));
    }

    public GPUImageWhiteBalanceFilter(float f, float f2) {
        super(GPUImageFilter.NO_FILTER_VERTEX_SHADER, WHITE_BALANCE_FRAGMENT_SHADER);
        this.f67737f = f;
        this.f67739h = f2;
    }
}