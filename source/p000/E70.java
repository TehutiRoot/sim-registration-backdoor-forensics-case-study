package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.google.firebase.heartbeatinfo.HeartBeatResult;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: E70 */
/* loaded from: classes4.dex */
public class E70 {

    /* renamed from: a */
    public final SharedPreferences f1213a;

    public E70(Context context, String str) {
        this.f1213a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    /* renamed from: a */
    public final synchronized void m68543a() {
        try {
            long j = this.f1213a.getLong("fire-count", 0L);
            String str = "";
            String str2 = null;
            for (Map.Entry<String, ?> entry : this.f1213a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str3 : (Set) entry.getValue()) {
                        if (str2 != null && str2.compareTo(str3) <= 0) {
                        }
                        str = entry.getKey();
                        str2 = str3;
                    }
                }
            }
            HashSet hashSet = new HashSet(this.f1213a.getStringSet(str, new HashSet()));
            hashSet.remove(str2);
            this.f1213a.edit().putStringSet(str, hashSet).putLong("fire-count", j - 1).commit();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: b */
    public synchronized void m68542b() {
        try {
            SharedPreferences.Editor edit = this.f1213a.edit();
            int i = 0;
            for (Map.Entry<String, ?> entry : this.f1213a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    String m68540d = m68540d(System.currentTimeMillis());
                    String key = entry.getKey();
                    if (((Set) entry.getValue()).contains(m68540d)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(m68540d);
                        i++;
                        edit.putStringSet(key, hashSet);
                    } else {
                        edit.remove(key);
                    }
                }
            }
            if (i == 0) {
                edit.remove("fire-count");
            } else {
                edit.putLong("fire-count", i);
            }
            edit.commit();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: c */
    public synchronized List m68541c() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : this.f1213a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(m68540d(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(HeartBeatResult.create(entry.getKey(), new ArrayList(hashSet)));
                    }
                }
            }
            m68532l(System.currentTimeMillis());
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    /* renamed from: d */
    public final synchronized String m68540d(long j) {
        Instant instant;
        ZoneOffset zoneOffset;
        OffsetDateTime atOffset;
        LocalDateTime localDateTime;
        DateTimeFormatter dateTimeFormatter;
        String format;
        if (Build.VERSION.SDK_INT >= 26) {
            instant = new Date(j).toInstant();
            zoneOffset = ZoneOffset.UTC;
            atOffset = instant.atOffset(zoneOffset);
            localDateTime = atOffset.toLocalDateTime();
            dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
            format = localDateTime.format(dateTimeFormatter);
            return format;
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
    }

    /* renamed from: e */
    public final synchronized String m68539e(String str) {
        for (Map.Entry<String, ?> entry : this.f1213a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                for (String str2 : (Set) entry.getValue()) {
                    if (str.equals(str2)) {
                        return entry.getKey();
                    }
                }
                continue;
            }
        }
        return null;
    }

    /* renamed from: f */
    public synchronized boolean m68538f(long j, long j2) {
        return m68540d(j).equals(m68540d(j2));
    }

    /* renamed from: g */
    public synchronized void m68537g() {
        String m68540d = m68540d(System.currentTimeMillis());
        this.f1213a.edit().putString("last-used-date", m68540d).commit();
        m68536h(m68540d);
    }

    /* renamed from: h */
    public final synchronized void m68536h(String str) {
        try {
            String m68539e = m68539e(str);
            if (m68539e == null) {
                return;
            }
            HashSet hashSet = new HashSet(this.f1213a.getStringSet(m68539e, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                this.f1213a.edit().remove(m68539e).commit();
            } else {
                this.f1213a.edit().putStringSet(m68539e, hashSet).commit();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: i */
    public synchronized boolean m68535i(long j) {
        return m68534j("fire-global", j);
    }

    /* renamed from: j */
    public synchronized boolean m68534j(String str, long j) {
        if (this.f1213a.contains(str)) {
            if (!m68538f(this.f1213a.getLong(str, -1L), j)) {
                this.f1213a.edit().putLong(str, j).commit();
                return true;
            }
            return false;
        }
        this.f1213a.edit().putLong(str, j).commit();
        return true;
    }

    /* renamed from: k */
    public synchronized void m68533k(long j, String str) {
        String m68540d = m68540d(j);
        if (this.f1213a.getString("last-used-date", "").equals(m68540d)) {
            String m68539e = m68539e(m68540d);
            if (m68539e == null) {
                return;
            }
            if (m68539e.equals(str)) {
                return;
            }
            m68531m(str, m68540d);
            return;
        }
        long j2 = this.f1213a.getLong("fire-count", 0L);
        if (j2 + 1 == 30) {
            m68543a();
            j2 = this.f1213a.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f1213a.getStringSet(str, new HashSet()));
        hashSet.add(m68540d);
        this.f1213a.edit().putStringSet(str, hashSet).putLong("fire-count", j2 + 1).putString("last-used-date", m68540d).commit();
    }

    /* renamed from: l */
    public synchronized void m68532l(long j) {
        this.f1213a.edit().putLong("fire-global", j).commit();
    }

    /* renamed from: m */
    public final synchronized void m68531m(String str, String str2) {
        m68536h(str2);
        HashSet hashSet = new HashSet(this.f1213a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f1213a.edit().putStringSet(str, hashSet).commit();
    }
}
