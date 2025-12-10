package p000;

import android.graphics.PointF;
import org.apache.http.message.TokenParser;

/* renamed from: G12 */
/* loaded from: classes5.dex */
public class G12 {

    /* renamed from: a */
    public PointF f1783a;

    /* renamed from: b */
    public float[] f1784b;

    public G12(PointF pointF, float[] fArr) {
        this.f1783a = pointF;
        this.f1784b = (float[]) fArr.clone();
    }

    public String toString() {
        float[] fArr;
        StringBuilder sb = new StringBuilder();
        for (float f : this.f1784b) {
            if (sb.length() > 0) {
                sb.append(TokenParser.f74560SP);
            }
            sb.append(String.format("%3.2f", Float.valueOf(f)));
        }
        return "Vertex{ " + this.f1783a + ", colors=[" + ((Object) sb) + "] }";
    }
}
