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

/* renamed from: vU1 */
/* loaded from: classes.dex */
public final class C22694vU1 {

    /* renamed from: a */
    public final byte[] f108120a;

    /* renamed from: b */
    public String f108121b;

    /* renamed from: c */
    public List f108122c;

    public C22694vU1(byte[] bArr) {
        this.f108120a = bArr;
    }

    /* renamed from: a */
    public static /* synthetic */ int m905a(byte[] bArr, byte[] bArr2) {
        return m904b(bArr, bArr2);
    }

    /* renamed from: b */
    public static int m904b(byte[] bArr, byte[] bArr2) {
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
    public static C22694vU1 m903c(String str, List list) {
        return new C22694vU1(m902d(str, list), str, list);
    }

    /* renamed from: d */
    public static byte[] m902d(String str, List list) {
        Collections.sort(list, new Comparator() { // from class: uU1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C22694vU1.m905a((byte[]) obj, (byte[]) obj2);
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
    public static C22694vU1 m901e(byte[] bArr) {
        return new C22694vU1(bArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C22694vU1.class == obj.getClass()) {
            return Arrays.equals(this.f108120a, ((C22694vU1) obj).f108120a);
        }
        return false;
    }

    /* renamed from: f */
    public byte[] m900f(int i) {
        m898h();
        List list = this.f108122c;
        if (list != null) {
            return Arrays.copyOf((byte[]) list.get(i), ((byte[]) this.f108122c.get(i)).length);
        }
        throw new IllegalStateException();
    }

    /* renamed from: g */
    public String m899g() {
        m898h();
        String str = this.f108121b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException();
    }

    /* renamed from: h */
    public final void m898h() {
        if (this.f108121b != null) {
            return;
        }
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(this.f108120a));
        this.f108121b = dataInputStream.readUTF();
        int readInt = dataInputStream.readInt();
        this.f108122c = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            int readInt2 = dataInputStream.readInt();
            byte[] bArr = new byte[readInt2];
            if (dataInputStream.read(bArr) == readInt2) {
                this.f108122c.add(bArr);
            } else {
                throw new IllegalStateException("Could not read fingerprint");
            }
        }
    }

    public int hashCode() {
        return Arrays.hashCode(this.f108120a);
    }

    /* renamed from: i */
    public byte[] m897i() {
        byte[] bArr = this.f108120a;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public C22694vU1(byte[] bArr, String str, List list) {
        this.f108120a = bArr;
        this.f108121b = str;
        this.f108122c = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            this.f108122c.add(Arrays.copyOf(bArr2, bArr2.length));
        }
    }
}