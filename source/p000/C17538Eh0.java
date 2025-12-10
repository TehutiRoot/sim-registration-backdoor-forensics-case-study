package p000;

import java.util.List;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;

/* renamed from: Eh0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C17538Eh0 implements KType {

    /* renamed from: a */
    public final KType f1359a;

    public C17538Eh0(KType origin) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.f1359a = origin;
    }

    public boolean equals(Object obj) {
        C17538Eh0 c17538Eh0;
        KType kType;
        KType kType2;
        if (obj == null) {
            return false;
        }
        KType kType3 = this.f1359a;
        KClassifier kClassifier = null;
        if (obj instanceof C17538Eh0) {
            c17538Eh0 = (C17538Eh0) obj;
        } else {
            c17538Eh0 = null;
        }
        if (c17538Eh0 != null) {
            kType = c17538Eh0.f1359a;
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
        return this.f1359a.getAnnotations();
    }

    @Override // kotlin.reflect.KType
    public List getArguments() {
        return this.f1359a.getArguments();
    }

    @Override // kotlin.reflect.KType
    public KClassifier getClassifier() {
        return this.f1359a.getClassifier();
    }

    public int hashCode() {
        return this.f1359a.hashCode();
    }

    @Override // kotlin.reflect.KType
    public boolean isMarkedNullable() {
        return this.f1359a.isMarkedNullable();
    }

    public String toString() {
        return "KTypeWrapper: " + this.f1359a;
    }
}
