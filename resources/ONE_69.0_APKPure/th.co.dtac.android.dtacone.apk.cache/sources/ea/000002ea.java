package p000;

import android.graphics.PointF;
import org.apache.http.message.TokenParser;

/* renamed from: D22 */
/* loaded from: classes5.dex */
public class D22 {

    /* renamed from: a */
    public PointF f906a;

    /* renamed from: b */
    public float[] f907b;

    public D22(PointF pointF, float[] fArr) {
        this.f906a = pointF;
        this.f907b = (float[]) fArr.clone();
    }

    public String toString() {
        float[] fArr;
        StringBuilder sb = new StringBuilder();
        for (float f : this.f907b) {
            if (sb.length() > 0) {
                sb.append(TokenParser.f74644SP);
            }
            sb.append(String.format("%3.2f", Float.valueOf(f)));
        }
        return "Vertex{ " + this.f906a + ", colors=[" + ((Object) sb) + "] }";
    }
}