package com.google.android.gms.internal.mlkit_vision_face;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbd extends AbstractMap implements Serializable {
    private static final Object zzd = new Object();
    @CheckForNull
    transient int[] zza;
    @CheckForNull
    transient Object[] zzb;
    @CheckForNull
    transient Object[] zzc;
    @CheckForNull
    private transient Object zze;
    private transient int zzf;
    private transient int zzg;
    @CheckForNull
    private transient Set zzh;
    @CheckForNull
    private transient Set zzi;
    @CheckForNull
    private transient Collection zzj;

    public zzbd() {
        zzo(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzA() {
        Object[] objArr = this.zzb;
        objArr.getClass();
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzB() {
        Object[] objArr = this.zzc;
        objArr.getClass();
        return objArr;
    }

    public static /* synthetic */ int zzb(zzbd zzbdVar) {
        int i = zzbdVar.zzg;
        zzbdVar.zzg = i - 1;
        return i;
    }

    public static /* synthetic */ Object zzg(zzbd zzbdVar, int i) {
        return zzbdVar.zzA()[i];
    }

    public static /* synthetic */ Object zzj(zzbd zzbdVar, int i) {
        return zzbdVar.zzB()[i];
    }

    public static /* synthetic */ Object zzk(zzbd zzbdVar) {
        Object obj = zzbdVar.zze;
        obj.getClass();
        return obj;
    }

    public static /* synthetic */ void zzm(zzbd zzbdVar, int i, Object obj) {
        zzbdVar.zzB()[i] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzu() {
        return (1 << (this.zzf & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzv(@CheckForNull Object obj) {
        if (zzq()) {
            return -1;
        }
        int m30619a = AbstractC20415ie2.m30619a(obj);
        int zzu = zzu();
        Object obj2 = this.zze;
        obj2.getClass();
        int m31277c = AbstractC19899fe2.m31277c(obj2, m30619a & zzu);
        if (m31277c == 0) {
            return -1;
        }
        int i = ~zzu;
        int i2 = m30619a & i;
        do {
            int i3 = m31277c - 1;
            int i4 = zzz()[i3];
            if ((i4 & i) == i2 && zzx.zza(obj, zzA()[i3])) {
                return i3;
            }
            m31277c = i4 & zzu;
        } while (m31277c != 0);
        return -1;
    }

    private final int zzw(int i, int i2, int i3, int i4) {
        Object m31276d = AbstractC19899fe2.m31276d(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            AbstractC19899fe2.m31275e(m31276d, i3 & i5, i4 + 1);
        }
        Object obj = this.zze;
        obj.getClass();
        int[] zzz = zzz();
        for (int i6 = 0; i6 <= i; i6++) {
            int m31277c = AbstractC19899fe2.m31277c(obj, i6);
            while (m31277c != 0) {
                int i7 = m31277c - 1;
                int i8 = zzz[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int m31277c2 = AbstractC19899fe2.m31277c(m31276d, i10);
                AbstractC19899fe2.m31275e(m31276d, i10, m31277c);
                zzz[i7] = ((~i5) & i9) | (m31277c2 & i5);
                m31277c = i8 & i;
            }
        }
        this.zze = m31276d;
        zzy(i5);
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzx(@CheckForNull Object obj) {
        if (zzq()) {
            return zzd;
        }
        int zzu = zzu();
        Object obj2 = this.zze;
        obj2.getClass();
        int m31278b = AbstractC19899fe2.m31278b(obj, null, zzu, obj2, zzz(), zzA(), null);
        if (m31278b == -1) {
            return zzd;
        }
        Object obj3 = zzB()[m31278b];
        zzp(m31278b, zzu);
        this.zzg--;
        zzn();
        return obj3;
    }

    private final void zzy(int i) {
        this.zzf = ((32 - Integer.numberOfLeadingZeros(i)) & 31) | (this.zzf & (-32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] zzz() {
        int[] iArr = this.zza;
        iArr.getClass();
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (zzq()) {
            return;
        }
        zzn();
        Map zzl = zzl();
        if (zzl != null) {
            this.zzf = zzcn.zza(size(), 3, LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
            zzl.clear();
            this.zze = null;
            this.zzg = 0;
            return;
        }
        Arrays.fill(zzA(), 0, this.zzg, (Object) null);
        Arrays.fill(zzB(), 0, this.zzg, (Object) null);
        Object obj = this.zze;
        obj.getClass();
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(zzz(), 0, this.zzg, 0);
        this.zzg = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(@CheckForNull Object obj) {
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.containsKey(obj);
        }
        if (zzv(obj) == -1) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(@CheckForNull Object obj) {
        Map zzl = zzl();
        if (zzl == null) {
            for (int i = 0; i < this.zzg; i++) {
                if (zzx.zza(obj, zzB()[i])) {
                    return true;
                }
            }
            return false;
        }
        return zzl.containsValue(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.zzi;
        if (set == null) {
            C6591n c6591n = new C6591n(this);
            this.zzi = c6591n;
            return c6591n;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final Object get(@CheckForNull Object obj) {
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.get(obj);
        }
        int zzv = zzv(obj);
        if (zzv == -1) {
            return null;
        }
        return zzB()[zzv];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.zzh;
        if (set == null) {
            C6593p c6593p = new C6593p(this);
            this.zzh = c6593p;
            return c6593p;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final Object put(Object obj, Object obj2) {
        int min;
        if (zzq()) {
            zzab.zzd(zzq(), "Arrays already allocated");
            int i = this.zzf;
            int max = Math.max(i + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.zze = AbstractC19899fe2.m31276d(max2);
            zzy(max2 - 1);
            this.zza = new int[i];
            this.zzb = new Object[i];
            this.zzc = new Object[i];
        }
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.put(obj, obj2);
        }
        int[] zzz = zzz();
        Object[] zzA = zzA();
        Object[] zzB = zzB();
        int i2 = this.zzg;
        int i3 = i2 + 1;
        int m30619a = AbstractC20415ie2.m30619a(obj);
        int zzu = zzu();
        int i4 = m30619a & zzu;
        Object obj3 = this.zze;
        obj3.getClass();
        int m31277c = AbstractC19899fe2.m31277c(obj3, i4);
        if (m31277c == 0) {
            if (i3 > zzu) {
                zzu = zzw(zzu, AbstractC19899fe2.m31279a(zzu), m30619a, i2);
            } else {
                Object obj4 = this.zze;
                obj4.getClass();
                AbstractC19899fe2.m31275e(obj4, i4, i3);
            }
        } else {
            int i5 = ~zzu;
            int i6 = m30619a & i5;
            int i7 = 0;
            while (true) {
                int i8 = m31277c - 1;
                int i9 = zzz[i8];
                int i10 = i9 & i5;
                if (i10 == i6 && zzx.zza(obj, zzA[i8])) {
                    Object obj5 = zzB[i8];
                    zzB[i8] = obj2;
                    return obj5;
                }
                int i11 = i9 & zzu;
                i7++;
                if (i11 == 0) {
                    if (i7 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(zzu() + 1, 1.0f);
                        int zze = zze();
                        while (zze >= 0) {
                            linkedHashMap.put(zzA()[zze], zzB()[zze]);
                            zze = zzf(zze);
                        }
                        this.zze = linkedHashMap;
                        this.zza = null;
                        this.zzb = null;
                        this.zzc = null;
                        zzn();
                        return linkedHashMap.put(obj, obj2);
                    } else if (i3 > zzu) {
                        zzu = zzw(zzu, AbstractC19899fe2.m31279a(zzu), m30619a, i2);
                    } else {
                        zzz[i8] = (i3 & zzu) | i10;
                    }
                } else {
                    m31277c = i11;
                }
            }
        }
        int length = zzz().length;
        if (i3 > length && (min = Math.min((int) LockFreeTaskQueueCore.MAX_CAPACITY_MASK, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.zza = Arrays.copyOf(zzz(), min);
            this.zzb = Arrays.copyOf(zzA(), min);
            this.zzc = Arrays.copyOf(zzB(), min);
        }
        zzz()[i2] = (~zzu) & m30619a;
        zzA()[i2] = obj;
        zzB()[i2] = obj2;
        this.zzg = i3;
        zzn();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final Object remove(@CheckForNull Object obj) {
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.remove(obj);
        }
        Object zzx = zzx(obj);
        if (zzx == zzd) {
            return null;
        }
        return zzx;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.size();
        }
        return this.zzg;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.zzj;
        if (collection == null) {
            C6595r c6595r = new C6595r(this);
            this.zzj = c6595r;
            return c6595r;
        }
        return collection;
    }

    public final int zze() {
        if (isEmpty()) {
            return -1;
        }
        return 0;
    }

    public final int zzf(int i) {
        int i2 = i + 1;
        if (i2 < this.zzg) {
            return i2;
        }
        return -1;
    }

    @CheckForNull
    public final Map zzl() {
        Object obj = this.zze;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void zzn() {
        this.zzf += 32;
    }

    public final void zzo(int i) {
        this.zzf = zzcn.zza(12, 1, LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
    }

    public final void zzp(int i, int i2) {
        Object obj = this.zze;
        obj.getClass();
        int[] zzz = zzz();
        Object[] zzA = zzA();
        Object[] zzB = zzB();
        int size = size();
        int i3 = size - 1;
        if (i < i3) {
            Object obj2 = zzA[i3];
            zzA[i] = obj2;
            zzB[i] = zzB[i3];
            zzA[i3] = null;
            zzB[i3] = null;
            zzz[i] = zzz[i3];
            zzz[i3] = 0;
            int m30619a = AbstractC20415ie2.m30619a(obj2) & i2;
            int m31277c = AbstractC19899fe2.m31277c(obj, m30619a);
            if (m31277c == size) {
                AbstractC19899fe2.m31275e(obj, m30619a, i + 1);
                return;
            }
            while (true) {
                int i4 = m31277c - 1;
                int i5 = zzz[i4];
                int i6 = i5 & i2;
                if (i6 != size) {
                    m31277c = i6;
                } else {
                    zzz[i4] = ((i + 1) & i2) | (i5 & (~i2));
                    return;
                }
            }
        } else {
            zzA[i] = null;
            zzB[i] = null;
            zzz[i] = 0;
        }
    }

    public final boolean zzq() {
        return this.zze == null;
    }

    public zzbd(int i) {
        zzo(12);
    }
}
