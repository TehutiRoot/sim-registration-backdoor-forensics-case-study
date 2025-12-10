package com.google.android.gms.internal.firebase_ml;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import ch.qos.logback.core.net.SyslogConstants;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzzi extends zzwd {
    static final int[] zzcsa = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, SyslogConstants.LOG_LOCAL2, 233, 377, TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private final int zzcsb;
    private final zzwd zzcsc;
    private final zzwd zzcsd;
    private final int zzcse;
    private final int zzcsf;

    private zzzi(zzwd zzwdVar, zzwd zzwdVar2) {
        this.zzcsc = zzwdVar;
        this.zzcsd = zzwdVar2;
        int size = zzwdVar.size();
        this.zzcse = size;
        this.zzcsb = size + zzwdVar2.size();
        this.zzcsf = Math.max(zzwdVar.zzud(), zzwdVar2.zzud()) + 1;
    }

    public static zzwd zza(zzwd zzwdVar, zzwd zzwdVar2) {
        if (zzwdVar2.size() == 0) {
            return zzwdVar;
        }
        if (zzwdVar.size() == 0) {
            return zzwdVar2;
        }
        int size = zzwdVar.size() + zzwdVar2.size();
        if (size < 128) {
            return zzb(zzwdVar, zzwdVar2);
        }
        if (zzwdVar instanceof zzzi) {
            zzzi zzziVar = (zzzi) zzwdVar;
            if (zzziVar.zzcsd.size() + zzwdVar2.size() < 128) {
                return new zzzi(zzziVar.zzcsc, zzb(zzziVar.zzcsd, zzwdVar2));
            } else if (zzziVar.zzcsc.zzud() > zzziVar.zzcsd.zzud() && zzziVar.zzud() > zzwdVar2.zzud()) {
                return new zzzi(zzziVar.zzcsc, new zzzi(zzziVar.zzcsd, zzwdVar2));
            }
        }
        if (size >= zzee(Math.max(zzwdVar.zzud(), zzwdVar2.zzud()) + 1)) {
            return new zzzi(zzwdVar, zzwdVar2);
        }
        return C6445K0.m47996a(new C6445K0(null), zzwdVar, zzwdVar2);
    }

    private static zzwd zzb(zzwd zzwdVar, zzwd zzwdVar2) {
        int size = zzwdVar.size();
        int size2 = zzwdVar2.size();
        byte[] bArr = new byte[size + size2];
        zzwdVar.zza(bArr, 0, 0, size);
        zzwdVar2.zza(bArr, 0, size, size2);
        return new zzwn(bArr);
    }

    public static int zzee(int i) {
        int[] iArr = zzcsa;
        if (i >= iArr.length) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzwd
    public final boolean equals(Object obj) {
        boolean zza;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzwd)) {
            return false;
        }
        zzwd zzwdVar = (zzwd) obj;
        if (this.zzcsb != zzwdVar.size()) {
            return false;
        }
        if (this.zzcsb == 0) {
            return true;
        }
        int zzuf = zzuf();
        int zzuf2 = zzwdVar.zzuf();
        if (zzuf != 0 && zzuf2 != 0 && zzuf != zzuf2) {
            return false;
        }
        C6449M0 c6449m0 = new C6449M0(this, null);
        zzwk zzwkVar = (zzwk) c6449m0.next();
        C6449M0 c6449m02 = new C6449M0(zzwdVar, null);
        zzwk zzwkVar2 = (zzwk) c6449m02.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = zzwkVar.size() - i;
            int size2 = zzwkVar2.size() - i2;
            int min = Math.min(size, size2);
            if (i == 0) {
                zza = zzwkVar.zza(zzwkVar2, i2, min);
            } else {
                zza = zzwkVar2.zza(zzwkVar, i, min);
            }
            if (!zza) {
                return false;
            }
            i3 += min;
            int i4 = this.zzcsb;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == size) {
                zzwkVar = (zzwk) c6449m0.next();
                i = 0;
            } else {
                i += min;
            }
            if (min == size2) {
                zzwkVar2 = (zzwk) c6449m02.next();
                i2 = 0;
            } else {
                i2 += min;
            }
        }
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzwd, java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return iterator();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzwd
    public final int size() {
        return this.zzcsb;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzwd
    public final int zzc(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.zzcse;
        if (i4 <= i5) {
            return this.zzcsc.zzc(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.zzcsd.zzc(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.zzcsd.zzc(this.zzcsc.zzc(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzwd
    public final byte zzdb(int i) {
        zzwd.zzg(i, this.zzcsb);
        return zzdc(i);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzwd
    public final byte zzdc(int i) {
        int i2 = this.zzcse;
        if (i < i2) {
            return this.zzcsc.zzdc(i);
        }
        return this.zzcsd.zzdc(i - i2);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzwd
    public final zzwd zzf(int i, int i2) {
        int zzd = zzwd.zzd(i, i2, this.zzcsb);
        if (zzd == 0) {
            return zzwd.zzcks;
        }
        if (zzd == this.zzcsb) {
            return this;
        }
        int i3 = this.zzcse;
        if (i2 <= i3) {
            return this.zzcsc.zzf(i, i2);
        }
        if (i >= i3) {
            return this.zzcsd.zzf(i - i3, i2 - i3);
        }
        zzwd zzwdVar = this.zzcsc;
        return new zzzi(zzwdVar.zzf(i, zzwdVar.size()), this.zzcsd.zzf(0, i2 - this.zzcse));
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzwd
    public final zzwi zzua() {
        return new C6447L0(this);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzwd
    public final boolean zzuc() {
        int zzb = this.zzcsc.zzb(0, 0, this.zzcse);
        zzwd zzwdVar = this.zzcsd;
        if (zzwdVar.zzb(zzb, 0, zzwdVar.size()) != 0) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzwd
    public final int zzud() {
        return this.zzcsf;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzwd
    public final boolean zzue() {
        if (this.zzcsb >= zzee(this.zzcsf)) {
            return true;
        }
        return false;
    }

    public /* synthetic */ zzzi(zzwd zzwdVar, zzwd zzwdVar2, C6447L0 c6447l0) {
        this(zzwdVar, zzwdVar2);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzwd
    public final void zzb(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.zzcse;
        if (i4 <= i5) {
            this.zzcsc.zzb(bArr, i, i2, i3);
        } else if (i >= i5) {
            this.zzcsd.zzb(bArr, i - i5, i2, i3);
        } else {
            int i6 = i5 - i;
            this.zzcsc.zzb(bArr, i, i2, i6);
            this.zzcsd.zzb(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzwd
    public final String zzb(Charset charset) {
        byte[] bArr;
        int size = size();
        if (size == 0) {
            bArr = zzxl.zzcpk;
        } else {
            byte[] bArr2 = new byte[size];
            zzb(bArr2, 0, 0, size);
            bArr = bArr2;
        }
        return new String(bArr, charset);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzwd
    public final void zza(zzwa zzwaVar) throws IOException {
        this.zzcsc.zza(zzwaVar);
        this.zzcsd.zza(zzwaVar);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzwd
    public final int zzb(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.zzcse;
        if (i4 <= i5) {
            return this.zzcsc.zzb(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.zzcsd.zzb(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.zzcsd.zzb(this.zzcsc.zzb(i, i2, i6), 0, i3 - i6);
    }
}
