package com.google.api.client.googleapis.notifications;

import com.google.api.client.util.Beta;
import com.google.api.client.util.Objects;
import com.google.api.client.util.Preconditions;

@Beta
/* loaded from: classes4.dex */
public abstract class AbstractNotification {

    /* renamed from: a */
    public long f51935a;

    /* renamed from: b */
    public String f51936b;

    /* renamed from: c */
    public String f51937c;

    /* renamed from: d */
    public String f51938d;

    /* renamed from: e */
    public String f51939e;

    /* renamed from: f */
    public String f51940f;

    /* renamed from: g */
    public String f51941g;

    /* renamed from: h */
    public String f51942h;

    public AbstractNotification(long j, String str, String str2, String str3, String str4) {
        setMessageNumber(j);
        setResourceState(str);
        setResourceId(str2);
        setResourceUri(str3);
        setChannelId(str4);
    }

    public final String getChanged() {
        return this.f51942h;
    }

    public final String getChannelExpiration() {
        return this.f51940f;
    }

    public final String getChannelId() {
        return this.f51939e;
    }

    public final String getChannelToken() {
        return this.f51941g;
    }

    public final long getMessageNumber() {
        return this.f51935a;
    }

    public final String getResourceId() {
        return this.f51937c;
    }

    public final String getResourceState() {
        return this.f51936b;
    }

    public final String getResourceUri() {
        return this.f51938d;
    }

    public AbstractNotification setChanged(String str) {
        this.f51942h = str;
        return this;
    }

    public AbstractNotification setChannelExpiration(String str) {
        this.f51940f = str;
        return this;
    }

    public AbstractNotification setChannelId(String str) {
        this.f51939e = (String) Preconditions.checkNotNull(str);
        return this;
    }

    public AbstractNotification setChannelToken(String str) {
        this.f51941g = str;
        return this;
    }

    public AbstractNotification setMessageNumber(long j) {
        boolean z;
        if (j >= 1) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        this.f51935a = j;
        return this;
    }

    public AbstractNotification setResourceId(String str) {
        this.f51937c = (String) Preconditions.checkNotNull(str);
        return this;
    }

    public AbstractNotification setResourceState(String str) {
        this.f51936b = (String) Preconditions.checkNotNull(str);
        return this;
    }

    public AbstractNotification setResourceUri(String str) {
        this.f51938d = (String) Preconditions.checkNotNull(str);
        return this;
    }

    public String toString() {
        return toStringHelper().toString();
    }

    public Objects.ToStringHelper toStringHelper() {
        return Objects.toStringHelper(this).add("messageNumber", Long.valueOf(this.f51935a)).add("resourceState", this.f51936b).add("resourceId", this.f51937c).add("resourceUri", this.f51938d).add("channelId", this.f51939e).add("channelExpiration", this.f51940f).add("channelToken", this.f51941g).add("changed", this.f51942h);
    }

    public AbstractNotification(AbstractNotification abstractNotification) {
        this(abstractNotification.getMessageNumber(), abstractNotification.getResourceState(), abstractNotification.getResourceId(), abstractNotification.getResourceUri(), abstractNotification.getChannelId());
        setChannelExpiration(abstractNotification.getChannelExpiration());
        setChannelToken(abstractNotification.getChannelToken());
        setChanged(abstractNotification.getChanged());
    }
}
