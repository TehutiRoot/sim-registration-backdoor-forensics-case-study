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
    public final Class f35268a;

    /* renamed from: b */
    public final List f35269b;

    /* renamed from: androidx.emoji2.text.SpannableBuilder$a */
    /* loaded from: classes2.dex */
    public static class C4509a implements TextWatcher, SpanWatcher {

        /* renamed from: a */
        public final Object f35270a;

        /* renamed from: b */
        public final AtomicInteger f35271b = new AtomicInteger(0);

        public C4509a(Object obj) {
            this.f35270a = obj;
        }

        /* renamed from: a */
        public final void m54695a() {
            this.f35271b.incrementAndGet();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f35270a).afterTextChanged(editable);
        }

        /* renamed from: b */
        public final boolean m54694b(Object obj) {
            return obj instanceof EmojiSpan;
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f35270a).beforeTextChanged(charSequence, i, i2, i3);
        }

        /* renamed from: c */
        public final void m54693c() {
            this.f35271b.decrementAndGet();
        }

        @Override // android.text.SpanWatcher
        public void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
            if (this.f35271b.get() > 0 && m54694b(obj)) {
                return;
            }
            ((SpanWatcher) this.f35270a).onSpanAdded(spannable, obj, i, i2);
        }

        @Override // android.text.SpanWatcher
        public void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            if (this.f35271b.get() > 0 && m54694b(obj)) {
                return;
            }
            if (Build.VERSION.SDK_INT < 28) {
                if (i > i2) {
                    i = 0;
                }
                if (i3 > i4) {
                    i5 = i;
                    i6 = 0;
                    ((SpanWatcher) this.f35270a).onSpanChanged(spannable, obj, i5, i2, i6, i4);
                }
            }
            i5 = i;
            i6 = i3;
            ((SpanWatcher) this.f35270a).onSpanChanged(spannable, obj, i5, i2, i6, i4);
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
            if (this.f35271b.get() > 0 && m54694b(obj)) {
                return;
            }
            ((SpanWatcher) this.f35270a).onSpanRemoved(spannable, obj, i, i2);
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f35270a).onTextChanged(charSequence, i, i2, i3);
        }
    }

    public SpannableBuilder(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f35269b = new ArrayList();
        Preconditions.checkNotNull(cls, "watcherClass cannot be null");
        this.f35268a = cls;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static SpannableBuilder create(@NonNull Class<?> cls, @NonNull CharSequence charSequence) {
        return new SpannableBuilder(cls, charSequence);
    }

    /* renamed from: a */
    public final void m54701a() {
        for (int i = 0; i < this.f35269b.size(); i++) {
            ((C4509a) this.f35269b.get(i)).m54695a();
        }
    }

    /* renamed from: b */
    public final void m54700b() {
        for (int i = 0; i < this.f35269b.size(); i++) {
            ((C4509a) this.f35269b.get(i)).onTextChanged(this, 0, length(), length());
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void beginBatchEdit() {
        m54701a();
    }

    /* renamed from: c */
    public final C4509a m54699c(Object obj) {
        for (int i = 0; i < this.f35269b.size(); i++) {
            C4509a c4509a = (C4509a) this.f35269b.get(i);
            if (c4509a.f35270a == obj) {
                return c4509a;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final boolean m54698d(Class cls) {
        if (this.f35268a == cls) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean m54697e(Object obj) {
        if (obj != null && m54698d(obj.getClass())) {
            return true;
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void endBatchEdit() {
        m54696f();
        m54700b();
    }

    /* renamed from: f */
    public final void m54696f() {
        for (int i = 0; i < this.f35269b.size(); i++) {
            ((C4509a) this.f35269b.get(i)).m54693c();
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanEnd(@Nullable Object obj) {
        C4509a m54699c;
        if (m54697e(obj) && (m54699c = m54699c(obj)) != null) {
            obj = m54699c;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanFlags(@Nullable Object obj) {
        C4509a m54699c;
        if (m54697e(obj) && (m54699c = m54699c(obj)) != null) {
            obj = m54699c;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanStart(@Nullable Object obj) {
        C4509a m54699c;
        if (m54697e(obj) && (m54699c = m54699c(obj)) != null) {
            obj = m54699c;
        }
        return super.getSpanStart(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    @SuppressLint({"UnknownNullness"})
    public <T> T[] getSpans(int i, int i2, @NonNull Class<T> cls) {
        if (m54698d(cls)) {
            C4509a[] c4509aArr = (C4509a[]) super.getSpans(i, i2, C4509a.class);
            T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, c4509aArr.length));
            for (int i3 = 0; i3 < c4509aArr.length; i3++) {
                tArr[i3] = c4509aArr[i3].f35270a;
            }
            return tArr;
        }
        return (T[]) super.getSpans(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int nextSpanTransition(int i, int i2, @Nullable Class cls) {
        return super.nextSpanTransition(i, i2, (cls == null || m54698d(cls)) ? C4509a.class : C4509a.class);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void removeSpan(@Nullable Object obj) {
        C4509a c4509a;
        if (m54697e(obj)) {
            c4509a = m54699c(obj);
            if (c4509a != null) {
                obj = c4509a;
            }
        } else {
            c4509a = null;
        }
        super.removeSpan(obj);
        if (c4509a != null) {
            this.f35269b.remove(c4509a);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(@Nullable Object obj, int i, int i2, int i3) {
        if (m54697e(obj)) {
            C4509a c4509a = new C4509a(obj);
            this.f35269b.add(c4509a);
            obj = c4509a;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    @SuppressLint({"UnknownNullness"})
    public CharSequence subSequence(int i, int i2) {
        return new SpannableBuilder(this.f35268a, this, i, i2);
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
        m54701a();
        super.replace(i, i2, charSequence);
        m54696f();
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
        this.f35269b = new ArrayList();
        Preconditions.checkNotNull(cls, "watcherClass cannot be null");
        this.f35268a = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        m54701a();
        super.replace(i, i2, charSequence, i3, i4);
        m54696f();
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