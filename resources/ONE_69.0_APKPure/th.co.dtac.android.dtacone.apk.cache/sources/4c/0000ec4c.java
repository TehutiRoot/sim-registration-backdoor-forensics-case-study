package p000;

import com.google.android.gms.phenotype.zzi;
import java.util.Comparator;

/* renamed from: oA2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21431oA2 implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzi zziVar = (zzi) obj;
        zzi zziVar2 = (zzi) obj2;
        int i = zziVar.zzah;
        int i2 = zziVar2.zzah;
        if (i == i2) {
            return zziVar.name.compareTo(zziVar2.name);
        }
        return i - i2;
    }
}