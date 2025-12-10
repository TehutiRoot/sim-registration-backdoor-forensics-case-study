package p000;

import com.google.android.gms.analytics.zzg;
import com.google.android.gms.analytics.zzj;
import java.util.Comparator;

/* renamed from: ao2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19116ao2 implements Comparator {
    public C19116ao2(zzg zzgVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return ((zzj) obj).getClass().getCanonicalName().compareTo(((zzj) obj2).getClass().getCanonicalName());
    }
}