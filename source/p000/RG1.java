package p000;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* renamed from: RG1 */
/* loaded from: classes4.dex */
public final class RG1 {

    /* renamed from: a */
    public final SharedPreferences f5306a;

    /* renamed from: b */
    public final String f5307b;

    /* renamed from: c */
    public final String f5308c;

    /* renamed from: e */
    public final Executor f5310e;

    /* renamed from: d */
    public final ArrayDeque f5309d = new ArrayDeque();

    /* renamed from: f */
    public boolean f5311f = false;

    public RG1(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f5306a = sharedPreferences;
        this.f5307b = str;
        this.f5308c = str2;
        this.f5310e = executor;
    }

    /* renamed from: a */
    public static /* synthetic */ void m66477a(RG1 rg1) {
        rg1.m66469i();
    }

    /* renamed from: d */
    public static RG1 m66474d(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        RG1 rg1 = new RG1(sharedPreferences, str, str2, executor);
        rg1.m66473e();
        return rg1;
    }

    /* renamed from: b */
    public boolean m66476b(String str) {
        boolean m66475c;
        if (!TextUtils.isEmpty(str) && !str.contains(this.f5308c)) {
            synchronized (this.f5309d) {
                m66475c = m66475c(this.f5309d.add(str));
            }
            return m66475c;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean m66475c(boolean z) {
        if (z && !this.f5311f) {
            m66468j();
        }
        return z;
    }

    /* renamed from: e */
    public final void m66473e() {
        synchronized (this.f5309d) {
            try {
                this.f5309d.clear();
                String string = this.f5306a.getString(this.f5307b, "");
                if (!TextUtils.isEmpty(string) && string.contains(this.f5308c)) {
                    String[] split = string.split(this.f5308c, -1);
                    int length = split.length;
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            this.f5309d.add(str);
                        }
                    }
                }
            } finally {
            }
        }
    }

    /* renamed from: f */
    public String m66472f() {
        String str;
        synchronized (this.f5309d) {
            str = (String) this.f5309d.peek();
        }
        return str;
    }

    /* renamed from: g */
    public boolean m66471g(Object obj) {
        boolean m66475c;
        synchronized (this.f5309d) {
            m66475c = m66475c(this.f5309d.remove(obj));
        }
        return m66475c;
    }

    /* renamed from: h */
    public String m66470h() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f5309d.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append(this.f5308c);
        }
        return sb.toString();
    }

    /* renamed from: i */
    public final void m66469i() {
        synchronized (this.f5309d) {
            this.f5306a.edit().putString(this.f5307b, m66470h()).commit();
        }
    }

    /* renamed from: j */
    public final void m66468j() {
        this.f5310e.execute(new Runnable() { // from class: QG1
            @Override // java.lang.Runnable
            public final void run() {
                RG1.m66477a(RG1.this);
            }
        });
    }
}
