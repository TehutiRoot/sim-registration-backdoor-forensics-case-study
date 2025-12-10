package p000;

import java.util.HashSet;
import java.util.Iterator;
import kotlin.collections.AbstractIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: tJ */
/* loaded from: classes6.dex */
public final class C13990tJ extends AbstractIterator {

    /* renamed from: c */
    public final Iterator f80069c;

    /* renamed from: d */
    public final Function1 f80070d;

    /* renamed from: e */
    public final HashSet f80071e;

    public C13990tJ(Iterator source, Function1 keySelector) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        this.f80069c = source;
        this.f80070d = keySelector;
        this.f80071e = new HashSet();
    }

    @Override // kotlin.collections.AbstractIterator
    public void computeNext() {
        while (this.f80069c.hasNext()) {
            Object next = this.f80069c.next();
            if (this.f80071e.add(this.f80070d.invoke(next))) {
                setNext(next);
                return;
            }
        }
        done();
    }
}
