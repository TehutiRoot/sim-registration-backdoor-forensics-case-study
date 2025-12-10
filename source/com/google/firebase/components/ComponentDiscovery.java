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
    public final Object f54703a;

    /* renamed from: b */
    public final InterfaceC8344c f54704b;

    /* renamed from: com.google.firebase.components.ComponentDiscovery$b */
    /* loaded from: classes4.dex */
    public static class C8343b implements InterfaceC8344c {

        /* renamed from: a */
        public final Class f54705a;

        /* renamed from: b */
        public final Bundle m39214b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.f54705a), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", this.f54705a + " has no service info.");
                    return null;
                }
                return serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        @Override // com.google.firebase.components.ComponentDiscovery.InterfaceC8344c
        /* renamed from: c */
        public List mo39212a(Context context) {
            Bundle m39214b = m39214b(context);
            if (m39214b == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : m39214b.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(m39214b.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }

        public C8343b(Class cls) {
            this.f54705a = cls;
        }
    }

    /* renamed from: com.google.firebase.components.ComponentDiscovery$c */
    /* loaded from: classes4.dex */
    public interface InterfaceC8344c {
        /* renamed from: a */
        List mo39212a(Object obj);
    }

    public ComponentDiscovery(Object obj, InterfaceC8344c interfaceC8344c) {
        this.f54703a = obj;
        this.f54704b = interfaceC8344c;
    }

    /* renamed from: a */
    public static /* synthetic */ ComponentRegistrar m39217a(String str) {
        return m39216b(str);
    }

    /* renamed from: b */
    public static ComponentRegistrar m39216b(String str) {
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
        return new ComponentDiscovery<>(context, new C8343b(cls));
    }

    @Deprecated
    public List<ComponentRegistrar> discover() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.f54704b.mo39212a(this.f54703a)) {
            try {
                ComponentRegistrar m39216b = m39216b(str);
                if (m39216b != null) {
                    arrayList.add(m39216b);
                }
            } catch (InvalidRegistrarException e) {
                Log.w("ComponentDiscovery", "Invalid component registrar.", e);
            }
        }
        return arrayList;
    }

    public List<Provider<ComponentRegistrar>> discoverLazy() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.f54704b.mo39212a(this.f54703a)) {
            arrayList.add(new Provider() { // from class: Xu
                @Override // com.google.firebase.inject.Provider
                public final Object get() {
                    return ComponentDiscovery.m39217a(str);
                }
            });
        }
        return arrayList;
    }
}
