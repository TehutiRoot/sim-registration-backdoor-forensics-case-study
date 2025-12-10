package p000;

import androidx.collection.LruCache;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzfp;

/* renamed from: Go2 */
/* loaded from: classes3.dex */
public final class Go2 extends LruCache {

    /* renamed from: i */
    public final /* synthetic */ zzfp f2022i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Go2(zzfp zzfpVar, int i) {
        super(20);
        this.f2022i = zzfpVar;
    }

    @Override // androidx.collection.LruCache
    public final /* bridge */ /* synthetic */ Object create(Object obj) {
        String str = (String) obj;
        Preconditions.checkNotEmpty(str);
        return zzfp.m46303h(this.f2022i, str);
    }
}
