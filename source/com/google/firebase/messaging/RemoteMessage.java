package com.google.firebase.messaging;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.messaging.Constants;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;

@SafeParcelable.Class(creator = "RemoteMessageCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes4.dex */
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new RemoteMessageCreator();
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_NORMAL = 2;
    public static final int PRIORITY_UNKNOWN = 0;

    /* renamed from: a */
    public Bundle f55639a;

    /* renamed from: b */
    public Map f55640b;

    /* renamed from: c */
    public Notification f55641c;

    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public final Bundle f55642a;

        /* renamed from: b */
        public final Map f55643b;

        public Builder(@NonNull String str) {
            Bundle bundle = new Bundle();
            this.f55642a = bundle;
            this.f55643b = new ArrayMap();
            if (!TextUtils.isEmpty(str)) {
                bundle.putString(Constants.MessagePayloadKeys.f55600TO, str);
                return;
            }
            throw new IllegalArgumentException("Invalid to: " + str);
        }

        @NonNull
        public Builder addData(@NonNull String str, @Nullable String str2) {
            this.f55643b.put(str, str2);
            return this;
        }

        @NonNull
        public RemoteMessage build() {
            Bundle bundle = new Bundle();
            for (Map.Entry entry : this.f55643b.entrySet()) {
                bundle.putString((String) entry.getKey(), (String) entry.getValue());
            }
            bundle.putAll(this.f55642a);
            this.f55642a.remove("from");
            return new RemoteMessage(bundle);
        }

        @NonNull
        public Builder clearData() {
            this.f55643b.clear();
            return this;
        }

        @Nullable
        public String getCollapseKey() {
            return this.f55642a.getString(Constants.MessagePayloadKeys.MESSAGE_TYPE);
        }

        @NonNull
        public Map<String, String> getData() {
            return this.f55643b;
        }

        @NonNull
        public String getMessageId() {
            return this.f55642a.getString(Constants.MessagePayloadKeys.MSGID, "");
        }

        @Nullable
        public String getMessageType() {
            return this.f55642a.getString(Constants.MessagePayloadKeys.MESSAGE_TYPE);
        }

        @IntRange(from = 0, m64742to = 86400)
        public int getTtl() {
            return Integer.parseInt(this.f55642a.getString(Constants.MessagePayloadKeys.MESSAGE_TYPE, "0"));
        }

        @NonNull
        public Builder setCollapseKey(@Nullable String str) {
            this.f55642a.putString(Constants.MessagePayloadKeys.COLLAPSE_KEY, str);
            return this;
        }

        @NonNull
        public Builder setData(@NonNull Map<String, String> map) {
            this.f55643b.clear();
            this.f55643b.putAll(map);
            return this;
        }

        @NonNull
        public Builder setMessageId(@NonNull String str) {
            this.f55642a.putString(Constants.MessagePayloadKeys.MSGID, str);
            return this;
        }

        @NonNull
        public Builder setMessageType(@Nullable String str) {
            this.f55642a.putString(Constants.MessagePayloadKeys.MESSAGE_TYPE, str);
            return this;
        }

        @NonNull
        @ShowFirstParty
        public Builder setRawData(byte[] bArr) {
            this.f55642a.putByteArray(Constants.MessagePayloadKeys.RAW_DATA, bArr);
            return this;
        }

        @NonNull
        public Builder setTtl(@IntRange(from = 0, m64742to = 86400) int i) {
            this.f55642a.putString(Constants.MessagePayloadKeys.TTL, String.valueOf(i));
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface MessagePriority {
    }

    /* loaded from: classes4.dex */
    public static class Notification {

        /* renamed from: a */
        public final String f55644a;

        /* renamed from: b */
        public final String f55645b;

        /* renamed from: c */
        public final String[] f55646c;

        /* renamed from: d */
        public final String f55647d;

        /* renamed from: e */
        public final String f55648e;

        /* renamed from: f */
        public final String[] f55649f;

        /* renamed from: g */
        public final String f55650g;

        /* renamed from: h */
        public final String f55651h;

        /* renamed from: i */
        public final String f55652i;

        /* renamed from: j */
        public final String f55653j;

        /* renamed from: k */
        public final String f55654k;

        /* renamed from: l */
        public final String f55655l;

        /* renamed from: m */
        public final String f55656m;

        /* renamed from: n */
        public final Uri f55657n;

        /* renamed from: o */
        public final String f55658o;

        /* renamed from: p */
        public final Integer f55659p;

        /* renamed from: q */
        public final Integer f55660q;

        /* renamed from: r */
        public final Integer f55661r;

        /* renamed from: s */
        public final int[] f55662s;

        /* renamed from: t */
        public final Long f55663t;

        /* renamed from: u */
        public final boolean f55664u;

        /* renamed from: v */
        public final boolean f55665v;

        /* renamed from: w */
        public final boolean f55666w;

        /* renamed from: x */
        public final boolean f55667x;

        /* renamed from: y */
        public final boolean f55668y;

        /* renamed from: z */
        public final long[] f55669z;

        /* renamed from: a */
        public static String[] m38451a(NotificationParams notificationParams, String str) {
            Object[] localizationArgsForKey = notificationParams.getLocalizationArgsForKey(str);
            if (localizationArgsForKey == null) {
                return null;
            }
            String[] strArr = new String[localizationArgsForKey.length];
            for (int i = 0; i < localizationArgsForKey.length; i++) {
                strArr[i] = String.valueOf(localizationArgsForKey[i]);
            }
            return strArr;
        }

        @Nullable
        public String getBody() {
            return this.f55647d;
        }

        @Nullable
        public String[] getBodyLocalizationArgs() {
            return this.f55649f;
        }

        @Nullable
        public String getBodyLocalizationKey() {
            return this.f55648e;
        }

        @Nullable
        public String getChannelId() {
            return this.f55656m;
        }

        @Nullable
        public String getClickAction() {
            return this.f55655l;
        }

        @Nullable
        public String getColor() {
            return this.f55654k;
        }

        public boolean getDefaultLightSettings() {
            return this.f55668y;
        }

        public boolean getDefaultSound() {
            return this.f55666w;
        }

        public boolean getDefaultVibrateSettings() {
            return this.f55667x;
        }

        @Nullable
        public Long getEventTime() {
            return this.f55663t;
        }

        @Nullable
        public String getIcon() {
            return this.f55650g;
        }

        @Nullable
        public Uri getImageUrl() {
            String str = this.f55651h;
            if (str != null) {
                return Uri.parse(str);
            }
            return null;
        }

        @Nullable
        public int[] getLightSettings() {
            return this.f55662s;
        }

        @Nullable
        public Uri getLink() {
            return this.f55657n;
        }

        public boolean getLocalOnly() {
            return this.f55665v;
        }

        @Nullable
        public Integer getNotificationCount() {
            return this.f55661r;
        }

        @Nullable
        public Integer getNotificationPriority() {
            return this.f55659p;
        }

        @Nullable
        public String getSound() {
            return this.f55652i;
        }

        public boolean getSticky() {
            return this.f55664u;
        }

        @Nullable
        public String getTag() {
            return this.f55653j;
        }

        @Nullable
        public String getTicker() {
            return this.f55658o;
        }

        @Nullable
        public String getTitle() {
            return this.f55644a;
        }

        @Nullable
        public String[] getTitleLocalizationArgs() {
            return this.f55646c;
        }

        @Nullable
        public String getTitleLocalizationKey() {
            return this.f55645b;
        }

        @Nullable
        public long[] getVibrateTimings() {
            return this.f55669z;
        }

        @Nullable
        public Integer getVisibility() {
            return this.f55660q;
        }

        public Notification(NotificationParams notificationParams) {
            this.f55644a = notificationParams.getString(Constants.MessageNotificationKeys.TITLE);
            this.f55645b = notificationParams.getLocalizationResourceForKey(Constants.MessageNotificationKeys.TITLE);
            this.f55646c = m38451a(notificationParams, Constants.MessageNotificationKeys.TITLE);
            this.f55647d = notificationParams.getString(Constants.MessageNotificationKeys.BODY);
            this.f55648e = notificationParams.getLocalizationResourceForKey(Constants.MessageNotificationKeys.BODY);
            this.f55649f = m38451a(notificationParams, Constants.MessageNotificationKeys.BODY);
            this.f55650g = notificationParams.getString(Constants.MessageNotificationKeys.ICON);
            this.f55652i = notificationParams.getSoundResourceName();
            this.f55653j = notificationParams.getString(Constants.MessageNotificationKeys.TAG);
            this.f55654k = notificationParams.getString(Constants.MessageNotificationKeys.COLOR);
            this.f55655l = notificationParams.getString(Constants.MessageNotificationKeys.CLICK_ACTION);
            this.f55656m = notificationParams.getString(Constants.MessageNotificationKeys.CHANNEL);
            this.f55657n = notificationParams.getLink();
            this.f55651h = notificationParams.getString(Constants.MessageNotificationKeys.IMAGE_URL);
            this.f55658o = notificationParams.getString(Constants.MessageNotificationKeys.TICKER);
            this.f55659p = notificationParams.getInteger(Constants.MessageNotificationKeys.NOTIFICATION_PRIORITY);
            this.f55660q = notificationParams.getInteger(Constants.MessageNotificationKeys.VISIBILITY);
            this.f55661r = notificationParams.getInteger(Constants.MessageNotificationKeys.NOTIFICATION_COUNT);
            this.f55664u = notificationParams.getBoolean(Constants.MessageNotificationKeys.STICKY);
            this.f55665v = notificationParams.getBoolean(Constants.MessageNotificationKeys.LOCAL_ONLY);
            this.f55666w = notificationParams.getBoolean(Constants.MessageNotificationKeys.DEFAULT_SOUND);
            this.f55667x = notificationParams.getBoolean(Constants.MessageNotificationKeys.DEFAULT_VIBRATE_TIMINGS);
            this.f55668y = notificationParams.getBoolean(Constants.MessageNotificationKeys.DEFAULT_LIGHT_SETTINGS);
            this.f55663t = notificationParams.getLong(Constants.MessageNotificationKeys.EVENT_TIME);
            this.f55662s = notificationParams.m38462b();
            this.f55669z = notificationParams.getVibrateTimings();
        }
    }

    @SafeParcelable.Constructor
    public RemoteMessage(@SafeParcelable.Param(m48388id = 2) Bundle bundle) {
        this.f55639a = bundle;
    }

    /* renamed from: b */
    public final int m38453b(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        if ("normal".equals(str)) {
            return 2;
        }
        return 0;
    }

    /* renamed from: d */
    public void m38452d(Intent intent) {
        intent.putExtras(this.f55639a);
    }

    @Nullable
    public String getCollapseKey() {
        return this.f55639a.getString(Constants.MessagePayloadKeys.COLLAPSE_KEY);
    }

    @NonNull
    public Map<String, String> getData() {
        if (this.f55640b == null) {
            this.f55640b = Constants.MessagePayloadKeys.extractDeveloperDefinedPayload(this.f55639a);
        }
        return this.f55640b;
    }

    @Nullable
    public String getFrom() {
        return this.f55639a.getString("from");
    }

    @Nullable
    public String getMessageId() {
        String string = this.f55639a.getString(Constants.MessagePayloadKeys.MSGID);
        if (string == null) {
            return this.f55639a.getString(Constants.MessagePayloadKeys.MSGID_SERVER);
        }
        return string;
    }

    @Nullable
    public String getMessageType() {
        return this.f55639a.getString(Constants.MessagePayloadKeys.MESSAGE_TYPE);
    }

    @Nullable
    public Notification getNotification() {
        if (this.f55641c == null && NotificationParams.isNotification(this.f55639a)) {
            this.f55641c = new Notification(new NotificationParams(this.f55639a));
        }
        return this.f55641c;
    }

    public int getOriginalPriority() {
        String string = this.f55639a.getString(Constants.MessagePayloadKeys.ORIGINAL_PRIORITY);
        if (string == null) {
            string = this.f55639a.getString(Constants.MessagePayloadKeys.PRIORITY_V19);
        }
        return m38453b(string);
    }

    public int getPriority() {
        String string = this.f55639a.getString(Constants.MessagePayloadKeys.DELIVERED_PRIORITY);
        if (string == null) {
            if ("1".equals(this.f55639a.getString(Constants.MessagePayloadKeys.PRIORITY_REDUCED_V19))) {
                return 2;
            }
            string = this.f55639a.getString(Constants.MessagePayloadKeys.PRIORITY_V19);
        }
        return m38453b(string);
    }

    @Nullable
    @ShowFirstParty
    public byte[] getRawData() {
        return this.f55639a.getByteArray(Constants.MessagePayloadKeys.RAW_DATA);
    }

    @Nullable
    public String getSenderId() {
        return this.f55639a.getString(Constants.MessagePayloadKeys.SENDER_ID);
    }

    public long getSentTime() {
        Object obj = this.f55639a.get(Constants.MessagePayloadKeys.SENT_TIME);
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (obj instanceof String) {
            try {
                return Long.parseLong((String) obj);
            } catch (NumberFormatException unused) {
                Log.w(Constants.TAG, "Invalid sent time: " + obj);
                return 0L;
            }
        }
        return 0L;
    }

    @Nullable
    public String getTo() {
        return this.f55639a.getString(Constants.MessagePayloadKeys.f55600TO);
    }

    public int getTtl() {
        Object obj = this.f55639a.get(Constants.MessagePayloadKeys.TTL);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof String) {
            try {
                return Integer.parseInt((String) obj);
            } catch (NumberFormatException unused) {
                Log.w(Constants.TAG, "Invalid TTL: " + obj);
                return 0;
            }
        }
        return 0;
    }

    @KeepForSdk
    public Intent toIntent() {
        Intent intent = new Intent();
        intent.putExtras(this.f55639a);
        return intent;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        RemoteMessageCreator.m38450a(this, parcel, i);
    }
}
