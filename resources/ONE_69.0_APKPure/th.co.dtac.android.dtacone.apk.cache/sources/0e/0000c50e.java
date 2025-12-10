package p000;

import com.google.android.gms.internal.vision.zzen;
import java.util.Collection;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: dk2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC19623dk2 implements zzen {
    @NullableDecl
    private transient Map<Object, Collection<Object>> zza;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzen) {
            return zza().equals(((zzen) obj).zza());
        }
        return false;
    }

    public int hashCode() {
        return zza().hashCode();
    }

    public String toString() {
        return zza().toString();
    }

    @Override // com.google.android.gms.internal.vision.zzen
    public abstract Map zza();

    public boolean zza(Object obj) {
        for (Collection collection : zza().values()) {
            if (collection.contains(obj)) {
                return true;
            }
        }
        return false;
    }
}