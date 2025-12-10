package p000;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;

/* renamed from: mG */
/* loaded from: classes6.dex */
public class C12259mG implements KotlinTypeChecker.TypeConstructorEquality {

    /* renamed from: a */
    public final boolean f71939a;

    /* renamed from: b */
    public final CallableDescriptor f71940b;

    /* renamed from: c */
    public final CallableDescriptor f71941c;

    public C12259mG(boolean z, CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        this.f71939a = z;
        this.f71940b = callableDescriptor;
        this.f71941c = callableDescriptor2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.TypeConstructorEquality
    public boolean equals(TypeConstructor typeConstructor, TypeConstructor typeConstructor2) {
        boolean m28097b;
        m28097b = DescriptorEquivalenceForOverrides.m28097b(this.f71939a, this.f71940b, this.f71941c, typeConstructor, typeConstructor2);
        return m28097b;
    }
}