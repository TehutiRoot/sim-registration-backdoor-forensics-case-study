package p000;

/* renamed from: Vk1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C18636Vk1 implements InterfaceC18572Uk1 {

    /* renamed from: a */
    public final Object[] f6809a;

    /* renamed from: b */
    public int f6810b;

    public C18636Vk1(int i) {
        if (i > 0) {
            this.f6809a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    @Override // p000.InterfaceC18572Uk1
    /* renamed from: a */
    public void mo65738a(Object[] objArr, int i) {
        if (i > objArr.length) {
            i = objArr.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            int i3 = this.f6810b;
            Object[] objArr2 = this.f6809a;
            if (i3 < objArr2.length) {
                objArr2[i3] = obj;
                this.f6810b = i3 + 1;
            }
        }
    }

    @Override // p000.InterfaceC18572Uk1
    public Object acquire() {
        int i = this.f6810b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f6809a;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.f6810b = i - 1;
        return obj;
    }

    @Override // p000.InterfaceC18572Uk1
    public boolean release(Object obj) {
        int i = this.f6810b;
        Object[] objArr = this.f6809a;
        if (i < objArr.length) {
            objArr[i] = obj;
            this.f6810b = i + 1;
            return true;
        }
        return false;
    }
}
