package androidx.core.text;

import java.nio.CharBuffer;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class TextDirectionHeuristicsCompat {
    public static final TextDirectionHeuristicCompat ANYRTL_LTR;
    public static final TextDirectionHeuristicCompat FIRSTSTRONG_LTR;
    public static final TextDirectionHeuristicCompat FIRSTSTRONG_RTL;
    public static final TextDirectionHeuristicCompat LOCALE;
    public static final TextDirectionHeuristicCompat LTR = new C4087e(null, false);
    public static final TextDirectionHeuristicCompat RTL = new C4087e(null, true);

    /* renamed from: androidx.core.text.TextDirectionHeuristicsCompat$a */
    /* loaded from: classes2.dex */
    public static class C4083a implements InterfaceC4085c {

        /* renamed from: b */
        public static final C4083a f34064b = new C4083a(true);

        /* renamed from: a */
        public final boolean f34065a;

        public C4083a(boolean z) {
            this.f34065a = z;
        }

        @Override // androidx.core.text.TextDirectionHeuristicsCompat.InterfaceC4085c
        /* renamed from: a */
        public int mo57079a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int m57081a = TextDirectionHeuristicsCompat.m57081a(Character.getDirectionality(charSequence.charAt(i)));
                if (m57081a != 0) {
                    if (m57081a == 1) {
                        if (!this.f34065a) {
                            return 1;
                        }
                    } else {
                        continue;
                        i++;
                    }
                } else if (this.f34065a) {
                    return 0;
                }
                z = true;
                i++;
            }
            if (z) {
                return this.f34065a ? 1 : 0;
            }
            return 2;
        }
    }

    /* renamed from: androidx.core.text.TextDirectionHeuristicsCompat$b */
    /* loaded from: classes2.dex */
    public static class C4084b implements InterfaceC4085c {

        /* renamed from: a */
        public static final C4084b f34066a = new C4084b();

        @Override // androidx.core.text.TextDirectionHeuristicsCompat.InterfaceC4085c
        /* renamed from: a */
        public int mo57079a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                i4 = TextDirectionHeuristicsCompat.m57080b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i4;
        }
    }

    /* renamed from: androidx.core.text.TextDirectionHeuristicsCompat$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC4085c {
        /* renamed from: a */
        int mo57079a(CharSequence charSequence, int i, int i2);
    }

    /* renamed from: androidx.core.text.TextDirectionHeuristicsCompat$d */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC4086d implements TextDirectionHeuristicCompat {

        /* renamed from: a */
        public final InterfaceC4085c f34067a;

        public AbstractC4086d(InterfaceC4085c interfaceC4085c) {
            this.f34067a = interfaceC4085c;
        }

        /* renamed from: a */
        public abstract boolean mo57077a();

        /* renamed from: b */
        public final boolean m57078b(CharSequence charSequence, int i, int i2) {
            int mo57079a = this.f34067a.mo57079a(charSequence, i, i2);
            if (mo57079a == 0) {
                return true;
            }
            if (mo57079a != 1) {
                return mo57077a();
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
                if (this.f34067a == null) {
                    return mo57077a();
                }
                return m57078b(charSequence, i, i2);
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: androidx.core.text.TextDirectionHeuristicsCompat$e */
    /* loaded from: classes2.dex */
    public static class C4087e extends AbstractC4086d {

        /* renamed from: b */
        public final boolean f34068b;

        public C4087e(InterfaceC4085c interfaceC4085c, boolean z) {
            super(interfaceC4085c);
            this.f34068b = z;
        }

        @Override // androidx.core.text.TextDirectionHeuristicsCompat.AbstractC4086d
        /* renamed from: a */
        public boolean mo57077a() {
            return this.f34068b;
        }
    }

    /* renamed from: androidx.core.text.TextDirectionHeuristicsCompat$f */
    /* loaded from: classes2.dex */
    public static class C4088f extends AbstractC4086d {

        /* renamed from: b */
        public static final C4088f f34069b = new C4088f();

        public C4088f() {
            super(null);
        }

        @Override // androidx.core.text.TextDirectionHeuristicsCompat.AbstractC4086d
        /* renamed from: a */
        public boolean mo57077a() {
            if (TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                return true;
            }
            return false;
        }
    }

    static {
        C4084b c4084b = C4084b.f34066a;
        FIRSTSTRONG_LTR = new C4087e(c4084b, false);
        FIRSTSTRONG_RTL = new C4087e(c4084b, true);
        ANYRTL_LTR = new C4087e(C4083a.f34064b, false);
        LOCALE = C4088f.f34069b;
    }

    /* renamed from: a */
    public static int m57081a(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    /* renamed from: b */
    public static int m57080b(int i) {
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
