package p000;

import com.google.android.gms.internal.mlkit_vision_face.C6580c;
import com.google.android.gms.internal.mlkit_vision_face.zzca;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* renamed from: rc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC21957rc2 implements zzca {
    @CheckForNull
    private transient Set zza;
    @CheckForNull
    private transient Map zzb;

    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzca)) {
            return false;
        }
        return zzp().equals(((zzca) obj).zzp());
    }

    public final int hashCode() {
        return zzp().hashCode();
    }

    public final String toString() {
        return ((C6580c) zzp()).f47067c.toString();
    }

    public abstract Map zzk();

    public abstract Set zzl();

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzca
    public final Map zzp() {
        Map map = this.zzb;
        if (map == null) {
            Map zzk = zzk();
            this.zzb = zzk;
            return zzk;
        }
        return map;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzca
    public final Set zzq() {
        Set set = this.zza;
        if (set == null) {
            Set zzl = zzl();
            this.zza = zzl;
            return zzl;
        }
        return set;
    }
}
