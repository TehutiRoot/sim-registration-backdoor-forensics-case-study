package com.google.firebase.heartbeatinfo;

import com.google.firebase.components.Component;

/* loaded from: classes4.dex */
public class HeartBeatConsumerComponent {

    /* renamed from: com.google.firebase.heartbeatinfo.HeartBeatConsumerComponent$a */
    /* loaded from: classes4.dex */
    public class C8502a implements HeartBeatConsumer {
    }

    public static Component<?> create() {
        return Component.intoSet(new C8502a(), HeartBeatConsumer.class);
    }
}
