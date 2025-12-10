package p000;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;

/* renamed from: lG */
/* loaded from: classes6.dex */
public class C12208lG implements KotlinTypeChecker.TypeConstructorEquality {

    /* renamed from: a */
    public final boolean f71572a;

    /* renamed from: b */
    public final CallableDescriptor f71573b;

    /* renamed from: c */
    public final CallableDescriptor f71574c;

    public C12208lG(boolean z, CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        this.f71572a = z;
        this.f71573b = callableDescriptor;
        this.f71574c = callableDescriptor2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.TypeConstructorEquality
    public boolean equals(TypeConstructor typeConstructor, TypeConstructor typeConstructor2) {
        boolean m27805b;
        m27805b = DescriptorEquivalenceForOverrides.m27805b(this.f71572a, this.f71573b, this.f71574c, typeConstructor, typeConstructor2);
        return m27805b;
    }
}
