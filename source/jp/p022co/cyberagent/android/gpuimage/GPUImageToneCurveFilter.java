package jp.p022co.cyberagent.android.gpuimage;

import android.graphics.Point;
import android.graphics.PointF;
import android.opengl.GLES20;
import androidx.work.Data;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

/* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageToneCurveFilter */
/* loaded from: classes5.dex */
public class GPUImageToneCurveFilter extends GPUImageFilter {
    public static final String TONE_CURVE_FRAGMENT_SHADER = " varying highp vec2 textureCoordinate;\n uniform sampler2D inputImageTexture;\n uniform sampler2D toneCurveTexture;\n\n void main()\n {\n     lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n     lowp float redCurveValue = texture2D(toneCurveTexture, vec2(textureColor.r, 0.0)).r;\n     lowp float greenCurveValue = texture2D(toneCurveTexture, vec2(textureColor.g, 0.0)).g;\n     lowp float blueCurveValue = texture2D(toneCurveTexture, vec2(textureColor.b, 0.0)).b;\n\n     gl_FragColor = vec4(redCurveValue, greenCurveValue, blueCurveValue, textureColor.a);\n }";

    /* renamed from: e */
    public int[] f67615e;

    /* renamed from: f */
    public int f67616f;

    /* renamed from: g */
    public PointF[] f67617g;

    /* renamed from: h */
    public PointF[] f67618h;

    /* renamed from: i */
    public PointF[] f67619i;

    /* renamed from: j */
    public PointF[] f67620j;

    /* renamed from: k */
    public ArrayList f67621k;

    /* renamed from: l */
    public ArrayList f67622l;

    /* renamed from: m */
    public ArrayList f67623m;

    /* renamed from: n */
    public ArrayList f67624n;

    /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageToneCurveFilter$a */
    /* loaded from: classes5.dex */
    public class RunnableC11584a implements Runnable {
        public RunnableC11584a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GLES20.glActiveTexture(33987);
            GLES20.glBindTexture(3553, GPUImageToneCurveFilter.this.f67615e[0]);
            if (GPUImageToneCurveFilter.this.f67622l.size() >= 256 && GPUImageToneCurveFilter.this.f67623m.size() >= 256 && GPUImageToneCurveFilter.this.f67624n.size() >= 256 && GPUImageToneCurveFilter.this.f67621k.size() >= 256) {
                byte[] bArr = new byte[1024];
                for (int i = 0; i < 256; i++) {
                    int i2 = i * 4;
                    float f = i;
                    bArr[i2 + 2] = (byte) (((int) Math.min(Math.max(((Float) GPUImageToneCurveFilter.this.f67624n.get(i)).floatValue() + f + ((Float) GPUImageToneCurveFilter.this.f67621k.get(i)).floatValue(), 0.0f), 255.0f)) & 255);
                    bArr[i2 + 1] = (byte) (((int) Math.min(Math.max(((Float) GPUImageToneCurveFilter.this.f67623m.get(i)).floatValue() + f + ((Float) GPUImageToneCurveFilter.this.f67621k.get(i)).floatValue(), 0.0f), 255.0f)) & 255);
                    bArr[i2] = (byte) (((int) Math.min(Math.max(f + ((Float) GPUImageToneCurveFilter.this.f67622l.get(i)).floatValue() + ((Float) GPUImageToneCurveFilter.this.f67621k.get(i)).floatValue(), 0.0f), 255.0f)) & 255);
                    bArr[i2 + 3] = -1;
                }
                GLES20.glTexImage2D(3553, 0, 6408, 256, 1, 0, 6408, 5121, ByteBuffer.wrap(bArr));
            }
        }
    }

    /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageToneCurveFilter$b */
    /* loaded from: classes5.dex */
    public class C11585b implements Comparator {
        public C11585b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(PointF pointF, PointF pointF2) {
            float f = pointF.x;
            float f2 = pointF2.x;
            if (f < f2) {
                return -1;
            }
            if (f > f2) {
                return 1;
            }
            return 0;
        }
    }

    public GPUImageToneCurveFilter() {
        super(GPUImageFilter.NO_FILTER_VERTEX_SHADER, TONE_CURVE_FRAGMENT_SHADER);
        this.f67615e = new int[]{-1};
        PointF[] pointFArr = {new PointF(0.0f, 0.0f), new PointF(0.5f, 0.5f), new PointF(1.0f, 1.0f)};
        this.f67617g = pointFArr;
        this.f67618h = pointFArr;
        this.f67619i = pointFArr;
        this.f67620j = pointFArr;
    }

    /* renamed from: f */
    public final ArrayList m29077f(Point[] pointArr) {
        int i;
        int length = pointArr.length;
        char c = 1;
        if (length <= 1) {
            return null;
        }
        char c2 = 2;
        char c3 = 0;
        double[][] dArr = (double[][]) Array.newInstance(Double.TYPE, length, 3);
        double[] dArr2 = new double[length];
        double[] dArr3 = dArr[0];
        dArr3[1] = 1.0d;
        double d = 0.0d;
        dArr3[0] = 0.0d;
        dArr3[2] = 0.0d;
        int i2 = 1;
        while (true) {
            i = length - 1;
            if (i2 >= i) {
                break;
            }
            Point point = pointArr[i2 - 1];
            Point point2 = pointArr[i2];
            int i3 = i2 + 1;
            Point point3 = pointArr[i3];
            double[] dArr4 = dArr[i2];
            int i4 = point2.x;
            int i5 = point.x;
            dArr4[c3] = (i4 - i5) / 6.0d;
            int i6 = point3.x;
            double[] dArr5 = dArr2;
            dArr4[c] = (i6 - i5) / 3.0d;
            dArr4[c2] = (i6 - i4) / 6.0d;
            int i7 = point3.y;
            int i8 = point2.y;
            dArr5[i2] = ((i7 - i8) / (i6 - i4)) - ((i8 - point.y) / (i4 - i5));
            i2 = i3;
            dArr2 = dArr5;
            c = 1;
            c2 = 2;
            c3 = 0;
            d = 0.0d;
        }
        double[] dArr6 = dArr2;
        double d2 = d;
        char c4 = 0;
        dArr6[0] = d2;
        dArr6[i] = d2;
        double[] dArr7 = dArr[i];
        char c5 = 1;
        dArr7[1] = 1.0d;
        dArr7[0] = d2;
        char c6 = 2;
        dArr7[2] = d2;
        int i9 = 1;
        while (i9 < length) {
            double[] dArr8 = dArr[i9];
            double d3 = dArr8[c4];
            int i10 = i9 - 1;
            double[] dArr9 = dArr[i10];
            double d4 = d3 / dArr9[c5];
            dArr8[c5] = dArr8[c5] - (dArr9[c6] * d4);
            dArr8[c4] = 0.0d;
            dArr6[i9] = dArr6[i9] - (d4 * dArr6[i10]);
            i9++;
            c4 = 0;
            c6 = 2;
            c5 = 1;
        }
        for (int i11 = length - 2; i11 >= 0; i11--) {
            double[] dArr10 = dArr[i11];
            double d5 = dArr10[2];
            int i12 = i11 + 1;
            double[] dArr11 = dArr[i12];
            double d6 = d5 / dArr11[1];
            dArr10[1] = dArr10[1] - (dArr11[0] * d6);
            dArr10[2] = 0.0d;
            dArr6[i11] = dArr6[i11] - (d6 * dArr6[i12]);
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i13 = 0; i13 < length; i13++) {
            arrayList.add(Double.valueOf(dArr6[i13] / dArr[i13][1]));
        }
        return arrayList;
    }

    /* renamed from: g */
    public final ArrayList m29076g(PointF[] pointFArr) {
        if (pointFArr != null && pointFArr.length > 0) {
            PointF[] pointFArr2 = (PointF[]) pointFArr.clone();
            Arrays.sort(pointFArr2, new C11585b());
            Point[] pointArr = new Point[pointFArr2.length];
            for (int i = 0; i < pointFArr.length; i++) {
                PointF pointF = pointFArr2[i];
                pointArr[i] = new Point((int) (pointF.x * 255.0f), (int) (pointF.y * 255.0f));
            }
            ArrayList m29075h = m29075h(pointArr);
            int i2 = ((Point) m29075h.get(0)).x;
            if (i2 > 0) {
                while (i2 >= 0) {
                    m29075h.add(0, new Point(i2, 0));
                    i2--;
                }
            }
            int i3 = ((Point) m29075h.get(m29075h.size() - 1)).x;
            if (i3 < 255) {
                while (true) {
                    i3++;
                    if (i3 > 255) {
                        break;
                    }
                    m29075h.add(new Point(i3, 255));
                }
            }
            ArrayList arrayList = new ArrayList(m29075h.size());
            Iterator it = m29075h.iterator();
            while (it.hasNext()) {
                Point point = (Point) it.next();
                int i4 = point.x;
                Point point2 = new Point(i4, i4);
                float sqrt = (float) Math.sqrt(Math.pow(point2.x - point.x, 2.0d) + Math.pow(point2.y - point.y, 2.0d));
                if (point2.y > point.y) {
                    sqrt = -sqrt;
                }
                arrayList.add(Float.valueOf(sqrt));
            }
            return arrayList;
        }
        return null;
    }

    /* renamed from: h */
    public final ArrayList m29075h(Point[] pointArr) {
        int i;
        Point[] pointArr2 = pointArr;
        ArrayList m29077f = m29077f(pointArr);
        int size = m29077f.size();
        if (size < 1) {
            return null;
        }
        double[] dArr = new double[size];
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            dArr[i3] = ((Double) m29077f.get(i3)).doubleValue();
        }
        ArrayList arrayList = new ArrayList(size + 1);
        while (i2 < size - 1) {
            Point point = pointArr2[i2];
            int i4 = i2 + 1;
            Point point2 = pointArr2[i4];
            int i5 = point.x;
            while (true) {
                int i6 = point2.x;
                if (i5 < i6) {
                    double d = (i5 - i) / (i6 - i);
                    double d2 = 1.0d - d;
                    double d3 = i6 - point.x;
                    int i7 = size;
                    Point point3 = point;
                    ArrayList arrayList2 = arrayList;
                    double d4 = (point.y * d2) + (point2.y * d) + (((d3 * d3) / 6.0d) * (((((d2 * d2) * d2) - d2) * dArr[i2]) + ((((d * d) * d) - d) * dArr[i4])));
                    double d5 = 255.0d;
                    if (d4 <= 255.0d) {
                        d5 = 0.0d;
                        if (d4 >= 0.0d) {
                            arrayList = arrayList2;
                            arrayList.add(new Point(i5, (int) Math.round(d4)));
                            i5++;
                            size = i7;
                            point = point3;
                        }
                    }
                    d4 = d5;
                    arrayList = arrayList2;
                    arrayList.add(new Point(i5, (int) Math.round(d4)));
                    i5++;
                    size = i7;
                    point = point3;
                }
            }
            pointArr2 = pointArr;
            i2 = i4;
        }
        if (arrayList.size() == 255) {
            arrayList.add(pointArr[pointArr.length - 1]);
        }
        return arrayList;
    }

    /* renamed from: i */
    public final short m29074i(InputStream inputStream) {
        return (short) (inputStream.read() | (inputStream.read() << 8));
    }

    /* renamed from: j */
    public final void m29073j() {
        runOnDraw(new RunnableC11584a());
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onDrawArraysPre() {
        if (this.f67615e[0] != -1) {
            GLES20.glActiveTexture(33987);
            GLES20.glBindTexture(3553, this.f67615e[0]);
            GLES20.glUniform1i(this.f67616f, 3);
        }
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onInit() {
        super.onInit();
        this.f67616f = GLES20.glGetUniformLocation(getProgram(), "toneCurveTexture");
        GLES20.glActiveTexture(33987);
        GLES20.glGenTextures(1, this.f67615e, 0);
        GLES20.glBindTexture(3553, this.f67615e[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, Data.MAX_DATA_BYTES, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onInitialized() {
        super.onInitialized();
        setRgbCompositeControlPoints(this.f67617g);
        setRedControlPoints(this.f67618h);
        setGreenControlPoints(this.f67619i);
        setBlueControlPoints(this.f67620j);
    }

    public void setBlueControlPoints(PointF[] pointFArr) {
        this.f67620j = pointFArr;
        this.f67624n = m29076g(pointFArr);
        m29073j();
    }

    public void setFromCurveFileInputStream(InputStream inputStream) {
        try {
            m29074i(inputStream);
            short m29074i = m29074i(inputStream);
            ArrayList arrayList = new ArrayList(m29074i);
            for (int i = 0; i < m29074i; i++) {
                int m29074i2 = m29074i(inputStream);
                PointF[] pointFArr = new PointF[m29074i2];
                for (int i2 = 0; i2 < m29074i2; i2++) {
                    pointFArr[i2] = new PointF(m29074i(inputStream) * 0.003921569f, m29074i(inputStream) * 0.003921569f);
                }
                arrayList.add(pointFArr);
            }
            inputStream.close();
            this.f67617g = (PointF[]) arrayList.get(0);
            this.f67618h = (PointF[]) arrayList.get(1);
            this.f67619i = (PointF[]) arrayList.get(2);
            this.f67620j = (PointF[]) arrayList.get(3);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setGreenControlPoints(PointF[] pointFArr) {
        this.f67619i = pointFArr;
        this.f67623m = m29076g(pointFArr);
        m29073j();
    }

    public void setRedControlPoints(PointF[] pointFArr) {
        this.f67618h = pointFArr;
        this.f67622l = m29076g(pointFArr);
        m29073j();
    }

    public void setRgbCompositeControlPoints(PointF[] pointFArr) {
        this.f67617g = pointFArr;
        this.f67621k = m29076g(pointFArr);
        m29073j();
    }
}
