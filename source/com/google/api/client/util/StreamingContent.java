package com.google.api.client.util;

import java.io.IOException;
import java.io.OutputStream;

@Deprecated
/* loaded from: classes4.dex */
public interface StreamingContent {
    void writeTo(OutputStream outputStream) throws IOException;
}
