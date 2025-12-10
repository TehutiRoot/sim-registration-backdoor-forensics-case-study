package com.tom_roush.pdfbox.pdmodel.encryption;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class SecurityHandlerFactory {
    public static final SecurityHandlerFactory INSTANCE = new SecurityHandlerFactory();

    /* renamed from: a */
    public final Map f60334a = new HashMap();

    /* renamed from: b */
    public final Map f60335b = new HashMap();

    public SecurityHandlerFactory() {
        registerHandler("Standard", StandardSecurityHandler.class, StandardProtectionPolicy.class);
        registerHandler(PublicKeySecurityHandler.FILTER, PublicKeySecurityHandler.class, PublicKeyProtectionPolicy.class);
    }

    /* renamed from: a */
    public final SecurityHandler m32494a(Class cls, Class[] clsArr, Object[] objArr) {
        try {
            return (SecurityHandler) cls.getDeclaredConstructor(clsArr).newInstance(objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    public SecurityHandler newSecurityHandlerForFilter(String str) {
        Class cls = (Class) this.f60334a.get(str);
        if (cls == null) {
            return null;
        }
        return m32494a(cls, new Class[0], new Object[0]);
    }

    public SecurityHandler newSecurityHandlerForPolicy(ProtectionPolicy protectionPolicy) {
        Class cls = (Class) this.f60335b.get(protectionPolicy.getClass());
        if (cls == null) {
            return null;
        }
        return m32494a(cls, new Class[]{protectionPolicy.getClass()}, new Object[]{protectionPolicy});
    }

    public void registerHandler(String str, Class<? extends SecurityHandler> cls, Class<? extends ProtectionPolicy> cls2) {
        if (!this.f60334a.containsKey(str)) {
            this.f60334a.put(str, cls);
            this.f60335b.put(cls2, cls);
            return;
        }
        throw new IllegalStateException("The security handler name is already registered");
    }
}