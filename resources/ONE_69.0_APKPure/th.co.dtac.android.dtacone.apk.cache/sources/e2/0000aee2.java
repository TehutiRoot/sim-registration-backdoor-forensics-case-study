package com.google.firebase.components;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.components.ComponentDiscovery;
import com.google.firebase.inject.Provider;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class ComponentDiscovery<T> {

    /* renamed from: a */
    public final Object f54715a;

    /* renamed from: b */
    public final InterfaceC8333c f54716b;

    /* renamed from: com.google.firebase.components.ComponentDiscovery$b */
    /* loaded from: classes4.dex */
    public static class C8332b implements InterfaceC8333c {

        /* renamed from: a */
        public final Class f54717a;

        /* renamed from: b */
        public final Bundle m39206b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.f54717a), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", this.f54717a + " has no service info.");
                    return null;
                }
                return serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        @Override // com.google.firebase.components.ComponentDiscovery.InterfaceC8333c
        /* renamed from: c */
        public List mo39204a(Context context) {
            Bundle m39206b = m39206b(context);
            if (m39206b == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : m39206b.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(m39206b.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }

        public C8332b(Class cls) {
            this.f54717a = cls;
        }
    }

    /* renamed from: com.google.firebase.components.ComponentDiscovery$c */
    /* loaded from: classes4.dex */
    public interface InterfaceC8333c {
        /* renamed from: a */
        List mo39204a(Object obj);
    }

    public ComponentDiscovery(Object obj, InterfaceC8333c interfaceC8333c) {
        this.f54715a = obj;
        this.f54716b = interfaceC8333c;
    }

    /* renamed from: a */
    public static /* synthetic */ ComponentRegistrar m39209a(String str) {
        return m39208b(str);
    }

    /* renamed from: b */
    public static ComponentRegistrar m39208b(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
            }
            throw new InvalidRegistrarException(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str), e);
        } catch (InstantiationException e2) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str), e2);
        } catch (NoSuchMethodException e3) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", str), e3);
        } catch (InvocationTargetException e4) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", str), e4);
        }
    }

    public static ComponentDiscovery<Context> forContext(Context context, Class<? extends Service> cls) {
        return new ComponentDiscovery<>(context, new C8332b(cls));
    }

    @Deprecated
    public List<ComponentRegistrar> discover() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.f54716b.mo39204a(this.f54715a)) {
            try {
                ComponentRegistrar m39208b = m39208b(str);
                if (m39208b != null) {
                    arrayList.add(m39208b);
                }
            } catch (InvalidRegistrarException e) {
                Log.w("ComponentDiscovery", "Invalid component registrar.", e);
            }
        }
        return arrayList;
    }

    public List<Provider<ComponentRegistrar>> discoverLazy() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.f54716b.mo39204a(this.f54715a)) {
            arrayList.add(new Provider() { // from class: Xu
                @Override // com.google.firebase.inject.Provider
                public final Object get() {
                    return ComponentDiscovery.m39209a(str);
                }
            });
        }
        return arrayList;
    }
}