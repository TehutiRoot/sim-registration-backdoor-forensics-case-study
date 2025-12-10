package p000;

import java.util.Iterator;

/* renamed from: rm2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22051rm2 extends Ym2 {

    /* renamed from: b */
    public final /* synthetic */ AbstractC19802em2 f77620b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22051rm2(AbstractC19802em2 abstractC19802em2) {
        super(abstractC19802em2, null);
        this.f77620b = abstractC19802em2;
    }

    @Override // p000.Ym2, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C21186mm2(this.f77620b, null);
    }

    public /* synthetic */ C22051rm2(AbstractC19802em2 abstractC19802em2, C20494im2 c20494im2) {
        this(abstractC19802em2);
    }
}