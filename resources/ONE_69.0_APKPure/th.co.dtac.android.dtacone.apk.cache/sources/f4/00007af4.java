package ch.qos.logback.core.status;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class StatusBase implements Status {

    /* renamed from: g */
    public static final List f40124g = new ArrayList(0);

    /* renamed from: a */
    public int f40125a;

    /* renamed from: b */
    public final String f40126b;

    /* renamed from: c */
    public final Object f40127c;

    /* renamed from: d */
    public List f40128d;

    /* renamed from: e */
    public Throwable f40129e;

    /* renamed from: f */
    public long f40130f;

    public StatusBase(int i, String str, Object obj) {
        this(i, str, obj, null);
    }

    @Override // ch.qos.logback.core.status.Status
    public synchronized void add(Status status) {
        try {
            if (status == null) {
                throw new NullPointerException("Null values are not valid Status.");
            }
            if (this.f40128d == null) {
                this.f40128d = new ArrayList();
            }
            this.f40128d.add(status);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            StatusBase statusBase = (StatusBase) obj;
            if (this.f40125a != statusBase.f40125a) {
                return false;
            }
            String str = this.f40126b;
            String str2 = statusBase.f40126b;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // ch.qos.logback.core.status.Status
    public Long getDate() {
        return Long.valueOf(this.f40130f);
    }

    @Override // ch.qos.logback.core.status.Status
    public synchronized int getEffectiveLevel() {
        int i;
        i = this.f40125a;
        Iterator<Status> it = iterator();
        while (it.hasNext()) {
            int effectiveLevel = it.next().getEffectiveLevel();
            if (effectiveLevel > i) {
                i = effectiveLevel;
            }
        }
        return i;
    }

    @Override // ch.qos.logback.core.status.Status
    public int getLevel() {
        return this.f40125a;
    }

    @Override // ch.qos.logback.core.status.Status
    public String getMessage() {
        return this.f40126b;
    }

    @Override // ch.qos.logback.core.status.Status
    public Object getOrigin() {
        return this.f40127c;
    }

    @Override // ch.qos.logback.core.status.Status
    public Throwable getThrowable() {
        return this.f40129e;
    }

    @Override // ch.qos.logback.core.status.Status
    public synchronized boolean hasChildren() {
        boolean z;
        List list = this.f40128d;
        if (list != null) {
            z = list.size() > 0;
        }
        return z;
    }

    public int hashCode() {
        int i = (this.f40125a + 31) * 31;
        String str = this.f40126b;
        return i + (str == null ? 0 : str.hashCode());
    }

    @Override // ch.qos.logback.core.status.Status
    public synchronized Iterator<Status> iterator() {
        List list = this.f40128d;
        if (list != null) {
            return list.iterator();
        }
        return f40124g.iterator();
    }

    @Override // ch.qos.logback.core.status.Status
    public synchronized boolean remove(Status status) {
        List list = this.f40128d;
        if (list == null) {
            return false;
        }
        return list.remove(status);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r3.getEffectiveLevel()
            if (r1 == 0) goto L1b
            r2 = 1
            if (r1 == r2) goto L18
            r2 = 2
            if (r1 == r2) goto L12
            goto L1e
        L12:
            java.lang.String r1 = "ERROR"
        L14:
            r0.append(r1)
            goto L1e
        L18:
            java.lang.String r1 = "WARN"
            goto L14
        L1b:
            java.lang.String r1 = "INFO"
            goto L14
        L1e:
            java.lang.Object r1 = r3.f40127c
            if (r1 == 0) goto L31
            java.lang.String r1 = " in "
            r0.append(r1)
            java.lang.Object r1 = r3.f40127c
            r0.append(r1)
            java.lang.String r1 = " -"
            r0.append(r1)
        L31:
            java.lang.String r1 = " "
            r0.append(r1)
            java.lang.String r2 = r3.f40126b
            r0.append(r2)
            java.lang.Throwable r2 = r3.f40129e
            if (r2 == 0) goto L47
            r0.append(r1)
            java.lang.Throwable r1 = r3.f40129e
            r0.append(r1)
        L47:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.qos.logback.core.status.StatusBase.toString():java.lang.String");
    }

    public StatusBase(int i, String str, Object obj, Throwable th2) {
        this.f40125a = i;
        this.f40126b = str;
        this.f40127c = obj;
        this.f40129e = th2;
        this.f40130f = System.currentTimeMillis();
    }
}