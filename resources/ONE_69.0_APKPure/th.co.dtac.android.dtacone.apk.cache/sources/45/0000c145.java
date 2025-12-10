package com.tom_roush.pdfbox.p019io;

import java.io.File;

/* renamed from: com.tom_roush.pdfbox.io.MemoryUsageSetting */
/* loaded from: classes5.dex */
public final class MemoryUsageSetting {

    /* renamed from: a */
    public final boolean f59900a;

    /* renamed from: b */
    public final boolean f59901b;

    /* renamed from: c */
    public final long f59902c;

    /* renamed from: d */
    public final long f59903d;

    /* renamed from: e */
    public File f59904e;

    public MemoryUsageSetting(boolean z, boolean z2, long j, long j2) {
        boolean z3;
        boolean z4 = false;
        if (z2 && !z) {
            z3 = false;
        } else {
            z3 = true;
        }
        j = z ? j : -1L;
        j2 = j2 <= 0 ? -1L : j2;
        j = j < -1 ? -1L : j;
        if (z3 && j == 0) {
            if (!z2) {
                j = j2;
            }
            if (z4 && j2 > -1 && (j == -1 || j > j2)) {
                j2 = j;
            }
            this.f59900a = z4;
            this.f59901b = z2;
            this.f59902c = j;
            this.f59903d = j2;
        }
        z4 = z3;
        if (z4) {
            j2 = j;
        }
        this.f59900a = z4;
        this.f59901b = z2;
        this.f59902c = j;
        this.f59903d = j2;
    }

    public static MemoryUsageSetting setupMainMemoryOnly() {
        return setupMainMemoryOnly(-1L);
    }

    public static MemoryUsageSetting setupMixed(long j) {
        return setupMixed(j, -1L);
    }

    public static MemoryUsageSetting setupTempFileOnly() {
        return setupTempFileOnly(-1L);
    }

    public long getMaxMainMemoryBytes() {
        return this.f59902c;
    }

    public long getMaxStorageBytes() {
        return this.f59903d;
    }

    public MemoryUsageSetting getPartitionedCopy(int i) {
        long j = this.f59902c;
        if (j > 0) {
            j /= i;
        }
        long j2 = j;
        long j3 = this.f59903d;
        if (j3 > 0) {
            j3 /= i;
        }
        MemoryUsageSetting memoryUsageSetting = new MemoryUsageSetting(this.f59900a, this.f59901b, j2, j3);
        memoryUsageSetting.f59904e = this.f59904e;
        return memoryUsageSetting;
    }

    public File getTempDir() {
        return this.f59904e;
    }

    public boolean isMainMemoryRestricted() {
        if (this.f59902c >= 0) {
            return true;
        }
        return false;
    }

    public boolean isStorageRestricted() {
        if (this.f59903d > 0) {
            return true;
        }
        return false;
    }

    public MemoryUsageSetting setTempDir(File file) {
        this.f59904e = file;
        return this;
    }

    public String toString() {
        String str;
        if (this.f59900a) {
            if (this.f59901b) {
                StringBuilder sb = new StringBuilder();
                sb.append("Mixed mode with max. of ");
                sb.append(this.f59902c);
                sb.append(" main memory bytes");
                if (isStorageRestricted()) {
                    str = " and max. of " + this.f59903d + " storage bytes";
                } else {
                    str = " and unrestricted scratch file size";
                }
                sb.append(str);
                return sb.toString();
            } else if (isMainMemoryRestricted()) {
                return "Main memory only with max. of " + this.f59902c + " bytes";
            } else {
                return "Main memory only with no size restriction";
            }
        } else if (isStorageRestricted()) {
            return "Scratch file only with max. of " + this.f59903d + " bytes";
        } else {
            return "Scratch file only with no size restriction";
        }
    }

    public boolean useMainMemory() {
        return this.f59900a;
    }

    public boolean useTempFile() {
        return this.f59901b;
    }

    public static MemoryUsageSetting setupMainMemoryOnly(long j) {
        return new MemoryUsageSetting(true, false, j, j);
    }

    public static MemoryUsageSetting setupMixed(long j, long j2) {
        return new MemoryUsageSetting(true, true, j, j2);
    }

    public static MemoryUsageSetting setupTempFileOnly(long j) {
        return new MemoryUsageSetting(false, true, 0L, j);
    }
}