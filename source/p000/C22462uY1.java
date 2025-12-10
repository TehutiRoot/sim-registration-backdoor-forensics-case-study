package p000;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.core.text.PrecomputedTextCompat;
import java.util.stream.IntStream;

/* renamed from: uY1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C22462uY1 implements Spannable {

    /* renamed from: a */
    public boolean f107385a = false;

    /* renamed from: b */
    public Spannable f107386b;

    /* renamed from: uY1$a */
    /* loaded from: classes2.dex */
    public static class C16828a {
        /* renamed from: a */
        public static IntStream m1254a(CharSequence charSequence) {
            IntStream chars;
            chars = charSequence.chars();
            return chars;
        }

        /* renamed from: b */
        public static IntStream m1253b(CharSequence charSequence) {
            IntStream codePoints;
            codePoints = charSequence.codePoints();
            return codePoints;
        }
    }

    /* renamed from: uY1$b */
    /* loaded from: classes2.dex */
    public static class C16829b {
        /* renamed from: a */
        public boolean mo1252a(CharSequence charSequence) {
            return charSequence instanceof PrecomputedTextCompat;
        }
    }

    /* renamed from: uY1$c */
    /* loaded from: classes2.dex */
    public static class C16830c extends C16829b {
        @Override // p000.C22462uY1.C16829b
        /* renamed from: a */
        public boolean mo1252a(CharSequence charSequence) {
            if (!AbstractC17743Hl1.m68044a(charSequence) && !(charSequence instanceof PrecomputedTextCompat)) {
                return false;
            }
            return true;
        }
    }

    public C22462uY1(Spannable spannable) {
        this.f107386b = spannable;
    }

    /* renamed from: c */
    public static C16829b m1255c() {
        if (Build.VERSION.SDK_INT < 28) {
            return new C16829b();
        }
        return new C16830c();
    }

    /* renamed from: a */
    public final void m1257a() {
        Spannable spannable = this.f107386b;
        if (!this.f107385a && m1255c().mo1252a(spannable)) {
            this.f107386b = new SpannableString(spannable);
        }
        this.f107385a = true;
    }

    /* renamed from: b */
    public Spannable m1256b() {
        return this.f107386b;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.f107386b.charAt(i);
    }

    @Override // java.lang.CharSequence
    public IntStream chars() {
        return C16828a.m1254a(this.f107386b);
    }

    @Override // java.lang.CharSequence
    public IntStream codePoints() {
        return C16828a.m1253b(this.f107386b);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f107386b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f107386b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f107386b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public Object[] getSpans(int i, int i2, Class cls) {
        return this.f107386b.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f107386b.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f107386b.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        m1257a();
        this.f107386b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        m1257a();
        this.f107386b.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return this.f107386b.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f107386b.toString();
    }

    public C22462uY1(CharSequence charSequence) {
        this.f107386b = new SpannableString(charSequence);
    }
}
