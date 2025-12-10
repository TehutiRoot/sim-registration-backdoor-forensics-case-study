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

/* renamed from: K70 */
/* loaded from: classes4.dex */
public class K70 {

    /* renamed from: a */
    public final SharedPreferences f3220a;

    public K70(Context context, String str) {
        this.f3220a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    /* renamed from: a */
    public final synchronized void m67756a() {
        try {
            long j = this.f3220a.getLong("fire-count", 0L);
            String str = "";
            String str2 = null;
            for (Map.Entry<String, ?> entry : this.f3220a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str3 : (Set) entry.getValue()) {
                        if (str2 != null && str2.compareTo(str3) <= 0) {
                        }
                        str = entry.getKey();
                        str2 = str3;
                    }
                }
            }
            HashSet hashSet = new HashSet(this.f3220a.getStringSet(str, new HashSet()));
            hashSet.remove(str2);
            this.f3220a.edit().putStringSet(str, hashSet).putLong("fire-count", j - 1).commit();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: b */
    public synchronized void m67755b() {
        try {
            SharedPreferences.Editor edit = this.f3220a.edit();
            int i = 0;
            for (Map.Entry<String, ?> entry : this.f3220a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    String m67753d = m67753d(System.currentTimeMillis());
                    String key = entry.getKey();
                    if (((Set) entry.getValue()).contains(m67753d)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(m67753d);
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
    public synchronized List m67754c() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : this.f3220a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(m67753d(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(HeartBeatResult.create(entry.getKey(), new ArrayList(hashSet)));
                    }
                }
            }
            m67745l(System.currentTimeMillis());
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    /* renamed from: d */
    public final synchronized String m67753d(long j) {
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
    public final synchronized String m67752e(String str) {
        for (Map.Entry<String, ?> entry : this.f3220a.getAll().entrySet()) {
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
    public synchronized boolean m67751f(long j, long j2) {
        return m67753d(j).equals(m67753d(j2));
    }

    /* renamed from: g */
    public synchronized void m67750g() {
        String m67753d = m67753d(System.currentTimeMillis());
        this.f3220a.edit().putString("last-used-date", m67753d).commit();
        m67749h(m67753d);
    }

    /* renamed from: h */
    public final synchronized void m67749h(String str) {
        try {
            String m67752e = m67752e(str);
            if (m67752e == null) {
                return;
            }
            HashSet hashSet = new HashSet(this.f3220a.getStringSet(m67752e, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                this.f3220a.edit().remove(m67752e).commit();
            } else {
                this.f3220a.edit().putStringSet(m67752e, hashSet).commit();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: i */
    public synchronized boolean m67748i(long j) {
        return m67747j("fire-global", j);
    }

    /* renamed from: j */
    public synchronized boolean m67747j(String str, long j) {
        if (this.f3220a.contains(str)) {
            if (!m67751f(this.f3220a.getLong(str, -1L), j)) {
                this.f3220a.edit().putLong(str, j).commit();
                return true;
            }
            return false;
        }
        this.f3220a.edit().putLong(str, j).commit();
        return true;
    }

    /* renamed from: k */
    public synchronized void m67746k(long j, String str) {
        String m67753d = m67753d(j);
        if (this.f3220a.getString("last-used-date", "").equals(m67753d)) {
            String m67752e = m67752e(m67753d);
            if (m67752e == null) {
                return;
            }
            if (m67752e.equals(str)) {
                return;
            }
            m67744m(str, m67753d);
            return;
        }
        long j2 = this.f3220a.getLong("fire-count", 0L);
        if (j2 + 1 == 30) {
            m67756a();
            j2 = this.f3220a.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f3220a.getStringSet(str, new HashSet()));
        hashSet.add(m67753d);
        this.f3220a.edit().putStringSet(str, hashSet).putLong("fire-count", j2 + 1).putString("last-used-date", m67753d).commit();
    }

    /* renamed from: l */
    public synchronized void m67745l(long j) {
        this.f3220a.edit().putLong("fire-global", j).commit();
    }

    /* renamed from: m */
    public final synchronized void m67744m(String str, String str2) {
        m67749h(str2);
        HashSet hashSet = new HashSet(this.f3220a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f3220a.edit().putStringSet(str, hashSet).commit();
    }
}