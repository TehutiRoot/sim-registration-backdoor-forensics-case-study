package p000;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.TypesJVMKt;

/* renamed from: gW1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C20050gW1 implements TypeVariable, Type {

    /* renamed from: a */
    public final KTypeParameter f62187a;

    public C20050gW1(KTypeParameter typeParameter) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        this.f62187a = typeParameter;
    }

    public boolean equals(Object obj) {
        if (obj instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) obj;
            if (Intrinsics.areEqual(getName(), typeVariable.getName()) && Intrinsics.areEqual(getGenericDeclaration(), typeVariable.getGenericDeclaration())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.TypeVariable
    public Type[] getBounds() {
        Type m28723a;
        List<KType> upperBounds = this.f62187a.getUpperBounds();
        ArrayList arrayList = new ArrayList(AbstractC10176es.collectionSizeOrDefault(upperBounds, 10));
        for (KType kType : upperBounds) {
            m28723a = TypesJVMKt.m28723a(kType, true);
            arrayList.add(m28723a);
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    public GenericDeclaration getGenericDeclaration() {
        throw new NotImplementedError("An operation is not implemented: " + ("getGenericDeclaration() is not yet supported for type variables created from KType: " + this.f62187a));
    }

    @Override // java.lang.reflect.TypeVariable
    public String getName() {
        return this.f62187a.getName();
    }

    @Override // java.lang.reflect.Type
    public String getTypeName() {
        return getName();
    }

    public int hashCode() {
        return getName().hashCode() ^ getGenericDeclaration().hashCode();
    }

    public String toString() {
        return getTypeName();
    }
}
