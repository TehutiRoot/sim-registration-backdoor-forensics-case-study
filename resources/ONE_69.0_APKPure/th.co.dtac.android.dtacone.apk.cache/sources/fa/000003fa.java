package p000;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* renamed from: E92 */
/* loaded from: classes3.dex */
public final class E92 implements Comparator {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return ((Scope) obj).getScopeUri().compareTo(((Scope) obj2).getScopeUri());
    }
}