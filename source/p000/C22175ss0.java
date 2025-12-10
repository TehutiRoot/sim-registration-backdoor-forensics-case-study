package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.BackendFactory;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ss0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C22175ss0 implements BackendRegistry {

    /* renamed from: a */
    public final C13956a f79922a;

    /* renamed from: b */
    public final C0912Mz f79923b;

    /* renamed from: c */
    public final Map f79924c;

    /* renamed from: ss0$a */
    /* loaded from: classes3.dex */
    public static class C13956a {

        /* renamed from: a */
        public final Context f79925a;

        /* renamed from: b */
        public Map f79926b = null;

        public C13956a(Context context) {
            this.f79925a = context;
        }

        /* renamed from: d */
        public static Bundle m22546d(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, TransportBackendDiscovery.class), 128);
                if (serviceInfo == null) {
                    Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                    return null;
                }
                return serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        /* renamed from: a */
        public final Map m22549a(Context context) {
            Bundle m22546d = m22546d(context);
            if (m22546d == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            for (String str : m22546d.keySet()) {
                Object obj = m22546d.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String str2 : ((String) obj).split(",", -1)) {
                        String trim = str2.trim();
                        if (!trim.isEmpty()) {
                            hashMap.put(trim, str.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }

        /* renamed from: b */
        public BackendFactory m22548b(String str) {
            String str2 = (String) m22547c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (BackendFactory) Class.forName(str2).asSubclass(BackendFactory.class).getDeclaredConstructor(null).newInstance(null);
            } catch (ClassNotFoundException e) {
                Log.w("BackendRegistry", String.format("Class %s is not found.", str2), e);
                return null;
            } catch (IllegalAccessException e2) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e2);
                return null;
            } catch (InstantiationException e3) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e3);
                return null;
            } catch (NoSuchMethodException e4) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e4);
                return null;
            } catch (InvocationTargetException e5) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e5);
                return null;
            }
        }

        /* renamed from: c */
        public final Map m22547c() {
            if (this.f79926b == null) {
                this.f79926b = m22549a(this.f79925a);
            }
            return this.f79926b;
        }
    }

    public C22175ss0(Context context, C0912Mz c0912Mz) {
        this(new C13956a(context), c0912Mz);
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendRegistry
    public synchronized TransportBackend get(String str) {
        if (this.f79924c.containsKey(str)) {
            return (TransportBackend) this.f79924c.get(str);
        }
        BackendFactory m22548b = this.f79922a.m22548b(str);
        if (m22548b == null) {
            return null;
        }
        TransportBackend create = m22548b.create(this.f79923b.m67257a(str));
        this.f79924c.put(str, create);
        return create;
    }

    public C22175ss0(C13956a c13956a, C0912Mz c0912Mz) {
        this.f79924c = new HashMap();
        this.f79922a = c13956a;
        this.f79923b = c0912Mz;
    }
}
