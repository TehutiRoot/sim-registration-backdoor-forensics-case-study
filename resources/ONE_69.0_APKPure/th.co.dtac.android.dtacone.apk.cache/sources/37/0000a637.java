package com.google.api.client.testing.util;

import com.google.api.client.util.Beta;
import com.google.api.client.util.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

@Beta
/* loaded from: classes4.dex */
public class LogRecordingHandler extends Handler {

    /* renamed from: a */
    public final List f52276a = Lists.newArrayList();

    @Override // java.util.logging.Handler
    public void close() throws SecurityException {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }

    public List<String> messages() {
        ArrayList newArrayList = Lists.newArrayList();
        for (LogRecord logRecord : this.f52276a) {
            newArrayList.add(logRecord.getMessage());
        }
        return newArrayList;
    }

    @Override // java.util.logging.Handler
    public void publish(LogRecord logRecord) {
        this.f52276a.add(logRecord);
    }
}