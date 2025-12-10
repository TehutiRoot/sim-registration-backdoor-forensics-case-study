package org.apache.commons.codec;

import java.util.Comparator;

/* loaded from: classes6.dex */
public class StringEncoderComparator implements Comparator {

    /* renamed from: a */
    public final StringEncoder f73011a;

    @Deprecated
    public StringEncoderComparator() {
        this.f73011a = null;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        try {
            return ((Comparable) this.f73011a.encode(obj)).compareTo((Comparable) this.f73011a.encode(obj2));
        } catch (EncoderException unused) {
            return 0;
        }
    }

    public StringEncoderComparator(StringEncoder stringEncoder) {
        this.f73011a = stringEncoder;
    }
}
