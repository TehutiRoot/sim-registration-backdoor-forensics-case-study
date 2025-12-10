package com.mixpanel.android.mpmetrics;

import android.os.Parcel;
import android.os.Parcelable;
import org.bouncycastle.i18n.TextBundle;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class InAppButton implements Parcelable {
    public static final Parcelable.Creator<InAppButton> CREATOR = new C9143a();

    /* renamed from: a */
    public JSONObject f58518a;

    /* renamed from: b */
    public String f58519b;

    /* renamed from: c */
    public int f58520c;

    /* renamed from: d */
    public int f58521d;

    /* renamed from: e */
    public int f58522e;

    /* renamed from: f */
    public String f58523f;

    /* renamed from: com.mixpanel.android.mpmetrics.InAppButton$a */
    /* loaded from: classes5.dex */
    public static class C9143a implements Parcelable.Creator {
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
        this.f58518a = jSONObject;
        this.f58519b = parcel.readString();
        this.f58520c = parcel.readInt();
        this.f58521d = parcel.readInt();
        this.f58522e = parcel.readInt();
        this.f58523f = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getBackgroundColor() {
        return this.f58521d;
    }

    public int getBorderColor() {
        return this.f58522e;
    }

    public String getCtaUrl() {
        return this.f58523f;
    }

    public String getText() {
        return this.f58519b;
    }

    public int getTextColor() {
        return this.f58520c;
    }

    public String toString() {
        return this.f58518a.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f58518a.toString());
        parcel.writeString(this.f58519b);
        parcel.writeInt(this.f58520c);
        parcel.writeInt(this.f58521d);
        parcel.writeInt(this.f58522e);
        parcel.writeString(this.f58523f);
    }

    public InAppButton(JSONObject jSONObject) {
        this.f58518a = jSONObject;
        this.f58519b = jSONObject.getString(TextBundle.TEXT_ENTRY);
        this.f58520c = jSONObject.getInt("text_color");
        this.f58521d = jSONObject.getInt("bg_color");
        this.f58522e = jSONObject.getInt("border_color");
        this.f58523f = jSONObject.getString("cta_url");
    }
}
