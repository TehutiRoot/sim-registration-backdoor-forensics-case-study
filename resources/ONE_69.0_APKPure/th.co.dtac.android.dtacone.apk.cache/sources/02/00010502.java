package org.joda.time.p045tz;

import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.DateTimeZone;

/* renamed from: org.joda.time.tz.ZoneInfoProvider */
/* loaded from: classes5.dex */
public class ZoneInfoProvider implements Provider {

    /* renamed from: a */
    public final File f76484a;

    /* renamed from: b */
    public final String f76485b;

    /* renamed from: c */
    public final ClassLoader f76486c;

    /* renamed from: d */
    public final Map f76487d;

    /* renamed from: e */
    public final Set f76488e;

    public ZoneInfoProvider(File file) throws IOException {
        if (file != null) {
            if (file.exists()) {
                if (file.isDirectory()) {
                    this.f76484a = file;
                    this.f76485b = null;
                    this.f76486c = null;
                    Map m23943b = m23943b(m23942c("ZoneInfoMap"));
                    this.f76487d = m23943b;
                    this.f76488e = Collections.unmodifiableSortedSet(new TreeSet(m23943b.keySet()));
                    return;
                }
                throw new IOException("File doesn't refer to a directory: " + file);
            }
            throw new IOException("File directory doesn't exist: " + file);
        }
        throw new IllegalArgumentException("No file directory provided");
    }

    /* renamed from: b */
    public static Map m23943b(InputStream inputStream) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        try {
            m23941d(dataInputStream, concurrentHashMap);
            concurrentHashMap.put("UTC", new SoftReference(DateTimeZone.UTC));
            return concurrentHashMap;
        } finally {
            try {
                dataInputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: d */
    public static void m23941d(DataInputStream dataInputStream, Map map) {
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        String[] strArr = new String[readUnsignedShort];
        for (int i = 0; i < readUnsignedShort; i++) {
            strArr[i] = dataInputStream.readUTF().intern();
        }
        int readUnsignedShort2 = dataInputStream.readUnsignedShort();
        for (int i2 = 0; i2 < readUnsignedShort2; i2++) {
            try {
                map.put(strArr[dataInputStream.readUnsignedShort()], strArr[dataInputStream.readUnsignedShort()]);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new IOException("Corrupt zone info map");
            }
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x001a: MOVE  (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:9:0x001a */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0032 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final org.joda.time.DateTimeZone m23944a(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            java.io.InputStream r1 = r5.m23942c(r6)     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L20
            org.joda.time.DateTimeZone r2 = org.joda.time.p045tz.DateTimeZoneBuilder.readFrom(r1, r6)     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1c
            java.util.Map r3 = r5.f76487d     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1c
            java.lang.ref.SoftReference r4 = new java.lang.ref.SoftReference     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1c
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1c
            r3.put(r6, r4)     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1c
            if (r1 == 0) goto L18
            r1.close()     // Catch: java.io.IOException -> L18
        L18:
            return r2
        L19:
            r6 = move-exception
            r0 = r1
            goto L30
        L1c:
            r2 = move-exception
            goto L22
        L1e:
            r6 = move-exception
            goto L30
        L20:
            r2 = move-exception
            r1 = r0
        L22:
            r5.uncaughtException(r2)     // Catch: java.lang.Throwable -> L19
            java.util.Map r2 = r5.f76487d     // Catch: java.lang.Throwable -> L19
            r2.remove(r6)     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L2f
            r1.close()     // Catch: java.io.IOException -> L2f
        L2f:
            return r0
        L30:
            if (r0 == 0) goto L35
            r0.close()     // Catch: java.io.IOException -> L35
        L35:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.p045tz.ZoneInfoProvider.m23944a(java.lang.String):org.joda.time.DateTimeZone");
    }

    /* renamed from: c */
    public final InputStream m23942c(String str) {
        InputStream systemResourceAsStream;
        String str2;
        if (this.f76484a != null) {
            return new FileInputStream(new File(this.f76484a, str));
        }
        String concat = this.f76485b.concat(str);
        ClassLoader classLoader = this.f76486c;
        if (classLoader != null) {
            systemResourceAsStream = classLoader.getResourceAsStream(concat);
        } else {
            systemResourceAsStream = ClassLoader.getSystemResourceAsStream(concat);
        }
        if (systemResourceAsStream == null) {
            StringBuilder sb = new StringBuilder(40);
            sb.append("Resource not found: \"");
            sb.append(concat);
            sb.append("\" ClassLoader: ");
            ClassLoader classLoader2 = this.f76486c;
            if (classLoader2 != null) {
                str2 = classLoader2.toString();
            } else {
                str2 = "system";
            }
            sb.append(str2);
            throw new IOException(sb.toString());
        }
        return systemResourceAsStream;
    }

    @Override // org.joda.time.p045tz.Provider
    public Set<String> getAvailableIDs() {
        return this.f76488e;
    }

    @Override // org.joda.time.p045tz.Provider
    public DateTimeZone getZone(String str) {
        Object obj;
        if (str == null || (obj = this.f76487d.get(str)) == null) {
            return null;
        }
        if (obj instanceof SoftReference) {
            DateTimeZone dateTimeZone = (DateTimeZone) ((SoftReference) obj).get();
            if (dateTimeZone != null) {
                return dateTimeZone;
            }
            return m23944a(str);
        } else if (str.equals(obj)) {
            return m23944a(str);
        } else {
            return getZone((String) obj);
        }
    }

    public void uncaughtException(Exception exc) {
        exc.printStackTrace();
    }

    public ZoneInfoProvider(String str) throws IOException {
        this(str, null, false);
    }

    public ZoneInfoProvider(String str, ClassLoader classLoader) throws IOException {
        this(str, classLoader, true);
    }

    public ZoneInfoProvider(String str, ClassLoader classLoader, boolean z) {
        if (str != null) {
            if (!str.endsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
                str = str + '/';
            }
            this.f76484a = null;
            this.f76485b = str;
            if (classLoader == null && !z) {
                classLoader = getClass().getClassLoader();
            }
            this.f76486c = classLoader;
            Map m23943b = m23943b(m23942c("ZoneInfoMap"));
            this.f76487d = m23943b;
            this.f76488e = Collections.unmodifiableSortedSet(new TreeSet(m23943b.keySet()));
            return;
        }
        throw new IllegalArgumentException("No resource path provided");
    }
}