package kotlin.text;

import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* loaded from: classes6.dex */
public final class DelimitedRangesSequence implements Sequence {

    /* renamed from: a */
    public final CharSequence f70530a;

    /* renamed from: b */
    public final int f70531b;

    /* renamed from: c */
    public final int f70532c;

    /* renamed from: d */
    public final Function2 f70533d;

    public DelimitedRangesSequence(CharSequence input, int i, int i2, Function2 getNextMatch) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(getNextMatch, "getNextMatch");
        this.f70530a = input;
        this.f70531b = i;
        this.f70532c = i2;
        this.f70533d = getNextMatch;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return new DelimitedRangesSequence$iterator$1(this);
    }
}