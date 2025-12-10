package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzey {

    /* renamed from: a */
    public final String f48320a;

    /* renamed from: b */
    public final Bundle f48321b;

    /* renamed from: c */
    public Bundle f48322c;

    /* renamed from: d */
    public final /* synthetic */ En2 f48323d;

    public zzey(En2 en2, String str, Bundle bundle) {
        this.f48323d = en2;
        Preconditions.checkNotEmpty("default_event_parameters");
        this.f48320a = "default_event_parameters";
        this.f48321b = new Bundle();
    }

    @WorkerThread
    public final Bundle zza() {
        char c;
        if (this.f48322c == null) {
            String string = this.f48323d.m68457b().getString(this.f48320a, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            String string2 = jSONObject.getString(OperatorName.ENDPATH);
                            String string3 = jSONObject.getString("t");
                            int hashCode = string3.hashCode();
                            if (hashCode != 100) {
                                if (hashCode != 108) {
                                    if (hashCode == 115 && string3.equals(OperatorName.CLOSE_AND_STROKE)) {
                                        c = 0;
                                    }
                                    c = 65535;
                                } else {
                                    if (string3.equals(OperatorName.LINE_TO)) {
                                        c = 2;
                                    }
                                    c = 65535;
                                }
                            } else {
                                if (string3.equals("d")) {
                                    c = 1;
                                }
                                c = 65535;
                            }
                            if (c != 0) {
                                if (c != 1) {
                                    if (c != 2) {
                                        this.f48323d.zzs.zzay().zzd().zzb("Unrecognized persisted bundle type. Type", string3);
                                    } else {
                                        bundle.putLong(string2, Long.parseLong(jSONObject.getString(OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT)));
                                    }
                                } else {
                                    bundle.putDouble(string2, Double.parseDouble(jSONObject.getString(OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT)));
                                }
                            } else {
                                bundle.putString(string2, jSONObject.getString(OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT));
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            this.f48323d.zzs.zzay().zzd().zza("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.f48322c = bundle;
                } catch (JSONException unused2) {
                    this.f48323d.zzs.zzay().zzd().zza("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.f48322c == null) {
                this.f48322c = this.f48321b;
            }
        }
        return this.f48322c;
    }

    @WorkerThread
    public final void zzb(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        SharedPreferences.Editor edit = this.f48323d.m68457b().edit();
        if (bundle.size() == 0) {
            edit.remove(this.f48320a);
        } else {
            String str = this.f48320a;
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(OperatorName.ENDPATH, str2);
                        jSONObject.put(OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, obj.toString());
                        if (obj instanceof String) {
                            jSONObject.put("t", OperatorName.CLOSE_AND_STROKE);
                        } else if (obj instanceof Long) {
                            jSONObject.put("t", OperatorName.LINE_TO);
                        } else if (obj instanceof Double) {
                            jSONObject.put("t", "d");
                        } else {
                            this.f48323d.zzs.zzay().zzd().zzb("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e) {
                        this.f48323d.zzs.zzay().zzd().zzb("Cannot serialize bundle value to SharedPreferences", e);
                    }
                }
            }
            edit.putString(str, jSONArray.toString());
        }
        edit.apply();
        this.f48322c = bundle;
    }
}
