package p000;

import com.mixpanel.android.util.MPLog;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: gH1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C20067gH1 {

    /* renamed from: a */
    public long f62132a;

    /* renamed from: b */
    public long f62133b;

    /* renamed from: c */
    public long f62134c;

    /* renamed from: d */
    public String f62135d;

    /* renamed from: e */
    public Random f62136e;

    public C20067gH1() {
        m31395d();
        this.f62136e = new Random();
    }

    /* renamed from: a */
    public JSONObject m31398a() {
        return m31396c(true);
    }

    /* renamed from: b */
    public JSONObject m31397b() {
        return m31396c(false);
    }

    /* renamed from: c */
    public final JSONObject m31396c(boolean z) {
        long j;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("$mp_event_id", Long.toHexString(this.f62136e.nextLong()));
            jSONObject.put("$mp_session_id", this.f62135d);
            if (z) {
                j = this.f62132a;
            } else {
                j = this.f62133b;
            }
            jSONObject.put("$mp_session_seq_id", j);
            jSONObject.put("$mp_session_start_sec", this.f62134c);
            if (z) {
                this.f62132a++;
            } else {
                this.f62133b++;
            }
        } catch (JSONException e) {
            MPLog.m33448e(AbstractC17173yw.f109218a, "Cannot create session metadata JSON object", e);
        }
        return jSONObject;
    }

    /* renamed from: d */
    public void m31395d() {
        this.f62132a = 0L;
        this.f62133b = 0L;
        this.f62135d = Long.toHexString(new Random().nextLong());
        this.f62134c = System.currentTimeMillis() / 1000;
    }
}