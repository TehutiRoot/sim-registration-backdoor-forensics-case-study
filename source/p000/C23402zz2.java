package p000;

import com.google.android.gms.internal.firebase_ml.zziv;
import com.google.android.gms.internal.firebase_ml.zzjd;
import com.google.android.gms.internal.firebase_ml.zzml;
import java.util.AbstractMap;
import java.util.Set;

/* renamed from: zz2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C23402zz2 extends AbstractMap {

    /* renamed from: a */
    public final Object f109246a;

    /* renamed from: b */
    public final zziv f109247b;

    public C23402zz2(Object obj, boolean z) {
        this.f109246a = obj;
        zziv zza = zziv.zza(obj.getClass(), z);
        this.f109247b = zza;
        zzml.checkArgument(!zza.isEnum());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Set entrySet() {
        return new Ez2(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        zzjd zzao;
        if (!(obj instanceof String) || (zzao = this.f109247b.zzao((String) obj)) == null) {
            return null;
        }
        return zzao.zzh(this.f109246a);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Object put(Object obj, Object obj2) {
        String str;
        String str2 = (String) obj;
        zzjd zzao = this.f109247b.zzao(str2);
        String valueOf = String.valueOf(str2);
        if (valueOf.length() != 0) {
            str = "no field of key ".concat(valueOf);
        } else {
            str = new String("no field of key ");
        }
        zzml.checkNotNull(zzao, str);
        Object zzh = zzao.zzh(this.f109246a);
        zzao.zzb(this.f109246a, zzml.checkNotNull(obj2));
        return zzh;
    }
}
