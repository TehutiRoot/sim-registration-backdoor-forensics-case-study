package com.tom_roush.pdfbox.p019io;

import java.io.File;

/* renamed from: com.tom_roush.pdfbox.io.MemoryUsageSetting */
/* loaded from: classes5.dex */
public final class MemoryUsageSetting {

    /* renamed from: a */
    public final boolean f59888a;

    /* renamed from: b */
    public final boolean f59889b;

    /* renamed from: c */
    public final long f59890c;

    /* renamed from: d */
    public final long f59891d;

    /* renamed from: e */
    public File f59892e;

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
            this.f59888a = z4;
            this.f59889b = z2;
            this.f59890c = j;
            this.f59891d = j2;
        }
        z4 = z3;
        if (z4) {
            j2 = j;
        }
        this.f59888a = z4;
        this.f59889b = z2;
        this.f59890c = j;
        this.f59891d = j2;
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
        return this.f59890c;
    }

    public long getMaxStorageBytes() {
        return this.f59891d;
    }

    public MemoryUsageSetting getPartitionedCopy(int i) {
        long j = this.f59890c;
        if (j > 0) {
            j /= i;
        }
        long j2 = j;
        long j3 = this.f59891d;
        if (j3 > 0) {
            j3 /= i;
        }
        MemoryUsageSetting memoryUsageSetting = new MemoryUsageSetting(this.f59888a, this.f59889b, j2, j3);
        memoryUsageSetting.f59892e = this.f59892e;
        return memoryUsageSetting;
    }

    public File getTempDir() {
        return this.f59892e;
    }

    public boolean isMainMemoryRestricted() {
        if (this.f59890c >= 0) {
            return true;
        }
        return false;
    }

    public boolean isStorageRestricted() {
        if (this.f59891d > 0) {
            return true;
        }
        return false;
    }

    public MemoryUsageSetting setTempDir(File file) {
        this.f59892e = file;
        return this;
    }

    public String toString() {
        String str;
        if (this.f59888a) {
            if (this.f59889b) {
                StringBuilder sb = new StringBuilder();
                sb.append("Mixed mode with max. of ");
                sb.append(this.f59890c);
                sb.append(" main memory bytes");
                if (isStorageRestricted()) {
                    str = " and max. of " + this.f59891d + " storage bytes";
                } else {
                    str = " and unrestricted scratch file size";
                }
                sb.append(str);
                return sb.toString();
            } else if (isMainMemoryRestricted()) {
                return "Main memory only with max. of " + this.f59890c + " bytes";
            } else {
                return "Main memory only with no size restriction";
            }
        } else if (isStorageRestricted()) {
            return "Scratch file only with max. of " + this.f59891d + " bytes";
        } else {
            return "Scratch file only with no size restriction";
        }
    }

    public boolean useMainMemory() {
        return this.f59888a;
    }

    public boolean useTempFile() {
        return this.f59889b;
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
