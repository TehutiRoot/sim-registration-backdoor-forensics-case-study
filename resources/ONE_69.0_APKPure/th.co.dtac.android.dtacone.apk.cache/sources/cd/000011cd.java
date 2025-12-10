package p000;

/* renamed from: Sl1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C18488Sl1 implements InterfaceC18423Rl1 {

    /* renamed from: a */
    public final Object[] f5928a;

    /* renamed from: b */
    public int f5929b;

    public C18488Sl1(int i) {
        if (i > 0) {
            this.f5928a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    @Override // p000.InterfaceC18423Rl1
    /* renamed from: a */
    public void mo66452a(Object[] objArr, int i) {
        if (i > objArr.length) {
            i = objArr.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            int i3 = this.f5929b;
            Object[] objArr2 = this.f5928a;
            if (i3 < objArr2.length) {
                objArr2[i3] = obj;
                this.f5929b = i3 + 1;
            }
        }
    }

    @Override // p000.InterfaceC18423Rl1
    public Object acquire() {
        int i = this.f5929b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f5928a;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.f5929b = i - 1;
        return obj;
    }

    @Override // p000.InterfaceC18423Rl1
    public boolean release(Object obj) {
        int i = this.f5929b;
        Object[] objArr = this.f5928a;
        if (i < objArr.length) {
            objArr[i] = obj;
            this.f5929b = i + 1;
            return true;
        }
        return false;
    }
}