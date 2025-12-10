package androidx.core.text;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.LocaleList;
import android.text.Layout;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.core.p005os.TraceCompat;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* loaded from: classes2.dex */
public class PrecomputedTextCompat implements Spannable {

    /* renamed from: e */
    public static final Object f34135e = new Object();

    /* renamed from: f */
    public static Executor f34136f;

    /* renamed from: a */
    public final Spannable f34137a;

    /* renamed from: b */
    public final Params f34138b;

    /* renamed from: c */
    public final int[] f34139c;

    /* renamed from: d */
    public final PrecomputedText f34140d;

    /* renamed from: androidx.core.text.PrecomputedTextCompat$a */
    /* loaded from: classes2.dex */
    public static class C4063a extends FutureTask {

        /* renamed from: androidx.core.text.PrecomputedTextCompat$a$a */
        /* loaded from: classes2.dex */
        public static class CallableC4064a implements Callable {

            /* renamed from: a */
            public Params f34150a;

            /* renamed from: b */
            public CharSequence f34151b;

            public CallableC4064a(Params params, CharSequence charSequence) {
                this.f34150a = params;
                this.f34151b = charSequence;
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public PrecomputedTextCompat call() {
                return PrecomputedTextCompat.create(this.f34151b, this.f34150a);
            }
        }

        public C4063a(Params params, CharSequence charSequence) {
            super(new CallableC4064a(params, charSequence));
        }
    }

    public PrecomputedTextCompat(CharSequence charSequence, Params params, int[] iArr) {
        this.f34137a = new SpannableString(charSequence);
        this.f34138b = params;
        this.f34139c = iArr;
        this.f34140d = null;
    }

    @SuppressLint({"WrongConstant"})
    public static PrecomputedTextCompat create(@NonNull CharSequence charSequence, @NonNull Params params) {
        StaticLayout.Builder obtain;
        StaticLayout.Builder breakStrategy;
        StaticLayout.Builder hyphenationFrequency;
        StaticLayout.Builder textDirection;
        PrecomputedText.Params params2;
        PrecomputedText create;
        Preconditions.checkNotNull(charSequence);
        Preconditions.checkNotNull(params);
        try {
            TraceCompat.beginSection("PrecomputedText");
            if (Build.VERSION.SDK_INT >= 29 && (params2 = params.f34145e) != null) {
                create = PrecomputedText.create(charSequence, params2);
                return new PrecomputedTextCompat(create, params);
            }
            ArrayList arrayList = new ArrayList();
            int length = charSequence.length();
            int i = 0;
            while (i < length) {
                int indexOf = TextUtils.indexOf(charSequence, '\n', i, length);
                if (indexOf < 0) {
                    i = length;
                } else {
                    i = indexOf + 1;
                }
                arrayList.add(Integer.valueOf(i));
            }
            int[] iArr = new int[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
            }
            if (Build.VERSION.SDK_INT >= 23) {
                obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), params.getTextPaint(), Integer.MAX_VALUE);
                breakStrategy = obtain.setBreakStrategy(params.getBreakStrategy());
                hyphenationFrequency = breakStrategy.setHyphenationFrequency(params.getHyphenationFrequency());
                textDirection = hyphenationFrequency.setTextDirection(params.getTextDirection());
                textDirection.build();
            } else {
                new StaticLayout(charSequence, params.getTextPaint(), Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            return new PrecomputedTextCompat(charSequence, params, iArr);
        } finally {
            TraceCompat.endSection();
        }
    }

    @UiThread
    public static Future<PrecomputedTextCompat> getTextFuture(@NonNull CharSequence charSequence, @NonNull Params params, @Nullable Executor executor) {
        C4063a c4063a = new C4063a(params, charSequence);
        if (executor == null) {
            synchronized (f34135e) {
                try {
                    if (f34136f == null) {
                        f34136f = Executors.newFixedThreadPool(1);
                    }
                    executor = f34136f;
                } finally {
                }
            }
        }
        executor.execute(c4063a);
        return c4063a;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.f34137a.charAt(i);
    }

    @IntRange(from = 0)
    public int getParagraphCount() {
        int paragraphCount;
        if (Build.VERSION.SDK_INT >= 29) {
            paragraphCount = this.f34140d.getParagraphCount();
            return paragraphCount;
        }
        return this.f34139c.length;
    }

    @IntRange(from = 0)
    public int getParagraphEnd(@IntRange(from = 0) int i) {
        int paragraphEnd;
        Preconditions.checkArgumentInRange(i, 0, getParagraphCount(), "paraIndex");
        if (Build.VERSION.SDK_INT >= 29) {
            paragraphEnd = this.f34140d.getParagraphEnd(i);
            return paragraphEnd;
        }
        return this.f34139c[i];
    }

    @IntRange(from = 0)
    public int getParagraphStart(@IntRange(from = 0) int i) {
        int paragraphStart;
        Preconditions.checkArgumentInRange(i, 0, getParagraphCount(), "paraIndex");
        if (Build.VERSION.SDK_INT >= 29) {
            paragraphStart = this.f34140d.getParagraphStart(i);
            return paragraphStart;
        } else if (i == 0) {
            return 0;
        } else {
            return this.f34139c[i - 1];
        }
    }

    @NonNull
    public Params getParams() {
        return this.f34138b;
    }

    @Nullable
    @RequiresApi(28)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PrecomputedText getPrecomputedText() {
        if (AbstractC17581Em1.m68583a(this.f34137a)) {
            return AbstractC17646Fm1.m68390a(this.f34137a);
        }
        return null;
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f34137a.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f34137a.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f34137a.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        Object[] spans;
        if (Build.VERSION.SDK_INT >= 29) {
            spans = this.f34140d.getSpans(i, i2, cls);
            return (T[]) spans;
        }
        return (T[]) this.f34137a.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f34137a.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f34137a.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (!(obj instanceof MetricAffectingSpan)) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f34140d.removeSpan(obj);
                return;
            } else {
                this.f34137a.removeSpan(obj);
                return;
            }
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (!(obj instanceof MetricAffectingSpan)) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f34140d.setSpan(obj, i, i2, i3);
                return;
            } else {
                this.f34137a.setSpan(obj, i, i2, i3);
                return;
            }
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return this.f34137a.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    @NonNull
    public String toString() {
        return this.f34137a.toString();
    }

    public PrecomputedTextCompat(PrecomputedText precomputedText, Params params) {
        this.f34137a = precomputedText;
        this.f34138b = params;
        this.f34139c = null;
        this.f34140d = Build.VERSION.SDK_INT < 29 ? null : precomputedText;
    }

    /* loaded from: classes2.dex */
    public static final class Params {

        /* renamed from: a */
        public final TextPaint f34141a;

        /* renamed from: b */
        public final TextDirectionHeuristic f34142b;

        /* renamed from: c */
        public final int f34143c;

        /* renamed from: d */
        public final int f34144d;

        /* renamed from: e */
        public final PrecomputedText.Params f34145e;

        /* loaded from: classes2.dex */
        public static class Builder {

            /* renamed from: a */
            public final TextPaint f34146a;

            /* renamed from: b */
            public TextDirectionHeuristic f34147b;

            /* renamed from: c */
            public int f34148c;

            /* renamed from: d */
            public int f34149d;

            public Builder(@NonNull TextPaint textPaint) {
                this.f34146a = textPaint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f34148c = 1;
                    this.f34149d = 1;
                } else {
                    this.f34149d = 0;
                    this.f34148c = 0;
                }
                this.f34147b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }

            @NonNull
            public Params build() {
                return new Params(this.f34146a, this.f34147b, this.f34148c, this.f34149d);
            }

            @RequiresApi(23)
            public Builder setBreakStrategy(int i) {
                this.f34148c = i;
                return this;
            }

            @RequiresApi(23)
            public Builder setHyphenationFrequency(int i) {
                this.f34149d = i;
                return this;
            }

            @RequiresApi(18)
            public Builder setTextDirection(@NonNull TextDirectionHeuristic textDirectionHeuristic) {
                this.f34147b = textDirectionHeuristic;
                return this;
            }
        }

        public Params(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            PrecomputedText.Params.Builder breakStrategy;
            PrecomputedText.Params.Builder hyphenationFrequency;
            PrecomputedText.Params.Builder textDirection;
            PrecomputedText.Params build;
            if (Build.VERSION.SDK_INT >= 29) {
                breakStrategy = AbstractC18166Nm1.m67200a(textPaint).setBreakStrategy(i);
                hyphenationFrequency = breakStrategy.setHyphenationFrequency(i2);
                textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
                build = textDirection.build();
                this.f34145e = build;
            } else {
                this.f34145e = null;
            }
            this.f34141a = textPaint;
            this.f34142b = textDirectionHeuristic;
            this.f34143c = i;
            this.f34144d = i2;
        }

        public boolean equals(@Nullable Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            if (equalsWithoutTextDirection(params) && this.f34142b == params.getTextDirection()) {
                return true;
            }
            return false;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public boolean equalsWithoutTextDirection(@NonNull Params params) {
            LocaleList textLocales;
            LocaleList textLocales2;
            boolean equals;
            int i = Build.VERSION.SDK_INT;
            if ((i >= 23 && (this.f34143c != params.getBreakStrategy() || this.f34144d != params.getHyphenationFrequency())) || this.f34141a.getTextSize() != params.getTextPaint().getTextSize() || this.f34141a.getTextScaleX() != params.getTextPaint().getTextScaleX() || this.f34141a.getTextSkewX() != params.getTextPaint().getTextSkewX() || this.f34141a.getLetterSpacing() != params.getTextPaint().getLetterSpacing() || !TextUtils.equals(this.f34141a.getFontFeatureSettings(), params.getTextPaint().getFontFeatureSettings()) || this.f34141a.getFlags() != params.getTextPaint().getFlags()) {
                return false;
            }
            if (i >= 24) {
                textLocales = this.f34141a.getTextLocales();
                textLocales2 = params.getTextPaint().getTextLocales();
                equals = textLocales.equals(textLocales2);
                if (!equals) {
                    return false;
                }
            } else if (!this.f34141a.getTextLocale().equals(params.getTextPaint().getTextLocale())) {
                return false;
            }
            if (this.f34141a.getTypeface() == null) {
                if (params.getTextPaint().getTypeface() != null) {
                    return false;
                }
                return true;
            } else if (!this.f34141a.getTypeface().equals(params.getTextPaint().getTypeface())) {
                return false;
            } else {
                return true;
            }
        }

        @RequiresApi(23)
        public int getBreakStrategy() {
            return this.f34143c;
        }

        @RequiresApi(23)
        public int getHyphenationFrequency() {
            return this.f34144d;
        }

        @Nullable
        @RequiresApi(18)
        public TextDirectionHeuristic getTextDirection() {
            return this.f34142b;
        }

        @NonNull
        public TextPaint getTextPaint() {
            return this.f34141a;
        }

        public int hashCode() {
            LocaleList textLocales;
            if (Build.VERSION.SDK_INT >= 24) {
                Float valueOf = Float.valueOf(this.f34141a.getTextSize());
                Float valueOf2 = Float.valueOf(this.f34141a.getTextScaleX());
                Float valueOf3 = Float.valueOf(this.f34141a.getTextSkewX());
                Float valueOf4 = Float.valueOf(this.f34141a.getLetterSpacing());
                Integer valueOf5 = Integer.valueOf(this.f34141a.getFlags());
                textLocales = this.f34141a.getTextLocales();
                return ObjectsCompat.hash(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, textLocales, this.f34141a.getTypeface(), Boolean.valueOf(this.f34141a.isElegantTextHeight()), this.f34142b, Integer.valueOf(this.f34143c), Integer.valueOf(this.f34144d));
            }
            return ObjectsCompat.hash(Float.valueOf(this.f34141a.getTextSize()), Float.valueOf(this.f34141a.getTextScaleX()), Float.valueOf(this.f34141a.getTextSkewX()), Float.valueOf(this.f34141a.getLetterSpacing()), Integer.valueOf(this.f34141a.getFlags()), this.f34141a.getTextLocale(), this.f34141a.getTypeface(), Boolean.valueOf(this.f34141a.isElegantTextHeight()), this.f34142b, Integer.valueOf(this.f34143c), Integer.valueOf(this.f34144d));
        }

        public String toString() {
            String fontVariationSettings;
            LocaleList textLocales;
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f34141a.getTextSize());
            sb.append(", textScaleX=" + this.f34141a.getTextScaleX());
            sb.append(", textSkewX=" + this.f34141a.getTextSkewX());
            int i = Build.VERSION.SDK_INT;
            sb.append(", letterSpacing=" + this.f34141a.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.f34141a.isElegantTextHeight());
            if (i >= 24) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(", textLocale=");
                textLocales = this.f34141a.getTextLocales();
                sb2.append(textLocales);
                sb.append(sb2.toString());
            } else {
                sb.append(", textLocale=" + this.f34141a.getTextLocale());
            }
            sb.append(", typeface=" + this.f34141a.getTypeface());
            if (i >= 26) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(", variationSettings=");
                fontVariationSettings = this.f34141a.getFontVariationSettings();
                sb3.append(fontVariationSettings);
                sb.append(sb3.toString());
            }
            sb.append(", textDir=" + this.f34142b);
            sb.append(", breakStrategy=" + this.f34143c);
            sb.append(", hyphenationFrequency=" + this.f34144d);
            sb.append("}");
            return sb.toString();
        }

        @RequiresApi(28)
        public Params(@NonNull PrecomputedText.Params params) {
            TextPaint textPaint;
            TextDirectionHeuristic textDirection;
            int breakStrategy;
            int hyphenationFrequency;
            textPaint = params.getTextPaint();
            this.f34141a = textPaint;
            textDirection = params.getTextDirection();
            this.f34142b = textDirection;
            breakStrategy = params.getBreakStrategy();
            this.f34143c = breakStrategy;
            hyphenationFrequency = params.getHyphenationFrequency();
            this.f34144d = hyphenationFrequency;
            this.f34145e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}