package io.grpc;

import java.util.Arrays;
import org.apache.commons.cli.HelpFormatter;

/* renamed from: io.grpc.c */
/* loaded from: classes5.dex */
public abstract class AbstractC10569c {

    /* renamed from: io.grpc.c$a */
    /* loaded from: classes5.dex */
    public static final class C10570a implements InterfaceC10573d {

        /* renamed from: a */
        public final Object[] f63458a;

        /* renamed from: b */
        public final Object[] f63459b;

        public C10570a(Object obj, Object obj2, Object obj3, Object obj4) {
            this(new Object[]{obj, obj3}, new Object[]{obj2, obj4});
        }

        @Override // io.grpc.AbstractC10569c.InterfaceC10573d
        /* renamed from: a */
        public Object mo30277a(Object obj, int i, int i2) {
            int i3 = 0;
            while (true) {
                Object[] objArr = this.f63458a;
                if (i3 < objArr.length) {
                    if (objArr[i3] == obj) {
                        return this.f63459b[i3];
                    }
                    i3++;
                } else {
                    return null;
                }
            }
        }

        @Override // io.grpc.AbstractC10569c.InterfaceC10573d
        /* renamed from: b */
        public InterfaceC10573d mo30276b(Object obj, Object obj2, int i, int i2) {
            int hashCode = this.f63458a[0].hashCode();
            if (hashCode != i) {
                return C10571b.m30281c(new C10572c(obj, obj2), i, this, hashCode, i2);
            }
            int m30282c = m30282c(obj);
            if (m30282c != -1) {
                Object[] objArr = this.f63458a;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                Object[] copyOf2 = Arrays.copyOf(this.f63459b, this.f63458a.length);
                copyOf[m30282c] = obj;
                copyOf2[m30282c] = obj2;
                return new C10570a(copyOf, copyOf2);
            }
            Object[] objArr2 = this.f63458a;
            Object[] copyOf3 = Arrays.copyOf(objArr2, objArr2.length + 1);
            Object[] copyOf4 = Arrays.copyOf(this.f63459b, this.f63458a.length + 1);
            Object[] objArr3 = this.f63458a;
            copyOf3[objArr3.length] = obj;
            copyOf4[objArr3.length] = obj2;
            return new C10570a(copyOf3, copyOf4);
        }

        /* renamed from: c */
        public final int m30282c(Object obj) {
            int i = 0;
            while (true) {
                Object[] objArr = this.f63458a;
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

        @Override // io.grpc.AbstractC10569c.InterfaceC10573d
        public int size() {
            return this.f63459b.length;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CollisionLeaf(");
            for (int i = 0; i < this.f63459b.length; i++) {
                sb.append("(key=");
                sb.append(this.f63458a[i]);
                sb.append(" value=");
                sb.append(this.f63459b[i]);
                sb.append(") ");
            }
            sb.append(")");
            return sb.toString();
        }

        public C10570a(Object[] objArr, Object[] objArr2) {
            this.f63458a = objArr;
            this.f63459b = objArr2;
        }
    }

    /* renamed from: io.grpc.c$b */
    /* loaded from: classes5.dex */
    public static final class C10571b implements InterfaceC10573d {

        /* renamed from: a */
        public final int f63460a;

        /* renamed from: b */
        public final InterfaceC10573d[] f63461b;

        /* renamed from: c */
        public final int f63462c;

        public C10571b(int i, InterfaceC10573d[] interfaceC10573dArr, int i2) {
            this.f63460a = i;
            this.f63461b = interfaceC10573dArr;
            this.f63462c = i2;
        }

        /* renamed from: c */
        public static InterfaceC10573d m30281c(InterfaceC10573d interfaceC10573d, int i, InterfaceC10573d interfaceC10573d2, int i2, int i3) {
            int m30279e = m30279e(i, i3);
            int m30279e2 = m30279e(i2, i3);
            if (m30279e == m30279e2) {
                InterfaceC10573d m30281c = m30281c(interfaceC10573d, i, interfaceC10573d2, i2, i3 + 5);
                return new C10571b(m30279e, new InterfaceC10573d[]{m30281c}, m30281c.size());
            }
            if (m30278f(i, i3) > m30278f(i2, i3)) {
                interfaceC10573d2 = interfaceC10573d;
                interfaceC10573d = interfaceC10573d2;
            }
            return new C10571b(m30279e | m30279e2, new InterfaceC10573d[]{interfaceC10573d, interfaceC10573d2}, interfaceC10573d.size() + interfaceC10573d2.size());
        }

        /* renamed from: e */
        public static int m30279e(int i, int i2) {
            return 1 << m30278f(i, i2);
        }

        /* renamed from: f */
        public static int m30278f(int i, int i2) {
            return (i >>> i2) & 31;
        }

        @Override // io.grpc.AbstractC10569c.InterfaceC10573d
        /* renamed from: a */
        public Object mo30277a(Object obj, int i, int i2) {
            int m30279e = m30279e(i, i2);
            if ((this.f63460a & m30279e) == 0) {
                return null;
            }
            return this.f63461b[m30280d(m30279e)].mo30277a(obj, i, i2 + 5);
        }

        @Override // io.grpc.AbstractC10569c.InterfaceC10573d
        /* renamed from: b */
        public InterfaceC10573d mo30276b(Object obj, Object obj2, int i, int i2) {
            int m30279e = m30279e(i, i2);
            int m30280d = m30280d(m30279e);
            int i3 = this.f63460a;
            if ((i3 & m30279e) == 0) {
                int i4 = i3 | m30279e;
                InterfaceC10573d[] interfaceC10573dArr = this.f63461b;
                InterfaceC10573d[] interfaceC10573dArr2 = new InterfaceC10573d[interfaceC10573dArr.length + 1];
                System.arraycopy(interfaceC10573dArr, 0, interfaceC10573dArr2, 0, m30280d);
                interfaceC10573dArr2[m30280d] = new C10572c(obj, obj2);
                InterfaceC10573d[] interfaceC10573dArr3 = this.f63461b;
                System.arraycopy(interfaceC10573dArr3, m30280d, interfaceC10573dArr2, m30280d + 1, interfaceC10573dArr3.length - m30280d);
                return new C10571b(i4, interfaceC10573dArr2, size() + 1);
            }
            InterfaceC10573d[] interfaceC10573dArr4 = this.f63461b;
            InterfaceC10573d[] interfaceC10573dArr5 = (InterfaceC10573d[]) Arrays.copyOf(interfaceC10573dArr4, interfaceC10573dArr4.length);
            interfaceC10573dArr5[m30280d] = this.f63461b[m30280d].mo30276b(obj, obj2, i, i2 + 5);
            return new C10571b(this.f63460a, interfaceC10573dArr5, (size() + interfaceC10573dArr5[m30280d].size()) - this.f63461b[m30280d].size());
        }

        /* renamed from: d */
        public final int m30280d(int i) {
            return Integer.bitCount((i - 1) & this.f63460a);
        }

        @Override // io.grpc.AbstractC10569c.InterfaceC10573d
        public int size() {
            return this.f63462c;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CompressedIndex(");
            sb.append(String.format("bitmap=%s ", Integer.toBinaryString(this.f63460a)));
            for (InterfaceC10573d interfaceC10573d : this.f63461b) {
                sb.append(interfaceC10573d);
                sb.append(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
            }
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: io.grpc.c$c */
    /* loaded from: classes5.dex */
    public static final class C10572c implements InterfaceC10573d {

        /* renamed from: a */
        public final Object f63463a;

        /* renamed from: b */
        public final Object f63464b;

        public C10572c(Object obj, Object obj2) {
            this.f63463a = obj;
            this.f63464b = obj2;
        }

        @Override // io.grpc.AbstractC10569c.InterfaceC10573d
        /* renamed from: a */
        public Object mo30277a(Object obj, int i, int i2) {
            if (this.f63463a == obj) {
                return this.f63464b;
            }
            return null;
        }

        @Override // io.grpc.AbstractC10569c.InterfaceC10573d
        /* renamed from: b */
        public InterfaceC10573d mo30276b(Object obj, Object obj2, int i, int i2) {
            int hashCode = this.f63463a.hashCode();
            if (hashCode != i) {
                return C10571b.m30281c(new C10572c(obj, obj2), i, this, hashCode, i2);
            }
            if (this.f63463a == obj) {
                return new C10572c(obj, obj2);
            }
            return new C10570a(this.f63463a, this.f63464b, obj, obj2);
        }

        @Override // io.grpc.AbstractC10569c.InterfaceC10573d
        public int size() {
            return 1;
        }

        public String toString() {
            return String.format("Leaf(key=%s value=%s)", this.f63463a, this.f63464b);
        }
    }

    /* renamed from: io.grpc.c$d */
    /* loaded from: classes5.dex */
    public interface InterfaceC10573d {
        /* renamed from: a */
        Object mo30277a(Object obj, int i, int i2);

        /* renamed from: b */
        InterfaceC10573d mo30276b(Object obj, Object obj2, int i, int i2);

        int size();
    }

    /* renamed from: a */
    public static Object m30284a(InterfaceC10573d interfaceC10573d, Object obj) {
        if (interfaceC10573d == null) {
            return null;
        }
        return interfaceC10573d.mo30277a(obj, obj.hashCode(), 0);
    }

    /* renamed from: b */
    public static InterfaceC10573d m30283b(InterfaceC10573d interfaceC10573d, Object obj, Object obj2) {
        if (interfaceC10573d == null) {
            return new C10572c(obj, obj2);
        }
        return interfaceC10573d.mo30276b(obj, obj2, obj.hashCode(), 0);
    }
}
