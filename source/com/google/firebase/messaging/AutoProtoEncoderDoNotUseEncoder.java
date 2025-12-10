package com.google.firebase.messaging;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.encoders.proto.AtProtobuf;
import com.google.firebase.messaging.reporting.MessagingClientEvent;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import org.apache.commons.logging.LogFactory;

/* loaded from: classes4.dex */
public final class AutoProtoEncoderDoNotUseEncoder implements Configurator {
    public static final int CODEGEN_VERSION = 2;
    public static final Configurator CONFIG = new AutoProtoEncoderDoNotUseEncoder();

    /* renamed from: com.google.firebase.messaging.AutoProtoEncoderDoNotUseEncoder$a */
    /* loaded from: classes4.dex */
    public static final class C8543a implements ObjectEncoder {

        /* renamed from: a */
        public static final C8543a f55578a = new C8543a();

        /* renamed from: b */
        public static final FieldDescriptor f55579b = FieldDescriptor.builder("projectNumber").withProperty(AtProtobuf.builder().tag(1).build()).build();

        /* renamed from: c */
        public static final FieldDescriptor f55580c = FieldDescriptor.builder("messageId").withProperty(AtProtobuf.builder().tag(2).build()).build();

        /* renamed from: d */
        public static final FieldDescriptor f55581d = FieldDescriptor.builder("instanceId").withProperty(AtProtobuf.builder().tag(3).build()).build();

        /* renamed from: e */
        public static final FieldDescriptor f55582e = FieldDescriptor.builder("messageType").withProperty(AtProtobuf.builder().tag(4).build()).build();

        /* renamed from: f */
        public static final FieldDescriptor f55583f = FieldDescriptor.builder("sdkPlatform").withProperty(AtProtobuf.builder().tag(5).build()).build();

        /* renamed from: g */
        public static final FieldDescriptor f55584g = FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME).withProperty(AtProtobuf.builder().tag(6).build()).build();

        /* renamed from: h */
        public static final FieldDescriptor f55585h = FieldDescriptor.builder("collapseKey").withProperty(AtProtobuf.builder().tag(7).build()).build();

        /* renamed from: i */
        public static final FieldDescriptor f55586i = FieldDescriptor.builder(LogFactory.PRIORITY_KEY).withProperty(AtProtobuf.builder().tag(8).build()).build();

        /* renamed from: j */
        public static final FieldDescriptor f55587j = FieldDescriptor.builder("ttl").withProperty(AtProtobuf.builder().tag(9).build()).build();

        /* renamed from: k */
        public static final FieldDescriptor f55588k = FieldDescriptor.builder("topic").withProperty(AtProtobuf.builder().tag(10).build()).build();

        /* renamed from: l */
        public static final FieldDescriptor f55589l = FieldDescriptor.builder("bulkId").withProperty(AtProtobuf.builder().tag(11).build()).build();

        /* renamed from: m */
        public static final FieldDescriptor f55590m = FieldDescriptor.builder("event").withProperty(AtProtobuf.builder().tag(12).build()).build();

        /* renamed from: n */
        public static final FieldDescriptor f55591n = FieldDescriptor.builder("analyticsLabel").withProperty(AtProtobuf.builder().tag(13).build()).build();

        /* renamed from: o */
        public static final FieldDescriptor f55592o = FieldDescriptor.builder("campaignId").withProperty(AtProtobuf.builder().tag(14).build()).build();

        /* renamed from: p */
        public static final FieldDescriptor f55593p = FieldDescriptor.builder("composerLabel").withProperty(AtProtobuf.builder().tag(15).build()).build();

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(MessagingClientEvent messagingClientEvent, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f55579b, messagingClientEvent.getProjectNumber());
            objectEncoderContext.add(f55580c, messagingClientEvent.getMessageId());
            objectEncoderContext.add(f55581d, messagingClientEvent.getInstanceId());
            objectEncoderContext.add(f55582e, messagingClientEvent.getMessageType());
            objectEncoderContext.add(f55583f, messagingClientEvent.getSdkPlatform());
            objectEncoderContext.add(f55584g, messagingClientEvent.getPackageName());
            objectEncoderContext.add(f55585h, messagingClientEvent.getCollapseKey());
            objectEncoderContext.add(f55586i, messagingClientEvent.getPriority());
            objectEncoderContext.add(f55587j, messagingClientEvent.getTtl());
            objectEncoderContext.add(f55588k, messagingClientEvent.getTopic());
            objectEncoderContext.add(f55589l, messagingClientEvent.getBulkId());
            objectEncoderContext.add(f55590m, messagingClientEvent.getEvent());
            objectEncoderContext.add(f55591n, messagingClientEvent.getAnalyticsLabel());
            objectEncoderContext.add(f55592o, messagingClientEvent.getCampaignId());
            objectEncoderContext.add(f55593p, messagingClientEvent.getComposerLabel());
        }
    }

    /* renamed from: com.google.firebase.messaging.AutoProtoEncoderDoNotUseEncoder$b */
    /* loaded from: classes4.dex */
    public static final class C8544b implements ObjectEncoder {

        /* renamed from: a */
        public static final C8544b f55594a = new C8544b();

        /* renamed from: b */
        public static final FieldDescriptor f55595b = FieldDescriptor.builder("messagingClientEvent").withProperty(AtProtobuf.builder().tag(1).build()).build();

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(MessagingClientEventExtension messagingClientEventExtension, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f55595b, messagingClientEventExtension.getMessagingClientEventInternal());
        }
    }

    /* renamed from: com.google.firebase.messaging.AutoProtoEncoderDoNotUseEncoder$c */
    /* loaded from: classes4.dex */
    public static final class C8545c implements ObjectEncoder {

        /* renamed from: a */
        public static final C8545c f55596a = new C8545c();

        /* renamed from: b */
        public static final FieldDescriptor f55597b = FieldDescriptor.m38762of("messagingClientEventExtension");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(ProtoEncoderDoNotUse protoEncoderDoNotUse, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f55597b, protoEncoderDoNotUse.getMessagingClientEventExtension());
        }
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig<?> encoderConfig) {
        encoderConfig.registerEncoder(ProtoEncoderDoNotUse.class, C8545c.f55596a);
        encoderConfig.registerEncoder(MessagingClientEventExtension.class, C8544b.f55594a);
        encoderConfig.registerEncoder(MessagingClientEvent.class, C8543a.f55578a);
    }
}
