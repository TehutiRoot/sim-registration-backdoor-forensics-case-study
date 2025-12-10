package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

@GwtCompatible
/* loaded from: classes4.dex */
public class Joiner {

    /* renamed from: a */
    public final String f52748a;

    /* loaded from: classes4.dex */
    public static final class MapJoiner {

        /* renamed from: a */
        public final Joiner f52749a;

        /* renamed from: b */
        public final String f52750b;

        public /* synthetic */ MapJoiner(Joiner joiner, String str, C7427a c7427a) {
            this(joiner, str);
        }

        @CanIgnoreReturnValue
        public <A extends Appendable> A appendTo(A a, Map<?, ?> map) throws IOException {
            return (A) appendTo((MapJoiner) a, (Iterable<? extends Map.Entry<?, ?>>) map.entrySet());
        }

        public String join(Map<?, ?> map) {
            return join(map.entrySet());
        }

        public MapJoiner useForNull(String str) {
            return new MapJoiner(this.f52749a.useForNull(str), this.f52750b);
        }

        public MapJoiner(Joiner joiner, String str) {
            this.f52749a = joiner;
            this.f52750b = (String) Preconditions.checkNotNull(str);
        }

        @CanIgnoreReturnValue
        public StringBuilder appendTo(StringBuilder sb, Map<?, ?> map) {
            return appendTo(sb, (Iterable<? extends Map.Entry<?, ?>>) map.entrySet());
        }

        public String join(Iterable<? extends Map.Entry<?, ?>> iterable) {
            return join(iterable.iterator());
        }

        @CanIgnoreReturnValue
        public <A extends Appendable> A appendTo(A a, Iterable<? extends Map.Entry<?, ?>> iterable) throws IOException {
            return (A) appendTo((MapJoiner) a, iterable.iterator());
        }

        public String join(Iterator<? extends Map.Entry<?, ?>> it) {
            return appendTo(new StringBuilder(), it).toString();
        }

        @CanIgnoreReturnValue
        public <A extends Appendable> A appendTo(A a, Iterator<? extends Map.Entry<?, ?>> it) throws IOException {
            Preconditions.checkNotNull(a);
            if (it.hasNext()) {
                Map.Entry<?, ?> next = it.next();
                a.append(this.f52749a.mo41321c(next.getKey()));
                a.append(this.f52750b);
                a.append(this.f52749a.mo41321c(next.getValue()));
                while (it.hasNext()) {
                    a.append(this.f52749a.f52748a);
                    Map.Entry<?, ?> next2 = it.next();
                    a.append(this.f52749a.mo41321c(next2.getKey()));
                    a.append(this.f52750b);
                    a.append(this.f52749a.mo41321c(next2.getValue()));
                }
            }
            return a;
        }

        @CanIgnoreReturnValue
        public StringBuilder appendTo(StringBuilder sb, Iterable<? extends Map.Entry<?, ?>> iterable) {
            return appendTo(sb, iterable.iterator());
        }

        @CanIgnoreReturnValue
        public StringBuilder appendTo(StringBuilder sb, Iterator<? extends Map.Entry<?, ?>> it) {
            try {
                appendTo((MapJoiner) sb, it);
                return sb;
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: com.google.common.base.Joiner$a */
    /* loaded from: classes4.dex */
    public class C7427a extends Joiner {

        /* renamed from: b */
        public final /* synthetic */ String f52751b;

        /* renamed from: c */
        public final /* synthetic */ Joiner f52752c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7427a(Joiner joiner, Joiner joiner2, String str) {
            super(joiner2, null);
            this.f52751b = str;
            this.f52752c = joiner;
        }

        @Override // com.google.common.base.Joiner
        /* renamed from: c */
        public CharSequence mo41321c(Object obj) {
            if (obj == null) {
                return this.f52751b;
            }
            return this.f52752c.mo41321c(obj);
        }

        @Override // com.google.common.base.Joiner
        public Joiner skipNulls() {
            throw new UnsupportedOperationException("already specified useForNull");
        }

        @Override // com.google.common.base.Joiner
        public Joiner useForNull(String str) {
            throw new UnsupportedOperationException("already specified useForNull");
        }
    }

    /* renamed from: com.google.common.base.Joiner$b */
    /* loaded from: classes4.dex */
    public class C7428b extends Joiner {
        public C7428b(Joiner joiner) {
            super(joiner, null);
        }

        @Override // com.google.common.base.Joiner
        public Appendable appendTo(Appendable appendable, Iterator it) {
            Preconditions.checkNotNull(appendable, "appendable");
            Preconditions.checkNotNull(it, "parts");
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (next != null) {
                    appendable.append(Joiner.this.mo41321c(next));
                    break;
                }
            }
            while (it.hasNext()) {
                Object next2 = it.next();
                if (next2 != null) {
                    appendable.append(Joiner.this.f52748a);
                    appendable.append(Joiner.this.mo41321c(next2));
                }
            }
            return appendable;
        }

        @Override // com.google.common.base.Joiner
        public Joiner useForNull(String str) {
            throw new UnsupportedOperationException("already specified skipNulls");
        }

        @Override // com.google.common.base.Joiner
        public MapJoiner withKeyValueSeparator(String str) {
            throw new UnsupportedOperationException("can't use .skipNulls() with maps");
        }
    }

    /* renamed from: com.google.common.base.Joiner$c */
    /* loaded from: classes4.dex */
    public class C7429c extends AbstractList {

        /* renamed from: a */
        public final /* synthetic */ Object[] f52754a;

        /* renamed from: b */
        public final /* synthetic */ Object f52755b;

        /* renamed from: c */
        public final /* synthetic */ Object f52756c;

        public C7429c(Object[] objArr, Object obj, Object obj2) {
            this.f52754a = objArr;
            this.f52755b = obj;
            this.f52756c = obj2;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i) {
            if (i != 0) {
                if (i != 1) {
                    return this.f52754a[i - 2];
                }
                return this.f52756c;
            }
            return this.f52755b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f52754a.length + 2;
        }
    }

    public /* synthetic */ Joiner(Joiner joiner, C7427a c7427a) {
        this(joiner);
    }

    /* renamed from: b */
    public static Iterable m41324b(Object obj, Object obj2, Object[] objArr) {
        Preconditions.checkNotNull(objArr);
        return new C7429c(objArr, obj, obj2);
    }

    /* renamed from: on */
    public static Joiner m41322on(String str) {
        return new Joiner(str);
    }

    @CanIgnoreReturnValue
    public <A extends Appendable> A appendTo(A a, Iterable<? extends Object> iterable) throws IOException {
        return (A) appendTo((Joiner) a, iterable.iterator());
    }

    /* renamed from: c */
    public CharSequence mo41321c(Object obj) {
        java.util.Objects.requireNonNull(obj);
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }

    public final String join(Iterable<? extends Object> iterable) {
        return join(iterable.iterator());
    }

    public Joiner skipNulls() {
        return new C7428b(this);
    }

    public Joiner useForNull(String str) {
        Preconditions.checkNotNull(str);
        return new C7427a(this, this, str);
    }

    public MapJoiner withKeyValueSeparator(char c) {
        return withKeyValueSeparator(String.valueOf(c));
    }

    public Joiner(String str) {
        this.f52748a = (String) Preconditions.checkNotNull(str);
    }

    /* renamed from: on */
    public static Joiner m41323on(char c) {
        return new Joiner(String.valueOf(c));
    }

    @CanIgnoreReturnValue
    public <A extends Appendable> A appendTo(A a, Iterator<? extends Object> it) throws IOException {
        Preconditions.checkNotNull(a);
        if (it.hasNext()) {
            a.append(mo41321c(it.next()));
            while (it.hasNext()) {
                a.append(this.f52748a);
                a.append(mo41321c(it.next()));
            }
        }
        return a;
    }

    public final String join(Iterator<? extends Object> it) {
        return appendTo(new StringBuilder(), it).toString();
    }

    public MapJoiner withKeyValueSeparator(String str) {
        return new MapJoiner(this, str, null);
    }

    public final String join(Object[] objArr) {
        return join(Arrays.asList(objArr));
    }

    public Joiner(Joiner joiner) {
        this.f52748a = joiner.f52748a;
    }

    public final String join(@CheckForNull Object obj, @CheckForNull Object obj2, Object... objArr) {
        return join(m41324b(obj, obj2, objArr));
    }

    @CanIgnoreReturnValue
    public final <A extends Appendable> A appendTo(A a, Object[] objArr) throws IOException {
        return (A) appendTo((Joiner) a, (Iterable<? extends Object>) Arrays.asList(objArr));
    }

    @CanIgnoreReturnValue
    public final <A extends Appendable> A appendTo(A a, @CheckForNull Object obj, @CheckForNull Object obj2, Object... objArr) throws IOException {
        return (A) appendTo((Joiner) a, m41324b(obj, obj2, objArr));
    }

    @CanIgnoreReturnValue
    public final StringBuilder appendTo(StringBuilder sb, Iterable<? extends Object> iterable) {
        return appendTo(sb, iterable.iterator());
    }

    @CanIgnoreReturnValue
    public final StringBuilder appendTo(StringBuilder sb, Iterator<? extends Object> it) {
        try {
            appendTo((Joiner) sb, it);
            return sb;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @CanIgnoreReturnValue
    public final StringBuilder appendTo(StringBuilder sb, Object[] objArr) {
        return appendTo(sb, (Iterable<? extends Object>) Arrays.asList(objArr));
    }

    @CanIgnoreReturnValue
    public final StringBuilder appendTo(StringBuilder sb, @CheckForNull Object obj, @CheckForNull Object obj2, Object... objArr) {
        return appendTo(sb, m41324b(obj, obj2, objArr));
    }
}
