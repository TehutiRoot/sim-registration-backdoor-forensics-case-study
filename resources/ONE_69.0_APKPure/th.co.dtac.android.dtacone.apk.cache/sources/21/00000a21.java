package p000;

import java.util.List;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;

/* renamed from: Kh0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C17955Kh0 implements KType {

    /* renamed from: a */
    public final KType f3377a;

    public C17955Kh0(KType origin) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.f3377a = origin;
    }

    public boolean equals(Object obj) {
        C17955Kh0 c17955Kh0;
        KType kType;
        KType kType2;
        if (obj == null) {
            return false;
        }
        KType kType3 = this.f3377a;
        KClassifier kClassifier = null;
        if (obj instanceof C17955Kh0) {
            c17955Kh0 = (C17955Kh0) obj;
        } else {
            c17955Kh0 = null;
        }
        if (c17955Kh0 != null) {
            kType = c17955Kh0.f3377a;
        } else {
            kType = null;
        }
        if (!Intrinsics.areEqual(kType3, kType)) {
            return false;
        }
        KClassifier classifier = getClassifier();
        if (classifier instanceof KClass) {
            if (obj instanceof KType) {
                kType2 = (KType) obj;
            } else {
                kType2 = null;
            }
            if (kType2 != null) {
                kClassifier = kType2.getClassifier();
            }
            if (kClassifier != null && (kClassifier instanceof KClass)) {
                return Intrinsics.areEqual(JvmClassMappingKt.getJavaClass((KClass) classifier), JvmClassMappingKt.getJavaClass((KClass) kClassifier));
            }
        }
        return false;
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public List getAnnotations() {
        return this.f3377a.getAnnotations();
    }

    @Override // kotlin.reflect.KType
    public List getArguments() {
        return this.f3377a.getArguments();
    }

    @Override // kotlin.reflect.KType
    public KClassifier getClassifier() {
        return this.f3377a.getClassifier();
    }

    public int hashCode() {
        return this.f3377a.hashCode();
    }

    @Override // kotlin.reflect.KType
    public boolean isMarkedNullable() {
        return this.f3377a.isMarkedNullable();
    }

    public String toString() {
        return "KTypeWrapper: " + this.f3377a;
    }
}