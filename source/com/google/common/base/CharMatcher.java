package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import java.util.Arrays;
import java.util.BitSet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

@GwtCompatible(emulated = true)
/* loaded from: classes4.dex */
public abstract class CharMatcher implements Predicate<Character> {

    /* renamed from: com.google.common.base.CharMatcher$A */
    /* loaded from: classes4.dex */
    public static class C7389A extends CharMatcher {

        /* renamed from: a */
        public final String f52697a;

        /* renamed from: b */
        public final char[] f52698b;

        /* renamed from: c */
        public final char[] f52699c;

        public C7389A(String str, char[] cArr, char[] cArr2) {
            boolean z;
            boolean z2;
            boolean z3;
            this.f52697a = str;
            this.f52698b = cArr;
            this.f52699c = cArr2;
            if (cArr.length == cArr2.length) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z);
            int i = 0;
            while (i < cArr.length) {
                if (cArr[i] <= cArr2[i]) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Preconditions.checkArgument(z2);
                int i2 = i + 1;
                if (i2 < cArr.length) {
                    if (cArr2[i] < cArr[i2]) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    Preconditions.checkArgument(z3);
                }
                i = i2;
            }
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            int binarySearch = Arrays.binarySearch(this.f52698b, c);
            if (binarySearch >= 0) {
                return true;
            }
            int i = (~binarySearch) - 1;
            if (i >= 0 && c <= this.f52699c[i]) {
                return true;
            }
            return false;
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return this.f52697a;
        }
    }

    /* renamed from: com.google.common.base.CharMatcher$B */
    /* loaded from: classes4.dex */
    public static final class C7390B extends C7389A {

        /* renamed from: d */
        public static final CharMatcher f52700d = new C7390B();

        public C7390B() {
            super("CharMatcher.singleWidth()", "\u0000־א׳\u0600ݐ\u0e00Ḁ℀ﭐﹰ｡".toCharArray(), "ӹ־ת״ۿݿ\u0e7f₯℺\ufdff\ufeffￜ".toCharArray());
        }
    }

    /* renamed from: com.google.common.base.CharMatcher$C */
    /* loaded from: classes4.dex */
    public static final class C7391C extends AbstractC7413v {

        /* renamed from: b */
        public static final int f52701b = Integer.numberOfLeadingZeros(31);

        /* renamed from: c */
        public static final CharMatcher f52702c = new C7391C();

        public C7391C() {
            super("CharMatcher.whitespace()");
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: g */
        public void mo41246g(BitSet bitSet) {
            for (int i = 0; i < 32; i++) {
                bitSet.set("\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt(i));
            }
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            if ("\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c) >>> f52701b) == c) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.common.base.CharMatcher$a */
    /* loaded from: classes4.dex */
    public class C7392a extends C7415x {

        /* renamed from: b */
        public final /* synthetic */ String f52703b;

        /* renamed from: c */
        public final /* synthetic */ CharMatcher f52704c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7392a(CharMatcher charMatcher, CharMatcher charMatcher2, String str) {
            super(charMatcher2);
            this.f52703b = str;
            this.f52704c = charMatcher;
        }

        @Override // com.google.common.base.CharMatcher.C7414w, com.google.common.base.CharMatcher
        public String toString() {
            return this.f52703b;
        }
    }

    /* renamed from: com.google.common.base.CharMatcher$b */
    /* loaded from: classes4.dex */
    public static final class C7393b extends CharMatcher {

        /* renamed from: a */
        public final CharMatcher f52705a;

        /* renamed from: b */
        public final CharMatcher f52706b;

        public C7393b(CharMatcher charMatcher, CharMatcher charMatcher2) {
            this.f52705a = (CharMatcher) Preconditions.checkNotNull(charMatcher);
            this.f52706b = (CharMatcher) Preconditions.checkNotNull(charMatcher2);
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: g */
        public void mo41246g(BitSet bitSet) {
            BitSet bitSet2 = new BitSet();
            this.f52705a.mo41246g(bitSet2);
            BitSet bitSet3 = new BitSet();
            this.f52706b.mo41246g(bitSet3);
            bitSet2.and(bitSet3);
            bitSet.or(bitSet2);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            if (this.f52705a.matches(c) && this.f52706b.matches(c)) {
                return true;
            }
            return false;
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.and(" + this.f52705a + ", " + this.f52706b + ")";
        }
    }

    /* renamed from: com.google.common.base.CharMatcher$c */
    /* loaded from: classes4.dex */
    public static final class C7394c extends AbstractC7413v {

        /* renamed from: b */
        public static final CharMatcher f52707b = new C7394c();

        public C7394c() {
            super("CharMatcher.any()");
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher and(CharMatcher charMatcher) {
            return (CharMatcher) Preconditions.checkNotNull(charMatcher);
        }

        @Override // com.google.common.base.CharMatcher
        public String collapseFrom(CharSequence charSequence, char c) {
            if (charSequence.length() == 0) {
                return "";
            }
            return String.valueOf(c);
        }

        @Override // com.google.common.base.CharMatcher
        public int countIn(CharSequence charSequence) {
            return charSequence.length();
        }

        @Override // com.google.common.base.CharMatcher
        public int indexIn(CharSequence charSequence) {
            return charSequence.length() == 0 ? -1 : 0;
        }

        @Override // com.google.common.base.CharMatcher
        public int lastIndexIn(CharSequence charSequence) {
            return charSequence.length() - 1;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return true;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesAllOf(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return true;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesNoneOf(CharSequence charSequence) {
            if (charSequence.length() == 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.common.base.CharMatcher.AbstractC7400i, com.google.common.base.CharMatcher
        public CharMatcher negate() {
            return CharMatcher.none();
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: or */
        public CharMatcher mo41337or(CharMatcher charMatcher) {
            Preconditions.checkNotNull(charMatcher);
            return this;
        }

        @Override // com.google.common.base.CharMatcher
        public String removeFrom(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return "";
        }

        @Override // com.google.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, char c) {
            char[] cArr = new char[charSequence.length()];
            Arrays.fill(cArr, c);
            return new String(cArr);
        }

        @Override // com.google.common.base.CharMatcher
        public String trimFrom(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return "";
        }

        @Override // com.google.common.base.CharMatcher
        public int indexIn(CharSequence charSequence, int i) {
            int length = charSequence.length();
            Preconditions.checkPositionIndex(i, length);
            if (i == length) {
                return -1;
            }
            return i;
        }

        @Override // com.google.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
            StringBuilder sb = new StringBuilder(charSequence.length() * charSequence2.length());
            for (int i = 0; i < charSequence.length(); i++) {
                sb.append(charSequence2);
            }
            return sb.toString();
        }
    }

    /* renamed from: com.google.common.base.CharMatcher$d */
    /* loaded from: classes4.dex */
    public static final class C7395d extends CharMatcher {

        /* renamed from: a */
        public final char[] f52708a;

        public C7395d(CharSequence charSequence) {
            char[] charArray = charSequence.toString().toCharArray();
            this.f52708a = charArray;
            Arrays.sort(charArray);
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: g */
        public void mo41246g(BitSet bitSet) {
            for (char c : this.f52708a) {
                bitSet.set(c);
            }
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            if (Arrays.binarySearch(this.f52708a, c) >= 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            StringBuilder sb = new StringBuilder("CharMatcher.anyOf(\"");
            for (char c : this.f52708a) {
                sb.append(CharMatcher.m41341h(c));
            }
            sb.append("\")");
            return sb.toString();
        }
    }

    /* renamed from: com.google.common.base.CharMatcher$e */
    /* loaded from: classes4.dex */
    public static final class C7396e extends AbstractC7413v {

        /* renamed from: b */
        public static final CharMatcher f52709b = new C7396e();

        public C7396e() {
            super("CharMatcher.ascii()");
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return c <= 127;
        }
    }

    /* renamed from: com.google.common.base.CharMatcher$f */
    /* loaded from: classes4.dex */
    public static final class C7397f extends AbstractC7413v {

        /* renamed from: b */
        public final BitSet f52710b;

        public /* synthetic */ C7397f(BitSet bitSet, String str, C7392a c7392a) {
            this(bitSet, str);
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: g */
        public void mo41246g(BitSet bitSet) {
            bitSet.or(this.f52710b);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return this.f52710b.get(c);
        }

        public C7397f(BitSet bitSet, String str) {
            super(str);
            this.f52710b = bitSet.length() + 64 < bitSet.size() ? (BitSet) bitSet.clone() : bitSet;
        }
    }

    /* renamed from: com.google.common.base.CharMatcher$g */
    /* loaded from: classes4.dex */
    public static final class C7398g extends CharMatcher {

        /* renamed from: a */
        public static final CharMatcher f52711a = new C7398g();

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            if (c != ' ' && c != 133 && c != 5760) {
                if (c == 8199) {
                    return false;
                }
                if (c != 8287 && c != 12288 && c != 8232 && c != 8233) {
                    switch (c) {
                        case '\t':
                        case '\n':
                        case 11:
                        case '\f':
                        case '\r':
                            break;
                        default:
                            return c >= 8192 && c <= 8202;
                    }
                }
            }
            return true;
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.breakingWhitespace()";
        }
    }

    /* renamed from: com.google.common.base.CharMatcher$h */
    /* loaded from: classes4.dex */
    public static final class C7399h extends C7389A {

        /* renamed from: d */
        public static final CharMatcher f52712d = new C7399h();

        public C7399h() {
            super("CharMatcher.digit()", m41338j(), m41339i());
        }

        /* renamed from: i */
        public static char[] m41339i() {
            char[] cArr = new char[37];
            for (int i = 0; i < 37; i++) {
                cArr[i] = (char) ("0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０".charAt(i) + '\t');
            }
            return cArr;
        }

        /* renamed from: j */
        public static char[] m41338j() {
            return "0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０".toCharArray();
        }
    }

    /* renamed from: com.google.common.base.CharMatcher$i */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC7400i extends CharMatcher {
        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher negate() {
            return new C7415x(this);
        }

        @Override // com.google.common.base.CharMatcher
        public final CharMatcher precomputed() {
            return this;
        }
    }

    /* renamed from: com.google.common.base.CharMatcher$j */
    /* loaded from: classes4.dex */
    public static final class C7401j extends CharMatcher {

        /* renamed from: a */
        public final Predicate f52713a;

        public C7401j(Predicate predicate) {
            this.f52713a = (Predicate) Preconditions.checkNotNull(predicate);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return this.f52713a.apply(Character.valueOf(c));
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.forPredicate(" + this.f52713a + ")";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        public boolean apply(Character ch2) {
            return this.f52713a.apply(Preconditions.checkNotNull(ch2));
        }
    }

    /* renamed from: com.google.common.base.CharMatcher$k */
    /* loaded from: classes4.dex */
    public static final class C7402k extends AbstractC7400i {

        /* renamed from: a */
        public final char f52714a;

        /* renamed from: b */
        public final char f52715b;

        public C7402k(char c, char c2) {
            boolean z;
            if (c2 >= c) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z);
            this.f52714a = c;
            this.f52715b = c2;
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: g */
        public void mo41246g(BitSet bitSet) {
            bitSet.set(this.f52714a, this.f52715b + 1);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            if (this.f52714a <= c && c <= this.f52715b) {
                return true;
            }
            return false;
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.inRange('" + CharMatcher.m41341h(this.f52714a) + "', '" + CharMatcher.m41341h(this.f52715b) + "')";
        }
    }

    /* renamed from: com.google.common.base.CharMatcher$l */
    /* loaded from: classes4.dex */
    public static final class C7403l extends C7389A {

        /* renamed from: d */
        public static final CharMatcher f52716d = new C7403l();

        public C7403l() {
            super("CharMatcher.invisible()", "\u0000\u007f\u00ad\u0600\u061c\u06dd\u070f\u0890\u08e2\u1680\u180e\u2000\u2028\u205f\u2066\u3000\ud800\ufeff\ufff9".toCharArray(), "  \u00ad\u0605\u061c\u06dd\u070f\u0891\u08e2\u1680\u180e\u200f \u2064\u206f\u3000\uf8ff\ufeff\ufffb".toCharArray());
        }
    }

    /* renamed from: com.google.common.base.CharMatcher$m */
    /* loaded from: classes4.dex */
    public static final class C7404m extends AbstractC7400i {

        /* renamed from: a */
        public final char f52717a;

        public C7404m(char c) {
            this.f52717a = c;
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher and(CharMatcher charMatcher) {
            if (charMatcher.matches(this.f52717a)) {
                return this;
            }
            return CharMatcher.none();
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: g */
        public void mo41246g(BitSet bitSet) {
            bitSet.set(this.f52717a);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            if (c == this.f52717a) {
                return true;
            }
            return false;
        }

        @Override // com.google.common.base.CharMatcher.AbstractC7400i, com.google.common.base.CharMatcher
        public CharMatcher negate() {
            return CharMatcher.isNot(this.f52717a);
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: or */
        public CharMatcher mo41337or(CharMatcher charMatcher) {
            if (!charMatcher.matches(this.f52717a)) {
                return super.mo41337or(charMatcher);
            }
            return charMatcher;
        }

        @Override // com.google.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, char c) {
            return charSequence.toString().replace(this.f52717a, c);
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.is('" + CharMatcher.m41341h(this.f52717a) + "')";
        }
    }

    /* renamed from: com.google.common.base.CharMatcher$n */
    /* loaded from: classes4.dex */
    public static final class C7405n extends AbstractC7400i {

        /* renamed from: a */
        public final char f52718a;

        /* renamed from: b */
        public final char f52719b;

        public C7405n(char c, char c2) {
            this.f52718a = c;
            this.f52719b = c2;
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: g */
        public void mo41246g(BitSet bitSet) {
            bitSet.set(this.f52718a);
            bitSet.set(this.f52719b);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            if (c != this.f52718a && c != this.f52719b) {
                return false;
            }
            return true;
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.anyOf(\"" + CharMatcher.m41341h(this.f52718a) + CharMatcher.m41341h(this.f52719b) + "\")";
        }
    }

    /* renamed from: com.google.common.base.CharMatcher$o */
    /* loaded from: classes4.dex */
    public static final class C7406o extends AbstractC7400i {

        /* renamed from: a */
        public final char f52720a;

        public C7406o(char c) {
            this.f52720a = c;
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher and(CharMatcher charMatcher) {
            if (charMatcher.matches(this.f52720a)) {
                return super.and(charMatcher);
            }
            return charMatcher;
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: g */
        public void mo41246g(BitSet bitSet) {
            bitSet.set(0, this.f52720a);
            bitSet.set(this.f52720a + 1, 65536);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            if (c != this.f52720a) {
                return true;
            }
            return false;
        }

        @Override // com.google.common.base.CharMatcher.AbstractC7400i, com.google.common.base.CharMatcher
        public CharMatcher negate() {
            return CharMatcher.m41340is(this.f52720a);
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: or */
        public CharMatcher mo41337or(CharMatcher charMatcher) {
            if (charMatcher.matches(this.f52720a)) {
                return CharMatcher.any();
            }
            return this;
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.isNot('" + CharMatcher.m41341h(this.f52720a) + "')";
        }
    }

    /* renamed from: com.google.common.base.CharMatcher$p */
    /* loaded from: classes4.dex */
    public static final class C7407p extends CharMatcher {

        /* renamed from: a */
        public static final CharMatcher f52721a = new C7407p();

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return Character.isDigit(c);
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaDigit()";
        }
    }

    /* renamed from: com.google.common.base.CharMatcher$q */
    /* loaded from: classes4.dex */
    public static final class C7408q extends AbstractC7413v {

        /* renamed from: b */
        public static final CharMatcher f52722b = new C7408q();

        public C7408q() {
            super("CharMatcher.javaIsoControl()");
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return c <= 31 || (c >= 127 && c <= 159);
        }
    }

    /* renamed from: com.google.common.base.CharMatcher$r */
    /* loaded from: classes4.dex */
    public static final class C7409r extends CharMatcher {

        /* renamed from: a */
        public static final CharMatcher f52723a = new C7409r();

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return Character.isLetter(c);
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaLetter()";
        }
    }

    /* renamed from: com.google.common.base.CharMatcher$s */
    /* loaded from: classes4.dex */
    public static final class C7410s extends CharMatcher {

        /* renamed from: a */
        public static final CharMatcher f52724a = new C7410s();

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return Character.isLetterOrDigit(c);
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaLetterOrDigit()";
        }
    }

    /* renamed from: com.google.common.base.CharMatcher$t */
    /* loaded from: classes4.dex */
    public static final class C7411t extends CharMatcher {

        /* renamed from: a */
        public static final CharMatcher f52725a = new C7411t();

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return Character.isLowerCase(c);
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaLowerCase()";
        }
    }

    /* renamed from: com.google.common.base.CharMatcher$u */
    /* loaded from: classes4.dex */
    public static final class C7412u extends CharMatcher {

        /* renamed from: a */
        public static final CharMatcher f52726a = new C7412u();

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return Character.isUpperCase(c);
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaUpperCase()";
        }
    }

    /* renamed from: com.google.common.base.CharMatcher$v */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC7413v extends AbstractC7400i {

        /* renamed from: a */
        public final String f52727a;

        public AbstractC7413v(String str) {
            this.f52727a = (String) Preconditions.checkNotNull(str);
        }

        @Override // com.google.common.base.CharMatcher
        public final String toString() {
            return this.f52727a;
        }
    }

    /* renamed from: com.google.common.base.CharMatcher$w */
    /* loaded from: classes4.dex */
    public static class C7414w extends CharMatcher {

        /* renamed from: a */
        public final CharMatcher f52728a;

        public C7414w(CharMatcher charMatcher) {
            this.f52728a = (CharMatcher) Preconditions.checkNotNull(charMatcher);
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.CharMatcher
        public int countIn(CharSequence charSequence) {
            return charSequence.length() - this.f52728a.countIn(charSequence);
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: g */
        public void mo41246g(BitSet bitSet) {
            BitSet bitSet2 = new BitSet();
            this.f52728a.mo41246g(bitSet2);
            bitSet2.flip(0, 65536);
            bitSet.or(bitSet2);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return !this.f52728a.matches(c);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesAllOf(CharSequence charSequence) {
            return this.f52728a.matchesNoneOf(charSequence);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesNoneOf(CharSequence charSequence) {
            return this.f52728a.matchesAllOf(charSequence);
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher negate() {
            return this.f52728a;
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return this.f52728a + ".negate()";
        }
    }

    /* renamed from: com.google.common.base.CharMatcher$x */
    /* loaded from: classes4.dex */
    public static class C7415x extends C7414w {
        public C7415x(CharMatcher charMatcher) {
            super(charMatcher);
        }

        @Override // com.google.common.base.CharMatcher
        public final CharMatcher precomputed() {
            return this;
        }
    }

    /* renamed from: com.google.common.base.CharMatcher$y */
    /* loaded from: classes4.dex */
    public static final class C7416y extends AbstractC7413v {

        /* renamed from: b */
        public static final CharMatcher f52729b = new C7416y();

        public C7416y() {
            super("CharMatcher.none()");
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher and(CharMatcher charMatcher) {
            Preconditions.checkNotNull(charMatcher);
            return this;
        }

        @Override // com.google.common.base.CharMatcher
        public String collapseFrom(CharSequence charSequence, char c) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.CharMatcher
        public int countIn(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return 0;
        }

        @Override // com.google.common.base.CharMatcher
        public int indexIn(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return -1;
        }

        @Override // com.google.common.base.CharMatcher
        public int lastIndexIn(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return -1;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return false;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesAllOf(CharSequence charSequence) {
            if (charSequence.length() == 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesNoneOf(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return true;
        }

        @Override // com.google.common.base.CharMatcher.AbstractC7400i, com.google.common.base.CharMatcher
        public CharMatcher negate() {
            return CharMatcher.any();
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: or */
        public CharMatcher mo41337or(CharMatcher charMatcher) {
            return (CharMatcher) Preconditions.checkNotNull(charMatcher);
        }

        @Override // com.google.common.base.CharMatcher
        public String removeFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, char c) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.CharMatcher
        public String trimFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.CharMatcher
        public String trimLeadingFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.CharMatcher
        public String trimTrailingFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.CharMatcher
        public int indexIn(CharSequence charSequence, int i) {
            Preconditions.checkPositionIndex(i, charSequence.length());
            return -1;
        }

        @Override // com.google.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
            Preconditions.checkNotNull(charSequence2);
            return charSequence.toString();
        }
    }

    /* renamed from: com.google.common.base.CharMatcher$z */
    /* loaded from: classes4.dex */
    public static final class C7417z extends CharMatcher {

        /* renamed from: a */
        public final CharMatcher f52730a;

        /* renamed from: b */
        public final CharMatcher f52731b;

        public C7417z(CharMatcher charMatcher, CharMatcher charMatcher2) {
            this.f52730a = (CharMatcher) Preconditions.checkNotNull(charMatcher);
            this.f52731b = (CharMatcher) Preconditions.checkNotNull(charMatcher2);
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: g */
        public void mo41246g(BitSet bitSet) {
            this.f52730a.mo41246g(bitSet);
            this.f52731b.mo41246g(bitSet);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            if (!this.f52730a.matches(c) && !this.f52731b.matches(c)) {
                return false;
            }
            return true;
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.or(" + this.f52730a + ", " + this.f52731b + ")";
        }
    }

    public static CharMatcher any() {
        return C7394c.f52707b;
    }

    public static CharMatcher anyOf(CharSequence charSequence) {
        int length = charSequence.length();
        if (length != 0) {
            if (length != 1) {
                if (length != 2) {
                    return new C7395d(charSequence);
                }
                return m41345c(charSequence.charAt(0), charSequence.charAt(1));
            }
            return m41340is(charSequence.charAt(0));
        }
        return none();
    }

    public static CharMatcher ascii() {
        return C7396e.f52709b;
    }

    public static CharMatcher breakingWhitespace() {
        return C7398g.f52711a;
    }

    /* renamed from: c */
    public static C7405n m41345c(char c, char c2) {
        return new C7405n(c, c2);
    }

    /* renamed from: d */
    public static boolean m41344d(int i, int i2) {
        return i <= 1023 && i2 > i * 64;
    }

    @Deprecated
    public static CharMatcher digit() {
        return C7399h.f52712d;
    }

    /* renamed from: f */
    public static CharMatcher m41342f(int i, BitSet bitSet, String str) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (m41344d(i, bitSet.length())) {
                        return C7458b.m41243k(bitSet, str);
                    }
                    return new C7397f(bitSet, str, null);
                }
                char nextSetBit = (char) bitSet.nextSetBit(0);
                return m41345c(nextSetBit, (char) bitSet.nextSetBit(nextSetBit + 1));
            }
            return m41340is((char) bitSet.nextSetBit(0));
        }
        return none();
    }

    public static CharMatcher forPredicate(Predicate<? super Character> predicate) {
        if (predicate instanceof CharMatcher) {
            return (CharMatcher) predicate;
        }
        return new C7401j(predicate);
    }

    /* renamed from: h */
    public static String m41341h(char c) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = AbstractJsonLexerKt.UNICODE_ESC;
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public static CharMatcher inRange(char c, char c2) {
        return new C7402k(c, c2);
    }

    @Deprecated
    public static CharMatcher invisible() {
        return C7403l.f52716d;
    }

    /* renamed from: is */
    public static CharMatcher m41340is(char c) {
        return new C7404m(c);
    }

    public static CharMatcher isNot(char c) {
        return new C7406o(c);
    }

    @Deprecated
    public static CharMatcher javaDigit() {
        return C7407p.f52721a;
    }

    public static CharMatcher javaIsoControl() {
        return C7408q.f52722b;
    }

    @Deprecated
    public static CharMatcher javaLetter() {
        return C7409r.f52723a;
    }

    @Deprecated
    public static CharMatcher javaLetterOrDigit() {
        return C7410s.f52724a;
    }

    @Deprecated
    public static CharMatcher javaLowerCase() {
        return C7411t.f52725a;
    }

    @Deprecated
    public static CharMatcher javaUpperCase() {
        return C7412u.f52726a;
    }

    public static CharMatcher none() {
        return C7416y.f52729b;
    }

    public static CharMatcher noneOf(CharSequence charSequence) {
        return anyOf(charSequence).negate();
    }

    @Deprecated
    public static CharMatcher singleWidth() {
        return C7390B.f52700d;
    }

    public static CharMatcher whitespace() {
        return C7391C.f52702c;
    }

    public CharMatcher and(CharMatcher charMatcher) {
        return new C7393b(this, charMatcher);
    }

    /* renamed from: b */
    public final String m41346b(CharSequence charSequence, int i, int i2, char c, StringBuilder sb, boolean z) {
        while (i < i2) {
            char charAt = charSequence.charAt(i);
            if (matches(charAt)) {
                if (!z) {
                    sb.append(c);
                    z = true;
                }
            } else {
                sb.append(charAt);
                z = false;
            }
            i++;
        }
        return sb.toString();
    }

    public String collapseFrom(CharSequence charSequence, char c) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (matches(charAt)) {
                if (charAt == c && (i == length - 1 || !matches(charSequence.charAt(i + 1)))) {
                    i++;
                } else {
                    StringBuilder sb = new StringBuilder(length);
                    sb.append(charSequence, 0, i);
                    sb.append(c);
                    return m41346b(charSequence, i + 1, length, c, sb, true);
                }
            }
            i++;
        }
        return charSequence.toString();
    }

    public int countIn(CharSequence charSequence) {
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (matches(charSequence.charAt(i2))) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: e */
    public CharMatcher m41343e() {
        String str;
        BitSet bitSet = new BitSet();
        mo41246g(bitSet);
        int cardinality = bitSet.cardinality();
        if (cardinality * 2 <= 65536) {
            return m41342f(cardinality, bitSet, toString());
        }
        bitSet.flip(0, 65536);
        int i = 65536 - cardinality;
        String charMatcher = toString();
        if (charMatcher.endsWith(".negate()")) {
            str = charMatcher.substring(0, charMatcher.length() - 9);
        } else {
            str = charMatcher + ".negate()";
        }
        return new C7392a(this, m41342f(i, bitSet, str), charMatcher);
    }

    /* renamed from: g */
    public void mo41246g(BitSet bitSet) {
        for (int i = 65535; i >= 0; i--) {
            if (matches((char) i)) {
                bitSet.set(i);
            }
        }
    }

    public int indexIn(CharSequence charSequence) {
        return indexIn(charSequence, 0);
    }

    public int lastIndexIn(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (matches(charSequence.charAt(length))) {
                return length;
            }
        }
        return -1;
    }

    public abstract boolean matches(char c);

    public boolean matchesAllOf(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!matches(charSequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }

    public boolean matchesAnyOf(CharSequence charSequence) {
        return !matchesNoneOf(charSequence);
    }

    public boolean matchesNoneOf(CharSequence charSequence) {
        if (indexIn(charSequence) == -1) {
            return true;
        }
        return false;
    }

    public CharMatcher negate() {
        return new C7414w(this);
    }

    /* renamed from: or */
    public CharMatcher mo41337or(CharMatcher charMatcher) {
        return new C7417z(this, charMatcher);
    }

    public CharMatcher precomputed() {
        return AbstractC7455a.m41250h(this);
    }

    public String removeFrom(CharSequence charSequence) {
        String charSequence2 = charSequence.toString();
        int indexIn = indexIn(charSequence2);
        if (indexIn == -1) {
            return charSequence2;
        }
        char[] charArray = charSequence2.toCharArray();
        int i = 1;
        while (true) {
            indexIn++;
            while (indexIn != charArray.length) {
                if (matches(charArray[indexIn])) {
                    break;
                }
                charArray[indexIn - i] = charArray[indexIn];
                indexIn++;
            }
            return new String(charArray, 0, indexIn - i);
            i++;
        }
    }

    public String replaceFrom(CharSequence charSequence, char c) {
        String charSequence2 = charSequence.toString();
        int indexIn = indexIn(charSequence2);
        if (indexIn == -1) {
            return charSequence2;
        }
        char[] charArray = charSequence2.toCharArray();
        charArray[indexIn] = c;
        while (true) {
            indexIn++;
            if (indexIn < charArray.length) {
                if (matches(charArray[indexIn])) {
                    charArray[indexIn] = c;
                }
            } else {
                return new String(charArray);
            }
        }
    }

    public String retainFrom(CharSequence charSequence) {
        return negate().removeFrom(charSequence);
    }

    public String toString() {
        return super.toString();
    }

    public String trimAndCollapseFrom(CharSequence charSequence, char c) {
        int length = charSequence.length();
        int i = length - 1;
        int i2 = 0;
        while (i2 < length && matches(charSequence.charAt(i2))) {
            i2++;
        }
        int i3 = i;
        while (i3 > i2 && matches(charSequence.charAt(i3))) {
            i3--;
        }
        if (i2 == 0 && i3 == i) {
            return collapseFrom(charSequence, c);
        }
        int i4 = i3 + 1;
        return m41346b(charSequence, i2, i4, c, new StringBuilder(i4 - i2), false);
    }

    public String trimFrom(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && matches(charSequence.charAt(i))) {
            i++;
        }
        int i2 = length - 1;
        while (i2 > i && matches(charSequence.charAt(i2))) {
            i2--;
        }
        return charSequence.subSequence(i, i2 + 1).toString();
    }

    public String trimLeadingFrom(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!matches(charSequence.charAt(i))) {
                return charSequence.subSequence(i, length).toString();
            }
        }
        return "";
    }

    public String trimTrailingFrom(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!matches(charSequence.charAt(length))) {
                return charSequence.subSequence(0, length + 1).toString();
            }
        }
        return "";
    }

    @Override // com.google.common.base.Predicate
    @Deprecated
    public boolean apply(Character ch2) {
        return matches(ch2.charValue());
    }

    public int indexIn(CharSequence charSequence, int i) {
        int length = charSequence.length();
        Preconditions.checkPositionIndex(i, length);
        while (i < length) {
            if (matches(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
        int length = charSequence2.length();
        if (length == 0) {
            return removeFrom(charSequence);
        }
        int i = 0;
        if (length == 1) {
            return replaceFrom(charSequence, charSequence2.charAt(0));
        }
        String charSequence3 = charSequence.toString();
        int indexIn = indexIn(charSequence3);
        if (indexIn == -1) {
            return charSequence3;
        }
        int length2 = charSequence3.length();
        StringBuilder sb = new StringBuilder(((length2 * 3) / 2) + 16);
        do {
            sb.append((CharSequence) charSequence3, i, indexIn);
            sb.append(charSequence2);
            i = indexIn + 1;
            indexIn = indexIn(charSequence3, i);
        } while (indexIn != -1);
        sb.append((CharSequence) charSequence3, i, length2);
        return sb.toString();
    }
}
