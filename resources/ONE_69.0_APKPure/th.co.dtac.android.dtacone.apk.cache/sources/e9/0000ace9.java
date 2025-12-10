package com.google.common.reflect;

import com.google.common.base.Preconditions;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import javax.annotation.CheckForNull;

/* loaded from: classes4.dex */
public abstract class TypeParameter<T> extends OW1 {

    /* renamed from: a */
    public final TypeVariable f54122a;

    public TypeParameter() {
        Type capture = capture();
        Preconditions.checkArgument(capture instanceof TypeVariable, "%s should be a type variable.", capture);
        this.f54122a = (TypeVariable) capture;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof TypeParameter) {
            return this.f54122a.equals(((TypeParameter) obj).f54122a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f54122a.hashCode();
    }

    public String toString() {
        return this.f54122a.toString();
    }
}