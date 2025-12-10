package androidx.constraintlayout.core.state;

import java.util.HashMap;
import java.util.Set;

/* loaded from: classes2.dex */
public class Registry {

    /* renamed from: b */
    public static final Registry f32359b = new Registry();

    /* renamed from: a */
    public HashMap f32360a = new HashMap();

    public static Registry getInstance() {
        return f32359b;
    }

    public String currentContent(String str) {
        RegistryCallback registryCallback = (RegistryCallback) this.f32360a.get(str);
        if (registryCallback != null) {
            return registryCallback.currentMotionScene();
        }
        return null;
    }

    public String currentLayoutInformation(String str) {
        RegistryCallback registryCallback = (RegistryCallback) this.f32360a.get(str);
        if (registryCallback != null) {
            return registryCallback.currentLayoutInformation();
        }
        return null;
    }

    public long getLastModified(String str) {
        RegistryCallback registryCallback = (RegistryCallback) this.f32360a.get(str);
        if (registryCallback != null) {
            return registryCallback.getLastModified();
        }
        return Long.MAX_VALUE;
    }

    public Set<String> getLayoutList() {
        return this.f32360a.keySet();
    }

    public void register(String str, RegistryCallback registryCallback) {
        this.f32360a.put(str, registryCallback);
    }

    public void setDrawDebug(String str, int i) {
        RegistryCallback registryCallback = (RegistryCallback) this.f32360a.get(str);
        if (registryCallback != null) {
            registryCallback.setDrawDebug(i);
        }
    }

    public void setLayoutInformationMode(String str, int i) {
        RegistryCallback registryCallback = (RegistryCallback) this.f32360a.get(str);
        if (registryCallback != null) {
            registryCallback.setLayoutInformationMode(i);
        }
    }

    public void unregister(String str, RegistryCallback registryCallback) {
        this.f32360a.remove(str);
    }

    public void updateContent(String str, String str2) {
        RegistryCallback registryCallback = (RegistryCallback) this.f32360a.get(str);
        if (registryCallback != null) {
            registryCallback.onNewMotionScene(str2);
        }
    }

    public void updateDimensions(String str, int i, int i2) {
        RegistryCallback registryCallback = (RegistryCallback) this.f32360a.get(str);
        if (registryCallback != null) {
            registryCallback.onDimensions(i, i2);
        }
    }

    public void updateProgress(String str, float f) {
        RegistryCallback registryCallback = (RegistryCallback) this.f32360a.get(str);
        if (registryCallback != null) {
            registryCallback.onProgress(f);
        }
    }
}
