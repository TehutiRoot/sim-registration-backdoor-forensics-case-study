package io.grpc;

import java.util.Arrays;
import org.apache.commons.cli.HelpFormatter;

/* renamed from: io.grpc.c */
/* loaded from: classes5.dex */
public abstract class AbstractC10556c {

    /* renamed from: io.grpc.c$a */
    /* loaded from: classes5.dex */
    public static final class C10557a implements InterfaceC10560d {

        /* renamed from: a */
        public final Object[] f63521a;

        /* renamed from: b */
        public final Object[] f63522b;

        public C10557a(Object obj, Object obj2, Object obj3, Object obj4) {
            this(new Object[]{obj, obj3}, new Object[]{obj2, obj4});
        }

        @Override // io.grpc.AbstractC10556c.InterfaceC10560d
        /* renamed from: a */
        public Object mo30617a(Object obj, int i, int i2) {
            int i3 = 0;
            while (true) {
                Object[] objArr = this.f63521a;
                if (i3 < objArr.length) {
                    if (objArr[i3] == obj) {
                        return this.f63522b[i3];
                    }
                    i3++;
                } else {
                    return null;
                }
            }
        }

        @Override // io.grpc.AbstractC10556c.InterfaceC10560d
        /* renamed from: b */
        public InterfaceC10560d mo30616b(Object obj, Object obj2, int i, int i2) {
            int hashCode = this.f63521a[0].hashCode();
            if (hashCode != i) {
                return C10558b.m30621c(new C10559c(obj, obj2), i, this, hashCode, i2);
            }
            int m30622c = m30622c(obj);
            if (m30622c != -1) {
                Object[] objArr = this.f63521a;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                Object[] copyOf2 = Arrays.copyOf(this.f63522b, this.f63521a.length);
                copyOf[m30622c] = obj;
                copyOf2[m30622c] = obj2;
                return new C10557a(copyOf, copyOf2);
            }
            Object[] objArr2 = this.f63521a;
            Object[] copyOf3 = Arrays.copyOf(objArr2, objArr2.length + 1);
            Object[] copyOf4 = Arrays.copyOf(this.f63522b, this.f63521a.length + 1);
            Object[] objArr3 = this.f63521a;
            copyOf3[objArr3.length] = obj;
            copyOf4[objArr3.length] = obj2;
            return new C10557a(copyOf3, copyOf4);
        }

        /* renamed from: c */
        public final int m30622c(Object obj) {
            int i = 0;
            while (true) {
                Object[] objArr = this.f63521a;
                if (i < objArr.length) {
                    if (objArr[i] == obj) {
                        return i;
                    }
                    i++;
                } else {
                    return -1;
                }
            }
        }

        @Override // io.grpc.AbstractC10556c.InterfaceC10560d
        public int size() {
            return this.f63522b.length;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CollisionLeaf(");
            for (int i = 0; i < this.f63522b.length; i++) {
                sb.append("(key=");
                sb.append(this.f63521a[i]);
                sb.append(" value=");
                sb.append(this.f63522b[i]);
                sb.append(") ");
            }
            sb.append(")");
            return sb.toString();
        }

        public C10557a(Object[] objArr, Object[] objArr2) {
            this.f63521a = objArr;
            this.f63522b = objArr2;
        }
    }

    /* renamed from: io.grpc.c$b */
    /* loaded from: classes5.dex */
    public static final class C10558b implements InterfaceC10560d {

        /* renamed from: a */
        public final int f63523a;

        /* renamed from: b */
        public final InterfaceC10560d[] f63524b;

        /* renamed from: c */
        public final int f63525c;

        public C10558b(int i, InterfaceC10560d[] interfaceC10560dArr, int i2) {
            this.f63523a = i;
            this.f63524b = interfaceC10560dArr;
            this.f63525c = i2;
        }

        /* renamed from: c */
        public static InterfaceC10560d m30621c(InterfaceC10560d interfaceC10560d, int i, InterfaceC10560d interfaceC10560d2, int i2, int i3) {
            int m30619e = m30619e(i, i3);
            int m30619e2 = m30619e(i2, i3);
            if (m30619e == m30619e2) {
                InterfaceC10560d m30621c = m30621c(interfaceC10560d, i, interfaceC10560d2, i2, i3 + 5);
                return new C10558b(m30619e, new InterfaceC10560d[]{m30621c}, m30621c.size());
            }
            if (m30618f(i, i3) > m30618f(i2, i3)) {
                interfaceC10560d2 = interfaceC10560d;
                interfaceC10560d = interfaceC10560d2;
            }
            return new C10558b(m30619e | m30619e2, new InterfaceC10560d[]{interfaceC10560d, interfaceC10560d2}, interfaceC10560d.size() + interfaceC10560d2.size());
        }

        /* renamed from: e */
        public static int m30619e(int i, int i2) {
            return 1 << m30618f(i, i2);
        }

        /* renamed from: f */
        public static int m30618f(int i, int i2) {
            return (i >>> i2) & 31;
        }

        @Override // io.grpc.AbstractC10556c.InterfaceC10560d
        /* renamed from: a */
        public Object mo30617a(Object obj, int i, int i2) {
            int m30619e = m30619e(i, i2);
            if ((this.f63523a & m30619e) == 0) {
                return null;
            }
            return this.f63524b[m30620d(m30619e)].mo30617a(obj, i, i2 + 5);
        }

        @Override // io.grpc.AbstractC10556c.InterfaceC10560d
        /* renamed from: b */
        public InterfaceC10560d mo30616b(Object obj, Object obj2, int i, int i2) {
            int m30619e = m30619e(i, i2);
            int m30620d = m30620d(m30619e);
            int i3 = this.f63523a;
            if ((i3 & m30619e) == 0) {
                int i4 = i3 | m30619e;
                InterfaceC10560d[] interfaceC10560dArr = this.f63524b;
                InterfaceC10560d[] interfaceC10560dArr2 = new InterfaceC10560d[interfaceC10560dArr.length + 1];
                System.arraycopy(interfaceC10560dArr, 0, interfaceC10560dArr2, 0, m30620d);
                interfaceC10560dArr2[m30620d] = new C10559c(obj, obj2);
                InterfaceC10560d[] interfaceC10560dArr3 = this.f63524b;
                System.arraycopy(interfaceC10560dArr3, m30620d, interfaceC10560dArr2, m30620d + 1, interfaceC10560dArr3.length - m30620d);
                return new C10558b(i4, interfaceC10560dArr2, size() + 1);
            }
            InterfaceC10560d[] interfaceC10560dArr4 = this.f63524b;
            InterfaceC10560d[] interfaceC10560dArr5 = (InterfaceC10560d[]) Arrays.copyOf(interfaceC10560dArr4, interfaceC10560dArr4.length);
            interfaceC10560dArr5[m30620d] = this.f63524b[m30620d].mo30616b(obj, obj2, i, i2 + 5);
            return new C10558b(this.f63523a, interfaceC10560dArr5, (size() + interfaceC10560dArr5[m30620d].size()) - this.f63524b[m30620d].size());
        }

        /* renamed from: d */
        public final int m30620d(int i) {
            return Integer.bitCount((i - 1) & this.f63523a);
        }

        @Override // io.grpc.AbstractC10556c.InterfaceC10560d
        public int size() {
            return this.f63525c;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CompressedIndex(");
            sb.append(String.format("bitmap=%s ", Integer.toBinaryString(this.f63523a)));
            for (InterfaceC10560d interfaceC10560d : this.f63524b) {
                sb.append(interfaceC10560d);
                sb.append(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
            }
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: io.grpc.c$c */
    /* loaded from: classes5.dex */
    public static final class C10559c implements InterfaceC10560d {

        /* renamed from: a */
        public final Object f63526a;

        /* renamed from: b */
        public final Object f63527b;

        public C10559c(Object obj, Object obj2) {
            this.f63526a = obj;
            this.f63527b = obj2;
        }

        @Override // io.grpc.AbstractC10556c.InterfaceC10560d
        /* renamed from: a */
        public Object mo30617a(Object obj, int i, int i2) {
            if (this.f63526a == obj) {
                return this.f63527b;
            }
            return null;
        }

        @Override // io.grpc.AbstractC10556c.InterfaceC10560d
        /* renamed from: b */
        public InterfaceC10560d mo30616b(Object obj, Object obj2, int i, int i2) {
            int hashCode = this.f63526a.hashCode();
            if (hashCode != i) {
                return C10558b.m30621c(new C10559c(obj, obj2), i, this, hashCode, i2);
            }
            if (this.f63526a == obj) {
                return new C10559c(obj, obj2);
            }
            return new C10557a(this.f63526a, this.f63527b, obj, obj2);
        }

        @Override // io.grpc.AbstractC10556c.InterfaceC10560d
        public int size() {
            return 1;
        }

        public String toString() {
            return String.format("Leaf(key=%s value=%s)", this.f63526a, this.f63527b);
        }
    }

    /* renamed from: io.grpc.c$d */
    /* loaded from: classes5.dex */
    public interface InterfaceC10560d {
        /* renamed from: a */
        Object mo30617a(Object obj, int i, int i2);

        /* renamed from: b */
        InterfaceC10560d mo30616b(Object obj, Object obj2, int i, int i2);

        int size();
    }

    /* renamed from: a */
    public static Object m30624a(InterfaceC10560d interfaceC10560d, Object obj) {
        if (interfaceC10560d == null) {
            return null;
        }
        return interfaceC10560d.mo30617a(obj, obj.hashCode(), 0);
    }

    /* renamed from: b */
    public static InterfaceC10560d m30623b(InterfaceC10560d interfaceC10560d, Object obj, Object obj2) {
        if (interfaceC10560d == null) {
            return new C10559c(obj, obj2);
        }
        return interfaceC10560d.mo30616b(obj, obj2, obj.hashCode(), 0);
    }
}