package com.fasterxml.jackson.databind.type;

import ch.qos.logback.core.CoreConstants;
import com.fasterxml.jackson.databind.JavaType;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.http.message.TokenParser;

/* loaded from: classes3.dex */
public final class ClassStack {
    protected final Class<?> _current;
    protected final ClassStack _parent;

    /* renamed from: a */
    public ArrayList f43438a;

    public ClassStack(Class<?> cls) {
        this(null, cls);
    }

    public void addSelfReference(ResolvedRecursiveType resolvedRecursiveType) {
        if (this.f43438a == null) {
            this.f43438a = new ArrayList();
        }
        this.f43438a.add(resolvedRecursiveType);
    }

    public ClassStack child(Class<?> cls) {
        return new ClassStack(this, cls);
    }

    public ClassStack find(Class<?> cls) {
        if (this._current == cls) {
            return this;
        }
        for (ClassStack classStack = this._parent; classStack != null; classStack = classStack._parent) {
            if (classStack._current == cls) {
                return classStack;
            }
        }
        return null;
    }

    public void resolveSelfReferences(JavaType javaType) {
        ArrayList arrayList = this.f43438a;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((ResolvedRecursiveType) it.next()).setReference(javaType);
            }
        }
    }

    public String toString() {
        String valueOf;
        StringBuilder sb = new StringBuilder();
        sb.append("[ClassStack (self-refs: ");
        ArrayList arrayList = this.f43438a;
        if (arrayList == null) {
            valueOf = "0";
        } else {
            valueOf = String.valueOf(arrayList.size());
        }
        sb.append(valueOf);
        sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        for (ClassStack classStack = this; classStack != null; classStack = classStack._parent) {
            sb.append(TokenParser.f74644SP);
            sb.append(classStack._current.getName());
        }
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    public ClassStack(ClassStack classStack, Class cls) {
        this._parent = classStack;
        this._current = cls;
    }
}