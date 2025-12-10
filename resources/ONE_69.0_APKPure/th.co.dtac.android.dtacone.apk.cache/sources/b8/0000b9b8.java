package com.mixpanel.android.mpmetrics;

import android.os.Parcel;
import android.os.Parcelable;
import org.bouncycastle.i18n.TextBundle;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class InAppButton implements Parcelable {
    public static final Parcelable.Creator<InAppButton> CREATOR = new C9132a();

    /* renamed from: a */
    public JSONObject f58530a;

    /* renamed from: b */
    public String f58531b;

    /* renamed from: c */
    public int f58532c;

    /* renamed from: d */
    public int f58533d;

    /* renamed from: e */
    public int f58534e;

    /* renamed from: f */
    public String f58535f;

    /* renamed from: com.mixpanel.android.mpmetrics.InAppButton$a */
    /* loaded from: classes5.dex */
    public static class C9132a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public InAppButton createFromParcel(Parcel parcel) {
            return new InAppButton(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public InAppButton[] newArray(int i) {
            return new InAppButton[i];
        }
    }

    public InAppButton(Parcel parcel) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject = new JSONObject(parcel.readString());
        } catch (JSONException unused) {
        }
        this.f58530a = jSONObject;
        this.f58531b = parcel.readString();
        this.f58532c = parcel.readInt();
        this.f58533d = parcel.readInt();
        this.f58534e = parcel.readInt();
        this.f58535f = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getBackgroundColor() {
        return this.f58533d;
    }

    public int getBorderColor() {
        return this.f58534e;
    }

    public String getCtaUrl() {
        return this.f58535f;
    }

    public String getText() {
        return this.f58531b;
    }

    public int getTextColor() {
        return this.f58532c;
    }

    public String toString() {
        return this.f58530a.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f58530a.toString());
        parcel.writeString(this.f58531b);
        parcel.writeInt(this.f58532c);
        parcel.writeInt(this.f58533d);
        parcel.writeInt(this.f58534e);
        parcel.writeString(this.f58535f);
    }

    public InAppButton(JSONObject jSONObject) {
        this.f58530a = jSONObject;
        this.f58531b = jSONObject.getString(TextBundle.TEXT_ENTRY);
        this.f58532c = jSONObject.getInt("text_color");
        this.f58533d = jSONObject.getInt("bg_color");
        this.f58534e = jSONObject.getInt("border_color");
        this.f58535f = jSONObject.getString("cta_url");
    }
}