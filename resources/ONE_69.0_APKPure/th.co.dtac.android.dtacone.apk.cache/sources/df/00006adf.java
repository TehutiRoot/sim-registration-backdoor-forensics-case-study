package androidx.core.text;

import java.nio.CharBuffer;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class TextDirectionHeuristicsCompat {
    public static final TextDirectionHeuristicCompat ANYRTL_LTR;
    public static final TextDirectionHeuristicCompat FIRSTSTRONG_LTR;
    public static final TextDirectionHeuristicCompat FIRSTSTRONG_RTL;
    public static final TextDirectionHeuristicCompat LOCALE;
    public static final TextDirectionHeuristicCompat LTR = new C4069e(null, false);
    public static final TextDirectionHeuristicCompat RTL = new C4069e(null, true);

    /* renamed from: androidx.core.text.TextDirectionHeuristicsCompat$a */
    /* loaded from: classes2.dex */
    public static class C4065a implements InterfaceC4067c {

        /* renamed from: b */
        public static final C4065a f34152b = new C4065a(true);

        /* renamed from: a */
        public final boolean f34153a;

        public C4065a(boolean z) {
            this.f34153a = z;
        }

        @Override // androidx.core.text.TextDirectionHeuristicsCompat.InterfaceC4067c
        /* renamed from: a */
        public int mo57029a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int m57031a = TextDirectionHeuristicsCompat.m57031a(Character.getDirectionality(charSequence.charAt(i)));
                if (m57031a != 0) {
                    if (m57031a == 1) {
                        if (!this.f34153a) {
                            return 1;
                        }
                    } else {
                        continue;
                        i++;
                    }
                } else if (this.f34153a) {
                    return 0;
                }
                z = true;
                i++;
            }
            if (z) {
                return this.f34153a ? 1 : 0;
            }
            return 2;
        }
    }

    /* renamed from: androidx.core.text.TextDirectionHeuristicsCompat$b */
    /* loaded from: classes2.dex */
    public static class C4066b implements InterfaceC4067c {

        /* renamed from: a */
        public static final C4066b f34154a = new C4066b();

        @Override // androidx.core.text.TextDirectionHeuristicsCompat.InterfaceC4067c
        /* renamed from: a */
        public int mo57029a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                i4 = TextDirectionHeuristicsCompat.m57030b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i4;
        }
    }

    /* renamed from: androidx.core.text.TextDirectionHeuristicsCompat$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC4067c {
        /* renamed from: a */
        int mo57029a(CharSequence charSequence, int i, int i2);
    }

    /* renamed from: androidx.core.text.TextDirectionHeuristicsCompat$d */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC4068d implements TextDirectionHeuristicCompat {

        /* renamed from: a */
        public final InterfaceC4067c f34155a;

        public AbstractC4068d(InterfaceC4067c interfaceC4067c) {
            this.f34155a = interfaceC4067c;
        }

        /* renamed from: a */
        public abstract boolean mo57027a();

        /* renamed from: b */
        public final boolean m57028b(CharSequence charSequence, int i, int i2) {
            int mo57029a = this.f34155a.mo57029a(charSequence, i, i2);
            if (mo57029a == 0) {
                return true;
            }
            if (mo57029a != 1) {
                return mo57027a();
            }
            return false;
        }

        @Override // androidx.core.text.TextDirectionHeuristicCompat
        public boolean isRtl(char[] cArr, int i, int i2) {
            return isRtl(CharBuffer.wrap(cArr), i, i2);
        }

        @Override // androidx.core.text.TextDirectionHeuristicCompat
        public boolean isRtl(CharSequence charSequence, int i, int i2) {
            if (charSequence != null && i >= 0 && i2 >= 0 && charSequence.length() - i2 >= i) {
                if (this.f34155a == null) {
                    return mo57027a();
                }
                return m57028b(charSequence, i, i2);
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: androidx.core.text.TextDirectionHeuristicsCompat$e */
    /* loaded from: classes2.dex */
    public static class C4069e extends AbstractC4068d {

        /* renamed from: b */
        public final boolean f34156b;

        public C4069e(InterfaceC4067c interfaceC4067c, boolean z) {
            super(interfaceC4067c);
            this.f34156b = z;
        }

        @Override // androidx.core.text.TextDirectionHeuristicsCompat.AbstractC4068d
        /* renamed from: a */
        public boolean mo57027a() {
            return this.f34156b;
        }
    }

    /* renamed from: androidx.core.text.TextDirectionHeuristicsCompat$f */
    /* loaded from: classes2.dex */
    public static class C4070f extends AbstractC4068d {

        /* renamed from: b */
        public static final C4070f f34157b = new C4070f();

        public C4070f() {
            super(null);
        }

        @Override // androidx.core.text.TextDirectionHeuristicsCompat.AbstractC4068d
        /* renamed from: a */
        public boolean mo57027a() {
            if (TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                return true;
            }
            return false;
        }
    }

    static {
        C4066b c4066b = C4066b.f34154a;
        FIRSTSTRONG_LTR = new C4069e(c4066b, false);
        FIRSTSTRONG_RTL = new C4069e(c4066b, true);
        ANYRTL_LTR = new C4069e(C4065a.f34152b, false);
        LOCALE = C4070f.f34157b;
    }

    /* renamed from: a */
    public static int m57031a(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    /* renamed from: b */
    public static int m57030b(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                return 0;
            }
            switch (i) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}