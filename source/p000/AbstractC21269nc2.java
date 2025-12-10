package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzx;
import java.util.Map;
import javax.annotation.CheckForNull;

/* renamed from: nc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC21269nc2 implements Map.Entry {
    @Override // java.util.Map.Entry
    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (zzx.zza(getKey(), entry.getKey()) && zzx.zza(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public abstract Object getKey();

    @Override // java.util.Map.Entry
    public abstract Object getValue();

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        Object key = getKey();
        Object value = getValue();
        int i = 0;
        if (key == null) {
            hashCode = 0;
        } else {
            hashCode = key.hashCode();
        }
        if (value != null) {
            i = value.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
