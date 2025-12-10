package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.io.Serializable;
import java.lang.reflect.TypeVariable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.Typography;

/* loaded from: classes3.dex */
public class TypeBindings implements Serializable {
    private static final TypeBindings EMPTY;
    private static final String[] NO_STRINGS;
    private static final JavaType[] NO_TYPES;
    private static final long serialVersionUID = 1;
    private final int _hashCode;
    private final String[] _names;
    private final JavaType[] _types;
    private final String[] _unboundVariables;

    /* renamed from: com.fasterxml.jackson.databind.type.TypeBindings$a */
    /* loaded from: classes3.dex */
    public static final class C6138a {

        /* renamed from: a */
        public final Class f43427a;

        /* renamed from: b */
        public final JavaType[] f43428b;

        /* renamed from: c */
        public final int f43429c;

        public C6138a(Class cls, JavaType[] javaTypeArr, int i) {
            this.f43427a = cls;
            this.f43428b = javaTypeArr;
            this.f43429c = i;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != C6138a.class) {
                return false;
            }
            C6138a c6138a = (C6138a) obj;
            if (this.f43429c == c6138a.f43429c && this.f43427a == c6138a.f43427a) {
                JavaType[] javaTypeArr = c6138a.f43428b;
                int length = this.f43428b.length;
                if (length == javaTypeArr.length) {
                    for (int i = 0; i < length; i++) {
                        if (!this.f43428b[i].equals(javaTypeArr[i])) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f43429c;
        }

        public String toString() {
            return this.f43427a.getName() + "<>";
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.type.TypeBindings$b */
    /* loaded from: classes3.dex */
    public static class C6139b {

        /* renamed from: a */
        public static final TypeVariable[] f43430a = AbstractList.class.getTypeParameters();

        /* renamed from: b */
        public static final TypeVariable[] f43431b = Collection.class.getTypeParameters();

        /* renamed from: c */
        public static final TypeVariable[] f43432c = Iterable.class.getTypeParameters();

        /* renamed from: d */
        public static final TypeVariable[] f43433d = List.class.getTypeParameters();

        /* renamed from: e */
        public static final TypeVariable[] f43434e = ArrayList.class.getTypeParameters();

        /* renamed from: f */
        public static final TypeVariable[] f43435f = Map.class.getTypeParameters();

        /* renamed from: g */
        public static final TypeVariable[] f43436g = HashMap.class.getTypeParameters();

        /* renamed from: h */
        public static final TypeVariable[] f43437h = LinkedHashMap.class.getTypeParameters();

        /* renamed from: a */
        public static TypeVariable[] m49397a(Class cls) {
            if (cls == Collection.class) {
                return f43431b;
            }
            if (cls == List.class) {
                return f43433d;
            }
            if (cls == ArrayList.class) {
                return f43434e;
            }
            if (cls == AbstractList.class) {
                return f43430a;
            }
            if (cls == Iterable.class) {
                return f43432c;
            }
            return cls.getTypeParameters();
        }

        /* renamed from: b */
        public static TypeVariable[] m49396b(Class cls) {
            if (cls == Map.class) {
                return f43435f;
            }
            if (cls == HashMap.class) {
                return f43436g;
            }
            if (cls == LinkedHashMap.class) {
                return f43437h;
            }
            return cls.getTypeParameters();
        }
    }

    static {
        String[] strArr = new String[0];
        NO_STRINGS = strArr;
        JavaType[] javaTypeArr = new JavaType[0];
        NO_TYPES = javaTypeArr;
        EMPTY = new TypeBindings(strArr, javaTypeArr, null);
    }

    private TypeBindings(String[] strArr, JavaType[] javaTypeArr, String[] strArr2) {
        strArr = strArr == null ? NO_STRINGS : strArr;
        this._names = strArr;
        javaTypeArr = javaTypeArr == null ? NO_TYPES : javaTypeArr;
        this._types = javaTypeArr;
        if (strArr.length == javaTypeArr.length) {
            int length = javaTypeArr.length;
            int i = 1;
            for (int i2 = 0; i2 < length; i2++) {
                i += this._types[i2].hashCode();
            }
            this._unboundVariables = strArr2;
            this._hashCode = i;
            return;
        }
        throw new IllegalArgumentException("Mismatching names (" + strArr.length + "), types (" + javaTypeArr.length + ")");
    }

    public static TypeBindings create(Class<?> cls, List<JavaType> list) {
        return create(cls, (list == null || list.isEmpty()) ? NO_TYPES : (JavaType[]) list.toArray(new JavaType[list.size()]));
    }

    public static TypeBindings createIfNeeded(Class<?> cls, JavaType javaType) {
        TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
        int length = typeParameters == null ? 0 : typeParameters.length;
        if (length == 0) {
            return EMPTY;
        }
        if (length == 1) {
            return new TypeBindings(new String[]{typeParameters[0].getName()}, new JavaType[]{javaType}, null);
        }
        throw new IllegalArgumentException("Cannot create TypeBindings for class " + cls.getName() + " with 1 type parameter: class expects " + length);
    }

    public static TypeBindings emptyBindings() {
        return EMPTY;
    }

    public Object asKey(Class<?> cls) {
        return new C6138a(cls, this._types, this._hashCode);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!ClassUtil.hasClass(obj, getClass())) {
            return false;
        }
        TypeBindings typeBindings = (TypeBindings) obj;
        int length = this._types.length;
        if (length != typeBindings.size()) {
            return false;
        }
        JavaType[] javaTypeArr = typeBindings._types;
        for (int i = 0; i < length; i++) {
            if (!javaTypeArr[i].equals(this._types[i])) {
                return false;
            }
        }
        return true;
    }

    public JavaType findBoundType(String str) {
        JavaType selfReferencedType;
        int length = this._names.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(this._names[i])) {
                JavaType javaType = this._types[i];
                if ((javaType instanceof ResolvedRecursiveType) && (selfReferencedType = ((ResolvedRecursiveType) javaType).getSelfReferencedType()) != null) {
                    return selfReferencedType;
                }
                return javaType;
            }
        }
        return null;
    }

    public String getBoundName(int i) {
        if (i >= 0) {
            String[] strArr = this._names;
            if (i < strArr.length) {
                return strArr[i];
            }
            return null;
        }
        return null;
    }

    public JavaType getBoundType(int i) {
        if (i >= 0) {
            JavaType[] javaTypeArr = this._types;
            if (i < javaTypeArr.length) {
                return javaTypeArr[i];
            }
            return null;
        }
        return null;
    }

    public List<JavaType> getTypeParameters() {
        JavaType[] javaTypeArr = this._types;
        if (javaTypeArr.length == 0) {
            return Collections.emptyList();
        }
        return Arrays.asList(javaTypeArr);
    }

    public boolean hasUnbound(String str) {
        String[] strArr = this._unboundVariables;
        if (strArr != null) {
            int length = strArr.length;
            do {
                length--;
                if (length < 0) {
                    return false;
                }
            } while (!str.equals(this._unboundVariables[length]));
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this._hashCode;
    }

    public boolean isEmpty() {
        if (this._types.length == 0) {
            return true;
        }
        return false;
    }

    public Object readResolve() {
        String[] strArr = this._names;
        if (strArr != null && strArr.length != 0) {
            return this;
        }
        return EMPTY;
    }

    public int size() {
        return this._types.length;
    }

    public String toString() {
        if (this._types.length == 0) {
            return "<>";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Typography.less);
        int length = this._types.length;
        for (int i = 0; i < length; i++) {
            if (i > 0) {
                sb.append(',');
            }
            sb.append(this._types[i].getGenericSignature());
        }
        sb.append(Typography.greater);
        return sb.toString();
    }

    public JavaType[] typeParameterArray() {
        return this._types;
    }

    public TypeBindings withUnboundVariable(String str) {
        int length;
        String[] strArr;
        String[] strArr2 = this._unboundVariables;
        if (strArr2 == null) {
            length = 0;
        } else {
            length = strArr2.length;
        }
        if (length == 0) {
            strArr = new String[1];
        } else {
            strArr = (String[]) Arrays.copyOf(strArr2, length + 1);
        }
        strArr[length] = str;
        return new TypeBindings(this._names, this._types, strArr);
    }

    public static TypeBindings create(Class<?> cls, JavaType[] javaTypeArr) {
        String[] strArr;
        if (javaTypeArr == null) {
            javaTypeArr = NO_TYPES;
        } else {
            int length = javaTypeArr.length;
            if (length == 1) {
                return create(cls, javaTypeArr[0]);
            }
            if (length == 2) {
                return create(cls, javaTypeArr[0], javaTypeArr[1]);
            }
        }
        TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
        if (typeParameters != null && typeParameters.length != 0) {
            int length2 = typeParameters.length;
            strArr = new String[length2];
            for (int i = 0; i < length2; i++) {
                strArr[i] = typeParameters[i].getName();
            }
        } else {
            strArr = NO_STRINGS;
        }
        if (strArr.length != javaTypeArr.length) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot create TypeBindings for class ");
            sb.append(cls.getName());
            sb.append(" with ");
            sb.append(javaTypeArr.length);
            sb.append(" type parameter");
            sb.append(javaTypeArr.length == 1 ? "" : OperatorName.CLOSE_AND_STROKE);
            sb.append(": class expects ");
            sb.append(strArr.length);
            throw new IllegalArgumentException(sb.toString());
        }
        return new TypeBindings(strArr, javaTypeArr, null);
    }

    public static TypeBindings createIfNeeded(Class<?> cls, JavaType[] javaTypeArr) {
        TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
        if (typeParameters != null && typeParameters.length != 0) {
            if (javaTypeArr == null) {
                javaTypeArr = NO_TYPES;
            }
            int length = typeParameters.length;
            String[] strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = typeParameters[i].getName();
            }
            if (length != javaTypeArr.length) {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot create TypeBindings for class ");
                sb.append(cls.getName());
                sb.append(" with ");
                sb.append(javaTypeArr.length);
                sb.append(" type parameter");
                sb.append(javaTypeArr.length == 1 ? "" : OperatorName.CLOSE_AND_STROKE);
                sb.append(": class expects ");
                sb.append(length);
                throw new IllegalArgumentException(sb.toString());
            }
            return new TypeBindings(strArr, javaTypeArr, null);
        }
        return EMPTY;
    }

    public static TypeBindings create(Class<?> cls, JavaType javaType) {
        TypeVariable[] m49397a = C6139b.m49397a(cls);
        int length = m49397a == null ? 0 : m49397a.length;
        if (length == 1) {
            return new TypeBindings(new String[]{m49397a[0].getName()}, new JavaType[]{javaType}, null);
        }
        throw new IllegalArgumentException("Cannot create TypeBindings for class " + cls.getName() + " with 1 type parameter: class expects " + length);
    }

    public static TypeBindings create(Class<?> cls, JavaType javaType, JavaType javaType2) {
        TypeVariable[] m49396b = C6139b.m49396b(cls);
        int length = m49396b == null ? 0 : m49396b.length;
        if (length == 2) {
            return new TypeBindings(new String[]{m49396b[0].getName(), m49396b[1].getName()}, new JavaType[]{javaType, javaType2}, null);
        }
        throw new IllegalArgumentException("Cannot create TypeBindings for class " + cls.getName() + " with 2 type parameters: class expects " + length);
    }
}
