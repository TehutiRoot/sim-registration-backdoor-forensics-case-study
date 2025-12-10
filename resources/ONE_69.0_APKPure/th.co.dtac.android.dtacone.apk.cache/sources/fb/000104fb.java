package org.joda.time.p045tz;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.cli.HelpFormatter;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.MutableDateTime;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

/* renamed from: org.joda.time.tz.ZoneInfoCompiler */
/* loaded from: classes5.dex */
public class ZoneInfoCompiler {

    /* renamed from: e */
    public static C13029a f76456e;

    /* renamed from: f */
    public static Chronology f76457f;

    /* renamed from: a */
    public Map f76458a = new HashMap();

    /* renamed from: b */
    public List f76459b = new ArrayList();

    /* renamed from: c */
    public List f76460c = new ArrayList();

    /* renamed from: d */
    public List f76461d = new ArrayList();

    /* renamed from: org.joda.time.tz.ZoneInfoCompiler$b */
    /* loaded from: classes5.dex */
    public static class C13030b {

        /* renamed from: a */
        public final String f76468a;

        /* renamed from: b */
        public final int f76469b;

        /* renamed from: c */
        public final int f76470c;

        /* renamed from: d */
        public final String f76471d;

        /* renamed from: e */
        public final C13029a f76472e;

        /* renamed from: f */
        public final int f76473f;

        /* renamed from: g */
        public final String f76474g;

        public C13030b(StringTokenizer stringTokenizer) {
            if (stringTokenizer.countTokens() >= 6) {
                this.f76468a = stringTokenizer.nextToken().intern();
                int m23960g = ZoneInfoCompiler.m23960g(stringTokenizer.nextToken(), 0);
                this.f76469b = m23960g;
                int m23960g2 = ZoneInfoCompiler.m23960g(stringTokenizer.nextToken(), m23960g);
                this.f76470c = m23960g2;
                if (m23960g2 >= m23960g) {
                    this.f76471d = ZoneInfoCompiler.m23962e(stringTokenizer.nextToken());
                    this.f76472e = new C13029a(stringTokenizer);
                    this.f76473f = ZoneInfoCompiler.m23961f(stringTokenizer.nextToken());
                    this.f76474g = ZoneInfoCompiler.m23962e(stringTokenizer.nextToken());
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException("Attempting to create a Rule from an incomplete tokenizer");
        }

        /* renamed from: a */
        public void m23952a(DateTimeZoneBuilder dateTimeZoneBuilder, String str) {
            this.f76472e.m23953b(dateTimeZoneBuilder, m23951b(str), this.f76473f, this.f76469b, this.f76470c);
        }

        /* renamed from: b */
        public final String m23951b(String str) {
            String str2;
            int indexOf = str.indexOf(47);
            if (indexOf > 0) {
                if (this.f76473f == 0) {
                    return str.substring(0, indexOf).intern();
                }
                return str.substring(indexOf + 1).intern();
            }
            int indexOf2 = str.indexOf("%s");
            if (indexOf2 < 0) {
                return str;
            }
            String substring = str.substring(0, indexOf2);
            String substring2 = str.substring(indexOf2 + 2);
            if (this.f76474g == null) {
                str2 = substring.concat(substring2);
            } else {
                str2 = substring + this.f76474g + substring2;
            }
            return str2.intern();
        }

        public String toString() {
            return "[Rule]\nName: " + this.f76468a + "\nFromYear: " + this.f76469b + "\nToYear: " + this.f76470c + "\nType: " + this.f76471d + "\n" + this.f76472e + "SaveMillis: " + this.f76473f + "\nLetterS: " + this.f76474g + "\n";
        }
    }

    /* renamed from: org.joda.time.tz.ZoneInfoCompiler$c */
    /* loaded from: classes5.dex */
    public static class C13031c {

        /* renamed from: a */
        public List f76475a;

        public C13031c(C13030b c13030b) {
            ArrayList arrayList = new ArrayList();
            this.f76475a = arrayList;
            arrayList.add(c13030b);
        }

        /* renamed from: a */
        public void m23950a(DateTimeZoneBuilder dateTimeZoneBuilder, String str) {
            for (int i = 0; i < this.f76475a.size(); i++) {
                ((C13030b) this.f76475a.get(i)).m23952a(dateTimeZoneBuilder, str);
            }
        }

        /* renamed from: b */
        public void m23949b(C13030b c13030b) {
            if (c13030b.f76468a.equals(((C13030b) this.f76475a.get(0)).f76468a)) {
                this.f76475a.add(c13030b);
                return;
            }
            throw new IllegalArgumentException("Rule name mismatch");
        }
    }

    /* renamed from: org.joda.time.tz.ZoneInfoCompiler$d */
    /* loaded from: classes5.dex */
    public static class C13032d {

        /* renamed from: a */
        public final String f76476a;

        /* renamed from: b */
        public final int f76477b;

        /* renamed from: c */
        public final String f76478c;

        /* renamed from: d */
        public final String f76479d;

        /* renamed from: e */
        public final int f76480e;

        /* renamed from: f */
        public final C13029a f76481f;

        /* renamed from: g */
        public C13032d f76482g;

        public C13032d(StringTokenizer stringTokenizer) {
            this(stringTokenizer.nextToken(), stringTokenizer);
        }

        /* renamed from: b */
        public static void m23947b(C13032d c13032d, DateTimeZoneBuilder dateTimeZoneBuilder, Map map) {
            while (c13032d != null) {
                dateTimeZoneBuilder.setStandardOffset(c13032d.f76477b);
                String str = c13032d.f76478c;
                if (str == null) {
                    dateTimeZoneBuilder.setFixedSavings(c13032d.f76479d, 0);
                } else {
                    try {
                        dateTimeZoneBuilder.setFixedSavings(c13032d.f76479d, ZoneInfoCompiler.m23961f(str));
                    } catch (Exception unused) {
                        C13031c c13031c = (C13031c) map.get(c13032d.f76478c);
                        if (c13031c != null) {
                            c13031c.m23950a(dateTimeZoneBuilder, c13032d.f76479d);
                        } else {
                            throw new IllegalArgumentException("Rules not found: " + c13032d.f76478c);
                        }
                    }
                }
                int i = c13032d.f76480e;
                if (i != Integer.MAX_VALUE) {
                    c13032d.f76481f.m23954a(dateTimeZoneBuilder, i);
                    c13032d = c13032d.f76482g;
                } else {
                    return;
                }
            }
        }

        /* renamed from: a */
        public void m23948a(DateTimeZoneBuilder dateTimeZoneBuilder, Map map) {
            m23947b(this, dateTimeZoneBuilder, map);
        }

        /* renamed from: c */
        public void m23946c(StringTokenizer stringTokenizer) {
            C13032d c13032d = this.f76482g;
            if (c13032d != null) {
                c13032d.m23946c(stringTokenizer);
            } else {
                this.f76482g = new C13032d(this.f76476a, stringTokenizer);
            }
        }

        public String toString() {
            String str = "[Zone]\nName: " + this.f76476a + "\nOffsetMillis: " + this.f76477b + "\nRules: " + this.f76478c + "\nFormat: " + this.f76479d + "\nUntilYear: " + this.f76480e + "\n" + this.f76481f;
            if (this.f76482g == null) {
                return str;
            }
            return str + "...\n" + this.f76482g.toString();
        }

        public C13032d(String str, StringTokenizer stringTokenizer) {
            int i;
            this.f76476a = str.intern();
            this.f76477b = ZoneInfoCompiler.m23961f(stringTokenizer.nextToken());
            this.f76478c = ZoneInfoCompiler.m23962e(stringTokenizer.nextToken());
            this.f76479d = stringTokenizer.nextToken().intern();
            C13029a m23965b = ZoneInfoCompiler.m23965b();
            if (stringTokenizer.hasMoreTokens()) {
                i = Integer.parseInt(stringTokenizer.nextToken());
                if (stringTokenizer.hasMoreTokens()) {
                    m23965b = new C13029a(stringTokenizer);
                }
            } else {
                i = Integer.MAX_VALUE;
            }
            this.f76480e = i;
            this.f76481f = m23965b;
        }
    }

    /* renamed from: a */
    public static Chronology m23966a() {
        if (f76457f == null) {
            f76457f = LenientChronology.getInstance(ISOChronology.getInstanceUTC());
        }
        return f76457f;
    }

    /* renamed from: b */
    public static C13029a m23965b() {
        if (f76456e == null) {
            f76456e = new C13029a();
        }
        return f76456e;
    }

    /* renamed from: c */
    public static int m23964c(String str) {
        DateTimeField dayOfWeek = ISOChronology.getInstanceUTC().dayOfWeek();
        return dayOfWeek.get(dayOfWeek.set(0L, str, Locale.ENGLISH));
    }

    /* renamed from: d */
    public static int m23963d(String str) {
        DateTimeField monthOfYear = ISOChronology.getInstanceUTC().monthOfYear();
        return monthOfYear.get(monthOfYear.set(0L, str, Locale.ENGLISH));
    }

    /* renamed from: e */
    public static String m23962e(String str) {
        if (str.equals(HelpFormatter.DEFAULT_OPT_PREFIX)) {
            return null;
        }
        return str;
    }

    /* renamed from: f */
    public static int m23961f(String str) {
        DateTimeFormatter hourMinuteSecondFraction = ISODateTimeFormat.hourMinuteSecondFraction();
        MutableDateTime mutableDateTime = new MutableDateTime(0L, m23966a());
        boolean startsWith = str.startsWith(HelpFormatter.DEFAULT_OPT_PREFIX);
        if (hourMinuteSecondFraction.parseInto(mutableDateTime, str, startsWith ? 1 : 0) != (~(startsWith ? 1 : 0))) {
            int millis = (int) mutableDateTime.getMillis();
            if (startsWith) {
                return -millis;
            }
            return millis;
        }
        throw new IllegalArgumentException(str);
    }

    /* renamed from: g */
    public static int m23960g(String str, int i) {
        String lowerCase = str.toLowerCase();
        if (!lowerCase.equals("minimum") && !lowerCase.equals("min")) {
            if (!lowerCase.equals("maximum") && !lowerCase.equals("max")) {
                if (lowerCase.equals("only")) {
                    return i;
                }
                return Integer.parseInt(lowerCase);
            }
            return Integer.MAX_VALUE;
        }
        return Integer.MIN_VALUE;
    }

    /* renamed from: h */
    public static char m23959h(char c) {
        if (c != 'G') {
            if (c != 'S') {
                if (c != 'U' && c != 'Z' && c != 'g') {
                    if (c != 's') {
                        if (c != 'u' && c != 'z') {
                            return 'w';
                        }
                    }
                }
            }
            return 's';
        }
        return AbstractJsonLexerKt.UNICODE_ESC;
    }

    /* renamed from: i */
    public static void m23958i() {
        PrintStream printStream = System.out;
        printStream.println("Usage: java org.joda.time.tz.ZoneInfoCompiler <options> <source files>");
        printStream.println("where possible options include:");
        printStream.println("  -src <directory>    Specify where to read source files");
        printStream.println("  -dst <directory>    Specify where to write generated files");
        printStream.println("  -verbose            Output verbosely (default false)");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a4, code lost:
        java.lang.System.out.println("*s* Error in " + r18.getID() + org.apache.commons.cli.HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + new org.joda.time.DateTime(r13, org.joda.time.chrono.ISOChronology.getInstanceUTC()) + ", nameKey=" + r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d5, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d6, code lost:
        r6 = org.joda.time.chrono.ISOChronology.getInstanceUTC().year().set(0, 2050);
        r3 = org.joda.time.chrono.ISOChronology.getInstanceUTC().year().set(0, 1850);
        r1 = r12.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f2, code lost:
        r1 = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f4, code lost:
        if (r1 < 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f6, code lost:
        r8 = r18.previousTransition(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00fc, code lost:
        if (r8 == r6) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0100, code lost:
        if (r8 >= r3) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0102, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0113, code lost:
        if ((((java.lang.Long) r12.get(r1)).longValue() - 1) == r8) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0115, code lost:
        java.lang.System.out.println("*r* Error in " + r18.getID() + org.apache.commons.cli.HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + new org.joda.time.DateTime(r8, org.joda.time.chrono.ISOChronology.getInstanceUTC()) + " != " + new org.joda.time.DateTime(r5, org.joda.time.chrono.ISOChronology.getInstanceUTC()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x014f, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0150, code lost:
        r6 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:?, code lost:
        return true;
     */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m23957j(java.lang.String r17, org.joda.time.DateTimeZone r18) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.p045tz.ZoneInfoCompiler.m23957j(java.lang.String, org.joda.time.DateTimeZone):boolean");
    }

    /* renamed from: l */
    public static void m23955l(DataOutputStream dataOutputStream, Map map) {
        HashMap hashMap = new HashMap(map.size());
        TreeMap treeMap = new TreeMap();
        short s = 0;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (!hashMap.containsKey(str)) {
                Short valueOf = Short.valueOf(s);
                hashMap.put(str, valueOf);
                treeMap.put(valueOf, str);
                s = (short) (s + 1);
                if (s == 0) {
                    throw new InternalError("Too many time zone ids");
                }
            }
            String id2 = ((DateTimeZone) entry.getValue()).getID();
            if (!hashMap.containsKey(id2)) {
                Short valueOf2 = Short.valueOf(s);
                hashMap.put(id2, valueOf2);
                treeMap.put(valueOf2, id2);
                s = (short) (s + 1);
                if (s == 0) {
                    throw new InternalError("Too many time zone ids");
                }
            }
        }
        dataOutputStream.writeShort(treeMap.size());
        for (String str2 : treeMap.values()) {
            dataOutputStream.writeUTF(str2);
        }
        dataOutputStream.writeShort(map.size());
        for (Map.Entry entry2 : map.entrySet()) {
            dataOutputStream.writeShort(((Short) hashMap.get((String) entry2.getKey())).shortValue());
            dataOutputStream.writeShort(((Short) hashMap.get(((DateTimeZone) entry2.getValue()).getID())).shortValue());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
        if ("-?".equals(r9[r3]) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
        m23958i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void main(java.lang.String[] r9) throws java.lang.Exception {
        /*
            int r0 = r9.length
            if (r0 != 0) goto L7
            m23958i()
            return
        L7:
            r0 = 0
            r1 = 0
            r2 = r0
            r3 = 0
            r4 = 0
        Lc:
            int r5 = r9.length
            r6 = 1
            if (r3 >= r5) goto L57
            java.lang.String r5 = "-src"
            r7 = r9[r3]     // Catch: java.lang.IndexOutOfBoundsException -> L53
            boolean r5 = r5.equals(r7)     // Catch: java.lang.IndexOutOfBoundsException -> L53
            if (r5 == 0) goto L24
            java.io.File r0 = new java.io.File     // Catch: java.lang.IndexOutOfBoundsException -> L53
            int r3 = r3 + 1
            r5 = r9[r3]     // Catch: java.lang.IndexOutOfBoundsException -> L53
            r0.<init>(r5)     // Catch: java.lang.IndexOutOfBoundsException -> L53
            goto L43
        L24:
            java.lang.String r5 = "-dst"
            r7 = r9[r3]     // Catch: java.lang.IndexOutOfBoundsException -> L53
            boolean r5 = r5.equals(r7)     // Catch: java.lang.IndexOutOfBoundsException -> L53
            if (r5 == 0) goto L38
            java.io.File r2 = new java.io.File     // Catch: java.lang.IndexOutOfBoundsException -> L53
            int r3 = r3 + 1
            r5 = r9[r3]     // Catch: java.lang.IndexOutOfBoundsException -> L53
            r2.<init>(r5)     // Catch: java.lang.IndexOutOfBoundsException -> L53
            goto L43
        L38:
            java.lang.String r5 = "-verbose"
            r7 = r9[r3]     // Catch: java.lang.IndexOutOfBoundsException -> L53
            boolean r5 = r5.equals(r7)     // Catch: java.lang.IndexOutOfBoundsException -> L53
            if (r5 == 0) goto L45
            r4 = 1
        L43:
            int r3 = r3 + r6
            goto Lc
        L45:
            java.lang.String r5 = "-?"
            r7 = r9[r3]     // Catch: java.lang.IndexOutOfBoundsException -> L53
            boolean r5 = r5.equals(r7)     // Catch: java.lang.IndexOutOfBoundsException -> L53
            if (r5 == 0) goto L57
            m23958i()     // Catch: java.lang.IndexOutOfBoundsException -> L53
            return
        L53:
            m23958i()
            return
        L57:
            int r5 = r9.length
            if (r3 < r5) goto L5e
            m23958i()
            return
        L5e:
            int r5 = r9.length
            int r5 = r5 - r3
            java.io.File[] r5 = new java.io.File[r5]
        L62:
            int r7 = r9.length
            if (r3 >= r7) goto L7a
            java.io.File r7 = new java.io.File
            if (r0 != 0) goto L6f
            r8 = r9[r3]
            r7.<init>(r8)
            goto L74
        L6f:
            r8 = r9[r3]
            r7.<init>(r0, r8)
        L74:
            r5[r1] = r7
            int r3 = r3 + 1
            int r1 = r1 + r6
            goto L62
        L7a:
            org.joda.time.p045tz.ZoneInfoLogger.set(r4)
            org.joda.time.tz.ZoneInfoCompiler r9 = new org.joda.time.tz.ZoneInfoCompiler
            r9.<init>()
            r9.compile(r2, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.p045tz.ZoneInfoCompiler.main(java.lang.String[]):void");
    }

    public Map<String, DateTimeZone> compile(File file, File[] fileArr) throws IOException {
        if (fileArr != null) {
            for (int i = 0; i < fileArr.length; i++) {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(fileArr[i]));
                parseDataFile(bufferedReader, "backward".equals(fileArr[i].getName()));
                bufferedReader.close();
            }
        }
        if (file != null) {
            if (!file.exists() && !file.mkdirs()) {
                throw new IOException("Destination directory doesn't exist and cannot be created: " + file);
            } else if (!file.isDirectory()) {
                throw new IOException("Destination is not a directory: " + file);
            }
        }
        TreeMap treeMap = new TreeMap();
        TreeMap treeMap2 = new TreeMap();
        System.out.println("Writing zoneinfo files");
        for (int i2 = 0; i2 < this.f76459b.size(); i2++) {
            C13032d c13032d = (C13032d) this.f76459b.get(i2);
            DateTimeZoneBuilder dateTimeZoneBuilder = new DateTimeZoneBuilder();
            c13032d.m23948a(dateTimeZoneBuilder, this.f76458a);
            DateTimeZone dateTimeZone = dateTimeZoneBuilder.toDateTimeZone(c13032d.f76476a, true);
            if (m23957j(dateTimeZone.getID(), dateTimeZone)) {
                treeMap.put(dateTimeZone.getID(), dateTimeZone);
                treeMap2.put(dateTimeZone.getID(), c13032d);
                if (file != null) {
                    m23956k(file, dateTimeZoneBuilder, dateTimeZone);
                }
            }
        }
        for (int i3 = 0; i3 < this.f76460c.size(); i3 += 2) {
            String str = (String) this.f76460c.get(i3);
            String str2 = (String) this.f76460c.get(i3 + 1);
            C13032d c13032d2 = (C13032d) treeMap2.get(str);
            if (c13032d2 == null) {
                PrintStream printStream = System.out;
                printStream.println("Cannot find source zone '" + str + "' to link alias '" + str2 + "' to");
            } else {
                DateTimeZoneBuilder dateTimeZoneBuilder2 = new DateTimeZoneBuilder();
                c13032d2.m23948a(dateTimeZoneBuilder2, this.f76458a);
                DateTimeZone dateTimeZone2 = dateTimeZoneBuilder2.toDateTimeZone(str2, true);
                if (m23957j(dateTimeZone2.getID(), dateTimeZone2)) {
                    treeMap.put(dateTimeZone2.getID(), dateTimeZone2);
                    if (file != null) {
                        m23956k(file, dateTimeZoneBuilder2, dateTimeZone2);
                    }
                }
                treeMap.put(dateTimeZone2.getID(), dateTimeZone2);
                if (ZoneInfoLogger.verbose()) {
                    PrintStream printStream2 = System.out;
                    printStream2.println("Good link: " + str2 + " -> " + str + " revived");
                }
            }
        }
        for (int i4 = 0; i4 < 2; i4++) {
            for (int i5 = 0; i5 < this.f76461d.size(); i5 += 2) {
                String str3 = (String) this.f76461d.get(i5);
                String str4 = (String) this.f76461d.get(i5 + 1);
                DateTimeZone dateTimeZone3 = (DateTimeZone) treeMap.get(str3);
                if (dateTimeZone3 == null) {
                    if (i4 > 0) {
                        PrintStream printStream3 = System.out;
                        printStream3.println("Cannot find time zone '" + str3 + "' to link alias '" + str4 + "' to");
                    }
                } else {
                    treeMap.put(str4, dateTimeZone3);
                    if (ZoneInfoLogger.verbose()) {
                        PrintStream printStream4 = System.out;
                        printStream4.println("Back link: " + str4 + " -> " + dateTimeZone3.getID());
                    }
                }
            }
        }
        if (file != null) {
            System.out.println("Writing ZoneInfoMap");
            File file2 = new File(file, "ZoneInfoMap");
            if (!file2.getParentFile().exists()) {
                file2.getParentFile().mkdirs();
            }
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file2));
            try {
                TreeMap treeMap3 = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                treeMap3.putAll(treeMap);
                m23955l(dataOutputStream, treeMap3);
            } finally {
                dataOutputStream.close();
            }
        }
        return treeMap;
    }

    /* renamed from: k */
    public final void m23956k(File file, DateTimeZoneBuilder dateTimeZoneBuilder, DateTimeZone dateTimeZone) {
        if (ZoneInfoLogger.verbose()) {
            PrintStream printStream = System.out;
            printStream.println("Writing " + dateTimeZone.getID());
        }
        File file2 = new File(file, dateTimeZone.getID());
        if (!file2.getParentFile().exists()) {
            file2.getParentFile().mkdirs();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            dateTimeZoneBuilder.writeTo(dateTimeZone.getID(), fileOutputStream);
            fileOutputStream.close();
            FileInputStream fileInputStream = new FileInputStream(file2);
            DateTimeZone readFrom = DateTimeZoneBuilder.readFrom(fileInputStream, dateTimeZone.getID());
            fileInputStream.close();
            if (!dateTimeZone.equals(readFrom)) {
                PrintStream printStream2 = System.out;
                printStream2.println("*e* Error in " + dateTimeZone.getID() + ": Didn't read properly from file");
            }
        } catch (Throwable th2) {
            fileOutputStream.close();
            throw th2;
        }
    }

    public void parseDataFile(BufferedReader bufferedReader, boolean z) throws IOException {
        while (true) {
            C13032d c13032d = null;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    String trim = readLine.trim();
                    if (trim.length() != 0 && trim.charAt(0) != '#') {
                        int indexOf = readLine.indexOf(35);
                        if (indexOf >= 0) {
                            readLine = readLine.substring(0, indexOf);
                        }
                        StringTokenizer stringTokenizer = new StringTokenizer(readLine, " \t");
                        if (Character.isWhitespace(readLine.charAt(0)) && stringTokenizer.hasMoreTokens()) {
                            if (c13032d != null) {
                                c13032d.m23946c(stringTokenizer);
                            }
                        } else {
                            if (c13032d != null) {
                                this.f76459b.add(c13032d);
                            }
                            if (stringTokenizer.hasMoreTokens()) {
                                String nextToken = stringTokenizer.nextToken();
                                if (nextToken.equalsIgnoreCase("Rule")) {
                                    C13030b c13030b = new C13030b(stringTokenizer);
                                    C13031c c13031c = (C13031c) this.f76458a.get(c13030b.f76468a);
                                    if (c13031c == null) {
                                        this.f76458a.put(c13030b.f76468a, new C13031c(c13030b));
                                    } else {
                                        c13031c.m23949b(c13030b);
                                    }
                                } else if (nextToken.equalsIgnoreCase("Zone")) {
                                    if (stringTokenizer.countTokens() >= 4) {
                                        c13032d = new C13032d(stringTokenizer);
                                    } else {
                                        throw new IllegalArgumentException("Attempting to create a Zone from an incomplete tokenizer");
                                    }
                                } else if (nextToken.equalsIgnoreCase("Link")) {
                                    String nextToken2 = stringTokenizer.nextToken();
                                    String nextToken3 = stringTokenizer.nextToken();
                                    if (!z && !nextToken3.equals("US/Pacific-New") && !nextToken3.startsWith("Etc/") && !nextToken3.equals("GMT")) {
                                        this.f76460c.add(nextToken2);
                                        this.f76460c.add(nextToken3);
                                    } else {
                                        this.f76461d.add(nextToken2);
                                        this.f76461d.add(nextToken3);
                                    }
                                } else {
                                    System.out.println("Unknown line: " + readLine);
                                }
                            }
                        }
                    }
                } else if (c13032d != null) {
                    this.f76459b.add(c13032d);
                    return;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: org.joda.time.tz.ZoneInfoCompiler$a */
    /* loaded from: classes5.dex */
    public static class C13029a {

        /* renamed from: a */
        public final int f76462a;

        /* renamed from: b */
        public final int f76463b;

        /* renamed from: c */
        public final int f76464c;

        /* renamed from: d */
        public final boolean f76465d;

        /* renamed from: e */
        public final int f76466e;

        /* renamed from: f */
        public final char f76467f;

        public C13029a() {
            this.f76462a = 1;
            this.f76463b = 1;
            this.f76464c = 0;
            this.f76465d = false;
            this.f76466e = 0;
            this.f76467f = 'w';
        }

        /* renamed from: a */
        public void m23954a(DateTimeZoneBuilder dateTimeZoneBuilder, int i) {
            dateTimeZoneBuilder.addCutover(i, this.f76467f, this.f76462a, this.f76463b, this.f76464c, this.f76465d, this.f76466e);
        }

        /* renamed from: b */
        public void m23953b(DateTimeZoneBuilder dateTimeZoneBuilder, String str, int i, int i2, int i3) {
            dateTimeZoneBuilder.addRecurringSavings(str, i, i2, i3, this.f76467f, this.f76462a, this.f76463b, this.f76464c, this.f76465d, this.f76466e);
        }

        public String toString() {
            return "MonthOfYear: " + this.f76462a + "\nDayOfMonth: " + this.f76463b + "\nDayOfWeek: " + this.f76464c + "\nAdvanceDayOfWeek: " + this.f76465d + "\nMillisOfDay: " + this.f76466e + "\nZoneChar: " + this.f76467f + "\n";
        }

        public C13029a(StringTokenizer stringTokenizer) {
            int i;
            int i2;
            boolean z;
            int m23964c;
            int m23961f;
            int i3 = 1;
            int i4 = 0;
            char c = 'w';
            if (stringTokenizer.hasMoreTokens()) {
                int m23963d = ZoneInfoCompiler.m23963d(stringTokenizer.nextToken());
                if (stringTokenizer.hasMoreTokens()) {
                    String nextToken = stringTokenizer.nextToken();
                    if (nextToken.startsWith("last")) {
                        m23964c = ZoneInfoCompiler.m23964c(nextToken.substring(4));
                        i2 = -1;
                    } else {
                        try {
                            i2 = Integer.parseInt(nextToken);
                            m23964c = 0;
                        } catch (NumberFormatException unused) {
                            int indexOf = nextToken.indexOf(">=");
                            if (indexOf > 0) {
                                int parseInt = Integer.parseInt(nextToken.substring(indexOf + 2));
                                m23964c = ZoneInfoCompiler.m23964c(nextToken.substring(0, indexOf));
                                i2 = parseInt;
                                z = true;
                            } else {
                                int indexOf2 = nextToken.indexOf("<=");
                                if (indexOf2 > 0) {
                                    int parseInt2 = Integer.parseInt(nextToken.substring(indexOf2 + 2));
                                    m23964c = ZoneInfoCompiler.m23964c(nextToken.substring(0, indexOf2));
                                    i2 = parseInt2;
                                } else {
                                    throw new IllegalArgumentException(nextToken);
                                }
                            }
                        }
                    }
                    z = false;
                    if (stringTokenizer.hasMoreTokens()) {
                        String nextToken2 = stringTokenizer.nextToken();
                        c = ZoneInfoCompiler.m23959h(nextToken2.charAt(nextToken2.length() - 1));
                        if (!nextToken2.equals("24:00")) {
                            m23961f = ZoneInfoCompiler.m23961f(nextToken2);
                        } else if (m23963d == 12 && i2 == 31) {
                            m23961f = ZoneInfoCompiler.m23961f("23:59:59.999");
                        } else {
                            LocalDate plusMonths = i2 == -1 ? new LocalDate(2001, m23963d, 1).plusMonths(1) : new LocalDate(2001, m23963d, i2).plusDays(1);
                            boolean z2 = (i2 == -1 || m23964c == 0) ? false : true;
                            int monthOfYear = plusMonths.getMonthOfYear();
                            int dayOfMonth = plusMonths.getDayOfMonth();
                            z = z2;
                            i3 = monthOfYear;
                            i4 = m23964c != 0 ? (m23964c % 7) + 1 : m23964c;
                            i2 = dayOfMonth;
                        }
                        i3 = m23963d;
                        i = m23961f;
                        i4 = m23964c;
                        this.f76462a = i3;
                        this.f76463b = i2;
                        this.f76464c = i4;
                        this.f76465d = z;
                        this.f76466e = i;
                        this.f76467f = c;
                    }
                    i3 = m23963d;
                    i4 = m23964c;
                    i = 0;
                    this.f76462a = i3;
                    this.f76463b = i2;
                    this.f76464c = i4;
                    this.f76465d = z;
                    this.f76466e = i;
                    this.f76467f = c;
                }
                i3 = m23963d;
            }
            i = 0;
            i2 = 1;
            z = false;
            this.f76462a = i3;
            this.f76463b = i2;
            this.f76464c = i4;
            this.f76465d = z;
            this.f76466e = i;
            this.f76467f = c;
        }
    }
}