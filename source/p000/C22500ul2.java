package p000;

import java.util.Iterator;

/* renamed from: ul2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22500ul2 extends C19235bm2 {

    /* renamed from: b */
    public final /* synthetic */ AbstractC20264hl2 f107451b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22500ul2(AbstractC20264hl2 abstractC20264hl2) {
        super(abstractC20264hl2, null);
        this.f107451b = abstractC20264hl2;
    }

    @Override // p000.C19235bm2, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C21640pl2(this.f107451b, null);
    }

    public /* synthetic */ C22500ul2(AbstractC20264hl2 abstractC20264hl2, C20952ll2 c20952ll2) {
        this(abstractC20264hl2);
    }
}
