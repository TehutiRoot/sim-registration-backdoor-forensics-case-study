package p000;

import java.util.Spliterator;
import org.apache.commons.codec.language.p027bm.Rule;

/* renamed from: kB1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC20741kB1 {
    /* renamed from: a */
    public static int m29271a(Rule.PhonemeExpr phonemeExpr) {
        Spliterator spliterator;
        long exactSizeIfKnown;
        spliterator = phonemeExpr.getPhonemes().spliterator();
        exactSizeIfKnown = spliterator.getExactSizeIfKnown();
        return (int) Math.min(exactSizeIfKnown, 2147483647L);
    }
}