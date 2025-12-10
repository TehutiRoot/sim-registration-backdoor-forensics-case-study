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
    public static final class C8532a implements ObjectEncoder {

        /* renamed from: a */
        public static final C8532a f55590a = new C8532a();

        /* renamed from: b */
        public static final FieldDescriptor f55591b = FieldDescriptor.builder("projectNumber").withProperty(AtProtobuf.builder().tag(1).build()).build();

        /* renamed from: c */
        public static final FieldDescriptor f55592c = FieldDescriptor.builder("messageId").withProperty(AtProtobuf.builder().tag(2).build()).build();

        /* renamed from: d */
        public static final FieldDescriptor f55593d = FieldDescriptor.builder("instanceId").withProperty(AtProtobuf.builder().tag(3).build()).build();

        /* renamed from: e */
        public static final FieldDescriptor f55594e = FieldDescriptor.builder("messageType").withProperty(AtProtobuf.builder().tag(4).build()).build();

        /* renamed from: f */
        public static final FieldDescriptor f55595f = FieldDescriptor.builder("sdkPlatform").withProperty(AtProtobuf.builder().tag(5).build()).build();

        /* renamed from: g */
        public static final FieldDescriptor f55596g = FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME).withProperty(AtProtobuf.builder().tag(6).build()).build();

        /* renamed from: h */
        public static final FieldDescriptor f55597h = FieldDescriptor.builder("collapseKey").withProperty(AtProtobuf.builder().tag(7).build()).build();

        /* renamed from: i */
        public static final FieldDescriptor f55598i = FieldDescriptor.builder(LogFactory.PRIORITY_KEY).withProperty(AtProtobuf.builder().tag(8).build()).build();

        /* renamed from: j */
        public static final FieldDescriptor f55599j = FieldDescriptor.builder("ttl").withProperty(AtProtobuf.builder().tag(9).build()).build();

        /* renamed from: k */
        public static final FieldDescriptor f55600k = FieldDescriptor.builder("topic").withProperty(AtProtobuf.builder().tag(10).build()).build();

        /* renamed from: l */
        public static final FieldDescriptor f55601l = FieldDescriptor.builder("bulkId").withProperty(AtProtobuf.builder().tag(11).build()).build();

        /* renamed from: m */
        public static final FieldDescriptor f55602m = FieldDescriptor.builder("event").withProperty(AtProtobuf.builder().tag(12).build()).build();

        /* renamed from: n */
        public static final FieldDescriptor f55603n = FieldDescriptor.builder("analyticsLabel").withProperty(AtProtobuf.builder().tag(13).build()).build();

        /* renamed from: o */
        public static final FieldDescriptor f55604o = FieldDescriptor.builder("campaignId").withProperty(AtProtobuf.builder().tag(14).build()).build();

        /* renamed from: p */
        public static final FieldDescriptor f55605p = FieldDescriptor.builder("composerLabel").withProperty(AtProtobuf.builder().tag(15).build()).build();

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(MessagingClientEvent messagingClientEvent, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f55591b, messagingClientEvent.getProjectNumber());
            objectEncoderContext.add(f55592c, messagingClientEvent.getMessageId());
            objectEncoderContext.add(f55593d, messagingClientEvent.getInstanceId());
            objectEncoderContext.add(f55594e, messagingClientEvent.getMessageType());
            objectEncoderContext.add(f55595f, messagingClientEvent.getSdkPlatform());
            objectEncoderContext.add(f55596g, messagingClientEvent.getPackageName());
            objectEncoderContext.add(f55597h, messagingClientEvent.getCollapseKey());
            objectEncoderContext.add(f55598i, messagingClientEvent.getPriority());
            objectEncoderContext.add(f55599j, messagingClientEvent.getTtl());
            objectEncoderContext.add(f55600k, messagingClientEvent.getTopic());
            objectEncoderContext.add(f55601l, messagingClientEvent.getBulkId());
            objectEncoderContext.add(f55602m, messagingClientEvent.getEvent());
            objectEncoderContext.add(f55603n, messagingClientEvent.getAnalyticsLabel());
            objectEncoderContext.add(f55604o, messagingClientEvent.getCampaignId());
            objectEncoderContext.add(f55605p, messagingClientEvent.getComposerLabel());
        }
    }

    /* renamed from: com.google.firebase.messaging.AutoProtoEncoderDoNotUseEncoder$b */
    /* loaded from: classes4.dex */
    public static final class C8533b implements ObjectEncoder {

        /* renamed from: a */
        public static final C8533b f55606a = new C8533b();

        /* renamed from: b */
        public static final FieldDescriptor f55607b = FieldDescriptor.builder("messagingClientEvent").withProperty(AtProtobuf.builder().tag(1).build()).build();

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(MessagingClientEventExtension messagingClientEventExtension, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f55607b, messagingClientEventExtension.getMessagingClientEventInternal());
        }
    }

    /* renamed from: com.google.firebase.messaging.AutoProtoEncoderDoNotUseEncoder$c */
    /* loaded from: classes4.dex */
    public static final class C8534c implements ObjectEncoder {

        /* renamed from: a */
        public static final C8534c f55608a = new C8534c();

        /* renamed from: b */
        public static final FieldDescriptor f55609b = FieldDescriptor.m38754of("messagingClientEventExtension");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(ProtoEncoderDoNotUse protoEncoderDoNotUse, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f55609b, protoEncoderDoNotUse.getMessagingClientEventExtension());
        }
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig<?> encoderConfig) {
        encoderConfig.registerEncoder(ProtoEncoderDoNotUse.class, C8534c.f55608a);
        encoderConfig.registerEncoder(MessagingClientEventExtension.class, C8533b.f55606a);
        encoderConfig.registerEncoder(MessagingClientEvent.class, C8532a.f55590a);
    }
}