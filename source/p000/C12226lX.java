package p000;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* renamed from: lX */
/* loaded from: classes.dex */
public class C12226lX {

    /* renamed from: a */
    public final List f71644a;

    /* renamed from: lX$a */
    /* loaded from: classes.dex */
    public class C12227a implements Comparator {
        public C12227a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(String str, String str2) {
            int i = 0;
            for (InterfaceC1185QY interfaceC1185QY : C12226lX.this.f71644a) {
                Comparable mo30618a = interfaceC1185QY.mo30618a(str2);
                Comparable mo30618a2 = interfaceC1185QY.mo30618a(str);
                if (mo30618a != null && mo30618a2 != null) {
                    i += mo30618a.compareTo(mo30618a2);
                }
            }
            if (i == 0) {
                return str2.compareTo(str);
            }
            return i;
        }
    }

    public C12226lX(InterfaceC1185QY... interfaceC1185QYArr) {
        this.f71644a = Arrays.asList(interfaceC1185QYArr);
    }

    /* renamed from: b */
    public void m26463b(String[] strArr) {
        Arrays.sort(strArr, new C12227a());
    }
}
