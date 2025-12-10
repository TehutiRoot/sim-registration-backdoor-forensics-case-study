package com.mixpanel.android.mpmetrics;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.messaging.Constants;
import com.mixpanel.android.util.JSONUtils;
import com.mixpanel.android.util.MPLog;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public abstract class InAppNotification implements Parcelable {

    /* renamed from: f */
    public static final Pattern f58539f = Pattern.compile("(\\.[^./]+$)");

    /* renamed from: a */
    public final int f58540a;

    /* renamed from: b */
    public final String f58541b;

    /* renamed from: c */
    public final int f58542c;

    /* renamed from: d */
    public final String f58543d;

    /* renamed from: e */
    public Bitmap f58544e;
    protected final JSONObject mDescription;
    protected final JSONObject mExtras;
    protected final int mId;
    protected final int mMessageId;

    /* loaded from: classes5.dex */
    public enum Type {
        UNKNOWN { // from class: com.mixpanel.android.mpmetrics.InAppNotification.Type.1
            @Override // java.lang.Enum
            public String toString() {
                return "*unknown_type*";
            }
        },
        MINI { // from class: com.mixpanel.android.mpmetrics.InAppNotification.Type.2
            @Override // java.lang.Enum
            public String toString() {
                return "mini";
            }
        },
        TAKEOVER { // from class: com.mixpanel.android.mpmetrics.InAppNotification.Type.3
            @Override // java.lang.Enum
            public String toString() {
                return "takeover";
            }
        }
    }

    public InAppNotification() {
        this.mDescription = null;
        this.mExtras = null;
        this.mId = 0;
        this.mMessageId = 0;
        this.f58540a = 0;
        this.f58541b = null;
        this.f58542c = 0;
        this.f58543d = null;
    }

    /* renamed from: c */
    public static String m33627c(String str, String str2) {
        Matcher matcher = f58539f.matcher(str);
        if (matcher.find()) {
            return matcher.replaceFirst(str2 + "$1");
        }
        return str;
    }

    /* renamed from: a */
    public JSONObject m33629a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("campaign_id", getId());
            jSONObject.put(Constants.MessagePayloadKeys.MSGID_SERVER, getMessageId());
            jSONObject.put(Constants.MessagePayloadKeys.MESSAGE_TYPE, "inapp");
            jSONObject.put("message_subtype", getType().toString());
        } catch (JSONException e) {
            MPLog.m33456e("MixpanelAPI.InAppNotif", "Impossible JSON Exception", e);
        }
        return jSONObject;
    }

    /* renamed from: b */
    public void m33628b(Bitmap bitmap) {
        this.f58544e = bitmap;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getBackgroundColor() {
        return this.f58540a;
    }

    public String getBody() {
        return this.f58541b;
    }

    public int getBodyColor() {
        return this.f58542c;
    }

    public JSONObject getExtras() {
        return this.mExtras;
    }

    public int getId() {
        return this.mId;
    }

    public Bitmap getImage() {
        return this.f58544e;
    }

    public String getImage2xUrl() {
        return m33627c(this.f58543d, "@2x");
    }

    public String getImage4xUrl() {
        return m33627c(this.f58543d, "@4x");
    }

    public String getImageUrl() {
        return this.f58543d;
    }

    public int getMessageId() {
        return this.mMessageId;
    }

    public abstract Type getType();

    public boolean hasBody() {
        if (this.f58541b != null) {
            return true;
        }
        return false;
    }

    public String toString() {
        return this.mDescription.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mDescription.toString());
        parcel.writeString(this.mExtras.toString());
        parcel.writeInt(this.mId);
        parcel.writeInt(this.mMessageId);
        parcel.writeInt(this.f58540a);
        parcel.writeString(this.f58541b);
        parcel.writeInt(this.f58542c);
        parcel.writeString(this.f58543d);
        parcel.writeParcelable(this.f58544e, i);
    }

    public InAppNotification(Parcel parcel) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject = new JSONObject(parcel.readString());
        } catch (JSONException unused) {
        }
        try {
            jSONObject3 = new JSONObject(parcel.readString());
        } catch (JSONException unused2) {
            jSONObject2 = jSONObject;
            MPLog.m33457e("MixpanelAPI.InAppNotif", "Error reading JSON when creating InAppNotification from Parcel");
            jSONObject = jSONObject2;
            this.mDescription = jSONObject;
            this.mExtras = jSONObject3;
            this.mId = parcel.readInt();
            this.mMessageId = parcel.readInt();
            this.f58540a = parcel.readInt();
            this.f58541b = parcel.readString();
            this.f58542c = parcel.readInt();
            this.f58543d = parcel.readString();
            this.f58544e = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        }
        this.mDescription = jSONObject;
        this.mExtras = jSONObject3;
        this.mId = parcel.readInt();
        this.mMessageId = parcel.readInt();
        this.f58540a = parcel.readInt();
        this.f58541b = parcel.readString();
        this.f58542c = parcel.readInt();
        this.f58543d = parcel.readString();
        this.f58544e = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
    }

    public InAppNotification(JSONObject jSONObject) {
        try {
            this.mDescription = jSONObject;
            this.mExtras = jSONObject.getJSONObject("extras");
            this.mId = jSONObject.getInt("id");
            this.mMessageId = jSONObject.getInt(Constants.MessagePayloadKeys.MSGID_SERVER);
            this.f58540a = jSONObject.getInt("bg_color");
            this.f58541b = JSONUtils.optionalStringKey(jSONObject, "body");
            this.f58542c = jSONObject.optInt("body_color");
            this.f58543d = jSONObject.getString("image_url");
            this.f58544e = Bitmap.createBitmap(500, 500, Bitmap.Config.ARGB_8888);
        } catch (JSONException e) {
            throw new BadDecideObjectException("Notification JSON was unexpected or bad", e);
        }
    }
}
