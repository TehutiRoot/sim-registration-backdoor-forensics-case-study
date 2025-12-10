package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class SpannableBuilder extends SpannableStringBuilder {

    /* renamed from: a */
    public final Class f35180a;

    /* renamed from: b */
    public final List f35181b;

    /* renamed from: androidx.emoji2.text.SpannableBuilder$a */
    /* loaded from: classes2.dex */
    public static class C4527a implements TextWatcher, SpanWatcher {

        /* renamed from: a */
        public final Object f35182a;

        /* renamed from: b */
        public final AtomicInteger f35183b = new AtomicInteger(0);

        public C4527a(Object obj) {
            this.f35182a = obj;
        }

        /* renamed from: a */
        public final void m54745a() {
            this.f35183b.incrementAndGet();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f35182a).afterTextChanged(editable);
        }

        /* renamed from: b */
        public final boolean m54744b(Object obj) {
            return obj instanceof EmojiSpan;
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f35182a).beforeTextChanged(charSequence, i, i2, i3);
        }

        /* renamed from: c */
        public final void m54743c() {
            this.f35183b.decrementAndGet();
        }

        @Override // android.text.SpanWatcher
        public void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
            if (this.f35183b.get() > 0 && m54744b(obj)) {
                return;
            }
            ((SpanWatcher) this.f35182a).onSpanAdded(spannable, obj, i, i2);
        }

        @Override // android.text.SpanWatcher
        public void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            if (this.f35183b.get() > 0 && m54744b(obj)) {
                return;
            }
            if (Build.VERSION.SDK_INT < 28) {
                if (i > i2) {
                    i = 0;
                }
                if (i3 > i4) {
                    i5 = i;
                    i6 = 0;
                    ((SpanWatcher) this.f35182a).onSpanChanged(spannable, obj, i5, i2, i6, i4);
                }
            }
            i5 = i;
            i6 = i3;
            ((SpanWatcher) this.f35182a).onSpanChanged(spannable, obj, i5, i2, i6, i4);
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
            if (this.f35183b.get() > 0 && m54744b(obj)) {
                return;
            }
            ((SpanWatcher) this.f35182a).onSpanRemoved(spannable, obj, i, i2);
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f35182a).onTextChanged(charSequence, i, i2, i3);
        }
    }

    public SpannableBuilder(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f35181b = new ArrayList();
        Preconditions.checkNotNull(cls, "watcherClass cannot be null");
        this.f35180a = cls;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static SpannableBuilder create(@NonNull Class<?> cls, @NonNull CharSequence charSequence) {
        return new SpannableBuilder(cls, charSequence);
    }

    /* renamed from: a */
    public final void m54751a() {
        for (int i = 0; i < this.f35181b.size(); i++) {
            ((C4527a) this.f35181b.get(i)).m54745a();
        }
    }

    /* renamed from: b */
    public final void m54750b() {
        for (int i = 0; i < this.f35181b.size(); i++) {
            ((C4527a) this.f35181b.get(i)).onTextChanged(this, 0, length(), length());
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void beginBatchEdit() {
        m54751a();
    }

    /* renamed from: c */
    public final C4527a m54749c(Object obj) {
        for (int i = 0; i < this.f35181b.size(); i++) {
            C4527a c4527a = (C4527a) this.f35181b.get(i);
            if (c4527a.f35182a == obj) {
                return c4527a;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final boolean m54748d(Class cls) {
        if (this.f35180a == cls) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean m54747e(Object obj) {
        if (obj != null && m54748d(obj.getClass())) {
            return true;
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void endBatchEdit() {
        m54746f();
        m54750b();
    }

    /* renamed from: f */
    public final void m54746f() {
        for (int i = 0; i < this.f35181b.size(); i++) {
            ((C4527a) this.f35181b.get(i)).m54743c();
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanEnd(@Nullable Object obj) {
        C4527a m54749c;
        if (m54747e(obj) && (m54749c = m54749c(obj)) != null) {
            obj = m54749c;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanFlags(@Nullable Object obj) {
        C4527a m54749c;
        if (m54747e(obj) && (m54749c = m54749c(obj)) != null) {
            obj = m54749c;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanStart(@Nullable Object obj) {
        C4527a m54749c;
        if (m54747e(obj) && (m54749c = m54749c(obj)) != null) {
            obj = m54749c;
        }
        return super.getSpanStart(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    @SuppressLint({"UnknownNullness"})
    public <T> T[] getSpans(int i, int i2, @NonNull Class<T> cls) {
        if (m54748d(cls)) {
            C4527a[] c4527aArr = (C4527a[]) super.getSpans(i, i2, C4527a.class);
            T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, c4527aArr.length));
            for (int i3 = 0; i3 < c4527aArr.length; i3++) {
                tArr[i3] = c4527aArr[i3].f35182a;
            }
            return tArr;
        }
        return (T[]) super.getSpans(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int nextSpanTransition(int i, int i2, @Nullable Class cls) {
        return super.nextSpanTransition(i, i2, (cls == null || m54748d(cls)) ? C4527a.class : C4527a.class);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void removeSpan(@Nullable Object obj) {
        C4527a c4527a;
        if (m54747e(obj)) {
            c4527a = m54749c(obj);
            if (c4527a != null) {
                obj = c4527a;
            }
        } else {
            c4527a = null;
        }
        super.removeSpan(obj);
        if (c4527a != null) {
            this.f35181b.remove(c4527a);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(@Nullable Object obj, int i, int i2, int i3) {
        if (m54747e(obj)) {
            C4527a c4527a = new C4527a(obj);
            this.f35181b.add(c4527a);
            obj = c4527a;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    @SuppressLint({"UnknownNullness"})
    public CharSequence subSequence(int i, int i2) {
        return new SpannableBuilder(this.f35180a, this, i, i2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        m54751a();
        super.replace(i, i2, charSequence);
        m54746f();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    public SpannableBuilder(Class cls, CharSequence charSequence, int i, int i2) {
        super(charSequence, i, i2);
        this.f35181b = new ArrayList();
        Preconditions.checkNotNull(cls, "watcherClass cannot be null");
        this.f35180a = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        m54751a();
        super.replace(i, i2, charSequence, i3, i4);
        m54746f();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @NonNull
    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @NonNull
    public SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @NonNull
    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}
