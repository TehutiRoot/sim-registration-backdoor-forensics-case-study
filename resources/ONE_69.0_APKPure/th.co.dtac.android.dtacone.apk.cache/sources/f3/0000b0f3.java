package com.google.firebase.messaging.reporting;

import com.google.firebase.encoders.proto.ProtoEnum;
import com.google.firebase.encoders.proto.Protobuf;

/* loaded from: classes4.dex */
public final class MessagingClientEvent {

    /* renamed from: p */
    public static final MessagingClientEvent f55707p = new Builder().build();

    /* renamed from: a */
    public final long f55708a;

    /* renamed from: b */
    public final String f55709b;

    /* renamed from: c */
    public final String f55710c;

    /* renamed from: d */
    public final MessageType f55711d;

    /* renamed from: e */
    public final SDKPlatform f55712e;

    /* renamed from: f */
    public final String f55713f;

    /* renamed from: g */
    public final String f55714g;

    /* renamed from: h */
    public final int f55715h;

    /* renamed from: i */
    public final int f55716i;

    /* renamed from: j */
    public final String f55717j;

    /* renamed from: k */
    public final long f55718k;

    /* renamed from: l */
    public final Event f55719l;

    /* renamed from: m */
    public final String f55720m;

    /* renamed from: n */
    public final long f55721n;

    /* renamed from: o */
    public final String f55722o;

    /* loaded from: classes4.dex */
    public static final class Builder {

        /* renamed from: a */
        public long f55723a = 0;

        /* renamed from: b */
        public String f55724b = "";

        /* renamed from: c */
        public String f55725c = "";

        /* renamed from: d */
        public MessageType f55726d = MessageType.UNKNOWN;

        /* renamed from: e */
        public SDKPlatform f55727e = SDKPlatform.UNKNOWN_OS;

        /* renamed from: f */
        public String f55728f = "";

        /* renamed from: g */
        public String f55729g = "";

        /* renamed from: h */
        public int f55730h = 0;

        /* renamed from: i */
        public int f55731i = 0;

        /* renamed from: j */
        public String f55732j = "";

        /* renamed from: k */
        public long f55733k = 0;

        /* renamed from: l */
        public Event f55734l = Event.UNKNOWN_EVENT;

        /* renamed from: m */
        public String f55735m = "";

        /* renamed from: n */
        public long f55736n = 0;

        /* renamed from: o */
        public String f55737o = "";

        public MessagingClientEvent build() {
            return new MessagingClientEvent(this.f55723a, this.f55724b, this.f55725c, this.f55726d, this.f55727e, this.f55728f, this.f55729g, this.f55730h, this.f55731i, this.f55732j, this.f55733k, this.f55734l, this.f55735m, this.f55736n, this.f55737o);
        }

        public Builder setAnalyticsLabel(String str) {
            this.f55735m = str;
            return this;
        }

        public Builder setBulkId(long j) {
            this.f55733k = j;
            return this;
        }

        public Builder setCampaignId(long j) {
            this.f55736n = j;
            return this;
        }

        public Builder setCollapseKey(String str) {
            this.f55729g = str;
            return this;
        }

        public Builder setComposerLabel(String str) {
            this.f55737o = str;
            return this;
        }

        public Builder setEvent(Event event) {
            this.f55734l = event;
            return this;
        }

        public Builder setInstanceId(String str) {
            this.f55725c = str;
            return this;
        }

        public Builder setMessageId(String str) {
            this.f55724b = str;
            return this;
        }

        public Builder setMessageType(MessageType messageType) {
            this.f55726d = messageType;
            return this;
        }

        public Builder setPackageName(String str) {
            this.f55728f = str;
            return this;
        }

        public Builder setPriority(int i) {
            this.f55730h = i;
            return this;
        }

        public Builder setProjectNumber(long j) {
            this.f55723a = j;
            return this;
        }

        public Builder setSdkPlatform(SDKPlatform sDKPlatform) {
            this.f55727e = sDKPlatform;
            return this;
        }

        public Builder setTopic(String str) {
            this.f55732j = str;
            return this;
        }

        public Builder setTtl(int i) {
            this.f55731i = i;
            return this;
        }
    }

    /* loaded from: classes4.dex */
    public enum Event implements ProtoEnum {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);
        
        private final int number_;

        Event(int i) {
            this.number_ = i;
        }

        @Override // com.google.firebase.encoders.proto.ProtoEnum
        public int getNumber() {
            return this.number_;
        }
    }

    /* loaded from: classes4.dex */
    public enum MessageType implements ProtoEnum {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);
        
        private final int number_;

        MessageType(int i) {
            this.number_ = i;
        }

        @Override // com.google.firebase.encoders.proto.ProtoEnum
        public int getNumber() {
            return this.number_;
        }
    }

    /* loaded from: classes4.dex */
    public enum SDKPlatform implements ProtoEnum {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);
        
        private final int number_;

        SDKPlatform(int i) {
            this.number_ = i;
        }

        @Override // com.google.firebase.encoders.proto.ProtoEnum
        public int getNumber() {
            return this.number_;
        }
    }

    public MessagingClientEvent(long j, String str, String str2, MessageType messageType, SDKPlatform sDKPlatform, String str3, String str4, int i, int i2, String str5, long j2, Event event, String str6, long j3, String str7) {
        this.f55708a = j;
        this.f55709b = str;
        this.f55710c = str2;
        this.f55711d = messageType;
        this.f55712e = sDKPlatform;
        this.f55713f = str3;
        this.f55714g = str4;
        this.f55715h = i;
        this.f55716i = i2;
        this.f55717j = str5;
        this.f55718k = j2;
        this.f55719l = event;
        this.f55720m = str6;
        this.f55721n = j3;
        this.f55722o = str7;
    }

    public static MessagingClientEvent getDefaultInstance() {
        return f55707p;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Protobuf(tag = 13)
    public String getAnalyticsLabel() {
        return this.f55720m;
    }

    @Protobuf(tag = 11)
    public long getBulkId() {
        return this.f55718k;
    }

    @Protobuf(tag = 14)
    public long getCampaignId() {
        return this.f55721n;
    }

    @Protobuf(tag = 7)
    public String getCollapseKey() {
        return this.f55714g;
    }

    @Protobuf(tag = 15)
    public String getComposerLabel() {
        return this.f55722o;
    }

    @Protobuf(tag = 12)
    public Event getEvent() {
        return this.f55719l;
    }

    @Protobuf(tag = 3)
    public String getInstanceId() {
        return this.f55710c;
    }

    @Protobuf(tag = 2)
    public String getMessageId() {
        return this.f55709b;
    }

    @Protobuf(tag = 4)
    public MessageType getMessageType() {
        return this.f55711d;
    }

    @Protobuf(tag = 6)
    public String getPackageName() {
        return this.f55713f;
    }

    @Protobuf(tag = 8)
    public int getPriority() {
        return this.f55715h;
    }

    @Protobuf(tag = 1)
    public long getProjectNumber() {
        return this.f55708a;
    }

    @Protobuf(tag = 5)
    public SDKPlatform getSdkPlatform() {
        return this.f55712e;
    }

    @Protobuf(tag = 10)
    public String getTopic() {
        return this.f55717j;
    }

    @Protobuf(tag = 9)
    public int getTtl() {
        return this.f55716i;
    }
}