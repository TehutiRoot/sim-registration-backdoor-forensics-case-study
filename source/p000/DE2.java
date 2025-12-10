package p000;

import java.util.Iterator;

/* renamed from: DE2 */
/* loaded from: classes3.dex */
public final class DE2 extends WE2 {

    /* renamed from: b */
    public final /* synthetic */ AbstractC23275zE2 f943b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DE2(AbstractC23275zE2 abstractC23275zE2) {
        super(abstractC23275zE2, null);
        this.f943b = abstractC23275zE2;
    }

    @Override // p000.WE2, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new HE2(this.f943b, null);
    }

    public /* synthetic */ DE2(AbstractC23275zE2 abstractC23275zE2, C22415uE2 c22415uE2) {
        this(abstractC23275zE2);
    }
}
