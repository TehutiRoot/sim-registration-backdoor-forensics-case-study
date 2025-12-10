package th.p047co.dtac.android.dtacone.manager;

import android.graphics.Bitmap;
import android.hardware.usb.UsbDevice;
import androidx.collection.LruCache;
import java.util.concurrent.atomic.AtomicReference;
import javax.inject.Singleton;

@Singleton
/* renamed from: th.co.dtac.android.dtacone.manager.TemporaryCache */
/* loaded from: classes7.dex */
public class TemporaryCache {

    /* renamed from: a */
    public AtomicReference f84788a = new AtomicReference();

    /* renamed from: b */
    public AtomicReference f84789b = new AtomicReference();

    /* renamed from: c */
    public AtomicReference f84790c = new AtomicReference();

    /* renamed from: d */
    public AtomicReference f84791d = new AtomicReference();

    /* renamed from: e */
    public AtomicReference f84792e = new AtomicReference();

    /* renamed from: f */
    public AtomicReference f84793f = new AtomicReference();

    /* renamed from: g */
    public AtomicReference f84794g = new AtomicReference();

    /* renamed from: h */
    public AtomicReference f84795h = new AtomicReference();

    /* renamed from: i */
    public AtomicReference f84796i = new AtomicReference();

    /* renamed from: j */
    public AtomicReference f84797j = new AtomicReference();

    /* renamed from: k */
    public AtomicReference f84798k = new AtomicReference();

    /* renamed from: l */
    public AtomicReference f84799l = new AtomicReference();

    /* renamed from: m */
    public AtomicReference f84800m = new AtomicReference();

    /* renamed from: n */
    public AtomicReference f84801n = new AtomicReference();

    /* renamed from: p */
    public AtomicReference f84803p = new AtomicReference();

    /* renamed from: q */
    public AtomicReference f84804q = new AtomicReference();

    /* renamed from: r */
    public AtomicReference f84805r = new AtomicReference();

    /* renamed from: o */
    public LruCache f84802o = new LruCache(((int) (Runtime.getRuntime().maxMemory() / 1024)) / 8);

    public LruCache<String, Bitmap> getCacheBitmap() {
        return this.f84802o;
    }

    public String getChannel() {
        return (String) this.f84795h.get();
    }

    public String getCliNumber() {
        return (String) this.f84792e.get();
    }

    public String getCompany() {
        return (String) this.f84803p.get();
    }

    public String getLatitudeLongitude() {
        return (String) this.f84791d.get();
    }

    public String getPromoterId() {
        return (String) this.f84804q.get();
    }

    public String getRetailerNumber() {
        return (String) this.f84790c.get();
    }

    public String getRetailerSubType() {
        return (String) this.f84798k.get();
    }

    public String getRetailerType() {
        return (String) this.f84797j.get();
    }

    public String getSessionId() {
        return (String) this.f84793f.get();
    }

    public String getSimRToken() {
        return (String) this.f84789b.get();
    }

    public String getStatus() {
        return (String) this.f84799l.get();
    }

    public String getSubChannel() {
        return (String) this.f84796i.get();
    }

    public String getToken() {
        return (String) this.f84788a.get();
    }

    public UsbDevice getUsbDevice() {
        return (UsbDevice) this.f84805r.get();
    }

    public String getUsedLocation() {
        return (String) this.f84794g.get();
    }

    public String getUserFormatType() {
        return (String) this.f84801n.get();
    }

    public String getUserType() {
        return (String) this.f84800m.get();
    }

    public void removeCacheBitmap(String str) {
        this.f84802o.remove(str);
        this.f84802o.evictAll();
    }

    public void setChannel(String str) {
        this.f84795h.set(str);
    }

    public void setCliNumber(String str) {
        this.f84792e.set(str);
    }

    public void setCompany(String str) {
        this.f84803p.set(str);
    }

    public void setLatitudeLongitude(String str) {
        this.f84791d.set(str);
    }

    public void setPromoterId(String str) {
        this.f84804q.set(str);
    }

    public void setRetailerNumber(String str) {
        this.f84790c.set(str);
    }

    public void setRetailerSubType(String str) {
        this.f84798k.set(str);
    }

    public void setRetailerType(String str) {
        this.f84797j.set(str);
    }

    public void setSessionId(String str) {
        this.f84793f.set(str);
    }

    public void setSimRToken(String str) {
        this.f84789b.set(str);
    }

    public void setStatus(String str) {
        this.f84799l.set(str);
    }

    public void setSubChannel(String str) {
        this.f84796i.set(str);
    }

    public void setToken(String str) {
        this.f84788a.set(str);
    }

    public void setUsedLocation(String str) {
        this.f84794g.set(str);
    }

    public void setUserFormatType(String str) {
        this.f84801n.set(str);
    }

    public void setUserType(String str) {
        this.f84800m.set(str);
    }

    public void updateCacheBitmap(String str, Bitmap bitmap) {
        this.f84802o.put(str, bitmap);
    }
}
