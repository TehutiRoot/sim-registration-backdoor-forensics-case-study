package p000;

import com.google.android.gms.internal.vision.zzjf;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: DD2 */
/* loaded from: classes3.dex */
public final class DD2 {

    /* renamed from: c */
    public static final DD2 f939c = new DD2();

    /* renamed from: b */
    public final ConcurrentMap f941b = new ConcurrentHashMap();

    /* renamed from: a */
    public final InterfaceC21727qE2 f940a = new WB2();

    /* renamed from: a */
    public static DD2 m68673a() {
        return f939c;
    }

    /* renamed from: b */
    public final InterfaceC19835fE2 m68672b(Class cls) {
        zzjf.m46419d(cls, "messageType");
        InterfaceC19835fE2 interfaceC19835fE2 = (InterfaceC19835fE2) this.f941b.get(cls);
        if (interfaceC19835fE2 == null) {
            InterfaceC19835fE2 zza = this.f940a.zza(cls);
            zzjf.m46419d(cls, "messageType");
            zzjf.m46419d(zza, "schema");
            InterfaceC19835fE2 interfaceC19835fE22 = (InterfaceC19835fE2) this.f941b.putIfAbsent(cls, zza);
            if (interfaceC19835fE22 != null) {
                return interfaceC19835fE22;
            }
            return zza;
        }
        return interfaceC19835fE2;
    }

    /* renamed from: c */
    public final InterfaceC19835fE2 m68671c(Object obj) {
        return m68672b(obj.getClass());
    }
}
