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
    public static final class C6140a extends StringTokenizer {

        /* renamed from: a */
        public final String f43438a;

        /* renamed from: b */
        public int f43439b;

        /* renamed from: c */
        public String f43440c;

        public C6140a(String str) {
            super(str, "<,>", true);
            this.f43438a = str;
        }

        /* renamed from: a */
        public String m49395a() {
            return this.f43438a;
        }

        /* renamed from: b */
        public String m49394b() {
            return this.f43438a.substring(this.f43439b);
        }

        /* renamed from: c */
        public void m49393c(String str) {
            this.f43440c = str;
        }

        @Override // java.util.StringTokenizer
        public boolean hasMoreTokens() {
            if (this.f43440c == null && !super.hasMoreTokens()) {
                return false;
            }
            return true;
        }

        @Override // java.util.StringTokenizer
        public String nextToken() {
            String str = this.f43440c;
            if (str != null) {
                this.f43440c = null;
                return str;
            }
            String nextToken = super.nextToken();
            this.f43439b += nextToken.length();
            return nextToken.trim();
        }
    }

    public TypeParser(TypeFactory typeFactory) {
        this._factory = typeFactory;
    }

    public IllegalArgumentException _problem(C6140a c6140a, String str) {
        return new IllegalArgumentException(String.format("Failed to parse type '%s' (remaining: '%s'): %s", c6140a.m49395a(), c6140a.m49394b(), str));
    }

    public Class<?> findClass(String str, C6140a c6140a) {
        try {
            return this._factory.findClass(str);
        } catch (Exception e) {
            ClassUtil.throwIfRTE(e);
            throw _problem(c6140a, "Cannot locate class '" + str + "', problem: " + e.getMessage());
        }
    }

    public JavaType parse(String str) throws IllegalArgumentException {
        C6140a c6140a = new C6140a(str.trim());
        JavaType parseType = parseType(c6140a);
        if (!c6140a.hasMoreTokens()) {
            return parseType;
        }
        throw _problem(c6140a, "Unexpected tokens after complete type");
    }

    public JavaType parseType(C6140a c6140a) throws IllegalArgumentException {
        if (c6140a.hasMoreTokens()) {
            Class<?> findClass = findClass(c6140a.nextToken(), c6140a);
            if (c6140a.hasMoreTokens()) {
                String nextToken = c6140a.nextToken();
                if ("<".equals(nextToken)) {
                    return this._factory._fromClass(null, findClass, TypeBindings.create(findClass, parseTypes(c6140a)));
                }
                c6140a.m49393c(nextToken);
            }
            return this._factory._fromClass(null, findClass, null);
        }
        throw _problem(c6140a, "Unexpected end-of-string");
    }

    public List<JavaType> parseTypes(C6140a c6140a) throws IllegalArgumentException {
        ArrayList arrayList = new ArrayList();
        while (c6140a.hasMoreTokens()) {
            arrayList.add(parseType(c6140a));
            if (!c6140a.hasMoreTokens()) {
                break;
            }
            String nextToken = c6140a.nextToken();
            if (">".equals(nextToken)) {
                return arrayList;
            }
            if (!",".equals(nextToken)) {
                throw _problem(c6140a, "Unexpected token '" + nextToken + "', expected ',' or '>')");
            }
        }
        throw _problem(c6140a, "Unexpected end-of-string");
    }

    public TypeParser withFactory(TypeFactory typeFactory) {
        if (typeFactory == this._factory) {
            return this;
        }
        return new TypeParser(typeFactory);
    }
}
