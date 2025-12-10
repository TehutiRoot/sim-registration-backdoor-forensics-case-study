package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class GeneratorSequence implements Sequence {

    /* renamed from: a */
    public final Function0 f70467a;

    /* renamed from: b */
    public final Function1 f70468b;

    public GeneratorSequence(Function0 getInitialValue, Function1 getNextValue) {
        Intrinsics.checkNotNullParameter(getInitialValue, "getInitialValue");
        Intrinsics.checkNotNullParameter(getNextValue, "getNextValue");
        this.f70467a = getInitialValue;
        this.f70468b = getNextValue;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return new GeneratorSequence$iterator$1(this);
    }
}