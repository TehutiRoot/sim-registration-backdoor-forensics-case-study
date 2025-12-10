package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.C6543d;
import com.google.android.gms.internal.mlkit_vision_barcode.zzdj;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* renamed from: gf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC20074gf2 implements zzdj {
    @CheckForNull
    private transient Collection zza;
    @CheckForNull
    private transient Set zzb;
    @CheckForNull
    private transient Map zzc;

    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzdj)) {
            return false;
        }
        return zzv().equals(((zzdj) obj).zzv());
    }

    public final int hashCode() {
        return zzv().hashCode();
    }

    public final String toString() {
        return zzv().toString();
    }

    public abstract Collection zzi();

    public abstract Iterator zzl();

    public abstract Map zzo();

    public abstract Set zzp();

    public final Collection zzu() {
        Collection collection = this.zza;
        if (collection == null) {
            Collection zzi = zzi();
            this.zza = zzi;
            return zzi;
        }
        return collection;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdj
    public final Map zzv() {
        Map map = this.zzc;
        if (map == null) {
            Map zzo = zzo();
            this.zzc = zzo;
            return zzo;
        }
        return map;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdj
    public final Set zzw() {
        Set set = this.zzb;
        if (set == null) {
            Set zzp = zzp();
            this.zzb = zzp;
            return zzp;
        }
        return set;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdj
    public final boolean zzx(@CheckForNull Object obj, @CheckForNull Object obj2) {
        Collection collection = ((C6543d) zzv()).get(obj);
        if (collection != null && collection.contains(obj2)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdj
    public final boolean zzy(@CheckForNull Object obj, @CheckForNull Object obj2) {
        Collection collection = ((C6543d) zzv()).get(obj);
        if (collection != null && collection.remove(obj2)) {
            return true;
        }
        return false;
    }
}
