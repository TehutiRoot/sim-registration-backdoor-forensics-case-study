package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/* loaded from: classes3.dex */
public class TypeParser implements Serializable {
    private static final long serialVersionUID = 1;
    protected final TypeFactory _factory;

    /* renamed from: com.fasterxml.jackson.databind.type.TypeParser$a */
    /* loaded from: classes3.dex */
    public static final class C6129a extends StringTokenizer {

        /* renamed from: a */
        public final String f43450a;

        /* renamed from: b */
        public int f43451b;

        /* renamed from: c */
        public String f43452c;

        public C6129a(String str) {
            super(str, "<,>", true);
            this.f43450a = str;
        }

        /* renamed from: a */
        public String m49392a() {
            return this.f43450a;
        }

        /* renamed from: b */
        public String m49391b() {
            return this.f43450a.substring(this.f43451b);
        }

        /* renamed from: c */
        public void m49390c(String str) {
            this.f43452c = str;
        }

        @Override // java.util.StringTokenizer
        public boolean hasMoreTokens() {
            if (this.f43452c == null && !super.hasMoreTokens()) {
                return false;
            }
            return true;
        }

        @Override // java.util.StringTokenizer
        public String nextToken() {
            String str = this.f43452c;
            if (str != null) {
                this.f43452c = null;
                return str;
            }
            String nextToken = super.nextToken();
            this.f43451b += nextToken.length();
            return nextToken.trim();
        }
    }

    public TypeParser(TypeFactory typeFactory) {
        this._factory = typeFactory;
    }

    public IllegalArgumentException _problem(C6129a c6129a, String str) {
        return new IllegalArgumentException(String.format("Failed to parse type '%s' (remaining: '%s'): %s", c6129a.m49392a(), c6129a.m49391b(), str));
    }

    public Class<?> findClass(String str, C6129a c6129a) {
        try {
            return this._factory.findClass(str);
        } catch (Exception e) {
            ClassUtil.throwIfRTE(e);
            throw _problem(c6129a, "Cannot locate class '" + str + "', problem: " + e.getMessage());
        }
    }

    public JavaType parse(String str) throws IllegalArgumentException {
        C6129a c6129a = new C6129a(str.trim());
        JavaType parseType = parseType(c6129a);
        if (!c6129a.hasMoreTokens()) {
            return parseType;
        }
        throw _problem(c6129a, "Unexpected tokens after complete type");
    }

    public JavaType parseType(C6129a c6129a) throws IllegalArgumentException {
        if (c6129a.hasMoreTokens()) {
            Class<?> findClass = findClass(c6129a.nextToken(), c6129a);
            if (c6129a.hasMoreTokens()) {
                String nextToken = c6129a.nextToken();
                if ("<".equals(nextToken)) {
                    return this._factory._fromClass(null, findClass, TypeBindings.create(findClass, parseTypes(c6129a)));
                }
                c6129a.m49390c(nextToken);
            }
            return this._factory._fromClass(null, findClass, null);
        }
        throw _problem(c6129a, "Unexpected end-of-string");
    }

    public List<JavaType> parseTypes(C6129a c6129a) throws IllegalArgumentException {
        ArrayList arrayList = new ArrayList();
        while (c6129a.hasMoreTokens()) {
            arrayList.add(parseType(c6129a));
            if (!c6129a.hasMoreTokens()) {
                break;
            }
            String nextToken = c6129a.nextToken();
            if (">".equals(nextToken)) {
                return arrayList;
            }
            if (!",".equals(nextToken)) {
                throw _problem(c6129a, "Unexpected token '" + nextToken + "', expected ',' or '>')");
            }
        }
        throw _problem(c6129a, "Unexpected end-of-string");
    }

    public TypeParser withFactory(TypeFactory typeFactory) {
        if (typeFactory == this._factory) {
            return this;
        }
        return new TypeParser(typeFactory);
    }
}