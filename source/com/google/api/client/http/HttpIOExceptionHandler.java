package com.google.api.client.http;

import com.google.api.client.util.Beta;
import java.io.IOException;

@Beta
/* loaded from: classes4.dex */
public interface HttpIOExceptionHandler {
    boolean handleIOException(HttpRequest httpRequest, boolean z) throws IOException;
}
