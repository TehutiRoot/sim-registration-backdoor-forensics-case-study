package p000;

import com.mixpanel.android.util.MPLog;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: jG1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C20528jG1 {

    /* renamed from: a */
    public long f67225a;

    /* renamed from: b */
    public long f67226b;

    /* renamed from: c */
    public long f67227c;

    /* renamed from: d */
    public String f67228d;

    /* renamed from: e */
    public Random f67229e;

    public C20528jG1() {
        m29224d();
        this.f67229e = new Random();
    }

    /* renamed from: a */
    public JSONObject m29227a() {
        return m29225c(true);
    }

    /* renamed from: b */
    public JSONObject m29226b() {
        return m29225c(false);
    }

    /* renamed from: c */
    public final JSONObject m29225c(boolean z) {
        long j;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("$mp_event_id", Long.toHexString(this.f67229e.nextLong()));
            jSONObject.put("$mp_session_id", this.f67228d);
            if (z) {
                j = this.f67225a;
            } else {
                j = this.f67226b;
            }
            jSONObject.put("$mp_session_seq_id", j);
            jSONObject.put("$mp_session_start_sec", this.f67227c);
            if (z) {
                this.f67225a++;
            } else {
                this.f67226b++;
            }
        } catch (JSONException e) {
            MPLog.m33456e(AbstractC17161yw.f108941a, "Cannot create session metadata JSON object", e);
        }
        return jSONObject;
    }

    /* renamed from: d */
    public void m29224d() {
        this.f67225a = 0L;
        this.f67226b = 0L;
        this.f67228d = Long.toHexString(new Random().nextLong());
        this.f67227c = System.currentTimeMillis() / 1000;
    }
}
