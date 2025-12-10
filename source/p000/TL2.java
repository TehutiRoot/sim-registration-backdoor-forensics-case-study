package p000;

import java.util.Iterator;

/* renamed from: TL2 */
/* loaded from: classes3.dex */
public final class TL2 extends ZL2 {

    /* renamed from: b */
    public final /* synthetic */ SL2 f5999b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TL2(SL2 sl2) {
        super(sl2, null);
        this.f5999b = sl2;
    }

    @Override // p000.ZL2, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new UL2(this.f5999b, null);
    }

    public /* synthetic */ TL2(SL2 sl2, RL2 rl2) {
        this(sl2);
    }
}
