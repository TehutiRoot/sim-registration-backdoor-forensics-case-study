package com.google.api.client.googleapis.notifications;

import com.google.api.client.util.Beta;
import com.google.api.client.util.Objects;
import com.google.api.client.util.Preconditions;

@Beta
/* loaded from: classes4.dex */
public abstract class AbstractNotification {

    /* renamed from: a */
    public long f51947a;

    /* renamed from: b */
    public String f51948b;

    /* renamed from: c */
    public String f51949c;

    /* renamed from: d */
    public String f51950d;

    /* renamed from: e */
    public String f51951e;

    /* renamed from: f */
    public String f51952f;

    /* renamed from: g */
    public String f51953g;

    /* renamed from: h */
    public String f51954h;

    public AbstractNotification(long j, String str, String str2, String str3, String str4) {
        setMessageNumber(j);
        setResourceState(str);
        setResourceId(str2);
        setResourceUri(str3);
        setChannelId(str4);
    }

    public final String getChanged() {
        return this.f51954h;
    }

    public final String getChannelExpiration() {
        return this.f51952f;
    }

    public final String getChannelId() {
        return this.f51951e;
    }

    public final String getChannelToken() {
        return this.f51953g;
    }

    public final long getMessageNumber() {
        return this.f51947a;
    }

    public final String getResourceId() {
        return this.f51949c;
    }

    public final String getResourceState() {
        return this.f51948b;
    }

    public final String getResourceUri() {
        return this.f51950d;
    }

    public AbstractNotification setChanged(String str) {
        this.f51954h = str;
        return this;
    }

    public AbstractNotification setChannelExpiration(String str) {
        this.f51952f = str;
        return this;
    }

    public AbstractNotification setChannelId(String str) {
        this.f51951e = (String) Preconditions.checkNotNull(str);
        return this;
    }

    public AbstractNotification setChannelToken(String str) {
        this.f51953g = str;
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
        this.f51947a = j;
        return this;
    }

    public AbstractNotification setResourceId(String str) {
        this.f51949c = (String) Preconditions.checkNotNull(str);
        return this;
    }

    public AbstractNotification setResourceState(String str) {
        this.f51948b = (String) Preconditions.checkNotNull(str);
        return this;
    }

    public AbstractNotification setResourceUri(String str) {
        this.f51950d = (String) Preconditions.checkNotNull(str);
        return this;
    }

    public String toString() {
        return toStringHelper().toString();
    }

    public Objects.ToStringHelper toStringHelper() {
        return Objects.toStringHelper(this).add("messageNumber", Long.valueOf(this.f51947a)).add("resourceState", this.f51948b).add("resourceId", this.f51949c).add("resourceUri", this.f51950d).add("channelId", this.f51951e).add("channelExpiration", this.f51952f).add("channelToken", this.f51953g).add("changed", this.f51954h);
    }

    public AbstractNotification(AbstractNotification abstractNotification) {
        this(abstractNotification.getMessageNumber(), abstractNotification.getResourceState(), abstractNotification.getResourceId(), abstractNotification.getResourceUri(), abstractNotification.getChannelId());
        setChannelExpiration(abstractNotification.getChannelExpiration());
        setChannelToken(abstractNotification.getChannelToken());
        setChanged(abstractNotification.getChanged());
    }
}