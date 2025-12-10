package com.mixpanel.android.mpmetrics;

import android.os.Parcel;
import android.os.Parcelable;
import com.mixpanel.android.mpmetrics.InAppNotification;
import com.mixpanel.android.util.JSONUtils;
import java.util.ArrayList;
import org.bouncycastle.i18n.MessageBundle;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class TakeoverInAppNotification extends InAppNotification {
    public static final Parcelable.Creator<TakeoverInAppNotification> CREATOR = new C9166a();

    /* renamed from: g */
    public final ArrayList f58631g;

    /* renamed from: h */
    public final int f58632h;

    /* renamed from: i */
    public final String f58633i;

    /* renamed from: j */
    public final int f58634j;

    /* renamed from: k */
    public final boolean f58635k;

    /* renamed from: com.mixpanel.android.mpmetrics.TakeoverInAppNotification$a */
    /* loaded from: classes5.dex */
    public static class C9166a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public TakeoverInAppNotification createFromParcel(Parcel parcel) {
            return new TakeoverInAppNotification(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public TakeoverInAppNotification[] newArray(int i) {
            return new TakeoverInAppNotification[i];
        }
    }

    public TakeoverInAppNotification(Parcel parcel) {
        super(parcel);
        this.f58631g = parcel.createTypedArrayList(InAppButton.CREATOR);
        this.f58632h = parcel.readInt();
        this.f58633i = parcel.readString();
        this.f58634j = parcel.readInt();
        this.f58635k = parcel.readByte() != 0;
    }

    public InAppButton getButton(int i) {
        if (this.f58631g.size() > i) {
            return (InAppButton) this.f58631g.get(i);
        }
        return null;
    }

    public int getCloseColor() {
        return this.f58632h;
    }

    public int getNumButtons() {
        return this.f58631g.size();
    }

    public String getTitle() {
        return this.f58633i;
    }

    public int getTitleColor() {
        return this.f58634j;
    }

    @Override // com.mixpanel.android.mpmetrics.InAppNotification
    public InAppNotification.Type getType() {
        return InAppNotification.Type.TAKEOVER;
    }

    public boolean hasTitle() {
        if (this.f58633i != null) {
            return true;
        }
        return false;
    }

    public boolean setShouldShowShadow() {
        return this.f58635k;
    }

    @Override // com.mixpanel.android.mpmetrics.InAppNotification, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.f58631g);
        parcel.writeInt(this.f58632h);
        parcel.writeString(this.f58633i);
        parcel.writeInt(this.f58634j);
        parcel.writeByte(this.f58635k ? (byte) 1 : (byte) 0);
    }

    public TakeoverInAppNotification(JSONObject jSONObject) {
        super(jSONObject);
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("buttons");
            this.f58631g = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                this.f58631g.add(new InAppButton((JSONObject) jSONArray.get(i)));
            }
            this.f58632h = jSONObject.getInt("close_color");
            this.f58633i = JSONUtils.optionalStringKey(jSONObject, MessageBundle.TITLE_ENTRY);
            this.f58634j = jSONObject.optInt("title_color");
            this.f58635k = getExtras().getBoolean("image_fade");
        } catch (JSONException e) {
            throw new BadDecideObjectException("Notification JSON was unexpected or bad", e);
        }
    }
}
