package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class zzwn extends zzwk {
    protected final byte[] bytes;

    public zzwn(byte[] bArr) {
        bArr.getClass();
        this.bytes = bArr;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzwd
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzwd) || size() != ((zzwd) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof zzwn) {
            zzwn zzwnVar = (zzwn) obj;
            int zzuf = zzuf();
            int zzuf2 = zzwnVar.zzuf();
            if (zzuf != 0 && zzuf2 != 0 && zzuf != zzuf2) {
                return false;
            }
            return zza(zzwnVar, 0, size());
        }
        return obj.equals(this);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzwd
    public int size() {
        return this.bytes.length;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzwd
    public final void zza(zzwa zzwaVar) throws IOException {
        zzwaVar.zzb(this.bytes, zzug(), size());
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzwd
    public void zzb(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.bytes, i, bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzwd
    public final int zzc(int i, int i2, int i3) {
        return zzxl.m47420c(i, this.bytes, zzug() + i2, i3);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzwd
    public byte zzdb(int i) {
        return this.bytes[i];
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzwd
    public byte zzdc(int i) {
        return this.bytes[i];
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzwd
    public final zzwd zzf(int i, int i2) {
        int zzd = zzwd.zzd(i, i2, size());
        if (zzd == 0) {
            return zzwd.zzcks;
        }
        return new zzwg(this.bytes, zzug() + i, zzd);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzwd
    public final boolean zzuc() {
        int zzug = zzug();
        return AbstractC6464b.m47970h(this.bytes, zzug, size() + zzug);
    }

    public int zzug() {
        return 0;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzwk
    public final boolean zza(zzwd zzwdVar, int i, int i2) {
        if (i2 <= zzwdVar.size()) {
            int i3 = i + i2;
            if (i3 <= zzwdVar.size()) {
                if (zzwdVar instanceof zzwn) {
                    zzwn zzwnVar = (zzwn) zzwdVar;
                    byte[] bArr = this.bytes;
                    byte[] bArr2 = zzwnVar.bytes;
                    int zzug = zzug() + i2;
                    int zzug2 = zzug();
                    int zzug3 = zzwnVar.zzug() + i;
                    while (zzug2 < zzug) {
                        if (bArr[zzug2] != bArr2[zzug3]) {
                            return false;
                        }
                        zzug2++;
                        zzug3++;
                    }
                    return true;
                }
                return zzwdVar.zzf(i, i3).equals(zzf(0, i2));
            }
            int size = zzwdVar.size();
            StringBuilder sb = new StringBuilder(59);
            sb.append("Ran off end of other: ");
            sb.append(i);
            sb.append(", ");
            sb.append(i2);
            sb.append(", ");
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        }
        int size2 = size();
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Length too large: ");
        sb2.append(i2);
        sb2.append(size2);
        throw new IllegalArgumentException(sb2.toString());
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzwd
    public final String zzb(Charset charset) {
        return new String(this.bytes, zzug(), size(), charset);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzwd
    public final int zzb(int i, int i2, int i3) {
        int zzug = zzug() + i2;
        return AbstractC6464b.m47976b(i, this.bytes, zzug, i3 + zzug);
    }
}
