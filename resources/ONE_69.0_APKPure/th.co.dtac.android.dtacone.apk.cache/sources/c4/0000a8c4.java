package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Comparator;

@GwtCompatible
/* loaded from: classes4.dex */
public abstract class ComparisonChain {

    /* renamed from: a */
    public static final ComparisonChain f53093a = new C7579a();

    /* renamed from: b */
    public static final ComparisonChain f53094b = new C7580b(-1);

    /* renamed from: c */
    public static final ComparisonChain f53095c = new C7580b(1);

    /* renamed from: com.google.common.collect.ComparisonChain$a */
    /* loaded from: classes4.dex */
    public class C7579a extends ComparisonChain {
        public C7579a() {
            super(null);
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(Comparable comparable, Comparable comparable2) {
            return m41027d(comparable.compareTo(comparable2));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compareFalseFirst(boolean z, boolean z2) {
            return m41027d(Boolean.compare(z, z2));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compareTrueFirst(boolean z, boolean z2) {
            return m41027d(Boolean.compare(z2, z));
        }

        /* renamed from: d */
        public ComparisonChain m41027d(int i) {
            if (i < 0) {
                return ComparisonChain.f53094b;
            }
            return i > 0 ? ComparisonChain.f53095c : ComparisonChain.f53093a;
        }

        @Override // com.google.common.collect.ComparisonChain
        public int result() {
            return 0;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(Object obj, Object obj2, Comparator comparator) {
            return m41027d(comparator.compare(obj, obj2));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(int i, int i2) {
            return m41027d(Integer.compare(i, i2));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(long j, long j2) {
            return m41027d(Long.compare(j, j2));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(float f, float f2) {
            return m41027d(Float.compare(f, f2));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(double d, double d2) {
            return m41027d(Double.compare(d, d2));
        }
    }

    /* renamed from: com.google.common.collect.ComparisonChain$b */
    /* loaded from: classes4.dex */
    public static final class C7580b extends ComparisonChain {

        /* renamed from: d */
        public final int f53096d;

        public C7580b(int i) {
            super(null);
            this.f53096d = i;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(double d, double d2) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compareFalseFirst(boolean z, boolean z2) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compareTrueFirst(boolean z, boolean z2) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public int result() {
            return this.f53096d;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(float f, float f2) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(int i, int i2) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(long j, long j2) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(Comparable comparable, Comparable comparable2) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(Object obj, Object obj2, Comparator comparator) {
            return this;
        }
    }

    public /* synthetic */ ComparisonChain(C7579a c7579a) {
        this();
    }

    public static ComparisonChain start() {
        return f53093a;
    }

    public abstract ComparisonChain compare(double d, double d2);

    public abstract ComparisonChain compare(float f, float f2);

    public abstract ComparisonChain compare(int i, int i2);

    public abstract ComparisonChain compare(long j, long j2);

    @Deprecated
    public final ComparisonChain compare(Boolean bool, Boolean bool2) {
        return compareFalseFirst(bool.booleanValue(), bool2.booleanValue());
    }

    public abstract ComparisonChain compare(Comparable<?> comparable, Comparable<?> comparable2);

    public abstract <T> ComparisonChain compare(T t, T t2, Comparator<T> comparator);

    public abstract ComparisonChain compareFalseFirst(boolean z, boolean z2);

    public abstract ComparisonChain compareTrueFirst(boolean z, boolean z2);

    public abstract int result();

    public ComparisonChain() {
    }
}