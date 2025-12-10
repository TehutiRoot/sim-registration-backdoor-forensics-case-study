package p000;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: yT1 */
/* loaded from: classes.dex */
public final class C23140yT1 {

    /* renamed from: a */
    public final byte[] f108763a;

    /* renamed from: b */
    public String f108764b;

    /* renamed from: c */
    public List f108765c;

    public C23140yT1(byte[] bArr) {
        this.f108763a = bArr;
    }

    /* renamed from: a */
    public static /* synthetic */ int m257a(byte[] bArr, byte[] bArr2) {
        return m256b(bArr, bArr2);
    }

    /* renamed from: b */
    public static int m256b(byte[] bArr, byte[] bArr2) {
        if (bArr == bArr2) {
            return 0;
        }
        if (bArr == null) {
            return -1;
        }
        if (bArr2 == null) {
            return 1;
        }
        for (int i = 0; i < Math.min(bArr.length, bArr2.length); i++) {
            byte b = bArr[i];
            byte b2 = bArr2[i];
            if (b != b2) {
                return b - b2;
            }
        }
        if (bArr.length == bArr2.length) {
            return 0;
        }
        return bArr.length - bArr2.length;
    }

    /* renamed from: c */
    public static C23140yT1 m255c(String str, List list) {
        return new C23140yT1(m254d(str, list), str, list);
    }

    /* renamed from: d */
    public static byte[] m254d(String str, List list) {
        Collections.sort(list, new Comparator() { // from class: xT1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C23140yT1.m257a((byte[]) obj, (byte[]) obj2);
            }
        });
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeUTF(str);
        dataOutputStream.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            byte[] bArr = (byte[]) it.next();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
        dataOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: e */
    public static C23140yT1 m253e(byte[] bArr) {
        return new C23140yT1(bArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C23140yT1.class == obj.getClass()) {
            return Arrays.equals(this.f108763a, ((C23140yT1) obj).f108763a);
        }
        return false;
    }

    /* renamed from: f */
    public byte[] m252f(int i) {
        m250h();
        List list = this.f108765c;
        if (list != null) {
            return Arrays.copyOf((byte[]) list.get(i), ((byte[]) this.f108765c.get(i)).length);
        }
        throw new IllegalStateException();
    }

    /* renamed from: g */
    public String m251g() {
        m250h();
        String str = this.f108764b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException();
    }

    /* renamed from: h */
    public final void m250h() {
        if (this.f108764b != null) {
            return;
        }
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(this.f108763a));
        this.f108764b = dataInputStream.readUTF();
        int readInt = dataInputStream.readInt();
        this.f108765c = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            int readInt2 = dataInputStream.readInt();
            byte[] bArr = new byte[readInt2];
            if (dataInputStream.read(bArr) == readInt2) {
                this.f108765c.add(bArr);
            } else {
                throw new IllegalStateException("Could not read fingerprint");
            }
        }
    }

    public int hashCode() {
        return Arrays.hashCode(this.f108763a);
    }

    /* renamed from: i */
    public byte[] m249i() {
        byte[] bArr = this.f108763a;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public C23140yT1(byte[] bArr, String str, List list) {
        this.f108763a = bArr;
        this.f108764b = str;
        this.f108765c = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            this.f108765c.add(Arrays.copyOf(bArr2, bArr2.length));
        }
    }
}
