package p000;

import java.util.Iterator;

/* renamed from: AF2 */
/* loaded from: classes3.dex */
public final class AF2 extends TF2 {

    /* renamed from: b */
    public final /* synthetic */ AbstractC22830wF2 f54b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AF2(AbstractC22830wF2 abstractC22830wF2) {
        super(abstractC22830wF2, null);
        this.f54b = abstractC22830wF2;
    }

    @Override // p000.TF2, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new EF2(this.f54b, null);
    }

    public /* synthetic */ AF2(AbstractC22830wF2 abstractC22830wF2, C21965rF2 c21965rF2) {
        this(abstractC22830wF2);
    }
}