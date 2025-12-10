package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Comparator;

@GwtCompatible
/* loaded from: classes4.dex */
public abstract class ComparisonChain {

    /* renamed from: a */
    public static final ComparisonChain f53081a = new C7590a();

    /* renamed from: b */
    public static final ComparisonChain f53082b = new C7591b(-1);

    /* renamed from: c */
    public static final ComparisonChain f53083c = new C7591b(1);

    /* renamed from: com.google.common.collect.ComparisonChain$a */
    /* loaded from: classes4.dex */
    public class C7590a extends ComparisonChain {
        public C7590a() {
            super(null);
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(Comparable comparable, Comparable comparable2) {
            return m41038d(comparable.compareTo(comparable2));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compareFalseFirst(boolean z, boolean z2) {
            return m41038d(Boolean.compare(z, z2));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compareTrueFirst(boolean z, boolean z2) {
            return m41038d(Boolean.compare(z2, z));
        }

        /* renamed from: d */
        public ComparisonChain m41038d(int i) {
            if (i < 0) {
                return ComparisonChain.f53082b;
            }
            return i > 0 ? ComparisonChain.f53083c : ComparisonChain.f53081a;
        }

        @Override // com.google.common.collect.ComparisonChain
        public int result() {
            return 0;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(Object obj, Object obj2, Comparator comparator) {
            return m41038d(comparator.compare(obj, obj2));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(int i, int i2) {
            return m41038d(Integer.compare(i, i2));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(long j, long j2) {
            return m41038d(Long.compare(j, j2));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(float f, float f2) {
            return m41038d(Float.compare(f, f2));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(double d, double d2) {
            return m41038d(Double.compare(d, d2));
        }
    }

    /* renamed from: com.google.common.collect.ComparisonChain$b */
    /* loaded from: classes4.dex */
    public static final class C7591b extends ComparisonChain {

        /* renamed from: d */
        public final int f53084d;

        public C7591b(int i) {
            super(null);
            this.f53084d = i;
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
            return this.f53084d;
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

    public /* synthetic */ ComparisonChain(C7590a c7590a) {
        this();
    }

    public static ComparisonChain start() {
        return f53081a;
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
