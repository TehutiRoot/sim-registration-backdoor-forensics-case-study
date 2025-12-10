package com.google.firebase.messaging.reporting;

import com.google.firebase.encoders.proto.ProtoEnum;
import com.google.firebase.encoders.proto.Protobuf;

/* loaded from: classes4.dex */
public final class MessagingClientEvent {

    /* renamed from: p */
    public static final MessagingClientEvent f55695p = new Builder().build();

    /* renamed from: a */
    public final long f55696a;

    /* renamed from: b */
    public final String f55697b;

    /* renamed from: c */
    public final String f55698c;

    /* renamed from: d */
    public final MessageType f55699d;

    /* renamed from: e */
    public final SDKPlatform f55700e;

    /* renamed from: f */
    public final String f55701f;

    /* renamed from: g */
    public final String f55702g;

    /* renamed from: h */
    public final int f55703h;

    /* renamed from: i */
    public final int f55704i;

    /* renamed from: j */
    public final String f55705j;

    /* renamed from: k */
    public final long f55706k;

    /* renamed from: l */
    public final Event f55707l;

    /* renamed from: m */
    public final String f55708m;

    /* renamed from: n */
    public final long f55709n;

    /* renamed from: o */
    public final String f55710o;

    /* loaded from: classes4.dex */
    public static final class Builder {

        /* renamed from: a */
        public long f55711a = 0;

        /* renamed from: b */
        public String f55712b = "";

        /* renamed from: c */
        public String f55713c = "";

        /* renamed from: d */
        public MessageType f55714d = MessageType.UNKNOWN;

        /* renamed from: e */
        public SDKPlatform f55715e = SDKPlatform.UNKNOWN_OS;

        /* renamed from: f */
        public String f55716f = "";

        /* renamed from: g */
        public String f55717g = "";

        /* renamed from: h */
        public int f55718h = 0;

        /* renamed from: i */
        public int f55719i = 0;

        /* renamed from: j */
        public String f55720j = "";

        /* renamed from: k */
        public long f55721k = 0;

        /* renamed from: l */
        public Event f55722l = Event.UNKNOWN_EVENT;

        /* renamed from: m */
        public String f55723m = "";

        /* renamed from: n */
        public long f55724n = 0;

        /* renamed from: o */
        public String f55725o = "";

        public MessagingClientEvent build() {
            return new MessagingClientEvent(this.f55711a, this.f55712b, this.f55713c, this.f55714d, this.f55715e, this.f55716f, this.f55717g, this.f55718h, this.f55719i, this.f55720j, this.f55721k, this.f55722l, this.f55723m, this.f55724n, this.f55725o);
        }

        public Builder setAnalyticsLabel(String str) {
            this.f55723m = str;
            return this;
        }

        public Builder setBulkId(long j) {
            this.f55721k = j;
            return this;
        }

        public Builder setCampaignId(long j) {
            this.f55724n = j;
            return this;
        }

        public Builder setCollapseKey(String str) {
            this.f55717g = str;
            return this;
        }

        public Builder setComposerLabel(String str) {
            this.f55725o = str;
            return this;
        }

        public Builder setEvent(Event event) {
            this.f55722l = event;
            return this;
        }

        public Builder setInstanceId(String str) {
            this.f55713c = str;
            return this;
        }

        public Builder setMessageId(String str) {
            this.f55712b = str;
            return this;
        }

        public Builder setMessageType(MessageType messageType) {
            this.f55714d = messageType;
            return this;
        }

        public Builder setPackageName(String str) {
            this.f55716f = str;
            return this;
        }

        public Builder setPriority(int i) {
            this.f55718h = i;
            return this;
        }

        public Builder setProjectNumber(long j) {
            this.f55711a = j;
            return this;
        }

        public Builder setSdkPlatform(SDKPlatform sDKPlatform) {
            this.f55715e = sDKPlatform;
            return this;
        }

        public Builder setTopic(String str) {
            this.f55720j = str;
            return this;
        }

        public Builder setTtl(int i) {
            this.f55719i = i;
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
        this.f55696a = j;
        this.f55697b = str;
        this.f55698c = str2;
        this.f55699d = messageType;
        this.f55700e = sDKPlatform;
        this.f55701f = str3;
        this.f55702g = str4;
        this.f55703h = i;
        this.f55704i = i2;
        this.f55705j = str5;
        this.f55706k = j2;
        this.f55707l = event;
        this.f55708m = str6;
        this.f55709n = j3;
        this.f55710o = str7;
    }

    public static MessagingClientEvent getDefaultInstance() {
        return f55695p;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Protobuf(tag = 13)
    public String getAnalyticsLabel() {
        return this.f55708m;
    }

    @Protobuf(tag = 11)
    public long getBulkId() {
        return this.f55706k;
    }

    @Protobuf(tag = 14)
    public long getCampaignId() {
        return this.f55709n;
    }

    @Protobuf(tag = 7)
    public String getCollapseKey() {
        return this.f55702g;
    }

    @Protobuf(tag = 15)
    public String getComposerLabel() {
        return this.f55710o;
    }

    @Protobuf(tag = 12)
    public Event getEvent() {
        return this.f55707l;
    }

    @Protobuf(tag = 3)
    public String getInstanceId() {
        return this.f55698c;
    }

    @Protobuf(tag = 2)
    public String getMessageId() {
        return this.f55697b;
    }

    @Protobuf(tag = 4)
    public MessageType getMessageType() {
        return this.f55699d;
    }

    @Protobuf(tag = 6)
    public String getPackageName() {
        return this.f55701f;
    }

    @Protobuf(tag = 8)
    public int getPriority() {
        return this.f55703h;
    }

    @Protobuf(tag = 1)
    public long getProjectNumber() {
        return this.f55696a;
    }

    @Protobuf(tag = 5)
    public SDKPlatform getSdkPlatform() {
        return this.f55700e;
    }

    @Protobuf(tag = 10)
    public String getTopic() {
        return this.f55705j;
    }

    @Protobuf(tag = 9)
    public int getTtl() {
        return this.f55704i;
    }
}
