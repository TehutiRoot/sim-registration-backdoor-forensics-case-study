package com.mixpanel.android.mpmetrics;

import android.os.Parcel;
import android.os.Parcelable;
import com.mixpanel.android.mpmetrics.InAppNotification;
import com.mixpanel.android.util.JSONUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class MiniInAppNotification extends InAppNotification {
    public static final Parcelable.Creator<MiniInAppNotification> CREATOR = new C9154a();

    /* renamed from: g */
    public final String f58588g;

    /* renamed from: h */
    public final int f58589h;

    /* renamed from: i */
    public final int f58590i;

    /* renamed from: com.mixpanel.android.mpmetrics.MiniInAppNotification$a */
    /* loaded from: classes5.dex */
    public static class C9154a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public MiniInAppNotification createFromParcel(Parcel parcel) {
            return new MiniInAppNotification(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public MiniInAppNotification[] newArray(int i) {
            return new MiniInAppNotification[i];
        }
    }

    public MiniInAppNotification(Parcel parcel) {
        super(parcel);
        this.f58588g = parcel.readString();
        this.f58589h = parcel.readInt();
        this.f58590i = parcel.readInt();
    }

    public int getBorderColor() {
        return this.f58590i;
    }

    public String getCtaUrl() {
        return this.f58588g;
    }

    public int getImageTintColor() {
        return this.f58589h;
    }

    @Override // com.mixpanel.android.mpmetrics.InAppNotification
    public InAppNotification.Type getType() {
        return InAppNotification.Type.MINI;
    }

    @Override // com.mixpanel.android.mpmetrics.InAppNotification, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f58588g);
        parcel.writeInt(this.f58589h);
        parcel.writeInt(this.f58590i);
    }

    public MiniInAppNotification(JSONObject jSONObject) {
        super(jSONObject);
        try {
            this.f58588g = JSONUtils.optionalStringKey(jSONObject, "cta_url");
            this.f58589h = jSONObject.getInt("image_tint_color");
            this.f58590i = jSONObject.getInt("border_color");
        } catch (JSONException e) {
            throw new BadDecideObjectException("Notification JSON was unexpected or bad", e);
        }
    }
}
