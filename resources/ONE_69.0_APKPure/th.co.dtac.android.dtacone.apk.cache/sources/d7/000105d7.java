package p000;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* renamed from: pX */
/* loaded from: classes.dex */
public class C13094pX {

    /* renamed from: a */
    public final List f76831a;

    /* renamed from: pX$a */
    /* loaded from: classes.dex */
    public class C13095a implements Comparator {
        public C13095a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(String str, String str2) {
            int i = 0;
            for (InterfaceC1451UY interfaceC1451UY : C13094pX.this.f76831a) {
                Comparable mo26093a = interfaceC1451UY.mo26093a(str2);
                Comparable mo26093a2 = interfaceC1451UY.mo26093a(str);
                if (mo26093a != null && mo26093a2 != null) {
                    i += mo26093a.compareTo(mo26093a2);
                }
            }
            if (i == 0) {
                return str2.compareTo(str);
            }
            return i;
        }
    }

    public C13094pX(InterfaceC1451UY... interfaceC1451UYArr) {
        this.f76831a = Arrays.asList(interfaceC1451UYArr);
    }

    /* renamed from: b */
    public void m23844b(String[] strArr) {
        Arrays.sort(strArr, new C13095a());
    }
}