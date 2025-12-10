package p000;

import com.google.android.gms.internal.mlkit_vision_text_common.zzcc;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* renamed from: ad2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC19078ad2 implements zzcc {
    @CheckForNull
    private transient Set zza;
    @CheckForNull
    private transient Map zzb;

    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzcc)) {
            return false;
        }
        return zzn().equals(((zzcc) obj).zzn());
    }

    public final int hashCode() {
        return zzn().hashCode();
    }

    public final String toString() {
        return zzn().toString();
    }

    public abstract Map zzh();

    public abstract Set zzi();

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzcc
    public final Map zzn() {
        Map map = this.zzb;
        if (map == null) {
            Map zzh = zzh();
            this.zzb = zzh;
            return zzh;
        }
        return map;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzcc
    public final Set zzo() {
        Set set = this.zza;
        if (set == null) {
            Set zzi = zzi();
            this.zza = zzi;
            return zzi;
        }
        return set;
    }
}