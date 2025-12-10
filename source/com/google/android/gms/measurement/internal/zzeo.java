package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import org.apache.commons.cli.HelpFormatter;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: classes3.dex */
public final class zzeo extends AbstractC20285hs2 {

    /* renamed from: b */
    public char f48303b;

    /* renamed from: c */
    public long f48304c;

    /* renamed from: d */
    public String f48305d;

    /* renamed from: e */
    public final zzem f48306e;

    /* renamed from: f */
    public final zzem f48307f;

    /* renamed from: g */
    public final zzem f48308g;

    /* renamed from: h */
    public final zzem f48309h;

    /* renamed from: i */
    public final zzem f48310i;

    /* renamed from: j */
    public final zzem f48311j;

    /* renamed from: k */
    public final zzem f48312k;

    /* renamed from: l */
    public final zzem f48313l;

    /* renamed from: m */
    public final zzem f48314m;

    public zzeo(zzfy zzfyVar) {
        super(zzfyVar);
        this.f48303b = (char) 0;
        this.f48304c = -1L;
        this.f48306e = new zzem(this, 6, false, false);
        this.f48307f = new zzem(this, 6, true, false);
        this.f48308g = new zzem(this, 6, false, true);
        this.f48309h = new zzem(this, 5, false, false);
        this.f48310i = new zzem(this, 5, true, false);
        this.f48311j = new zzem(this, 5, false, true);
        this.f48312k = new zzem(this, 4, false, false);
        this.f48313l = new zzem(this, 3, false, false);
        this.f48314m = new zzem(this, 2, false, false);
    }

    /* renamed from: d */
    public static String m46318d(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String m46317e = m46317e(z, obj);
        String m46317e2 = m46317e(z, obj2);
        String m46317e3 = m46317e(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(m46317e)) {
            sb.append(str2);
            sb.append(m46317e);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(m46317e2)) {
            sb.append(str2);
            sb.append(m46317e2);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(m46317e3)) {
            sb.append(str3);
            sb.append(m46317e3);
        }
        return sb.toString();
    }

    /* renamed from: e */
    public static String m46317e(boolean z, Object obj) {
        String str;
        String th2;
        String className;
        String str2 = "";
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i = 0;
        if (obj instanceof Long) {
            if (!z) {
                return obj.toString();
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return obj.toString();
            }
            if (obj.toString().charAt(0) == '-') {
                str2 = HelpFormatter.DEFAULT_OPT_PREFIX;
            }
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            long round = Math.round(Math.pow(10.0d, valueOf.length() - 1));
            long round2 = Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
            return str2 + round + "..." + str2 + round2;
        } else if (obj instanceof Boolean) {
            return obj.toString();
        } else {
            if (obj instanceof Throwable) {
                Throwable th3 = (Throwable) obj;
                if (z) {
                    th2 = th3.getClass().getName();
                } else {
                    th2 = th3.toString();
                }
                StringBuilder sb = new StringBuilder(th2);
                String m46314h = m46314h(zzfy.class.getCanonicalName());
                StackTraceElement[] stackTrace = th3.getStackTrace();
                int length = stackTrace.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i];
                    if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && m46314h(className).equals(m46314h)) {
                        sb.append(": ");
                        sb.append(stackTraceElement);
                        break;
                    }
                    i++;
                }
                return sb.toString();
            } else if (obj instanceof C17552El2) {
                str = ((C17552El2) obj).f1385a;
                return str;
            } else if (z) {
                return HelpFormatter.DEFAULT_OPT_PREFIX;
            } else {
                return obj.toString();
            }
        }
    }

    /* renamed from: h */
    public static String m46314h(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return str;
        }
        return str.substring(0, lastIndexOf);
    }

    public static Object zzn(String str) {
        if (str == null) {
            return null;
        }
        return new C17552El2(str);
    }

    public final zzem zzc() {
        return this.f48313l;
    }

    public final zzem zzd() {
        return this.f48306e;
    }

    public final zzem zze() {
        return this.f48308g;
    }

    @Override // p000.AbstractC20285hs2
    public final boolean zzf() {
        return false;
    }

    public final zzem zzh() {
        return this.f48307f;
    }

    public final zzem zzi() {
        return this.f48312k;
    }

    public final zzem zzj() {
        return this.f48314m;
    }

    public final zzem zzk() {
        return this.f48309h;
    }

    public final zzem zzl() {
        return this.f48311j;
    }

    public final zzem zzm() {
        return this.f48310i;
    }

    @VisibleForTesting
    @EnsuresNonNull({"logTagDoNotUseDirectly"})
    public final String zzq() {
        String str;
        synchronized (this) {
            try {
                if (this.f48305d == null) {
                    if (this.zzs.zzy() != null) {
                        this.f48305d = this.zzs.zzy();
                    } else {
                        this.f48305d = this.zzs.zzf().m46356e();
                    }
                }
                Preconditions.checkNotNull(this.f48305d);
                str = this.f48305d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    public final void zzt(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        int i2;
        if (!z && Log.isLoggable(zzq(), i)) {
            Log.println(i, zzq(), m46318d(false, str, obj, obj2, obj3));
        }
        if (!z2 && i >= 5) {
            Preconditions.checkNotNull(str);
            zzfv m46269j = this.zzs.m46269j();
            if (m46269j == null) {
                Log.println(6, zzq(), "Scheduler not set. Not logging error/warn");
            } else if (!m46269j.m30739a()) {
                Log.println(6, zzq(), "Scheduler not initialized. Not logging error/warn");
            } else {
                if (i >= 9) {
                    i2 = 8;
                } else {
                    i2 = i;
                }
                m46269j.zzp(new RunnableC6722c(this, i2, str, obj, obj2, obj3));
            }
        }
    }
}
