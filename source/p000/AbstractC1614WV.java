package p000;

/* renamed from: WV */
/* loaded from: classes4.dex */
public abstract class AbstractC1614WV {
    /* renamed from: a */
    public static void m65620a(float f, float[] fArr) {
        if (f <= 0.5f) {
            fArr[0] = 1.0f - (f * 2.0f);
            fArr[1] = 0.0f;
            return;
        }
        fArr[0] = 0.0f;
        fArr[1] = (f * 2.0f) - 1.0f;
    }
}
