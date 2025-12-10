package p000;

import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Queues;

/* renamed from: DW1 */
/* loaded from: classes5.dex */
public abstract class DW1 {

    /* renamed from: a */
    public static final Joiner f1044a = Joiner.m41309on("");

    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m68821a(java.util.Deque r8, java.lang.CharSequence r9, int r10, com.google.common.collect.ImmutableMap.Builder r11) {
        /*
            int r0 = r9.length()
            r1 = 0
            r2 = r10
        L6:
            r3 = 58
            r4 = 33
            r5 = 44
            r6 = 63
            if (r2 >= r0) goto L24
            char r1 = r9.charAt(r2)
            r7 = 38
            if (r1 == r7) goto L24
            if (r1 == r6) goto L24
            if (r1 == r4) goto L24
            if (r1 == r3) goto L24
            if (r1 != r5) goto L21
            goto L24
        L21:
            int r2 = r2 + 1
            goto L6
        L24:
            java.lang.CharSequence r7 = r9.subSequence(r10, r2)
            java.lang.CharSequence r7 = m68818d(r7)
            r8.push(r7)
            if (r1 == r4) goto L37
            if (r1 == r6) goto L37
            if (r1 == r3) goto L37
            if (r1 != r5) goto L4a
        L37:
            com.google.common.base.Joiner r3 = p000.DW1.f1044a
            java.lang.String r3 = r3.join(r8)
            int r4 = r3.length()
            if (r4 <= 0) goto L4a
            com.google.thirdparty.publicsuffix.PublicSuffixType r4 = com.google.thirdparty.publicsuffix.PublicSuffixType.fromCode(r1)
            r11.put(r3, r4)
        L4a:
            int r2 = r2 + 1
            if (r1 == r6) goto L65
            if (r1 == r5) goto L65
        L50:
            if (r2 >= r0) goto L65
            int r1 = m68821a(r8, r9, r2, r11)
            int r2 = r2 + r1
            char r1 = r9.charAt(r2)
            if (r1 == r6) goto L63
            char r1 = r9.charAt(r2)
            if (r1 != r5) goto L50
        L63:
            int r2 = r2 + 1
        L65:
            r8.pop()
            int r2 = r2 - r10
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.DW1.m68821a(java.util.Deque, java.lang.CharSequence, int, com.google.common.collect.ImmutableMap$Builder):int");
    }

    /* renamed from: b */
    public static ImmutableMap m68820b(String str) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        int length = str.length();
        int i = 0;
        while (i < length) {
            i += m68821a(Queues.newArrayDeque(), str, i, builder);
        }
        return builder.buildOrThrow();
    }

    /* renamed from: c */
    public static ImmutableMap m68819c(CharSequence... charSequenceArr) {
        return m68820b(f1044a.join(charSequenceArr));
    }

    /* renamed from: d */
    public static CharSequence m68818d(CharSequence charSequence) {
        return new StringBuilder(charSequence).reverse();
    }
}