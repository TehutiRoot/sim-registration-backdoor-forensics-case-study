package org.joda.time.p045tz;

import ch.qos.logback.core.spi.ComponentTracker;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.bouncycastle.asn1.eac.CertificateHolderAuthorization;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.chrono.ISOChronology;

/* renamed from: org.joda.time.tz.DateTimeZoneBuilder */
/* loaded from: classes5.dex */
public class DateTimeZoneBuilder {

    /* renamed from: a */
    public final ArrayList f76345a = new ArrayList(10);

    /* renamed from: org.joda.time.tz.DateTimeZoneBuilder$DSTZone */
    /* loaded from: classes5.dex */
    public static final class DSTZone extends DateTimeZone {
        private static final long serialVersionUID = 6941492635554961361L;
        final C13025b iEndRecurrence;
        final int iStandardOffset;
        final C13025b iStartRecurrence;

        public DSTZone(String str, int i, C13025b c13025b, C13025b c13025b2) {
            super(str);
            this.iStandardOffset = i;
            this.iStartRecurrence = c13025b;
            this.iEndRecurrence = c13025b2;
        }

        private C13025b findMatchingRecurrence(long j) {
            long j2;
            int i = this.iStandardOffset;
            C13025b c13025b = this.iStartRecurrence;
            C13025b c13025b2 = this.iEndRecurrence;
            try {
                j2 = c13025b.m23804c(j, i, c13025b2.m23805b());
            } catch (ArithmeticException | IllegalArgumentException unused) {
                j2 = j;
            }
            try {
                j = c13025b2.m23804c(j, i, c13025b.m23805b());
            } catch (ArithmeticException | IllegalArgumentException unused2) {
            }
            if (j2 <= j) {
                return c13025b2;
            }
            return c13025b;
        }

        public static DSTZone readFrom(DataInput dataInput, String str) throws IOException {
            return new DSTZone(str, (int) DateTimeZoneBuilder.m23817d(dataInput), C13025b.m23802e(dataInput), C13025b.m23802e(dataInput));
        }

        @Override // org.joda.time.DateTimeZone
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DSTZone)) {
                return false;
            }
            DSTZone dSTZone = (DSTZone) obj;
            if (getID().equals(dSTZone.getID()) && this.iStandardOffset == dSTZone.iStandardOffset && this.iStartRecurrence.equals(dSTZone.iStartRecurrence) && this.iEndRecurrence.equals(dSTZone.iEndRecurrence)) {
                return true;
            }
            return false;
        }

        @Override // org.joda.time.DateTimeZone
        public String getNameKey(long j) {
            return findMatchingRecurrence(j).m23806a();
        }

        @Override // org.joda.time.DateTimeZone
        public int getOffset(long j) {
            return this.iStandardOffset + findMatchingRecurrence(j).m23805b();
        }

        @Override // org.joda.time.DateTimeZone
        public int getStandardOffset(long j) {
            return this.iStandardOffset;
        }

        @Override // org.joda.time.DateTimeZone
        public boolean isFixed() {
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
            if (r5 < 0) goto L8;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        @Override // org.joda.time.DateTimeZone
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long nextTransition(long r9) {
            /*
                r8 = this;
                int r0 = r8.iStandardOffset
                org.joda.time.tz.DateTimeZoneBuilder$b r1 = r8.iStartRecurrence
                org.joda.time.tz.DateTimeZoneBuilder$b r2 = r8.iEndRecurrence
                r3 = 0
                int r5 = r2.m23805b()     // Catch: java.lang.Throwable -> L18
                long r5 = r1.m23804c(r9, r0, r5)     // Catch: java.lang.Throwable -> L18
                int r7 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
                if (r7 <= 0) goto L19
                int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r7 >= 0) goto L19
            L18:
                r5 = r9
            L19:
                int r1 = r1.m23805b()     // Catch: java.lang.Throwable -> L2c
                long r0 = r2.m23804c(r9, r0, r1)     // Catch: java.lang.Throwable -> L2c
                int r2 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
                if (r2 <= 0) goto L2a
                int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r2 >= 0) goto L2a
                goto L2d
            L2a:
                r9 = r0
                goto L2d
            L2c:
            L2d:
                int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
                if (r0 <= 0) goto L32
                r5 = r9
            L32:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.p045tz.DateTimeZoneBuilder.DSTZone.nextTransition(long):long");
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
            if (r7 > 0) goto L8;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
        @Override // org.joda.time.DateTimeZone
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long previousTransition(long r11) {
            /*
                r10 = this;
                r0 = 1
                long r11 = r11 + r0
                int r2 = r10.iStandardOffset
                org.joda.time.tz.DateTimeZoneBuilder$b r3 = r10.iStartRecurrence
                org.joda.time.tz.DateTimeZoneBuilder$b r4 = r10.iEndRecurrence
                r5 = 0
                int r7 = r4.m23805b()     // Catch: java.lang.Throwable -> L1b
                long r7 = r3.m23803d(r11, r2, r7)     // Catch: java.lang.Throwable -> L1b
                int r9 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
                if (r9 >= 0) goto L1c
                int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r9 <= 0) goto L1c
            L1b:
                r7 = r11
            L1c:
                int r3 = r3.m23805b()     // Catch: java.lang.Throwable -> L2f
                long r2 = r4.m23803d(r11, r2, r3)     // Catch: java.lang.Throwable -> L2f
                int r4 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
                if (r4 >= 0) goto L2d
                int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                if (r4 <= 0) goto L2d
                goto L30
            L2d:
                r11 = r2
                goto L30
            L2f:
            L30:
                int r2 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
                if (r2 <= 0) goto L35
                goto L36
            L35:
                r7 = r11
            L36:
                long r7 = r7 - r0
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.p045tz.DateTimeZoneBuilder.DSTZone.previousTransition(long):long");
        }

        public void writeTo(DataOutput dataOutput) throws IOException {
            DateTimeZoneBuilder.m23816e(dataOutput, this.iStandardOffset);
            this.iStartRecurrence.m23799h(dataOutput);
            this.iEndRecurrence.m23799h(dataOutput);
        }
    }

    /* renamed from: org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone */
    /* loaded from: classes5.dex */
    public static final class PrecalculatedZone extends DateTimeZone {
        private static final long serialVersionUID = 7811976468055766265L;
        private final String[] iNameKeys;
        private final int[] iStandardOffsets;
        private final DSTZone iTailZone;
        private final long[] iTransitions;
        private final int[] iWallOffsets;

        private PrecalculatedZone(String str, long[] jArr, int[] iArr, int[] iArr2, String[] strArr, DSTZone dSTZone) {
            super(str);
            this.iTransitions = jArr;
            this.iWallOffsets = iArr;
            this.iStandardOffsets = iArr2;
            this.iNameKeys = strArr;
            this.iTailZone = dSTZone;
        }

        public static PrecalculatedZone create(String str, boolean z, ArrayList<C13028e> arrayList, DSTZone dSTZone) {
            String[][] zoneStrings;
            DSTZone dSTZone2;
            String str2;
            DSTZone dSTZone3;
            DSTZone dSTZone4 = dSTZone;
            int size = arrayList.size();
            if (size != 0) {
                long[] jArr = new long[size];
                int[] iArr = new int[size];
                int[] iArr2 = new int[size];
                String[] strArr = new String[size];
                int i = 0;
                C13028e c13028e = null;
                int i2 = 0;
                while (i2 < size) {
                    C13028e c13028e2 = arrayList.get(i2);
                    if (c13028e2.m23781f(c13028e)) {
                        jArr[i2] = c13028e2.m23786a();
                        iArr[i2] = c13028e2.m23782e();
                        iArr2[i2] = c13028e2.m23783d();
                        strArr[i2] = c13028e2.m23785b();
                        i2++;
                        c13028e = c13028e2;
                    } else {
                        throw new IllegalArgumentException(str);
                    }
                }
                String[] strArr2 = new String[5];
                for (String[] strArr3 : new DateFormatSymbols(Locale.ENGLISH).getZoneStrings()) {
                    if (strArr3 != null && strArr3.length == 5 && str.equals(strArr3[0])) {
                        strArr2 = strArr3;
                    }
                }
                ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
                while (i < size - 1) {
                    String str3 = strArr[i];
                    int i3 = i + 1;
                    String str4 = strArr[i3];
                    long j = iArr[i];
                    long j2 = iArr[i3];
                    String[] strArr4 = strArr;
                    String[] strArr5 = strArr2;
                    long j3 = iArr2[i];
                    int[] iArr3 = iArr;
                    int[] iArr4 = iArr2;
                    long j4 = iArr2[i3];
                    int i4 = size;
                    Period period = new Period(jArr[i], jArr[i3], PeriodType.yearMonthDay(), instanceUTC);
                    int i5 = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                    if (i5 != 0 && j3 == j4 && str3.equals(str4) && period.getYears() == 0 && period.getMonths() > 4 && period.getMonths() < 8 && str3.equals(strArr5[2]) && str3.equals(strArr5[4])) {
                        if (ZoneInfoLogger.verbose()) {
                            PrintStream printStream = System.out;
                            printStream.println("Fixing duplicate name key - " + str4);
                            printStream.println("     - " + new DateTime(jArr[i], instanceUTC) + " - " + new DateTime(jArr[i3], instanceUTC));
                        }
                        if (i5 > 0) {
                            strArr4[i] = (str3 + "-Summer").intern();
                        } else if (i5 < 0) {
                            strArr4[i3] = (str4 + "-Summer").intern();
                            i = i3;
                        }
                    }
                    i++;
                    strArr2 = strArr5;
                    dSTZone4 = dSTZone;
                    strArr = strArr4;
                    iArr = iArr3;
                    iArr2 = iArr4;
                    size = i4;
                }
                DSTZone dSTZone5 = dSTZone4;
                int[] iArr5 = iArr;
                int[] iArr6 = iArr2;
                String[] strArr6 = strArr;
                if (dSTZone5 != null && dSTZone5.iStartRecurrence.m23806a().equals(dSTZone5.iEndRecurrence.m23806a())) {
                    if (ZoneInfoLogger.verbose()) {
                        System.out.println("Fixing duplicate recurrent name key - " + dSTZone5.iStartRecurrence.m23806a());
                    }
                    if (dSTZone5.iStartRecurrence.m23805b() > 0) {
                        dSTZone3 = new DSTZone(dSTZone.getID(), dSTZone5.iStandardOffset, dSTZone5.iStartRecurrence.m23800g("-Summer"), dSTZone5.iEndRecurrence);
                    } else {
                        dSTZone3 = new DSTZone(dSTZone.getID(), dSTZone5.iStandardOffset, dSTZone5.iStartRecurrence, dSTZone5.iEndRecurrence.m23800g("-Summer"));
                    }
                    dSTZone2 = dSTZone3;
                } else {
                    dSTZone2 = dSTZone5;
                }
                if (z) {
                    str2 = str;
                } else {
                    str2 = "";
                }
                return new PrecalculatedZone(str2, jArr, iArr5, iArr6, strArr6, dSTZone2);
            }
            throw new IllegalArgumentException();
        }

        public static PrecalculatedZone readFrom(DataInput dataInput, String str) throws IOException {
            DSTZone dSTZone;
            int readUnsignedByte;
            int readUnsignedShort = dataInput.readUnsignedShort();
            String[] strArr = new String[readUnsignedShort];
            for (int i = 0; i < readUnsignedShort; i++) {
                strArr[i] = dataInput.readUTF();
            }
            int readInt = dataInput.readInt();
            long[] jArr = new long[readInt];
            int[] iArr = new int[readInt];
            int[] iArr2 = new int[readInt];
            String[] strArr2 = new String[readInt];
            for (int i2 = 0; i2 < readInt; i2++) {
                jArr[i2] = DateTimeZoneBuilder.m23817d(dataInput);
                iArr[i2] = (int) DateTimeZoneBuilder.m23817d(dataInput);
                iArr2[i2] = (int) DateTimeZoneBuilder.m23817d(dataInput);
                if (readUnsignedShort < 256) {
                    try {
                        readUnsignedByte = dataInput.readUnsignedByte();
                    } catch (ArrayIndexOutOfBoundsException unused) {
                        throw new IOException("Invalid encoding");
                    }
                } else {
                    readUnsignedByte = dataInput.readUnsignedShort();
                }
                strArr2[i2] = strArr[readUnsignedByte];
            }
            if (dataInput.readBoolean()) {
                dSTZone = DSTZone.readFrom(dataInput, str);
            } else {
                dSTZone = null;
            }
            return new PrecalculatedZone(str, jArr, iArr, iArr2, strArr2, dSTZone);
        }

        @Override // org.joda.time.DateTimeZone
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PrecalculatedZone)) {
                return false;
            }
            PrecalculatedZone precalculatedZone = (PrecalculatedZone) obj;
            if (getID().equals(precalculatedZone.getID()) && Arrays.equals(this.iTransitions, precalculatedZone.iTransitions) && Arrays.equals(this.iNameKeys, precalculatedZone.iNameKeys) && Arrays.equals(this.iWallOffsets, precalculatedZone.iWallOffsets) && Arrays.equals(this.iStandardOffsets, precalculatedZone.iStandardOffsets)) {
                DSTZone dSTZone = this.iTailZone;
                DSTZone dSTZone2 = precalculatedZone.iTailZone;
                if (dSTZone == null) {
                    if (dSTZone2 == null) {
                        return true;
                    }
                } else if (dSTZone.equals(dSTZone2)) {
                    return true;
                }
            }
            return false;
        }

        @Override // org.joda.time.DateTimeZone
        public String getNameKey(long j) {
            long[] jArr = this.iTransitions;
            int binarySearch = Arrays.binarySearch(jArr, j);
            if (binarySearch >= 0) {
                return this.iNameKeys[binarySearch];
            }
            int i = ~binarySearch;
            if (i < jArr.length) {
                if (i > 0) {
                    return this.iNameKeys[i - 1];
                }
                return "UTC";
            }
            DSTZone dSTZone = this.iTailZone;
            if (dSTZone == null) {
                return this.iNameKeys[i - 1];
            }
            return dSTZone.getNameKey(j);
        }

        @Override // org.joda.time.DateTimeZone
        public int getOffset(long j) {
            long[] jArr = this.iTransitions;
            int binarySearch = Arrays.binarySearch(jArr, j);
            if (binarySearch >= 0) {
                return this.iWallOffsets[binarySearch];
            }
            int i = ~binarySearch;
            if (i < jArr.length) {
                if (i > 0) {
                    return this.iWallOffsets[i - 1];
                }
                return 0;
            }
            DSTZone dSTZone = this.iTailZone;
            if (dSTZone == null) {
                return this.iWallOffsets[i - 1];
            }
            return dSTZone.getOffset(j);
        }

        @Override // org.joda.time.DateTimeZone
        public int getStandardOffset(long j) {
            long[] jArr = this.iTransitions;
            int binarySearch = Arrays.binarySearch(jArr, j);
            if (binarySearch >= 0) {
                return this.iStandardOffsets[binarySearch];
            }
            int i = ~binarySearch;
            if (i < jArr.length) {
                if (i > 0) {
                    return this.iStandardOffsets[i - 1];
                }
                return 0;
            }
            DSTZone dSTZone = this.iTailZone;
            if (dSTZone == null) {
                return this.iStandardOffsets[i - 1];
            }
            return dSTZone.getStandardOffset(j);
        }

        public boolean isCachable() {
            if (this.iTailZone != null) {
                return true;
            }
            long[] jArr = this.iTransitions;
            if (jArr.length <= 1) {
                return false;
            }
            double d = 0.0d;
            int i = 0;
            for (int i2 = 1; i2 < jArr.length; i2++) {
                long j = jArr[i2] - jArr[i2 - 1];
                if (j < 63158400000L) {
                    d += j;
                    i++;
                }
            }
            if (i > 0 && (d / i) / 8.64E7d >= 25.0d) {
                return true;
            }
            return false;
        }

        @Override // org.joda.time.DateTimeZone
        public boolean isFixed() {
            return false;
        }

        @Override // org.joda.time.DateTimeZone
        public long nextTransition(long j) {
            int i;
            long[] jArr = this.iTransitions;
            int binarySearch = Arrays.binarySearch(jArr, j);
            if (binarySearch >= 0) {
                i = binarySearch + 1;
            } else {
                i = ~binarySearch;
            }
            if (i < jArr.length) {
                return jArr[i];
            }
            DSTZone dSTZone = this.iTailZone;
            if (dSTZone == null) {
                return j;
            }
            long j2 = jArr[jArr.length - 1];
            if (j < j2) {
                j = j2;
            }
            return dSTZone.nextTransition(j);
        }

        @Override // org.joda.time.DateTimeZone
        public long previousTransition(long j) {
            long[] jArr = this.iTransitions;
            int binarySearch = Arrays.binarySearch(jArr, j);
            if (binarySearch >= 0) {
                if (j > Long.MIN_VALUE) {
                    return j - 1;
                }
                return j;
            }
            int i = ~binarySearch;
            if (i < jArr.length) {
                if (i > 0) {
                    long j2 = jArr[i - 1];
                    if (j2 > Long.MIN_VALUE) {
                        return j2 - 1;
                    }
                }
                return j;
            }
            DSTZone dSTZone = this.iTailZone;
            if (dSTZone != null) {
                long previousTransition = dSTZone.previousTransition(j);
                if (previousTransition < j) {
                    return previousTransition;
                }
            }
            long j3 = jArr[i - 1];
            if (j3 > Long.MIN_VALUE) {
                return j3 - 1;
            }
            return j;
        }

        public void writeTo(DataOutput dataOutput) throws IOException {
            int length = this.iTransitions.length;
            HashSet<String> hashSet = new HashSet();
            boolean z = false;
            for (int i = 0; i < length; i++) {
                hashSet.add(this.iNameKeys[i]);
            }
            int size = hashSet.size();
            if (size <= 65535) {
                String[] strArr = new String[size];
                int i2 = 0;
                for (String str : hashSet) {
                    strArr[i2] = str;
                    i2++;
                }
                dataOutput.writeShort(size);
                for (int i3 = 0; i3 < size; i3++) {
                    dataOutput.writeUTF(strArr[i3]);
                }
                dataOutput.writeInt(length);
                for (int i4 = 0; i4 < length; i4++) {
                    DateTimeZoneBuilder.m23816e(dataOutput, this.iTransitions[i4]);
                    DateTimeZoneBuilder.m23816e(dataOutput, this.iWallOffsets[i4]);
                    DateTimeZoneBuilder.m23816e(dataOutput, this.iStandardOffsets[i4]);
                    String str2 = this.iNameKeys[i4];
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size) {
                            break;
                        } else if (strArr[i5].equals(str2)) {
                            if (size < 256) {
                                dataOutput.writeByte(i5);
                            } else {
                                dataOutput.writeShort(i5);
                            }
                        } else {
                            i5++;
                        }
                    }
                }
                if (this.iTailZone != null) {
                    z = true;
                }
                dataOutput.writeBoolean(z);
                DSTZone dSTZone = this.iTailZone;
                if (dSTZone != null) {
                    dSTZone.writeTo(dataOutput);
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("String pool is too large");
        }
    }

    /* renamed from: org.joda.time.tz.DateTimeZoneBuilder$a */
    /* loaded from: classes5.dex */
    public static final class C13024a {

        /* renamed from: a */
        public final char f76346a;

        /* renamed from: b */
        public final int f76347b;

        /* renamed from: c */
        public final int f76348c;

        /* renamed from: d */
        public final int f76349d;

        /* renamed from: e */
        public final boolean f76350e;

        /* renamed from: f */
        public final int f76351f;

        public C13024a(char c, int i, int i2, int i3, boolean z, int i4) {
            if (c != 'u' && c != 'w' && c != 's') {
                throw new IllegalArgumentException("Unknown mode: " + c);
            }
            this.f76346a = c;
            this.f76347b = i;
            this.f76348c = i2;
            this.f76349d = i3;
            this.f76350e = z;
            this.f76351f = i4;
        }

        /* renamed from: c */
        public static C13024a m23813c(DataInput dataInput) {
            return new C13024a((char) dataInput.readUnsignedByte(), dataInput.readUnsignedByte(), dataInput.readByte(), dataInput.readUnsignedByte(), dataInput.readBoolean(), (int) DateTimeZoneBuilder.m23817d(dataInput));
        }

        /* renamed from: a */
        public long m23815a(long j, int i, int i2) {
            char c = this.f76346a;
            if (c == 'w') {
                i += i2;
            } else if (c != 's') {
                i = 0;
            }
            long j2 = i;
            long j3 = j + j2;
            ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
            long m23811e = m23811e(instanceUTC, instanceUTC.millisOfDay().add(instanceUTC.millisOfDay().set(instanceUTC.monthOfYear().set(j3, this.f76347b), 0), this.f76351f));
            if (this.f76349d == 0) {
                if (m23811e <= j3) {
                    m23811e = m23811e(instanceUTC, instanceUTC.year().add(m23811e, 1));
                }
            } else {
                m23811e = m23809g(instanceUTC, m23811e);
                if (m23811e <= j3) {
                    m23811e = m23809g(instanceUTC, m23811e(instanceUTC, instanceUTC.monthOfYear().set(instanceUTC.year().add(m23811e, 1), this.f76347b)));
                }
            }
            return m23811e - j2;
        }

        /* renamed from: b */
        public long m23814b(long j, int i, int i2) {
            char c = this.f76346a;
            if (c == 'w') {
                i += i2;
            } else if (c != 's') {
                i = 0;
            }
            long j2 = i;
            long j3 = j + j2;
            ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
            long m23810f = m23810f(instanceUTC, instanceUTC.millisOfDay().add(instanceUTC.millisOfDay().set(instanceUTC.monthOfYear().set(j3, this.f76347b), 0), this.f76351f));
            if (this.f76349d == 0) {
                if (m23810f >= j3) {
                    m23810f = m23810f(instanceUTC, instanceUTC.year().add(m23810f, -1));
                }
            } else {
                m23810f = m23809g(instanceUTC, m23810f);
                if (m23810f >= j3) {
                    m23810f = m23809g(instanceUTC, m23810f(instanceUTC, instanceUTC.monthOfYear().set(instanceUTC.year().add(m23810f, -1), this.f76347b)));
                }
            }
            return m23810f - j2;
        }

        /* renamed from: d */
        public final long m23812d(Chronology chronology, long j) {
            if (this.f76348c >= 0) {
                return chronology.dayOfMonth().set(j, this.f76348c);
            }
            return chronology.dayOfMonth().add(chronology.monthOfYear().add(chronology.dayOfMonth().set(j, 1), 1), this.f76348c);
        }

        /* renamed from: e */
        public final long m23811e(Chronology chronology, long j) {
            try {
                return m23812d(chronology, j);
            } catch (IllegalArgumentException e) {
                if (this.f76347b == 2 && this.f76348c == 29) {
                    while (!chronology.year().isLeap(j)) {
                        j = chronology.year().add(j, 1);
                    }
                    return m23812d(chronology, j);
                }
                throw e;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13024a)) {
                return false;
            }
            C13024a c13024a = (C13024a) obj;
            if (this.f76346a == c13024a.f76346a && this.f76347b == c13024a.f76347b && this.f76348c == c13024a.f76348c && this.f76349d == c13024a.f76349d && this.f76350e == c13024a.f76350e && this.f76351f == c13024a.f76351f) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        public final long m23810f(Chronology chronology, long j) {
            try {
                return m23812d(chronology, j);
            } catch (IllegalArgumentException e) {
                if (this.f76347b == 2 && this.f76348c == 29) {
                    while (!chronology.year().isLeap(j)) {
                        j = chronology.year().add(j, -1);
                    }
                    return m23812d(chronology, j);
                }
                throw e;
            }
        }

        /* renamed from: g */
        public final long m23809g(Chronology chronology, long j) {
            int i = this.f76349d - chronology.dayOfWeek().get(j);
            if (i != 0) {
                if (this.f76350e) {
                    if (i < 0) {
                        i += 7;
                    }
                } else if (i > 0) {
                    i -= 7;
                }
                return chronology.dayOfWeek().add(j, i);
            }
            return j;
        }

        /* renamed from: h */
        public long m23808h(int i, int i2, int i3) {
            char c = this.f76346a;
            if (c == 'w') {
                i2 += i3;
            } else if (c != 's') {
                i2 = 0;
            }
            ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
            long m23812d = m23812d(instanceUTC, instanceUTC.millisOfDay().set(instanceUTC.monthOfYear().set(instanceUTC.year().set(0L, i), this.f76347b), this.f76351f));
            if (this.f76349d != 0) {
                m23812d = m23809g(instanceUTC, m23812d);
            }
            return m23812d - i2;
        }

        /* renamed from: i */
        public void m23807i(DataOutput dataOutput) {
            dataOutput.writeByte(this.f76346a);
            dataOutput.writeByte(this.f76347b);
            dataOutput.writeByte(this.f76348c);
            dataOutput.writeByte(this.f76349d);
            dataOutput.writeBoolean(this.f76350e);
            DateTimeZoneBuilder.m23816e(dataOutput, this.f76351f);
        }
    }

    /* renamed from: org.joda.time.tz.DateTimeZoneBuilder$b */
    /* loaded from: classes5.dex */
    public static final class C13025b {

        /* renamed from: a */
        public final C13024a f76352a;

        /* renamed from: b */
        public final String f76353b;

        /* renamed from: c */
        public final int f76354c;

        public C13025b(C13024a c13024a, String str, int i) {
            this.f76352a = c13024a;
            this.f76353b = str;
            this.f76354c = i;
        }

        /* renamed from: e */
        public static C13025b m23802e(DataInput dataInput) {
            return new C13025b(C13024a.m23813c(dataInput), dataInput.readUTF(), (int) DateTimeZoneBuilder.m23817d(dataInput));
        }

        /* renamed from: a */
        public String m23806a() {
            return this.f76353b;
        }

        /* renamed from: b */
        public int m23805b() {
            return this.f76354c;
        }

        /* renamed from: c */
        public long m23804c(long j, int i, int i2) {
            return this.f76352a.m23815a(j, i, i2);
        }

        /* renamed from: d */
        public long m23803d(long j, int i, int i2) {
            return this.f76352a.m23814b(j, i, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13025b)) {
                return false;
            }
            C13025b c13025b = (C13025b) obj;
            if (this.f76354c == c13025b.f76354c && this.f76353b.equals(c13025b.f76353b) && this.f76352a.equals(c13025b.f76352a)) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        public C13025b m23801f(String str) {
            return new C13025b(this.f76352a, str, this.f76354c);
        }

        /* renamed from: g */
        public C13025b m23800g(String str) {
            return m23801f((this.f76353b + str).intern());
        }

        /* renamed from: h */
        public void m23799h(DataOutput dataOutput) {
            this.f76352a.m23807i(dataOutput);
            dataOutput.writeUTF(this.f76353b);
            DateTimeZoneBuilder.m23816e(dataOutput, this.f76354c);
        }
    }

    /* renamed from: org.joda.time.tz.DateTimeZoneBuilder$c */
    /* loaded from: classes5.dex */
    public static final class C13026c {

        /* renamed from: a */
        public final C13025b f76355a;

        /* renamed from: b */
        public final int f76356b;

        /* renamed from: c */
        public final int f76357c;

        public C13026c(C13025b c13025b, int i, int i2) {
            this.f76355a = c13025b;
            this.f76356b = i;
            this.f76357c = i2;
        }

        /* renamed from: a */
        public String m23798a() {
            return this.f76355a.m23806a();
        }

        /* renamed from: b */
        public int m23797b() {
            return this.f76355a.m23805b();
        }

        /* renamed from: c */
        public int m23796c() {
            return this.f76357c;
        }

        /* renamed from: d */
        public long m23795d(long j, int i, int i2) {
            int i3;
            long j2;
            ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
            int i4 = i + i2;
            if (j == Long.MIN_VALUE) {
                i3 = Integer.MIN_VALUE;
            } else {
                i3 = instanceUTC.year().get(i4 + j);
            }
            if (i3 < this.f76356b) {
                j2 = (instanceUTC.year().set(0L, this.f76356b) - i4) - 1;
            } else {
                j2 = j;
            }
            long m23804c = this.f76355a.m23804c(j2, i, i2);
            if (m23804c <= j || instanceUTC.year().get(i4 + m23804c) <= this.f76357c) {
                return m23804c;
            }
            return j;
        }
    }

    /* renamed from: b */
    public static DateTimeZone m23819b(String str, String str2, int i, int i2) {
        if ("UTC".equals(str) && str.equals(str2) && i == 0 && i2 == 0) {
            return DateTimeZone.UTC;
        }
        return new FixedDateTimeZone(str, str2, i, i2);
    }

    /* renamed from: d */
    public static long m23817d(DataInput dataInput) {
        long readUnsignedByte;
        long j;
        int readUnsignedByte2 = dataInput.readUnsignedByte();
        int i = readUnsignedByte2 >> 6;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    readUnsignedByte = (readUnsignedByte2 << 26) >> 26;
                    j = ComponentTracker.DEFAULT_TIMEOUT;
                } else {
                    return dataInput.readLong();
                }
            } else {
                readUnsignedByte = ((readUnsignedByte2 << 58) >> 26) | (dataInput.readUnsignedByte() << 24) | (dataInput.readUnsignedByte() << 16) | (dataInput.readUnsignedByte() << 8) | dataInput.readUnsignedByte();
                j = 1000;
            }
        } else {
            readUnsignedByte = dataInput.readUnsignedByte() | ((readUnsignedByte2 << 26) >> 2) | (dataInput.readUnsignedByte() << 16) | (dataInput.readUnsignedByte() << 8);
            j = 60000;
        }
        return readUnsignedByte * j;
    }

    /* renamed from: e */
    public static void m23816e(DataOutput dataOutput, long j) {
        int i;
        if (j % ComponentTracker.DEFAULT_TIMEOUT == 0) {
            long j2 = j / ComponentTracker.DEFAULT_TIMEOUT;
            if (((j2 << 58) >> 58) == j2) {
                dataOutput.writeByte((int) (j2 & 63));
                return;
            }
        }
        if (j % 60000 == 0) {
            long j3 = j / 60000;
            if (((j3 << 34) >> 34) == j3) {
                dataOutput.writeInt(1073741824 | ((int) (LockFreeTaskQueueCore.HEAD_MASK & j3)));
                return;
            }
        }
        if (j % 1000 == 0) {
            long j4 = j / 1000;
            if (((j4 << 26) >> 26) == j4) {
                dataOutput.writeByte(((int) ((j4 >> 32) & 63)) | 128);
                dataOutput.writeInt((int) j4);
                return;
            }
        }
        if (j < 0) {
            i = 255;
        } else {
            i = CertificateHolderAuthorization.CVCA;
        }
        dataOutput.writeByte(i);
        dataOutput.writeLong(j);
    }

    public static DateTimeZone readFrom(InputStream inputStream, String str) throws IOException {
        if (inputStream instanceof DataInput) {
            return readFrom((DataInput) inputStream, str);
        }
        return readFrom((DataInput) new DataInputStream(inputStream), str);
    }

    /* renamed from: a */
    public final boolean m23820a(ArrayList arrayList, C13028e c13028e) {
        int size = arrayList.size();
        if (size == 0) {
            arrayList.add(c13028e);
            return true;
        }
        int i = size - 1;
        C13028e c13028e2 = (C13028e) arrayList.get(i);
        int i2 = 0;
        if (!c13028e.m23781f(c13028e2)) {
            return false;
        }
        if (size >= 2) {
            i2 = ((C13028e) arrayList.get(size - 2)).m23782e();
        }
        if (c13028e.m23786a() + c13028e2.m23782e() != c13028e2.m23786a() + i2) {
            arrayList.add(c13028e);
            return true;
        }
        arrayList.remove(i);
        return m23820a(arrayList, c13028e);
    }

    public DateTimeZoneBuilder addCutover(int i, char c, int i2, int i3, int i4, boolean z, int i5) {
        if (this.f76345a.size() > 0) {
            C13024a c13024a = new C13024a(c, i2, i3, i4, z, i5);
            ArrayList arrayList = this.f76345a;
            ((C13027d) arrayList.get(arrayList.size() - 1)).m23787h(i, c13024a);
        }
        this.f76345a.add(new C13027d());
        return this;
    }

    public DateTimeZoneBuilder addRecurringSavings(String str, int i, int i2, int i3, char c, int i4, int i5, int i6, boolean z, int i7) {
        if (i2 <= i3) {
            m23818c().m23794a(new C13026c(new C13025b(new C13024a(c, i4, i5, i6, z, i7), str, i), i2, i3));
        }
        return this;
    }

    /* renamed from: c */
    public final C13027d m23818c() {
        if (this.f76345a.size() == 0) {
            addCutover(Integer.MIN_VALUE, 'w', 1, 1, 0, false, 0);
        }
        ArrayList arrayList = this.f76345a;
        return (C13027d) arrayList.get(arrayList.size() - 1);
    }

    public DateTimeZoneBuilder setFixedSavings(String str, int i) {
        m23818c().m23789f(str, i);
        return this;
    }

    public DateTimeZoneBuilder setStandardOffset(int i) {
        m23818c().m23788g(i);
        return this;
    }

    public DateTimeZone toDateTimeZone(String str, boolean z) {
        if (str != null) {
            ArrayList arrayList = new ArrayList();
            int size = this.f76345a.size();
            DSTZone dSTZone = null;
            long j = Long.MIN_VALUE;
            for (int i = 0; i < size; i++) {
                C13027d c13027d = (C13027d) this.f76345a.get(i);
                C13028e m23792c = c13027d.m23792c(j);
                if (m23792c != null) {
                    m23820a(arrayList, m23792c);
                    long m23786a = m23792c.m23786a();
                    int m23784c = m23792c.m23784c();
                    C13027d c13027d2 = new C13027d(c13027d);
                    while (true) {
                        C13028e m23790e = c13027d2.m23790e(m23786a, m23784c);
                        if (m23790e == null || (m23820a(arrayList, m23790e) && dSTZone != null)) {
                            break;
                        }
                        long m23786a2 = m23790e.m23786a();
                        int m23784c2 = m23790e.m23784c();
                        if (dSTZone == null && i == size - 1) {
                            dSTZone = c13027d2.m23793b(str);
                        }
                        m23784c = m23784c2;
                        m23786a = m23786a2;
                    }
                    j = c13027d2.m23791d(m23784c);
                }
            }
            if (arrayList.size() == 0) {
                if (dSTZone != null) {
                    return dSTZone;
                }
                return m23819b(str, "UTC", 0, 0);
            } else if (arrayList.size() == 1 && dSTZone == null) {
                C13028e c13028e = (C13028e) arrayList.get(0);
                return m23819b(str, c13028e.m23785b(), c13028e.m23782e(), c13028e.m23783d());
            } else {
                PrecalculatedZone create = PrecalculatedZone.create(str, z, arrayList, dSTZone);
                if (create.isCachable()) {
                    return CachedDateTimeZone.forZone(create);
                }
                return create;
            }
        }
        throw new IllegalArgumentException();
    }

    public void writeTo(String str, OutputStream outputStream) throws IOException {
        if (outputStream instanceof DataOutput) {
            writeTo(str, (DataOutput) outputStream);
            return;
        }
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        writeTo(str, (DataOutput) dataOutputStream);
        dataOutputStream.flush();
    }

    /* renamed from: org.joda.time.tz.DateTimeZoneBuilder$d */
    /* loaded from: classes5.dex */
    public static final class C13027d {

        /* renamed from: g */
        public static final int f76358g = ISOChronology.getInstanceUTC().year().get(DateTimeUtils.currentTimeMillis()) + 100;

        /* renamed from: a */
        public int f76359a;

        /* renamed from: b */
        public ArrayList f76360b;

        /* renamed from: c */
        public String f76361c;

        /* renamed from: d */
        public int f76362d;

        /* renamed from: e */
        public int f76363e;

        /* renamed from: f */
        public C13024a f76364f;

        public C13027d() {
            this.f76360b = new ArrayList(10);
            this.f76363e = Integer.MAX_VALUE;
        }

        /* renamed from: a */
        public void m23794a(C13026c c13026c) {
            if (!this.f76360b.contains(c13026c)) {
                this.f76360b.add(c13026c);
            }
        }

        /* renamed from: b */
        public DSTZone m23793b(String str) {
            if (this.f76360b.size() == 2) {
                C13026c c13026c = (C13026c) this.f76360b.get(0);
                C13026c c13026c2 = (C13026c) this.f76360b.get(1);
                if (c13026c.m23796c() == Integer.MAX_VALUE && c13026c2.m23796c() == Integer.MAX_VALUE) {
                    return new DSTZone(str, this.f76359a, c13026c.f76355a, c13026c2.f76355a);
                }
                return null;
            }
            return null;
        }

        /* renamed from: c */
        public C13028e m23792c(long j) {
            String str = this.f76361c;
            if (str != null) {
                int i = this.f76359a;
                return new C13028e(j, str, i + this.f76362d, i);
            }
            ArrayList arrayList = new ArrayList(this.f76360b);
            long j2 = Long.MIN_VALUE;
            int i2 = 0;
            C13028e c13028e = null;
            while (true) {
                C13028e m23790e = m23790e(j2, i2);
                if (m23790e == null) {
                    break;
                }
                long m23786a = m23790e.m23786a();
                int i3 = (m23786a > j ? 1 : (m23786a == j ? 0 : -1));
                if (i3 == 0) {
                    c13028e = new C13028e(j, m23790e);
                    break;
                } else if (i3 > 0) {
                    if (c13028e == null) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            C13026c c13026c = (C13026c) it.next();
                            if (c13026c.m23797b() == 0) {
                                c13028e = new C13028e(j, c13026c, this.f76359a);
                                break;
                            }
                        }
                    }
                    if (c13028e == null) {
                        String m23785b = m23790e.m23785b();
                        int i4 = this.f76359a;
                        c13028e = new C13028e(j, m23785b, i4, i4);
                    }
                } else {
                    c13028e = new C13028e(j, m23790e);
                    i2 = m23790e.m23784c();
                    j2 = m23786a;
                }
            }
            this.f76360b = arrayList;
            return c13028e;
        }

        /* renamed from: d */
        public long m23791d(int i) {
            int i2 = this.f76363e;
            if (i2 == Integer.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            return this.f76364f.m23808h(i2, this.f76359a, i);
        }

        /* renamed from: e */
        public C13028e m23790e(long j, int i) {
            ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
            Iterator it = this.f76360b.iterator();
            long j2 = Long.MAX_VALUE;
            C13026c c13026c = null;
            while (it.hasNext()) {
                C13026c c13026c2 = (C13026c) it.next();
                long m23795d = c13026c2.m23795d(j, this.f76359a, i);
                if (m23795d <= j) {
                    it.remove();
                } else if (m23795d <= j2) {
                    c13026c = c13026c2;
                    j2 = m23795d;
                }
            }
            if (c13026c == null || instanceUTC.year().get(j2) >= f76358g) {
                return null;
            }
            int i2 = this.f76363e;
            if (i2 < Integer.MAX_VALUE && j2 >= this.f76364f.m23808h(i2, this.f76359a, i)) {
                return null;
            }
            return new C13028e(j2, c13026c, this.f76359a);
        }

        /* renamed from: f */
        public void m23789f(String str, int i) {
            this.f76361c = str;
            this.f76362d = i;
        }

        /* renamed from: g */
        public void m23788g(int i) {
            this.f76359a = i;
        }

        /* renamed from: h */
        public void m23787h(int i, C13024a c13024a) {
            this.f76363e = i;
            this.f76364f = c13024a;
        }

        public C13027d(C13027d c13027d) {
            this.f76359a = c13027d.f76359a;
            this.f76360b = new ArrayList(c13027d.f76360b);
            this.f76361c = c13027d.f76361c;
            this.f76362d = c13027d.f76362d;
            this.f76363e = c13027d.f76363e;
            this.f76364f = c13027d.f76364f;
        }
    }

    public static DateTimeZone readFrom(DataInput dataInput, String str) throws IOException {
        int readUnsignedByte = dataInput.readUnsignedByte();
        if (readUnsignedByte != 67) {
            if (readUnsignedByte != 70) {
                if (readUnsignedByte == 80) {
                    return PrecalculatedZone.readFrom(dataInput, str);
                }
                throw new IOException("Invalid encoding");
            }
            FixedDateTimeZone fixedDateTimeZone = new FixedDateTimeZone(str, dataInput.readUTF(), (int) m23817d(dataInput), (int) m23817d(dataInput));
            DateTimeZone dateTimeZone = DateTimeZone.UTC;
            return fixedDateTimeZone.equals(dateTimeZone) ? dateTimeZone : fixedDateTimeZone;
        }
        return CachedDateTimeZone.forZone(PrecalculatedZone.readFrom(dataInput, str));
    }

    /* renamed from: org.joda.time.tz.DateTimeZoneBuilder$e */
    /* loaded from: classes5.dex */
    public static final class C13028e {

        /* renamed from: a */
        public final long f76365a;

        /* renamed from: b */
        public final String f76366b;

        /* renamed from: c */
        public final int f76367c;

        /* renamed from: d */
        public final int f76368d;

        public C13028e(long j, C13028e c13028e) {
            this.f76365a = j;
            this.f76366b = c13028e.f76366b;
            this.f76367c = c13028e.f76367c;
            this.f76368d = c13028e.f76368d;
        }

        /* renamed from: a */
        public long m23786a() {
            return this.f76365a;
        }

        /* renamed from: b */
        public String m23785b() {
            return this.f76366b;
        }

        /* renamed from: c */
        public int m23784c() {
            return this.f76367c - this.f76368d;
        }

        /* renamed from: d */
        public int m23783d() {
            return this.f76368d;
        }

        /* renamed from: e */
        public int m23782e() {
            return this.f76367c;
        }

        /* renamed from: f */
        public boolean m23781f(C13028e c13028e) {
            if (c13028e == null) {
                return true;
            }
            if (this.f76365a > c13028e.f76365a && (this.f76367c != c13028e.f76367c || !this.f76366b.equals(c13028e.f76366b))) {
                return true;
            }
            return false;
        }

        public C13028e(long j, C13026c c13026c, int i) {
            this.f76365a = j;
            this.f76366b = c13026c.m23798a();
            this.f76367c = c13026c.m23797b() + i;
            this.f76368d = i;
        }

        public C13028e(long j, String str, int i, int i2) {
            this.f76365a = j;
            this.f76366b = str;
            this.f76367c = i;
            this.f76368d = i2;
        }
    }

    public void writeTo(String str, DataOutput dataOutput) throws IOException {
        DateTimeZone dateTimeZone = toDateTimeZone(str, false);
        if (dateTimeZone instanceof FixedDateTimeZone) {
            dataOutput.writeByte(70);
            dataOutput.writeUTF(dateTimeZone.getNameKey(0L));
            m23816e(dataOutput, dateTimeZone.getOffset(0L));
            m23816e(dataOutput, dateTimeZone.getStandardOffset(0L));
            return;
        }
        if (dateTimeZone instanceof CachedDateTimeZone) {
            dataOutput.writeByte(67);
            dateTimeZone = ((CachedDateTimeZone) dateTimeZone).getUncachedZone();
        } else {
            dataOutput.writeByte(80);
        }
        ((PrecalculatedZone) dateTimeZone).writeTo(dataOutput);
    }
}
