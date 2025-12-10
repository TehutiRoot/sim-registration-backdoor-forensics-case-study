package org.apache.http.client.entity;

import org.apache.http.HttpEntity;

/* loaded from: classes6.dex */
public class DeflateDecompressingEntity extends DecompressingEntity {
    public DeflateDecompressingEntity(HttpEntity httpEntity) {
        super(httpEntity, DeflateInputStreamFactory.getInstance());
    }
}
