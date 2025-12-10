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
    public AtomicReference f84898a = new AtomicReference();

    /* renamed from: b */
    public AtomicReference f84899b = new AtomicReference();

    /* renamed from: c */
    public AtomicReference f84900c = new AtomicReference();

    /* renamed from: d */
    public AtomicReference f84901d = new AtomicReference();

    /* renamed from: e */
    public AtomicReference f84902e = new AtomicReference();

    /* renamed from: f */
    public AtomicReference f84903f = new AtomicReference();

    /* renamed from: g */
    public AtomicReference f84904g = new AtomicReference();

    /* renamed from: h */
    public AtomicReference f84905h = new AtomicReference();

    /* renamed from: i */
    public AtomicReference f84906i = new AtomicReference();

    /* renamed from: j */
    public AtomicReference f84907j = new AtomicReference();

    /* renamed from: k */
    public AtomicReference f84908k = new AtomicReference();

    /* renamed from: l */
    public AtomicReference f84909l = new AtomicReference();

    /* renamed from: m */
    public AtomicReference f84910m = new AtomicReference();

    /* renamed from: n */
    public AtomicReference f84911n = new AtomicReference();

    /* renamed from: p */
    public AtomicReference f84913p = new AtomicReference();

    /* renamed from: q */
    public AtomicReference f84914q = new AtomicReference();

    /* renamed from: r */
    public AtomicReference f84915r = new AtomicReference();

    /* renamed from: o */
    public LruCache f84912o = new LruCache(((int) (Runtime.getRuntime().maxMemory() / 1024)) / 8);

    public LruCache<String, Bitmap> getCacheBitmap() {
        return this.f84912o;
    }

    public String getChannel() {
        return (String) this.f84905h.get();
    }

    public String getCliNumber() {
        return (String) this.f84902e.get();
    }

    public String getCompany() {
        return (String) this.f84913p.get();
    }

    public String getLatitudeLongitude() {
        return (String) this.f84901d.get();
    }

    public String getPromoterId() {
        return (String) this.f84914q.get();
    }

    public String getRetailerNumber() {
        return (String) this.f84900c.get();
    }

    public String getRetailerSubType() {
        return (String) this.f84908k.get();
    }

    public String getRetailerType() {
        return (String) this.f84907j.get();
    }

    public String getSessionId() {
        return (String) this.f84903f.get();
    }

    public String getSimRToken() {
        return (String) this.f84899b.get();
    }

    public String getStatus() {
        return (String) this.f84909l.get();
    }

    public String getSubChannel() {
        return (String) this.f84906i.get();
    }

    public String getToken() {
        return (String) this.f84898a.get();
    }

    public UsbDevice getUsbDevice() {
        return (UsbDevice) this.f84915r.get();
    }

    public String getUsedLocation() {
        return (String) this.f84904g.get();
    }

    public String getUserFormatType() {
        return (String) this.f84911n.get();
    }

    public String getUserType() {
        return (String) this.f84910m.get();
    }

    public void removeCacheBitmap(String str) {
        this.f84912o.remove(str);
        this.f84912o.evictAll();
    }

    public void setChannel(String str) {
        this.f84905h.set(str);
    }

    public void setCliNumber(String str) {
        this.f84902e.set(str);
    }

    public void setCompany(String str) {
        this.f84913p.set(str);
    }

    public void setLatitudeLongitude(String str) {
        this.f84901d.set(str);
    }

    public void setPromoterId(String str) {
        this.f84914q.set(str);
    }

    public void setRetailerNumber(String str) {
        this.f84900c.set(str);
    }

    public void setRetailerSubType(String str) {
        this.f84908k.set(str);
    }

    public void setRetailerType(String str) {
        this.f84907j.set(str);
    }

    public void setSessionId(String str) {
        this.f84903f.set(str);
    }

    public void setSimRToken(String str) {
        this.f84899b.set(str);
    }

    public void setStatus(String str) {
        this.f84909l.set(str);
    }

    public void setSubChannel(String str) {
        this.f84906i.set(str);
    }

    public void setToken(String str) {
        this.f84898a.set(str);
    }

    public void setUsedLocation(String str) {
        this.f84904g.set(str);
    }

    public void setUserFormatType(String str) {
        this.f84911n.set(str);
    }

    public void setUserType(String str) {
        this.f84910m.set(str);
    }

    public void updateCacheBitmap(String str, Bitmap bitmap) {
        this.f84912o.put(str, bitmap);
    }
}