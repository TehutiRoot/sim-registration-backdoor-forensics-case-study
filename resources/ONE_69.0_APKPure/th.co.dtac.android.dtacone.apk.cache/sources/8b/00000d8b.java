package p000;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* renamed from: OH1 */
/* loaded from: classes4.dex */
public final class OH1 {

    /* renamed from: a */
    public final SharedPreferences f4413a;

    /* renamed from: b */
    public final String f4414b;

    /* renamed from: c */
    public final String f4415c;

    /* renamed from: e */
    public final Executor f4417e;

    /* renamed from: d */
    public final ArrayDeque f4416d = new ArrayDeque();

    /* renamed from: f */
    public boolean f4418f = false;

    public OH1(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f4413a = sharedPreferences;
        this.f4414b = str;
        this.f4415c = str2;
        this.f4417e = executor;
    }

    /* renamed from: a */
    public static /* synthetic */ void m67131a(OH1 oh1) {
        oh1.m67123i();
    }

    /* renamed from: d */
    public static OH1 m67128d(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        OH1 oh1 = new OH1(sharedPreferences, str, str2, executor);
        oh1.m67127e();
        return oh1;
    }

    /* renamed from: b */
    public boolean m67130b(String str) {
        boolean m67129c;
        if (!TextUtils.isEmpty(str) && !str.contains(this.f4415c)) {
            synchronized (this.f4416d) {
                m67129c = m67129c(this.f4416d.add(str));
            }
            return m67129c;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean m67129c(boolean z) {
        if (z && !this.f4418f) {
            m67122j();
        }
        return z;
    }

    /* renamed from: e */
    public final void m67127e() {
        synchronized (this.f4416d) {
            try {
                this.f4416d.clear();
                String string = this.f4413a.getString(this.f4414b, "");
                if (!TextUtils.isEmpty(string) && string.contains(this.f4415c)) {
                    String[] split = string.split(this.f4415c, -1);
                    int length = split.length;
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            this.f4416d.add(str);
                        }
                    }
                }
            } finally {
            }
        }
    }

    /* renamed from: f */
    public String m67126f() {
        String str;
        synchronized (this.f4416d) {
            str = (String) this.f4416d.peek();
        }
        return str;
    }

    /* renamed from: g */
    public boolean m67125g(Object obj) {
        boolean m67129c;
        synchronized (this.f4416d) {
            m67129c = m67129c(this.f4416d.remove(obj));
        }
        return m67129c;
    }

    /* renamed from: h */
    public String m67124h() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f4416d.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append(this.f4415c);
        }
        return sb.toString();
    }

    /* renamed from: i */
    public final void m67123i() {
        synchronized (this.f4416d) {
            this.f4413a.edit().putString(this.f4414b, m67124h()).commit();
        }
    }

    /* renamed from: j */
    public final void m67122j() {
        this.f4417e.execute(new Runnable() { // from class: NH1
            @Override // java.lang.Runnable
            public final void run() {
                OH1.m67131a(OH1.this);
            }
        });
    }
}