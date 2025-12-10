package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import org.slf4j.Marker;

/* loaded from: classes3.dex */
public abstract class zzwd implements Serializable, Iterable<Byte> {
    public static final zzwd zzcks = new zzwn(zzxl.zzcpk);
    private static final GK2 zzckt;
    private static final Comparator<zzwd> zzcku;
    private int zzamz = 0;

    static {
        GK2 fk2;
        if (AbstractC21917rK2.m23335b()) {
            fk2 = new HK2(null);
        } else {
            fk2 = new FK2(null);
        }
        zzckt = fk2;
        zzcku = new EK2();
    }

    private static zzwd zza(Iterator<zzwd> it, int i) {
        if (i > 0) {
            if (i == 1) {
                return it.next();
            }
            int i2 = i >>> 1;
            zzwd zza = zza(it, i2);
            zzwd zza2 = zza(it, i - i2);
            if (Integer.MAX_VALUE - zza.size() >= zza2.size()) {
                return zzzi.zza(zza, zza2);
            }
            int size = zza.size();
            int size2 = zza2.size();
            StringBuilder sb = new StringBuilder(53);
            sb.append("ByteString would be too long: ");
            sb.append(size);
            sb.append(Marker.ANY_NON_NULL_MARKER);
            sb.append(size2);
            throw new IllegalArgumentException(sb.toString());
        }
        throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i)));
    }

    public static int zzb(byte b) {
        return b & 255;
    }

    public static zzwd zzc(byte[] bArr, int i, int i2) {
        zzd(i, i + i2, bArr.length);
        return new zzwn(zzckt.mo68106a(bArr, i, i2));
    }

    public static zzwd zzcj(String str) {
        return new zzwn(str.getBytes(zzxl.f46112a));
    }

    public static int zzd(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i >= 0) {
                if (i2 < i) {
                    StringBuilder sb = new StringBuilder(66);
                    sb.append("Beginning index larger than ending index: ");
                    sb.append(i);
                    sb.append(", ");
                    sb.append(i2);
                    throw new IndexOutOfBoundsException(sb.toString());
                }
                StringBuilder sb2 = new StringBuilder(37);
                sb2.append("End index: ");
                sb2.append(i2);
                sb2.append(" >= ");
                sb2.append(i3);
                throw new IndexOutOfBoundsException(sb2.toString());
            }
            StringBuilder sb3 = new StringBuilder(32);
            sb3.append("Beginning index: ");
            sb3.append(i);
            sb3.append(" < 0");
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        return i4;
    }

    public static C6431D0 zzdd(int i) {
        return new C6431D0(i, null);
    }

    public static void zzg(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                StringBuilder sb = new StringBuilder(22);
                sb.append("Index < 0: ");
                sb.append(i);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Index > length: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.zzamz;
        if (i == 0) {
            int size = size();
            i = zzc(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.zzamz = i;
        }
        return i;
    }

    public abstract int size();

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        Integer valueOf = Integer.valueOf(size());
        if (size() <= 50) {
            concat = AbstractC23155ya2.m235a(this);
        } else {
            concat = String.valueOf(AbstractC23155ya2.m235a(zzf(0, 47))).concat("...");
        }
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", hexString, valueOf, concat);
    }

    public abstract void zza(zzwa zzwaVar) throws IOException;

    public abstract int zzb(int i, int i2, int i3);

    public abstract String zzb(Charset charset);

    public abstract void zzb(byte[] bArr, int i, int i2, int i3);

    public abstract int zzc(int i, int i2, int i3);

    public abstract byte zzdb(int i);

    public abstract byte zzdc(int i);

    public abstract zzwd zzf(int i, int i2);

    @Override // java.lang.Iterable
    /* renamed from: zzua */
    public zzwi iterator() {
        return new CK2(this);
    }

    public final String zzub() {
        Charset charset = zzxl.f46112a;
        if (size() == 0) {
            return "";
        }
        return zzb(charset);
    }

    public abstract boolean zzuc();

    public abstract int zzud();

    public abstract boolean zzue();

    public final int zzuf() {
        return this.zzamz;
    }

    public static zzwd zzb(InputStream inputStream) throws IOException {
        ArrayList arrayList = new ArrayList();
        int i = 256;
        while (true) {
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int read = inputStream.read(bArr, i2, i - i2);
                if (read == -1) {
                    break;
                }
                i2 += read;
            }
            zzwd zzc = i2 == 0 ? null : zzc(bArr, 0, i2);
            if (zzc == null) {
                break;
            }
            arrayList.add(zzc);
            i = Math.min(i << 1, 8192);
        }
        int size = arrayList.size();
        if (size == 0) {
            return zzcks;
        }
        return zza(arrayList.iterator(), size);
    }

    @Deprecated
    public final void zza(byte[] bArr, int i, int i2, int i3) {
        zzd(0, i3, size());
        zzd(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            zzb(bArr, 0, i2, i3);
        }
    }
}
