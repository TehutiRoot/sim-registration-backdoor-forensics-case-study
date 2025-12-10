package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.EmojiCompat;
import androidx.emoji2.text.MetadataRepo;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* renamed from: androidx.emoji2.text.b */
/* loaded from: classes2.dex */
public final class C4511b {

    /* renamed from: a */
    public final EmojiCompat.SpanFactory f35280a;

    /* renamed from: b */
    public final MetadataRepo f35281b;

    /* renamed from: c */
    public EmojiCompat.GlyphChecker f35282c;

    /* renamed from: d */
    public final boolean f35283d;

    /* renamed from: e */
    public final int[] f35284e;

    /* renamed from: androidx.emoji2.text.b$a */
    /* loaded from: classes2.dex */
    public static final class C4512a {
        /* renamed from: a */
        public static int m54674a(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    i--;
                    if (i < 0) {
                        if (z) {
                            return -1;
                        }
                        return 0;
                    }
                    char charAt = charSequence.charAt(i);
                    if (z) {
                        if (!Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        i2--;
                    } else if (!Character.isSurrogate(charAt)) {
                        i2--;
                    } else if (Character.isHighSurrogate(charAt)) {
                        return -1;
                    } else {
                        z = true;
                    }
                }
                return i;
            }
        }

        /* renamed from: b */
        public static int m54673b(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    if (i >= length) {
                        if (z) {
                            return -1;
                        }
                        return length;
                    }
                    char charAt = charSequence.charAt(i);
                    if (z) {
                        if (!Character.isLowSurrogate(charAt)) {
                            return -1;
                        }
                        i2--;
                        i++;
                    } else if (!Character.isSurrogate(charAt)) {
                        i2--;
                        i++;
                    } else if (Character.isLowSurrogate(charAt)) {
                        return -1;
                    } else {
                        i++;
                        z = true;
                    }
                }
                return i;
            }
        }
    }

    /* renamed from: androidx.emoji2.text.b$b */
    /* loaded from: classes2.dex */
    public static class C4513b implements InterfaceC4514c {

        /* renamed from: a */
        public C22012rZ1 f35285a;

        /* renamed from: b */
        public final EmojiCompat.SpanFactory f35286b;

        public C4513b(C22012rZ1 c22012rZ1, EmojiCompat.SpanFactory spanFactory) {
            this.f35285a = c22012rZ1;
            this.f35286b = spanFactory;
        }

        @Override // androidx.emoji2.text.C4511b.InterfaceC4514c
        /* renamed from: a */
        public boolean mo54670a(CharSequence charSequence, int i, int i2, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            Spannable spannableString;
            if (typefaceEmojiRasterizer.isPreferredSystemRender()) {
                return true;
            }
            if (this.f35285a == null) {
                if (charSequence instanceof Spannable) {
                    spannableString = (Spannable) charSequence;
                } else {
                    spannableString = new SpannableString(charSequence);
                }
                this.f35285a = new C22012rZ1(spannableString);
            }
            this.f35285a.setSpan(this.f35286b.createSpan(typefaceEmojiRasterizer), i, i2, 33);
            return true;
        }

        @Override // androidx.emoji2.text.C4511b.InterfaceC4514c
        /* renamed from: b */
        public C22012rZ1 getResult() {
            return this.f35285a;
        }
    }

    /* renamed from: androidx.emoji2.text.b$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC4514c {
        /* renamed from: a */
        boolean mo54670a(CharSequence charSequence, int i, int i2, TypefaceEmojiRasterizer typefaceEmojiRasterizer);

        Object getResult();
    }

    /* renamed from: androidx.emoji2.text.b$d */
    /* loaded from: classes2.dex */
    public static class C4515d implements InterfaceC4514c {

        /* renamed from: a */
        public final int f35287a;

        /* renamed from: b */
        public int f35288b = -1;

        /* renamed from: c */
        public int f35289c = -1;

        public C4515d(int i) {
            this.f35287a = i;
        }

        @Override // androidx.emoji2.text.C4511b.InterfaceC4514c
        /* renamed from: a */
        public boolean mo54670a(CharSequence charSequence, int i, int i2, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            int i3 = this.f35287a;
            if (i <= i3 && i3 < i2) {
                this.f35288b = i;
                this.f35289c = i2;
                return false;
            } else if (i2 > i3) {
                return false;
            } else {
                return true;
            }
        }

        @Override // androidx.emoji2.text.C4511b.InterfaceC4514c
        /* renamed from: b */
        public C4515d getResult() {
            return this;
        }
    }

    /* renamed from: androidx.emoji2.text.b$e */
    /* loaded from: classes2.dex */
    public static class C4516e implements InterfaceC4514c {

        /* renamed from: a */
        public final String f35290a;

        public C4516e(String str) {
            this.f35290a = str;
        }

        @Override // androidx.emoji2.text.C4511b.InterfaceC4514c
        /* renamed from: a */
        public boolean mo54670a(CharSequence charSequence, int i, int i2, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            if (!TextUtils.equals(charSequence.subSequence(i, i2), this.f35290a)) {
                return true;
            }
            typefaceEmojiRasterizer.setExclusion(true);
            return false;
        }

        @Override // androidx.emoji2.text.C4511b.InterfaceC4514c
        /* renamed from: b */
        public C4516e getResult() {
            return this;
        }
    }

    /* renamed from: androidx.emoji2.text.b$f */
    /* loaded from: classes2.dex */
    public static final class C4517f {

        /* renamed from: a */
        public int f35291a = 1;

        /* renamed from: b */
        public final MetadataRepo.C4508a f35292b;

        /* renamed from: c */
        public MetadataRepo.C4508a f35293c;

        /* renamed from: d */
        public MetadataRepo.C4508a f35294d;

        /* renamed from: e */
        public int f35295e;

        /* renamed from: f */
        public int f35296f;

        /* renamed from: g */
        public final boolean f35297g;

        /* renamed from: h */
        public final int[] f35298h;

        public C4517f(MetadataRepo.C4508a c4508a, boolean z, int[] iArr) {
            this.f35292b = c4508a;
            this.f35293c = c4508a;
            this.f35297g = z;
            this.f35298h = iArr;
        }

        /* renamed from: d */
        public static boolean m54665d(int i) {
            return i == 65039;
        }

        /* renamed from: f */
        public static boolean m54663f(int i) {
            return i == 65038;
        }

        /* renamed from: a */
        public int m54668a(int i) {
            MetadataRepo.C4508a m54704a = this.f35293c.m54704a(i);
            int i2 = 2;
            if (this.f35291a != 2) {
                if (m54704a == null) {
                    i2 = m54662g();
                } else {
                    this.f35291a = 2;
                    this.f35293c = m54704a;
                    this.f35296f = 1;
                }
            } else if (m54704a != null) {
                this.f35293c = m54704a;
                this.f35296f++;
            } else if (m54663f(i)) {
                i2 = m54662g();
            } else if (!m54665d(i)) {
                if (this.f35293c.m54703b() != null) {
                    i2 = 3;
                    if (this.f35296f == 1) {
                        if (m54661h()) {
                            this.f35294d = this.f35293c;
                            m54662g();
                        } else {
                            i2 = m54662g();
                        }
                    } else {
                        this.f35294d = this.f35293c;
                        m54662g();
                    }
                } else {
                    i2 = m54662g();
                }
            }
            this.f35295e = i;
            return i2;
        }

        /* renamed from: b */
        public TypefaceEmojiRasterizer m54667b() {
            return this.f35293c.m54703b();
        }

        /* renamed from: c */
        public TypefaceEmojiRasterizer m54666c() {
            return this.f35294d.m54703b();
        }

        /* renamed from: e */
        public boolean m54664e() {
            if (this.f35291a == 2 && this.f35293c.m54703b() != null && (this.f35296f > 1 || m54661h())) {
                return true;
            }
            return false;
        }

        /* renamed from: g */
        public final int m54662g() {
            this.f35291a = 1;
            this.f35293c = this.f35292b;
            this.f35296f = 0;
            return 1;
        }

        /* renamed from: h */
        public final boolean m54661h() {
            if (this.f35293c.m54703b().isDefaultEmoji() || m54665d(this.f35295e)) {
                return true;
            }
            if (this.f35297g) {
                if (this.f35298h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f35298h, this.f35293c.m54703b().getCodepointAt(0)) < 0) {
                    return true;
                }
            }
            return false;
        }
    }

    public C4511b(MetadataRepo metadataRepo, EmojiCompat.SpanFactory spanFactory, EmojiCompat.GlyphChecker glyphChecker, boolean z, int[] iArr, Set set) {
        this.f35280a = spanFactory;
        this.f35281b = metadataRepo;
        this.f35282c = glyphChecker;
        this.f35283d = z;
        this.f35284e = iArr;
        m54677k(set);
    }

    /* renamed from: a */
    public static boolean m54687a(Editable editable, KeyEvent keyEvent, boolean z) {
        EmojiSpan[] emojiSpanArr;
        if (m54678j(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!m54679i(selectionStart, selectionEnd) && (emojiSpanArr = (EmojiSpan[]) editable.getSpans(selectionStart, selectionEnd, EmojiSpan.class)) != null && emojiSpanArr.length > 0) {
            for (EmojiSpan emojiSpan : emojiSpanArr) {
                int spanStart = editable.getSpanStart(emojiSpan);
                int spanEnd = editable.getSpanEnd(emojiSpan);
                if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m54682f(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
        int max;
        int min;
        if (editable != null && inputConnection != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (m54679i(selectionStart, selectionEnd)) {
                return false;
            }
            if (z) {
                max = C4512a.m54674a(editable, selectionStart, Math.max(i, 0));
                min = C4512a.m54673b(editable, selectionEnd, Math.max(i2, 0));
                if (max == -1 || min == -1) {
                    return false;
                }
            } else {
                max = Math.max(selectionStart - i, 0);
                min = Math.min(selectionEnd + i2, editable.length());
            }
            EmojiSpan[] emojiSpanArr = (EmojiSpan[]) editable.getSpans(max, min, EmojiSpan.class);
            if (emojiSpanArr != null && emojiSpanArr.length > 0) {
                for (EmojiSpan emojiSpan : emojiSpanArr) {
                    int spanStart = editable.getSpanStart(emojiSpan);
                    int spanEnd = editable.getSpanEnd(emojiSpan);
                    max = Math.min(spanStart, max);
                    min = Math.max(spanEnd, min);
                }
                int max2 = Math.max(max, 0);
                int min2 = Math.min(min, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(max2, min2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m54681g(Editable editable, int i, KeyEvent keyEvent) {
        boolean m54687a;
        if (i != 67) {
            if (i != 112) {
                m54687a = false;
            } else {
                m54687a = m54687a(editable, keyEvent, true);
            }
        } else {
            m54687a = m54687a(editable, keyEvent, false);
        }
        if (!m54687a) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    /* renamed from: i */
    public static boolean m54679i(int i, int i2) {
        return i == -1 || i2 == -1 || i != i2;
    }

    /* renamed from: j */
    public static boolean m54678j(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    /* renamed from: b */
    public int m54686b(CharSequence charSequence, int i) {
        if (i >= 0 && i < charSequence.length()) {
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                EmojiSpan[] emojiSpanArr = (EmojiSpan[]) spanned.getSpans(i, i + 1, EmojiSpan.class);
                if (emojiSpanArr.length > 0) {
                    return spanned.getSpanEnd(emojiSpanArr[0]);
                }
            }
            return ((C4515d) m54675m(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Integer.MAX_VALUE, true, new C4515d(i))).f35289c;
        }
        return -1;
    }

    /* renamed from: c */
    public int m54685c(CharSequence charSequence) {
        return m54684d(charSequence, this.f35281b.m54708b());
    }

    /* renamed from: d */
    public int m54684d(CharSequence charSequence, int i) {
        C4517f c4517f = new C4517f(this.f35281b.m54707c(), this.f35283d, this.f35284e);
        int length = charSequence.length();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            int codePointAt = Character.codePointAt(charSequence, i2);
            int m54668a = c4517f.m54668a(codePointAt);
            TypefaceEmojiRasterizer m54667b = c4517f.m54667b();
            if (m54668a != 1) {
                if (m54668a != 2) {
                    if (m54668a == 3) {
                        m54667b = c4517f.m54666c();
                        if (m54667b.getCompatAdded() <= i) {
                            i3++;
                        }
                    }
                } else {
                    i2 += Character.charCount(codePointAt);
                }
            } else {
                i2 += Character.charCount(codePointAt);
                i4 = 0;
            }
            if (m54667b != null && m54667b.getCompatAdded() <= i) {
                i4++;
            }
        }
        if (i3 != 0) {
            return 2;
        }
        if (c4517f.m54664e() && c4517f.m54667b().getCompatAdded() <= i) {
            return 1;
        }
        if (i4 == 0) {
            return 0;
        }
        return 2;
    }

    /* renamed from: e */
    public int m54683e(CharSequence charSequence, int i) {
        if (i >= 0 && i < charSequence.length()) {
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                EmojiSpan[] emojiSpanArr = (EmojiSpan[]) spanned.getSpans(i, i + 1, EmojiSpan.class);
                if (emojiSpanArr.length > 0) {
                    return spanned.getSpanStart(emojiSpanArr[0]);
                }
            }
            return ((C4515d) m54675m(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Integer.MAX_VALUE, true, new C4515d(i))).f35288b;
        }
        return -1;
    }

    /* renamed from: h */
    public final boolean m54680h(CharSequence charSequence, int i, int i2, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
        if (typefaceEmojiRasterizer.getHasGlyph() == 0) {
            typefaceEmojiRasterizer.setHasGlyph(this.f35282c.hasGlyph(charSequence, i, i2, typefaceEmojiRasterizer.getSdkAdded()));
        }
        if (typefaceEmojiRasterizer.getHasGlyph() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final void m54677k(Set set) {
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            m54675m(str, 0, str.length(), 1, true, new C4516e(str));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0049 A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:7:0x000e, B:10:0x0013, B:12:0x0017, B:14:0x0024, B:21:0x003a, B:23:0x0042, B:25:0x0045, B:27:0x0049, B:29:0x0055, B:30:0x0058, B:33:0x0066, B:39:0x0074, B:40:0x0080, B:42:0x0094, B:18:0x002f), top: B:55:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0094 A[Catch: all -> 0x002a, TRY_LEAVE, TryCatch #0 {all -> 0x002a, blocks: (B:7:0x000e, B:10:0x0013, B:12:0x0017, B:14:0x0024, B:21:0x003a, B:23:0x0042, B:25:0x0045, B:27:0x0049, B:29:0x0055, B:30:0x0058, B:33:0x0066, B:39:0x0074, B:40:0x0080, B:42:0x0094, B:18:0x002f), top: B:55:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a0  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.CharSequence m54676l(java.lang.CharSequence r11, int r12, int r13, int r14, boolean r15) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof androidx.emoji2.text.SpannableBuilder
            if (r0 == 0) goto La
            r1 = r11
            androidx.emoji2.text.SpannableBuilder r1 = (androidx.emoji2.text.SpannableBuilder) r1
            r1.beginBatchEdit()
        La:
            java.lang.Class<androidx.emoji2.text.EmojiSpan> r1 = androidx.emoji2.text.EmojiSpan.class
            if (r0 != 0) goto L2f
            boolean r2 = r11 instanceof android.text.Spannable     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L13
            goto L2f
        L13:
            boolean r2 = r11 instanceof android.text.Spanned     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L2d
            r2 = r11
            android.text.Spanned r2 = (android.text.Spanned) r2     // Catch: java.lang.Throwable -> L2a
            int r3 = r12 + (-1)
            int r4 = r13 + 1
            int r2 = r2.nextSpanTransition(r3, r4, r1)     // Catch: java.lang.Throwable -> L2a
            if (r2 > r13) goto L2d
            rZ1 r2 = new rZ1     // Catch: java.lang.Throwable -> L2a
            r2.<init>(r11)     // Catch: java.lang.Throwable -> L2a
            goto L37
        L2a:
            r12 = move-exception
            goto Lb2
        L2d:
            r2 = 0
            goto L37
        L2f:
            rZ1 r2 = new rZ1     // Catch: java.lang.Throwable -> L2a
            r3 = r11
            android.text.Spannable r3 = (android.text.Spannable) r3     // Catch: java.lang.Throwable -> L2a
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L2a
        L37:
            r3 = 0
            if (r2 == 0) goto L63
            java.lang.Object[] r4 = r2.getSpans(r12, r13, r1)     // Catch: java.lang.Throwable -> L2a
            androidx.emoji2.text.EmojiSpan[] r4 = (androidx.emoji2.text.EmojiSpan[]) r4     // Catch: java.lang.Throwable -> L2a
            if (r4 == 0) goto L63
            int r5 = r4.length     // Catch: java.lang.Throwable -> L2a
            if (r5 <= 0) goto L63
            int r5 = r4.length     // Catch: java.lang.Throwable -> L2a
            r6 = 0
        L47:
            if (r6 >= r5) goto L63
            r7 = r4[r6]     // Catch: java.lang.Throwable -> L2a
            int r8 = r2.getSpanStart(r7)     // Catch: java.lang.Throwable -> L2a
            int r9 = r2.getSpanEnd(r7)     // Catch: java.lang.Throwable -> L2a
            if (r8 == r13) goto L58
            r2.removeSpan(r7)     // Catch: java.lang.Throwable -> L2a
        L58:
            int r12 = java.lang.Math.min(r8, r12)     // Catch: java.lang.Throwable -> L2a
            int r13 = java.lang.Math.max(r9, r13)     // Catch: java.lang.Throwable -> L2a
            int r6 = r6 + 1
            goto L47
        L63:
            r4 = r13
            if (r12 == r4) goto La9
            int r13 = r11.length()     // Catch: java.lang.Throwable -> L2a
            if (r12 < r13) goto L6d
            goto La9
        L6d:
            r13 = 2147483647(0x7fffffff, float:NaN)
            if (r14 == r13) goto L80
            if (r2 == 0) goto L80
            int r13 = r2.length()     // Catch: java.lang.Throwable -> L2a
            java.lang.Object[] r13 = r2.getSpans(r3, r13, r1)     // Catch: java.lang.Throwable -> L2a
            androidx.emoji2.text.EmojiSpan[] r13 = (androidx.emoji2.text.EmojiSpan[]) r13     // Catch: java.lang.Throwable -> L2a
            int r13 = r13.length     // Catch: java.lang.Throwable -> L2a
            int r14 = r14 - r13
        L80:
            r5 = r14
            androidx.emoji2.text.b$b r7 = new androidx.emoji2.text.b$b     // Catch: java.lang.Throwable -> L2a
            androidx.emoji2.text.EmojiCompat$SpanFactory r13 = r10.f35280a     // Catch: java.lang.Throwable -> L2a
            r7.<init>(r2, r13)     // Catch: java.lang.Throwable -> L2a
            r1 = r10
            r2 = r11
            r3 = r12
            r6 = r15
            java.lang.Object r12 = r1.m54675m(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L2a
            rZ1 r12 = (p000.C22012rZ1) r12     // Catch: java.lang.Throwable -> L2a
            if (r12 == 0) goto La0
            android.text.Spannable r12 = r12.m23498b()     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L9f
            androidx.emoji2.text.SpannableBuilder r11 = (androidx.emoji2.text.SpannableBuilder) r11
            r11.endBatchEdit()
        L9f:
            return r12
        La0:
            if (r0 == 0) goto La8
            r12 = r11
            androidx.emoji2.text.SpannableBuilder r12 = (androidx.emoji2.text.SpannableBuilder) r12
            r12.endBatchEdit()
        La8:
            return r11
        La9:
            if (r0 == 0) goto Lb1
            r12 = r11
            androidx.emoji2.text.SpannableBuilder r12 = (androidx.emoji2.text.SpannableBuilder) r12
            r12.endBatchEdit()
        Lb1:
            return r11
        Lb2:
            if (r0 == 0) goto Lb9
            androidx.emoji2.text.SpannableBuilder r11 = (androidx.emoji2.text.SpannableBuilder) r11
            r11.endBatchEdit()
        Lb9:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.C4511b.m54676l(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
    }

    /* renamed from: m */
    public final Object m54675m(CharSequence charSequence, int i, int i2, int i3, boolean z, InterfaceC4514c interfaceC4514c) {
        int i4;
        C4517f c4517f = new C4517f(this.f35281b.m54707c(), this.f35283d, this.f35284e);
        int codePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean z2 = true;
        loop0: while (true) {
            i4 = i;
            while (i < i2 && i5 < i3 && z2) {
                int m54668a = c4517f.m54668a(codePointAt);
                if (m54668a != 1) {
                    if (m54668a != 2) {
                        if (m54668a == 3) {
                            if (z || !m54680h(charSequence, i4, i, c4517f.m54666c())) {
                                z2 = interfaceC4514c.mo54670a(charSequence, i4, i, c4517f.m54666c());
                                i5++;
                            }
                        }
                    } else {
                        i += Character.charCount(codePointAt);
                        if (i < i2) {
                            codePointAt = Character.codePointAt(charSequence, i);
                        }
                    }
                } else {
                    i4 += Character.charCount(Character.codePointAt(charSequence, i4));
                    if (i4 < i2) {
                        codePointAt = Character.codePointAt(charSequence, i4);
                    }
                    i = i4;
                }
            }
        }
        if (c4517f.m54664e() && i5 < i3 && z2 && (z || !m54680h(charSequence, i4, i, c4517f.m54667b()))) {
            interfaceC4514c.mo54670a(charSequence, i4, i, c4517f.m54667b());
        }
        return interfaceC4514c.getResult();
    }
}